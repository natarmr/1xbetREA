package a;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9415a;
    public static final float b;

    static {
        zcl zclVar = qmk.f28987a;
        f9415a = 66.0f;
        b = 200.0f;
    }

    public static final void a(len0 len0Var, fet fetVar, int i) {
        fetVar.g0(-1682485896);
        int i2 = (fetVar.g(len0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.g;
            int i3 = len0Var.f19912a;
            xuzVar.getClass();
            jcb.l(null, new mdm(xuz.a(pb10Var, i3), pdm.b, null, R.drawable.ic_glyph_circle_teambet, R.string.favorite_teams_empty_title, R.string.subscription_teams_empty_subtitle, 0, 0, 0L, 0L, 964), false, null, fetVar, 0, 13);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(len0Var, i, (byte) 2);
        }
    }

    public static final void b(men0 men0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-121755725);
        int i2 = (fetVar.g(men0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            mdm mdmVar = men0Var.f21655a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new opm0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(men0Var, function1, i, (byte) 13);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, boolean z) {
        jm40 jm40Var;
        fetVar.g0(394099433);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f = z ? b : f9415a;
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarQ, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 24.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            fetVar.e0(-1128205985);
            int i3 = 0;
            while (true) {
                jm40Var = jm40.b;
                if (i3 >= 16) {
                    break;
                }
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
                i3++;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, z, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    public static final void d(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1760997549);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new opm0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new opm0(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            boolean z3 = l7m0Var.getValue() instanceof oen0;
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH = fetVar.h(z3) | (i3 == 32);
            Object objP3 = fetVar.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new a2f(function1, z3, null, (byte) 5);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            pen0 pen0Var = (pen0) l7m0Var.getValue();
            if (pen0Var == null) {
                fetVar.e0(1148711919);
                fetVar.r(false);
            } else if (pen0Var instanceof oen0) {
                fetVar.e0(1148278787);
                e((oen0) pen0Var, function1, fetVar, i3);
                fetVar.r(false);
            } else if (pen0Var instanceof len0) {
                fetVar.e0(1148407096);
                a((len0) pen0Var, fetVar, 0);
                fetVar.r(false);
            } else if (pen0Var instanceof nen0) {
                fetVar.e0(1148517549);
                c(0, fetVar, null, ((nen0) pen0Var).f23394a);
                fetVar.r(false);
            } else if (pen0Var instanceof men0) {
                fetVar.e0(1148636775);
                b((men0) pen0Var, function1, fetVar, i3);
                fetVar.r(false);
            } else {
                fetVar.e0(1148711919);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, b2);
        }
    }

    public static final void e(oen0 oen0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-267744328);
        int i2 = (fetVar.g(oen0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new jfm0(oen0Var, (byte) 10);
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) v3c.Y(objArr, (Function0) objP, fetVar).getValue()).booleanValue();
            wom womVarF = mom.f(fetVar);
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new opm0(function1, (byte) 16);
                fetVar.o0(objP2);
            }
            mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP2, null, u1c.M(501829069, new nhl0(oen0Var, function1, (byte) 11), fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(oen0Var, function1, i, (byte) 12);
        }
    }
}
