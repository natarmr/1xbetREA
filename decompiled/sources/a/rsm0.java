package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.zzaje;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rsm0 {
    public static final void a(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1304942800);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            t53 t53VarK = ffb0.K(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new nbd(pz40Var, null, (byte) 6);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            s4u0 s4u0VarX = oja0.X(t53VarK, ((Boolean) pz40Var.getValue()).booleanValue(), fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 20.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            dww.c(s4u0VarX, null, mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new efr0(i, (byte) 12);
        }
    }

    public static final void b(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(101590345);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-1473908452);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-1473908451);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarB = g1t0.b();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarL, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarB, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 13);
        }
    }

    public static final void c(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-865782791);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-1256440854);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-1256440853);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarB = g1t0.b();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarL, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarB, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 8);
        }
    }

    public static final void d(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-338599335);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(1665458202);
            fetVar2.r(false);
        } else {
            fetVar2.e0(1665458203);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, (i2 >> 3) & 14, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 4);
        }
    }

    public static final void e(byr0 byr0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1658486541);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(byr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), 128.0f), 48.0f);
            boolean z = byr0Var.b;
            ayr0 ayr0Var = byr0Var.f;
            long jM71getBlack300d7_KjU = z ? ijg.M : StaticColors.INSTANCE.m71getBlack300d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, jM71getBlack300d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 2);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new yip0((Object) function1, (Object) byr0Var, (byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarL, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = byr0Var.c;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.f1;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            ayr0 ayr0Var2 = ayr0.f1684a;
            lgb.v(x(mm40VarN, ayr0Var, ayr0Var2), x(o7k0.n(jm40Var, 32.0f), ayr0Var, ayr0Var2), str, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar, 196608, 0);
            f(byr0Var.e, fetVar, 6);
            String str2 = byr0Var.d;
            long jM130getWhite600d7_KjU2 = staticColors.m130getWhite600d7_KjU();
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            ayr0 ayr0Var3 = ayr0.b;
            lgb.v(x(mm40VarN2, ayr0Var, ayr0Var3), x(o7k0.n(jm40Var, 32.0f), ayr0Var, ayr0Var3), str2, R.drawable.icon_globe_new, jM130getWhite600d7_KjU2, pgeVar, fetVar, 196608, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) byr0Var, (Object) function1, i, (byte) 3);
        }
    }

    public static final void f(zxr0 zxr0Var, fet fetVar, int i) {
        zxr0 zxr0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1052953618);
        int i2 = i | (fetVar2.g(zxr0Var) ? 32 : 16);
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zxr0Var2 = zxr0Var;
            fetVar2.X();
        } else if (zxr0Var instanceof wxr0) {
            fetVar2.e0(1900095013);
            a(6, fetVar2);
            fetVar2.r(false);
            zxr0Var2 = zxr0Var;
        } else if (zxr0Var instanceof vxr0) {
            fetVar2.e0(1900235629);
            String str = ((vxr0) zxr0Var).f38216a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(false);
            zxr0Var2 = zxr0Var;
        } else {
            zxr0Var2 = zxr0Var;
            boolean z = zxr0Var2 instanceof yxr0;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(1900647340);
                zcl zclVar = qmk.f28987a;
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                fetVar2.r(false);
            } else {
                if (!(zxr0Var2 instanceof xxr0)) {
                    throw b1j.f(1723859805, fetVar2, false);
                }
                fetVar2.e0(1900834890);
                String str2 = ((xxr0) zxr0Var2).f41673a;
                long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
                pge pgeVar = gqw0.f1;
                zcl zclVar2 = qmk.f28987a;
                lgb.v(o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 32.0f), o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 32.0f), str2, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
                fetVar2.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(zxr0Var2, i, (byte) 17);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(1038733592);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            str2 = str;
            k7x.b(str2, null, lgb.J(mm40VarQ, vgg0.a(8.0f)), a8k0.F(R.drawable.ic_glyph_placeholder_player_secondary60, 0, fetVar), a8k0.F(R.drawable.ic_glyph_placeholder_player_secondary60, 0, fetVar), null, null, null, null, null, null, null, fetVar, (i2 & 14) | 36912, 0, 32736);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(str2, mm40Var, i);
        }
    }

    public static final void h(mm40 mm40Var, ixp0 ixp0Var, xdr xdrVar, fet fetVar, int i) {
        Object obj;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        fetVar2.g0(-1556688410);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ixp0Var) ? 32 : 16) | 384;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM = u1c.M(-236594928, new gcn0(ixp0Var, (byte) 10), fetVar2);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            zhg0 zhg0Var = zhg0.f44392a;
            i(zhg0Var.a(1.0f, mm40VarL, true), ixp0Var.f15554a, 5, fetVar2, 0, 0);
            fetVar2 = fetVar;
            i(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 80.0f), ixp0Var.b, 0, fetVar2, 0, 4);
            i(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 92.0f), ixp0Var.c, 0, fetVar2, 0, 4);
            fetVar2.e0(1461800174);
            ugdVarM.F(zhg0Var, fetVar2, 54);
            fetVar2.r(false);
            fetVar2.r(true);
            obj = ugdVarM;
        } else {
            fetVar2.X();
            obj = xdrVar;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, ixp0Var, obj, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void i(mm40 mm40Var, String str, int i, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        yfe0 yfe0VarU;
        fetVar.g0(-1209772884);
        int i7 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16);
        if ((i3 & 4) == 0) {
            i4 = i;
            int i8 = fetVar.e(i4) ? 256 : 128;
            i5 = i7 | i8;
            if ((i5 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                } else if ((i3 & 4) != 0) {
                    i5 &= -897;
                    i4 = 3;
                }
                int i9 = i4;
                int i10 = i5;
                fetVar.s();
                v8q0.a(str, mm40Var, ((y3d) fetVar.k(pzp0.b)).f41946a, null, 0L, null, null, null, 0L, new f2q0(i9), 0L, 2, false, 2, 0, null, (y9q0) fetVar.k(pzp0.f27858a), fetVar, ((i10 >> 3) & 14) | ((i10 << 3) & 112), ((i10 >> 6) & 14) | 24960, 109560);
                i6 = i9;
            } else {
                fetVar.X();
                i6 = i4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7h(mm40Var, str, i6, i2, i3);
            }
        }
        i4 = i;
        i5 = i7 | i8;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) == 0) {
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                    i4 = 3;
                }
            } else if ((i3 & 4) != 0) {
                i5 &= -897;
                i4 = 3;
            }
            int i11 = i4;
            int i12 = i5;
            fetVar.s();
            v8q0.a(str, mm40Var, ((y3d) fetVar.k(pzp0.b)).f41946a, null, 0L, null, null, null, 0L, new f2q0(i11), 0L, 2, false, 2, 0, null, (y9q0) fetVar.k(pzp0.f27858a), fetVar, ((i12 >> 3) & 14) | ((i12 << 3) & 112), ((i12 >> 6) & 14) | 24960, 109560);
            i6 = i11;
        } else {
            fetVar.X();
            i6 = i4;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7h(mm40Var, str, i6, i2, i3);
        }
    }

    public static final void j(ir8 ir8Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(2045982966);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(1997742795);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            fetVar2.e0(1997995724);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) ir8Var, (Object) str, i, (byte) 25);
        }
    }

    public static final void k(String str, xww xwwVar, Function1 function1, fet fetVar) {
        str.getClass();
        function1.getClass();
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = o7k0.e(jm40.b, 32.0f);
        wul wulVar = new wul(qul.e, oe9.b, new te9(xwwVar.G()), true, false, false);
        boolean zG = fetVar.g(function1) | fetVar.g(xwwVar) | fetVar.g(str);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new ck60(function1, xwwVar, str, (byte) 24);
            fetVar.o0(objP);
        }
        qzb.n(mm40VarE, wulVar, (Function0) objP, fetVar, 0, 0);
    }

    public static final void l(mm40 mm40Var, cyr0 cyr0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40VarP;
        function1.getClass();
        fetVar.g0(-1304674173);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(cyr0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.s(mm40Var, 132.0f), vgg0.a(12.0f));
            int iOrdinal = cyr0Var.c.ordinal();
            if (iOrdinal == 0) {
                mm40VarP = i120.P(mm40VarJ, yk5.g(q3d.j(new y3d(ijg.v0), new y3d(ijg.w0)), 0.0f, 0.0f, 14), null, 6);
            } else if (iOrdinal == 1) {
                mm40VarP = i120.P(mm40VarJ, yk5.g(q3d.j(new y3d(ijg.Z), new y3d(ijg.b0)), 0.0f, 0.0f, 14), null, 6);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                mm40VarP = i120.Q(mm40VarJ, StaticColors.INSTANCE.m71getBlack300d7_KjU(), jd8.n);
            }
            mm40 mm40VarL = s5x0.L(mm40VarP, 2.0f, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            qsm0.n(cyr0Var.f5192a, fetVar, 0);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(-1290828585);
            for (byr0 byr0Var : cyr0Var.b) {
                fetVar.b0(96021150, byr0Var.f3433a);
                e(byr0Var, function1, fetVar, (i2 >> 3) & 112);
                fetVar.r(false);
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, cyr0Var, function1, i, (byte) 7);
        }
    }

    public static final void m(mm40 mm40Var, List list, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fet fetVar2;
        list.getClass();
        fetVar.g0(-832671632);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            cwr0.b(mm40Var2, list.size(), c6v0.b, c6v0.c, f6v0.f9032a, u1c.M(-1192090936, new csw((Object) list, (byte) 21), fetVar), fetVar2, (i2 & 14) | 221184);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dll(mm40Var2, list, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v1 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void n(final a.ywv0 r32, final a.l7m0 r33, final int r34, final int r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function2 r37, a.ugd r38, a.fet r39, int r40) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rsm0.n(a.ywv0, a.l7m0, int, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, a.ugd, a.fet, int):void");
    }

    public static ArrayList o(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final int p(yxg yxgVar, boolean z) {
        if (yxgVar instanceof rvg) {
            return z ? R.drawable.cybergame_synthetic_pes_second_bg : R.drawable.cybergame_synthetic_football_first_bg;
        }
        if (yxgVar instanceof bxg) {
            return z ? R.drawable.cybergame_synthetic_football_second_bg : R.drawable.cybergame_synthetic_football_first_bg;
        }
        if (yxgVar instanceof xug) {
            return z ? R.drawable.cybergame_synthetic_marble_football_last_bg : R.drawable.cybergame_synthetic_marble_football_first_bg;
        }
        return ((yxgVar instanceof gwg) && z) ? R.drawable.cybergame_synthetic_sega_football_last_bg : R.drawable.cybergame_synthetic_football_first_bg;
    }

    public static final ArrayList q(hxu hxuVar, String str) {
        mvo0 mvo0Var;
        mvo0 mvo0Var2;
        mvo0 mvo0Var3;
        mvo0 mvo0Var4;
        mvo0 mvo0Var5;
        hxuVar.getClass();
        str.getClass();
        ivo0 ivo0Var = hxuVar.f13829a;
        mvo0 mvo0Var6 = null;
        if (ivo0Var.b <= 0.0d) {
            ivo0Var = null;
        }
        if (ivo0Var != null) {
            String str2 = ivo0Var.f15455a;
            pn40 pn40Var = pn40.f27267a;
            mvo0Var = new mvo0(str2, pn40.p(str, ivo0Var.b));
        } else {
            mvo0Var = null;
        }
        ivo0 ivo0Var2 = hxuVar.b;
        if (ivo0Var2.b <= 0.0d) {
            ivo0Var2 = null;
        }
        if (ivo0Var2 != null) {
            String str3 = ivo0Var2.f15455a;
            pn40 pn40Var2 = pn40.f27267a;
            mvo0Var2 = new mvo0(str3, pn40.p(str, ivo0Var2.b));
        } else {
            mvo0Var2 = null;
        }
        ivo0 ivo0Var3 = hxuVar.c;
        if (ivo0Var3.b <= 0.0d) {
            ivo0Var3 = null;
        }
        if (ivo0Var3 != null) {
            String str4 = ivo0Var3.f15455a;
            pn40 pn40Var3 = pn40.f27267a;
            mvo0Var3 = new mvo0(str4, pn40.p(str, ivo0Var3.b));
        } else {
            mvo0Var3 = null;
        }
        ivo0 ivo0Var4 = hxuVar.d;
        if (ivo0Var4.b <= 0.0d) {
            ivo0Var4 = null;
        }
        if (ivo0Var4 != null) {
            String str5 = ivo0Var4.f15455a;
            pn40 pn40Var4 = pn40.f27267a;
            mvo0Var4 = new mvo0(str5, pn40.p(str, ivo0Var4.b));
        } else {
            mvo0Var4 = null;
        }
        ivo0 ivo0Var5 = hxuVar.e;
        if (ivo0Var5.b <= 0.0d) {
            ivo0Var5 = null;
        }
        if (ivo0Var5 != null) {
            String str6 = ivo0Var5.f15455a;
            pn40 pn40Var5 = pn40.f27267a;
            mvo0Var5 = new mvo0(str6, pn40.p(str, ivo0Var5.b));
        } else {
            mvo0Var5 = null;
        }
        ivo0 ivo0Var6 = hxuVar.f;
        if (ivo0Var6.b <= 0.0d) {
            ivo0Var6 = null;
        }
        if (ivo0Var6 != null) {
            String str7 = ivo0Var6.f15455a;
            pn40 pn40Var6 = pn40.f27267a;
            mvo0Var6 = new mvo0(str7, pn40.p(str, ivo0Var6.b));
        }
        List listZ = tx3.z(new mvo0[]{mvo0Var, mvo0Var2, mvo0Var3, mvo0Var4, mvo0Var5, mvo0Var6});
        ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
        for (mvo0 mvo0Var7 : (ArrayList) listZ) {
            int i = cy7.f5159a;
            arrayList.add(mvo0.a(mvo0Var7, cy7.e(mvo0Var7.b)));
        }
        return arrayList;
    }

    public static final ArrayList r(txu txuVar, String str, ctf0 ctf0Var) {
        mvo0 mvo0Var;
        mvo0 mvo0Var2;
        mvo0 mvo0Var3;
        mvo0 mvo0Var4;
        mvo0 mvo0Var5;
        mvo0 mvo0Var6;
        txuVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        ivo0 ivo0Var = txuVar.f34720a;
        mvo0 mvo0Var7 = null;
        if (ivo0Var.b <= 0.0d) {
            ivo0Var = null;
        }
        if (ivo0Var != null) {
            String str2 = ivo0Var.f15455a;
            pn40 pn40Var = pn40.f27267a;
            mvo0Var = new mvo0(str2, pn40.p(str, ivo0Var.b));
        } else {
            mvo0Var = null;
        }
        ivo0 ivo0Var2 = txuVar.b;
        if (ivo0Var2.b <= 0.0d) {
            ivo0Var2 = null;
        }
        if (ivo0Var2 != null) {
            String str3 = ivo0Var2.f15455a;
            pn40 pn40Var2 = pn40.f27267a;
            mvo0Var2 = new mvo0(str3, pn40.p(str, ivo0Var2.b));
        } else {
            mvo0Var2 = null;
        }
        ivo0 ivo0Var3 = txuVar.c;
        if (ivo0Var3.b <= 0.0d) {
            ivo0Var3 = null;
        }
        if (ivo0Var3 != null) {
            String str4 = ivo0Var3.f15455a;
            pn40 pn40Var3 = pn40.f27267a;
            mvo0Var3 = new mvo0(str4, pn40.p(str, ivo0Var3.b));
        } else {
            mvo0Var3 = null;
        }
        ivo0 ivo0Var4 = txuVar.g;
        if (ivo0Var4.b <= 0.0d) {
            ivo0Var4 = null;
        }
        if (ivo0Var4 != null) {
            String strA = ctf0Var.b.a(R.string.hyper_bonus_with_percent, Arrays.copyOf(new Object[]{ivo0Var4.f15455a}, 1));
            pn40 pn40Var4 = pn40.f27267a;
            mvo0Var4 = new mvo0(strA, pn40.p(str, ivo0Var4.b));
        } else {
            mvo0Var4 = null;
        }
        ivo0 ivo0Var5 = txuVar.d;
        if (ivo0Var5.b <= 0.0d) {
            ivo0Var5 = null;
        }
        if (ivo0Var5 != null) {
            String str5 = ivo0Var5.f15455a;
            pn40 pn40Var5 = pn40.f27267a;
            mvo0Var5 = new mvo0(str5, pn40.p(str, ivo0Var5.b));
        } else {
            mvo0Var5 = null;
        }
        ivo0 ivo0Var6 = txuVar.e;
        if (ivo0Var6.b <= 0.0d) {
            ivo0Var6 = null;
        }
        if (ivo0Var6 != null) {
            String str6 = ivo0Var6.f15455a;
            pn40 pn40Var6 = pn40.f27267a;
            mvo0Var6 = new mvo0(str6, pn40.p(str, ivo0Var6.b));
        } else {
            mvo0Var6 = null;
        }
        ivo0 ivo0Var7 = txuVar.f;
        if (ivo0Var7.b <= 0.0d) {
            ivo0Var7 = null;
        }
        if (ivo0Var7 != null) {
            String str7 = ivo0Var7.f15455a;
            pn40 pn40Var7 = pn40.f27267a;
            mvo0Var7 = new mvo0(str7, pn40.p(str, ivo0Var7.b));
        }
        List listZ = tx3.z(new mvo0[]{mvo0Var, mvo0Var2, mvo0Var3, mvo0Var4, mvo0Var5, mvo0Var6, mvo0Var7});
        ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
        for (mvo0 mvo0Var8 : (ArrayList) listZ) {
            int i = cy7.f5159a;
            arrayList.add(mvo0.a(mvo0Var8, cy7.e(mvo0Var8.b)));
        }
        return arrayList;
    }

    public static final f0t0 s(t3u0 t3u0Var) {
        t3u0Var.getClass();
        int iOrdinal = t3u0Var.ordinal();
        if (iOrdinal == 0) {
            return f0t0.INV;
        }
        if (iOrdinal == 1) {
            return f0t0.IN;
        }
        if (iOrdinal == 2) {
            return f0t0.OUT;
        }
        t9f.b();
        return null;
    }

    public static final Integer t(cau0 cau0Var, boolean z) {
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
                return Integer.valueOf(z ? R.string.verification_status_required : R.string.verification_need_to_pass);
            case 2:
                return Integer.valueOf(R.string.verification_status_accepted);
            case 3:
                return Integer.valueOf(R.string.verification_status_in_progress);
            case 4:
                return Integer.valueOf(R.string.verification_status_denied);
            case 5:
            case 8:
                return Integer.valueOf(R.string.verification_need_update_data);
            case 6:
                return Integer.valueOf(R.string.verification_completed);
            case 7:
                return Integer.valueOf(R.string.verification_error);
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x002d A[RETURN] */
    public static final Integer u(cau0 cau0Var, lxw lxwVar) {
        Integer numValueOf = Integer.valueOf(R.string.verification_check_state);
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
                return Integer.valueOf(R.string.verification);
            case 2:
                if (lxwVar == lxw.b) {
                    return numValueOf;
                }
                return null;
            case 3:
                if (lxwVar == lxw.b) {
                    return numValueOf;
                }
                return null;
            case 4:
                return null;
            case 6:
                return Integer.valueOf(R.string.refill_account);
            case 7:
                return Integer.valueOf(R.string.verification_other_methods);
            default:
                t9f.b();
                return null;
        }
    }

    public static final Integer v(cau0 cau0Var) {
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
                return Integer.valueOf(R.string.verification);
            case 2:
            case 3:
            case 4:
                return null;
            case 6:
                return Integer.valueOf(R.string.verification_title_success);
            case 7:
                return Integer.valueOf(R.string.payment_reject);
            default:
                t9f.b();
                return null;
        }
    }

    public static final String w(int i, int i2, fet fetVar) {
        String strA;
        if (i == 0) {
            return "";
        }
        Object applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
        rj3 rj3Var = applicationContext instanceof rj3 ? (rj3) applicationContext : null;
        if (rj3Var != null) {
            z7z z7zVar = ((ApplicationLoader) rj3Var).x;
            if (z7zVar == null) {
                Intrinsics.h("stringDownloadedProvider");
                throw null;
            }
            strA = ((lsm0) z7zVar.get()).a(i, new Object[0]);
        } else {
            strA = null;
        }
        if (strA != null) {
            fetVar.e0(-1574323812);
            fetVar.r(false);
            return strA;
        }
        fetVar.e0(-1559343137);
        if (!((Boolean) fetVar.k(kix.f18358a)).booleanValue()) {
            fetVar.e0(-22592148);
            fetVar.r(false);
            jf4.n("AppStringProvider is not implemented");
            return null;
        }
        fetVar.e0(-22643484);
        String strS = xsm0.s(i, fetVar);
        fetVar.r(false);
        fetVar.r(false);
        return strS;
    }

    public static final mm40 x(mm40 mm40Var, ayr0 ayr0Var, ayr0 ayr0Var2) {
        return epv0.N(mm40Var, (ayr0Var == ayr0Var2 || ayr0Var == ayr0.c) ? 1.0f : 0.35f);
    }

    public static final lf9 y(of9 of9Var) {
        String str;
        String str2;
        of9Var.getClass();
        he9 he9Var = of9Var.f25153a;
        String str3 = he9Var != null ? he9Var.f12911a : null;
        if (str3 == null) {
            str3 = "";
        }
        he9 he9Var2 = of9Var.b;
        String str4 = he9Var2 != null ? he9Var2.f12911a : null;
        if (str4 == null) {
            str4 = "";
        }
        he9 he9Var3 = of9Var.c;
        String str5 = he9Var3 != null ? he9Var3.f12911a : null;
        if (str5 == null) {
            str5 = "";
        }
        he9 he9Var4 = of9Var.d;
        String str6 = he9Var4 != null ? he9Var4.f12911a : null;
        if (str6 == null) {
            str6 = "";
        }
        he9 he9Var5 = of9Var.e;
        String str7 = he9Var5 != null ? he9Var5.f12911a : null;
        if (str7 == null) {
            str7 = "";
        }
        he9 he9Var6 = of9Var.f;
        String str8 = he9Var6 != null ? he9Var6.f12911a : null;
        if (str8 == null) {
            str2 = str6;
            str = "";
        } else {
            String str9 = str6;
            str = str8;
            str2 = str9;
        }
        return new lf9(str3, str4, str5, str2, str7, str);
    }

    public static ArrayList z(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            piw0 piw0Var = (piw0) it.next();
            Object totpMultiFactorInfo = null;
            if (piw0Var != null) {
                if (TextUtils.isEmpty(piw0Var.f27061a)) {
                    zzaje zzajeVar = piw0Var.e;
                    if (zzajeVar != null) {
                        totpMultiFactorInfo = new TotpMultiFactorInfo(piw0Var.b, piw0Var.c, piw0Var.d, zzajeVar);
                    }
                } else {
                    String str = piw0Var.b;
                    String str2 = piw0Var.c;
                    long j = piw0Var.d;
                    String str3 = piw0Var.f27061a;
                    s0x.E(str3);
                    totpMultiFactorInfo = new PhoneMultiFactorInfo(j, str, str2, str3);
                }
            }
            if (totpMultiFactorInfo != null) {
                arrayList.add(totpMultiFactorInfo);
            }
        }
        return arrayList;
    }
}
