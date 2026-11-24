package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class m91 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m91(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return new m91((n91) obj, yjeVar, (byte) 0);
            case 1:
                return new m91((hd2) obj, yjeVar, (byte) 1);
            case 2:
                return new m91((of2) obj, yjeVar, (byte) 2);
            case 3:
                return new m91((bm2) obj, yjeVar, (byte) 3);
            case 4:
                return new m91((t33) obj, yjeVar, (byte) 4);
            case 5:
                return new m91((dt6) obj, yjeVar, (byte) 5);
            case 6:
                return new m91((mie0) obj, yjeVar, (byte) 6);
            case 7:
                return new m91((r9a) obj, yjeVar, (byte) 7);
            case 8:
                return new m91((bep) obj, yjeVar, (byte) 8);
            case 9:
                return new m91((ebq) obj, yjeVar, (byte) 9);
            case 10:
                return new m91((ywq0) obj, yjeVar, (byte) 10);
            case 11:
                return new m91((qgd) obj, yjeVar, (byte) 11);
            case 12:
                return new m91((Function0) obj, yjeVar, (byte) 12);
            case 13:
                return new m91((yha0) obj, yjeVar, (byte) 13);
            case 14:
                return new m91((pia0) obj, yjeVar, (byte) 14);
            case 15:
                return new m91((zia0) obj, yjeVar, (byte) 15);
            case 16:
                return new m91((qja0) obj, yjeVar, (byte) 16);
            case 17:
                return new m91((g9b0) obj, yjeVar, (byte) 17);
            case 18:
                return new m91((u6j0) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new m91((ren0) obj, yjeVar, (byte) 19);
            case 20:
                return new m91((pyo0) obj, yjeVar, (byte) 20);
            case 21:
                return new m91((i3p0) obj, yjeVar, (byte) 21);
            case 22:
                return new m91((wbp0) obj, yjeVar, (byte) 22);
            case 23:
                return new m91((fir0) obj, yjeVar, (byte) 23);
            case 24:
                return new m91((jdt0) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new m91((xgt0) obj, yjeVar, (byte) 25);
            default:
                return new m91((mwv0) obj, yjeVar, (byte) 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
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
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
        }
        return ((m91) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0303  */
    /* JADX WARN: Code duplicated, block: B:123:0x030b  */
    /* JADX WARN: Code duplicated, block: B:184:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:223:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:94:0x02af  */
    /* JADX WARN: Code duplicated, block: B:97:0x02bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v25 java.lang.Object, still in use, count: 2, list:
          (r4v25 java.lang.Object) from 0x02ab: PHI (r4 I:??) = (r4v14 java.lang.Object), (r4v25 java.lang.Object) binds: [B:91:0x02aa, B:220:0x02ab] A[DONT_GENERATE, DONT_INLINE]
          (r4v25 java.lang.Object) from 0x029f: CHECK_CAST (a.z5i0) (r4v25 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
