package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mz0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22628a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz0(long j, CyberGamesPage cyberGamesPage, k1g k1gVar) {
        this.f22628a = (byte) 14;
        this.b = j;
        this.c = cyberGamesPage;
        this.d = k1gVar;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0634  */
    /* JADX WARN: Code duplicated, block: B:182:0x063a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0647  */
    /* JADX WARN: Code duplicated, block: B:185:0x064b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0651  */
    /* JADX WARN: Code duplicated, block: B:188:0x065e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0679  */
    /* JADX WARN: Code duplicated, block: B:197:0x0690  */
    /* JADX WARN: Code duplicated, block: B:204:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:208:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:218:0x06df  */
    /* JADX WARN: Code duplicated, block: B:220:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:224:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:226:0x0706  */
    /* JADX WARN: Code duplicated, block: B:231:0x0735  */
    /* JADX WARN: Code duplicated, block: B:234:0x0764 A[LOOP:9: B:232:0x075e->B:234:0x0764, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x078d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0791  */
    /* JADX WARN: Code duplicated, block: B:241:0x0797  */
    /* JADX WARN: Code duplicated, block: B:242:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:245:0x07c3 A[LOOP:10: B:243:0x07bd->B:245:0x07c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:249:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:296:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x070e A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v13 java.lang.Object, still in use, count: 2, list:
          (r6v13 java.lang.Object) from 0x0630: PHI (r6 I:??) = (r6v4 java.lang.Object), (r6v13 java.lang.Object) binds: [B:177:0x062f, B:290:0x0630] A[DONT_GENERATE, DONT_INLINE]
          (r6v13 java.lang.Object) from 0x0622: CHECK_CAST (a.sfp0) (r6v13 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mz0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ mz0(Object obj, long j, Object obj2, byte b) {
        this.f22628a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    public /* synthetic */ mz0(Object obj, Object obj2, long j, byte b) {
        this.f22628a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
