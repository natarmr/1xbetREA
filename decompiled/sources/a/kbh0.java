package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kbh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbh0(Object obj, Object obj2, yje yjeVar, byte b) {
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
                return new kbh0((qdl) this.k, (lbh0) obj2, yjeVar, (byte) 0);
            case 1:
                return new kbh0((gy40) this.k, (pkk0) obj2, yjeVar, (byte) 1);
            case 2:
                return new kbh0((m2c0) this.k, (xxi0) obj2, yjeVar, (byte) 2);
            case 3:
                return new kbh0((xxi0) this.k, (hkd0) obj2, yjeVar, (byte) 3);
            case 4:
                return new kbh0((w5j0) this.k, (j5j0) obj2, yjeVar, (byte) 4);
            case 5:
                return new kbh0((odj0) this.k, (String) obj2, yjeVar, (byte) 5);
            case 6:
                return new kbh0((m2c0) this.k, (odj0) obj2, yjeVar, (byte) 6);
            case 7:
                return new kbh0((odj0) this.k, (taj0) obj2, yjeVar, (byte) 7);
            case 8:
                return new kbh0((m2c0) this.k, (org.xplatform.settings.impl.presentation.a) obj2, yjeVar, (byte) 8);
            case 9:
                return new kbh0((org.xplatform.settings.impl.presentation.a) this.k, (hkd0) obj2, yjeVar, (byte) 9);
            case 10:
                return new kbh0((m2c0) this.k, (ngj0) obj2, yjeVar, (byte) 10);
            case 11:
                return new kbh0((ngj0) this.k, (hkd0) obj2, yjeVar, (byte) 11);
            case 12:
                return new kbh0((x7a) this.k, (Function1) obj2, yjeVar, (byte) 12);
            case 13:
                return new kbh0((xxj0) this.k, (String) obj2, yjeVar, (byte) 13);
            case 14:
                return new kbh0((q99) this.k, (Function2) obj2, yjeVar, (byte) 14);
            case 15:
                kbh0 kbh0Var = new kbh0((x5k0) obj2, yjeVar, (byte) 15);
                kbh0Var.k = obj;
                return kbh0Var;
            case 16:
                return new kbh0((k6k0) this.k, (t5k0) obj2, yjeVar, (byte) 16);
            case 17:
                kbh0 kbh0Var2 = new kbh0((fdk0) obj2, yjeVar, (byte) 17);
                kbh0Var2.k = obj;
                return kbh0Var2;
            case 18:
                return new kbh0((t33) this.k, (nul0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new kbh0((m1e) this.k, (cjk0) obj2, yjeVar, (byte) 19);
            case 20:
                return new kbh0((tyk0) this.k, (zy5) obj2, yjeVar, (byte) 20);
            case 21:
                return new kbh0((tyk0) this.k, (Throwable) obj2, yjeVar, (byte) 21);
            case 22:
                return new kbh0((tyk0) obj2, yjeVar, (byte) 22);
            case 23:
                kbh0 kbh0Var3 = new kbh0((tyk0) obj2, yjeVar, (byte) 23);
                kbh0Var3.k = obj;
                return kbh0Var3;
            case 24:
                return new kbh0((tyk0) this.k, (dav0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new kbh0((tyk0) this.k, (lav0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new kbh0((tyk0) this.k, (dcs) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new kbh0((tyk0) this.k, (qc7) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new kbh0((m1l0) this.k, (Double) obj2, yjeVar, (byte) 28);
            default:
                kbh0 kbh0Var4 = new kbh0((ncl0) obj2, yjeVar, (byte) 29);
                kbh0Var4.k = obj;
                return kbh0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((kbh0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((kbh0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((kbh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kbh0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x03b5 A[Catch: Exception -> 0x0449, TryCatch #1 {Exception -> 0x0449, blocks: (B:182:0x0390, B:185:0x039e, B:187:0x03a2, B:190:0x03a7, B:193:0x03b5, B:194:0x03e4, B:196:0x03ea, B:197:0x0441), top: B:490:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0441 A[Catch: Exception -> 0x0449, TRY_LEAVE, TryCatch #1 {Exception -> 0x0449, blocks: (B:182:0x0390, B:185:0x039e, B:187:0x03a2, B:190:0x03a7, B:193:0x03b5, B:194:0x03e4, B:196:0x03ea, B:197:0x0441), top: B:490:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x0603  */
    /* JADX WARN: Code duplicated, block: B:285:0x060f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0621  */
    /* JADX WARN: Code duplicated, block: B:290:0x063d A[LOOP:5: B:288:0x0634->B:290:0x063d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:334:0x0747  */
    /* JADX WARN: Code duplicated, block: B:336:0x0753  */
    /* JADX WARN: Code duplicated, block: B:337:0x0765  */
    /* JADX WARN: Code duplicated, block: B:341:0x0781 A[LOOP:8: B:339:0x0778->B:341:0x0781, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:376:0x083f  */
    /* JADX WARN: Code duplicated, block: B:378:0x084b  */
    /* JADX WARN: Code duplicated, block: B:379:0x085d  */
    /* JADX WARN: Code duplicated, block: B:383:0x0879 A[LOOP:10: B:381:0x0870->B:383:0x0879, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:457:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:459:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a68 A[LOOP:14: B:462:0x0a5f->B:464:0x0a68, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:? A[LOOP:1: B:190:0x03a7->B:497:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:? A[LOOP:2: B:194:0x03e4->B:498:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x078b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0883 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0a72 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x0371 -> B:177:0x0376). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kbh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbh0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
