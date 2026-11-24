package a;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f36791a = new ArrayList();

    public static final void a(t0o0 t0o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1729015683);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(t0o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = u4o.f35060a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(context, t0o0Var, b);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, null, (Function1) objP2, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(t0o0Var, i, (byte) 24);
        }
    }
}
