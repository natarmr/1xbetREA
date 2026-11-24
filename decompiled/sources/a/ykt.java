package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ykt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f42806a;
    public final vby b;
    public xkt c;

    public ykt(vby vbyVar, q7d0 q7d0Var) {
        this.f42806a = q7d0Var;
        this.b = vbyVar;
    }

    public final xkt a() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            String string = this.f42806a.a().getString("GEO_IP_INFO_PREF_KEY", "");
            if (string == null) {
                g0g0Var = null;
            } else {
                if (string.length() == 0) {
                    return null;
                }
                g0g0Var = (xkt) this.b.b(xkt.Companion.serializer(), string);
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (xkt) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }
}
