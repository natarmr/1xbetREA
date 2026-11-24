package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k7s extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ rv2 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ py20 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7s(int i, int i2, rv2 rv2Var, boolean z, py20 py20Var, int i3, int i4, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = i;
        this.k = i2;
        this.l = rv2Var;
        this.m = z;
        this.n = py20Var;
        this.o = i3;
        this.p = i4;
        this.q = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k7s(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k7s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (a.dv2.f(r9, r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (a.dv2.d(r9, r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L14:
            a.z1x.P(r9)
            goto Lb9
        L19:
            a.z1x.P(r9)
            int r9 = r8.k
            int r1 = r8.j
            int r9 = r1 - r9
            float r9 = (float) r9
            r4 = 0
            int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r5 >= 0) goto L29
            r9 = r4
        L29:
            a.j7s r4 = new a.j7s
            boolean r5 = r8.m
            int r6 = r8.p
            r4.<init>()
            a.pel r9 = new a.pel
            r9.<init>()
            r4.invoke(r9)
            a.vtj r1 = new a.vtj
            float[] r4 = r9.b
            java.util.ArrayList r9 = r9.f26860a
            int r6 = r9.size()
            int r7 = r4.length
            a.nx3.a(r6, r7)
            r7 = 0
            float[] r4 = java.util.Arrays.copyOfRange(r4, r7, r6)
            r4.getClass()
            r1.<init>(r9, r4)
            a.rv2 r9 = r8.l
            a.agk0 r4 = r9.f
            a.zbk r6 = r9.e
            float r4 = r4.l()
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L74
            a.agk0 r4 = r9.f
            float r4 = r4.l()
            java.lang.Object r4 = r1.a(r4)
            if (r4 != 0) goto L78
            java.lang.Object r4 = r6.getValue()
            goto L78
        L74:
            java.lang.Object r4 = r6.getValue()
        L78:
            r9.i(r1, r4)
            a.py20 r1 = r8.n
            if (r5 != 0) goto L86
            a.py20 r4 = a.py20.c
            if (r1 != r4) goto L86
            a.py20 r1 = a.py20.b
            goto L8a
        L86:
            int r4 = r8.o
            if (r4 <= 0) goto Lbc
        L8a:
            a.pz40 r4 = r8.q
            java.lang.Object r5 = r4.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto La6
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.setValue(r2)
            r8.i = r3
            java.lang.Object r8 = a.dv2.f(r9, r1, r8)
            if (r8 != r0) goto Lb9
            goto Lb8
        La6:
            a.pz40 r3 = r9.c
            a.hgk0 r3 = (a.hgk0) r3
            java.lang.Object r3 = r3.getValue()
            if (r3 == r1) goto Lb9
            r8.i = r2
            java.lang.Object r8 = a.dv2.d(r9, r1, r8)
            if (r8 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        Lbc:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
