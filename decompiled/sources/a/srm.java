package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class srm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f32684a = ro4.m0(1500, 0, ihn.d, 2);

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2147053825);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 14.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(t33Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new ya(t33Var, null, (byte) 29);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_game_indicator_border, 0, fetVar);
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary60 = ((ThemeColors) fetVar.k(dVar)).getSecondary60();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 14.0f);
            boolean zI2 = fetVar.i(t33Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new m53(t33Var, (byte) 10);
                fetVar.o0(objP3);
            }
            dww.c(pm80VarF, null, i4w0.T(mm40VarN2, (Function1) objP3), secondary60, fetVar, 56, 0);
            zq8.a(0, fetVar, i120.Q(o7k0.n(jm40Var, 6.0f), ((ThemeColors) fetVar.k(dVar)).getSecondary(), vgg0.f37379a));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, false, i, (byte) 13);
        }
    }
}
