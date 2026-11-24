package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class fa40 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9189a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public fa40(float f, Function1 function1) {
        this.b = f;
        this.c = function1;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f9189a) {
            case 0:
                return b(((Boolean) obj).booleanValue(), yjeVar);
            default:
                Pair pair = (Pair) obj;
                Function1 function1 = (Function1) this.c;
                int iIntValue = ((Number) pair.f46059a).intValue();
                int iIntValue2 = ((Number) pair.b).intValue();
                if (iIntValue == 0) {
                    function1.invoke(Boolean.valueOf(l1e0.c(((float) iIntValue2) / this.b, 0.0f, 1.0f) < 0.5f));
                } else {
                    function1.invoke(Boolean.FALSE);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r7.a(r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r6, a.yje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.ea40
            if (r0 == 0) goto L13
            r0 = r7
            a.ea40 r0 = (a.ea40) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.ea40 r0 = new a.ea40
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L69
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            boolean r6 = r0.i
            a.z1x.P(r7)
            goto L52
        L37:
            a.z1x.P(r7)
            a.da40 r7 = new a.da40
            r7.<init>(r4)
            r0.i = r6
            r0.l = r4
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            a.qq40 r2 = a.s0x.P(r2)
            java.lang.Object r7 = r2.e(r7, r0)
            if (r7 != r1) goto L52
            goto L68
        L52:
            java.lang.Object r7 = r5.c
            a.d39 r7 = (a.d39) r7
            a.jge0 r2 = new a.jge0
            float r5 = r5.b
            r4 = 0
            r2.<init>(r4, r4, r4, r5)
            r0.i = r6
            r0.l = r3
            java.lang.Object r5 = r7.a(r2, r0)
            if (r5 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fa40.b(boolean, a.yje):java.lang.Object");
    }

    public fa40(d39 d39Var, float f) {
        this.c = d39Var;
        this.b = f;
    }
}
