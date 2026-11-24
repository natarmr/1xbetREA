package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class og extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(boolean z, t33 t33Var, float f, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.l = t33Var;
        this.m = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new og(this.k, this.l, this.m, yjeVar);
            default:
                og ogVar = new og(this.l, this.m, yjeVar);
                ogVar.k = ((Boolean) obj).booleanValue();
                return ogVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((og) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((og) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r9.f(r11, r0) == r10) goto L32;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.i
            float r1 = r11.m
            r7 = 0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r8 = 2
            a.t33 r9 = r11.l
            switch(r0) {
                case 0: goto L48;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r11.k
            a.wne r6 = a.wne.f39444a
            byte r10 = r11.j
            if (r10 == 0) goto L27
            if (r10 == r4) goto L23
            if (r10 != r8) goto L1f
            a.z1x.P(r12)
            goto L45
        L1f:
            a.jf4.n(r3)
            goto L47
        L23:
            a.z1x.P(r12)
            goto L3b
        L27:
            a.z1x.P(r12)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r7)
            r11.k = r0
            r11.j = r4
            java.lang.Object r2 = r9.f(r11, r2)
            if (r2 != r6) goto L3b
        L39:
            r2 = r6
            goto L47
        L3b:
            if (r0 == 0) goto L45
            r11.k = r0
            r11.j = r8
            a.w3m.d(r9, r1, r11)
            goto L39
        L45:
            kotlin.Unit r2 = kotlin.Unit.f46060a
        L47:
            return r2
        L48:
            a.wne r10 = a.wne.f39444a
            byte r0 = r11.j
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L5a
            if (r0 != r8) goto L56
            a.z1x.P(r12)
            goto L93
        L56:
            a.jf4.n(r3)
            goto L95
        L5a:
            a.z1x.P(r12)
            goto L84
        L5e:
            a.z1x.P(r12)
            boolean r0 = r11.k
            if (r0 == 0) goto L93
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r1 = 0
            a.z73 r2 = a.ihn.d
            r3 = 1000(0x3e8, float:1.401E-42)
            a.uts0 r2 = a.ro4.m0(r3, r1, r2, r8)
            r11.j = r4
            r1 = r0
            a.t33 r0 = r11.l
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = a.t33.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r10) goto L84
            goto L91
        L84:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r7)
            r11.j = r8
            java.lang.Object r0 = r9.f(r11, r0)
            if (r0 != r10) goto L93
        L91:
            r2 = r10
            goto L95
        L93:
            kotlin.Unit r2 = kotlin.Unit.f46060a
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.og.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(t33 t33Var, float f, yje yjeVar) {
        super(2, yjeVar);
        this.l = t33Var;
        this.m = f;
    }
}
