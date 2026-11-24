package a;

/* JADX INFO: loaded from: classes.dex */
public interface ncs0 {
    default void a(int i, fq80 fq80Var) {
        d(fq80Var, i, 0);
    }

    void b(long j, int i, int i2, int i3, mcs0 mcs0Var);

    void c(androidx.media3.common.b bVar);

    void d(fq80 fq80Var, int i, int i2);

    default int e(bbj bbjVar, int i, boolean z) {
        return g(bbjVar, i, z);
    }

    int g(bbj bbjVar, int i, boolean z);

    default void f(long j) {
    }
}
