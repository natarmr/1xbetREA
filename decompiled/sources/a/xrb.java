package a;

import android.content.SharedPreferences;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class xrb extends i3t0 {
    public final myg0 o;
    public final krc p;
    public final zg q;
    public final au0 r;
    public final i1w0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrb(vzg0 vzg0Var, myg0 myg0Var, mne mneVar, krc krcVar, zg zgVar, au0 au0Var, String str, i1w0 i1w0Var, ctf0 ctf0Var) {
        super(null, new e0b((byte) 26), new ep4(ctf0Var, (byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = myg0Var;
        this.p = krcVar;
        this.q = zgVar;
        this.r = au0Var;
        this.s = i1w0Var;
    }

    public static boolean M(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = str.charAt(!z ? i : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString().length() > 0;
    }

    public final void N(String str, String str2, String str3) {
        boolean z = M(str) && M(str2) && M(str3);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (p7m0Var.m(value, vrb.a((vrb) value, z, false, str4, str5, str6, null, 32))) {
                return;
            }
            str = str4;
            str2 = str5;
            str3 = str6;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        oyg0 oyg0Var;
        fsb fsbVar;
        fsb fsbVar2;
        fsb fsbVar3;
        prb prbVar = (prb) obj;
        prbVar.getClass();
        super.x(prbVar);
        if (prbVar instanceof irb) {
            if (((irb) prbVar).equals(irb.f15248a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(prbVar instanceof orb)) {
            t9f.b();
            return;
        }
        orb orbVar = (orb) prbVar;
        boolean zEquals = orbVar.equals(nrb.f23993a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.s;
        if (zEquals) {
            ocj ocjVar = this.i;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var = this.f;
                oyg0Var.getClass();
                fsbVar = bsb.f3121a;
            } while (!p7m0Var.m(value, vrb.a((vrb) value, false, true, null, null, null, fsbVar, 29)));
            String str = ((vrb) D()).c;
            String str2 = ((vrb) D()).d;
            String str3 = ((vrb) D()).e;
            String strA = this.p.a();
            if (M(str)) {
                fsbVar2 = !str.equals(strA) ? dsb.f6605a : fsbVar;
            } else {
                fsbVar2 = csb.f4880a;
            }
            if (str2.length() < 4) {
                fsbVar3 = asb.f1382a;
            } else if (str3.length() < 4) {
                fsbVar3 = yrb.f43113a;
            } else {
                fsbVar3 = !str2.equals(str3) ? esb.f8321a : fsbVar;
            }
            fsb fsbVar4 = str2.equals(strA) ? zrb.f44844a : fsbVar;
            if (!(fsbVar2 instanceof bsb)) {
                fsbVar = fsbVar2;
            } else if (!(fsbVar3 instanceof bsb)) {
                fsbVar = fsbVar3;
            } else if (!(fsbVar4 instanceof bsb)) {
                fsbVar = fsbVar4;
            }
            boolean z = fsbVar instanceof bsb;
            zg zgVar = this.q;
            au0 au0Var = this.r;
            if (z) {
                ((SharedPreferences) ((xwb0) this.o.f22602a.b).c.getValue()).edit().putString("fingerprint_pass", str2).apply();
                kt2 kt2Var = zgVar.f44322a;
                kt2Var.a("acc_settings_pin_change_input", wp20.b(new Pair("send_code", "done")));
                kt2Var.c("acc_settings_pin_change_done");
                au0Var.getClass();
                s1p s1pVar = au0Var.f1455a;
                b1j.v("done", s1pVar, 3263L);
                s1pVar.a(xun.f41520a, 3264L);
                G(urb.f36156a);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    fsb fsbVar5 = fsbVar;
                    if (p7m0Var2.m(value2, vrb.a((vrb) value2, false, false, null, null, null, fsbVar5, 31))) {
                        kt2 kt2Var2 = zgVar.f44322a;
                        kt2Var2.a("acc_settings_pin_change_input", wp20.b(new Pair("send_code", "error")));
                        kt2Var2.c("acc_settings_pin_change_error");
                        au0Var.getClass();
                        s1p s1pVar2 = au0Var.f1455a;
                        b1j.v("error", s1pVar2, 3263L);
                        s1pVar2.a(xun.f41520a, 3265L);
                        return;
                    }
                    fsbVar = fsbVar5;
                }
            }
        } else {
            if (!orbVar.equals(jrb.f16995a)) {
                if (orbVar instanceof krb) {
                    N(((vrb) D()).c, ((krb) orbVar).f18755a, ((vrb) D()).e);
                    return;
                }
                if (orbVar instanceof lrb) {
                    N(((vrb) D()).c, ((vrb) D()).d, ((lrb) orbVar).f20522a);
                    return;
                } else if (orbVar instanceof mrb) {
                    N(((mrb) orbVar).f22261a, ((vrb) D()).d, ((vrb) D()).e);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
