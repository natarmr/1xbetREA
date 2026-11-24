package a;

import android.content.res.Configuration;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hkb {
    public static final lc00 A(h8o h8oVar, y78 y78Var, sff0 sff0Var, boolean z, List list, ctf0 ctf0Var, boolean z2, boolean z3) {
        lc00 lc00Var;
        v5l0 v5l0Var;
        Object next;
        lel0 lel0Var;
        m5l0 m5l0Var;
        sff0 sff0Var2 = sff0Var;
        ctf0 ctf0Var2 = ctf0Var;
        list.getClass();
        ctf0Var2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List<d0t> list2 = h8oVar.f12637a;
        if (list2.isEmpty()) {
            lc00Var = lc00VarB;
        } else {
            lc00VarB.add(new n8o(z2 ? "LIVE_EVENTS_HEADER" : "LINE_EVENTS_HEADER", z2 ? new hjm(ctf0Var2.b.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, true, null, null, false, null, null, 8126) : new hjm(ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
            Map map = h8oVar.b;
            v5l0 v5l0Var2 = sff0Var2.g.y;
            list2.getClass();
            map.getClass();
            q0s q0sVar = q0s.b;
            int i = 10;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            for (d0t d0tVar : list2) {
                ArrayList arrayList2 = arrayList;
                boolean z4 = sff0Var2.J;
                ril0 ril0Var = (ril0) map.get(Long.valueOf(d0tVar.v));
                String str = "";
                if (ril0Var == null) {
                    v5l0Var = v5l0Var2;
                } else if (d0tVar.v == 40) {
                    Iterator it = ril0Var.f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            v5l0Var = v5l0Var2;
                            next = null;
                            break;
                        }
                        next = it.next();
                        v5l0Var = v5l0Var2;
                        if (((f3n0) next).f8872a == d0tVar.u) {
                            break;
                        }
                        v5l0Var2 = v5l0Var;
                    }
                    f3n0 f3n0Var = (f3n0) next;
                    String str2 = (f3n0Var == null || (lel0Var = f3n0Var.c) == null) ? null : lel0Var.j;
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    v5l0Var = v5l0Var2;
                    str = ril0Var.g.j;
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(list, i));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                }
                if (d0tVar.K.isEmpty()) {
                    List list3 = d0tVar.k;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!((d0t) it3.next()).K.isEmpty()) {
                                    m5l0Var = l5l0.f19463a;
                                }
                            }
                        }
                    }
                    m5l0Var = i5l0.f14197a;
                } else {
                    m5l0Var = l5l0.f19463a;
                }
                v5l0Var2 = v5l0Var;
                arrayList2.add(wwb.V(d0tVar, ctf0Var2, y78Var, z, z4, str, false, arrayList3, false, false, false, v5l0Var2, m5l0Var, "", z3));
                ctf0Var2 = ctf0Var;
                arrayList = arrayList2;
                q0sVar = q0sVar;
                map = map;
                lc00VarB = lc00VarB;
                i = i;
                sff0Var2 = sff0Var;
            }
            lc00 lc00Var2 = lc00VarB;
            lc00Var = lc00Var2;
            lc00Var.add(new m8o(z2 ? "LIVE_GAMES" : "LINE_GAMES", new vb90(q0sVar, dyb.r0(arrayList), true, z3)));
        }
        return kotlin.collections.a.a(lc00Var);
    }

    public static final bq9 B(gmq gmqVar, glz glzVar, lkz lkzVar) {
        gmqVar.getClass();
        glzVar.getClass();
        lkzVar.getClass();
        return nkb.y(new ic1((Object) glzVar, (Object) lkzVar, (Object) gmqVar, (yje) null, (byte) 29));
    }

    public static String C(int i) {
        return ua80.e(i, "activity with result code: ", " indicating not RESULT_OK");
    }

    public static final zjk D(Integer num) {
        if (num.intValue() == 1) {
            return zjk.f44484a;
        }
        if (num.intValue() == 2) {
            return zjk.b;
        }
        if (num.intValue() == 3) {
            return zjk.c;
        }
        if (num.intValue() == 4) {
            return zjk.d;
        }
        if (num.intValue() == 5) {
            return zjk.e;
        }
        return num.intValue() == 6 ? zjk.f : zjk.g;
    }

    public static Object E(Future future) {
        Object obj;
        if (!future.isDone()) {
            jf4.n(jtm0.p("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final azv F(int i) {
        if (i == 1) {
            return azv.f1740a;
        }
        if (i == 2) {
            return azv.b;
        }
        if (i == 4) {
            return azv.c;
        }
        if (i != 5) {
            return i != 6 ? azv.f : azv.e;
        }
        return azv.d;
    }

    public static final mla G(v5l0 v5l0Var) {
        ull0 ull0Var;
        v5l0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            ull0Var = pll0.f27189a;
        } else if (iOrdinal == 1) {
            ull0Var = tll0.f34152a;
        } else if (iOrdinal == 2) {
            ull0Var = sll0.f32406a;
        } else if (iOrdinal == 3) {
            ull0Var = rll0.f30703a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            ull0Var = qll0.f28940a;
        }
        return new mla(ull0Var);
    }

    public static final ArrayList H(ArrayList arrayList) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            rlk rlkVar = ((olk) obj).c;
            arrayList2.add(new gyr(String.valueOf((rlkVar == null || (num4 = rlkVar.f30701a) == null) ? 0 : num4.intValue()), String.valueOf((rlkVar == null || (num3 = rlkVar.b) == null) ? 0 : num3.intValue()), String.valueOf(((rlkVar == null || (num2 = rlkVar.f30701a) == null) ? 0 : num2.intValue()) + ((rlkVar == null || (num = rlkVar.b) == null) ? 0 : num.intValue())), String.valueOf(i3)));
            i2 = i3;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int size = 1 - arrayList3.size();
        if (size >= 0) {
            while (true) {
                arrayList3.add(new gyr("-", "-", "-", "-"));
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return arrayList3;
    }

    public static final ArrayList I(List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (!(((xlh) obj) instanceof ulh)) {
                arrayListU.add(obj);
            }
        }
        return arrayListU;
    }

    public static ig00 J(ig00 ig00Var) {
        if (ig00Var.isDone()) {
            return ig00Var;
        }
        nfr nfrVar = new nfr();
        nfrVar.h = ig00Var;
        ig00Var.a(nfrVar, ank.f1158a);
        return nfrVar;
    }

    public static final kml K(List list) {
        List listA;
        if (list.size() > 9) {
            listA = CollectionsKt.D0(kotlin.collections.a.d(list), 9);
        } else {
            lc00 lc00Var = new lc00(9);
            for (int i = 0; i < 9; i++) {
                lc00Var.add(list.get(i % list.size()));
            }
            listA = kotlin.collections.a.a(lc00Var);
        }
        return new kml(dyb.r0(listA.subList(0, 3)), dyb.r0(listA.subList(3, 6)), dyb.r0(listA.subList(6, 9)));
    }

    public static final Object L(pzh pzhVar, zje zjeVar) {
        int i = pzhVar.c;
        xcz xczVar = pzhVar.b;
        Integer num = new Integer(i);
        if (num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            return Unit.f46060a;
        }
        Object objL = xczVar.l((xczVar.h() % num.intValue()) + (pzhVar.f27845a.size() / 2), 0, zjeVar);
        return objL == wne.f39444a ? objL : Unit.f46060a;
    }

    public static final l7m0 M(xcz xczVar, fet fetVar) {
        boolean zG = fetVar.g(xczVar);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = jgk0.b(new eb(xczVar, (byte) 22));
            fetVar.o0(objP);
        }
        return (l7m0) objP;
    }

    public static final pzh N(i4 i4Var, fet fetVar) {
        boolean zG = fetVar.g(i4Var);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            lc00 lc00VarB = kotlin.collections.a.b();
            for (int i = 0; i < 16; i++) {
                lc00VarB.addAll(i4Var);
            }
            objP = kotlin.collections.a.a(lc00VarB);
            fetVar.o0(objP);
        }
        List list = (List) objP;
        xcz xczVarA = ddz.a(list.size() / 2, 0, fetVar, 0, 2);
        boolean zG2 = fetVar.g(list) | fetVar.g(xczVarA);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == obj) {
            objP2 = new pzh(list, xczVarA, i4Var.size());
            fetVar.o0(objP2);
        }
        return (pzh) objP2;
    }

    public static final c0d O(bzc bzcVar) {
        int iOrdinal = bzcVar.ordinal();
        if (iOrdinal == 0) {
            return c0d.f;
        }
        if (iOrdinal == 1) {
            return c0d.b;
        }
        if (iOrdinal == 2) {
            return c0d.c;
        }
        if (iOrdinal == 3) {
            return c0d.d;
        }
        if (iOrdinal == 4) {
            return c0d.f3518a;
        }
        t9f.b();
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final a.zqg P(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
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
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    public static final ikk Q(mkk mkkVar) {
        List listD0;
        List listD1;
        List listD2;
        List listD3;
        hkk hkkVar;
        mkkVar.getClass();
        Long l = mkkVar.f21947a;
        if (l != null) {
            String strValueOf = String.valueOf(l.longValue());
            ArrayList arrayList = new ArrayList(strValueOf.length());
            for (int i = 0; i < strValueOf.length(); i++) {
                arrayList.add(D(Integer.valueOf(kotlin.text.a.a(strValueOf.charAt(i)))));
            }
            listD0 = CollectionsKt.D0(arrayList, 5);
            if (listD0 == null) {
                listD0 = iun.f15405a;
            }
        } else {
            listD0 = iun.f15405a;
        }
        List list = listD0;
        Long l2 = mkkVar.b;
        if (l2 != null) {
            String strValueOf2 = String.valueOf(l2.longValue());
            ArrayList arrayList2 = new ArrayList(strValueOf2.length());
            for (int i2 = 0; i2 < strValueOf2.length(); i2++) {
                arrayList2.add(Integer.valueOf(kotlin.text.a.a(strValueOf2.charAt(i2))));
            }
            listD1 = CollectionsKt.D0(arrayList2, 5);
            if (listD1 == null) {
                listD1 = iun.f15405a;
            }
        } else {
            listD1 = iun.f15405a;
        }
        List list2 = listD1;
        Long l3 = mkkVar.c;
        if (l3 != null) {
            String strValueOf3 = String.valueOf(l3.longValue());
            ArrayList arrayList3 = new ArrayList(strValueOf3.length());
            for (int i3 = 0; i3 < strValueOf3.length(); i3++) {
                arrayList3.add(D(Integer.valueOf(kotlin.text.a.a(strValueOf3.charAt(i3)))));
            }
            listD2 = CollectionsKt.D0(arrayList3, 5);
            if (listD2 == null) {
                listD2 = iun.f15405a;
            }
        } else {
            listD2 = iun.f15405a;
        }
        List list3 = listD2;
        Long l4 = mkkVar.d;
        if (l4 != null) {
            String strValueOf4 = String.valueOf(l4.longValue());
            ArrayList arrayList4 = new ArrayList(strValueOf4.length());
            for (int i4 = 0; i4 < strValueOf4.length(); i4++) {
                arrayList4.add(Integer.valueOf(kotlin.text.a.a(strValueOf4.charAt(i4))));
            }
            listD3 = CollectionsKt.D0(arrayList4, 5);
            if (listD3 == null) {
                listD3 = iun.f15405a;
            }
        } else {
            listD3 = iun.f15405a;
        }
        List list4 = listD3;
        Integer num = mkkVar.e;
        if ((num != null && num.intValue() == 0) || num == null) {
            hkkVar = hkk.f13213a;
        } else if (num.intValue() == 1) {
            hkkVar = hkk.b;
        } else if (num.intValue() == 2) {
            hkkVar = hkk.c;
        } else if (num.intValue() == 3) {
            hkkVar = hkk.d;
        } else if (num.intValue() == 4) {
            hkkVar = hkk.e;
        } else if (num.intValue() == 5) {
            hkkVar = hkk.f;
        } else {
            hkkVar = num.intValue() == 6 ? hkk.g : hkk.h;
        }
        hkk hkkVar2 = hkkVar;
        String str = mkkVar.f;
        String str2 = str == null ? "" : str;
        String str3 = mkkVar.g;
        return new ikk(list, list2, list3, list4, hkkVar2, str2, str3 == null ? "" : str3);
    }

    public static final List R(d0t d0tVar) {
        List list;
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            list = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.q);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            wcy wcyVarC = vdx.f37253a;
            if (wcyVarC == null) {
                wcyVarC = qxw.c(new f8l0((byte) 15));
                vdx.f37253a = wcyVarC;
            }
            list = (List) wcyVarC.b(mrv.j0(new zw3(olk.Companion.serializer(), (byte) 0)), str);
        }
        return list == null ? iun.f15405a : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList S(String str, List list, List list2) {
        Map linkedHashMap;
        list.getClass();
        str.getClass();
        if (list2 != null) {
            int iA = wp20.a(r3d.q(list2, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list2) {
                linkedHashMap.put(((zz60) obj).f45237a, obj);
            }
        } else {
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wz60 wz60Var = (wz60) it.next();
            Object objValueOf = null;
            if (wz60Var == null) {
                jf4.k(null);
                return null;
            }
            Boolean bool = wz60Var.f;
            Boolean bool2 = wz60Var.l;
            zz60 zz60Var = (zz60) linkedHashMap.get(wz60Var.b);
            String str2 = zz60Var != null ? zz60Var.b : null;
            String str3 = str2 == null ? "" : str2;
            if (str3.length() != 0) {
                Integer num = wz60Var.f40009a;
                long jIntValue = num != null ? num.intValue() : 0L;
                Double d = wz60Var.i;
                objValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
                String str4 = objValueOf == null ? "" : objValueOf;
                hcs hcsVar = wz60Var.c;
                if (hcsVar == null) {
                    hcsVar = hcs.NONE;
                }
                hcs hcsVar2 = hcsVar;
                t470 t470Var = a570.Companion;
                boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                t470Var.getClass();
                a570 a570VarA = t470.a(zBooleanValue, jIntValue);
                Boolean bool3 = wz60Var.d;
                boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                List list3 = wz60Var.h;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                List list4 = list3;
                Boolean bool4 = wz60Var.j;
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                boolean zBooleanValue4 = bool != null ? bool.booleanValue() : false;
                boolean zBooleanValue5 = bool != null ? bool.booleanValue() : false;
                boolean zBooleanValue6 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool5 = wz60Var.e;
                boolean zBooleanValue7 = bool5 != null ? bool5.booleanValue() : false;
                hds.Companion.getClass();
                hds hdsVarB = dds.b(str, wz60Var);
                Boolean bool6 = wz60Var.k;
                boolean zBooleanValue8 = bool6 != null ? bool6.booleanValue() : false;
                Boolean bool7 = wz60Var.m;
                boolean zBooleanValue9 = bool7 != null ? bool7.booleanValue() : false;
                Boolean bool8 = wz60Var.n;
                objValueOf = new pbv(jIntValue, list4, str3, hcsVar2, a570VarA, str4, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, hdsVarB, zBooleanValue8, zBooleanValue9, bool8 != null ? bool8.booleanValue() : false, 69632);
            }
            if (objValueOf != null) {
                arrayList.add(objValueOf);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(Long.valueOf(((pbv) obj2).f26728a))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final void a(int i, kpm kpmVar, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        fet fetVar2;
        fetVar.g0(1784985987);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kpmVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD2, 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarG, fetVar, (i2 >> 6) & 14, 24960, 109562);
            fetVar.r(true);
            n4c.l(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), kpmVar, z, fetVar, 0);
            mm40 mm40VarE2 = o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 28.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i2 >> 9) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dtm(mm40Var, kpmVar, str, str2, z, i);
        }
    }

    public static final void b(mm40 mm40Var, z77 z77Var, Function1 function1, fet fetVar, int i) {
        Boolean bool;
        Object ubdVar;
        int i2;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1104191239);
        int i3 = i | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new ok7(w2dVarW0, b));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Boolean boolValueOf = Boolean.valueOf(z77Var.e());
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zI = (i4 == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                bool = boolValueOf;
                i2 = i4;
                ubdVar = new ubd(z77Var, w2dVarW0, xczVarA, function1, null, (byte) 0);
                fetVar.o0(ubdVar);
            } else {
                ubdVar = objP2;
                bool = boolValueOf;
                i2 = i4;
            }
            m0x0.t(fetVar, bool, (Function2) ubdVar);
            Boolean boolValueOf2 = Boolean.valueOf(z77Var.g());
            boolean zI2 = (i2 == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i5 == 256);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                Object ubdVar2 = new ubd(z77Var, w2dVarW0, xczVarA, function1, null, (byte) 1);
                fetVar.o0(ubdVar2);
                objP3 = ubdVar2;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP3);
            v2n0.b(knm0.r(mm40Var), w2dVarW0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(430500466, new rbd(w2dVarW0, z77Var, function1, l7m0Var, (byte) 0), fetVar), u1c.M(1159161646, new i57(z77Var, womVarF, w2dVarW0, function1, xczVarA, (byte) 1), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j57(mm40Var, z77Var, function1, i, (byte) 1);
        }
    }

    public static final void c(final a4x a4xVar, final ehm0 ehm0Var, final ehm0 ehm0Var2, final ehm0 ehm0Var3, final ehm0 ehm0Var4, final ehm0 ehm0Var5, final ehm0 ehm0Var6, final ehm0 ehm0Var7, final db00 db00Var, final a4x a4xVar2, final l7m0 l7m0Var, final boolean z, final Function1 function1, final mm40 mm40Var, fet fetVar, final int i) {
        byte b;
        kwj kwjVar;
        xcz xczVar;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        a4xVar2.getClass();
        function1.getClass();
        fetVar2.g0(1899811057);
        int i2 = i | (fetVar2.g(a4xVar) ? 4 : 2) | (fetVar2.g(ehm0Var) ? 32 : 16) | (fetVar2.g(ehm0Var2) ? 256 : 128) | (fetVar2.g(ehm0Var3) ? 2048 : 1024) | (fetVar2.g(ehm0Var4) ? 16384 : 8192) | (fetVar2.g(ehm0Var5) ? 131072 : 65536) | (fetVar2.g(ehm0Var6) ? 1048576 : 524288) | (fetVar2.g(ehm0Var7) ? 8388608 : 4194304) | (fetVar2.g(db00Var) ? 67108864 : 33554432) | (fetVar2.g(a4xVar2) ? 536870912 : 268435456);
        int i3 = (fetVar2.g(l7m0Var) ? (char) 4 : (char) 2) | (fetVar2.h(z) ? ' ' : (char) 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.g(mm40Var) ? (char) 2048 : (char) 1024);
        if (fetVar2.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(((Number) ((cgk0) l7m0Var).getValue()).intValue());
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            int iIntValue = ((Number) ((cgk0) l7m0Var).getValue()).intValue();
            int i4 = i2 & 1879048192;
            boolean z2 = i4 == 536870912;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                b = 0;
                objP3 = new ife(a4xVar2, b);
                fetVar2.o0(objP3);
            } else {
                b = 0;
            }
            kwj kwjVarB = zk80.b(iIntValue, (Function0) objP3, fetVar2, b, 2);
            final mez mezVarQ = gfx.Q(fetVar2);
            Unit unit = Unit.f46060a;
            boolean zG = fetVar2.g(mezVarQ);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new sfe(mezVarQ, null, (byte) 0);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, unit, (Function2) objP4);
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zG2 = fetVar2.g(xczVarA) | fetVar2.i(vneVar) | ((i3 & 896) == 256) | fetVar2.g(kwjVarB);
            Object objP5 = fetVar2.P();
            if (zG2 || objP5 == cl5Var) {
                kwjVar = kwjVarB;
                xczVar = xczVarA;
                objP5 = new wn2(xczVar, vneVar, function1, kwjVar, cgk0Var, null, (byte) 10);
                fetVar2.o0(objP5);
            } else {
                kwjVar = kwjVarB;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP5);
            final ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar) {
                if (tx3.l0(new cz10[]{yy10.c, dy10.c, xy10.c}).contains(((nz30) obj).b)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : a4xVar) {
                if (!(((nz30) obj2).b instanceof jy10)) {
                    arrayList2.add(obj2);
                }
            }
            final List listN0 = CollectionsKt.n0(arrayList2, arrayList);
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(i120.Q(mm40Var, background, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), "STATISTICS_CONTENT_MENU");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 8.0f, 0.0f, 8.0f, 5);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = (i4 == 536870912) | ((i3 & 14) == 4);
            Object objP6 = fetVar2.P();
            if (z3 || objP6 == cl5Var) {
                objP6 = new sw8((Object) a4xVar2, (Object) l7m0Var, (Object) cgk0Var, (byte) 13);
                fetVar2.o0(objP6);
            }
            b8k0.f(mm40VarN, xczVar, lh80VarU, false, qw3Var, yx7Var, null, false, null, (Function1) objP6, fetVar2, 196608, 456);
            q5x.e(kwjVar, new x7z(1.0f, true), s5x0.u(xfn.a(fetVar).e, 2.0f, xfn.a(fetVar).e, 0.0f, 8), null, 0, xfn.a(fetVar).e, gqw0.j, null, false, null, null, null, null, u1c.M(-1306546520, new ydr() { // from class: a.pfe
                @Override // a.ydr
                public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                    int iIntValue2 = ((Integer) obj4).intValue();
                    fet fetVar3 = (fet) obj5;
                    int iIntValue3 = ((Integer) obj6).intValue();
                    xx7 xx7Var = gqw0.n;
                    ((rk80) obj3).getClass();
                    if ((iIntValue3 & 48) == 0) {
                        iIntValue3 |= fetVar3.e(iIntValue2) ? 32 : 16;
                    }
                    byte b2 = 1;
                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                        int i5 = ((beo0) a4xVar2.get(iIntValue2)).c;
                        Function1 function2 = function1;
                        boolean z4 = z;
                        cl5 cl5Var2 = ukd.f35823a;
                        if (i5 == 1) {
                            fetVar3.e0(1961491318);
                            mm40 mm40VarE1 = o2e.e0(jm40.b, "CONTENT_MENU_VERTICAL_PAGER");
                            y3m0 y3m0Var = new y3m0(2);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarU2 = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                            qw3 qw3Var2 = new qw3(8.0f, true, new gne(xx7Var, (byte) 12));
                            ehm0 ehm0Var8 = ehm0Var3;
                            boolean zG3 = fetVar3.g(ehm0Var8) | fetVar3.g(function2) | fetVar3.h(z4);
                            ehm0 ehm0Var9 = ehm0Var7;
                            boolean zG4 = zG3 | fetVar3.g(ehm0Var9);
                            ehm0 ehm0Var10 = ehm0Var;
                            boolean zG5 = zG4 | fetVar3.g(ehm0Var10);
                            db00 db00Var2 = db00Var;
                            boolean zG6 = zG5 | fetVar3.g(db00Var2);
                            ehm0 ehm0Var11 = ehm0Var2;
                            boolean zG7 = zG6 | fetVar3.g(ehm0Var11);
                            List list = listN0;
                            boolean zI = zG7 | fetVar3.i(list);
                            Object objP7 = fetVar3.P();
                            if (zI || objP7 == cl5Var2) {
                                rfe rfeVar = new rfe(ehm0Var8, ehm0Var9, ehm0Var10, db00Var2, ehm0Var11, list, function2, z4);
                                fetVar3.o0(rfeVar);
                                objP7 = rfeVar;
                            }
                            ydx.f(y3m0Var, mm40VarE1, mezVarQ, lh80VarU2, 8.0f, qw3Var2, null, false, null, (Function1) objP7, fetVar3, 805306416, Response.BAD_REQUEST);
                            fetVar3.r(false);
                        } else if (i5 == 2) {
                            fetVar3.e0(1965358940);
                            zcl zclVar3 = qmk.f28987a;
                            lh80 lh80VarU3 = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                            ehm0 ehm0Var12 = ehm0Var4;
                            boolean zG8 = fetVar3.g(ehm0Var12) | fetVar3.h(z4) | fetVar3.g(function2);
                            ehm0 ehm0Var13 = ehm0Var6;
                            boolean zG9 = zG8 | fetVar3.g(ehm0Var13);
                            ehm0 ehm0Var14 = ehm0Var5;
                            boolean zG10 = zG9 | fetVar3.g(ehm0Var14);
                            Object objP8 = fetVar3.P();
                            if (zG10 || objP8 == cl5Var2) {
                                cw6 cw6Var = new cw6((Object) ehm0Var12, z4, (Object) function2, (Object) ehm0Var13, (Object) ehm0Var14, (byte) 4);
                                fetVar3.o0(cw6Var);
                                objP8 = cw6Var;
                            }
                            b8k0.e(null, null, lh80VarU3, null, null, null, false, null, (Function1) objP8, fetVar3, 100663296, 251);
                            fetVar3.r(false);
                        } else if (i5 != 3) {
                            fetVar3.e0(-1460534868);
                            fetVar3.r(false);
                        } else {
                            fetVar3.e0(1967252575);
                            y3m0 y3m0Var2 = new y3m0(2);
                            zcl zclVar4 = qmk.f28987a;
                            lh80 lh80VarU4 = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                            qw3 qw3Var3 = new qw3(8.0f, true, new gne(xx7Var, (byte) 12));
                            ArrayList arrayList3 = arrayList;
                            boolean zI2 = fetVar3.i(arrayList3) | fetVar3.g(function2);
                            Object objP9 = fetVar3.P();
                            if (zI2 || objP9 == cl5Var2) {
                                objP9 = new td8(arrayList3, function2, b2);
                                fetVar3.o0(objP9);
                            }
                            ydx.f(y3m0Var2, null, null, lh80VarU4, 8.0f, qw3Var3, null, false, null, (Function1) objP9, fetVar3, 805306368, Response.NOT_ACCEPTABLE);
                            fetVar3.r(false);
                        }
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 102236160, 24576, 16024);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(ehm0Var, ehm0Var2, ehm0Var3, ehm0Var4, ehm0Var5, ehm0Var6, ehm0Var7, db00Var, a4xVar2, l7m0Var, z, function1, mm40Var, i) { // from class: a.qfe
                public final /* synthetic */ ehm0 b;
                public final /* synthetic */ ehm0 c;
                public final /* synthetic */ ehm0 d;
                public final /* synthetic */ ehm0 e;
                public final /* synthetic */ ehm0 f;
                public final /* synthetic */ ehm0 g;
                public final /* synthetic */ ehm0 h;
                public final /* synthetic */ db00 i;
                public final /* synthetic */ a4x j;
                public final /* synthetic */ l7m0 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ mm40 n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = x8x.L(1);
                    hkb.c(this.f28628a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (fet) obj3, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, juf jufVar, zx7 zx7Var, fet fetVar, int i) {
        zx7 zx7Var2;
        mm40 mm40Var2;
        h4d h4dVar;
        fetVar.g0(-2075125109);
        int i2 = i | 6 | (fetVar.g(jufVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                g4d g4dVar = new g4d(fArrA);
                fetVar.o0(g4dVar);
                objP = g4dVar;
            }
            float[] fArr = ((g4d) objP).f10660a;
            boolean z = jufVar.b && jufVar.c;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player_static_white60, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), "CUPHEAD_PLAYER_IMAGE");
            String str = jufVar.f17150a;
            if (z) {
                h4dVar = null;
            } else {
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArr));
                h4dVar2.b = fArr;
                h4dVar = h4dVar2;
            }
            k7x.b(str, null, mm40VarE0, pm80VarF, pm80VarF, null, null, null, null, null, null, h4dVar, fetVar, 36912, 0, 28640);
            if (z) {
                fetVar.e0(-2114394604);
                zx7Var2 = zx7Var;
                j0x.b(a8k0.F(R.drawable.ic_glyph_crown, 0, fetVar), null, o2e.e0(jr8.f16991a.b(s5x0.J(jm40Var, 2.0f), zx7Var2), "CUPHEAD_PLAYER_IMAGE_CROWN"), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar.r(false);
            } else {
                zx7Var2 = zx7Var;
                fetVar.e0(-2114080047);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            zx7Var2 = zx7Var;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, jufVar, zx7Var2, i, (byte) 24);
        }
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1306531225);
        byte b = 2;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((vuh) l7m0Var.getValue()).c();
            j9m0 j9m0VarB = ((vuh) l7m0Var.getValue()).b();
            boolean zA = ((vuh) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, b);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(-2080019979, new xs4(l7m0Var, function1, (byte) 21), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, b2);
        }
    }

    public static final void f(mm40 mm40Var, szh szhVar, Function1 function1, Function0 function0, fet fetVar) {
        function1.getClass();
        function0.getClass();
        if (szhVar.equals(rzh.f31360a)) {
            fetVar.e0(-115113948);
            g(0, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(szhVar instanceof qzh)) {
                throw b1j.f(-115115814, fetVar, false);
            }
            fetVar.e0(-115110736);
            x(mm40Var, (qzh) szhVar, function1, function0, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(208913604);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            nnw0.g(mm40Var2, null, false, vbw0.b, fetVar2, (i2 & 14) | 3072, 6);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var2, i, (byte) 29);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        zcl zclVar = qmk.f28987a;
        qw3 qw3Var = new qw3(0.0f, true, new jf4((byte) 14));
        if ((i2 & 4) != 0) {
            ugdVar = null;
        }
        if ((i2 & 16) != 0) {
            ugdVar3 = null;
        }
        x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 0);
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
        mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
        y5d y5dVar = y5d.f42040a;
        if (ugdVar == null) {
            fetVar.e0(-1878573585);
        } else {
            fetVar.e0(2017610834);
            ugdVar.j(y5dVar, mm40VarW, fetVar, Integer.valueOf((i & 896) | 54));
        }
        fetVar.r(false);
        ugdVar2.j(y5dVar, mm40VarW, fetVar, 438);
        if (ugdVar3 == null) {
            fetVar.e0(-1878469425);
        } else {
            fetVar.e0(2017614194);
            ugdVar3.j(y5dVar, mm40VarW, fetVar, Integer.valueOf(((i >> 6) & 896) | 54));
        }
        fetVar.r(false);
        fetVar.r(true);
    }

    public static final void i(val valVar, sek sekVar, bek bekVar, z5s z5sVar, amw amwVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        valVar.getClass();
        sekVar.getClass();
        bekVar.getClass();
        amwVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(-738737076);
        byte b = 2;
        int i2 = i | (fetVar.g(valVar) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(amwVar) ? 16384 : 8192) | (fetVar.g(xexVar) ? 131072 : 65536) | (fetVar.g(cyberBottomSheetParams) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 29360128 & i2;
            boolean z = i3 == 8388608;
            Object objP = fetVar.P();
            boolean z2 = z;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new p3l(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 8388608;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new p3l(function1, b);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = valVar.f37094a;
            l7m0 l7m0Var2 = valVar.b;
            l7m0 l7m0Var3 = valVar.c;
            l7m0 l7m0Var4 = valVar.d;
            l7m0 l7m0Var5 = valVar.e;
            l7m0 l7m0Var6 = valVar.f;
            l7m0 l7m0Var7 = valVar.g;
            boolean z4 = i3 == 8388608;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new p3l(function1, (byte) 3);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z5 = i3 == 8388608;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new p3l(function1, (byte) 4);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z6 = i3 == 8388608;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new p3l(function1, (byte) 5);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z7 = i3 == 8388608;
            Object objP6 = fetVar.P();
            if (z7 || objP6 == cl5Var) {
                objP6 = new p3l(function1, (byte) 6);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z8 = i3 == 8388608;
            Object objP7 = fetVar.P();
            if (z8 || objP7 == cl5Var) {
                objP7 = new ynk(function1, (byte) 14);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z9 = i3 == 8388608;
            Object objP8 = fetVar.P();
            boolean z10 = z9;
            byte b3 = 15;
            if (z10 || objP8 == cl5Var) {
                objP8 = new ynk(function1, b3);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z11 = i3 == 8388608;
            Object objP9 = fetVar.P();
            if (z11 || objP9 == cl5Var) {
                objP9 = new ynk(function1, (byte) 9);
                fetVar.o0(objP9);
            }
            Function1 function8 = (Function1) objP9;
            boolean z12 = i3 == 8388608;
            Object objP10 = fetVar.P();
            if (z12 || objP10 == cl5Var) {
                objP10 = new ynk(function1, (byte) 10);
                fetVar.o0(objP10);
            }
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(1262189593, new rgh(function1, amwVar, (byte) 8), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 15) & 126, 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6((Object) valVar, sekVar, bekVar, z5sVar, (Object) amwVar, (Object) xexVar, (Object) cyberBottomSheetParams, function1, i, (byte) 2);
        }
    }

    public static final void j(mm40 mm40Var, wul wulVar, wul wulVar2, wul wulVar3, long j, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        long j2;
        vul vulVar = vul.f38053a;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1699989144);
        int i2 = i | (fetVar.e(1) ? 32 : 16) | (fetVar.g(wulVar) ? 256 : 128) | (fetVar.g(wulVar2) ? 2048 : 1024) | (fetVar.g(wulVar3) ? 16384 : 8192) | 196608 | (fetVar.i(function0) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304) | (fetVar.i(function2) ? 67108864 : 33554432);
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            j2 = y3d.f;
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var2, j2, jd8.n);
            i4 i4VarG0 = dyb.g0(wulVar, wulVar2, wulVar3);
            boolean z = ((i2 & 3670016) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sw8((Object) function0, (Object) function1, (Object) function2, (byte) 29);
                fetVar.o0(objP);
            }
            fetVar.e0(-1601957631);
            j120.j(0, fetVar, i4VarG0, mm40VarQ, (Function1) objP);
            fetVar.r(false);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ixr0(mm40Var2, wulVar, wulVar2, wulVar3, j2, function0, function1, function2, i);
        }
    }

    public static final void k(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-1345066074);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarK, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i3 >> 3) & 14, 0, 131064);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var2, str, i, i2, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, boolean z, fet fetVar, int i) {
        int i2;
        String str5;
        a4x a4xVar3;
        String str6;
        kpm kpmVar2;
        k6z k6zVar;
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        fetVar.g0(-1980972323);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str5 = str;
            i2 |= fetVar.g(str5) ? 32 : 16;
        } else {
            str5 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            a4xVar3 = a4xVar;
            i2 |= fetVar.g(a4xVar3) ? 2048 : 1024;
        } else {
            a4xVar3 = a4xVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(a4xVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str6 = str4;
            i2 |= fetVar.g(str6) ? 1048576 : 524288;
        } else {
            str6 = str4;
        }
        if ((12582912 & i) == 0) {
            kpmVar2 = kpmVar;
            i2 |= fetVar.g(kpmVar2) ? 8388608 : 4194304;
        } else {
            kpmVar2 = kpmVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.h(z) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            if (z) {
                fetVar.e0(-1043877468);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1043876544);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(104326685, new ctm(mm40Var, str5, a4xVar3, kpmVar2, str3, str6, z, str2, a4xVar2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcc(mm40Var, str, str2, a4xVar, a4xVar2, str3, str4, kpmVar, z, i);
        }
    }

    public static final void m(mm40 mm40Var, b2o0 b2o0Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Object obj;
        float f;
        ugd ugdVarM;
        b2o0Var.getClass();
        function1.getClass();
        fetVar.g0(1669897931);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(b2o0Var) ? 32 : 16;
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
            if (b2o0Var instanceof w1o0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, b2o0Var, (byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            if (b2o0Var instanceof y1o0) {
                fetVar.e0(-676159740);
                ugdVarM = u1c.M(907900818, new mxm(b2o0Var, (byte) 7), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-676042405);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarW, f, 0L, ugdVarM, u1c.M(17339628, new wvm(b2o0Var, function1, (byte) 19), fetVar), u1c.M(969171467, new jv1((Object) b2o0Var, z, (byte) 15), fetVar), u1c.M(1921003306, new i4a0((Object) b2o0Var, z, (Object) function1, obj, (byte) 26), fetVar), fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) b2o0Var, z, function1, (wdr) function2, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, c2o0 c2o0Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        c2o0Var.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            function2 = null;
        }
        if (c2o0Var instanceof b2o0) {
            fetVar.e0(221612126);
            mm40 mm40Var2 = mm40Var;
            m(mm40Var2, (b2o0) c2o0Var, z, function1, function2, fetVar, i & 65534);
            fetVar.r(false);
            return;
        }
        mm40 mm40Var3 = mm40Var;
        Function1 function3 = function2;
        boolean z2 = z;
        if (!(c2o0Var instanceof v1o0)) {
            throw b1j.f(1946809699, fetVar, false);
        }
        fetVar.e0(221914686);
        nkb.j(mm40Var3, (v1o0) c2o0Var, z2, function1, function3, fetVar, i & 65534);
        fetVar.r(false);
    }

    public static final void o(xcz xczVar, int i, boolean z, Function0 function0, fet fetVar, int i2) {
        int i3;
        xczVar.getClass();
        function0.getClass();
        fetVar.g0(1152392325);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xczVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
            boolean zG = ((i3 & 14) == 4) | ((i3 & 112) == 32) | fetVar.g(pz40VarF) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                fs fsVar = new fs((Object) xczVar, i, (Object) function0, (Object) pz40VarF, (yje) null, (byte) 3);
                fetVar.o0(fsVar);
                objP = fsVar;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sda(xczVar, i, z, function0, i2, (byte) 2);
        }
    }

    public static final void p(mm40 mm40Var, final j3w j3wVar, fet fetVar, int i) {
        j3wVar.getClass();
        fetVar.g0(1518239084);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(j3wVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hmw0.j(o7k0.d(mm40Var, 1.0f), u1c.M(-67177092, new Function2() { // from class: a.opo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    jm40 jm40Var = jm40.b;
                    j3w j3wVar2 = j3wVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(j3wVar2.f15854a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                v8q0.a(j3wVar2.b, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), fetVar3, 48, 24960, 110588);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-461580931, new Function2() { // from class: a.opo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    jm40 jm40Var = jm40.b;
                    j3w j3wVar2 = j3wVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(j3wVar2.f15854a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                v8q0.a(j3wVar2.b, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), fetVar3, 48, 24960, 110588);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, j3wVar, i, (byte) 22);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-266692379);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40Var, 120.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 27);
        }
    }

    public static final void r(mm40 mm40Var, String str, String str2, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1118159017);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            int i3 = i2 >> 3;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "HEAD_TO_HEAD_FIRST_TEAM_ICON"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, (i3 & 14) | 36912, 0, 32736);
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "HEAD_TO_HEAD_FIRST_TEAM_WIN"), j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, ((i2 >> 6) & 14) | (i3 & 896), 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnv(mm40Var, str, str2, j, i, (byte) 0);
        }
    }

    public static final void s(w1z w1zVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        w1zVar.getClass();
        boolean z = w1zVar.i;
        function1.getClass();
        fetVar2.g0(-539043290);
        int i2 = i | (fetVar2.g(w1zVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            ib30 ib30Var = w1zVar.h;
            zcl zclVar = qmk.f28987a;
            float f = z ? 0.0f : 2.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7), 1.0f), 68.0f), b5x.Q(z));
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarJ, staticColors.m73getBlack400d7_KjU(), jd8.n), 8.0f, 6.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gmo(function1, w1zVar, (byte) 29);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.Y(mm40VarK, false, null, null, (Function0) objP, 15), "HeadToHeadMatchTestTag");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            o5n0.h(ib30Var.f14468a, fetVar2, 0);
            x7z x7zVar = new x7z(1.0f, true);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
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
            yx7 yx7Var = gqw0.k;
            r(zhg0Var.b(yx7Var, mm40VarA), w1zVar.b, w1zVar.c, w1zVar.d, fetVar2, 0);
            nkb.o(o2e.e0(zhg0Var.b(yx7Var, zhg0Var.a(1.0f, jm40Var, true)), "HEAD_TO_HEAD_MATCH_INFO"), ib30Var, fetVar2, 0);
            w(zhg0Var.b(yx7Var, zhg0Var.a(1.0f, jm40Var, true)), w1zVar.e, w1zVar.f, w1zVar.g, fetVar2, 0);
            fetVar2.r(true);
            v8q0.a(ib30Var.d, o2e.e0(jm40Var, "HEAD_TO_HEAD_MATCH_DATE"), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(w1zVar, function1, i, (byte) 9);
        }
    }

    public static final void t(mm40 mm40Var, b6m b6mVar, Function1 function1, fet fetVar, int i) {
        int i2;
        b6mVar.getClass();
        function1.getClass();
        fetVar.g0(1955865266);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(b6mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
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
            z5n.h(b6mVar.b, b6mVar.f2062a, aoo0.d, b6mVar.c, a6n.f324a, false, function1, fetVar, ((i2 << 12) & 3670016) | 221568, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) b6mVar, (Object) function1, i, (byte) 10);
        }
    }

    public static final void u(mm40 mm40Var, long j, long j2, Function0 function0, fet fetVar, int i) {
        long j3;
        long j4;
        long primary;
        long background;
        int i2;
        long j5;
        long j6;
        function0.getClass();
        fetVar.g0(-267530075);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | 144 | (fetVar.i(function0) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                androidx.compose.runtime.d dVar = zaq0.b;
                primary = ((ThemeColors) fetVar.k(dVar)).getPrimary();
                background = ((ThemeColors) fetVar.k(dVar)).getBackground();
                i2 = i3 & (-1009);
            } else {
                fetVar.X();
                i2 = i3 & (-1009);
                primary = j;
                background = j2;
            }
            fetVar.s();
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new dbn(function0, (byte) 18);
                fetVar.o0(objP);
            }
            Function0 function1 = (Function0) objP;
            boolean zG = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new r3w(function1, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40Var, true, (Function1) objP2);
            boolean zG2 = fetVar.g(function1) | fetVar.f(background) | fetVar.f(primary);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                j5 = primary;
                j6 = background;
                Object n2dVar = new n2d(function1, j6, j5, (byte) 1);
                fetVar.o0(n2dVar);
                objP3 = n2dVar;
            } else {
                j5 = primary;
                j6 = background;
            }
            p8a.k(mm40VarA, (Function1) objP3, fetVar, 0);
            j4 = j6;
            j3 = j5;
        } else {
            fetVar.X();
            j3 = j;
            j4 = j2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c3q(mm40Var, j3, j4, function0, i, (byte) 1);
        }
    }

    public static final void v(mm40 mm40Var, String str, a4x a4xVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        float f;
        fetVar.g0(-265405076);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            if (a4xVar.size() <= 3) {
                zcl zclVar = qmk.f28987a;
                f = 2.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = -12.0f;
            }
            mm40 mm40VarG = o7k0.g(o7k0.d(mm40Var, 1.0f), 104.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-792977546, new etm(f, xx7Var, a4xVar, b), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ftm(mm40Var, str, a4xVar, z, i, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, String str, String str2, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1712696521);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
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
            int i3 = (i2 >> 6) & 14;
            int i4 = i2 >> 3;
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), "HEAD_TO_HEAD_SECOND_TEAM_WIN"), j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, i3 | (i4 & 896), 0, 131064);
            fetVar2 = fetVar;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "HEAD_TO_HEAD_SECOND_TEAM_ICON"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, (i4 & 14) | 36912, 0, 32736);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnv(mm40Var, str, str2, j, i, (byte) 1);
        }
    }

    public static final void x(mm40 mm40Var, qzh qzhVar, final Function1 function1, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        y9q0 y9q0VarJ;
        int i2;
        Object obj;
        kml kmlVarK;
        w6k w6kVar;
        List list;
        pz40 pz40Var;
        cgk0 cgk0Var;
        fet fetVar3 = fetVar;
        i4 i4Var = qzhVar.d;
        fetVar3.g0(-1728244673);
        int i3 = ((i & 6) == 0 ? (fetVar3.g(mm40Var) ? 4 : 2) | i : i) | (fetVar3.g(qzhVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= fetVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar3.i(function0) ? 2048 : 1024;
        }
        if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar3);
                fetVar3.o0(objP);
            }
            vne vneVar = (vne) objP;
            w6k w6kVar2 = (w6k) fetVar3.k(bmd.h);
            int i4 = ((Configuration) fetVar3.k(dy2.f6873a)).screenWidthDp;
            g1t0 g1t0Var = (g1t0) fetVar3.k(j1t0.e);
            boolean zE = fetVar3.e(i4);
            Object objP2 = fetVar3.P();
            if (zE || objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = twn.j(i4 < 560 ? 22.0f : 36.0f, fetVar3);
            }
            final float f = ((ycl) objP2).f42389a;
            boolean zE2 = fetVar3.e(i4);
            Object objP3 = fetVar3.P();
            if (zE2 || objP3 == cl5Var) {
                if (i4 < 560) {
                    g1t0Var.getClass();
                    y9q0VarJ = g1t0.d();
                } else {
                    g1t0Var.getClass();
                    y9q0VarJ = g1t0.j();
                }
                objP3 = y9q0VarJ;
                fetVar3.o0(objP3);
            }
            final y9q0 y9q0Var = (y9q0) objP3;
            Object[] objArr = new Object[0];
            Object objP4 = fetVar3.P();
            if (objP4 == cl5Var) {
                objP4 = new xal((byte) 22);
                fetVar3.o0(objP4);
            }
            cgk0 cgk0Var2 = (cgk0) e9x.Q(objArr, (Function0) objP4, fetVar3, 48);
            Object objP5 = fetVar3.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP5);
            }
            final pz40 pz40Var2 = (pz40) objP5;
            boolean zG = fetVar3.g(i4Var);
            Object objP6 = fetVar3.P();
            if (zG || objP6 == cl5Var) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = i4Var.listIterator(0);
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    ListIterator listIterator2 = listIterator;
                    int i5 = i3;
                    if (hashSet.add(Long.valueOf(((ezh) next).f8671a))) {
                        arrayList.add(next);
                    }
                    listIterator = listIterator2;
                    i3 = i5;
                }
                i2 = i3;
                fetVar3.o0(arrayList);
                obj = arrayList;
            } else {
                i2 = i3;
                obj = objP6;
            }
            List list2 = (List) obj;
            Object[] objArr2 = new Object[0];
            Object objP7 = fetVar3.P();
            if (objP7 == cl5Var) {
                objP7 = new xal((byte) 23);
                fetVar3.o0(objP7);
            }
            pz40 pz40Var3 = (pz40) e9x.Q(objArr2, (Function0) objP7, fetVar3, 48);
            boolean zG2 = fetVar3.g(list2);
            Object objP8 = fetVar3.P();
            Object obj2 = objP8;
            if (zG2 || objP8 == cl5Var) {
                int iA = wp20.a(r3d.q(list2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    Object next2 = it.next();
                    linkedHashMap.put(String.valueOf(((ezh) next2).f8671a), next2);
                }
                fetVar3.o0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            Map map = (Map) obj2;
            boolean zG3 = fetVar3.g((List) pz40Var3.getValue()) | fetVar3.g(list2);
            Object objP9 = fetVar3.P();
            if (zG3 || objP9 == cl5Var) {
                if (((List) pz40Var3.getValue()).size() != 9) {
                    kmlVarK = K(list2);
                } else {
                    List list3 = (List) pz40Var3.getValue();
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!map.containsKey((String) it2.next())) {
                                    kmlVarK = K(list2);
                                }
                            }
                        }
                    }
                    List listSubList = ((List) pz40Var3.getValue()).subList(0, 3);
                    ArrayList arrayList2 = new ArrayList(r3d.q(listSubList, 10));
                    Iterator it3 = listSubList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add((ezh) xp20.d(map, (String) it3.next()));
                    }
                    i4 i4VarR0 = dyb.r0(arrayList2);
                    List listSubList2 = ((List) pz40Var3.getValue()).subList(3, 6);
                    ArrayList arrayList3 = new ArrayList(r3d.q(listSubList2, 10));
                    Iterator it4 = listSubList2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add((ezh) xp20.d(map, (String) it4.next()));
                    }
                    i4 i4VarR1 = dyb.r0(arrayList3);
                    List listSubList3 = ((List) pz40Var3.getValue()).subList(6, 9);
                    ArrayList arrayList4 = new ArrayList(r3d.q(listSubList3, 10));
                    Iterator it5 = listSubList3.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((ezh) xp20.d(map, (String) it5.next()));
                    }
                    kmlVarK = new kml(i4VarR0, i4VarR1, dyb.r0(arrayList4));
                }
                objP9 = androidx.compose.runtime.e.e(kmlVarK);
                fetVar3.o0(objP9);
            }
            pz40 pz40Var4 = (pz40) objP9;
            final pzh pzhVarN = N(((kml) pz40Var4.getValue()).f18545a, fetVar3);
            final pzh pzhVarN2 = N(((kml) pz40Var4.getValue()).b, fetVar3);
            final pzh pzhVarN3 = N(((kml) pz40Var4.getValue()).c, fetVar3);
            boolean zG4 = fetVar3.g(pzhVarN) | fetVar3.g(pzhVarN2) | fetVar3.g(pzhVarN3);
            Object objP10 = fetVar3.P();
            if (zG4 || objP10 == cl5Var) {
                objP10 = q3d.j(pzhVarN, pzhVarN2, pzhVarN3);
                fetVar3.o0(objP10);
            }
            List list4 = (List) objP10;
            Object[] objArr3 = new Object[0];
            Object objP11 = fetVar3.P();
            if (objP11 == cl5Var) {
                objP11 = new xal((byte) 24);
                fetVar3.o0(objP11);
            }
            pz40 pz40Var5 = (pz40) e9x.Q(objArr3, (Function0) objP11, fetVar3, 48);
            final l7m0 l7m0VarM = M(pzhVarN.b, fetVar3);
            final l7m0 l7m0VarM2 = M(pzhVarN2.b, fetVar3);
            final l7m0 l7m0VarM3 = M(pzhVarN3.b, fetVar3);
            kml kmlVar = (kml) pz40Var4.getValue();
            boolean zG5 = fetVar3.g(pz40Var4) | fetVar3.g(pz40Var3);
            Object objP12 = fetVar3.P();
            yje yjeVar = null;
            if (zG5 || objP12 == cl5Var) {
                objP12 = new z2g(pz40Var4, pz40Var3, yjeVar, (byte) 1);
                fetVar3.o0(objP12);
            }
            m0x0.t(fetVar3, kmlVar, (Function2) objP12);
            Boolean bool = (Boolean) pz40Var5.getValue();
            bool.getClass();
            Integer numValueOf = Integer.valueOf(cgk0Var2.l());
            boolean zG6 = fetVar3.g(pz40Var5) | fetVar3.g(cgk0Var2) | fetVar3.g(w6kVar2) | fetVar3.i(list4);
            Object objP13 = fetVar3.P();
            if (zG6 || objP13 == cl5Var) {
                objP13 = new pml(w6kVar2, list4, pz40Var5, cgk0Var2, pz40Var2, null);
                w6kVar = w6kVar2;
                list = list4;
                pz40Var = pz40Var5;
                cgk0Var = cgk0Var2;
                fetVar3.o0(objP13);
            } else {
                pz40Var = pz40Var5;
                cgk0Var = cgk0Var2;
                w6kVar = w6kVar2;
                list = list4;
            }
            m0x0.v(bool, numValueOf, (Function2) objP13, fetVar3);
            Integer numValueOf2 = Integer.valueOf(cgk0Var.l());
            boolean zG7 = fetVar3.g(cgk0Var) | fetVar3.g(w6kVar) | fetVar3.i(list);
            Object objP14 = fetVar3.P();
            if (zG7 || objP14 == cl5Var) {
                objP14 = new qml(w6kVar, list, cgk0Var, null);
                fetVar3.o0(objP14);
            }
            m0x0.t(fetVar3, numValueOf2, (Function2) objP14);
            Unit unit = Unit.f46060a;
            pz40 pz40Var6 = pz40Var;
            boolean zG8 = fetVar3.g(pz40Var6);
            Object objP15 = fetVar3.P();
            if (zG8 || objP15 == cl5Var) {
                objP15 = new cw7(pz40Var2, pz40Var6, (byte) 5);
                fetVar3.o0(objP15);
            }
            m0x0.o(unit, (Function1) objP15, fetVar3);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            final w6k w6kVar3 = w6kVar;
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(ua80.d(jm40Var, 8.0f, fetVar3, jm40Var, 1.0f), 8.0f, 0.0f, 2);
            String str = qzhVar.f29577a;
            long textPrimary = ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary();
            zx7 zx7Var = gqw0.e;
            y9q0 y9q0VarA = y9q0.a(g1t0.q(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.w, new rw90(false), null, 16121855);
            final List list5 = list;
            long j = qmk.u;
            long j2 = qmk.q;
            final cgk0 cgk0Var3 = cgk0Var;
            kc5.N(str, mm40VarL, textPrimary, null, null, 0L, j2, j, null, null, 0L, zx7Var, 2, false, 2, 0, true, null, y9q0VarA, 0.0f, fetVar, 0, 102263808, 0, 2793272);
            kc5.N(qzhVar.b, s5x0.L(ua80.d(jm40Var, 8.0f, fetVar, jm40Var, 1.0f), 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, null, 0L, j2, qmk.r, null, null, 0L, zx7Var, 2, false, 3, 0, true, null, y9q0.a(g1t0.n(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.t, new rw90(false), null, 16121855), 0.0f, fetVar, 0, 102263808, 0, 2793272);
            qxw.o(fetVar, o7k0.e(jm40Var, 16.0f));
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1270545803, new Function2() { // from class: a.nml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    fet fetVar4 = (fet) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (fetVar4.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        mm40 mm40VarO = ny9.O(1.6f, o7k0.d(jm40.b, 1.0f), false);
                        zcl zclVar3 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        nnw0.g(s5x0.L(i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarO), ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 6.0f, 0.0f, 2), null, false, u1c.M(1746045771, new oml(w6kVar3, cgk0Var3, list5, pzhVarN, l7m0VarM, pzhVarN2, l7m0VarM2, pzhVarN3, l7m0VarM3, f, y9q0Var, function1, pz40Var2), fetVar4), fetVar4, 3072, 6);
                    } else {
                        fetVar4.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 0.0f, 2.0f, 5);
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(qzhVar.c), !((Boolean) pz40Var2.getValue()).booleanValue(), false, false);
            boolean zI = fetVar.i(vneVar) | ((i2 & 7168) == 2048) | fetVar.i(list2) | fetVar.g(pz40Var4) | fetVar.g(pz40Var3) | fetVar.g(w6kVar3) | fetVar.g(cgk0Var3) | fetVar.i(list5);
            Object objP16 = fetVar.P();
            if (zI || objP16 == cl5Var) {
                b87 b87Var = new b87(vneVar, function0, list2, w6kVar3, list5, pz40Var4, pz40Var3, cgk0Var3, pz40Var2, (byte) 1);
                fetVar.o0(b87Var);
                objP16 = b87Var;
            }
            fet fetVar4 = fetVar;
            qzb.n(mm40VarN, wulVar, (Function0) objP16, fetVar4, 0, 0);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 1, i, mm40Var, qzhVar, function1, function0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(xcz xczVar, float f, zje zjeVar) {
        sml smlVar;
        if (zjeVar instanceof sml) {
            smlVar = (sml) zjeVar;
            int i = smlVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                smlVar.j = i - Integer.MIN_VALUE;
            } else {
                smlVar = new sml(zjeVar);
            }
        } else {
            smlVar = new sml(zjeVar);
        }
        Object obj = smlVar.i;
        wne wneVar = wne.f39444a;
        int i2 = smlVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            Integer num = new Integer(si30.b(f));
            Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 == null) {
                return Unit.f46060a;
            }
            int iIntValue = num2.intValue();
            int i3 = xczVar.i() % iIntValue;
            if (i3 == 0) {
                return Unit.f46060a;
            }
            int i4 = i3 + i3 <= iIntValue ? -i3 : iIntValue - i3;
            smlVar.j = 1;
            if (bww.T(xczVar, i4, smlVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:25:0x0090->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(List list, float f, lml lmlVar, zje zjeVar) {
        tml tmlVar;
        float fFloatValue;
        List list2;
        float f2;
        Iterator it;
        float f3;
        pzh pzhVar;
        if (zjeVar instanceof tml) {
            tmlVar = (tml) zjeVar;
            int i = tmlVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmlVar.n = i - Integer.MIN_VALUE;
            } else {
                tmlVar = new tml(zjeVar);
            }
        } else {
            tmlVar = new tml(zjeVar);
        }
        Object obj = tmlVar.m;
        wne wneVar = wne.f39444a;
        int i2 = tmlVar.n;
        if (i2 == 0) {
            z1x.P(obj);
            if (f <= 0.0f) {
                return Unit.f46060a;
            }
            fFloatValue = ((Number) lmlVar.d.get(0)).floatValue() / ((Number) ((List) lmlVar.b.get(0)).get(0)).intValue();
            vml vmlVar = new vml(list, lmlVar, fFloatValue, f, null);
            tmlVar.i = list;
            tmlVar.k = f;
            tmlVar.l = fFloatValue;
            tmlVar.n = 1;
            if (d5c.J(tmlVar, vmlVar) != wneVar) {
                list2 = list;
                f2 = f;
            }
            return wneVar;
        }
        if (i2 == 1) {
            float f4 = tmlVar.l;
            f2 = tmlVar.k;
            List list3 = tmlVar.i;
            z1x.P(obj);
            fFloatValue = f4;
            list2 = list3;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = tmlVar.l;
            f2 = tmlVar.k;
            it = tmlVar.j;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            pzhVar = (pzh) it.next();
            tmlVar.i = null;
            tmlVar.j = it;
            tmlVar.k = f2;
            tmlVar.l = f3;
            tmlVar.n = 2;
            if (L(pzhVar, tmlVar) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
        it = list2.iterator();
        f3 = fFloatValue;
        while (it.hasNext()) {
            pzhVar = (pzh) it.next();
            tmlVar.i = null;
            tmlVar.j = it;
            tmlVar.k = f2;
            tmlVar.l = f3;
            tmlVar.n = 2;
            if (L(pzhVar, tmlVar) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
