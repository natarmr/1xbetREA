package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class wpf0 extends bnn0 implements Function2 {
    public p7m0 i;
    public wof0 j;
    public aqf0 k;
    public Object l;
    public String m;
    public String n;
    public ipf0 o;
    public int p;
    public int q;
    public boolean r;
    public final /* synthetic */ aqf0 s;
    public final /* synthetic */ wof0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpf0(aqf0 aqf0Var, wof0 wof0Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = aqf0Var;
        this.t = wof0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new wpf0(this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wpf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:6:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            a.wne r1 = a.wne.f39444a
            boolean r2 = r0.r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2a
            int r2 = r0.q
            int r5 = r0.p
            a.ipf0 r6 = r0.o
            java.lang.String r7 = r0.n
            java.lang.String r8 = r0.m
            java.lang.Object r9 = r0.l
            a.aqf0 r10 = r0.k
            a.wof0 r11 = r0.j
            a.p7m0 r12 = r0.i
            a.z1x.P(r18)
            r14 = r9
            r9 = r7
            r7 = r18
        L25:
            r15 = r10
            r16 = r11
            r10 = r8
            goto L88
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L31:
            a.z1x.P(r18)
            a.aqf0 r2 = r0.s
            a.p7m0 r5 = r2.E
            a.wof0 r6 = r0.t
            r10 = r2
            r12 = r5
            r11 = r6
        L3d:
            java.lang.Object r9 = r12.getValue()
            r6 = r9
            a.ipf0 r6 = (a.ipf0) r6
            int r2 = r11.e
            double r7 = r11.c
            double r13 = r11.l
            r15 = 0
            if (r2 < r4) goto L54
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L54
            r2 = r4
            goto L55
        L54:
            r2 = r3
        L55:
            int r5 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r5 <= 0) goto L5b
            r5 = r4
            goto L5c
        L5b:
            r5 = r3
        L5c:
            a.pn40 r15 = a.pn40.f27267a
            a.p3u0 r15 = a.p3u0.g
            java.lang.String r13 = a.pn40.c(r13, r15)
            java.lang.String r8 = a.pn40.c(r7, r15)
            a.t0u r7 = r10.r
            r0.i = r12
            r0.j = r11
            r0.k = r10
            r0.l = r9
            r0.m = r8
            r0.n = r13
            r0.o = r6
            r0.p = r5
            r0.q = r2
            r0.r = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            r14 = r9
            r9 = r13
            goto L25
        L88:
            if (r2 == 0) goto L8d
            r2 = r12
            r12 = r4
            goto L8f
        L8d:
            r2 = r12
            r12 = r3
        L8f:
            if (r5 == 0) goto L93
            r13 = r4
            goto L94
        L93:
            r13 = r3
        L94:
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            r6.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            a.ipf0 r8 = new a.ipf0
            r8.<init>(r9, r10, r11, r12, r13)
            boolean r5 = r2.m(r14, r8)
            if (r5 == 0) goto Lb1
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        Lb1:
            r12 = r2
            r10 = r15
            r11 = r16
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wpf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
