package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n2v extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wdu m;
    public final /* synthetic */ gu1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2v(wdu wduVar, gu1 gu1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = wduVar;
        this.n = gu1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gu1 gu1Var = this.n;
        wdu wduVar = this.m;
        switch (b) {
            case 0:
                n2v n2vVar = new n2v(wduVar, gu1Var, yjeVar, (byte) 0);
                n2vVar.l = obj;
                return n2vVar;
            default:
                n2v n2vVar2 = new n2v(wduVar, gu1Var, yjeVar, (byte) 1);
                n2vVar2.l = obj;
                return n2vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((n2v) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r0.a(r10, r9) == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r0.a(r10, r9) == r7) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            a.gu1 r1 = r9.n
            a.wdu r2 = r9.m
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 2
            r6 = 0
            switch(r0) {
                case 0: goto L53;
                default: goto Le;
            }
        Le:
            java.lang.Object r0 = r9.l
            a.kmq r0 = (a.kmq) r0
            a.wne r7 = a.wne.f39444a
            byte r8 = r9.k
            if (r8 == 0) goto L2a
            if (r8 == r4) goto L24
            if (r8 != r5) goto L20
            a.z1x.P(r10)
            goto L50
        L20:
            a.jf4.n(r3)
            goto L52
        L24:
            a.kmq r0 = r9.j
            a.z1x.P(r10)
            goto L42
        L2a:
            a.z1x.P(r10)
            java.lang.Object r10 = r2.f
            a.r2v r10 = (a.r2v) r10
            long r1 = r1.f11907a
            r9.l = r6
            r9.j = r0
            r9.k = r4
            a.j9s0 r10 = r10.f29757a
            java.lang.Object r10 = r10.b(r1, r9)
            if (r10 != r7) goto L42
            goto L4e
        L42:
            r9.l = r6
            r9.j = r6
            r9.k = r5
            java.lang.Object r9 = r0.a(r10, r9)
            if (r9 != r7) goto L50
        L4e:
            r6 = r7
            goto L52
        L50:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L52:
            return r6
        L53:
            java.lang.Object r0 = r9.l
            a.kmq r0 = (a.kmq) r0
            a.wne r7 = a.wne.f39444a
            byte r8 = r9.k
            if (r8 == 0) goto L6f
            if (r8 == r4) goto L69
            if (r8 != r5) goto L65
            a.z1x.P(r10)
            goto L97
        L65:
            a.jf4.n(r3)
            goto L99
        L69:
            a.kmq r0 = r9.j
            a.z1x.P(r10)
            goto L89
        L6f:
            a.z1x.P(r10)
            java.lang.Object r10 = r2.i
            a.u8u r10 = (a.u8u) r10
            long r2 = r1.f11907a
            java.lang.Long r1 = a.ny9.P(r1)
            r9.l = r6
            r9.j = r0
            r9.k = r4
            java.lang.Object r10 = r10.u(r2, r9, r1)
            if (r10 != r7) goto L89
            goto L95
        L89:
            r9.l = r6
            r9.j = r6
            r9.k = r5
            java.lang.Object r9 = r0.a(r10, r9)
            if (r9 != r7) goto L97
        L95:
            r6 = r7
            goto L99
        L97:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n2v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
