package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class pdx extends dr30 {
    public final cr30 b;

    public pdx(cr30 cr30Var) {
        cr30Var.getClass();
        this.b = cr30Var;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        int i = cek.l & cekVar.b;
        cek cekVar2 = i == 0 ? null : new cek(i, cekVar.f4217a);
        if (cekVar2 == null) {
            return iun.f15405a;
        }
        Collection collectionB = this.b.b(cekVar2, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            if (obj instanceof goc) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // a.dr30, a.cr30
    public final Set c() {
        return this.b.c();
    }

    @Override // a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        foc focVarD = this.b.d(g950Var, ux50Var);
        if (focVarD != null) {
            wm40 wm40Var = focVarD instanceof wm40 ? (wm40) focVarD : null;
            if (wm40Var != null) {
                return wm40Var;
            }
            if (focVarD instanceof tfk) {
                return (tfk) focVarD;
            }
        }
        return null;
    }

    @Override // a.dr30, a.cr30
    public final Set e() {
        return this.b.e();
    }

    @Override // a.dr30, a.cr30
    public final Set g() {
        return this.b.g();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
