package a;

import android.javax.sip.message.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.domain.models.AggregatorGameLanguage;

/* JADX INFO: loaded from: classes3.dex */
public final class nw8 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24222a = 2;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;

    public nw8(ctf0 ctf0Var, fts0 fts0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(fts0Var.b);
        this.d = bkb.H(Long.valueOf(fts0Var.c));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(fts0Var.h));
        this.e = bkb.H(fts0Var.f);
        this.f = bkb.H(Boolean.valueOf(fts0Var.d));
        this.g = maz.b(new qir0(this, (byte) 23));
        final byte b2 = 0;
        this.h = maz.b(new yw9(new Pair(b(), a()), new Function1(this) { // from class: a.qts0
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x008a  */
            /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:32:0x0104  */
            /* JADX WARN: Code duplicated, block: B:35:0x010c  */
            /* JADX WARN: Code duplicated, block: B:36:0x0140  */
            /* JADX WARN: Code duplicated, block: B:78:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:91:0x00fd A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
                  (r5v6 java.lang.Object) from 0x02af: PHI (r5 I:??) = (r5v3 java.lang.Object), (r5v6 java.lang.Object) binds: [B:75:0x02ae, B:96:0x02af] A[DONT_GENERATE, DONT_INLINE]
                  (r5v6 java.lang.Object) from 0x029f: CHECK_CAST (kotlin.Pair) (r5v6 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 786
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.qts0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 1;
        this.i = maz.b(new yw9(b(), new Function1(this) { // from class: a.qts0
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x008a  */
            /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:32:0x0104  */
            /* JADX WARN: Code duplicated, block: B:35:0x010c  */
            /* JADX WARN: Code duplicated, block: B:36:0x0140  */
            /* JADX WARN: Code duplicated, block: B:78:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:91:0x00fd A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
                  (r5v6 java.lang.Object) from 0x02af: PHI (r5 I:??) = (r5v3 java.lang.Object), (r5v6 java.lang.Object) binds: [B:75:0x02ae, B:96:0x02af] A[DONT_GENERATE, DONT_INLINE]
                  (r5v6 java.lang.Object) from 0x029f: CHECK_CAST (kotlin.Pair) (r5v6 java.lang.Object)
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
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 786
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.qts0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.j = maz.b(new yw9(new Pair(b(), a()), new Function1(this) { // from class: a.qts0
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x008a  */
            /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:32:0x0104  */
            /* JADX WARN: Code duplicated, block: B:35:0x010c  */
            /* JADX WARN: Code duplicated, block: B:36:0x0140  */
            /* JADX WARN: Code duplicated, block: B:78:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:91:0x00fd A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
                  (r5v6 java.lang.Object) from 0x02af: PHI (r5 I:??) = (r5v3 java.lang.Object), (r5v6 java.lang.Object) binds: [B:75:0x02ae, B:96:0x02af] A[DONT_GENERATE, DONT_INLINE]
                  (r5v6 java.lang.Object) from 0x029f: CHECK_CAST (kotlin.Pair) (r5v6 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 786
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.qts0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new g4s0((byte) 28));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new g4s0((byte) 29));
        final byte b4 = 3;
        this.m = maz.b(new yw9(new Pair(b(), a()), new Function1(this) { // from class: a.qts0
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x008a  */
            /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:32:0x0104  */
            /* JADX WARN: Code duplicated, block: B:35:0x010c  */
            /* JADX WARN: Code duplicated, block: B:36:0x0140  */
            /* JADX WARN: Code duplicated, block: B:78:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:91:0x00fd A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
                  (r5v6 java.lang.Object) from 0x02af: PHI (r5 I:??) = (r5v3 java.lang.Object), (r5v6 java.lang.Object) binds: [B:75:0x02ae, B:96:0x02af] A[DONT_GENERATE, DONT_INLINE]
                  (r5v6 java.lang.Object) from 0x029f: CHECK_CAST (kotlin.Pair) (r5v6 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 786
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.qts0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public fee a() {
        return (fee) this.d.getValue();
    }

    public fee b() {
        return (fee) this.c.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        rv8 ov8Var;
        byte b = this.f24222a;
        n0o0 n0o0Var = this.l;
        n0o0 n0o0Var2 = this.c;
        n0o0 n0o0Var3 = this.k;
        n0o0 n0o0Var4 = this.h;
        n0o0 n0o0Var5 = this.j;
        n0o0 n0o0Var6 = this.i;
        n0o0 n0o0Var7 = this.m;
        n0o0 n0o0Var8 = this.g;
        n0o0 n0o0Var9 = this.f;
        n0o0 n0o0Var10 = this.e;
        switch (b) {
            case 0:
                jw8 jw8Var = (jw8) obj;
                jw8Var.getClass();
                fee feeVar = (fee) n0o0Var5.getValue();
                xw8 xw8Var = jw8Var.b;
                feeVar.d(xw8Var);
                fee feeVar2 = (fee) n0o0Var.getValue();
                ux8 ux8Var = jw8Var.f17240a;
                feeVar2.d(ux8Var);
                ((fee) n0o0Var4.getValue()).d(xw8Var);
                ((fee) n0o0Var6.getValue()).d(ux8Var);
                if (ux8Var instanceof tx8) {
                    ov8Var = new qv8(dyb.r0((List) ((fee) n0o0Var7.getValue()).b()));
                } else if ((ux8Var instanceof rx8) && (xw8Var instanceof ww8)) {
                    ov8Var = new pv8((mdm) n0o0Var9.getValue());
                } else if ((ux8Var instanceof qx8) || (xw8Var instanceof vw8)) {
                    List list = (List) ((fee) n0o0Var7.getValue()).b();
                    ov8Var = new ov8(dyb.r0(list), (mtl) n0o0Var10.getValue());
                } else {
                    ov8Var = new pv8((mdm) n0o0Var8.getValue());
                }
                return new ow8((imm) n0o0Var2.getValue(), ov8Var);
            case 1:
                ftr0 ftr0Var = (ftr0) obj;
                ftr0Var.getClass();
                fee feeVar3 = (fee) n0o0Var2.getValue();
                zvh0 zvh0Var = ftr0Var.c;
                feeVar3.d(zvh0Var);
                ((fee) this.d.getValue()).d(ftr0Var.d);
                fee feeVar4 = (fee) n0o0Var10.getValue();
                pur0 pur0Var = ftr0Var.f;
                feeVar4.d(pur0Var);
                ((fee) n0o0Var9.getValue()).d(ftr0Var.f10129a);
                fee feeVar5 = (fee) n0o0Var8.getValue();
                jur0 jur0Var = ftr0Var.h;
                feeVar5.d(jur0Var);
                ((fee) n0o0Var4.getValue()).d(zvh0Var);
                ((fee) n0o0Var5.getValue()).d(ftr0Var.e);
                ((fee) n0o0Var3.getValue()).d(pur0Var);
                ((fee) n0o0Var.getValue()).d(jur0Var);
                fee feeVar6 = (fee) n0o0Var7.getValue();
                feeVar6.getClass();
                pz40 pz40VarA = feeVar6.a();
                ((ftr0) feeVar6.a().getValue()).getClass();
                pz40VarA.setValue(ftr0Var);
                return new d820(ug20.f35603a, new gh00(new p820((wy6) ((fee) n0o0Var9.getValue()).b()), new uwh0(((Number) ((fee) n0o0Var6.getValue()).b()).intValue(), (a4x) ((fee) n0o0Var8.getValue()).b(), (dxh0) ((fee) n0o0Var4.getValue()).b()), new ef6(new g30(), (rw7) ((fee) n0o0Var5.getValue()).b()), (zvj0) ((fee) n0o0Var3.getValue()).b(), (z6c0) ((fee) n0o0Var.getValue()).b(), null, null, 1.0f, null, new qn8((wul) ((fee) n0o0Var7.getValue()).b(), null), null), null, null, 12);
            default:
                fts0 fts0Var = (fts0) obj;
                fts0Var.getClass();
                b().d(fts0Var.b);
                ((fee) n0o0Var10.getValue()).d(fts0Var.f);
                a().d(Long.valueOf(fts0Var.c));
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(fts0Var.d));
                if (((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue()) {
                    return new ots0((mdm) ((fee) n0o0Var3.getValue()).b(), (imm) n0o0Var8.getValue());
                }
                imm immVar = (imm) n0o0Var8.getValue();
                mts0 mts0Var = (mts0) ((fee) n0o0Var7.getValue()).b();
                nss0 nss0Var = (nss0) ((fee) n0o0Var6.getValue()).b();
                hyl hylVar = (hyl) ((fee) n0o0Var5.getValue()).b();
                uss0 uss0Var = (uss0) ((fee) n0o0Var4.getValue()).b();
                vxl vxlVar = vxl.f38204a;
                return new nts0(immVar, mts0Var, nss0Var, hylVar, uss0Var);
        }
    }

    public nw8(ftr0 ftr0Var, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        zvh0 zvh0Var = ftr0Var.c;
        this.c = bkb.H(zvh0Var);
        n0o0 n0o0VarH = bkb.H(ftr0Var.d);
        this.d = n0o0VarH;
        pur0 pur0Var = ftr0Var.f;
        this.e = bkb.H(pur0Var);
        final byte b2 = 0;
        this.f = maz.b(new yw9(ftr0Var.f10129a, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b3 = b2;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b3) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var = new oln0(strA, false, false);
                            xnb0 xnb0Var = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var = new yv6(mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var2 = new oln0(strA, false, false);
                        xnb0 xnb0Var2 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar2 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var2 = new yv6(mx6Var, oln0Var2, xnb0Var2, jkeVar2, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var2, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var2 = (jur0) obj;
                        if (jur0Var2 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var2.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var2.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var2.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var3 = ftr0Var2.h;
                            z7 = jur0Var3 != null ? jur0Var3.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
        jur0 jur0Var = ftr0Var.h;
        this.g = maz.b(new yw9(jur0Var, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b3 = b;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b3) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var2 = new oln0(strA, false, false);
                            xnb0 xnb0Var2 = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar2 = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var2 = new yv6(mx6Var, oln0Var2, xnb0Var2, jkeVar2, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var2, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var3 = new oln0(strA, false, false);
                        xnb0 xnb0Var3 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar3 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var3 = new yv6(mx6Var, oln0Var3, xnb0Var3, jkeVar3, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var3, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var3.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var3.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var3.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var4 = ftr0Var2.h;
                            z7 = jur0Var4 != null ? jur0Var4.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
        this.h = maz.b(new yw9(zvh0Var, new w800((byte) 6), (byte) 20));
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new w800((byte) 7));
        final byte b3 = 2;
        this.j = maz.b(new yw9(ftr0Var.e, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b4 = b3;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b4) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var3 = new oln0(strA, false, false);
                            xnb0 xnb0Var3 = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar3 = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var3 = new yv6(mx6Var, oln0Var3, xnb0Var3, jkeVar3, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var3, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var4 = new oln0(strA, false, false);
                        xnb0 xnb0Var4 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar4 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var4 = new yv6(mx6Var, oln0Var4, xnb0Var4, jkeVar4, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var4, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var3.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var3.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var3.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var4 = ftr0Var2.h;
                            z7 = jur0Var4 != null ? jur0Var4.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.k = maz.b(new yw9(pur0Var, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b5 = b4;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b5) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var4 = new oln0(strA, false, false);
                            xnb0 xnb0Var4 = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar4 = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var4 = new yv6(mx6Var, oln0Var4, xnb0Var4, jkeVar4, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var4, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var5 = new oln0(strA, false, false);
                        xnb0 xnb0Var5 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar5 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var5 = new yv6(mx6Var, oln0Var5, xnb0Var5, jkeVar5, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var5, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var3.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var3.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var3.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var4 = ftr0Var2.h;
                            z7 = jur0Var4 != null ? jur0Var4.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.l = maz.b(new yw9(jur0Var, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b6 = b5;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b6) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var5 = new oln0(strA, false, false);
                            xnb0 xnb0Var5 = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar5 = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var5 = new yv6(mx6Var, oln0Var5, xnb0Var5, jkeVar5, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var5, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var6 = new oln0(strA, false, false);
                        xnb0 xnb0Var6 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar6 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var6 = new yv6(mx6Var, oln0Var6, xnb0Var6, jkeVar6, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var6, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var3.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var3.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var3.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var4 = ftr0Var2.h;
                            z7 = jur0Var4 != null ? jur0Var4.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.m = maz.b(new yw9(ftr0Var, new Function1(this) { // from class: a.ih00
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x01db  */
            /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:71:0x01fb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:84:0x022c  */
            /* JADX WARN: Code duplicated, block: B:86:0x022f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                boolean z;
                String strA;
                String strA2;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                fx6 fx6Var;
                boolean z6;
                boolean z7;
                byte b7 = b6;
                z6c0 z6c0Var = null;
                nw8 nw8Var = this.b;
                switch (b7) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = nw8Var.b;
                        ctf0Var2.getClass();
                        return new uy6(new uf40(new kgs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new c480(tjr0Var.b.b), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false), null));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = nw8Var.b;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA3 = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new mj80(gj80.f11384a, new yvh0(strA3, bwh0Var)));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new mj80(dj80.f6171a, new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var)));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal3 = ((pur0) ((fee) nw8Var.e.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) nw8Var.d.getValue()).c();
                        ctf0 ctf0Var4 = nw8Var.b;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        double d = rm5Var.b;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf((d == 0.0d || bigDecimal3.compareTo(new BigDecimal(String.valueOf(d))) > 0) && rm5Var.f30729a != 0 && ctf0Var4.i()) : null;
                        return new rw7(strC, str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = nw8Var.b;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        BigDecimal bigDecimal4 = rjr0Var.c;
                        boolean z8 = rjr0Var.h;
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        mx6 mx6Var = new mx6(a8q0Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal5 = rjr0Var.b;
                        BigDecimal bigDecimal6 = rjr0Var.d;
                        BigDecimal bigDecimal7 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal5.compareTo(bigDecimal6) < 0 || bigDecimal5.compareTo(bigDecimal7) > 0) && str3.length() != 0) {
                            bigDecimal = bigDecimal7;
                            if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                                double dDoubleValue = bigDecimal6.doubleValue();
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                strA2 = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue, str2, p3u0.c))}, 1));
                            } else {
                                bigDecimal2 = bigDecimal;
                                if (bigDecimal5.compareTo(bigDecimal2) > 0) {
                                    double dDoubleValue2 = bigDecimal2.doubleValue();
                                    int i2 = cy7.f5159a;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    z = true;
                                    strA = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(dDoubleValue2, str2, p3u0.c))}, 1));
                                } else {
                                    z = true;
                                    strA = "";
                                }
                            }
                            oln0 oln0Var6 = new oln0(strA, false, false);
                            xnb0 xnb0Var6 = new xnb0("", "", false);
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bigDecimal5.compareTo(bigDecimal6) > 0 || z8) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (bigDecimal5.compareTo(bigDecimal2) < 0 || z8) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            jke jkeVar6 = new jke(z2, z3, z4, z5);
                            if (z8) {
                                fx6Var = fx6.c;
                            } else {
                                fx6Var = ((bigDecimal5.compareTo(bigDecimal6) >= 0 || bigDecimal5.compareTo(bigDecimal2) > 0) && j83Var.b.length() != 0) ? fx6.b : fx6.f10293a;
                            }
                            yv6 yv6Var6 = new yv6(mx6Var, oln0Var6, xnb0Var6, jkeVar6, fx6Var, str2, true);
                            if (pur0Var2.b.length() > 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new zvj0(yv6Var6, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                        }
                        double dDoubleValue3 = bigDecimal6.doubleValue();
                        bigDecimal = bigDecimal7;
                        double dDoubleValue4 = bigDecimal.doubleValue();
                        int i3 = cy7.f5159a;
                        pn40 pn40Var4 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        strA2 = kng0.l(cy7.e(pn40.d(dDoubleValue3, str2, p3u0Var)), cy7.e(" – "), cy7.e(pn40.d(dDoubleValue4, str2, p3u0Var)));
                        strA = strA2;
                        bigDecimal2 = bigDecimal;
                        z = true;
                        oln0 oln0Var7 = new oln0(strA, false, false);
                        xnb0 xnb0Var7 = new xnb0("", "", false);
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (bigDecimal4.compareTo(BigDecimal.valueOf(0.0d)) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal6) > 0) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (bigDecimal5.compareTo(bigDecimal2) < 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        jke jkeVar7 = new jke(z2, z3, z4, z5);
                        if (z8) {
                            fx6Var = fx6.c;
                        } else {
                            if (bigDecimal5.compareTo(bigDecimal6) >= 0) {
                            }
                        }
                        yv6 yv6Var7 = new yv6(mx6Var, oln0Var7, xnb0Var7, jkeVar7, fx6Var, str2, true);
                        if (pur0Var2.b.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return new zvj0(yv6Var7, new ixo0(z6, lsm0Var2.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), null, lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), new sn7(lak0.c)));
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 != null) {
                            ctf0 ctf0Var6 = nw8Var.b;
                            ctf0Var6.getClass();
                            pz40 pz40Var = jur0Var3.b;
                            lsm0 lsm0Var3 = ctf0Var6.b;
                            z6c0Var = new z6c0(new zyc0(pz40Var, lsm0Var3.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), jur0Var3.c ? vyc0.f38241a : vyc0.b, new tlc0(lak0.c, false), jur0Var3.f17172a ? lsm0Var3.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0)));
                        }
                        return z6c0Var;
                    default:
                        ftr0 ftr0Var2 = (ftr0) obj;
                        ftr0Var2.getClass();
                        ctf0 ctf0Var7 = nw8Var.b;
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        int iOrdinal = ftr0Var2.d.ordinal();
                        if (iOrdinal == 0) {
                            rjr0 rjr0Var2 = ftr0Var2.f.f27632a;
                            BigDecimal bigDecimal8 = rjr0Var2.d;
                            BigDecimal bigDecimal9 = rjr0Var2.e;
                            BigDecimal bigDecimal10 = rjr0Var2.b;
                            z7 = bigDecimal10.compareTo(bigDecimal8) >= 0 && bigDecimal10.compareTo(bigDecimal9) <= 0 && !rjr0Var2.h;
                        } else {
                            if (iOrdinal != 1) {
                                t9f.b();
                                return null;
                            }
                            jur0 jur0Var4 = ftr0Var2.h;
                            z7 = jur0Var4 != null ? jur0Var4.d : false;
                        }
                        return new wul(iulVar, oe9Var, ue9Var, z7, false, true);
                }
            }
        }, (byte) 20));
    }

    public nw8(final jw8 jw8Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = maz.b(new Function0(this) { // from class: a.kw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                nw8 nw8Var = this.b;
                switch (b2) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(nw8Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = nw8Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = nw8Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), hw8.f13758a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), mv8.f22445a)));
                    default:
                        String strA2 = nw8Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.kw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                nw8 nw8Var = this.b;
                switch (b3) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(nw8Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = nw8Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = nw8Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), hw8.f13758a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), mv8.f22445a)));
                    default:
                        String strA2 = nw8Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                }
            }
        });
        final byte b3 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.kw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                nw8 nw8Var = this.b;
                switch (b4) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(nw8Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = nw8Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = nw8Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), hw8.f13758a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), mv8.f22445a)));
                    default:
                        String strA2 = nw8Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                }
            }
        });
        this.f = maz.b(new Function0() { // from class: a.lw8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                jw8 jw8Var2 = jw8Var;
                switch (b4) {
                    case 0:
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        int i = jw8Var2.c;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
                    default:
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        int i2 = jw8Var2.c;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
            }
        });
        this.g = maz.b(new Function0() { // from class: a.lw8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                jw8 jw8Var2 = jw8Var;
                switch (b4) {
                    case 0:
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        int i = jw8Var2.c;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
                    default:
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        int i2 = jw8Var2.c;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
            }
        });
        xw8 xw8Var = jw8Var.b;
        n0o0 n0o0VarH = bkb.H(xw8Var);
        this.h = n0o0VarH;
        ux8 ux8Var = jw8Var.f17240a;
        n0o0 n0o0VarH2 = bkb.H(ux8Var);
        this.i = n0o0VarH2;
        this.j = maz.b(new yw9(xw8Var, new cp8((byte) 9), (byte) 20));
        final byte b4 = 3;
        this.k = maz.b(new Function0(this) { // from class: a.kw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                nw8 nw8Var = this.b;
                switch (b5) {
                    case 0:
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(nw8Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 1:
                        String strA = nw8Var.b.b.a(R.string.languages, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar = new ojm(127);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new hjm(strA, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                    case 2:
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = nw8Var.b;
                        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), hw8.f13758a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), mv8.f22445a)));
                    default:
                        String strA2 = nw8Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0));
                        ojm ojmVar2 = new ojm(127);
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new hjm(strA2, ojmVar2, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
                }
            }
        });
        this.l = maz.b(new yw9(ux8Var, new cp8((byte) 10), (byte) 20));
        bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.mw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b;
                nw8 nw8Var = this.b;
                switch (b5) {
                    case 0:
                        xw8 xw8Var2 = (xw8) obj;
                        pz40 pz40Var = s6t0.f31722a;
                        xw8Var2.getClass();
                        if (((fee) nw8Var.i.getValue()).c() instanceof tx8) {
                            ijm ijmVar = new ijm(new qjm());
                            kjm kjmVar = kjm.f18392a;
                            bv8 bv8Var = bv8.d;
                            zcl zclVar = qmk.f28987a;
                            vv8 vv8Var = new vv8("LANGUAGES_HEADER_SHIMMER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13), bv8Var), ijmVar);
                            cv8 cv8Var = new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8Var);
                            xv8 xv8Var = xv8.f41546a;
                            return q3d.j(vv8Var, new yv8("LANGUAGES_SETTING_CELL_SHIMMER_ID", cv8Var));
                        }
                        if (!(xw8Var2 instanceof vw8)) {
                            return iun.f15405a;
                        }
                        List<AggregatorGameLanguage> list = ((vw8) xw8Var2).f38136a;
                        boolean z = !list.isEmpty() && list.size() <= 6;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        hjm hjmVar = (hjm) nw8Var.d.getValue();
                        kjm kjmVar2 = kjm.f18392a;
                        zcl zclVar2 = qmk.f28987a;
                        lc00VarB.add(new vv8("LANGUAGES_HEADER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13), bv8.d), hjmVar));
                        int size = list.size();
                        boolean z2 = !list.isEmpty() && size <= 6;
                        lc00VarB.add(new wv8("LANGUAGES_SETTING_CELL_ID", new cv8(s5x0.u(z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), z2 ? bv8.f3267a : bv8.c), new rqm((vui0) new tui0(nw8Var.b.b.a(R.string.select_languages, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, size <= 6 ? new fvi0(new y3d(s6t0.b().f33626a.getSecondary())) : new gvi0(new kpe(), size, new y3d(s6t0.b().f33626a.getSecondary())), z2 ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT, (tvi0) null, (wui0) null, false, (e900) null, 490)));
                        if (z) {
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (AggregatorGameLanguage aggregatorGameLanguage : list) {
                                arrayList.add(new lxl(aggregatorGameLanguage.f46282a, (dyl) new xxl(aggregatorGameLanguage.b), false, uxl.f36445a, (cwl) null, 104));
                            }
                            fyl fylVar = new fyl(dyb.r0(arrayList), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                            vxl vxlVar = vxl.f38204a;
                            zcl zclVar3 = qmk.f28987a;
                            lc00VarB.add(new uv8(new cv8(new lh80(16.0f, 8.0f, 16.0f, 16.0f), s5x0.t(0.0f, 0.0f, 3), bv8.b), fylVar));
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    default:
                        ux8 ux8Var2 = (ux8) obj;
                        ux8Var2.getClass();
                        if (ux8Var2 instanceof tx8) {
                            ijm ijmVar2 = new ijm(new qjm());
                            kjm kjmVar3 = kjm.f18392a;
                            bv8 bv8Var2 = bv8.d;
                            zcl zclVar4 = qmk.f28987a;
                            vv8 vv8Var2 = new vv8("SORTING_HEADER_SHIMMER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), bv8Var2), ijmVar2);
                            cv8 cv8Var2 = new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8Var2);
                            xv8 xv8Var2 = xv8.f41546a;
                            return q3d.j(vv8Var2, new yv8("SORTING_SETTING_CELL_SHIMMER_ID", cv8Var2));
                        }
                        ((fee) nw8Var.h.getValue()).c();
                        if (!(ux8Var2 instanceof qx8)) {
                            return iun.f15405a;
                        }
                        hjm hjmVar2 = (hjm) nw8Var.k.getValue();
                        kjm kjmVar4 = kjm.f18392a;
                        zcl zclVar5 = qmk.f28987a;
                        vv8 vv8Var3 = new vv8("SORTING_HEADER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), bv8.d), hjmVar2);
                        String str = ((qx8) ux8Var2).b.f46274a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        return q3d.j(vv8Var3, new wv8("SORTING_SETTING_CELL_ID", new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8.c), new rqm((vui0) new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4d.BACKGROUND_CONTENT, (tvi0) null, wui0.f39793a, false, (e900) null, 426)));
                }
            }
        });
        this.m = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.mw8
            public final /* synthetic */ nw8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b2;
                nw8 nw8Var = this.b;
                switch (b5) {
                    case 0:
                        xw8 xw8Var2 = (xw8) obj;
                        pz40 pz40Var = s6t0.f31722a;
                        xw8Var2.getClass();
                        if (((fee) nw8Var.i.getValue()).c() instanceof tx8) {
                            ijm ijmVar = new ijm(new qjm());
                            kjm kjmVar = kjm.f18392a;
                            bv8 bv8Var = bv8.d;
                            zcl zclVar = qmk.f28987a;
                            vv8 vv8Var = new vv8("LANGUAGES_HEADER_SHIMMER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13), bv8Var), ijmVar);
                            cv8 cv8Var = new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8Var);
                            xv8 xv8Var = xv8.f41546a;
                            return q3d.j(vv8Var, new yv8("LANGUAGES_SETTING_CELL_SHIMMER_ID", cv8Var));
                        }
                        if (!(xw8Var2 instanceof vw8)) {
                            return iun.f15405a;
                        }
                        List<AggregatorGameLanguage> list = ((vw8) xw8Var2).f38136a;
                        boolean z = !list.isEmpty() && list.size() <= 6;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        hjm hjmVar = (hjm) nw8Var.d.getValue();
                        kjm kjmVar2 = kjm.f18392a;
                        zcl zclVar2 = qmk.f28987a;
                        lc00VarB.add(new vv8("LANGUAGES_HEADER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13), bv8.d), hjmVar));
                        int size = list.size();
                        boolean z2 = !list.isEmpty() && size <= 6;
                        lc00VarB.add(new wv8("LANGUAGES_SETTING_CELL_ID", new cv8(s5x0.u(z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), z2 ? bv8.f3267a : bv8.c), new rqm((vui0) new tui0(nw8Var.b.b.a(R.string.select_languages, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, size <= 6 ? new fvi0(new y3d(s6t0.b().f33626a.getSecondary())) : new gvi0(new kpe(), size, new y3d(s6t0.b().f33626a.getSecondary())), z2 ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT, (tvi0) null, (wui0) null, false, (e900) null, 490)));
                        if (z) {
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (AggregatorGameLanguage aggregatorGameLanguage : list) {
                                arrayList.add(new lxl(aggregatorGameLanguage.f46282a, (dyl) new xxl(aggregatorGameLanguage.b), false, uxl.f36445a, (cwl) null, 104));
                            }
                            fyl fylVar = new fyl(dyb.r0(arrayList), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                            vxl vxlVar = vxl.f38204a;
                            zcl zclVar3 = qmk.f28987a;
                            lc00VarB.add(new uv8(new cv8(new lh80(16.0f, 8.0f, 16.0f, 16.0f), s5x0.t(0.0f, 0.0f, 3), bv8.b), fylVar));
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    default:
                        ux8 ux8Var2 = (ux8) obj;
                        ux8Var2.getClass();
                        if (ux8Var2 instanceof tx8) {
                            ijm ijmVar2 = new ijm(new qjm());
                            kjm kjmVar3 = kjm.f18392a;
                            bv8 bv8Var2 = bv8.d;
                            zcl zclVar4 = qmk.f28987a;
                            vv8 vv8Var2 = new vv8("SORTING_HEADER_SHIMMER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), bv8Var2), ijmVar2);
                            cv8 cv8Var2 = new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8Var2);
                            xv8 xv8Var2 = xv8.f41546a;
                            return q3d.j(vv8Var2, new yv8("SORTING_SETTING_CELL_SHIMMER_ID", cv8Var2));
                        }
                        ((fee) nw8Var.h.getValue()).c();
                        if (!(ux8Var2 instanceof qx8)) {
                            return iun.f15405a;
                        }
                        hjm hjmVar2 = (hjm) nw8Var.k.getValue();
                        kjm kjmVar4 = kjm.f18392a;
                        zcl zclVar5 = qmk.f28987a;
                        vv8 vv8Var3 = new vv8("SORTING_HEADER_ID", new cv8(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), bv8.d), hjmVar2);
                        String str = ((qx8) ux8Var2).b.f46274a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        return q3d.j(vv8Var3, new wv8("SORTING_SETTING_CELL_ID", new cv8(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), bv8.c), new rqm((vui0) new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4d.BACKGROUND_CONTENT, (tvi0) null, wui0.f39793a, false, (e900) null, 426)));
                }
            }
        });
    }
}
