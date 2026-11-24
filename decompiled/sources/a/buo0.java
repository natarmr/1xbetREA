package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class buo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3v f3241a;
    public final gst0 b;

    public buo0(y3v y3vVar, gst0 gst0Var) {
        gst0Var.getClass();
        this.f3241a = y3vVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (b(r3, r4, r5, r10, r7) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (b(r3, r4, r5, r10, r7) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.hae0 r10, a.zje r11) {
        /*
            r9 = this;
            a.y3v r0 = r9.f3241a
            java.lang.Object r0 = r0.b
            a.zto0 r0 = (a.zto0) r0
            boolean r1 = r11 instanceof a.auo0
            if (r1 == 0) goto L1a
            r1 = r11
            a.auo0 r1 = (a.auo0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.k = r2
        L18:
            r7 = r1
            goto L20
        L1a:
            a.auo0 r1 = new a.auo0
            r1.<init>(r9, r11)
            goto L18
        L20:
            java.lang.Object r11 = r7.i
            a.wne r1 = a.wne.f39444a
            int r2 = r7.k
            r3 = 2
            r8 = 1
            if (r2 == 0) goto L3d
            if (r2 == r8) goto L39
            if (r2 != r3) goto L32
            a.z1x.P(r11)
            goto L7d
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L39:
            a.z1x.P(r11)
            goto L67
        L3d:
            a.z1x.P(r11)
            boolean r11 = r0.b
            if (r11 == 0) goto L82
            a.gst0 r11 = r9.b
            boolean r11 = r11.a()
            if (r11 != 0) goto L4d
            goto L82
        L4d:
            r11 = r3
            java.lang.String r3 = r0.f44971a
            java.lang.String r4 = r0.e
            int r5 = r0.f
            a.hae0 r2 = a.hae0.ACTION_DO_BET
            if (r10 != r2) goto L6a
            boolean r2 = r0.c
            if (r2 != 0) goto L6a
            r7.k = r8
            r2 = r9
            r6 = r10
            java.lang.Object r9 = r2.b(r3, r4, r5, r6, r7)
            if (r9 != r1) goto L67
            goto L7c
        L67:
            r0.c = r8
            goto L7f
        L6a:
            r2 = r9
            r6 = r10
            a.hae0 r9 = a.hae0.ACTION_DO_DEPOSIT
            if (r6 != r9) goto L7f
            boolean r9 = r0.d
            if (r9 != 0) goto L7f
            r7.k = r11
            java.lang.Object r9 = r2.b(r3, r4, r5, r6, r7)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r0.d = r8
        L7f:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L82:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.buo0.a(a.hae0, a.zje):java.lang.Object");
    }

    public final Object b(String str, String str2, int i, hae0 hae0Var, auo0 auo0Var) {
        int length = str2.length();
        y3v y3vVar = this.f3241a;
        if (length > 0) {
            Object objT = y3vVar.t(str2, i, hae0Var, auo0Var);
            return objT == wne.f39444a ? objT : Unit.f46060a;
        }
        Object objU = y3vVar.u(str, hae0Var, auo0Var);
        return objU == wne.f39444a ? objU : Unit.f46060a;
    }
}
