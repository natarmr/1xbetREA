package a;

import android.javax.sip.message.Response;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class is implements gfi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f15281a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(a640 a640Var, boolean z, yje yjeVar) {
        amv amvVar;
        gxb gxbVar;
        if (yjeVar instanceof amv) {
            amvVar = (amv) yjeVar;
            int i = amvVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                amvVar.m = i - Integer.MIN_VALUE;
            } else {
                amvVar = new amv(this, yjeVar);
            }
        } else {
            amvVar = new amv(this, yjeVar);
        }
        Object obj = amvVar.k;
        wne wneVar = wne.f39444a;
        int i2 = amvVar.m;
        g45 g45Var = this.f15281a;
        if (i2 == 0) {
            z1x.P(obj);
            gxbVar = (gxb) ((i7e) g45Var.c).i.getValue();
            if (z) {
                amvVar.i = a640Var;
                amvVar.j = gxbVar;
                amvVar.m = 1;
                if (g45Var.c(a640Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gxb gxbVar2 = amvVar.j;
            a640 a640Var2 = amvVar.i;
            z1x.P(obj);
            gxbVar = gxbVar2;
            a640Var = a640Var2;
        }
        gxb gxbVar3 = gxbVar;
        boolean z2 = a640Var.e() instanceof srt0;
        g45Var.j0(gxb.a(gxbVar3, false, z2 ? Math.max(gxbVar3.d, a640Var.b()) : gxbVar3.d, 0, null, false, null, new vxy(a640Var.b(), z2), Response.SERVICE_UNAVAILABLE));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (a.gfi0.a(r9, r2, r10, r7, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r10, a.zje r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.is.d(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        if (r10 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(boolean r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.tmu
            if (r0 == 0) goto L13
            r0 = r10
            a.tmu r0 = (a.tmu) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.tmu r0 = new a.tmu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L2f
            goto L96
        L2f:
            r8 = move-exception
            goto L9b
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L38:
            boolean r8 = r0.i
            a.is r9 = r0.j
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L2f
            r7 = r9
            r9 = r8
            r8 = r7
            goto L87
        L43:
            boolean r9 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L49
            goto L5f
        L49:
            r10 = move-exception
            goto L64
        L4b:
            a.z1x.P(r10)
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Throwable -> L49
            a.g45 r10 = r8.f15281a     // Catch: java.lang.Throwable -> L49
            r0.j = r6     // Catch: java.lang.Throwable -> L49
            r0.i = r9     // Catch: java.lang.Throwable -> L49
            r0.m = r5     // Catch: java.lang.Throwable -> L49
            java.lang.Object r10 = r10.D(r0)     // Catch: java.lang.Throwable -> L49
            if (r10 != r1) goto L5f
            goto L95
        L5f:
            a.l14 r10 = (a.l14) r10     // Catch: java.lang.Throwable -> L49
            a.e0g0 r2 = a.j0g0.b     // Catch: java.lang.Throwable -> L49
            goto L6c
        L64:
            a.e0g0 r2 = a.j0g0.b
            a.g0g0 r2 = new a.g0g0
            r2.<init>(r10)
            r10 = r2
        L6c:
            boolean r2 = r10 instanceof a.g0g0
            if (r2 == 0) goto L72
            r10 = r6
        L72:
            a.l14 r10 = (a.l14) r10
            if (r10 != 0) goto Lab
            if (r9 == 0) goto Laa
            r0.j = r8     // Catch: java.lang.Throwable -> L2f
            r0.i = r9     // Catch: java.lang.Throwable -> L2f
            r0.m = r4     // Catch: java.lang.Throwable -> L2f
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r10 = a.qcc.O(r4, r0)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r1) goto L87
            goto L95
        L87:
            a.g45 r8 = r8.f15281a     // Catch: java.lang.Throwable -> L2f
            r0.j = r6     // Catch: java.lang.Throwable -> L2f
            r0.i = r9     // Catch: java.lang.Throwable -> L2f
            r0.m = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r8.D(r0)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            a.l14 r10 = (a.l14) r10     // Catch: java.lang.Throwable -> L2f
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> L2f
            goto La2
        L9b:
            a.e0g0 r9 = a.j0g0.b
            a.g0g0 r10 = new a.g0g0
            r10.<init>(r8)
        La2:
            boolean r8 = r10 instanceof a.g0g0
            if (r8 == 0) goto La7
            goto La8
        La7:
            r6 = r10
        La8:
            a.l14 r6 = (a.l14) r6
        Laa:
            r10 = r6
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.is.e(boolean, a.zje):java.lang.Object");
    }
}
