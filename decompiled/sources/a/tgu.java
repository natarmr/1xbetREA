package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tgu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr70 f33931a;

    public tgu(nr70 nr70Var) {
        nr70Var.getClass();
        this.f33931a = nr70Var;
    }

    public final p6d a() {
        Object value;
        nr70 nr70Var = this.f33931a;
        yuy yuyVar = nr70Var.f23987a;
        p7m0 p7m0Var = yuyVar.b;
        p7m0 p7m0Var2 = yuyVar.b;
        byte b = 0;
        if (((Integer) p7m0Var.getValue()) == null) {
            vwb0 vwb0Var = nr70Var.b.f13702a;
            vwb0Var.getClass();
            int i = vwb0Var.b().getInt("CURRENT_LANGUAGE_ID_KEY", 0);
            do {
                value = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value, Integer.valueOf(i)));
        }
        byte b2 = 22;
        return new p6d(new i89(p7m0Var2, b2), new i89(nr70Var.f23987a.f43292a, b2), new sgu(this, null, b), (byte) 1);
    }
}
