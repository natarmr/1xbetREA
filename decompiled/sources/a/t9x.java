package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t9x {
    public static final void A(Class cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append(TokenNames.V);
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append(TokenNames.I);
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append(TokenNames.S);
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append(TokenNames.C);
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append(TokenNames.F);
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append(TokenNames.L);
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(Separators.SEMICOLON);
    }

    public static final void B(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((c6j0) yfu0Var).c.e).setChecked(((b6j0) cpVar.u()).f2057a);
        c6j0 c6j0Var = (c6j0) yfu0Var;
        ((DsCellMiddleTitle) c6j0Var.c.c).setTitle(R.string.vip_bet_title);
        ((DsSettingsCell) c6j0Var.c.d).setFirst(true);
        ((DsSettingsCell) c6j0Var.c.d).setLast(true);
    }

    public static final lel0 C(List list, cfl0 cfl0Var) {
        String strH = H(list, "disciplineHeader", cfl0Var != null ? cfl0Var.c : null);
        String strH2 = H(list, "disciplineHeaderTablet", cfl0Var != null ? cfl0Var.d : null);
        String strH3 = H(list, "defaultChamp", cfl0Var != null ? cfl0Var.e : null);
        String strH4 = H(list, "defaultChampTablet", cfl0Var != null ? cfl0Var.f : null);
        String strH5 = H(list, "defaultChampHeaderTablet", cfl0Var != null ? cfl0Var.g : null);
        String strH6 = H(list, "defaultChampHeader", cfl0Var != null ? cfl0Var.g : null);
        return new lel0(H(list, "disciplineIcon", cfl0Var != null ? cfl0Var.f4268a : null), H(list, "popularImage", cfl0Var != null ? cfl0Var.b : null), strH, strH2, strH3, strH4, strH6, strH5, H(list, "gameBackground", cfl0Var != null ? cfl0Var.i : null), H(list, "disciplineIconBW", ""), H(list, "feedImageVertical", cfl0Var != null ? cfl0Var.k : null), H(list, "feedImageHorizontal", cfl0Var != null ? cfl0Var.l : null), H(list, "feedImageSquare", cfl0Var != null ? cfl0Var.m : null), H(list, "disciplineIcon3D", ""), H(list, "eventFocusDisciplineHeader", ""), H(list, "headerFocusDisciplineHeader", ""), H(list, "defaultOpponentHeader", ""), H(list, "defaultOpponentHeaderTablet", ""));
    }

    public static final mva D(mva mvaVar, mva mvaVar2, mva mvaVar3, mva mvaVar4) {
        if (mvaVar4 == null) {
            return mvaVar3;
        }
        if (mvaVar instanceof ap00) {
            return (((mvaVar2 instanceof bp00) && (mvaVar4 instanceof bp00)) || (mvaVar4 instanceof zo00)) ? mvaVar4 : mvaVar;
        }
        return mvaVar4;
    }

    public static final Method E(ghy ghyVar, String str) {
        str.getClass();
        if (!(ghyVar instanceof elc)) {
            return null;
        }
        String strQ0 = StringsKt.q0(str, '(');
        if (strQ0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + ghyVar + '/' + str);
        }
        Method[] declaredMethods = ((elc) ghyVar).j().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Intrinsics.d(method.getName(), strQ0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append(Separators.LPAREN);
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    A(cls, sb);
                }
                sb.append(Separators.RPAREN);
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                A(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static og40 F(og40 og40Var, k6z k6zVar, y9q0 y9q0Var, w6k w6kVar, mrq mrqVar) {
        if (og40Var != null && k6zVar == og40Var.f25199a && afn0.A(y9q0Var, k6zVar).equals(og40Var.b) && w6kVar.getDensity() == og40Var.c.f43872a && mrqVar == og40Var.d) {
            return og40Var;
        }
        og40 og40Var2 = og40.h;
        if (og40Var2 != null && k6zVar == og40Var2.f25199a && afn0.A(y9q0Var, k6zVar).equals(og40Var2.b) && w6kVar.getDensity() == og40Var2.c.f43872a && mrqVar == og40Var2.d) {
            return og40Var2;
        }
        og40 og40Var3 = new og40(k6zVar, afn0.A(y9q0Var, k6zVar), new z6k(w6kVar.getDensity(), w6kVar.v0()), mrqVar);
        og40.h = og40Var3;
        return og40Var3;
    }

    public static final d280 G(ygs ygsVar) {
        ygsVar.getClass();
        String str = (String) CollectionsKt.W(0, ygsVar.q);
        if (str == null) {
            str = "";
        }
        return ygsVar.t ? new b280(R.drawable.ic_home) : new c280(vsm0.s(ygsVar.j, str), R.drawable.ic_glyph_placeholder_player);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    public static final String H(List list, String str, String str2) {
        Object next;
        qel0 qel0Var;
        String str3;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((wel0) next).f39024a, str));
            wel0 wel0Var = (wel0) next;
            if (wel0Var != null && (qel0Var = wel0Var.b) != null && (str3 = qel0Var.f28590a) != null) {
                str2 = str3;
            } else if (str2 == null) {
                str2 = "";
            }
        } else if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
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
        return sb.toString();
    }

    public static final d280 I(ygs ygsVar) {
        ygsVar.getClass();
        String str = (String) CollectionsKt.W(0, ygsVar.r);
        if (str == null) {
            str = "";
        }
        return ygsVar.t ? new b280(R.drawable.ic_away) : new c280(vsm0.s(ygsVar.k, str), R.drawable.ic_glyph_placeholder_player);
    }

    public static final boolean J(j700 j700Var) {
        j700Var.getClass();
        return q3d.j(j700.b, j700.c, j700.d).contains(j700Var);
    }

    public static final fei K(yx5 yx5Var) {
        fei feiVar;
        i0h0 i0h0VarP0 = yx5Var.p0();
        ycg ycgVar = i0h0VarP0 instanceof ycg ? (ycg) i0h0VarP0 : null;
        if (ycgVar != null && (feiVar = (fei) ((wcg) ycgVar).R1.getValue()) != null) {
            return feiVar;
        }
        jf4.n("Parent fragment isn`t CyberChampMainFragmentComponentHolder instance");
        return null;
    }

    public static final riu0 L(Object obj, xiu0 xiu0Var, i0h0 i0h0Var, fet fetVar, int i) {
        if ((i & 4) != 0) {
            i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
        }
        boolean zG = fetVar.g(xiu0Var) | fetVar.g(obj) | fetVar.g(i0h0Var);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            Bundle bundle = xiu0Var.c;
            wbf wbfVar = xiu0Var.d;
            miu0 miu0Var = xiu0Var.e;
            bundle.getClass();
            wbfVar.getClass();
            miu0Var.getClass();
            hz40 hz40Var = xiu0Var.a().b;
            Object objG = hz40Var.g(obj);
            if (objG == null) {
                objG = new viu0(obj);
                hz40Var.n(obj, objG);
            }
            piu0 piu0Var = ((viu0) objG).b;
            if (i0h0Var == null) {
                objP = new siu0(piu0Var, miu0Var, wbfVar, bundle);
            } else {
                kd30 kd30VarH = i0h0Var.h();
                glz glzVarX = i0h0Var.x();
                kd30VarH.getClass();
                glzVarX.getClass();
                objP = new n6r(kd30VarH, piu0Var, glzVarX, miu0Var, wbfVar, bundle);
            }
            fetVar.o0(objP);
        }
        riu0 riu0Var = (riu0) objP;
        boolean zI = fetVar.i(xiu0Var) | fetVar.i(obj);
        Object objP2 = fetVar.P();
        if (zI || objP2 == cl5Var) {
            objP2 = new dff0(xiu0Var, obj, (byte) 2);
            fetVar.o0(objP2);
        }
        m0x0.o(riu0Var, (Function1) objP2, fetVar);
        return riu0Var;
    }

    public static final boolean M(ygs ygsVar) {
        ygsVar.getClass();
        List list = ygsVar.q;
        List list2 = ygsVar.r;
        if (list.size() != 2 || list2.size() > 2) {
            return ygsVar.q.size() <= 2 && list2.size() == 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:29:0x0054->B:39:?, LOOP_END, SYNTHETIC] */
    public static final boolean N(ygs ygsVar) {
        Iterator it;
        ygsVar.getClass();
        boolean z = ygsVar.t;
        List list = ygsVar.r;
        List list2 = ygsVar.q;
        if (!z && !list2.isEmpty() && !list.isEmpty() && list2.size() > 2) {
            if (list2 == null || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).length() == 0) {
                    }
                }
                if (list.size() > 2) {
                    if (list == null && list.isEmpty()) {
                        return true;
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).length() == 0) {
                        }
                    }
                    return true;
                }
            } else if (list.size() > 2) {
                if (list == null) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).length() == 0) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final shp O(j700 j700Var) {
        j700Var.getClass();
        int iOrdinal = j700Var.ordinal();
        if (iOrdinal == 0) {
            return shp.LINE;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return shp.LIVE;
        }
        if (iOrdinal == 3) {
            return shp.CYBER;
        }
        t9f.b();
        return null;
    }

    public static final r010 P(w3h w3hVar) {
        long j;
        List list;
        Long l;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        List<p3h> list2;
        Integer num5;
        Long l2;
        Integer num6;
        Integer num7;
        Long l3;
        String str;
        String str2;
        Integer num8;
        Long l4;
        long jLongValue = (w3hVar == null || (l4 = w3hVar.f38502a) == null) ? 0L : l4.longValue();
        int iIntValue = (w3hVar == null || (num8 = w3hVar.b) == null) ? -1 : num8.intValue();
        String str3 = (w3hVar == null || (str2 = w3hVar.c) == null) ? "" : str2;
        String str4 = (w3hVar == null || (str = w3hVar.d) == null) ? "" : str;
        long jLongValue2 = (w3hVar == null || (l3 = w3hVar.e) == null) ? 0L : l3.longValue();
        int iIntValue2 = (w3hVar == null || (num7 = w3hVar.f) == null) ? 0 : num7.intValue();
        int iIntValue3 = (w3hVar == null || (num6 = w3hVar.g) == null) ? 0 : num6.intValue();
        if (w3hVar == null || (list2 = w3hVar.h) == null) {
            j = jLongValue;
            list = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            for (p3h p3hVar : list2) {
                arrayList.add(new o010((p3hVar == null || (l2 = p3hVar.f26300a) == null) ? 0L : l2.longValue(), (p3hVar == null || (num5 = p3hVar.b) == null) ? 0 : num5.intValue()));
                jLongValue = jLongValue;
            }
            j = jLongValue;
            list = arrayList;
        }
        t3h t3hVar = w3hVar != null ? w3hVar.i : null;
        q010 q010Var = new q010((t3hVar == null || (num4 = t3hVar.f33266a) == null) ? -1 : num4.intValue(), (t3hVar == null || (num3 = t3hVar.b) == null) ? -1 : num3.intValue(), (t3hVar == null || (num2 = t3hVar.c) == null) ? -1 : num2.intValue(), (t3hVar == null || (num = t3hVar.d) == null) ? -1 : num.intValue());
        StringBuilder sb = new StringBuilder(ujn.h);
        String strH = axq.h((w3hVar == null || (l = w3hVar.f38502a) == null) ? 0L : l.longValue(), "/sfiles/sppic1/cyber/lol/champions/", ".png");
        if (strH.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strH, ujn.h, false) || kotlin.text.c.x(strH, "https://", false)) {
            sb.setLength(0);
            sb.append(strH);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strH, '/'));
        }
        return new r010(j, iIntValue, str3, sb.toString(), str4, jLongValue2, iIntValue2, iIntValue3, list, q010Var);
    }

    public static final okp Q(j700 j700Var) {
        j700Var.getClass();
        int iOrdinal = j700Var.ordinal();
        if (iOrdinal == 0) {
            return okp.LINE;
        }
        if (iOrdinal == 1) {
            return okp.LIVE;
        }
        if (iOrdinal == 2) {
            return okp.LIVE;
        }
        if (iOrdinal == 3) {
            return okp.CYBER;
        }
        t9f.b();
        return null;
    }

    public static final b7c0 R(czc0 czc0Var, ctf0 ctf0Var, boolean z) {
        xyc0 xyc0Var;
        l85 l85Var;
        czc0Var.getClass();
        ctf0Var.getClass();
        tyc0 tyc0Var = czc0Var.f5218a;
        bzc0 bzc0Var = new bzc0(tyc0Var.f34747a, tyc0Var.b, true, tyc0Var.d);
        i4 i4VarR0 = null;
        if (z) {
            xyc0Var = xyc0.b;
        } else {
            int iOrdinal = czc0Var.b.ordinal();
            if (iOrdinal == 0) {
                xyc0Var = xyc0.f41702a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                xyc0Var = xyc0.b;
            }
        }
        if (tyc0Var.e) {
            lsm0 lsm0Var = ctf0Var.b;
            l85Var = new l85(lsm0Var.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
        } else {
            l85Var = null;
        }
        qlc0 qlc0Var = czc0Var.c;
        boolean z2 = qlc0Var.h;
        double d = qlc0Var.f28928a;
        String str = qlc0Var.c;
        if (z2) {
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA = lsm0Var2.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false), new nlc0(lsm0Var2.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), qlc0Var.b, false), qlc0Var.f ? new nlc0(lsm0Var2.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(qlc0Var.e, str, p3u0Var)), true) : null, qlc0Var.g ? new nlc0(lsm0Var2.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((qlc0Var.d - 1.0d) * d, str, p3u0Var)), true) : null}));
        }
        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 a.awj0, still in use, count: 3, list:
          (r4v0 a.awj0) from 0x00ce: MOVE (r5v2 a.awj0) = (r4v0 a.awj0) (LINE:207)
          (r4v0 a.awj0) from 0x00ae: MOVE (r5v6 a.awj0) = (r4v0 a.awj0) (LINE:175)
          (r4v0 a.awj0) from 0x00ac: MOVE (r5v8 a.awj0) = (r4v0 a.awj0) (LINE:173)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final a.awj0 S(a.rvj0 r19, java.lang.String r20, a.ctf0 r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t9x.S(a.rvj0, java.lang.String, a.ctf0, boolean):a.awj0");
    }

    public static final obk0 T(cl clVar) {
        clVar.getClass();
        int iOrdinal = clVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return obk0.SMS;
        }
        if (iOrdinal == 2) {
            return obk0.VOICE_SMS;
        }
        if (iOrdinal == 3) {
            return obk0.TELEGRAM;
        }
        if (iOrdinal == 4) {
            return obk0.FLASH_CALL;
        }
        if (iOrdinal == 5) {
            return null;
        }
        t9f.b();
        return null;
    }

    public static String U(long j) {
        return axq.h(j, "OffsetModel(packedValue=", Separators.RPAREN);
    }

    public static final void a(final boolean z, final double d, final t89 t89Var, final long j, final long j2, final mm40 mm40Var, fet fetVar, final int i) {
        int i2;
        fetVar.g0(1089698949);
        if ((i & 6) == 0) {
            i2 = (fetVar.d(6.0f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.c(d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(t89Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(mm40Var) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                Function1 function1 = new Function1() { // from class: a.ish0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                        vtm0 vtm0Var = new vtm0(fhlVar.w0(6.0f), 0.0f, 1, 0, null, 26);
                        float f = fIntBitsToFloat / 2.0f;
                        int i3 = z ? 1 : -1;
                        double d2 = f;
                        double d3 = d;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fIntBitsToFloat2 / 2.0f) + ((float) (Math.cos(Math.toRadians(d3)) * d2)))) & 4294967295L) | (((long) Float.floatToRawIntBits((i3 * ((float) (Math.sin(Math.toRadians(d3)) * d2))) + f)) << 32);
                        fhlVar.q(t89Var, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), vtm0Var);
                        zcl zclVar = qmk.f28987a;
                        fhl.E(fhlVar, j, fhlVar.w0(8.0f), jFloatToRawIntBits, 0.0f, null, 120);
                        fhl.E(fhlVar, j2, fhlVar.w0(6.0f), jFloatToRawIntBits, 0.0f, null, 120);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function1);
                objP = function1;
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, (i2 >> 18) & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jsh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t9x.a(z, d, t89Var, j, j2, mm40Var, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(wa00 wa00Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1235897833);
        int i2 = (fetVar2.g(wa00Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(o7k0.e(jm40Var, 180.0f), 12.0f, 4.0f, 12.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            a4x a4xVar = wa00Var.d;
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new goi0(wa00Var, (byte) 27);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new elk0(function1, (byte) 29);
                fetVar2.o0(objP2);
            }
            ibc.n(mm40VarD, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP2, fetVar, 3462, 16);
            fetVar2 = fetVar;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            mdm mdmVar = wa00Var.c;
            boolean z4 = i3 == 32;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new yhl0(function1, (byte) 25);
                fetVar2.o0(objP3);
            }
            jcb.l(null, mdmVar, true, (Function0) objP3, fetVar2, 384, 1);
            fetVar2.r(true);
            if (wa00Var.f) {
                fetVar2.e0(-1243895521);
                boolean z5 = i3 == 32;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new yhl0(function1, (byte) 22);
                    fetVar2.o0(objP4);
                }
                x1x.l(0, 2, fetVar2, null, (Function0) objP4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1243628363);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(wa00Var, function1, i, (byte) 2);
        }
    }

    public static final void c(ya00 ya00Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-240234249);
        int i2 = (fetVar.g(ya00Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 24.0f, 1);
            mdm mdmVar = ya00Var.c;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhl0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarL, mdmVar, true, (Function0) objP, fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(ya00Var, function1, i, (byte) 3);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        nw3 nw3Var = uc9.g;
        if ((i2 & 4) != 0) {
            ugdVar = null;
        }
        if ((i2 & 16) != 0) {
            ugdVar3 = null;
        }
        long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
        mm40 mm40VarY = o7k0.y(mm40Var, null, 3);
        boolean zF = fetVar.f(backgroundContent);
        Object objP = fetVar.P();
        if (zF || objP == ukd.f35823a) {
            objP = new dls((byte) 10, backgroundContent);
            fetVar.o0(objP);
        }
        mm40 mm40VarK = rq8.K(mm40VarY, (Function1) objP);
        x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, 0);
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
        mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
        y5d y5dVar = y5d.f42040a;
        if (ugdVar == null) {
            fetVar.e0(384994677);
        } else {
            fetVar.e0(982250508);
            ugdVar.j(y5dVar, mm40VarW, fetVar, Integer.valueOf((i & 896) | 54));
        }
        fetVar.r(false);
        ugdVar2.j(y5dVar, mm40VarW, fetVar, 438);
        if (ugdVar3 == null) {
            fetVar.e0(385098837);
        } else {
            fetVar.e0(982253868);
            ugdVar3.j(y5dVar, mm40VarW, fetVar, Integer.valueOf(((i >> 6) & 896) | 54));
        }
        fetVar.r(false);
        fetVar.r(true);
    }

    public static final void e(mm40 mm40Var, pz40 pz40Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(978583707);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pz40Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            qzb.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), new wul(iul.e, oe9.d, new se9(R.drawable.ic_glyph_plus_small), true, false, true), function0, fetVar, i2 & 896, 0);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(277889783, new w6y(b, pz40Var, function1), fetVar), fetVar, 56);
            if (((mn5) pz40Var.getValue()).c) {
                fetVar.e0(-1724153583);
                mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                boolean z = (i2 & 7168) == 2048;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new dbn(function1, (byte) 25);
                    fetVar.o0(objP);
                }
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar), null, y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(-1723626645);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6y(mm40Var, pz40Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void f(Function0 function0, mm40 mm40Var, tbz tbzVar, ibz ibzVar, fet fetVar, int i) {
        fetVar.g0(1055276397);
        int i2 = (fetVar.i(function0) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16) | (fetVar.g(tbzVar) ? 256 : 128) | (fetVar.g(ibzVar) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            wdx.j(u1c.M(-933153643, new x2g((Object) tbzVar, (Object) mm40Var, (Object) ibzVar, (Object) androidx.compose.runtime.e.f(function0, fetVar), (byte) 4), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) function0, mm40Var, (Object) tbzVar, (Object) ibzVar, i, (byte) 15);
        }
    }

    public static final void g(up20 up20Var, fet fetVar, int i) {
        fetVar.g0(-1874274487);
        int i2 = (i & 6) == 0 ? (fetVar.g(up20Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 4.0f, 0.0f, 0.0f, 13), "MAPS_IN_SERIES_BLOCK");
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
            fetVar.e0(-1964367558);
            for (wls wlsVar : up20Var.f36042a) {
                zcl zclVar2 = qmk.f28987a;
                ep20.a(s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2), wlsVar, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(up20Var, i, (byte) 25);
        }
    }

    public static final void h(mm40 mm40Var, kz20 kz20Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ugd ugdVar2 = ugdVar;
        function1.getClass();
        fetVar.g0(-462213549);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kz20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = kz20Var.e;
            byte b = 6;
            pzn pznVarA = kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3));
            alo aloVarA = kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3));
            ugd ugdVarM = u1c.M(-791776187, new gz20(kz20Var, function1, (byte) 4), fetVar);
            int i3 = i2;
            y5d y5dVar = y5d.f42040a;
            b34.e(y5dVar, z, null, pznVarA, aloVarA, null, ugdVarM, fetVar, 1600518, 18);
            b34.e(y5dVar, kz20Var.g, null, kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(728055086, new gz20(kz20Var, function1, (byte) 5), fetVar), fetVar, 1600518, 18);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            b34.e(y5dVar, kz20Var.j != null, s5x0.L(mm40VarQ, 8.0f, 0.0f, 2), kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(1212691917, new gz20(kz20Var, function1, b), fetVar), fetVar, 1600518, 16);
            ugdVar2 = ugdVar;
            ugdVar2.F(Long.valueOf(kz20Var.c), fetVar, Integer.valueOf((i3 >> 6) & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hz20(mm40Var, kz20Var, function1, ugdVar2, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    public static final void i(mm40 mm40Var, final qp30 qp30Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        cl5 cl5Var;
        boolean z;
        boolean z2;
        boolean z3;
        Object objP;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-1721712731);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(qp30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zF || objP2 == cl5Var2) {
                objP2 = new dls((byte) 27, backgroundContent);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var2) {
                objP3 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP3;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var2) {
                objP4 = new Function0() { // from class: a.xo30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        qp30 qp30Var2 = qp30Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                String str = qp30Var2.b;
                                str.getClass();
                                function2.invoke(new e27(str));
                                break;
                            case 1:
                                String str2 = qp30Var2.b;
                                str2.getClass();
                                function2.invoke(new d27(str2));
                                break;
                            default:
                                String str3 = qp30Var2.b;
                                str3.getClass();
                                function2.invoke(new i27(str3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP4);
            }
            mm40 mm40VarW = y860.W(mm40VarK, gy40Var, null, false, null, (Function0) objP4, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            String str = qp30Var.c;
            tvw tvwVar = qp30Var.d;
            String str2 = qp30Var.e;
            boolean z5 = qp30Var.f;
            a4x a4xVar = qp30Var.g;
            ec ecVar = qp30Var.h;
            boolean z6 = (i3 == 256) | (i4 == 32);
            Object objP5 = fetVar2.P();
            if (z6 || objP5 == cl5Var2) {
                objP5 = new Function0() { // from class: a.xo30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        qp30 qp30Var2 = qp30Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                String str3 = qp30Var2.b;
                                str3.getClass();
                                function2.invoke(new e27(str3));
                                break;
                            case 1:
                                String str4 = qp30Var2.b;
                                str4.getClass();
                                function2.invoke(new d27(str4));
                                break;
                            default:
                                String str5 = qp30Var2.b;
                                str5.getClass();
                                function2.invoke(new i27(str5));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP5);
            }
            vdx.j(null, str, tvwVar, str2, z5, a4xVar, ecVar, (Function0) objP5, fetVar2, 0);
            zcl zclVar = qmk.f28987a;
            final byte b3 = 2;
            ucx.o(s5x0.L(jm40Var, 12.0f, 0.0f, 2), qp30Var.i, qp30Var.j, qp30Var.k, qp30Var.l, qp30Var.m, fetVar, 0);
            mm40 mm40VarN = s5x0.N(jm40Var, 12.0f, 0.0f, 6.0f, 0.0f, 10);
            l3w l3wVar = qp30Var.n;
            nom0 nom0Var = qp30Var.o;
            String str3 = qp30Var.p;
            so30 so30Var = qp30Var.q;
            so30 so30Var2 = qp30Var.r;
            boolean z7 = (i3 == 256) | (i4 == 32);
            Object objP6 = fetVar.P();
            if (z7) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP6 == cl5Var) {
                }
                Function0 function0 = (Function0) objP6;
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new bw20((Object) function1, (Object) qp30Var, (byte) 8);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                fetVar2 = fetVar;
                k9x.f(mm40VarN, nom0Var, str3, l3wVar, so30Var, so30Var2, function0, function2, fetVar2, 0);
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            objP6 = new Function0() { // from class: a.xo30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b4 = b3;
                    qp30 qp30Var2 = qp30Var;
                    Function1 function3 = function1;
                    switch (b4) {
                        case 0:
                            String str4 = qp30Var2.b;
                            str4.getClass();
                            function3.invoke(new e27(str4));
                            break;
                        case 1:
                            String str5 = qp30Var2.b;
                            str5.getClass();
                            function3.invoke(new d27(str5));
                            break;
                        default:
                            String str6 = qp30Var2.b;
                            str6.getClass();
                            function3.invoke(new i27(str6));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP6);
            Function0 function3 = (Function0) objP6;
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            if (i4 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objP = fetVar.P();
            if (z3) {
                objP = new bw20((Object) function1, (Object) qp30Var, (byte) 8);
                fetVar.o0(objP);
            } else {
                objP = new bw20((Object) function1, (Object) qp30Var, (byte) 8);
                fetVar.o0(objP);
            }
            Function1 function4 = (Function1) objP;
            fetVar2 = fetVar;
            k9x.f(mm40VarN, nom0Var, str3, l3wVar, so30Var, so30Var2, function3, function4, fetVar2, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) qp30Var, (Object) function1, i, (byte) 5);
        }
    }

    public static final void j(d280 d280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1788897967);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(d280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.d().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5l0(d280Var, str, i, (byte) 3);
        }
    }

    public static final void k(int i, long j, long j2, fet fetVar, d280 d280Var, d280 d280Var2, String str, String str2, String str3, String str4) {
        String str5;
        long j3;
        d280 d280Var3;
        long j4 = j2;
        String str6 = str4;
        fetVar.g0(31517055);
        int i2 = i | (fetVar.g(d280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.g(d280Var2) ? 16384 : 8192) | (fetVar.g(str3) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            d280Var3 = d280Var;
            j(d280Var3, str, fetVar, i2 & 126);
            j(d280Var2, str3, fetVar, (i2 >> 12) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
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
            j3 = j;
            str5 = str2;
            v(str5, j3, fetVar, (i2 >> 6) & 126);
            j4 = j2;
            str6 = str4;
            v(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            str5 = str2;
            j3 = j;
            d280Var3 = d280Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5l0(d280Var3, str, str5, j3, d280Var2, str3, str6, j4, i);
        }
    }

    public static final void l(mm40 mm40Var, cx80 cx80Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1591139749);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(cx80Var) ? 32 : 16);
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2.X();
        } else if (cx80Var instanceof ax80) {
            fetVar2.e0(-1909574923);
            zcl zclVar = qmk.f28987a;
            v8q0.a(((ax80) cx80Var).f1612a, s5x0.N(mm40Var, 4.0f, 8.0f, 4.0f, 0.0f, 8), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, 0, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(false);
        } else {
            if (!cx80Var.equals(bx80.f3365a)) {
                throw b1j.f(76945601, fetVar2, false);
            }
            fetVar2.e0(-1909173349);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, cx80Var, i, (byte) 5);
        }
    }

    public static final void m(int i, fet fetVar) {
        fetVar.g0(-1305570004);
        if (fetVar.U(i & 1, i != 0)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 36.0f), vgg0.f37379a);
            vqm vqmVar = vqm.c;
            zq8.a(0, fetVar, xbc.c0(mm40VarJ, vbc.d0(vqmVar, fetVar, 6, 0)));
            mm40 mm40VarP = o7k0.p(jm40Var, ((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) < 411 ? 68.0f : 84.0f, 24.0f);
            zcl zclVar2 = qmk.e;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 10);
        }
    }

    public static final void n(mm40 mm40Var, ica0 ica0Var, xdr xdrVar, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        xdrVar.getClass();
        fetVar.g0(-1496483857);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ica0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            edm edmVar = ica0Var.b;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new er90((byte) 19);
                fetVar.o0(objP);
            }
            agc.q(mm40Var, edmVar, xdrVar, (Function1) objP, fetVar, (i2 & 14) | 3072 | (i2 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, ica0Var, xdrVar, i, (byte) 10);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(1935212812);
        int i2 = i | (fetVar2.g(l7m0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new peb0((byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            float f = xfn.a(fetVar2).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.K(mm40VarK, f, 8.0f), 24.0f);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new peb0((byte) 4);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(rq8.L(mm40VarE, (Function1) objP2), "POPULAR_SESSION_TIMER");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            String str = (String) l7m0Var.getValue();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e2s(mm40Var, l7m0Var, i, (byte) 6);
        }
    }

    public static final void p(int i, int i2, int i3, long j, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        Pair[] pairArr;
        zx7 zx7Var = gqw0.f11754a;
        fetVar.g0(1542279600);
        int i4 = (i3 & 6) == 0 ? (fetVar.d(6.0f) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.e(i2) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = fetVar.k(bmd.n) == k6z.b;
            boolean z2 = ((i5 & 7168) == 2048) | ((i5 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = Float.valueOf(i2 / i);
                fetVar.o0(objP);
            }
            float fFloatValue = ((Number) objP).floatValue();
            Float fValueOf = Float.valueOf(1.0f);
            Float fValueOf2 = Float.valueOf(0.85f);
            Float fValueOf3 = Float.valueOf(0.66f);
            Float fValueOf4 = Float.valueOf(0.5f);
            Float fValueOf5 = Float.valueOf(0.2f);
            if (z) {
                fetVar.e0(874679485);
                zfn zfnVar = m8m0.f21378a;
                pairArr = new Pair[]{new Pair(fValueOf5, new y3d(((StaticColors) fetVar.k(zfnVar)).m113getRed0d7_KjU())), new Pair(fValueOf4, new y3d(((StaticColors) fetVar.k(zfnVar)).m98getGreen0d7_KjU())), new Pair(fValueOf3, new y3d(((StaticColors) fetVar.k(zfnVar)).m132getYellow0d7_KjU())), new Pair(fValueOf2, new y3d(((StaticColors) fetVar.k(zfnVar)).m104getOrange0d7_KjU())), new Pair(fValueOf, new y3d(((StaticColors) fetVar.k(zfnVar)).m113getRed0d7_KjU()))};
                fetVar.r(false);
            } else {
                fetVar.e0(874419643);
                zfn zfnVar2 = m8m0.f21378a;
                pairArr = new Pair[]{new Pair(fValueOf5, new y3d(((StaticColors) fetVar.k(zfnVar2)).m98getGreen0d7_KjU())), new Pair(fValueOf4, new y3d(((StaticColors) fetVar.k(zfnVar2)).m113getRed0d7_KjU())), new Pair(fValueOf3, new y3d(((StaticColors) fetVar.k(zfnVar2)).m104getOrange0d7_KjU())), new Pair(fValueOf2, new y3d(((StaticColors) fetVar.k(zfnVar2)).m132getYellow0d7_KjU())), new Pair(fValueOf, new y3d(((StaticColors) fetVar.k(zfnVar2)).m98getGreen0d7_KjU()))};
                fetVar.r(false);
            }
            Pair[] pairArr2 = pairArr;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                Pair[] pairArr3 = (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length);
                ArrayList arrayList = new ArrayList(pairArr3.length);
                for (Pair pair : pairArr3) {
                    y3d y3dVar = (y3d) pair.b;
                    long j2 = y3dVar.f41946a;
                    arrayList.add(y3dVar);
                }
                ArrayList arrayList2 = new ArrayList(pairArr3.length);
                for (Pair pair2 : pairArr3) {
                    arrayList2.add(Float.valueOf(((Number) pair2.f46059a).floatValue()));
                }
                objP2 = new znn0(arrayList, arrayList2);
                fetVar.o0(objP2);
            }
            t89 t89Var = (t89) objP2;
            boolean zD = fetVar.d(fFloatValue) | fetVar.h(z);
            Object objP3 = fetVar.P();
            if (zD || objP3 == cl5Var) {
                TypedValue typedValue = j5d.f15927a;
                ArrayList arrayList3 = new ArrayList(pairArr2.length);
                int length = pairArr2.length;
                int i6 = 0;
                while (i6 < length) {
                    Pair pair3 = pairArr2[i6];
                    long j3 = ((y3d) pair3.b).f41946a;
                    TypedValue typedValue2 = j5d.f15927a;
                    arrayList3.add(new Pair(Integer.valueOf(j5d.e(y3d.d(j3), y3d.h(j3), y3d.g(j3), y3d.e(j3))), pair3.f46059a));
                    i6++;
                    pairArr2 = pairArr2;
                }
                Pair[] pairArr4 = (Pair[]) arrayList3.toArray(new Pair[0]);
                float f = fFloatValue / 2.0f;
                objP3 = Integer.valueOf(j5d.b(pairArr4, z ? 1.0f - f : f + 0.5f));
                fetVar.o0(objP3);
            }
            int iIntValue = ((Number) objP3).intValue();
            boolean zD2 = fetVar.d(fFloatValue);
            Object objP4 = fetVar.P();
            if (zD2 || objP4 == cl5Var) {
                objP4 = Double.valueOf(((double) fFloatValue) * 180.0d);
                fetVar.o0(objP4);
            }
            double dDoubleValue = ((Number) objP4).doubleValue();
            boolean zC = fetVar.c(dDoubleValue);
            Object objP5 = fetVar.P();
            if (zC || objP5 == cl5Var) {
                objP5 = Double.valueOf(dDoubleValue + 90.0d);
                fetVar.o0(objP5);
            }
            double dDoubleValue2 = ((Number) objP5).doubleValue();
            zcl zclVar = qmk.f28987a;
            a(z, dDoubleValue2, t89Var, j, fbc.d(iIntValue), s5x0.J(o7k0.n(jm40Var, 100.0f), 4.0f), fetVar, (i5 & 14) | 3072 | ((i5 << 9) & 57344));
            fetVar2 = fetVar;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarN = s5x0.N(jr8Var.b(jm40Var, zx7Var), 0.0f, 56.0f, 0.0f, 0.0f, 13);
            zfn zfnVar3 = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar3)).getSecondary();
            zfn zfnVar4 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar4)).getClass();
            v8q0.a("0", mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar2, 6, 0, 131064);
            mm40 mm40VarN2 = s5x0.N(jr8Var.b(jm40Var, gqw0.c), 0.0f, 56.0f, 0.0f, 0.0f, 13);
            String strValueOf = String.valueOf(i);
            long secondary2 = ((ThemeColors) fetVar2.k(zfnVar3)).getSecondary();
            ((g1t0) fetVar2.k(zfnVar4)).getClass();
            v8q0.a(strValueOf, mm40VarN2, secondary2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar2, 0, 0, 131064);
            mm40 mm40VarN3 = s5x0.N(jr8Var.b(jm40Var, gqw0.b), 0.0f, 20.0f, 0.0f, 0.0f, 13);
            String strValueOf2 = String.valueOf(i2);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar3)).getTextPrimary();
            ((g1t0) fetVar2.k(zfnVar4)).getClass();
            v8q0.a(strValueOf2, mm40VarN3, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.o(), fetVar2, 0, 0, 131064);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5n(j, i, i2, mm40Var2, i3);
        }
    }

    public static final void q(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        float f;
        float f2;
        cgk0 cgk0Var;
        fet fetVar2 = fetVar;
        fr5Var.getClass();
        function2.getClass();
        fetVar2.g0(-1726966124);
        int i3 = i2 | 6 | (fetVar2.g(fr5Var) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.g(num) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp < 360) {
                zcl zclVar = qmk.f28987a;
                f = 288.0f;
                f2 = 104.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 320.0f;
                f2 = 116.0f;
            }
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP4);
            }
            vne vneVar = (vne) objP4;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, f, f2);
            boolean z = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new pia(function2, fr5Var, pz40Var, (byte) 1);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarW = y860.W(mm40VarP, null, null, false, null, (Function0) objP5, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "HORISONTAL_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            float f3 = f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP6 = fetVar2.P();
            byte b = 3;
            if (objP6 == cl5Var) {
                objP6 = new ryc0(pz40Var, b);
                fetVar2.o0(objP6);
            }
            int i4 = i3 << 3;
            etl.a(mm40VarE0, o0xVar, o0xVar3, i, num, null, 0.0f, (Function1) objP6, fetVar2, (i4 & 57344) | (i4 & 7168) | 12582912, 96);
            if (o0xVar2 != null) {
                fetVar2.e0(1301163295);
                etl.d(lgb.J(jr8Var.b(jm40Var, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1301429492);
                fetVar2.r(false);
            }
            etl.f(6, fetVar2, null);
            byte b2 = 1;
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.u(jr8Var.b(jm40Var, gqw0.g), 0.0f, f3, 1), 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                cgk0Var = cgk0Var2;
                objP7 = new jt0(pz40Var2, cgk0Var, b2);
                fetVar2.o0(objP7);
            } else {
                cgk0Var = cgk0Var2;
            }
            mm40 mm40VarE1 = o2e.e0(pai0.a(mm40VarN, false, (Function1) objP7), "HORISONTAL_BANNER_TEXT");
            String str = fr5Var.d;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            boolean zI = fetVar2.i(vneVar);
            Object objP8 = fetVar2.P();
            if (zI || objP8 == cl5Var) {
                objP8 = new kt0(vneVar, pz40Var2, cgk0Var, b2);
                fetVar2.o0(objP8);
            }
            v8q0.a(str, mm40VarE1, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objP8, y9q0VarA, fetVar, 0, 24960, 45048);
            fetVar2 = fetVar;
            if (er5Var != null) {
                fetVar2.e0(1302549274);
                etl.c(o7k0.u(jm40Var, 0.0f, f3 + 2.0f, 1), er5Var, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1302676436);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    public static final void r(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        float f;
        float f2;
        ?? r15;
        boolean z;
        fr5Var.getClass();
        function2.getClass();
        fetVar.g0(822806439);
        int i3 = i2 | 6 | (fetVar.g(fr5Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(num) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp < 360) {
                zcl zclVar = qmk.f28987a;
                f = 288.0f;
                f2 = 104.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 320.0f;
                f2 = 116.0f;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, f, f2);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new pia(function2, fr5Var, pz40Var, (byte) 2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarP, null, null, false, null, (Function0) objP2, 28), "RectangleHorizontalNoTitleBannerItem_Box");
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE1 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "HORISONTAL_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            float f3 = f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new ryc0(pz40Var, (byte) 4);
                fetVar.o0(objP3);
            }
            int i4 = i3 << 3;
            mm40Var2 = jm40Var;
            etl.a(mm40VarE1, o0xVar, o0xVar3, i, num, null, 0.0f, (Function1) objP3, fetVar, (i4 & 57344) | (i4 & 7168) | 12582912, 96);
            if (o0xVar2 != null) {
                fetVar.e0(-986427808);
                r15 = 0;
                etl.d(lgb.J(jr8Var.b(mm40Var2, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar, 0);
                fetVar.r(false);
            } else {
                r15 = 0;
                fetVar.e0(-986161611);
                fetVar.r(false);
            }
            if (er5Var != null) {
                fetVar.e0(-986112197);
                z = true;
                etl.c(o7k0.u(mm40Var2, 0.0f, f3 + 2.0f, 1), er5Var, fetVar, r15, r15);
                fetVar.r(r15);
            } else {
                z = true;
                fetVar.e0(-985985035);
                fetVar.r(r15);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 2);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        float f;
        float f2;
        fetVar.g0(437739656);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp < 360) {
                zcl zclVar = qmk.f28987a;
                f = 288.0f;
                f2 = 104.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 320.0f;
                f2 = 116.0f;
            }
            jm40 jm40Var = jm40.b;
            etl.b(0, fetVar, o2e.e0(lgb.J(o7k0.p(jm40Var, f, f2), vgg0.a(16.0f)), "RectangleHorizontalNoTitleBannerItem_Skeleton"));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 13);
        }
    }

    public static final void t(mm40 mm40Var, xcz xczVar, i4 i4Var, fet fetVar, int i) {
        xczVar.getClass();
        fetVar.g0(-1698051097);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(i4Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "RoundStatisticItemsTestTag");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 6.0f, 0.0f, 11);
            boolean z = (i2 & 896) == 256 || fetVar.i(i4Var);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eme0(i4Var, (byte) 25);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80VarU, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var, xczVar, i4Var, i, (byte) 23);
        }
    }

    public static final void u(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        j83Var.getClass();
        fetVar.g0(461302682);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            v8q0.b(j83Var, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 18) & 234881024) | 24576, 245758);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3h0(mm40Var, j83Var, y9q0Var, i, (byte) 0);
        }
    }

    public static final void v(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1625603968);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, o7k0.u(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 5);
        }
    }

    public static final void w(int i, int i2, String str, String str2, boolean z, mm40 mm40Var, fet fetVar, int i3) {
        int i4;
        shd shdVar;
        shd shdVar2;
        int i5;
        shd shdVar3;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-1772598408);
        int i6 = i3 | (fetVar2.e(i) ? 4 : 2) | (fetVar2.e(i2) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(mm40Var) ? 131072 : 65536);
        if (fetVar2.U(i6 & 1, (74899 & i6) != 74898)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(mm40Var, 168.0f), 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
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
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            jm40 jm40Var2 = jm40.b;
            if (z) {
                fetVar2.e0(-1704849827);
                i4 = i6;
                int i7 = ((i4 << 9) & 7168) | ((i6 << 3) & 896);
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                p(i2, i, i7, backgroundContent, fetVar2, null);
                fetVar2.r(false);
                i5 = 0;
                jm40Var = jm40Var2;
                shdVar3 = shdVar7;
            } else {
                i4 = i6;
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                fetVar2.e0(-1704584126);
                i5 = 0;
                shdVar3 = shdVar7;
                jm40Var = jm40Var2;
                dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar2), null, s5x0.J(i120.Q(o7k0.n(jm40Var2, 72.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.f37379a), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
                fetVar2.r(false);
            }
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.g);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, i5);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar3);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i4 >> 6) & 14, 24960, 110584);
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, (i4 >> 9) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsh0(i, i2, str, str2, z, mm40Var, i3);
        }
    }

    public static final void x(mm40 mm40Var, boolean z, wtm wtmVar, fet fetVar, int i) {
        k6z k6zVar;
        boolean z2;
        fet fetVar2 = fetVar;
        jwm jwmVar = wtmVar.i;
        fetVar2.g0(-411250443);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        int i3 = i2 | (fetVar2.g(wtmVar) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar2.k(zfnVar);
            k6z k6zVar3 = z ? k6zVar2 : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            String str = jwmVar.f17257a;
            if (str == null || str.length() == 0) {
                k6zVar = k6zVar2;
                z2 = true;
                fetVar2.e0(1373866743);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1373343959);
                mm40 mm40VarG = o7k0.g(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), 16.0f, 0.0f, 2);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarG);
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
                k6zVar = k6zVar2;
                z2 = true;
                v8q0.a(jwmVar.f17257a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            d280 d280Var = wtmVar.f39748a;
            String str2 = wtmVar.c;
            d280 d280Var2 = wtmVar.b;
            String str3 = wtmVar.f;
            k(0, wtmVar.e, wtmVar.h, fetVar2, d280Var, d280Var2, str2, wtmVar.d, str3, wtmVar.g);
            obc.d(zfnVar.a(k6zVar3), u1c.M(-1236559317, new a5k0(wtmVar, k6zVar, (byte) 17), fetVar2), fetVar2, 56);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 8, i, mm40Var, (Object) wtmVar, z);
        }
    }

    public static final void y(mm40 mm40Var, db00 db00Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1867731579);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(db00Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zB = db00Var.b();
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new yhl0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            tfx.p(R.string.statistic_info_start_team, R.drawable.ic_glyph_two_flags, zB, (Function0) objP, mm40Var, u1c.M(-224280873, new odv((Object) db00Var, (Object) function1, z, (Object) function2, (byte) 8), fetVar), fetVar, ((i2 << 12) & 57344) | 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(mm40Var, db00Var, z, function1, function2, i);
        }
    }

    public static final void z(va00 va00Var, Function1 function1, Function1 function2, Function1 function3, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        int i2 = va00Var.e;
        fetVar2.g0(786261843);
        int i3 = i | (fetVar2.g(va00Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128) | (fetVar2.i(function3) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new fzk0((byte) 27);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i2, (Function0) objP, fetVar2, 384, 2);
            Integer numValueOf = Integer.valueOf(i2);
            int i4 = i3 & 14;
            boolean zG = fetVar2.g(kwjVarB) | (i4 == 4);
            Object objP2 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP2 == cl5Var) {
                objP2 = new lcl0(kwjVarB, va00Var, yjeVar, (byte) 5);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, 12.0f, 4.0f, 12.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            a4x a4xVar = va00Var.c;
            boolean z = i4 == 4;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new goi0(va00Var, (byte) 26);
                fetVar2.o0(objP3);
            }
            ibc.n(mm40VarD, a4xVar, gxh0.f12078a, axh0.f1625a, false, (Function0) objP3, function2, fetVar2, ((i3 << 12) & 3670016) | 3462, 16);
            zq8.a(0, fetVar2, o7k0.e(jm40Var, 12.0f));
            q5x.e(kwjVarB, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), null, null, 0, 24.0f, gqw0.j, null, false, null, null, null, null, u1c.M(1530594058, new n82(va00Var, function1, function3, (byte) 25), fetVar2), fetVar, 102236208, 24576, 16028);
            fetVar2 = fetVar;
            zq8.a(0, fetVar2, o7k0.e(jm40Var, 12.0f));
            boolean z2 = (i3 & 57344) == 16384;
            Object objP4 = fetVar2.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new xhl0(function0, (byte) 6);
                fetVar2.o0(objP4);
            }
            x1x.l(0, 2, fetVar2, null, (Function0) objP4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) va00Var, (Object) function1, (Object) function2, (Object) function3, (Object) function0, i, (byte) 1);
        }
    }
}
