package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardMiddleView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vtb {
    public static final void A(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        wa50 ta50Var;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1157634340);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            ilm ilmVar = new ilm(staticColors.m123getWhite0d7_KjU());
            plm plmVar = new plm((String) ((avs) l7m0Var2.getValue()).f1542a.getValue(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a);
            boolean zBooleanValue = ((Boolean) ((avs) l7m0Var2.getValue()).c.getValue()).booleanValue();
            ra50 ra50Var = ra50.f30118a;
            if (zBooleanValue) {
                boolean zBooleanValue2 = ((Boolean) ((avs) l7m0Var2.getValue()).d.getValue()).booleanValue();
                ta50Var = new va50(new wkm(1, zBooleanValue2 ? R.drawable.ic_quick_bet_active : R.drawable.ic_quick_bet, ((Boolean) ((avs) l7m0Var2.getValue()).b.getValue()).booleanValue(), ra50Var, staticColors.m123getWhite0d7_KjU()), new wkm(0, R.drawable.ic_glyph_more_vertically, ((Boolean) ((avs) l7m0Var2.getValue()).b.getValue()).booleanValue(), ra50Var, staticColors.m123getWhite0d7_KjU()));
            } else {
                ta50Var = new ta50(new wkm(0, R.drawable.ic_glyph_more_vertically, ((Boolean) ((avs) l7m0Var2.getValue()).b.getValue()).booleanValue(), ra50Var, staticColors.m123getWhite0d7_KjU()));
            }
            imm immVar = new imm(ilmVar, plmVar, new dmm(ta50Var), staticColors.m121getTransparent0d7_KjU(), false, null);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            byte b = 26;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new hcr(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new baq(function1, b);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            hlm.c(jm40Var, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4052);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x74(mm40Var2, l7m0Var2, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    public static final void B(mm40 mm40Var, uqv uqvVar, boolean z, cml cmlVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        float f;
        uqvVar.getClass();
        cev0 cev0Var = uqvVar.c;
        tqv tqvVar = uqvVar.b;
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1907592113);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(uqvVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(cmlVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "HEADER_CONTAINER_COLUMN");
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
            K(null, tqvVar, fetVar, 0);
            float f2 = 28.0f;
            if (cev0Var instanceof bev0) {
                zcl zclVar = qmk.f28987a;
            } else {
                if (!(cev0Var instanceof aev0)) {
                    t9f.b();
                    return;
                }
                aev0 aev0Var = (aev0) cev0Var;
                int iOrdinal = aev0Var.f748a.ordinal();
                if (iOrdinal == 0) {
                    a4x a4xVar = aev0Var.c;
                    if ((a4xVar.size() == 1 ? a4xVar : null) != null) {
                        zcl zclVar2 = qmk.f28987a;
                        f = 16.0f;
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                        f2 = 6.0f;
                    }
                    u4n0.j(o2e.e0(s5x0.N(jm40.b, 0.0f, tqvVar instanceof sqv ? 16.0f : 0.0f, 0.0f, f, 5), "WIDGETS_GROUP"), cev0Var, z, cmlVar, function1, function2, fetVar, 524160 & i2);
                    fetVar.r(true);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    zcl zclVar4 = qmk.f28987a;
                }
            }
            f = f2;
            u4n0.j(o2e.e0(s5x0.N(jm40.b, 0.0f, tqvVar instanceof sqv ? 16.0f : 0.0f, 0.0f, f, 5), "WIDGETS_GROUP"), cev0Var, z, cmlVar, function1, function2, fetVar, 524160 & i2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var, (Object) uqvVar, z, (Object) cmlVar, function1, function2, i, (byte) 9);
        }
    }

    public static final void C(mm40 mm40Var, p6x p6xVar, fet fetVar, int i) {
        Object objN;
        fetVar.g0(71288020);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(p6xVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.s(mm40Var, 10.0f), 2.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                int iOrdinal = p6xVar.ordinal();
                jm40 jm40Var = jm40.b;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        objN = s5x0.N(jm40Var, 0.0f, 28.0f, 0.0f, 0.0f, 13);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        objN = null;
                    }
                    objP = objN;
                } else {
                    objP = jm40Var;
                }
                fetVar.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(1372128161);
                fetVar.r(false);
            } else {
                fetVar.e0(1372128162);
                a(0, fetVar, mm40Var2);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qym(mm40Var, p6xVar, i, b);
        }
    }

    public static final void D(mm40 mm40Var, String str, zum zumVar, fet fetVar, int i) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-242684429);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(zumVar) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 14.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (zumVar instanceof yum) {
                fetVar2.e0(-2035863197);
                rcb.x(null, ((yum) zumVar).f43275a, h2m.f12341a, nsm0.y(fgm.b), true, null, fetVar2, 384);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2035568821);
                fetVar2.r(false);
            }
            f1t0.a(null, str2, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var2, (Object) str, (Object) zumVar, i, (byte) 21);
        }
    }

    public static final void E(mm40 mm40Var, sym symVar, fet fetVar, int i) {
        mm40 mm40Var2;
        gzm gzmVar;
        jm40 jm40Var;
        shd shdVar;
        shd shdVar2;
        fet fetVar2;
        boolean z;
        jm40 jm40Var2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(-80121753);
        int i2 = i | 6 | (fetVar4.g(symVar) ? 32 : 16);
        if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var3, 16.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarD);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z2 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar4, thg0VarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar5);
            jpm0.n(fetVar4);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar6);
            gzm gzmVar2 = symVar.c;
            fetVar4.e0(-1532299612);
            if (symVar.f33028a.length() > 0) {
                fetVar4.e0(1573244103);
                jm40Var = jm40Var3;
                gzmVar = gzmVar2;
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                j6n.h(symVar.f33028a, oro0.f25744a, s5x0.N(jm40Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar4, 48, 24);
                fetVar2 = fetVar4;
                fetVar2.r(false);
            } else {
                gzmVar = gzmVar2;
                jm40Var = jm40Var3;
                shdVar = shdVar6;
                shdVar2 = shdVar5;
                fetVar2 = fetVar4;
                fetVar2.e0(1573466528);
                fetVar2.r(false);
            }
            if (gzmVar.equals(dzm.f6947a)) {
                fetVar2.e0(1573564798);
                fetVar2.r(false);
                jm40Var2 = jm40Var;
                fetVar3 = fetVar2;
                z = true;
            } else if (gzmVar instanceof ezm) {
                fetVar2.e0(1573643538);
                jm40 jm40Var4 = jm40Var;
                mm40 mm40VarN = s5x0.N(jm40Var4, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar3);
                jpm0.o(fetVar2, bh90VarM2, shdVar4);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                ezm ezmVar = (ezm) gzmVar;
                rcb.x(null, dtb.S(ezmVar), h2m.c, nsm0.y(ezmVar.e), true, null, fetVar2, 384);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
                fetVar3 = fetVar2;
                jm40Var2 = jm40Var4;
            } else {
                z = true;
                jm40 jm40Var5 = jm40Var;
                if (!gzmVar.equals(fzm.f10414a)) {
                    throw b1j.f(1436231721, fetVar2, false);
                }
                fetVar2.e0(1574233034);
                jm40Var2 = jm40Var5;
                fetVar3 = fetVar;
                j6n.h("VAR", kro0.f18776a, s5x0.N(jm40Var5, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar3, 54, 24);
                fetVar3.r(false);
            }
            String str = symVar.b;
            long secondary = ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar3.k(j1t0.e)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
            fetVar4 = fetVar;
            fetVar4.r(false);
            fetVar4.r(true);
            mm40Var2 = jm40Var2;
        } else {
            fetVar4.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var2, symVar, i, (byte) 28);
        }
    }

    public static final void F(mm40 mm40Var, czm czmVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fetVar.g0(-85448540);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(czmVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var4, 24.0f), 1.0f);
            yx7 yx7Var = gqw0.k;
            byte b2 = 14;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4(b2)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            d280 d280Var = czmVar.b;
            d280 d280Var2 = czmVar.c;
            float f = (d280Var == null && d280Var2 == null) ? 0.0f : 2.0f;
            mm40 mm40Var5 = mm40Var4;
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4(b2)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            Object obj = ukd.f35823a;
            if (d280Var != null) {
                fetVar.e0(267461851);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new d1n(u6nVar, b);
                    fetVar.o0(objP2);
                }
                kkb.p(1, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(267856822);
                fetVar.r(false);
            }
            if (d280Var2 != null) {
                fetVar.e0(267908251);
                boolean zG3 = fetVar.g(d280Var2);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == obj) {
                    objP3 = new u6n(d4d.SECONDARY60, w6n.j, d280Var2);
                    fetVar.o0(objP3);
                }
                u6n u6nVar2 = (u6n) objP3;
                boolean zG4 = fetVar.g(u6nVar2);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == obj) {
                    objP4 = new d1n(u6nVar2, b);
                    fetVar.o0(objP4);
                }
                kkb.p(1, fetVar, null, (Function0) objP4);
                fetVar.r(false);
            } else {
                fetVar.e0(268303222);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, f, 0.0f, 0.0f, 0.0f, 14);
            String str = czmVar.f5231a;
            androidx.compose.runtime.d dVar = j1t0.e;
            ((g1t0) fetVar.k(dVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar.k(dVar)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.d().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 108528);
            fetVar.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lzm(mm40Var3, czmVar, i, i2, (byte) 1);
        }
    }

    public static final void G(mm40 mm40Var, hvm hvmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        long primary;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2073816332);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(hvmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            String str = hvmVar.f13732a;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            f1t0.a(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), str, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, y9q0VarD, 0L, fetVar, 0, 438264);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
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
            zfn zfnVar2 = bmd.n;
            int i3 = fetVar.k(zfnVar2) == k6z.b ? 2 : 1;
            obc.d(zfnVar2.a(k6z.f17794a), u1c.M(-1435614834, new i3l(hvmVar, (byte) 23), fetVar), fetVar, 56);
            String str2 = hvmVar.d;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(i3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (hvmVar.e.length() > 0) {
                fetVar2.e0(1179014930);
                if (hvmVar.f) {
                    fetVar2.e0(1179070575);
                    primary = ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                    z = false;
                    fetVar2.r(false);
                } else {
                    z = false;
                    fetVar2.e0(1179144851);
                    primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                    fetVar2.r(false);
                }
                v8q0.a(hvmVar.e, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), primary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                fetVar2.e0(1179478132);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var2, (Object) hvmVar, i, (byte) 29);
        }
    }

    public static final void H(z5l z5lVar, mm40 mm40Var, fet fetVar, int i) {
        z5lVar.getClass();
        fetVar.g0(1190153579);
        byte b = 2;
        int i2 = i | (fetVar.g(z5lVar) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.f(mm40Var, 0.0f, 0.0f, u1c.M(-1909833882, new e6l(z5lVar, b2), fetVar), u1c.M(1817161191, new e6l(z5lVar, b3), fetVar), null, null, null, null, u1c.M(-609384215, new e6l(z5lVar, b), fetVar), u1c.M(-1177356438, new e6l(z5lVar, (byte) 3), fetVar), fetVar, ((i2 >> 3) & 14) | 1769472, 432, 1950);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(z5lVar, mm40Var, i, (byte) 15);
        }
    }

    public static final void I(mm40 mm40Var, tym tymVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        y3d y3dVarF;
        y3d y3dVarF2;
        jm40 jm40Var;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-329532863);
        int i2 = i | 6 | (fetVar2.g(tymVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarS = o7k0.s(s5x0.N(jm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), 32.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 6.0f, 7), 12.0f), 1.0f);
            String str = tymVar.f34762a;
            String str2 = tymVar.c;
            String str3 = tymVar.b;
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (tymVar.d) {
                fetVar2.e0(-1050563614);
                y3dVarF = dw9.f(fetVar2, false, ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar2.e0(-1050505861);
                fetVar2.r(false);
                y3dVarF = null;
            }
            if (tymVar.e) {
                fetVar2.e0(-1050417790);
                y3dVarF2 = dw9.f(fetVar2, false, ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar2.e0(-1050360037);
                fetVar2.r(false);
                y3dVarF2 = null;
            }
            if (z) {
                fetVar2.e0(-1050304764);
                jm40Var = jm40Var2;
                pzb.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), ulb.Z(str3, fetVar2), y3dVarF, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-1050054997);
                sac.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), new dqm(ulb.Z(str3, fetVar2), y3dVarF), fetVar2, 0, 0);
                fetVar2.r(false);
            }
            if (z) {
                fetVar2.e0(-1049709688);
                pzb.n(null, ulb.Z(str2, fetVar2), y3dVarF2, fetVar2, 0, 1);
                fetVar2.r(false);
                z2 = true;
            } else {
                fetVar2.e0(-1049527377);
                z2 = true;
                sac.p(null, new dqm(ulb.Z(str2, fetVar2), y3dVarF2), fetVar2, 0, 1);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mzm(mm40Var2, tymVar, z, i, (byte) 1);
        }
    }

    public static final void J(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1644792695);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 136.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 17);
        }
    }

    public static final void K(mm40 mm40Var, tqv tqvVar, fet fetVar, int i) {
        tqv tqvVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1412741109);
        int i2 = i | 6 | (fetVar2.g(tqvVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = tqvVar instanceof qqv;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-585657938);
                zcl zclVar = qmk.f28987a;
                v8q0.a(((qqv) tqvVar).f29182a, o2e.e0(o7k0.e(s5x0.N(jm40Var, 16.0f, 16.0f, 0.0f, 16.0f, 4), 40.0f), "TITLE_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
                tqvVar2 = tqvVar;
                mm40Var2 = jm40Var;
            } else {
                tqvVar2 = tqvVar;
                if (tqvVar2.equals(rqv.f30950a)) {
                    fetVar2.e0(-585084531);
                    zcl zclVar2 = qmk.f28987a;
                    mm40Var2 = jm40Var;
                    mm40 mm40VarS = o7k0.s(s5x0.N(o7k0.e(s5x0.L(mm40Var2, 0.0f, 16.0f, 1), 40.0f), 16.0f, 10.0f, 0.0f, 10.0f, 4), 128.0f);
                    zcl zclVar3 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, false);
                } else {
                    mm40Var2 = jm40Var;
                    if (!tqvVar2.equals(sqv.f32646a)) {
                        throw b1j.f(-434536029, fetVar2, false);
                    }
                    fetVar2.e0(-584561995);
                    fetVar2.r(false);
                }
            }
        } else {
            tqvVar2 = tqvVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, tqvVar2, i, (byte) 11);
        }
    }

    public static final void L(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var) {
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        List list = qqsVar.c;
        int i = 0;
        if (CollectionsKt.W(0, qqsVar.c) == null && CollectionsKt.W(1, list) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ve90 ve90Var = (ve90) obj;
            String str = (String) CollectionsKt.firstOrNull(m9sVar.m);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            wrp wrpVar = new wrp(vsm0.t(str), m9sVar.i, ve90Var.b);
            String str3 = (String) CollectionsKt.firstOrNull(m9sVar.n);
            if (str3 != null) {
                str2 = str3;
            }
            wrp wrpVar2 = new wrp(vsm0.t(str2), m9sVar.j, ve90Var.c);
            String lowerCase = ctf0Var.b.a(R.string.fifa_half_title_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(new vrp(lowerCase, wrpVar, wrpVar2, ctf0Var.j()));
            i = i2;
        }
        lc00Var.add(new psv("MATCH_STATISTICS_HEADER_KEY", R.string.statistic_after_stat));
        lc00Var.add(new xrp(dyb.r0(arrayList)));
    }

    public static final vae0 M(mz40 mz40Var) {
        return new vae0(mz40Var, null);
    }

    public static final xae0 N(qz40 qz40Var) {
        return new xae0(qz40Var, null);
    }

    public static final void O(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((jth) cpVar.u).b;
        String str = ((cov) cpVar.u()).b.f32513a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }

    public static final void P(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((jth) cpVar.u).c;
        String str = ((cov) cpVar.u()).e.f39466a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }

    public static final bdd Q(float f, float f2, String str, String str2, boolean z) {
        str.getClass();
        return new bdd(Z(f, f2, z), Z(f2, f, z), str2, str, f % 1.0f == 0.0f ? String.valueOf((int) f) : String.valueOf(f), f2 % 1.0f == 0.0f ? String.valueOf((int) f2) : String.valueOf(f2));
    }

    public static final bdd R(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        String strValueOf = String.valueOf(i);
        return new bdd(a0(i, i2, z), a0(i2, i, z), str2, str, strValueOf, String.valueOf(i2));
    }

    public static final add S(String str, String str2, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        return new add(str, str2, ctf0Var.b.a(R.string.team, Arrays.copyOf(new Object[0], 0)), z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public static final sbx0 T(gmq gmqVar, int i) {
        int i2;
        htb.b0.getClass();
        int i3 = gtb.b;
        if (i >= i3) {
            i3 = i;
        }
        int i4 = i3 - i;
        if (gmqVar instanceof ktb) {
            ktb ktbVar = (ktb) gmqVar;
            i99 i99Var = ktbVar.c;
            gmq gmqVarK = ktbVar.k();
            if (gmqVarK != null) {
                int i5 = ktbVar.b;
                if (i5 != -3 && i5 != -2 && i5 != 0) {
                    i2 = i5;
                } else if (i99Var == i99.f14377a) {
                    if (i5 == 0) {
                        i2 = 0;
                    } else {
                        i2 = i4;
                    }
                } else if (i == 0) {
                    i4 = 1;
                    i2 = i4;
                } else {
                    i2 = 0;
                }
                return new sbx0((Object) gmqVarK, i2, (Object) i99Var, (Object) ktbVar.f18855a, (byte) 11);
            }
        }
        return new sbx0((Object) gmqVar, i4, (Object) i99.f14377a, (Object) kotlin.coroutines.g.f46065a, (byte) 11);
    }

    public static final mm40 U(mm40 mm40Var, boolean z) {
        mm40Var.getClass();
        return !z ? mm40Var : fnn0.a(mm40Var, Unit.f46060a, i54.k);
    }

    public static final Drawable V(int i, Context context) {
        Drawable drawableU = epv0.U(i, context);
        if (drawableU != null) {
            return drawableU;
        }
        c99.v(twn.m(i, "Invalid resource ID: "));
        return null;
    }

    public static final xww W(List list, boolean z) {
        list.getClass();
        int size = list.size();
        if (size == 0 || size == 1) {
            return new oww();
        }
        HistoryMenuItem historyMenuItem = (HistoryMenuItem) CollectionsKt.firstOrNull(list);
        return historyMenuItem != null ? k0(historyMenuItem, z) : new oww();
    }

    public static final String X(ctf0 ctf0Var, i3h0 i3h0Var, int i) {
        BigDecimal bigDecimalH;
        ldx ldxVar = i3h0Var.c.f4900a;
        String str = ldxVar.d;
        if (ldxVar.f19875a != i) {
            str = null;
        }
        String plainString = (str == null || (bigDecimalH = kotlin.text.b.h(str)) == null) ? null : bigDecimalH.toPlainString();
        if (plainString == null) {
            plainString = "";
        }
        String strF = plainString.length() > 0 ? ctf0Var.f(R.string.cricket_current_over, plainString) : null;
        return strF == null ? "" : strF;
    }

    public static final xww Y(List list, boolean z) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            return new oww();
        }
        if (size == 1) {
            HistoryMenuItem historyMenuItem = (HistoryMenuItem) CollectionsKt.firstOrNull(list);
            return historyMenuItem != null ? k0(historyMenuItem, z) : new oww();
        }
        if (size != 2) {
            return new qww();
        }
        HistoryMenuItem historyMenuItem2 = (HistoryMenuItem) CollectionsKt.W(1, list);
        return historyMenuItem2 != null ? k0(historyMenuItem2, z) : new oww();
    }

    public static final long Z(float f, float f2, boolean z) {
        if (z) {
            return f < f2 ? StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        return f > f2 ? StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(16033093);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 6.0f), 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40.b, 6.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), vgg0.a(3.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
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
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 20);
        }
    }

    public static final long a0(int i, int i2, boolean z) {
        if (z) {
            return i < i2 ? StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        return i > i2 ? StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        fet fetVar2;
        jm40 jm40Var;
        fetVar.g0(-1484756847);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (a4xVar.isEmpty()) {
                fetVar.e0(-223007193);
                fetVar.r(false);
            } else {
                fetVar.e0(-223723138);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1049734560, new eup(a4xVar, (byte) 10), fetVar), fetVar, 56);
                fetVar.r(false);
            }
            if (str.length() > 0) {
                fetVar.e0(-222949037);
                f1t0.a(null, str, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, (i2 >> 3) & 112, 438265);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(-222704633);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            jm40Var = jm40Var2;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            jm40Var = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl(jm40Var, (Object) a4xVar, (Object) str, i, (byte) 20);
        }
    }

    public static final boolean b0(long j, long j2) {
        return j == 99 || j2 == 99 || j == 66 || j2 == 66;
    }

    public static final q99 c(int i, i99 i99Var, Function1 function1) {
        if (i == -2) {
            if (i99Var != i99.f14377a) {
                return new h1e(1, i99Var, function1);
            }
            htb.b0.getClass();
            return new q99(gtb.b, function1);
        }
        if (i == -1) {
            if (i99Var == i99.f14377a) {
                return new h1e(1, i99.b, function1);
            }
            jf4.o("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return i99Var == i99.f14377a ? new q99(0, function1) : new h1e(1, i99Var, function1);
        }
        if (i != Integer.MAX_VALUE) {
            return i99Var == i99.f14377a ? new q99(i, function1) : new h1e(i, i99Var, function1);
        }
        return new q99(Integer.MAX_VALUE, function1);
    }

    public static final boolean c0(String str) {
        str.getClass();
        return str.length() < 2;
    }

    public static /* synthetic */ q99 d(int i, i99 i99Var, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            i99Var = i99.f14377a;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return c(i, i99Var, function1);
    }

    public static final void d0(cp cpVar, x2i x2iVar) {
        ExpressCardMiddleView expressCardMiddleView = ((uro) cpVar.u).f36174a;
        pkd.i((ComposeView) expressCardMiddleView.q.f, null, new ugd(-2007213957, true, new ann(((lhj) cpVar.u()).h.f16529a, new cgj(x2iVar, cpVar, (byte) 1), expressCardMiddleView, (byte) 11)));
    }

    public static final void e(z77 z77Var, Function1 function1, fet fetVar) {
        z77Var.getClass();
        function1.getClass();
        long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
        boolean z = z77Var instanceof y77;
        jm40 jm40Var = jm40.b;
        if (z) {
            fetVar.e0(-2052937490);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new bx((byte) 25, backgroundContent);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            xcm0.f(s5x0.K(mm40VarK, xfn.a(fetVar).d, 8.0f), ((y77) z77Var).g, function1, fetVar, 0, 0);
            fetVar.r(false);
            return;
        }
        fetVar.e0(-2052386155);
        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
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
        nia0.k(o7k0.d(jm40Var, 1.0f), z77Var.b(), function1, fetVar, 6);
        hmw0.c(o7k0.d(jm40Var, 1.0f), z77Var.f().e, function1, fetVar, 6);
        fetVar.r(true);
        fetVar.r(false);
    }

    public static final void e0(cp cpVar) {
        String strConcat;
        ExpressCardMiddleView expressCardMiddleView = ((uro) cpVar.u).f36174a;
        j3h0 j3h0Var = ((lhj) cpVar.u()).b.f14782a;
        Context context = cpVar.f40887a.getContext();
        context.getClass();
        String str = j3h0Var.b;
        rdj rdjVar = rdj.f30294a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        long j = j3h0Var.e;
        String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56);
        if (j3h0Var.f15833a) {
            long j2 = j3h0Var.d;
            if (j2 > 0) {
                strConcat = context.getString(R.string.line_live_time_period_capitalized_v2, String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2)));
                strConcat.getClass();
                if (strConcat.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(strConcat.charAt(0));
                    strValueOf.getClass();
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb.append((Object) upperCase);
                    sb.append(strConcat.substring(1));
                    strConcat = sb.toString();
                }
            } else {
                strConcat = "";
            }
            StringBuilder sb2 = new StringBuilder();
            if (!StringsKt.W(str)) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                sb2.append(context.getString(R.string.set_live_v2, lowerCase));
            }
            if (!StringsKt.W(str) && !StringsKt.W(strConcat)) {
                strConcat = ", ".concat(strConcat);
            }
            sb2.append(strConcat);
            sb2.append(" (");
            sb2.append(j3h0Var.f);
            sb2.append("-");
            strG = rz4.j(j3h0Var.g, Separators.RPAREN, sb2);
        }
        expressCardMiddleView.setScoreInfo(strG);
    }

    public static final void f(mm40 mm40Var, gnh gnhVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-894972062);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(gnhVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
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
            String str = gnhVar.f11586a;
            onh onhVar = gnhVar.f;
            k5n0.l(str, gnhVar.b, fetVar2, 0);
            jtt0.c(gnhVar.c, fetVar2, 0);
            n8n0.e(gnhVar.d, gnhVar.e, fetVar2, 0);
            fetVar2.r(true);
            if (onhVar instanceof mnh) {
                fetVar2.e0(783174405);
                ewm0.j((mnh) onhVar, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(783271466);
                fetVar2.r(false);
            }
            if (gnhVar.h) {
                fetVar2.e0(783316943);
                String str2 = gnhVar.g;
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str2, mm40VarD3, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(783558154);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, gnhVar, i, (byte) 17);
        }
    }

    public static final void f0(cp cpVar) {
        ExpressCardMiddleView expressCardMiddleView = ((uro) cpVar.u).f36174a;
        expressCardMiddleView.setSportIcon(((lhj) cpVar.u()).f20058a);
        expressCardMiddleView.setChampName(((lhj) cpVar.u()).c.b);
        expressCardMiddleView.setMatchName(((lhj) cpVar.u()).c.f13066a);
    }

    public static final void g(koh0 koh0Var, Function0 function0, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        koh0Var.getClass();
        function0.getClass();
        fetVar2.g0(-1299655775);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(koh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 60.0f), 12.0f, 0.0f, 12.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
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
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            dww.c(a8k0.F(R.drawable.ic_glyph_gift, 0, fetVar2), "", o2e.e0(o7k0.n(jr8Var.b(jm40Var, zx7Var), 24.0f), "giftIcon"), koh0Var.b, fetVar2, 56, 0);
            mm40 mm40VarB = jr8Var.b(o7k0.e(o7k0.s(jm40Var, 1.0f), 14.0f), gqw0.h);
            zfn zfnVar = zaq0.b;
            qxw.o(fetVar2, i120.Q(mm40VarB, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n));
            fetVar2.r(true);
            mm40 mm40VarL = twn.l(gqw0.k, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f));
            lh80 lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
            ugg0 ugg0VarA = vgg0.a(10.0f);
            lh80 lh80Var2 = ee9.f7659a;
            long secondaryButtonBackground = ((ThemeColors) fetVar2.k(zfnVar)).getSecondaryButtonBackground();
            long secondaryButtonForeground = ((ThemeColors) fetVar2.k(zfnVar)).getSecondaryButtonForeground();
            long secondary10 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary10();
            long secondary20 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary20();
            fetVar2 = fetVar;
            o050.g(function0, mm40VarL, koh0Var.f18630a, ugg0VarA, ee9.a(secondaryButtonBackground, secondaryButtonForeground, secondary10, secondary20, fetVar2, 0), null, lh80Var, u1c.M(-34998579, new sd8(koh0Var, (byte) 17), fetVar2), fetVar2, ((i2 >> 3) & 14) | 805306368, 352);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(koh0Var, function0, mm40Var, i, (byte) 15);
        }
    }

    public static final vae0 g0(gmq gmqVar, vne vneVar, lpj0 lpj0Var, int i) {
        sbx0 sbx0VarT = T(gmqVar, i);
        qoj0 qoj0VarA = roj0.a(i, sbx0VarT.b, (i99) sbx0VarT.d);
        return new vae0(qoj0VarA, qjj.V(vneVar, (CoroutineContext) sbx0VarT.e, lpj0Var.equals(kpj0.f18679a) ? yne.f42936a : yne.d, new xb2(lpj0Var, (gmq) sbx0VarT.c, qoj0VarA, roj0.f30841a, (yje) null)));
    }

    public static final void h(mm40 mm40Var, inh inhVar, fet fetVar, int i) {
        fetVar.g0(958679855);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(inhVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (inhVar instanceof gnh) {
            fetVar.e0(-1500782943);
            f(mm40Var, (gnh) inhVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!inhVar.equals(hnh.f13352a)) {
                throw b1j.f(-2126624287, fetVar, false);
            }
            fetVar.e0(-1500686998);
            J(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, inhVar, i, (byte) 3);
        }
    }

    public static final xae0 h0(gmq gmqVar, vne vneVar, lpj0 lpj0Var, Object obj) {
        sbx0 sbx0VarT = T(gmqVar, 1);
        p7m0 p7m0VarA = q7m0.a(obj);
        return new xae0(p7m0VarA, qjj.V(vneVar, (CoroutineContext) sbx0VarT.e, lpj0Var.equals(kpj0.f18679a) ? yne.f42936a : yne.d, new xb2(lpj0Var, (gmq) sbx0VarT.c, p7m0VarA, obj, (yje) null)));
    }

    public static final void i(mm40 mm40Var, wyh wyhVar, Function0 function0, Function0 function1, fet fetVar) {
        if (wyhVar instanceof uyh) {
            fetVar.e0(-976491165);
            j(mm40Var, (uyh) wyhVar, function0, function1, fetVar, 0);
            fetVar.r(false);
        } else if (!(wyhVar instanceof vyh)) {
            fetVar.e0(-206156480);
            fetVar.r(false);
        } else {
            fetVar.e0(-976483183);
            k(0, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final float i0(w6n w6nVar) {
        w6nVar.getClass();
        switch (w6nVar.ordinal()) {
            case 0:
                zcl zclVar = qmk.f28987a;
                return 96.0f;
            case 1:
                zcl zclVar2 = qmk.f28987a;
                return 80.0f;
            case 2:
                zcl zclVar3 = qmk.f28987a;
                return 72.0f;
            case 3:
                zcl zclVar4 = qmk.f28987a;
                return 64.0f;
            case 4:
                zcl zclVar5 = qmk.f28987a;
                return 56.0f;
            case 5:
                zcl zclVar6 = qmk.f28987a;
                return 48.0f;
            case 6:
                zcl zclVar7 = qmk.f28987a;
                return 44.0f;
            case 7:
                zcl zclVar8 = qmk.f28987a;
                return 40.0f;
            case 8:
                zcl zclVar9 = qmk.f28987a;
                return 36.0f;
            case 9:
                zcl zclVar10 = qmk.f28987a;
                return 32.0f;
            case 10:
                zcl zclVar11 = qmk.f28987a;
                return 28.0f;
            case 11:
                zcl zclVar12 = qmk.f28987a;
                return 24.0f;
            case 12:
                zcl zclVar13 = qmk.f28987a;
                return 20.0f;
            case 13:
                zcl zclVar14 = qmk.f28987a;
                return 16.0f;
            default:
                t9f.b();
                return 0.0f;
        }
    }

    public static final void j(mm40 mm40Var, uyh uyhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-932838048);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(uyhVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(mm40Var, 160.0f), 1.0f), vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            tyh tyhVar = uyhVar.e;
            fetVar2.e0(1558420773);
            ugg0 ugg0VarC = vgg0.c(0.0f, 16.0f, 0.0f, 0.0f, 13);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = yyw.V(o7k0.e(o7k0.s(lgb.J(jm40Var, ugg0VarC), 120.0f), 108.0f), fetVar2.k(bmd.n) == k6z.b);
            zx7 zx7Var = gqw0.c;
            jr8 jr8Var = jr8.f16991a;
            j0x.b(lv00.T(tyhVar.f34755a, null, null, null, fetVar, 0, 12), null, jr8Var.b(mm40VarV, zx7Var), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            fetVar.r(false);
            mm40 mm40VarM = s5x0.M(jm40Var, 16.0f, 16.0f, 96.0f, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
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
            v8q0.a(uyhVar.f36488a, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110586);
            v8q0.a(uyhVar.b, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 4, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            pzb.g(s5x0.M(jr8Var.b(jm40Var, gqw0.h), 16.0f, 0.0f, 16.0f, 16.0f), uyhVar.c, uyhVar.d, function0, function1, fetVar2, (i2 << 3) & 64512);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 24, i, (Object) mm40Var, (Object) uyhVar, (Object) function0, (Object) function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x085b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0865  */
    /* JADX WARN: Code duplicated, block: B:34:0x0206  */
    /* JADX WARN: Code duplicated, block: B:36:0x0210  */
    /* JADX WARN: Code duplicated, block: B:63:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0576  */
    /* JADX WARN: Code duplicated, block: B:90:0x0580  */
    public static final mim0 j0(long j, cys0 cys0Var, kbo kboVar, v5l0 v5l0Var, ctf0 ctf0Var, pim0 pim0Var) {
        hkm0 fkm0Var;
        hkm0 ckm0Var;
        jlm0 hlm0Var;
        jlm0 elm0Var;
        jlm0 jlm0Var;
        clm0 alm0Var;
        clm0 xkm0Var;
        vkm0 tkm0Var;
        vkm0 qkm0Var;
        okm0 mkm0Var;
        okm0 jkm0Var;
        boolean z = kboVar.i;
        String str = kboVar.f;
        String str2 = kboVar.e;
        int i = kboVar.m;
        List list = kboVar.o;
        String str3 = kboVar.h;
        String str4 = kboVar.g;
        String str5 = kboVar.d;
        String str6 = kboVar.b;
        String str7 = kboVar.c;
        String str8 = kboVar.f18023a;
        String str9 = kboVar.k;
        String str10 = kboVar.j;
        boolean z2 = kboVar.n;
        long j2 = kboVar.l;
        cys0Var.getClass();
        v5l0Var.getClass();
        ctf0Var.getClass();
        pim0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            switch (cys0Var.ordinal()) {
                case 0:
                    mpm mpmVarR = idm0.r(str4, str3, z);
                    String strP = idm0.p(z2, j2);
                    h1n h1nVarQ = idm0.q(str8, str6);
                    h1n h1nVarQ2 = idm0.q(str7, str5);
                    x0m x0mVar = x0m.f40076a;
                    fkm0Var = new fkm0(h1nVarQ, h1nVarQ2, mpmVarR, strP, str10, str9);
                    ckm0Var = fkm0Var;
                    return ckm0Var != null ? new zhm0(j, new k3i(), ckm0Var, pim0Var) : new shm0();
                case 1:
                    String strP2 = idm0.p(z2, j2);
                    c280 c280Var = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Pair) it.next()).f46059a);
                    }
                    ixm ixmVar = new ixm(str8, c280Var, str10, dyb.o0(arrayList));
                    c280 c280Var2 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((String) ((Pair) it2.next()).b);
                    }
                    ckm0Var = new ckm0(ixmVar, new ixm(str7, c280Var2, str9, dyb.o0(arrayList2)), strP2);
                    if (ckm0Var != null) {
                    }
                case 2:
                    String strP3 = idm0.p(z2, j2);
                    bzm bzmVar = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player));
                    bzm bzmVar2 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player));
                    azm azmVar = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    q6x q6xVar = q6x.f28221a;
                    fkm0Var = new gkm0(bzmVar, bzmVar2, azmVar, strP3, str10, str9);
                    ckm0Var = fkm0Var;
                    if (ckm0Var != null) {
                    }
                case 3:
                    String strP4 = idm0.p(z2, j2);
                    String str11 = kboVar.f18023a;
                    String str12 = kboVar.g;
                    pz40 pz40Var = s6t0.f31722a;
                    fkm0Var = new bkm0(str11, str12, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP4, str10, str9);
                    ckm0Var = fkm0Var;
                    if (ckm0Var != null) {
                    }
                case 4:
                    String strP5 = idm0.p(z2, j2);
                    bzm bzmVar3 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), null);
                    bzm bzmVar4 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), null);
                    azm azmVar2 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    q6x q6xVar2 = q6x.f28221a;
                    fkm0Var = new ekm0(bzmVar3, bzmVar4, azmVar2, strP5, str10, str9);
                    ckm0Var = fkm0Var;
                    if (ckm0Var != null) {
                    }
                case 5:
                    fkm0Var = new dkm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    ckm0Var = fkm0Var;
                    if (ckm0Var != null) {
                    }
                case 6:
                    ckm0Var = null;
                    if (ckm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal == 1) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP6 = idm0.p(z2, j2);
                    i1n i1nVar = new i1n(str8, str4);
                    i1n i1nVar2 = new i1n(str7, str3);
                    String strA = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar2 = x0m.f40076a;
                    hlm0Var = new hlm0(i1nVar, i1nVar2, strA, strP6, str10, str9);
                    jlm0Var = hlm0Var;
                    return jlm0Var != null ? new dim0(j, new k3i(), jlm0Var, pim0Var) : new shm0();
                case 1:
                    String strP7 = idm0.p(z2, j2);
                    ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add((String) ((Pair) it3.next()).f46059a);
                    }
                    jxm jxmVar = new jxm(dyb.o0(arrayList3), str8, str10);
                    ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add((String) ((Pair) it4.next()).b);
                    }
                    elm0Var = new elm0(jxmVar, new jxm(dyb.o0(arrayList4), str7, str9), strP7);
                    jlm0Var = elm0Var;
                    if (jlm0Var != null) {
                    }
                case 2:
                    String strP8 = idm0.p(z2, j2);
                    i1n i1nVar3 = new i1n(str8, str4);
                    i1n i1nVar4 = new i1n(str7, str3);
                    String strA2 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar3 = x0m.f40076a;
                    hlm0Var = new ilm0(i1nVar3, i1nVar4, strA2, strP8, str10, str9);
                    jlm0Var = hlm0Var;
                    if (jlm0Var != null) {
                    }
                case 3:
                    String strP9 = idm0.p(z2, j2);
                    i1n i1nVar5 = new i1n(str8, str4);
                    i1n i1nVar6 = new i1n(str7, str3);
                    x0m x0mVar4 = x0m.f40076a;
                    hlm0Var = new dlm0(i1nVar5, i1nVar6, strP9, str10, str9);
                    jlm0Var = hlm0Var;
                    if (jlm0Var != null) {
                    }
                case 4:
                    String strP10 = idm0.p(z2, j2);
                    i1n i1nVar7 = new i1n(str8, str4);
                    i1n i1nVar8 = new i1n(str7, str3);
                    String strA3 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar5 = x0m.f40076a;
                    hlm0Var = new glm0(i1nVar7, i1nVar8, strA3, strP10, str10, str9);
                    jlm0Var = hlm0Var;
                    if (jlm0Var != null) {
                    }
                case 5:
                    elm0Var = new flm0(jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    jlm0Var = elm0Var;
                    if (jlm0Var != null) {
                    }
                case 6:
                    jlm0Var = null;
                    if (jlm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal == 2) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP11 = idm0.p(z2, j2);
                    j1n j1nVar = new j1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), str4);
                    j1n j1nVar2 = new j1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), str3);
                    String strA4 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar6 = x0m.f40076a;
                    alm0Var = new alm0(j1nVar, j1nVar2, strA4, strP11, str10, str9);
                    xkm0Var = alm0Var;
                    return xkm0Var != null ? new cim0(j, new l3i(), xkm0Var, pim0Var) : new shm0();
                case 1:
                    String strP12 = idm0.p(z2, j2);
                    c280 c280Var3 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add((String) ((Pair) it5.next()).f46059a);
                    }
                    kxm kxmVar = new kxm(str8, c280Var3, str10, dyb.o0(arrayList5));
                    c280 c280Var4 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add((String) ((Pair) it6.next()).b);
                    }
                    xkm0Var = new xkm0(kxmVar, new kxm(str7, c280Var4, str9, dyb.o0(arrayList6)), strP12);
                    if (xkm0Var != null) {
                    }
                case 2:
                    String strP13 = idm0.p(z2, j2);
                    j1n j1nVar3 = new j1n(str8, null, str4);
                    j1n j1nVar4 = new j1n(str7, null, str3);
                    String strA5 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar7 = x0m.f40076a;
                    alm0Var = new blm0(j1nVar3, j1nVar4, strA5, strP13, str10, str9);
                    xkm0Var = alm0Var;
                    if (xkm0Var != null) {
                    }
                case 3:
                    String strP14 = idm0.p(z2, j2);
                    String str13 = kboVar.f18023a;
                    String str14 = kboVar.g;
                    pz40 pz40Var2 = s6t0.f31722a;
                    alm0Var = new wkm0(str13, ulb.U(i, true), str14, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, ulb.U(i, false), kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP14, str10, str9);
                    xkm0Var = alm0Var;
                    if (xkm0Var != null) {
                    }
                case 4:
                    String strP15 = idm0.p(z2, j2);
                    j1n j1nVar5 = new j1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), str4);
                    j1n j1nVar6 = new j1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), str3);
                    String strA6 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar8 = x0m.f40076a;
                    alm0Var = new zkm0(j1nVar5, j1nVar6, strA6, strP15, str10, str9);
                    xkm0Var = alm0Var;
                    if (xkm0Var != null) {
                    }
                case 5:
                    alm0Var = new ykm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    xkm0Var = alm0Var;
                    if (xkm0Var != null) {
                    }
                case 6:
                    xkm0Var = null;
                    if (xkm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal == 3) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP16 = idm0.p(z2, j2);
                    k1n k1nVar = new k1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player));
                    k1n k1nVar2 = new k1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player));
                    a2m a2mVarK = zcm0.k(str4, str3, z);
                    x0m x0mVar9 = x0m.f40076a;
                    tkm0Var = new tkm0(k1nVar, k1nVar2, a2mVarK, strP16, str10, str9);
                    qkm0Var = tkm0Var;
                    return qkm0Var != null ? new bim0(j, new m3i(), qkm0Var, pim0Var) : new shm0();
                case 1:
                    String strP17 = idm0.p(z2, j2);
                    c280 c280Var5 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList7 = new ArrayList(r3d.q(list, 10));
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add((String) ((Pair) it7.next()).f46059a);
                    }
                    lxm lxmVar = new lxm(str8, c280Var5, str10, dyb.o0(arrayList7));
                    c280 c280Var6 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList8 = new ArrayList(r3d.q(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add((String) ((Pair) it8.next()).b);
                    }
                    qkm0Var = new qkm0(lxmVar, new lxm(str7, c280Var6, str9, dyb.o0(arrayList8)), strP17);
                    if (qkm0Var != null) {
                    }
                case 2:
                    String strP18 = idm0.p(z2, j2);
                    bzm bzmVar5 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player));
                    bzm bzmVar6 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player));
                    azm azmVar3 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    q6x q6xVar3 = q6x.f28221a;
                    tkm0Var = new ukm0(bzmVar5, bzmVar6, azmVar3, strP18, str10, str9);
                    qkm0Var = tkm0Var;
                    if (qkm0Var != null) {
                    }
                case 3:
                    String strP19 = idm0.p(z2, j2);
                    String str15 = kboVar.f18023a;
                    String str16 = kboVar.g;
                    pz40 pz40Var3 = s6t0.f31722a;
                    tkm0Var = new pkm0(str15, ulb.U(i, true), str16, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, ulb.U(i, false), kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP19, str10, str9);
                    qkm0Var = tkm0Var;
                    if (qkm0Var != null) {
                    }
                case 4:
                    String strP20 = idm0.p(z2, j2);
                    bzm bzmVar7 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), null);
                    bzm bzmVar8 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), null);
                    azm azmVar4 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    q6x q6xVar4 = q6x.f28221a;
                    tkm0Var = new skm0(bzmVar7, bzmVar8, azmVar4, strP20, str10, str9);
                    qkm0Var = tkm0Var;
                    if (qkm0Var != null) {
                    }
                case 5:
                    tkm0Var = new rkm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    qkm0Var = tkm0Var;
                    if (qkm0Var != null) {
                    }
                case 6:
                    qkm0Var = null;
                    if (qkm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        switch (cys0Var.ordinal()) {
            case 0:
                String strP21 = idm0.p(z2, j2);
                k1n k1nVar3 = new k1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player));
                k1n k1nVar4 = new k1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player));
                a2m a2mVarP = ycm0.p(str4, str3, z);
                x0m x0mVar10 = x0m.f40076a;
                mkm0Var = new mkm0(k1nVar3, k1nVar4, a2mVarP, strP21, str10, str9);
                jkm0Var = mkm0Var;
                return jkm0Var != null ? new aim0(j, new m3i(), jkm0Var, pim0Var) : new shm0();
            case 1:
                String strP22 = idm0.p(z2, j2);
                c280 c280Var7 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                ArrayList arrayList9 = new ArrayList(r3d.q(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList9.add((String) ((Pair) it9.next()).f46059a);
                }
                lxm lxmVar2 = new lxm(str8, c280Var7, str10, dyb.o0(arrayList9));
                c280 c280Var8 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                ArrayList arrayList10 = new ArrayList(r3d.q(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList10.add((String) ((Pair) it10.next()).b);
                }
                jkm0Var = new jkm0(lxmVar2, new lxm(str7, c280Var8, str9, dyb.o0(arrayList10)), strP22);
                if (jkm0Var != null) {
                }
            case 2:
                String strP23 = idm0.p(z2, j2);
                bzm bzmVar9 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player));
                bzm bzmVar10 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player));
                azm azmVar5 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                q6x q6xVar5 = q6x.f28221a;
                mkm0Var = new nkm0(bzmVar9, bzmVar10, azmVar5, strP23, str10, str9);
                jkm0Var = mkm0Var;
                if (jkm0Var != null) {
                }
            case 3:
                String strP24 = idm0.p(z2, j2);
                String str17 = kboVar.f18023a;
                String str18 = kboVar.g;
                pz40 pz40Var4 = s6t0.f31722a;
                mkm0Var = new ikm0(str17, ulb.U(i, true), str18, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, ulb.U(i, false), kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP24, str10, str9);
                jkm0Var = mkm0Var;
                if (jkm0Var != null) {
                }
            case 4:
                String strP25 = idm0.p(z2, j2);
                bzm bzmVar11 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), null);
                bzm bzmVar12 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), null);
                azm azmVar6 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                q6x q6xVar6 = q6x.f28221a;
                mkm0Var = new lkm0(bzmVar11, bzmVar12, azmVar6, strP25, str10, str9);
                jkm0Var = mkm0Var;
                if (jkm0Var != null) {
                }
            case 5:
                mkm0Var = new kkm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                jkm0Var = mkm0Var;
                if (jkm0Var != null) {
                }
            case 6:
                jkm0Var = null;
                if (jkm0Var != null) {
                }
            default:
                t9f.b();
                return null;
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-252421165);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 160.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 16);
        }
    }

    public static final xww k0(HistoryMenuItem historyMenuItem, boolean z) {
        switch (historyMenuItem.ordinal()) {
            case 0:
                return new vww(z ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new);
            case 1:
                return new pww();
            case 2:
                return new oww();
            case 3:
                return new sww();
            case 4:
                return new nww();
            case 5:
                return new kww();
            case 6:
                return new tww();
            case 7:
                return new rww();
            case 8:
                return new uww();
            case 9:
                return new www();
            case 10:
                return new mww();
            case 11:
                return new lww();
            case 12:
                return new qww();
            default:
                t9f.b();
                return null;
        }
    }

    public static final long l(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void m(mm40 mm40Var, gol golVar, sh1 sh1Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        int i2;
        golVar.getClass();
        fetVar.g0(-773749338);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(golVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sh1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (golVar instanceof eol) {
            fetVar.e0(323329770);
            int iOrdinal = sh1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(323456684);
                p(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(323762282);
                n(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw b1j.f(-543759336, fetVar, false);
                }
                fetVar.e0(323456684);
                p(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else {
                fetVar.e0(324070267);
                r(mm40Var, (eol) golVar, function1, fetVar, ((i2 >> 6) & 896) | (i2 & 126));
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!golVar.equals(fol.f9886a)) {
                throw b1j.f(-543761231, fetVar, false);
            }
            fetVar.e0(324426612);
            int iOrdinal2 = sh1Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(324561834);
                q(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 == 1) {
                fetVar.e0(324742440);
                o(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw b1j.f(-543723954, fetVar, false);
                }
                fetVar.e0(324561834);
                q(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                fetVar.e0(324924937);
                s(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnl(mm40Var, golVar, sh1Var, function0, function1, i, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-134941878);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 128.0f), 66.0f);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new unl(function0, b);
                fetVar.o0(objP);
            }
            j0x.b(lv00.T(eolVar.b, eolVar.g, null, null, fetVar, 0, 12), null, lgb.J(s5x0.J(i120.Q(lgb.J(y860.W(mm40VarE, null, null, false, null, (Function0) objP, 28), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 2.0f), vgg0.a(14.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 5);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1792235632);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 128.0f), 66.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 11);
        }
    }

    public static final void p(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        eol eolVar2 = eolVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(777239864);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 29);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarW, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarJ, backgroundContent, ljcVar), 2.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ2);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            j0x.b(lv00.T(eolVar2.b, eolVar2.g, null, null, fetVar2, 0, 12), null, lgb.J(ny9.O(2.0f, new x7z(1.0f, true), false), vgg0.a(14.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 68.0f);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarL = twn.l(yx7Var, mm40VarS);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarM = s5x0.M(i120.Q(lgb.J(o7k0.t(jm40Var, 48.0f, 60.0f), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar), 4.0f, 4.0f, 6.0f, 4.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_cards, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            mm40 mm40VarU = o7k0.u(jm40Var, 18.0f, 0.0f, 2);
            eolVar2 = eolVar;
            String strL = ttm0.L(4, eolVar2.e);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(strL, mm40VarU, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.b(), fetVar, 0, 24576, 113656);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar2, function0, i, (byte) 4);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-133204158);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 16);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 13);
        }
    }

    public static final void r(mm40 mm40Var, eol eolVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        h4d h4dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(799466236);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = ((i2 & 112) == 32) | (i3 == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new nk1(function1, eolVar, (byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40VarW, vgg0.a(16.0f)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 2.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarJ2 = lgb.J(ny9.O(2.0f, new x7z(1.0f, true), false), vgg0.a(14.0f));
            mz3 mz3VarT = lv00.T(eolVar.b, eolVar.g, null, null, fetVar2, 0, 12);
            pge pgeVar = gqw0.A;
            if (eolVar.c) {
                h4dVar = null;
            } else {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                h4dVar2.b = fArrA;
                h4dVar = h4dVar2;
            }
            j0x.b(mz3VarT, null, mm40VarJ2, null, pgeVar, 0.0f, h4dVar, fetVar, 24624, 40);
            mm40 mm40VarL = twn.l(gqw0.k, o7k0.s(jm40.b, 48.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            boolean z3 = eolVar.c;
            boolean z4 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new ynk(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            f7k.k(null, tc00.f33696a, z3, false, (Function1) objP2, fetVar, 48, 9);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snl(mm40Var, eolVar, function1, i, (byte) 2);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-928767585);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 15);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 12);
        }
    }

    public static final void t(mm40 mm40Var, final qqm qqmVar, bgi0 bgi0Var, long j, fet fetVar, final int i, final int i2) {
        int i3;
        final bgi0 bgi0Var2;
        final long j2;
        fetVar.g0(-1444677890);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.g(bgi0Var) ? 256 : 128;
        }
        int i6 = i3 | 3072;
        if (fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (i5 != 0) {
                bgi0Var = zfi0.f44303a;
            }
            bgi0 bgi0Var3 = bgi0Var;
            long j3 = y3d.f;
            mm40 mm40VarQ = i120.Q(mm40Var, j3, jd8.n);
            int iOrdinal = qqmVar.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                mm40VarQ = s5x0.L(mm40VarQ, 16.0f, 0.0f, 2);
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            mbc.o(bgi0Var3, o2e.e0(o7k0.d(mm40VarQ, 1.0f), "DS_SEPARATOR"), false, fetVar, (i6 >> 6) & 14, 4);
            bgi0Var2 = bgi0Var3;
            j2 = j3;
        } else {
            fetVar.X();
            bgi0Var2 = bgi0Var;
            j2 = j;
        }
        final mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.aul
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vtb.t(mm40Var2, qqmVar, bgi0Var2, j2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void u(mm40 mm40Var, g7m g7mVar, fet fetVar, int i) {
        mm40 x7zVar;
        fetVar.g0(1629055268);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(g7mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(null) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4(b)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(1824056660);
            int i4 = 0;
            for (Object obj : CollectionsKt.D0(g7mVar.f10822a, 4)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                t2m t2mVar = (t2m) obj;
                if (i4 == 0) {
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                } else {
                    x7zVar = jm40.b;
                }
                vdb.w(x7zVar, t2mVar, null, fetVar, i3 & 896, 0);
                i4 = i5;
            }
            fetVar.r(false);
            fetVar.r(true);
            o2m o2mVar = g7mVar.b;
            fetVar.e0(1632859290);
            vdb.w(null, o2mVar, null, fetVar, i3 & 896, 1);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) g7mVar, i, (byte) 17);
        }
    }

    public static final void v(mm40 mm40Var, Function1 function1, vc50 vc50Var, fet fetVar, int i, int i2) {
        int i3;
        function1.getClass();
        vc50Var.getClass();
        fetVar.g0(-846407269);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        byte b = 16;
        int i5 = i3 | (fetVar.i(function1) ? 32 : 16) | (fetVar.g(vc50Var) ? 256 : 128) | 3072;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 56.0f, 1);
            int i6 = i5 & 112;
            boolean z = i6 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ynk(function1, (byte) 28);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i5 & 896) == 256) | (i6 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dpl(vc50Var, function1, b);
                fetVar.o0(objP2);
            }
            dwi0.b(function2, mm40VarG, (Function1) objP2, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tkm(mm40Var2, function1, vc50Var, i, i2, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, hvm hvmVar, hvm hvmVar2, String str, String str2, a4x a4xVar, zum zumVar, sem semVar, fet fetVar, int i) {
        int i2;
        a4x a4xVar2;
        String str3;
        a4xVar.getClass();
        fetVar.g0(1375085366);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hvmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hvmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g("") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(a4xVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.g(zumVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.g(semVar) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            mm40 mm40VarK0 = q8a.k0(o7k0.d(mm40Var, 1.0f), enx.f8115a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarK0, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            boolean zEquals = semVar.equals(pem.f26861a);
            jm40 jm40Var = jm40.b;
            int i3 = i2;
            if (zEquals || semVar.equals(qem.f28591a)) {
                fetVar.e0(2032224169);
                jeb.r(s5x0.L(o7k0.c(jm40Var, 1.0f), 4.0f, 0.0f, 2), semVar instanceof pem ? bhm.f2615a : bhm.b, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!semVar.equals(rem.f30342a)) {
                    throw b1j.f(-1319922732, fetVar, false);
                }
                fetVar.e0(-1319901290);
                fetVar.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            if ((zumVar instanceof yum) || str.length() > 0) {
                fetVar.e0(1282637704);
                D(null, str, zumVar, fetVar, ((i3 >> 6) & 1008) | ((i3 >> 12) & 7168));
                fetVar.r(false);
            } else {
                fetVar.e0(1282820294);
                fetVar.r(false);
            }
            G(null, hvmVar, fetVar, i3 & 112);
            G(null, hvmVar2, fetVar, (i3 >> 3) & 112);
            if (!a4xVar.isEmpty() || str2.length() > 0) {
                fetVar.e0(1283019872);
                str3 = str2;
                a4xVar2 = a4xVar;
                b(((i3 >> 15) & 112) | ((i3 >> 9) & 896), fetVar, a4xVar2, null, str3);
                fetVar.r(false);
            } else {
                fetVar.e0(1283179398);
                fetVar.r(false);
                str3 = str2;
                a4xVar2 = a4xVar;
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            a4xVar2 = a4xVar;
            str3 = str2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var, (Object) hvmVar, (Object) hvmVar2, (Object) str, (Object) str3, (Object) a4xVar2, (Object) zumVar, (Object) semVar, i, (byte) 2);
        }
    }

    public static final void x(mm40 mm40Var, jzm jzmVar, fet fetVar, int i) {
        boolean z;
        fetVar.g0(-513544421);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jzmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 20.0f, 5);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            mm40 mm40VarN2 = s5x0.N(ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 2.0f, 0.0f, 11);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
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
            E(null, jzmVar.g, fetVar, 0);
            F(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 4.0f, 5), jzmVar.f17421a, fetVar, 0, 0);
            F(null, jzmVar.b, fetVar, 0, 1);
            fetVar.r(true);
            p6x p6xVar = jzmVar.f;
            if (p6xVar == null) {
                fetVar.e0(-2026952453);
                fetVar.r(false);
            } else {
                fetVar.e0(-2026952452);
                C(s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13), p6xVar, fetVar, 0);
                fetVar.r(false);
            }
            tym tymVar = jzmVar.c;
            if (tymVar == null) {
                fetVar.e0(-2026725068);
                fetVar.r(false);
            } else {
                fetVar.e0(-2026725067);
                I(null, tymVar, false, fetVar, 384);
                fetVar.r(false);
            }
            tym tymVar2 = jzmVar.d;
            if (tymVar2 == null) {
                fetVar.e0(-2026552460);
                fetVar.r(false);
            } else {
                fetVar.e0(-2026552459);
                I(null, tymVar2, false, fetVar, 384);
                fetVar.r(false);
            }
            tym tymVar3 = jzmVar.e;
            if (tymVar3 == null) {
                fetVar.e0(-2026381867);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(-2026381866);
                z = true;
                I(null, tymVar3, true, fetVar, 384);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, jzmVar, i, (byte) 27);
        }
    }

    public static final void y(mm40 mm40Var, kqr kqrVar, fet fetVar, int i) {
        y9q0 y9q0VarU;
        StaticColors staticColors;
        long jM94getGamesTextVictory0d7_KjU;
        y9q0 y9q0VarU2;
        long jM94getGamesTextVictory0d7_KjU2;
        y9q0 y9q0VarU3;
        long jM94getGamesTextVictory0d7_KjU3;
        fet fetVar2 = fetVar;
        kqrVar.getClass();
        fetVar2.g0(-1743120936);
        int i2 = i | (fetVar2.g(kqrVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 256.0f, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            j0x.b(a8k0.F(R.drawable.bg_football_zones, 0, fetVar2), null, o7k0.p(jm40Var, 256.0f, 36.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40 mm40VarL = s5x0.L(o7k0.p(jm40Var, 256.0f, 28.0f), 20.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            k3w0 k3w0Var = kqrVar.f18735a;
            k3w0 k3w0Var2 = kqrVar.c;
            k3w0 k3w0Var3 = kqrVar.b;
            String value = k3w0Var.getValue();
            boolean z2 = k3w0Var instanceof g3w0;
            if (z2) {
                pz40 pz40Var = s6t0.f31722a;
                y9q0VarU = g1t0.m();
            } else if (!(k3w0Var instanceof i3w0)) {
                t9f.b();
                return;
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                y9q0VarU = g1t0.u();
            }
            y9q0 y9q0Var = y9q0VarU;
            if (z2) {
                staticColors = StaticColors.INSTANCE;
                jM94getGamesTextVictory0d7_KjU = staticColors.m123getWhite0d7_KjU();
            } else if (!(k3w0Var instanceof i3w0)) {
                t9f.b();
                return;
            } else {
                staticColors = StaticColors.INSTANCE;
                jM94getGamesTextVictory0d7_KjU = staticColors.m94getGamesTextVictory0d7_KjU();
            }
            StaticColors staticColors2 = staticColors;
            v8q0.a(value, mm40VarA, jM94getGamesTextVictory0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 130040);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            String value2 = k3w0Var3.getValue();
            boolean z3 = k3w0Var3 instanceof g3w0;
            if (z3) {
                y9q0VarU2 = g1t0.m();
            } else {
                if (!(k3w0Var3 instanceof i3w0)) {
                    t9f.b();
                    return;
                }
                y9q0VarU2 = g1t0.u();
            }
            y9q0 y9q0Var2 = y9q0VarU2;
            if (z3) {
                jM94getGamesTextVictory0d7_KjU2 = staticColors2.m123getWhite0d7_KjU();
            } else {
                if (!(k3w0Var3 instanceof i3w0)) {
                    t9f.b();
                    return;
                }
                jM94getGamesTextVictory0d7_KjU2 = staticColors2.m94getGamesTextVictory0d7_KjU();
            }
            v8q0.a(value2, mm40VarA2, jM94getGamesTextVictory0d7_KjU2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var2, fetVar, 0, 0, 130040);
            mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, true);
            String value3 = k3w0Var2.getValue();
            boolean z4 = k3w0Var2 instanceof g3w0;
            if (z4) {
                y9q0VarU3 = g1t0.m();
            } else {
                if (!(k3w0Var2 instanceof i3w0)) {
                    t9f.b();
                    return;
                }
                y9q0VarU3 = g1t0.u();
            }
            y9q0 y9q0Var3 = y9q0VarU3;
            if (z4) {
                jM94getGamesTextVictory0d7_KjU3 = staticColors2.m123getWhite0d7_KjU();
            } else {
                if (!(k3w0Var2 instanceof i3w0)) {
                    t9f.b();
                    return;
                }
                jM94getGamesTextVictory0d7_KjU3 = staticColors2.m94getGamesTextVictory0d7_KjU();
            }
            v8q0.a(value3, mm40VarA3, jM94getGamesTextVictory0d7_KjU3, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var3, fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, kqrVar, i, (byte) 22);
        }
    }

    public static final void z(final mm40 mm40Var, final xcz xczVar, final l7m0 l7m0Var, final dja djaVar, final boolean z, final Function1 function1, final Function1 function2, final Function2 function3, final Function2 function4, final Function1 function5, final Function1 function6, fet fetVar, final int i, final int i2) {
        int i3;
        int i4;
        char c;
        dja djaVar2;
        l7m0 l7m0Var2 = l7m0Var;
        l7m0Var2.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        fetVar.g0(2000026601);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.e(djaVar == null ? -1 : djaVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.i(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.i(function4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.i(function5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.i(function6) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new thd((byte) 24);
                fetVar.o0(objP);
            }
            pfk0 pfk0VarP = idx.P(xczVar, (xdr) objP, fetVar, ((i3 >> 3) & 14) | 24576, 14);
            Object[] objArr = {Boolean.valueOf(z)};
            boolean z2 = (i3 & 57344) == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new kg2((byte) 5, z);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP2, fetVar);
            int i5 = i3 & 112;
            boolean z3 = (i5 == 32) | ((3670016 & i3) == 1048576);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (z3 || objP3 == cl5Var) {
                objP3 = new aj6(xczVar, function2, yjeVar, (byte) 3);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, xczVar, (Function2) objP3);
            int i6 = i3 & 896;
            boolean z4 = ((i3 & 7168) == 2048) | (i6 == 256) | (i5 == 32);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                c = 0;
                g6q g6qVar = new g6q((Object) djaVar, (Object) l7m0Var2, (Object) xczVar, (yje) null, (byte) 26);
                djaVar2 = djaVar;
                l7m0Var2 = l7m0Var2;
                fetVar.o0(g6qVar);
                objP4 = g6qVar;
            } else {
                c = 0;
                djaVar2 = djaVar;
            }
            m0x0.v(djaVar2, l7m0Var2, (Function2) objP4, fetVar);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "GAME_CLASSIC_INFO_CARD_SECTION_LAZY_ROW_TAG");
            boolean z5 = i6 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new ufp(l7m0Var2, (byte) 4);
                fetVar.o0(objP5);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP5);
            boolean zBooleanValue = ((Boolean) l7m0VarY.getValue()).booleanValue();
            boolean z6 = ((i3 & 1879048192) == c) | (i6 == 256) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072) | ((i4 & 14) == 4) | ((i3 & 234881024) == 67108864);
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new bg0(l7m0Var2, function3, function1, function6, function5, function4);
                fetVar.o0(objP6);
            }
            b8k0.f(mm40VarA, xczVar, null, false, null, null, pfk0VarP, zBooleanValue, null, (Function1) objP6, fetVar, i5, 316);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.p2s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    vtb.z(mm40Var, xczVar, l7m0Var, djaVar, z, function1, function2, function3, function4, function5, function6, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }
}
