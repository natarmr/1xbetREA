package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35406a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ uc(ctf0 ctf0Var, byte b) {
        this.f35406a = b;
        this.b = ctf0Var;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r42v0 ??
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
    private final java.lang.Object b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r49v0 ??
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

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        String strG0;
        String strA2;
        int i;
        int i2;
        qc50 oc50Var;
        ee eeVar;
        wa50 va50Var;
        gmm dmmVar;
        mdm mdmVar;
        byte b = this.f35406a;
        int i3 = R.string.registration;
        int i4 = R.string.button_login;
        String str = "";
        bzw bzwVar = null;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                sc scVar = (sc) obj;
                scVar.getClass();
                ctf0Var.getClass();
                long j = scVar.c;
                bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                rz4.s(j, ".svg", bzuVarE);
                String string = ((StringBuilder) bzuVarE.b).toString();
                String str2 = scVar.b;
                String strH = axq.h(scVar.f31962a, "(id: ", Separators.RPAREN);
                pn40 pn40Var = pn40.f27267a;
                fd fdVar = new fd(string, str2, strH, pn40.d(scVar.e, scVar.d, p3u0.c));
                lc00 lc00VarB = kotlin.collections.a.b();
                hc hcVar = hc.f12794a;
                lsm0 lsm0Var = ctf0Var.b;
                lc00VarB.add(new gc(hcVar, R.drawable.ic_glyph_circle_check, lsm0Var.a(R.string.action_make_active, Arrays.copyOf(new Object[0], 0))));
                if (scVar.f) {
                    lc00VarB.add(new gc(hc.b, R.drawable.ic_glyph_trash, lsm0Var.a(R.string.delete_wallet, Arrays.copyOf(new Object[0], 0))));
                }
                return new tc(fdVar, dyb.o0(kotlin.collections.a.a(lc00VarB)));
            case 1:
                kt ktVar = (kt) obj;
                ktVar.getClass();
                ctf0Var.getClass();
                boolean z = ktVar.c;
                String str3 = ktVar.b;
                String str4 = ktVar.d;
                String str5 = z ? str3 : ktVar.f18838a;
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                lsm0 lsm0Var2 = ctf0Var.b;
                imm immVar = new imm(ilmVar, new plm(lsm0Var2.a(R.string.pin_code_activation_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60()));
                if (str4.length() > 0) {
                    strA = str4;
                } else {
                    strA = (z && str3.length() == 0) ? lsm0Var2.a(R.string.add_pin_code_again, Arrays.copyOf(new Object[0], 0)) : !z ? lsm0Var2.a(R.string.add_pin_code_message, Arrays.copyOf(new Object[0], 0)) : lsm0Var2.a(R.string.add_pin_code_again, Arrays.copyOf(new Object[0], 0));
                }
                long warning = str4.length() > 0 ? s6t0.b().f33626a.getWarning() : s6t0.b().f33626a.getSecondary();
                boolean z2 = ktVar.e;
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.addAll(q3d.j(new xt90("1", lsm0Var2.a(R.string.one_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("2", lsm0Var2.a(R.string.two_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("3", lsm0Var2.a(R.string.three_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("4", lsm0Var2.a(R.string.four_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("5", lsm0Var2.a(R.string.five_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("6", lsm0Var2.a(R.string.six_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("7", lsm0Var2.a(R.string.seven_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("8", lsm0Var2.a(R.string.eight_button_text, Arrays.copyOf(new Object[0], 0))), new xt90("9", lsm0Var2.a(R.string.nine_button_text, Arrays.copyOf(new Object[0], 0)))));
                if (cy7.c()) {
                    lc00VarB2.addAll(q3d.j(new yt90(3), new xt90("0", lsm0Var2.a(R.string.zero_button_text, Arrays.copyOf(new Object[0], 0)))));
                } else {
                    lc00VarB2.addAll(q3d.j(zt90.f44946a, new xt90("0", lsm0Var2.a(R.string.zero_button_text, Arrays.copyOf(new Object[0], 0))), new yt90(7)));
                }
                a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                if (str5.length() > 0) {
                    char cJ = ttm0.J(str5);
                    int length = str5.length() - 1;
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < length; i5++) {
                        sb.append("•");
                    }
                    strG0 = StringsKt.g0(cJ, str5, sb.toString());
                } else {
                    strG0 = str5;
                }
                return new lt(immVar, new du90(strA, warning, z2, a4xVarO0, str5, strG0));
            case 2:
                lw lwVar = (lw) obj;
                lwVar.getClass();
                return new rw(lwVar, ctf0Var);
            case 3:
                ln0 ln0Var = (ln0) obj;
                ln0Var.getClass();
                return new zn0(ctf0Var, ln0Var);
            case 4:
                ur0 ur0Var = (ur0) obj;
                ur0Var.getClass();
                return new wr0(ur0Var, ctf0Var);
            case 5:
                wu0 wu0Var = (wu0) obj;
                wu0Var.getClass();
                ctf0Var.getClass();
                List list = wu0Var.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    av0 av0Var = (av0) obj2;
                    Boolean bool = Boolean.TRUE;
                    if (av0Var == av0.f1504a) {
                        bool = null;
                    }
                    if (bool != null ? bool.booleanValue() : wu0Var.b) {
                        arrayList.add(obj2);
                    }
                }
                String str6 = wu0Var.f39768a;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                int i6 = 0;
                for (Object obj3 : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    av0 av0Var2 = (av0) obj3;
                    int iOrdinal = av0Var2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            strA2 = ctf0Var.b.a(R.string.aggregator_play_demo, Arrays.copyOf(new Object[0], 0));
                        } else {
                            t9f.b();
                        }
                        return bzwVar;
                    }
                    strA2 = ctf0Var.b.a(R.string.aggregator_play, Arrays.copyOf(new Object[0], 0));
                    String str7 = strA2;
                    int iOrdinal2 = av0Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        i = R.drawable.ic_glyph_play;
                    } else {
                        if (iOrdinal2 != 1) {
                            t9f.b();
                            return bzwVar;
                        }
                        i = R.drawable.ic_glyph_demo_play;
                    }
                    m0x m0xVar = new m0x(i, bzwVar, 6);
                    int iOrdinal3 = av0Var2.ordinal();
                    if (iOrdinal3 == 0) {
                        i2 = R.drawable.ic_glyph_play;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return null;
                        }
                        i2 = R.drawable.ic_glyph_demo_play;
                    }
                    arrayList2.add(new pu0(str7, av0Var2, m0xVar, i2, arrayList.size() == 1 ? wui0.f39793a : arrayList.size() > i7 ? wui0.c : wui0.d));
                    i6 = i7;
                    bzwVar = null;
                }
                return new xu0(dyb.r0(arrayList2), str6);
            case 6:
                mv0 mv0Var = (mv0) obj;
                mv0Var.getClass();
                return new ov0(mv0Var, ctf0Var);
            case 7:
                jw0 jw0Var = (jw0) obj;
                jw0Var.getClass();
                ctf0Var.getClass();
                return new nw0(jw0Var.f17228a, jw0Var.k ? ctf0Var.b.a(R.string.federal_tax_legislation_info, Arrays.copyOf(new Object[0], 0)) : null, jw0Var.b, jw0Var.c, jw0Var.d, jw0Var.g, jw0Var.i, jw0Var.l);
            case 8:
                q11 q11Var = (q11) obj;
                q11Var.getClass();
                return new y11(q11Var, ctf0Var);
            case 9:
                u81 u81Var = (u81) obj;
                u81Var.getClass();
                ctf0Var.getClass();
                boolean z3 = u81Var.d;
                ql5 ql5Var = u81Var.m;
                boolean z4 = u81Var.l;
                if (z3 && z4) {
                    oc50Var = pc50.f26742a;
                } else if (z4) {
                    int iOrdinal4 = u81Var.n.g.i.ordinal();
                    if (iOrdinal4 == 0) {
                        eeVar = yd.f42407a;
                    } else if (iOrdinal4 == 1) {
                        eeVar = be.f2424a;
                    } else if (iOrdinal4 == 2) {
                        eeVar = de.f5922a;
                    } else if (iOrdinal4 == 3) {
                        eeVar = zd.f44189a;
                    } else if (iOrdinal4 == 4) {
                        eeVar = ae.f704a;
                    } else {
                        if (iOrdinal4 != 5) {
                            t9f.b();
                            return null;
                        }
                        eeVar = ce.f4189a;
                    }
                    pn40 pn40Var2 = pn40.f27267a;
                    String strC = pn40.c(ql5Var != null ? ql5Var.b : 0.0d, p3u0.c);
                    String str8 = ql5Var != null ? ql5Var.f : null;
                    if (str8 == null) {
                        str8 = "";
                    }
                    oc50Var = new nc50(eeVar, new sd(strC, str8, ctf0Var.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))));
                } else {
                    lsm0 lsm0Var3 = ctf0Var.b;
                    oc50Var = new oc50(lsm0Var3.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                }
                pz40 pz40Var2 = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                ilm ilmVar2 = new ilm(staticColors.m123getWhite0d7_KjU());
                boolean z5 = u81Var.f35213a.n;
                boolean z6 = u81Var.f;
                if (z4) {
                    ra50 ra50Var = ra50.f30118a;
                    if (z5) {
                        oz30[] oz30VarArr = oz30.f26086a;
                        va50Var = new ua50(new wkm(0, z3 ? R.drawable.ic_glyph_demo_pause : R.drawable.ic_glyph_demo_play, true, ra50Var, z3 ? staticColors.m113getRed0d7_KjU() : staticColors.m123getWhite0d7_KjU()), new wkm(1, z6 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, true, ra50Var, staticColors.m123getWhite0d7_KjU()), new wkm(2, R.drawable.ic_glyph_expand, true, ra50Var, staticColors.m123getWhite0d7_KjU()));
                    } else {
                        oz30[] oz30VarArr2 = oz30.f26086a;
                        va50Var = new va50(new wkm(1, z6 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, true, ra50Var, staticColors.m123getWhite0d7_KjU()), new wkm(2, R.drawable.ic_glyph_expand, true, ra50Var, staticColors.m123getWhite0d7_KjU()));
                    }
                    dmmVar = new dmm(va50Var);
                } else {
                    dmmVar = fmm.f9790a;
                }
                return new v81(new bd50(oc50Var, new imm(ilmVar2, mlm.f21997a, dmmVar, staticColors.m62getBlack0d7_KjU(), false, null)), u81Var.s ? ctf0Var.b.a(R.string.federal_tax_legislation_info, Arrays.copyOf(new Object[0], 0)) : null, u81Var.e, u81Var.d, u81Var.k, u81Var.g, u81Var.h, u81Var.j, u81Var.t);
            case 10:
                ga1 ga1Var = (ga1) obj;
                ga1Var.getClass();
                ctf0Var.getClass();
                lsm0 lsm0Var4 = ctf0Var.b;
                String strA3 = lsm0Var4.a(R.string.play_for_real_title, Arrays.copyOf(new Object[0], 0));
                boolean z7 = ga1Var.f10944a;
                String strA4 = lsm0Var4.a(z7 ? R.string.play_for_real_description_auth : R.string.play_for_real_description_unauth, Arrays.copyOf(new Object[0], 0));
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                if (z7) {
                    i4 = R.string.aggregator_play;
                }
                wul wulVar = new wul(lulVar, oe9Var, new ue9(lsm0Var4.a(i4, Arrays.copyOf(new Object[0], 0))), true, false, true);
                iul iulVar = iul.e;
                if (z7) {
                    i3 = R.string.play_for_real_deposit_button_text;
                }
                return new ha1(strA3, strA4, wulVar, new wul(iulVar, oe9Var, new ue9(lsm0Var4.a(i3, Arrays.copyOf(new Object[0], 0))), true, false, true));
            case 11:
                pf1 pf1Var = (pf1) obj;
                pf1Var.getClass();
                return new ng1(pf1Var, ctf0Var);
            case 12:
                bj1 bj1Var = (bj1) obj;
                bj1Var.getClass();
                return new ej1(ctf0Var, bj1Var);
            case 13:
                j8d0 j8d0Var = (j8d0) obj;
                j8d0Var.getClass();
                return new l8d0(j8d0Var, ctf0Var);
            case 14:
                ok1 ok1Var = (ok1) obj;
                ok1Var.getClass();
                return new qk1(ok1Var, ctf0Var);
            case 15:
                bo1 bo1Var = (bo1) obj;
                bo1Var.getClass();
                return new io1(ctf0Var, bo1Var);
            case 16:
                n32 n32Var = (n32) obj;
                n32Var.getClass();
                ctf0 ctf0Var2 = this.b;
                ctf0Var2.getClass();
                f32 f32Var = n32Var.f;
                b32 b32Var = n32Var.d;
                c32 c32Var = n32Var.c;
                d32 d32Var = n32Var.b;
                hep0 hep0Var = n32Var.f22828a;
                e32 e32Var = f32Var.f8840a;
                if (e32Var == e32.b || (e32Var == e32.c && ((hep0Var instanceof eep0) || ((hep0Var instanceof gep0) && !((gep0) hep0Var).f11168a)))) {
                    int i8 = f32Var.b;
                    int iOrdinal5 = e32Var.ordinal();
                    if (iOrdinal5 == 0) {
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.r1;
                        xuzVar.getClass();
                        mdmVar = new mdm(xuz.a(pb10Var, i8), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022);
                    } else if (iOrdinal5 == 1) {
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        mdmVar = new mdm(xuz.a(pb10Var2, i8), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                    } else {
                        if (iOrdinal5 != 2) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.g;
                        xuzVar3.getClass();
                        mdmVar = new mdm(xuz.a(pb10Var3, i8), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                    }
                    return new p32(mdmVar);
                }
                if (!hep0Var.equals(fep0.f9417a)) {
                    m32 m32Var = d32Var.f5381a;
                    List list2 = d32Var.c;
                    m32 m32Var2 = m32.f21092a;
                    if (m32Var != m32Var2) {
                        m32 m32Var3 = c32Var.f3651a;
                        List list3 = c32Var.c;
                        if (m32Var3 != m32Var2) {
                            m32 m32Var4 = b32Var.f1881a;
                            List<d2w> list4 = b32Var.b;
                            if (m32Var4 != m32Var2) {
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if ((hep0Var instanceof gep0) && ((gep0) hep0Var).f11168a) {
                                    lc00VarB3.add(tv80.f34587a);
                                }
                                m32 m32Var5 = d32Var.f5381a;
                                m32 m32Var6 = m32.c;
                                if ((m32Var5 == m32Var6 && c32Var.f3651a == m32Var6 && b32Var.f1881a == m32Var6) || n32Var.b()) {
                                    lc00VarB3.add(g32.f10590a);
                                } else {
                                    if (!list2.isEmpty()) {
                                        lc00VarB3.add(jiq0.k0(z22.f43650a, ctf0Var2));
                                        lc00VarB3.addAll(list2);
                                    }
                                    if (!list3.isEmpty()) {
                                        lc00VarB3.add(jiq0.k0(z22.b, ctf0Var2));
                                        lc00VarB3.addAll(list3);
                                    }
                                    if (!list4.isEmpty()) {
                                        lc00VarB3.add(jiq0.k0(z22.c, ctf0Var2));
                                        i32 i32Var = n32Var.g;
                                        int i9 = i32Var.f14076a;
                                        Set set = b32Var.d;
                                        boolean z8 = i32Var.b;
                                        boolean z9 = i32Var.c;
                                        v5l0 v5l0Var = i32Var.e;
                                        wcb wcbVar = n32Var.e;
                                        String str9 = i32Var.h;
                                        boolean z10 = n32Var.h;
                                        set.getClass();
                                        v5l0Var.getClass();
                                        str9.getClass();
                                        ArrayList arrayList3 = new ArrayList();
                                        for (d2w d2wVar : list4) {
                                            boolean zContains = set.contains(Long.valueOf(d2wVar.b()));
                                            String strA5 = wcbVar != null ? wcbVar.a(d2wVar.d(), d2wVar.g()) : null;
                                            ctf0 ctf0Var3 = ctf0Var2;
                                            boolean z11 = z10;
                                            String str10 = str9;
                                            int i10 = i9;
                                            boolean z12 = z8;
                                            boolean z13 = z9;
                                            v5l0 v5l0Var2 = v5l0Var;
                                            lla llaVarG0 = s0x.g0(d2wVar, i10, ctf0Var3, zContains, z12, z13, v5l0Var2, strA5 == null ? str : strA5, str10, z11);
                                            z10 = z11;
                                            if (llaVarG0 != null) {
                                                arrayList3.add(llaVarG0);
                                            }
                                            set = set;
                                            i9 = i10;
                                            ctf0Var2 = ctf0Var3;
                                            z8 = z12;
                                            z9 = z13;
                                            v5l0Var = v5l0Var2;
                                            str9 = str10;
                                            str = str;
                                        }
                                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                        int i11 = 0;
                                        for (Object obj4 : arrayList3) {
                                            int i12 = i11 + 1;
                                            if (i11 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            nla nlaVar = (nla) obj4;
                                            vvs vvsVar = vvs.f38117a;
                                            arrayList4.add(new vll0(w6x.q(sre0.f32672a.b(vll0.class).J(), BundleUtil.UNDERLINE_TAG, nlaVar.getKey()), nlaVar, unh0.i0(i11, arrayList3), z10));
                                            i11 = i12;
                                        }
                                        lc00VarB3.addAll(arrayList4);
                                    }
                                }
                                return new o32(dyb.r0(kotlin.collections.a.a(lc00VarB3)));
                            }
                        }
                    }
                }
                return q32.f28028a;
            case 17:
                ((g72) obj).getClass();
                return new m72(ctf0Var, (byte) 0);
            case 18:
                d92 d92Var = (d92) obj;
                d92Var.getClass();
                return new p92(d92Var, ctf0Var);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return a(obj);
            case 20:
                return b(obj);
            case 21:
                ((jf2) obj).getClass();
                return new m72(ctf0Var, (byte) 1);
            case 22:
                ((ug2) obj).getClass();
                return new m72(ctf0Var, (byte) 2);
            case 23:
                ((ei2) obj).getClass();
                return new m72(ctf0Var, (byte) 3);
            case 24:
                ((pj2) obj).getClass();
                return new m72(ctf0Var, (byte) 4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((nl2) obj).getClass();
                return new m72(ctf0Var, (byte) 5);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((zl2) obj).getClass();
                return new m72(ctf0Var, (byte) 6);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mb4 mb4Var = (mb4) obj;
                mb4Var.getClass();
                return new qb4(mb4Var, ctf0Var);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zf4 zf4Var = (zf4) obj;
                zf4Var.getClass();
                return new pg4(zf4Var, ctf0Var);
            default:
                tj4 tj4Var = (tj4) obj;
                tj4Var.getClass();
                return new jo4(tj4Var, ctf0Var);
        }
    }
}
