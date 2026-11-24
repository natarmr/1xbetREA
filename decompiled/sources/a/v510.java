package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v510 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36807a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ v510(ctf0 ctf0Var, art artVar) {
        this.f36807a = (byte) 6;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        gr50 gr50Var = (gr50) obj;
        gr50Var.getClass();
        String strA = this.b.b.a(R.string.banner_tag_new, Arrays.copyOf(new Object[0], 0));
        boolean z = gr50Var.f11764a;
        int i = gr50Var.b;
        List list = gr50Var.d;
        List list2 = gr50Var.c;
        if (z) {
            return jr50.f16986a;
        }
        mdm mdmVar = gr50Var.f;
        if (mdmVar != null) {
            return new ir50(mdmVar);
        }
        if (!list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((zvc) obj2).f45047a == mvc.CMS_CODE_NEWS) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = ((zvc) it.next()).c;
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(z1x.R((ivc) it2.next(), strA));
                }
                arrayList2.add(arrayList4);
            }
            ArrayList arrayListR = r3d.r(arrayList2);
            kj5 kj5Var = uo5.b;
            mvc mvcVar = mvc.CMS_CODE_NEWS;
            kj5Var.getClass();
            int i2 = kj5.e(mvcVar).f35994a;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (((zvc) obj3).f45047a != mvc.CMS_CODE_NEWS) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
            int i3 = 0;
            for (Object obj4 : arrayList5) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                zvc zvcVar = (zvc) obj4;
                mvc mvcVar2 = zvcVar.f45047a;
                String str = zvcVar.b;
                ArrayList arrayList7 = zvcVar.c;
                uo5.b.getClass();
                int i5 = kj5.e(mvcVar2).f35994a;
                mxl mxlVar = new mxl(str, null, i3 == i, 1044478);
                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(z1x.R((ivc) it3.next(), strA));
                }
                arrayList6.add(new wo5(i5, mxlVar, arrayList8));
                i3 = i4;
            }
            return new hr50(i2, arrayListR, arrayList6);
        }
        if (list.isEmpty()) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.g;
            int i6 = gr50Var.e;
            xuzVar.getClass();
            return new ir50(new mdm(xuz.a(pb10Var, i6), null, null, 0, 0, R.string.error_get_data, 0, 0, 0L, 0L, 734));
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : list) {
            int i7 = ((ft5) obj5).f10094a.f41399a;
            us5[] us5VarArr = us5.f36194a;
            if (i7 == 11) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
        Iterator it4 = arrayList9.iterator();
        while (it4.hasNext()) {
            ArrayList arrayList11 = ((ft5) it4.next()).b;
            ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
            Iterator it5 = arrayList11.iterator();
            while (it5.hasNext()) {
                arrayList12.add(z1x.Q((q2b) it5.next(), strA));
            }
            arrayList10.add(arrayList12);
        }
        ArrayList arrayListR2 = r3d.r(arrayList10);
        us5[] us5VarArr2 = us5.f36194a;
        ArrayList arrayList13 = new ArrayList();
        for (Object obj6 : list) {
            int i8 = ((ft5) obj6).f10094a.f41399a;
            us5[] us5VarArr3 = us5.f36194a;
            if (i8 != 11) {
                arrayList13.add(obj6);
            }
        }
        ArrayList arrayList14 = new ArrayList(r3d.q(arrayList13, 10));
        int i9 = 0;
        for (Object obj7 : arrayList13) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                q3d.p();
                throw null;
            }
            ft5 ft5Var = (ft5) obj7;
            xs5 xs5Var = ft5Var.f10094a;
            ArrayList arrayList15 = ft5Var.b;
            int i11 = xs5Var.f41399a;
            mxl mxlVar2 = new mxl(xs5Var.b, null, i9 == i, 1044478);
            ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
            Iterator it6 = arrayList15.iterator();
            while (it6.hasNext()) {
                arrayList16.add(z1x.Q((q2b) it6.next(), strA));
            }
            arrayList14.add(new wo5(i11, mxlVar2, arrayList16));
            i9 = i10;
        }
        return new hr50(11, arrayListR2, arrayList14);
    }

    private final Object b(Object obj) {
        ws50 ws50Var = (ws50) obj;
        ws50Var.getClass();
        ctf0 ctf0Var = this.b;
        String strA = ctf0Var.b.a(R.string.banner_tag_new, Arrays.copyOf(new Object[0], 0));
        String strA2 = ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
        boolean z = ws50Var.f39676a;
        List list = ws50Var.e;
        List list2 = ws50Var.d;
        if (z) {
            return zs50.f44891a;
        }
        mdm mdmVar = ws50Var.g;
        if (mdmVar != null) {
            return new ys50(mdmVar);
        }
        int i = 10;
        if (!list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((zvc) obj2).f45047a == mvc.CMS_CODE_NEWS) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zvc zvcVar = (zvc) it.next();
                mvc mvcVar = zvcVar.f45047a;
                ArrayList<ivc> arrayList3 = zvcVar.c;
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, i));
                for (ivc ivcVar : arrayList3) {
                    uo5.b.getClass();
                    int i2 = kj5.e(mvcVar).f35994a;
                    uvc uvcVar = ivcVar.f15439a;
                    Iterator it2 = it;
                    arrayList4.add(new ht50(uvcVar.f36341a, i2, uvcVar.i, uvcVar.j, ivcVar.b ? strA : "", new n0x(uvcVar.b)));
                    it = it2;
                }
                arrayList2.add(arrayList4);
                i = 10;
            }
            ArrayList arrayListR = r3d.r(arrayList2);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (((zvc) obj3).f45047a == mvc.CMS_CODE_NEWS) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((zvc) it3.next()).c);
            }
            fqm fqmVarS = n2x.S(ws50Var, r3d.r(arrayList6).size());
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : list2) {
                if (((zvc) obj4).f45047a != mvc.CMS_CODE_NEWS) {
                    arrayList7.add(obj4);
                }
            }
            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                zvc zvcVar2 = (zvc) it4.next();
                mvc mvcVar2 = zvcVar2.f45047a;
                String str = zvcVar2.b;
                ArrayList arrayList9 = zvcVar2.c;
                uo5.b.getClass();
                int i3 = kj5.e(mvcVar2).f35994a;
                ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    ivc ivcVar2 = (ivc) it5.next();
                    uvc uvcVar2 = ivcVar2.f15439a;
                    Iterator it6 = it4;
                    Iterator it7 = it5;
                    arrayList10.add(new fr5(uvcVar2.f36341a, new n0x(uvcVar2.c), new n0x(azw.R(ivcVar2.f15439a.c)), uvcVar2.i, uvcVar2.j, ivcVar2.b ? new er5(strA, new gro0(foo0.f9892a, d4d.BACKGROUND)) : null, 64));
                    it4 = it6;
                    it5 = it7;
                }
                arrayList8.add(new xo5(i3, str, strA2, arrayList10));
                it4 = it4;
            }
            return new xs50(fqmVarS, arrayListR, arrayList8);
        }
        if (list.isEmpty()) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.g;
            int i4 = ws50Var.f;
            xuzVar.getClass();
            return new ys50(new mdm(xuz.a(pb10Var, i4), null, null, 0, 0, R.string.error_get_data, 0, 0, 10000L, 0L, 734));
        }
        ArrayList<ft5> arrayList11 = new ArrayList();
        for (Object obj5 : list) {
            int i5 = ((ft5) obj5).f10094a.f41399a;
            us5[] us5VarArr = us5.f36194a;
            if (i5 == 11) {
                arrayList11.add(obj5);
            }
        }
        int i6 = 10;
        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
        for (ft5 ft5Var : arrayList11) {
            xs5 xs5Var = ft5Var.f10094a;
            ArrayList<q2b> arrayList13 = ft5Var.b;
            ArrayList arrayList14 = new ArrayList(r3d.q(arrayList13, i6));
            for (q2b q2bVar : arrayList13) {
                int i7 = xs5Var.f41399a;
                kr5 kr5Var = q2bVar.f27993a;
                arrayList14.add(new ht50(kr5Var.b, i7, kr5Var.o, kr5Var.q, q2bVar.b ? strA : "", new n0x(kr5Var.f)));
            }
            arrayList12.add(arrayList14);
            i6 = 10;
        }
        ArrayList arrayListR2 = r3d.r(arrayList12);
        ArrayList arrayList15 = new ArrayList();
        for (Object obj6 : list) {
            int i8 = ((ft5) obj6).f10094a.f41399a;
            us5[] us5VarArr2 = us5.f36194a;
            if (i8 == 11) {
                arrayList15.add(obj6);
            }
        }
        ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
        Iterator it8 = arrayList15.iterator();
        while (it8.hasNext()) {
            arrayList16.add(((ft5) it8.next()).b);
        }
        fqm fqmVarS2 = n2x.S(ws50Var, r3d.r(arrayList16).size());
        ArrayList arrayList17 = new ArrayList();
        for (Object obj7 : list) {
            int i9 = ((ft5) obj7).f10094a.f41399a;
            us5[] us5VarArr3 = us5.f36194a;
            if (i9 != 11) {
                arrayList17.add(obj7);
            }
        }
        ArrayList arrayList18 = new ArrayList(r3d.q(arrayList17, 10));
        Iterator it9 = arrayList17.iterator();
        while (it9.hasNext()) {
            ft5 ft5Var2 = (ft5) it9.next();
            xs5 xs5Var2 = ft5Var2.f10094a;
            ArrayList arrayList19 = ft5Var2.b;
            int i10 = xs5Var2.f41399a;
            String str2 = xs5Var2.b;
            ArrayList arrayList20 = new ArrayList(r3d.q(arrayList19, 10));
            Iterator it10 = arrayList19.iterator();
            while (it10.hasNext()) {
                q2b q2bVar2 = (q2b) it10.next();
                kr5 kr5Var2 = q2bVar2.f27993a;
                Iterator it11 = it9;
                Iterator it12 = it10;
                arrayList20.add(new fr5(kr5Var2.b, new n0x(kr5Var2.g), new n0x(azw.R(q2bVar2.f27993a.g)), kr5Var2.o, kr5Var2.q, q2bVar2.b ? new er5(strA, new gro0(foo0.f9892a, d4d.BACKGROUND)) : null, 64));
                it9 = it11;
                it10 = it12;
            }
            arrayList18.add(new xo5(i10, str2, strA2, arrayList20));
            it9 = it9;
        }
        return new xs50(fqmVarS2, arrayListR2, arrayList18);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object c(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v510.c(java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object g(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r75v0 ??
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

    private final Object h(Object obj) {
        ui60 ui60Var = (ui60) obj;
        ui60Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        a4x<o0x> a4xVar = ui60Var.f35716a;
        int i = ui60Var.e;
        uaq0 uaq0Var = ui60Var.i;
        a4xVar.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
        for (o0x o0xVar : a4xVar) {
            uaq0.f35345a.getClass();
            arrayList.add(new dt5(s9m0.j(uaq0Var) ? new y3d(fbc.d(ctf0.b(R.attr.uikitBackgroundLight60, ctf0Var))) : null, o0xVar, Integer.valueOf(R.drawable.onboarding_placeholder)));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        a4x a4xVar2 = ui60Var.b;
        a4x a4xVar3 = ui60Var.c;
        int i2 = ui60Var.d;
        String str = ui60Var.h;
        String str2 = ui60Var.f;
        String str3 = a4xVar.size() - 1 > i ? ui60Var.g : "";
        boolean z = a4xVar.size() > 1;
        boolean z2 = a4xVar.size() - 1 > i;
        boolean z3 = a4xVar.size() == 1;
        uaq0.f35345a.getClass();
        return new vi60(s9m0.j(uaq0Var) ? d4d.BACKGROUND : d4d.BACKGROUND_LIGHT60, a4xVarO0, a4xVar2, a4xVar3, i2, str, str2, str3, z2, z, z3);
    }

    private final Object i(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        gj60 gj60Var = (gj60) obj;
        gj60Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        ArrayList<fk60> arrayList = gj60Var.f11381a;
        ArrayList arrayList2 = new ArrayList();
        for (fk60 fk60Var : arrayList) {
            lk60 lk60Var = null;
            switch (fk60Var.ordinal()) {
                case 17:
                    numValueOf = Integer.valueOf(R.string.event_screen);
                    break;
                case 18:
                    numValueOf = Integer.valueOf(R.string.cyber_tournament_tip_tournament_title);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    numValueOf = Integer.valueOf(R.string.team_screen);
                    break;
                case 20:
                    numValueOf = Integer.valueOf(R.string.cyber_promo);
                    break;
                case 21:
                    numValueOf = Integer.valueOf(R.string.cyber_calendar_tip_event_list_title);
                    break;
                case 22:
                    numValueOf = Integer.valueOf(R.string.cyber_partners_tip_partner_list_title);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            switch (fk60Var.ordinal()) {
                case 17:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_game_screen);
                    break;
                case 18:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_tournaments);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_team);
                    break;
                case 20:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_bonus);
                    break;
                case 21:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_calendar_inactive);
                    break;
                case 22:
                    numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_partners);
                    break;
                default:
                    numValueOf2 = null;
                    break;
            }
            if (numValueOf != null && numValueOf2 != null) {
                lk60Var = new lk60(fk60Var.f9675a, numValueOf2.intValue(), ctf0Var.b.a(numValueOf.intValue(), Arrays.copyOf(new Object[0], 0)));
            }
            if (lk60Var != null) {
                arrayList2.add(lk60Var);
            }
        }
        return new hj60(dyb.o0(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    private final Object l(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        kg kgVar;
        List list;
        tlm plmVar;
        gmm dmmVar;
        dd50 dd50Var;
        h3b h3bVar;
        boolean z5;
        Integer num;
        int iIntValue;
        a4x a4xVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        jn5 jn5Var;
        List list2;
        htr gtrVar;
        boolean z6;
        List list3;
        htr gtrVar2;
        Iterator it;
        List list4;
        List list5;
        w370 w370Var = (w370) obj;
        w370Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        long jD2 = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        long jD3 = fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var));
        long jD4 = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        boolean z7 = w370Var.k;
        boolean z8 = w370Var.n;
        f3b f3bVar = w370Var.g;
        boolean z9 = w370Var.b;
        tdt tdtVar = w370Var.f;
        List list6 = tdtVar.f33786a;
        rc50 rc50Var = w370Var.d;
        String str8 = rc50Var.b;
        kg kgVar2 = w370Var.m;
        int i = 0;
        if (z7 || z9) {
            z = true;
            if (w370Var.c != null) {
                z2 = true;
            }
            ilm ilmVar = new ilm(jD);
            z3 = rc50Var.c;
            String str9 = rc50Var.e;
            z4 = z2;
            boolean z10 = rc50Var.f30222a;
            if (z3 || !z10) {
                str = str8;
                kgVar = kgVar2;
                list = list6;
                plmVar = new plm(str, ha50.TWO_LINES, jD2, fa50.f9191a);
            } else {
                plmVar = new nlm(new hmm(str9, qfh0.f28634a, rc50Var.f, rc50Var.d));
                str = str8;
                kgVar = kgVar2;
                list = list6;
            }
            if (z3 && z10) {
                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, jD4)));
            } else {
                dmmVar = fmm.f9790a;
            }
            dd50Var = new dd50(str, new imm(ilmVar, plmVar, dmmVar, jD3, false, null), z3, str9);
            if (z4 || !z9) {
                z5 = z;
            } else {
                z5 = false;
            }
            num = f3bVar.b;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            boolean z11 = f3bVar.f8853a;
            a4xVar = f3bVar.c;
            if (a4xVar == null) {
                a4xVar = lak0.c;
            }
            h3bVar = new h3b(z5, iIntValue, z11, a4xVar);
            zm5 zm5Var = w370Var.e;
            boolean z12 = zm5Var.d;
            str2 = zm5Var.f44607a;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            str4 = zm5Var.b;
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            str6 = zm5Var.c;
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            jn5Var = new jn5(str3, str5, str7, z12, !w370Var.l);
            if (w370Var.f38488a) {
                return new j570(dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
            }
            if (z4) {
                return new i570(w370Var.c, w370Var.b, dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
            }
            if (z7) {
                return new i570(w370Var.c, w370Var.b, dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
            }
            ijl ijlVarL = z1x.L(kgVar);
            list2 = tdtVar.c;
            if (list != null) {
                if (list2 == null) {
                    list5 = iun.f15405a;
                } else {
                    list5 = list2;
                }
                gtrVar = sac.o0(list, ctf0Var, list5, z8);
                z6 = z;
            } else {
                z6 = z;
                gtrVar = new gtr(z6);
            }
            htr htrVar = gtrVar;
            list3 = tdtVar.b;
            if (list3 != null) {
                if (list2 == null) {
                    list4 = iun.f15405a;
                } else {
                    list4 = list2;
                }
                gtrVar2 = sac.o0(list3, ctf0Var, list4, z8);
            } else {
                gtrVar2 = new gtr(z6);
            }
            htr htrVar2 = gtrVar2;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list7 = list2;
            int i2 = tdtVar.d;
            int i3 = tdtVar.e;
            if (list != null && !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (!((pbv) it.next()).q && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            return new h570(dd50Var, h3bVar, jn5Var, ijlVarL, new vdt(htrVar, htrVar2, list7, i2, i3, i));
        }
        z = true;
        z2 = false;
        ilm ilmVar2 = new ilm(jD);
        z3 = rc50Var.c;
        String str10 = rc50Var.e;
        z4 = z2;
        boolean z13 = rc50Var.f30222a;
        if (z3) {
            str = str8;
            kgVar = kgVar2;
            list = list6;
            plmVar = new plm(str, ha50.TWO_LINES, jD2, fa50.f9191a);
        } else {
            str = str8;
            kgVar = kgVar2;
            list = list6;
            plmVar = new plm(str, ha50.TWO_LINES, jD2, fa50.f9191a);
        }
        if (z3) {
            dmmVar = fmm.f9790a;
        } else {
            dmmVar = fmm.f9790a;
        }
        dd50Var = new dd50(str, new imm(ilmVar2, plmVar, dmmVar, jD3, false, null), z3, str10);
        if (z4) {
            z5 = z;
        } else {
            z5 = z;
        }
        num = f3bVar.b;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        boolean z14 = f3bVar.f8853a;
        a4xVar = f3bVar.c;
        if (a4xVar == null) {
            a4xVar = lak0.c;
        }
        h3bVar = new h3b(z5, iIntValue, z14, a4xVar);
        zm5 zm5Var2 = w370Var.e;
        boolean z15 = zm5Var2.d;
        str2 = zm5Var2.f44607a;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        str4 = zm5Var2.b;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        str6 = zm5Var2.c;
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        jn5Var = new jn5(str3, str5, str7, z15, !w370Var.l);
        if (w370Var.f38488a) {
            return new j570(dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
        }
        if (z4) {
            return new i570(w370Var.c, w370Var.b, dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
        }
        if (z7) {
            return new i570(w370Var.c, w370Var.b, dd50Var, h3bVar, jn5Var, z1x.L(kgVar));
        }
        ijl ijlVarL2 = z1x.L(kgVar);
        list2 = tdtVar.c;
        if (list != null) {
            if (list2 == null) {
                list5 = iun.f15405a;
            } else {
                list5 = list2;
            }
            gtrVar = sac.o0(list, ctf0Var, list5, z8);
            z6 = z;
        } else {
            z6 = z;
            gtrVar = new gtr(z6);
        }
        htr htrVar3 = gtrVar;
        list3 = tdtVar.b;
        if (list3 != null) {
            if (list2 == null) {
                list4 = iun.f15405a;
            } else {
                list4 = list2;
            }
            gtrVar2 = sac.o0(list3, ctf0Var, list4, z8);
        } else {
            gtrVar2 = new gtr(z6);
        }
        htr htrVar4 = gtrVar2;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list8 = list2;
        int i4 = tdtVar.d;
        int i5 = tdtVar.e;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                if (!((pbv) it.next()).q) {
                }
            }
        }
        return new h570(dd50Var, h3bVar, jn5Var, ijlVarL2, new vdt(htrVar3, htrVar4, list8, i4, i5, i));
    }

    private final Object m(Object obj) {
        wui0 wui0Var;
        wui0 wui0Var2;
        ty60 ty60Var = (ty60) obj;
        ty60Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        long jD2 = fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var));
        long jD3 = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        itl itlVar = new itl(new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.discard, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.i);
        lul lulVar = lul.e;
        boolean z = ty60Var.f34739a;
        m4s m4sVar = ty60Var.e;
        urs ursVar = ty60Var.d;
        int i = ty60Var.f;
        mtl mtlVar = new mtl(dyb.g0(itlVar, new itl(new wul(lulVar, oe9Var, new ue9(z ? lsm0Var.a(R.string.show, Arrays.copyOf(new Object[0], 0)) + " (" + i + Separators.RPAREN : lsm0Var.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.j)));
        String strA = lsm0Var.a(R.string.type_of_game, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0));
        String strA3 = lsm0Var.a(R.string.coef_win, Arrays.copyOf(new Object[0], 0));
        y3q y3qVar = new y3q(ursVar, m4sVar, ty60Var.c, i);
        imm immVar = new imm(new ilm(jD3), new plm(lsm0Var.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, jD, fa50.f9191a), fmm.f9790a, jD2, false, null);
        a4x a4xVarO0 = dyb.o0(ty60Var.b);
        c0o c0oVar = urs.g;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        int i2 = 0;
        for (Object obj2 : c0oVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            urs ursVar2 = (urs) obj2;
            tui0 tui0Var = new tui0(lsm0Var.a(ursVar2.b, Arrays.copyOf(new Object[0], 0)), null);
            nvi0 nvi0Var = new nvi0(ursVar2 == ursVar);
            int iB = c0oVar.b();
            if (iB == 1) {
                wui0Var2 = wui0.f39793a;
            } else if (i2 == 0) {
                wui0Var2 = wui0.b;
            } else {
                wui0Var2 = i2 == iB + (-1) ? wui0.d : wui0.c;
            }
            arrayList.add(new uvi0(ursVar2, new rqm((vui0) tui0Var, (pui0) null, (pvi0) nvi0Var, d4d.BACKGROUND_CONTENT, (tvi0) null, wui0Var2, true, (e900) null, 298)));
            i2 = i3;
        }
        a4x a4xVarO1 = dyb.o0(arrayList);
        c0o c0oVar2 = m4s.g;
        ArrayList arrayList2 = new ArrayList(r3d.q(c0oVar2, 10));
        int i4 = 0;
        for (Object obj3 : c0oVar2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            m4s m4sVar2 = (m4s) obj3;
            tui0 tui0Var2 = new tui0(lsm0Var.a(m4sVar2.b, Arrays.copyOf(new Object[0], 0)), null);
            nvi0 nvi0Var2 = new nvi0(m4sVar2 == m4sVar);
            int iB2 = c0oVar2.b();
            if (iB2 == 1) {
                wui0Var = wui0.f39793a;
            } else if (i4 == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = i4 == iB2 + (-1) ? wui0.d : wui0.c;
            }
            arrayList2.add(new uvi0(m4sVar2, new rqm((vui0) tui0Var2, (pui0) null, (pvi0) nvi0Var2, d4d.BACKGROUND_CONTENT, (tvi0) null, wui0Var, true, (e900) null, 298)));
            i4 = i5;
        }
        return new uy60(strA, strA2, strA3, y3qVar, immVar, mtlVar, a4xVarO0, a4xVarO1, dyb.o0(arrayList2));
    }

    private final Object o(Object obj) {
        q970 q970Var = (q970) obj;
        q970Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.demo_dialog_balance_title, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        lvl lvlVar = new lvl("BALANCE_ITEM_ID", new tui0(strA, new y3d(s6t0.b().f33626a.getSecondary())), new mvi0(q970Var.f28335a, new y3d(s6t0.b().f33626a.getTextPrimary())));
        lvl lvlVar2 = new lvl("WIN_SUM_ITEM_ID", new tui0(lsm0Var.a(R.string.demo_dialog_total_win_title, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getSecondary())), new mvi0(q970Var.b, new y3d(s6t0.b().f33626a.getCommerce())));
        String strA2 = lsm0Var.a(R.string.demo_dialog_description, Arrays.copyOf(new Object[0], 0));
        ro8 ro8Var = ro8.f30824a;
        long secondary = s6t0.b().f33626a.getSecondary();
        StaticColors staticColors = StaticColors.INSTANCE;
        s970 s970Var = new s970(lvlVar, lvlVar2, strA2, secondary, staticColors.m121getTransparent0d7_KjU());
        t970 t970Var = new t970(s6t0.b().f33626a.getTextPrimary(), staticColors.m121getTransparent0d7_KjU(), lsm0Var.a(R.string.demo_dialog_title, Arrays.copyOf(new Object[0], 0)));
        vul vulVar = vul.f38053a;
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        return new u970(s970Var, t970Var, new r970(new wul(iulVar, oe9Var, new ue9(lsm0Var.a(R.string.demo_dialog_exit_button_text, Arrays.copyOf(new Object[0], 0))), q970Var.c, false, true), new wul(lul.e, oe9Var, new ue9(lsm0Var.a(R.string.demo_dialog_cancel_button_text, Arrays.copyOf(new Object[0], 0))), true, false, true), staticColors.m121getTransparent0d7_KjU()));
    }

    private final Object p(Object obj) {
        qc70 qc70Var = (qc70) obj;
        qc70Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.attention, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        tc70 tc70Var = new tc70(strA, s6t0.b().f33626a.getTextPrimary());
        boolean z = qc70Var.f28472a;
        String strA2 = z ? lsm0Var.a(R.string.demo_dialog_unauthorized_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.demo_dialog_unavailable_description, Arrays.copyOf(new Object[0], 0));
        ro8 ro8Var = ro8.f30824a;
        sc70 sc70Var = new sc70(strA2, s6t0.b().f33626a.getSecondary());
        vul vulVar = vul.f38053a;
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        return new uc70(tc70Var, sc70Var, new rc70(new wul(iulVar, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(lul.e, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(qul.e, oe9Var, new ue9(z ? lsm0Var.a(R.string.demo_dialog_cancel_button_text, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.demo_dialog_back_to_games_section_button_text, Arrays.copyOf(new Object[0], 0))), true, false, true)));
    }

    private final Object r(Object obj) {
        ay70 ay70Var = (ay70) obj;
        ay70Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.telegram_get_bonus_and_notice_title, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var.a(R.string.telegram_get_bonus_and_notice_description_v2, Arrays.copyOf(new Object[]{ay70Var.f1658a}, 1));
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        ue9 ue9Var = new ue9(lsm0Var.a(R.string.telegram_navigate, Arrays.copyOf(new Object[0], 0)));
        boolean z = ay70Var.b;
        return new by70(strA, strA2, new wul(lulVar, oe9Var, ue9Var, !z, z, true), new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), !ay70Var.b, false, true), ay70Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:128:0x030c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0333  */
    /* JADX WARN: Code duplicated, block: B:131:0x0344  */
    /* JADX WARN: Code duplicated, block: B:133:0x0357  */
    /* JADX WARN: Code duplicated, block: B:135:0x035a  */
    /* JADX WARN: Code duplicated, block: B:139:0x036f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0393  */
    /* JADX WARN: Code duplicated, block: B:148:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:168:0x044c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0463  */
    /* JADX WARN: Code duplicated, block: B:173:0x048a  */
    /* JADX WARN: Code duplicated, block: B:174:0x049a  */
    /* JADX WARN: Code duplicated, block: B:176:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:182:0x04be  */
    /* JADX WARN: Code duplicated, block: B:188:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:191:0x0509  */
    /* JADX WARN: Code duplicated, block: B:193:0x052a  */
    /* JADX WARN: Code duplicated, block: B:194:0x053d  */
    /* JADX WARN: Code duplicated, block: B:450:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x04b8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v77, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v97, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v98, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v99 java.lang.Object, still in use, count: 2, list:
          (r2v99 java.lang.Object) from 0x02f3: PHI (r2 I:??) = (r2v82 java.lang.Object), (r2v99 java.lang.Object) binds: [B:122:0x02f2, B:444:0x02f3] A[DONT_GENERATE, DONT_INLINE]
          (r2v99 java.lang.Object) from 0x02e9: CHECK_CAST (a.zvc) (r2v99 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 3832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v510.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ v510(ctf0 ctf0Var, byte b) {
        this.f36807a = b;
        this.b = ctf0Var;
    }

    public /* synthetic */ v510(v6t0 v6t0Var, ctf0 ctf0Var, byte b) {
        this.f36807a = b;
        this.b = ctf0Var;
    }
}
