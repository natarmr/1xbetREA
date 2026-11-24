package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qua extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ l7m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua(xcz xczVar, l7m0 l7m0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = xczVar;
        this.l = l7m0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l7m0 l7m0Var = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                return new qua(l7m0Var, xczVar, yjeVar);
            default:
                return new qua(xczVar, l7m0Var, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((qua) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[LOOP:1: B:35:0x0095->B:40:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 java.lang.Object, still in use, count: 2, list:
          (r7v6 java.lang.Object) from 0x0078: PHI (r7 I:??) = (r7v2 java.lang.Object), (r7v6 java.lang.Object) binds: [B:27:0x0077, B:49:0x0078] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 java.lang.Object) from 0x0070: CHECK_CAST (a.ncz) (r7v6 java.lang.Object)
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
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            r1 = 0
            a.l7m0 r2 = r9.l
            a.xcz r3 = r9.k
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L3c;
                default: goto Le;
            }
        Le:
            a.wne r0 = a.wne.f39444a
            boolean r7 = r9.j
            if (r7 == 0) goto L1e
            if (r7 != r5) goto L1a
            a.z1x.P(r10)
            goto L39
        L1a:
            a.jf4.n(r4)
            goto L3b
        L1e:
            a.z1x.P(r10)
            a.zie0 r10 = a.z3f0.Y1
            java.lang.Object r10 = r2.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r9.j = r5
            a.v0h0 r2 = a.xcz.y
            java.lang.Object r9 = r3.f(r10, r1, r9)
            if (r9 != r0) goto L39
            r6 = r0
            goto L3b
        L39:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L3b:
            return r6
        L3c:
            a.wne r0 = a.wne.f39444a
            boolean r7 = r9.j
            if (r7 == 0) goto L4e
            if (r7 != r5) goto L49
            a.z1x.P(r10)
            goto Lb9
        L49:
            a.jf4.n(r4)
            goto Lbb
        L4e:
            a.z1x.P(r10)
            java.lang.Object r10 = r2.getValue()
            a.unr r10 = (a.unr) r10
            a.dja r10 = r10.h
            if (r10 == 0) goto Lb9
            a.mcz r4 = r3.j()
            java.util.List r4 = r4.l
            java.util.Iterator r4 = r4.iterator()
        L65:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r4.next()
            r8 = r7
            a.ncz r8 = (a.ncz) r8
            int r8 = r8.p
            if (r8 < 0) goto L65
            goto L78
        L77:
            r7 = r6
        L78:
            a.ncz r7 = (a.ncz) r7
            if (r7 == 0) goto L7e
            java.lang.Object r6 = r7.l
        L7e:
            a.ywj r4 = r3.j
            boolean r4 = r4.a()
            if (r4 != 0) goto Lb9
            if (r6 == r10) goto Lb9
            java.lang.Object r2 = r2.getValue()
            a.unr r2 = (a.unr) r2
            a.a4x r2 = r2.e
            java.util.Iterator r2 = r2.iterator()
            r4 = r1
        L95:
            boolean r6 = r2.hasNext()
            r7 = -1
            if (r6 == 0) goto Lac
            java.lang.Object r6 = r2.next()
            a.cja r6 = (a.cja) r6
            a.dja r6 = r6.getType()
            if (r6 != r10) goto La9
            goto Lad
        La9:
            int r4 = r4 + 1
            goto L95
        Lac:
            r4 = r7
        Lad:
            if (r4 == r7) goto Lb9
            r9.j = r5
            java.lang.Object r9 = r3.l(r4, r1, r9)
            if (r9 != r0) goto Lb9
            r6 = r0
            goto Lbb
        Lb9:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qua.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua(l7m0 l7m0Var, xcz xczVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = l7m0Var;
        this.k = xczVar;
    }
}
