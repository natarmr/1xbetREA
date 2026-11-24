package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class h54 extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public boolean k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h54(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.j = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.j) {
            case 0:
                h54 h54Var = new h54(2, yjeVar, (byte) 0);
                h54Var.l = obj;
                return h54Var;
            case 1:
                h54 h54Var2 = new h54(2, yjeVar, (byte) 1);
                h54Var2.l = obj;
                return h54Var2;
            case 2:
                h54 h54Var3 = new h54(2, yjeVar, (byte) 2);
                h54Var3.l = obj;
                return h54Var3;
            case 3:
                h54 h54Var4 = new h54(2, yjeVar, (byte) 3);
                h54Var4.l = obj;
                return h54Var4;
            default:
                h54 h54Var5 = new h54(2, yjeVar, (byte) 4);
                h54Var5.l = obj;
                return h54Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                ((h54) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                break;
            case 1:
                ((h54) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                break;
            case 2:
                ((h54) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                break;
            case 3:
                ((h54) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                break;
            default:
                ((h54) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                break;
        }
        return wne.f39444a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[LOOP:0: B:15:0x0036->B:17:0x003c, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002a -> B:14:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0009
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h54.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
