package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class dls0 extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ els0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls0(els0 els0Var, long j, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.j = els0Var;
        this.k = j;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new dls0(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((dls0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r0 == r6) goto L24;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            r27 = this;
            r5 = r27
            a.wne r6 = a.wne.f39444a
            byte r0 = r5.i
            r7 = 2
            r8 = 1
            a.els0 r9 = r5.j
            if (r0 == 0) goto L22
            if (r0 == r8) goto L1c
            if (r0 != r7) goto L15
            a.z1x.P(r28)
            goto Laf
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L1c:
            a.z1x.P(r28)
            r0 = r28
            goto L37
        L22:
            a.z1x.P(r28)
            a.j3c r0 = r9.s
            org.xplatform.cyber.section.api.presentation.TransferScreenParams r1 = r9.o
            long r1 = r1.b
            r5.i = r8
            long r3 = r5.k
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L37
            goto Lae
        L37:
            r14 = r0
            a.ypl0 r14 = (a.ypl0) r14
            int r0 = a.els0.w
            a.ocj r0 = r9.i
            a.p7m0 r0 = r0.f25029a
        L40:
            java.lang.Object r1 = r0.getValue()
            r1.getClass()
            r10 = r1
            a.pks0 r10 = (a.pks0) r10
            r19 = 0
            r20 = 4045(0xfcd, float:5.668E-42)
            long r11 = r5.k
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            a.pks0 r2 = a.pks0.a(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            r23 = r11
            boolean r1 = r0.m(r1, r2)
            if (r1 == 0) goto L40
            a.lbu r0 = r9.q
            java.lang.Object r1 = r0.c
            a.m1e r1 = (a.m1e) r1
            a.gmq r1 = r1.b()
            a.ey r21 = new a.ey
            r26 = 27
            r25 = 0
            r22 = r0
            r21.<init>(r22, r23, r25, r26)
            r0 = r21
            r2 = r25
            a.utb r0 = a.aoq.a(r1, r0)
            a.rl2 r1 = new a.rl2
            r3 = 3
            r4 = 26
            r1.<init>(r3, r2, r4)
            a.dnq r3 = new a.dnq
            r3.<init>(r0, r1, r8)
            a.meq0 r0 = new a.meq0
            boolean r1 = r5.l
            r0.<init>(r9, r1, r2)
            r5.i = r7
            a.vnq r1 = new a.vnq
            a.h660 r2 = a.h660.f12515a
            r1.<init>(r2, r0, r7)
            java.lang.Object r0 = r3.c(r1, r5)
            if (r0 != r6) goto La5
            goto La7
        La5:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        La7:
            if (r0 != r6) goto Laa
            goto Lac
        Laa:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        Lac:
            if (r0 != r6) goto Laf
        Lae:
            return r6
        Laf:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dls0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
