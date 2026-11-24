package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vzn extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public long[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public boolean q;
    public /* synthetic */ Object r;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzn(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.t = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                vzn vznVar = new vzn((wzn) obj2, yjeVar, (byte) 0);
                vznVar.r = obj;
                return vznVar;
            case 1:
                vzn vznVar2 = new vzn((wzn) obj2, yjeVar, (byte) 1);
                vznVar2.r = obj;
                return vznVar2;
            case 2:
                vzn vznVar3 = new vzn((w1h0) obj2, yjeVar, (byte) 2);
                vznVar3.r = obj;
                return vznVar3;
            default:
                vzn vznVar4 = new vzn((d5n0) obj2, yjeVar, (byte) 3);
                vznVar4.r = obj;
                return vznVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fgi0 fgi0Var = (fgi0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((vzn) create(fgi0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0230  */
    /* JADX WARN: Code duplicated, block: B:86:0x0279 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x027b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0282  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0069 -> B:22:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006b -> B:15:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:19:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ff -> B:44:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0101 -> B:37:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0118 -> B:41:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0197 -> B:66:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0199 -> B:59:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01b0 -> B:63:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x022e -> B:88:0x0280). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0230 -> B:81:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0248 -> B:85:0x0276). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vzn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
