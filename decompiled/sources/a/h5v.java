package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class h5v implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12500a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kmq c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public h5v(kmq kmqVar, j5v j5vVar, qmu0 qmu0Var, String str, boolean z) {
        this.c = kmqVar;
        this.d = j5vVar;
        this.e = qmu0Var;
        this.f = str;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        g5v g5vVar;
        kmq kmqVar;
        switch (this.f12500a) {
            case 0:
                if (yjeVar instanceof g5v) {
                    g5vVar = (g5v) yjeVar;
                    int i = g5vVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        g5vVar.j = i - Integer.MIN_VALUE;
                    } else {
                        g5vVar = new g5v(this, yjeVar);
                    }
                } else {
                    g5vVar = new g5v(this, yjeVar);
                }
                g5v g5vVar2 = g5vVar;
                Object obj2 = g5vVar2.i;
                wne wneVar = wne.f39444a;
                int i2 = g5vVar2.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kmqVar = g5vVar2.k;
                        z1x.P(obj2);
                    } else {
                        if (i2 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj2);
                    }
                    return Unit.f46060a;
                }
                z1x.P(obj2);
                j5v j5vVar = (j5v) this.d;
                qmu0 qmu0Var = (qmu0) this.e;
                String str = (String) this.f;
                kmq kmqVar2 = this.c;
                g5vVar2.k = kmqVar2;
                g5vVar2.j = 1;
                Object objA = j5vVar.a((List) obj, qmu0Var, str, this.b, g5vVar2);
                if (objA == wneVar) {
                    return wneVar;
                }
                obj2 = objA;
                kmqVar = kmqVar2;
                g5vVar2.k = null;
                g5vVar2.j = 2;
                if (kmqVar.a(obj2, g5vVar2) == wneVar) {
                    return wneVar;
                }
                return Unit.f46060a;
            default:
                return b((int[]) obj, yjeVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4.a(r13, r2) == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r4.a(r13, r2) == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int[] r14, a.yje r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.e
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.d
            a.mie0 r1 = (a.mie0) r1
            boolean r2 = r15 instanceof a.xqs0
            if (r2 == 0) goto L1b
            r2 = r15
            a.xqs0 r2 = (a.xqs0) r2
            int r3 = r2.l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.l = r3
            goto L20
        L1b:
            a.xqs0 r2 = new a.xqs0
            r2.<init>(r13, r15)
        L20:
            java.lang.Object r15 = r2.j
            a.wne r3 = a.wne.f39444a
            int r4 = r2.l
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3c
            if (r4 == r7) goto L36
            if (r4 != r6) goto L30
            goto L36
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r5
        L36:
            int[] r14 = r2.i
            a.z1x.P(r15)
            goto L9a
        L3c:
            a.z1x.P(r15)
            java.lang.Object r15 = r1.f21842a
            a.kmq r4 = r13.c
            if (r15 != 0) goto L58
            boolean r13 = r13.b
            if (r13 == 0) goto L9a
            java.util.Set r13 = a.tx3.l0(r0)
            r2.i = r14
            r2.l = r7
            java.lang.Object r13 = r4.a(r13, r2)
            if (r13 != r3) goto L9a
            goto L99
        L58:
            java.io.Serializable r13 = r13.f
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L64:
            if (r8 >= r7) goto L85
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r1.f21842a
            if (r12 == 0) goto L7f
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7b
            r15.add(r10)
        L7b:
            int r8 = r8 + 1
            r9 = r11
            goto L64
        L7f:
            java.lang.String r13 = "Required value was null."
            a.jf4.n(r13)
            return r5
        L85:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L9a
            java.util.Set r13 = kotlin.collections.CollectionsKt.P0(r15)
            r2.i = r14
            r2.l = r6
            java.lang.Object r13 = r4.a(r13, r2)
            if (r13 != r3) goto L9a
        L99:
            return r3
        L9a:
            r1.f21842a = r14
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h5v.b(int[], a.yje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h5v(mie0 mie0Var, boolean z, kmq kmqVar, String[] strArr, int[] iArr) {
        this.d = mie0Var;
        this.b = z;
        this.c = kmqVar;
        this.e = strArr;
        this.f = iArr;
    }
}
