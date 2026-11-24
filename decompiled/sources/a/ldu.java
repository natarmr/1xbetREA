package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ldu extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ wdu k;
    public final /* synthetic */ byte l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ sff0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ldu(boolean z, wdu wduVar, int i, boolean z2, boolean z3, boolean z4, boolean z5, sff0 sff0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = wduVar;
        this.l = i;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = sff0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ldu(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ldu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r10 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r10 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r10.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L14
        Lc:
            a.z1x.P(r11)
            a.j0g0 r11 = (a.j0g0) r11
            java.lang.Object r10 = r11.f15681a
            goto L49
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L1b:
            a.z1x.P(r11)
            boolean r11 = r10.j
            a.wdu r4 = r10.k
            if (r11 == 0) goto L33
            r10.i = r3
            byte r11 = r10.l
            boolean r1 = r10.m
            boolean r2 = r10.n
            java.lang.Object r10 = r4.G(r11, r1, r2, r10)
            if (r10 != r0) goto L49
            goto L48
        L33:
            a.sff0 r11 = r10.q
            a.hl1 r11 = r11.b
            boolean r8 = r11.N
            r10.i = r2
            boolean r5 = r10.o
            boolean r6 = r10.p
            boolean r7 = r10.m
            r9 = r10
            java.lang.Object r10 = r4.B(r5, r6, r7, r8, r9)
            if (r10 != r0) goto L49
        L48:
            return r0
        L49:
            a.j0g0 r11 = new a.j0g0
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ldu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
