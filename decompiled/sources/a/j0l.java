package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j0l extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0l(boolean z, cqq cqqVar, wpq wpqVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.j = z;
        this.k = cqqVar;
        this.l = wpqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new j0l(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new j0l(this.k, obj2, yjeVar, (byte) 1);
            case 2:
                return new j0l(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new j0l(this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new j0l(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new j0l((cgl) obj2, yjeVar, (byte) 5);
            case 6:
                return new j0l(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                j0l j0lVar = new j0l((cgl) obj2, yjeVar, (byte) 7);
                j0lVar.k = obj;
                return j0lVar;
            case 8:
                return new j0l(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                return new j0l(this.j, (cqq) this.k, (wpq) obj2, yjeVar);
            case 10:
                return new j0l(this.k, obj2, yjeVar, (byte) 10);
            case 11:
                return new j0l(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                return new j0l((kin) obj2, yjeVar, (byte) 12);
            case 13:
                return new j0l(this.k, obj2, yjeVar, (byte) 13);
            case 14:
                return new j0l(this.k, obj2, yjeVar, (byte) 14);
            case 15:
                return new j0l(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new j0l(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new j0l(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new j0l(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new j0l(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                j0l j0lVar2 = new j0l((bep) obj2, yjeVar, (byte) 20);
                j0lVar2.k = obj;
                return j0lVar2;
            case 21:
                j0l j0lVar3 = new j0l((xep) obj2, yjeVar, (byte) 21);
                j0lVar3.k = obj;
                return j0lVar3;
            case 22:
                return new j0l(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new j0l((wgp) obj2, yjeVar, (byte) 23);
            case 24:
                return new j0l(this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new j0l(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new j0l(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new j0l(this.k, obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new j0l(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new j0l(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((j0l) create((zy5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((j0l) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((j0l) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((j0l) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j0l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:292:0x0632  */
    /* JADX WARN: Code duplicated, block: B:294:0x063c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0652  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x063a -> B:295:0x063e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j0l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0l(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0l(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
