package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Regex;
import org.xbet.client1.R;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class d48 extends w46 {
    public final au0 A;
    public final p7m0 B;
    public final ol60 C;
    public final Regex D;
    public int E;
    public kbn F;
    public bby G;
    public c4m0 H;
    public bby I;
    public boolean J;
    public final vzg0 b;
    public final bzt c;
    public final mne d;
    public final pru e;
    public final rpt f;
    public final ntu g;
    public final fnu h;
    public final ali i;
    public final rou j;
    public final ehf0 k;
    public final i1w0 l;
    public final vqb m;
    public final ag3 n;
    public final ik4 o;
    public final cyh p;
    public final zg q;
    public final rjo r;
    public final duj s;
    public final mi70 t;
    public final l38 u;
    public final z4w0 v;
    public final m1e w;
    public final ctf0 x;
    public final mii0 y;
    public final gnu z;

    public d48(vzg0 vzg0Var, bzt bztVar, mne mneVar, pru pruVar, rpt rptVar, ntu ntuVar, fnu fnuVar, ali aliVar, rou rouVar, ehf0 ehf0Var, i1w0 i1w0Var, vqb vqbVar, ag3 ag3Var, ik4 ik4Var, cyh cyhVar, zg zgVar, rjo rjoVar, duj dujVar, mi70 mi70Var, l38 l38Var, z4w0 z4w0Var, m1e m1eVar, ctf0 ctf0Var, mii0 mii0Var, gnu gnuVar, au0 au0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = bztVar;
        this.d = mneVar;
        this.e = pruVar;
        this.f = rptVar;
        this.g = ntuVar;
        this.h = fnuVar;
        this.i = aliVar;
        this.j = rouVar;
        this.k = ehf0Var;
        this.l = i1w0Var;
        this.m = vqbVar;
        this.n = ag3Var;
        this.o = ik4Var;
        this.p = cyhVar;
        this.q = zgVar;
        this.r = rjoVar;
        this.s = dujVar;
        this.t = mi70Var;
        this.u = l38Var;
        this.v = z4w0Var;
        this.w = m1eVar;
        this.x = ctf0Var;
        this.y = mii0Var;
        this.z = gnuVar;
        this.A = au0Var;
        int iP = l38Var.p();
        byte b = 2;
        boolean z = iP == 2 || iP == 8 || iP == 11;
        boolean z2 = pruVar.a().o;
        String strY = y();
        am90 am90Var = cm90.Companion;
        am90Var.getClass();
        kbn kbnVar = new kbn(0, "", "", "", am90.a(), true);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
        spannableStringBuilderValueOf.getClass();
        this.B = q7m0.a(new v38(kbnVar, "", true, false, z2, z, spannableStringBuilderValueOf, strY));
        this.C = new ol60(3);
        this.D = new Regex("\\D+");
        Integer num = (Integer) vzg0Var.a("SAVED_SELECTED_COUNTY_CODE");
        this.E = num != null ? num.intValue() : 0;
        am90Var.getClass();
        this.F = new kbn(0, "", "", "", am90.a(), true);
        if (l38Var.p() == 8) {
            sac.V(jiu0.a(this), new ye7(1, this, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.f22085a, new z38(this, null, b), 10);
        }
    }

    public final void A(jl90 jl90Var) {
        if (this.e.a().T) {
            this.C.f(r38.f29773a);
            return;
        }
        ag3 ag3Var = this.n;
        ag3Var.getClass();
        String str = jl90Var.f16705a;
        ag3Var.f809a.a("acc_add_phone_back", xp20.h(new Pair("point", str)));
        ik4 ik4Var = this.o;
        ik4Var.getClass();
        b1j.v(str, ik4Var.f14907a, 12540L);
        i1w0 i1w0Var = this.l;
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

    public final void B(int i, boolean z) {
        sac.V(jiu0.a(this), new ye7(1, this, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.d.b, new a48(this, i, z, null, (byte) 0), 10);
    }

    public final void C(kbn kbnVar) {
        while (true) {
            p7m0 p7m0Var = this.B;
            Object value = p7m0Var.getValue();
            kbn kbnVar2 = kbnVar;
            if (p7m0Var.m(value, v38.a((v38) value, kbnVar2, null, false, false, null, 250))) {
                return;
            } else {
                kbnVar = kbnVar2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:47:0x0196 A[LOOP:1: B:45:0x018d->B:47:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object w(String str, String str2, String str3, zje zjeVar) {
        w38 w38Var;
        String str4;
        String str5;
        String str6;
        Object objK;
        String str7;
        String str8;
        long j;
        String str9;
        Object objM;
        String str10;
        pk pkVar;
        String str11;
        p7m0 p7m0Var;
        Object value;
        dci0 bci0Var;
        i1w0 i1w0Var;
        ListIterator listIteratorO;
        paw pawVar;
        d48 d48Var = this;
        if (zjeVar instanceof w38) {
            w38Var = (w38) zjeVar;
            int i = w38Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                w38Var.o = i - Integer.MIN_VALUE;
            } else {
                w38Var = new w38(d48Var, zjeVar);
            }
        } else {
            w38Var = new w38(d48Var, zjeVar);
        }
        w38 w38Var2 = w38Var;
        Object obj = w38Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = w38Var2.o;
        l38 l38Var = d48Var.u;
        if (i2 == 0) {
            z1x.P(obj);
            d48Var.n.f809a.c("acc_add_phone_input");
            w38Var2.i = str;
            w38Var2.j = str2;
            w38Var2.k = str3;
            w38Var2.o = 1;
            Object objA = d48Var.j.a(true, w38Var2);
            if (objA != wneVar) {
                str4 = str;
                str5 = str2;
                obj = objA;
                str6 = str3;
            }
            return wneVar;
        }
        if (i2 == 1) {
            String str12 = w38Var2.k;
            String str13 = w38Var2.j;
            String str14 = w38Var2.i;
            z1x.P(obj);
            str6 = str12;
            str5 = str13;
            str4 = str14;
        } else {
            if (i2 == 2) {
                long j2 = w38Var2.l;
                String str15 = w38Var2.k;
                String str16 = w38Var2.j;
                str7 = w38Var2.i;
                z1x.P(obj);
                objK = obj;
                j = j2;
                str6 = str15;
                str8 = str16;
                int i3 = d48Var.E;
                w38Var2.i = str7;
                w38Var2.j = null;
                w38Var2.k = str6;
                w38Var2.l = j;
                w38Var2.o = 3;
                ehf0 ehf0Var = d48Var.k;
                str9 = str7;
                objM = ehf0Var.m(str9, str8, i3, (ynb0) objK, w38Var2);
                if (objM != wneVar) {
                    str10 = str9;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str17 = w38Var2.k;
            str10 = w38Var2.i;
            z1x.P(obj);
            str6 = str17;
            objM = obj;
            d48Var = d48Var;
        }
        pkVar = (pk) objM;
        d48Var.C(d48Var.F);
        str11 = str10 + Separators.SP + str6;
        do {
            p7m0Var = d48Var.B;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, v38.a((v38) value, null, null, false, false, null, 251)));
        if (l38Var instanceof k38) {
            bci0Var = new cci0(str11, pkVar.f27112a, pkVar.b, pkVar.c, false, new BindPhoneNumberScreen(l38Var));
        } else {
            bci0Var = new bci0(str11, pkVar.f27112a, l38Var.p(), pkVar.b, pkVar.c, false, new BindPhoneNumberScreen(l38Var));
        }
        i1w0Var = d48Var.l;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        d48Var.t.getClass();
        k0w0VarI.h(new SendConfirmationSMSScreen(bci0Var));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
        long j3 = ((m2c0) obj).S;
        p6a p6aVar = new p6a(ohs0.n(str4, str5), String.valueOf(j3));
        w38Var2.i = str4;
        w38Var2.j = str5;
        w38Var2.k = str6;
        w38Var2.l = j3;
        w38Var2.o = 2;
        lie0 lie0Var = new lie0();
        int iP = l38Var.p();
        objK = ntb.K(new vsg0(new wn2(d48Var.p.a(p6aVar), (yje) null, (w46) d48Var, (iP == 8 || iP == 9) ? "link_phone_mailing" : "phone_binding", lie0Var, (byte) 8)), w38Var2);
        if (objK != wneVar) {
            str7 = str4;
            str8 = str5;
            j = j3;
            int i4 = d48Var.E;
            w38Var2.i = str7;
            w38Var2.j = null;
            w38Var2.k = str6;
            w38Var2.l = j;
            w38Var2.o = 3;
            ehf0 ehf0Var2 = d48Var.k;
            str9 = str7;
            objM = ehf0Var2.m(str9, str8, i4, (ynb0) objK, w38Var2);
            if (objM != wneVar) {
                str10 = str9;
                pkVar = (pk) objM;
                d48Var.C(d48Var.F);
                str11 = str10 + Separators.SP + str6;
                do {
                    p7m0Var = d48Var.B;
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, v38.a((v38) value, null, null, false, false, null, 251)));
                if (l38Var instanceof k38) {
                    bci0Var = new cci0(str11, pkVar.f27112a, pkVar.b, pkVar.c, false, new BindPhoneNumberScreen(l38Var));
                } else {
                    bci0Var = new bci0(str11, pkVar.f27112a, l38Var.p(), pkVar.b, pkVar.c, false, new BindPhoneNumberScreen(l38Var));
                }
                i1w0Var = d48Var.l;
                k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                d48Var.t.getClass();
                k0w0VarI2.h(new SendConfirmationSMSScreen(bci0Var));
                listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                while (true) {
                    pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        }
        return wneVar;
    }

    public final void x(String str) {
        v3c.N(this.G);
        this.G = sac.V(jiu0.a(this), x38.f40204a, null, this.d.f22085a, new xw5(str, this, null, (byte) 22), 10);
    }

    public final String y() {
        l38 l38Var = this.u;
        if (l38Var != null) {
            boolean z = l38Var instanceof k38;
            ctf0 ctf0Var = this.x;
            if (z || (l38Var instanceof i38)) {
                return ctf0Var.b.a(R.string.binding_phone, Arrays.copyOf(new Object[0], 0));
            }
            if (l38Var instanceof j38) {
                return ctf0Var.b.a(R.string.change_phone, Arrays.copyOf(new Object[0], 0));
            }
        }
        t9f.b();
        return null;
    }

    public final void z(Throwable th) {
        sac.V(jiu0.a(this), new d38(this, (byte) 1), null, this.d.f22085a, new yp6(this, th, null, (byte) 12), 10);
    }
}
