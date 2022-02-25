import com.example.myapplication.HomeRepository
import com.example.myapplication.HomeRepositoryImpl
import com.example.myapplication.EatWhatRepository
import com.example.myapplication.EatWhatRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideHomeRepository(): HomeRepository {
        return HomeRepositoryImpl()
    }

    @Singleton
    @Provides
    fun provideEatWhatRepository(): EatWhatRepository {
        return EatWhatRepositoryImpl()
    }

}