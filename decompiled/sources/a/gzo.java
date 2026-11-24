package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class gzo extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final s64 A;
    public final sqx B;
    public final ljf0 C;
    public final mne D;
    public final iw20 E;
    public bby F;
    public bby G;
    public final i1w0 o;
    public final we50 p;
    public final lsn q;
    public final h03 r;
    public final e0c s;
    public final mxg0 t;
    public final jh70 u;
    public final zn00 v;
    public final m1e w;
    public final duj x;
    public final rjo y;
    public final nr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzo(vzg0 vzg0Var, ctf0 ctf0Var, i1w0 i1w0Var, we50 we50Var, lsn lsnVar, h03 h03Var, e0c e0cVar, mxg0 mxg0Var, jh70 jh70Var, zn00 zn00Var, m1e m1eVar, duj dujVar, rjo rjoVar, nr nrVar, s64 s64Var, sqx sqxVar, ljf0 ljf0Var, gxu gxuVar, mne mneVar, iw20 iw20Var) {
        super(null, new ago((byte) 25), new bcn(ctf0Var, (byte) 6), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = i1w0Var;
        this.p = we50Var;
        this.q = lsnVar;
        this.r = h03Var;
        this.s = e0cVar;
        this.t = mxg0Var;
        this.u = jh70Var;
        this.v = zn00Var;
        this.w = m1eVar;
        this.x = dujVar;
        this.y = rjoVar;
        this.z = nrVar;
        this.A = s64Var;
        this.B = sqxVar;
        this.C = ljf0Var;
        this.D = mneVar;
        this.E = iw20Var;
    }

    public static void O(gzo gzoVar, dyo dyoVar, int i) {
        Object value;
        dyo dyoVar2 = dyo.d;
        if ((i & 1) != 0) {
            dyoVar = dyo.f6903a;
        }
        dyo dyoVar3 = dyoVar;
        if ((i & 2) != 0) {
            dyoVar2 = dyo.f6903a;
        }
        dyo dyoVar4 = dyoVar2;
        gzoVar.getClass();
        p7m0 p7m0Var = gzoVar.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            gzoVar.f.getClass();
        } while (!p7m0Var.m(value, syo.a((syo) value, false, false, null, null, null, null, null, dyoVar3, dyoVar4, null, 1279)));
    }

    public final void M(String str) {
        bby bbyVar = this.G;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.G = sac.V(jiu0.a(this), new hin(1, this, gzo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), new ntl(this, (byte) 23), this.D.b, new fr9(this, str, null, (byte) 26), 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Unit N(String str, zje zjeVar) {
        czo czoVar;
        if (zjeVar instanceof czo) {
            czoVar = (czo) zjeVar;
            int i = czoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                czoVar.k = i - Integer.MIN_VALUE;
            } else {
                czoVar = new czo(this, zjeVar);
            }
        } else {
            czoVar = new czo(this, zjeVar);
        }
        Object obj = czoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = czoVar.k;
        if (i2 != 0) {
            str = null;
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            d1q0 d1q0Var = new d1q0(((yrt0) obj).f43138a, ((syo) D()).e);
            g1q0 g1q0Var = (g1q0) this.C.f20148a;
            ArrayList arrayListN0 = CollectionsKt.N0(g1q0Var.a());
            arrayListN0.add(d1q0Var);
            List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayListN0));
            listL0.getClass();
            a1q0 a1q0Var = g1q0Var.f10528a;
            a1q0Var.getClass();
            a1q0Var.f85a.g("KEY_TEST_CREDS_STORAGE", a1q0Var.b.d(new zw3(d1q0.Companion.serializer(), (byte) 0), listL0));
        } else {
            z1x.P(obj);
            this.B.a();
        }
        if (str.length() > 0) {
            G(new uyo(pek0.f26859a, str));
        }
        int i3 = bzo.f3479a[this.p.ordinal()];
        i1w0 i1w0Var = this.o;
        if (i3 != 1) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(jh70.j(this.u, false))), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(iw20.f(this.E, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar2.next());
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P(zje zjeVar) {
        ezo ezoVar;
        Object value;
        if (zjeVar instanceof ezo) {
            ezoVar = (ezo) zjeVar;
            int i = ezoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ezoVar.k = i - Integer.MIN_VALUE;
            } else {
                ezoVar = new ezo(this, zjeVar);
            }
        } else {
            ezoVar = new ezo(this, zjeVar);
        }
        Object objQ = ezoVar.i;
        Object obj = wne.f39444a;
        int i2 = ezoVar.k;
        yxo yxoVar = null;
        if (i2 == 0) {
            z1x.P(objQ);
            String str = ((syo) D()).e;
            ezoVar.k = 1;
            objQ = Q(str, ezoVar);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objQ);
        }
        azo azoVar = (azo) objQ;
        String str2 = ((syo) D()).d;
        String str3 = ((syo) D()).e;
        String str4 = ((syo) D()).f;
        boolean z = azoVar == azo.f1727a;
        if (z && str2.equals(str3)) {
            O(this, dyo.b, 2);
        } else if (z && !str3.equals(str4)) {
            dyo dyoVar = dyo.f6903a;
            O(this, null, 1);
        } else if (z) {
            O(this, null, 3);
        } else {
            O(this, dyo.c, 2);
        }
        dyo dyoVar2 = ((syo) D()).i;
        dyo dyoVar3 = dyo.f6903a;
        if (dyoVar2 != dyoVar3) {
            yxoVar = yxo.b;
        } else if (((syo) D()).j != dyoVar3) {
            yxoVar = yxo.c;
        }
        yxo yxoVar2 = yxoVar;
        if (yxoVar2 != null) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, syo.a((syo) value, false, false, null, null, null, null, null, null, null, yxoVar2, 1023)));
        }
        return Boolean.valueOf(yxoVar2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum Q(String str, zje zjeVar) throws Throwable {
        fzo fzoVar;
        if (zjeVar instanceof fzo) {
            fzoVar = (fzo) zjeVar;
            int i = fzoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzoVar.k = i - Integer.MIN_VALUE;
            } else {
                fzoVar = new fzo(this, zjeVar);
            }
        } else {
            fzoVar = new fzo(this, zjeVar);
        }
        Object objH = fzoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fzoVar.k;
        if (i2 == 0) {
            z1x.P(objH);
            if (str.length() == 0) {
                return azo.c;
            }
            fzoVar.k = 1;
            objH = ((n660) this.r.b).h(str, fzoVar);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objH);
        }
        return ((Boolean) objH).booleanValue() ? azo.f1727a : azo.b;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        dyo dyoVar;
        Object value4;
        syo syoVar;
        dyo dyoVar2;
        wxo wxoVar = (wxo) obj;
        wxoVar.getClass();
        super.x(wxoVar);
        boolean z = wxoVar instanceof vxo;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (!z) {
            if (!(wxoVar instanceof nxo)) {
                t9f.b();
                return;
            }
            nxo nxoVar = (nxo) wxoVar;
            if (nxoVar.equals(kxo.f19065a)) {
                E();
                return;
            }
            if (nxoVar.equals(lxo.f20825a)) {
                v3c.N(this.F);
                this.F = sac.V(jiu0.a(this), new yhn((Object) this, (byte) 22), null, this.D.b, new hij(this, yjeVar, (byte) 16), 10);
                return;
            }
            if (nxoVar.equals(mxo.f22566a)) {
                v3c.N(this.F);
                return;
            }
            if (!nxoVar.equals(jxo.f17317a)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, syo.a((syo) value, false, false, null, null, null, null, null, null, null, null, 1023)));
            return;
        }
        vxo vxoVar = (vxo) wxoVar;
        boolean zEquals = vxoVar.equals(oxo.f26022a);
        i1w0 i1w0Var = this.o;
        if (zEquals) {
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
        } else {
            if (vxoVar.equals(qxo.f29494a)) {
                G(tyo.f34765a);
                M(null);
                return;
            }
            if (!vxoVar.equals(uxo.f36450a)) {
                if (vxoVar instanceof sxo) {
                    String str = ((sxo) vxoVar).f32986a;
                    if (Intrinsics.d(str, ((syo) D()).d)) {
                        return;
                    }
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var2.getValue();
                        value4.getClass();
                        syoVar = (syo) value4;
                        oyg0Var.getClass();
                        dyoVar2 = syoVar.i;
                        if (dyoVar2 == dyo.b) {
                            dyoVar2 = dyo.f6903a;
                        }
                    } while (!p7m0Var2.m(value4, syo.a(syoVar, false, false, str, null, null, null, "", dyoVar2, null, null, 1655)));
                    return;
                }
                if (vxoVar instanceof rxo) {
                    String str2 = ((rxo) vxoVar).f31274a;
                    if (Intrinsics.d(str2, ((syo) D()).e)) {
                        return;
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                        dyoVar = dyo.f6903a;
                    } while (!p7m0Var3.m(value3, syo.a((syo) value3, false, false, null, str2, null, null, null, dyoVar, dyoVar, null, 1263)));
                    return;
                }
                if (!(vxoVar instanceof txo)) {
                    if (vxoVar instanceof pxo) {
                        M(((pxo) vxoVar).f27761a);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                String str3 = ((txo) vxoVar).f34711a;
                if (Intrinsics.d(str3, ((syo) D()).f)) {
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value2, syo.a((syo) value2, false, false, null, null, str3, null, null, null, dyo.f6903a, null, 1503)));
                return;
            }
            pwf0 pwf0Var = pwf0.f27709a;
            this.t.b();
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            FragmentScreen fragmentScreenG0 = this.v.G0(this.p);
            if (fragmentScreenG0 instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
