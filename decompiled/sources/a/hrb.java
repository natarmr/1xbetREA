package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class hrb extends w46 {
    public int A;
    public kbn B;
    public c4m0 C;
    public c4m0 D;
    public boolean E;
    public final Regex F;
    public final vzg0 b;
    public final mne c;
    public final rpt d;
    public final rou e;
    public final i1w0 f;
    public final vqb g;
    public final ag3 h;
    public final ik4 i;
    public final cyh j;
    public final rjo k;
    public final duj l;
    public final uqb m;
    public final ntu n;
    public final z4w0 o;
    public final m1e p;
    public final vqb q;
    public final ctf0 r;
    public final nr s;
    public final s64 t;
    public final mi70 u;
    public final mii0 v;
    public final sa10 w;
    public final p7m0 x;
    public final p7m0 y;
    public final ol60 z;

    public hrb(vzg0 vzg0Var, mne mneVar, rpt rptVar, rou rouVar, i1w0 i1w0Var, vqb vqbVar, ag3 ag3Var, ik4 ik4Var, cyh cyhVar, rjo rjoVar, duj dujVar, uqb uqbVar, ntu ntuVar, z4w0 z4w0Var, m1e m1eVar, vqb vqbVar2, ctf0 ctf0Var, nr nrVar, s64 s64Var, mi70 mi70Var, mii0 mii0Var, sa10 sa10Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = mneVar;
        this.d = rptVar;
        this.e = rouVar;
        this.f = i1w0Var;
        this.g = vqbVar;
        this.h = ag3Var;
        this.i = ik4Var;
        this.j = cyhVar;
        this.k = rjoVar;
        this.l = dujVar;
        this.m = uqbVar;
        this.n = ntuVar;
        this.o = z4w0Var;
        this.p = m1eVar;
        this.q = vqbVar2;
        this.r = ctf0Var;
        this.s = nrVar;
        this.t = s64Var;
        this.u = mi70Var;
        this.v = mii0Var;
        this.w = sa10Var;
        am90 am90Var = cm90.Companion;
        am90Var.getClass();
        this.x = q7m0.a(new frb(new kbn(0, "", "", "", am90.a(), true), true, false, "", new SpannableStringBuilder("")));
        this.y = q7m0.a(wqb.f39581a);
        this.z = new ol60(3);
        Integer num = (Integer) vzg0Var.a("SAVED_SELECTED_COUNTY_CODE");
        this.A = num != null ? num.intValue() : 0;
        am90Var.getClass();
        this.B = new kbn(0, "", "", "", am90.a(), true);
        this.E = true;
        this.F = new Regex("\\D+");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0163  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object w(String str, String str2, String str3, zje zjeVar) {
        grb grbVar;
        String str4;
        String str5;
        String str6;
        Object objA;
        long j;
        String str7;
        String str8;
        String str9;
        String str10;
        long j2;
        String str11;
        mqb mqbVar;
        kbn kbnVar;
        p7m0 p7m0Var;
        Object value;
        Object value2;
        List list;
        List list2;
        String strQ;
        Object objA2;
        hrb hrbVar;
        String str12;
        List list3;
        List list4;
        mqb mqbVar2;
        if (zjeVar instanceof grb) {
            grbVar = (grb) zjeVar;
            int i = grbVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                grbVar.t = i - Integer.MIN_VALUE;
            } else {
                grbVar = new grb(this, zjeVar);
            }
        } else {
            grbVar = new grb(this, zjeVar);
        }
        grb grbVar2 = grbVar;
        Object objX = grbVar2.r;
        wne wneVar = wne.f39444a;
        int i2 = grbVar2.t;
        rou rouVar = this.e;
        byte b = 4;
        byte b2 = 2;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objX);
            str4 = str;
            grbVar2.i = str4;
            str5 = str2;
            grbVar2.j = str5;
            str6 = str3;
            grbVar2.k = str6;
            grbVar2.t = 1;
            objA = rouVar.a(true, grbVar2);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            String str13 = grbVar2.k;
            String str14 = grbVar2.j;
            String str15 = grbVar2.i;
            z1x.P(objX);
            objA = objX;
            str4 = str15;
            str6 = str13;
            str5 = str14;
        } else {
            if (i2 == 2) {
                long j3 = grbVar2.q;
                String str16 = grbVar2.k;
                String str17 = grbVar2.j;
                String str18 = grbVar2.i;
                z1x.P(objX);
                str9 = str16;
                str7 = str18;
                j = j3;
                str8 = str17;
                int i3 = this.A;
                grbVar2.i = str7;
                grbVar2.j = null;
                grbVar2.k = str9;
                grbVar2.q = j;
                grbVar2.t = 3;
                objX = this.q.f37848a.x(str7, str8, i3, (ynb0) objX, grbVar2);
                if (objX != wneVar) {
                    str10 = str7;
                    j2 = j;
                    str11 = str9;
                    mqbVar = (mqb) objX;
                    kbnVar = this.B;
                    do {
                        p7m0Var = this.x;
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, frb.a((frb) value, kbnVar, false, false, null, null, 28)));
                    do {
                        value2 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value2, frb.a((frb) value2, null, false, false, null, null, 29)));
                    list = mqbVar.b;
                    list2 = mqbVar.c;
                    strQ = w6x.q(str10, Separators.SP, str11);
                    grbVar2.i = null;
                    grbVar2.j = null;
                    grbVar2.k = null;
                    grbVar2.l = mqbVar;
                    grbVar2.m = this;
                    grbVar2.n = list;
                    grbVar2.o = list2;
                    grbVar2.p = strQ;
                    grbVar2.q = j2;
                    grbVar2.t = 4;
                    objA2 = rouVar.a(false, grbVar2);
                    if (objA2 != wneVar) {
                        hrbVar = this;
                        str12 = strQ;
                        list3 = list;
                        list4 = list2;
                        mqbVar2 = mqbVar;
                        objX = objA2;
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                j2 = grbVar2.q;
                str11 = grbVar2.k;
                str10 = grbVar2.i;
                z1x.P(objX);
                mqbVar = (mqb) objX;
                kbnVar = this.B;
                do {
                    p7m0Var = this.x;
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, frb.a((frb) value, kbnVar, false, false, null, null, 28)));
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, frb.a((frb) value2, null, false, false, null, null, 29)));
                list = mqbVar.b;
                list2 = mqbVar.c;
                strQ = w6x.q(str10, Separators.SP, str11);
                grbVar2.i = null;
                grbVar2.j = null;
                grbVar2.k = null;
                grbVar2.l = mqbVar;
                grbVar2.m = this;
                grbVar2.n = list;
                grbVar2.o = list2;
                grbVar2.p = strQ;
                grbVar2.q = j2;
                grbVar2.t = 4;
                objA2 = rouVar.a(false, grbVar2);
                if (objA2 != wneVar) {
                    hrbVar = this;
                    str12 = strQ;
                    list3 = list;
                    list4 = list2;
                    mqbVar2 = mqbVar;
                    objX = objA2;
                }
                return wneVar;
            }
            if (i2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str19 = grbVar2.p;
            List list5 = grbVar2.o;
            List list6 = grbVar2.n;
            hrb hrbVar2 = grbVar2.m;
            mqbVar2 = grbVar2.l;
            z1x.P(objX);
            str12 = str19;
            list4 = list5;
            list3 = list6;
            hrbVar = hrbVar2;
        }
        hrbVar.f.d(new bg0(hrbVar, ((m2c0) objX).Z, mqbVar2.f22216a, list3, list4, str12, (byte) 4));
        return Unit.f46060a;
        j = ((m2c0) objA).S;
        String strN = ohs0.n(str4, str5);
        String strValueOf = String.valueOf(j);
        strValueOf.getClass();
        p6a p6aVar = new p6a("ChangePhone", strN, strValueOf);
        grbVar2.i = str4;
        grbVar2.j = str5;
        grbVar2.k = str6;
        grbVar2.q = j;
        grbVar2.t = 2;
        Object objK = ntb.K(new vsg0(new nv(new fnq(this.j.a(p6aVar), new fob(this, yjeVar, b), (byte) 4), yjeVar, b2)), grbVar2);
        if (objK != wneVar) {
            str7 = str4;
            objX = objK;
            str8 = str5;
            str9 = str6;
            int i4 = this.A;
            grbVar2.i = str7;
            grbVar2.j = null;
            grbVar2.k = str9;
            grbVar2.q = j;
            grbVar2.t = 3;
            objX = this.q.f37848a.x(str7, str8, i4, (ynb0) objX, grbVar2);
            if (objX != wneVar) {
                str10 = str7;
                j2 = j;
                str11 = str9;
                mqbVar = (mqb) objX;
                kbnVar = this.B;
                do {
                    p7m0Var = this.x;
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, frb.a((frb) value, kbnVar, false, false, null, null, 28)));
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, frb.a((frb) value2, null, false, false, null, null, 29)));
                list = mqbVar.b;
                list2 = mqbVar.c;
                strQ = w6x.q(str10, Separators.SP, str11);
                grbVar2.i = null;
                grbVar2.j = null;
                grbVar2.k = null;
                grbVar2.l = mqbVar;
                grbVar2.m = this;
                grbVar2.n = list;
                grbVar2.o = list2;
                grbVar2.p = strQ;
                grbVar2.q = j2;
                grbVar2.t = 4;
                objA2 = rouVar.a(false, grbVar2);
                if (objA2 != wneVar) {
                    hrbVar = this;
                    str12 = strQ;
                    list3 = list;
                    list4 = list2;
                    mqbVar2 = mqbVar;
                    objX = objA2;
                    hrbVar.f.d(new bg0(hrbVar, ((m2c0) objX).Z, mqbVar2.f22216a, list3, list4, str12, (byte) 4));
                    return Unit.f46060a;
                }
            }
        }
        return wneVar;
    }

    public final void x(String str) {
        v3c.N(this.C);
        this.C = sac.R(jiu0.a(this), new m1b((byte) 28), null, this.c.f22085a, new d09((Object) str, (Object) this, (yje) null, (byte) 29));
    }
}
