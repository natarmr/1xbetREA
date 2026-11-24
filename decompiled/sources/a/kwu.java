package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kwu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yhi l;
    public final /* synthetic */ String m;
    public final /* synthetic */ hie0 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwu(yhi yhiVar, String str, hie0 hie0Var, int i, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = yhiVar;
        this.m = str;
        this.n = hie0Var;
        this.o = i;
        this.p = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                kwu kwuVar = new kwu(this.l, this.m, this.n, this.o, this.p, yjeVar, (byte) 0);
                kwuVar.k = obj;
                return kwuVar;
            default:
                kwu kwuVar2 = new kwu(this.l, this.m, this.n, this.o, this.p, yjeVar, (byte) 1);
                kwuVar2.k = obj;
                return kwuVar2;
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
        return ((kwu) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r9.a((java.util.List) r0, r11) == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r9.a((java.util.List) r0, r11) == r10) goto L31;
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
            a.hie0 r1 = r11.n
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r7 = 2
            r8 = 0
            switch(r0) {
                case 0: goto L52;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r11.k
            r9 = r0
            a.kmq r9 = (a.kmq) r9
            a.wne r10 = a.wne.f39444a
            byte r0 = r11.j
            if (r0 == 0) goto L28
            if (r0 == r3) goto L23
            if (r0 != r7) goto L1f
            a.z1x.P(r12)
            goto L4f
        L1f:
            a.jf4.n(r2)
            goto L51
        L23:
            a.z1x.P(r12)
            r0 = r12
            goto L41
        L28:
            a.z1x.P(r12)
            boolean r6 = r1.f13108a
            r11.k = r9
            r11.j = r3
            a.yhi r0 = r11.l
            int r1 = r11.o
            long r2 = r11.p
            java.lang.String r5 = r11.m
            r4 = r11
            java.lang.Object r0 = r0.h(r1, r2, r4, r5, r6)
            if (r0 != r10) goto L41
            goto L4d
        L41:
            java.util.List r0 = (java.util.List) r0
            r11.k = r8
            r11.j = r7
            java.lang.Object r0 = r9.a(r0, r11)
            if (r0 != r10) goto L4f
        L4d:
            r8 = r10
            goto L51
        L4f:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L51:
            return r8
        L52:
            java.lang.Object r0 = r11.k
            r9 = r0
            a.kmq r9 = (a.kmq) r9
            a.wne r10 = a.wne.f39444a
            byte r0 = r11.j
            if (r0 == 0) goto L6e
            if (r0 == r3) goto L69
            if (r0 != r7) goto L65
            a.z1x.P(r12)
            goto L95
        L65:
            a.jf4.n(r2)
            goto L97
        L69:
            a.z1x.P(r12)
            r0 = r12
            goto L87
        L6e:
            a.z1x.P(r12)
            boolean r6 = r1.f13108a
            r11.k = r9
            r11.j = r3
            a.yhi r0 = r11.l
            int r1 = r11.o
            long r2 = r11.p
            java.lang.String r5 = r11.m
            r4 = r11
            java.lang.Object r0 = r0.g(r1, r2, r4, r5, r6)
            if (r0 != r10) goto L87
            goto L93
        L87:
            java.util.List r0 = (java.util.List) r0
            r11.k = r8
            r11.j = r7
            java.lang.Object r0 = r9.a(r0, r11)
            if (r0 != r10) goto L95
        L93:
            r8 = r10
            goto L97
        L95:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kwu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
