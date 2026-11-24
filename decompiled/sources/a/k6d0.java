package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class k6d0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6d0(vff0 vff0Var, rhi0 rhi0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.k = vff0Var;
        this.l = rhi0Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new k6d0(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                k6d0 k6d0Var = new k6d0((k7d0) obj2, yjeVar, (byte) 1);
                k6d0Var.k = obj;
                return k6d0Var;
            case 2:
                return new k6d0(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                k6d0 k6d0Var2 = new k6d0((udd0) obj2, yjeVar, (byte) 3);
                k6d0Var2.k = obj;
                return k6d0Var2;
            case 4:
                return new k6d0(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                k6d0 k6d0Var3 = new k6d0((fnd0) obj2, yjeVar, (byte) 5);
                k6d0Var3.k = obj;
                return k6d0Var3;
            case 6:
                return new k6d0(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new k6d0(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new k6d0(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                return new k6d0((vff0) this.k, (rhi0) obj2, this.j, yjeVar);
            case 10:
                k6d0 k6d0Var4 = new k6d0((wgf0) obj2, yjeVar, (byte) 10);
                k6d0Var4.k = obj;
                return k6d0Var4;
            case 11:
                return new k6d0(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                return new k6d0((aqf0) obj2, yjeVar, (byte) 12);
            case 13:
                return new k6d0(this.k, obj2, yjeVar, (byte) 13);
            case 14:
                return new k6d0(this.k, obj2, yjeVar, (byte) 14);
            case 15:
                return new k6d0(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new k6d0((nyf0) obj2, yjeVar, (byte) 16);
            case 17:
                k6d0 k6d0Var5 = new k6d0((k4g0) obj2, yjeVar, (byte) 17);
                k6d0Var5.k = obj;
                return k6d0Var5;
            case 18:
                k6d0 k6d0Var6 = new k6d0((p13) obj2, yjeVar, (byte) 18);
                k6d0Var6.k = obj;
                return k6d0Var6;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new k6d0(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new k6d0(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new k6d0(this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new k6d0(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new k6d0(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                return new k6d0(this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new k6d0(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new k6d0(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new k6d0((dxg0) this.k, this.j, (ql5) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new k6d0(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new k6d0(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k6d0) create((k2a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((k6d0) create((qdd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((k6d0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((k6d0) create((JSONObject) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((k6d0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k6d0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v29 java.lang.Object, still in use, count: 2, list:
          (r3v29 java.lang.Object) from 0x0206: PHI (r3 I:??) = (r3v24 java.lang.Object), (r3v29 java.lang.Object) binds: [B:63:0x0205, B:513:0x0206] A[DONT_GENERATE, DONT_INLINE]
          (r3v29 java.lang.Object) from 0x01fc: CHECK_CAST (a.ykg0) (r3v29 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 2570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k6d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6d0(dxg0 dxg0Var, boolean z, ql5 ql5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        this.k = dxg0Var;
        this.j = z;
        this.l = ql5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6d0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6d0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
