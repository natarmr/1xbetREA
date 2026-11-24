package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class crx extends bnn0 implements Function2 {
    public kmq i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tzi l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long p;
    public final /* synthetic */ jvn q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crx(tzi tziVar, boolean z, List list, boolean z2, long j, jvn jvnVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = tziVar;
        this.m = z;
        this.n = list;
        this.o = z2;
        this.p = j;
        this.q = jvnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        crx crxVar = new crx(this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
        crxVar.k = obj;
        return crxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((crx) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r10.a(r0, r14) == r11) goto L18;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.k
            r10 = r0
            a.kmq r10 = (a.kmq) r10
            a.wne r11 = a.wne.f39444a
            byte r0 = r14.j
            r12 = 2
            r1 = 1
            r13 = 0
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1c
            if (r0 != r12) goto L16
            a.z1x.P(r15)
            goto L73
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r13
        L1c:
            a.kmq r10 = r14.i
            a.z1x.P(r15)
            r0 = r15
            goto L66
        L23:
            a.z1x.P(r15)
            r14.k = r13
            r14.i = r10
            r14.j = r1
            a.tzi r0 = r14.l
            boolean r1 = r14.m
            java.util.List r2 = r14.n
            boolean r3 = r14.o
            long r4 = r14.p
            a.jvn r6 = r14.q
            if (r1 == 0) goto L49
            java.lang.Object r0 = r0.g
            a.yfu r0 = (a.yfu) r0
            java.lang.Object r0 = r0.f42558a
            a.h0q0 r0 = (a.h0q0) r0
            r1 = 1
            r7 = r14
            java.io.Serializable r0 = r0.o(r1, r2, r3, r4, r6, r7)
            goto L63
        L49:
            java.lang.Object r1 = r0.h
            a.n4u r1 = (a.n4u) r1
            java.lang.Object r0 = r0.f
            a.viu r0 = (a.viu) r0
            long r7 = r0.a()
            long r7 = a.ynq0.f(r7)
            java.lang.Object r0 = r1.b
            a.h0q0 r0 = (a.h0q0) r0
            r1 = 1
            r9 = r14
            java.io.Serializable r0 = r0.n(r1, r2, r3, r4, r6, r7, r9)
        L63:
            if (r0 != r11) goto L66
            goto L72
        L66:
            r14.k = r13
            r14.i = r13
            r14.j = r12
            java.lang.Object r0 = r10.a(r0, r14)
            if (r0 != r11) goto L73
        L72:
            return r11
        L73:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.crx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
