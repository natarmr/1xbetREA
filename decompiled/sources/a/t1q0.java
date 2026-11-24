package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class t1q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ x1q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1q0(x1q0 x1q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x1q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new t1q0(this.k, yjeVar, (byte) 0);
            default:
                return new t1q0(this.k, yjeVar, (byte) 1);
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
        return ((t1q0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (kotlin.Unit.f46060a == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (kotlin.Unit.f46060a == r0) goto L35;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = 2
            a.x1q0 r4 = r7.k
            r5 = 0
            switch(r0) {
                case 0: goto L4e;
                default: goto Lc;
            }
        Lc:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L22
            if (r6 == r2) goto L1e
            if (r6 != r3) goto L1a
            a.z1x.P(r8)
            goto L4b
        L1a:
            a.jf4.n(r1)
            goto L4d
        L1e:
            a.z1x.P(r8)
            goto L39
        L22:
            a.z1x.P(r8)
            a.ntu r8 = r4.j
            r7.j = r2
            a.j1q0 r8 = r8.f24118a
            a.m1q0 r8 = r8.f15748a
            a.q7d0 r8 = r8.f21021a
            java.lang.String r1 = "OVERRIDE_UPDATE"
            r8.d(r1, r2)
            kotlin.Unit r8 = kotlin.Unit.f46060a
            if (r8 != r0) goto L39
            goto L49
        L39:
            a.p7m0 r8 = r4.u
            a.vd9 r1 = a.vd9.b
            r7.j = r3
            r8.getClass()
            r8.o(r5, r1)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            if (r7 != r0) goto L4b
        L49:
            r5 = r0
            goto L4d
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L4d:
            return r5
        L4e:
            a.wne r0 = a.wne.f39444a
            byte r6 = r7.j
            if (r6 == 0) goto L64
            if (r6 == r2) goto L60
            if (r6 != r3) goto L5c
            a.z1x.P(r8)
            goto Lb3
        L5c:
            a.jf4.n(r1)
            goto Lb5
        L60:
            a.z1x.P(r8)
            goto L72
        L64:
            a.z1x.P(r8)
            a.dgk r8 = r4.d
            r7.j = r2
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r0) goto L72
            goto Lb1
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L8d
            a.ctf0 r8 = r4.k
            java.lang.Object[] r2 = new java.lang.Object[r1]
            a.lsm0 r8 = r8.b
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r2 = 2131957055(0x7f13153f, float:1.9550683E38)
            java.lang.String r8 = r8.a(r2, r1)
            goto L9e
        L8d:
            a.ctf0 r8 = r4.k
            java.lang.Object[] r2 = new java.lang.Object[r1]
            a.lsm0 r8 = r8.b
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r2 = 2131957073(0x7f131551, float:1.955072E38)
            java.lang.String r8 = r8.a(r2, r1)
        L9e:
            a.p7m0 r1 = r4.u
            a.wd9 r2 = new a.wd9
            r2.<init>(r8)
            r7.j = r3
            r1.getClass()
            r1.o(r5, r2)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            if (r7 != r0) goto Lb3
        Lb1:
            r5 = r0
            goto Lb5
        Lb3:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t1q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
