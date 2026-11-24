package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f42551a = new zfn(new dfp((byte) 4), (byte) 0);

    public static final void a(mm40 mm40Var, z4a0 z4a0Var, Function2 function2, fet fetVar, int i) {
        w9p w9pVar;
        function2.getClass();
        fetVar.g0(561520923);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(z4a0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = z4a0Var.c;
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (z) {
                    pz40 pz40Var = s6t0.f31722a;
                    w9pVar = new w9p(R.drawable.ic_glyph_favourite_active, s6t0.b().f33626a.getSecondary());
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    w9pVar = new w9p(R.drawable.ic_glyph_favourite_inactive, s6t0.b().f33626a.getSecondary());
                }
                objP = w9pVar;
                fetVar.o0(objP);
            }
            w9p w9pVar2 = (w9p) objP;
            mm40 mm40VarN = o7k0.n(mm40Var, ((ycl) fetVar.k(f42551a)).f42389a);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new gmo(function2, z4a0Var, (byte) 8);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            j0x.b(iom0.r(jpm0.t(w9pVar2.f38790a, 6, fetVar), fetVar), null, o7k0.n(jm40.b, 20.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, z4a0Var, function2, i, (byte) 18);
        }
    }
}
