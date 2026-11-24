package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f19625a = 3;

    public static final void A(ir8 ir8Var, cil0 cil0Var, long j, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        y9q0 y9q0Var = cil0Var.b;
        fetVar.g0(-2050759130);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cil0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zF = fetVar.f(y9q0Var.f42262a.b) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zF || objP == obj) {
                long j2 = y9q0Var.f42262a.b;
                objP = twn.j((((j2 & 1095216660480L) == 0 ? 12.0f : w6kVar.s(j2)) - 12.0f) + 14.0f, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            boolean zD = fetVar.d(f);
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (zD || objP2 == obj) {
                ycl yclVar = new ycl(f - 4.0f);
                Object yclVar2 = new ycl(10.0f);
                int iCompareTo = yclVar.compareTo(yclVar2);
                Object obj3 = yclVar;
                if (iCompareTo < 0) {
                    obj3 = yclVar2;
                }
                fetVar.o0(obj3);
                obj2 = obj3;
            }
            float f2 = ((ycl) obj2).f42389a;
            ycl yclVar3 = new ycl(rw2.a(f, 14.0f, 0.25f, f));
            ycl yclVar4 = new ycl(24.0f);
            if (yclVar3.compareTo(yclVar4) > 0) {
                yclVar3 = yclVar4;
            }
            float f3 = yclVar3.f42389a;
            boolean zD2 = fetVar.d(f3);
            Object objP3 = fetVar.P();
            if (zD2 || objP3 == obj) {
                objP3 = new o1m(new ywf(f3), j);
                fetVar.o0(objP3);
            }
            o1m o1mVar = (o1m) objP3;
            boolean zD3 = fetVar.d(f3);
            Object objP4 = fetVar.P();
            if (zD3 || objP4 == obj) {
                objP4 = new i1m(new ywf(f3));
                fetVar.o0(objP4);
            }
            i1m i1mVar = (i1m) objP4;
            boolean zD4 = fetVar.d(f) | fetVar.d(f2);
            Object objP5 = fetVar.P();
            if (zD4 || objP5 == obj) {
                objP5 = new tsl(new nsl(f, f2));
                fetVar.o0(objP5);
            }
            tsl tslVar = (tsl) objP5;
            boolean zD5 = fetVar.d(f) | fetVar.d(f2);
            Object objP6 = fetVar.P();
            if (zD5 || objP6 == obj) {
                objP6 = new usl(new nsl(f, f2));
                fetVar.o0(objP6);
            }
            usl uslVar = (usl) objP6;
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(o7k0.d(ir8Var.b(jm40Var, zx7Var), 1.0f), 8.0f, 4.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.g, yx7Var, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            Integer numValueOf2 = Integer.valueOf(((i2 >> 6) & 112) | 6);
            int i3 = i2;
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, numValueOf2);
            mm40 mm40VarU = yyw.U(jm40Var, 0.6f);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarU);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar2.q(zhg0Var, o1mVar, i1mVar, tslVar, uslVar, fetVar, Integer.valueOf(6 | ((i3 << 3) & 458752)));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o040(ir8Var, (eil0) cil0Var, j, ugdVar, ugdVar2, i, (byte) 3);
        }
    }

    public static final naa0 A0(faa0 faa0Var) {
        Object next;
        faa0Var.getClass();
        List list = faa0Var.g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = ((caa0) next).f4000a;
                if (num != null && num.intValue() == 1) {
                    break;
                }
            }
            caa0 caa0Var = (caa0) next;
            if (caa0Var != null) {
                String str = caa0Var.b;
                if (str == null) {
                    str = "";
                }
                return new laa0(str);
            }
        }
        return maa0.f21450a;
    }

    public static final void B(ir8 ir8Var, dil0 dil0Var, long j, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        ugd ugdVar3 = ugdVar2;
        y9q0 y9q0Var = dil0Var.b;
        fetVar.g0(-1142379331);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dil0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zF = fetVar.f(y9q0Var.f42262a.b) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zF || objP == obj) {
                long j2 = y9q0Var.f42262a.b;
                objP = twn.j((((j2 & 1095216660480L) == 0 ? 12.0f : w6kVar.s(j2)) - 12.0f) + 10.0f, fetVar);
            }
            ycl yclVar = (ycl) objP;
            float f = yclVar.f42389a;
            boolean zD = fetVar.d(f);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj) {
                objP2 = twn.j(rw2.a(f, 10.0f, 0.75f, 8.0f), fetVar);
            }
            float f2 = ((ycl) objP2).f42389a;
            boolean zD2 = fetVar.d(f);
            Object objP3 = fetVar.P();
            if (zD2 || objP3 == obj) {
                objP3 = new o1m(new xwf(f), j);
                fetVar.o0(objP3);
            }
            Object obj2 = (o1m) objP3;
            boolean zD3 = fetVar.d(f);
            Object objP4 = fetVar.P();
            if (zD3 || objP4 == obj) {
                objP4 = new i1m(new xwf(f));
                fetVar.o0(objP4);
            }
            Object obj3 = (i1m) objP4;
            boolean zD4 = fetVar.d(f) | fetVar.d(f2);
            Object objP5 = fetVar.P();
            if (zD4 || objP5 == obj) {
                objP5 = new tsl(new msl(f, f2));
                fetVar.o0(objP5);
            }
            Object obj4 = (tsl) objP5;
            boolean zD5 = fetVar.d(f) | fetVar.d(f2);
            Object objP6 = fetVar.P();
            if (zD5 || objP6 == obj) {
                objP6 = new usl(new msl(f, f2));
                fetVar.o0(objP6);
            }
            Object obj5 = (usl) objP6;
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.K(ir8Var.b(jm40Var, zx7Var), 8.0f, 4.0f), "MARKET_ROW_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40Var, 1.0f), "TITLE_COEF_ROW");
            int i3 = i2;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Integer numValueOf2 = Integer.valueOf(((i3 << 9) & 3670016) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.f(zhg0Var, yclVar, obj2, obj3, obj4, obj5, fetVar, numValueOf2);
            fetVar.r(true);
            qw3 qw3Var = new qw3(2.0f, true, new gne(gqw0.n, (byte) 12));
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE2 = o2e.e0(o7k0.d(jm40Var, 1.0f), "SUBTITLE_COEF_ROW");
            thg0 thg0VarA2 = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ugdVar3 = ugdVar2;
            h97.p(6 | ((i3 >> 9) & 112), ugdVar3, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o040(ir8Var, (eil0) dil0Var, j, ugdVar, ugdVar3, i, (byte) 2);
        }
    }

    public static final iuj0 B0(luj0 luj0Var) {
        luj0Var.getClass();
        String str = luj0Var.f20676a;
        if (str == null) {
            str = "";
        }
        String str2 = luj0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = luj0Var.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = luj0Var.d;
        return new iuj0(str, str2, str3, str4 != null ? str4 : "");
    }

    public static final void C(ry20 ry20Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        ry20Var.getClass();
        function1.getClass();
        fetVar.g0(1631812906);
        int i2 = (fetVar.g(ry20Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = ry20Var.c;
            boolean z3 = ry20Var.d;
            int i3 = i2 & 112;
            int i4 = 14;
            boolean z4 = (i3 == 32) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new mbz(function1, ry20Var, (byte) 20);
                fetVar.o0(objP);
            }
            t(0, fetVar, str, (Function0) objP, z3);
            if (z3) {
                fetVar.e0(-1551637874);
                mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 2.0f, 2);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                fetVar.e0(1936575879);
                for (et6 et6Var : ry20Var.e) {
                    fetVar.b0(449048200, et6Var.f8361a);
                    int i5 = i4;
                    a4n a4nVar = new a4n(et6Var.b, new zgl0(), i5);
                    boolean z5 = i3 == 32;
                    Object objP2 = fetVar.P();
                    if (z5 || objP2 == cl5Var) {
                        objP2 = new lj00(function1, (byte) 15);
                        fetVar.o0(objP2);
                    }
                    agc.t(null, a4nVar, false, (Function1) objP2, null, fetVar, 0, 17);
                    fetVar.r(false);
                    i4 = i5;
                }
                z = true;
                ohs0.x(fetVar, false, true, false);
            } else {
                z = true;
                fetVar.e0(-1550494284);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) ry20Var, (Object) function1, i, (byte) 26);
        }
    }

    public static String C0(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static final void D(mm40 mm40Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1432770743);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(ahl0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    objP = new x0q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    objP = new x0q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                fetVar.o0(objP);
            }
            x0q x0qVar = (x0q) objP;
            E(mm40Var, x0qVar.f40083a, function0, u1c.M(315568066, new rqc0(x0qVar, (byte) 18), fetVar), fetVar, (i3 & 14) | 3072 | (i3 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new thl0(mm40Var, ahl0Var, function0, i, (byte) 0);
        }
    }

    public static final int D0(q8z q8zVar) {
        ma80 ma80Var = q8zVar.r;
        List list = q8zVar.n;
        boolean z = ma80Var == ma80.f21447a;
        if (list.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            r8z r8zVar = (r8z) list.get(i);
            int i4 = z ? r8zVar.y : r8zVar.z;
            if (i4 == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < list.size()) {
                    r8z r8zVar2 = (r8z) list.get(i);
                    if ((z ? r8zVar2.y : r8zVar2.z) != i4) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? ((r8z) list.get(i)).w & 4294967295L : ((r8z) list.get(i)).w >> 32));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + q8zVar.t;
    }

    public static final void E(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1438113799);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 25);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarW, 40.0f);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
            ua80.p(((i2 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ihl0(mm40Var, j, function0, ugdVar, i, (byte) 1);
        }
    }

    public static void E0(String str, String str2) {
        String strC0 = C0(str);
        if (i0(5, strC0)) {
            Log.w(strC0, str2);
        }
    }

    public static final void F(boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-721247714);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.n(jm40Var, 40.0f), null, null, false, null, function0, 28);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar2 = fetVar;
            dww.c(a8k0.F(z ? R.drawable.ic_glyph_notification_active : R.drawable.ic_glyph_notification_inactive, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5h(z, function0, i, (byte) 5);
        }
    }

    public static void F0(String str, String str2, Throwable th) {
        String strC0 = C0(str);
        if (i0(5, strC0)) {
            Log.w(strC0, str2, th);
        }
    }

    public static final void G(k5a0 k5a0Var, k5a0 k5a0Var2, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        ugd ugdVar;
        w6nVar.getClass();
        if ((i2 & 16) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new zc70((byte) 18);
                fetVar.o0(objP);
            }
            function2 = (Function2) objP;
        }
        byte b = 0;
        ugd ugdVarM = u1c.M(1339348925, new xm80(k5a0Var, w6nVar, b), fetVar);
        ugd ugdVarM2 = null;
        if (k5a0Var instanceof b5a0) {
            fetVar.e0(1833972021);
            ugd ugdVarM3 = u1c.M(-896908764, new zm80(w6nVar, k5a0Var, function2, b), fetVar);
            fetVar.r(false);
            ugdVar = ugdVarM3;
        } else {
            if (!(k5a0Var instanceof f5a0)) {
                throw b1j.f(1444631331, fetVar, false);
            }
            fetVar.e0(1834606249);
            fetVar.r(false);
            ugdVar = null;
        }
        c3x.i(jm40.b, ugdVarM, ugdVar, fetVar, (i & 14) | 48, 0);
        byte b2 = 1;
        ugd ugdVarM4 = u1c.M(-670707660, new xm80(k5a0Var2, w6nVar, b2), fetVar);
        if (k5a0Var2 instanceof b5a0) {
            fetVar.e0(1834974995);
            ugdVarM2 = u1c.M(2064268507, new zm80(w6nVar, k5a0Var2, function2, b2), fetVar);
            fetVar.r(false);
        } else {
            if (!(k5a0Var2 instanceof f5a0)) {
                throw b1j.f(1444663654, fetVar, false);
            }
            fetVar.e0(1835611145);
            fetVar.r(false);
        }
        c3x.i(null, ugdVarM4, ugdVarM2, fetVar, 48, 1);
    }

    public static mm40 G0(mm40 mm40Var) {
        zsf zsfVar = ihn.f14788a;
        djx djxVar = new djx((byte) 14);
        mm40Var.getClass();
        zsfVar.getClass();
        return mm40Var.e(new amy(zsfVar, djxVar));
    }

    public static final void H(mm40 mm40Var, nuc0 nuc0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        nuc0Var.getClass();
        function1.getClass();
        fetVar.g0(2096399298);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(nuc0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 12.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            v8q0.a(rsm0.w(R.string.promo_related, 0, fetVar), s5x0.N(jm40.b, 16.0f, 16.0f, 16.0f, 0.0f, 8), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new dvd0(function1, (byte) 24);
                fetVar2.o0(objP);
            }
            I(null, nuc0Var, (Function1) objP, fetVar2, i2 & 112);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var, nuc0Var, function1, i, (byte) 20);
        }
    }

    public static final void I(mm40 mm40Var, nuc0 nuc0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1287721213);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nuc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 & 14) | 384 | (i2 & 112) | ((i2 << 3) & 7168);
            jm40 jm40Var = jm40.b;
            x2x.k(jm40Var, nuc0Var, false, function1, fetVar, i3, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, nuc0Var, function1, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[LOOP:1: B:20:0x005f->B:22:0x0065, LOOP_END] */
    public static final void J(vfg0 vfg0Var, fet fetVar, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        vfg0Var.getClass();
        th90 th90Var = vfg0Var.f37330a;
        fetVar.g0(1887137678);
        int i2 = (fetVar.g(vfg0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean zG = fetVar.g(th90Var);
            Object objP = fetVar.P();
            if (zG) {
                List<List> listA = ckv0.a(th90Var);
                arrayList = new ArrayList(r3d.q(listA, 10));
                for (List<Pair> list : listA) {
                    arrayList2 = new ArrayList(r3d.q(list, 10));
                    for (Pair pair : list) {
                        arrayList2.add(Integer.valueOf((((Number) pair.f46059a).intValue() * 3) + ((Number) pair.b).intValue()));
                    }
                    arrayList.add(arrayList2);
                }
                fetVar.o0(arrayList);
                obj = arrayList;
            } else {
                obj = objP;
                if (objP == ukd.f35823a) {
                    List<List> listA2 = ckv0.a(th90Var);
                    arrayList = new ArrayList(r3d.q(listA2, 10));
                    while (r0.hasNext()) {
                        arrayList2 = new ArrayList(r3d.q(list, 10));
                        while (r3.hasNext()) {
                            arrayList2.add(Integer.valueOf((((Number) pair.f46059a).intValue() * 3) + ((Number) pair.b).intValue()));
                        }
                        arrayList.add(arrayList2);
                    }
                    fetVar.o0(arrayList);
                    obj = arrayList;
                }
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(2064188110, new j5d0(vfg0Var, (List) obj, (byte) 17), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dke0(vfg0Var, i, (byte) 18);
        }
    }

    public static final void K(dqh0 dqh0Var, Function0 function0, mm40 mm40Var, fet fetVar, int i) {
        Function0 function1 = function0;
        dqh0Var.getClass();
        function1.getClass();
        fetVar.g0(458034937);
        int i2 = i | (fetVar.g(dqh0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarH = k7n0.H(o7k0.d(jm40Var, 1.0f), 1.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            String str = dqh0Var.f6516a;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 12.0f, 116.0f, 12.0f, 1);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 2, 0, null, g1t0.j(), fetVar, 0, 24576, 114680);
            s(dqh0Var, fetVar, i3 & 14);
            fetVar.r(true);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            j0x.b(a8k0.F(R.drawable.security_gift_banner, 0, fetVar), "", yyw.V(jr8Var.b(o7k0.s(o7k0.c(jm40Var, 1.0f), 194.0f), gqw0.c), fetVar.k(bmd.n) == k6z.b), gqw0.i, gqw0.A, 0.0f, null, fetVar, 27704, 96);
            fetVar.r(true);
            fetVar.r(true);
            if (dqh0Var.b) {
                fetVar.e0(1602505763);
                function1 = function0;
                o050.g(function1, o7k0.d(o7k0.e(s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), 32.0f), 1.0f), false, vgg0.a(12.0f), ozb.a0(fetVar), null, new lh80(12.0f, 0.0f, 12.0f, 0.0f), aad.i, fetVar, ((i3 >> 3) & 14) | 805306368, 356);
                fetVar.r(false);
            } else {
                function1 = function0;
                fetVar.e0(1603311391);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(dqh0Var, function1, mm40Var, i);
        }
    }

    public static final void L(Function1 function1, g4k g4kVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        g4kVar.getClass();
        fetVar.g0(-1477852879);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(g4kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0j0.f20957a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new ib(function1, g4kVar, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) g4kVar, mm40Var, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0192  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    public static final void M(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        long secondary;
        long jM123getWhite0d7_KjU;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        Object objP;
        boolean z4;
        Object objP2;
        boolean z5;
        Object objP3;
        boolean zI;
        Object objP4;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1869190249);
        byte b = 16;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            vhh0 vhh0Var = ((q1m0) l7m0Var.getValue()).b().c;
            Pair pairK = g7x.K(vhh0Var);
            String str = (String) pairK.f46059a;
            String str2 = (String) pairK.b;
            if (vhh0Var.equals(lhh0.f20055a)) {
                fetVar.e0(796033412);
                secondary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else if (vhh0Var.equals(mhh0.f21794a)) {
                fetVar.e0(796120646);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else if (vhh0Var instanceof rhh0) {
                fetVar.e0(796215878);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(995518068);
                fetVar.r(false);
                secondary = y3d.g;
            }
            long j = secondary;
            int iOrdinal = ((q1m0) l7m0Var.getValue()).b().f43575a.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(995525678);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(995519711, fetVar, false);
                }
                fetVar.e0(995527858);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            long j2 = jM123getWhite0d7_KjU;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            gmm dmmVar = ((vhh0Var instanceof ihh0) || (vhh0Var instanceof mhh0) || (vhh0Var instanceof lhh0)) ? new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, j2))) : fmm.f9790a;
            boolean zY = g7x.Y(vhh0Var);
            if (vhh0Var instanceof shh0) {
                z2 = ((shh0) vhh0Var).c;
            } else {
                if (vhh0Var instanceof rhh0) {
                    z2 = ((rhh0) vhh0Var).c;
                } else {
                    z = false;
                }
                f9m0 f9m0Var = new f9m0(R.string.stage_net, dmmVar, j, zY, z, str, str2, false, 128);
                zdm0 zdm0Var = ((q1m0) l7m0Var.getValue()).b().f43575a;
                j9m0 j9m0Var = ((q1m0) l7m0Var.getValue()).b().b;
                boolean zA = ((q1m0) l7m0Var.getValue()).a();
                i2 = i3 & 112;
                if (i2 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (z3 || objP == obj) {
                    objP = new yhl0(function1, (byte) 17);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                if (i2 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP2 = fetVar.P();
                if (z4 || objP2 == obj) {
                    objP2 = new elk0(function1, (byte) 23);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                if (i2 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP3 = fetVar.P();
                if (z5 || objP3 == obj) {
                    objP3 = new elk0(function1, (byte) 24);
                    fetVar.o0(objP3);
                }
                Function1 function3 = (Function1) objP3;
                zI = fetVar.i(wpqVar);
                objP4 = fetVar.P();
                if (zI || objP4 == obj) {
                    objP4 = new bz20(wpqVar, (byte) 3);
                    fetVar.o0(objP4);
                }
                ffb0.E(null, f9m0Var, zdm0Var, j9m0Var, zA, function0, function2, function3, (Function0) objP4, lv00.h, fetVar, 805306368);
            }
            z = z2;
            f9m0 f9m0Var2 = new f9m0(R.string.stage_net, dmmVar, j, zY, z, str, str2, false, 128);
            zdm0 zdm0Var2 = ((q1m0) l7m0Var.getValue()).b().f43575a;
            j9m0 j9m0Var2 = ((q1m0) l7m0Var.getValue()).b().b;
            boolean zA2 = ((q1m0) l7m0Var.getValue()).a();
            i2 = i3 & 112;
            if (i2 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z3) {
                objP = new yhl0(function1, (byte) 17);
                fetVar.o0(objP);
            } else {
                objP = new yhl0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            Function0 function4 = (Function0) objP;
            if (i2 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP2 = fetVar.P();
            if (z4) {
                objP2 = new elk0(function1, (byte) 23);
                fetVar.o0(objP2);
            } else {
                objP2 = new elk0(function1, (byte) 23);
                fetVar.o0(objP2);
            }
            Function1 function5 = (Function1) objP2;
            if (i2 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objP3 = fetVar.P();
            if (z5) {
                objP3 = new elk0(function1, (byte) 24);
                fetVar.o0(objP3);
            } else {
                objP3 = new elk0(function1, (byte) 24);
                fetVar.o0(objP3);
            }
            Function1 function6 = (Function1) objP3;
            zI = fetVar.i(wpqVar);
            objP4 = fetVar.P();
            if (zI) {
                objP4 = new bz20(wpqVar, (byte) 3);
                fetVar.o0(objP4);
            } else {
                objP4 = new bz20(wpqVar, (byte) 3);
                fetVar.o0(objP4);
            }
            ffb0.E(null, f9m0Var2, zdm0Var2, j9m0Var2, zA2, function4, function5, function6, (Function0) objP4, lv00.h, fetVar, 805306368);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, b);
        }
    }

    public static final void N(final mm40 mm40Var, final String str, final ope opeVar, final int i, final int i2, final Function1 function1, fet fetVar, final int i3) {
        int i4;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1323095101);
        if ((i3 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & 512) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar2.e(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar2.e(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i5 = i4;
        if (fetVar2.U(i5 & 1, (74899 & i5) != 74898)) {
            boolean z2 = opeVar instanceof lpe;
            mm40 mm40VarW = jm40.b;
            if (z2) {
                fetVar2.e0(1411612061);
                boolean z3 = (458752 & i5) == 131072;
                Object objP = fetVar2.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new uck0(function1, (byte) 12);
                    fetVar2.o0(objP);
                }
                mm40VarW = y860.W(mm40VarW, null, null, false, null, (Function0) objP, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1411810957);
                fetVar2.r(false);
            }
            if ((str == null || str.length() == 0) && i <= 0) {
                fetVar2.e0(1412784605);
                int i6 = i5 >> 9;
                b(mm40Var, i2, function1, fetVar2, (i5 & 14) | (i6 & 112) | (i6 & 896), 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1411925657);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
                if (str == null || str.length() == 0) {
                    z = true;
                    fetVar2.e0(-1846960412);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1847095386);
                    z = true;
                    j6n.h(str, kro0.f18776a, null, 0, 0, fetVar, ((i5 >> 3) & 14) | 48, 28);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                if (i > 0) {
                    fetVar2.e0(-1846902070);
                    tdc.e(new rpe(i), opeVar, mm40VarW, fetVar2, (i5 >> 3) & 112, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1846709436);
                    fetVar2.r(false);
                }
                b(null, i2, function1, fetVar2, (i5 >> 9) & 1008, 1);
                fetVar2.r(z);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.n2l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l8x.N(mm40Var, str, opeVar, i, i2, function1, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void O(int i, long j, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        fet fetVar2;
        pcy pcyVar;
        boolean z2;
        long j2 = j;
        fetVar.g0(-207112389);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            int i3 = i2;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), null, false, 3), 1.0f);
            y9q0 y9q0VarG = g1t0.g();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(xsm0.s(R.string.toto_accept_bets_to, fetVar), mm40VarD, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110584);
            int i4 = i3 >> 3;
            kc5.N(str, o7k0.d(jm40Var, 1.0f), staticColors.m123getWhite0d7_KjU(), null, null, 0L, qmk.o, qmk.r, null, null, 0L, null, 2, false, 1, 0, false, null, g1t0.m(), 0.0f, fetVar, (i4 & 14) | 48, 1597440, 0, 3063608);
            fetVar.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(xsm0.s(R.string.toto_till_end, fetVar), o7k0.d(o7k0.w(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), null, false, 3), 1.0f), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            wkw wkwVar = new wkw(gqw0.o);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, wkwVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            if (z) {
                j2 = j;
                z2 = false;
                fetVar2.e0(966420976);
            } else {
                fetVar2.e0(-107374508);
                j2 = j;
                vdx.e(i4 & 112, j2, fetVar2, jr8.f16991a.b(jm40Var, gqw0.f));
                z2 = false;
            }
            fetVar2.r(z2);
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(mm40Var, str, j2, z, i, (byte) 4);
        }
    }

    public static final void P(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1428424666);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), null, false, 3), 1.0f);
            y9q0 y9q0VarG = g1t0.g();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(xsm0.s(R.string.toto_tiraj, fetVar2), mm40VarD, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 109560);
            kc5.N(str, o7k0.d(jm40Var, 1.0f), staticColors.m123getWhite0d7_KjU(), null, null, 0L, qmk.o, g1t0.m().f42262a.b, null, null, 0L, gqw0.d, 2, false, 1, 0, false, null, g1t0.m(), 0.0f, fetVar, ((i2 >> 3) & 14) | 48, 1600512, 0, 3055416);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 9);
        }
    }

    public static final void Q(int i, fet fetVar, mm40 mm40Var, Function0 function0, Function0 function1, boolean z, boolean z2) {
        fetVar.g0(-2084393933);
        int i2 = (fetVar.h(z) ? 32 : 16) | i | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            int i3 = i2 >> 6;
            F(z2, function1, fetVar, (i3 & 14) | ((i2 >> 9) & 112));
            r(z, function0, fetVar, ((i2 >> 3) & 14) | (i3 & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cd(mm40Var, z, z2, function0, function1, i);
        }
    }

    public static final String R(boolean z, double d, String str, double d2) {
        str.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        p3u0 p3u0Var = p3u0.c;
        String strE = cy7.e(pn40.d(d, str, p3u0Var));
        String strE2 = cy7.e(" – ");
        return z ? kng0.l(strE, strE2, "∞") : kng0.l(strE, strE2, cy7.e(pn40.d(d2, str, p3u0Var)));
    }

    public static final String S(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        str.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        return ctf0Var.b.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d, str, p3u0.c))}, 1));
    }

    public static final String T(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        str.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        return ctf0Var.b.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(d, str, p3u0.c))}, 1));
    }

    public static void U(String str, String str2) {
        String strC0 = C0(str);
        if (i0(3, strC0)) {
            Log.d(strC0, str2);
        }
    }

    public static final tek V(o4d0 o4d0Var) {
        switch (o4d0Var == null ? -1 : v4d0.b[o4d0Var.ordinal()]) {
            case 1:
                tek tekVar = uek.d;
                tekVar.getClass();
                return tekVar;
            case 2:
                tek tekVar2 = uek.f35533a;
                tekVar2.getClass();
                return tekVar2;
            case 3:
                tek tekVar3 = uek.b;
                tekVar3.getClass();
                return tekVar3;
            case 4:
                tek tekVar4 = uek.c;
                tekVar4.getClass();
                return tekVar4;
            case 5:
                tek tekVar5 = uek.e;
                tekVar5.getClass();
                return tekVar5;
            case 6:
                tek tekVar6 = uek.f;
                tekVar6.getClass();
                return tekVar6;
            default:
                tek tekVar7 = uek.f35533a;
                tekVar7.getClass();
                return tekVar7;
        }
    }

    public static final String W(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static void X(String str, String str2) {
        String strC0 = C0(str);
        if (i0(6, strC0)) {
            Log.e(strC0, str2);
        }
    }

    public static void Y(String str, String str2, Throwable th) {
        String strC0 = C0(str);
        if (i0(6, strC0)) {
            Log.e(strC0, str2, th);
        }
    }

    public static boolean Z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void a(mm40 mm40Var, zb zbVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-591744696);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new uck0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            acb.n(zbVar, z, (Function0) objP, mm40Var, fetVar, ((i2 >> 3) & 126) | ((i2 << 9) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 12, i, (Object) mm40Var, (Object) zbVar, (Object) function1, z);
        }
    }

    public static final String a0(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        String str = new DecimalFormat("#,###", decimalFormatSymbols).format(Integer.valueOf((int) d));
        str.getClass();
        return str;
    }

    public static final void b(mm40 mm40Var, int i, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        fetVar.g0(-410910685);
        int i5 = i3 & 1;
        byte b = 4;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i5 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(o7k0.e(mm40Var3, 40.0f), 8.0f, 0.0f, 2), "ACTION_FAVORITE_ICON");
            boolean z = (i4 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new uck0(function1, (byte) 9);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarE0, null, null, false, null, (Function0) objP, 28);
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
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 24.0f), "ICON_FAVORITE_SPORT");
            boolean z2 = (i4 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new uli0(i, b);
                fetVar.o0(objP2);
            }
            dww.c(a8k0.F(i, (i4 >> 3) & 14, fetVar), i == R.drawable.ic_glyph_favourite_active ? "favorite_active" : "favorite_inactive", pai0.a(mm40VarE1, false, (Function1) objP2), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 8, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sda(mm40Var3, i, function1, i2, i3);
        }
    }

    public static final String b0(h950 h950Var, int i) {
        h950Var.getClass();
        String strB = h950Var.b(i);
        return h950Var.a(i) ? kng0.k(Separators.DOT, strB) : strB;
    }

    public static final void c(mm40 mm40Var, bhl0 bhl0Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        v0q v0qVar;
        fetVar.g0(1513697854);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(bhl0Var) ? 32 : 16) | (fetVar.g(ahl0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 6;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    v0qVar = new v0q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    v0qVar = new v0q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                objP = v0qVar;
                fetVar.o0(objP);
            }
            v0q v0qVar2 = (v0q) objP;
            d(mm40Var, v0qVar2.f36593a, function0, u1c.M(-787340461, new nhl0(bhl0Var, v0qVar2, b), fetVar), u1c.M(-25459150, new rqc0(v0qVar2, (byte) 17), fetVar), fetVar, (i3 & 14) | 27648 | ((i3 >> 3) & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new phl0(mm40Var, bhl0Var, ahl0Var, function0, i, (byte) 0);
        }
    }

    public static final String c0(myr0 myr0Var) {
        hyr0 hyr0Var = myr0Var.f;
        String str = hyr0Var.k;
        if (hyr0Var.i.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return str.concat(" FS");
    }

    public static final void d(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-654877830);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 23);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarW, 40.0f);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarE0 = o2e.e0(jr8.f16991a.b(s5x0.K(jm40Var, 8.0f, 6.0f), gqw0.e), "LARGE_CARD_LARGE_TEAM_ALL_MARKETS");
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object objValueOf = Integer.valueOf(((i2 >> 6) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i2 >> 9) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lhl0(mm40Var, j, function0, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final String d0(myr0 myr0Var) {
        hyr0 hyr0Var = myr0Var.f;
        int length = hyr0Var.i.length();
        String str = hyr0Var.k;
        if (length > 0) {
            return kng0.l(hyr0Var.i, Separators.SP, hyr0Var.j);
        }
        return str.length() > 0 ? str.concat(" FS") : "";
    }

    public static final void e(u1m u1mVar, int i, yb ybVar, boolean z, mm40 mm40Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-86401582);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(u1mVar == null ? -1 : u1mVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        mpe mpeVar = mpe.f22175a;
        if (i4 == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(mpeVar) : fetVar.i(mpeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(ybVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(mm40Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            g(u1mVar, mpeVar, i, null, fetVar, i3 & 1022, 8);
            boolean z2 = (3670016 & i3) == 1048576;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new uck0(function1, (byte) 10);
                fetVar.o0(objP);
            }
            acb.n(ybVar, z, (Function0) objP, null, fetVar, (i3 >> 9) & 126, 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gb8(u1mVar, i, ybVar, z, mm40Var, function1, i2);
        }
    }

    public static void e0(String str, String str2) {
        String strC0 = C0(str);
        if (i0(4, strC0)) {
            Log.i(strC0, str2);
        }
    }

    public static final void f(final mm40 mm40Var, final u1m u1mVar, final ope opeVar, final int i, final boolean z, final boolean z2, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(896955206);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.e(u1mVar == null ? -1 : u1mVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.e(i) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        tc00 tc00Var = tc00.f33696a;
        if (i4 == 0) {
            i3 |= fetVar2.g(tc00Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if (fetVar2.U(i5 & 1, (4793491 & i5) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            g(u1mVar, opeVar, i, null, fetVar2, (i5 >> 3) & 1022, 8);
            fetVar2 = fetVar2;
            boolean z3 = (29360128 & i5) == 8388608;
            Object objP = fetVar2.P();
            byte b = 9;
            if (z3 || objP == ukd.f35823a) {
                objP = new elk0(function1, b);
                fetVar2.o0(objP);
            }
            f7k.k(null, tc00Var, z, z2, (Function1) objP, fetVar2, (i5 >> 9) & 8176, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.p2l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l8x.f(mm40Var, u1mVar, opeVar, i, z, z2, function1, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static boolean f0(String str) {
        return i0(3, C0(str));
    }

    public static final void g(u1m u1mVar, ope opeVar, int i, mm40 mm40Var, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        fetVar.g0(-171944807);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.e(u1mVar == null ? -1 : u1mVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.e(i) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            if (i > 0 || u1mVar != null) {
                fetVar.e0(1488473339);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40Var3, 40.0f);
                thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
                if (u1mVar != null) {
                    fetVar.e0(1678552196);
                    hic.k(null, u1mVar, fetVar, (i4 << 3) & 112);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1678650218);
                    fetVar.r(false);
                }
                if (i > 0) {
                    fetVar.e0(1678690208);
                    tdc.e(new rpe(i), opeVar, null, fetVar, i4 & 112, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1678853578);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(1489015529);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofe(u1mVar, opeVar, i, mm40Var2, i2, i3);
        }
    }

    public static boolean g0() {
        return i0(6, C0("CXCP"));
    }

    public static final void h(int i, long j, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-606787110);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 4.0f, 0.0f, 10);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), null, o7k0.n(jm40.b, 20.0f), j, fetVar, 56 | ((i2 << 9) & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1m(i, j, mm40Var);
        }
    }

    public static boolean h0() {
        return i0(4, C0("CXCP"));
    }

    public static final void i(int i, int i2, ope opeVar, fet fetVar, mm40 mm40Var) {
        int i3;
        ope opeVar2;
        fet fetVar2;
        fetVar.g0(964653272);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            rpe rpeVar = new rpe(i);
            zcl zclVar = qmk.f28987a;
            opeVar2 = opeVar;
            fetVar2 = fetVar;
            tdc.e(rpeVar, opeVar2, s5x0.L(mm40Var, 8.0f, 0.0f, 2), fetVar2, (i3 << 3) & 112, 0);
        } else {
            opeVar2 = opeVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0m(opeVar2, i, mm40Var, i2);
        }
    }

    public static boolean i0(int i, String str) {
        return f19625a <= i || Log.isLoggable(str, i);
    }

    public static final void j(mm40 mm40Var, ope opeVar, int i, zb zbVar, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-579590846);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(opeVar) : fetVar2.i(opeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(zbVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            tdc.e(new rpe(i), opeVar, null, fetVar2, i4 & 112, 4);
            boolean z2 = (458752 & i4) == 131072;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new uck0(function1, (byte) 14);
                fetVar2.o0(objP);
            }
            fetVar2 = fetVar2;
            acb.n(zbVar, z, (Function0) objP, null, fetVar2, (i4 >> 9) & 126, 8);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gb8(mm40Var, opeVar, i, zbVar, z, function1, i2);
        }
    }

    public static boolean j0() {
        return i0(5, C0("CXCP"));
    }

    public static final void k(mm40 mm40Var, kpe kpeVar, spe speVar, zb zbVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i) {
        int i2;
        spe speVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-467561931);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(kpeVar) : fetVar2.i(kpeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            speVar2 = speVar;
            i2 |= fetVar2.g(speVar2) ? 256 : 128;
        } else {
            speVar2 = speVar;
        }
        int i3 = i & 3072;
        tc00 tc00Var = tc00.f33696a;
        if (i3 == 0) {
            i2 |= fetVar2.g(tc00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(zbVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.h(true) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (fetVar2.U(i4 & 1, (38347923 & i4) != 38347922)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            int i5 = i4 >> 6;
            tdc.e(speVar2, kpeVar, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), fetVar, (i4 & 112) | (i5 & 14), 0);
            int i6 = i4 & 234881024;
            boolean z3 = i6 == 67108864;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new uck0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            int i7 = i4 >> 12;
            acb.n(zbVar, z, (Function0) objP, null, fetVar, i7 & 126, 8);
            fetVar2 = fetVar;
            boolean z4 = i6 == 67108864;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new elk0(function1, (byte) 7);
                fetVar2.o0(objP2);
            }
            f7k.k(null, tc00Var, z2, true, (Function1) objP2, fetVar2, (i5 & 112) | (i7 & 896) | (i7 & 7168), 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwl(mm40Var, kpeVar, speVar, zbVar, z, z2, function1, i, (byte) 4);
        }
    }

    public static final int k0(j3d0 j3d0Var) {
        int i = j3d0Var == null ? -1 : v4d0.f36772a[j3d0Var.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static final void l(fpe fpeVar, int i, long j, mm40 mm40Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1027265464);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(fpeVar) : fetVar.i(fpeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 4.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = i3 << 3;
            tdc.e(new rpe(i), fpeVar, null, fetVar, i4 & 112, 4);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar), null, o7k0.n(jm40.b, 20.0f), j, fetVar, 56 | (i4 & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0m(fpeVar, i, j, mm40Var, i2);
        }
    }

    public static List l0(t9k0 t9k0Var, int i, t9k0 t9k0Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = t9k0Var.t(i);
        int i2 = i + iT;
        int iF = t9k0Var.f(t9k0Var.b, t9k0Var.q(i));
        int iF2 = t9k0Var.f(t9k0Var.b, t9k0Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (t9k0Var.b[(t9k0Var.q(i) * 5) + 1] & 201326592) != 0;
        t9k0Var2.v(iT);
        t9k0Var2.w(i3, t9k0Var2.t);
        if (t9k0Var.g < i2) {
            t9k0Var.A(i2);
        }
        if (t9k0Var.k < iF2) {
            t9k0Var.B(iF2, i2);
        }
        int[] iArr = t9k0Var2.b;
        int i4 = t9k0Var2.t;
        int i5 = i4 * 5;
        qx3.d(i5, i * 5, i2 * 5, t9k0Var.b, iArr);
        Object[] objArr = t9k0Var2.c;
        int i6 = t9k0Var2.i;
        System.arraycopy(t9k0Var.c, iF, objArr, i6, i3);
        int i7 = t9k0Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - t9k0Var2.f(iArr, i4);
        int i10 = t9k0Var2.m;
        int i11 = t9k0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = t9k0.h(t9k0Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : t9k0Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        t9k0Var2.m = i12;
        int iB = s9k0.b(t9k0Var.d, i, t9k0Var.o());
        int iB2 = s9k0.b(t9k0Var.d, i2, t9k0Var.o());
        if (iB < iB2) {
            ArrayList arrayList = t9k0Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                bet betVar = (bet) arrayList.get(i15);
                betVar.f2467a += i8;
                arrayList2.add(betVar);
            }
            t9k0Var2.d.addAll(s9k0.b(t9k0Var2.d, t9k0Var2.t, t9k0Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = iun.f15405a;
        }
        if (!list.isEmpty()) {
            HashMap map = t9k0Var.e;
            HashMap map2 = t9k0Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = t9k0Var2.v;
        t9k0Var2.P(i7);
        int iF4 = t9k0Var.F(t9k0Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iF4 >= 0;
            if (z7) {
                t9k0Var.Q();
                t9k0Var.a(iF4 - t9k0Var.t);
                t9k0Var.Q();
            }
            t9k0Var.a(i - t9k0Var.t);
            boolean zI = t9k0Var.I();
            if (z7) {
                t9k0Var.N();
                t9k0Var.i();
                t9k0Var.N();
                t9k0Var.i();
            }
            z4 = zI;
        } else {
            boolean zJ = t9k0Var.J(i, iT);
            t9k0Var.K(iF, i3, i - 1);
            z4 = zJ;
        }
        if (z4) {
            ykd.a("Unexpectedly removed anchors");
        }
        int i18 = t9k0Var2.o;
        int i19 = iArr3[i5 + 1];
        t9k0Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            t9k0Var2.t = i9;
            t9k0Var2.i = i6 + i3;
        }
        if (z6) {
            t9k0Var2.V(i7);
        }
        return list;
    }

    public static final void m(mm40 mm40Var, ope opeVar, int i, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(141473268);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(opeVar) : fetVar.i(opeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        tc00 tc00Var = tc00.f33696a;
        if (i4 == 0) {
            i3 |= fetVar.g(tc00Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            cl5 cl5Var = ukd.f35823a;
            if (i > 0) {
                fetVar.e0(1267538524);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                fetVar2 = fetVar;
                tdc.e(new rpe(i), opeVar, null, fetVar2, i5 & 112, 4);
                boolean z3 = (i5 & 3670016) == 1048576;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new elk0(function1, (byte) 5);
                    fetVar2.o0(objP);
                }
                f7k.k(null, tc00Var, z, z2, (Function1) objP, fetVar2, (i5 >> 6) & 8176, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                byte b = 6;
                fetVar.e0(1268154773);
                boolean z4 = (i5 & 3670016) == 1048576;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new elk0(function1, b);
                    fetVar.o0(objP2);
                }
                int i6 = i5 >> 6;
                f7k.k(mm40Var, tc00Var, z, z2, (Function1) objP2, fetVar, (i5 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168), 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5n(mm40Var, opeVar, i, z, z2, function1, i2);
        }
    }

    public static final voy m0(p2d0 p2d0Var, h950 h950Var) {
        p2d0Var.getClass();
        h950Var.getClass();
        String strB0 = b0(h950Var, p2d0Var.c);
        List<n2d0> list = p2d0Var.d;
        ArrayList arrayListU = twn.u(list);
        for (n2d0 n2d0Var : list) {
            m2d0 m2d0Var = n2d0Var.d;
            m2d0Var.getClass();
            ppy ppyVarN0 = n0(m2d0Var, h950Var);
            Pair pair = ppyVarN0 != null ? new Pair(h950Var.getString(n2d0Var.c), ppyVarN0) : null;
            if (pair != null) {
                arrayListU.add(pair);
            }
        }
        return new voy(strB0, xp20.m(arrayListU));
    }

    public static final void n(mm40 mm40Var, pz40 pz40Var, eil0 eil0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        Object w0qVar;
        Object obj;
        float fS;
        fetVar.g0(1580112668);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(eil0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objC = eil0Var.c();
            objC.getClass();
            boolean zG = fetVar.g(objC);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                if (objC instanceof zgl0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    zgl0 zgl0Var = (zgl0) objC;
                    w0qVar = new w0q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimary20(), s6t0.b().f33626a.getPrimary60(), zgl0Var.f44350a, zgl0Var.b, s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getPrimary());
                } else {
                    if (!(objC instanceof ygl0)) {
                        t9f.b();
                        return;
                    }
                    pz40 pz40Var3 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    ygl0 ygl0Var = (ygl0) objC;
                    w0qVar = new w0q(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m130getWhite600d7_KjU(), ygl0Var.f42591a, ygl0Var.b, staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m123getWhite0d7_KjU());
                }
                obj = w0qVar;
                fetVar.o0(obj);
            } else {
                obj = objP;
            }
            w0q w0qVar2 = (w0q) obj;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = jgk0.b(new m9l0(pz40Var, (byte) 14));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                objP3 = jgk0.b(new m9l0(pz40Var, (byte) 15));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                objP4 = jgk0.b(new m9l0(pz40Var, (byte) 16));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = jgk0.b(new m9l0(pz40Var, (byte) 10));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var4 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj2) {
                objP6 = jgk0.b(new m9l0(pz40Var, (byte) 11));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var5 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj2) {
                objP7 = jgk0.b(new m9l0(pz40Var, (byte) 12));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var6 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj2) {
                objP8 = jgk0.b(new m9l0(pz40Var, (byte) 13));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var7 = (l7m0) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == obj2) {
                objP9 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, b));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var8 = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == obj2) {
                objP10 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 3));
                fetVar.o0(objP10);
            }
            l7m0 l7m0Var9 = (l7m0) objP10;
            boolean zG2 = fetVar.g(eil0Var.a());
            Object objP11 = fetVar.P();
            if (zG2 || objP11 == obj2) {
                objP11 = y9q0.a(eil0Var.a(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679);
                fetVar.o0(objP11);
            }
            y9q0 y9q0Var = (y9q0) objP11;
            boolean zF = fetVar.f(eil0Var.a().f42262a.b);
            Object objP12 = fetVar.P();
            if (zF || objP12 == obj2) {
                objP12 = new n05(qmk.o, eil0Var.a().f42262a.b, qmk.n);
                fetVar.o0(objP12);
            }
            n05 n05Var = (n05) objP12;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zF2 = fetVar.f(eil0Var.a().f42262a.b) | fetVar.g(w6kVar);
            Object objP13 = fetVar.P();
            if (zF2 || objP13 == obj2) {
                long j = eil0Var.a().f42262a.b;
                if ((j & 1095216660480L) == 0) {
                    zcl zclVar = qmk.f28987a;
                    fS = 12.0f;
                } else {
                    fS = w6kVar.s(j);
                }
                zcl zclVar2 = qmk.f28987a;
                objP13 = twn.j(rw2.a(fS, 12.0f, 0.75f, 8.0f), fetVar);
            }
            int i4 = (i3 & 14) | 100663728;
            int i5 = i3 << 9;
            o(mm40Var, l7m0Var3, l7m0Var7, w0qVar2.f38363a, w0qVar2.b, w0qVar2.c, function0, function1, u1c.M(-190457424, new oml(eil0Var, w0qVar2, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var8, l7m0Var9, l7m0Var, l7m0Var3, ((ycl) objP13).f42389a, l7m0Var2, n05Var, y9q0Var), fetVar), fetVar, i4 | (3670016 & i5) | (i5 & 29360128));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, pz40Var, eil0Var, function0, function1, i, (byte) 6);
        }
    }

    public static final ppy n0(m2d0 m2d0Var, h950 h950Var) {
        m2d0Var.getClass();
        h950Var.getClass();
        boolean zBooleanValue = njq.U.e(m2d0Var.m).booleanValue();
        l2d0 l2d0Var = m2d0Var.c;
        if (zBooleanValue) {
            int i = l2d0Var != null ? pae0.f26652a[l2d0Var.ordinal()] : -1;
            if (i == 1) {
                byte b = (byte) m2d0Var.d;
                o1t0 o1t0Var = p1t0.b;
                return new lpy(b);
            }
            if (i == 2) {
                short s = (short) m2d0Var.d;
                p2t0 p2t0Var = q2t0.b;
                return new opy(s);
            }
            if (i == 3) {
                int i2 = (int) m2d0Var.d;
                a2t0 a2t0Var = b2t0.b;
                return new mpy(i2);
            }
            if (i != 4) {
                e9d0.x(m2d0Var.c, "Cannot read value of unsigned type: ");
                return null;
            }
            long j = m2d0Var.d;
            g2t0 g2t0Var = h2t0.b;
            return new npy(j);
        }
        switch (l2d0Var != null ? pae0.f26652a[l2d0Var.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                t9f.b();
                return null;
            case 1:
                return new apy((byte) m2d0Var.d);
            case 2:
                return new jpy((short) m2d0Var.d);
            case 3:
                return new fpy((int) m2d0Var.d);
            case 4:
                return new ipy(m2d0Var.d);
            case 5:
                return new bpy((char) m2d0Var.d);
            case 6:
                return new epy(m2d0Var.e);
            case 7:
                return new cpy(m2d0Var.f);
            case 8:
                return new zoy(m2d0Var.d != 0);
            case 9:
                return new kpy(h950Var.getString(m2d0Var.g));
            case 10:
                String strB0 = b0(h950Var, m2d0Var.h);
                int i3 = m2d0Var.l;
                return i3 == 0 ? new gpy(strB0) : new xoy(strB0, i3);
            case 11:
                return new dpy(b0(h950Var, m2d0Var.h), h950Var.getString(m2d0Var.i));
            case 12:
                p2d0 p2d0Var = m2d0Var.j;
                p2d0Var.getClass();
                return new woy(m0(p2d0Var, h950Var));
            case 13:
                List<m2d0> list = m2d0Var.k;
                ArrayList arrayListU = twn.u(list);
                for (m2d0 m2d0Var2 : list) {
                    m2d0Var2.getClass();
                    ppy ppyVarN0 = n0(m2d0Var2, h950Var);
                    if (ppyVarN0 != null) {
                        arrayListU.add(ppyVarN0);
                    }
                }
                return new yoy(arrayListU);
        }
    }

    public static final void o(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        fetVar.g0(-710597363);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= fetVar.i(ugdVar) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (i2 & 38347923) != 38347922)) {
            boolean z = l7m0Var3.getValue() == k0d.b;
            Context context = (Context) fetVar.k(dy2.b);
            byte b = 1;
            mm40 mm40VarN = epv0.N(jm40.b, z ? 0.5f : 1.0f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = !z;
            boolean zI = ((29360128 & i2) == 8388608) | fetVar.i(context);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new jhl0(function1, context, b);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = (3670016 & i2) == 1048576;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = new l3c0(function0, (byte) 24);
                fetVar.o0(objP3);
            }
            mm40 mm40VarE0 = o2e.e0(y860.Z(mm40VarN, gy40Var, z2, function2, (Function0) objP3, 440), "EXPRESS_OVERALL_COEF_COLUMN");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = o7k0.b(mm40VarE0, 0.0f, 40.0f, 1);
            boolean z4 = ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == obj) {
                Object shl0Var = new shl0(l7m0Var2, j2, j, j3, (byte) 0);
                fetVar.o0(shl0Var);
                objP4 = shl0Var;
            }
            mm40 mm40VarK = rq8.K(mm40VarB, (Function1) objP4);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarK).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            ua80.p(((i2 >> 21) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new khl0(mm40Var, l7m0Var, l7m0Var2, j, j2, j3, function0, function1, ugdVar, i, (byte) 1);
        }
    }

    public static final void o0(cp cpVar) {
        ((p2k) cpVar.u).f.setText(cpVar.w(R.string.two_values_with_space, String.valueOf(((h5c0) cpVar.u()).f12473a), ((h5c0) cpVar.u()).b));
    }

    public static final void p(mm40 mm40Var, long j, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(134954600);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 40.0f), 8.0f, 0.0f, 2);
            Unit unit = Unit.f46060a;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qo90(function1, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40VarL, unit, (PointerInputEventHandler) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_reorder, 0, fetVar), null, null, j, fetVar, 56 | ((i2 << 6) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((byte) 10, i, j, mm40Var, (Object) function1);
        }
    }

    public static final void p0(cp cpVar) {
        boolean z = ((h5c0) cpVar.u()).f;
        p2k p2kVar = (p2k) cpVar.u;
        p2kVar.e.setVisibility(z ? 0 : 8);
        p2kVar.d.setVisibility(z ? 0 : 8);
        sj3.L0(p2kVar.c, 0, z ? 0 : cpVar.w.getResources().getDimensionPixelSize(R.dimen.space_12), 0, 0, 13);
    }

    public static final void q(final mm40 mm40Var, final long j, final boolean z, final boolean z2, final Function1 function1, final Function1 function2, fet fetVar, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1788886088);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        int i3 = i & 384;
        tc00 tc00Var = tc00.f33696a;
        if (i3 == 0) {
            i2 |= fetVar2.g(tc00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= fetVar2.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= fetVar2.h(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            p(o2e.e0(mm40Var, "DRAG_AND_DROP_CONTAINER"), j, function1, fetVar2, ((i2 >> 9) & 896) | (i2 & 112));
            boolean z5 = (3670016 & i2) == 1048576;
            Object objP = fetVar2.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new elk0(function2, (byte) 8);
                fetVar2.o0(objP);
            }
            f7k.k(null, tc00Var, z3, z4, (Function1) objP, fetVar2, (i2 >> 3) & 8176, 1);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.o2l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l8x.q(mm40Var, j, z, z2, function1, function2, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final ArrayList q0(List list) {
        list.getClass();
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    public static final void r(boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(2107334716);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.n(jm40Var, 40.0f), null, null, false, null, function0, 28);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar2 = fetVar;
            dww.c(a8k0.F(z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5h(z, function0, i, (byte) 4);
        }
    }

    public static final String r0(ww70 ww70Var) {
        ww70Var.getClass();
        zw70 zw70Var = ww70Var.f39875a;
        String str = zw70Var != null ? zw70Var.f45093a : null;
        if (str == null) {
            return "://open/promopage";
        }
        switch (str.hashCode()) {
            case -1678450584:
                return str.equals("choosebonus") ? "://open/choosebonus" : "://open/promopage";
            case -1632642245:
                return !str.equals("choicecashback") ? "://open/promopage" : "://open/choicecashback";
            case 1740606838:
                return !str.equals("choicevipcashback") ? "://open/promopage" : "://open/choicevipcashback";
            case 1742360066:
                return !str.equals("bonusgames") ? "://open/promopage" : "://open/bonusgames";
            default:
                return "://open/promopage";
        }
    }

    public static final void s(dqh0 dqh0Var, fet fetVar, int i) {
        fetVar.g0(-1943695369);
        int i2 = (i & 6) == 0 ? (fetVar.g(dqh0Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(881091416);
            int i3 = dqh0Var.d;
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 < dqh0Var.c) {
                    fetVar.e0(685627275);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_checkmark, 0, fetVar);
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(pm80VarF, null, o2e.e0(s5x0.J(i120.Q(o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), vgg0.f37379a), 4.0f), "GiftStagesListIcon"), y3d.g, fetVar, 3128, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(686191351);
                    zcl zclVar3 = qmk.f28987a;
                    qxw.o(fetVar, i120.Q(o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), vgg0.f37379a));
                    fetVar.r(false);
                }
                if (i4 != dqh0Var.d - 1) {
                    fetVar.e0(686555880);
                    qxw.o(fetVar, o7k0.s(jm40Var, 4.0f));
                    fetVar.r(false);
                } else {
                    fetVar.e0(686631799);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(dqh0Var, i, (byte) 11);
        }
    }

    public static final eml s0(kic0 kic0Var, boolean z, List list, nw80 nw80Var, ctf0 ctf0Var) {
        long j = kic0Var.d;
        String str = kic0Var.e;
        String strA = k2b0.f17564a[nw80Var.ordinal()] == 1 ? ctf0Var.b.a(R.string.slot_game_of_the_week, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.livecasino_game_of_the_week, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = kic0Var.c;
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new eml(j, str, strA, new n0x(sb.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6), z, new m0x(R.drawable.ic_glyph_favourite_active, null, 6), new m0x(R.drawable.ic_glyph_favourite_inactive, null, 6), list.contains(Long.valueOf(kic0Var.d)), ctf0Var.b.a(R.string.aggregator_play, Arrays.copyOf(new Object[0], 0)), true);
    }

    public static final void t(int i, fet fetVar, String str, Function0 function0, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1017692230);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 40.0f, 0.0f, 2);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarL = twn.l(gqw0.k, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 10.0f, 0.0f, 10.0f, 4));
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.j(), fetVar2), fetVar, i2 & 14, 0, 131068);
            fetVar2 = fetVar;
            acb.n(new zb(null, null, 7), z, function0, new ecu0(yx7Var), fetVar2, i2 & 1008, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ot8(str, z, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public static final pa20 t0(q16 q16Var) {
        nwo nwoVar;
        String str;
        n1f n1fVar;
        Long l;
        n1f n1fVar2;
        Double d;
        n1f n1fVar3;
        Double d2;
        n1f n1fVar4;
        Integer num;
        n1f n1fVar5;
        List list;
        Boolean bool;
        Boolean bool2;
        n1f n1fVar6;
        Long l2;
        Double d3;
        q16Var.getClass();
        boolean z = q16Var.b;
        Object obj = q16Var.d;
        List list2 = null;
        arrayList = 0;
        arrayList = 0;
        ?? arrayList = 0;
        list2 = null;
        if (!z) {
            gi7 gi7Var = (gi7) obj;
            if (gi7Var != null && (nwoVar = gi7Var.f11331a) != null) {
                list2 = nwoVar.f24243a;
            }
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            String str2 = q16Var.f27936a;
            String str3 = str2 != null ? str2 : "";
            i2o i2oVar = (i2o) q16Var.c;
            if (i2oVar == null) {
                i2oVar = i2o.UnknownError;
            }
            return new na20(list2, i2oVar, str3);
        }
        gi7 gi7Var2 = (gi7) obj;
        if (gi7Var2 == null || (str = gi7Var2.c) == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = (gi7Var2 == null || (d3 = gi7Var2.b) == null) ? 0.0d : d3.doubleValue();
        long jLongValue = (gi7Var2 == null || (l2 = gi7Var2.e) == null) ? 0L : l2.longValue();
        String str4 = gi7Var2 != null ? gi7Var2.d : null;
        String str5 = str4 == null ? "" : str4;
        if (gi7Var2 == null || (n1fVar = gi7Var2.f) == null || (l = n1fVar.f22748a) == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l.longValue();
        if (gi7Var2 == null || (n1fVar2 = gi7Var2.f) == null || (d = n1fVar2.b) == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d.doubleValue();
        String str6 = (gi7Var2 == null || (n1fVar6 = gi7Var2.f) == null) ? null : n1fVar6.c;
        String str7 = str6 == null ? "" : str6;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (gi7Var2 == null || (bool2 = gi7Var2.g) == null) ? false : bool2.booleanValue();
        if (gi7Var2 != null && (bool = gi7Var2.h) != null) {
            zBooleanValue = bool.booleanValue();
        }
        boolean z2 = zBooleanValue;
        if (gi7Var2 == null || (n1fVar3 = gi7Var2.f) == null || (d2 = n1fVar3.d) == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue3 = d2.doubleValue();
        nwd nwdVar = q4f.f28094a;
        if (gi7Var2 == null || (n1fVar4 = gi7Var2.f) == null || (num = n1fVar4.e) == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        nwdVar.getClass();
        q4f q4fVarA = nwd.a(iIntValue);
        if (gi7Var2 != null && (n1fVar5 = gi7Var2.f) != null && (list = n1fVar5.f) != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(nia0.e0((qv6) it.next()));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new oa20(str, dDoubleValue, jLongValue, str5, jLongValue2, dDoubleValue2, str7, zBooleanValue2, z2, dDoubleValue3, q4fVarA, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void u(int i, int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i3;
        mm40 mm40Var2;
        String str3;
        fet fetVar2;
        ?? r1;
        jm40 jm40Var;
        boolean z;
        androidx.compose.runtime.d dVar;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(2129216255);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= fetVar5.g(str2) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        if (fetVar5.U(i6 & 1, (i6 & 1171) != 1170)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var2 : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            androidx.compose.runtime.d dVar2 = zaq0.b;
            mm40 mm40VarK = s5x0.K(o7k0.b(i120.Q(mm40VarD, ((ThemeColors) fetVar5.k(dVar2)).getBackgroundContent(), ugg0Var2), 0.0f, 60.0f, 1), 16.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar5, 6);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarK);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z2 = fetVar5.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar5.l(function0);
            } else {
                fetVar5.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar5, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar3);
            jpm0.n(fetVar5);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
            int iHashCode2 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM2 = fetVar5.m();
            mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var2);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function0);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, shdVar);
            jpm0.o(fetVar5, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
            brm0.x(fetVar5, mm40VarC1, shdVar4, 881684009, false);
            if (StringsKt.W("")) {
                r1 = 0;
                jm40Var = jm40Var2;
                z = true;
                fet fetVar6 = fetVar5;
                dVar = dVar2;
                fetVar6.e0(882318889);
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(881756270);
                mm40 mm40VarN = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                qrq qrqVar = j1t0.b;
                long j = qmk.s;
                y9q0 y9q0VarA = y9q0.a(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), ((ThemeColors) fetVar5.k(dVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                n05 n05Var = new n05(qmk.q, j, qmk.n);
                int i7 = (i6 >> 3) & 14;
                dVar = dVar2;
                r1 = 0;
                jm40Var = jm40Var2;
                z = true;
                v8q0.a("", mm40VarN, 0L, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0VarA, fetVar5, i7, 24960, 110580);
                fet fetVar7 = fetVar5;
                fetVar7.r(false);
                fetVar3 = fetVar7;
            }
            fetVar3.r(z);
            if (StringsKt.W(r5)) {
                fetVar3.e0(1036539757);
                fetVar3.r(r1);
            } else {
                fetVar3.e0(1036483058);
                zq8.a(r1, fetVar3, o7k0.e(jm40Var, 8.0f));
                fetVar3.r(r1);
            }
            if (StringsKt.W(str2)) {
                fet fetVar8 = fetVar3;
                fetVar8.e0(1036746093);
                fetVar8.r(r1);
                fetVar4 = fetVar8;
            } else {
                fetVar3.e0(1036584645);
                fet fetVar9 = fetVar3;
                v8q0.a(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), ((ThemeColors) fetVar3.k(dVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar9, (i6 >> 6) & 14, 0, 131070);
                fet fetVar10 = fetVar9;
                fetVar10.r(r1);
                fetVar4 = fetVar10;
            }
            fetVar4.r(z);
            mm40Var2 = mm40Var3;
            str3 = "";
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            mm40Var2 = mm40Var;
            str3 = str;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5h(mm40Var2, str3, str2, i, i2, (byte) 1);
        }
    }

    public static final int u0(li10 li10Var) {
        if (li10Var instanceof ji10) {
            return ((ji10) li10Var).f16555a;
        }
        if (li10Var instanceof ki10) {
            return ((ki10) li10Var).f18315a;
        }
        t9f.b();
        return 0;
    }

    public static final void v(mm40 mm40Var, y7y y7yVar, fet fetVar, int i) {
        fetVar.g0(317877642);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(y7yVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (y7yVar instanceof v7y) {
            fetVar.e0(-509868050);
            w(mm40Var, ((v7y) y7yVar).f36953a, false, fetVar, (i2 & 14) | 384);
            fetVar.r(false);
        } else if (y7yVar instanceof w7y) {
            fetVar.e0(-509628017);
            w(mm40Var, ((w7y) y7yVar).f38695a, true, fetVar, (i2 & 14) | 384);
            fetVar.r(false);
        } else {
            if (!y7yVar.equals(x7y.f40438a)) {
                throw b1j.f(537740198, fetVar, false);
            }
            fetVar.e0(-509393719);
            z(0, fetVar, o7k0.d(mm40Var, 1.0f));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var, y7yVar, i, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final List v0(kgb kgbVar) {
        List list;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List list2;
        String str;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        Object next5;
        kgbVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = kgbVar.f18230a.iterator();
        while (true) {
            ?? r4 = 0;
            r4 = 0;
            r4 = 0;
            if (!it.hasNext()) {
                return CollectionsKt.A0(arrayList, new lk30(r4));
            }
            xfp0 xfp0Var = (xfp0) it.next();
            deb debVar = kgbVar.c;
            Object obj = null;
            if (debVar == null || (list7 = debVar.g) == null) {
                list = null;
            } else {
                Iterator it2 = list7.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it2.next();
                    List list8 = ((n6e0) next5).b;
                    if (list8 == null || !list8.isEmpty()) {
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            if (((k9e0) it3.next()).d.equals(xfp0Var.f40802a)) {
                                break;
                            }
                        }
                    }
                }
                n6e0 n6e0Var = (n6e0) next5;
                if (n6e0Var != null) {
                    list = n6e0Var.b;
                } else {
                    list = null;
                }
            }
            if (list == null) {
                list = iun.f15405a;
            }
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((k9e0) next).f17912a != 3);
            k9e0 k9e0Var = (k9e0) next;
            String str2 = (k9e0Var == null || (list6 = k9e0Var.c) == null) ? null : (String) CollectionsKt.firstOrNull(list6);
            String str3 = str2 == null ? "" : str2;
            Iterator it5 = list.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
            } while (((k9e0) next2).f17912a != 4);
            k9e0 k9e0Var2 = (k9e0) next2;
            String str4 = (k9e0Var2 == null || (list5 = k9e0Var2.c) == null) ? null : (String) CollectionsKt.firstOrNull(list5);
            String str5 = str4 == null ? "" : str4;
            Iterator it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (((k9e0) next3).f17912a != 5);
            k9e0 k9e0Var3 = (k9e0) next3;
            String str6 = (k9e0Var3 == null || (list4 = k9e0Var3.c) == null) ? null : (String) CollectionsKt.firstOrNull(list4);
            String str7 = str6 == null ? "" : str6;
            Iterator it7 = list.iterator();
            do {
                if (!it7.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it7.next();
            } while (((k9e0) next4).f17912a != 6);
            k9e0 k9e0Var4 = (k9e0) next4;
            String str8 = (k9e0Var4 == null || (list3 = k9e0Var4.c) == null) ? null : (String) CollectionsKt.firstOrNull(list3);
            String str9 = str8 == null ? "" : str8;
            for (Object obj2 : list) {
                if (((k9e0) obj2).f17912a == 1) {
                    obj = obj2;
                    break;
                }
            }
            k9e0 k9e0Var5 = (k9e0) obj;
            if (k9e0Var5 != null && (list2 = k9e0Var5.c) != null && (str = (String) CollectionsKt.firstOrNull(list2)) != null) {
                r4 = Integer.parseInt(str);
            }
            arrayList.add(new kk30(r4 == true ? 1 : 0, xfp0Var.f40802a, "/sfiles/logo_teams/".concat(xfp0Var.c), xfp0Var.d, str3, str5, str7, str9));
        }
    }

    public static final void w(mm40 mm40Var, jpr0 jpr0Var, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-116261740);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(jpr0Var) : fetVar.i(jpr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 172.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jm40 jm40Var = jm40.b;
            x(0, fetVar, s5x0.M(jm40Var, 12.0f, 12.0f, 16.0f, 12.0f), jpr0Var.b, jpr0Var.e);
            mbc.o(wfi0.f39073a, o7k0.e(jm40Var, 1.0f), false, fetVar, 6, 4);
            P(0, fetVar, o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 12.0f, 0.0f, 2), 1.0f), jpr0Var.f16916a);
            O((i3 << 3) & 7168, jpr0Var.d, fetVar, o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f, 0.0f, 2), 1.0f), jpr0Var.c, z);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) mm40Var, (Object) jpr0Var, z, i, (byte) 0);
        }
    }

    public static final List w0(qe40 qe40Var, List list, ctf0 ctf0Var, boolean z, boolean z2, pt0 pt0Var) {
        String strA;
        byte b;
        boolean z3;
        jf40 jf40Var;
        boolean z4;
        ctf0 ctf0Var2 = ctf0Var;
        vbj vbjVar = qe40Var.b;
        x4t x4tVar = qe40Var.f28565a;
        boolean z5 = vbjVar instanceof pbj;
        p0s n0sVar = o0s.f24443a;
        boolean z6 = false;
        if (z5) {
            return q3d.j(new jf40(new fqv(x4tVar), new ijm()), new hf40(x4tVar, new aml(pt0Var, new wll(n0sVar), true)));
        }
        if (!(vbjVar instanceof qbj)) {
            return iun.f15405a;
        }
        fqv fqvVar = new fqv(x4tVar);
        boolean z7 = x4tVar instanceof v4t;
        if (z7) {
            strA = ctf0Var2.b.a(R.string.recommendation, Arrays.copyOf(new Object[0], 0));
        } else if (x4tVar instanceof p4t) {
            strA = ctf0Var2.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0));
        } else if (x4tVar instanceof s4t) {
            strA = ctf0Var2.b.a(R.string.viewed_games, Arrays.copyOf(new Object[0], 0));
        } else if (x4tVar instanceof i4t) {
            strA = ctf0Var2.b.a(R.string.live_casino_popular, Arrays.copyOf(new Object[0], 0));
        } else if (x4tVar instanceof l4t) {
            strA = ctf0Var2.b.a(R.string.slots_popular, Arrays.copyOf(new Object[0], 0));
        } else if (x4tVar instanceof o4t) {
            strA = ctf0Var2.b.a(R.string.crash_aggregator_popular_title, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = x4tVar instanceof r4t ? ((r4t) x4tVar).b : "";
        }
        jf40 jf40Var2 = new jf40(fqvVar, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166));
        byte b2 = 8;
        if (z7) {
            b = ((v4t) x4tVar).f36796a;
        } else if (x4tVar instanceof i4t) {
            b = ((i4t) x4tVar).f14161a;
        } else if (x4tVar instanceof l4t) {
            b = ((l4t) x4tVar).f19425a;
        } else {
            b = x4tVar instanceof o4t ? ((o4t) x4tVar).f24656a : (byte) 8;
        }
        if (b > 8) {
            n0sVar = null;
        }
        if (n0sVar == null) {
            n0sVar = new n0s(b);
        }
        wll wllVar = new wll(n0sVar);
        Iterable iterable = (Iterable) ((qbj) vbjVar).f28448a;
        if (z7) {
            b2 = ((v4t) x4tVar).f36796a;
        } else if (x4tVar instanceof i4t) {
            b2 = ((i4t) x4tVar).f14161a;
        } else if (x4tVar instanceof l4t) {
            b2 = ((l4t) x4tVar).f19425a;
        } else if (x4tVar instanceof o4t) {
            b2 = ((o4t) x4tVar).f24656a;
        } else if (x4tVar instanceof p4t) {
            b2 = ((p4t) x4tVar).f26372a;
        } else if (x4tVar instanceof s4t) {
            b2 = ((s4t) x4tVar).f31624a;
        }
        List<mlr> listD0 = CollectionsKt.D0(iterable, b2);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        for (mlr mlrVar : listD0) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = z6;
                        jf40Var = jf40Var2;
                        z4 = z3;
                        break;
                    }
                    z3 = z6;
                    jf40Var = jf40Var2;
                    if (((mlr) it.next()).f22006a == mlrVar.f22006a) {
                        z4 = true;
                        break;
                    }
                    z6 = z3;
                    jf40Var2 = jf40Var;
                }
            } else {
                z4 = z6;
                z3 = z4;
                jf40Var = jf40Var2;
            }
            arrayList.add(ccq0.Z(mlrVar, ctf0Var2, z2, z, z4, pt0Var, x4tVar instanceof r4t ? Integer.valueOf((int) ((r4t) x4tVar).f29854a) : null));
            ctf0Var2 = ctf0Var;
            z6 = z3;
            jf40Var2 = jf40Var;
        }
        hf40 hf40Var = new hf40(x4tVar, new zll(pt0Var, wllVar, arrayList));
        tf40[] tf40VarArr = new tf40[2];
        tf40VarArr[z6 ? 1 : 0] = jf40Var2;
        tf40VarArr[1] = hf40Var;
        return q3d.j(tf40VarArr);
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-130735105);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cyber_cs2_cup, 0, fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM131getWhite800d7_KjU = staticColors.m131getWhite800d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, twn.l(gqw0.k, o7k0.n(jm40Var, 32.0f)), jM131getWhite800d7_KjU, fetVar2, 56, 0);
            mm40 mm40VarW = o7k0.w(o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(str2, o7k0.d(o7k0.w(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), null, false, 3), 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, (i2 >> 6) & 14, 28032, 102396);
            kc5.N(str, null, 0L, null, null, 0L, qmk.q, qmk.s, null, null, 0L, gqw0.d, 2, false, 1, 0, false, null, y9q0.a(g1t0.j(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, (i2 >> 3) & 14, 1600512, 0, 3055422);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 9);
        }
    }

    public static final List x0(ef40 ef40Var, a550 a550Var, ctf0 ctf0Var, boolean z, boolean z2, String str, boolean z3, List list) {
        char c;
        Object x7c0Var;
        int i;
        int i2;
        o0x m0xVar;
        char c2;
        int i3;
        String str2;
        n0x n0xVar;
        char c3;
        Object objPrevious;
        i0i i0iVar;
        char c4;
        char c5;
        List listC;
        String str3;
        ef40Var.getClass();
        a550Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        int i4 = 1;
        char c6 = '/';
        List list2 = null;
        char c7 = 0;
        if (ef40Var instanceof me40) {
            lq5 lq5Var = a550Var.b;
            vbj vbjVar = ((me40) ef40Var).f21627a;
            if (vbjVar instanceof pbj) {
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(new of40(new szc0(lq5Var)));
                return kotlin.collections.a.a(lc00VarB);
            }
            if (!(vbjVar instanceof qbj)) {
                return iun.f15405a;
            }
            lc00 lc00VarB2 = kotlin.collections.a.b();
            Iterable<lr5> iterable = (Iterable) ((qbj) vbjVar).f28448a;
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            for (lr5 lr5Var : iterable) {
                int i5 = lr5Var.f20512a;
                StringBuilder sb = new StringBuilder(ujn.h);
                if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                    str3 = lr5Var.c;
                } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                    str3 = lr5Var.b;
                } else {
                    if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                        t9f.b();
                        return list2;
                    }
                    str3 = lr5Var.d;
                }
                str3.getClass();
                if (str3.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str3);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str3, '/'));
                }
                arrayList.add(new fr5(i5, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                list2 = null;
            }
            lc00VarB2.add(new of40(new rzc0(lq5Var, dyb.r0(arrayList))));
            return kotlin.collections.a.a(lc00VarB2);
        }
        if (ef40Var instanceof xe40) {
            vbj vbjVar2 = ((xe40) ef40Var).f40727a;
            if (vbjVar2 instanceof pbj) {
                return kotlin.collections.a.c(new pf40(vyh.f38247a));
            }
            if (!(vbjVar2 instanceof sbj)) {
                return iun.f15405a;
            }
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            return kotlin.collections.a.c(new pf40(new uyh(lsm0Var.a(R.string.login_to, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.my_aggregator_registration_banner_info, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), new tyh(new m0x(R.drawable.ic_aggregator_gift_card_picture, null, 6)))));
        }
        if (ef40Var instanceof oe40) {
            vbj vbjVar3 = ((oe40) ef40Var).f25107a;
            if (vbjVar3 instanceof pbj) {
                return kotlin.collections.a.c(new gf40(mzh.f22655a));
            }
            if (!(vbjVar3 instanceof qbj)) {
                return iun.f15405a;
            }
            ozh ozhVarM = fxb.M((d3j) ((qbj) vbjVar3).f28448a, ctf0Var);
            return (ozhVarM == null || (listC = kotlin.collections.a.c(new gf40(ozhVarM))) == null) ? iun.f15405a : listC;
        }
        if (ef40Var instanceof qe40) {
            return w0((qe40) ef40Var, list, ctf0Var, z2, z, a550Var.d);
        }
        boolean z4 = ef40Var instanceof ye40;
        gkl gklVar = gkl.f11450a;
        if (z4) {
            vbj vbjVar4 = ((ye40) ef40Var).f42470a;
            if (vbjVar4 instanceof pbj) {
                return kotlin.collections.a.c(new ff40(gklVar));
            }
            if (!(vbjVar4 instanceof qbj)) {
                return iun.f15405a;
            }
            pz40 pz40Var = s6t0.f31722a;
            long j = hi0.T;
            StringBuilder sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", "https://", false)) {
                sb2.setLength(0);
                sb2.append("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp");
            } else {
                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", '/'));
            }
            n0x n0xVar2 = new n0x(sb2.toString());
            String strA = ctf0Var.b.a(R.string.my_aggregator_bonus_banner_label, Arrays.copyOf(new Object[0], 0));
            BonusInfoModel bonusInfoModel = (BonusInfoModel) ((qbj) vbjVar4).f28448a;
            return kotlin.collections.a.c(new ff40(new fkl(j, n0xVar2, strA, bonusInfoModel.b, bonusInfoModel.c, null, Response.UNSUPPORTED_URI_SCHEME)));
        }
        if (ef40Var instanceof ze40) {
            vbj vbjVar5 = ((ze40) ef40Var).f44236a;
            boolean z5 = vbjVar5 instanceof pbj;
            iqv iqvVar = iqv.f15228a;
            if (z5) {
                jf40 jf40Var = new jf40(iqvVar, new ijm());
                lc00 lc00VarB3 = kotlin.collections.a.b();
                for (int i6 = 0; i6 < 13; i6++) {
                    lc00VarB3.add(fzh.f10407a);
                }
                return q3d.j(jf40Var, new qf40(dyb.r0(kotlin.collections.a.a(lc00VarB3))));
            }
            if (!(vbjVar5 instanceof qbj)) {
                return iun.f15405a;
            }
            jf40 jf40Var2 = new jf40(iqvVar, new hjm(ctf0Var.b.a(R.string.aggregator_top_games_header, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
            Iterable<mlr> iterable2 = (Iterable) ((qbj) vbjVar5).f28448a;
            ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
            for (mlr mlrVar : iterable2) {
                long j2 = mlrVar.f22006a;
                String str4 = mlrVar.e;
                StringBuilder sb3 = new StringBuilder(ujn.h);
                String str5 = mlrVar.h;
                str5.getClass();
                if (str5.length() == 0) {
                    sb3.setLength(0);
                } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                    sb3.setLength(0);
                    sb3.append(str5);
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    char[] cArr = new char[i4];
                    cArr[0] = '/';
                    sb3.append(StringsKt.y0(str5, cArr));
                }
                arrayList2.add(new ezh(j2, str4, new n0x(sb3.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6)));
                i4 = i4;
            }
            qf40 qf40Var = new qf40(dyb.r0(arrayList2));
            tf40[] tf40VarArr = new tf40[2];
            tf40VarArr[0] = jf40Var2;
            tf40VarArr[i4] = qf40Var;
            return q3d.j(tf40VarArr);
        }
        int i7 = 1;
        if (ef40Var instanceof re40) {
            vbj vbjVar6 = ((re40) ef40Var).f30317a;
            if (vbjVar6 instanceof pbj) {
                return kotlin.collections.a.c(new if40(rzh.f31360a));
            }
            if (!(vbjVar6 instanceof qbj)) {
                return iun.f15405a;
            }
            int i8 = z ? R.string.aggregator_spinner_auth_subtitle : R.string.aggregator_spinner_subtitle;
            lsm0 lsm0Var3 = ctf0Var.b;
            String strA2 = lsm0Var3.a(i8, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var3.a(R.string.aggregator_spinner_title, Arrays.copyOf(new Object[0], 0));
            if (ctf0Var.j()) {
                strA2 = kotlin.text.c.r(strA2, Separators.RETURN, Separators.SP, false);
            }
            String strA4 = lsm0Var3.a(R.string.app_win_rotate_text, Arrays.copyOf(new Object[0], 0));
            Iterable<mlr> iterable3 = (Iterable) ((qbj) vbjVar6).f28448a;
            ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
            for (mlr mlrVar2 : iterable3) {
                long j3 = mlrVar2.f22006a;
                String str6 = mlrVar2.e;
                char c8 = c7;
                StringBuilder sb4 = new StringBuilder(ujn.h);
                String str7 = mlrVar2.h;
                str7.getClass();
                if (str7.length() == 0) {
                    qtm0.e(sb4);
                    c5 = c6;
                } else if (StringsKt.O(str7, ujn.h, false) || kotlin.text.c.x(str7, "https://", false)) {
                    c5 = c6;
                    qtm0.e(sb4);
                    sb4.append(str7);
                } else {
                    if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                        sb4.append(c6);
                    }
                    c5 = c6;
                    char[] cArr2 = new char[i7];
                    cArr2[c8] = c5;
                    sb4.append(StringsKt.y0(str7, cArr2));
                }
                arrayList3.add(new ezh(j3, str6, new n0x(sb4.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6)));
                c7 = c8;
                c6 = c5;
                i7 = 1;
            }
            return kotlin.collections.a.c(new if40(new qzh(strA3, strA2, strA4, dyb.r0(arrayList3))));
        }
        if (ef40Var instanceof af40) {
            vbj vbjVar7 = ((af40) ef40Var).f760a;
            boolean z6 = vbjVar7 instanceof pbj;
            jqv jqvVar = jqv.f16974a;
            if (z6) {
                return q3d.j(new jf40(jqvVar, new ijm()), new rf40(g0i.f10460a));
            }
            if (!(vbjVar7 instanceof qbj)) {
                return iun.f15405a;
            }
            Object obj = ((qbj) vbjVar7).f28448a;
            List list3 = (List) obj;
            myr0 myr0Var = (myr0) CollectionsKt.firstOrNull(list3);
            if (myr0Var != null) {
                jf40 jf40Var3 = new jf40(jqvVar, new hjm(ctf0Var.k(R.string.aggregator_tournament_month_header, new Object[0]), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var.k(R.string.all, new Object[0])), null, 7166));
                long j4 = myr0Var.f22617a;
                String strD0 = d0(myr0Var);
                String strC0 = c0(myr0Var);
                StringBuilder sb5 = new StringBuilder(ujn.h);
                String str8 = myr0Var.e.b;
                if (str8 == null) {
                    str8 = "";
                }
                if (str8.length() == 0) {
                    qtm0.e(sb5);
                } else if (StringsKt.O(str8, ujn.h, false) || kotlin.text.c.x(str8, "https://", false)) {
                    qtm0.e(sb5);
                    sb5.append(str8);
                } else {
                    if (sb5.length() > 0 && !StringsKt.S(sb5, Separators.SLASH)) {
                        sb5.append('/');
                    }
                    sb5.append(StringsKt.y0(str8, '/'));
                }
                i0i i0iVar2 = new i0i(j4, strD0, strC0, new n0x(sb5.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6));
                List listD0 = CollectionsKt.D0((Iterable) obj, 2);
                ListIterator listIterator = listD0.listIterator(listD0.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (list3.size() < 2);
                myr0 myr0Var2 = (myr0) objPrevious;
                if (myr0Var2 != null) {
                    long j5 = myr0Var2.f22617a;
                    String strD1 = d0(myr0Var2);
                    String strC1 = c0(myr0Var2);
                    StringBuilder sb6 = new StringBuilder(ujn.h);
                    String str9 = myr0Var2.e.b;
                    String str10 = str9 != null ? str9 : "";
                    if (str10.length() == 0) {
                        qtm0.e(sb6);
                    } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                        qtm0.e(sb6);
                        sb6.append(str10);
                    } else {
                        if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                            c4 = '/';
                        } else {
                            c4 = '/';
                            sb6.append('/');
                        }
                        sb6.append(StringsKt.y0(str10, c4));
                    }
                    i0iVar = new i0i(j5, strD1, strC1, new n0x(sb6.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6));
                } else {
                    i0iVar = null;
                }
                List listJ = q3d.j(jf40Var3, new rf40(new f0i(i0iVar2, i0iVar)));
                if (listJ != null) {
                    return listJ;
                }
            }
            return iun.f15405a;
        }
        if (!(ef40Var instanceof te40)) {
            if (!(ef40Var instanceof we40)) {
                if (ef40Var instanceof cf40) {
                    ypl yplVar = a550Var.c;
                    vbj vbjVar8 = ((cf40) ef40Var).f4241a;
                    if (vbjVar8 instanceof pbj) {
                        return kotlin.collections.a.c(new sf40(yplVar, aql.f1301a));
                    }
                    if (!(vbjVar8 instanceof qbj)) {
                        return iun.f15405a;
                    }
                    String strK = ctf0Var.k(R.string.tournaments, new Object[0]);
                    String strK2 = ctf0Var.k(R.string.all, new Object[0]);
                    Iterable<myr0> iterable4 = (Iterable) ((qbj) vbjVar8).f28448a;
                    ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                    for (myr0 myr0Var3 : iterable4) {
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        arrayList4.add(d5c.V(myr0Var3, yplVar, ctf0Var, locale));
                    }
                    return kotlin.collections.a.c(new sf40(yplVar, new zpl(dyb.r0(arrayList4), strK, strK2)));
                }
                if (!(ef40Var instanceof se40)) {
                    if (ef40Var instanceof bf40) {
                        return iun.f15405a;
                    }
                    t9f.b();
                    return null;
                }
                vbj vbjVar9 = ((se40) ef40Var).f32060a;
                if (vbjVar9 instanceof pbj) {
                    return kotlin.collections.a.c(new kf40(gklVar));
                }
                if (!(vbjVar9 instanceof qbj)) {
                    return iun.f15405a;
                }
                StringBuilder sb7 = new StringBuilder(ujn.h);
                if (StringsKt.O("/static/img/android/casino/jackpot/jackpot_banner.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/jackpot/jackpot_banner.webp", "https://", false)) {
                    qtm0.e(sb7);
                    sb7.append("/static/img/android/casino/jackpot/jackpot_banner.webp");
                } else {
                    if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                        c = '/';
                    } else {
                        c = '/';
                        sb7.append('/');
                    }
                    sb7.append(StringsKt.y0("/static/img/android/casino/jackpot/jackpot_banner.webp", c));
                }
                n0x n0xVar3 = new n0x(sb7.toString());
                String str11 = ((g8y) ((qbj) vbjVar9).f28448a).f10886a;
                String strK3 = ctf0Var.k(R.string.JACKPOT, new Object[0]);
                ekl eklVar = ekl.f7957a;
                pz40 pz40Var2 = s6t0.f31722a;
                return kotlin.collections.a.c(new kf40(new fkl(hi0.h, n0xVar3, null, str11, strK3, dyb.g0(dkl.b, dkl.f6236a, dkl.c), 128)));
            }
            vbj vbjVar10 = ((we40) ef40Var).f39002a;
            if (vbjVar10 instanceof pbj) {
                lc00 lc00VarB4 = kotlin.collections.a.b();
                for (int i9 = 0; i9 < 3; i9++) {
                    lc00VarB4.add(z7c0.f43912a);
                }
                return kotlin.collections.a.c(new nf40(dyb.o0(kotlin.collections.a.a(lc00VarB4))));
            }
            if (!(vbjVar10 instanceof qbj)) {
                if (vbjVar10 instanceof sbj) {
                    lc00 lc00VarB5 = kotlin.collections.a.b();
                    if (z3) {
                        lc00VarB5.add(new v7c0(R.drawable.ic_glyph_bonus, "BONUSES", ctf0Var.k(R.string.bonuses, new Object[0])));
                        lc00VarB5.add(new v7c0(R.drawable.ic_glyph_promocode_active, "PROMO_CODE", ctf0Var.k(R.string.promocode, new Object[0])));
                    }
                    return kotlin.collections.a.c(new nf40(dyb.o0(kotlin.collections.a.a(lc00VarB5))));
                }
                if (!(vbjVar10 instanceof obj)) {
                    return iun.f15405a;
                }
                lc00 lc00VarB6 = kotlin.collections.a.b();
                lc00VarB6.add(new x7c0(ctf0Var.k(R.string.cashback, new Object[0])));
                if (z3) {
                    lc00VarB6.add(new v7c0(R.drawable.ic_glyph_bonus, "BONUSES", ctf0Var.k(R.string.bonuses, new Object[0])));
                    lc00VarB6.add(new v7c0(R.drawable.ic_glyph_promocode_active, "PROMO_CODE", ctf0Var.k(R.string.promocode, new Object[0])));
                }
                return kotlin.collections.a.c(new nf40(dyb.o0(kotlin.collections.a.a(lc00VarB6))));
            }
            lc00 lc00VarB7 = kotlin.collections.a.b();
            sh10 sh10Var = (sh10) ((qbj) vbjVar10).f28448a;
            sh10Var.getClass();
            boolean z7 = sh10Var.f32188a;
            wi10 wi10Var = sh10Var.b;
            if (z7) {
                i = 0;
                x7c0Var = new y7c0(ctf0Var.k(R.string.cashback, new Object[0]));
            } else {
                vi10 vi10Var = wi10Var.d;
                long j6 = wi10Var.c;
                if (vi10Var == vi10.AWAITING) {
                    String strK4 = ctf0Var.k(R.string.cashback, new Object[0]);
                    Date date = new Date(j6 + 999);
                    String strK5 = ctf0Var.k(R.string.day_short, new Object[0]);
                    long jW0 = ibc.w0(j6 - System.currentTimeMillis(), bfn.MILLISECONDS);
                    uen uenVar = wen.b;
                    long jL = wen.l(jW0, bfn.HOURS);
                    yni0 yni0Var = new yni0();
                    if (jL >= 12) {
                        yni0Var.add(rol.f30844a);
                    }
                    yni0Var.add(rol.b);
                    yni0Var.add(rol.c);
                    yni0Var.add(rol.d);
                    x7c0Var = new a8c0(strK4, date, strK5, dyb.t0(cui0.a(yni0Var)));
                } else if (vi10Var == vi10.AVAILABLE) {
                    String strK6 = ctf0Var.k(R.string.cashback, new Object[0]);
                    pn40 pn40Var = pn40.f27267a;
                    double d = wi10Var.f;
                    p3u0 p3u0Var = p3u0.c;
                    x7c0Var = new w7c0(strK6, kng0.l(pn40.l(d), Separators.SP, wi10Var.g.b));
                } else {
                    i = 0;
                    x7c0Var = new x7c0(ctf0Var.k(R.string.cashback, new Object[0]));
                }
                i = 0;
            }
            lc00VarB7.add(x7c0Var);
            if (z3) {
                lc00VarB7.add(new v7c0(R.drawable.ic_glyph_bonus, "BONUSES", ctf0Var.k(R.string.bonuses, new Object[i])));
                lc00VarB7.add(new v7c0(R.drawable.ic_glyph_promocode_active, "PROMO_CODE", ctf0Var.k(R.string.promocode, new Object[i])));
            }
            return kotlin.collections.a.c(new nf40(dyb.o0(kotlin.collections.a.a(lc00VarB7))));
        }
        te40 te40Var = (te40) ef40Var;
        cj10 cj10Var = te40Var.f33801a;
        vbj vbjVar11 = te40Var.b;
        if (!(cj10Var instanceof bj10)) {
            if (!(cj10Var instanceof aj10)) {
                t9f.b();
                return null;
            }
            if (vbjVar11 instanceof pbj) {
                return kotlin.collections.a.c(new lf40(uf10.f35558a));
            }
            if (!(vbjVar11 instanceof qbj)) {
                return iun.f15405a;
            }
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setGroupingSeparator((char) 160);
            DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
            zh10 zh10Var = (zh10) ((qbj) vbjVar11).f28448a;
            yh10 yh10Var = zh10Var.b;
            li10 li10Var = yh10Var.b.g;
            wi10 wi10Var2 = yh10Var.c;
            if (li10Var instanceof ji10) {
                i2 = wi10Var2.b;
            } else {
                if (!(li10Var instanceof ki10)) {
                    t9f.b();
                    return null;
                }
                i2 = ((ki10) li10Var).f18315a;
            }
            int i10 = i2;
            int iU0 = u0(li10Var);
            String str12 = zh10Var.b.b.c;
            String strK7 = ctf0Var.k(R.string.vip_cashback_status_description, new Object[0]);
            ei10 ei10Var = zh10Var.b.b;
            String str13 = ei10Var.b;
            if (str13.length() > 0) {
                StringBuilder sb8 = new StringBuilder(ujn.h);
                if (str13.length() == 0) {
                    qtm0.e(sb8);
                } else if (StringsKt.O(str13, ujn.h, false) || kotlin.text.c.x(str13, "https://", false)) {
                    qtm0.e(sb8);
                    sb8.append(str13);
                } else {
                    if (sb8.length() <= 0 || StringsKt.S(sb8, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb8.append('/');
                    }
                    sb8.append(StringsKt.y0(str13, c2));
                }
                m0xVar = new n0x(sb8.toString());
            } else {
                int i11 = ei10Var.f7836a;
                if (i11 == 1) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_copper, null, 6);
                } else if (i11 == 2) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_bronze, null, 6);
                } else if (i11 == 3) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_silver, null, 6);
                } else if (i11 == 4) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_gold, null, 6);
                } else if (i11 == 5) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_ruby, null, 6);
                } else if (i11 == 6) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_sapfir, null, 6);
                } else if (i11 == 7) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_brilliant, null, 6);
                } else {
                    m0xVar = i11 == 8 ? new m0x(R.drawable.ic_glyph_color_status_vip, null, 6) : new m0x(R.drawable.ic_glyph_color_status_unknown, null, 6);
                }
            }
            return kotlin.collections.a.c(new lf40(new tf10(str12, strK7, m0xVar, ohs0.n(zh10Var.b.b.h, " %"), decimalFormat.format(Integer.valueOf(i10)).toString(), kng0.k("/ ", decimalFormat.format(Integer.valueOf(iU0))), i10, iU0)));
        }
        if (vbjVar11 instanceof pbj) {
            return kotlin.collections.a.c(new mf40(zzh.f45253a));
        }
        if (vbjVar11 instanceof obj) {
            String strK8 = ctf0Var.k(R.string.loyalty_program_welcome_title_v2, str);
            String strK9 = ctf0Var.k(R.string.cashback_card_status_unknown, new Object[0]);
            String strK10 = ctf0Var.k(R.string.loyalty_program_widget_level_subtitle, new Object[0]);
            String strK11 = ctf0Var.k(R.string.loyalty_info_error, new Object[0]);
            String strK12 = ctf0Var.k(R.string.loyalty_cashback_claim_button_text, new Object[0]);
            pz40 pz40Var3 = s6t0.f31722a;
            return kotlin.collections.a.c(new mf40(new yzh(strK8, strK9, strK10, strK11, strK12, dyb.g0(new y3d(s6t0.b().f33626a.getPromoCardGradientStart()), new y3d(s6t0.b().f33626a.getPromoCardGradientEnd())))));
        }
        if (!(vbjVar11 instanceof qbj)) {
            return iun.f15405a;
        }
        zh10 zh10Var2 = (zh10) ((qbj) vbjVar11).f28448a;
        String strK13 = ctf0Var.k(R.string.loyalty_program_welcome_title_v2, zh10Var2.f44370a);
        String strK14 = zh10Var2.b.b.c;
        if (strK14.length() == 0) {
            i3 = 0;
            strK14 = ctf0Var.k(R.string.cashback_card_status_unknown, new Object[0]);
        } else {
            i3 = 0;
        }
        String str14 = strK14;
        String strK15 = ctf0Var.k(R.string.loyalty_program_widget_level_subtitle, new Object[i3]);
        ei10 ei10Var2 = zh10Var2.b.b;
        String str15 = ei10Var2.b;
        if (str15.length() > 0) {
            str2 = str15;
        } else {
            int i12 = ei10Var2.f7836a;
            if (i12 == 1) {
                str2 = "/static/img/android/casino/vip_cashback/Copper.webp";
            } else if (i12 == 2) {
                str2 = "/static/img/android/casino/vip_cashback/Bronze.webp";
            } else if (i12 == 3) {
                str2 = "/static/img/android/casino/vip_cashback/Silver.webp";
            } else if (i12 == 4) {
                str2 = "/static/img/android/casino/vip_cashback/Gold.webp";
            } else if (i12 == 5) {
                str2 = "/static/img/android/casino/vip_cashback/Ruby.webp";
            } else if (i12 == 6) {
                str2 = "/static/img/android/casino/vip_cashback/Sapphire.webp";
            } else if (i12 == 7) {
                str2 = "/static/img/android/casino/vip_cashback/Brilliant.webp";
            } else {
                str2 = i12 == 8 ? "/static/img/android/casino/vip_cashback/Vip.webp" : null;
            }
        }
        if (str2 != null) {
            StringBuilder sb9 = new StringBuilder(ujn.h);
            if (str2.length() == 0) {
                qtm0.e(sb9);
            } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                qtm0.e(sb9);
                sb9.append(str2);
            } else {
                if (sb9.length() <= 0 || StringsKt.S(sb9, Separators.SLASH)) {
                    c3 = '/';
                } else {
                    c3 = '/';
                    sb9.append('/');
                }
                sb9.append(StringsKt.y0(str2, c3));
            }
            n0xVar = new n0x(sb9.toString());
        } else {
            n0xVar = null;
        }
        String strK16 = ctf0Var.k(R.string.loyalty_cashback_percent_v2, zh10Var2.b.b.h);
        String strK17 = ctf0Var.k(R.string.loyalty_cashback_coeff_v2, Integer.valueOf(zh10Var2.b.b.e));
        String strK18 = ctf0Var.k(R.string.loyalty_cashback_experience_v2, a0(zh10Var2.b.c.b));
        String strK19 = kng0.k("/ ", a0(u0(zh10Var2.b.b.g)));
        yh10 yh10Var2 = zh10Var2.b;
        int i13 = yh10Var2.c.b;
        int iU1 = u0(yh10Var2.b.g);
        String strK20 = ctf0Var.k(R.string.loyalty_cashback_claim_button_text, new Object[0]);
        boolean z8 = zh10Var2.b.b.g instanceof ki10;
        String strK21 = ctf0Var.k(R.string.loyalty_max_level_description, new Object[0]);
        pz40 pz40Var4 = s6t0.f31722a;
        return kotlin.collections.a.c(new mf40(new xzh(strK13, str14, strK15, n0xVar, strK16, strK17, strK18, strK19, i13, iU1, strK20, z8, strK21, dyb.g0(new y3d(s6t0.b().f33626a.getPromoCardGradientStart()), new y3d(s6t0.b().f33626a.getPromoCardGradientEnd())))));
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var, Function1 function1, boolean z, boolean z2) {
        int i2;
        fet fetVar2;
        mm40 mm40Var2;
        boolean z3;
        boolean z4;
        fetVar.g0(1849291224);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        tc00 tc00Var = tc00.f33696a;
        if (i3 == 0) {
            i2 |= fetVar.g(tc00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z5 = (57344 & i2) == 16384;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new elk0(function1, (byte) 10);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            z4 = z2;
            f7k.k(mm40Var, tc00Var, z, z4, (Function1) objP, fetVar2, i2 & 8190, 0);
            mm40Var2 = mm40Var;
            z3 = z;
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            z3 = z;
            z4 = z2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ng(mm40Var2, z3, z4, function1, i);
        }
    }

    public static final w56 y0(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        w56 r56Var;
        f2i f2iVar;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        y78Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        r0n r0nVar = o0n.f24435a;
        q0n q0nVar = q0n.f27908a;
        if (iOrdinal == 0) {
            r56Var = new r56(d0tVar.f5282a, w7n0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new w76(new uws0(0, null, qzb.c0(d0tVar)), new uws0(0, null, qzb.r0(d0tVar)), kpb.S(d0tVar), y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString(), kpb.e0(d0tVar) ? q0nVar : r0nVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            r56Var = new v56(d0tVar.f5282a, w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new c96(new vws0(qzb.c0(d0tVar), 0, "", kpb.E(d0tVar), kpb.R(d0tVar).f33307a, rqsVar.t, false, rqsVar.r), new vws0(qzb.r0(d0tVar), 0, "", kpb.V(d0tVar), kpb.R(d0tVar).b, rqsVar.u, false, rqsVar.s), y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString(), String.valueOf(rqsVar.b), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), qem.f28591a, uem.f35536a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 2) {
            long j = d0tVar.f5282a;
            k4i k4iVarT = w7n0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            boolean zA0 = kpb.a0(d0tVar, z, z2);
            boolean zF0 = kpb.f0(d0tVar, z);
            wws0 wws0Var = new wws0(qzb.c0(d0tVar), null, 0, "", "", kpb.R(d0tVar).f33307a, rqsVar.t, false, false);
            wws0 wws0Var2 = new wws0(qzb.r0(d0tVar), null, 0, "", "", kpb.R(d0tVar).b, rqsVar.u, false, false);
            String string = y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString();
            if (zA0) {
                f2iVar = c2i.f3624a;
            } else {
                f2iVar = zF0 ? e2i.f7087a : null;
            }
            String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (kpb.e0(d0tVar)) {
                r0nVar = q0nVar;
            }
            r56Var = new u56(j, k4iVarT, new u86(wws0Var, wws0Var2, f2iVar, strA, string, r0nVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 3) {
            long j2 = d0tVar.f5282a;
            n0x n0xVar = new n0x(dtb.F(str));
            String string2 = y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString();
            boolean zE0 = kpb.e0(d0tVar);
            lsm0 lsm0Var = ctf0Var.b;
            l4i l4iVarS = w7n0.s(null, d0tVar, str, string2, lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, zE0, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            czm czmVar = new czm(qzb.c0(d0tVar), null, null);
            czm czmVar2 = new czm(qzb.r0(d0tVar), null, null);
            tym tymVar = new tym(lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u);
            p6x p6xVar = p6x.f26478a;
            r56Var = new t56(j2, l4iVarS, new m86(czmVar, czmVar2, tymVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            long j3 = d0tVar.f5282a;
            k4i k4iVarR = w7n0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            czm czmVar3 = new czm(qzb.c0(d0tVar), null, null);
            czm czmVar4 = new czm(qzb.r0(d0tVar), null, null);
            lsm0 lsm0Var2 = ctf0Var.b;
            tym tymVar2 = new tym(lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u);
            p6x p6xVar2 = p6x.f26478a;
            r56Var = new s56(j3, k4iVarR, new e86(czmVar3, czmVar4, tymVar2, new sym(lsm0Var2.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString(), kpb.e0(d0tVar) ? fzm.f10414a : dzm.f6947a)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1592141023);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 172.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 8);
        }
    }

    public static final String z0(int i, String str) {
        String strW = W(str);
        return (1 > i || i >= strW.length()) ? strW : ttm0.M(i, strW);
    }
}
