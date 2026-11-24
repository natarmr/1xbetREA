package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;

/* JADX INFO: loaded from: classes5.dex */
public final class lcl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcl0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new lcl0((ncl0) this.k, (d0k0) obj2, yjeVar, (byte) 0);
            case 1:
                return new lcl0((ndl0) this.k, (ycl0) obj2, yjeVar, (byte) 1);
            case 2:
                return new lcl0((rjl0) obj2, yjeVar, (byte) 2);
            case 3:
                return new lcl0((sjl0) this.k, (Collection) obj2, yjeVar, (byte) 3);
            case 4:
                lcl0 lcl0Var = new lcl0((xpl0) obj2, yjeVar, (byte) 4);
                lcl0Var.k = obj;
                return lcl0Var;
            case 5:
                return new lcl0((xk80) this.k, (va00) obj2, yjeVar, (byte) 5);
            case 6:
                return new lcl0((td9) this.k, (j73) obj2, yjeVar, (byte) 6);
            case 7:
                return new lcl0((List) this.k, (xpm0) obj2, yjeVar, (byte) 7);
            case 8:
                return new lcl0((ren0) this.k, (aan0) obj2, yjeVar, (byte) 8);
            case 9:
                return new lcl0((bvn0) this.k, (b3q) obj2, yjeVar, (byte) 9);
            case 10:
                return new lcl0((bvn0) this.k, (t3q) obj2, yjeVar, (byte) 10);
            case 11:
                return new lcl0((nrn0) this.k, (zyn0) obj2, yjeVar, (byte) 11);
            case 12:
                return new lcl0((rdo0) this.k, (Function2) obj2, yjeVar, (byte) 12);
            case 13:
                return new lcl0((zco0) obj2, yjeVar, (byte) 13);
            case 14:
                return new lcl0((Function0) this.k, (t33) obj2, yjeVar, (byte) 14);
            case 15:
                return new lcl0((fho0) this.k, (wfo0) obj2, yjeVar, (byte) 15);
            case 16:
                return new lcl0((fho0) this.k, (lr1) obj2, yjeVar, (byte) 16);
            case 17:
                return new lcl0((fho0) this.k, (ArrayList) obj2, yjeVar, (byte) 17);
            case 18:
                return new lcl0((rio0) this.k, (nho0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new lcl0((rio0) this.k, (lr1) obj2, yjeVar, (byte) 19);
            case 20:
                return new lcl0((rio0) this.k, (ArrayList) obj2, yjeVar, (byte) 20);
            case 21:
                return new lcl0((q4p0) this.k, (xcp) obj2, yjeVar, (byte) 21);
            case 22:
                return new lcl0((urp0) this.k, (List) obj2, yjeVar, (byte) 22);
            case 23:
                lcl0 lcl0Var2 = new lcl0((urp0) obj2, yjeVar, (byte) 23);
                lcl0Var2.k = obj;
                return lcl0Var2;
            case 24:
                return new lcl0((pyp0) this.k, (TennisSummaryFilterModel) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new lcl0((nzp0) this.k, (TennisSummaryFilterModel) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lcl0 lcl0Var3 = new lcl0((j1q0) obj2, yjeVar, (byte) 26);
                lcl0Var3.k = obj;
                return lcl0Var3;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new lcl0((xk80) this.k, (v3q0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new lcl0((rbq0) this.k, (UUID) obj2, yjeVar, (byte) 28);
            default:
                lcl0 lcl0Var4 = new lcl0((Function1) obj2, yjeVar, (byte) 29);
                lcl0Var4.k = obj;
                return lcl0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((lcl0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 13:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((lcl0) create((ghp) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lcl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:302:0x076a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0788  */
    /* JADX WARN: Code duplicated, block: B:313:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:321:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:331:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:485:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x07cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x07b7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 java.lang.Object, still in use, count: 2, list:
          (r4v17 java.lang.Object) from 0x0766: PHI (r4 I:??) = (r4v8 java.lang.Object), (r4v17 java.lang.Object) binds: [B:299:0x0765, B:483:0x0766] A[DONT_GENERATE, DONT_INLINE]
          (r4v17 java.lang.Object) from 0x075c: CHECK_CAST (a.epn0) (r4v17 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lcl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcl0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
