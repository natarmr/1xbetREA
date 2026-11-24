package a;

/* JADX INFO: loaded from: classes2.dex */
public final class quw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f29361a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ uuw0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public quw0(uuw0 uuw0Var, int i, boolean z, boolean z2) {
        this.d = uuw0Var;
        this.f29361a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.r1(this.f29361a, this.b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.r1(this.f29361a, this.b, this.c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.d.r1(this.f29361a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.r1(this.f29361a, this.b, this.c, str, obj, obj2, obj3);
    }
}
