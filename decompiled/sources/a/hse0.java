package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hse0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gst0 f13578a;
    public final okt0 b;
    public final jvq0 c;
    public final y9o0 d;
    public final k050 e = new k050();

    public hse0(gst0 gst0Var, okt0 okt0Var, jvq0 jvq0Var, y9o0 y9o0Var) {
        this.f13578a = gst0Var;
        this.b = okt0Var;
        this.c = jvq0Var;
        this.d = y9o0Var;
    }

    public static Object a(hse0 hse0Var, String str, boolean z, yje yjeVar, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        long j = (i & 4) != 0 ? -1L : 10000L;
        okt0 okt0Var = hse0Var.b;
        return (z2 || (okt0Var.d() - okt0Var.e() > 120000 && okt0Var.d() - System.currentTimeMillis() <= 60000) || (okt0Var.d() - okt0Var.e() <= 120000 && okt0Var.d() - System.currentTimeMillis() < 0)) ? qjj.d0(z560.b, new gse0(hse0Var, str2, z2, j, null), yjeVar) : str2;
    }
}
