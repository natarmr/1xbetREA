package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ac8 {
    public static final void a(mm40 mm40Var, xb8 xb8Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1038813788);
        int i2 = i | 6 | (fetVar.g(xb8Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            uui0 uui0Var = new uui0(xb8Var.c, null, xb8Var.d, null, null, 58);
            m0x m0xVar = new m0x(xb8Var.b, null, 6);
            zfn zfnVar = zaq0.b;
            jm40 jm40Var = jm40.b;
            obc.q(jm40Var, new rqm((vui0) uui0Var, (pui0) new nui0(null, null, m0xVar, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent())), 0.0f, 211), (pvi0) new fvi0(null), d4d.BACKGROUND, (tvi0) null, (wui0) null, false, (e900) null, Response.NOT_ACCEPTABLE_HERE), false, null, function0, null, null, null, fetVar, ((i2 << 6) & 57344) | 6, 236);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var2, xb8Var, function0, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, dc8 dc8Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        xb8 xb8Var;
        dc8Var.getClass();
        function1.getClass();
        fetVar.g0(1775120584);
        int i2 = i | 6 | (fetVar.g(dc8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1154224212);
            int i3 = 0;
            for (Object obj : dc8Var.c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                xb8 xb8Var2 = (xb8) obj;
                if (i3 > 0) {
                    fetVar.e0(640868288);
                    zcl zclVar2 = qmk.f28987a;
                    xb8Var = xb8Var2;
                    wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                    fetVar.r(false);
                } else {
                    xb8Var = xb8Var2;
                    fetVar.e0(640947090);
                    fetVar.r(false);
                }
                boolean zG = ((i2 & 896) == 256) | fetVar.g(xb8Var);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new gj4(function1, xb8Var, (byte) 19);
                    fetVar.o0(objP);
                }
                a(null, xb8Var, (Function0) objP, fetVar, 0);
                i3 = i4;
            }
            fetVar.r(false);
            zcl zclVar3 = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2(mm40Var2, dc8Var, function1, i, (byte) 29);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        str.getClass();
        str2.getClass();
        fetVar.g0(668118645);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, i2 & 112, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            kkb.m(null, str2, null, 0, 0L, 0L, fetVar, (i2 >> 3) & 112, 61);
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 8);
        }
    }
}
