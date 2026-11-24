package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x530 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40295a;
    public final /* synthetic */ b630 b;

    public /* synthetic */ x530(b630 b630Var, byte b) {
        this.f40295a = b;
        this.b = b630Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v8 java.lang.Object, still in use, count: 2, list:
          (r15v8 java.lang.Object) from 0x006e: PHI (r15 I:??) = (r15v6 java.lang.Object), (r15v8 java.lang.Object) binds: [B:26:0x006d, B:45:0x006e] A[DONT_GENERATE, DONT_INLINE]
          (r15v8 java.lang.Object) from 0x0064: CHECK_CAST (a.gw20) (r15v8 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.f40295a
            a.b630 r14 = r14.b
            switch(r0) {
                case 0: goto L9c;
                default: goto L7;
            }
        L7:
            org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionResultUiModel r15 = (org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionResultUiModel) r15
            a.htz r0 = a.b630.m2
            r15.getClass()
            a.e730 r3 = r14.T0()
            long r0 = r15.f47012a
            a.pek0 r14 = a.ji.b
            int r15 = r15.b
            r14.getClass()
            a.ji[] r14 = a.ji.values()
            int r2 = r14.length
            r4 = 0
        L21:
            r5 = 0
            if (r4 >= r2) goto L2e
            r6 = r14[r4]
            int r7 = r6.f16551a
            if (r7 != r15) goto L2b
            goto L2f
        L2b:
            int r4 = r4 + 1
            goto L21
        L2e:
            r6 = r5
        L2f:
            if (r6 != 0) goto L33
            a.ji r6 = a.ji.UNKNOWN
        L33:
            r2 = r6
            java.util.ArrayList r14 = r3.p
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L3f:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r14.next()
            boolean r6 = r4 instanceof a.gw20
            if (r6 == 0) goto L3f
            r15.add(r4)
            goto L3f
        L51:
            int r14 = r15.size()
            java.util.ListIterator r14 = r15.listIterator(r14)
        L59:
            boolean r15 = r14.hasPrevious()
            if (r15 == 0) goto L6d
            java.lang.Object r15 = r14.previous()
            r4 = r15
            a.gw20 r4 = (a.gw20) r4
            long r6 = r4.b
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L59
            goto L6e
        L6d:
            r15 = r5
        L6e:
            r4 = r15
            a.gw20 r4 = (a.gw20) r4
            if (r4 == 0) goto L99
            a.bvc r14 = a.jiu0.a(r3)
            a.du20 r6 = new a.du20
            a.duj r8 = r3.j
            r12 = 0
            r13 = 13
            r7 = 1
            java.lang.Class<a.duj> r9 = a.duj.class
            java.lang.String r10 = "handleError"
            java.lang.String r11 = "handleError(Ljava/lang/Throwable;)V"
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r7 = r6
            a.mt00 r1 = new a.mt00
            r6 = 18
            r1.<init>(r2, r3, r4, r5, r6)
            r11 = 14
            r8 = 0
            r9 = 0
            r6 = r14
            r10 = r1
            a.sac.V(r6, r7, r8, r9, r10, r11)
        L99:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        L9c:
            a.xhe0 r15 = (a.xhe0) r15
            a.htz r0 = a.b630.m2
            r15.getClass()
            a.vyx r14 = r14.k2
            if (r14 == 0) goto Laa
            r14.s(r15)
        Laa:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x530.invoke(java.lang.Object):java.lang.Object");
    }
}
