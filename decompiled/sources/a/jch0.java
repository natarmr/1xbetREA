package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcz f16277a;
    public final vne b;
    public final ubh0 c;
    public c4m0 d;
    public final q99 e;

    public jch0(xcz xczVar, vne vneVar, ubh0 ubh0Var) {
        vneVar.getClass();
        this.f16277a = xczVar;
        this.b = vneVar;
        this.c = ubh0Var;
        this.e = vtb.d(-1, null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (a.bww.x(r12.f16277a, r8, r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (a.qcc.P(r12, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.ech0 r13, a.zje r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof a.fch0
            if (r0 == 0) goto L13
            r0 = r14
            a.fch0 r0 = (a.fch0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.fch0 r0 = new a.fch0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r14)
            goto L92
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r3
        L31:
            a.z1x.P(r14)
            goto La8
        L36:
            a.z1x.P(r14)
            kotlin.jvm.functions.Function0 r14 = r13.c
            java.lang.Object r14 = r14.invoke()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            a.ubh0 r2 = r12.c
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r6 = r13.b
            float r2 = r2 * r6
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r6
            r6 = 0
            int r7 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r7 <= 0) goto L95
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L95
        L61:
            float r2 = r14 / r2
            long r6 = (long) r2
            r8 = 1
            r10 = 100
            long r6 = a.l1e0.f(r6, r8, r10)
            float r8 = (float) r6
            float r8 = r8 / r2
            float r8 = r8 * r14
            a.dch0 r13 = r13.f7566a
            int r13 = r13.ordinal()
            if (r13 == 0) goto L7e
            if (r13 != r5) goto L7a
            goto L7f
        L7a:
            a.t9f.b()
            return r3
        L7e:
            float r8 = -r8
        L7f:
            int r13 = (int) r6
            r14 = 0
            a.z73 r2 = a.ihn.d
            a.uts0 r13 = a.ro4.m0(r13, r14, r2, r4)
            r0.k = r4
            a.xcz r12 = r12.f16277a
            java.lang.Object r12 = a.bww.x(r12, r8, r13, r0)
            if (r12 != r1) goto L92
            goto La7
        L92:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        L95:
            a.uen r12 = a.wen.b
            r12 = 100
            a.bfn r14 = a.bfn.MILLISECONDS
            long r12 = a.ibc.w0(r12, r14)
            r0.k = r5
            java.lang.Object r12 = a.qcc.P(r12, r0)
            if (r12 != r1) goto La8
        La7:
            return r1
        La8:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jch0.a(a.ech0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0092 -> B:17:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.gch0
            if (r0 == 0) goto L13
            r0 = r8
            a.gch0 r0 = (a.gch0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.gch0 r0 = new a.gch0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.ech0 r2 = r0.i
            a.z1x.P(r8)
            r8 = r2
            goto L40
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L34:
            a.ech0 r2 = r0.j
            a.ech0 r6 = r0.i
            a.z1x.P(r8)
            goto L85
        L3c:
            a.z1x.P(r8)
            r8 = r3
        L40:
            a.q99 r2 = r7.e
            java.lang.Object r2 = r2.j()
            java.lang.Object r2 = a.ztb.b(r2)
            a.ech0 r2 = (a.ech0) r2
            if (r2 != 0) goto L4f
            r2 = r8
        L4f:
            if (r2 == 0) goto L94
            a.ech0 r8 = a.ech0.e
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L94
            a.dch0 r8 = r2.f7566a
            int r8 = r8.ordinal()
            a.xcz r6 = r7.f16277a
            if (r8 == 0) goto L6e
            if (r8 != r5) goto L6a
            boolean r8 = r6.d()
            goto L72
        L6a:
            a.t9f.b()
            return r3
        L6e:
            boolean r8 = r6.c()
        L72:
            if (r8 != 0) goto L75
            goto L94
        L75:
            kotlin.jvm.functions.Function1 r8 = r2.d
            r0.i = r2
            r0.j = r2
            r0.m = r5
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L84
            goto L91
        L84:
            r6 = r2
        L85:
            r0.i = r6
            r0.j = r3
            r0.m = r4
            java.lang.Object r8 = r7.a(r2, r0)
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            r8 = r6
            goto L40
        L94:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jch0.b(a.zje):java.lang.Object");
    }

    public final boolean c(dch0 dch0Var, float f, Function0 function0, Function1 function1) {
        boolean zC;
        int iOrdinal = dch0Var.ordinal();
        byte b = 0;
        xcz xczVar = this.f16277a;
        if (iOrdinal == 0) {
            zC = xczVar.c();
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return false;
            }
            zC = xczVar.d();
        }
        if (!zC) {
            return false;
        }
        if (this.d == null) {
            this.d = qjj.W(this.b, null, null, new hch0(this, null, b), 3);
        }
        this.e.f(new ech0(dch0Var, f, function0, function1));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (a.zvw.H(r7, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.ich0
            if (r0 == 0) goto L13
            r0 = r7
            a.ich0 r0 = (a.ich0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.ich0 r0 = new a.ich0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r7)
            goto L52
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.z1x.P(r7)
            goto L45
        L35:
            a.z1x.P(r7)
            a.ech0 r7 = a.ech0.e
            r0.k = r5
            a.q99 r2 = r6.e
            java.lang.Object r7 = r2.m(r0, r7)
            if (r7 != r1) goto L45
            goto L51
        L45:
            a.c4m0 r7 = r6.d
            if (r7 == 0) goto L52
            r0.k = r4
            java.lang.Object r7 = a.zvw.H(r7, r0)
            if (r7 != r1) goto L52
        L51:
            return r1
        L52:
            r6.d = r3
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jch0.d(a.zje):java.lang.Object");
    }
}
