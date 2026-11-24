package a;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class ddk implements vde0, w3n, tyn, q1o, d3h0 {
    public static d0t l(long j, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (qzb.i0((d0t) next) != j);
        if (next != null) {
            return (d0t) next;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (d0t d0tVar : ((d0t) it2.next()).k) {
                if (d0tVar.f5282a == j) {
                    next = d0tVar;
                }
            }
        }
        return (d0t) next;
    }

    public static m4s p(qg40 qg40Var) {
        Object next;
        qg40Var.getClass();
        c0o c0oVar = m4s.g;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((m4s) next).c.f28665a != qg40Var.f28665a);
        m4s m4sVar = (m4s) next;
        return m4sVar == null ? m4s.ANY : m4sVar;
    }

    public static qll q(Integer num) {
        qll qllVar = qll.PERSONAL;
        if (num.intValue() == 1) {
            return qllVar;
        }
        qll qllVar2 = qll.GAMING;
        if (num.intValue() == 2) {
            return qllVar2;
        }
        return num.intValue() == 3 ? qll.DEPOSIT : qll.UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    public static brg r(List list, long j, long j2, String str, long j3, double d, double d2, long j4) {
        ArrayList arrayList;
        List list2;
        Object next;
        List list3;
        list.getClass();
        str.getClass();
        d0t d0tVarL = l(j2, list);
        if (d0tVarL == null) {
            throw new ss3();
        }
        d0t d0tVarL2 = l(j, list);
        Object obj = null;
        if (d0tVarL2 == null || (list2 = d0tVarL2.K) == null) {
            arrayList = null;
        } else {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((BetGroupZip) next).b != j4);
            BetGroupZip betGroupZip = (BetGroupZip) next;
            if (betGroupZip == null || (list3 = betGroupZip.f) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((BetZip) obj2).b != 0.0d || str.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        if (arrayList != null) {
            for (Object obj3 : arrayList) {
                BetZip betZip = (BetZip) obj3;
                if (betZip.f46426a == j3 && betZip.d == d && betZip.b == d2 && betZip.c == j4 && Intrinsics.d(betZip.t, str)) {
                    obj = obj3;
                    break;
                }
            }
            BetZip betZip2 = (BetZip) obj;
            if (betZip2 != null) {
                return new brg(d0tVarL, betZip2);
            }
        }
        throw new ss3();
    }

    public static xco s(rco rcoVar) {
        rcoVar.getClass();
        return new xco(rcoVar.f30249a, rcoVar.c, rcoVar.d, rcoVar.b, rcoVar.e);
    }

    @Override // a.d3h0
    public String a() {
        return "0";
    }

    @Override // a.d3h0
    public String b() {
        return "0";
    }

    @Override // a.tyn
    public Object c(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // a.w3n
    public d4d e() {
        return d4d.SECONDARY60;
    }

    @Override // a.w3n
    public long f(fet fetVar) {
        fetVar.e0(-836700104);
        long separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
        fetVar.r(false);
        return separator;
    }

    @Override // a.w3n
    public long g(fet fetVar) {
        fetVar.e0(1162221314);
        long backgroundGroupSecondary = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroupSecondary();
        fetVar.r(false);
        return backgroundGroupSecondary;
    }

    @Override // a.vde0, a.b3u0
    public wsy getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // a.w3n
    public y9q0 h(fet fetVar) {
        fetVar.e0(-1607889290);
        y9q0 y9q0VarT = ibm0.t(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarT;
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }

    @Override // a.w3n
    public y9q0 k(fet fetVar) {
        fetVar.e0(1638246853);
        y9q0 y9q0VarL = ibm0.l(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarL;
    }

    @Override // a.w3n
    public y9q0 m(fet fetVar) {
        fetVar.e0(-1957238845);
        y9q0 y9q0VarT = ibm0.t(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar);
        fetVar.r(false);
        return y9q0VarT;
    }

    @Override // a.q1o
    public void E0(mp9 mp9Var) {
    }

    @Override // a.q1o
    public void o(wm40 wm40Var, ArrayList arrayList) {
    }
}
