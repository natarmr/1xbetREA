package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f40801a = new zfn(new dfp((byte) 3), (byte) 0);

    public static final void a(mm40 mm40Var, y4a0 y4a0Var, Function2 function2, fet fetVar, int i) {
        v9p v9pVar;
        function2.getClass();
        fetVar.g0(-1853621993);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(y4a0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = y4a0Var.c;
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (z) {
                    pz40 pz40Var = s6t0.f31722a;
                    v9pVar = new v9p(R.drawable.ic_glyph_favourite_active, StaticColors.INSTANCE.m123getWhite0d7_KjU());
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    v9pVar = new v9p(R.drawable.ic_glyph_favourite_inactive, StaticColors.INSTANCE.m123getWhite0d7_KjU());
                }
                objP = v9pVar;
                fetVar.o0(objP);
            }
            v9p v9pVar2 = (v9p) objP;
            mm40 mm40VarN = o7k0.n(mm40Var, ((ycl) fetVar.k(f40801a)).f42389a);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new gmo(function2, y4a0Var, (byte) 7);
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
            j0x.b(iom0.r(jpm0.t(v9pVar2.f37045a, 6, fetVar), fetVar), null, o7k0.n(jm40.b, 20.0f), null, null, 0.0f, new m78(((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), 5), fetVar, 56, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, y4a0Var, function2, i, (byte) 17);
        }
    }
}
