package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class juy extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juy(boolean z, mz3 mz3Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        this.j = z;
        this.k = mz3Var;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                juy juyVar = new juy((kuy) obj2, yjeVar, (byte) 0);
                juyVar.k = obj;
                return juyVar;
            case 1:
                return new juy((wzy) obj2, yjeVar, (byte) 1);
            case 2:
                return new juy(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                juy juyVar2 = new juy((d9z) obj2, yjeVar, (byte) 3);
                juyVar2.k = obj;
                return juyVar2;
            case 4:
                return new juy(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                juy juyVar3 = new juy((hdz) obj2, yjeVar, (byte) 5);
                juyVar3.k = obj;
                return juyVar3;
            case 6:
                return new juy(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new juy(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new juy(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                return new juy(this.k, obj2, yjeVar, (byte) 9);
            case 10:
                return new juy(this.k, obj2, yjeVar, (byte) 10);
            case 11:
                return new juy(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                return new juy(this.k, obj2, yjeVar, (byte) 12);
            case 13:
                return new juy(this.k, obj2, yjeVar, (byte) 13);
            case 14:
                return new juy(this.k, obj2, yjeVar, (byte) 14);
            case 15:
                return new juy(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new juy(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new juy(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new juy(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new juy(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new juy(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new juy(this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new juy((uj10) obj2, yjeVar, (byte) 22);
            case 23:
                return new juy(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                return new juy(this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new juy(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new juy(this.j, (mz3) this.k, (pz40) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new juy(this.k, obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new juy(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new juy(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((juy) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((juy) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((juy) create((fl80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 7:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((juy) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((juy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:262:0x0518  */
    /* JADX WARN: Code duplicated, block: B:263:0x051b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0548  */
    /* JADX WARN: Code duplicated, block: B:282:0x054b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v4, types: [a.rn40] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v51, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v19, types: [a.rn40] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
          (r5v9 java.lang.Object) from 0x082c: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:417:0x082b, B:554:0x082c] A[DONT_GENERATE, DONT_INLINE]
          (r5v9 java.lang.Object) from 0x0820: CHECK_CAST (a.tn40) (r5v9 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.juy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juy(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juy(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
