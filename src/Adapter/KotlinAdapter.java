package Adapter;

public class KotlinAdapter implements Java {
    Kotlin kotlin;

    public KotlinAdapter(Kotlin kotlin){
        this.kotlin = kotlin;
    }

    @Override
    public void JavaCode() {
        kotlin.KotlinCode();
    }

    @Override
    public void JavaRun() {
        kotlin.KotlinRun();
    }
}
