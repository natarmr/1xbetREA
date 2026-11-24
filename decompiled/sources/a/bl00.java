package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class bl00 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ CyberGamesPage l;
    public final /* synthetic */ long m;
    public final /* synthetic */ ywq0 n;
    public kmq o;
    public List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl00(yje yjeVar, CyberGamesPage cyberGamesPage, long j, ywq0 ywq0Var) {
        super(3, yjeVar);
        this.l = cyberGamesPage;
        this.m = j;
        this.n = ywq0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        bl00 bl00Var = new bl00((yje) obj3, this.l, this.m, this.n);
        bl00Var.j = (kmq) obj;
        bl00Var.k = obj2;
        return bl00Var.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (a.slb.Q(r1, r3, r15) == r8) goto L16;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            a.ywq0 r6 = r15.n
            java.lang.Object r0 = r6.g
            r7 = r0
            a.n0o0 r7 = (a.n0o0) r7
            a.wne r8 = a.wne.f39444a
            byte r0 = r15.i
            r9 = 2
            r1 = 1
            r10 = 0
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L1f
            if (r0 != r9) goto L19
            a.z1x.P(r16)
            goto L9a
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r10
        L1f:
            java.util.List r0 = r15.p
            a.kmq r1 = r15.o
            a.z1x.P(r16)
            r12 = r0
            r0 = r16
            goto L66
        L2a:
            a.z1x.P(r16)
            a.kmq r11 = r15.j
            java.lang.Object r0 = r15.k
            r12 = r0
            java.util.List r12 = (java.util.List) r12
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r0 = r15.l
            long r2 = r15.m
            kotlin.Pair r0 = org.xplatform.cyber.section.api.domain.entity.d.c(r2, r0)
            java.lang.Object r2 = r6.d
            a.j3c r2 = (a.j3c) r2
            java.lang.Object r3 = r0.f46059a
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            r15.j = r10
            r15.k = r10
            r15.o = r11
            r15.p = r12
            r15.i = r1
            r5 = r15
            r0 = r2
            r1 = r3
            r3 = r13
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r8) goto L65
            goto L99
        L65:
            r1 = r11
        L66:
            a.ypl0 r0 = (a.ypl0) r0
            a.lel0 r0 = r0.c
            java.lang.String r0 = r0.j
            java.lang.Object r2 = r6.c
            a.v7i r2 = (a.v7i) r2
            java.lang.Object r3 = r7.getValue()
            a.sff0 r3 = (a.sff0) r3
            boolean r3 = r3.J1
            java.lang.Object r4 = r7.getValue()
            a.sff0 r4 = (a.sff0) r4
            boolean r4 = r4.O1
            a.acu r2 = r2.k(r12, r3, r4)
            a.jxt r3 = new a.jxt
            r3.<init>(r2, r0, r9)
            r15.j = r10
            r15.k = r10
            r15.o = r10
            r15.p = r10
            r15.i = r9
            java.lang.Object r0 = a.slb.Q(r1, r3, r15)
            if (r0 != r8) goto L9a
        L99:
            return r8
        L9a:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bl00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
