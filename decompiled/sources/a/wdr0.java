package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f38987a = new zfn(new joq0((byte) 26), (byte) 0);

    public static final void a(mm40 mm40Var, a4x a4xVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-929765065);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            float fB0 = f7k.b0(fetVar);
            float f = xfn.a(fetVar).c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = s5x0.t(f, 0.0f, 2);
                fetVar.o0(objP);
            }
            hh80 hh80Var = (hh80) objP;
            Object[] objArr = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new rj50(b);
                fetVar.o0(objP2);
            }
            Function2 function2 = (Function2) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new mb50((byte) 5);
                fetVar.o0(objP3);
            }
            v0h0 v0h0VarL = qxw.L((Function1) objP3, function2);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new th50((byte) 2);
                fetVar.o0(objP4);
            }
            qj50 qj50Var = (qj50) e9x.R(objArr, v0h0VarL, (Function0) objP4, fetVar, 384);
            boolean z = (((i2 & 896) ^ 384) > 256 && fetVar.g(xczVar)) || (i2 & 384) == 256;
            Object objP5 = fetVar.P();
            if (z || objP5 == cl5Var) {
                objP5 = new meq0((Object) xczVar, (yje) null, (byte) 12);
                fetVar.o0(objP5);
            }
            pvm0.e((Function2) objP5, fetVar, 0);
            obc.d(f38987a.a(new ycl(fB0)), u1c.M(-1203024777, new vdl0(mm40Var, xczVar, a4xVar, function1, qj50Var, hh80Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 19, i, mm40Var, a4xVar, xczVar, function1);
        }
    }
}
