package a;

/* JADX INFO: loaded from: classes.dex */
public final class zmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44646a;
    public final int b;
    public final waz c;

    public zmx(int i, int i2, waz wazVar) {
        this.f44646a = i;
        this.b = i2;
        this.c = wazVar;
        if (i < 0) {
            adx.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        adx.a("size should be > 0");
    }
}
