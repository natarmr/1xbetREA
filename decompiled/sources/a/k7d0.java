package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iag0 f17814a;
    public final ex9 b;
    public final gx9 c;
    public final vne d;
    public final pzu e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public k7d0(yg90 yg90Var, iag0 iag0Var, ex9 ex9Var, gx9 gx9Var, qcq0 qcq0Var) {
        yg90Var.getClass();
        iag0Var.getClass();
        ex9Var.getClass();
        gx9Var.getClass();
        qcq0Var.getClass();
        this.f17814a = iag0Var;
        this.b = ex9Var;
        this.c = gx9Var;
        vne vneVar = qcq0Var.f28496a;
        this.d = vneVar;
        yje yjeVar = null;
        pzu pzuVar = new pzu(new prc0(1, this, k7d0.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, (byte) 6), new k6d0(this, yjeVar, (byte) 1));
        vneVar.getClass();
        if (!((x04) pzuVar.d).a()) {
            jf4.n("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (qjj.W(vneVar, null, null, new coc0(pzuVar, yjeVar, (byte) 2), 3).isCancelled()) {
            pzuVar.z(null);
        }
        this.e = pzuVar;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
    }

    public final void a(String str) {
        str.getClass();
        hmf0 hmf0Var = new hmf0(str);
        if (((q99) this.e.e).f(hmf0Var) instanceof ytb) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) g0a.b(str)) + '!');
            hmf0Var.b.N(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:44:0x00da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00ac
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Set r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7d0.b(java.util.Set, a.zje):java.lang.Object");
    }

    public final Unit c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z6d0 z6d0Var = (z6d0) it.next();
            z6d0Var.c.b();
            this.g.remove(z6d0Var);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, List list, ew9 ew9Var, vne vneVar, zje zjeVar) {
        e7d0 e7d0Var;
        if (zjeVar instanceof e7d0) {
            e7d0Var = (e7d0) zjeVar;
            int i = e7d0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7d0Var.n = i - Integer.MIN_VALUE;
            } else {
                e7d0Var = new e7d0(this, zjeVar);
            }
        } else {
            e7d0Var = new e7d0(this, zjeVar);
        }
        Object objB = e7d0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = e7d0Var.n;
        if (i2 == 0) {
            z1x.P(objB);
            Log.d("CXCP", "Opening " + ((Object) g0a.b(str)) + " with retries...");
            e7d0Var.i = str;
            e7d0Var.j = list;
            e7d0Var.k = vneVar;
            e7d0Var.n = 1;
            objB = this.f17814a.b(str, this.b, ew9Var, e7d0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vneVar = e7d0Var.k;
            list = e7d0Var.j;
            str = e7d0Var.i;
            z1x.P(objB);
        }
        hw70 hw70Var = (hw70) objB;
        tw2 tw2Var = hw70Var.f13757a;
        return tw2Var == null ? new w6d0(hw70Var.b) : new x6d0(new rl(tw2Var, CollectionsKt.P0(CollectionsKt.r0(list, new g0a(str))), vneVar, new v6d0(this, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r9.b(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.fmf0 r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.f7d0
            if (r0 == 0) goto L13
            r0 = r11
            a.f7d0 r0 = (a.f7d0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.f7d0 r0 = new a.f7d0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2c
            a.z1x.P(r11)
            goto La6
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L32:
            a.fmf0 r10 = r0.i
            a.z1x.P(r11)
            goto L94
        L38:
            a.z1x.P(r11)
            a.rl r11 = r10.f9778a
            a.tw2 r2 = r11.f30673a
            java.lang.String r2 = r2.f34627a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "PruningCamera2DeviceManager#processRequestClose("
            r6.<init>(r7)
            java.lang.String r2 = a.g0a.b(r2)
            r6.append(r2)
            r2 = 41
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "CXCP"
            android.util.Log.i(r6, r2)
            java.util.LinkedHashSet r2 = r9.f
            boolean r6 = r2.contains(r11)
            if (r6 == 0) goto L68
            r2.remove(r11)
        L68:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = r9.g
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            r8 = r7
            a.z6d0 r8 = (a.z6d0) r8
            a.rl r8 = r8.b
            if (r8 == r11) goto L85
            goto L73
        L85:
            r2.add(r7)
            goto L73
        L89:
            r0.i = r10
            r0.l = r5
            kotlin.Unit r9 = r9.c(r2)
            if (r9 != r1) goto L94
            goto La5
        L94:
            a.rl r9 = r10.f9778a
            r9.c()
            a.rl r9 = r10.f9778a
            r0.i = r3
            r0.l = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7d0.e(a.fmf0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x006c->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (c(r6.g) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(a.gmf0 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.g7d0
            if (r0 == 0) goto L13
            r0 = r8
            a.g7d0 r0 = (a.g7d0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.g7d0 r0 = new a.g7d0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r6.f
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.j
            a.gmf0 r7 = r0.i
            a.z1x.P(r8)
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L37:
            a.gmf0 r7 = r0.i
            a.z1x.P(r8)
            goto L54
        L3d:
            a.z1x.P(r8)
            java.lang.String r8 = "CXCP"
            java.lang.String r2 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r8, r2)
            r0.i = r7
            r0.m = r4
            java.util.ArrayList r8 = r6.g
            kotlin.Unit r6 = r6.c(r8)
            if (r6 != r1) goto L54
            goto L84
        L54:
            java.util.Iterator r6 = r5.iterator()
        L58:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L68
            java.lang.Object r8 = r6.next()
            a.rl r8 = (a.rl) r8
            r8.c()
            goto L58
        L68:
            java.util.Iterator r6 = r5.iterator()
        L6c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r6.next()
            a.rl r8 = (a.rl) r8
            r0.i = r7
            r0.j = r6
            r0.m = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L6c
        L84:
            return r1
        L85:
            r5.clear()
            a.odd r6 = r7.f11541a
            kotlin.Unit r7 = kotlin.Unit.f46060a
            r6.N(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7d0.f(a.gmf0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(hmf0 hmf0Var, zje zjeVar) {
        h7d0 h7d0Var;
        hmf0 hmf0Var2;
        String str;
        Object next;
        hmf0 hmf0Var3;
        if (zjeVar instanceof h7d0) {
            h7d0Var = (h7d0) zjeVar;
            int i = h7d0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7d0Var.m = i - Integer.MIN_VALUE;
            } else {
                h7d0Var = new h7d0(this, zjeVar);
            }
        } else {
            h7d0Var = new h7d0(this, zjeVar);
        }
        Object obj = h7d0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = h7d0Var.m;
        if (i2 != 0) {
            if (i2 == 1) {
                str = h7d0Var.j;
                hmf0Var2 = h7d0Var.i;
                z1x.P(obj);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hmf0Var3 = h7d0Var.i;
                z1x.P(obj);
            }
            hmf0Var2 = hmf0Var3;
            odd oddVar = hmf0Var2.b;
            Unit unit = Unit.f46060a;
            oddVar.N(unit);
            return unit;
        }
        z1x.P(obj);
        String str2 = hmf0Var.f13304a;
        Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) g0a.b(hmf0Var.f13304a)) + ')');
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.g) {
            if (Intrinsics.d(((z6d0) obj2).f43861a.f16809a.f16828a, str2)) {
                arrayList.add(obj2);
            }
        }
        h7d0Var.i = hmf0Var;
        h7d0Var.j = str2;
        h7d0Var.m = 1;
        if (c(arrayList) != wneVar) {
            hmf0Var2 = hmf0Var;
            str = str2;
        }
        return wneVar;
        LinkedHashSet linkedHashSet = this.f;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((rl) next).f30673a.f34627a, str));
        rl rlVar = (rl) next;
        if (rlVar != null) {
            linkedHashSet.remove(rlVar);
            rlVar.c();
            h7d0Var.i = hmf0Var2;
            h7d0Var.j = null;
            h7d0Var.m = 2;
            if (rlVar.b(h7d0Var) != wneVar) {
                hmf0Var3 = hmf0Var2;
                hmf0Var2 = hmf0Var3;
            }
            return wneVar;
        }
        odd oddVar2 = hmf0Var2.b;
        Unit unit2 = Unit.f46060a;
        oddVar2.N(unit2);
        return unit2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x026e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0281  */
    /* JADX WARN: Code duplicated, block: B:115:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:2: B:50:0x0145->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0137 A[LOOP:3: B:46:0x0131->B:48:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0217  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0228  */
    /* JADX WARN: Code duplicated, block: B:99:0x0258  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0268, code lost:
    
        if (b(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027b, code lost:
    
        if (r11.d(r9, r0) == r1) goto L107;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x019f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c7, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(a.jnf0 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7d0.h(a.jnf0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x0051->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.lang.String r14, a.jnf0 r15, a.zje r16) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7d0.i(java.lang.String, a.jnf0, a.zje):java.lang.Object");
    }
}
