package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gjt extends ljt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final erp f11417a;

    public gjt(fjt fjtVar) {
        fjtVar.b.f();
        fjtVar.c = false;
        this.f11417a = fjtVar.b;
    }

    public final boolean j() {
        oak0 oak0Var = this.f11417a.f8293a;
        for (int i = 0; i < oak0Var.b.size(); i++) {
            if (!erp.e((Map.Entry) oak0Var.b.get(i))) {
                return false;
            }
        }
        Iterator it = oak0Var.c().iterator();
        while (it.hasNext()) {
            if (!erp.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int k() {
        oak0 oak0Var = this.f11417a.f8293a;
        int iD = 0;
        for (int i = 0; i < oak0Var.b.size(); i++) {
            Map.Entry entry = (Map.Entry) oak0Var.b.get(i);
            iD += erp.d((hjt) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : oak0Var.c()) {
            iD += erp.d((hjt) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object l(ijt ijtVar) {
        q(ijtVar);
        hjt hjtVar = ijtVar.d;
        Object obj = this.f11417a.f8293a.get(hjtVar);
        if (obj == null) {
            return ijtVar.b;
        }
        if (!hjtVar.c) {
            return ijtVar.a(obj);
        }
        if (hjtVar.b.f8155a != hov0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(ijtVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean m(ijt ijtVar) {
        q(ijtVar);
        hjt hjtVar = ijtVar.d;
        erp erpVar = this.f11417a;
        erpVar.getClass();
        if (!hjtVar.c) {
            return erpVar.f8293a.get(hjtVar) != null;
        }
        jf4.o("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void n() {
        this.f11417a.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean o(pyc pycVar, tyc tycVar, sso ssoVar, int i) throws aox {
        boolean z;
        boolean z2;
        Object objC;
        z3 z3Var;
        int i2 = i & 7;
        ijt ijtVar = (ijt) ssoVar.f32734a.get(new pso(a(), i >>> 3));
        if (ijtVar == null) {
            z2 = true;
            z = false;
        } else {
            hjt hjtVar = ijtVar.d;
            eov0 eov0Var = hjtVar.b;
            erp erpVar = erp.c;
            if (i2 == eov0Var.b) {
                z2 = false;
                z = false;
            } else if (hjtVar.c && eov0Var.a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return pycVar.q(i, tycVar);
        }
        ajt ajtVarE = null;
        erp erpVar2 = this.f11417a;
        if (z) {
            int iE = pycVar.e(pycVar.k());
            hjt hjtVar2 = ijtVar.d;
            if (hjtVar2.b != eov0.g) {
                while (pycVar.c() > 0) {
                    erpVar2.a(hjtVar2, erp.h(pycVar, hjtVar2.b));
                }
            } else if (pycVar.c() > 0) {
                pycVar.k();
                throw null;
            }
            pycVar.d(iE);
            return true;
        }
        hjt hjtVar3 = ijtVar.d;
        eov0 eov0Var2 = hjtVar3.b;
        boolean z3 = hjtVar3.c;
        eov0 eov0Var3 = hjtVar3.b;
        int iOrdinal = eov0Var2.f8155a.ordinal();
        if (iOrdinal == 7) {
            pycVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objC = erp.h(pycVar, eov0Var3);
        } else {
            if (!z3 && (z3Var = (z3) erpVar2.f8293a.get(hjtVar3)) != null) {
                ajtVarE = z3Var.f();
            }
            if (ajtVarE == null) {
                ajtVarE = ijtVar.c.e();
            }
            if (eov0Var3 == eov0.e) {
                short s = hjtVar3.f13177a;
                pycVar.b();
                pycVar.i++;
                ajtVarE.d(pycVar, ssoVar);
                pycVar.a((s << 3) | 4);
                pycVar.i--;
            } else {
                int iK = pycVar.k();
                pycVar.b();
                int iE2 = pycVar.e(iK);
                pycVar.i++;
                ajtVarE.d(pycVar, ssoVar);
                pycVar.a(0);
                pycVar.i--;
                pycVar.d(iE2);
            }
            objC = ajtVarE.c();
        }
        if (z3) {
            erpVar2.a(hjtVar3, ijtVar.b(objC));
            return true;
        }
        erpVar2.i(hjtVar3, ijtVar.b(objC));
        return true;
    }

    public final void q(ijt ijtVar) {
        if (ijtVar.f14892a == a()) {
            return;
        }
        jf4.o("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public gjt() {
        this.f11417a = new erp();
    }
}
