package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ahb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f865a;

    public static final String A(String str, String str2, Map map) {
        str.getClass();
        if (str2.length() != 0) {
            str = kng0.l(str, ", ", str2);
        }
        String str3 = (String) map.get("1");
        if (str3 == null) {
            str3 = "";
        }
        return str3.length() > 0 ? kng0.l(str, ". ", str3) : str;
    }

    public static DsBadge B(Context context, vf5 vf5Var) {
        context.getClass();
        vf5Var.getClass();
        return new DsBadge(new tje(context, DsBadge.e[vf5Var.ordinal()].intValue()), null, 6);
    }

    public static final String C(jvn jvnVar, double d, p3u0 p3u0Var) {
        if (d == 0.0d) {
            return "-";
        }
        int iOrdinal = jvnVar.ordinal();
        if (iOrdinal == 0) {
            double d2 = d >= 2.0d ? (d - 1.0d) * 100.0d : (-100.0d) / (d - 1.0d);
            return twn.m((int) d2, d2 > 0.0d ? "+" : "");
        }
        if (iOrdinal == 1) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1000L);
            BigInteger bigInteger = BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(1000L)).toBigInteger();
            bigInteger.getClass();
            bigIntegerValueOf.getClass();
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerValueOf);
            bigIntegerSubtract.getClass();
            BigInteger bigIntegerAbs = bigIntegerSubtract.abs();
            bigIntegerAbs.getClass();
            BigInteger bigIntegerGcd = bigIntegerAbs.gcd(bigIntegerValueOf);
            bigIntegerGcd.getClass();
            Locale locale = Locale.ENGLISH;
            BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigIntegerGcd);
            bigIntegerDivide.getClass();
            String string = bigIntegerDivide.toString();
            BigInteger bigIntegerDivide2 = bigIntegerValueOf.divide(bigIntegerGcd);
            bigIntegerDivide2.getClass();
            return String.format(locale, "%s/%s", Arrays.copyOf(new Object[]{string, bigIntegerDivide2.toString()}, 2));
        }
        if (iOrdinal == 2) {
            pn40 pn40Var = pn40.f27267a;
            return pn40.c(d, p3u0Var);
        }
        if (iOrdinal == 3) {
            pn40 pn40Var2 = pn40.f27267a;
            return pn40.c(d - 1.0d, p3u0Var);
        }
        if (iOrdinal == 4) {
            double d3 = d - 1.0d;
            if (d3 < 1.0d) {
                d3 = (-1.0d) / d3;
            }
            pn40 pn40Var3 = pn40.f27267a;
            return pn40.c(d3, p3u0Var);
        }
        if (iOrdinal != 5) {
            t9f.b();
            return null;
        }
        double d4 = d - 1.0d;
        if (d4 > 1.0d) {
            d4 = (-1.0d) / d4;
        }
        pn40 pn40Var4 = pn40.f27267a;
        return pn40.c(d4, p3u0Var);
    }

    public static final a2m D(l2g0 l2g0Var) {
        t480 t480VarI = I(l2g0Var);
        List listP = xkb.P();
        boolean z = false;
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    z = true;
                    break;
                }
            }
        }
        c2m c2mVar = c2m.f3631a;
        return (t480VarI == null && z) ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), H(l2g0Var), M(l2g0Var), false, false);
    }

    public static final String E(l2g0 l2g0Var, ctf0 ctf0Var) {
        l2g0Var.getClass();
        ctf0Var.getClass();
        long millis = TimeUnit.SECONDS.toMillis(l2g0Var.s);
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        return rdj.g(new ynq0(millis), efj.UNIVERSAL, Boolean.valueOf(zH), true, 32);
    }

    public static final String F(d0t d0tVar, dmr dmrVar) {
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

    public static final i4 G(z0w z0wVar, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, String str) {
        ctf0Var.getClass();
        str.getClass();
        rdj rdjVar = rdj.f30294a;
        lsm0 lsm0Var = ctf0Var.b;
        boolean zH = ctf0Var.h();
        long j = z0wVar.f;
        String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
        lc00 lc00VarB = kotlin.collections.a.b();
        if (strG.length() > 0) {
            lc00VarB.add(new too0(h97.h(z0wVar.i, "date"), strG));
        }
        if (z0wVar.l) {
            lc00VarB.add(new ooo0(lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0.f18776a));
        }
        if (z2) {
            lc00VarB.add(new poo0(lsm0Var.a(R.string.optionBet, Arrays.copyOf(new Object[0], 0)), "OptionBet", dqo0.f6527a));
        }
        if (z3) {
            lc00VarB.add(new moo0(lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), "EachWay", opo0.f25653a));
        }
        if (str.length() > 0) {
            lc00VarB.add(new roo0(str, "TopChampTag".concat(str), bro0.f3088a));
        }
        if (z) {
            lc00VarB.add(new ioo0(lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0))));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final String H(l2g0 l2g0Var) {
        l2g0Var.getClass();
        List listP = xkb.P();
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    t480 t480VarI = I(l2g0Var);
                    return sj3.j0(t480VarI != null ? t480VarI.f33307a : null, "");
                }
            }
        }
        t480 t480VarI2 = I(l2g0Var);
        return sj3.j0(t480VarI2 != null ? t480VarI2.f33307a : null, "0");
    }

    public static final t480 I(l2g0 l2g0Var) {
        String strR;
        String string;
        String string2;
        String value;
        long j = l2g0Var.c;
        String str = l2g0Var.p;
        List listP = xkb.P();
        ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it.next()).b));
        }
        if (j == 66 || j == 99) {
            strR = kotlin.text.c.r(str, "-", Separators.COLON, false);
        } else if (arrayList.contains(Long.valueOf(j))) {
            bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
            if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                value = Separators.COLON;
            }
            strR = kotlin.text.c.r(value, "-", Separators.COLON, false);
        } else {
            bh30 bh30VarB2 = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
            if (bh30VarB2 == null || (strR = bh30VarB2.getValue()) == null) {
                strR = Separators.COLON;
            }
        }
        List listSplit$default = StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.W(0, listSplit$default);
        if (str2 == null || (string = StringsKt.u0(str2).toString()) == null || string.length() == 0) {
            string = null;
        }
        String str3 = (String) CollectionsKt.W(1, listSplit$default);
        if (str3 == null || (string2 = StringsKt.u0(str3).toString()) == null || string2.length() == 0) {
            string2 = null;
        }
        if (string == null || string2 == null) {
            return null;
        }
        return new t480(string, string2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static final Pair J(List list, boolean z) {
        Object b280Var;
        Object b280Var2;
        list.getClass();
        String str = "";
        if (z) {
            b280Var = new b280(R.drawable.ic_home);
        } else {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() == 0) {
                    str2 = "";
                } else {
                    List list2 = u0d.f34849a;
                    if (u0d.c(str2)) {
                        str2 = "";
                    } else {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            b280Var = new c280(str2, R.drawable.no_photo_new);
        }
        if (z) {
            b280Var2 = new b280(R.drawable.ic_home);
        } else {
            String str3 = (String) (1 < list.size() ? list.get(1) : "");
            str3.getClass();
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else if (str3.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            b280Var2 = new c280(str, R.drawable.no_photo_new);
        }
        return new Pair(b280Var, b280Var2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static final Pair K(List list, boolean z) {
        Object b280Var;
        Object b280Var2;
        list.getClass();
        String str = "";
        if (z) {
            b280Var = new b280(R.drawable.ic_away);
        } else {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() == 0) {
                    str2 = "";
                } else {
                    List list2 = u0d.f34849a;
                    if (u0d.c(str2)) {
                        str2 = "";
                    } else {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            b280Var = new c280(str2, R.drawable.no_photo_new);
        }
        if (z) {
            b280Var2 = new b280(R.drawable.ic_away);
        } else {
            String str3 = (String) (1 < list.size() ? list.get(1) : "");
            str3.getClass();
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else if (str3.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            b280Var2 = new c280(str, R.drawable.no_photo_new);
        }
        return new Pair(b280Var, b280Var2);
    }

    public static final mpm L(l2g0 l2g0Var) {
        boolean z;
        t480 t480VarI = I(l2g0Var);
        List listP = xkb.P();
        if (listP != null && listP.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = listP.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((yxg) it.next()).b == l2g0Var.c) {
                z = true;
                break;
            }
        }
        opm opmVar = opm.f25648a;
        return (t480VarI == null && z) ? new lpm(opmVar, new hpm(0L, 3)) : new kpm(opmVar, new hpm(0L, 3), d5c.O(H(l2g0Var), M(l2g0Var), false, false, new hpm(0L, 3)));
    }

    public static final String M(l2g0 l2g0Var) {
        l2g0Var.getClass();
        List listP = xkb.P();
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    t480 t480VarI = I(l2g0Var);
                    return sj3.j0(t480VarI != null ? t480VarI.b : null, "");
                }
            }
        }
        t480 t480VarI2 = I(l2g0Var);
        return sj3.j0(t480VarI2 != null ? t480VarI2.b : null, "0");
    }

    public static String N(Context context, long j) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        float f = j;
        if (f > 1024.0f) {
            String str = decimalFormat.format(Float.valueOf(f / 1048576.0f));
            String string = context.getString(R.string.consultant_file_size_mb);
            string.getClass();
            return String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        }
        String str2 = decimalFormat.format(Float.valueOf(f / 1024.0f));
        String string2 = context.getString(R.string.consultant_file_size_kb);
        string2.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
    }

    public static final d280 O(List list, boolean z) {
        list.getClass();
        if (z) {
            return new b280(R.drawable.ic_home);
        }
        String str = (String) CollectionsKt.firstOrNull(list);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            str2 = str;
        } else if (str.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str)) {
                str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return new c280(str2, R.drawable.no_photo_new);
    }

    public static final d280 P(List list, boolean z) {
        list.getClass();
        if (z) {
            return new b280(R.drawable.ic_away);
        }
        String str = (String) CollectionsKt.firstOrNull(list);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            str2 = str;
        } else if (str.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str)) {
                str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return new c280(str2, R.drawable.no_photo_new);
    }

    public static final String Q(l2g0 l2g0Var, List list, wcb wcbVar) {
        list.getClass();
        wcbVar.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            return ((zdl0) del0Var).f44218a;
        }
        if (del0Var instanceof bel0) {
            return ((bel0) del0Var).f2456a;
        }
        t9f.b();
        return null;
    }

    public static final a1g R(gmq gmqVar, Function1 function1) {
        return bkb.i0(new vsg0(new wmq(gmqVar, (yje) null, function1, new kie0(), (byte) 7)), "HandlePopularFeedResult", 3, 3L, null, null, function1, 24);
    }

    public static final void S(fet fetVar, Function2 function2) {
        function2.getClass();
        zys0.e(2, function2);
        function2.invoke(fetVar, 1);
    }

    public static final l7m0 T(a4x a4xVar, fet fetVar, int i) {
        a4xVar.getClass();
        boolean z = (((i & 14) ^ 6) > 4 && fetVar.g(a4xVar)) || (i & 6) == 4;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = jgk0.b(new ife(a4xVar, (byte) 3));
            fetVar.o0(objP);
        }
        return (l7m0) objP;
    }

    public static final a4x U(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            scp scpVar = (scp) it.next();
            arrayList.add(new iem(scpVar.f31998a, scpVar.b));
        }
        return dyb.o0(arrayList);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final a.huc V(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final trf W(wrf wrfVar) {
        ArrayList<mqf> arrayList;
        ?? arrayList2;
        Map map;
        Map map2;
        Integer num;
        LinkedHashMap linkedHashMap;
        List list;
        Float f;
        Integer num2;
        Integer num3;
        Integer num4;
        String str = "";
        if (wrfVar == null || (list = wrfVar.f39639a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                mqf mqfVar = (mqf) obj;
                Integer num5 = mqfVar.g;
                if (num5 != null && num5.intValue() == 0 && (f = mqfVar.b) != null && ((int) f.floatValue()) == 0 && (num2 = mqfVar.c) != null && num2.intValue() == 0 && (num3 = mqfVar.d) != null && num3.intValue() == 0 && (num4 = mqfVar.e) != null && num4.intValue() == 0 && Intrinsics.b(0.0f, mqfVar.f)) {
                    String str2 = mqfVar.f22222a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str2.length() > 0) {
                    }
                }
                arrayList.add(obj);
            }
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            for (mqf mqfVar2 : arrayList) {
                mqfVar2.getClass();
                String str3 = mqfVar2.f22222a;
                Boolean bool = mqfVar2.l;
                Map map3 = mqfVar2.n;
                if (str3 == null) {
                    str3 = str;
                }
                Float f2 = mqfVar2.b;
                int iFloatValue = f2 != null ? (int) f2.floatValue() : 0;
                Integer num6 = mqfVar2.c;
                int iIntValue = num6 != null ? num6.intValue() : 0;
                Integer num7 = mqfVar2.d;
                int iIntValue2 = num7 != null ? num7.intValue() : 0;
                Integer num8 = mqfVar2.e;
                int iIntValue3 = num8 != null ? num8.intValue() : 0;
                Float f3 = mqfVar2.f;
                float fFloatValue = f3 != null ? f3.floatValue() : 0.0f;
                Integer num9 = mqfVar2.g;
                int iIntValue4 = num9 != null ? num9.intValue() : 0;
                if (map3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map3.entrySet()) {
                        if (((Number) entry.getValue()).intValue() > 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            fFloatValue = fFloatValue;
                            str = str;
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                String str4 = str;
                float f4 = fFloatValue;
                Boolean bool2 = mqfVar2.h;
                boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = mqfVar2.i;
                boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = mqfVar2.j;
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                String str5 = mqfVar2.k;
                String str6 = str5 == null ? str4 : str5;
                boolean zBooleanValue4 = bool != null ? bool.booleanValue() : false;
                if ((linkedHashMap != null && linkedHashMap.isEmpty()) || map3 == null) {
                    map3 = lun.f20680a;
                    map3.getClass();
                }
                nqf nqfVar = new nqf(zBooleanValue, zBooleanValue2, zBooleanValue3, str6, zBooleanValue4, map3);
                Boolean bool5 = mqfVar2.m;
                boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                boolean zBooleanValue6 = bool != null ? bool.booleanValue() : false;
                Integer num10 = mqfVar2.o;
                int iIntValue5 = -1;
                int iIntValue6 = num10 != null ? num10.intValue() : -1;
                Integer num11 = mqfVar2.p;
                int iIntValue7 = num11 != null ? num11.intValue() : -1;
                Integer num12 = mqfVar2.q;
                if (num12 != null) {
                    iIntValue5 = num12.intValue();
                }
                arrayList2.add(new pqf(str3, iFloatValue, iIntValue, iIntValue2, iIntValue3, f4, iIntValue4, nqfVar, zBooleanValue5, zBooleanValue6, iIntValue6, iIntValue7, iIntValue5));
                str = str4;
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r1 = arrayList2;
        int iIntValue8 = (wrfVar == null || (num = wrfVar.b) == null) ? 0 : num.intValue();
        wpf wpfVarE = hic.E(wrfVar != null ? wrfVar.c : null);
        if (wrfVar == null || (map = wrfVar.d) == null) {
            map = lun.f20680a;
            map.getClass();
        }
        if (wrfVar == null || (map2 = wrfVar.e) == null) {
            map2 = lun.f20680a;
            map2.getClass();
        }
        return new trf(r1, iIntValue8, wpfVarE, map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public static final smg X(List list) {
        ?? arrayList;
        List list2;
        List list3;
        list.getClass();
        u5l u5lVar = (u5l) CollectionsKt.firstOrNull(list);
        u5l u5lVar2 = (u5l) CollectionsKt.W(1, list);
        ?? arrayList2 = 0;
        arrayList2 = 0;
        String str = u5lVar != null ? u5lVar.f35100a : null;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(u5lVar != null ? u5lVar.c : null);
        if (u5lVar == null || (list3 = u5lVar.d) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Y((zmg) it.next()));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r7 = arrayList;
        String str3 = u5lVar2 != null ? u5lVar2.f35100a : null;
        String str4 = str3 == null ? "" : str3;
        String strE2 = lmc.E(u5lVar2 != null ? u5lVar2.c : null);
        if (u5lVar2 != null && (list2 = u5lVar2.d) != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Y((zmg) it2.next()));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new smg(str2, strE, r7, str4, strE2, arrayList2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0119: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:43)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final a.wmg Y(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0119: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:43)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    public static final qrh Z(List list) {
        vrh vrhVar;
        vrh vrhVar2;
        list.getClass();
        hyt0 hyt0Var = (hyt0) CollectionsKt.firstOrNull(list);
        hyt0 hyt0Var2 = (hyt0) CollectionsKt.W(1, list);
        if (hyt0Var != null) {
            vrhVar = a0(hyt0Var);
        } else {
            iun iunVar = iun.f15405a;
            vrhVar = new vrh(iunVar, iunVar, "", "");
        }
        if (hyt0Var2 != null) {
            vrhVar2 = a0(hyt0Var2);
        } else {
            iun iunVar2 = iun.f15405a;
            vrhVar2 = new vrh(iunVar2, iunVar2, "", "");
        }
        return new qrh(vrhVar, vrhVar2);
    }

    public static final void a(mm40 mm40Var, o0x o0xVar, f6m f6mVar, o0x o0xVar2, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        o0x o0xVar3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1025840380);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(f6mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(o0xVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "ChampInfoTestTag");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            int i3 = i2;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
            int i4 = i3 >> 3;
            int i5 = i3 >> 9;
            o(o0xVar, function0, fetVar, (i4 & 14) | (i5 & 112));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            u(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), f6mVar, function1, fetVar, (i4 & 112) | (i5 & 896));
            fetVar.r(true);
            if (o0xVar2 == null) {
                fetVar.e0(1647126613);
                fetVar.r(false);
                o0xVar3 = o0xVar2;
                function3 = function2;
            } else {
                fetVar.e0(1647126614);
                o0xVar3 = o0xVar2;
                function3 = function2;
                p(o0xVar3, function3, fetVar, (i3 >> 15) & 112);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function3 = function2;
            o0xVar3 = o0xVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var, o0xVar, f6mVar, o0xVar3, function0, function1, function3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static final vrh a0(hyt0 hyt0Var) {
        ?? arrayList;
        ?? arrayList2;
        String str = hyt0Var.c;
        if (str == null) {
            str = "";
        }
        String strE = lmc.E(hyt0Var.e);
        List<urh> list = hyt0Var.f;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (urh urhVar : list) {
                String strValueOf = String.valueOf(urhVar.f36162a);
                String str2 = urhVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                String strE2 = lmc.E(urhVar.f);
                Float f = urhVar.h;
                float fFloatValue = f != null ? f.floatValue() : 0.0f;
                Float f2 = urhVar.i;
                float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
                Float f3 = urhVar.j;
                float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
                Float f4 = urhVar.k;
                float fFloatValue4 = f4 != null ? f4.floatValue() : 0.0f;
                Float f5 = urhVar.l;
                arrayList.add(new rrh(strValueOf, str2, strE2, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, f5 != null ? f5.floatValue() : 0.0f, lmc.E(urhVar.m)));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List<prh> list2 = hyt0Var.g;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            for (prh prhVar : list2) {
                String str3 = prhVar.f27464a;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = prhVar.b;
                if (str4 == null) {
                    str4 = "";
                }
                Integer num = prhVar.c;
                int iIntValue = 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                Integer num2 = prhVar.d;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList3.add(new wxt0(iIntValue2, str3, iIntValue, str4));
            }
            arrayList2 = new ArrayList();
            for (Object obj : arrayList3) {
                wxt0 wxt0Var = (wxt0) obj;
                if (wxt0Var.c != 0 || wxt0Var.d != 0) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new vrh(arrayList, arrayList2, str, strE);
    }

    public static final void b(mm40 mm40Var, CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(2146365486);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.i(cyberTournamentBracketMatchLabelPresetParams) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarE, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(cyberTournamentBracketMatchLabelPresetParams.f46614a, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            v8q0.a(cyberTournamentBracketMatchLabelPresetParams.b, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, cyberTournamentBracketMatchLabelPresetParams, i, b);
        }
    }

    public static final la30 b0(vxt0 vxt0Var, m9s m9sVar) {
        vxt0Var.getClass();
        m9sVar.getClass();
        yk5 yk5Var = mc6.b;
        qqs qqsVar = m9sVar.h;
        Integer numValueOf = Integer.valueOf(qqsVar.n);
        yk5Var.getClass();
        byte b = yk5.d(numValueOf).f21536a;
        int i = qqsVar.d;
        return new la30(b, 0L, "", qem0.l(b, i), qem0.l(b, i));
    }

    public static final void c(mm40 mm40Var, m3w m3wVar, fet fetVar, int i) {
        m3wVar.getClass();
        fetVar.g0(1051604804);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(m3wVar) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(m3wVar.f21138a + "COMPACT_TITLE_REMEMBER_ID");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(-499518508, true, new ebd(m3wVar, b));
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(m3wVar.b + "COMPACT_DESCRIPTION_REMEMBER_ID");
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(-323190251, true, new ebd(m3wVar, b2));
                fetVar.o0(objP2);
            }
            hmw0.j(mm40VarD, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fbd(mm40Var, m3wVar, i, b);
        }
    }

    public static final void d(mm40 mm40Var, p4f p4fVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(2008328391);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(p4fVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 38.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            v8q0.a(rsm0.w(R.string.bet_type, 0, fetVar2), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 24960, 110590);
            boolean z2 = p4fVar.b;
            ymx ymxVar = ymx.INTERVAL_500;
            boolean z3 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 13);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarF = phu0.F(jm40Var, ymxVar, null, z2, null, (Function0) objP, fetVar, 25014, 0);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarF);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            v8q0.a(p4fVar.f26348a, ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.u(), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, p4fVar, function0, i, (byte) 23);
        }
    }

    public static final void e(CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams, fet fetVar, int i) {
        cyberTournamentBracketMatchParams.getClass();
        fetVar.g0(187859928);
        int i2 = (fetVar.i(cyberTournamentBracketMatchParams) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            ekh ekhVar = CyberTournamentBracketMatchParams.Companion;
            gkb.F(cyberTournamentBracketMatchParams, fetVar, (i2 & 14) | 8);
            CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams = cyberTournamentBracketMatchParams.i;
            CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams2 = cyberTournamentBracketMatchParams.h;
            if (cyberTournamentBracketMatchLabelPresetParams2.b.length() > 0) {
                fetVar.e0(259859028);
                b(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cyberTournamentBracketMatchLabelPresetParams2, fetVar, 64);
                fetVar.r(false);
            } else {
                fetVar.e0(260022708);
                fetVar.r(false);
            }
            if (cyberTournamentBracketMatchLabelPresetParams.b.length() > 0) {
                fetVar.e0(260105292);
                b(s5x0.N(jm40Var, 0.0f, cyberTournamentBracketMatchLabelPresetParams2.b.length() > 0 ? 4.0f : 8.0f, 0.0f, 0.0f, 13), cyberTournamentBracketMatchLabelPresetParams, fetVar, 64);
                fetVar.r(false);
            } else {
                fetVar.e0(260338164);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vjh(cyberTournamentBracketMatchParams, i, b);
        }
    }

    public static final void f(v2l v2lVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1465142916);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v2lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.d(o7k0.e(jm40.b, 88.0f), 1.0f), StaticColors.INSTANCE.m73getBlack400d7_KjU(), vgg0.a(16.0f)), "DOTA_BAN_PICK");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new n2l(b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l(b3);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new n2l(b);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            b3 = (i2 & 14) != 4 ? (byte) 0 : (byte) 1;
            Object objP4 = fetVar.P();
            if (b3 != 0 || objP4 == cl5Var) {
                objP4 = new e3j(v2lVar, (byte) 26);
                fetVar.o0(objP4);
            }
            dwi0.c(function1, mm40VarE0, function2, function3, (Function1) objP4, fetVar, 3462, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(v2lVar, i, b2);
        }
    }

    public static final void g(mm40 mm40Var, zh0 zh0Var, di0 di0Var, lh80 lh80Var, Function1 function1, fet fetVar, int i) {
        zh0Var.getClass();
        di0Var.getClass();
        fetVar.g0(-650899761);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(zh0Var.ordinal()) ? 32 : 16) | (fetVar.g(di0Var) ? 256 : 128) | (fetVar.g(lh80Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarI = s5x0.I(mm40Var, lh80Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int iOrdinal = zh0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(735808822);
                x8f.b(di0Var, function1, fetVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(736008338);
                qjj.a(di0Var, function1, fetVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(736219851);
                eeq.a(di0Var, function1, fetVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(736430961);
                ntr.b(di0Var, function1, fetVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-391907209, fetVar, false);
                }
                fetVar.e0(736635313);
                knx.b(di0Var, function1, fetVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) zh0Var, (Object) di0Var, (Object) lh80Var, (Object) function1, i, (byte) 5);
        }
    }

    public static final void h(vhm vhmVar, Function0 function0, Function1 function1, Function0 function2, Function1 function3, Function0 function4, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(1577436410);
        jm40 jm40Var = jm40.b;
        int i2 = i | (fetVar.g(jm40Var) ? 4 : 2) | (fetVar.g(vhmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536) | (fetVar.i(function4) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            imm immVar = new imm(vhmVar.c, vhmVar.e, vhmVar.d, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, null);
            sd sdVar = vhmVar.f;
            if (sdVar == null) {
                fetVar.e0(-2123226079);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-2123226078);
                ugdVarM = u1c.M(1618163892, new d8m((Object) vhmVar, (Object) sdVar, (Object) function0, (byte) 5), fetVar);
                fetVar.r(false);
            }
            ugd ugdVar = ugdVarM;
            int i3 = i2 << 6;
            hlm.c(jm40Var, immVar, null, function2, null, function1, function3, null, function4, ugdVar, null, null, fetVar, ((i2 << 3) & 3670016) | (i2 & 14) | 24576 | ((i2 >> 3) & 7168) | (458752 & i3) | (234881024 & i3), 54, 132);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(vhmVar, function0, function1, function2, function3, function4, i, (byte) 16);
        }
    }

    public static final void i(mm40 mm40Var, q56 q56Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Object obj;
        float f;
        ugd ugdVarM;
        q56Var.getClass();
        function1.getClass();
        fetVar.g0(-1779755993);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(q56Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (q56Var instanceof l56) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, q56Var, (byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), "SPORT_BASIC_EVENT_CARD_LINE");
            if (q56Var instanceof n56) {
                fetVar.e0(661250056);
                ugdVarM = u1c.M(847140992, new i3l(q56Var, (byte) 19), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(661367391);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarE0, f, 0L, ugdVarM, u1c.M(-1412123674, new p5m(q56Var, function1, (byte) 24), fetVar), u1c.M(-146052889, new jv1((Object) q56Var, z, (byte) 10), fetVar), u1c.M(1120017896, new i4a0((Object) q56Var, z, (Object) function1, obj, (byte) 19), fetVar), fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) q56Var, z, function1, (wdr) function2, i, (byte) 7);
        }
    }

    public static final void j(mm40 mm40Var, jym jymVar, fet fetVar, int i) {
        int i2;
        jym jymVar2;
        k6z k6zVar;
        k6z k6zVar2;
        int i3;
        fet fetVar2 = fetVar;
        String str = jymVar.g;
        fetVar2.g0(-1706521711);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jymVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (jymVar.h) {
                fetVar2.e0(710149240);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(710150164);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            if (str.length() > 0) {
                fetVar2.e0(-1161086647);
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                i3 = 0;
                k6zVar2 = k6zVar;
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                k6zVar2 = k6zVar;
                i3 = 0;
                fetVar2.e0(-1160832633);
                fetVar2.r(false);
            }
            jymVar2 = jymVar;
            obc.d(bmd.n.a(k6zVar2), u1c.M(-1066002533, new mxm(jymVar2, (byte) 4), fetVar2), fetVar2, 56);
            s(i3, fetVar2, jymVar2.e, null);
            fetVar2.r(true);
        } else {
            jymVar2 = jymVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 20, i, mm40Var, jymVar2);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        aql0 aql0Var = aql0.f1302a;
        fetVar.g0(-1746517269);
        int i2 = (fetVar.g(aql0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), aql0.b), vgg0.a(aql0.c)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, i, (byte) 22);
        }
    }

    public static final void l(fvu0 fvu0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1706727911);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(fvu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = AnimationUtils.loadAnimation(context, R.anim.rotate);
                fetVar.o0(objP);
            }
            Animation animation = (Animation) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = c7o.f3874a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(animation) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new qzn(fvu0Var, animation, (byte) 18);
                fetVar.o0(objP3);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP3, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(fvu0Var, i, b);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        int i2;
        String str2;
        fet fetVar2;
        fetVar.g0(2075500153);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(c280Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.o, (byte) 12)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            nrq nrqVar = g1t0.m().f42262a.f;
            long j = qmk.q;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, new x7z(1.0f, true), textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, nrqVar, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, null, fetVar, (i2 >> 3) & 14, 24960, 240496);
            fetVar2 = fetVar;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iym(mm40Var, str, c280Var, i, (byte) 1);
        }
    }

    public static final void n(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-1307789668);
        int i2 = i | 6 | (fetVar.d(4.0f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            byte b = 6;
            if (z || objP == ukd.f35823a) {
                objP = new w(ugdVar, b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, 6, 0);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, (byte) 5);
        }
    }

    public static final void o(o0x o0xVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(597728670);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(o0xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(jm40.b, "ChampInfoButtonTestTag");
            o2m o2mVar = new o2m(o0xVar, R.drawable.ic_glyph_cyber_gamepad, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU());
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new cjl(function0, (byte) 11);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            vdb.w(mm40VarE0, o2mVar, (Function1) objP, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c5m(o0xVar, function0, i, b);
        }
    }

    public static final void p(o0x o0xVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-274497380);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(o0xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(jm40.b, "GameRulesBadgeTestTag");
            o2m o2mVar = new o2m(o0xVar, R.drawable.ic_glyph_info_circle, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU());
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new cjl(function0, (byte) 12);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            vdb.w(mm40VarE0, o2mVar, (Function1) objP, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c5m(o0xVar, function0, i, b);
        }
    }

    public static final void q(mm40 mm40Var, pk5 pk5Var, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        boolean z;
        Object obj = pk5Var;
        fet fetVar2 = fetVar;
        obj.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(-1541580450);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(obj) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function3) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            kie0 kie0Var = new kie0();
            boolean z2 = obj instanceof mk5;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar2.e0(862665793);
                hdz hdzVarA = kdz.a(((mk5) obj).f, fetVar2);
                ArrayList arrayList = hdzVarA.d().d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof ogs0) {
                        arrayList2.add(obj2);
                    }
                }
                boolean zIsEmpty = arrayList2.isEmpty();
                long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, vgg0.a(16.0f));
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
                jpm0.o(fetVar2, x5dVarA, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                if (hdzVarA.c() != 0) {
                    fetVar2.e0(1171281902);
                    boolean z3 = !zIsEmpty;
                    boolean z4 = (i2 & 57344) == 16384;
                    Object objP = fetVar2.P();
                    if (z4 || objP == ukd.f35823a) {
                        objP = new i8v(function3, (byte) 8);
                        fetVar2.o0(objP);
                    }
                    z = false;
                    sj3.w(0, fetVar2, null, (Function0) objP, z3);
                    fetVar2.r(false);
                } else {
                    z = false;
                    fetVar2.e0(1171501010);
                    fetVar2.r(false);
                }
                obj = pk5Var;
                boolean z5 = z;
                b8k0.e(o7k0.g(jm40Var, 0.0f, 1024.0f, 1), null, null, null, null, null, false, null, new cw6(hdzVarA, kie0Var, pk5Var, zIsEmpty, function3), fetVar, 12582912, 382);
                fetVar2 = fetVar;
                fetVar2.r(true);
                mva mvaVar = hdzVarA.e().f12569a;
                if (mvaVar != null) {
                    if (mvaVar instanceof zo00) {
                        fetVar2.e0(305061194);
                        fetVar2.r(z5);
                        function1.invoke(((zo00) mvaVar).b);
                    } else if (mvaVar instanceof bp00) {
                        fetVar2.e0(867052944);
                        fetVar2.r(z5);
                        if (hdzVarA.c() != 0) {
                            kie0Var.f18333a = z5 ? 1 : 0;
                        }
                    } else if (mvaVar instanceof ap00) {
                        fetVar2.e0(867240649);
                        if (hdzVarA.c() == 0) {
                            fetVar2.e0(867297751);
                            ffb0.m(z5 ? 1 : 0, 1, fetVar2, null);
                            fetVar2.r(z5);
                        } else {
                            fetVar2.e0(867371748);
                            fetVar2.r(z5);
                        }
                        fetVar2.r(z5);
                    }
                    mva mvaVar2 = hdzVarA.e().c;
                    if (mvaVar2 != null) {
                        if (mvaVar2 instanceof zo00) {
                            function1.invoke(((zo00) mvaVar2).b);
                        } else if ((mvaVar2 instanceof bp00) && hdzVarA.c() != 0 && mvaVar2.f22447a) {
                            function2.invoke(Boolean.FALSE);
                        }
                    }
                    fetVar2.r(z5);
                }
                throw b1j.f(305058651, fetVar2, z5);
            }
            if (obj instanceof nk5) {
                fetVar2.e0(867923641);
                fetVar2.r(false);
                function2.invoke(Boolean.TRUE);
            } else {
                if (!obj.equals(ok5.f25389a)) {
                    throw b1j.f(304920091, fetVar2, false);
                }
                fetVar2.e0(868023461);
                zcl zclVar2 = qmk.f28987a;
                ffb0.m(0, 0, fetVar2, s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13));
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, obj, function1, function2, function3, i, (byte) 29);
        }
    }

    public static final void r(mm40 mm40Var, String str, String str2, c280 c280Var, c280 c280Var2, kpm kpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1453905185);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(c280Var) ? 2048 : 1024) | (fetVar.g(c280Var2) ? 16384 : 8192) | (fetVar.g(kpmVar) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 54.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            int i3 = i2 >> 3;
            m((i2 & 112) | (i3 & 896), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var, str);
            n4c.l(null, kpmVar, z, fetVar, 1);
            if (1.0f <= 0) {
                vcx.a("invalid weight; must be greater than zero");
            }
            t(((i2 >> 6) & 896) | (i3 & 112), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var2, str2);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var2, str, str2, (Object) c280Var, (Object) c280Var2, kpmVar, z, i, (byte) 7);
        }
    }

    public static final void s(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(1704680075);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            l7m0 l7m0VarT = T(a4xVar, fetVar, (i2 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1660955929);
            int i3 = 0;
            for (Object obj : (List) l7m0VarT.getValue()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(-465866044, Integer.valueOf(i3));
                feb.n((egm) obj, fetVar);
                fetVar.r(false);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 7);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-421814695);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(c280Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.m, (byte) 12)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            androidx.compose.runtime.d dVar = j1t0.e;
            ((g1t0) fetVar.k(dVar)).getClass();
            nrq nrqVar = g1t0.m().f42262a.f;
            long j = qmk.q;
            ((g1t0) fetVar.k(dVar)).getClass();
            v8q0.a(str2, null, textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, nrqVar, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, null, fetVar, (i2 >> 3) & 14, 24960, 240498);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iym(mm40Var, str, c280Var, i, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, f6m f6mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1357929717);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(f6mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TournamentsIconTestTag");
            p2m p2mVar = new p2m(R.drawable.ic_glyph_tournaments, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), f6mVar.f9019a, f6mVar.b);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new cjl(function0, (byte) 13);
                fetVar.o0(objP);
            }
            vdb.w(mm40VarE0, p2mVar, (Function1) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) f6mVar, (Object) function0, i, (byte) 9);
        }
    }

    public static final Pair v(List list) {
        Object obj;
        if (list.size() <= 5) {
            obj = iun.f15405a;
        } else {
            ArrayList arrayListQ0 = CollectionsKt.Q0(list, 4, 4);
            List list2 = (List) CollectionsKt.W(0, arrayListQ0);
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            Object obj2 = (List) CollectionsKt.W(1, arrayListQ0);
            if (obj2 == null) {
                obj2 = iun.f15405a;
            }
            List list3 = list2;
            obj = obj2;
            list = list3;
        }
        return new Pair(list, obj);
    }

    public static final void w(cp cpVar) {
        List list = u0d.f34849a;
        u0d.j(((z3b0) cpVar.u).b.d(), ((zgb) cpVar.u()).e, R.drawable.ic_glyph_language_seconary, 0, null, null, null, 508);
    }

    public static final d3j x(boolean z, boolean z2, boolean z3, n85 n85Var, n85 n85Var2, z6w z6wVar) {
        if (!z && !z2) {
            return b3j.f1908a;
        }
        if (!z3) {
            return c3j.f3677a;
        }
        a3j a3jVar = a3j.f174a;
        if (!z && z2) {
            return a3jVar;
        }
        if (n85Var2 != null) {
            return new y2j(n85Var2);
        }
        if (n85Var != null) {
            return new x2j(n85Var);
        }
        return z6wVar != null ? new z2j(z6wVar) : a3jVar;
    }

    public static final boo0 y(ljg ljgVar, mog mogVar, ArrayList arrayList, long j, boolean z) {
        String str;
        ljgVar.getClass();
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            y3d y3dVar = null;
            if (!it.hasNext()) {
                return new boo0("FUTURE_GAMES_TABS", new fyl(dyb.o0(arrayList2), null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), new jyl(new y3d(j), y3dVar, y3dVar, 126), 6), pno0.f27299a);
            }
            mog mogVar2 = (mog) it.next();
            long j2 = mogVar2.f22133a;
            if (mogVar2 instanceof kog) {
                str = ljgVar.b.c;
            } else {
                if (!(mogVar2 instanceof log)) {
                    t9f.b();
                    return null;
                }
                str = ljgVar.c.c;
            }
            arrayList2.add(new lxl(j2, (dyl) new xxl(str), false, ((long) mogVar2.f22133a) == ((long) mogVar.f22133a) ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
    }

    public static final String z(long j, String str, String str2, String str3, ctf0 ctf0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ctf0Var.getClass();
        if (str2.length() <= 0) {
            str2 = null;
        }
        String strL = str2 != null ? kng0.l(Separators.LPAREN, str2, Separators.RPAREN) : null;
        if (strL == null) {
            strL = "";
        }
        String strL2 = cy7.c() ? kng0.l(strL, Separators.SP, str) : kng0.l(str, Separators.SP, strL);
        List listP = xkb.P();
        boolean z = false;
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == j) {
                    z = true;
                    break;
                }
            }
        }
        if (strL2.length() == 0 && str3.length() > 0) {
            return str3;
        }
        if (strL2.length() <= 0 || str3.length() <= 0) {
            return z ? ctf0Var.b.a(R.string.game_series_info_v2, Arrays.copyOf(new Object[]{strL2}, 1)) : strL2;
        }
        return cy7.c() ? kng0.l(str3, ", ", strL2) : kng0.l(str3, ", ", strL2);
    }
}
