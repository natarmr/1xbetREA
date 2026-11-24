package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class pm60 extends eiu0 {
    public final uf3 c;
    public final hs60 d;
    public final gw60 e;
    public final ix0 f;
    public final ls g;
    public final mne h;
    public final xcc i;
    public final p4u j;
    public final oeg0 k;
    public final z4u l;
    public final iqt m;
    public final dcu n;
    public final lbu o;
    public final uxs0 p;
    public final qoj0 q;
    public bby r;

    public pm60(uf3 uf3Var, hs60 hs60Var, gw60 gw60Var, ix0 ix0Var, ls lsVar, mne mneVar, xcc xccVar, p4u p4uVar, oeg0 oeg0Var, z4u z4uVar, iqt iqtVar, dcu dcuVar, lbu lbuVar, uxs0 uxs0Var) {
        oeg0Var.getClass();
        this.c = uf3Var;
        this.d = hs60Var;
        this.e = gw60Var;
        this.f = ix0Var;
        this.g = lsVar;
        this.h = mneVar;
        this.i = xccVar;
        this.j = p4uVar;
        this.k = oeg0Var;
        this.l = z4uVar;
        this.m = iqtVar;
        this.n = dcuVar;
        this.o = lbuVar;
        this.p = uxs0Var;
        this.q = ckb.F();
    }

    public final void v(Throwable th) {
        sac.V(jiu0.a(s()), lm60.f20282a, null, this.h.f22085a, new j940(this, th, null, (byte) 28), 10);
    }

    public final void w(String str) {
        i8i.D("screen", "main_screen", this.d.f13566a, "games_open_all");
        b1j.v("main_screen", this.f.f15516a, 3059L);
        i1w0 i1w0VarC = this.k.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        FragmentScreen fragmentScreenE = this.c.e(0);
        if (fragmentScreenE instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
        }
        ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(pbv pbvVar, zje zjeVar) {
        nm60 nm60Var;
        i1w0 i1w0Var;
        if (zjeVar instanceof nm60) {
            nm60Var = (nm60) zjeVar;
            int i = nm60Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm60Var.m = i - Integer.MIN_VALUE;
            } else {
                nm60Var = new nm60(this, zjeVar);
            }
        } else {
            nm60Var = new nm60(this, zjeVar);
        }
        Object obj = nm60Var.k;
        wne wneVar = wne.f39444a;
        int i2 = nm60Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            i1w0 i1w0VarC = this.k.c();
            if (i1w0VarC != null) {
                long jD = x1x.D(pbvVar.e);
                nm60Var.i = pbvVar;
                nm60Var.j = i1w0VarC;
                nm60Var.m = 1;
                Object objA = this.l.a(jD, nm60Var);
                if (objA == wneVar) {
                    return wneVar;
                }
                obj = objA;
                i1w0Var = i1w0VarC;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i1w0Var = nm60Var.j;
        pbvVar = nm60Var.i;
        z1x.P(obj);
        boolean z = !((Boolean) obj).booleanValue();
        FragmentScreen fragmentScreenM0 = jtv.M0(6, x1x.D(pbvVar.e), null);
        if (fragmentScreenM0 != null) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            c8d c8dVar = (c8d) k0w0VarI.h(fragmentScreenM0).f14945a;
            bjk bjkVar = cfx0.o;
            c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(long j, zje zjeVar, String str, boolean z) {
        om60 om60Var;
        long j2;
        String str2;
        boolean z2;
        if (zjeVar instanceof om60) {
            om60Var = (om60) zjeVar;
            int i = om60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                om60Var.n = i - Integer.MIN_VALUE;
            } else {
                om60Var = new om60(this, zjeVar);
            }
        } else {
            om60Var = new om60(this, zjeVar);
        }
        Object obj = om60Var.l;
        wne wneVar = wne.f39444a;
        int i2 = om60Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            om60Var.k = str;
            om60Var.i = j;
            om60Var.j = z;
            om60Var.n = 1;
            Object objA = this.l.a(j, om60Var);
            if (objA == wneVar) {
                return wneVar;
            }
            j2 = j;
            str2 = str;
            obj = objA;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = om60Var.j;
            long j3 = om60Var.i;
            String str3 = om60Var.k;
            z1x.P(obj);
            z2 = z3;
            str2 = str3;
            j2 = j3;
        }
        this.k.c().d(new k1b(this, j2, z2, str2, !((Boolean) obj).booleanValue(), (byte) 1));
        return Unit.f46060a;
    }
}
