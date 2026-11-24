package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class kun implements v6t0 {
    public static final kun b = new kun(0);
    public static final kun c = new kun(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18918a;

    public /* synthetic */ kun(byte b2) {
        this.f18918a = b2;
    }

    public static a4x a(v5l0 v5l0Var) {
        ull0 ull0Var;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
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
            arrayList.add(new m2g0(new mla(ull0Var)));
        }
        return dyb.o0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    private final Object b(Object obj) {
        x4g0 o4g0Var;
        Object next;
        wmf0 smf0Var;
        y3g0 y3g0Var = (y3g0) obj;
        y3g0Var.getClass();
        v5l0 v5l0Var = y3g0Var.j;
        String str = y3g0Var.b;
        boolean z = y3g0Var.m;
        boolean z2 = y3g0Var.c;
        int i = y3g0Var.g;
        enf0 enf0Var = y3g0Var.d;
        if (ntb.Y(str)) {
            if (enf0Var instanceof cnf0) {
                smf0Var = vmf0.f37672a;
            } else if (enf0Var instanceof anf0) {
                List list = ((anf0) enf0Var).f1149a;
                if (list.isEmpty()) {
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.e;
                    xuzVar.getClass();
                    smf0Var = new smf0(new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.input_query_message_for_search, 0, 0, 0L, 0L, 990));
                } else {
                    smf0Var = new umf0(dyb.o0(list));
                }
            } else {
                if (!(enf0Var instanceof ymf0)) {
                    t9f.b();
                    return null;
                }
                if (agc.M(((ymf0) enf0Var).f42886a)) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    smf0Var = new tmf0(new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                } else {
                    xuz xuzVar3 = pb10.c;
                    pb10 pb10Var3 = pb10.e;
                    xuzVar3.getClass();
                    smf0Var = new smf0(new mdm(xuz.a(pb10Var3, i), null, null, 0, 0, R.string.input_query_message_for_search, 0, 0, 0L, 0L, 990));
                }
            }
            return new a4g0(z2, z, smf0Var);
        }
        List list2 = y3g0Var.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        if (y3g0Var.i == null) {
            return new z3g0(z2, z, new u4g0(a(v5l0Var)));
        }
        whh0 whh0Var = y3g0Var.e;
        n0o0 n0o0VarB = maz.b(new tie0(whh0Var, (byte) 28));
        boolean z3 = whh0Var instanceof khh0;
        if (z3) {
            xuz xuzVar4 = pb10.c;
            pb10 pb10Var4 = pb10.g;
            xuzVar4.getClass();
            o4g0Var = new o4g0(new mdm(xuz.a(pb10Var4, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        } else {
            khh0 khh0Var = z3 ? (khh0) whh0Var : null;
            if ((khh0Var != null ? khh0Var.f18293a : null) instanceof hr30) {
                xuz xuzVar5 = pb10.c;
                pb10 pb10Var5 = pb10.g;
                xuzVar5.getClass();
                o4g0Var = new o4g0(new mdm(xuz.a(pb10Var5, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
            } else if (whh0Var instanceof qhh0) {
                o4g0Var = new u4g0(a(v5l0Var));
            } else if (((Boolean) n0o0VarB.getValue()).booleanValue()) {
                xuz xuzVar6 = pb10.c;
                pb10 pb10Var6 = pb10.e;
                xuzVar6.getClass();
                o4g0Var = new l4g0(new mdm(xuz.a(pb10Var6, i), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
            } else {
                ohh0 ohh0Var = whh0Var instanceof ohh0 ? (ohh0) whh0Var : null;
                List<l2g0> list3 = ohh0Var != null ? ohh0Var.b : null;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                wcb wcbVar = y3g0Var.i;
                ctf0 ctf0Var = y3g0Var.f;
                Set set = y3g0Var.k;
                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                for (l2g0 l2g0Var : list3) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((lok0) next).f20396a != l2g0Var.w);
                    lok0 lok0Var = (lok0) next;
                    boolean zContains = set.contains(Long.valueOf(l2g0Var.f19307a));
                    List list4 = list2;
                    arrayList.add(new m2g0(vdx.g0(l2g0Var, v5l0Var, list4, wcbVar, ctf0Var, zContains, lok0Var != null ? lok0Var.p : false)));
                    list2 = list4;
                }
                o4g0Var = new r4g0(dyb.o0(arrayList), y3g0Var.l);
            }
        }
        return new z3g0(z2, z, o4g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x0169  */
    /* JADX WARN: Code duplicated, block: B:111:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0180  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0204  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:405:0x07ea A[LOOP:8: B:403:0x07e4->B:405:0x07ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:407:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:408:0x0801  */
    /* JADX WARN: Code duplicated, block: B:410:0x0805  */
    /* JADX WARN: Code duplicated, block: B:411:0x080a  */
    /* JADX WARN: Code duplicated, block: B:414:0x0814  */
    /* JADX WARN: Code duplicated, block: B:415:0x0817  */
    /* JADX WARN: Code duplicated, block: B:417:0x081b  */
    /* JADX WARN: Code duplicated, block: B:418:0x081e  */
    /* JADX WARN: Code duplicated, block: B:420:0x0821  */
    /* JADX WARN: Code duplicated, block: B:421:0x0824  */
    /* JADX WARN: Code duplicated, block: B:542:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:544:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:546:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:547:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:549:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:550:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:558:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:562:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:563:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:566:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:568:0x0b9a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:569:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:570:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:573:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:575:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:576:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:578:0x0bb5  */
    /* JADX WARN: Code duplicated, block: B:579:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:582:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:586:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:588:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:590:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:591:0x0bf7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    /* JADX WARN: Code duplicated, block: B:93:0x013f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v92 java.lang.Object, still in use, count: 2, list:
          (r12v92 java.lang.Object) from 0x07c3: PHI (r12 I:??) = (r12v86 java.lang.Object), (r12v92 java.lang.Object) binds: [B:401:0x07c2, B:639:0x07c3] A[DONT_GENERATE, DONT_INLINE]
          (r12v92 java.lang.Object) from 0x07b9: CHECK_CAST (a.lok0) (r12v92 java.lang.Object)
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
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 3226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kun.invoke(java.lang.Object):java.lang.Object");
    }
}
