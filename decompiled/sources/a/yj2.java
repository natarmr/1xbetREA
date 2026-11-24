package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes4.dex */
public final class yj2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42723a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public yj2(hie0 hie0Var, kmq kmqVar, Function2 function2) {
        this.f42723a = (byte) 14;
        this.c = hie0Var;
        this.b = kmqVar;
        this.d = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object c(yje yjeVar, Object obj) {
        vfu vfuVar;
        Iterator it;
        Object next;
        if (yjeVar instanceof vfu) {
            vfuVar = (vfu) yjeVar;
            int i = vfuVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfuVar.j = i - Integer.MIN_VALUE;
            } else {
                vfuVar = new vfu(this, yjeVar);
            }
        } else {
            vfuVar = new vfu(this, yjeVar);
        }
        Object obj2 = vfuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vfuVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            List list = (List) obj;
            List list2 = (List) this.c;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                giw giwVar = (giw) it2.next();
                List<nas> list3 = giwVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (nas nasVar : list3) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            next = null;
                            break;
                        }
                        next = it3.next();
                        it = it2;
                        if (nasVar.f23205a == ((d0t) next).f5282a) {
                            break;
                        }
                        it2 = it;
                    }
                    d0t d0tVar = (d0t) next;
                    if (d0tVar != null) {
                        arrayList2.add(d0tVar);
                    }
                    it2 = it;
                }
                Iterator it4 = it2;
                String str = giwVar.b;
                String str2 = giwVar.c;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = (String) this.d;
                }
                arrayList.add(new tiw(giwVar.f11368a, str2, str, giwVar.d, arrayList2, giwVar.g, giwVar.f));
                it2 = it4;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((tiw) obj3).f34025a.isEmpty()) {
                    arrayList3.add(obj3);
                }
            }
            j0g0 j0g0Var = new j0g0(arrayList3);
            vfuVar.j = 1;
            if (kmqVar.a(j0g0Var, vfuVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private final Object d(yje yjeVar, Object obj) throws Throwable {
        cwu cwuVar;
        Throwable th;
        Object next;
        mie0 mie0Var = (mie0) this.d;
        if (yjeVar instanceof cwu) {
            cwuVar = (cwu) yjeVar;
            int i = cwuVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwuVar.j = i - Integer.MIN_VALUE;
            } else {
                cwuVar = new cwu(this, yjeVar);
            }
        } else {
            cwuVar = new cwu(this, yjeVar);
        }
        Object obj2 = cwuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cwuVar.j;
        Throwable th2 = null;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            Set set = (Set) obj;
            boolean zIsEmpty = set.isEmpty();
            List list = (List) this.c;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            boolean z = false;
            int i3 = 0;
            for (Object obj3 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th3 = th2;
                    q3d.p();
                    throw th3;
                }
                t9m0 t9m0Var = (t9m0) obj3;
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        th = th2;
                        next = th;
                        break;
                    }
                    next = it.next();
                    th = th2;
                    if (((StatisticBlockModel) next).f46623a == t9m0Var) {
                        break;
                    }
                    th2 = th;
                }
                StatisticBlockModel statisticBlockModel = (StatisticBlockModel) next;
                if (statisticBlockModel == null) {
                    if (!zIsEmpty) {
                        i3 = Integer.MAX_VALUE;
                    }
                    statisticBlockModel = new StatisticBlockModel(t9m0Var, i3, true);
                }
                arrayList.add(statisticBlockModel);
                th2 = th;
                i3 = i4;
            }
            Object obj4 = mie0Var.f21842a;
            if (obj4 != null && !obj4.equals(arrayList)) {
                z = true;
            }
            mie0Var.f21842a = arrayList;
            kam0 kam0Var = new kam0(arrayList, z);
            cwuVar.j = 1;
            if (kmqVar.a(kam0Var, cwuVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd A[LOOP:1: B:27:0x00c2->B:32:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6 A[EDGE_INSN: B:48:0x00e6->B:34:0x00e6 BREAK  A[LOOP:1: B:27:0x00c2->B:32:0x00dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a0 -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object e(a.yje r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.e(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r2 = r1;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        if (r1.a(r5, r3) == r4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(a.yje r18, java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.f(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r2 = r1;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r1.a(r0, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        if (r1.a(r5, r3) == r4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(a.yje r18, java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.h(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r8.a(r9, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(a.yje r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.x230
            if (r0 == 0) goto L13
            r0 = r8
            a.x230 r0 = (a.x230) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.x230 r0 = new a.x230
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r8)
            goto L65
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L31:
            a.kmq r7 = r0.l
            a.z1x.P(r8)
            goto L58
        L37:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.b
            a.kmq r8 = (a.kmq) r8
            a.aw20 r9 = (a.aw20) r9
            if (r9 != 0) goto L5a
            java.lang.Object r9 = r7.c
            a.pyu r9 = (a.pyu) r9
            java.lang.Object r7 = r7.d
            a.aw20 r7 = (a.aw20) r7
            r0.l = r8
            r0.j = r4
            java.lang.Object r7 = r9.e(r7, r0)
            if (r7 != r1) goto L55
            goto L64
        L55:
            r6 = r8
            r8 = r7
            r7 = r6
        L58:
            r9 = r8
            r8 = r7
        L5a:
            r0.l = r5
            r0.j = r3
            java.lang.Object r7 = r8.a(r9, r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.j(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc A[LOOP:1: B:11:0x004c->B:23:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[EDGE_INSN: B:32:0x00bf->B:24:0x00bf BREAK  A[LOOP:1: B:11:0x004c->B:23:0x00bc], SYNTHETIC] */
    private final Object k(yje yjeVar, Object obj) {
        ((Boolean) obj).getClass();
        h63 h63Var = new h63((y1h0) ((hgk0) ((oms0) this.b).d).getValue());
        ngk0 ngk0Var = (ngk0) this.c;
        for (h63 h63Var2 : CollectionsKt.L0(ngk0Var.c)) {
            if (!Intrinsics.d(h63Var2, h63Var)) {
                ngk0Var.remove(h63Var2);
            }
        }
        qy40 qy40Var = (qy40) this.d;
        long[] jArr = qy40Var.f29517a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = qy40Var.b[i4];
                            float f = qy40Var.c[i4];
                            if (!Intrinsics.d((h63) obj2, h63Var)) {
                                qy40Var.e--;
                                long[] jArr2 = qy40Var.f29517a;
                                int i5 = qy40Var.d;
                                int i6 = i4 >> 3;
                                int i7 = (i4 & 7) << 3;
                                long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                jArr2[i6] = j2;
                                jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                qy40Var.b[i4] = null;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r12.a(r11, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(a.yje r12, java.lang.Object r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof a.gc60
            if (r0 == 0) goto L13
            r0 = r12
            a.gc60 r0 = (a.gc60) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.gc60 r0 = new a.gc60
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r12)
            goto L8b
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r5
        L31:
            a.kmq r11 = r0.k
            a.z1x.P(r12)
            goto L62
        L37:
            a.z1x.P(r12)
            java.lang.Object r12 = r11.b
            a.kmq r12 = (a.kmq) r12
            a.ctx r13 = (a.ctx) r13
            boolean r2 = r13.f4964a
            if (r2 == 0) goto L4c
            a.cc60 r11 = new a.cc60
            a.n3w r13 = r13.b
            r11.<init>(r13)
            goto L80
        L4c:
            java.lang.Object r2 = r11.c
            a.ywq0 r2 = (a.ywq0) r2
            java.lang.Object r11 = r11.d
            a.s77 r11 = (a.s77) r11
            r0.k = r12
            r0.j = r4
            java.io.Serializable r11 = r2.m(r13, r11, r0)
            if (r11 != r1) goto L5f
            goto L8a
        L5f:
            r10 = r12
            r12 = r11
            r11 = r10
        L62:
            a.n3w r12 = (a.n3w) r12
            a.s77 r13 = r12.c
            a.s77 r2 = a.s77.SALE
            if (r13 != r2) goto L7a
            double r6 = r12.m
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L7a
            a.bc60 r13 = new a.bc60
            r13.<init>(r12)
        L77:
            r12 = r11
            r11 = r13
            goto L80
        L7a:
            a.cc60 r13 = new a.cc60
            r13.<init>(r12)
            goto L77
        L80:
            r0.k = r5
            r0.j = r3
            java.lang.Object r11 = r12.a(r11, r0)
            if (r11 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.l(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0296  */
    /* JADX WARN: Code duplicated, block: B:156:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:159:0x031a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0334  */
    /* JADX WARN: Code duplicated, block: B:166:0x0344  */
    /* JADX WARN: Code duplicated, block: B:169:0x035a A[LOOP:4: B:164:0x033e->B:169:0x035a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0368  */
    /* JADX WARN: Code duplicated, block: B:177:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x039e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03be  */
    /* JADX WARN: Code duplicated, block: B:190:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:192:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:196:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:201:0x040a  */
    /* JADX WARN: Code duplicated, block: B:202:0x040f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0418  */
    /* JADX WARN: Code duplicated, block: B:206:0x041e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0420  */
    /* JADX WARN: Code duplicated, block: B:209:0x0426  */
    /* JADX WARN: Code duplicated, block: B:213:0x0433  */
    /* JADX WARN: Code duplicated, block: B:215:0x0443  */
    /* JADX WARN: Code duplicated, block: B:219:0x0457  */
    /* JADX WARN: Code duplicated, block: B:239:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:264:0x052e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0594  */
    /* JADX WARN: Code duplicated, block: B:312:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:321:0x060a  */
    /* JADX WARN: Code duplicated, block: B:368:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:419:0x0800  */
    /* JADX WARN: Code duplicated, block: B:442:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:464:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:488:0x098c  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:610:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [a.kmq, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x031a -> B:160:0x031f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008b -> B:27:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r32, a.yje r33) {
        /*
            Method dump skipped, instruction units count: 3040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (a.s0x.P(r4.getContext()).e(r1, r4) == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        if (r3.l(1, 0, r4) == r5) goto L54;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b0 -> B:33:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.v7s r17, a.yje r18) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj2.b(a.v7s, a.yje):java.lang.Object");
    }

    public /* synthetic */ yj2(Object obj, Serializable serializable, kmq kmqVar, byte b) {
        this.f42723a = b;
        this.c = obj;
        this.d = serializable;
        this.b = kmqVar;
    }

    public /* synthetic */ yj2(Object obj, Object obj2, Object obj3, byte b) {
        this.f42723a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
