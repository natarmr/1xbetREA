package a;

import android.graphics.Rect;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class jru implements ggi0, gmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17022a;
    public final Object b;

    public jru(zzz zzzVar) {
        this.f17022a = (byte) 27;
        btt0 btt0Var = zzzVar.f45278a;
        knf0 knf0Var = zzzVar.b;
        us00 us00Var = zzzVar.c;
        gii0 gii0Var = zzzVar.d;
        cad cadVar = zzzVar.e;
        iw20 iw20Var = zzzVar.f;
        gst0 gst0Var = zzzVar.g;
        btt0Var.getClass();
        knf0Var.getClass();
        gii0Var.getClass();
        gst0Var.getClass();
        this.b = new o3c(new w000(), cadVar, iw20Var, btt0Var, knf0Var, us00Var, gii0Var, gst0Var);
    }

    @Override // a.ggi0
    public void a(hgi0 hgi0Var) {
        zaw zawVar = (zaw) this.b;
        zawVar.q.a(zawVar);
    }

    public void c(gp00 gp00Var, vmu0 vmu0Var) {
        gp00Var.getClass();
        vmu0Var.getClass();
        if (gp00Var != gp00.b && gp00Var != gp00.c) {
            hny.v(gp00Var, "invalid load type for reset: ");
            return;
        }
        dgu dguVar = (dgu) this.b;
        synchronized (((s9m0) dguVar.d)) {
            try {
                yxv yxvVar = (yxv) dguVar.f6058a;
                yxv yxvVar2 = (yxv) dguVar.b;
                if (gp00Var == gp00.b) {
                    yxvVar.a(vmu0Var);
                } else {
                    yxvVar2.a(vmu0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(zje zjeVar, List list, boolean z) {
        iru iruVar;
        Object next;
        if (zjeVar instanceof iru) {
            iruVar = (iru) zjeVar;
            int i = iruVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                iruVar.m = i - Integer.MIN_VALUE;
            } else {
                iruVar = new iru(this, zjeVar);
            }
        } else {
            iruVar = new iru(this, zjeVar);
        }
        Object objA = iruVar.k;
        wne wneVar = wne.f39444a;
        int i2 = iruVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            g8f0 g8f0Var = (g8f0) this.b;
            iruVar.j = list;
            iruVar.i = z;
            iruVar.m = 1;
            objA = g8f0Var.a(iruVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = iruVar.i;
            list = iruVar.j;
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((b1f0) it.next()).f1803a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((q7f0) obj) == q7f0.SOCIAL ? z : true) {
                arrayList2.add(obj);
            }
        }
        List listN = CollectionsKt.N(list);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listN.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            c0o c0oVar = q7f0.j;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            do {
                if (!y2VarH.hasNext()) {
                    next = null;
                    break;
                }
                next = y2VarH.next();
            } while (((q7f0) next).f28247a != iIntValue);
            q7f0 q7f0Var = (q7f0) next;
            if (q7f0Var != null) {
                arrayList3.add(q7f0Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (arrayList2.contains((q7f0) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v6 java.lang.Object, still in use, count: 2, list:
          (r11v6 java.lang.Object) from 0x00a8: PHI (r11 I:??) = (r11v3 java.lang.Object), (r11v6 java.lang.Object) binds: [B:44:0x00a7, B:52:0x00a8] A[DONT_GENERATE, DONT_INLINE]
          (r11v6 java.lang.Object) from 0x009e: CHECK_CAST (a.til0) (r11v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object e(long r9, a.zje r11) {
        /*
            r8 = this;
            byte r0 = r8.f17022a
            java.lang.Object r1 = r8.b
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            switch(r0) {
                case 6: goto L52;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r11 instanceof a.opx
            if (r0 == 0) goto L1e
            r0 = r11
            a.opx r0 = (a.opx) r0
            int r6 = r0.k
            r7 = r6 & r4
            if (r7 == 0) goto L1e
            int r6 = r6 - r4
            r0.k = r6
            goto L23
        L1e:
            a.opx r0 = new a.opx
            r0.<init>(r8, r11)
        L23:
            java.lang.Object r8 = r0.i
            a.wne r11 = a.wne.f39444a
            int r4 = r0.k
            if (r4 == 0) goto L35
            if (r4 != r3) goto L31
            a.z1x.P(r8)
            goto L44
        L31:
            a.jf4.n(r2)
            goto L51
        L35:
            a.z1x.P(r8)
            a.zfo r1 = (a.zfo) r1
            r0.k = r3
            java.lang.Object r8 = r1.a(r9, r0)
            if (r8 != r11) goto L44
            r5 = r11
            goto L51
        L44:
            a.ueo r8 = (a.ueo) r8
            int r8 = r8.d
            r9 = 3
            if (r8 != r9) goto L4c
            goto L4d
        L4c:
            r3 = 0
        L4d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
        L51:
            return r5
        L52:
            boolean r0 = r11 instanceof a.cvu
            if (r0 == 0) goto L63
            r0 = r11
            a.cvu r0 = (a.cvu) r0
            int r6 = r0.l
            r7 = r6 & r4
            if (r7 == 0) goto L63
            int r6 = r6 - r4
            r0.l = r6
            goto L68
        L63:
            a.cvu r0 = new a.cvu
            r0.<init>(r8, r11)
        L68:
            java.lang.Object r8 = r0.j
            a.wne r11 = a.wne.f39444a
            int r4 = r0.l
            if (r4 == 0) goto L7c
            if (r4 != r3) goto L78
            long r9 = r0.i
            a.z1x.P(r8)
            goto L8d
        L78:
            a.jf4.n(r2)
            goto Lb2
        L7c:
            a.z1x.P(r8)
            a.rjl0 r1 = (a.rjl0) r1
            r0.i = r9
            r0.l = r3
            java.lang.Object r8 = r1.a(r0)
            if (r8 != r11) goto L8d
            r5 = r11
            goto Lb2
        L8d:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L93:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto La7
            java.lang.Object r11 = r8.next()
            r0 = r11
            a.til0 r0 = (a.til0) r0
            long r0 = r0.f34014a
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L93
            goto La8
        La7:
            r11 = r5
        La8:
            a.til0 r11 = (a.til0) r11
            if (r11 == 0) goto Lae
            java.lang.String r5 = r11.b
        Lae:
            if (r5 != 0) goto Lb2
            java.lang.String r5 = ""
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jru.e(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(zje zjeVar) {
        cuu cuuVar;
        Object g0g0Var;
        if (zjeVar instanceof cuu) {
            cuuVar = (cuu) zjeVar;
            int i = cuuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cuuVar.k = i - Integer.MIN_VALUE;
            } else {
                cuuVar = new cuu(this, zjeVar);
            }
        } else {
            cuuVar = new cuu(this, zjeVar);
        }
        Object objQ = cuuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cuuVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objQ);
                e0g0 e0g0Var = j0g0.b;
                fuj0 fuj0Var = (fuj0) this.b;
                cuuVar.k = 1;
                objQ = fuj0Var.q(cuuVar);
                if (objQ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objQ);
            }
            g0g0Var = (List) objQ;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }

    public Object h(bnn0 bnn0Var) {
        e7y e7yVar = (e7y) this.b;
        return qjj.d0(e7yVar.c.b, new slx(e7yVar, null, (byte) 3), bnn0Var);
    }

    public void i() {
        zaw zawVar = (zaw) this.b;
        int i = zawVar.r - 1;
        zawVar.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (ybw ybwVar : zawVar.t) {
            ybwVar.x();
            i2 += ybwVar.j1.f5860a;
        }
        ccs0[] ccs0VarArr = new ccs0[i2];
        int i3 = 0;
        for (ybw ybwVar2 : zawVar.t) {
            ybwVar2.x();
            int i4 = ybwVar2.j1.f5860a;
            int i5 = 0;
            while (i5 < i4) {
                ybwVar2.x();
                ccs0VarArr[i3] = ybwVar2.j1.a(i5);
                i5++;
                i3++;
            }
        }
        zawVar.s = new dcs0(ccs0VarArr);
        zawVar.q.f(zawVar);
    }

    public sbz j(int i, nrk nrkVar) {
        xcz xczVar = (xcz) this.b;
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            mcz mczVar = (mcz) ((hgk0) xczVar.f).getValue();
            return xczVar.q.a(i, mczVar.j, new g18((Object) nrkVar, i, (Object) mczVar, (byte) 4), xczVar.d);
        } finally {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        }
    }

    public String toString() {
        switch (this.f17022a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                StringBuilder sb = new StringBuilder();
                r9z r9zVar = (r9z) this.b;
                sb.append(r9zVar);
                sb.append(": ");
                sb.append(((Map) yqm0.s(r9zVar.j, r9z.n[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public jru(zfo zfoVar) {
        this.f17022a = (byte) 20;
        zfoVar.getClass();
        this.b = zfoVar;
    }

    public jru(e7y e7yVar) {
        this.f17022a = (byte) 23;
        e7yVar.getClass();
        this.b = e7yVar;
    }

    public jru(n660 n660Var, wxs0 wxs0Var) {
        this.f17022a = (byte) 21;
        this.b = n660Var;
    }

    public jru(g8f0 g8f0Var) {
        this.f17022a = (byte) 0;
        g8f0Var.getClass();
        this.b = g8f0Var;
    }

    public jru(gii0 gii0Var) {
        this.f17022a = (byte) 29;
        gii0Var.getClass();
        this.b = new tpv(gii0Var, (byte) 14);
    }

    public jru(htz htzVar) {
        this.f17022a = (byte) 16;
        this.b = new Rect();
    }

    public /* synthetic */ jru(Object obj, byte b) {
        this.f17022a = b;
        this.b = obj;
    }

    public jru() {
        this.f17022a = (byte) 17;
        this.b = new dgu(this);
    }
}
