package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e660 extends zzf0 implements Function2 {
    public Object j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e660(yje yjeVar, Function0 function0) {
        super(2, yjeVar);
        this.m = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        e660 e660Var = new e660(yjeVar, this.m);
        e660Var.l = obj;
        return e660Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e660) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0036
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            boolean r1 = r5.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.j
            java.lang.Object r4 = r5.l
            a.fgi0 r4 = (a.fgi0) r4
            a.z1x.P(r6)
            goto L37
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            return r2
        L1a:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.l
            a.fgi0 r6 = (a.fgi0) r6
            r4 = r6
        L22:
            kotlin.jvm.functions.Function0 r6 = r5.m
            java.lang.Object r6 = r6.invoke()
            if (r6 == 0) goto L36
            r5.l = r4
            r5.j = r6
            r5.k = r3
            r4.a(r5, r6)
            a.wne r5 = a.wne.f39444a
            return r0
        L36:
            r1 = r2
        L37:
            if (r1 != 0) goto L22
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e660.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
