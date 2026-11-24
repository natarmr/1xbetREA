package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.javax.sip.message.Response;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kkb {
    public static final void A(int i, fet fetVar) {
        fetVar.g0(-1818423691);
        if (fetVar.U(i & 1, i != 0)) {
            j0x.l(iym0.r((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L)), 48, fetVar, o7k0.d(jm40.b, 1.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 29);
        }
    }

    public static final void B(String str, String str2, fet fetVar, int i) {
        String str3 = str;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1874453678);
        int i2 = i | (fetVar2.g(str3) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 0.0f, 0.0f, 8.0f, 0.0f, 11);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11).e(new x7z(1.0f, true)), "SecondTeamWinTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            str3 = str;
            k7x.b(str3, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "SecondTeamLogoTestTag"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, ((i2 >> 3) & 14) | 36912, 0, 32736);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 7, i, str3, str2);
        }
    }

    public static final void C(mm40 mm40Var, auf aufVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-196650720);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(aufVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(aufVar.f1476a, o2e.e0(jm40Var, "CUPHEAD_STAGE_TITLE_ITEM"), StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 0, 131064);
            fetVar2 = fetVar;
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fetVar2.e0(1034291502);
            int i3 = aufVar.b;
            int i4 = 0;
            while (i4 < i3) {
                fetVar2.b0(-1108421926, Integer.valueOf(i4));
                i4++;
                D(0, fetVar2, null, String.valueOf(i4), i4 < aufVar.c);
                fetVar2.r(false);
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var, aufVar, i, (byte) 13);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(322482983);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                StaticColors staticColors = StaticColors.INSTANCE;
                objP = dw9.e(z ? staticColors.m113getRed0d7_KjU() : staticColors.m125getWhite100d7_KjU(), fetVar);
            }
            long j = ((y3d) objP).f41946a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                StaticColors staticColors2 = StaticColors.INSTANCE;
                objP2 = dw9.e(z ? staticColors2.m123getWhite0d7_KjU() : staticColors2.m129getWhite400d7_KjU(), fetVar);
            }
            long j2 = ((y3d) objP2).f41946a;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.K(i120.S(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, StaticColors.INSTANCE.m129getWhite400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 2.0f), "CUPHEAD_STAGE_VALUE_ITEM");
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new nme(b, j);
                fetVar.o0(objP3);
            }
            v8q0.a(str, pai0.a(mm40VarE0, false, (Function1) objP3), j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.b, 0L, null, 0, 0, qmk.B, 16646109), fetVar, ((i2 >> 3) & 14) | 384, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var2, str, z, i, (byte) 1);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(725349722);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 28.0f), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "TITLE_CONTAINER_TAG");
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.p(), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 110584);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 28);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-846573239);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CUPHEAD_WINNER_TITLE_ITEM");
            y9q0 y9q0VarE = g1t0.e();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE0, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarE, fetVar2, ((i2 >> 3) & 14) | 48, 0, 131064);
            v8q0.a(str2, hne.i(1.0f, true, "CUPHEAD_WINNER_VALUE_ITEM"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public static final ArrayList G(jkb jkbVar) {
        List list;
        List list2 = null;
        if (jkbVar != null) {
            Object obj = jkbVar.b;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            ubb ubbVar = (ubb) obj;
            if (ubbVar != null) {
                list = ubbVar.f35371a;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (jkbVar != null) {
            Object obj2 = jkbVar.c;
            e0g0 e0g0Var2 = j0g0.b;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            ubb ubbVar2 = (ubb) obj2;
            if (ubbVar2 != null) {
                list2 = ubbVar2.f35371a;
            }
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final void H(cp cpVar) {
        Object objU = cpVar.u();
        yfu0 yfu0Var = cpVar.u;
        View view = cpVar.f40887a;
        int iOrdinal = ((nkr) objU).d.ordinal();
        if (iOrdinal == 1) {
            qux quxVar = (qux) yfu0Var;
            MaterialButton materialButton = quxVar.c;
            TypedValue typedValue = j5d.f15927a;
            Context context = view.getContext();
            context.getClass();
            jmu0.j(materialButton, ColorStateList.valueOf(j5d.a(context, R.attr.uikitBackgroundContent, false)));
            MaterialButton materialButton2 = quxVar.b;
            Context context2 = view.getContext();
            context2.getClass();
            jmu0.j(materialButton2, ColorStateList.valueOf(j5d.a(context2, R.attr.uikitPrimary, false)));
            Context context3 = view.getContext();
            context3.getClass();
            materialButton2.setTextColor(ColorStateList.valueOf(j5d.a(context3, R.attr.uikitBackgroundContent, false)));
            MaterialButton materialButton3 = quxVar.c;
            Context context4 = view.getContext();
            context4.getClass();
            materialButton3.setTextColor(ColorStateList.valueOf(j5d.a(context4, R.attr.uikitPrimary, false)));
            return;
        }
        if (iOrdinal != 2) {
            qux quxVar2 = (qux) yfu0Var;
            MaterialButton materialButton4 = quxVar2.c;
            TypedValue typedValue2 = j5d.f15927a;
            Context context5 = view.getContext();
            context5.getClass();
            jmu0.j(materialButton4, ColorStateList.valueOf(j5d.a(context5, R.attr.uikitBackgroundContent, false)));
            MaterialButton materialButton5 = quxVar2.b;
            Context context6 = view.getContext();
            context6.getClass();
            jmu0.j(materialButton5, ColorStateList.valueOf(j5d.a(context6, R.attr.uikitBackgroundContent, false)));
            Context context7 = view.getContext();
            context7.getClass();
            materialButton5.setTextColor(ColorStateList.valueOf(j5d.a(context7, R.attr.uikitPrimary, false)));
            MaterialButton materialButton6 = quxVar2.c;
            Context context8 = view.getContext();
            context8.getClass();
            materialButton6.setTextColor(ColorStateList.valueOf(j5d.a(context8, R.attr.uikitPrimary, false)));
            return;
        }
        qux quxVar3 = (qux) yfu0Var;
        MaterialButton materialButton7 = quxVar3.c;
        TypedValue typedValue3 = j5d.f15927a;
        Context context9 = view.getContext();
        context9.getClass();
        jmu0.j(materialButton7, ColorStateList.valueOf(j5d.a(context9, R.attr.uikitPrimary, false)));
        MaterialButton materialButton8 = quxVar3.c;
        Context context10 = view.getContext();
        context10.getClass();
        materialButton8.setTextColor(ColorStateList.valueOf(j5d.a(context10, R.attr.uikitBackgroundContent, false)));
        MaterialButton materialButton9 = quxVar3.b;
        Context context11 = view.getContext();
        context11.getClass();
        jmu0.j(materialButton9, ColorStateList.valueOf(j5d.a(context11, R.attr.uikitBackgroundContent, false)));
        Context context12 = view.getContext();
        context12.getClass();
        materialButton9.setTextColor(j5d.a(context12, R.attr.uikitPrimary, false));
    }

    public static final apg I(Integer num, Integer num2, ctf0 ctf0Var) {
        List list;
        ctf0Var.getClass();
        q4d q4dVar = ctf0Var.c;
        int iO = fem0.o(ctf0Var.f.a());
        us00 us00Var = q4dVar.f28092a;
        int iF = m5d.f(us00Var, R.attr.uikitPrimary, true, m5d.e(iO, us00Var));
        mc6.b.getClass();
        byte b = yk5.d(num).f21536a;
        int iIntValue = num2.intValue();
        if (b == 0) {
            list = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < b; i++) {
                if (i < iIntValue) {
                    arrayList.add(Boolean.TRUE);
                } else {
                    arrayList.add(Boolean.FALSE);
                }
            }
            list = arrayList;
        }
        return new apg(iF, num2.intValue(), list);
    }

    public static final a4x J(d0t d0tVar, dmr dmrVar, dmr dmrVar2) {
        List listD0;
        String strK = K(d0tVar, dmrVar);
        ArrayList arrayList = new ArrayList(strK.length());
        for (int i = 0; i < strK.length(); i++) {
            arrayList.add(Integer.valueOf(kotlin.text.a.a(strK.charAt(i))));
        }
        List listD1 = CollectionsKt.D0(arrayList, 5);
        if (listD1.size() == 5) {
            String strK2 = K(d0tVar, dmrVar2);
            ArrayList arrayList2 = new ArrayList(strK2.length());
            for (int i2 = 0; i2 < strK2.length(); i2++) {
                arrayList2.add(Integer.valueOf(kotlin.text.a.a(strK2.charAt(i2))));
            }
            listD0 = CollectionsKt.D0(arrayList2, 5);
        } else {
            listD0 = iun.f15405a;
        }
        ArrayList arrayListR = r3d.r(CollectionsKt.Q0(listD1, 3, 3));
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListR, 10));
        int i3 = 0;
        for (Object obj : arrayListR) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            dmr dmrVar3 = dmr.r;
            int i5 = R.drawable.transparent;
            if (dmrVar == dmrVar3) {
                switch (iIntValue) {
                    case 1:
                        i5 = R.drawable.ic_dice_white_1;
                        break;
                    case 2:
                        i5 = R.drawable.ic_dice_white_2;
                        break;
                    case 3:
                        i5 = R.drawable.ic_dice_white_3;
                        break;
                    case 4:
                        i5 = R.drawable.ic_dice_white_4;
                        break;
                    case 5:
                        i5 = R.drawable.ic_dice_white_5;
                        break;
                    case 6:
                        i5 = R.drawable.ic_dice_white_6;
                        break;
                }
            } else {
                switch (iIntValue) {
                    case 1:
                        i5 = R.drawable.ic_dice_black_1;
                        break;
                    case 2:
                        i5 = R.drawable.ic_dice_black_2;
                        break;
                    case 3:
                        i5 = R.drawable.ic_dice_black_3;
                        break;
                    case 4:
                        i5 = R.drawable.ic_dice_black_4;
                        break;
                    case 5:
                        i5 = R.drawable.ic_dice_black_5;
                        break;
                    case 6:
                        i5 = R.drawable.ic_dice_black_6;
                        break;
                }
            }
            boolean zContains = true;
            if (listD0.size() == 1 && ((Number) CollectionsKt.U(listD0)).intValue() == 0) {
                if (listD1.indexOf(CollectionsKt.i0(listD1)) != i3) {
                    zContains = false;
                }
            } else if (!listD0.isEmpty()) {
                zContains = listD0.contains(Integer.valueOf(i4));
            }
            arrayList3.add(new oem(i5, zContains));
            i3 = i4;
        }
        return dyb.o0(arrayList3);
    }

    public static final String K(d0t d0tVar, dmr dmrVar) {
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static final String L(Integer num, ctf0 ctf0Var) {
        if (num != null && num.intValue() == 0) {
            return ctf0Var.b.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
        }
        if (num != null && num.intValue() == 1) {
            return ctf0Var.b.a(R.string.dice_poker_round_number_name_without_dot_v2, Arrays.copyOf(new Object[]{2}, 1));
        }
        if (num != null && num.intValue() == 2) {
            return ctf0Var.b.a(R.string.dice_poker_round_number_name_without_dot_v2, Arrays.copyOf(new Object[]{3}, 1));
        }
        if (num != null && num.intValue() == 3) {
            return ctf0Var.b.a(R.string.dice_poker_round_number_name_without_dot_v2, Arrays.copyOf(new Object[]{3}, 1));
        }
        if (num != null && num.intValue() == 4) {
            return ctf0Var.b.a(R.string.dice_poker_end_game_win_v2, Arrays.copyOf(new Object[]{1}, 1));
        }
        if (num != null && num.intValue() == 5) {
            return ctf0Var.b.a(R.string.dice_poker_end_game_win_v2, Arrays.copyOf(new Object[]{2}, 1));
        }
        return (num != null && num.intValue() == 6) ? ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0)) : "";
    }

    public static final i0w M(int i) {
        switch (i) {
            case 1:
                return i0w.b;
            case 2:
                return i0w.c;
            case 3:
                return i0w.d;
            case 4:
                return i0w.e;
            case 5:
                return i0w.f;
            case 6:
                return i0w.g;
            case 7:
                return i0w.h;
            case 8:
                return i0w.i;
            default:
                return i0w.f13966a;
        }
    }

    public static final int N(HistoryMenuItem historyMenuItem) {
        historyMenuItem.getClass();
        switch (historyMenuItem.ordinal()) {
            case 0:
                return R.drawable.ic_glyph_notification_active;
            case 1:
                return R.drawable.ic_history_dialog_hide;
            case 2:
                return R.drawable.ic_history_dialog_copy;
            case 3:
                return R.drawable.ic_history_dialog_print;
            case 4:
                return R.drawable.ic_history_dialog_edit;
            case 5:
                return R.drawable.ic_history_dialog_autosale;
            case 6:
                return R.drawable.ic_history_dialog_sell;
            case 7:
                return R.drawable.ic_history_dialog_powerbet;
            case 8:
                return R.drawable.ic_history_dialog_share;
            case 9:
                return R.drawable.ic_history_dialog_transaction_history;
            case 10:
                return R.drawable.ic_duplicate_coupon;
            case 11:
                return R.drawable.ic_history_dialog_cancel;
            case 12:
                return R.drawable.ic_glyph_more_vertically;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final List O(pqo pqoVar) {
        pqoVar.getClass();
        int iOrdinal = pqoVar.b.ordinal();
        List list = null;
        if (iOrdinal == 0) {
            gie gieVar = pqoVar.h;
            zhe zheVar = gieVar instanceof zhe ? (zhe) gieVar : null;
            if (zheVar != null) {
                list = zheVar.f44389a;
            }
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            gie gieVar2 = pqoVar.i;
            zhe zheVar2 = gieVar2 instanceof zhe ? (zhe) gieVar2 : null;
            if (zheVar2 != null) {
                list = zheVar2.f44389a;
            }
        }
        return list == null ? iun.f15405a : list;
    }

    public static a1g P(boolean z, String str, long j, List list, Function1 function1, int i) {
        iun iunVar = iun.f15405a;
        List list2 = (i & 128) != 0 ? iunVar : list;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        iunVar.getClass();
        list2.getClass();
        return bkb.i0(bkb.h0(j, timeUnit, new ys8((Object) function1, z, (Object) new kie0(), (yje) null, (byte) 6)), str, 3, 3L, iunVar, list2, null, 32);
    }

    public static c4m0 Q(sje sjeVar, cfr0 cfr0Var, Function0 function0, int i) {
        int i2 = 2;
        yje yjeVar = null;
        if ((i & 2) != 0) {
            cfr0Var = null;
        }
        return sac.T(new fnq(new fnq(new vsg0(new pne(120000L, 0L, 1000L, null, (byte) 1)), new wi1(cfr0Var, yjeVar, (byte) 6)), new yg1((Object) function0, yjeVar, (byte) 14), (byte) 4), sjeVar, new f1e(i2, yjeVar, (byte) 26));
    }

    public static final ozc R(Integer num, q4f q4fVar) {
        Object next;
        q4fVar.getClass();
        if (q4fVar != q4f.e && q4fVar != q4f.g) {
            return ozc.POSSIBLE_PAYOUT;
        }
        c0o c0oVar = ozc.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            byte b = ((ozc) next).f26097a;
            if (num != null && b == num.intValue()) {
                break;
            }
        }
        ozc ozcVar = (ozc) next;
        return ozcVar == null ? ozc.POSSIBLE_PAYOUT : ozcVar;
    }

    public static final gmh S(jmh jmhVar) {
        jmhVar.getClass();
        Long l = jmhVar.f16764a;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = jmhVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = jmhVar.c;
        String strE = lmc.E(str2 != null ? str2 : "");
        Boolean bool = jmhVar.d;
        return new gmh(jLongValue, str, strE, bool != null ? bool.booleanValue() : false);
    }

    public static final cjm T(ArrayList arrayList) {
        bjm zimVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
        xim ximVar = xim.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u4s u4sVar = (u4s) it.next();
            long j = u4sVar.f35067a;
            o0x o0xVar = u4sVar.f;
            o0x o0xVar2 = u4sVar.e;
            o0x o0xVar3 = u4sVar.d;
            o0x o0xVar4 = u4sVar.c;
            int i = (int) j;
            int iOrdinal = u4sVar.b.ordinal();
            if (iOrdinal == 0) {
                zimVar = new zim(o0xVar4, o0xVar3, o0xVar2, o0xVar, numValueOf, 32);
            } else if (iOrdinal == 1) {
                zimVar = new yim(R.drawable.ic_glyph_all);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                zimVar = new ajm(o0xVar4, o0xVar3, o0xVar2, o0xVar, numValueOf, Integer.valueOf(R.drawable.ic_glyph_technical_works), 32);
            }
            arrayList2.add(new wim(i, zimVar, u4sVar.g));
        }
        return new cjm(dyb.r0(arrayList2), ximVar);
    }

    public static final syr U(y78 y78Var, d0t d0tVar, String str, String str2, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String strC0;
        d0tVar.getClass();
        boolean z6 = d0tVar.C;
        y78Var.getClass();
        str.getClass();
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        long j = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        if (d0tVar.v == 176) {
            strC0 = d0tVar.R;
        } else {
            strC0 = d0tVar.q.b.length() > 0 ? qzb.c0(d0tVar) : qzb.r0(d0tVar);
        }
        strC0.getClass();
        fus fusVar = new fus(z6 ? d0tVar.p.j : d0tVar.t, d0tVar.P.getTime(), z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar), true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String string = y78.n(y78Var, d0tVar, !(z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar)), false, 4).toString();
        int i = (4 & 62) != 0 ? -1 : 0;
        int i2 = (62 & 8) != 0 ? -1 : 0;
        int i3 = (62 & 16) != 0 ? -1 : 0;
        int i4 = (62 & 32) != 0 ? -1 : 0;
        string.getClass();
        return new syr(j, durVarY, qtrVarF0, strC0, fusVar, new oyr(axq.d(arrayList3, new zmk0(string, i, -1.0f, i2, i3, i4), arrayList2, arrayList3, arrayList2), z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar)), qtrVarF0.d.c);
    }

    public static final HistoryMenuItemUiModel V(HistoryMenuItem historyMenuItem, ctf0 ctf0Var) {
        int i;
        historyMenuItem.getClass();
        ctf0Var.getClass();
        switch (historyMenuItem.ordinal()) {
            case 0:
                i = R.string.mailing_managing_description;
                break;
            case 1:
                i = R.string.history_hide_bet;
                break;
            case 2:
                i = R.string.copy_number;
                break;
            case 3:
                i = R.string.print_text;
                break;
            case 4:
                i = R.string.edit_coupon;
                break;
            case 5:
                i = R.string.history_auto_sale;
                break;
            case 6:
                i = R.string.sell;
                break;
            case 7:
                i = R.string.powerbet;
                break;
            case 8:
                i = R.string.share;
                break;
            case 9:
                i = R.string.transaction_history_title;
                break;
            case 10:
                i = R.string.duplicate_coupon;
                break;
            case 11:
                i = R.string.autobet_cancel;
                break;
            case 12:
                i = R.string.tournaments_more;
                break;
            default:
                t9f.b();
                return null;
        }
        return new HistoryMenuItemUiModel(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), N(historyMenuItem), historyMenuItem);
    }

    public static final void a(uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1870615907);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(uzhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 74899) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            q7n q7nVar = uzhVar.s;
            ovl ovlVar = uzhVar.r;
            String str5 = ovlVar.b;
            tzh tzhVar = uzhVar.t;
            fetVar2.e0(-1955913063);
            String str6 = q7nVar.f28259a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarN = g1t0.n();
            Date date = q7nVar.b;
            mnl mnlVar = q7nVar.d;
            cwr0.o(null, str6, y9q0VarN, date, new qol(mnlVar.f22094a, mnlVar.b, mnlVar.c, mnlVar.d), tol.d, null, function4, fetVar2, ((i3 << 9) & 234881024) | 1572864);
            fetVar2 = fetVar2;
            fetVar2.r(false);
            if ((str5 == null || str5.length() == 0) && ((str = ovlVar.c) == null || str.length() == 0)) {
                fetVar2.e0(-1954558673);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1954959720);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String str7 = ovlVar.f25931a;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                e3c.f(mm40VarD, str7, g1t0.n(), str5 == null ? "" : str5, tzhVar.f34803a, ovlVar.c, fetVar, 6);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            a4x a4xVar = uzhVar.j;
            woo0 woo0Var = woo0.f39508a;
            if (a4xVar == null || a4xVar.isEmpty()) {
                fetVar2.e0(-1954014065);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1954476616);
                mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "GIFT_FOR_PROVIDERS_CONTAINER");
                String str8 = uzhVar.f;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarE0, str8, g1t0.n(), uzhVar.j, woo0Var, tzhVar.b, function0, fetVar2, ((i3 << 15) & 3670016) | 24582);
                fetVar2.r(false);
            }
            a4x a4xVar2 = uzhVar.k;
            if (a4xVar2 == null || a4xVar2.isEmpty()) {
                fetVar2.e0(-1953495249);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1953937619);
                mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40Var, 1.0f), "GIFT_FOR_GAMES_CONTAINER");
                String str9 = uzhVar.g;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarE1, str9, g1t0.n(), uzhVar.k, woo0Var, tzhVar.c, function1, fetVar2, ((i3 << 12) & 3670016) | 24582);
                fetVar2.r(false);
            }
            String str10 = uzhVar.h;
            if (str10 == null || str10.length() == 0 || (str4 = uzhVar.m) == null || str4.length() == 0) {
                fetVar2.e0(-1953124241);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1953387555);
                String str11 = uzhVar.h;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str11, g1t0.n(), uzhVar.m, tzhVar.d, fetVar2, 0);
                fetVar2.r(false);
            }
            String str12 = uzhVar.i;
            if (str12 == null || str12.length() == 0 || (str3 = uzhVar.n) == null || str3.length() == 0) {
                fetVar2.e0(-1952748273);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1953014470);
                String str13 = uzhVar.i;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str13, g1t0.n(), uzhVar.n, false, fetVar2, 0);
                fetVar2.r(false);
            }
            String str14 = uzhVar.o;
            if ((str14 == null || str14.length() == 0) && ((str2 = uzhVar.p) == null || str2.length() == 0)) {
                fetVar2.e0(-1952358417);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1952639029);
                pzb.l(uzhVar.o, uzhVar.p, function2, function3, fetVar2, (i3 >> 3) & 8064);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new anl(uzhVar, function0, function1, function2, function3, function4, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(uzh uzhVar, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        byte b;
        fet fetVar2;
        shd shdVar;
        pcy pcyVar;
        int i3;
        fet fetVar3;
        boolean z;
        fet fetVar4;
        fet fetVar5 = fetVar;
        String str = uzhVar.d;
        fetVar5.g0(1073221841);
        if ((i & 6) == 0) {
            i2 = i | (fetVar5.g(uzhVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar5.i(function0) ? 32 : 16;
        }
        if (fetVar5.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar2, zclVar2, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundGroup(), jd8.n);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarQ);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z2 = fetVar5.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar5.l(pcyVar2);
            } else {
                fetVar5.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar5, tj30VarC, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar4);
            jpm0.n(fetVar5);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar5);
            int length = str.length();
            jr8 jr8Var = jr8.f16991a;
            if (length > 0) {
                fetVar5.e0(1126098965);
                mm40 mm40VarE0 = o2e.e0(o7k0.p(jr8Var.b(jm40Var, gqw0.f), 168.0f, 120.0f), "GIFT_CARD_HEADER_IMAGE");
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM2 = fetVar5.m();
                mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarE0);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(pcyVar2);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, tj30VarC2, shdVar2);
                jpm0.o(fetVar5, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar5, shdVar4, fetVar5);
                jpm0.o(fetVar5, mm40VarC1, shdVar5);
                mm40 mm40VarA = jr8Var.a(jm40Var);
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                k7x.a(str, null, yyw.V(mm40VarA, fetVar5.k(bmd.n) == k6z.b), gqw0.A, null, fetVar5, 1572912, 1976);
                fet fetVar6 = fetVar5;
                fetVar6.r(true);
                i3 = 0;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                shdVar = shdVar5;
                pcyVar = pcyVar2;
                i3 = 0;
                fetVar5.e0(1126777431);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, i3);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarD2);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar2);
            jpm0.o(fetVar3, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar3, shdVar4, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar);
            mm40 mm40VarE2 = o7k0.e(s5x0.M(jm40Var, 12.0f, 12.0f, 144.0f, 16.0f), 66.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar3, 6);
            int iHashCode4 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM4 = fetVar3.m();
            mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarE2);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar2);
            jpm0.o(fetVar3, bh90VarM4, shdVar3);
            vqd.u(iHashCode4, fetVar3, shdVar4, fetVar3);
            jpm0.o(fetVar3, mm40VarC3, shdVar);
            mm40 mm40VarE3 = o7k0.e(jm40Var, 36.0f);
            tj30 tj30VarC3 = zq8.c(gqw0.e, false);
            int iHashCode5 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM5 = fetVar3.m();
            mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarE3);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC3, shdVar2);
            jpm0.o(fetVar3, bh90VarM5, shdVar3);
            vqd.u(iHashCode5, fetVar3, shdVar4, fetVar3);
            jpm0.o(fetVar3, mm40VarC4, shdVar);
            v3c.v(null, u1c.M(-1818631800, new bnl(uzhVar, (byte) 0), fetVar3), fetVar3, 384);
            fetVar3.r(true);
            mm40 mm40VarE1 = o2e.e0(jm40Var, "GIFT_CARD_HEADER_SUM_VALUE");
            String str2 = uzhVar.e;
            ((g1t0) fetVar3.k(j1t0.e)).getClass();
            fet fetVar7 = fetVar3;
            aad.e(str2, mm40VarE1, y9q0.a(g1t0.p(), ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, qmk.t, null, null, 16580606), null, 2, false, 1, 0, null, new n05(qmk.q, qmk.w, qmk.n), fetVar7, 1794096, 392);
            fetVar7.r(true);
            fetVar7.r(true);
            if (uzhVar.l) {
                fetVar7.e0(1129683278);
                mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, gqw0.c), 8.0f);
                long jM73getBlack400d7_KjU = ((StaticColors) fetVar7.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                zcl zclVar3 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                z = true;
                function1 = function0;
                fet fetVar8 = fetVar7;
                dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar7), null, o2e.e0(y860.Y(o7k0.n(i120.Q(mm40VarJ, jM73getBlack400d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 24.0f), false, null, null, function0, 15), "GIFT_CARD_HEADER_CLOSE_ICON"), y3d.g, fetVar8, 3128, 0);
                fetVar8.r(false);
                fetVar4 = fetVar8;
            } else {
                function1 = function0;
                z = true;
                fet fetVar9 = fetVar7;
                fetVar9.e0(1130409143);
                fetVar9.r(false);
                fetVar4 = fetVar9;
            }
            fetVar4.r(z);
            fetVar2 = fetVar4;
            b = z;
        } else {
            i = i;
            function1 = function0;
            b = 1;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yml(uzhVar, function1, i, b);
        }
    }

    public static final void c(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i) {
        int i2;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        fetVar.g0(-1370501572);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function5 = function0;
            i2 |= fetVar.i(function5) ? 256 : 128;
        } else {
            function5 = function0;
        }
        if ((i & 3072) == 0) {
            function6 = function1;
            i2 |= fetVar.i(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i & 24576) == 0) {
            function7 = function2;
            i2 |= fetVar.i(function7) ? 16384 : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i) == 0) {
            function8 = function3;
            i2 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i) == 0) {
            function9 = function4;
            i2 |= fetVar.i(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            zcl zclVar = qmk.i;
            int i3 = i2;
            mm40 mm40VarQ = i120.Q(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            a(uzhVar, function5, function6, function7, function8, function9, fetVar, (i3 >> 3) & 524286);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zml(mm40Var, uzhVar, function0, function1, function2, function3, function4, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, o43 o43Var, k43 k43Var, wz40 wz40Var, int i, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        mm40 mm40Var2;
        fetVar.g0(-1646621560);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(o43Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(k43Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(wz40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function1 = function0;
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            boolean zG = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | fetVar.g(g9q0VarN) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new zf(o43Var, function1, k43Var, wz40Var, g9q0VarN, i);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, i3 & 14, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xnl((byte) 3, i, i2, (wdr) function0, mm40Var2, (Object) o43Var, (Object) k43Var, (Object) wz40Var);
        }
    }

    public static final void e(mm40 mm40Var, pl7 pl7Var, Function1 function1, fet fetVar, int i) {
        Object acdVar;
        w2d w2dVar;
        xcz xczVar;
        pl7Var.getClass();
        function1.getClass();
        fetVar.g0(-1074396041);
        int i2 = i | (fetVar.g(pl7Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(pl7Var.e());
            boolean zI = ((i2 & 112) == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                w2dVar = w2dVarW0;
                xczVar = xczVarA;
                acdVar = new acd(pl7Var, w2dVar, xczVar, function1, null, (byte) 0);
                fetVar.o0(acdVar);
            } else {
                acdVar = objP;
                w2dVar = w2dVarW0;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) acdVar);
            xcz xczVar2 = xczVar;
            w2d w2dVar2 = w2dVar;
            v2n0.b(knm0.r(mm40Var), w2dVar2, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(-1784155294, new ywa((Object) w2dVar, (Object) pl7Var, (Object) function1, (byte) 15), fetVar), u1c.M(2052007454, new vbd(pl7Var, womVarF, w2dVar2, function1, xczVar2, (byte) 0), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbd(mm40Var, pl7Var, function1, i, (byte) 0);
        }
    }

    public static final void f(a4x a4xVar, final ehm0 ehm0Var, final ehm0 ehm0Var2, final ehm0 ehm0Var3, final ehm0 ehm0Var4, final ehm0 ehm0Var5, final ehm0 ehm0Var6, final ehm0 ehm0Var7, final db00 db00Var, final boolean z, final Function1 function1, mm40 mm40Var, fet fetVar, int i) {
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-1161472259);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.g(ehm0Var) ? 32 : 16) | (fetVar.g(ehm0Var2) ? 256 : 128) | (fetVar.g(ehm0Var3) ? 2048 : 1024) | (fetVar.g(ehm0Var4) ? 16384 : 8192) | (fetVar.g(ehm0Var5) ? 131072 : 65536) | (fetVar.g(ehm0Var6) ? 1048576 : 524288) | (fetVar.g(ehm0Var7) ? 8388608 : 4194304) | (fetVar.g(db00Var) ? 67108864 : 33554432) | (fetVar.h(z) ? 536870912 : 268435456);
        int i3 = (fetVar.i(function1) ? (char) 4 : (char) 2) | (fetVar.g(mm40Var) ? ' ' : (char) 16);
        if (fetVar.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            final List listD0 = CollectionsKt.D0(a4xVar, 4);
            List listE0 = a4xVar.size() > 4 ? CollectionsKt.E0(a4xVar.size() - 4, a4xVar) : iun.f15405a;
            mez mezVarQ = gfx.Q(fetVar);
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(mezVarQ);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new sfe(mezVarQ, null, (byte) 1);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, unit, (Function2) objP);
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            y3m0 y3m0Var = new y3m0(2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            lh80 lh80Var = new lh80(xfn.a(fetVar).e, 2.0f, xfn.a(fetVar).e, 24.0f);
            boolean zI = ((29360128 & i2) == 8388608) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.i(listD0) | ((i3 & 14) == 4) | ((1879048192 & i2) == 536870912) | ((3670016 & i2) == 1048576) | ((458752 & i2) == 131072) | ((i2 & 234881024) == 67108864) | fetVar.i(listE0);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                final List list = listE0;
                Object obj2 = new Function1() { // from class: a.jfe
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ehm0 ehm0Var8 = ehm0Var7;
                        boolean z2 = ehm0Var8.b;
                        ehm0 ehm0Var9 = ehm0Var4;
                        boolean z3 = ehm0Var9.b;
                        ehm0 ehm0Var10 = ehm0Var2;
                        boolean z4 = ehm0Var10.b;
                        ehm0 ehm0Var11 = ehm0Var;
                        boolean z5 = ehm0Var11.b;
                        xdz xdzVar = (xdz) obj3;
                        xdzVar.getClass();
                        ehm0 ehm0Var12 = ehm0Var3;
                        boolean z6 = ehm0Var12.b;
                        boolean z7 = z6 || z2 || z3 || z4 || z5;
                        bqd bqdVar = new bqd((byte) 5);
                        List list2 = listD0;
                        int size = list2.size();
                        at7 at7Var = new at7(bqdVar, list2, (byte) 26);
                        dx8 dx8Var = new dx8(list2, (byte) 19);
                        Function1 function2 = function1;
                        byte b = 1;
                        xdzVar.e(size, at7Var, dx8Var, null, new ugd(-1466459515, true, new vfe(list2, list2, z7, function2, (byte) 0)));
                        boolean z8 = z;
                        if (z6) {
                            xdz.d(xdzVar, new ugd(-323282334, true, new kfe(function2, ehm0Var12, z8, (byte) 4)));
                        }
                        if (z2) {
                            xdz.d(xdzVar, new ugd(1148930969, true, new lfe(ehm0Var8, function2, (byte) 1)));
                        }
                        if (z3) {
                            xdz.d(xdzVar, new ugd(1370842650, true, new kfe(ehm0Var9, z8, function2, (byte) 5)));
                            xdz.d(xdzVar, new ugd(115816337, true, new kfe(ehm0Var6, z8, function2, (byte) 6)));
                            xdz.d(xdzVar, new ugd(-1949263726, true, new kfe(ehm0Var5, z8, function2, (byte) 8)));
                        }
                        if (z4) {
                            xdz.d(xdzVar, new ugd(1592754331, true, new kfe(ehm0Var10, z8, function2, (byte) 10)));
                        }
                        db00 db00Var2 = db00Var;
                        if (db00Var2.a()) {
                            xdz.d(xdzVar, new ugd(1814666012, true, new mfe(db00Var2, z8, function2, (byte) 1)));
                        }
                        if (z5) {
                            xdz.d(xdzVar, new ugd(2036577693, true, new kfe(ehm0Var11, z8, function2, b)));
                        }
                        List list3 = list;
                        xdzVar.e(list3.size(), null, new dx8(list3, (byte) 18), null, new ugd(-334987442, true, new vb(list3, function2, (byte) 21)));
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj2);
                objP2 = obj2;
            }
            ydx.f(y3m0Var, mm40VarQ, mezVarQ, lh80Var, 8.0f, qw3Var, null, false, null, (Function1) objP2, fetVar, 0, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nfe(a4xVar, ehm0Var, ehm0Var2, ehm0Var3, ehm0Var4, ehm0Var5, ehm0Var6, ehm0Var7, db00Var, z, function1, mm40Var, i);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(1571135382);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            y9q0 y9q0VarK = g1t0.k();
            pz40 pz40Var = s6t0.f31722a;
            long secondary = s6t0.b().f33626a.getSecondary();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0VarK, fetVar2, (i2 >> 3) & 14, 24960, 109560);
            y9q0 y9q0VarR = g1t0.r();
            long textPrimary = s6t0.b().f33626a.getTextPrimary();
            if (2.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str2, new x7z(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, y9q0VarR, fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 14);
        }
    }

    public static final void h(buf bufVar, fet fetVar, int i) {
        fetVar.g0(1751252093);
        int i2 = (fetVar.g(bufVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            F(0, fetVar, s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 0.0f, 10), bufVar.f3228a, bufVar.b);
            x(s5x0.N(jm40Var, 12.0f, 4.0f, 12.0f, 0.0f, 8), bufVar.d, fetVar, 0);
            C(s5x0.M(jm40Var, 12.0f, 4.0f, 12.0f, 12.0f), bufVar.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnc(bufVar, i, (byte) 24);
        }
    }

    public static final void i(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-66847469);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            vuh vuhVar = (vuh) l7m0Var.getValue();
            if (vuhVar != null) {
                if (vuhVar instanceof uuh) {
                    fetVar.e0(184098401);
                    A(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = vuhVar instanceof tuh;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1412142254);
                        r(ir8Var.b(jm40Var, gqw0.e), ((tuh) vuhVar).e, function1, fetVar, i2 & 896);
                        fetVar.r(false);
                    } else if (vuhVar instanceof suh) {
                        fetVar.e0(1412394625);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        a4x a4xVar = ((suh) vuhVar).e;
                        boolean z2 = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new olh(function1, b);
                            fetVar.o0(objP);
                        }
                        gkb.c(a4xVar, mm40VarD, (Function1) objP, R.string.match_reviewe, fetVar, 48, 0);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(184096747, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i, (byte) 2);
        }
    }

    public static final void j(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2115824364);
        int i2 = i | 6 | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nme((byte) 10, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var2, j, i, (byte) 4);
        }
    }

    public static final void k(c4l c4lVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1907389763);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(c4lVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW2);
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
            String str = c4lVar.f3730a;
            zhg0 zhg0Var = zhg0.f44392a;
            z(0, fetVar, zhg0Var.a(1.0f, jm40Var, true), str);
            z(0, fetVar, zhg0Var.a(1.0f, jm40Var, true), c4lVar.b);
            fetVar.r(true);
            mm40 mm40VarW3 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarW3);
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
            a4x a4xVar = c4lVar.c;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            zcl zclVar = qmk.f28987a;
            y(0, fetVar, a4xVar, s5x0.N(mm40VarA, 0.0f, 0.0f, 4.0f, 0.0f, 11));
            y(0, fetVar, c4lVar.d, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 4.0f, 0.0f, 0.0f, 0.0f, 14));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(c4lVar, i, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i) {
        int i2;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        Function0 function10;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(-84585958);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function6 = function0;
            i2 |= fetVar.i(function6) ? 256 : 128;
        } else {
            function6 = function0;
        }
        if ((i & 3072) == 0) {
            function7 = function1;
            i2 |= fetVar.i(function7) ? 2048 : 1024;
        } else {
            function7 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function8 = function3;
            i2 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i) == 0) {
            function9 = function4;
            i2 |= fetVar.i(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        if ((12582912 & i) == 0) {
            function10 = function5;
            i2 |= fetVar.i(function10) ? 8388608 : 4194304;
        } else {
            function10 = function5;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), jd8.n), "GIFT_CARD_CONTAINER");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            b(uzhVar, function2, fetVar, (i3 & 14) | ((i2 >> 9) & 112));
            c(s5x0.N(s5x0.N(jr8.f16991a.b(jm40.b, gqw0.b), 4.0f, 0.0f, 4.0f, 4.0f, 2), 0.0f, 94.0f, 0.0f, 0.0f, 13), uzhVar, function6, function7, function8, function9, function10, fetVar, (i3 & 3670016) | (i2 & 8176) | (57344 & i3) | (458752 & i3));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wml(mm40Var, uzhVar, function0, function1, function2, function3, function4, function5, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x012e  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:118:0x0204  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void m(mm40 mm40Var, final String str, ro8 ro8Var, int i, long j, long j2, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        int i5;
        long j3;
        long j4;
        boolean z;
        final ro8 ro8Var2;
        final mm40 mm40Var3;
        final int i6;
        final long j5;
        final long j6;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        ro8 ro8Var3;
        int i7;
        long secondary;
        ro8 ro8Var4;
        int i8;
        long j7;
        int iOrdinal;
        y9q0 y9q0VarG;
        str.getClass();
        fetVar.g0(599453445);
        int i9 = i3 & 1;
        if (i9 != 0) {
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
            i4 |= fetVar.g(str) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= fetVar.e(ro8Var == null ? -1 : ro8Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                int i11 = fetVar.e(i5) ? 2048 : 1024;
                i4 |= i11;
            } else {
                i5 = i;
            }
            i4 |= i11;
        } else {
            i5 = i;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                j3 = j;
                int i12 = fetVar.f(j3) ? 16384 : 8192;
                i4 |= i12;
            } else {
                j3 = j;
            }
            i4 |= i12;
        } else {
            j3 = j;
        }
        int i13 = i3 & 32;
        if (i13 == 0) {
            if ((196608 & i2) == 0) {
                j4 = j2;
                i4 |= fetVar.f(j4) ? 131072 : 65536;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i9 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i10 != 0) {
                        ro8Var3 = ro8.c;
                    } else {
                        ro8Var3 = ro8Var;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        i7 = 3;
                    } else {
                        i7 = i5;
                    }
                    if ((i3 & 16) != 0) {
                        secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        i4 &= -57345;
                    } else {
                        secondary = j3;
                    }
                    if (i13 != 0) {
                        j7 = y3d.f;
                        ro8Var4 = ro8Var3;
                        i8 = i7;
                    } else {
                        ro8Var4 = ro8Var3;
                        i8 = i7;
                    }
                    fetVar.s();
                    iOrdinal = ro8Var4.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(549156500);
                        ((g1t0) fetVar.k(j1t0.e)).getClass();
                        y9q0VarG = g1t0.g();
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar.e0(549159280);
                        ((g1t0) fetVar.k(j1t0.e)).getClass();
                        y9q0VarG = g1t0.n();
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(549154040, fetVar, false);
                        }
                        fetVar.e0(549161908);
                        ((g1t0) fetVar.k(j1t0.e)).getClass();
                        y9q0VarG = g1t0.k();
                        fetVar.r(false);
                    }
                    y9q0 y9q0Var = y9q0VarG;
                    mm40 mm40VarQ = i120.Q(mm40Var4, j7, jd8.n);
                    zcl zclVar = qmk.f28987a;
                    long j8 = secondary;
                    v8q0.a(str, o2e.e0(o7k0.d(s5x0.L(mm40VarQ, 16.0f, 0.0f, 2), 1.0f), "DS_BOTTOM_SHEET_BODY_TEXT_PRESET"), j8, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, ((i4 >> 3) & 14) | ((i4 >> 6) & 896), (i4 >> 9) & 14, 130040);
                    j5 = j8;
                    ro8Var2 = ro8Var4;
                    j6 = j7;
                    mm40Var3 = mm40Var4;
                    i6 = i8;
                } else {
                    fetVar.X();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    ro8Var4 = ro8Var;
                    mm40Var4 = mm40Var2;
                    i8 = i5;
                    secondary = j3;
                }
                j7 = j4;
                fetVar.s();
                iOrdinal = ro8Var4.ordinal();
                if (iOrdinal == 0) {
                    fetVar.e0(549156500);
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0VarG = g1t0.g();
                    fetVar.r(false);
                } else if (iOrdinal == 1) {
                    fetVar.e0(549159280);
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0VarG = g1t0.n();
                    fetVar.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw b1j.f(549154040, fetVar, false);
                    }
                    fetVar.e0(549161908);
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0VarG = g1t0.k();
                    fetVar.r(false);
                }
                y9q0 y9q0Var2 = y9q0VarG;
                mm40 mm40VarQ2 = i120.Q(mm40Var4, j7, jd8.n);
                zcl zclVar2 = qmk.f28987a;
                long j9 = secondary;
                v8q0.a(str, o2e.e0(o7k0.d(s5x0.L(mm40VarQ2, 16.0f, 0.0f, 2), 1.0f), "DS_BOTTOM_SHEET_BODY_TEXT_PRESET"), j9, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 0, false, 0, 0, null, y9q0Var2, fetVar, ((i4 >> 3) & 14) | ((i4 >> 6) & 896), (i4 >> 9) & 14, 130040);
                j5 = j9;
                ro8Var2 = ro8Var4;
                j6 = j7;
                mm40Var3 = mm40Var4;
                i6 = i8;
            } else {
                fetVar.X();
                ro8Var2 = ro8Var;
                mm40Var3 = mm40Var2;
                i6 = i5;
                j5 = j3;
                j6 = j4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ttl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kkb.m(mm40Var3, str, ro8Var2, i6, j5, j6, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 196608;
        j4 = j2;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    ro8Var3 = ro8.c;
                } else {
                    ro8Var3 = ro8Var;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i7 = 3;
                } else {
                    i7 = i5;
                }
                if ((i3 & 16) != 0) {
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    i4 &= -57345;
                } else {
                    secondary = j3;
                }
                if (i13 != 0) {
                    j7 = y3d.f;
                    ro8Var4 = ro8Var3;
                    i8 = i7;
                } else {
                    ro8Var4 = ro8Var3;
                    i8 = i7;
                    j7 = j4;
                }
            } else {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    ro8Var3 = ro8.c;
                } else {
                    ro8Var3 = ro8Var;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i7 = 3;
                } else {
                    i7 = i5;
                }
                if ((i3 & 16) != 0) {
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    i4 &= -57345;
                } else {
                    secondary = j3;
                }
                if (i13 != 0) {
                    j7 = y3d.f;
                    ro8Var4 = ro8Var3;
                    i8 = i7;
                } else {
                    ro8Var4 = ro8Var3;
                    i8 = i7;
                    j7 = j4;
                }
            }
            fetVar.s();
            iOrdinal = ro8Var4.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(549156500);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarG = g1t0.g();
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(549159280);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarG = g1t0.n();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(549154040, fetVar, false);
                }
                fetVar.e0(549161908);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarG = g1t0.k();
                fetVar.r(false);
            }
            y9q0 y9q0Var3 = y9q0VarG;
            mm40 mm40VarQ3 = i120.Q(mm40Var4, j7, jd8.n);
            zcl zclVar3 = qmk.f28987a;
            long j10 = secondary;
            v8q0.a(str, o2e.e0(o7k0.d(s5x0.L(mm40VarQ3, 16.0f, 0.0f, 2), 1.0f), "DS_BOTTOM_SHEET_BODY_TEXT_PRESET"), j10, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 0, false, 0, 0, null, y9q0Var3, fetVar, ((i4 >> 3) & 14) | ((i4 >> 6) & 896), (i4 >> 9) & 14, 130040);
            j5 = j10;
            ro8Var2 = ro8Var4;
            j6 = j7;
            mm40Var3 = mm40Var4;
            i6 = i8;
        } else {
            fetVar.X();
            ro8Var2 = ro8Var;
            mm40Var3 = mm40Var2;
            i6 = i5;
            j5 = j3;
            j6 = j4;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ttl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kkb.m(mm40Var3, str, ro8Var2, i6, j5, j6, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(mm40 mm40Var, ltm ltmVar, fet fetVar, int i) {
        if (ltmVar instanceof gtm) {
            fetVar.e0(-1117683743);
            gtm gtmVar = (gtm) ltmVar;
            hkb.l(mm40Var, gtmVar.f11888a, gtmVar.b, gtmVar.c, gtmVar.d, gtmVar.e, gtmVar.f, gtmVar.g, gtmVar.h, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (ltmVar instanceof htm) {
            fetVar.e0(-1117067959);
            htm htmVar = (htm) ltmVar;
            nkb.i(mm40Var, htmVar.f13641a, htmVar.b, htmVar.c, htmVar.d, htmVar.e, htmVar.f, htmVar.g, htmVar.h, htmVar.i, htmVar.j, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (ltmVar instanceof itm) {
            fetVar.e0(-1116220171);
            itm itmVar = (itm) ltmVar;
            xkb.p(mm40Var, itmVar.f15360a, itmVar.b, itmVar.c, itmVar.d, itmVar.e, itmVar.f, itmVar.g, itmVar.h, itmVar.i, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (ltmVar instanceof jtm) {
            fetVar.e0(-1115570969);
            jtm jtmVar = (jtm) ltmVar;
            slb.o(mm40Var, jtmVar.f17106a, jtmVar.b, jtmVar.c, jtmVar.d, jtmVar.e, jtmVar.f, jtmVar.g, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (!(ltmVar instanceof ktm)) {
            throw b1j.f(-728790478, fetVar, false);
        }
        fetVar.e0(-1114997903);
        ktm ktmVar = (ktm) ltmVar;
        tlb.m(mm40Var, ktmVar.f18873a, ktmVar.b, ktmVar.c, ktmVar.d, ktmVar.e, ktmVar.f, ktmVar.g, ktmVar.h, ktmVar.i, fetVar, i & 14);
        fetVar.r(false);
    }

    public static final void o(mm40 mm40Var, v4o0 v4o0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        v4o0Var.getClass();
        fetVar.g0(1519441832);
        int i2 = i | 6 | (fetVar.g(v4o0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = v4o0Var instanceof o4o0;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar.e0(1031600181);
                o4o0 o4o0Var = (o4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(o4o0Var.f24649a), xcm0.r(o4o0Var.b), o4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            } else if (v4o0Var instanceof p4o0) {
                fetVar.e0(1032166954);
                p4o0 p4o0Var = (p4o0) v4o0Var;
                ovm ovmVar = p4o0Var.f26364a;
                jvm jvmVar = new jvm(ovmVar.f25932a, ovmVar.b, ovmVar.c, ovmVar.d);
                ovm ovmVar2 = p4o0Var.b;
                ntb.q(jm40Var, new dvm(jvmVar, new jvm(ovmVar2.f25932a, ovmVar2.b, ovmVar2.c, ovmVar2.d), p4o0Var.c, p4o0Var.d, p4o0Var.e, z), fetVar, 6);
                fetVar.r(false);
            } else if (v4o0Var instanceof q4o0) {
                fetVar.e0(1032827285);
                q4o0 q4o0Var = (q4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(q4o0Var.f28109a), xcm0.r(q4o0Var.b), q4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            } else if (v4o0Var instanceof s4o0) {
                fetVar.e0(1033388757);
                s4o0 s4o0Var = (s4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(s4o0Var.f31618a), xcm0.r(s4o0Var.b), s4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            } else if (v4o0Var instanceof u4o0) {
                fetVar.e0(1033956181);
                u4o0 u4o0Var = (u4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(u4o0Var.f35061a), xcm0.r(u4o0Var.b), u4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            } else if (v4o0Var instanceof r4o0) {
                fetVar.e0(1034518645);
                r4o0 r4o0Var = (r4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(r4o0Var.f29846a), xcm0.r(r4o0Var.b), r4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            } else {
                if (!(v4o0Var instanceof t4o0)) {
                    throw b1j.f(-105269524, fetVar, false);
                }
                fetVar.e0(1035080117);
                t4o0 t4o0Var = (t4o0) v4o0Var;
                e3c.i(jm40Var, new v0n(xcm0.r(t4o0Var.f33331a), xcm0.r(t4o0Var.b), t4o0Var.c, z), fetVar, 6);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 24, i, mm40Var2, (Object) v4o0Var, z);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        function0.getClass();
        if ((i & 1) != 0) {
            mm40Var = jm40.b;
        }
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        v6n v6nVar = (v6n) function0.invoke();
        if (v6nVar != null) {
            if (v6nVar instanceof t6n) {
                fetVar.e0(-2141583706);
                kbc.k(null, (t6n) v6nVar, fetVar, 0);
                fetVar.r(false);
            } else if (v6nVar instanceof u6n) {
                fetVar.e0(-2141581114);
                nkb.k(null, (u6n) v6nVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            return;
        }
        throw b1j.f(-2141586250, fetVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0257  */
    /* JADX WARN: Code duplicated, block: B:102:0x0259  */
    /* JADX WARN: Code duplicated, block: B:108:0x0278  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x0311  */
    /* JADX WARN: Code duplicated, block: B:116:0x0338  */
    /* JADX WARN: Code duplicated, block: B:118:0x0363  */
    /* JADX WARN: Code duplicated, block: B:119:0x0369  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x01db  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0231  */
    public static final void q(mm40 mm40Var, j43 j43Var, final k43 k43Var, fet fetVar, int i) {
        int i2;
        k43 k43Var2;
        fet fetVar2;
        gzc gzcVar;
        boolean z;
        Object objP;
        boolean z2;
        wz40 wz40Var;
        t33 t33Var;
        t33 t33Var2;
        gzc gzcVar2;
        gzc gzcVar3;
        s4u0 s4u0Var;
        wz40 wz40Var2;
        Object objP2;
        vne vneVar;
        Object objP3;
        pz40 pz40Var;
        boolean z3;
        boolean z4;
        final boolean z5;
        boolean z6;
        boolean zH;
        Object objP4;
        c0d c0dVar;
        wz40 wz40Var3;
        boolean z7;
        y9q0 y9q0VarB;
        g9q0 g9q0VarN;
        boolean zG;
        Object objP5;
        o43 o43Var;
        boolean zBooleanValue;
        ugd ugdVarM;
        int i3;
        uts0 uts0VarM0;
        wz40 wz40Var4;
        j43Var.getClass();
        fetVar.g0(835766960);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            k43Var2 = k43Var;
            i2 |= fetVar.g(k43Var2) ? 256 : 128;
        } else {
            k43Var2 = k43Var;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            c0d c0dVar2 = j43Var.c;
            String str = j43Var.f15865a;
            Object objP6 = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP6 == cl5Var) {
                objP6 = new wz40(c0d.f3518a);
                fetVar.o0(objP6);
            }
            wz40 wz40Var5 = (wz40) objP6;
            boolean zE = fetVar.e(c0dVar2.ordinal()) | fetVar.g(str);
            Object objP7 = fetVar.P();
            if (zE || objP7 == cl5Var) {
                objP7 = xf0.c(1.0f);
                fetVar.o0(objP7);
            }
            t33 t33Var3 = (t33) objP7;
            c0d c0dVar3 = c0d.d;
            boolean z8 = c0dVar2 == c0dVar3 && wz40Var5.f40005a == c0d.f3518a;
            c0d c0dVar4 = c0d.f3518a;
            boolean z9 = c0dVar2 == c0dVar4 && wz40Var5.f40005a == c0dVar3;
            boolean zE2 = fetVar.e(c0dVar2.ordinal()) | fetVar.g(str);
            Object objP8 = fetVar.P();
            if (zE2 || objP8 == cl5Var) {
                objP8 = xf0.c(1.0f);
                fetVar.o0(objP8);
            }
            t33 t33Var4 = (t33) objP8;
            boolean zE3 = fetVar.e(c0dVar2.ordinal()) | fetVar.g(str);
            Object objP9 = fetVar.P();
            if (zE3 || objP9 == cl5Var) {
                objP9 = z8 ? xf0.c(0.0f) : xf0.c(1.0f);
                fetVar.o0(objP9);
            }
            t33 t33Var5 = (t33) objP9;
            boolean zE4 = fetVar.e(c0dVar2.ordinal()) | fetVar.g(str);
            Object objP10 = fetVar.P();
            if (zE4 || objP10 == cl5Var) {
                objP10 = xf0.c(1.0f);
                fetVar.o0(objP10);
            }
            t33 t33Var6 = (t33) objP10;
            Object objP11 = fetVar.P();
            if (objP11 == cl5Var) {
                objP11 = new wz40(m5k0.a(k43Var2.d()));
                fetVar.o0(objP11);
            }
            wz40 wz40Var6 = (wz40) objP11;
            Object objP12 = fetVar.P();
            if (objP12 == cl5Var) {
                objP12 = new wz40(Boolean.TRUE);
                fetVar.o0(objP12);
            }
            final wz40 wz40Var7 = (wz40) objP12;
            Boolean bool = Boolean.TRUE;
            wz40Var7.f40005a = bool;
            Object objP13 = fetVar.P();
            if (objP13 == cl5Var) {
                objP13 = new wz40(bool);
                fetVar.o0(objP13);
            }
            wz40 wz40Var8 = (wz40) objP13;
            gzc gzcVarL = wha0.L(c0dVar2, (c0d) wz40Var5.f40005a, k43Var2.f());
            int i4 = i2;
            gzc gzcVarM = wha0.M(c0dVar2, (c0d) wz40Var5.f40005a, k43Var2.f(), fetVar);
            s4u0 s4u0VarO = wha0.O(gzcVarL, fetVar);
            s4u0 s4u0VarO2 = wha0.O(gzcVarM, fetVar);
            if (c0dVar2 == c0dVar4) {
                Object obj = wz40Var5.f40005a;
                gzcVar = gzcVarL;
                z = obj == c0d.b || obj == c0d.c;
                objP = fetVar.P();
                if (objP == cl5Var) {
                    z2 = z8;
                    wz40Var = wz40Var6;
                    t33Var = t33Var6;
                    t33Var2 = t33Var5;
                    gzcVar2 = gzcVar;
                    gzcVar3 = gzcVarM;
                    s4u0Var = s4u0VarO;
                    wz40 wz40Var9 = new wz40(new o43(j43Var, (c0d) wz40Var5.f40005a, k43Var2.b().f42262a.b, t33Var4, t33Var2, t33Var, wz40Var, t33Var3, s4u0Var, gzcVar2, gzcVar3, s4u0VarO2));
                    fetVar.o0(wz40Var9);
                    objP = wz40Var9;
                } else {
                    z2 = z8;
                    wz40Var = wz40Var6;
                    t33Var = t33Var6;
                    t33Var2 = t33Var5;
                    gzcVar2 = gzcVar;
                    gzcVar3 = gzcVarM;
                    s4u0Var = s4u0VarO;
                }
                wz40Var2 = (wz40) objP;
                if (z == 0) {
                    wz40Var2.f40005a = new o43(j43Var, (c0d) wz40Var5.f40005a, k43Var.b().f42262a.b, t33Var4, t33Var2, t33Var, wz40Var, t33Var3, s4u0Var, gzcVar2, gzcVar3, s4u0VarO2);
                }
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP2);
                }
                vneVar = (vne) objP2;
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP3);
                }
                pz40Var = (pz40) objP3;
                z3 = z;
                boolean zH2 = fetVar.h(z3) | fetVar.i(vneVar) | fetVar.e(c0dVar2.ordinal());
                if ((i4 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z2;
                z6 = z9;
                zH = zH2 | z4 | fetVar.h(z5) | fetVar.h(z6);
                objP4 = fetVar.P();
                if (!zH || objP4 == cl5Var) {
                    c0dVar = c0dVar2;
                    wz40Var3 = wz40Var2;
                    nxn nxnVar = new nxn(z3, vneVar, c0dVar, k43Var, wz40Var3, z5, z6, wz40Var5, pz40Var, null);
                    z7 = z3;
                    fetVar.o0(nxnVar);
                    objP4 = nxnVar;
                } else {
                    z7 = z3;
                    c0dVar = c0dVar2;
                    wz40Var3 = wz40Var2;
                }
                m0x0.v(c0dVar, str, (Function2) objP4, fetVar);
                y9q0VarB = k43Var.b();
                y9q0VarB.getClass();
                g9q0VarN = pym0.n(fetVar);
                zG = fetVar.g(y9q0VarB);
                objP5 = fetVar.P();
                if (zG || objP5 == cl5Var) {
                    objP5 = Integer.valueOf((int) (g9q0.a(g9q0VarN, "Hg", y9q0VarB, 0, 0, 0L, null, 1020).c & 4294967295L));
                    fetVar.o0(objP5);
                }
                final int iIntValue = ((Number) objP5).intValue();
                o43Var = (o43) wz40Var3.f40005a;
                zBooleanValue = ((Boolean) wz40Var8.f40005a).booleanValue();
                final wz40 wz40Var10 = wz40Var;
                final c0d c0dVar5 = c0dVar;
                final boolean z10 = z7;
                ugdVarM = u1c.M(1488192054, new xdr() { // from class: a.ixn
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        o43 o43Var2 = (o43) obj2;
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        o43Var2.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar3.g(o43Var2) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            c0d c0dVar6 = c0dVar5;
                            k43 k43Var3 = k43Var;
                            final long jN = wha0.N(c0dVar6, k43Var3, fetVar3);
                            final boolean z11 = z10;
                            boolean zH3 = fetVar3.h(z11);
                            final boolean z12 = z5;
                            boolean zH4 = zH3 | fetVar3.h(z12) | fetVar3.f(jN);
                            Object objP14 = fetVar3.P();
                            if (zH4 || objP14 == ukd.f35823a) {
                                final wz40 wz40Var11 = wz40Var10;
                                Function0 function0 = new Function0() { // from class: a.kxn
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (!z11 && !z12) {
                                            wz40Var11.f40005a = m5k0.a(jN);
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar3.o0(function0);
                                objP14 = function0;
                            }
                            kkb.d(null, o43Var2, k43Var3, wz40Var7, iIntValue, (Function0) objP14, fetVar3, ((iIntValue2 << 3) & 112) | 3072);
                        } else {
                            fetVar3.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                i3 = (i4 & 14) | 196608;
                uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.42f, 0.0f, 1.0f, 1.0f), 2);
                if (zBooleanValue) {
                    fetVar2 = fetVar;
                    wz40Var4 = wz40Var8;
                    fetVar2.e0(-759646881);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    ugdVarM.F(o43Var, fetVar2, 48);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    fetVar.e0(-759862083);
                    int i5 = ((i3 << 3) & 112) | 24576;
                    fetVar2 = fetVar;
                    wz40Var4 = wz40Var8;
                    jwb.d(phu0.Z(o43Var, "Crossfade", fetVar, 0, 0), mm40Var, uts0VarM0, null, ugdVarM, fetVar2, i5);
                    fetVar2.r(false);
                }
                wz40Var4.f40005a = Boolean.FALSE;
            } else {
                gzcVar = gzcVarL;
            }
            objP = fetVar.P();
            if (objP == cl5Var) {
                z2 = z8;
                wz40Var = wz40Var6;
                t33Var = t33Var6;
                t33Var2 = t33Var5;
                gzcVar2 = gzcVar;
                gzcVar3 = gzcVarM;
                s4u0Var = s4u0VarO;
                wz40 wz40Var11 = new wz40(new o43(j43Var, (c0d) wz40Var5.f40005a, k43Var2.b().f42262a.b, t33Var4, t33Var2, t33Var, wz40Var, t33Var3, s4u0Var, gzcVar2, gzcVar3, s4u0VarO2));
                fetVar.o0(wz40Var11);
                objP = wz40Var11;
            } else {
                z2 = z8;
                wz40Var = wz40Var6;
                t33Var = t33Var6;
                t33Var2 = t33Var5;
                gzcVar2 = gzcVar;
                gzcVar3 = gzcVarM;
                s4u0Var = s4u0VarO;
            }
            wz40Var2 = (wz40) objP;
            if (z == 0) {
                wz40Var2.f40005a = new o43(j43Var, (c0d) wz40Var5.f40005a, k43Var.b().f42262a.b, t33Var4, t33Var2, t33Var, wz40Var, t33Var3, s4u0Var, gzcVar2, gzcVar3, s4u0VarO2);
            }
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vneVar = (vne) objP2;
            objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40Var = (pz40) objP3;
            z3 = z;
            boolean zH3 = fetVar.h(z3) | fetVar.i(vneVar) | fetVar.e(c0dVar2.ordinal());
            if ((i4 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z2;
            z6 = z9;
            zH = zH3 | z4 | fetVar.h(z5) | fetVar.h(z6);
            objP4 = fetVar.P();
            if (zH) {
                c0dVar = c0dVar2;
                wz40Var3 = wz40Var2;
                nxn nxnVar2 = new nxn(z3, vneVar, c0dVar, k43Var, wz40Var3, z5, z6, wz40Var5, pz40Var, null);
                z7 = z3;
                fetVar.o0(nxnVar2);
                objP4 = nxnVar2;
            } else {
                c0dVar = c0dVar2;
                wz40Var3 = wz40Var2;
                nxn nxnVar3 = new nxn(z3, vneVar, c0dVar, k43Var, wz40Var3, z5, z6, wz40Var5, pz40Var, null);
                z7 = z3;
                fetVar.o0(nxnVar3);
                objP4 = nxnVar3;
            }
            m0x0.v(c0dVar, str, (Function2) objP4, fetVar);
            y9q0VarB = k43Var.b();
            y9q0VarB.getClass();
            g9q0VarN = pym0.n(fetVar);
            zG = fetVar.g(y9q0VarB);
            objP5 = fetVar.P();
            if (zG) {
                objP5 = Integer.valueOf((int) (g9q0.a(g9q0VarN, "Hg", y9q0VarB, 0, 0, 0L, null, 1020).c & 4294967295L));
                fetVar.o0(objP5);
            } else {
                objP5 = Integer.valueOf((int) (g9q0.a(g9q0VarN, "Hg", y9q0VarB, 0, 0, 0L, null, 1020).c & 4294967295L));
                fetVar.o0(objP5);
            }
            final int iIntValue2 = ((Number) objP5).intValue();
            o43Var = (o43) wz40Var3.f40005a;
            zBooleanValue = ((Boolean) wz40Var8.f40005a).booleanValue();
            final wz40 wz40Var12 = wz40Var;
            final c0d c0dVar6 = c0dVar;
            final boolean z11 = z7;
            ugdVarM = u1c.M(1488192054, new xdr() { // from class: a.ixn
                @Override // a.xdr
                public final Object F(Object obj2, Object obj3, Object obj4) {
                    o43 o43Var2 = (o43) obj2;
                    fet fetVar3 = (fet) obj3;
                    int iIntValue3 = ((Integer) obj4).intValue();
                    o43Var2.getClass();
                    if ((iIntValue3 & 6) == 0) {
                        iIntValue3 |= fetVar3.g(o43Var2) ? 4 : 2;
                    }
                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                        c0d c0dVar7 = c0dVar6;
                        k43 k43Var3 = k43Var;
                        final long jN = wha0.N(c0dVar7, k43Var3, fetVar3);
                        final boolean z12 = z11;
                        boolean zH4 = fetVar3.h(z12);
                        final boolean z13 = z5;
                        boolean zH5 = zH4 | fetVar3.h(z13) | fetVar3.f(jN);
                        Object objP14 = fetVar3.P();
                        if (zH5 || objP14 == ukd.f35823a) {
                            final wz40 wz40Var13 = wz40Var12;
                            Function0 function0 = new Function0() { // from class: a.kxn
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (!z12 && !z13) {
                                        wz40Var13.f40005a = m5k0.a(jN);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar3.o0(function0);
                            objP14 = function0;
                        }
                        kkb.d(null, o43Var2, k43Var3, wz40Var7, iIntValue2, (Function0) objP14, fetVar3, ((iIntValue3 << 3) & 112) | 3072);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            i3 = (i4 & 14) | 196608;
            uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.42f, 0.0f, 1.0f, 1.0f), 2);
            if (zBooleanValue) {
                fetVar.e0(-759862083);
                int i6 = ((i3 << 3) & 112) | 24576;
                fetVar2 = fetVar;
                wz40Var4 = wz40Var8;
                jwb.d(phu0.Z(o43Var, "Crossfade", fetVar, 0, 0), mm40Var, uts0VarM0, null, ugdVarM, fetVar2, i6);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                wz40Var4 = wz40Var8;
                fetVar2.e0(-759646881);
                tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                ugdVarM.F(o43Var, fetVar2, 48);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            wz40Var4.f40005a = Boolean.FALSE;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jxn(mm40Var, j43Var, k43Var, i, (byte) 0);
        }
    }

    public static final void r(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1156940121);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, (byte) 3);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 9);
        }
    }

    public static final void s(mm40 mm40Var, n8o n8oVar, Function0 function0, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(-109662563);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n8oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), n8oVar.b, kjm.f18392a, null, function0, null, fetVar, ((i2 << 6) & 57344) | 384, 40);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) n8oVar, (Object) function0, i, (byte) 2);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var, String str) {
        byte b;
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(-1093148568);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            b = 1;
            v8q0.a(str, s5x0.L(jm40.b, 16.0f, 0.0f, 2), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, b);
        }
    }

    public static final void u(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1717649858);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 8.0f, 0.0f, 0.0f, 0.0f, 14);
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
            jm40 jm40Var = jm40.b;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "FirstTeamLogoTestTag"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, ((i2 >> 3) & 14) | 36912, 0, 32736);
            str3 = str2;
            v8q0.a(str3, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "FirstTeamWinTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 8, i, str, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    public static final void v(a4x a4xVar, boolean z, fet fetVar, int i) {
        boolean z2;
        byte b;
        pz40 pz40Var;
        Object g6gVar;
        ?? r4;
        a4x a4xVar2 = a4xVar;
        a4xVar2.getClass();
        fetVar.g0(2131991594);
        int i2 = (fetVar.g(a4xVar2) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(a4xVar2);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var3 = (pz40) objP2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean z3 = (i3 == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                fns fnsVar = new fns(z, a4xVar2, pz40Var3, pz40Var2, (yje) null);
                z2 = z;
                a4xVar2 = a4xVar2;
                pz40Var = pz40Var3;
                pz40Var2 = pz40Var2;
                fetVar.o0(fnsVar);
                objP3 = fnsVar;
            } else {
                z2 = z;
                pz40Var = pz40Var3;
            }
            m0x0.v(boolValueOf, a4xVar2, (Function2) objP3, fetVar);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean z4 = i3 == 4;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                yje yjeVar = null;
                g6gVar = new g6g(a4xVar2, pz40Var, pz40Var2, yjeVar, (byte) 23);
                fetVar.o0(g6gVar);
                r4 = yjeVar;
            } else {
                g6gVar = objP4;
                r4 = 0;
            }
            m0x0.v(a4xVar2, bool, (Function2) g6gVar, fetVar);
            a4x a4xVar3 = z2 ? (a4x) pz40Var2.getValue() : a4xVar2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "TIC_TAC_TOE_GAME_PROGRESS");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            ozb.z(new psv("", R.string.game_progress), r4, fetVar, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            ?? r18 = r4;
            mm40 mm40VarL = s5x0.L(s5x0.N(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 8.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(xx7Var, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, 1213434930, a4xVar3);
            int i4 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw r18;
                }
                l8x.J((vfg0) next, fetVar, 0);
                if (i4 != a4xVar3.size() - 1) {
                    fetVar.e0(779788990);
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar, i120.Q(o7k0.e(o7k0.s(jm40Var, 0.5f), 100.0f), StaticColors.INSTANCE.m126getWhite200d7_KjU(), jd8.n));
                    fetVar.r(false);
                } else {
                    fetVar.e0(780062875);
                    fetVar.r(false);
                }
                i4 = i5;
            }
            b = 0;
            ohs0.x(fetVar, false, true, true);
        } else {
            z2 = z;
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gos(a4xVar, z2, i, b);
        }
    }

    public static final void w(d2z d2zVar, boolean z, fet fetVar, int i) {
        d2z d2zVar2 = d2zVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1034216832);
        int i2 = i | (fetVar2.g(d2zVar2) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 44.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, staticColors.m126getWhite200d7_KjU(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), "HeadToHeadHeaderTestTag");
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            u(d2zVar2.f5378a, d2zVar2.b, fetVar2, 6);
            if (d2zVar2.e.length() > 0) {
                fetVar2.e0(-2146419203);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                v8q0.a(d2zVar2.e, o2e.e0(s5x0.L(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 4.0f, 0.0f, 2), "OvertimesCountTestTag"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2146039298);
                fetVar2.r(false);
            }
            d2zVar2 = d2zVar;
            B(d2zVar2.c, d2zVar2.d, fetVar2, 6);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(d2zVar2, z, i, (byte) 26);
        }
    }

    public static final void x(mm40 mm40Var, ztf ztfVar, fet fetVar, int i) {
        ztf ztfVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1969141218);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ztfVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            nw3 nw3Var = uc9.g;
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar2, 54);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "CUPHEAD_HP_TITLE_ITEM");
            String str = ztfVar.f44956a;
            y9q0 y9q0VarE = g1t0.e();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE0, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarE, fetVar, 48, 0, 131064);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            ztfVar2 = ztfVar;
            v8q0.a(ztfVar2.b, o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), "CUPHEAD_HP_VALUE_ITEM"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            j0x.b(a8k0.F(ztfVar2.c, 0, fetVar2), null, o2e.e0(jm40Var, "CUPHEAD_HP_IMAGE_ITEM"), null, null, 0.0f, null, fetVar2, 440, 120);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            ztfVar2 = ztfVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var, ztfVar2, i, (byte) 14);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(1072389988);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1280801616, a4xVar);
            while (itO.hasNext()) {
                a5l a5lVar = (a5l) itO.next();
                fetVar.b0(664478342, a5lVar.f275a);
                jd8.u(a5lVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 6);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1085956556);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            str2 = str;
            v8q0.a(str2, o2e.e0(s5x0.L(s5x0.N(mm40VarD, 0.0f, 16.0f, 0.0f, 8.0f, 5), 8.0f, 0.0f, 2), "HeaderTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 25);
        }
    }
}
