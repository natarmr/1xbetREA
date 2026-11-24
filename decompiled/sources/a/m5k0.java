package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nul0 f21224a = ro4.g0(0.0f, 0.0f, null, 7);

    public static final t33 a(long j) {
        return new t33(new y3d(j), new lxs0(qja.j, new s43(y3d.f(j), (byte) 2)), null, 12);
    }

    public static final l7m0 b(long j, j73 j73Var, fet fetVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j73Var = f21224a;
        }
        j73 j73Var2 = j73Var;
        String str = (i2 & 4) != 0 ? "ColorAnimation" : "PopularIconColor";
        boolean zG = fetVar.g(y3d.f(j));
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = kng0.d(qja.j, new s43(y3d.f(j), (byte) 2), fetVar);
        }
        int i3 = i << 6;
        return d43.c(new y3d(j), (lxs0) objP, j73Var2, null, str, null, fetVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
