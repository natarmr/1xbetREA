package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class bel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2455a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[LOOP:0: B:23:0x006d->B:27:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[EDGE_INSN: B:54:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:23:0x006d->B:27:0x0081], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(a.inn0 r17, long r18, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.a(a.inn0, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.mie0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static final Object b(inn0 inn0Var, long j, zje zjeVar) {
        tdl tdlVar;
        Object obj;
        dpa0 dpa0Var;
        hie0 hie0Var;
        if (zjeVar instanceof tdl) {
            tdlVar = (tdl) zjeVar;
            int i = tdlVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdlVar.m = i - Integer.MIN_VALUE;
            } else {
                tdlVar = new tdl(zjeVar);
            }
        } else {
            tdlVar = new tdl(zjeVar);
        }
        Object obj2 = tdlVar.l;
        Object obj3 = wne.f39444a;
        int i2 = tdlVar.m;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                if (!h(inn0Var.f.s, j)) {
                    List list = inn0Var.f.s.f39485a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (b5x.I(((dpa0) obj).f6456a, j)) {
                            break;
                        }
                        i3++;
                    }
                    dpa0Var = (dpa0) obj;
                    if (dpa0Var != null) {
                        mie0 mie0Var = new mie0();
                        mie0 mie0Var2 = new mie0();
                        mie0Var2.f21842a = dpa0Var;
                        long jC = inn0Var.e().c();
                        hie0 hie0Var2 = new hie0();
                        Function2 udlVar = new udl(hie0Var2, mie0Var2, mie0Var, null);
                        tdlVar.i = dpa0Var;
                        tdlVar.j = mie0Var;
                        tdlVar.k = hie0Var2;
                        tdlVar.m = 1;
                        if (inn0Var.g(jC, udlVar, tdlVar) == obj3) {
                            return obj3;
                        }
                        hie0Var = hie0Var2;
                        j = mie0Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hie0Var = tdlVar.k;
            mie0 mie0Var3 = tdlVar.j;
            dpa0Var = tdlVar.i;
            z1x.P(obj2);
            j = mie0Var3;
            if (hie0Var.f13108a) {
                dpa0 dpa0Var2 = (dpa0) j.f21842a;
                return dpa0Var2 == null ? dpa0Var : dpa0Var2;
            }
            return null;
        } catch (yoa0 unused) {
            dpa0 dpa0Var3 = (dpa0) j.f21842a;
            return dpa0Var3 == null ? dpa0Var : dpa0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc A[LOOP:0: B:26:0x00b7->B:30:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5 A[EDGE_INSN: B:68:0x00d5->B:32:0x00d5 BREAK  A[LOOP:0: B:26:0x00b7->B:30:0x00cc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0160 -> B:62:0x0166). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(a.inn0 r18, long r19, kotlin.jvm.functions.Function2 r21, a.zw5 r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.c(a.inn0, long, kotlin.jvm.functions.Function2, a.zw5):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8 A[LOOP:0: B:24:0x00b3->B:28:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1 A[EDGE_INSN: B:66:0x00d1->B:30:0x00d1 BREAK  A[LOOP:0: B:24:0x00b3->B:28:0x00c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0166 -> B:60:0x016d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(a.inn0 r18, long r19, int r21, a.i3l r22, a.zw5 r23) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.d(a.inn0, long, int, a.i3l, a.zw5):java.lang.Object");
    }

    public static final Object e(hpa0 hpa0Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, yje yjeVar) {
        Object objY = ebc.Y(hpa0Var, new xdl(new xal((byte) 3), new gn(function1, (byte) 17), function3, function2, new y(function0, (byte) 29), (yje) null), yjeVar);
        wne wneVar = wne.f39444a;
        if (objY != wneVar) {
            objY = Unit.f46060a;
        }
        return objY == wneVar ? objY : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(a.inn0 r4, long r5, kotlin.jvm.functions.Function1 r7, a.zw5 r8) {
        /*
            boolean r0 = r8 instanceof a.ydl
            if (r0 == 0) goto L13
            r0 = r8
            a.ydl r0 = (a.ydl) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.ydl r0 = new a.ydl
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r4 = r0.j
            a.inn0 r5 = r0.i
            a.z1x.P(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r4)
            r4 = 0
            return r4
        L34:
            a.z1x.P(r8)
        L37:
            r0.i = r4
            r0.j = r7
            r0.l = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            a.dpa0 r8 = (a.dpa0) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = a.x2x.L(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f6456a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.g(a.inn0, long, kotlin.jvm.functions.Function1, a.zw5):java.lang.Object");
    }

    public static final boolean h(woa0 woa0Var, long j) {
        Object obj;
        List list = woa0Var.f39485a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (b5x.I(((dpa0) obj).f6456a, j)) {
                break;
            }
            i++;
        }
        dpa0 dpa0Var = (dpa0) obj;
        if (dpa0Var != null && dpa0Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float i(wgu0 wgu0Var, int i) {
        return i == 2 ? wgu0Var.h() * f2455a : wgu0Var.h();
    }

    /* JADX WARN: Code duplicated, block: B:234:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0294  */
    /* JADX WARN: Code duplicated, block: B:42:0x02b0 A[LOOP:8: B:38:0x0292->B:42:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x040b -> B:91:0x03bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0446 -> B:164:0x05a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0450 -> B:117:0x0466). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0581 -> B:159:0x0587). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x059c -> B:164:0x05a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x0601 -> B:175:0x0604). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0235 -> B:31:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02cb -> B:31:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0322 -> B:77:0x038a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0376 -> B:74:0x037f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(a.inn0 r25, a.dpa0 r26, a.xal r27, a.gn r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function0 r30, a.y r31, a.zw5 r32) {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.j(a.inn0, a.dpa0, a.xal, a.gn, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, a.y, a.zw5):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[LOOP:0: B:24:0x0087->B:28:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a7 A[EDGE_INSN: B:73:0x00a7->B:30:0x00a7 BREAK  A[LOOP:0: B:24:0x0087->B:28:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(a.inn0 r17, long r18, a.edl r20, a.zw5 r21) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bel.k(a.inn0, long, a.edl, a.zw5):java.lang.Object");
    }
}
