package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y5w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42067a;
    public final /* synthetic */ n3w b;

    public /* synthetic */ y5w(n3w n3wVar, byte b) {
        this.f42067a = b;
        this.b = n3wVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:6:0x0017, B:7:0x0026, B:9:0x002c, B:15:0x0041, B:17:0x0045), top: B:25:0x0017 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0041: PHI (r2 I:??) = (r2v1 java.lang.Object), (r2v5 java.lang.Object) binds: [B:14:0x0040, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0031: CHECK_CAST (a.n3w) (r2v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.f42067a
            a.n3w r5 = r5.b
            a.x5w r6 = (a.x5w) r6
            switch(r0) {
                case 0: goto L5a;
                default: goto L9;
            }
        L9:
            r6.getClass()
            r5.getClass()
            a.s5w r6 = r6.d
            r6.getClass()
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            java.util.NavigableMap r1 = r6.f31675a     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3e
            r1.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
        L26:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3e
            r3 = r2
            a.n3w r3 = (a.n3w) r3     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.f22868a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r5.f22868a     // Catch: java.lang.Throwable -> L3e
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L26
            goto L41
        L3e:
            r5 = move-exception
            goto L58
        L40:
            r2 = 0
        L41:
            a.n3w r2 = (a.n3w) r2     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L54
            java.util.NavigableMap r1 = r6.f31675a     // Catch: java.lang.Throwable -> L3e
            r1.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.f()     // Catch: java.lang.Throwable -> L3e
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L3e
            r6.a()     // Catch: java.lang.Throwable -> L3e
        L54:
            monitor-exit(r0)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L58:
            monitor-exit(r0)
            throw r5
        L5a:
            r6.getClass()
            r5.getClass()
            a.s5w r6 = r6.d
            r6.getClass()
            java.lang.String r5 = r5.f22868a
            r6.b(r5)
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y5w.invoke(java.lang.Object):java.lang.Object");
    }
}
