package a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lpp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public byte k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpp(ContentResolver contentResolver, Uri uri, awf awfVar, q99 q99Var, Context context, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.m = contentResolver;
        this.n = uri;
        this.p = awfVar;
        this.q = q99Var;
        this.j = context;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lpp lppVar = new lpp((m9s) this.p, (ali) this.q, (String) this.j, yjeVar, (byte) 0);
                lppVar.o = obj;
                return lppVar;
            case 1:
                return new lpp((diu0) this.q, yjeVar, (byte) 1);
            case 2:
                lpp lppVar2 = new lpp((c050) this.p, (omx) this.q, (Function1) this.j, yjeVar, (byte) 2);
                lppVar2.n = obj;
                return lppVar2;
            case 3:
                lpp lppVar3 = new lpp((rg20) this.q, (ql5) this.j, yjeVar);
                lppVar3.p = obj;
                return lppVar3;
            case 4:
                lpp lppVar4 = new lpp((c050) this.p, (g050) this.q, (Function1) this.j, yjeVar, (byte) 4);
                lppVar4.n = obj;
                return lppVar4;
            case 5:
                return new lpp((diu0) this.q, yjeVar, (byte) 5);
            case 6:
                return new lpp((aqm0) this.p, (pot0) this.q, (xpm0) this.j, yjeVar, (byte) 6);
            case 7:
                return new lpp((aqm0) this.j, yjeVar);
            default:
                lpp lppVar5 = new lpp((ContentResolver) this.m, (Uri) this.n, (awf) this.p, (q99) this.q, (Context) this.j, yjeVar);
                lppVar5.o = obj;
                return lppVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((lpp) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((lpp) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((lpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lpp) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:226:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:229:0x060f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0612  */
    /* JADX WARN: Code duplicated, block: B:307:0x0796  */
    /* JADX WARN: Code duplicated, block: B:313:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:316:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:317:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:320:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:323:0x0810  */
    /* JADX WARN: Code duplicated, block: B:331:0x0825  */
    /* JADX WARN: Code duplicated, block: B:335:0x0860 A[LOOP:9: B:333:0x085a->B:335:0x0860, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:339:0x0894  */
    /* JADX WARN: Code duplicated, block: B:343:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:347:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:349:0x08d9 A[LOOP:8: B:348:0x08d7->B:349:0x08d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:375:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:390:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:410:0x0a6e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:412:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:414:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:415:0x0aae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [a.i050, byte] */
    /* JADX WARN: Type inference failed for: r2v37, types: [a.i050, byte] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x05e8 -> B:227:0x05ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a3 -> B:19:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0168 -> B:41:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lpp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpp(aqm0 aqm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.j = aqm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpp(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpp(rg20 rg20Var, ql5 ql5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.q = rg20Var;
        this.j = ql5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpp(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = obj;
        this.q = obj2;
        this.j = obj3;
    }
}
