// Generated by Dagger (https://dagger.dev).
package com.app.carousel.data.repository;

import com.app.carousel.data.store.CarouselStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CarouselRepositoryImpl_Factory implements Factory<CarouselRepositoryImpl> {
  private final Provider<CarouselStore> dataStoreProvider;

  public CarouselRepositoryImpl_Factory(Provider<CarouselStore> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public CarouselRepositoryImpl get() {
    return newInstance(dataStoreProvider.get());
  }

  public static CarouselRepositoryImpl_Factory create(Provider<CarouselStore> dataStoreProvider) {
    return new CarouselRepositoryImpl_Factory(dataStoreProvider);
  }

  public static CarouselRepositoryImpl newInstance(CarouselStore dataStore) {
    return new CarouselRepositoryImpl(dataStore);
  }
}
