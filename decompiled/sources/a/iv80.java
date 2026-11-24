package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iv80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15435a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ iv80(ctf0 ctf0Var, byte b) {
        this.f15435a = b;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        kfc0 kfc0Var;
        kfc0 kfc0Var2;
        boolean z;
        String strA;
        jac0 jac0Var = (jac0) obj;
        jac0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        zec0 zec0Var = jac0Var.e;
        String str = jac0Var.d;
        boolean z2 = jac0Var.b;
        if (zec0Var == null) {
            return new kac0(ctf0Var.b.a(R.string.check, Arrays.copyOf(new Object[0], 0)), str, z2 && !jac0Var.c && str.length() > 0, jac0Var.c, jac0Var.f16183a);
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA2 = lsm0Var.a(R.string.ok, Arrays.copyOf(new Object[0], 0));
        lc00 lc00VarB = kotlin.collections.a.b();
        String strR = w6x.r(new Object[0], 0, lsm0Var, R.string.promo_code_name_type_text, Separators.COLON);
        String str2 = zec0Var.b;
        int i = zec0Var.i;
        lc00VarB.add(new gic0(strR, str2));
        List<wcc0> list = zec0Var.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (wcc0 wcc0Var : list) {
            arrayList.add(new gic0(ohs0.n(wcc0Var.c, Separators.COLON), wcc0Var.d));
        }
        lc00VarB.addAll(arrayList);
        String strR2 = w6x.r(new Object[0], 0, lsm0Var, R.string.promo_code_sum, Separators.COLON);
        pn40 pn40Var = pn40.f27267a;
        lc00VarB.add(new gic0(strR2, pn40.d(zec0Var.d, zec0Var.e, p3u0.c)));
        String strA3 = lsm0Var.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0));
        kfc0.f18189a.getClass();
        if (i == 1) {
            kfc0Var = kfc0.c;
        } else if (i == 2) {
            kfc0Var = kfc0.e;
        } else if (i != 3) {
            kfc0Var = i != 4 ? kfc0.b : kfc0.d;
        } else {
            kfc0Var = kfc0.f;
        }
        int iOrdinal = kfc0Var.ordinal();
        long j = iOrdinal != 1 ? iOrdinal != 2 ? 0L : zec0Var.f : zec0Var.g;
        if (i == 1) {
            kfc0Var2 = kfc0.c;
        } else if (i == 2) {
            kfc0Var2 = kfc0.e;
        } else if (i != 3) {
            kfc0Var2 = i != 4 ? kfc0.b : kfc0.d;
        } else {
            kfc0Var2 = kfc0.f;
        }
        int iOrdinal2 = kfc0Var2.ordinal();
        if (iOrdinal2 == 1) {
            z = false;
            strA = lsm0Var.a(R.string.promo_code_active_before_status_text, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal2 == 2) {
            z = false;
            strA = lsm0Var.a(R.string.promo_code_used_status_text, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal2 == 3) {
            z = false;
            strA = lsm0Var.a(R.string.promo_code_expired_status_text, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal2 != 4) {
            strA = "";
            z = false;
        } else {
            z = false;
            strA = lsm0Var.a(R.string.promo_code_inactive_status_text, Arrays.copyOf(new Object[0], 0));
        }
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), z, 56);
        if (strG.length() > 0) {
            strA = kng0.l(strA, Separators.SP, strG);
        }
        lc00VarB.add(new gic0(strA3, strA));
        return new lac0(strA2, z2, new fic0(dyb.r0(kotlin.collections.a.a(lc00VarB)), str));
    }

    private final Object b(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        u0e0[] u0e0VarArr = u0e0.f34850a;
        ctf0 ctf0Var = this.b;
        if (jLongValue == 6) {
            return ctf0Var.b.a(R.string.maps, Arrays.copyOf(new Object[0], 0));
        }
        return jLongValue == 5 ? ctf0Var.b.a(R.string.rainbow_operatives, Arrays.copyOf(new Object[0], 0)) : "";
    }

    private final Object c(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        u0e0[] u0e0VarArr = u0e0.f34850a;
        ctf0 ctf0Var = this.b;
        if (jLongValue == 1) {
            return ctf0Var.b.a(R.string.maps, Arrays.copyOf(new Object[0], 0));
        }
        return jLongValue == 2 ? ctf0Var.b.a(R.string.rainbow_operatives, Arrays.copyOf(new Object[0], 0)) : "";
    }

    private final Object g(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        u0e0[] u0e0VarArr = u0e0.f34850a;
        ctf0 ctf0Var = this.b;
        if (jLongValue == 6) {
            return ctf0Var.b.a(R.string.maps, Arrays.copyOf(new Object[0], 0));
        }
        return jLongValue == 5 ? ctf0Var.b.a(R.string.rainbow_operatives, Arrays.copyOf(new Object[0], 0)) : "";
    }

    private final Object h(Object obj) {
        String str;
        String strA;
        t2e0 t2e0Var = (t2e0) obj;
        t2e0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        int i = t2e0Var.f33211a;
        if (i == 1) {
            str = "😥";
        } else if (i == 2) {
            str = "🙁";
        } else if (i == 3) {
            str = "👌";
        } else if (i != 4) {
            str = i != 5 ? "👋" : "😍";
        } else {
            str = "👍";
        }
        String strA2 = "";
        if (i == 0) {
            strA = ctf0Var.b.a(R.string.rate_app_rating_initial, Arrays.copyOf(new Object[0], 0));
        } else if (i == 1 || i == 2 || i == 3) {
            strA = ctf0Var.b.a(R.string.rate_app_rating_neutral, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = (i == 4 || i == 5) ? ctf0Var.b.a(R.string.rate_app_rating_good, Arrays.copyOf(new Object[0], 0)) : "";
        }
        if (i == 1 || i == 2 || i == 3) {
            strA2 = ctf0Var.b.a(R.string.rate_app_description_neutral, Arrays.copyOf(new Object[0], 0));
        } else if (i == 4 || i == 5) {
            strA2 = ctf0Var.b.a(R.string.rate_app_description_good, Arrays.copyOf(new Object[0], 0));
        }
        boolean z = t2e0Var.b;
        boolean z2 = i != 0;
        String str2 = str;
        boolean z3 = i != 0;
        lsm0 lsm0Var = ctf0Var.b;
        return new u2e0(i, str2, strA, z, z2, z3, strA2, lsm0Var.a(R.string.rate_app, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)));
    }

    private final Object i(Object obj) {
        zce0 zce0Var = (zce0) obj;
        zce0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = zce0Var.f44163a;
        String str2 = zce0Var.b;
        boolean z = zce0Var.c;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.reality_dont_remind, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(klm.f18497a, mlm.f21997a, new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_cancel, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        return new ade0(str, str2, z, strA, immVar, new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.continue_action, Arrays.copyOf(new Object[0], 0))), true, false, false), rk.j), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.exit_dialog_title, Arrays.copyOf(new Object[0], 0))), true, false, false), sh00.c))));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object l(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
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

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object m(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
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

    private final Object o(Object obj) {
        o7f0 o7f0Var = (o7f0) obj;
        o7f0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = o7f0Var.f24784a;
        String str2 = o7f0Var.b;
        boolean z = o7f0Var.f;
        boolean z2 = o7f0Var.g;
        pz40 pz40Var = s6t0.f31722a;
        kul kulVar = new kul(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary40());
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        return new p7f0(str, str2, z, z2, new wul(kulVar, oe9Var, new ve9(lsm0Var.a(R.string.copy_info, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_copy), true, false, false), new wul(new kul(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary40()), oe9Var, new ve9(lsm0Var.a(R.string.share, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_share), true, false, false), new wul(iul.e, oe9Var, new ue9(lsm0Var.a(R.string.next, Arrays.copyOf(new Object[0], 0))), true, false, false));
    }

    private final Object p(Object obj) {
        nef0 nef0Var = (nef0) obj;
        nef0Var.getClass();
        ldf0 ldf0Var = nef0Var.f23383a;
        if (ldf0Var == null) {
            return oef0.f25120a;
        }
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        if (ldf0Var.equals(idf0.f14583a)) {
            return new pef0(ctf0Var.b.a(R.string.no_available_bets_hint, Arrays.copyOf(new Object[0], 0)));
        }
        if (ldf0Var.equals(jdf0.f16328a)) {
            return new pef0(ctf0Var.b.a(R.string.game_finished_with_similar_events_message, Arrays.copyOf(new Object[0], 0)));
        }
        if (!(ldf0Var instanceof kdf0)) {
            t9f.b();
            return null;
        }
        String strA = ctf0Var.b.a(R.string.transition_to_live, Arrays.copyOf(new Object[0], 0));
        long jB = new znq0(((kdf0) ldf0Var).f18105a).b();
        return new qef0(strA, String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jB / 60), Long.valueOf(jB % 60)}, 2)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    private final Object r(Object obj) {
        List listA0;
        long jM113getRed0d7_KjU;
        wui0 wui0Var;
        pgf0 pgf0Var = (pgf0) obj;
        pgf0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = pgf0Var.b;
        List listL0 = CollectionsKt.L0(pgf0Var.f26953a.entrySet());
        int iOrdinal = pgf0Var.d.ordinal();
        if (iOrdinal == 0) {
            listA0 = CollectionsKt.A0(listL0, new lk30((byte) 26));
        } else if (iOrdinal == 1) {
            listA0 = CollectionsKt.A0(listL0, new lk30((byte) 28));
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            listA0 = CollectionsKt.A0(CollectionsKt.A0(listL0, new lk30((byte) 27)), new lk30((byte) 29));
        }
        nmy nmyVar = pgf0Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = listA0.iterator();
        while (true) {
            boolean zEquals = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (!Intrinsics.d(entry.getKey(), "languages")) {
                if (nmyVar == nmy.ALL) {
                    zEquals = true;
                } else if (nmyVar == nmy.ONLY_CHANGED) {
                    if (!String.valueOf(((ssd) entry.getValue()).b).equals(String.valueOf(((ssd) entry.getValue()).f32720a))) {
                        zEquals = true;
                    }
                } else if (nmyVar == nmy.ONLY_NOT_CHANGED) {
                    zEquals = String.valueOf(((ssd) entry.getValue()).b).equals(String.valueOf(((ssd) entry.getValue()).f32720a));
                }
            }
            if (zEquals) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Map.Entry entry2 = (Map.Entry) obj2;
            if (str.length() != 0) {
                String str2 = (String) entry2.getKey();
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = str.toLowerCase(locale);
                lowerCase2.getClass();
                if (!StringsKt.O(lowerCase, lowerCase2, false)) {
                    String lowerCase3 = String.valueOf(((ssd) entry2.getValue()).b).toLowerCase(locale);
                    lowerCase3.getClass();
                    String lowerCase4 = str.toLowerCase(locale);
                    lowerCase4.getClass();
                    if (StringsKt.O(lowerCase3, lowerCase4, false)) {
                    }
                }
            }
            arrayList2.add(obj2);
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        int i = 0;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            Map.Entry entry3 = (Map.Entry) obj3;
            String str3 = (String) entry3.getKey();
            ssd ssdVar = (ssd) entry3.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(kcx.Z(ssdVar.b));
            List list = ssdVar.c;
            if (list != null) {
                sb.append(" (");
                sb.append(CollectionsKt.b0(list, ", ", null, null, new bue0((byte) 19), 30));
                sb.append(Separators.RPAREN);
            }
            String string = sb.toString();
            if (String.valueOf(ssdVar.b).equals(String.valueOf(ssdVar.f32720a))) {
                pz40 pz40Var = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getTextPrimary();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            }
            uui0 uui0Var = new uui0(str3, new y3d(jM113getRed0d7_KjU), string, null, null, 56);
            if (size == 1) {
                wui0Var = wui0.f39793a;
            } else if (i == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = i == size + (-1) ? wui0.d : wui0.c;
            }
            arrayList3.add(new tsd(str3, new rqm((vui0) uui0Var, (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, true, (e900) null, 318)));
            i = i2;
        }
        a4x a4xVarO0 = dyb.o0(arrayList3);
        pz40 pz40Var3 = s6t0.f31722a;
        return new qgf0(a4xVarO0, str, new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.test_remote_config, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), new ea50(s6t0.b().f33626a.getSecondary())), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null));
    }

    private final Object s(Object obj) {
        int i;
        String strG0;
        gif0 gif0Var = (gif0) obj;
        gif0Var.getClass();
        String str = gif0Var.b;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.confirmation, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60()));
        boolean z = gif0Var.c;
        String strA = z ? lsm0Var.a(R.string.wrong_pin_code_error, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.enter_pin_code, Arrays.copyOf(new Object[0], 0));
        long warning = z ? s6t0.b().f33626a.getWarning() : s6t0.b().f33626a.getSecondary();
        boolean z2 = gif0Var.d;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.addAll(q3d.j(new xt90("1", lsm0Var.a(R.string.one_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("2", lsm0Var.a(R.string.two_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("3", lsm0Var.a(R.string.three_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("4", lsm0Var.a(R.string.four_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("5", lsm0Var.a(R.string.five_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("6", lsm0Var.a(R.string.six_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("7", lsm0Var.a(R.string.seven_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("8", lsm0Var.a(R.string.eight_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("9", lsm0Var.a(R.string.nine_button_text, Arrays.copyOf(new Object[0], 0)))));
        if (cy7.c()) {
            i = 0;
            lc00VarB.addAll(q3d.j(new yt90(3), new xt90("0", lsm0Var.a(R.string.zero_button_text, Arrays.copyOf(new Object[0], 0)))));
        } else {
            i = 0;
            lc00VarB.addAll(q3d.j(zt90.f44946a, new xt90("0", lsm0Var.a(R.string.zero_button_text, Arrays.copyOf(new Object[0], 0))), new yt90(7)));
        }
        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
        if (str.length() > 0) {
            char cJ = ttm0.J(str);
            int length = str.length() - 1;
            StringBuilder sb = new StringBuilder();
            while (i < length) {
                sb.append("•");
                i++;
            }
            strG0 = StringsKt.g0(cJ, str, sb.toString());
        } else {
            strG0 = str;
        }
        return new hif0(immVar, new du90(strA, warning, z2, a4xVarO0, str, strG0));
    }

    private final Object t(Object obj) {
        Iterator it;
        glg0 flg0Var;
        png0 png0Var;
        glg0 elg0Var;
        char c;
        boolean z;
        char c2;
        ong0 ong0Var = (ong0) obj;
        ong0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(ong0Var.b, Arrays.copyOf(new Object[0], 0));
        xkg0 xkg0Var = ong0Var.h;
        mtl mtlVar = xkg0Var != null ? new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(xkg0Var.c), true, false, false), sh00.v))) : null;
        if (ong0Var.c) {
            return new sng0(strA, ong0Var.f25546a);
        }
        mdm mdmVar = ong0Var.d;
        boolean z2 = ong0Var.f25546a;
        if (mdmVar != null) {
            return new rng0(mdmVar, strA, z2);
        }
        List list = ong0Var.g;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ykg0 ykg0Var = (ykg0) next;
            ysw yswVar = ykg0Var.c;
            String str = yswVar.c;
            String str2 = yswVar.f43189a;
            String str3 = yswVar.b;
            String str4 = yswVar.d;
            if (str.length() != 0 || str4.length() <= 0) {
                it = it2;
                if (str.length() <= 0 || ykg0Var.e == clg0.BUTTON) {
                    String str5 = ykg0Var.b;
                    if (ykg0Var.f42786a) {
                        png0Var = png0.f27285a;
                    } else {
                        png0Var = yswVar.a() ? png0.b : png0.c;
                    }
                    flg0Var = new flg0(str5, png0Var);
                } else {
                    elg0Var = new elg0(ykg0Var.b, yswVar.c, str3.length() == 0 ? str2 : str3, str3.length() > 0, str2.length() > 0 || str4.length() > 0 || str.length() > 0);
                }
                arrayList.add(flg0Var);
                i = i2;
                it2 = it;
            } else {
                boolean z3 = i == 0;
                StringBuilder sb = new StringBuilder(ujn.h);
                it = it2;
                if (str4.length() == 0) {
                    sb.setLength(0);
                    c = '/';
                } else if (StringsKt.O(str4, ujn.h, false) || kotlin.text.c.x(str4, "https://", false)) {
                    c = '/';
                    sb.setLength(0);
                    sb.append(str4);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    c = '/';
                    sb.append(StringsKt.y0(str4, '/'));
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder(ujn.h);
                String str6 = ykg0Var.d.d;
                str6.getClass();
                if (str6.length() == 0) {
                    sb2.setLength(0);
                    z = true;
                } else if (StringsKt.O(str6, ujn.h, false) || kotlin.text.c.x(str6, "https://", false)) {
                    z = true;
                    sb2.setLength(0);
                    sb2.append(str6);
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c2 = c;
                    } else {
                        c2 = c;
                        sb2.append(c2);
                    }
                    z = true;
                    sb2.append(StringsKt.y0(str6, c2));
                }
                elg0Var = new dlg0(string, sb2.toString(), ykg0Var.b, str3.length() == 0 ? str2 : str3, str3.length() > 0 ? z : false, z3);
            }
            flg0Var = elg0Var;
            arrayList.add(flg0Var);
            i = i2;
            it2 = it;
        }
        return new tng0(dyb.o0(arrayList), ong0Var.h, mtlVar, strA, z2);
    }

    private final Object u(Object obj) {
        pec pecVar;
        tec tecVar = (tec) obj;
        tecVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        boolean z = tecVar.c;
        tlm nlmVar = z ? new nlm(new hmm(11, (String) null, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var.b.a(R.string.countries_choosing, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        gmm dmmVar = z ? null : new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary())));
        if (dmmVar == null) {
            dmmVar = fmm.f9790a;
        }
        imm immVar = new imm(ilmVar, nlmVar, dmmVar, s6t0.b().f33626a.getBackgroundContent(), true, null);
        if (tecVar.f33813a) {
            pecVar = oec.f25116a;
        } else {
            List list = tecVar.e;
            String str = tecVar.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (StringsKt.O(((frq) obj2).b, str, true)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                frq frqVar = (frq) it.next();
                Set set = tecVar.f;
                frqVar.getClass();
                int i = frqVar.f10031a;
                set.getClass();
                String str2 = frqVar.b;
                pz40 pz40Var2 = s6t0.f31722a;
                b2l0 b2l0Var = new b2l0(str2, s6t0.b().f33626a.getTextPrimary());
                p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
                y3d y3dVar = new y3d(s6t0.b().f33626a.getSecondary());
                Iterator it2 = it;
                bzu bzuVarD = rz4.d("static", "svg", "flags");
                rz4.s(i, ".svg", bzuVarD);
                t1l0 t1l0Var = new t1l0(p1l0Var, y3dVar, ((StringBuilder) bzuVarD.b).toString(), null, null, null, 248);
                d3l0 d3l0Var = new d3l0(set.contains(Integer.valueOf(i)), true);
                zcl zclVar = qmk.f28987a;
                arrayList2.add(new dre(i, new zrm(b2l0Var, t1l0Var, d3l0Var, (d4d) null, new l3l0(16.0f), 8)));
                it = it2;
            }
            Object necVar = new nec(tecVar.g);
            h6c h6cVar = new h6c(tecVar, ctf0Var, (byte) 5);
            if (!arrayList2.isEmpty()) {
                necVar = h6cVar.invoke(arrayList2);
            }
            pecVar = (pec) necVar;
        }
        return new uec(immVar, pecVar);
    }

    private final Object v(Object obj) {
        n3i0 n3i0Var;
        boolean z;
        khq0 phq0Var;
        int i;
        int i2;
        String strI;
        String strA;
        m3i0 m3i0Var = (m3i0) obj;
        m3i0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = m3i0Var.d;
        int i3 = m3i0Var.f21116a;
        mfj mfjVar = m3i0Var.b;
        mfj mfjVar2 = m3i0Var.c;
        lsm0 lsm0Var = ctf0Var.b;
        boolean zH = ctf0Var.h();
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i4 = 0;
        int i5 = 0;
        for (Object obj2 : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            ygq0 ygq0Var = (ygq0) obj2;
            if (lhq0.f20070a[ygq0Var.ordinal()] == 1) {
                boolean z2 = mfjVar instanceof kfj;
                z = zH;
                if (z2) {
                    strI = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[i4], i4));
                    i2 = i5;
                } else {
                    if (!(mfjVar instanceof lfj)) {
                        t9f.b();
                        return null;
                    }
                    rdj rdjVar = rdj.f30294a;
                    i2 = i5;
                    strI = rdj.i(new ynq0(((lfj) mfjVar).f19959a.getTime()), Boolean.valueOf(z), nhq0.f23547a);
                    if (cy7.c()) {
                        strI = "\u200f".concat(strI);
                    }
                }
                boolean z3 = mfjVar2 instanceof kfj;
                if (z3) {
                    strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (!(mfjVar2 instanceof lfj)) {
                        t9f.b();
                        return null;
                    }
                    rdj rdjVar2 = rdj.f30294a;
                    String strI2 = rdj.i(new ynq0(((lfj) mfjVar2).f19959a.getTime()), Boolean.valueOf(z), mhq0.f21808a);
                    if (cy7.c()) {
                        strI2 = "\u200f".concat(strI2);
                    }
                    strA = strI2;
                }
                int i7 = i2;
                byte b = ygq0Var.f42598a;
                phq0Var = new sgq0(b, strI, strA, b == i3, z2, z3, ohq0.c0(ygq0Var, lsm0Var.a(R.string.arbitary_period, Arrays.copyOf(new Object[0], 0)), i3, i7 == 0 ? wui0.b : i7 == list.size() - 1 ? wui0.d : wui0.c), ohq0.b0(wui0.b, lsm0Var.a(R.string.start_date_period, Arrays.copyOf(new Object[0], 0)), strI, z2), ohq0.b0(wui0.d, lsm0Var.a(R.string.end_date_period, Arrays.copyOf(new Object[0], 0)), strA, z3));
                i = 0;
            } else {
                z = zH;
                list = list;
                n3i0Var = n3i0Var;
                int i8 = i5;
                byte b2 = ygq0Var.f42598a;
                i = 0;
                phq0Var = new phq0(b2, b2 == i3, ipm0.i(ygq0Var), ohq0.c0(ygq0Var, lsm0Var.a(ipm0.i(ygq0Var), Arrays.copyOf(new Object[0], 0)), i3, i8 == 0 ? wui0.b : i8 == list.size() - 1 ? wui0.d : wui0.c));
            }
            arrayList.add(phq0Var);
            i5 = i6;
            i4 = i;
            n3i0Var = n3i0Var;
            zH = z;
            list = list;
            mfjVar2 = mfjVar2;
        }
        return new n3i0(dyb.r0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0493  */
    /* JADX WARN: Code duplicated, block: B:173:0x056b  */
    /* JADX WARN: Code duplicated, block: B:175:0x057d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0589  */
    /* JADX WARN: Code duplicated, block: B:180:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x058e  */
    /* JADX WARN: Code duplicated, block: B:182:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:184:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:186:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:187:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x05fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x0600  */
    /* JADX WARN: Code duplicated, block: B:195:0x060b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0617  */
    /* JADX WARN: Code duplicated, block: B:301:0x0894  */
    /* JADX WARN: Code duplicated, block: B:456:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:457:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:459:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:460:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:462:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:465:0x0ccc  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ce0  */
    /* JADX WARN: Code duplicated, block: B:471:0x0cf0 A[LOOP:5: B:469:0x0cea->B:471:0x0cf0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:475:0x0d19  */
    /* JADX WARN: Code duplicated, block: B:481:0x0d3f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0d53  */
    /* JADX WARN: Code duplicated, block: B:484:0x0d56  */
    /* JADX WARN: Code duplicated, block: B:490:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:492:0x0d80  */
    /* JADX WARN: Code duplicated, block: B:493:0x0d83  */
    /* JADX WARN: Code duplicated, block: B:497:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:501:0x0da5  */
    /* JADX WARN: Code duplicated, block: B:503:0x0dc9  */
    /* JADX WARN: Code duplicated, block: B:508:0x0dd4  */
    /* JADX WARN: Code duplicated, block: B:511:0x0dde  */
    /* JADX WARN: Code duplicated, block: B:516:0x0df2  */
    /* JADX WARN: Code duplicated, block: B:520:0x0e20  */
    /* JADX WARN: Code duplicated, block: B:522:0x0e29  */
    /* JADX WARN: Code duplicated, block: B:532:0x0898 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0874 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0df2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0ded A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[LOOP:4: B:509:0x0dd8->B:544:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x0d2c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0d13 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0d59 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0d39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x02b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [a.in00] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [int] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v84 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        ltr jtrVar;
        ctf0 ctf0Var;
        ltr ltrVar;
        bms bmsVar;
        a4x a4xVarO0;
        k0d k0dVar;
        pn00 pn00Var;
        int iA;
        LinkedHashMap linkedHashMap;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        bms zlsVar;
        kta0 kta0Var;
        Object obj2;
        bsa0 bsa0Var;
        a4x a4xVarO1;
        pn00 pn00Var2;
        ?? r1;
        Iterable<d0t> iterable;
        sff0 sff0Var;
        ArrayList arrayList3;
        m5l0 m5l0Var;
        List list;
        Iterator it2;
        ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel;
        boolean z2;
        cuc0 buc0Var;
        String str;
        k0j0 k0j0Var;
        String str2;
        boolean z3;
        boolean z4;
        int i;
        boolean zContains;
        a4x a4xVarO2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        boolean z10;
        Pair pair;
        String strL;
        int i3;
        String strA;
        byte b = this.f15435a;
        int i4 = 10;
        bzw bzwVar = null;
        ctf0 ctf0Var2 = this.b;
        switch (b) {
            case 0:
                yu80 yu80Var = (yu80) obj;
                yu80Var.getClass();
                return new gv80(ctf0Var2, yu80Var);
            case 1:
                nsa0 nsa0Var = (nsa0) obj;
                nsa0Var.getClass();
                i4 i4Var = rsa0.f31022a;
                ctf0 ctf0Var3 = this.b;
                ctf0Var3.getClass();
                l9s l9sVarB = rsa0.b(nsa0Var);
                String strN = l9sVarB != null ? l9sVarB.N() : null;
                l9s l9sVarB2 = rsa0.b(nsa0Var);
                String strO = l9sVarB2 != null ? l9sVarB2.o() : null;
                l9s l9sVarB3 = rsa0.b(nsa0Var);
                String strW = l9sVarB3 != null ? l9sVarB3.w() : null;
                StringBuilder sb = new StringBuilder();
                if (strN != null && strN.length() != 0) {
                    sb.append(strN);
                }
                if (strO != null && strO.length() != 0) {
                    if (sb.length() > 0) {
                        sb.append(". ");
                    }
                    sb.append(strO);
                }
                if (strW != null && strW.length() != 0) {
                    if (sb.length() > 0) {
                        sb.append(". ");
                    }
                    sb.append(strW);
                }
                String string = sb.toString();
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                staticColors.m123getWhite0d7_KjU();
                l9s l9sVarB4 = rsa0.b(nsa0Var);
                imm immVar = new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new plm(string, staticColors.m123getWhite0d7_KjU(), fa50.f9191a), new dmm(new ta50(new wkm(2, l9sVarB4 != null ? nsa0Var.i.contains(Long.valueOf(l9sVarB4.C())) : false ? R.drawable.ic_star_liked_new : R.drawable.ic_star_unliked_new, rsa0.b(nsa0Var) != null, ra50.f30118a, staticColors.m123getWhite0d7_KjU()))), staticColors.m121getTransparent0d7_KjU(), false, null);
                l9s l9sVarB5 = rsa0.b(nsa0Var);
                if (l9sVarB5 == null) {
                    jtrVar = ktr.f18880a;
                    z = false;
                } else {
                    String strM = l9sVarB5.M();
                    if (StringsKt.W(strM)) {
                        String strD = l9sVarB5.D();
                        String strJ = strD != null ? strD : "";
                        if (StringsKt.W(strJ)) {
                            if (StringsKt.W(l9sVarB5.j()) || StringsKt.W(l9sVarB5.g())) {
                                strJ = l9sVarB5.j();
                                if (StringsKt.W(strJ)) {
                                    strJ = l9sVarB5.g();
                                }
                            } else {
                                strJ = w6x.q(l9sVarB5.j(), " - ", l9sVarB5.g());
                            }
                        }
                        strM = strJ;
                    }
                    rdj rdjVar = rdj.f30294a;
                    z = false;
                    jtrVar = new jtr(strM, rdj.g(new znq0(l9sVarB5.u()), efj.UNIVERSAL, Boolean.valueOf(ctf0Var3.h()), false, 56));
                }
                ?? sb2 = new StringBuilder(ujn.h);
                boolean zO = StringsKt.O("static/img/ImgDefault/Polybet/polybet_bg.png", ujn.h, z);
                ?? r9 = z;
                if (zO) {
                    sb2.setLength(r9);
                    sb2.append("static/img/ImgDefault/Polybet/polybet_bg.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Polybet/polybet_bg.png", "https://", z)) {
                    r9 = 0;
                    sb2.setLength(r9);
                    sb2.append("static/img/ImgDefault/Polybet/polybet_bg.png");
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0("static/img/ImgDefault/Polybet/polybet_bg.png", '/'));
                }
                String string2 = sb2.toString();
                pn00 pn00Var3 = nsa0Var.c;
                if (pn00Var3 instanceof fn00) {
                    return new psa0(immVar, jtrVar, string2, nsa0Var.j);
                }
                if (!(pn00Var3 instanceof mn00)) {
                    List listA = rsa0.a(nsa0Var);
                    if (listA.isEmpty()) {
                        a4xVarO0 = lak0.c;
                    } else {
                        ArrayList<List> arrayListQ0 = CollectionsKt.Q0(listA, 2, 2);
                        int i5 = 10;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayListQ0, 10));
                        for (List<hao> list2 : arrayListQ0) {
                            ArrayList arrayList5 = new ArrayList(r3d.q(list2, i5));
                            for (hao haoVar : list2) {
                                String str3 = haoVar.l;
                                String strM2 = haoVar.i;
                                if (StringsKt.W(strM2)) {
                                    strM2 = haoVar.j;
                                }
                                if (StringsKt.W(strM2)) {
                                    strM2 = twn.m(haoVar.f12733a, Separators.POUND);
                                }
                                String str4 = strM2;
                                if (haoVar.h) {
                                    k0dVar = k0d.b;
                                } else {
                                    ur20 ur20Var = haoVar.n;
                                    k0dVar = ur20Var == ur20.b ? k0d.c : ur20Var == ur20.c ? k0d.d : k0d.f17460a;
                                }
                                arrayList5.add(new chl0(str3, str4, k0dVar, a65.f301a, haoVar.o, haoVar.p, haoVar.r, false, new xgl0(haoVar.b, haoVar.f, haoVar.d, haoVar.l, haoVar.f12733a, haoVar.e, haoVar.q.f36034a, haoVar.c, false)));
                                ctf0Var3 = ctf0Var3;
                                jtrVar = jtrVar;
                            }
                            arrayList4.add(new z3n(dyb.o0(arrayList5), new zgl0(), new dil0((y9q0) null, (y9q0) null, new zgl0(), 7), 14));
                            ctf0Var3 = ctf0Var3;
                            jtrVar = jtrVar;
                            i5 = 10;
                        }
                        ctf0Var = ctf0Var3;
                        ltrVar = jtrVar;
                        bmsVar = null;
                        a4xVarO0 = dyb.o0(arrayList4);
                    }
                    a4x a4xVar = a4xVarO0;
                    pn00Var = nsa0Var.e;
                    if (!(pn00Var instanceof fn00)) {
                        zlsVar = bmsVar;
                    } else if (pn00Var instanceof mn00) {
                        zlsVar = ams.f1124a;
                    } else {
                        if (pn00Var instanceof in00) {
                            t9f.b();
                            return bmsVar;
                        }
                        if (rsa0.a(nsa0Var).isEmpty()) {
                            zlsVar = bmsVar;
                        } else {
                            Iterable iterable2 = (Iterable) ((in00) pn00Var).f15051a;
                            iA = wp20.a(r3d.q(iterable2, 10));
                            if (iA < 16) {
                                iA = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iA);
                            for (Object obj3 : iterable2) {
                                linkedHashMap.put(Long.valueOf(((kta0) obj3).f18854a), obj3);
                            }
                            List listA2 = rsa0.a(nsa0Var);
                            hashSet = new HashSet();
                            arrayList = new ArrayList();
                            for (Object obj4 : listA2) {
                                if (hashSet.add(Long.valueOf(((hao) obj4).v))) {
                                    arrayList.add(obj4);
                                }
                            }
                            arrayList2 = new ArrayList();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                kta0Var = (kta0) linkedHashMap.get(Long.valueOf(((hao) it.next()).v));
                                if (kta0Var != null) {
                                    obj2 = kta0Var.c;
                                } else {
                                    obj2 = bmsVar;
                                }
                                if (obj2 != null) {
                                    arrayList2.add(obj2);
                                }
                            }
                            zlsVar = new zls(CollectionsKt.b0(arrayList2, "\n\n", null, null, null, 62), nsa0Var.f);
                        }
                    }
                    bsa0Var = nsa0Var.g;
                    if (bsa0Var != null) {
                        pn00Var2 = nsa0Var.d;
                        if (pn00Var2 instanceof in00) {
                            r1 = (in00) pn00Var2;
                        } else {
                            r1 = bmsVar;
                        }
                        if (r1 != 0 || (iterable = (List) r1.f15051a) == null) {
                            iterable = iun.f15405a;
                        }
                        sff0Var = bsa0Var.f3120a;
                        arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (d0t d0tVar : iterable) {
                            y78 y78Var = bsa0Var.d;
                            boolean z11 = bsa0Var.b;
                            boolean z12 = sff0Var.J;
                            String strA2 = bsa0Var.c.a(d0tVar.v, d0tVar.u);
                            iun iunVar = iun.f15405a;
                            v5l0 v5l0Var = sff0Var.g.y;
                            if (d0tVar.K.isEmpty()) {
                                list = d0tVar.k;
                                if (list != null || !list.isEmpty()) {
                                    it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!((d0t) it2.next()).K.isEmpty()) {
                                                m5l0Var = l5l0.f19463a;
                                            }
                                        }
                                    }
                                }
                                m5l0Var = i5l0.f14197a;
                            } else {
                                m5l0Var = l5l0.f19463a;
                            }
                            arrayList3.add(wwb.V(d0tVar, ctf0Var, y78Var, z11, z12, strA2, false, iunVar, false, false, false, v5l0Var, m5l0Var, "", false));
                        }
                        a4xVarO1 = dyb.o0(arrayList3);
                    } else {
                        a4xVarO1 = lak0.c;
                    }
                    return new osa0(immVar, ltrVar, string2, a4xVar, zlsVar, a4xVarO1);
                }
                a4xVarO0 = rsa0.f31022a;
                ctf0Var = ctf0Var3;
                ltrVar = jtrVar;
                bmsVar = null;
                a4x a4xVar2 = a4xVarO0;
                pn00Var = nsa0Var.e;
                if (!(pn00Var instanceof fn00)) {
                    zlsVar = bmsVar;
                } else if (pn00Var instanceof mn00) {
                    zlsVar = ams.f1124a;
                } else {
                    if (pn00Var instanceof in00) {
                        t9f.b();
                        return bmsVar;
                    }
                    if (rsa0.a(nsa0Var).isEmpty()) {
                        zlsVar = bmsVar;
                    } else {
                        Iterable iterable3 = (Iterable) ((in00) pn00Var).f15051a;
                        iA = wp20.a(r3d.q(iterable3, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iA);
                        while (r0.hasNext()) {
                            linkedHashMap.put(Long.valueOf(((kta0) obj3).f18854a), obj3);
                        }
                        List listA3 = rsa0.a(nsa0Var);
                        hashSet = new HashSet();
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            if (hashSet.add(Long.valueOf(((hao) obj4).v))) {
                                arrayList.add(obj4);
                            }
                        }
                        arrayList2 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            kta0Var = (kta0) linkedHashMap.get(Long.valueOf(((hao) it.next()).v));
                            if (kta0Var != null) {
                                obj2 = kta0Var.c;
                            } else {
                                obj2 = bmsVar;
                            }
                            if (obj2 != null) {
                                arrayList2.add(obj2);
                            }
                        }
                        zlsVar = new zls(CollectionsKt.b0(arrayList2, "\n\n", null, null, null, 62), nsa0Var.f);
                    }
                }
                bsa0Var = nsa0Var.g;
                if (bsa0Var != null) {
                    pn00Var2 = nsa0Var.d;
                    if (pn00Var2 instanceof in00) {
                        r1 = (in00) pn00Var2;
                    } else {
                        r1 = bmsVar;
                    }
                    if (r1 != 0) {
                        iterable = iun.f15405a;
                    } else {
                        iterable = iun.f15405a;
                    }
                    sff0Var = bsa0Var.f3120a;
                    arrayList3 = new ArrayList(r3d.q(iterable, 10));
                    while (r1.hasNext()) {
                        y78 y78Var2 = bsa0Var.d;
                        boolean z13 = bsa0Var.b;
                        boolean z14 = sff0Var.J;
                        String strA3 = bsa0Var.c.a(d0tVar.v, d0tVar.u);
                        iun iunVar2 = iun.f15405a;
                        v5l0 v5l0Var2 = sff0Var.g.y;
                        if (d0tVar.K.isEmpty()) {
                            m5l0Var = l5l0.f19463a;
                        } else {
                            list = d0tVar.k;
                            if (list != null) {
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!((d0t) it2.next()).K.isEmpty()) {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                    }
                                }
                            } else {
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!((d0t) it2.next()).K.isEmpty()) {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                    }
                                }
                            }
                            m5l0Var = i5l0.f14197a;
                        }
                        arrayList3.add(wwb.V(d0tVar, ctf0Var, y78Var2, z13, z14, strA3, false, iunVar2, false, false, false, v5l0Var2, m5l0Var, "", false));
                    }
                    a4xVarO1 = dyb.o0(arrayList3);
                } else {
                    a4xVarO1 = lak0.c;
                }
                return new osa0(immVar, ltrVar, string2, a4xVar2, zlsVar, a4xVarO1);
            case 2:
                ((swa0) obj).getClass();
                return new m72(ctf0Var2, (byte) 14);
            case 3:
                d0b0 d0b0Var = (d0b0) obj;
                d0b0Var.getClass();
                return new wr0(d0b0Var, ctf0Var2);
            case 4:
                u2b0 u2b0Var = (u2b0) obj;
                u2b0Var.getClass();
                return new qb4(ctf0Var2, u2b0Var);
            case 5:
                uib0 uib0Var = (uib0) obj;
                uib0Var.getClass();
                ctf0Var2.getClass();
                ArrayList arrayList6 = new ArrayList();
                boolean z15 = uib0Var.f35723a;
                boolean z16 = uib0Var.i;
                boolean z17 = uib0Var.j;
                boolean z18 = uib0Var.h;
                if (z15) {
                    boolean z19 = uib0Var.b;
                    arrayList6.add(new zvi0(ctf0Var2.b.a(R.string.tab_top_title, Arrays.copyOf(new Object[0], 0))));
                    arrayList6.add(new jui0(ctf0Var2.f(R.string._ontent_personalization_res_0x7f13185c, new Object[0]), z19, true, true, true, aib0.f916a));
                }
                boolean z20 = uib0Var.d;
                arrayList6.add(new zvi0(ctf0Var2.f(R.string.popular_settings_block_title, new Object[0])));
                arrayList6.add(new jui0(ctf0Var2.f(R.string.popular_settings_block_sport_single, new Object[0]), z20, true, z17 || !(z16 || z18), true, aib0.b));
                if (!z17 && z16) {
                    arrayList6.add(new jui0(ctf0Var2.f(R.string.banner_ribbon, new Object[0]), uib0Var.e, uib0Var.g, !z18, false, aib0.c));
                }
                if (z18 && !z17) {
                    arrayList6.add(new jui0(String.format(ctf0Var2.f(R.string.popular_settings_one_x_games_slider_placeholder_v2, new Object[0]), Arrays.copyOf(new Object[]{uib0Var.k}, 1)), uib0Var.f, true, true, false, aib0.d));
                }
                return new vib0(arrayList6);
            case 6:
                p1c0 p1c0Var = (p1c0) obj;
                p1c0Var.getClass();
                ctf0Var2.getClass();
                a4x a4xVarO3 = dyb.o0(p1c0Var.b.values());
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                ue9 ue9Var = new ue9(ctf0Var2.b.a(R.string.save, Arrays.copyOf(new Object[0], 0)));
                if (a4xVarO3 == null || !a4xVarO3.isEmpty()) {
                    Iterator it3 = a4xVarO3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ProfileEditTjUiModel profileEditTjUiModel = (ProfileEditTjUiModel) it3.next();
                            if (profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) {
                                ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) profileEditTjUiModel;
                                if (!profileEditItemClickableTjUiModel.h || profileEditItemClickableTjUiModel.b.length() != 0) {
                                    if (profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel) {
                                        profileEditItemTjUiModel = (ProfileEditTjUiModel.ProfileEditItemTjUiModel) profileEditTjUiModel;
                                        if (!profileEditItemTjUiModel.h || profileEditItemTjUiModel.b.length() != 0 || profileEditItemTjUiModel.f46796a == EditProfileTjItemEnum.h) {
                                        }
                                    }
                                }
                            } else if (profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel) {
                                profileEditItemTjUiModel = (ProfileEditTjUiModel.ProfileEditItemTjUiModel) profileEditTjUiModel;
                                if (!profileEditItemTjUiModel.h) {
                                    continue;
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = false;
                }
                return new q1c0(new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, ue9Var, !z2, false, false), sh00.m))), a4xVarO3, p1c0Var.f26194a);
            case 7:
                iac0 iac0Var = (iac0) obj;
                iac0Var.getClass();
                return new op30(iac0Var, ctf0Var2);
            case 8:
                return a(obj);
            case 9:
                zqc0 zqc0Var = (zqc0) obj;
                zqc0Var.getClass();
                return new d2j(zqc0Var, ctf0Var2);
            case 10:
                rrc0 rrc0Var = (rrc0) obj;
                rrc0Var.getClass();
                if (rrc0Var.h) {
                    return new wsc0(rrc0Var.m);
                }
                if (rrc0Var.j) {
                    return new vsc0(rrc0Var.l);
                }
                if (rrc0Var.i) {
                    return new usc0(rrc0Var.k);
                }
                List list3 = rrc0Var.f30977a;
                int i6 = R.drawable.promo_shop_placeholder;
                Integer numValueOf = Integer.valueOf(R.drawable.promo_shop_placeholder);
                list3.getClass();
                ctf0Var2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    asc0 asc0Var = (asc0) it4.next();
                    asc0Var.getClass();
                    long j = asc0Var.f1385a;
                    lc00VarB.add(new ssc0(j, asc0Var.b));
                    List<vrc0> list4 = asc0Var.c;
                    ArrayList arrayList7 = new ArrayList(r3d.q(list4, i4));
                    for (vrc0 vrc0Var : list4) {
                        if (vrc0Var != null) {
                            if (vrc0Var instanceof trc0) {
                                trc0 trc0Var = (trc0) vrc0Var;
                                long j2 = trc0Var.f34417a;
                                o0x m0xVar = j2 == 0 ? new m0x(i6, bzwVar, 6) : new n0x(trc0Var.k);
                                String str5 = trc0Var.c;
                                int i7 = trc0Var.h;
                                buc0Var = new auc0(j2, str5, i7 > 0 ? new tda(new rpe(i7), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, numValueOf, m0xVar);
                            } else {
                                it4 = it4;
                                if (vrc0Var instanceof urc0) {
                                    urc0 urc0Var = (urc0) vrc0Var;
                                    long j3 = urc0Var.f36158a;
                                    hds hdsVar = urc0Var.l;
                                    String str6 = urc0Var.c;
                                    int i8 = urc0Var.h;
                                    buc0Var = new buc0(j3, str6, i8 > 0 ? new tda(new rpe(i8), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, numValueOf, hdsVar);
                                }
                            }
                            arrayList7.add(buc0Var);
                            it4 = it4;
                            i6 = R.drawable.promo_shop_placeholder;
                            bzwVar = null;
                            lc00VarB = lc00VarB;
                        }
                        t9f.b();
                        return null;
                    }
                    lc00 lc00Var = lc00VarB;
                    lc00Var.add(new ytc0(j, dyb.o0(arrayList7)));
                    lc00VarB = lc00Var;
                    it4 = it4;
                    i6 = R.drawable.promo_shop_placeholder;
                    i4 = 10;
                    bzwVar = null;
                }
                return new tsc0(dyb.o0(kotlin.collections.a.a(lc00VarB)), rrc0Var.b, rrc0Var.c, rrc0Var.d, rrc0Var.e, rrc0Var.m, rrc0Var.n, rrc0Var.o, rrc0Var.p);
            case 11:
                return b(obj);
            case 12:
                return c(obj);
            case 13:
                return g(obj);
            case 14:
                return h(obj);
            case 15:
                return i(obj);
            case 16:
                nfe0 nfe0Var = (nfe0) obj;
                nfe0Var.getClass();
                return new c69(ctf0Var2, nfe0Var);
            case 17:
                return l(obj);
            case 18:
                return m(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                return new ng1(ctf0Var2, aye0Var);
            case 20:
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                return new y11(ctf0Var2, u4f0Var);
            case 21:
                return o(obj);
            case 22:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                return new jo4(ctf0Var2, mbf0Var);
            case 23:
                return p(obj);
            case 24:
                return r(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return u(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return v(obj);
            default:
                twi0 twi0Var = (twi0) obj;
                twi0Var.getClass();
                boolean z21 = twi0Var.c;
                ctf0Var2.getClass();
                zsv zsvVar = new zsv(twi0Var.P, twi0Var.e, twi0Var.f, twi0Var.c, false);
                boolean z22 = twi0Var.f34651a;
                sff0 sff0Var2 = twi0Var.H;
                v8d v8dVar = twi0Var.I;
                k0j0 k0j0Var2 = twi0Var.J;
                boolean z23 = twi0Var.K;
                String str7 = twi0Var.L;
                int i9 = twi0Var.M;
                boolean z24 = twi0Var.O;
                if (twi0Var.b) {
                    a4xVarO2 = dyb.o0(q3d.j(new p8(), new aaj0(true, true, true), new aaj0(true, true, false), new aaj0(true, true, true), new aaj0(true, true, false), new aaj0(true, true, true)));
                    z22 = z22;
                    zsvVar = zsvVar;
                } else {
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    boolean z25 = twi0Var.z;
                    List list5 = twi0Var.j;
                    if (z25) {
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB2.add(new hzi0(lsm0Var.a(R.string.wrong_time_settings_subtitle, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.wrong_time_settings_title, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (z21) {
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        lc00VarB2.add(new mwi0(lsm0Var2.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.refill_account, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0)), !twi0Var.q, !twi0Var.r, twi0Var.g, twi0Var.h, twi0Var.i));
                    }
                    x6j0 x6j0Var = sff0Var2.e;
                    if (x6j0Var.e) {
                        g9 g9Var = g9.f10888a;
                        boolean zContains2 = list5.contains(g9Var);
                        str2 = str7;
                        k0j0Var = k0j0Var2;
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        str = "";
                        lc00VarB2.add(new nwi0(R.drawable.ic_glyph_shield, lsm0Var3.a(R.string.security, Arrays.copyOf(new Object[0], 0)), zContains2, g9Var));
                        if (zContains2) {
                            boolean z26 = sff0Var2.r0;
                            boolean z27 = twi0Var.p;
                            boolean z28 = twi0Var.T;
                            boolean z29 = twi0Var.m;
                            mrh0 mrh0Var = twi0Var.n;
                            if (z26 && z21 && !z23) {
                                boolean z30 = !z27;
                                lc00VarB2.add(new sgj0(lsm0Var3.a(R.string.verification, Arrays.copyOf(new Object[0], 0)), z27 ? lsm0Var3.a(R.string.verification_completed, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.verification_not_completed, Arrays.copyOf(new Object[0], 0)), z27 != 0 ? i8m0.CHECK : i8m0.WARNING_RED, z30, z30, false, false));
                            }
                            lc00VarB2.add(new p7j0(lsm0Var3.a(R.string.pin_code_and_biometric_title, Arrays.copyOf(new Object[0], 0)), false, z23));
                            if (z28 && !z23) {
                                lc00VarB2.add(new rgj0(lsm0Var3.a(R.string.authenticator, Arrays.copyOf(new Object[0], 0)), z29 ? lsm0Var3.a(R.string.authenticator_enabled, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.authenticator_not_enabled, Arrays.copyOf(new Object[0], 0)), z29 ? i8m0.CHECK : i8m0.CROSS, true, true));
                            }
                            if (!z23) {
                                if (mrh0Var != mrh0.b) {
                                    i3 = 0;
                                    strA = lsm0Var3.a(d9x.M(mrh0Var), Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i3 = 0;
                                    strA = str;
                                }
                                lc00VarB2.add(new vgj0(lsm0Var3.a(R.string.security_settings, Arrays.copyOf(new Object[i3], i3)), strA, d9x.Y(mrh0Var), z21));
                                String strA4 = lsm0Var3.a(R.string.settings_auth_history, Arrays.copyOf(new Object[i3], i3));
                                i8m0 i8m0Var = i8m0.CHECK;
                                lc00VarB2.add(new qgj0(strA4, z21, true));
                            }
                        }
                    } else {
                        str = "";
                        k0j0Var = k0j0Var2;
                        str2 = str7;
                    }
                    if (!z23) {
                        g9 g9Var2 = g9.b;
                        boolean zContains3 = list5.contains(g9Var2);
                        lsm0 lsm0Var4 = ctf0Var2.b;
                        lc00VarB2.add(new nwi0(R.drawable.ic_glyph_financial_security, lsm0Var4.a(R.string.bets_settings, Arrays.copyOf(new Object[0], 0)), zContains3, g9Var2));
                        if (zContains3) {
                            baj0 baj0Var = twi0Var.o;
                            lc00VarB2.add(new q7j0(lsm0Var4.a(R.string.make_bet_settings_title, Arrays.copyOf(new Object[0], 0)), z21, false));
                            if (baj0Var != null) {
                                double d = baj0Var.f2260a;
                                boolean z31 = d > 0.0d && baj0Var.c;
                                pn40 pn40Var = pn40.f27267a;
                                String strC = pn40.c(d, p3u0.c);
                                if (z31) {
                                    strL = kng0.l(strC, Separators.SP, baj0Var.b);
                                } else {
                                    strL = str;
                                }
                            } else {
                                strL = str;
                            }
                            String strA5 = lsm0Var4.a(R.string.one_click_bet_title, Arrays.copyOf(new Object[0], 0));
                            i8m0 i8m0Var2 = i8m0.CHECK;
                            lc00VarB2.add(new tgj0(strA5, strL, z21));
                        }
                    }
                    g9 g9Var3 = g9.c;
                    boolean zContains4 = list5.contains(g9Var3);
                    lsm0 lsm0Var5 = ctf0Var2.b;
                    lc00VarB2.add(new nwi0(R.drawable.ic_glyph_settings_inactive, lsm0Var5.a(R.string.app_settings_title, Arrays.copyOf(new Object[0], 0)), zContains4, g9Var3));
                    if (zContains4) {
                        lc00VarB2.add(new vhj0(lsm0Var5.a(R.string.coefficient_type, Arrays.copyOf(new Object[0], 0)), lsm0Var5.a(i9, Arrays.copyOf(new Object[0], 0)), false));
                        if (!z23) {
                            lc00VarB2.add(new s7j0(lsm0Var5.a(R.string.push_notifications, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (!z23) {
                            lc00VarB2.add(new l7j0(lsm0Var5.a(R.string.mailing_management_title, Arrays.copyOf(new Object[0], 0)), z21));
                        }
                        if (v8dVar.d.size() > 1) {
                            lc00VarB2.add(new n7j0(lsm0Var5.a(R.string.theme_choose_title, Arrays.copyOf(new Object[0], 0))));
                        }
                        lc00VarB2.add(new m7j0(lsm0Var5.a(R.string.markets_display, Arrays.copyOf(new Object[0], 0))));
                        if (sff0Var2.L.f) {
                            lc00VarB2.add(new r7j0(lsm0Var5.a(R.string.popular_settings_title_name, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (x6j0Var.f && !z23) {
                            lc00VarB2.add(new u7j0(lsm0Var5.a(R.string.shake_settings_title, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (v8dVar.w) {
                            lc00VarB2.add(new a8j0(lsm0Var5.a(R.string.widget, Arrays.copyOf(new Object[0], 0))));
                        }
                        lc00VarB2.add(new k7j0(lsm0Var5.a(R.string.language_settings, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (z23) {
                        z3 = z21;
                    } else {
                        j6d0 j6d0Var = twi0Var.k;
                        boolean z32 = twi0Var.t;
                        boolean z33 = twi0Var.u;
                        boolean z34 = twi0Var.v;
                        boolean z35 = sff0Var2.n;
                        co4 co4Var = sff0Var2.N;
                        boolean z36 = co4Var.g;
                        boolean z37 = co4Var.i;
                        f3c0 f3c0Var = sff0Var2.k;
                        z3 = z21;
                        boolean z38 = f3c0Var.h && !f3c0Var.r && z3;
                        boolean z39 = !z3 || (z3 && z34);
                        boolean z40 = sff0Var2.O.length() > 0;
                        if (z35 || z36 || z37 || z38) {
                            boolean z41 = z38;
                            g9 g9Var4 = g9.d;
                            boolean z42 = z39;
                            boolean zContains5 = list5.contains(g9Var4);
                            z4 = z23;
                            lc00VarB2.add(new nwi0(R.drawable.ic_glyph_other, lsm0Var5.a(R.string.additionally, Arrays.copyOf(new Object[0], 0)), zContains5, g9Var4));
                            if (zContains5) {
                                if (z35) {
                                    lc00VarB2.add(new g7j0(lsm0Var5.a(z40 ? R.string.official_site : R.string.working_mirror, Arrays.copyOf(new Object[0], 0)), false, (z24 || z42 || z41 || z37 || z36) ? false : true));
                                }
                                if (z37) {
                                    if (j6d0Var != null) {
                                        String str8 = j6d0Var.c;
                                        if (!j6d0Var.f15979a || StringsKt.W(str8)) {
                                            pair = new Pair(str, i8m0.CROSS);
                                        } else {
                                            int i10 = j6d0Var.d;
                                            pair = new Pair(str8.concat(i10 > 0 ? twn.m(i10, Separators.COLON) : str), i8m0.CHECK);
                                        }
                                    } else {
                                        pair = new Pair(str, i8m0.CROSS);
                                    }
                                    lc00VarB2.add(new ugj0(lsm0Var5.a(R.string.proxy_settings_title, Arrays.copyOf(new Object[0], 0)), (String) pair.f46059a, (i8m0) pair.b, false, (z24 || z42 || z41 || z36) ? false : true));
                                }
                                if (z41) {
                                    i = 0;
                                    lc00VarB2.add(new x7j0(lsm0Var5.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), false, (z24 || z42 || z36) ? false : true));
                                } else {
                                    i = 0;
                                }
                                if (z3 && z36) {
                                    lc00VarB2.add(new udj0(lsm0Var5.a(R.string.qr_authorization_title, Arrays.copyOf(new Object[i], (int) i)), z32, i, (z24 || z42) ? i : 1));
                                }
                                if (z42 && z36) {
                                    lc00VarB2.add(new t7j0(lsm0Var5.a(R.string.qr_unauthorized, Arrays.copyOf(new Object[i], (int) i)), i, !z24));
                                }
                                if (z24) {
                                    lc00VarB2.add(new tdj0(lsm0Var5.a(R.string.show_currency_conversion_popup, Arrays.copyOf(new Object[i], (int) i)), z33, i));
                                }
                            }
                            g9 g9Var5 = g9.e;
                            zContains = list5.contains(g9Var5);
                            lc00VarB2.add(new nwi0(R.drawable.ic_glyph_info_circle, lsm0Var5.a(R.string.about_app_title, Arrays.copyOf(new Object[i], (int) i)), zContains, g9Var5));
                            if (zContains) {
                                z5 = twi0Var.w;
                                boolean z43 = twi0Var.l;
                                String str9 = twi0Var.x;
                                boolean z44 = twi0Var.y;
                                z6 = twi0Var.A;
                                z7 = x6j0Var.f40367a;
                                z8 = x6j0Var.b;
                                if (sff0Var2.z || k0j0Var.d.isEmpty()) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (z4) {
                                    i2 = 0;
                                } else {
                                    if (z7) {
                                        i2 = 0;
                                        lc00VarB2.add(new w7j0(lsm0Var5.a(R.string.share_app_title, Arrays.copyOf(new Object[0], 0)), z5, z5, false));
                                    } else {
                                        i2 = 0;
                                    }
                                    if (z8) {
                                        lc00VarB2.add(new v7j0(lsm0Var5.a(R.string.share_app_by_qr_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                                    }
                                    if (z9) {
                                        lc00VarB2.add(new o7j0(lsm0Var5.a(R.string.onoboarding_section_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                                    }
                                }
                                lc00VarB2.add(new nzi0(lsm0Var5.a(R.string.app_version_title, Arrays.copyOf(new Object[i2], (int) i2)), str2, z43));
                                String strA6 = lsm0Var5.a(R.string.clear_cache_title, Arrays.copyOf(new Object[i2], (int) i2));
                                if (!z3 || z6) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                lc00VarB2.add(new h7j0(strA6, str9, z44, z10));
                                if (z3) {
                                    lc00VarB2.add(new mv00(!z6));
                                }
                                if (z6) {
                                    lc00VarB2.add(new g4k());
                                }
                            }
                            a4xVarO2 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                        }
                        i = 0;
                        g9 g9Var6 = g9.e;
                        zContains = list5.contains(g9Var6);
                        lc00VarB2.add(new nwi0(R.drawable.ic_glyph_info_circle, lsm0Var5.a(R.string.about_app_title, Arrays.copyOf(new Object[i], (int) i)), zContains, g9Var6));
                        if (zContains) {
                            z5 = twi0Var.w;
                            boolean z45 = twi0Var.l;
                            String str10 = twi0Var.x;
                            boolean z46 = twi0Var.y;
                            z6 = twi0Var.A;
                            z7 = x6j0Var.f40367a;
                            z8 = x6j0Var.b;
                            if (sff0Var2.z) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z4) {
                                if (z7) {
                                    i2 = 0;
                                    lc00VarB2.add(new w7j0(lsm0Var5.a(R.string.share_app_title, Arrays.copyOf(new Object[0], 0)), z5, z5, false));
                                } else {
                                    i2 = 0;
                                }
                                if (z8) {
                                    lc00VarB2.add(new v7j0(lsm0Var5.a(R.string.share_app_by_qr_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                                }
                                if (z9) {
                                    lc00VarB2.add(new o7j0(lsm0Var5.a(R.string.onoboarding_section_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                                }
                            } else {
                                i2 = 0;
                            }
                            lc00VarB2.add(new nzi0(lsm0Var5.a(R.string.app_version_title, Arrays.copyOf(new Object[i2], (int) i2)), str2, z45));
                            String strA7 = lsm0Var5.a(R.string.clear_cache_title, Arrays.copyOf(new Object[i2], (int) i2));
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            lc00VarB2.add(new h7j0(strA7, str10, z46, z10));
                            if (z3) {
                                lc00VarB2.add(new mv00(!z6));
                            }
                            if (z6) {
                                lc00VarB2.add(new g4k());
                            }
                        }
                        a4xVarO2 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                    }
                    z4 = z23;
                    i = 0;
                    g9 g9Var7 = g9.e;
                    zContains = list5.contains(g9Var7);
                    lc00VarB2.add(new nwi0(R.drawable.ic_glyph_info_circle, lsm0Var5.a(R.string.about_app_title, Arrays.copyOf(new Object[i], (int) i)), zContains, g9Var7));
                    if (zContains) {
                        z5 = twi0Var.w;
                        boolean z47 = twi0Var.l;
                        String str11 = twi0Var.x;
                        boolean z48 = twi0Var.y;
                        z6 = twi0Var.A;
                        z7 = x6j0Var.f40367a;
                        z8 = x6j0Var.b;
                        if (sff0Var2.z) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z4) {
                            if (z7) {
                                i2 = 0;
                                lc00VarB2.add(new w7j0(lsm0Var5.a(R.string.share_app_title, Arrays.copyOf(new Object[0], 0)), z5, z5, false));
                            } else {
                                i2 = 0;
                            }
                            if (z8) {
                                lc00VarB2.add(new v7j0(lsm0Var5.a(R.string.share_app_by_qr_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                            }
                            if (z9) {
                                lc00VarB2.add(new o7j0(lsm0Var5.a(R.string.onoboarding_section_title, Arrays.copyOf(new Object[i2], (int) i2)), i2));
                            }
                        } else {
                            i2 = 0;
                        }
                        lc00VarB2.add(new nzi0(lsm0Var5.a(R.string.app_version_title, Arrays.copyOf(new Object[i2], (int) i2)), str2, z47));
                        String strA8 = lsm0Var5.a(R.string.clear_cache_title, Arrays.copyOf(new Object[i2], (int) i2));
                        if (z3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        lc00VarB2.add(new h7j0(strA8, str11, z48, z10));
                        if (z3) {
                            lc00VarB2.add(new mv00(!z6));
                        }
                        if (z6) {
                            lc00VarB2.add(new g4k());
                        }
                    }
                    a4xVarO2 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                }
                return new rfj0(z22, zsvVar, twi0Var.B, a4xVarO2);
        }
    }
}
