package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f23197a;
    public static final /* synthetic */ int b = 0;

    static {
        uen uenVar = wen.b;
        f23197a = ibc.v0(1, bfn.SECONDS);
    }

    public static final void a(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        yx7 yx7Var = gqw0.k;
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(-1442317468);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            sam samVar = (sam) l7m0Var.getValue();
            boolean z = samVar instanceof pam;
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            String strC = null;
            if (z) {
                fetVar.e0(-1226599788);
                pam pamVar = (pam) samVar;
                oam oamVar = pamVar.b;
                if (oamVar == null) {
                    fetVar.e0(-1226601122);
                } else {
                    fetVar.e0(-1226601121);
                    strC = c(oamVar, fetVar);
                }
                fetVar.r(false);
                String str = strC;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarG = o7k0.g(mm40Var, str != null ? 40.0f : 32.0f, 0.0f, 2);
                ugg0 ugg0VarA = vgg0.a(8.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                mm40 mm40VarO = feb.O(s5x0.K(i120.Q(mm40VarG, staticColors.m75getBlack600d7_KjU(), ugg0VarA), 8.0f, 6.0f), function0);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_line, 0, fetVar);
                pz40 pz40Var = s6t0.f31722a;
                dww.c(pm80VarF, null, mm40VarN, staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
                b(0, fetVar, new x7z(1.0f, true), pamVar.f26660a, str);
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else if (samVar instanceof qam) {
                fetVar.e0(-1225089127);
                qam qamVar = (qam) samVar;
                oam oamVar2 = qamVar.c;
                if (oamVar2 == null) {
                    fetVar.e0(-1225086338);
                } else {
                    fetVar.e0(-1225086337);
                    strC = c(oamVar2, fetVar);
                }
                fetVar.r(false);
                String str2 = strC;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarG2 = o7k0.g(mm40Var, str2 != null ? 40.0f : 32.0f, 0.0f, 2);
                ugg0 ugg0VarA2 = vgg0.a(8.0f);
                StaticColors staticColors2 = StaticColors.INSTANCE;
                mm40 mm40VarO2 = feb.O(s5x0.K(i120.Q(mm40VarG2, staticColors2.m75getBlack600d7_KjU(), ugg0VarA2), 8.0f, 6.0f), function0);
                thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarO2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                j6n.h(qamVar.b, kro0.f18776a, null, 0, 0, fetVar, 48, 28);
                b(0, fetVar, new x7z(1.0f, true), qamVar.f28402a, str2);
                mm40 mm40VarN2 = o7k0.n(jm40Var, 16.0f);
                pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar);
                pz40 pz40Var2 = s6t0.f31722a;
                dww.c(pm80VarF2, null, mm40VarN2, staticColors2.m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(samVar, ram.f30142a)) {
                    throw b1j.f(1207357258, fetVar, false);
                }
                fetVar.e0(1207450376);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mam(mm40Var, l7m0Var, function0, i, (byte) 0);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(180395547);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = m8m0.f21378a;
            v8q0.a(str, null, ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            if (str2 != null) {
                fetVar2.e0(2087661909);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                v8q0.a(str2, null, ((StaticColors) fetVar2.k(zfnVar2)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar2, (i2 >> 6) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(2087914001);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 23);
        }
    }

    public static final String c(oam oamVar, fet fetVar) {
        long j = oamVar.f24933a;
        boolean zF = fetVar.f(j);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zF || objP == obj) {
            long jCurrentTimeMillis = (j - System.currentTimeMillis()) / 1000;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            objP = androidx.compose.runtime.e.c(jCurrentTimeMillis);
            fetVar.o0(objP);
        }
        egk0 egk0Var = (egk0) objP;
        Long lValueOf = Long.valueOf(j);
        boolean zG = fetVar.g(egk0Var) | fetVar.g(oamVar);
        Object objP2 = fetVar.P();
        yje yjeVar = null;
        if (zG || objP2 == obj) {
            objP2 = new j0l((Object) oamVar, (Object) egk0Var, yjeVar, (byte) 8);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, lValueOf, (Function2) objP2);
        if (egk0Var.l() <= 0) {
            return null;
        }
        long jL = egk0Var.l();
        long j2 = jL / 86400;
        long j3 = jL / 60;
        return axq.n(b1j.n("\u2066", oamVar.b, ": \u200e", j2 > 0 ? String.format(Locale.ENGLISH, oamVar.c, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)).concat(Separators.SP) : "", "\u200e"), String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j3 / 60) % 24), Long.valueOf(j3 % 60), Long.valueOf(jL % 60)}, 3)), "\u2069");
    }
}
