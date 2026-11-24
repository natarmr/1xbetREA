package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class luv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f20695a = new zfn(new ago((byte) 28), (byte) 1);

    public static final void a(mm40 mm40Var, ywv0 ywv0Var, fet fetVar, int i) {
        h0q0 h0q0Var = ywv0Var.b;
        fetVar.g0(-1354933189);
        int i2 = i | 6 | (fetVar.g(ywv0Var) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else {
            if (!(h0q0Var.p().c instanceof isv0)) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new uqv0(ywv0Var, i);
                    return;
                }
                return;
            }
            long jM109getOverlayBackground400d7_KjU = h0q0Var.p().d;
            if (jM109getOverlayBackground400d7_KjU == 16) {
                pz40 pz40Var = s6t0.f31722a;
                jM109getOverlayBackground400d7_KjU = StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU();
            }
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(120.0f);
            n0q n0qVar = o7k0.c;
            boolean zD = fetVar.d(fW0) | ((i2 & 112) == 32) | fetVar.f(jM109getOverlayBackground400d7_KjU);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new c63(ywv0Var, fW0, jM109getOverlayBackground400d7_KjU);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.K(n0qVar, (Function1) objP));
            mm40Var = jm40.b;
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new onu0(mm40Var, ywv0Var, i, (byte) 9);
        }
    }
}
