package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.pin_code.impl.navigation.PinCodeInternalScreenFactory$changePinCodeScreen$1;
import org.xplatform.pin_code.impl.navigation.PinCodeInternalScreenFactory$removePinCodeScreen$1;
import org.xplatform.pin_code.impl.navigation.PinCodeScreensFactoryImpl$addPinCodeScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class u6j0 extends i3t0 {
    public final qgd o;
    public final zg p;
    public final dpx q;
    public final dbu r;
    public final dbu s;
    public final fl70 t;
    public final i1w0 u;
    public final au0 v;
    public final gg5 w;
    public final u58 x;
    public final zpu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6j0(vzg0 vzg0Var, mne mneVar, qgd qgdVar, zg zgVar, dpx dpxVar, dbu dbuVar, dbu dbuVar2, fl70 fl70Var, i1w0 i1w0Var, String str, au0 au0Var, gg5 gg5Var, u58 u58Var, zpu zpuVar, ctf0 ctf0Var) {
        super(null, new hwi0((byte) 5), new h0j0(ctf0Var, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = qgdVar;
        this.p = zgVar;
        this.q = dpxVar;
        this.r = dbuVar;
        this.s = dbuVar2;
        this.t = fl70Var;
        this.u = i1w0Var;
        this.v = au0Var;
        this.w = gg5Var;
        this.x = u58Var;
        this.y = zpuVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        s6j0 s6j0Var;
        o6j0 o6j0Var = (o6j0) obj;
        o6j0Var.getClass();
        super.x(o6j0Var);
        if (o6j0Var instanceof h6j0) {
            h6j0 h6j0Var = (h6j0) o6j0Var;
            if (h6j0Var.equals(f6j0.f9014a)) {
                i3t0.K(this, null, null, new m91(this, null, (byte) 18), 3);
                return;
            } else {
                if (h6j0Var.equals(g6j0.f10769a)) {
                    return;
                }
                if (h6j0Var.equals(e6j0.f7287a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
        }
        if (!(o6j0Var instanceof n6j0)) {
            t9f.b();
            return;
        }
        n6j0 n6j0Var = (n6j0) o6j0Var;
        boolean zEquals = n6j0Var.equals(i6j0.f14242a);
        fl70 fl70Var = this.t;
        i1w0 i1w0Var = this.u;
        au0 au0Var = this.v;
        zg zgVar = this.p;
        if (zEquals) {
            zgVar.f44322a.c("acc_settings_pin_set_call");
            au0Var.f1455a.a(xun.f41520a, 3259L);
            if (this.q.f6487a.i()) {
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                fl70Var.getClass();
                FragmentScreen pinCodeInternalScreenFactory$removePinCodeScreen$1 = new PinCodeInternalScreenFactory$removePinCodeScreen$1();
                if (pinCodeInternalScreenFactory$removePinCodeScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) pinCodeInternalScreenFactory$removePinCodeScreen$1)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(pinCodeInternalScreenFactory$removePinCodeScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                Object obj2 = this.o.h;
                k0w0VarI.h(new PinCodeScreensFactoryImpl$addPinCodeScreen$1());
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            }
        } else if (n6j0Var.equals(j6j0.f15991a)) {
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            fl70Var.getClass();
            FragmentScreen pinCodeInternalScreenFactory$removePinCodeScreen$2 = new PinCodeInternalScreenFactory$removePinCodeScreen$1();
            if (pinCodeInternalScreenFactory$removePinCodeScreen$2 instanceof DialogScreen) {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) pinCodeInternalScreenFactory$removePinCodeScreen$2)));
            } else {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(pinCodeInternalScreenFactory$removePinCodeScreen$2)));
            }
            ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO3;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        } else if (n6j0Var.equals(k6j0.f17774a)) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorP;
                if (!pawVar4.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar4.next());
                }
            }
        } else {
            if (!n6j0Var.equals(l6j0.f19509a)) {
                if (!(n6j0Var instanceof m6j0)) {
                    t9f.b();
                    return;
                }
                ((xwb0) this.s.f5820a.b).a("fingerprint_enabled", !((s6j0) D()).b);
                boolean z = ((s6j0) D()).b;
                u58 u58Var = this.x;
                u58Var.getClass();
                i8i.D("point", !z ? "on" : "off", u58Var.f35083a, "acc_settings_biometrics_call");
                boolean z2 = ((s6j0) D()).b;
                gg5 gg5Var = this.w;
                gg5Var.getClass();
                b1j.v(z2 ? "off" : "on", gg5Var.f11237a, 11007L);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    s6j0Var = (s6j0) value;
                    this.f.getClass();
                } while (!p7m0Var.m(value, new s6j0(s6j0Var.f31706a, !s6j0Var.b, s6j0Var.c)));
                return;
            }
            zgVar.f44322a.c("acc_settings_pin_change_call");
            au0Var.f1455a.a(xun.f41520a, 3262L);
            i1w0Var.getClass();
            k0w0 k0w0Var = new k0w0(i1w0Var);
            fl70Var.getClass();
            k0w0Var.h(new PinCodeInternalScreenFactory$changePinCodeScreen$1());
            ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar5 = (paw) listIteratorO4;
                if (!pawVar5.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar5.next());
                }
            }
        }
    }
}
