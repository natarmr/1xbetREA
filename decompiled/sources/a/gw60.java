package a;

/* JADX INFO: loaded from: classes4.dex */
public final class gw60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f12011a;

    public gw60(s1p s1pVar) {
        s1pVar.getClass();
        this.f12011a = s1pVar;
    }

    public final void a(int i, int i2, String str) {
        this.f12011a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(String.valueOf(i2), (byte) 1)}), 3091L);
    }

    public final void b(int i, y1p y1pVar) {
        this.f12011a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(y1pVar.f41868a, (byte) 0)}), 3077L);
    }

    public final void c() {
        this.f12011a.a(xun.f41520a, 3011L);
    }

    public final void d(int i, y1p y1pVar, String str, lz60 lz60Var) {
        str.getClass();
        lz60Var.getClass();
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        if (str.length() > 0) {
            yni0Var.add(new j1p(str, (byte) 2));
        }
        lz60.Companion.getClass();
        yni0Var.add(new i1p(iz60.b(lz60Var), (byte) 1));
        this.f12011a.a(cui0.a(yni0Var), 3003L);
    }

    public final void e(int i, int i2, String str, lz60 lz60Var) {
        y1p y1pVar = y1p.MAIN;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new j1p("popular_new_games", (byte) 0));
        yni0Var.add(new i1p(i2, (byte) 0));
        if (str.length() > 0) {
            yni0Var.add(new j1p(str, (byte) 2));
        }
        lz60.Companion.getClass();
        yni0Var.add(new i1p(iz60.b(lz60Var), (byte) 1));
        this.f12011a.a(cui0.a(yni0Var), 3003L);
    }
}
