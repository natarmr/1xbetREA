package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lf8 extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final o3c A;
    public final yoc B;
    public final ls C;
    public final wtt D;
    public final ln4 E;
    public final bbw0 F;
    public bby G;
    public bby H;
    public final c4m0 I;
    public final i1w0 o;
    public final duj p;
    public final b4j q;
    public final x20 r;
    public final g2v s;
    public final m1e t;
    public final nn60 u;
    public final mne v;
    public final l570 w;
    public final kki x;
    public final lbu y;
    public final tpx z;

    public lf8(i1w0 i1w0Var, duj dujVar, b4j b4jVar, x20 x20Var, ctf0 ctf0Var, g2v g2vVar, m1e m1eVar, nn60 nn60Var, mne mneVar, l570 l570Var, kki kkiVar, lbu lbuVar, tpx tpxVar, o3c o3cVar, yoc yocVar, ls lsVar, wtt wttVar, ln4 ln4Var, bbw0 bbw0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        os7 os7Var = new os7((byte) 29);
        ep4 ep4Var = new ep4(ctf0Var, (byte) 4);
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        super(null, os7Var, ep4Var, cvm0.p(vs10Var, dvjVar), null);
        this.o = i1w0Var;
        this.p = dujVar;
        this.q = b4jVar;
        this.r = x20Var;
        this.s = g2vVar;
        this.t = m1eVar;
        this.u = nn60Var;
        this.v = mneVar;
        this.w = l570Var;
        this.x = kkiVar;
        this.y = lbuVar;
        this.z = tpxVar;
        this.A = o3cVar;
        this.B = yocVar;
        this.C = lsVar;
        this.D = wttVar;
        this.E = ln4Var;
        this.F = bbw0Var;
        c4m0 c4m0Var = this.I;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        byte b = 3;
        this.I = sac.T(new dnq(new fnq(m1eVar.b(), new qv3(this, yjeVar, (byte) 17), (byte) 4), new lo3(b, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), dvjVar), foe.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ArrayList arrayList, zje zjeVar) {
        if8 if8Var;
        if (zjeVar instanceof if8) {
            if8Var = (if8) zjeVar;
            int i = if8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                if8Var.k = i - Integer.MIN_VALUE;
            } else {
                if8Var = new if8(this, zjeVar);
            }
        } else {
            if8Var = new if8(this, zjeVar);
        }
        Object obj = if8Var.i;
        wne wneVar = wne.f39444a;
        int i2 = if8Var.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                if (!this.t.c()) {
                    return Boolean.FALSE;
                }
                ln4 ln4Var = this.E;
                if8Var.k = 1;
                if (ln4Var.b(arrayList, if8Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void N() {
        e3c.n(this.G);
        this.G = sac.V(jiu0.a(this), new ye7(1, this, lf8.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, this.v.b, new oa((Object) this, (yje) null, (byte) 26), 10);
    }

    public final void O(Throwable th) {
        this.p.b(th, new t87(this, th, (byte) 15));
    }

    public final void P(a570 a570Var, long j, String str, String str2) {
        sac.V(jiu0.a(this), new ye7(1, this, lf8.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, this.v.c, new ze1(this, a570Var, str2, str, j, null), 10);
    }

    public final void Q() {
        Object value;
        mdm mdmVarB = g2v.b(this.s, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, df8.a((df8) value, false, false, false, null, mdmVarB, null, 30)));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f9 A[LOOP:4: B:68:0x01f3->B:70:0x01f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x020b A[LOOP:2: B:55:0x019f->B:74:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be A[EDGE_INSN: B:80:0x01be->B:57:0x01be BREAK  A[LOOP:2: B:55:0x019f->B:74:0x020b], SYNTHETIC] */
    public final Object R(ArrayList arrayList, List list, zje zjeVar) {
        jf8 jf8Var;
        List list2;
        Object objM;
        ArrayList arrayList2;
        Iterator it;
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it2;
        pe8 pe8Var;
        pe8 pe8Var2;
        hcs hcsVar;
        String str;
        long j;
        x9n u9nVar;
        Integer numValueOf;
        Integer num;
        long j2;
        Object value2;
        ArrayList arrayList6 = arrayList;
        if (zjeVar instanceof jf8) {
            jf8Var = (jf8) zjeVar;
            int i = jf8Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf8Var.m = i - Integer.MIN_VALUE;
            } else {
                jf8Var = new jf8(this, zjeVar);
            }
        } else {
            jf8Var = new jf8(this, zjeVar);
        }
        Object obj = jf8Var.k;
        Object obj2 = wne.f39444a;
        int i2 = jf8Var.m;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zC = this.t.c();
            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                arrayList7.add(((pe8) it3.next()).j.f12884a);
            }
            ln4 ln4Var = this.E;
            ln4Var.getClass();
            boolean z = false;
            if (!arrayList7.isEmpty()) {
                if (arrayList7.isEmpty()) {
                    z = true;
                    break;
                }
                Iterator it4 = arrayList7.iterator();
                do {
                    if (!it4.hasNext()) {
                        z = true;
                        break;
                    }
                } while (ln4Var.a((String) it4.next()));
            }
            if (zC || z) {
                list2 = list;
            } else {
                jf8Var.i = arrayList6;
                list2 = list;
                jf8Var.j = list2;
                jf8Var.m = 1;
                objM = M(arrayList7, jf8Var);
                if (objM == obj2) {
                    return obj2;
                }
            }
            arrayList6.getClass();
            arrayList2 = new ArrayList(r3d.q(arrayList6, 10));
            for (it = arrayList6.iterator(); it.hasNext(); it = it) {
                pe8Var2 = (pe8) it.next();
                hds hdsVar = pe8Var2.j;
                hcsVar = pe8Var2.d;
                str = hdsVar.f12884a;
                j = pe8Var2.f26839a;
                if (pe8Var2.k) {
                    j2 = j;
                    u9nVar = new t9n(new n0x(str), new n0x(azw.R(str)), Integer.valueOf(R.drawable.ic_games_placeholder), null, fww.I(hcsVar));
                } else {
                    n0x n0xVar = new n0x(str);
                    n0x n0xVar2 = new n0x(azw.R(str));
                    p9n p9nVarI = fww.I(hcsVar);
                    numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                    if ((32 & 4) != 0) {
                        num = null;
                    } else {
                        num = numValueOf;
                    }
                    j2 = j;
                    u9nVar = new u9n(n0xVar, n0xVar2, num, null, p9nVarI, null);
                }
                arrayList2.add(new ke8(new l9n(j2, u9nVar, new h9n(pe8Var2.b)), pe8Var2.e, pe8Var2.d, pe8Var2.b, pe8Var2.h, pe8Var2.m, pe8Var2.k));
                list2 = list2;
            }
            List list3 = list2;
            p7m0Var = ocjVar.f25029a;
            while (true) {
                value = p7m0Var.getValue();
                value.getClass();
                arrayList3 = arrayList2;
                oyg0Var.getClass();
                if (p7m0Var.m(value, df8.a((df8) value, false, false, true, arrayList3, null, null, 74))) {
                    break;
                }
                arrayList2 = arrayList3;
            }
            arrayList4 = new ArrayList();
            for (Object obj3 : list3) {
                pe8Var = (pe8) obj3;
                if (!pe8Var.k || !pe8Var.l) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    axq.t(((pe8) it2.next()).f26839a, arrayList5);
                }
                T(arrayList5);
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        List list4 = jf8Var.j;
        ArrayList arrayList8 = jf8Var.i;
        z1x.P(obj);
        list2 = list4;
        arrayList6 = arrayList8;
        objM = obj;
        if (!((Boolean) objM).booleanValue()) {
            Q();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, df8.a((df8) value2, false, false, true, iun.f15405a, null, null, 107)));
            return Unit.f46060a;
        }
        arrayList6.getClass();
        arrayList2 = new ArrayList(r3d.q(arrayList6, 10));
        while (it.hasNext()) {
            pe8Var2 = (pe8) it.next();
            hds hdsVar2 = pe8Var2.j;
            hcsVar = pe8Var2.d;
            str = hdsVar2.f12884a;
            j = pe8Var2.f26839a;
            if (pe8Var2.k) {
                j2 = j;
                u9nVar = new t9n(new n0x(str), new n0x(azw.R(str)), Integer.valueOf(R.drawable.ic_games_placeholder), null, fww.I(hcsVar));
            } else {
                n0x n0xVar3 = new n0x(str);
                n0x n0xVar4 = new n0x(azw.R(str));
                p9n p9nVarI2 = fww.I(hcsVar);
                numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                if ((32 & 4) != 0) {
                    num = null;
                } else {
                    num = numValueOf;
                }
                j2 = j;
                u9nVar = new u9n(n0xVar3, n0xVar4, num, null, p9nVarI2, null);
            }
            arrayList2.add(new ke8(new l9n(j2, u9nVar, new h9n(pe8Var2.b)), pe8Var2.e, pe8Var2.d, pe8Var2.b, pe8Var2.h, pe8Var2.m, pe8Var2.k));
            list2 = list2;
        }
        List list5 = list2;
        p7m0Var = ocjVar.f25029a;
        while (true) {
            value = p7m0Var.getValue();
            value.getClass();
            arrayList3 = arrayList2;
            oyg0Var.getClass();
            if (p7m0Var.m(value, df8.a((df8) value, false, false, true, arrayList3, null, null, 74))) {
                break;
                break;
            }
            arrayList2 = arrayList3;
        }
        arrayList4 = new ArrayList();
        while (r2.hasNext()) {
            pe8Var = (pe8) obj3;
            if (!pe8Var.k) {
            }
            arrayList4.add(obj3);
        }
        if (!arrayList4.isEmpty()) {
            arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
            it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                axq.t(((pe8) it2.next()).f26839a, arrayList5);
            }
            T(arrayList5);
        }
        return Unit.f46060a;
    }

    public final void S() {
        Object value;
        mdm mdmVarB = g2v.b(this.s, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, df8.a((df8) value, false, false, false, null, null, mdmVarB, 30)));
    }

    public final void T(List list) {
        bby bbyVar = this.H;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.H = sac.f0(jiu0.a(this), this.B.a(), TimeUnit.MILLISECONDS, this.v.b, new ye7(1, this, lf8.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 26), new kf8(this, list, null, (byte) 0), 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        bf8 bf8Var = (bf8) obj;
        bf8Var.getClass();
        super.x(bf8Var);
        boolean z = bf8Var instanceof ye8;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, df8.a((df8) value3, true, false, false, null, null, null, 122)));
            N();
            return;
        }
        Object obj2 = null;
        Object[] objArr = 0;
        if (bf8Var instanceof xe8) {
            c4m0 c4m0Var = this.I;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.H;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.G;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
                return;
            }
            return;
        }
        if (bf8Var instanceof we8) {
            mdm mdmVar = ((df8) D()).f;
            if (!((df8) D()).b && mdmVar != null) {
                H(new vl0(mdmVar));
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, df8.a((df8) value2, true, false, false, null, null, null, 30)));
            N();
            return;
        }
        if (!(bf8Var instanceof ze8) && !(bf8Var instanceof ve8)) {
            if (bf8Var instanceof se8) {
                se8 se8Var = (se8) bf8Var;
                for (Object obj3 : ((df8) D()).e) {
                    if (((ke8) obj3).f18141a.f19662a == se8Var.f32065a) {
                        obj2 = obj3;
                        break;
                    }
                }
                ke8 ke8Var = (ke8) obj2;
                if (ke8Var == null || ke8Var.g) {
                    return;
                }
                P(ke8Var.b, ke8Var.f18141a.f19662a, ke8Var.d, lf8.class.getSimpleName());
                return;
            }
            if (bf8Var instanceof re8) {
                sac.V(jiu0.a(this), new ye7(1, this, lf8.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, this.v.b, new ex1((Object) this, bf8Var, (yje) (objArr == true ? 1 : 0), (byte) 18), 10);
                return;
            }
            if (bf8Var instanceof af8) {
                i3t0.B(this, this.u, new en60[]{((af8) bf8Var).f765a});
                return;
            }
            if (bf8Var instanceof te8) {
                T(kotlin.collections.a.c(Long.valueOf(((te8) bf8Var).f33806a)));
                return;
            }
            if (!(bf8Var instanceof ue8)) {
                if (bf8Var instanceof qe8) {
                    N();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, df8.a((df8) value, false, false, false, null, null, null, 119)));
            S();
            return;
        }
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
