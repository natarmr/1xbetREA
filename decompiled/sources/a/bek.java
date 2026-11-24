package a;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class bek implements o3n, tyn, d3h0 {
    public static sip f(boolean z) {
        return z ? sip.c : sip.b;
    }

    public static b5s l(String str) {
        Object next;
        c0o c0oVar = b5s.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((b5s) next).f2018a.equals(str));
        b5s b5sVar = (b5s) next;
        return b5sVar == null ? b5s.Circle : b5sVar;
    }

    public static sip m(Integer num) {
        return (num != null && num.intValue() == 1) ? sip.c : sip.b;
    }

    public static upl o(int i) {
        int i2 = i % 3;
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 3;
        if (iIntValue == 0) {
            return upl.c;
        }
        if (iIntValue != 1) {
            return iIntValue != 2 ? upl.b : upl.d;
        }
        return upl.b;
    }

    public static ueo p(obo oboVar) {
        oboVar.getClass();
        return new ueo(oboVar.b, oboVar.c, oboVar.d, oboVar.f24991a);
    }

    public static int q() {
        int i = cek.d;
        cek.d = i << 1;
        return i;
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
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // a.o3n
    public float e() {
        zcl zclVar = qmk.f28987a;
        return 16.0f;
    }

    @Override // a.o3n
    public float g() {
        zcl zclVar = qmk.f28987a;
        return 8.0f;
    }

    @Override // a.o3n
    public float h() {
        zcl zclVar = qmk.f28987a;
        return 52.0f;
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }

    @Override // a.o3n
    public int k() {
        return Integer.MAX_VALUE;
    }
}
