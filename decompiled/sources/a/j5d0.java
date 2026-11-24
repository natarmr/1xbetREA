package a;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j5d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15928a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5d0(ugd ugdVar, maf0 maf0Var) {
        this.f15928a = (byte) 15;
        this.c = ugdVar;
        this.b = maf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:280:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:281:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:285:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:291:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:292:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:348:0x08d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x08d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[LOOP:5: B:283:0x08c0->B:350:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v14 java.lang.Object, still in use, count: 2, list:
          (r5v14 java.lang.Object) from 0x08b1: PHI (r5 I:??) = (r5v9 java.lang.Object), (r5v14 java.lang.Object) binds: [B:277:0x08af, B:346:0x08b1] A[DONT_GENERATE, DONT_INLINE]
          (r5v14 java.lang.Object) from 0x08a4: CHECK_CAST (a.pxd0) (r5v14 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j5d0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j5d0(xcz xczVar, a4x a4xVar) {
        this.f15928a = (byte) 18;
        this.b = xczVar;
        this.c = a4xVar;
    }

    public /* synthetic */ j5d0(Object obj, Object obj2, byte b) {
        this.f15928a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ j5d0(Object obj, Object obj2, int i, byte b) {
        this.f15928a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ j5d0(List list, Function0 function0) {
        this.f15928a = (byte) 1;
        this.b = list;
        this.c = function0;
    }
}
