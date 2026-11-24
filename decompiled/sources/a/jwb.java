package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.EOFException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jwb {
    public static final void A(AppCompatTextView appCompatTextView) {
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setLineSpacing(0.0f, 0.8f);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        aem0.r(appCompatTextView, 10, 12, 2, 1);
    }

    public static final List B(List list, boolean z, ctf0 ctf0Var, npo npoVar) {
        ydl0 xdl0Var;
        String string;
        list.getClass();
        ctf0Var.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            bhj bhjVar = (bhj) next;
            long j = bhjVar.f2609a;
            List list2 = bhjVar.d;
            String str = bhjVar.c;
            String strF = ctf0Var.f(R.string.popular_express_day_header_item_v2, Integer.valueOf(i3));
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                qhj qhjVar = (qhj) it2.next();
                String strC = qhjVar.b;
                if (strC.length() == 0) {
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(qhjVar.f28742a, p3u0.e);
                }
                if (qhjVar.c == 707) {
                    xdl0Var = new wdl0();
                } else {
                    long j2 = qhjVar.r;
                    if (j2 != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j2, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    xdl0Var = new xdl0(string);
                }
                arrayList2.add(new o6l0(xdl0Var, strC));
                it2 = it2;
                it = it;
                j = j;
            }
            Iterator it3 = it;
            long j3 = j;
            boolean z2 = bhjVar.e;
            List<qhj> listD0 = CollectionsKt.D0(list2, 6);
            ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
            for (qhj qhjVar2 : listD0) {
                boolean z3 = qhjVar2.c == 707;
                double d = qhjVar2.f28742a;
                String strC2 = qhjVar2.b;
                boolean z4 = z2;
                if (qhjVar2.z || strC2.length() <= 0) {
                    pn40 pn40Var2 = pn40.f27267a;
                    strC2 = pn40.c(d, p3u0.e);
                }
                arrayList3.add(new a0d(strC2, z3 ? 707L : qhjVar2.r, z3));
                z2 = z4;
            }
            arrayList.add(new upo(j3, i3, str, strF, arrayList3, arrayList2, list2, z2, npoVar));
            i2 = i3;
            it = it3;
            i = 10;
        }
        if (arrayList.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        Pair pair = z ? new Pair(xqo.b, Integer.valueOf(R.string.day_express_live_new)) : new Pair(xqo.f41331a, Integer.valueOf(R.string.day_express_line));
        lc00VarB.add(new ghj(ctf0Var.b.a(((Number) pair.b).intValue(), Arrays.copyOf(new Object[0], 0)), z, (xqo) pair.f46059a));
        lc00VarB.addAll(arrayList);
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final String C(dqy dqyVar, ihy ihyVar) {
        String strConcat;
        hfy hfyVar = j0x.v(dqyVar).c;
        if (hfyVar != null) {
            return hfyVar.toString();
        }
        tey teyVar = j0x.v(dqyVar).b;
        if (teyVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(aey.a(teyVar.b));
        if (j24.b(dqyVar) == nuu0.INTERNAL && (ihyVar instanceof xgy)) {
            qpy qpyVarX = ((xgy) ihyVar).X();
            String str = qpyVarX != null ? j0x.t(qpyVarX).b : null;
            if (str == null) {
                str = "main";
            }
            strConcat = "$" + j950.f16120a.replace(str, BundleUtil.UNDERLINE_TAG);
        } else if (j24.b(dqyVar) == nuu0.PRIVATE && (ihyVar instanceof zhy)) {
            zhy zhyVar = (zhy) ihyVar;
            mre0 mre0Var = ((yhy) zhyVar.c.getValue()).d;
            iiy iiyVar = yhy.g[0];
            jre0 jre0Var = (jre0) mre0Var.invoke();
            if ((jre0Var != null ? (bry) jre0Var.b.c : null) == bry.MULTIFILE_CLASS_PART) {
                strConcat = "$".concat(zhyVar.b.getSimpleName());
            } else {
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        sb.append("()");
        sb.append(teyVar.c);
        return sb.toString();
    }

    public static final nsp D(rsp rspVar, long j) {
        List list;
        Object next;
        if (rspVar != null && (list = rspVar.c) != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((jsp) next).f17063a != j);
            jsp jspVar = (jsp) next;
            if (jspVar != null) {
                return jspVar.h;
            }
        }
        return null;
    }

    public static iol E(ugd ugdVar, fet fetVar) {
        long textPrimary;
        long secondary;
        long textPrimary2;
        fetVar.e0(604929418);
        hol holVar = new hol();
        bi90 bi90VarH0 = dyb.h0(rol.f30844a, rol.b, rol.c, rol.d);
        jol jolVar = jol.f16863a;
        ugdVar.F(holVar, fetVar, 48);
        y3d y3dVar = holVar.f13398a;
        if (y3dVar != null) {
            textPrimary = y3dVar.f41946a;
        } else {
            pz40 pz40Var = s6t0.f31722a;
            textPrimary = s6t0.b().f33626a.getTextPrimary();
        }
        y3d y3dVar2 = holVar.b;
        if (y3dVar2 != null) {
            secondary = y3dVar2.f41946a;
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        y3d y3dVar3 = holVar.c;
        if (y3dVar3 != null) {
            textPrimary2 = y3dVar3.f41946a;
        } else {
            pz40 pz40Var3 = s6t0.f31722a;
            textPrimary2 = s6t0.b().f33626a.getTextPrimary();
        }
        iol iolVar = new iol(textPrimary, secondary, textPrimary2, bi90VarH0, jolVar);
        fetVar.r(false);
        return iolVar;
    }

    public static final bdd F(int i, int i2, String str) {
        if (i == -1 || i2 == -1) {
            return null;
        }
        return vtb.R(i, i2, str, kng0.k("COMPARE_TEAMS", str), false);
    }

    public static final String G(Throwable th, ctf0 ctf0Var) {
        th.getClass();
        ctf0Var.getClass();
        return H(th, new bcn(ctf0Var, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    public static final String H(Throwable th, Function1 function1) {
        String message;
        if (th == null) {
            message = null;
        } else if (th instanceof z1t0) {
            message = (String) function1.invoke(Integer.valueOf(R.string.coupon_load_empty));
        } else if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof SSLHandshakeException) || (th instanceof ConnectException) || (th instanceof IllegalStateException)) {
            message = (String) function1.invoke(Integer.valueOf(R.string.no_connection_check_network));
        } else if (th instanceof EOFException) {
            message = (String) function1.invoke(Integer.valueOf(R.string.unknown_service_error));
        } else if (th instanceof rtw) {
            message = (String) function1.invoke(Integer.valueOf(R.string.service_is_unavailable));
        } else if ((th instanceof zhi0) || (th instanceof alx)) {
            message = th.getMessage();
        } else {
            message = null;
        }
        return (message == null || message.length() == 0) ? (String) function1.invoke(Integer.valueOf(R.string.error_something_went_wrong)) : message;
    }

    public static final String I(vw4 vw4Var, ctf0 ctf0Var, List list) {
        ctf0Var.getClass();
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((lok0) obj).f20396a), obj);
        }
        List list2 = vw4Var.T;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            lok0 lok0Var = (lok0) linkedHashMap.get(Integer.valueOf(((z0w) it.next()).c));
            if (lok0Var != null) {
                arrayList.add(lok0Var);
            }
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
        int size = listL0.size();
        if (size == 0) {
            return "";
        }
        if (size != 1) {
            return ctf0Var.b.a(R.string.top_events_tag_v2, Arrays.copyOf(new Object[]{Integer.valueOf(listL0.size())}, 1));
        }
        lok0 lok0Var2 = (lok0) CollectionsKt.firstOrNull(listL0);
        String str = lok0Var2 != null ? lok0Var2.b : null;
        return str == null ? "" : str;
    }

    public static final String J(kzv kzvVar, ctf0 ctf0Var, List list) {
        kzvVar.getClass();
        ctf0Var.getClass();
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((lok0) obj).f20396a), obj);
        }
        List list2 = kzvVar.Y;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            lok0 lok0Var = (lok0) linkedHashMap.get(Integer.valueOf(((z0w) it.next()).c));
            if (lok0Var != null) {
                arrayList.add(lok0Var);
            }
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
        int size = listL0.size();
        if (size == 0) {
            return "";
        }
        if (size != 1) {
            return ctf0Var.b.a(R.string.top_events_tag_v2, Arrays.copyOf(new Object[]{Integer.valueOf(listL0.size())}, 1));
        }
        lok0 lok0Var2 = (lok0) CollectionsKt.firstOrNull(listL0);
        String str = lok0Var2 != null ? lok0Var2.b : null;
        return str == null ? "" : str;
    }

    public static final String K(kbo kboVar) {
        kboVar.getClass();
        String str = kboVar.b;
        return str.length() == 0 ? kboVar.d : str;
    }

    public static final String L(kbo kboVar) {
        kboVar.getClass();
        String str = kboVar.f18023a;
        return str.length() == 0 ? kboVar.c : str;
    }

    public static final i4 M(vw4 vw4Var, ctf0 ctf0Var, List list, boolean z, String str) {
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        String strI = I(vw4Var, ctf0Var, list);
        lc00 lc00VarB = kotlin.collections.a.b();
        if (str.length() > 0) {
            lc00VarB.add(new too0(str.concat("key"), str));
        }
        if (vw4Var.p) {
            lc00VarB.add(new ooo0(ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0.f18776a));
        }
        if (vw4Var.E) {
            lc00VarB.add(new qoo0(ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0.f34390a));
        }
        if (strI.length() > 0) {
            lc00VarB.add(new roo0(strI, "TopChampTag".concat(strI), bro0.f3088a));
        }
        if (vw4Var.Q != 0.0d) {
            lc00VarB.add(new koo0(ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0.f4759a));
        }
        if (vw4Var.v) {
            lc00VarB.add(new loo0(ctf0Var.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0.f39654a));
        }
        if (z) {
            lc00VarB.add(new ioo0(ctf0Var.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0))));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final i4 N(kzv kzvVar, ctf0 ctf0Var, List list, boolean z, boolean z2, boolean z3, String str) {
        ctf0Var.getClass();
        list.getClass();
        String strJ = J(kzvVar, ctf0Var, list);
        lc00 lc00VarB = kotlin.collections.a.b();
        if (str.length() > 0) {
            lc00VarB.add(new too0(str.concat("key"), str));
        }
        if (kzvVar.q) {
            lc00VarB.add(new ooo0(ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0.f18776a));
        }
        if (z2) {
            lc00VarB.add(new poo0(ctf0Var.b.a(R.string.optionBet, Arrays.copyOf(new Object[0], 0)), "OptionBet", dqo0.f6527a));
        }
        if (z3) {
            lc00VarB.add(new moo0(ctf0Var.b.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), "EachWay", opo0.f25653a));
        }
        if (kzvVar.G) {
            lc00VarB.add(new qoo0(ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0.f34390a));
        }
        if (strJ.length() > 0) {
            lc00VarB.add(new roo0(strJ, "TopChampTag".concat(strJ), bro0.f3088a));
        }
        if (kzvVar.V != 0.0d) {
            lc00VarB.add(new koo0(ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0.f4759a));
        }
        if (kzvVar.x) {
            lc00VarB.add(new loo0(ctf0Var.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0.f39654a));
        }
        if (z) {
            lc00VarB.add(new ioo0(ctf0Var.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0))));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final long O(boolean z, fet fetVar) {
        if (z) {
            fetVar.e0(1019398578);
            long warningTint = ((ThemeColors) fetVar.k(zaq0.b)).getWarningTint();
            fetVar.r(false);
            return warningTint;
        }
        fetVar.e0(1019399928);
        long inputBackground60 = ((ThemeColors) fetVar.k(zaq0.b)).getInputBackground60();
        fetVar.r(false);
        return inputBackground60;
    }

    public static final laa P(vua vuaVar) {
        vuaVar.getClass();
        Integer num = vuaVar.f38038a;
        Integer num2 = vuaVar.b;
        jaa jaaVar = jaa.b;
        if (num != null && num.intValue() == 0) {
            switch (num2 != null ? num2.intValue() : 0) {
                case 2:
                    return iaa.w;
                case 3:
                    return iaa.s;
                case 4:
                    return haa.q;
                case 5:
                    return haa.m;
                case 6:
                    return iaa.k;
                case 7:
                    return iaa.g;
                case 8:
                    return haa.i;
                case 9:
                    return haa.C;
                case 10:
                    return iaa.o;
                case 11:
                    return haa.u;
                case 12:
                    return iaa.c;
                case 13:
                    return haa.y;
                case 14:
                    return haa.e;
                default:
                    return jaaVar;
            }
        }
        if (num != null && num.intValue() == 1) {
            switch (num2 != null ? num2.intValue() : 0) {
                case 2:
                    return iaa.t;
                case 3:
                    return iaa.p;
                case 4:
                    return haa.n;
                case 5:
                    return haa.j;
                case 6:
                    return iaa.h;
                case 7:
                    return iaa.d;
                case 8:
                    return haa.f;
                case 9:
                    return haa.z;
                case 10:
                    return iaa.l;
                case 11:
                    return haa.r;
                case 12:
                    return haa.D;
                case 13:
                    return haa.v;
                case 14:
                    return haa.b;
                default:
                    return jaaVar;
            }
        }
        if (num != null && num.intValue() == 2) {
            switch (num2 != null ? num2.intValue() : 0) {
                case 2:
                    return iaa.u;
                case 3:
                    return iaa.q;
                case 4:
                    return haa.o;
                case 5:
                    return haa.k;
                case 6:
                    return iaa.i;
                case 7:
                    return iaa.e;
                case 8:
                    return haa.g;
                case 9:
                    return haa.A;
                case 10:
                    return iaa.m;
                case 11:
                    return haa.s;
                case 12:
                    return haa.E;
                case 13:
                    return haa.w;
                case 14:
                    return haa.c;
                default:
                    return jaaVar;
            }
        }
        if (num == null || num.intValue() != 3) {
            return jaaVar;
        }
        switch (num2 != null ? num2.intValue() : 0) {
            case 2:
                return iaa.v;
            case 3:
                return iaa.r;
            case 4:
                return haa.p;
            case 5:
                return haa.l;
            case 6:
                return iaa.j;
            case 7:
                return iaa.f;
            case 8:
                return haa.h;
            case 9:
                return haa.B;
            case 10:
                return iaa.n;
            case 11:
                return haa.t;
            case 12:
                return iaa.b;
            case 13:
                return haa.x;
            case 14:
                return haa.d;
            default:
                return jaaVar;
        }
    }

    public static final boolean Q(jup jupVar, jup jupVar2) {
        c0o c0oVar = aup.c;
        if (c0oVar != null && c0oVar.isEmpty()) {
            return false;
        }
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            aup aupVar = (aup) y2VarH.next();
            Integer numC0 = c0(jupVar, aupVar);
            Integer numC1 = c0(jupVar2, aupVar);
            if (numC0 != null && numC1 != null) {
                int iIntValue = numC0.intValue();
                int iIntValue2 = numC1.intValue();
                if (iIntValue != 0 || iIntValue2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final sgy R(ClassLoader classLoader, String str, boolean z) {
        Class cls;
        classLoader.getClass();
        str.getClass();
        Class clsL = xtt0.l(classLoader, V(str), 0);
        if (clsL == null) {
            return null;
        }
        if (!z && (cls = (Class) bqe0.b.get(clsL)) != null) {
            clsL = cls;
        }
        return sre0.f32672a.b(clsL);
    }

    public static final Annotation S(voy voyVar, ClassLoader classLoader) {
        voyVar.getClass();
        classLoader.getClass();
        String str = voyVar.f37787a;
        Class clsL = xtt0.l(classLoader, V(str), 0);
        if (clsL == null) {
            throw new poe(kng0.k("Annotation class not found: ", str));
        }
        Map map = voyVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), T((ppy) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) jiq0.m0(clsL, linkedHashMap);
    }

    public static final Object T(ppy ppyVar, String str, String str2, ClassLoader classLoader) {
        List parameters;
        kiy kiyVarP;
        if (ppyVar instanceof woy) {
            return S(((woy) ppyVar).f39520a, classLoader);
        }
        int i = 0;
        if (ppyVar instanceof xoy) {
            xoy xoyVar = (xoy) ppyVar;
            String str3 = xoyVar.f41243a;
            sgy sgyVarR = R(classLoader, str3, false);
            if (sgyVarR == null) {
                throw new poe("Unresolved class: ".concat(str3));
            }
            Class clsG = azw.G(sgyVarR);
            int i2 = xoyVar.b;
            while (i < i2) {
                clsG = xtt0.e(clsG);
                i++;
            }
            return clsG;
        }
        Object obj = null;
        if (ppyVar instanceof yoy) {
            sgy sgyVarR2 = R(classLoader, str, false);
            if (sgyVarR2 != null) {
                if (!azw.G(sgyVarR2).isAnnotation()) {
                    sgyVarR2 = null;
                }
                if (sgyVarR2 != null) {
                    jhy jhyVar = (jhy) CollectionsKt.w0(sgyVarR2.g());
                    if (jhyVar != null && (parameters = jhyVar.getParameters()) != null) {
                        Iterator it = parameters.iterator();
                        boolean z = false;
                        Object obj2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!z) {
                                    break;
                                }
                                break;
                            }
                            Object next = it.next();
                            if (Intrinsics.d(((hre0) next).getName(), str2)) {
                                if (!z) {
                                    z = true;
                                    obj2 = next;
                                }
                            }
                            obj2 = null;
                            break;
                        }
                        hre0 hre0Var = (hre0) obj2;
                        if (hre0Var != null && (kiyVarP = hre0Var.p()) != null) {
                            fhy fhyVarO = kiyVarP.o();
                            sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
                            if (sgyVar == null) {
                                ohq.u(kiyVarP, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class clsG2 = azw.G(sgyVar);
                            Class<?> componentType = Intrinsics.d(clsG2.getComponentType(), sgy.class) ? Class.class : clsG2.getComponentType();
                            ArrayList arrayList = ((yoy) ppyVar).f43006a;
                            Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Array.set(objNewInstance, i, T((ppy) it2.next(), str, null, classLoader));
                                i++;
                            }
                            objNewInstance.getClass();
                            return objNewInstance;
                        }
                    }
                    throw new poe(ua80.i("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new poe("Not an annotation class: ".concat(str));
        }
        if (!(ppyVar instanceof dpy)) {
            if (ppyVar instanceof gpy) {
                String str4 = ((gpy) ppyVar).f11705a;
                Class clsL = xtt0.l(classLoader, V(str4), 0);
                if (clsL != null) {
                    return clsL;
                }
                throw new poe("Unresolved class: ".concat(str4));
            }
            if (ppyVar instanceof lpy) {
                return Byte.valueOf(((lpy) ppyVar).f20461a);
            }
            if (ppyVar instanceof opy) {
                return Short.valueOf(((opy) ppyVar).f25662a);
            }
            if (ppyVar instanceof mpy) {
                return Integer.valueOf(((mpy) ppyVar).f22199a);
            }
            if (ppyVar instanceof npy) {
                return Long.valueOf(((npy) ppyVar).f23933a);
            }
            if (ppyVar instanceof hpy) {
                return ((hpy) ppyVar).a();
            }
            t9f.b();
            return null;
        }
        dpy dpyVar = (dpy) ppyVar;
        String str5 = dpyVar.b;
        String str6 = dpyVar.f6488a;
        Class clsL2 = xtt0.l(classLoader, V(str6), 0);
        if (clsL2 == null) {
            throw new poe("Unresolved enum class: ".concat(str6));
        }
        Object[] enumConstants = clsL2.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (i >= length) {
                if (!z2) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object obj4 = enumConstants[i];
            obj4.getClass();
            if (Intrinsics.d(((Enum) obj4).name(), str5)) {
                if (z2) {
                    break;
                }
                z2 = true;
                obj3 = obj4;
            }
            i++;
        }
        if (obj != null) {
            return obj;
        }
        throw new poe("Unresolved enum entry: " + str6 + '.' + str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final iwb U(x5p0 x5p0Var) {
        ?? arrayList;
        ?? arrayList2;
        x5p0Var.getClass();
        List list = x5p0Var.f40329a;
        ?? arrayList3 = 0;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wvb.d0((gwb) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list2 = x5p0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(wvb.d0((gwb) it2.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        List list3 = x5p0Var.d;
        if (list3 != null) {
            arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(wvb.d0((gwb) it3.next()));
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        return new iwb(arrayList, arrayList2, arrayList3);
    }

    public static final qlc V(String str) {
        str.getClass();
        boolean zX = kotlin.text.c.x(str, Separators.DOT, false);
        if (zX) {
            str = str.substring(1);
        }
        int iX = StringsKt.X('/', 0, 6, str);
        String strReplace = (iX == -1 ? "" : str.substring(0, iX)).replace('/', '.');
        strReplace.getClass();
        return new qlc(new swq(strReplace), new swq(StringsKt.o0('/', str, str)), zX);
    }

    public static final y2m W(xah xahVar, ctf0 ctf0Var) {
        long j = xahVar.g;
        int i = xahVar.e;
        int i2 = xahVar.d;
        String strM0 = xahVar.f;
        if (xahVar.i == 243) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        n0x n0xVar = new n0x(xahVar.l);
        String strValueOf = String.valueOf(i2);
        String strValueOf2 = String.valueOf(i);
        return new y2m(j, strM0, ctf0Var.j() ? new n0x(xahVar.b) : new n0x(xahVar.f40554a), ctf0Var.j() ? new m0x(R.drawable.cybergames_tablet_champ_placeholder, null, 6) : new m0x(R.drawable.cybergames_champ_placeholder, null, 6), xahVar.m, i2 > 0, i > 0, strValueOf, strValueOf2, xahVar.h, xahVar.k, n0xVar, 4096);
    }

    public static final xqv X(jih jihVar) {
        List list;
        List list2 = null;
        if (jihVar != null) {
            Object obj = jihVar.c;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (jihVar != null) {
            Object obj2 = jihVar.d;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new xqv(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0226  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [a.v2, java.lang.Throwable, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v17 */
    public static final v2 Y(fqy fqyVar, ClassLoader classLoader, nzs0 nzs0Var, boolean z, Function0 function0) {
        fhy fhyVarA;
        fhy fhyVarB;
        fqy fqyVar2;
        v2 v2VarZ;
        x8x x8xVarA;
        rpy rpyVar;
        String str;
        c5k c5kVar;
        x8x x8xVarA2;
        rpy rpyVar2;
        ?? r1;
        yx40 yx40VarA;
        aqy aqyVar;
        Object obj;
        Object obj2;
        iyj0 iyj0Var;
        boolean z2;
        List list;
        KTypeProjection kTypeProjection;
        ?? iyj0Var2;
        StringBuilder sb;
        Object obj3;
        kiy kiyVar;
        KTypeProjection kTypeProjection2;
        kiy kiyVar2;
        String str2;
        fqyVar.getClass();
        classLoader.getClass();
        nzs0Var.getClass();
        mie0 mie0Var = new mie0();
        List listT = pgi0.t(new tjt(pgi0.l(lgi0.e(ske.c, fqyVar), ske.d), new kh10(classLoader, nzs0Var, function0, mie0Var, (byte) 1)));
        x8x x8xVarA3 = fqyVar.a();
        c5k c5kVar2 = j24.y;
        iiy[] iiyVarArr = j24.f15764a;
        boolean z3 = c5kVar2.m(iiyVarArr[51], fqyVar) || z;
        if (x8xVarA3 instanceof rpy) {
            String str3 = ((rpy) x8xVarA3).f30907a;
            if (Intrinsics.d(str3, "kotlin/Array")) {
                kiy kiyVar3 = ((KTypeProjection) CollectionsKt.v0(listT)).b;
                if (kiyVar3 == null) {
                    kiyVar3 = g4m0.f10674a;
                }
                fhyVarB = sre0.f32672a.b(xtt0.e(azw.G(g7x.G(kiyVar3))));
            } else {
                fhyVarA = R(classLoader, str3, z3);
                if (fhyVarA == null) {
                    throw new poe("Class not found: ".concat(str3));
                }
            }
            boolean zM = c5kVar2.m(iiyVarArr[51], fqyVar);
            a8z a8zVarA = maz.a(wez.f39042a, new h5((Object) fqyVar, (Object) classLoader, (byte) 25));
            fqyVar2 = fqyVar.d;
            if (fqyVar2 != null) {
                v2VarZ = Z(fqyVar2, classLoader, nzs0Var, null, 12);
            } else {
                v2VarZ = null;
            }
            boolean zM2 = j24.A.m(iiyVarArr[53], fqyVar);
            x8xVarA = fqyVar.a();
            if (x8xVarA instanceof rpy) {
                rpyVar = (rpy) x8xVarA;
            } else {
                rpyVar = null;
            }
            if (rpyVar != null) {
                str = rpyVar.f30907a;
            } else {
                str = null;
            }
            boolean zD = Intrinsics.d(str, "kotlin/Nothing");
            c5kVar = j24.z;
            boolean zM3 = c5kVar.m(iiyVarArr[52], fqyVar);
            x8xVarA2 = fqyVar.a();
            if (x8xVarA2 instanceof rpy) {
                rpyVar2 = (rpy) x8xVarA2;
            } else {
                rpyVar2 = null;
            }
            if (rpyVar2 != null || (str2 = rpyVar2.f30907a) == null) {
                r1 = 0;
                yx40VarA = null;
            } else if (bay.l.containsKey(V(str2))) {
                yx40VarA = md9.a((sgy) fhyVarB);
                r1 = 0;
            } else {
                r1 = 0;
                yx40VarA = null;
            }
            mie0Var.f21842a = new iyj0(fhyVarB, listT, zM, a8zVarA, v2VarZ, zM2, zD, zM3, yx40VarA, function0);
            if (c5kVar.m(iiyVarArr[52], fqyVar)) {
                obj2 = mie0Var.f21842a;
                if (obj2 != null) {
                    Intrinsics.h("result");
                    throw r1;
                }
                iyj0Var = (iyj0) obj2;
                z2 = iyj0Var.i;
                list = iyj0Var.c;
                if (z2) {
                    hny.v(iyj0Var, "Not a suspend function type: ");
                    return r1;
                }
                kTypeProjection = (KTypeProjection) CollectionsKt.W(list.size() - 2, list);
                if (kTypeProjection != null || (kiyVar = kTypeProjection.b) == null || !Intrinsics.d(kiyVar.o(), sre0.f32672a.b(yje.class)) || (kTypeProjection2 = (KTypeProjection) CollectionsKt.x0(kiyVar.M())) == null || (kiyVar2 = kTypeProjection2.b) == null) {
                    iyj0Var2 = r1;
                } else {
                    fhy fhyVar = iyj0Var.b;
                    List listP = CollectionsKt.P(2, list);
                    KTypeProjection.c.getClass();
                    iyj0Var2 = new iyj0(fhyVar, CollectionsKt.r0(listP, piy.a(kiyVar2)), iyj0Var.d, iyj0Var.e, iyj0Var.f, iyj0Var.g, iyj0Var.h, true, iyj0Var.j, function0);
                }
                if (iyj0Var2 == 0) {
                    sb = new StringBuilder("Invalid suspend function type: ");
                    obj3 = mie0Var.f21842a;
                    if (obj3 == null) {
                        Intrinsics.h("result");
                        throw r1;
                    }
                    sb.append((iyj0) obj3);
                    throw new poe(sb.toString());
                }
                mie0Var.f21842a = iyj0Var2;
            }
            aqyVar = fqyVar.f;
            if (aqyVar != null || !Intrinsics.d(aqyVar.b, "kotlin.jvm.PlatformType")) {
                obj = mie0Var.f21842a;
                if (obj != null) {
                    return (iyj0) obj;
                }
                Intrinsics.h("result");
                throw r1;
            }
            Object obj4 = mie0Var.f21842a;
            if (obj4 == null) {
                Intrinsics.h("result");
                throw r1;
            }
            iyj0 iyj0Var3 = (iyj0) obj4;
            v2 v2VarZ2 = Z(aqyVar.f1318a, classLoader, nzs0Var, r1, 12);
            boolean z4 = j0x.w(fqyVar).f20028a;
            v2VarZ2.getClass();
            return iyj0Var3.equals(v2VarZ2) ? iyj0Var3 : new jkq(iyj0Var3, v2VarZ2, z4, function0);
        }
        if (x8xVarA3 instanceof spy) {
            fhyVarA = new liy(V(((spy) x8xVarA3).f32606a).a());
        } else {
            if (!(x8xVarA3 instanceof tpy)) {
                t9f.b();
                return null;
            }
            int i = ((tpy) x8xVarA3).f34358a;
            fhyVarA = nzs0Var.a(i);
            if (fhyVarA == null) {
                fhyVarA = new d2o(i);
            }
        }
        fhyVarB = fhyVarA;
        boolean zM4 = c5kVar2.m(iiyVarArr[51], fqyVar);
        a8z a8zVarA2 = maz.a(wez.f39042a, new h5((Object) fqyVar, (Object) classLoader, (byte) 25));
        fqyVar2 = fqyVar.d;
        if (fqyVar2 != null) {
            v2VarZ = Z(fqyVar2, classLoader, nzs0Var, null, 12);
        } else {
            v2VarZ = null;
        }
        boolean zM5 = j24.A.m(iiyVarArr[53], fqyVar);
        x8xVarA = fqyVar.a();
        if (x8xVarA instanceof rpy) {
            rpyVar = (rpy) x8xVarA;
        } else {
            rpyVar = null;
        }
        if (rpyVar != null) {
            str = rpyVar.f30907a;
        } else {
            str = null;
        }
        boolean zD2 = Intrinsics.d(str, "kotlin/Nothing");
        c5kVar = j24.z;
        boolean zM6 = c5kVar.m(iiyVarArr[52], fqyVar);
        x8xVarA2 = fqyVar.a();
        if (x8xVarA2 instanceof rpy) {
            rpyVar2 = (rpy) x8xVarA2;
        } else {
            rpyVar2 = null;
        }
        if (rpyVar2 != null) {
            r1 = 0;
            yx40VarA = null;
        } else {
            r1 = 0;
            yx40VarA = null;
        }
        mie0Var.f21842a = new iyj0(fhyVarB, listT, zM4, a8zVarA2, v2VarZ, zM5, zD2, zM6, yx40VarA, function0);
        if (c5kVar.m(iiyVarArr[52], fqyVar)) {
            obj2 = mie0Var.f21842a;
            if (obj2 != null) {
                Intrinsics.h("result");
                throw r1;
            }
            iyj0Var = (iyj0) obj2;
            z2 = iyj0Var.i;
            list = iyj0Var.c;
            if (z2) {
                hny.v(iyj0Var, "Not a suspend function type: ");
                return r1;
            }
            kTypeProjection = (KTypeProjection) CollectionsKt.W(list.size() - 2, list);
            if (kTypeProjection != null) {
                iyj0Var2 = r1;
            } else {
                iyj0Var2 = r1;
            }
            if (iyj0Var2 == 0) {
                sb = new StringBuilder("Invalid suspend function type: ");
                obj3 = mie0Var.f21842a;
                if (obj3 == null) {
                    Intrinsics.h("result");
                    throw r1;
                }
                sb.append((iyj0) obj3);
                throw new poe(sb.toString());
            }
            mie0Var.f21842a = iyj0Var2;
        }
        aqyVar = fqyVar.f;
        if (aqyVar != null) {
        }
        obj = mie0Var.f21842a;
        if (obj != null) {
            return (iyj0) obj;
        }
        Intrinsics.h("result");
        throw r1;
    }

    public static /* synthetic */ v2 Z(fqy fqyVar, ClassLoader classLoader, nzs0 nzs0Var, Function0 function0, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            function0 = null;
        }
        return Y(fqyVar, classLoader, nzs0Var, z, function0);
    }

    public static final void a(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1484667474);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
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
            if (a4xVar.isEmpty()) {
                fetVar2.e0(-1855455510);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1856179143);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1049645187, new eup(a4xVar, (byte) 13), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(-1855397540);
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 6) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-1855158902);
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
            yfe0VarU.d = new pea(mm40Var2, a4xVar, str, i, (byte) 4);
        }
    }

    public static final uiy a0(kqy kqyVar) {
        kqyVar.getClass();
        int iOrdinal = kqyVar.ordinal();
        if (iOrdinal == 0) {
            return uiy.f35755a;
        }
        if (iOrdinal == 1) {
            return uiy.b;
        }
        if (iOrdinal == 2) {
            return uiy.c;
        }
        t9f.b();
        return null;
    }

    public static final void b(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(218560468);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a2mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarC = o7k0.c(mm40Var2, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            obb.q(jr8.f16991a.b(mm40Var2, gqw0.e), a2mVar, z, fetVar, i2 & 1008, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rvm(mm40Var2, a2mVar, z, i, (byte) 1);
        }
    }

    public static final viy b0(nuu0 nuu0Var) {
        nuu0Var.getClass();
        int iOrdinal = nuu0Var.ordinal();
        if (iOrdinal == 0) {
            return viy.c;
        }
        if (iOrdinal == 1) {
            return viy.d;
        }
        if (iOrdinal == 2) {
            return viy.b;
        }
        if (iOrdinal == 3) {
            return viy.f37504a;
        }
        if (iOrdinal == 4) {
            return viy.d;
        }
        if (iOrdinal == 5) {
            return null;
        }
        t9f.b();
        return null;
    }

    public static final void c(mm40 mm40Var, float f, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        fetVar.g0(851303556);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b2d(f, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "TOOLBAR_CONTAINER_KEY"), fetVar, 54);
            ugdVar2.F(mrv.k0(jm40Var, "TAB_CONTENT_KEY"), fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, f, ugdVar, ugdVar2, i);
        }
    }

    public static final Integer c0(jup jupVar, aup aupVar) {
        int iOrdinal = aupVar.ordinal();
        if (iOrdinal == 0) {
            return jupVar.f17167a;
        }
        if (iOrdinal == 1) {
            return jupVar.b;
        }
        if (iOrdinal == 2) {
            return jupVar.c;
        }
        if (iOrdinal == 3) {
            return jupVar.d;
        }
        if (iOrdinal == 4) {
            return jupVar.e;
        }
        t9f.b();
        return null;
    }

    public static final void d(oms0 oms0Var, mm40 mm40Var, cfq cfqVar, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        Object obj;
        Function1 function2;
        oms0 oms0Var2 = oms0Var;
        p4 p4Var = oms0Var2.f25519a;
        fetVar.g0(-1877370462);
        int i2 = (i & 6) == 0 ? (fetVar.g(oms0Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = cfqVar;
            i2 |= fetVar.i(obj) ? 256 : 128;
        } else {
            obj = cfqVar;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = fpd.p;
                fetVar.o0(objP);
            }
            Function1 function3 = (Function1) objP;
            Object objP2 = fetVar.P();
            Object obj3 = objP2;
            if (objP2 == obj2) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.add(p4Var.y0());
                fetVar.o0(snapshotStateList);
                obj3 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj3;
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                long[] jArr = u1h0.f34903a;
                objP3 = new hz40();
                fetVar.o0(objP3);
            }
            hz40 hz40Var = (hz40) objP3;
            hgk0 hgk0Var = (hgk0) oms0Var2.d;
            if (Intrinsics.d(p4Var.y0(), hgk0Var.getValue())) {
                fetVar.e0(321145192);
                if (snapshotStateList2.size() == 1 && Intrinsics.d(snapshotStateList2.get(0), hgk0Var.getValue())) {
                    fetVar.e0(321469824);
                    fetVar.r(false);
                } else {
                    fetVar.e0(321279546);
                    int i4 = i3 & 14;
                    byte b = 4;
                    boolean z = i4 == 4;
                    Object objP4 = fetVar.P();
                    if (z || objP4 == obj2) {
                        objP4 = new s43(oms0Var2, b);
                        fetVar.o0(objP4);
                    }
                    w3d.y(snapshotStateList2, (Function1) objP4);
                    hz40Var.a();
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                fetVar.e0(321475776);
                fetVar.r(false);
            }
            if (hz40Var.b(hgk0Var.getValue())) {
                fetVar.e0(322279296);
                fetVar.r(false);
            } else {
                fetVar.e0(321536443);
                ListIterator listIterator = snapshotStateList2.listIterator();
                int i5 = 0;
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (Intrinsics.d(function3.invoke(pawVar.next()), function3.invoke(hgk0Var.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    snapshotStateList2.add(hgk0Var.getValue());
                } else {
                    snapshotStateList2.set(i5, hgk0Var.getValue());
                }
                hz40Var.a();
                int size = snapshotStateList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj4 = snapshotStateList2.get(i6);
                    hz40Var.n(obj4, u1c.M(-934471669, new jef(oms0Var2, obj, obj4, ugdVar, (byte) 0), fetVar));
                    i6++;
                    oms0Var2 = oms0Var;
                    obj = cfqVar;
                }
                fetVar.r(false);
            }
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
            jpm0.l(fetVar, Integer.valueOf(iHashCode));
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1312707512);
            int size2 = snapshotStateList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj5 = snapshotStateList2.get(i7);
                fetVar.b0(1171574969, function3.invoke(obj5));
                Function2 function4 = (Function2) hz40Var.g(obj5);
                if (function4 == null) {
                    fetVar.e0(1959122128);
                } else {
                    fetVar.e0(1171576145);
                    function4.invoke(fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
            function2 = function3;
        } else {
            fetVar.X();
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kef(oms0Var, mm40Var, cfqVar, function2, ugdVar, i);
        }
    }

    public static final void e(Object obj, mm40 mm40Var, cfq cfqVar, String str, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        ugd ugdVar2;
        mm40 mm40Var2;
        cfq cfqVar2;
        String str2;
        fetVar.g0(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.i(cfqVar) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            ugdVar2 = ugdVar;
            i3 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        } else {
            ugdVar2 = ugdVar;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var3 = mm40Var;
            cfq cfqVarM0 = i5 != 0 ? ro4.m0(0, 0, null, 7) : cfqVar;
            String str3 = i6 != 0 ? "Crossfade" : str;
            d(phu0.Z(obj, str3, fetVar, (i3 & 14) | ((i3 >> 6) & 112), 0), mm40Var3, cfqVarM0, null, ugdVar2, fetVar, i3 & 58352);
            str2 = str3;
            cfqVar2 = cfqVarM0;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            cfqVar2 = cfqVar;
            str2 = str;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hef(obj, mm40Var2, cfqVar2, str2, ugdVar, i, i2);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, boolean z) {
        fetVar.g0(-1759263319);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 40.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, pkd.l(mm40VarN2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), 0L, fetVar, 2));
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), z ? 128.0f : 96.0f);
            zcl zclVar3 = qmk.e;
            qxw.o(fetVar, pkd.l(mm40VarS, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3), 0L, fetVar, 2));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(z, mm40Var, i, (byte) 6);
        }
    }

    public static final void g(mm40 mm40Var, v2h v2hVar, boolean z, fet fetVar, int i) {
        boolean z2;
        fetVar.g0(-237452365);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(v2hVar) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(108.0f, fetVar);
            float fB2 = pkd.b(256.0f, fetVar);
            int iB = (int) pkd.b(8.0f, fetVar);
            int iC = (int) l1e0.c(((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) / 2.1f, fB, fB2);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, ((ycl) pz40Var.getValue()).f42389a, 7), "EMPTY_UI_CONTENT");
            boolean zE = fetVar.e(iC) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.e(iB);
            Object objP2 = fetVar.P();
            if (zE || objP2 == obj) {
                objP2 = new x2h(fB, fB2, iC, iB);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            dyb.i(v2hVar.f36681a, 0, fetVar, null);
            fetVar.r(true);
            fetVar.e0(-131041167);
            View view = (View) fetVar.k(dy2.f);
            Object rootView = view.getRootView();
            Object obj2 = (w6k) fetVar.k(bmd.h);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(rootView) | fetVar.i(view) | fetVar.g(obj2);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new dc0(rootView, (Object) view, obj2, (Object) pz40Var, (byte) 24);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            fetVar.r(false);
            z2 = true;
        } else {
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 7, i, mm40Var, (Object) v2hVar, z2);
        }
    }

    public static final void h(int i, fet fetVar) {
        fetVar.g0(1445017214);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.M(jm40.b, 8.0f, 4.0f, 8.0f, 4.0f), 1.0f), 52.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 24);
        }
    }

    public static final void i(mm40 mm40Var, ozh ozhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fetVar.g0(1234054780);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ozhVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (ozhVar instanceof izh) {
            fetVar.e0(-1193805240);
            wha0.l(mm40Var, (izh) ozhVar, function0, function1, fetVar, i2 & 8190);
            fetVar.r(false);
        } else if (ozhVar instanceof jzh) {
            fetVar.e0(-1193484204);
            nia0.u(mm40Var, (jzh) ozhVar, function1, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
            fetVar.r(false);
        } else if (ozhVar instanceof kzh) {
            fetVar.e0(-1193205018);
            xia0.r(mm40Var, (kzh) ozhVar, function0, function1, fetVar, i2 & 8190);
            fetVar.r(false);
        } else if (ozhVar instanceof lzh) {
            fetVar.e0(-1192885718);
            oja0.s(mm40Var, (lzh) ozhVar, function0, function1, fetVar, i2 & 8190);
            fetVar.r(false);
        } else if (ozhVar instanceof mzh) {
            fetVar.e0(-1192578539);
            wwb.f(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(ozhVar instanceof nzh)) {
                throw b1j.f(515678171, fetVar, false);
            }
            fetVar.e0(-1192398801);
            wwb.g(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 25, i, (Object) mm40Var, (Object) ozhVar, (Object) function0, (Object) function1);
        }
    }

    public static final void j(mm40 mm40Var, j7n j7nVar, Function1 function1, fet fetVar, int i, int i2) {
        j7nVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40VarQ = i120.Q(mm40Var, y3d.f, jd8.n);
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarL = s5x0.L(mm40VarQ, 16.0f, 0.0f, 2);
        if (j7nVar instanceof g7n) {
            fetVar.e0(2032278682);
            wvb.t(mm40VarL, ((g7n) j7nVar).f10824a, 0, null, function1, fetVar, (i << 3) & 57344, 12);
            fetVar.r(false);
        } else if (j7nVar instanceof h7n) {
            fetVar.e0(2032778712);
            o(mm40VarL, ((h7n) j7nVar).f12584a, 0, null, function1, fetVar, (i << 3) & 57344, 12);
            fetVar.r(false);
        } else {
            if (!(j7nVar instanceof i7n)) {
                throw b1j.f(-765727913, fetVar, false);
            }
            fetVar.e0(2033027270);
            fxb.p(mm40VarL, ((i7n) j7nVar).f14300a, function1, fetVar, (i >> 3) & 896);
            fetVar.r(false);
        }
    }

    public static final void k(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        str.getClass();
        fetVar.g0(-1657309634);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i5 = i3 & (-897);
                i6 = 3;
            } else {
                fetVar.X();
                i5 = i3 & (-897);
                i6 = i;
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 4.0f, 1);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarL, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(i6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i5 >> 3) & 14, 24960, 109560);
            i4 = i6;
        } else {
            fetVar.X();
            i4 = i;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7m(mm40Var, str, i4, i2, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, inm inmVar, int i, kly klyVar, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        Function0 function3;
        byte b;
        String strB;
        fet fetVar2 = fetVar;
        inmVar.getClass();
        fetVar2.g0(1077238260);
        int i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2 | (fetVar2.g(inmVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(i) ? 256 : 128;
        }
        int i4 = i3 | (fetVar2.g(klyVar) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536) | (fetVar2.i(function2) ? 1048576 : 524288);
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            thg0 thg0VarA = shg0.a(rq8.f30919a, gqw0.j, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
            zmm zmmVar = inmVar.f15080a;
            anm anmVar = inmVar.c;
            knm knmVar = inmVar.b;
            yu90 yu90Var = knmVar.e;
            bm90 bm90Var = knmVar.c;
            boolean zG = fetVar2.g(zmmVar);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (zmmVar instanceof xmm) {
                    objP = new d6q0(new y3d(secondary60), new m0x(R.drawable.ic_glyph_language, null, 6), Integer.valueOf(R.drawable.ic_glyph_language));
                } else {
                    int iIntValue = R.drawable.ic_glyph_language;
                    if (!(zmmVar instanceof ymm)) {
                        t9f.b();
                        return;
                    }
                    ymm ymmVar = (ymm) zmmVar;
                    o0x o0xVar = ymmVar.b;
                    Integer num = ymmVar.e;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    y3d y3dVar = ymmVar.f;
                    if (y3dVar != null) {
                        secondary60 = y3dVar.f41946a;
                    }
                    objP = new d6q0(new y3d(secondary60), o0xVar, numValueOf2);
                }
                fetVar2.o0(objP);
            } else {
                yu90Var = yu90Var;
                bm90Var = bm90Var;
            }
            d6q0 d6q0Var = (d6q0) objP;
            boolean z2 = fetVar2.k(bmd.n) == k6z.b;
            boolean zG2 = fetVar2.g(zmmVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                if (zmmVar instanceof xmm) {
                    objP2 = "";
                } else {
                    if (!(zmmVar instanceof ymm)) {
                        t9f.b();
                        return;
                    }
                    objP2 = wwb.F(((ymm) zmmVar).f42897a, z2);
                }
                fetVar2.o0(objP2);
            }
            String str = (String) objP2;
            boolean zH = fetVar2.h(zmmVar.b());
            Object objP3 = fetVar2.P();
            o6q0 o6q0Var = o6q0.f24750a;
            if (zH || objP3 == cl5Var) {
                objP3 = zmmVar.b() ? k6q0.f17783a : o6q0Var;
                fetVar2.o0(objP3);
            }
            p6q0 p6q0Var = (p6q0) objP3;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarY0 = q8a.y0(jm40Var, enx.f8115a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarZ = s5x0.z(mm40VarY0);
            String strA = zmmVar.a();
            r7q0 r7q0Var = r7q0.f29989a;
            s6q0 s6q0Var = new s6q0(str, d6q0Var, p6q0Var, r7q0Var, true, false, null, strA, null, 32128);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new aim((byte) 8);
                fetVar2.o0(objP4);
            }
            o(mm40VarZ, s6q0Var, 0, null, (Function1) objP4, fetVar2, 24576, 12);
            mm40 mm40VarR = ffb0.R(jr8.f16991a.a(jm40Var), 0.0f, 2.0f, 1);
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP5;
            int i5 = i4 & 112;
            boolean z3 = (i5 == 32) | ((57344 & i4) == 16384);
            Object objP6 = fetVar2.P();
            if (z3 || objP6 == cl5Var) {
                function3 = function0;
                b = 0;
                objP6 = new gnm(inmVar, function3, b);
                fetVar2.o0(objP6);
            } else {
                function3 = function0;
                b = 0;
            }
            zq8.a(b, fetVar2, y860.W(mm40VarR, gy40Var, null, false, null, (Function0) objP6, 28));
            fetVar2.r(true);
            bm90 bm90Var2 = bm90Var;
            boolean zG3 = fetVar2.g(bm90Var2);
            Object objP7 = fetVar2.P();
            if (zG3 || objP7 == cl5Var) {
                objP7 = new lm90(g8x.P(bm90Var2), TokenNames.X);
                fetVar2.o0(objP7);
            }
            lm90 lm90Var = (lm90) objP7;
            yu90 yu90Var2 = yu90Var;
            boolean zG4 = fetVar2.g(yu90Var2) | fetVar2.g(bm90Var2);
            Object objP8 = fetVar2.P();
            if (zG4 || objP8 == cl5Var) {
                if (yu90Var2.equals(xu90.f41499a)) {
                    int iQ = g8x.Q(bm90Var2);
                    int i6 = b;
                    String string = "";
                    while (i6 < iQ) {
                        i6++;
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) string);
                        sb.append(i6);
                        string = sb.toString();
                    }
                    strB = lm90Var.b(string);
                } else {
                    strB = yu90Var2.f43258a;
                }
                objP8 = strB;
                fetVar2.o0(objP8);
            }
            String str2 = (String) objP8;
            boolean zG5 = fetVar2.g(anmVar);
            Object objP9 = fetVar2.P();
            if (zG5 || objP9 == cl5Var) {
                Object s7q0Var = anmVar != null ? new s7q0(anmVar.f1162a) : r7q0Var;
                fetVar2.o0(s7q0Var);
                objP9 = s7q0Var;
            }
            t7q0 t7q0Var = (t7q0) objP9;
            String str3 = knmVar.f18593a;
            String strP = g8x.P(bm90Var2);
            oie.f25306a.getClass();
            s6q0 s6q0Var2 = new s6q0(str3, e6q0.f7299a, o6q0Var, t7q0Var, !(zmmVar instanceof xmm), anmVar != null, new z5q0(strP, mie.m), knmVar.b, str2, 28928);
            boolean zG6 = (i5 == 32) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | fetVar2.g(lm90Var);
            Object objP10 = fetVar2.P();
            if (zG6 || objP10 == cl5Var) {
                enm enmVar = new enm((Object) inmVar, (Object) function1, (Object) function2, (Object) lm90Var, (byte) 1);
                fetVar2.o0(enmVar);
                objP10 = enmVar;
            }
            fetVar2 = fetVar2;
            o(null, s6q0Var2, i, klyVar, (Function1) objP10, fetVar2, i4 & 8064, 1);
            fetVar2.r(true);
        } else {
            function3 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fnm(mm40Var, inmVar, i, klyVar, function3, function1, function2, i2, (byte) 1);
        }
    }

    public static final void m(mm40 mm40Var, kvm kvmVar, kvm kvmVar2, a2m a2mVar, String str, String str2, a4x a4xVar, String str3, zum zumVar, boolean z, fet fetVar, int i) {
        int i2;
        String str4;
        String str5;
        fet fetVar2;
        k6z k6zVar;
        a4xVar.getClass();
        str3.getClass();
        fetVar.g0(-931892315);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kvmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(kvmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g("") ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str4 = str2;
            i2 |= fetVar.g(str4) ? 1048576 : 524288;
        } else {
            str4 = str2;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.g(a4xVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            str5 = str3;
            i2 |= fetVar.g(str5) ? 67108864 : 33554432;
        } else {
            str5 = str3;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.g(zumVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, ((306783379 & i2) == 306783378 && ((fetVar.h(z) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            if (z) {
                fetVar.e0(2099667020);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(2099667944);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            int i3 = i2;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            if (str4.length() <= 0 && str5.length() <= 0 && !(zumVar instanceof yum)) {
                fetVar2 = fetVar;
                fetVar2.e0(-1258288889);
                fetVar2.r(false);
            } else {
                fetVar.e0(-1258482050);
                int i4 = i3 >> 15;
                t(null, str4, str5, zumVar, fetVar, ((i3 >> 12) & 1008) | (i4 & 7168) | (i4 & 57344));
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            obc.d(bmd.n.a(k6zVar2), u1c.M(67715035, new zw8((Object) kvmVar, (Object) kvmVar2, (Object) a2mVar, z, a4xVar, str, (byte) 6), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, (Object) kvmVar, (Object) kvmVar2, (Object) a2mVar, str, str2, a4xVar, str3, zumVar, z, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    public static final void n(mm40 mm40Var, vzm vzmVar, vzm vzmVar2, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        k6z k6zVar;
        androidx.compose.runtime.d dVar;
        boolean z2;
        ?? r2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar4.g0(2040776175);
        if ((i & 6) == 0) {
            i2 = (fetVar4.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.g(vzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar4.g(vzmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar4.g(jwmVar) : fetVar4.i(jwmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar4.g(jwmVar2) : fetVar4.i(jwmVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? fetVar4.g(jwmVar3) : fetVar4.i(jwmVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar4.e(0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar4.h(z) ? 8388608 : 4194304;
        }
        if (fetVar4.U(i2 & 1, (4793491 & i2) != 4793490)) {
            androidx.compose.runtime.d dVar2 = bmd.n;
            k6z k6zVar2 = (k6z) fetVar4.k(dVar2);
            Object obj = z ? k6zVar2 : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarN);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            String str = jwmVar.f17257a;
            if (str == null || str.length() == 0) {
                k6zVar = k6zVar2;
                dVar = dVar2;
                z2 = false;
                r2 = 1;
                fetVar4.e0(2121926461);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fetVar4.e0(2121677252);
                r2 = 1;
                k6zVar = k6zVar2;
                dVar = dVar2;
                z2 = false;
                v8q0.a(jwmVar.f17257a, null, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110586);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 4.0f, r2);
            uso0 uso0Var2 = uso0.f36223a;
            boolean z3 = z2;
            v(mm40VarL, vzmVar, z3, fetVar3, i2 & 112, 0);
            uso0 uso0Var3 = uso0.f36223a;
            fet fetVar6 = fetVar;
            v(null, vzmVar2, z3, fetVar6, (i2 >> 3) & 112, 1);
            obc.d(dVar.a(obj), u1c.M(986572197, new zzm(k6zVar, jwmVar2, jwmVar3, (byte) 0), fetVar6), fetVar6, 56);
            fetVar6.r(r2);
            fetVar2 = fetVar6;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, vzmVar, vzmVar2, jwmVar, jwmVar2, jwmVar3, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014f  */
    /* JADX WARN: Code duplicated, block: B:103:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0170  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x0192  */
    /* JADX WARN: Code duplicated, block: B:115:0x019f  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8 A[LOOP:0: B:117:0x01c6->B:118:0x01c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:134:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x0209  */
    /* JADX WARN: Code duplicated, block: B:140:0x021d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0220  */
    /* JADX WARN: Code duplicated, block: B:144:0x0224  */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:147:0x022d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0232  */
    /* JADX WARN: Code duplicated, block: B:150:0x0236  */
    /* JADX WARN: Code duplicated, block: B:152:0x023c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0244  */
    /* JADX WARN: Code duplicated, block: B:156:0x0272  */
    /* JADX WARN: Code duplicated, block: B:158:0x0279  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0325  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:181:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:184:0x03db  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x0118  */
    /* JADX WARN: Code duplicated, block: B:88:0x011f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d A[ADDED_TO_REGION] */
    public static final void o(mm40 mm40Var, s6q0 s6q0Var, int i, kly klyVar, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        int i5;
        int i6;
        kly klyVar2;
        int i7;
        Function1 function2;
        int i8;
        boolean z;
        mm40 mm40Var3;
        int i9;
        kly klyVar3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i10;
        kly klyVar4;
        p6q0 p6q0Var;
        b6q0 b6q0Var;
        boolean zH;
        Object objP;
        cl5 cl5Var;
        float f;
        Object objP2;
        agk0 agk0Var;
        Object objP3;
        cgk0 cgk0Var;
        boolean zG;
        Object objP4;
        int i11;
        boolean zG2;
        Object objP5;
        boolean zBooleanValue;
        boolean zG3;
        Object objP6;
        boolean z2;
        Object objP7;
        Object[] objArrCopyOf;
        boolean zE;
        int length;
        int i12;
        Object objP8;
        oie oieVar;
        String str;
        boolean z3;
        byte b;
        float f2;
        Object objP9;
        boolean z4;
        Object objP10;
        int i13;
        uuu0 uuu0Var = gfk0.f;
        s6q0Var.getClass();
        boolean z5 = s6q0Var.e;
        function1.getClass();
        fetVar.g0(1537919290);
        int i14 = i3 & 1;
        if (i14 != 0) {
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
            i4 |= fetVar.g(s6q0Var) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= fetVar.e(i5) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    klyVar2 = klyVar;
                    if (fetVar.g(klyVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                if ((i2 & 24576) == 0) {
                    function2 = function1;
                    if (fetVar.i(function2)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i4 |= i13;
                } else {
                    function2 = function1;
                }
                i8 = i4;
                if ((i8 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i8 & 1, z)) {
                    if (i14 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i15 != 0) {
                        i10 = -1;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        klyVar4 = kly.d;
                    } else {
                        klyVar4 = klyVar2;
                    }
                    p6q0Var = s6q0Var.c;
                    b6q0Var = s6q0Var.g;
                    zH = fetVar.h(z5);
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (zH || objP == cl5Var) {
                        if (z5) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP = Float.valueOf(f);
                        fetVar.o0(objP);
                    }
                    float fFloatValue = ((Number) objP).floatValue();
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.a(16.0f);
                        fetVar.o0(objP2);
                    }
                    agk0Var = (agk0) objP2;
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.b(0);
                        fetVar.o0(objP3);
                    }
                    cgk0Var = (cgk0) objP3;
                    zG = fetVar.g(b6q0Var);
                    objP4 = fetVar.P();
                    if (zG || objP4 == cl5Var) {
                        if (b6q0Var == null) {
                            i11 = 0;
                        } else if (b6q0Var instanceof a6q0) {
                            if (((a6q0) b6q0Var).f329a) {
                                i11 = 8;
                            } else {
                                i11 = 7;
                            }
                        } else if (b6q0Var instanceof y5q0) {
                            i11 = ((y5q0) b6q0Var).f42061a;
                        } else if (!(b6q0Var instanceof z5q0)) {
                            t9f.b();
                            return;
                        } else {
                            i11 = 9;
                        }
                        objP4 = new bmy(i11);
                        fetVar.o0(objP4);
                    }
                    int i16 = ((bmy) objP4).f2857a;
                    zG2 = fetVar.g(b6q0Var);
                    objP5 = fetVar.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                        fetVar.o0(objP5);
                    }
                    zBooleanValue = ((Boolean) objP5).booleanValue();
                    zG3 = fetVar.g(p6q0Var);
                    objP6 = fetVar.P();
                    if (zG3 || objP6 == cl5Var) {
                        if (!(p6q0Var instanceof i6q0) || (p6q0Var instanceof l6q0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP6 = Boolean.valueOf(z2);
                        fetVar.o0(objP6);
                    }
                    Boolean bool = (Boolean) objP6;
                    boolean zBooleanValue2 = bool.booleanValue();
                    Object[] objArr = new Object[0];
                    objP7 = fetVar.P();
                    if (objP7 == cl5Var) {
                        objP7 = new ndm((byte) 24);
                        fetVar.o0(objP7);
                    }
                    pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP7, fetVar, 48);
                    Boolean bool2 = (Boolean) pz40Var.getValue();
                    bool2.getClass();
                    objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool2, bool}, 3);
                    zE = fetVar.e(objArrCopyOf.length);
                    length = objArrCopyOf.length;
                    i12 = 0;
                    while (i12 < length) {
                        int i17 = i12;
                        zE |= fetVar.g(objArrCopyOf[i17]);
                        i12 = i17 + 1;
                    }
                    objP8 = fetVar.P();
                    if (zE || objP8 == cl5Var) {
                        if (b6q0Var == null) {
                            objP8 = uuu0Var;
                        } else if (b6q0Var instanceof a6q0) {
                            if (zBooleanValue || (!((Boolean) pz40Var.getValue()).booleanValue() && zBooleanValue2)) {
                                objP8 = uuu0Var;
                            } else {
                                objP8 = new v190();
                            }
                        } else if (b6q0Var instanceof y5q0) {
                            objP8 = ((y5q0) b6q0Var).b;
                        } else if (!(b6q0Var instanceof z5q0)) {
                            t9f.b();
                            return;
                        } else {
                            z5q0 z5q0Var = (z5q0) b6q0Var;
                            objP8 = new lm90(z5q0Var.f43831a, z5q0Var.b);
                        }
                        fetVar.o0(objP8);
                    }
                    vuu0 vuu0Var = (vuu0) objP8;
                    if (b6q0Var == null) {
                        oieVar = null;
                    } else if (b6q0Var instanceof y5q0) {
                        oieVar = ((y5q0) b6q0Var).c;
                    } else if (b6q0Var instanceof z5q0) {
                        oieVar = ((z5q0) b6q0Var).c;
                    } else if (b6q0Var instanceof a6q0) {
                        t9f.b();
                        return;
                    } else if (((a6q0) b6q0Var).b) {
                        oie.f25306a.getClass();
                        oieVar = mie.e;
                    } else {
                        oie.f25306a.getClass();
                        oieVar = mie.c;
                    }
                    oie oieVar2 = oieVar;
                    String str2 = s6q0Var.f31716a;
                    str = s6q0Var.h;
                    String str3 = s6q0Var.i;
                    boolean z6 = s6q0Var.e;
                    boolean z7 = p6q0Var instanceof k6q0;
                    boolean z8 = s6q0Var.f;
                    boolean z9 = s6q0Var.j;
                    a7n a7nVar = s6q0Var.l;
                    boolean z10 = s6q0Var.k;
                    if (str.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    b = 16;
                    long jO = O(s6q0Var.f, fetVar);
                    zcl zclVar = qmk.f28987a;
                    ugg0 ugg0VarA = vgg0.a(10.0f);
                    lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 12.0f, 5);
                    if (Intrinsics.d(p6q0Var, o6q0.f24750a)) {
                        f2 = 12.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    lh80 lh80VarU2 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
                    y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, idm0.v(agk0Var.l(), 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                    objP9 = fetVar.P();
                    if (objP9 == cl5Var) {
                        objP9 = new aim(b);
                        fetVar.o0(objP9);
                    }
                    mm40 mm40VarN = epv0.N(pai0.a(mm40Var4, true, (Function1) objP9), fFloatValue);
                    if ((i8 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP10 = fetVar.P();
                    if (z4 || objP10 == cl5Var) {
                        objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                        fetVar.o0(objP10);
                    }
                    h36.a(mm40VarN, str2, q7q0.f28265a, str, str3, z6, true, z7, z8, false, oieVar2, z9, z10, null, null, false, vuu0Var, z3, jO, y9q0VarA, ugg0VarA, i16, i10, klyVar4, 0.0f, 8.0f, f2, lh80VarU, lh80VarU2, false, 46.0f, -1, a7nVar, (Function1) objP10, function1, u1c.M(-1455996792, new elm(s6q0Var, (byte) 3), fetVar), u1c.M(-1789094683, new p2n((Object) s6q0Var, zBooleanValue2, pz40Var, function2, (byte) 4), fetVar), u1c.M(-782171994, new mxm(s6q0Var, (byte) 19), fetVar), fetVar, 806879616, 0, i8 & 8064, (458752 & (i8 << 3)) | 114819072, 553705472, 0);
                    i9 = i10;
                    klyVar3 = klyVar4;
                    mm40Var3 = mm40Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    i9 = i5;
                    klyVar3 = klyVar2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new e7n(mm40Var3, s6q0Var, i9, klyVar3, function1, i2, i3, (byte) 1);
                }
            }
            i4 |= 3072;
            klyVar2 = klyVar;
            if ((i2 & 24576) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i4 |= i13;
            } else {
                function2 = function1;
            }
            i8 = i4;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i8 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i15 != 0) {
                    i10 = -1;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    klyVar4 = kly.d;
                } else {
                    klyVar4 = klyVar2;
                }
                p6q0Var = s6q0Var.c;
                b6q0Var = s6q0Var.g;
                zH = fetVar.h(z5);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (zH) {
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                } else {
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                }
                float fFloatValue2 = ((Number) objP).floatValue();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.a(16.0f);
                    fetVar.o0(objP2);
                }
                agk0Var = (agk0) objP2;
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP3);
                }
                cgk0Var = (cgk0) objP3;
                zG = fetVar.g(b6q0Var);
                objP4 = fetVar.P();
                if (zG) {
                    if (b6q0Var == null) {
                        i11 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i11 = 8;
                        } else {
                            i11 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i11 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i11 = 9;
                    }
                    objP4 = new bmy(i11);
                    fetVar.o0(objP4);
                } else {
                    if (b6q0Var == null) {
                        i11 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i11 = 8;
                        } else {
                            i11 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i11 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i11 = 9;
                    }
                    objP4 = new bmy(i11);
                    fetVar.o0(objP4);
                }
                int i18 = ((bmy) objP4).f2857a;
                zG2 = fetVar.g(b6q0Var);
                objP5 = fetVar.P();
                if (zG2) {
                    objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP5);
                } else {
                    objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP5);
                }
                zBooleanValue = ((Boolean) objP5).booleanValue();
                zG3 = fetVar.g(p6q0Var);
                objP6 = fetVar.P();
                if (zG3) {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP6 = Boolean.valueOf(z2);
                    fetVar.o0(objP6);
                } else {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP6 = Boolean.valueOf(z2);
                    fetVar.o0(objP6);
                }
                Boolean bool3 = (Boolean) objP6;
                boolean zBooleanValue3 = bool3.booleanValue();
                Object[] objArr2 = new Object[0];
                objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new ndm((byte) 24);
                    fetVar.o0(objP7);
                }
                pz40 pz40Var2 = (pz40) e9x.Q(objArr2, (Function0) objP7, fetVar, 48);
                Boolean bool4 = (Boolean) pz40Var2.getValue();
                bool4.getClass();
                objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool4, bool3}, 3);
                zE = fetVar.e(objArrCopyOf.length);
                length = objArrCopyOf.length;
                i12 = 0;
                while (i12 < length) {
                    int i19 = i12;
                    zE |= fetVar.g(objArrCopyOf[i19]);
                    i12 = i19 + 1;
                }
                objP8 = fetVar.P();
                if (zE) {
                    if (b6q0Var == null) {
                        objP8 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP8 = uuu0Var;
                        } else {
                            objP8 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP8 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var2 = (z5q0) b6q0Var;
                        objP8 = new lm90(z5q0Var2.f43831a, z5q0Var2.b);
                    }
                    fetVar.o0(objP8);
                } else {
                    if (b6q0Var == null) {
                        objP8 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP8 = uuu0Var;
                        } else {
                            objP8 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP8 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var3 = (z5q0) b6q0Var;
                        objP8 = new lm90(z5q0Var3.f43831a, z5q0Var3.b);
                    }
                    fetVar.o0(objP8);
                }
                vuu0 vuu0Var2 = (vuu0) objP8;
                if (b6q0Var == null) {
                    oieVar = null;
                } else if (b6q0Var instanceof y5q0) {
                    oieVar = ((y5q0) b6q0Var).c;
                } else if (b6q0Var instanceof z5q0) {
                    oieVar = ((z5q0) b6q0Var).c;
                } else if (b6q0Var instanceof a6q0) {
                    t9f.b();
                    return;
                } else if (((a6q0) b6q0Var).b) {
                    oie.f25306a.getClass();
                    oieVar = mie.e;
                } else {
                    oie.f25306a.getClass();
                    oieVar = mie.c;
                }
                oie oieVar3 = oieVar;
                String str4 = s6q0Var.f31716a;
                str = s6q0Var.h;
                String str5 = s6q0Var.i;
                boolean z11 = s6q0Var.e;
                boolean z12 = p6q0Var instanceof k6q0;
                boolean z13 = s6q0Var.f;
                boolean z14 = s6q0Var.j;
                a7n a7nVar2 = s6q0Var.l;
                boolean z15 = s6q0Var.k;
                if (str.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b = 16;
                long jO2 = O(s6q0Var.f, fetVar);
                zcl zclVar2 = qmk.f28987a;
                ugg0 ugg0VarA2 = vgg0.a(10.0f);
                lh80 lh80VarU3 = s5x0.u(0.0f, 12.0f, 0.0f, 12.0f, 5);
                if (Intrinsics.d(p6q0Var, o6q0.f24750a)) {
                    f2 = 12.0f;
                } else {
                    f2 = 0.0f;
                }
                lh80 lh80VarU4 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
                y9q0 y9q0VarA2 = y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, idm0.v(agk0Var.l(), 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                objP9 = fetVar.P();
                if (objP9 == cl5Var) {
                    objP9 = new aim(b);
                    fetVar.o0(objP9);
                }
                mm40 mm40VarN2 = epv0.N(pai0.a(mm40Var4, true, (Function1) objP9), fFloatValue2);
                if ((i8 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP10 = fetVar.P();
                if (z4) {
                    objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                    fetVar.o0(objP10);
                } else {
                    objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                    fetVar.o0(objP10);
                }
                h36.a(mm40VarN2, str4, q7q0.f28265a, str, str5, z11, true, z12, z13, false, oieVar3, z14, z15, null, null, false, vuu0Var2, z3, jO2, y9q0VarA2, ugg0VarA2, i18, i10, klyVar4, 0.0f, 8.0f, f2, lh80VarU3, lh80VarU4, false, 46.0f, -1, a7nVar2, (Function1) objP10, function1, u1c.M(-1455996792, new elm(s6q0Var, (byte) 3), fetVar), u1c.M(-1789094683, new p2n((Object) s6q0Var, zBooleanValue3, pz40Var2, function2, (byte) 4), fetVar), u1c.M(-782171994, new mxm(s6q0Var, (byte) 19), fetVar), fetVar, 806879616, 0, i8 & 8064, (458752 & (i8 << 3)) | 114819072, 553705472, 0);
                i9 = i10;
                klyVar3 = klyVar4;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                i9 = i5;
                klyVar3 = klyVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7n(mm40Var3, s6q0Var, i9, klyVar3, function1, i2, i3, (byte) 1);
            }
        }
        i4 |= 384;
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                klyVar2 = klyVar;
                if (fetVar.g(klyVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if ((i2 & 24576) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i4 |= i13;
            } else {
                function2 = function1;
            }
            i8 = i4;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i8 & 1, z)) {
                if (i14 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i15 != 0) {
                    i10 = -1;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    klyVar4 = kly.d;
                } else {
                    klyVar4 = klyVar2;
                }
                p6q0Var = s6q0Var.c;
                b6q0Var = s6q0Var.g;
                zH = fetVar.h(z5);
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (zH) {
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                } else {
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP = Float.valueOf(f);
                    fetVar.o0(objP);
                }
                float fFloatValue3 = ((Number) objP).floatValue();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.a(16.0f);
                    fetVar.o0(objP2);
                }
                agk0Var = (agk0) objP2;
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP3);
                }
                cgk0Var = (cgk0) objP3;
                zG = fetVar.g(b6q0Var);
                objP4 = fetVar.P();
                if (zG) {
                    if (b6q0Var == null) {
                        i11 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i11 = 8;
                        } else {
                            i11 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i11 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i11 = 9;
                    }
                    objP4 = new bmy(i11);
                    fetVar.o0(objP4);
                } else {
                    if (b6q0Var == null) {
                        i11 = 0;
                    } else if (b6q0Var instanceof a6q0) {
                        if (((a6q0) b6q0Var).f329a) {
                            i11 = 8;
                        } else {
                            i11 = 7;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        i11 = ((y5q0) b6q0Var).f42061a;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        i11 = 9;
                    }
                    objP4 = new bmy(i11);
                    fetVar.o0(objP4);
                }
                int i110 = ((bmy) objP4).f2857a;
                zG2 = fetVar.g(b6q0Var);
                objP5 = fetVar.P();
                if (zG2) {
                    objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP5);
                } else {
                    objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                    fetVar.o0(objP5);
                }
                zBooleanValue = ((Boolean) objP5).booleanValue();
                zG3 = fetVar.g(p6q0Var);
                objP6 = fetVar.P();
                if (zG3) {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP6 = Boolean.valueOf(z2);
                    fetVar.o0(objP6);
                } else {
                    if (p6q0Var instanceof i6q0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objP6 = Boolean.valueOf(z2);
                    fetVar.o0(objP6);
                }
                Boolean bool5 = (Boolean) objP6;
                boolean zBooleanValue4 = bool5.booleanValue();
                Object[] objArr3 = new Object[0];
                objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new ndm((byte) 24);
                    fetVar.o0(objP7);
                }
                pz40 pz40Var3 = (pz40) e9x.Q(objArr3, (Function0) objP7, fetVar, 48);
                Boolean bool6 = (Boolean) pz40Var3.getValue();
                bool6.getClass();
                objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool6, bool5}, 3);
                zE = fetVar.e(objArrCopyOf.length);
                length = objArrCopyOf.length;
                i12 = 0;
                while (i12 < length) {
                    int i111 = i12;
                    zE |= fetVar.g(objArrCopyOf[i111]);
                    i12 = i111 + 1;
                }
                objP8 = fetVar.P();
                if (zE) {
                    if (b6q0Var == null) {
                        objP8 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP8 = uuu0Var;
                        } else {
                            objP8 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP8 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var4 = (z5q0) b6q0Var;
                        objP8 = new lm90(z5q0Var4.f43831a, z5q0Var4.b);
                    }
                    fetVar.o0(objP8);
                } else {
                    if (b6q0Var == null) {
                        objP8 = uuu0Var;
                    } else if (b6q0Var instanceof a6q0) {
                        if (zBooleanValue) {
                            objP8 = uuu0Var;
                        } else {
                            objP8 = uuu0Var;
                        }
                    } else if (b6q0Var instanceof y5q0) {
                        objP8 = ((y5q0) b6q0Var).b;
                    } else if (!(b6q0Var instanceof z5q0)) {
                        t9f.b();
                        return;
                    } else {
                        z5q0 z5q0Var5 = (z5q0) b6q0Var;
                        objP8 = new lm90(z5q0Var5.f43831a, z5q0Var5.b);
                    }
                    fetVar.o0(objP8);
                }
                vuu0 vuu0Var3 = (vuu0) objP8;
                if (b6q0Var == null) {
                    oieVar = null;
                } else if (b6q0Var instanceof y5q0) {
                    oieVar = ((y5q0) b6q0Var).c;
                } else if (b6q0Var instanceof z5q0) {
                    oieVar = ((z5q0) b6q0Var).c;
                } else if (b6q0Var instanceof a6q0) {
                    t9f.b();
                    return;
                } else if (((a6q0) b6q0Var).b) {
                    oie.f25306a.getClass();
                    oieVar = mie.e;
                } else {
                    oie.f25306a.getClass();
                    oieVar = mie.c;
                }
                oie oieVar4 = oieVar;
                String str6 = s6q0Var.f31716a;
                str = s6q0Var.h;
                String str7 = s6q0Var.i;
                boolean z16 = s6q0Var.e;
                boolean z17 = p6q0Var instanceof k6q0;
                boolean z18 = s6q0Var.f;
                boolean z19 = s6q0Var.j;
                a7n a7nVar3 = s6q0Var.l;
                boolean z110 = s6q0Var.k;
                if (str.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b = 16;
                long jO3 = O(s6q0Var.f, fetVar);
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0VarA3 = vgg0.a(10.0f);
                lh80 lh80VarU5 = s5x0.u(0.0f, 12.0f, 0.0f, 12.0f, 5);
                if (Intrinsics.d(p6q0Var, o6q0.f24750a)) {
                    f2 = 12.0f;
                } else {
                    f2 = 0.0f;
                }
                lh80 lh80VarU6 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
                y9q0 y9q0VarA3 = y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, idm0.v(agk0Var.l(), 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                objP9 = fetVar.P();
                if (objP9 == cl5Var) {
                    objP9 = new aim(b);
                    fetVar.o0(objP9);
                }
                mm40 mm40VarN3 = epv0.N(pai0.a(mm40Var4, true, (Function1) objP9), fFloatValue3);
                if ((i8 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP10 = fetVar.P();
                if (z4) {
                    objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                    fetVar.o0(objP10);
                } else {
                    objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                    fetVar.o0(objP10);
                }
                h36.a(mm40VarN3, str6, q7q0.f28265a, str, str7, z16, true, z17, z18, false, oieVar4, z19, z110, null, null, false, vuu0Var3, z3, jO3, y9q0VarA3, ugg0VarA3, i110, i10, klyVar4, 0.0f, 8.0f, f2, lh80VarU5, lh80VarU6, false, 46.0f, -1, a7nVar3, (Function1) objP10, function1, u1c.M(-1455996792, new elm(s6q0Var, (byte) 3), fetVar), u1c.M(-1789094683, new p2n((Object) s6q0Var, zBooleanValue4, pz40Var3, function2, (byte) 4), fetVar), u1c.M(-782171994, new mxm(s6q0Var, (byte) 19), fetVar), fetVar, 806879616, 0, i8 & 8064, (458752 & (i8 << 3)) | 114819072, 553705472, 0);
                i9 = i10;
                klyVar3 = klyVar4;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                i9 = i5;
                klyVar3 = klyVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7n(mm40Var3, s6q0Var, i9, klyVar3, function1, i2, i3, (byte) 1);
            }
        }
        i4 |= 3072;
        klyVar2 = klyVar;
        if ((i2 & 24576) == 0) {
            function2 = function1;
            if (fetVar.i(function2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        } else {
            function2 = function1;
        }
        i8 = i4;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i8 & 1, z)) {
            if (i14 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i15 != 0) {
                i10 = -1;
            } else {
                i10 = i5;
            }
            if (i6 != 0) {
                klyVar4 = kly.d;
            } else {
                klyVar4 = klyVar2;
            }
            p6q0Var = s6q0Var.c;
            b6q0Var = s6q0Var.g;
            zH = fetVar.h(z5);
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (zH) {
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP = Float.valueOf(f);
                fetVar.o0(objP);
            } else {
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP = Float.valueOf(f);
                fetVar.o0(objP);
            }
            float fFloatValue4 = ((Number) objP).floatValue();
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.a(16.0f);
                fetVar.o0(objP2);
            }
            agk0Var = (agk0) objP2;
            objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP3);
            }
            cgk0Var = (cgk0) objP3;
            zG = fetVar.g(b6q0Var);
            objP4 = fetVar.P();
            if (zG) {
                if (b6q0Var == null) {
                    i11 = 0;
                } else if (b6q0Var instanceof a6q0) {
                    if (((a6q0) b6q0Var).f329a) {
                        i11 = 8;
                    } else {
                        i11 = 7;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    i11 = ((y5q0) b6q0Var).f42061a;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    i11 = 9;
                }
                objP4 = new bmy(i11);
                fetVar.o0(objP4);
            } else {
                if (b6q0Var == null) {
                    i11 = 0;
                } else if (b6q0Var instanceof a6q0) {
                    if (((a6q0) b6q0Var).f329a) {
                        i11 = 8;
                    } else {
                        i11 = 7;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    i11 = ((y5q0) b6q0Var).f42061a;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    i11 = 9;
                }
                objP4 = new bmy(i11);
                fetVar.o0(objP4);
            }
            int i112 = ((bmy) objP4).f2857a;
            zG2 = fetVar.g(b6q0Var);
            objP5 = fetVar.P();
            if (zG2) {
                objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                fetVar.o0(objP5);
            } else {
                objP5 = Boolean.valueOf(b6q0Var instanceof a6q0);
                fetVar.o0(objP5);
            }
            zBooleanValue = ((Boolean) objP5).booleanValue();
            zG3 = fetVar.g(p6q0Var);
            objP6 = fetVar.P();
            if (zG3) {
                if (p6q0Var instanceof i6q0) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objP6 = Boolean.valueOf(z2);
                fetVar.o0(objP6);
            } else {
                if (p6q0Var instanceof i6q0) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objP6 = Boolean.valueOf(z2);
                fetVar.o0(objP6);
            }
            Boolean bool7 = (Boolean) objP6;
            boolean zBooleanValue5 = bool7.booleanValue();
            Object[] objArr4 = new Object[0];
            objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = new ndm((byte) 24);
                fetVar.o0(objP7);
            }
            pz40 pz40Var4 = (pz40) e9x.Q(objArr4, (Function0) objP7, fetVar, 48);
            Boolean bool8 = (Boolean) pz40Var4.getValue();
            bool8.getClass();
            objArrCopyOf = Arrays.copyOf(new Object[]{b6q0Var, bool8, bool7}, 3);
            zE = fetVar.e(objArrCopyOf.length);
            length = objArrCopyOf.length;
            i12 = 0;
            while (i12 < length) {
                int i113 = i12;
                zE |= fetVar.g(objArrCopyOf[i113]);
                i12 = i113 + 1;
            }
            objP8 = fetVar.P();
            if (zE) {
                if (b6q0Var == null) {
                    objP8 = uuu0Var;
                } else if (b6q0Var instanceof a6q0) {
                    if (zBooleanValue) {
                        objP8 = uuu0Var;
                    } else {
                        objP8 = uuu0Var;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    objP8 = ((y5q0) b6q0Var).b;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    z5q0 z5q0Var6 = (z5q0) b6q0Var;
                    objP8 = new lm90(z5q0Var6.f43831a, z5q0Var6.b);
                }
                fetVar.o0(objP8);
            } else {
                if (b6q0Var == null) {
                    objP8 = uuu0Var;
                } else if (b6q0Var instanceof a6q0) {
                    if (zBooleanValue) {
                        objP8 = uuu0Var;
                    } else {
                        objP8 = uuu0Var;
                    }
                } else if (b6q0Var instanceof y5q0) {
                    objP8 = ((y5q0) b6q0Var).b;
                } else if (!(b6q0Var instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    z5q0 z5q0Var7 = (z5q0) b6q0Var;
                    objP8 = new lm90(z5q0Var7.f43831a, z5q0Var7.b);
                }
                fetVar.o0(objP8);
            }
            vuu0 vuu0Var4 = (vuu0) objP8;
            if (b6q0Var == null) {
                oieVar = null;
            } else if (b6q0Var instanceof y5q0) {
                oieVar = ((y5q0) b6q0Var).c;
            } else if (b6q0Var instanceof z5q0) {
                oieVar = ((z5q0) b6q0Var).c;
            } else if (b6q0Var instanceof a6q0) {
                t9f.b();
                return;
            } else if (((a6q0) b6q0Var).b) {
                oie.f25306a.getClass();
                oieVar = mie.e;
            } else {
                oie.f25306a.getClass();
                oieVar = mie.c;
            }
            oie oieVar5 = oieVar;
            String str8 = s6q0Var.f31716a;
            str = s6q0Var.h;
            String str9 = s6q0Var.i;
            boolean z111 = s6q0Var.e;
            boolean z112 = p6q0Var instanceof k6q0;
            boolean z113 = s6q0Var.f;
            boolean z114 = s6q0Var.j;
            a7n a7nVar4 = s6q0Var.l;
            boolean z115 = s6q0Var.k;
            if (str.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            b = 16;
            long jO4 = O(s6q0Var.f, fetVar);
            zcl zclVar4 = qmk.f28987a;
            ugg0 ugg0VarA4 = vgg0.a(10.0f);
            lh80 lh80VarU7 = s5x0.u(0.0f, 12.0f, 0.0f, 12.0f, 5);
            if (Intrinsics.d(p6q0Var, o6q0.f24750a)) {
                f2 = 12.0f;
            } else {
                f2 = 0.0f;
            }
            lh80 lh80VarU8 = s5x0.u(8.0f, 0.0f, 12.0f, 0.0f, 10);
            y9q0 y9q0VarA4 = y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, idm0.v(agk0Var.l(), 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
            objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = new aim(b);
                fetVar.o0(objP9);
            }
            mm40 mm40VarN4 = epv0.N(pai0.a(mm40Var4, true, (Function1) objP9), fFloatValue4);
            if ((i8 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP10 = fetVar.P();
            if (z4) {
                objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                fetVar.o0(objP10);
            } else {
                objP10 = new edl(s6q0Var, agk0Var, cgk0Var);
                fetVar.o0(objP10);
            }
            h36.a(mm40VarN4, str8, q7q0.f28265a, str, str9, z111, true, z112, z113, false, oieVar5, z114, z115, null, null, false, vuu0Var4, z3, jO4, y9q0VarA4, ugg0VarA4, i112, i10, klyVar4, 0.0f, 8.0f, f2, lh80VarU7, lh80VarU8, false, 46.0f, -1, a7nVar4, (Function1) objP10, function1, u1c.M(-1455996792, new elm(s6q0Var, (byte) 3), fetVar), u1c.M(-1789094683, new p2n((Object) s6q0Var, zBooleanValue5, pz40Var4, function2, (byte) 4), fetVar), u1c.M(-782171994, new mxm(s6q0Var, (byte) 19), fetVar), fetVar, 806879616, 0, i8 & 8064, (458752 & (i8 << 3)) | 114819072, 553705472, 0);
            i9 = i10;
            klyVar3 = klyVar4;
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            i9 = i5;
            klyVar3 = klyVar2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7n(mm40Var3, s6q0Var, i9, klyVar3, function1, i2, i3, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:99:0x0106  */
    public static final void p(mm40 mm40Var, ow3 ow3Var, sw3 sw3Var, yx7 yx7Var, int i, int i2, final ugd ugdVar, fet fetVar, final int i3, final int i4) {
        int i5;
        ow3 ow3Var2;
        int i6;
        sw3 sw3Var2;
        int i7;
        int i8;
        yx7 yx7Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ugd ugdVar2;
        boolean z;
        final mm40 mm40Var2;
        final ow3 ow3Var3;
        final sw3 sw3Var3;
        final yx7 yx7Var3;
        final int i16;
        final int i17;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        ow3 ow3Var4;
        yx7 yx7Var4;
        int i18;
        int i19;
        fetVar.g0(-1303174015);
        int i20 = i4 & 1;
        if (i20 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 48) == 0) {
                ow3Var2 = ow3Var;
                i5 |= fetVar.g(ow3Var2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    sw3Var2 = sw3Var;
                    if (fetVar.g(sw3Var2)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        yx7Var2 = yx7Var;
                        if (fetVar.g(yx7Var2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (fetVar.e(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            if ((196608 & i3) == 0) {
                                i14 = i2;
                                if (fetVar.e(i14)) {
                                    i15 = 131072;
                                } else {
                                    i15 = 65536;
                                }
                                i5 |= i15;
                            }
                            if ((i3 & 1572864) == 0) {
                                ugdVar2 = ugdVar;
                                if (fetVar.i(ugdVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i5 |= i19;
                            } else {
                                ugdVar2 = ugdVar;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (fetVar.U(i5 & 1, z)) {
                                if (i20 != 0) {
                                    mm40Var3 = jm40.b;
                                } else {
                                    mm40Var3 = mm40Var;
                                }
                                if (i21 != 0) {
                                    ow3Var4 = uc9.f35418a;
                                } else {
                                    ow3Var4 = ow3Var2;
                                }
                                if (i6 != 0) {
                                    sw3Var2 = uc9.c;
                                }
                                if (i8 != 0) {
                                    yx7Var4 = gqw0.j;
                                } else {
                                    yx7Var4 = yx7Var2;
                                }
                                i18 = Integer.MAX_VALUE;
                                int i22 = i10 == 0 ? i11 : Integer.MAX_VALUE;
                                if (i13 == 0) {
                                    i18 = i14;
                                }
                                sw3 sw3Var4 = sw3Var2;
                                q(mm40Var3, ow3Var4, sw3Var4, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                                ow3Var3 = ow3Var4;
                                i17 = i18;
                                mm40Var2 = mm40Var3;
                                i16 = i22;
                                yx7Var3 = yx7Var4;
                                sw3Var3 = sw3Var4;
                            } else {
                                fetVar.X();
                                mm40Var2 = mm40Var;
                                ow3Var3 = ow3Var2;
                                sw3Var3 = sw3Var2;
                                yx7Var3 = yx7Var2;
                                i16 = i11;
                                i17 = i14;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.toq
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i5 |= 196608;
                        i14 = i2;
                        if ((i3 & 1572864) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i5 |= i19;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i5 & 1, z)) {
                            if (i20 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if (i21 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                sw3Var2 = uc9.c;
                            }
                            if (i8 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            i18 = Integer.MAX_VALUE;
                            if (i10 == 0) {
                            }
                            if (i13 == 0) {
                                i18 = i14;
                            }
                            sw3 sw3Var5 = sw3Var2;
                            q(mm40Var3, ow3Var4, sw3Var5, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            ow3Var3 = ow3Var4;
                            i17 = i18;
                            mm40Var2 = mm40Var3;
                            i16 = i22;
                            yx7Var3 = yx7Var4;
                            sw3Var3 = sw3Var5;
                        } else {
                            fetVar.X();
                            mm40Var2 = mm40Var;
                            ow3Var3 = ow3Var2;
                            sw3Var3 = sw3Var2;
                            yx7Var3 = yx7Var2;
                            i16 = i11;
                            i17 = i14;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.toq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (fetVar.e(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i5 |= i19;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i5 & 1, z)) {
                            if (i20 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if (i21 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                sw3Var2 = uc9.c;
                            }
                            if (i8 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            i18 = Integer.MAX_VALUE;
                            if (i10 == 0) {
                            }
                            if (i13 == 0) {
                                i18 = i14;
                            }
                            sw3 sw3Var6 = sw3Var2;
                            q(mm40Var3, ow3Var4, sw3Var6, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            ow3Var3 = ow3Var4;
                            i17 = i18;
                            mm40Var2 = mm40Var3;
                            i16 = i22;
                            yx7Var3 = yx7Var4;
                            sw3Var3 = sw3Var6;
                        } else {
                            fetVar.X();
                            mm40Var2 = mm40Var;
                            ow3Var3 = ow3Var2;
                            sw3Var3 = sw3Var2;
                            yx7Var3 = yx7Var2;
                            i16 = i11;
                            i17 = i14;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.toq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var7 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var7, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var7;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 3072;
                yx7Var2 = yx7Var;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (fetVar.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (fetVar.e(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i5 |= i19;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i5 & 1, z)) {
                            if (i20 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if (i21 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                sw3Var2 = uc9.c;
                            }
                            if (i8 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            i18 = Integer.MAX_VALUE;
                            if (i10 == 0) {
                            }
                            if (i13 == 0) {
                                i18 = i14;
                            }
                            sw3 sw3Var8 = sw3Var2;
                            q(mm40Var3, ow3Var4, sw3Var8, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            ow3Var3 = ow3Var4;
                            i17 = i18;
                            mm40Var2 = mm40Var3;
                            i16 = i22;
                            yx7Var3 = yx7Var4;
                            sw3Var3 = sw3Var8;
                        } else {
                            fetVar.X();
                            mm40Var2 = mm40Var;
                            ow3Var3 = ow3Var2;
                            sw3Var3 = sw3Var2;
                            yx7Var3 = yx7Var2;
                            i16 = i11;
                            i17 = i14;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.toq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var9 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var9, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var9;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var10 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var10, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var10;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var11 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var11, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var11;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 384;
            sw3Var2 = sw3Var;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    yx7Var2 = yx7Var;
                    if (fetVar.g(yx7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (fetVar.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (fetVar.e(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i5 |= i19;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i5 & 1, z)) {
                            if (i20 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if (i21 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                sw3Var2 = uc9.c;
                            }
                            if (i8 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            i18 = Integer.MAX_VALUE;
                            if (i10 == 0) {
                            }
                            if (i13 == 0) {
                                i18 = i14;
                            }
                            sw3 sw3Var12 = sw3Var2;
                            q(mm40Var3, ow3Var4, sw3Var12, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            ow3Var3 = ow3Var4;
                            i17 = i18;
                            mm40Var2 = mm40Var3;
                            i16 = i22;
                            yx7Var3 = yx7Var4;
                            sw3Var3 = sw3Var12;
                        } else {
                            fetVar.X();
                            mm40Var2 = mm40Var;
                            ow3Var3 = ow3Var2;
                            sw3Var3 = sw3Var2;
                            yx7Var3 = yx7Var2;
                            i16 = i11;
                            i17 = i14;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.toq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var13 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var13, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var13;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var14 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var14, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var14;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var15 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var15, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var15;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 3072;
            yx7Var2 = yx7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (fetVar.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var16 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var16, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var16;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var17 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var17, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var17;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (fetVar.e(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var18 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var18, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var18;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i20 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i21 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    sw3Var2 = uc9.c;
                }
                if (i8 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                i18 = Integer.MAX_VALUE;
                if (i10 == 0) {
                }
                if (i13 == 0) {
                    i18 = i14;
                }
                sw3 sw3Var19 = sw3Var2;
                q(mm40Var3, ow3Var4, sw3Var19, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                ow3Var3 = ow3Var4;
                i17 = i18;
                mm40Var2 = mm40Var3;
                i16 = i22;
                yx7Var3 = yx7Var4;
                sw3Var3 = sw3Var19;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ow3Var3 = ow3Var2;
                sw3Var3 = sw3Var2;
                yx7Var3 = yx7Var2;
                i16 = i11;
                i17 = i14;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.toq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 48;
        ow3Var2 = ow3Var;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                sw3Var2 = sw3Var;
                if (fetVar.g(sw3Var2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    yx7Var2 = yx7Var;
                    if (fetVar.g(yx7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (fetVar.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (fetVar.e(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            ugdVar2 = ugdVar;
                            if (fetVar.i(ugdVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i5 |= i19;
                        } else {
                            ugdVar2 = ugdVar;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i5 & 1, z)) {
                            if (i20 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if (i21 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                sw3Var2 = uc9.c;
                            }
                            if (i8 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            i18 = Integer.MAX_VALUE;
                            if (i10 == 0) {
                            }
                            if (i13 == 0) {
                                i18 = i14;
                            }
                            sw3 sw3Var110 = sw3Var2;
                            q(mm40Var3, ow3Var4, sw3Var110, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            ow3Var3 = ow3Var4;
                            i17 = i18;
                            mm40Var2 = mm40Var3;
                            i16 = i22;
                            yx7Var3 = yx7Var4;
                            sw3Var3 = sw3Var110;
                        } else {
                            fetVar.X();
                            mm40Var2 = mm40Var;
                            ow3Var3 = ow3Var2;
                            sw3Var3 = sw3Var2;
                            yx7Var3 = yx7Var2;
                            i16 = i11;
                            i17 = i14;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.toq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var111 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var111, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var111;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var112 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var112, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var112;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var113 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var113, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var113;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 3072;
            yx7Var2 = yx7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (fetVar.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var114 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var114, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var114;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var115 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var115, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var115;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (fetVar.e(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var116 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var116, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var116;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i20 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i21 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    sw3Var2 = uc9.c;
                }
                if (i8 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                i18 = Integer.MAX_VALUE;
                if (i10 == 0) {
                }
                if (i13 == 0) {
                    i18 = i14;
                }
                sw3 sw3Var117 = sw3Var2;
                q(mm40Var3, ow3Var4, sw3Var117, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                ow3Var3 = ow3Var4;
                i17 = i18;
                mm40Var2 = mm40Var3;
                i16 = i22;
                yx7Var3 = yx7Var4;
                sw3Var3 = sw3Var117;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ow3Var3 = ow3Var2;
                sw3Var3 = sw3Var2;
                yx7Var3 = yx7Var2;
                i16 = i11;
                i17 = i14;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.toq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 384;
        sw3Var2 = sw3Var;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                yx7Var2 = yx7Var;
                if (fetVar.g(yx7Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (fetVar.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (fetVar.e(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        ugdVar2 = ugdVar;
                        if (fetVar.i(ugdVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i5 |= i19;
                    } else {
                        ugdVar2 = ugdVar;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        if (i20 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i21 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            sw3Var2 = uc9.c;
                        }
                        if (i8 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        i18 = Integer.MAX_VALUE;
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                            i18 = i14;
                        }
                        sw3 sw3Var118 = sw3Var2;
                        q(mm40Var3, ow3Var4, sw3Var118, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                        ow3Var3 = ow3Var4;
                        i17 = i18;
                        mm40Var2 = mm40Var3;
                        i16 = i22;
                        yx7Var3 = yx7Var4;
                        sw3Var3 = sw3Var118;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ow3Var3 = ow3Var2;
                        sw3Var3 = sw3Var2;
                        yx7Var3 = yx7Var2;
                        i16 = i11;
                        i17 = i14;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.toq
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var119 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var119, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var119;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (fetVar.e(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var1110 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var1110, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var1110;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i20 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i21 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    sw3Var2 = uc9.c;
                }
                if (i8 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                i18 = Integer.MAX_VALUE;
                if (i10 == 0) {
                }
                if (i13 == 0) {
                    i18 = i14;
                }
                sw3 sw3Var1111 = sw3Var2;
                q(mm40Var3, ow3Var4, sw3Var1111, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                ow3Var3 = ow3Var4;
                i17 = i18;
                mm40Var2 = mm40Var3;
                i16 = i22;
                yx7Var3 = yx7Var4;
                sw3Var3 = sw3Var1111;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ow3Var3 = ow3Var2;
                sw3Var3 = sw3Var2;
                yx7Var3 = yx7Var2;
                i16 = i11;
                i17 = i14;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.toq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 3072;
        yx7Var2 = yx7Var;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (fetVar.e(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (fetVar.e(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar.i(ugdVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    if (i20 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i21 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        sw3Var2 = uc9.c;
                    }
                    if (i8 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    i18 = Integer.MAX_VALUE;
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                        i18 = i14;
                    }
                    sw3 sw3Var1112 = sw3Var2;
                    q(mm40Var3, ow3Var4, sw3Var1112, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    ow3Var3 = ow3Var4;
                    i17 = i18;
                    mm40Var2 = mm40Var3;
                    i16 = i22;
                    yx7Var3 = yx7Var4;
                    sw3Var3 = sw3Var1112;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ow3Var3 = ow3Var2;
                    sw3Var3 = sw3Var2;
                    yx7Var3 = yx7Var2;
                    i16 = i11;
                    i17 = i14;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.toq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i20 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i21 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    sw3Var2 = uc9.c;
                }
                if (i8 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                i18 = Integer.MAX_VALUE;
                if (i10 == 0) {
                }
                if (i13 == 0) {
                    i18 = i14;
                }
                sw3 sw3Var1113 = sw3Var2;
                q(mm40Var3, ow3Var4, sw3Var1113, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                ow3Var3 = ow3Var4;
                i17 = i18;
                mm40Var2 = mm40Var3;
                i16 = i22;
                yx7Var3 = yx7Var4;
                sw3Var3 = sw3Var1113;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ow3Var3 = ow3Var2;
                sw3Var3 = sw3Var2;
                yx7Var3 = yx7Var2;
                i16 = i11;
                i17 = i14;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.toq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            if ((196608 & i3) == 0) {
                i14 = i2;
                if (fetVar.e(i14)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i5 |= i15;
            }
            if ((i3 & 1572864) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar.i(ugdVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i20 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i21 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    sw3Var2 = uc9.c;
                }
                if (i8 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                i18 = Integer.MAX_VALUE;
                if (i10 == 0) {
                }
                if (i13 == 0) {
                    i18 = i14;
                }
                sw3 sw3Var1114 = sw3Var2;
                q(mm40Var3, ow3Var4, sw3Var1114, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                ow3Var3 = ow3Var4;
                i17 = i18;
                mm40Var2 = mm40Var3;
                i16 = i22;
                yx7Var3 = yx7Var4;
                sw3Var3 = sw3Var1114;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ow3Var3 = ow3Var2;
                sw3Var3 = sw3Var2;
                yx7Var3 = yx7Var2;
                i16 = i11;
                i17 = i14;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.toq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i5 |= 196608;
        i14 = i2;
        if ((i3 & 1572864) == 0) {
            ugdVar2 = ugdVar;
            if (fetVar.i(ugdVar2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i5 |= i19;
        } else {
            ugdVar2 = ugdVar;
        }
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            if (i20 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var;
            }
            if (i21 != 0) {
                ow3Var4 = uc9.f35418a;
            } else {
                ow3Var4 = ow3Var2;
            }
            if (i6 != 0) {
                sw3Var2 = uc9.c;
            }
            if (i8 != 0) {
                yx7Var4 = gqw0.j;
            } else {
                yx7Var4 = yx7Var2;
            }
            i18 = Integer.MAX_VALUE;
            if (i10 == 0) {
            }
            if (i13 == 0) {
                i18 = i14;
            }
            sw3 sw3Var1115 = sw3Var2;
            q(mm40Var3, ow3Var4, sw3Var1115, yx7Var4, i22, i18, apq.f1265a, ugdVar2, fetVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
            ow3Var3 = ow3Var4;
            i17 = i18;
            mm40Var2 = mm40Var3;
            i16 = i22;
            yx7Var3 = yx7Var4;
            sw3Var3 = sw3Var1115;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            ow3Var3 = ow3Var2;
            sw3Var3 = sw3Var2;
            yx7Var3 = yx7Var2;
            i16 = i11;
            i17 = i14;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.toq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jwb.p(mm40Var2, ow3Var3, sw3Var3, yx7Var3, i16, i17, ugdVar, (fet) obj, x8x.L(i3 | 1), i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void q(final mm40 mm40Var, final ow3 ow3Var, final sw3 sw3Var, final yx7 yx7Var, final int i, final int i2, final apq apqVar, final ugd ugdVar, fet fetVar, final int i3) {
        int i4;
        Object obj;
        boolean z;
        fetVar.g0(-1956591841);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(ow3Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.g(sw3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.g(yx7Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.e(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar.e(i2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            obj = apqVar;
            i4 |= fetVar.g(obj) ? 1048576 : 524288;
        } else {
            obj = apqVar;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z2 = i6 == 1048576;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z2 || objP == obj2) {
                obj.getClass();
                voq voqVar = voq.f37778a;
                objP = new woq();
                fetVar.o0(objP);
            }
            woq woqVar = (woq) objP;
            int i7 = i5 >> 3;
            boolean zG = ((((i7 & 112) ^ 48) > 32 && fetVar.g(sw3Var)) || (i7 & 48) == 32) | ((((i7 & 14) ^ 6) > 4 && fetVar.g(ow3Var)) || (i7 & 6) == 4) | ((((i7 & 896) ^ 384) > 256 && fetVar.g(yx7Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && fetVar.e(i)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && fetVar.e(i2)) || (i7 & 24576) == 16384) | fetVar.g(woqVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                z = true;
                Object yoqVar = new yoq(ow3Var, sw3Var, ow3Var.a(), new eef(yx7Var), sw3Var.a(), i, i2, woqVar);
                fetVar.o0(yoqVar);
                objP2 = yoqVar;
            } else {
                z = true;
            }
            yoq yoqVar2 = (yoq) objP2;
            boolean z3 = ((i5 & 29360128) == 8388608 ? z : false) | (i6 == 1048576 ? z : false) | ((i5 & 458752) == 131072 ? z : false);
            Object objP3 = fetVar.P();
            Object obj3 = objP3;
            if (z3 || objP3 == obj2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ugd(-1192950673, z, new w(ugdVar, (byte) 9)));
                apqVar.getClass();
                voq voqVar2 = voq.f37778a;
                fetVar.o0(arrayList);
                obj3 = arrayList;
            }
            ugd ugdVarE = l7x.E((List) obj3);
            boolean zG2 = fetVar.g(yoqVar2);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj2) {
                objP4 = new tv40(yoqVar2);
                fetVar.o0(objP4);
            }
            tj30 tj30Var = (tj30) objP4;
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
            twn.v(0, ugdVarE, fetVar, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.uoq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    jwb.q(mm40Var, ow3Var, sw3Var, yx7Var, i, i2, apqVar, ugdVar, (fet) obj4, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void r(mm40 mm40Var, j83 j83Var, fet fetVar, int i) {
        int i2;
        j83Var.getClass();
        fetVar.g0(-724042520);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.b(j83Var, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 24960, 240632);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oqr(mm40Var, j83Var, i, (byte) 0);
        }
    }

    public static final void s(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(-1943888440);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(pm80VarF);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            String str = (String) CollectionsKt.W(cgk0Var.l(), a4xVar);
            pm80 pm80Var = (pm80) pz40Var.getValue();
            pm80 pm80Var2 = (pm80) pz40Var.getValue();
            pge pgeVar = gqw0.A;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new wil(pz40Var, (byte) 26);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            boolean zG = fetVar.g(cgk0Var) | (i3 == 32);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new wmr(a4xVar, cgk0Var, b);
                fetVar.o0(objP4);
            }
            k7x.b(str, null, mm40Var, pm80Var, pm80Var2, null, null, function1, (Function1) objP4, null, pgeVar, null, fetVar, ((i2 << 6) & 896) | 12619824, 6, 31328);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.jm40] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a.mm40] */
    public static final void t(mm40 mm40Var, String str, String str2, zum zumVar, fet fetVar, int i) {
        String str3;
        String str4;
        ?? r1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-106654777);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(zumVar) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            if (str4.length() > 0) {
                fetVar2.e0(1918059978);
                j6n.h(str4, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 9) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1918203167);
                fetVar2.r(false);
            }
            if (zumVar instanceof yum) {
                fetVar2.e0(1918301313);
                rcb.x(null, ((yum) zumVar).f43275a, h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1918586079);
                fetVar2.r(false);
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            r1 = jm40Var;
        } else {
            fetVar2.X();
            r1 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qvm(r1, str, str2, zumVar, i, (byte) 1);
        }
    }

    public static final void u(mm40 mm40Var, kvm kvmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2080502928);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(kvmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 64.0f, 0.0f, 2);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zx7 zx7Var2 = zx7Var;
            String str = kvmVar.f18962a;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            if (!z) {
                zx7Var2 = gqw0.c;
            }
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            v8q0.a(str, jr8Var.b(jm40Var, zx7Var2), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, 0, 24960, 110584);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-87530186, new jv1(z, (Object) kvmVar, (byte) 12), fetVar2), fetVar2, 56);
            v8q0.a(kvmVar.d, jr8Var.b(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), z ? gqw0.g : gqw0.i), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 17, i, mm40Var, (Object) kvmVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r0v10, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    public static final void v(mm40 mm40Var, vzm vzmVar, boolean z, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        ?? r0;
        ?? r6;
        ?? r1;
        ?? r2;
        ?? r3 = fetVar;
        r3.g0(1695232227);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (r3.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= r3.g(vzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= r3.h(z) ? 256 : 128;
        }
        if (r3.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var4, 16.0f, 0.0f, 2);
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, r3, 48);
            int iHashCode = Long.hashCode(r3.T);
            bh90 bh90VarM = r3.m();
            mm40 mm40VarC0 = kbc.c0(r3, mm40VarG);
            mkd.c0.getClass();
            r3.i0();
            boolean z2 = r3.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                r3.l(pcyVar);
            } else {
                r3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(r3, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(r3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(r3, numValueOf, shdVar3);
            jpm0.n(r3);
            shd shdVar4 = gqw0.v;
            jpm0.o(r3, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4(b)), yx7Var, r3, 48);
            int iHashCode2 = Long.hashCode(r3.T);
            bh90 bh90VarM2 = r3.m();
            mm40 mm40VarC1 = kbc.c0(r3, x7zVar);
            r3.i0();
            if (r3.S) {
                r3.l(pcyVar);
            } else {
                r3.r0();
            }
            jpm0.o(r3, thg0VarA2, shdVar);
            jpm0.o(r3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, r3, shdVar3, r3);
            jpm0.o(r3, mm40VarC1, shdVar4);
            mm40 mm40Var5 = mm40Var4;
            String str = vzmVar.f38306a;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) r3.k(zfnVar)).getTextPrimary();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, r3, 0, 24960, 110584);
            r3.e0(657022887);
            r3.r(false);
            if (z) {
                r3.e0(657089847);
                r6 = 1;
                jcb.k(0, 1, r3, null);
                r3.r(false);
            } else {
                r6 = 1;
                r3.e0(657135975);
                r3.r(false);
            }
            r3.r(r6);
            if (vzmVar.b.length() > 0) {
                r3.e0(1517623847);
                String str2 = vzmVar.b;
                y9q0 y9q0VarA = g1t0.a();
                long primary = ((ThemeColors) r3.k(zfnVar)).getPrimary();
                mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 108.0f, r6);
                n05 n05Var = new n05(qmk.o, g1t0.a().f42262a.b, qmk.n);
                nrq nrqVar = g1t0.a().f42262a.f;
                r1 = r6 == true ? 1 : 0;
                v8q0.a(str2, mm40VarU, primary, n05Var, 0L, null, null, nrqVar, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, r3, 0, 24960, 110448);
                ?? r4 = r3;
                r4.r(false);
                r2 = r4;
            } else {
                ?? r5 = r3;
                r1 = r6;
                r5.e0(1518214211);
                r5.r(false);
                r2 = r5;
            }
            r2.r(r1);
            mm40Var3 = mm40Var5;
            r0 = r2;
        } else {
            r3.X();
            mm40Var3 = mm40Var2;
            r0 = r3;
        }
        yfe0 yfe0VarU = r0.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5(mm40Var3, (Object) vzmVar, z, i, i2, (byte) 3);
        }
    }

    public static final void w(mm40 mm40Var, kvm kvmVar, kvm kvmVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-586413876);
        int i2 = i | 6 | (fetVar.g(kvmVar) ? 32 : 16) | (fetVar.g(kvmVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var, 1.0f), enx.b);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            u(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kvmVar, true, fetVar, (i2 & 112) | 384);
            b(null, a2mVar, z, fetVar, (i2 >> 6) & 1008);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            u(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kvmVar2, false, fetVar, ((i2 >> 3) & 112) | 384);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 13, i, mm40Var2, (Object) kvmVar, (Object) kvmVar2, (Object) a2mVar, z);
        }
    }

    public static final void x(lc00 lc00Var, g0e0 g0e0Var, String str, String str2, ctf0 ctf0Var, boolean z) {
        g0e0Var.getClass();
        ctf0Var.getClass();
        if (x2x.Z(g0e0Var)) {
            return;
        }
        syd0 syd0Var = g0e0Var.g;
        ezd0 ezd0Var = syd0Var.f33020a;
        ezd0 ezd0Var2 = syd0Var.b;
        add addVarS = vtb.S(str, str2, ctf0Var, z);
        int i = ezd0Var.f8668a;
        int i2 = ezd0Var2.f8668a;
        lsm0 lsm0Var = ctf0Var.b;
        ArrayList arrayList = (ArrayList) tx3.z(new bdd[]{F(i, i2, lsm0Var.a(R.string.rainbow_six_won_matches, Arrays.copyOf(new Object[0], 0))), F(ezd0Var.b, ezd0Var2.b, lsm0Var.a(R.string.rainbow_six_won_rounds, Arrays.copyOf(new Object[0], 0))), F(ezd0Var.c, ezd0Var2.c, lsm0Var.a(R.string.rainbow_six_attack_wins, Arrays.copyOf(new Object[0], 0))), F(ezd0Var.d, ezd0Var2.d, lsm0Var.a(R.string.rainbow_six_deffens_wins, Arrays.copyOf(new Object[0], 0)))});
        if (!arrayList.isEmpty()) {
            lc00Var.add(new psv("COMPARE_TEAMS_HEADER", R.string.compare_team));
            lc00Var.add(addVarS);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lc00Var.add((bdd) it.next());
        }
    }

    public static final void y(AppCompatTextView appCompatTextView) {
        appCompatTextView.setMaxLines(1);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        layoutParams.getClass();
        a3e a3eVar = (a3e) layoutParams;
        ((ViewGroup.MarginLayoutParams) a3eVar).width = -2;
        appCompatTextView.setLayoutParams(a3eVar);
    }

    public static final void z(AppCompatTextView appCompatTextView) {
        appCompatTextView.getClass();
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setLineSpacing(0.0f, 0.8f);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        aem0.r(appCompatTextView, 10, 22, 2, 1);
    }
}
