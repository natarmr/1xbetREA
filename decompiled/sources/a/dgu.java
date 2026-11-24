package a;

import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class dgu {
    public static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6058a;
    public final Object b;
    public Object c;
    public final Object d;

    public dgu(String str, j jVar, yk5 yk5Var) {
        jVar.getClass();
        Regex regex = pb00.b;
        HashMap map = new HashMap();
        new nb00(str, map).e0(jVar);
        pb00 pb00Var = new pb00(map);
        Pair pair = new Pair(wb.m, new dzj0("body"));
        Pair pair2 = new Pair(wb.u, new yxc((byte) 8));
        Pair pair3 = new Pair(cy2.h0, new yxc((byte) 2));
        Pair pair4 = new Pair(wb.q, new dzj0("blockquote"));
        Pair pair5 = new Pair(wb.o, new q9d("ol", (byte) 0));
        Pair pair6 = new Pair(wb.n, new dzj0("ul"));
        byte b = 1;
        Pair pair7 = new Pair(wb.p, new q9d("li", b));
        Pair pair8 = new Pair(cy2.S, new nd00(b));
        Pair pair9 = new Pair(wb.I, new dzj0("h1"));
        Pair pair10 = new Pair(wb.J, new dzj0("h2"));
        Pair pair11 = new Pair(cy2.P, new nd00((byte) 1));
        Pair pair12 = new Pair(wb.K, new dzj0("h1"));
        Pair pair13 = new Pair(wb.L, new dzj0("h2"));
        Pair pair14 = new Pair(wb.M, new dzj0("h3"));
        Pair pair15 = new Pair(wb.N, new dzj0("h4"));
        Pair pair16 = new Pair(wb.O, new dzj0("h5"));
        Pair pair17 = new Pair(wb.P, new dzj0("h6"));
        Pair pair18 = new Pair(wb.H, new yxc(yk5Var));
        Pair pair19 = new Pair(wb.z, new hos0(0, 0));
        Pair pair20 = new Pair(wb.C, new hos0(0, 0));
        Pair pair21 = new Pair(wb.B, new hos0(0, 0));
        ar20 ar20Var = wb.D;
        gdx gdxVar = new gdx();
        Regex regex2 = y1w0.f41881a;
        byte b2 = 1;
        HashMap mapE = xp20.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, new Pair(ar20Var, new xme0(gdxVar, (byte) 1)), new Pair(wb.E, new xme0(new xme0(pb00Var, (byte) 0), (byte) 1)), new Pair(wb.F, new xme0(new xme0(pb00Var, (byte) 0), b2)), new Pair(wb.G, new xme0(new d0x(pb00Var), b2)), new Pair(wb.y, new yxc((byte) 4)), new Pair(wb.r, new yxc((byte) 0)), new Pair(wb.s, new yxc((byte) 5)), new Pair(cy2.Y, new yxc((byte) 6)), new Pair(cy2.L, new yxc((byte) 7)), new Pair(wb.v, new r9d((byte) 1)), new Pair(wb.w, new hyj0("em", 1, -1)), new Pair(wb.x, new hyj0("strong", 2, -2)), new Pair(wb.t, new yxc((byte) 1)));
        this.f6058a = str;
        this.b = jVar;
        this.c = mapE;
        this.d = new StringBuilder();
    }

    public static qk80 F(qk80 qk80Var, List list) {
        String str = qk80Var.b;
        String strM = m(str, list);
        String str2 = qk80Var.c;
        String strM2 = m(str2, list);
        String strL = l(str, list);
        String strL2 = l(str2, list);
        List listJ = j(str, list);
        List listJ2 = j(str2, list);
        String str3 = qk80Var.f28874a;
        String str4 = qk80Var.h;
        String str5 = qk80Var.i;
        int i = qk80Var.j;
        int i2 = qk80Var.k;
        long j = qk80Var.l;
        lho lhoVar = qk80Var.m;
        cys0 cys0Var = qk80Var.p;
        str4.getClass();
        str5.getClass();
        listJ.getClass();
        listJ2.getClass();
        return new qk80(i, i2, j, lhoVar, cys0Var, str3, str, str2, strM, strM2, strL, strL2, str4, str5, listJ, listJ2);
    }

    public static List j(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str));
        ufp0 ufp0Var = (ufp0) next;
        List list2 = ufp0Var != null ? ufp0Var.e : null;
        return list2 == null ? iun.f15405a : list2;
    }

    public static String l(String str, List list) {
        Object next;
        String str2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str));
        ufp0 ufp0Var = (ufp0) next;
        return (ufp0Var == null || (str2 = ufp0Var.d) == null) ? "" : str2;
    }

    public static String m(String str, List list) {
        Object next;
        String str2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str));
        ufp0 ufp0Var = (ufp0) next;
        return (ufp0Var == null || (str2 = ufp0Var.b) == null) ? "" : str2;
    }

    public int A() {
        return ((xmk0) this.c).f41130a.length();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r9 == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r10, a.n3q r11, a.zje r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            a.izy r0 = (a.izy) r0
            java.lang.Object r1 = r9.d
            a.knf0 r1 = (a.knf0) r1
            boolean r2 = r12 instanceof a.yzy
            if (r2 == 0) goto L1b
            r2 = r12
            a.yzy r2 = (a.yzy) r2
            int r3 = r2.l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.l = r3
            goto L20
        L1b:
            a.yzy r2 = new a.yzy
            r2.<init>(r9, r12)
        L20:
            java.lang.Object r12 = r2.j
            a.wne r3 = a.wne.f39444a
            int r4 = r2.l
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L49
            if (r4 == r7) goto L43
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L37
            a.z1x.P(r12)
            goto La6
        L37:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r8
        L3d:
            a.n3q r9 = r2.i
            a.z1x.P(r12)
            goto L94
        L43:
            a.n3q r11 = r2.i
            a.z1x.P(r12)
            goto L73
        L49:
            a.z1x.P(r12)
            java.lang.String r12 = r1.c()
            int r1 = r1.b()
            java.util.LinkedHashMap r10 = a.ofm0.o(r1, r10, r12)
            java.lang.Object r9 = r9.b
            a.u8u r9 = (a.u8u) r9
            r2.i = r11
            r2.l = r7
            java.lang.Object r9 = r9.b
            a.y2x r9 = (a.y2x) r9
            java.lang.Object r9 = r9.invoke()
            a.syy r9 = (a.syy) r9
            java.lang.String r12 = "application/vnd.xenvelop+json"
            java.lang.Object r12 = r9.a(r10, r12, r2)
            if (r12 != r3) goto L73
            goto La5
        L73:
            a.dx5 r12 = (a.dx5) r12
            java.lang.Object r9 = r12.a()
            a.vyy r9 = (a.vyy) r9
            a.wyy r9 = a.cww.N(r9)
            r2.i = r11
            r2.l = r6
            r0.b = r9
            a.qoj0 r10 = r0.f15655a
            java.lang.Object r9 = r10.a(r9, r2)
            if (r9 != r3) goto L8e
            goto L90
        L8e:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L90:
            if (r9 != r3) goto L93
            goto La5
        L93:
            r9 = r11
        L94:
            r2.i = r8
            r2.l = r5
            a.qoj0 r10 = r0.c
            java.lang.Object r9 = r10.a(r9, r2)
            if (r9 != r3) goto La1
            goto La3
        La1:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        La3:
            if (r9 != r3) goto La6
        La5:
            return r3
        La6:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.B(java.lang.String, a.n3q, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:84|60|61|82|62) */
    /* JADX WARN: Code duplicated, block: B:28:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0152, code lost:
    
        if (B(r9, r3, r4) == r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0159, code lost:
    
        r5 = r6;
        r6 = r4;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (a.qjj.d0(r9, r0, r6) == r7) goto L77;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00eb -> B:59:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0125 -> B:55:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0129 -> B:56:0x0127). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.String r21, a.n3q r22, a.zje r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.C(java.lang.String, a.n3q, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object D(int i, zje zjeVar) {
        k910 k910Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof k910) {
            k910Var = (k910) zjeVar;
            int i2 = k910Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k910Var.k = i2 - Integer.MIN_VALUE;
            } else {
                k910Var = new k910(this, zjeVar);
            }
        } else {
            k910Var = new k910(this, zjeVar);
        }
        Object objA = k910Var.i;
        wne wneVar = wne.f39444a;
        int i3 = k910Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            j910 j910Var = (j910) this.f6058a;
            String strA = ((btt0) this.c).a();
            cx90 cx90Var = new cx90(i, knf0Var.c());
            k910Var.k = 1;
            objA = ((n810) ((rx00) j910Var.c).invoke()).a(strA, cx90Var, k910Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        fx90 fx90Var = (fx90) ((u2t) objA).a();
        Long l = fx90Var.f10300a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = fx90Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = fx90Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = fx90Var.d;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        List list = fx90Var.e;
        if (list == null) {
            list = iun.f15405a;
        }
        gx90 gx90Var = new gx90(jLongValue, iIntValue, iIntValue2, iIntValue3, list);
        i910 i910Var = (i910) this.b;
        i910Var.getClass();
        i910Var.f14367a = gx90Var;
        return gx90Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:137|33|34|135|35|128|36|37|38|39|40|41|(1:43)(1:44)|45|46|47|130|48|(1:51)|104) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(2:4|(1:6)(1:7))(1:7)|8|125|(1:(1:(1:(6:13|14|15|106|107|(20:137|33|34|135|35|128|36|37|38|39|40|41|(1:43)(1:44)|45|46|47|130|48|(1:51)|104)(2:110|(2:112|113)(1:114)))(2:18|19))(5:20|21|22|83|(20:137|33|34|135|35|128|36|37|38|39|40|41|(1:43)(1:44)|45|46|47|130|48|(1:51)|104)(2:110|(2:112|113)(1:114))))(4:23|132|24|25))(4:29|30|31|(20:137|33|34|135|35|128|36|37|38|39|40|41|(1:43)(1:44)|45|46|47|130|48|(1:51)|104)(2:110|(2:112|113)(1:114)))|126|52|53|139|54|(1:56)(1:57)|58|(1:60)|61|62|116|(2:119|(1:121)(1:124))|122|123|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:102:0x0200 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x022c A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0237 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0245  */
    /* JADX WARN: Code duplicated, block: B:112:0x0249 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0251 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:121:0x0264  */
    /* JADX WARN: Code duplicated, block: B:124:0x0286  */
    /* JADX WARN: Code duplicated, block: B:137:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e2 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3 A[Catch: all -> 0x017b, TryCatch #5 {all -> 0x017b, blocks: (B:62:0x0177, B:79:0x01a2, B:82:0x01aa, B:84:0x01b6, B:88:0x01c0, B:90:0x01c4, B:93:0x01e2, B:94:0x01eb, B:96:0x01f3, B:100:0x01fc, B:102:0x0200, B:108:0x022c, B:109:0x0237, B:112:0x0249, B:113:0x0250, B:114:0x0251), top: B:134:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fb  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        r2 = r12;
        r24 = r6;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        r2 = r19;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0196, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x021e -> B:106:0x0224). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x022c -> B:107:0x0228). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0237 -> B:32:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01b0 -> B:32:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(int r29, int r30, a.zje r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.E(int, int, a.zje):java.lang.Object");
    }

    public void G(b4e b4eVar, int i) {
        Class<?> cls = b4eVar.getClass();
        w5z w5zVar = (w5z) this.f6058a;
        j98 j98Var = (j98) ((Map) ((pv00) w5zVar.e).f27640a).get(cls);
        if (j98Var != null) {
            Object objA = j98Var.a(w5zVar, (ljf0) this.b);
            xmk0 xmk0Var = (xmk0) this.c;
            StringBuilder sb = xmk0Var.f41130a;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            xmk0.c(xmk0Var, objA, i, length);
        }
    }

    public void H(b4e b4eVar) {
        c930 c930Var = (c930) ((Map) this.d).get(b4eVar.getClass());
        if (c930Var != null) {
            c930Var.a(this, b4eVar);
        } else {
            I(b4eVar);
        }
    }

    public void I(b4e b4eVar) {
        b4e b4eVar2 = (b4e) b4eVar.c;
        while (b4eVar2 != null) {
            b4e b4eVar3 = (b4e) b4eVar2.f;
            b4eVar2.a(this);
            b4eVar2 = b4eVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(jzj jzjVar, txy txyVar, Function1 function1, zje zjeVar) throws Exception {
        o5v o5vVar;
        Exception e2;
        int i;
        j8p j8pVar;
        List list;
        if (zjeVar instanceof o5v) {
            o5vVar = (o5v) zjeVar;
            int i2 = o5vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o5vVar.n = i2 - Integer.MIN_VALUE;
            } else {
                o5vVar = new o5v(this, zjeVar);
            }
        } else {
            o5vVar = new o5v(this, zjeVar);
        }
        Object obj = o5vVar.l;
        Object obj2 = wne.f39444a;
        int i3 = o5vVar.n;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = txyVar == txy.SPORT_LIVE ? 1 : 0;
            try {
                o5vVar.i = txyVar;
                o5vVar.j = function1;
                o5vVar.k = i4;
                o5vVar.n = 1;
                Object objAwait = jzjVar.await(o5vVar);
                if (objAwait == obj2) {
                    return obj2;
                }
                int i5 = i4;
                obj = objAwait;
                i = i5;
            } catch (Exception e3) {
                int i6 = i4;
                e2 = e3;
                i = i6;
                if (agc.L(e2)) {
                    function1.invoke(e2);
                    ocl oclVar = (ocl) this.d;
                    txyVar.getClass();
                    rmu0 rmu0Var = (rmu0) oclVar.f25032a;
                    rmu0Var.getClass();
                    rmu0Var.f30761a.add(txyVar);
                    return iun.f15405a;
                }
                if (!agc.M(e2)) {
                    throw e2;
                }
                wdu wduVar = (wdu) this.c;
                if (i != 0) {
                    j8pVar = j8p.d;
                } else {
                    j8pVar = j8p.c;
                }
                ir30 ir30Var = (ir30) ((f8p) wduVar.j).f9118a.get(j8pVar);
                if (ir30Var != null) {
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                if (list.isEmpty()) {
                    return list;
                }
                function1.invoke(e2);
                return iun.f15405a;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = o5vVar.k;
            function1 = o5vVar.j;
            txyVar = o5vVar.i;
            try {
                z1x.P(obj);
            } catch (Exception e4) {
                e2 = e4;
                if (agc.L(e2)) {
                    function1.invoke(e2);
                    ocl oclVar2 = (ocl) this.d;
                    txyVar.getClass();
                    rmu0 rmu0Var2 = (rmu0) oclVar2.f25032a;
                    rmu0Var2.getClass();
                    rmu0Var2.f30761a.add(txyVar);
                    return iun.f15405a;
                }
                if (!agc.M(e2)) {
                    throw e2;
                }
                wdu wduVar2 = (wdu) this.c;
                if (i != 0) {
                    j8pVar = j8p.d;
                } else {
                    j8pVar = j8p.c;
                }
                ir30 ir30Var2 = (ir30) ((f8p) wduVar2.j).f9118a.get(j8pVar);
                list = ir30Var2 != null ? (List) ir30Var2.b() : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                if (list.isEmpty()) {
                    return list;
                }
                function1.invoke(e2);
                return iun.f15405a;
            }
        }
        return (List) obj;
    }

    public void b(b4e b4eVar) {
        if (((b4e) b4eVar.f) != null) {
            e();
            ((xmk0) this.c).a('\n');
        }
    }

    public Object c(ArrayList arrayList, List list, p5v p5vVar) {
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (!arrayList.contains(Long.valueOf(jLongValue))) {
                lc00VarB.add(Long.valueOf(jLongValue));
            }
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        if (lc00VarA.isEmpty()) {
            return Unit.f46060a;
        }
        Object objC = ((svu) this.f6058a).c(lc00VarA, p5vVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    public void d() {
        o3x o3xVar;
        ofm0.m();
        esg0 esg0Var = (esg0) this.c;
        ofm0.m();
        r15 r15Var = (r15) esg0Var.e;
        Objects.requireNonNull(r15Var);
        ibe0 ibe0Var = (ibe0) esg0Var.b;
        Objects.requireNonNull(ibe0Var);
        ibe0 ibe0Var2 = (ibe0) esg0Var.c;
        o3x o3xVar2 = r15Var.c;
        Objects.requireNonNull(o3xVar2);
        o3xVar2.a();
        o3x o3xVar3 = r15Var.c;
        Objects.requireNonNull(o3xVar3);
        ro4.c0(o3xVar3.e).a(new d8a(ibe0Var, (byte) 0), j120.T());
        o3x o3xVar4 = r15Var.e;
        byte b = 1;
        if (o3xVar4 != null) {
            o3xVar4.a();
            ro4.c0(r15Var.e.e).a(new d8a(null, b), j120.T());
        }
        if (r15Var.h.size() <= 1 || (o3xVar = r15Var.d) == null) {
            return;
        }
        o3xVar.a();
        ro4.c0(r15Var.d.e).a(new d8a(ibe0Var2, (byte) 2), j120.T());
    }

    public void e() {
        xmk0 xmk0Var = (xmk0) this.c;
        StringBuilder sb = xmk0Var.f41130a;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        xmk0Var.a('\n');
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(zje zjeVar) {
        squ squVar;
        int iIntValue;
        if (zjeVar instanceof squ) {
            squVar = (squ) zjeVar;
            int i = squVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                squVar.k = i - Integer.MIN_VALUE;
            } else {
                squVar = new squ(this, zjeVar);
            }
        } else {
            squVar = new squ(this, zjeVar);
        }
        Object objA = squVar.i;
        wne wneVar = wne.f39444a;
        int i2 = squVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (((gst0) this.d).a()) {
                b3c0 b3c0Var = (b3c0) this.c;
                squVar.k = 1;
                objA = b3c0Var.a(false, squVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object g(jg7 jg7Var, long j, long j2, long j3, double d, String str, int i, ArrayList arrayList, int i2, zje zjeVar) {
        aa20 aa20Var;
        if (zjeVar instanceof aa20) {
            aa20Var = (aa20) zjeVar;
            int i3 = aa20Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aa20Var.k = i3 - Integer.MIN_VALUE;
            } else {
                aa20Var = new aa20(this, zjeVar);
            }
        } else {
            aa20Var = new aa20(this, zjeVar);
        }
        aa20 aa20Var2 = aa20Var;
        Object objD0 = aa20Var2.i;
        wne wneVar = wne.f39444a;
        int i4 = aa20Var2.k;
        if (i4 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.d).b;
            ba20 ba20Var = new ba20(this, str, arrayList, jg7Var, j, j2, d, i, j3, null);
            aa20Var2.k = 1;
            objD0 = qjj.d0(dvjVar, ba20Var, aa20Var2);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return new Double(((Number) objD0).doubleValue());
    }

    public svf h(n3q n3qVar, lgp0 lgp0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        n3qVar.getClass();
        wyy wyyVar = ((izy) this.c).b;
        if (wyyVar == null) {
            iun iunVar = iun.f15405a;
            wyyVar = new wyy(iunVar, bep0.k, -1, iunVar, ldr0.d);
        }
        ldr0 ldr0Var = wyyVar.e;
        List list = wyyVar.d;
        bep0 bep0Var = wyyVar.b;
        int iOrdinal = n3qVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = lgp0Var.ordinal();
            if (iOrdinal2 == 0) {
                List list2 = bep0Var.d;
                arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(F(g7x.b0((jzy) it.next()), list));
                }
            } else {
                if (iOrdinal2 != 1) {
                    jf4.n("undefined team");
                    return null;
                }
                List list3 = bep0Var.f;
                arrayList = new ArrayList(r3d.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(F(g7x.b0((jzy) it2.next()), list));
                }
            }
            return new svf(arrayList, ldr0Var);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            List list4 = bep0Var.b;
            ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(F(g7x.b0((jzy) it3.next()), list));
            }
            return new svf(arrayList3, ldr0Var);
        }
        int iOrdinal3 = lgp0Var.ordinal();
        if (iOrdinal3 == 0) {
            List list5 = bep0Var.c;
            arrayList2 = new ArrayList(r3d.q(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList2.add(F(g7x.b0((jzy) it4.next()), list));
            }
        } else {
            if (iOrdinal3 != 1) {
                jf4.n("undefined team");
                return null;
            }
            List list6 = bep0Var.e;
            arrayList2 = new ArrayList(r3d.q(list6, 10));
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList2.add(F(g7x.b0((jzy) it5.next()), list));
            }
        }
        return new svf(arrayList2, ldr0Var);
    }

    public char i(int i) {
        IntRange intRange = (IntRange) this.d;
        if (i >= intRange.f46068a && i <= intRange.b) {
            return ((CharSequence) this.c).charAt(i);
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Serializable k(double d, double d2, int i, int i2, long j, zje zjeVar, qvo0 qvo0Var) {
        lxu lxuVar;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof lxu) {
            lxuVar = (lxu) zjeVar;
            int i3 = lxuVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lxuVar.k = i3 - Integer.MIN_VALUE;
            } else {
                lxuVar = new lxu(this, zjeVar);
            }
        } else {
            lxuVar = new lxu(this, zjeVar);
        }
        Object objA = lxuVar.i;
        wne wneVar = wne.f39444a;
        int i4 = lxuVar.k;
        if (i4 == 0) {
            z1x.P(objA);
            xfu xfuVar = (xfu) this.f6058a;
            knf0Var.getClass();
            String strC = knf0Var.c();
            Integer num = i2 != 0 ? new Integer(i2) : null;
            lxuVar.k = 1;
            qxu qxuVar = (qxu) ((wgn) xfuVar.f40810a).invoke();
            String plainString = new BigDecimal(String.valueOf(d)).toPlainString();
            plainString.getClass();
            String plainString2 = new BigDecimal(String.valueOf(d2)).toPlainString();
            plainString2.getClass();
            objA = qxuVar.a(1, 1357, i, plainString, plainString2, j, strC, qvo0Var.f29396a, num, lxuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return dyb.n0((pxu) ((dx5) objA).a());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:123|38|39|125|40|116|41|42|43|120|44|(5:47|127|48|(1:50)(1:51)|(6:54|29|118|55|(1:57)(1:58)|(1:60)))|105) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:47|127|48|(1:50)(1:51)|(6:54|29|118|55|(1:57)(1:58)|(1:60))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:54|29|118|55|(1:57)(1:58)|(1:60)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0286  */
    /* JADX WARN: Code duplicated, block: B:103:0x028b  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0170  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9 A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #7 {all -> 0x01fd, blocks: (B:48:0x017d, B:51:0x01a9), top: B:127:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01af  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce A[Catch: all -> 0x01e6, TryCatch #2 {all -> 0x01e6, blocks: (B:55:0x01b2, B:61:0x01d4, B:58:0x01ce), top: B:118:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0225  */
    /* JADX WARN: Code duplicated, block: B:83:0x0231  */
    /* JADX WARN: Code duplicated, block: B:85:0x0237  */
    /* JADX WARN: Code duplicated, block: B:86:0x0239  */
    /* JADX WARN: Code duplicated, block: B:89:0x023e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258  */
    /* JADX WARN: Code duplicated, block: B:94:0x0262  */
    /* JADX WARN: Code duplicated, block: B:95:0x0275  */
    /* JADX WARN: Code duplicated, block: B:97:0x027d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0284  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e9, code lost:
    
        r7 = r4;
        r4 = r15;
        r18 = r8;
        r8 = r6;
        r6 = r14;
        r19 = r9;
        r9 = r18;
        r12 = r13;
        r10 = r19;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ff, code lost:
    
        r18 = r12;
        r12 = r14;
        r13 = r18;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020c, code lost:
    
        r18 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0215, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0216, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0219, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021a, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fa: MOVE (r18 I:??[long, double]) = (r11 I:??[long, double]) (LINE:251), block:B:31:0x00e9 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fc: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:253), block:B:31:0x00e9 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00eb: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:236), block:B:31:0x00e9 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00f1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:242), block:B:31:0x00e9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x02bf -> B:37:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x022d -> B:37:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0262 -> B:37:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r24, a.n3q r25, a.zje r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.n(java.lang.String, a.n3q, a.zje):java.lang.Object");
    }

    public k06 o(long j, List list, List list2, String str, String str2, String str3, boolean z, int i) {
        list.getClass();
        list2.getClass();
        str3.getClass();
        return new k06(new x860(i, false), new l1(new kgu(this, j, list, list2, str, str2, str3, z, i, ((pru) this.d).a(), null), null, (byte) 19));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[LOOP:0: B:27:0x00d0->B:29:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0102 A[LOOP:1: B:31:0x00fc->B:33:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0146  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable p(long j, boolean z, boolean z2, long j2, String str, zje zjeVar) {
        q5v q5vVar;
        String str2;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        Object objA;
        List list;
        boolean z5;
        String str3;
        boolean z6;
        long j5;
        long j6;
        List list2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        List list3;
        List list4;
        svu svuVar = (svu) this.f6058a;
        if (zjeVar instanceof q5v) {
            q5vVar = (q5v) zjeVar;
            int i = q5vVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5vVar.r = i - Integer.MIN_VALUE;
            } else {
                q5vVar = new q5v(this, zjeVar);
            }
        } else {
            q5vVar = new q5v(this, zjeVar);
        }
        q5v q5vVar2 = q5vVar;
        Object objS = q5vVar2.p;
        wne wneVar = wne.f39444a;
        int i2 = q5vVar2.r;
        if (i2 == 0) {
            z1x.P(objS);
            txy txyVar = txy.SPORT_LINE;
            str2 = str;
            q5vVar2.m = str2;
            j3 = j;
            q5vVar2.i = j3;
            z3 = z;
            q5vVar2.k = z3;
            z4 = z2;
            q5vVar2.l = z4;
            j4 = j2;
            q5vVar2.j = j4;
            q5vVar2.r = 1;
            objA = svuVar.a(0, q5vVar2);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            long j7 = q5vVar2.j;
            boolean z7 = q5vVar2.l;
            boolean z8 = q5vVar2.k;
            long j8 = q5vVar2.i;
            String str4 = q5vVar2.m;
            z1x.P(objS);
            objA = objS;
            str2 = str4;
            z4 = z7;
            z3 = z8;
            j4 = j7;
            j3 = j8;
        } else {
            if (i2 == 2) {
                long j9 = q5vVar2.j;
                z5 = q5vVar2.l;
                boolean z9 = q5vVar2.k;
                long j10 = q5vVar2.i;
                List list5 = q5vVar2.n;
                String str5 = q5vVar2.m;
                z1x.P(objS);
                j6 = j9;
                j5 = j10;
                list = list5;
                str3 = str5;
                z6 = z9;
                list2 = (List) objS;
                arrayList = new ArrayList(r3d.q(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    axq.t(((pxy) it.next()).f27779a, arrayList);
                    q5vVar2 = q5vVar2;
                }
                q5v q5vVar3 = q5vVar2;
                arrayList2 = new ArrayList(r3d.q(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    axq.t(((pxy) it2.next()).f27779a, arrayList2);
                }
                int id = ((uzc) this.b).b().getId();
                q5vVar3.m = null;
                q5vVar3.n = list;
                q5vVar3.o = list2;
                q5vVar3.i = j5;
                q5vVar3.k = z6;
                q5vVar3.l = z5;
                q5vVar3.j = j6;
                q5vVar3.r = 3;
                objS = qem0.s(new p5v(this, arrayList2, arrayList, z5, id, j5, j6, str3, z6, null), q5vVar3);
                if (objS != wneVar) {
                    list3 = list;
                    list4 = list2;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list4 = q5vVar2.o;
            list3 = q5vVar2.n;
            z1x.P(objS);
        }
        return new Pair(CollectionsKt.q0(list3, list4), (List) objS);
        List list6 = (List) objA;
        txy txyVar2 = txy.SPORT_LINE;
        q5vVar2.m = str2;
        q5vVar2.n = list6;
        q5vVar2.i = j3;
        q5vVar2.k = z3;
        q5vVar2.l = z4;
        q5vVar2.j = j4;
        q5vVar2.r = 2;
        Serializable serializableA = svuVar.a(4, q5vVar2);
        if (serializableA != wneVar) {
            list = list6;
            z5 = z4;
            str3 = str2;
            objS = serializableA;
            long j11 = j4;
            z6 = z3;
            j5 = j3;
            j6 = j11;
            list2 = (List) objS;
            arrayList = new ArrayList(r3d.q(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                axq.t(((pxy) it.next()).f27779a, arrayList);
                q5vVar2 = q5vVar2;
            }
            q5v q5vVar4 = q5vVar2;
            arrayList2 = new ArrayList(r3d.q(list, 10));
            it2 = list.iterator();
            while (it2.hasNext()) {
                axq.t(((pxy) it2.next()).f27779a, arrayList2);
            }
            int id2 = ((uzc) this.b).b().getId();
            q5vVar4.m = null;
            q5vVar4.n = list;
            q5vVar4.o = list2;
            q5vVar4.i = j5;
            q5vVar4.k = z6;
            q5vVar4.l = z5;
            q5vVar4.j = j6;
            q5vVar4.r = 3;
            objS = qem0.s(new p5v(this, arrayList2, arrayList, z5, id2, j5, j6, str3, z6, null), q5vVar4);
            if (objS != wneVar) {
                list3 = list;
                list4 = list2;
                return new Pair(CollectionsKt.q0(list3, list4), (List) objS);
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int, short] */
    public Object q(int i, int i2, long j, zje zjeVar) {
        spu spuVar;
        long j2;
        int i3;
        int i4;
        pou pouVar;
        if (zjeVar instanceof spu) {
            spuVar = (spu) zjeVar;
            int i5 = spuVar.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                spuVar.o = i5 - Integer.MIN_VALUE;
            } else {
                spuVar = new spu(this, zjeVar);
            }
        } else {
            spuVar = new spu(this, zjeVar);
        }
        Object obj = spuVar.m;
        wne wneVar = wne.f39444a;
        int i6 = spuVar.o;
        yje yjeVar = null;
        if (i6 == 0) {
            z1x.P(obj);
            pou pouVar2 = (pou) this.f6058a;
            ieu ieuVar = (ieu) this.b;
            spuVar.l = pouVar2;
            spuVar.i = i2;
            j2 = j;
            spuVar.k = (int) j2;
            spuVar.j = i;
            spuVar.o = 1;
            Object objI = ieuVar.i(spuVar);
            if (objI == wneVar) {
                return wneVar;
            }
            i3 = i2;
            i4 = i;
            pouVar = pouVar2;
            obj = objI;
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = spuVar.j;
            long j3 = spuVar.k;
            int i8 = spuVar.i;
            pou pouVar3 = spuVar.l;
            z1x.P(obj);
            pouVar = pouVar3;
            i4 = i7;
            j2 = j3;
            i3 = i8;
        }
        int i9 = ((elt) obj).e;
        String strA = ((ntu) this.c).a();
        boolean z = !h97.A((wyu) this.d, uaq0.f35345a);
        pouVar.getClass();
        strA.getClass();
        return new k06(new x860(i3, false), new l1(new oou(j2, pouVar, i4, i9, strA, z, null), yjeVar, (byte) 22));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object r(long j, zje zjeVar) {
        i2v i2vVar;
        boolean z;
        u8u u8uVar;
        long j2;
        long j3;
        u8u u8uVar2;
        int i;
        int i2;
        long j4;
        Object objT;
        if (zjeVar instanceof i2v) {
            i2vVar = (i2v) zjeVar;
            int i3 = i2vVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i2vVar.p = i3 - Integer.MIN_VALUE;
            } else {
                i2vVar = new i2v(this, zjeVar);
            }
        } else {
            i2vVar = new i2v(this, zjeVar);
        }
        i2v i2vVar2 = i2vVar;
        Object obj = i2vVar2.n;
        wne wneVar = wne.f39444a;
        int i4 = i2vVar2.p;
        Integer num = null;
        if (i4 == 0) {
            z1x.P(obj);
            boolean zA = ((iqt) this.f6058a).f15225a.a();
            u8u u8uVar3 = (u8u) this.b;
            x0u x0uVar = (x0u) this.c;
            i2vVar2.l = u8uVar3;
            i2vVar2.i = j;
            i2vVar2.k = zA;
            i2vVar2.j = j;
            i2vVar2.p = 1;
            Object objC = x0uVar.c(i2vVar2);
            if (objC != wneVar) {
                z = zA;
                obj = objC;
                u8uVar = u8uVar3;
                j2 = j;
            }
            return wneVar;
        }
        if (i4 == 1) {
            j = i2vVar2.j;
            z = i2vVar2.k;
            j2 = i2vVar2.i;
            u8uVar = i2vVar2.l;
            z1x.P(obj);
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = i2vVar2.m;
            j = i2vVar2.j;
            z = i2vVar2.k;
            j4 = i2vVar2.i;
            u8uVar2 = i2vVar2.l;
            z1x.P(obj);
        }
        i = i2;
        num = new Integer((int) ((ql5) obj).e);
        j3 = j4;
        i2vVar2.l = 0;
        i2vVar2.i = j3;
        i2vVar2.k = z;
        i2vVar2.p = 3;
        objT = u8uVar2.t(j, i, num, i2vVar2);
        if (objT == wneVar) {
            return wneVar;
        }
        return objT;
        int iIntValue = ((Number) obj).intValue();
        if (z) {
            nou nouVar = (nou) this.d;
            i2vVar2.l = u8uVar;
            i2vVar2.i = j2;
            i2vVar2.k = z;
            i2vVar2.j = j;
            i2vVar2.m = iIntValue;
            i2vVar2.p = 2;
            Serializable serializableA = nouVar.a(tl5.c, i2vVar2);
            if (serializableA != wneVar) {
                obj = serializableA;
                i2 = iIntValue;
                long j5 = j2;
                u8uVar2 = u8uVar;
                j4 = j5;
                i = i2;
                num = new Integer((int) ((ql5) obj).e);
                j3 = j4;
                i2vVar2.l = 0;
                i2vVar2.i = j3;
                i2vVar2.k = z;
                i2vVar2.p = 3;
                objT = u8uVar2.t(j, i, num, i2vVar2);
                if (objT == wneVar) {
                    return objT;
                }
            }
        } else {
            j3 = j2;
            u8uVar2 = u8uVar;
            i = iIntValue;
            i2vVar2.l = 0;
            i2vVar2.i = j3;
            i2vVar2.k = z;
            i2vVar2.p = 3;
            objT = u8uVar2.t(j, i, num, i2vVar2);
            if (objT == wneVar) {
                return objT;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object s(long j, uob0 uob0Var, zje zjeVar) {
        amu amuVar;
        uoy uoyVarJ;
        wne wneVar;
        uob0 uob0Var2;
        Object objJ;
        amu amuVar2;
        long j2;
        cit0 cit0Var;
        String str;
        cit0 cit0Var2;
        String strValueOf;
        double d;
        uob0 uob0Var3 = uob0Var;
        if (zjeVar instanceof amu) {
            amuVar = (amu) zjeVar;
            int i = amuVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                amuVar.n = i - Integer.MIN_VALUE;
            } else {
                amuVar = new amu(this, zjeVar);
            }
        } else {
            amuVar = new amu(this, zjeVar);
        }
        Object obj = amuVar.l;
        wne wneVar2 = wne.f39444a;
        int i2 = amuVar.n;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = amuVar.i;
                uob0Var3 = amuVar.j;
                z1x.P(obj);
                objJ = obj;
                wneVar = wneVar2;
                amuVar2 = amuVar;
                uob0Var2 = null;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cit0Var2 = amuVar.k;
                z1x.P(obj);
            }
            str = (String) obj;
            cit0Var = cit0Var2;
            String str2 = str;
            cit0Var.getClass();
            str2.getClass();
            strValueOf = cit0Var.K;
            d = cit0Var.J;
            if (strValueOf == null) {
                strValueOf = String.valueOf(d);
            }
            double d2 = cit0Var.m;
            return new grb0(new erb0(d2, d * d2, str2, strValueOf), cit0Var);
        }
        z1x.P(obj);
        fht0 fht0Var = (fht0) this.b;
        long jA = ((x1u) this.f6058a).a();
        uob0Var3.getClass();
        String str3 = uob0Var3.l.b;
        long j3 = uob0Var3.f;
        if (uob0Var3.g) {
            tqt tqtVar = uoy.b;
            byte b = uob0Var3.h.f36034a;
            tqtVar.getClass();
            uoyVarJ = tqt.j(b);
        } else {
            uoyVarJ = uoy.LINE;
        }
        uoy uoyVar = uoyVarJ;
        tob0 tob0Var = uob0Var3.m;
        double d3 = tob0Var.b;
        long j4 = tob0Var.f34276a;
        std stdVar = gwe.b;
        List listC = kotlin.collections.a.c(new ru6(-1L, str3, 0.0d, j3, uoyVar, d3, 0L, j4, 0, (Double) null, (String) null, 3328));
        iun iunVar = iun.f15405a;
        nwd nwdVar = q4f.f28094a;
        int i3 = uob0Var3.f36005a;
        nwdVar.getClass();
        q4f q4fVarA = nwd.a(i3);
        int i4 = uob0Var3.f36005a;
        Boolean bool = Boolean.TRUE;
        String str4 = uob0Var3.d;
        byte b2 = ((pru) this.d).a().I1.f26017a;
        amuVar.j = uob0Var3;
        amuVar.i = j;
        amuVar.n = 1;
        wneVar = wneVar2;
        amu amuVar3 = amuVar;
        uob0Var2 = null;
        objJ = fht0Var.j(jA, j, listC, iunVar, 0L, q4fVarA, i4, false, false, false, bool, str4, b2, false, amuVar3);
        amuVar2 = amuVar3;
        if (objJ != wneVar) {
            j2 = j;
        }
        return wneVar;
        cit0Var = (cit0) CollectionsKt.firstOrNull((List) objJ);
        if (cit0Var == null) {
            jf4.n("Failed to update coupon data");
            return uob0Var2;
        }
        List list = cit0Var.e;
        if (!list.isEmpty()) {
            uii uiiVar = (uii) this.c;
            long j5 = ((m97) CollectionsKt.U(list)).h;
            long j6 = uob0Var3.k;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(((m97) CollectionsKt.U(list)).k));
            long j7 = cit0Var.l;
            List list2 = uob0Var3.n;
            List list3 = uob0Var3.o;
            amuVar2.j = uob0Var2;
            amuVar2.k = cit0Var;
            amuVar2.i = j2;
            amuVar2.n = 2;
            Object objD0 = qjj.d0(((mne) uiiVar.c).b, new c8u(uiiVar, list2, list3, bigDecimal, j7, j6, j5, null), amuVar2);
            if (objD0 != wneVar) {
                obj = objD0;
                cit0Var2 = cit0Var;
                str = (String) obj;
                cit0Var = cit0Var2;
            }
            return wneVar;
        }
        str = "";
        String str5 = str;
        cit0Var.getClass();
        str5.getClass();
        strValueOf = cit0Var.K;
        d = cit0Var.J;
        if (strValueOf == null) {
            strValueOf = String.valueOf(d);
        }
        double d4 = cit0Var.m;
        return new grb0(new erb0(d4, d * d4, str5, strValueOf), cit0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object t(long j, boolean z, boolean z2, zje zjeVar) {
        hku hkuVar;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        long j3;
        List list;
        boolean z6;
        if (zjeVar instanceof hku) {
            hkuVar = (hku) zjeVar;
            int i = hkuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkuVar.o = i - Integer.MIN_VALUE;
            } else {
                hkuVar = new hku(this, zjeVar);
            }
        } else {
            hkuVar = new hku(this, zjeVar);
        }
        Object objB = hkuVar.m;
        wne wneVar = wne.f39444a;
        int i2 = hkuVar.o;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.c;
            hkuVar.i = j;
            hkuVar.j = z;
            z3 = z2;
            hkuVar.k = z3;
            hkuVar.o = 1;
            objB = zfoVar.b(hkuVar);
            if (objB != wneVar) {
                j2 = j;
                z4 = z;
            }
            return wneVar;
        }
        if (i2 == 1) {
            boolean z7 = hkuVar.k;
            boolean z8 = hkuVar.j;
            j2 = hkuVar.i;
            z1x.P(objB);
            z3 = z7;
            z4 = z8;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z9 = hkuVar.k;
            boolean z10 = hkuVar.j;
            long j4 = hkuVar.i;
            List list2 = hkuVar.l;
            z1x.P(objB);
            z6 = z9;
            z5 = z10;
            j3 = j4;
            list = list2;
        }
        return new dku(new i89(((p530) this.f6058a).f26386a.c(j3), (byte) 22), this, j3, list, (List) objB, z5, z6, (byte) 1);
        List list3 = (List) objB;
        edo edoVar = (edo) this.b;
        hkuVar.l = list3;
        hkuVar.i = j2;
        hkuVar.j = z4;
        hkuVar.k = z3;
        hkuVar.o = 2;
        Object objB2 = edoVar.b(hkuVar);
        if (objB2 != wneVar) {
            long j5 = j2;
            z5 = z4;
            j3 = j5;
            list = list3;
            objB = objB2;
            z6 = z3;
            return new dku(new i89(((p530) this.f6058a).f26386a.c(j3), (byte) 22), this, j3, list, (List) objB, z5, z6, (byte) 1);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r8 == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(a.zje r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            a.g45 r0 = (a.g45) r0
            boolean r1 = r8 instanceof a.otu
            if (r1 == 0) goto L17
            r1 = r8
            a.otu r1 = (a.otu) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            a.otu r1 = new a.otu
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.j
            a.wne r2 = a.wne.f39444a
            int r3 = r1.l
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L37
            if (r3 != r5) goto L31
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2f
            goto L76
        L2f:
            r7 = move-exception
            goto L79
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L37:
            boolean r3 = r1.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2f
            goto L5c
        L3d:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.f6058a
            a.ort r8 = (a.ort) r8
            a.gst0 r8 = r8.f25751a
            boolean r3 = r8.a()
            if (r3 == 0) goto L61
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L2f
            a.rou r8 = (a.rou) r8     // Catch: java.lang.Throwable -> L2f
            r1.i = r3     // Catch: java.lang.Throwable -> L2f
            r1.l = r6     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            java.lang.Object r8 = r8.a(r6, r1)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r2) goto L5c
            goto L75
        L5c:
            a.m2c0 r8 = (a.m2c0) r8     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r8.C     // Catch: java.lang.Throwable -> L2f
            goto L63
        L61:
            java.lang.String r8 = ""
        L63:
            java.lang.Object r7 = r7.d     // Catch: java.lang.Throwable -> L2f
            a.nhf0 r7 = (a.nhf0) r7     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r7.r()     // Catch: java.lang.Throwable -> L2f
            r1.i = r3     // Catch: java.lang.Throwable -> L2f
            r1.l = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r0.I(r1, r7, r8, r3)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r2) goto L76
        L75:
            return r2
        L76:
            a.aki0 r8 = (a.aki0) r8     // Catch: java.lang.Throwable -> L2f
            return r8
        L79:
            java.lang.Object r8 = r0.c
            a.i7e r8 = (a.i7e) r8
            a.p7m0 r8 = r8.f
            r8.getClass()
            a.zji0 r0 = a.zji0.f44483a
            r8.o(r4, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.u(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(zje zjeVar, String str, boolean z, boolean z2) {
        wku wkuVar;
        List list;
        String str2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        qga0 qga0Var;
        qoj0 qoj0Var;
        if (zjeVar instanceof wku) {
            wkuVar = (wku) zjeVar;
            int i = wkuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkuVar.o = i - Integer.MIN_VALUE;
            } else {
                wkuVar = new wku(this, zjeVar);
            }
        } else {
            wkuVar = new wku(this, zjeVar);
        }
        Object objB = wkuVar.m;
        wne wneVar = wne.f39444a;
        int i2 = wkuVar.o;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.c;
            wkuVar.i = str;
            wkuVar.k = z;
            wkuVar.l = z2;
            wkuVar.o = 1;
            objB = zfoVar.b(wkuVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = wkuVar.l;
            z = wkuVar.k;
            str = wkuVar.i;
            z1x.P(objB);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = wkuVar.l;
            z = wkuVar.k;
            List list2 = wkuVar.j;
            String str3 = wkuVar.i;
            z1x.P(objB);
            z3 = z4;
            list = list2;
            str2 = str3;
        }
        boolean z5 = z;
        List list3 = (List) objB;
        uga0 uga0Var = (uga0) this.f6058a;
        str2.getClass();
        linkedHashMap = uga0Var.f35616a.f33901a;
        qga0Var = (qga0) linkedHashMap.get(str2);
        if (qga0Var != null) {
            qoj0Var = qga0Var.f28674a;
        } else {
            qga0 qga0Var2 = new qga0();
            linkedHashMap.put(str2, qga0Var2);
            qoj0Var = qga0Var2.f28674a;
        }
        return new vku(new i89(qoj0Var, (byte) 22), this, str2, list, list3, z5, z3);
        List list4 = (List) objB;
        edo edoVar = (edo) this.b;
        wkuVar.i = str;
        wkuVar.j = list4;
        wkuVar.k = z;
        wkuVar.l = z2;
        wkuVar.o = 2;
        Object objB2 = edoVar.b(wkuVar);
        if (objB2 != wneVar) {
            list = list4;
            str2 = str;
            z3 = z2;
            objB = objB2;
            boolean z6 = z;
            List list5 = (List) objB;
            uga0 uga0Var2 = (uga0) this.f6058a;
            str2.getClass();
            linkedHashMap = uga0Var2.f35616a.f33901a;
            qga0Var = (qga0) linkedHashMap.get(str2);
            if (qga0Var != null) {
                qoj0Var = qga0Var.f28674a;
            } else {
                qga0 qga0Var3 = new qga0();
                linkedHashMap.put(str2, qga0Var3);
                qoj0Var = qga0Var3.f28674a;
            }
            return new vku(new i89(qoj0Var, (byte) 22), this, str2, list, list5, z6, z3);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6 A[PHI: r1 r2 r14 r15
  0x00e6: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v16 java.lang.Object) binds: [B:36:0x00e3, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v23 java.lang.Object) binds: [B:36:0x00e3, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r14v2 java.lang.Object) = (r14v1 java.lang.Object), (r14v3 java.lang.Object) binds: [B:36:0x00e3, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r15v1 java.util.List) = (r15v0 java.util.List), (r15v2 java.util.List) binds: [B:36:0x00e3, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object w(String str, zje zjeVar) {
        e3v e3vVar;
        Object objH;
        Object obj;
        Object obj2;
        i6t0 i6t0Var;
        Object obj3;
        List listJ;
        Object objG;
        Object objI;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str2 = str;
        if (zjeVar instanceof e3v) {
            e3vVar = (e3v) zjeVar;
            int i = e3vVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                e3vVar.q = i - Integer.MIN_VALUE;
            } else {
                e3vVar = new e3v(this, zjeVar);
            }
        } else {
            e3vVar = new e3v(this, zjeVar);
        }
        e3v e3vVar2 = e3vVar;
        Object obj8 = e3vVar2.o;
        wne wneVar = wne.f39444a;
        int i2 = e3vVar2.q;
        if (i2 == 0) {
            z1x.P(obj8);
            reu reuVar = (reu) this.f6058a;
            e3vVar2.i = str2;
            e3vVar2.q = 1;
            objH = reuVar.h(str2, e3vVar2);
            if (objH != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            str2 = e3vVar2.i;
            z1x.P(obj8);
            objH = ((j0g0) obj8).f15681a;
        } else {
            if (i2 == 2) {
                i6t0Var = e3vVar2.k;
                obj = e3vVar2.j;
                z1x.P(obj8);
                obj2 = ((j0g0) obj8).f15681a;
                obj3 = obj;
                if (i6t0Var != null) {
                    e0g0 e0g0Var = j0g0.b;
                    return new q5t0(obj3, new g0g0(new ff5(null)), new g0g0(new ff5(null)), obj2);
                }
                listJ = q3d.j(new Long(i6t0Var.f14260a), new Long(i6t0Var.b));
                b8u b8uVar = (b8u) this.b;
                long j = i6t0Var.f14260a;
                long j2 = i6t0Var.b;
                long j3 = i6t0Var.e;
                e3vVar2.i = null;
                e3vVar2.j = obj3;
                e3vVar2.k = null;
                e3vVar2.l = obj2;
                e3vVar2.m = listJ;
                e3vVar2.q = 3;
                objG = b8uVar.g(j, j2, j3, e3vVar2);
                if (objG != wneVar) {
                    e1u e1uVar = (e1u) this.c;
                    e3vVar2.i = null;
                    e3vVar2.j = obj3;
                    e3vVar2.k = null;
                    e3vVar2.l = obj2;
                    e3vVar2.m = null;
                    e3vVar2.n = objG;
                    e3vVar2.q = 4;
                    objI = e1uVar.i(listJ, e3vVar2);
                    if (objI != wneVar) {
                        Object obj9 = obj2;
                        obj4 = objI;
                        obj5 = objG;
                        obj6 = obj9;
                        obj7 = obj3;
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                List list = e3vVar2.m;
                Object obj10 = e3vVar2.l;
                Object obj11 = e3vVar2.j;
                z1x.P(obj8);
                listJ = list;
                objG = ((j0g0) obj8).f15681a;
                obj2 = obj10;
                obj3 = obj11;
                e1u e1uVar2 = (e1u) this.c;
                e3vVar2.i = null;
                e3vVar2.j = obj3;
                e3vVar2.k = null;
                e3vVar2.l = obj2;
                e3vVar2.m = null;
                e3vVar2.n = objG;
                e3vVar2.q = 4;
                objI = e1uVar2.i(listJ, e3vVar2);
                if (objI != wneVar) {
                    Object obj12 = obj2;
                    obj4 = objI;
                    obj5 = objG;
                    obj6 = obj12;
                    obj7 = obj3;
                }
                return wneVar;
            }
            if (i2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj5 = e3vVar2.n;
            obj6 = e3vVar2.l;
            obj7 = e3vVar2.j;
            z1x.P(obj8);
            obj4 = ((j0g0) obj8).f15681a;
        }
        return new q5t0(obj7, obj5, obj4, obj6);
        obj = objH;
        e0g0 e0g0Var2 = j0g0.b;
        i6t0 i6t0Var2 = (i6t0) (obj instanceof g0g0 ? null : obj);
        reu reuVar2 = (reu) this.d;
        e3vVar2.i = null;
        e3vVar2.j = obj;
        e3vVar2.k = i6t0Var2;
        e3vVar2.q = 2;
        Object objH2 = reuVar2.h(str2, e3vVar2);
        if (objH2 != wneVar) {
            obj2 = objH2;
            i6t0Var = i6t0Var2;
            obj3 = obj;
            if (i6t0Var != null) {
                e0g0 e0g0Var3 = j0g0.b;
                return new q5t0(obj3, new g0g0(new ff5(null)), new g0g0(new ff5(null)), obj2);
            }
            listJ = q3d.j(new Long(i6t0Var.f14260a), new Long(i6t0Var.b));
            b8u b8uVar2 = (b8u) this.b;
            long j4 = i6t0Var.f14260a;
            long j5 = i6t0Var.b;
            long j6 = i6t0Var.e;
            e3vVar2.i = null;
            e3vVar2.j = obj3;
            e3vVar2.k = null;
            e3vVar2.l = obj2;
            e3vVar2.m = listJ;
            e3vVar2.q = 3;
            objG = b8uVar2.g(j4, j5, j6, e3vVar2);
            if (objG != wneVar) {
                e1u e1uVar3 = (e1u) this.c;
                e3vVar2.i = null;
                e3vVar2.j = obj3;
                e3vVar2.k = null;
                e3vVar2.l = obj2;
                e3vVar2.m = null;
                e3vVar2.n = objG;
                e3vVar2.q = 4;
                objI = e1uVar3.i(listJ, e3vVar2);
                if (objI != wneVar) {
                    Object obj13 = obj2;
                    obj4 = objI;
                    obj5 = objG;
                    obj6 = obj13;
                    obj7 = obj3;
                    return new q5t0(obj7, obj5, obj4, obj6);
                }
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(boolean z, boolean z2, zje zjeVar) {
        cgu cguVar;
        boolean z3;
        boolean z4;
        List list;
        if (zjeVar instanceof cgu) {
            cguVar = (cgu) zjeVar;
            int i = cguVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cguVar.n = i - Integer.MIN_VALUE;
            } else {
                cguVar = new cgu(this, zjeVar);
            }
        } else {
            cguVar = new cgu(this, zjeVar);
        }
        Object objB = cguVar.l;
        wne wneVar = wne.f39444a;
        int i2 = cguVar.n;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.c;
            cguVar.i = z;
            cguVar.j = z2;
            cguVar.n = 1;
            objB = zfoVar.b(cguVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = cguVar.j;
            z = cguVar.i;
            z1x.P(objB);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = cguVar.j;
            boolean z6 = cguVar.i;
            List list2 = cguVar.k;
            z1x.P(objB);
            z4 = z5;
            z3 = z6;
            list = list2;
        }
        return new d7u(new i89(((fix) this.f6058a).b.b, (byte) 22), this, list, (List) objB, z3, z4, (byte) 1);
        List list3 = (List) objB;
        edo edoVar = (edo) this.b;
        cguVar.k = list3;
        cguVar.i = z;
        cguVar.j = z2;
        cguVar.n = 2;
        Object objB2 = edoVar.b(cguVar);
        if (objB2 != wneVar) {
            z3 = z;
            z4 = z2;
            list = list3;
            objB = objB2;
            return new d7u(new i89(((fix) this.f6058a).b.b, (byte) 22), this, list, (List) objB, z3, z4, (byte) 1);
        }
        return wneVar;
    }

    public ArrayList y() {
        List list = (List) this.d;
        ArrayList arrayListA = ((zwu) this.b).a(((wyu) this.f6058a).a(), ((wgu) this.c).a());
        ArrayList arrayList = new ArrayList(r3d.q(arrayListA, 10));
        int i = 0;
        for (Object obj : arrayListA) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            String str = (String) obj;
            ern0 ern0Var = (ern0) CollectionsKt.W(i, list);
            if (ern0Var == null) {
                ern0Var = (ern0) CollectionsKt.U(list);
            }
            arrayList.add(new lrn0(ern0Var, str));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r8
  0x0052: PHI (r2v3 java.util.Iterator) = (r2v1 java.util.Iterator), (r2v4 java.util.Iterator), (r2v4 java.util.Iterator) binds: [B:19:0x004c, B:41:0x009e, B:36:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r8v1 a.g0f) = (r8v0 a.g0f), (r8v2 a.g0f), (r8v2 a.g0f) binds: [B:19:0x004c, B:41:0x009e, B:36:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:29:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object z(java.util.List r13, a.zje r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof a.lpx
            if (r0 == 0) goto L13
            r0 = r14
            a.lpx r0 = (a.lpx) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.lpx r0 = new a.lpx
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L31
            double r6 = r0.l
            a.q88 r13 = r0.k
            java.util.Iterator r2 = r0.j
            a.g0f r8 = r0.i
            a.z1x.P(r14)
            goto L7b
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L38:
            a.z1x.P(r14)
            java.lang.Object r14 = r12.f6058a
            a.ert r14 = (a.ert) r14
            a.g0f r14 = r14.a()
            if (r13 == 0) goto L4c
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L4c
            goto La2
        L4c:
            java.util.Iterator r13 = r13.iterator()
            r2 = r13
            r8 = r14
        L52:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto La2
            java.lang.Object r13 = r2.next()
            a.q88 r13 = (a.q88) r13
            int r14 = r13.f28287a
            if (r14 != 0) goto L65
            double r6 = r8.c
            goto L66
        L65:
            r6 = r3
        L66:
            java.lang.Object r9 = r12.c
            a.rq r9 = (a.rq) r9
            r0.i = r8
            r0.j = r2
            r0.k = r13
            r0.l = r6
            r0.o = r5
            java.lang.Object r14 = r9.a(r14, r0)
            if (r14 != r1) goto L7b
            return r1
        L7b:
            java.lang.Number r14 = (java.lang.Number) r14
            double r9 = r14.doubleValue()
            java.lang.String r13 = r13.g
            java.lang.Double r13 = kotlin.text.b.i(r13)
            if (r13 == 0) goto L8e
            double r13 = r13.doubleValue()
            goto L8f
        L8e:
            r13 = r3
        L8f:
            boolean r11 = r8.i
            if (r11 == 0) goto L98
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 < 0) goto La1
            goto L52
        L98:
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 > 0) goto La1
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 > 0) goto La1
            goto L52
        La1:
            r5 = 0
        La2:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dgu.z(java.util.List, a.zje):java.lang.Object");
    }

    public dgu(br20 br20Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            ar20 ar20Var = br20Var.b;
            if (ar20Var == null) {
                break;
            }
            boolean zEquals = ar20Var.equals(cy2.j0);
            lvq0 lvq0Var = new lvq0(br20Var.b, br20Var.g, br20Var.h, arrayList.size(), zEquals ? -1 : arrayList2.size());
            arrayList.add(lvq0Var);
            if (!zEquals) {
                arrayList2.add(lvq0Var);
            }
            ar20 ar20Var2 = br20Var.c;
            br20Var.b = ar20Var2;
            br20Var.g = br20Var.h;
            if (ar20Var2 != null) {
                br20Var.b();
            }
        }
        this.f6058a = arrayList;
        this.b = arrayList2;
        this.c = br20Var.d;
        this.d = l1e0.o(br20Var.e, br20Var.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lvq0) arrayList.get(i)).d != i) {
                throw new byw("");
            }
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((lvq0) arrayList2.get(i2)).e != i2) {
                throw new byw("");
            }
        }
    }

    public dgu(wyu wyuVar, zwu zwuVar, wgu wguVar) {
        wyuVar.getClass();
        wguVar.getClass();
        this.f6058a = wyuVar;
        this.b = zwuVar;
        this.c = wguVar;
        this.d = q3d.j(brn0.f3087a, drn0.f6570a, crn0.f4853a);
    }

    public dgu(pou pouVar, ieu ieuVar, ntu ntuVar, wyu wyuVar) {
        wyuVar.getClass();
        this.f6058a = pouVar;
        this.b = ieuVar;
        this.c = ntuVar;
        this.d = wyuVar;
    }

    public dgu(fix fixVar, edo edoVar, zfo zfoVar, j1q0 j1q0Var) {
        edoVar.getClass();
        zfoVar.getClass();
        j1q0Var.getClass();
        this.f6058a = fixVar;
        this.b = edoVar;
        this.c = zfoVar;
        this.d = j1q0Var;
    }

    public dgu(j910 j910Var, i910 i910Var, btt0 btt0Var, knf0 knf0Var) {
        i910Var.getClass();
        this.f6058a = j910Var;
        this.b = i910Var;
        this.c = btt0Var;
        this.d = knf0Var;
    }

    public dgu(uga0 uga0Var, edo edoVar, zfo zfoVar, j1q0 j1q0Var) {
        edoVar.getClass();
        zfoVar.getClass();
        j1q0Var.getClass();
        this.f6058a = uga0Var;
        this.b = edoVar;
        this.c = zfoVar;
        this.d = j1q0Var;
    }

    public dgu(sqt sqtVar, xoc xocVar, ntu ntuVar, lbu lbuVar, pru pruVar) {
        this.f6058a = xocVar;
        this.b = ntuVar;
        this.c = lbuVar;
        this.d = pruVar;
    }

    public dgu(p530 p530Var, j1q0 j1q0Var, edo edoVar, zfo zfoVar) {
        j1q0Var.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        this.f6058a = p530Var;
        this.d = j1q0Var;
        this.b = edoVar;
        this.c = zfoVar;
    }

    public dgu(mne mneVar, abu abuVar, pcv pcvVar, knf0 knf0Var) {
        pcvVar.getClass();
        knf0Var.getClass();
        this.f6058a = mneVar;
        this.b = abuVar;
        this.c = pcvVar;
        this.d = knf0Var;
    }

    public dgu(abu abuVar, auv auvVar, knf0 knf0Var, mne mneVar) {
        auvVar.getClass();
        knf0Var.getClass();
        this.f6058a = abuVar;
        this.b = auvVar;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public dgu(xfu xfuVar, ovo0 ovo0Var, knf0 knf0Var, kuy kuyVar) {
        ovo0Var.getClass();
        knf0Var.getClass();
        kuyVar.getClass();
        this.f6058a = xfuVar;
        this.b = ovo0Var;
        this.c = knf0Var;
        this.d = kuyVar;
    }

    public dgu(z220 z220Var, uzc uzcVar, gst0 gst0Var, rtu rtuVar) {
        uzcVar.getClass();
        gst0Var.getClass();
        this.f6058a = z220Var;
        this.b = uzcVar;
        this.c = gst0Var;
        this.d = rtuVar;
    }

    public dgu(dq00 dq00Var, knf0 knf0Var, btt0 btt0Var, mne mneVar) {
        knf0Var.getClass();
        btt0Var.getClass();
        this.f6058a = dq00Var;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = mneVar;
    }

    public dgu(svu svuVar, uzc uzcVar, wdu wduVar, ocl oclVar) {
        uzcVar.getClass();
        this.f6058a = svuVar;
        this.b = uzcVar;
        this.c = wduVar;
        this.d = oclVar;
    }

    public dgu(w5z w5zVar, uzc uzcVar, uqe uqeVar, b3c0 b3c0Var, gst0 gst0Var) {
        b3c0Var.getClass();
        gst0Var.getClass();
        this.f6058a = w5zVar;
        this.b = uzcVar;
        this.c = b3c0Var;
        this.d = gst0Var;
    }

    public /* synthetic */ dgu(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6058a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public dgu(mne mneVar, u8u u8uVar, izy izyVar, knf0 knf0Var) {
        izyVar.getClass();
        knf0Var.getClass();
        this.f6058a = mneVar;
        this.b = u8uVar;
        this.c = izyVar;
        this.d = knf0Var;
    }

    public dgu(w5z w5zVar, ljf0 ljf0Var, xmk0 xmk0Var, Map map, bj5 bj5Var) {
        this.f6058a = w5zVar;
        this.b = ljf0Var;
        this.c = xmk0Var;
        this.d = map;
    }

    public dgu(Typeface typeface, od40 od40Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.f6058a = od40Var;
        this.c = new td40(1024);
        int iA = od40Var.a(6);
        if (iA != 0) {
            int i5 = iA + od40Var.f15098a;
            i = ((ByteBuffer) od40Var.d).getInt(((ByteBuffer) od40Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = od40Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + od40Var.f15098a;
            i2 = ((ByteBuffer) od40Var.d).getInt(((ByteBuffer) od40Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            u0t0 u0t0Var = new u0t0(this, i7);
            nd40 nd40VarB = u0t0Var.b();
            int iA3 = nd40VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) nd40VarB.d).getInt(iA3 + nd40VarB.f15098a) : 0, (char[]) this.b, i7 * 2);
            nd40 nd40VarB2 = u0t0Var.b();
            int iA4 = nd40VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + nd40VarB2.f15098a;
                i3 = ((ByteBuffer) nd40VarB2.d).getInt(((ByteBuffer) nd40VarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            z1x.t("invalid metadata codepoint length", i3 > 0);
            td40 td40Var = (td40) this.c;
            nd40 nd40VarB3 = u0t0Var.b();
            int iA5 = nd40VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + nd40VarB3.f15098a;
                i4 = ((ByteBuffer) nd40VarB3.d).getInt(((ByteBuffer) nd40VarB3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            td40Var.a(u0t0Var, 0, i4 - 1);
        }
    }

    public dgu(jru jruVar) {
        this.f6058a = new yxv();
        this.b = new yxv();
        this.d = new s9m0();
    }

    public dgu(nzw nzwVar, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int iIntValue;
        sbe sbeVar;
        vx9 vx9VarD;
        vx9 vx9VarD2;
        ld40 ld40Var;
        e1x e1xVar;
        byte b;
        ld40 ld40Var2;
        ofm0.m();
        this.f6058a = nzwVar;
        q3a q3aVar = (q3a) nzwVar.e(fpt0.F0, null);
        if (q3aVar != null) {
            final byte b2 = 2;
            ucs0 ucs0Var = new ucs0((byte) 2);
            q3aVar.a(nzwVar, ucs0Var);
            this.b = ucs0Var.j();
            final esg0 esg0Var = new esg0();
            esg0Var.f8326a = null;
            esg0Var.f = null;
            this.c = esg0Var;
            Executor executor = (Executor) nzwVar.e(uox.u0, vox.a());
            Objects.requireNonNull(executor);
            final krs0 krs0Var = new krs0(executor, cameraCharacteristics);
            ArrayList arrayList = new ArrayList();
            if (((Integer) nzwVar.e(h0x.i0, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(256);
            } else {
                Integer num = (Integer) nzwVar.e(nzw.e, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    Integer num2 = (Integer) nzwVar.e(h0x.h0, null);
                    if (num2 == null || num2.intValue() != 4101) {
                        iIntValue = (num2 == null || num2.intValue() != 32) ? 256 : 32;
                    } else {
                        iIntValue = 4101;
                    }
                }
                arrayList.add(Integer.valueOf(iIntValue));
            }
            int iK = nzwVar.k();
            if (nzwVar.e(nzw.g, null) == null) {
                gjn gjnVar = new gjn();
                gjn gjnVar2 = new gjn();
                r15 r15Var = new r15(size, iK, arrayList, z, gjnVar, gjnVar2);
                this.d = r15Var;
                final byte b3 = 1;
                z1x.y("CaptureNode does not support recreation yet.", ((r15) esg0Var.e) == null && ((ibe0) esg0Var.b) == null);
                esg0Var.e = r15Var;
                wx9 wx9Var = new wx9(esg0Var, b3);
                boolean z2 = arrayList.size() > 1;
                if (!z) {
                    if (z2) {
                        b = 0;
                        ld40 ld40Var3 = new ld40(size.getWidth(), size.getHeight(), 256, 4);
                        vx9 vx9VarD3 = cfx0.D(wx9Var, ld40Var3.b);
                        ld40Var = new ld40(size.getWidth(), size.getHeight(), 32, 4);
                        vx9VarD2 = cfx0.D(wx9Var, ld40Var.b);
                        ld40Var2 = ld40Var3;
                        vx9VarD = vx9VarD3;
                    } else {
                        b = 0;
                        ld40 ld40Var4 = new ld40(size.getWidth(), size.getHeight(), iK, 4);
                        vx9VarD = cfx0.D(wx9Var, ld40Var4.b);
                        vx9VarD2 = null;
                        ld40Var = null;
                        ld40Var2 = ld40Var4;
                    }
                    final byte b4 = b;
                    sbeVar = new sbe() { // from class: a.c8a
                        @Override // a.sbe
                        public final void accept(Object obj) {
                            byte b5 = b4;
                            esg0 esg0Var2 = esg0Var;
                            switch (b5) {
                                case 0:
                                    esg0Var2.o0((dzb0) obj);
                                    break;
                                case 1:
                                    dzb0 dzb0Var = (dzb0) obj;
                                    esg0Var2.o0(dzb0Var);
                                    zn00 zn00Var = (zn00) esg0Var2.f;
                                    z1x.y("Pending request should be null", ((dzb0) zn00Var.b) == null);
                                    zn00Var.b = dzb0Var;
                                    break;
                                default:
                                    esg0Var2.x0((n55) obj);
                                    break;
                            }
                        }
                    };
                    e1xVar = ld40Var2;
                } else {
                    cgx0 cgx0VarR = g1x.r(size.getWidth(), size.getHeight(), iK, 4);
                    zn00 zn00Var = new zn00();
                    zn00Var.f44650a = cgx0VarR;
                    esg0Var.f = zn00Var;
                    sbeVar = new sbe() { // from class: a.c8a
                        @Override // a.sbe
                        public final void accept(Object obj) {
                            byte b5 = b3;
                            esg0 esg0Var2 = esg0Var;
                            switch (b5) {
                                case 0:
                                    esg0Var2.o0((dzb0) obj);
                                    break;
                                case 1:
                                    dzb0 dzb0Var = (dzb0) obj;
                                    esg0Var2.o0(dzb0Var);
                                    zn00 zn00Var2 = (zn00) esg0Var2.f;
                                    z1x.y("Pending request should be null", ((dzb0) zn00Var2.b) == null);
                                    zn00Var2.b = dzb0Var;
                                    break;
                                default:
                                    esg0Var2.x0((n55) obj);
                                    break;
                            }
                        }
                    };
                    vx9VarD = wx9Var;
                    vx9VarD2 = null;
                    ld40Var = null;
                    e1xVar = zn00Var;
                }
                r15Var.f29660a = vx9VarD;
                if (z2 && vx9VarD2 != null) {
                    r15Var.b = vx9VarD2;
                }
                Surface surface = e1xVar.getSurface();
                Objects.requireNonNull(surface);
                z1x.y("The surface is already set.", r15Var.c == null);
                r15Var.c = new o3x(surface, size, iK);
                esg0Var.b = new ibe0(e1xVar);
                byte b5 = 22;
                e1xVar.o(new gne(esg0Var, b5), j120.T());
                if (z2 && ld40Var != null) {
                    Surface surface2 = ld40Var.getSurface();
                    z1x.y("The secondary surface is already set.", r15Var.d == null);
                    r15Var.d = new o3x(surface2, size, iK);
                    esg0Var.c = new ibe0(ld40Var);
                    ld40Var.o(new gne(esg0Var, b5), j120.T());
                }
                gjnVar.b = sbeVar;
                gjnVar2.b = new sbe() { // from class: a.c8a
                    @Override // a.sbe
                    public final void accept(Object obj) {
                        byte b6 = b2;
                        esg0 esg0Var2 = esg0Var;
                        switch (b6) {
                            case 0:
                                esg0Var2.o0((dzb0) obj);
                                break;
                            case 1:
                                dzb0 dzb0Var = (dzb0) obj;
                                esg0Var2.o0(dzb0Var);
                                zn00 zn00Var2 = (zn00) esg0Var2.f;
                                z1x.y("Pending request should be null", ((dzb0) zn00Var2.b) == null);
                                zn00Var2.b = dzb0Var;
                                break;
                            default:
                                esg0Var2.x0((n55) obj);
                                break;
                        }
                    }
                };
                gjn gjnVar3 = new gjn();
                gjn gjnVar4 = new gjn();
                r45 r45Var = new r45(gjnVar3, gjnVar4, iK, arrayList);
                esg0Var.d = r45Var;
                krs0Var.c = r45Var;
                final byte b6 = 0;
                gjnVar3.b = new sbe() { // from class: a.azb0
                    @Override // a.sbe
                    public final void accept(Object obj) throws Exception {
                        byte b7 = b6;
                        krs0 krs0Var2 = krs0Var;
                        s45 s45Var = (s45) obj;
                        switch (b7) {
                            case 0:
                                if (!s45Var.f31589a.g.g) {
                                    ((Executor) krs0Var2.b).execute(new bzb0(krs0Var2, s45Var, (byte) 1));
                                } else {
                                    s45Var.b.close();
                                }
                                break;
                            default:
                                if (!s45Var.f31589a.g.g) {
                                    ((Executor) krs0Var2.b).execute(new bzb0(krs0Var2, s45Var, (byte) 0));
                                } else {
                                    l8x.E0("ProcessingNode", "The postview image is closed due to request aborted");
                                    s45Var.b.close();
                                }
                                break;
                        }
                    }
                };
                final byte b7 = 1;
                gjnVar4.b = new sbe() { // from class: a.azb0
                    @Override // a.sbe
                    public final void accept(Object obj) throws Exception {
                        byte b8 = b7;
                        krs0 krs0Var2 = krs0Var;
                        s45 s45Var = (s45) obj;
                        switch (b8) {
                            case 0:
                                if (!s45Var.f31589a.g.g) {
                                    ((Executor) krs0Var2.b).execute(new bzb0(krs0Var2, s45Var, (byte) 1));
                                } else {
                                    s45Var.b.close();
                                }
                                break;
                            default:
                                if (!s45Var.f31589a.g.g) {
                                    ((Executor) krs0Var2.b).execute(new bzb0(krs0Var2, s45Var, (byte) 0));
                                } else {
                                    l8x.E0("ProcessingNode", "The postview image is closed due to request aborted");
                                    s45Var.b.close();
                                }
                                break;
                        }
                    }
                };
                krs0Var.d = new xi70();
                krs0Var.e = new hnu((kpd0) krs0Var.k);
                krs0Var.g = new art();
                krs0Var.f = new kl5();
                krs0Var.h = new rqt();
                krs0Var.j = new bst();
                if (iK == 35 || krs0Var.f18784a) {
                    krs0Var.i = new gst();
                    return;
                }
                return;
            }
            hny.b();
            throw null;
        }
        hny.w((String) nzwVar.e(xto0.z0, nzwVar.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public dgu(rcf0 rcf0Var, zpu zpuVar, j910 j910Var, zn00 zn00Var) {
        Object objO;
        if (rcf0Var != null) {
            objO = b4x.o(rcf0Var);
        } else {
            v3x v3xVar = b4x.b;
            objO = rcf0.e;
        }
        this.f6058a = objO;
        this.b = zpuVar;
        this.c = j910Var;
        this.d = zn00Var;
    }
}
