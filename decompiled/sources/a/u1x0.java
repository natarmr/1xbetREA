package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u1x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1x0 f34921a;
    public final /* synthetic */ r1x0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c2x0 e;

    public u1x0(c2x0 c2x0Var, r1x0 r1x0Var, r1x0 r1x0Var2, long j, boolean z) {
        this.f34921a = r1x0Var;
        this.b = r1x0Var2;
        this.c = j;
        this.d = z;
        this.e = c2x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.r1(this.f34921a, this.b, this.c, this.d, null);
    }
}
