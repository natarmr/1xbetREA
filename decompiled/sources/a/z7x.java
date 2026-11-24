package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz40 f43942a = new xz40(new x7x[16]);
    public final pz40 b = androidx.compose.runtime.e.e(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final pz40 d = androidx.compose.runtime.e.e(Boolean.TRUE);

    public final void a(int i, fet fetVar) {
        fetVar.g0(-318043801);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            yje yjeVar = null;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (((Boolean) ((hgk0) this.d).getValue()).booleanValue() || ((Boolean) ((hgk0) this.b).getValue()).booleanValue()) {
                fetVar.e0(-144841960);
                boolean zI = fetVar.i(this);
                Object objP2 = fetVar.P();
                if (zI || objP2 == cl5Var) {
                    objP2 = new o3s((Object) pz40Var, (Object) this, yjeVar, (byte) 13);
                    fetVar.o0(objP2);
                }
                m0x0.t(fetVar, this, (Function2) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(-143455237);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(this, i, (byte) 16);
        }
    }
}
