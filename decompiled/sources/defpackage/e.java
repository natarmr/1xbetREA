package defpackage;

import a.bnn0;
import a.bzz;
import a.eop;
import a.eze0;
import a.f1b0;
import a.kzj;
import a.mh1;
import a.njr0;
import a.nyf0;
import a.ocf0;
import a.vne;
import a.x1q0;
import a.x5f0;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new e((f) obj2, yjeVar, (byte) 0);
            case 1:
                return new e((mh1) obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new e((kzj) obj2, this.k, yjeVar, (byte) 2);
            case 3:
                return new e((eop) obj2, this.k, yjeVar, (byte) 3);
            case 4:
                return new e((bzz) obj2, yjeVar, (byte) 4);
            case 5:
                return new e((f1b0) obj2, this.k, yjeVar, (byte) 5);
            case 6:
                return new e((eze0) obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new e((x5f0) obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new e((ocf0) obj2, this.k, yjeVar, (byte) 8);
            case 9:
                return new e((nyf0) obj2, this.k, yjeVar, (byte) 9);
            case 10:
                return new e((x1q0) obj2, this.k, yjeVar, (byte) 10);
            default:
                return new e((njr0) obj2, this.k, yjeVar, (byte) 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return ((e) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:320:0x0572  */
    /* JADX WARN: Code duplicated, block: B:323:0x0594  */
    /* JADX WARN: Code duplicated, block: B:326:0x059a  */
    /* JADX WARN: Code duplicated, block: B:329:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:332:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:337:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:339:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:341:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v60 java.lang.Object, still in use, count: 2, list:
          (r3v60 java.lang.Object) from 0x00a8: PHI (r3 I:??) = (r3v56 java.lang.Object), (r3v60 java.lang.Object) binds: [B:38:0x00a7, B:348:0x00a8] A[DONT_GENERATE, DONT_INLINE]
          (r3v60 java.lang.Object) from 0x00a0: CHECK_CAST (a.qkt) (r3v60 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
