package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.DragEvent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xbc {
    public static final void A(int i, fet fetVar) {
        fetVar.g0(-1590152586);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            s(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            s(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            s(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            s(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            s(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            s(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6o(i, (byte) 14);
        }
    }

    public static final void B(mm40 mm40Var, sql sqlVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(324881377);
        int i2 = i | 6 | (fetVar2.g(sqlVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n), 12.0f, 8.0f, 12.0f, 10.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str = sqlVar.c;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.r, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110576);
            String str2 = sqlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qql(mm40Var2, sqlVar, i, (byte) 0);
        }
    }

    public static final void C(vvo vvoVar, fet fetVar, int i) {
        fetVar.g0(439080040);
        int i2 = (fetVar.i(vvoVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar2, zclVar2, jm40.b);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            u(vvoVar.f38110a, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5o(vvoVar, i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void D(mm40 mm40Var, jxm jxmVar, boolean z, xcz xczVar, bch0 bch0Var, fet fetVar, int i) {
        xcz xczVar2;
        mm40 mm40Var2;
        fet fetVar2;
        boolean z2;
        float f;
        ?? r1;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        fet fetVar3 = fetVar;
        String str = jxmVar.b;
        a4x a4xVar = jxmVar.c;
        fetVar3.g0(2093215610);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(jxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(xczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar3.g(bch0Var) : fetVar3.i(bch0Var) ? 16384 : 8192;
        }
        if (fetVar3.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar7);
            jpm0.n(fetVar3);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar8);
            E(0, fetVar3, new x7z(1.0f, true), jxmVar.f17313a);
            if (str.length() > 0) {
                fetVar3.e0(2010654829);
                shdVar2 = shdVar8;
                f = 4.0f;
                z2 = false;
                shdVar = shdVar6;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                r1 = 1;
                v8q0.a(str, s5x0.L(jm40Var, 4.0f, 0.0f, 2), ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                z2 = false;
                f = 4.0f;
                r1 = 1;
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                fetVar3.e0(2010909804);
                fetVar3.r(false);
            }
            jcb.H(s5x0.N(ffb0.R(jm40Var, 0.0f, z ? 6.0f : -6.0f, r1), 0.0f, z ? 0.0f : f, 0.0f, z ? f : 0.0f, 5), 1.0f, ((ThemeColors) fetVar3.k(zaq0.b)).getSeparator60(), fetVar3, 0, 0);
            fet fetVar4 = fetVar3;
            ma80 ma80Var = ma80.b;
            sjj sjjVarA = wzk0.a(fetVar4);
            boolean zG = fetVar4.g(sjjVarA);
            Object objP = fetVar4.P();
            if (zG || objP == ukd.f35823a) {
                objP = new iuj(sjjVarA);
                fetVar4.o0(objP);
            }
            mm40 mm40VarA = fbh0.a(jm40Var, bch0Var, ma80Var, false, (iuj) objP, 44);
            zx7 zx7Var = gqw0.d;
            tj30 tj30VarC = zq8.c(zx7Var, z2);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar4);
            jpm0.o(fetVar4, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar2);
            xczVar2 = xczVar;
            F(null, a4xVar, xczVar2, fetVar4, (i2 >> 3) & 896);
            int size = a4xVar.size();
            jr8 jr8Var = jr8.f16991a;
            if (size > 3) {
                fetVar4.e0(1056247529);
                qcc.q(jr8Var.b(jm40Var, zx7Var), xczVar2, fetVar4, (i2 >> 6) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(1056409938);
                fetVar4.r(z2);
            }
            if (a4xVar.size() > 3) {
                fetVar4.e0(1056485485);
                qcc.p(jr8Var.b(jm40Var, gqw0.f), xczVar2, fetVar4, (i2 >> 6) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(1056644050);
                fetVar4.r(z2);
            }
            fetVar4.r(r1);
            fetVar4.r(r1);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            xczVar2 = xczVar;
            fet fetVar5 = fetVar3;
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var2, (Object) jxmVar, z, (Object) xczVar2, (Object) bch0Var, i, (byte) 11);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1280121878);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 15);
        }
    }

    public static final void F(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1088889232);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 128.0f, 1);
            yx7 yx7Var = gqw0.k;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 8);
                fetVar.o0(objP);
            }
            int i3 = ((i2 >> 3) & 112) | 12779520;
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarU, xczVar, null, false, null, yx7Var, null, false, null, (Function1) objP, fetVar, i3, 348);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i, (byte) 2);
        }
    }

    public static final void G(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1958048984);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 3) & 14, 24576, 114682);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 16);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var, boolean z) {
        int i2;
        fetVar.g0(1785780768);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), 100.0f + (z ? 38.0f : 0.0f));
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.b, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p9d(mm40Var, z, i);
        }
    }

    public static int I(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static final void J(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((oth) yfu0Var).f.setText(((ddh) cpVar.u()).c.b);
        List list = u0d.f34849a;
        u0d.n(((oth) yfu0Var).c, ((ddh) cpVar.u()).c.f35428a, R.drawable.icon_globe_new, 3);
    }

    public static final void K(cp cpVar) {
        List list = u0d.f34849a;
        u0d.j(((oth) cpVar.u).b, ((ddh) cpVar.u()).e.f38924a, 0, 0, null, null, null, 510);
    }

    public static final void L(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((oth) yfu0Var).h.setText(((ddh) cpVar.u()).i.f40645a);
        ((oth) yfu0Var).d.setVisibility(((ddh) cpVar.u()).i.b ? 0 : 8);
    }

    public static final void M(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((oth) yfu0Var).g.setVisibility(((ddh) cpVar.u()).k ? 0 : 8);
        ((oth) yfu0Var).k.setVisibility(((ddh) cpVar.u()).k ? 0 : 8);
    }

    public static final void N(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((oth) yfu0Var).j.setText(((ddh) cpVar.u()).d.b);
        List list = u0d.f34849a;
        u0d.n(((oth) yfu0Var).e, ((ddh) cpVar.u()).d.f678a, R.drawable.icon_globe_new, 3);
    }

    public static final String O(String str, String str2, String str3, boolean z, String str4) {
        str.getClass();
        str2.getClass();
        String strK = mym0.k(str, str3, z);
        String strK2 = mym0.k(str2, str4, z);
        StringBuilder sb = new StringBuilder(strK);
        if (strK2.length() > 0) {
            sb.append(" - ");
            sb.append(strK2);
        }
        return sb.toString();
    }

    public static final gsk P(n2o n2oVar, v5l0 v5l0Var, j0g0 j0g0Var, g2v g2vVar, DisciplineDetailsParams disciplineDetailsParams, boolean z, Function0 function0) {
        lc00 lc00VarA;
        l0l0 l0l0Var;
        long j;
        CyberGamesPage cyberGamesPage;
        Object gskVar;
        g2v g2vVar2 = g2vVar;
        long j2 = disciplineDetailsParams.f46554a;
        CyberGamesPage cyberGamesPage2 = disciplineDetailsParams.b;
        n2oVar.getClass();
        v5l0Var.getClass();
        g2vVar2.getClass();
        jpk jpkVar = jpk.f16906a;
        if (j0g0Var != null) {
            Object g0g0Var = j0g0Var.f15681a;
            if (g0g0Var instanceof g0g0) {
                j = j2;
                cyberGamesPage = cyberGamesPage2;
            } else {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    if (hic.s((kuk) g0g0Var, cyberGamesPage2, n2oVar)) {
                        gskVar = R(g2vVar2, j2, cyberGamesPage2);
                    } else {
                        a4x a4xVar = (a4x) function0.invoke();
                        if (S(a4xVar, n2oVar).isEmpty()) {
                            Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(j2, cyberGamesPage2);
                            j = j2;
                            cyberGamesPage = cyberGamesPage2;
                            try {
                                g2vVar2 = g2vVar;
                                try {
                                    gskVar = new gsk(new kpk(g2v.b(g2vVar, ozb.N(((Number) pairC.f46059a).longValue(), ((Number) pairC.b).longValue()), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
                                } catch (Throwable th) {
                                    th = th;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    g0g0Var = new g0g0(th);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                g2vVar2 = g2vVar;
                            }
                        } else {
                            gskVar = new gsk(jpkVar, a4xVar, false);
                        }
                        g0g0Var = gskVar;
                    }
                    j = j2;
                    cyberGamesPage = cyberGamesPage2;
                    g0g0Var = gskVar;
                } catch (Throwable th3) {
                    th = th3;
                    j = j2;
                    cyberGamesPage = cyberGamesPage2;
                }
            }
            if (j0g0.a(g0g0Var) != null) {
                g0g0Var = R(g2vVar2, j, cyberGamesPage);
            }
            return (gsk) g0g0Var;
        }
        int iOrdinal = n2oVar.ordinal();
        h9m h9mVar = h9m.f12684a;
        if (iOrdinal != 0) {
            w7m w7mVar = w7m.f38680a;
            if (iOrdinal == 1) {
                cyberGamesPage2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
                boolean zEquals = cyberGamesPage2.equals(real);
                l3g l3gVar = l3g.f19357a;
                if (zEquals) {
                    lc00VarB.add(new dqk("shimmer_active_teams", h9mVar, l3gVar));
                }
                lc00VarB.add(pqk.a(v5l0Var, true));
                lc00VarB.add(new uqk("shimmer_tournament_events", cyberGamesPage2, anh.f1152a, l3gVar));
                if (cyberGamesPage2.equals(real)) {
                    lc00VarB.add(pqk.a(v5l0Var, false));
                }
                if (cyberGamesPage2.equals(real)) {
                    p8m p8mVar = p8m.f26562a;
                    lc00VarB.add(new fsk("shimmer_leader_board", w7mVar, dyb.g0(p8mVar, p8mVar, p8mVar, p8mVar, p8mVar), l3gVar));
                }
                if (cyberGamesPage2.equals(real)) {
                    wnh wnhVar = wnh.f39448a;
                    lc00VarB.add(new ssk("shimmer_transfers", w7mVar, dyb.g0(wnhVar, wnhVar, wnhVar), l3gVar));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB);
            } else if (iOrdinal == 2) {
                cyberGamesPage2.getClass();
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.add(new fok("shimmer_discipline_block"));
                q0s q0sVar = q0s.f27918a;
                int iOrdinal2 = v5l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    l0l0Var = g0l0.f10465a;
                } else if (iOrdinal2 == 1) {
                    l0l0Var = k0l0.f17474a;
                } else if (iOrdinal2 == 2) {
                    l0l0Var = j0l0.f15687a;
                } else if (iOrdinal2 == 3) {
                    l0l0Var = i0l0.f13953a;
                } else {
                    if (iOrdinal2 != 4) {
                        t9f.b();
                        return null;
                    }
                    l0l0Var = h0l0.f12241a;
                }
                lc00VarB2.add(new yqv("shimmer_all_events", new esv("", w7mVar, lak0.c), dyb.g0(new vqv("shimmer_item_events", arv.f1363a, new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var), new x56(l0l0Var)), false, true), -1L)), sip.c));
                lc00VarB2.add(new hrv("shimmer_tournaments", cyberGamesPage2, w7mVar, xmh.f41123a));
                if (cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                    lc00VarB2.add(new crv("shimmer_active_teams", w7mVar, xx80.f41645a));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB2);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                cyberGamesPage2.getClass();
                lc00 lc00VarB3 = kotlin.collections.a.b();
                lc00VarB3.add(new prk("shimmer_chips_block", zna.f44666a));
                lc00VarB3.add(wrk.a(v5l0Var, cyberGamesPage2, true));
                CyberGamesPage.Real real2 = CyberGamesPage.Real.INSTANCE;
                if (cyberGamesPage2.equals(real2)) {
                    lc00VarB3.add(wrk.a(v5l0Var, cyberGamesPage2, false));
                }
                lc00VarB3.add(new rrk("shimmer_tournaments", cyberGamesPage2, w7mVar, dnh.f6368a));
                if (cyberGamesPage2.equals(real2)) {
                    lc00VarB3.add(new ork("shimmer_active_teams", w7mVar, e9m.f7429a));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB3);
            }
        } else {
            cyberGamesPage2.getClass();
            lc00 lc00VarB4 = kotlin.collections.a.b();
            lc00VarB4.add(new nuj("shimmer_header_1", new ijm()));
            lc00VarB4.add(wpk.a("shimmer_games_1", v5l0Var, cyberGamesPage2));
            CyberGamesPage.Real real3 = CyberGamesPage.Real.INSTANCE;
            if (cyberGamesPage2.equals(real3)) {
                lc00VarB4.add(new nuj("shimmer_header_2", new ijm()));
                lc00VarB4.add(wpk.a("shimmer_games_2", v5l0Var, cyberGamesPage2));
            }
            if (cyberGamesPage2.equals(real3)) {
                lc00VarB4.add(new nuj("shimmer_header_3", new ijm()));
                lc00VarB4.add(new mtj("shimmer_active_teams", h9mVar));
            }
            if (z) {
                lc00VarB4.add(new nuj("shimmer_header_4", new ijm()));
                float f = 0.9f;
                lc00VarB4.add(new ztj(dyb.g0(new z2m(f), new z2m(f), new z2m(f)), "shimmer_banner_1"));
                lc00VarB4.add(new nuj("shimmer_header_5", new ijm()));
                lc00VarB4.add(new ztj(dyb.g0(new z2m(f), new z2m(f), new z2m(f)), "shimmer_banner_2"));
            } else {
                lc00VarB4.add(new nuj("shimmer_header_4", new ijm()));
                urm urmVar = urm.f36170a;
                lc00VarB4.add(new oxj("shimmer_banner_1", urmVar));
                lc00VarB4.add(new oxj("shimmer_banner_2", urmVar));
                lc00VarB4.add(new oxj("shimmer_banner_3", urmVar));
                lc00VarB4.add(new oxj("shimmer_banner_4", urmVar));
            }
            lc00VarA = kotlin.collections.a.a(lc00VarB4);
        }
        return new gsk(jpkVar, dyb.o0(lc00VarA), true);
    }

    public static final uxv Q(String str) {
        String str2;
        String str3;
        String str4;
        List listSplit$default = str != null ? StringsKt__StringsKt.split$default(str, new String[]{Separators.COMMA}, false, 0, 6, null) : null;
        String str5 = Separators.QUESTION;
        if (listSplit$default == null || (str2 = (String) CollectionsKt.W(0, listSplit$default)) == null) {
            str2 = Separators.QUESTION;
        }
        if (listSplit$default == null || (str3 = (String) CollectionsKt.W(1, listSplit$default)) == null) {
            str3 = Separators.QUESTION;
        }
        if (listSplit$default != null && (str4 = (String) CollectionsKt.W(2, listSplit$default)) != null) {
            str5 = str4;
        }
        return new uxv(str2, str3, str5);
    }

    public static final gsk R(g2v g2vVar, long j, CyberGamesPage cyberGamesPage) {
        Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(j, cyberGamesPage);
        return new gsk(new kpk(g2v.b(g2vVar, ozb.N(((Number) pairC.f46059a).longValue(), ((Number) pairC.b).longValue()), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
    }

    public static final List S(a4x a4xVar, n2o n2oVar) {
        a4xVar.getClass();
        n2oVar.getClass();
        int iOrdinal = n2oVar.ordinal();
        if (iOrdinal == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar) {
                if (!(((p6t0) obj) instanceof gok)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (iOrdinal != 3) {
            return a4xVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : a4xVar) {
            if (!(((p6t0) obj2) instanceof prk)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final String T(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((nrf) next).f23999a.equals(str));
        nrf nrfVar = (nrf) next;
        String str2 = nrfVar != null ? nrfVar.f23999a : null;
        nrf nrfVar2 = (nrf) CollectionsKt.firstOrNull(list);
        String str3 = nrfVar2 != null ? nrfVar2.f23999a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final long U(a1d a1dVar) {
        DragEvent dragEvent = (DragEvent) a1dVar.b;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final boolean V(wif wifVar) {
        wifVar.getClass();
        ArrayList arrayListQ0 = CollectionsKt.q0(wifVar.c, wifVar.d);
        if (!arrayListQ0.isEmpty()) {
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                if (((xif) it.next()).f40942a.length() == 0) {
                    return true;
                }
            }
        }
        return wifVar.e.c.size() < 5 || wifVar.f.c.size() < 5;
    }

    public static void W(List list) throws gzj {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((hzj) list.get(i)).d();
                i++;
            } catch (gzj e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((hzj) list.get(i2)).b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static final nnd X(l9s l9sVar) {
        Pair pairW = ozb.W(l9sVar);
        String str = (String) pairW.f46059a;
        String str2 = (String) pairW.b;
        List listG = l9sVar.G();
        List listV = l9sVar.v();
        boolean z = l9sVar.getType() == s9s.f31862a;
        return new nnd(l9sVar.p(), l9sVar.m(), str, str2, listG, listV, l9sVar.E(), l9sVar.c(), l9sVar.y().c, l9sVar.L(), l9sVar.f(), z, l9sVar.e(), !l9sVar.t() ? l9sVar.D() : null, l9sVar.S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final dur Y(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        int i2;
        char c;
        ytr wtrVar;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        boolean z8;
        boolean z9;
        char c2;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        long jI0 = qzb.i0(d0tVar);
        boolean z10 = d0tVar.h;
        int i6 = d0tVar.O;
        long j = d0tVar.f5282a;
        long j2 = d0tVar.n;
        long j3 = d0tVar.x;
        long j4 = d0tVar.v;
        long j5 = d0tVar.u;
        boolean z11 = d0tVar.C;
        int i7 = (j4 == 40 || (d0tVar.A != boh.UNKNOWN)) ? R.drawable.ic_glyph_cyber_gamepad : R.drawable.ic_glyph_category_new;
        if (list.contains(Integer.valueOf(i6)) && z4) {
            bzu bzuVarE = rz4.e("static", "img", "android", "TopChamps");
            axq.u(bzuVarE, str2.length() == 0 ? String.valueOf(i6) : str2, "backgrounds", "icon.svg");
            String string = ((StringBuilder) bzuVarE.b).toString();
            StringBuilder sb = new StringBuilder(ujn.h);
            if (str.length() == 0) {
                sb.setLength(0);
            } else {
                int i8 = 0;
                if (StringsKt.O(str, ujn.h, false)) {
                    sb.setLength(i8);
                    sb.append(str);
                } else if (kotlin.text.c.x(str, "https://", false)) {
                    i8 = 0;
                    sb.setLength(i8);
                    sb.append(str);
                } else {
                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str, c2));
                }
            }
            wtrVar = new xtr(sb.toString(), string);
            i = 0;
            i2 = 1;
        } else {
            StringBuilder sb2 = new StringBuilder(ujn.h);
            if (str.length() == 0) {
                sb2.setLength(0);
                i = 0;
                i2 = 1;
            } else {
                if (StringsKt.O(str, ujn.h, false)) {
                    i = 0;
                } else if (kotlin.text.c.x(str, "https://", false)) {
                    i = 0;
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c = '/';
                    } else {
                        c = '/';
                        sb2.append('/');
                    }
                    i2 = 1;
                    i = 0;
                    sb2.append(StringsKt.y0(str, c));
                }
                i2 = 1;
                sb2.setLength(i);
                sb2.append(str);
            }
            wtrVar = new wtr(sb2.toString());
        }
        ztr ztrVar = new ztr(wtrVar, i7, (z5 && list.contains(Integer.valueOf(i6))) ? i2 : i);
        int i9 = i;
        ank0 ank0VarK = jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, z3, d0tVar.y.f26920a);
        boolean z12 = d0tVar.G;
        int i10 = (z12 && !z && z2) ? i2 : i9;
        if (!d0tVar.H || z12 || z) {
            i3 = i2;
            z6 = i9;
        } else {
            i3 = i2;
            z6 = i3;
        }
        boolean z13 = d0tVar.D;
        if (!d0tVar.F || z10 || z) {
            i4 = i9;
            z7 = i4;
        } else {
            i4 = i9;
            z7 = i3;
        }
        if (!z10 && !z) {
            int i11 = i10;
            i5 = i11;
            if (d0tVar.x != 0) {
                z8 = 1;
                z9 = i11;
            }
            return new dur(jI0, j, j3, j4, z11, j5, ztrVar, ank0VarK, z9, z6, z13, z7, d0tVar.E, z8, j2);
        }
        i5 = i10;
        z8 = i4;
        z9 = i5;
        return new dur(jI0, j, j3, j4, z11, j5, ztrVar, ank0VarK, z9, z6, z13, z7, d0tVar.E, z8, j2);
    }

    public static final qcv Z(tcv tcvVar) {
        List<t680> list;
        ocv ocvVar = tcvVar.b;
        if (ocvVar == null) {
            jf4.k(null);
            return null;
        }
        Integer num = tcvVar.f33737a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        List<u1m0> list2 = ocvVar.b;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (u1m0 u1m0Var : list2) {
            String str = u1m0Var.f34907a;
            String str2 = str == null ? "" : str;
            String str3 = u1m0Var.b;
            String str4 = str3 == null ? "" : str3;
            String str5 = u1m0Var.c;
            String str6 = str5 == null ? "" : str5;
            String str7 = u1m0Var.d;
            String str8 = str7 == null ? "" : str7;
            Long l = u1m0Var.e;
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = u1m0Var.f;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            String str9 = u1m0Var.g;
            arrayList.add(new jcv(jLongValue, jLongValue2, str2, str4, str6, str8, str9 == null ? "" : str9));
        }
        djh0 djh0Var = ocvVar.f25046a;
        if (djh0Var == null || (list = djh0Var.f6186a) == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (t680 t680Var : list) {
            String str10 = t680Var.b;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = t680Var.f33404a;
            if (str11 == null) {
                str11 = "";
            }
            Boolean bool = t680Var.c;
            arrayList2.add(new ajh0(str10, str11, bool != null ? bool.booleanValue() : false));
        }
        return new qcv(iIntValue, arrayList, arrayList2);
    }

    public static final void a(mm40 mm40Var, jln jlnVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1166613540);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jlnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            j47.O(s5x0.L(jm40Var, 16.0f, 0.0f, 2), jlnVar.f16724a, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            f(i3 & 896, fetVar, jlnVar.b, null, function1);
            wvb.o(null, 52.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var2, (Object) jlnVar, (Object) function1, i, (byte) 28);
        }
    }

    public static a8z a0(Fragment fragment, sgy sgyVar, Function0 function0, Function0 function1, int i) {
        byte b = 2;
        if ((i & 2) != 0) {
            function0 = null;
        }
        Function0 function2 = function0;
        ti6 ti6Var = new ti6(fragment, b);
        fragment.getClass();
        function1.getClass();
        if (function2 != null) {
            return maz.a(wez.b, new qig(ti6Var, function1, function2, sgyVar, (byte) 1));
        }
        a8z a8zVarA = maz.a(wez.b, new lfk(ti6Var, (byte) 4));
        if (sgyVar == null) {
            sgyVar = sre0.f32672a.b(k3t0.class);
        }
        return agc.G(fragment, sgyVar, new r6p(a8zVarA, (byte) 6), new r6p(a8zVarA, (byte) 7), function1);
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-611820101);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(mm40Var, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.s(s5x0.N(mm40VarA0, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), 4.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 24);
        }
    }

    public static a8z b0(Fragment fragment, sgy sgyVar, Function0 function0) {
        ti6 ti6Var = new ti6(fragment, (byte) 2);
        fragment.getClass();
        a8z a8zVarA = maz.a(wez.b, new lfk(ti6Var, (byte) 4));
        if (sgyVar == null) {
            sgyVar = sre0.f32672a.b(k3t0.class);
        }
        return agc.G(fragment, sgyVar, new r6p(a8zVarA, (byte) 6), new r6p(a8zVarA, (byte) 7), function0);
    }

    public static final void c(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        function1.getClass();
        fetVar.g0(-1111238700);
        int i2 = i | 6;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f = xfn.a(fetVar).d;
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(mm40VarQ, f, 8.0f, f2, 8.0f), "ChipsContent");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new e6c((byte) 7);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new trb(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function2, mm40VarE0, (Function1) objP2, fetVar2, 6, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbc(mm40Var, function1, i, b);
        }
    }

    public static final mm40 c0(mm40 mm40Var, fqj0 fqj0Var) {
        mm40Var.getClass();
        fqj0Var.getClass();
        return mm40Var.e(new crm(fqj0Var));
    }

    public static final void d(jph jphVar, fet fetVar, int i) {
        jph jphVar2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(711114442);
        int i2 = i | (fetVar2.g(jphVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 28.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 80.0f);
            aqh aqhVar = jphVar.b;
            aqh aqhVar2 = jphVar.c;
            String str = aqhVar.f1295a;
            long j = aqhVar.c ? iph.g : iph.h;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, mm40VarS, j, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            x7z x7zVar = new x7z(1.0f, true);
            String str2 = jphVar.f16900a;
            long j2 = iph.f;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, x7zVar, j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            mm40 mm40VarS2 = o7k0.s(jm40Var, 80.0f);
            String str3 = aqhVar2.f1295a;
            long j3 = aqhVar2.c ? iph.g : iph.h;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str3, mm40VarS2, j3, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            jphVar2 = jphVar;
            b = 6;
            ibc.g(o7k0.d(jm40Var, 1.0f), jphVar2.b.b, aqhVar2.b, fetVar2, 6);
            fetVar2.r(true);
        } else {
            jphVar2 = jphVar;
            b = 6;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(jphVar2, i, b);
        }
    }

    public static final void e(final mm40 mm40Var, final fcm fcmVar, final boolean z, final Function1 function1, fet fetVar, final int i) {
        int i2;
        final mm40 mm40Var2;
        final fcm fcmVar2;
        final boolean z2;
        final Function1 function2;
        ecm ecmVar = fcmVar.b;
        fetVar.g0(77810294);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fcmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40Var2 = mm40Var;
            fcmVar2 = fcmVar;
            z2 = z;
            function2 = function1;
            fetVar.X();
        } else {
            if (ecmVar.f7573a.length() == 0) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b = 0;
                    yfe0VarU.d = new Function2() { // from class: a.zbm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            int i3 = i;
                            switch (b2) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    xbc.e(mm40Var, fcmVar, z, function1, (fet) obj, x8x.L(i3 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    xbc.e(mm40Var, fcmVar, z, function1, (fet) obj, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            mm40Var2 = mm40Var;
            z2 = z;
            fcmVar2 = fcmVar;
            function2 = function1;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), jd8.n), 12.0f), "DS_CYBER_TOP_INFO");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            vcc.h(ecmVar, fetVar, 0);
            fetVar.e0(-266405384);
            qbc.l(fcmVar2.c, function2, fetVar, (i2 >> 9) & 112);
            fetVar.r(false);
            if (z2) {
                fetVar.e0(-266209185);
                qcc.j(fcmVar2.d, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-266094826);
                fetVar.r(false);
            }
            fetVar.r(true);
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final byte b2 = 1;
            yfe0VarU2.d = new Function2() { // from class: a.zbm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    switch (b3) {
                        case 0:
                            ((Integer) obj2).getClass();
                            xbc.e(mm40Var2, fcmVar2, z2, function2, (fet) obj, x8x.L(i3 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            xbc.e(mm40Var2, fcmVar2, z2, function2, (fet) obj, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fetVar.g0(-1227226076);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 720607387, a4xVar);
            while (itO.hasNext()) {
                fln flnVar = (fln) itO.next();
                if (flnVar != null) {
                    if (flnVar instanceof bln) {
                        fetVar.e0(794584679);
                        zcl zclVar2 = qmk.f28987a;
                        epv0.f(s5x0.L(jm40Var, 28.0f, 0.0f, 2), (bln) flnVar, fetVar, 0);
                        fetVar.r(false);
                    } else if (flnVar instanceof dln) {
                        fetVar.e0(794896973);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(jm40Var, 28.0f, 0.0f, 2);
                        dln dlnVar = (dln) flnVar;
                        boolean z = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z || objP == ukd.f35823a) {
                            objP = new ylm(function1, (byte) 6);
                            fetVar.o0(objP);
                        }
                        hew0.c(mm40VarL, dlnVar, (Function0) objP, fetVar, 0);
                        fetVar.r(false);
                    } else if (flnVar instanceof cln) {
                        fetVar.e0(795471217);
                        zcl zclVar4 = qmk.f28987a;
                        i4w0.i(s5x0.L(jm40Var, 28.0f, 0.0f, 2), (cln) flnVar, fetVar, 0);
                        fetVar.r(false);
                    } else if (flnVar instanceof eln) {
                        fetVar.e0(795764229);
                        zcl zclVar5 = qmk.f28987a;
                        nsm0.c(s5x0.L(jm40Var, 16.0f, 0.0f, 2), ((eln) flnVar).f8008a, fetVar, 0);
                        fetVar.r(false);
                    }
                }
                throw b1j.f(-805653938, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i, (byte) 5);
        }
    }

    public static final void g(kwj kwjVar, pv40 pv40Var, i4 i4Var, ib50 ib50Var, fet fetVar, int i) {
        int i2;
        pv40Var.getClass();
        ib50Var.getClass();
        fetVar.g0(1627389453);
        int i3 = i & 6;
        y5d y5dVar = y5d.f42040a;
        if (i3 == 0) {
            i2 = (fetVar.g(y5dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kwjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(pv40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(i4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar.g(ib50Var) : fetVar.i(ib50Var) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            yje yjeVar = null;
            int i4 = i2 >> 3;
            LinkedHashMap linkedHashMapD = pv40Var.d(mrv.n0(ib50Var.f14471a, null, fetVar, 0, 2), fetVar, i4 & 112);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new b1f((Object) kwjVar, (Object) pz40Var, yjeVar, (byte) 11);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, kwjVar, (Function2) objP2);
            q5x.e(kwjVar, o2e.e0(vtb.U(y5dVar.b(o7k0.d(jm40.b, 1.0f), true), ((Boolean) pz40Var.getValue()).booleanValue()), "CYBER_CHAMPS_HORIZONTAL_PAGER"), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1353049044, new n82(i4Var, pv40Var, linkedHashMapD, (byte) 12), fetVar), fetVar, (i4 & 14) | 100687872, 24576, 16108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 20, i, (Object) kwjVar, (Object) pv40Var, (Object) i4Var, (Object) ib50Var);
        }
    }

    public static final void h(kwj kwjVar, int i, i4 i4Var, pv40 pv40Var, aig aigVar, fet fetVar, int i2) {
        Object obj;
        int i3;
        Object obj2;
        cl5 cl5Var;
        aigVar.getClass();
        fetVar.g0(-1954115658);
        if ((i2 & 6) == 0) {
            obj = kwjVar;
            i3 = (fetVar.g(obj) ? 4 : 2) | i2;
        } else {
            obj = kwjVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(i4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj2 = pv40Var;
            i3 |= fetVar.g(obj2) ? 2048 : 1024;
        } else {
            obj2 = pv40Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? fetVar.g(aigVar) : fetVar.i(aigVar) ? 16384 : 8192;
        }
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Integer numValueOf = Integer.valueOf(i);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP == cl5Var2) {
                Object obj3 = obj;
                cl5Var = cl5Var2;
                objP = new fs(obj3, i, obj2, (Object) i4Var, (yje) null, (byte) 2);
                fetVar.o0(objP);
            } else {
                cl5Var = cl5Var2;
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP);
            Unit unit = Unit.f46060a;
            if ((57344 & i3) != 16384 && ((i3 & 32768) == 0 || !fetVar.i(aigVar))) {
                z = false;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ocg(aigVar, b);
                fetVar.o0(objP2);
            }
            m0x0.o(unit, (Function1) objP2, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k53(kwjVar, i, i4Var, pv40Var, aigVar, i2);
        }
    }

    public static final void i(final a4x a4xVar, final ugd ugdVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        a4xVar.getClass();
        fetVar.g0(1267387476);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.sph
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            int i3 = i;
                            ugd ugdVar2 = ugdVar;
                            a4x a4xVar2 = a4xVar;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    xbc.i(a4xVar2, ugdVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                                default:
                                    xbc.i(a4xVar2, ugdVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                kr00.a(u1c.M(277212305, new chh(a4xVar, ugdVar), fetVar), fetVar, 6);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.sph
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    ugd ugdVar2 = ugdVar;
                    a4x a4xVar2 = a4xVar;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            xbc.i(a4xVar2, ugdVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                        default:
                            xbc.i(a4xVar2, ugdVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(1151401080);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g("• LIVE") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(false) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            fetVar.e0(-1416986446);
            fetVar2 = fetVar;
            j6n.h("• LIVE", kro0.f18776a, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar2, ((i2 >> 3) & 14) | 48, 24);
            fetVar2.r(false);
            fetVar2.e0(-1416633914);
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var2, i, (byte) 25);
        }
    }

    public static final void k(mm40 mm40Var, yql yqlVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(423029859);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(yqlVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            kjm kjmVar = kjm.f18392a;
            String str = yqlVar.c;
            sql sqlVar = yqlVar.f43081a;
            nkb.h(mm40VarN, new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190), kjmVar, null, null, null, fetVar, 384, 56);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN2 = s5x0.N(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 320.0f), 80.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarE, null, null, fetVar2, 48, 2040);
            B(null, sqlVar, fetVar2, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nql(mm40Var, yqlVar, i, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, f0m f0mVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1088077520);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(f0mVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (f0mVar.equals(e0m.f6994a)) {
            fetVar.e0(-799040752);
            fetVar.r(false);
            fetVar2 = fetVar;
        } else {
            if (!(f0mVar instanceof d0m)) {
                throw b1j.f(-1965439626, fetVar, false);
            }
            fetVar.e0(-798981697);
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
            d0m d0mVar = (d0m) f0mVar;
            fetVar2 = fetVar;
            tdc.e(d0mVar.f5274a, d0mVar.b, jm40.b, fetVar2, 384, 0);
            fetVar2.r(true);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, f0mVar, i, (byte) 25);
        }
    }

    public static final void m(mm40 mm40Var, hcm hcmVar, boolean z, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        Function1 function2;
        fetVar.g0(196570863);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(hcmVar) ? 32 : 16);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (fetVar.i(function1) ? 16384 : 8192);
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new xjl((byte) 29);
                    fetVar.o0(objP);
                }
                function2 = (Function1) objP;
            } else {
                function2 = function1;
            }
            if (hcmVar instanceof fcm) {
                fetVar.e0(-73952794);
                e(mm40Var, (fcm) hcmVar, z, function2, fetVar, 65534 & i3);
                fetVar.r(false);
            } else {
                int i6 = i3;
                if (!hcmVar.equals(gcm.f11070a)) {
                    throw b1j.f(-73954396, fetVar, false);
                }
                fetVar.e0(-73943583);
                H((i6 & 14) | 432, fetVar, mm40Var, z);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dxe(mm40Var, hcmVar, z, function2, i, i2);
        }
    }

    public static final void n(mm40 mm40Var, jxm jxmVar, jxm jxmVar2, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-1664317911);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(jxmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            xcz xczVarA = ddz.a(q3d.i(jxmVar.c), 0, fetVar2, 0, 2);
            xcz xczVarA2 = ddz.a(q3d.i(jxmVar2.c), 0, fetVar2, 0, 2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar2.i(vneVar) | fetVar2.g(xczVarA) | fetVar2.g(xczVarA2);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new gxm(vneVar, xczVarA, xczVarA2, (byte) 1);
                fetVar2.o0(objP2);
            }
            bch0 bch0VarP = piz.P((Function1) objP2, fetVar2);
            int i3 = i2;
            D(null, jxmVar, true, xczVarA, bch0VarP, fetVar2, (i2 & 112) | 384);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
            D(null, jxmVar2, false, xczVarA2, bch0VarP, fetVar2, ((i3 >> 3) & 112) | 384);
            if (str.length() > 0) {
                fetVar2.e0(1486018096);
                sj3.p((i3 >> 6) & 112, 13, fetVar, null, str, null, null);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1486078639);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 18, i, (Object) mm40Var, (Object) jxmVar, (Object) jxmVar2, (Object) str);
        }
    }

    public static final void o(mm40 mm40Var, final b8l0 b8l0Var, n3l0 n3l0Var, d4d d4dVar, boolean z, final Function0 function0, Function0 function1, Function0 function2, Function1 function3, fet fetVar, final int i, final int i2) {
        int i3;
        n3l0 n3l0Var2;
        int i4;
        boolean z2;
        int i5;
        Function0 function4;
        int i6;
        int i7;
        int i8;
        final mm40 mm40Var2;
        final Function1 function5;
        final n3l0 n3l0Var3;
        final boolean z3;
        final Function0 function6;
        final d4d d4dVar2;
        final Function0 function7;
        b8l0Var.getClass();
        fetVar.g0(-530012374);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i10 = i3 | (fetVar.g(b8l0Var) ? 32 : 16);
        int i11 = i2 & 4;
        if (i11 != 0) {
            i4 = i10 | 384;
            n3l0Var2 = n3l0Var;
        } else {
            n3l0Var2 = n3l0Var;
            i4 = i10 | (fetVar.g(n3l0Var2) ? 256 : 128);
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= fetVar.e(d4dVar == null ? -1 : d4dVar.ordinal()) ? 2048 : 1024;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i5 = i4 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (fetVar.h(z2) ? 16384 : 8192);
        }
        int i14 = i5 | (fetVar.i(function0) ? 131072 : 65536);
        int i15 = i2 & 64;
        if (i15 != 0) {
            i6 = i14 | 1572864;
            function4 = function1;
        } else {
            function4 = function1;
            i6 = i14 | (fetVar.i(function4) ? 1048576 : 524288);
        }
        int i16 = i2 & 128;
        if (i16 != 0) {
            i7 = i6 | 12582912;
        } else {
            i7 = i6 | (fetVar.i(function2) ? 8388608 : 4194304);
        }
        int i17 = i2 & 256;
        if (i17 != 0) {
            i8 = i7 | 100663296;
        } else {
            i8 = i7 | (fetVar.i(function3) ? 67108864 : 33554432);
        }
        if (fetVar.U(i8 & 1, (i8 & 38347923) != 38347922)) {
            mm40 mm40Var3 = i9 != 0 ? jm40.b : mm40Var;
            n3l0 n3l0Var4 = i11 != 0 ? j3l0.f15840a : n3l0Var2;
            d4d d4dVar3 = i12 != 0 ? d4d.BACKGROUND_CONTENT : d4dVar;
            boolean z4 = i13 != 0 ? false : z2;
            Function0 function8 = i15 != 0 ? null : function4;
            Function0 function9 = i16 != 0 ? null : function2;
            Function1 function10 = i17 != 0 ? null : function3;
            int i18 = i8 & 14;
            int i19 = i8 >> 9;
            agc.r(mm40Var3, new zrm(b8l0Var.getTitle(), b8l0Var.a(), b8l0Var.b(), d4dVar3, n3l0Var4, z4), function0, function8, function9, function10, null, fetVar, i18 | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 64);
            mm40Var2 = mm40Var3;
            function6 = function8;
            function7 = function9;
            function5 = function10;
            d4dVar2 = d4dVar3;
            n3l0Var3 = n3l0Var4;
            z3 = z4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function5 = function3;
            n3l0Var3 = n3l0Var2;
            z3 = z2;
            function6 = function4;
            d4dVar2 = d4dVar;
            function7 = function2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.t2n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xbc.o(mm40Var2, b8l0Var, n3l0Var3, d4dVar2, z3, function0, function6, function7, function5, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(mm40 mm40Var, jln jlnVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        jlnVar.getClass();
        function1.getClass();
        fetVar.g0(-506779289);
        int i2 = i | 6 | (fetVar.g(jlnVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            a(null, jlnVar, function1, fetVar, i2 & 1008);
            fetVar.r(true);
            b(0, fetVar, jr8.f16991a.b(jm40Var, gqw0.b));
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, jlnVar, function1, i, (byte) 28);
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-874888174);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new s8o(function1, (byte) 11);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i, (byte) 1);
        }
    }

    public static final void r(pqb0 pqb0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1898400240);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(pqb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f = xfn.a(fetVar).c;
            mm40 mm40VarG = aad.G(jm40.b, 0.0f, f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = w5o.f38593a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zD = fetVar.d(f) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                objP2 = new cel(f, (Object) pqb0Var, (byte) 5);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40VarG, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(pqb0Var, i, (byte) 15);
        }
    }

    public static final void s(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(1845285995);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, s5x0.N(c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var), 0.0f, 0.0f, 0.0f, 8.0f, 7));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 3, i, fqj0Var);
        }
    }

    public static final void t(int i, v3n v3nVar, fet fetVar, mm40 mm40Var, String str) {
        v3n v3nVar2;
        String str2;
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-150808812);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            v3nVar2 = v3nVar;
            i2 |= fetVar.g(v3nVar2) ? 32 : 16;
        } else {
            v3nVar2 = v3nVar;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long jF = v3nVar2.b().f(fetVar);
            float fH = v3nVar2.a().h();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, fH, 24.0f);
            long jG = v3nVar2.b().g(fetVar);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(i120.Q(mm40VarP, jG, ugg0Var), 1.0f, jF, ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            v8q0.a(str2, s5x0.L(jm40Var, 4.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0.a(v3nVar2.b().h(fetVar), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, (i2 >> 6) & 14, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) v3nVar2, (Object) str, i, (byte) 3);
        }
    }

    public static final void u(List list, fet fetVar, int i) {
        fetVar.g0(-1573709076);
        int i2 = (fetVar.g(list) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40.b, qmk.a(fetVar).d, 0.0f, 2), 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gg4(list, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bo0(list, i, (byte) 11);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1108386016);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_fact, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((wvo) l7m0Var.getValue()).b().f17212a;
            j9m0 j9m0Var = ((wvo) l7m0Var.getValue()).b().b;
            boolean zA = ((wvo) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new s8o(function1, (byte) 10);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-1342690066, new xs4(l7m0Var, function1, (byte) 22), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 11);
        }
    }

    public static final void w(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1336907881);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 8.0f, 8.0f, 0.0f, 8.0f, 4);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.u;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, c0(lgb.J(mm40VarN2, ugg0Var), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, c0(lgb.J(o7k0.n(jm40Var, 32.0f), ugg0Var), vbc.d0(null, fetVar, 0, 1)));
            fetVar.e0(-485750318);
            int iB = 0;
            while (iB < 6) {
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarP = o7k0.p(jm40Var, 128.0f, 32.0f);
                zcl zclVar3 = qmk.m;
                iB = h97.b(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jbp(i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    public static final void x(mm40 mm40Var, hjs hjsVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        float f;
        byte b;
        boolean z;
        kc50 kc50Var = hjsVar.c;
        kc50 kc50Var2 = hjsVar.b;
        function1.getClass();
        fetVar.g0(125384173);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hjsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            pz40 pz40Var2 = s6t0.f31722a;
            final long primary = s6t0.b().f33626a.getPrimary();
            Object objP2 = fetVar.P();
            if (objP2 == obj3) {
                zcl zclVar = qmk.f28987a;
                objP2 = Integer.valueOf(w6kVar.T(4.0f));
                fetVar.o0(objP2);
            }
            int iIntValue = ((Number) objP2).intValue();
            Object objP3 = fetVar.P();
            if (objP3 == obj3) {
                zcl zclVar2 = qmk.f28987a;
                objP3 = Integer.valueOf(w6kVar.T(36.0f));
                fetVar.o0(objP3);
            }
            int iIntValue2 = ((Number) objP3).intValue();
            Object objP4 = fetVar.P();
            if (objP4 == obj3) {
                zcl zclVar3 = qmk.f28987a;
                objP4 = twn.j(36.0f, fetVar);
            }
            final float f2 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == obj3) {
                zcl zclVar4 = qmk.f28987a;
                objP5 = Integer.valueOf(w6kVar.T(28.0f));
                fetVar.o0(objP5);
            }
            int iIntValue3 = ((Number) objP5).intValue();
            Object objP6 = fetVar.P();
            if (objP6 == obj3) {
                zcl zclVar5 = qmk.f28987a;
                objP6 = twn.j(28.0f, fetVar);
            }
            final float f3 = ((ycl) objP6).f42389a;
            boolean z2 = fetVar.k(bmd.n) == k6z.b;
            boolean z3 = (i4 & 112) == 32;
            Object objP7 = fetVar.P();
            if (z3 || objP7 == obj3) {
                int iOrdinal = hjsVar.d.ordinal();
                if (iOrdinal == 0) {
                    i3 = 0;
                } else if (iOrdinal == 1) {
                    i3 = 1;
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return;
                } else if (kc50Var2 != null) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                objP7 = twn.j(z2 ? w6kVar.r0(((iIntValue2 + iIntValue) * i3) + iIntValue) : w6kVar.r0((iIntValue2 + iIntValue) * i3), fetVar);
            }
            ycl yclVar = (ycl) objP7;
            float f4 = yclVar.f42389a;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-1300336546);
                float f5 = ((ycl) d43.a(f4, ro4.m0(Response.OK, 0, null, 6), null, fetVar, 48, 12).getValue()).f42389a;
                fetVar.r(false);
                f = f5;
                obj = obj3;
            } else {
                fetVar.e0(-1300214530);
                boolean zD = fetVar.d(f4);
                Object objP8 = fetVar.P();
                if (zD) {
                    obj = obj3;
                } else {
                    obj = obj3;
                    if (objP8 != obj) {
                        obj2 = objP8;
                    }
                    f = ((ycl) obj2).f42389a;
                    fetVar.r(false);
                }
                obj2 = yclVar;
                fetVar.o0(obj2);
                f = ((ycl) obj2).f42389a;
                fetVar.r(false);
            }
            Unit unit = Unit.f46060a;
            Object objP9 = fetVar.P();
            if (objP9 == obj) {
                b = 2;
                objP9 = new nbd(pz40Var, null, b);
                fetVar.o0(objP9);
            } else {
                b = 2;
            }
            m0x0.t(fetVar, unit, (Function2) objP9);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(ffb0.R(jm40Var, f, 0.0f, b), f2), f3);
            boolean zF = fetVar.f(primary);
            Object objP10 = fetVar.P();
            if (zF || objP10 == obj) {
                objP10 = new Function1() { // from class: a.djs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        pi9 pi9Var = (pi9) obj4;
                        pi9Var.getClass();
                        zcl zclVar6 = qmk.f28987a;
                        float density = pi9Var.getDensity() * 8.0f;
                        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                        final long j = primary;
                        final float f6 = f2;
                        final float f7 = f3;
                        return pi9Var.a(new Function1() { // from class: a.ejs
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                fhl fhlVar = (fhl) obj5;
                                fhlVar.getClass();
                                float fW0 = fhlVar.w0(f6);
                                float fW1 = fhlVar.w0(f7);
                                fhl.o0(fhlVar, j, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), jFloatToRawIntBits, l0q.f19214a, 226);
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar.o0(objP10);
            }
            zq8.a(0, fetVar, rq8.L(mm40VarE, (Function1) objP10));
            boolean zH = fetVar.h(z2);
            Object objP11 = fetVar.P();
            if (zH || objP11 == obj) {
                objP11 = new gjs(iIntValue2, iIntValue3, iIntValue, z2);
                fetVar.o0(objP11);
            }
            tj30 tj30Var = (tj30) objP11;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kc50 kc50Var3 = hjsVar.f13175a;
            int i5 = i4 & 896;
            boolean z4 = i5 == 256;
            Object objP12 = fetVar.P();
            if (z4 || objP12 == obj) {
                objP12 = new hcr(function1, (byte) 16);
                fetVar.o0(objP12);
            }
            xvw.e(jm40Var, kc50Var3, (Function0) objP12, fetVar, 6);
            if (kc50Var2 == null) {
                fetVar.e0(747881548);
                z = false;
                fetVar.r(false);
            } else {
                fetVar.e0(747881549);
                boolean z5 = i5 == 256;
                Object objP13 = fetVar.P();
                if (z5 || objP13 == obj) {
                    objP13 = new hcr(function1, (byte) 17);
                    fetVar.o0(objP13);
                }
                xvw.e(jm40Var, kc50Var2, (Function0) objP13, fetVar, 6);
                z = false;
                fetVar.r(false);
            }
            if (kc50Var == 0) {
                fetVar.e0(748147094);
                fetVar.r(z);
            } else {
                fetVar.e0(748147095);
                boolean z6 = i5 == 256;
                Object objP14 = fetVar.P();
                if (z6 || objP14 == obj) {
                    objP14 = new hcr(function1, (byte) 18);
                    fetVar.o0(objP14);
                }
                xvw.e(jm40Var, kc50Var, (Function0) objP14, fetVar, 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) hjsVar, (Object) function1, i, (byte) 9);
        }
    }

    public static final void y(mm40 mm40Var, dgt dgtVar, Function1 function1, fet fetVar, int i) {
        long secondary;
        fet fetVar2 = fetVar;
        dgtVar.getClass();
        function1.getClass();
        fetVar2.g0(180040535);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(dgtVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            mm40 mm40VarN = s5x0.N(jm40.b, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            String str = dgtVar.f6056a;
            if (dgtVar.c) {
                fetVar2.e0(-1294604204);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
            } else {
                fetVar2.e0(-1294603210);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            }
            fetVar2.r(false);
            v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fyl fylVar = dgtVar.b;
            vxl vxlVar = vxl.b;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new baq(function1, (byte) 27);
                fetVar2.o0(objP);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, dgtVar, function1, i, (byte) 6);
        }
    }

    public static final void z(qow qowVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1655975999);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qowVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1375906687, new xxv(qowVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(qowVar, i);
        }
    }
}
