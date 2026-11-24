package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ufi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za60 f35579a;
    public final ArrayList b;
    public boolean c;
    public boolean d;
    public final cyu e;
    public dp00 f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    public ufi0(za60 za60Var) {
        y0q0[] y0q0VarArr = y0q0.f41821a;
        this.f35579a = za60Var;
        this.b = new ArrayList();
        this.e = new cyu((byte) 10);
    }

    public static kls0 d(kls0 kls0Var) {
        int[] iArr = kls0Var.f18507a;
        List list = kls0Var.b;
        List listJ = q3d.j(CollectionsKt.U(list), CollectionsKt.d0(list));
        int i = kls0Var.c;
        List list2 = kls0Var.d;
        return new kls0(iArr, listJ, i, q3d.j(Integer.valueOf(list2 != null ? ((Number) CollectionsKt.U(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) CollectionsKt.d0(list2)).intValue() : list.size() - 1)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [a.ufi0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.sh80] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.wh80 r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ufi0.a(a.wh80, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x03f8 -> B:154:0x03ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x05a4 -> B:207:0x05a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x0673 -> B:235:0x0674). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(a.rh80 r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ufi0.b(a.rh80, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:21:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(a.vh80 r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.tfi0
            if (r0 == 0) goto L13
            r0 = r11
            a.tfi0 r0 = (a.tfi0) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.tfi0 r0 = new a.tfi0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.n
            a.wne r1 = a.wne.f39444a
            int r2 = r0.p
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            int r10 = r0.m
            int r2 = r0.l
            java.lang.Object r4 = r0.k
            java.util.List r5 = r0.j
            a.vh80 r6 = r0.i
            a.z1x.P(r11)
            r8 = r4
            r4 = r10
            r10 = r6
            r6 = r8
            goto L70
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L3c:
            java.util.ArrayList r11 = a.twn.t(r11)
            java.util.List r2 = r10.f37417a
            int r2 = r2.size()
            if (r2 < 0) goto L82
            r4 = 0
            r5 = r11
        L4a:
            java.util.List r11 = r10.f37417a
            int r6 = r4 + (-1)
            java.lang.Object r11 = kotlin.collections.CollectionsKt.W(r6, r11)
            java.util.List r6 = r10.f37417a
            java.lang.Object r6 = kotlin.collections.CollectionsKt.W(r4, r6)
            r0.i = r10
            r0.j = r5
            r0.k = r6
            r0.l = r4
            r0.m = r2
            r0.p = r3
            a.za60 r7 = r9.f35579a
            java.lang.Object r11 = r7.F(r11, r6, r0)
            if (r11 != r1) goto L6d
            return r1
        L6d:
            r8 = r4
            r4 = r2
            r2 = r8
        L70:
            if (r11 == 0) goto L75
            r5.add(r11)
        L75:
            if (r6 == 0) goto L7a
            r5.add(r6)
        L7a:
            if (r2 == r4) goto L81
            int r11 = r2 + 1
            r2 = r4
            r4 = r11
            goto L4a
        L81:
            r11 = r5
        L82:
            a.vh80 r9 = new a.vh80
            r10.getClass()
            r9.<init>(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ufi0.c(a.vh80, a.zje):java.lang.Object");
    }
}
