package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Object obj2, yje yjeVar, byte b) {
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
                return new l1((gy40) this.k, (rsw) obj2, yjeVar, (byte) 0);
            case 1:
                return new l1((gy40) this.k, (ssw) obj2, yjeVar, (byte) 1);
            case 2:
                return new l1((ab) this.k, (w9) obj2, yjeVar, (byte) 2);
            case 3:
                return new l1((ab) this.k, (lr1) obj2, yjeVar, (byte) 3);
            case 4:
                return new l1((uf) obj2, yjeVar, (byte) 4);
            case 5:
                l1 l1Var = new l1((pv) obj2, yjeVar, (byte) 5);
                l1Var.k = obj;
                return l1Var;
            case 6:
                return new l1((g00) obj2, yjeVar, (byte) 6);
            case 7:
                return new l1((f20) obj2, yjeVar, (byte) 7);
            case 8:
                return new l1((p80) this.k, (List) obj2, yjeVar, (byte) 8);
            case 9:
                return new l1((u90) this.k, (iy5) obj2, yjeVar, (byte) 9);
            case 10:
                return new l1((u90) this.k, (Throwable) obj2, yjeVar, (byte) 10);
            case 11:
                l1 l1Var2 = new l1((u90) obj2, yjeVar, (byte) 11);
                l1Var2.k = obj;
                return l1Var2;
            case 12:
                return new l1((u90) this.k, (n90) obj2, yjeVar, (byte) 12);
            case 13:
                return new l1((u90) this.k, (l90) obj2, yjeVar, (byte) 13);
            case 14:
                return new l1((u90) this.k, (h90) obj2, yjeVar, (byte) 14);
            case 15:
                return new l1((u90) this.k, (c90) obj2, yjeVar, (byte) 15);
            case 16:
                return new l1((xk80) this.k, (xn0) obj2, yjeVar, (byte) 16);
            case 17:
                l1 l1Var3 = new l1((iut) obj2, yjeVar, (byte) 17);
                l1Var3.k = obj;
                return l1Var3;
            case 18:
                return new l1((jr0) this.k, (Long) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l1 l1Var4 = new l1((kgu) obj2, yjeVar, (byte) 19);
                l1Var4.k = obj;
                return l1Var4;
            case 20:
                l1 l1Var5 = new l1((kc1) obj2, yjeVar, (byte) 20);
                l1Var5.k = obj;
                return l1Var5;
            case 21:
                return new l1((kc1) this.k, (String) obj2, yjeVar, (byte) 21);
            case 22:
                l1 l1Var6 = new l1((oou) obj2, yjeVar, (byte) 22);
                l1Var6.k = obj;
                return l1Var6;
            case 23:
                return new l1((mh1) this.k, (d7v) obj2, yjeVar, (byte) 23);
            case 24:
                return new l1((nj1) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new l1((nj1) this.k, (String) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new l1((bk1) this.k, (mlr) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new l1((wk1) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new l1((egk0) this.k, (Function0) obj2, yjeVar, (byte) 28);
            default:
                return new l1((wz1) this.k, (myr0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((l1) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((l1) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((l1) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((l1) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((l1) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009f -> B:29:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
