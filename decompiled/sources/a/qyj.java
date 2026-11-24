package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class qyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29537a;
    public final ccs0 b;
    public final int c;
    public final androidx.media3.common.b d;

    public qyj(int i, ccs0 ccs0Var, int i2) {
        this.f29537a = i;
        this.b = ccs0Var;
        this.c = i2;
        this.d = ccs0Var.d[i2];
    }

    public abstract int a();

    public boolean b(qyj qyjVar) {
        return false;
    }
}
