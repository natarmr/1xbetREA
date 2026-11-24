package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class cin extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cin(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new cin((kin) obj2, yjeVar, (byte) 0);
            case 1:
                return new cin((cqq) obj2, yjeVar, (byte) 1);
            case 2:
                return new cin((ptc) obj2, yjeVar, (byte) 2);
            case 3:
                return new cin((ccp) obj2, yjeVar, (byte) 3);
            case 4:
                return new cin((org.xplatform.favorites.impl.presentation.category.f) obj2, yjeVar, (byte) 4);
            case 5:
                return new cin((nnp) obj2, yjeVar, (byte) 5);
            case 6:
                return new cin((fpp) obj2, yjeVar, (byte) 6);
            case 7:
                return new cin((vjq) obj2, yjeVar, (byte) 7);
            case 8:
                return new cin((spr) obj2, yjeVar, (byte) 8);
            case 9:
                return new cin((o2s) obj2, yjeVar, (byte) 9);
            case 10:
                return new cin((zns) obj2, yjeVar, (byte) 10);
            case 11:
                return new cin((yys) obj2, yjeVar, (byte) 11);
            case 12:
                return new cin((wzs) obj2, yjeVar, (byte) 12);
            case 13:
                return new cin((h6i) obj2, yjeVar, (byte) 13);
            case 14:
                return new cin((r4v) obj2, yjeVar, (byte) 14);
            case 15:
                return new cin((ywu) obj2, yjeVar, (byte) 15);
            case 16:
                return new cin((alv) obj2, yjeVar, (byte) 16);
            case 17:
                return new cin((r2w) obj2, yjeVar, (byte) 17);
            case 18:
                return new cin((ukw) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new cin((nvu) obj2, yjeVar, (byte) 19);
            case 20:
                return new cin((tax) obj2, yjeVar, (byte) 20);
            case 21:
                return new cin((rix) obj2, yjeVar, (byte) 21);
            case 22:
                return new cin((lox) obj2, yjeVar, (byte) 22);
            case 23:
                return new cin((a2y) obj2, yjeVar, (byte) 23);
            case 24:
                return new cin((e6y) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new cin((u1z) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new cin((uvz) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new cin((g500) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new cin((xm00) obj2, yjeVar, (byte) 28);
            default:
                return new cin((nt00) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((cin) create((dc80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((cin) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cin) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((cin) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((cin) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((cin) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((cin) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((cin) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:112:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ef  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v20 java.lang.Object, still in use, count: 2, list:
          (r2v20 java.lang.Object) from 0x03ca: PHI (r2 I:??) = (r2v16 java.lang.Object), (r2v20 java.lang.Object) binds: [B:107:0x03c9, B:175:0x03ca] A[DONT_GENERATE, DONT_INLINE]
          (r2v20 java.lang.Object) from 0x03c2: CHECK_CAST (org.xplatform.feed.notifictation.data.NotificationInfoUiModel) (r2v20 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
