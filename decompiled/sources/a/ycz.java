package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ycz extends bnn0 implements Function2 {
    public long i;
    public float j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycz(float f, yje yjeVar) {
        super(2, yjeVar);
        this.m = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ycz yczVar = new ycz(this.m, yjeVar);
        yczVar.l = obj;
        return yczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ycz) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:6:0x0014). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0047
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l
            a.qah0 r0 = (a.qah0) r0
            a.wne r1 = a.wne.f39444a
            boolean r2 = r11.k
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L16
            float r2 = r11.j
            long r4 = r11.i
            a.z1x.P(r12)
        L14:
            r12 = r2
            goto L25
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L1d:
            a.z1x.P(r12)
            long r4 = java.lang.System.currentTimeMillis()
            r12 = 0
        L25:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r8 = 600(0x258, double:2.964E-321)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L31
            r6 = r8
        L31:
            float r2 = (float) r6
            r10 = 1142292480(0x44160000, float:600.0)
            float r2 = r2 / r10
            a.zsf r10 = a.ihn.f14788a
            float r2 = r10.a(r2)
            float r10 = r11.m
            float r2 = r2 * r10
            float r12 = r2 - r12
            r0.a(r12)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto L5c
            a.z8z r12 = new a.z8z
            r6 = 5
            r12.<init>(r6)
            r11.l = r0
            r11.i = r4
            r11.j = r2
            r11.k = r3
            java.lang.Object r12 = a.s0x.k0(r12, r11)
            if (r12 != r1) goto L14
            return r1
        L5c:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ycz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
