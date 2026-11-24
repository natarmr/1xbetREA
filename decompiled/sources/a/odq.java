package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class odq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f25088a;
    public static final /* synthetic */ int b = 0;

    static {
        uen uenVar = wen.b;
        f25088a = ibc.v0(1, bfn.SECONDS);
    }

    public static final void a(mm40 mm40Var, pdq pdqVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        long j = pdqVar.b;
        fetVar2.g0(-1495648534);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pdqVar) ? 32 : 16);
        byte b2 = 5;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                uen uenVar = wen.b;
                objP = androidx.compose.runtime.e.e(new wen(wen.k(wen.j(j, ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS)), f25088a)));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            wen wenVar = new wen(j);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new u6h(pz40Var, null, b2);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, wenVar, (Function2) objP2);
            String strW = rsm0.w(pdqVar.c, 0, fetVar2);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long jL = wen.l(((wen) pz40Var.getValue()).f39026a, bfn.SECONDS);
            String str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jL / 60), Long.valueOf(jL % 60)}, 2));
            jcb.l(null, pdqVar.f26819a, true, null, fetVar2, 384, 9);
            v8q0.a(w6x.q(strW, Separators.RETURN, str), s5x0.N(jm40.b, 16.0f, 0.0f, 16.0f, 0.0f, 10), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, pdqVar, i, (byte) 5);
        }
    }
}
