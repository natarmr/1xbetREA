package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cm4 extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ im4 j;
    public final /* synthetic */ uu4 k;
    public final /* synthetic */ ynb0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ Function2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm4(im4 im4Var, uu4 uu4Var, ynb0 ynb0Var, String str, Function2 function2, yje yjeVar) {
        super(1, yjeVar);
        this.j = im4Var;
        this.k = uu4Var;
        this.l = ynb0Var;
        this.m = str;
        this.n = function2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new cm4(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((cm4) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r2.i(r12.k, r12.m, r12.n, "", r12) == r0) goto L20;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r12.i
            a.im4 r2 = r12.j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L15
            a.z1x.P(r13)
            goto L6d
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L1c:
            a.z1x.P(r13)
            goto L59
        L20:
            a.z1x.P(r13)
            goto L4c
        L24:
            a.z1x.P(r13)
            a.tyu r13 = r2.i
            java.lang.Object r1 = r2.d()
            a.um4 r1 = (a.um4) r1
            boolean r8 = r1.b
            r12.i = r5
            a.pzu r7 = r13.f34774a
            java.lang.Object r13 = r7.f
            a.mne r13 = (a.mne) r13
            a.dvj r13 = r13.b
            a.tu3 r6 = new a.tu3
            r11 = 0
            a.uu4 r9 = r12.k
            a.ynb0 r10 = r12.l
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = a.qjj.d0(r13, r6, r12)
            if (r13 != r0) goto L4c
            goto L6c
        L4c:
            a.kx00 r13 = (a.kx00) r13
            r12.i = r4
            int r1 = a.im4.u
            java.lang.Object r13 = r2.n(r13, r12)
            if (r13 != r0) goto L59
            goto L6c
        L59:
            r12.i = r3
            int r13 = a.im4.u
            a.uu4 r3 = r12.k
            java.lang.String r4 = r12.m
            kotlin.jvm.functions.Function2 r5 = r12.n
            java.lang.String r6 = ""
            r7 = r12
            java.lang.Object r12 = r2.i(r3, r4, r5, r6, r7)
            if (r12 != r0) goto L6d
        L6c:
            return r0
        L6d:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cm4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
