package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ioe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Function2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe(long j, Function2 function2, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.m = function2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function2 function2 = this.m;
        long j = this.l;
        switch (b) {
            case 0:
                ioe ioeVar = new ioe(function2, j, yjeVar);
                ioeVar.k = obj;
                return ioeVar;
            default:
                ioe ioeVar2 = new ioe(j, function2, yjeVar);
                ioeVar2.k = obj;
                return ioeVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ioe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007b -> B:30:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.i
            kotlin.jvm.functions.Function2 r1 = r10.m
            long r2 = r10.l
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L48;
                default: goto Le;
            }
        Le:
            java.lang.Object r0 = r10.k
            a.vne r0 = (a.vne) r0
            a.wne r8 = a.wne.f39444a
            byte r9 = r10.j
            if (r9 == 0) goto L25
            if (r9 == r6) goto L21
            if (r9 != r7) goto L1d
            goto L25
        L1d:
            a.jf4.n(r5)
            goto L47
        L21:
            a.z1x.P(r11)
            goto L39
        L25:
            a.z1x.P(r11)
        L28:
            boolean r11 = a.d5c.R(r0)
            if (r11 == 0) goto L45
            r10.k = r0
            r10.j = r6
            java.lang.Object r11 = a.qcc.P(r2, r10)
            if (r11 != r8) goto L39
            goto L43
        L39:
            r10.k = r0
            r10.j = r7
            java.lang.Object r11 = r1.invoke(r0, r10)
            if (r11 != r8) goto L28
        L43:
            r4 = r8
            goto L47
        L45:
            kotlin.Unit r4 = kotlin.Unit.f46060a
        L47:
            return r4
        L48:
            java.lang.Object r0 = r10.k
            a.vne r0 = (a.vne) r0
            a.wne r8 = a.wne.f39444a
            byte r9 = r10.j
            if (r9 == 0) goto L5f
            if (r9 == r6) goto L5b
            if (r9 != r7) goto L57
            goto L5f
        L57:
            a.jf4.n(r5)
            goto L81
        L5b:
            a.z1x.P(r11)
            goto L73
        L5f:
            a.z1x.P(r11)
        L62:
            boolean r11 = a.d5c.R(r0)
            if (r11 == 0) goto L7f
            r10.k = r0
            r10.j = r6
            java.lang.Object r11 = r1.invoke(r0, r10)
            if (r11 != r8) goto L73
            goto L7d
        L73:
            r10.k = r0
            r10.j = r7
            java.lang.Object r11 = a.qcc.P(r2, r10)
            if (r11 != r8) goto L62
        L7d:
            r4 = r8
            goto L81
        L7f:
            kotlin.Unit r4 = kotlin.Unit.f46060a
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ioe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe(Function2 function2, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = function2;
        this.l = j;
    }
}
