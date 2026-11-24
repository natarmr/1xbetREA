package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ku60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku60(boolean z, hv60 hv60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.j = z;
        this.l = hv60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new ku60((uwa) this.k, (egk0) obj2, yjeVar, (byte) 0);
            case 1:
                ku60 ku60Var = new ku60(this.j, (hv60) obj2, yjeVar);
                ku60Var.k = obj;
                return ku60Var;
            case 2:
                return new ku60((hv60) this.k, (List) obj2, yjeVar, (byte) 2);
            case 3:
                return new ku60((diu0) obj2, yjeVar, (byte) 3);
            case 4:
                return new ku60((dy60) this.k, (List) obj2, yjeVar, (byte) 4);
            case 5:
                ku60 ku60Var2 = new ku60((mie0) this.k, (g670) obj2, yjeVar, (byte) 5);
                ku60Var2.j = ((Boolean) obj).booleanValue();
                return ku60Var2;
            case 6:
                return new ku60((o670) this.k, (xd70) obj2, yjeVar, (byte) 6);
            case 7:
                return new ku60((m870) this.k, (xd70) obj2, yjeVar, (byte) 7);
            case 8:
                return new ku60((xd70) this.k, (k870) obj2, yjeVar, (byte) 8);
            case 9:
                return new ku60((qf70) this.k, (zy5) obj2, yjeVar, (byte) 9);
            case 10:
                ku60 ku60Var3 = new ku60((diu0) obj2, yjeVar, (byte) 10);
                ku60Var3.k = obj;
                return ku60Var3;
            case 11:
                return new ku60((qf70) this.k, (hle) obj2, yjeVar, (byte) 11);
            case 12:
                return new ku60((qf70) this.k, (Throwable) obj2, yjeVar, (byte) 12);
            case 13:
                return new ku60((qf70) this.k, (we70) obj2, yjeVar, (byte) 13);
            case 14:
                return new ku60((uf70) this.k, (tf70) obj2, yjeVar, (byte) 14);
            case 15:
                return new ku60((rg70) this.k, (qg70) obj2, yjeVar, (byte) 15);
            case 16:
                return new ku60((eh70) this.k, (zy5) obj2, yjeVar, (byte) 16);
            case 17:
                return new ku60((eh70) this.k, (Throwable) obj2, yjeVar, (byte) 17);
            case 18:
                return new ku60((eh70) this.k, (sg70) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ku60((gh70) this.k, (fh70) obj2, yjeVar, (byte) 19);
            case 20:
                return new ku60((ai70) this.k, (zh70) obj2, yjeVar, (byte) 20);
            case 21:
                return new ku60((ji70) this.k, (zy5) obj2, yjeVar, (byte) 21);
            case 22:
                return new ku60((ji70) this.k, (Throwable) obj2, yjeVar, (byte) 22);
            case 23:
                return new ku60((vi70) this.k, (zy5) obj2, yjeVar, (byte) 23);
            case 24:
                return new ku60((vi70) this.k, (si70) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ku60((tj70) this.k, (zy5) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ku60((tj70) this.k, (Throwable) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ku60((tj70) this.k, (dj70) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ku60((tj70) this.k, (oj70) obj2, yjeVar, (byte) 28);
            default:
                return new ku60((jk70) this.k, (Throwable) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ku60) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ku60) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ku60) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ku60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:357:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:359:0x06fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:358:0x06fb -> B:360:0x06ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ku60.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku60(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku60(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}
