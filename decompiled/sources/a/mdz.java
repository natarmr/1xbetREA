package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mdz implements cr30 {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public mdz(eu00 eu00Var, Function0 function0) {
        eu00Var.getClass();
        this.c = new cu00(eu00Var, new lfk(function0, (byte) 7));
    }

    @Override // a.cr30
    public Collection a(g950 g950Var, ux50 ux50Var) {
        switch (this.b) {
            case 1:
                g950Var.getClass();
                return m2x.D(j(g950Var, ux50Var), pnk0.g);
            default:
                return j(g950Var, ux50Var);
        }
    }

    @Override // a.cr30
    public Collection b(cek cekVar, Function1 function1) {
        switch (this.b) {
            case 1:
                cekVar.getClass();
                Collection collectionI = i(cekVar, function1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((vjj) obj) instanceof kp9) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return CollectionsKt.q0(m2x.D(arrayList, pnk0.i), arrayList2);
            default:
                return i(cekVar, function1);
        }
    }

    @Override // a.cr30
    public final Set c() {
        return l().c();
    }

    @Override // a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return l().d(g950Var, ux50Var);
    }

    @Override // a.cr30
    public final Set e() {
        return l().e();
    }

    @Override // a.cr30
    public Collection f(g950 g950Var, ux50 ux50Var) {
        switch (this.b) {
            case 1:
                g950Var.getClass();
                return m2x.D(k(g950Var, ux50Var), pnk0.h);
            default:
                return k(g950Var, ux50Var);
        }
    }

    @Override // a.cr30
    public final Set g() {
        return l().g();
    }

    public final cr30 h() {
        if (!(l() instanceof mdz)) {
            return l();
        }
        cr30 cr30VarL = l();
        cr30VarL.getClass();
        return ((mdz) cr30VarL).h();
    }

    public final Collection i(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return l().b(cekVar, function1);
    }

    public final Collection j(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return l().a(g950Var, ux50Var);
    }

    public final Collection k(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return l().f(g950Var, ux50Var);
    }

    public final cr30 l() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (cr30) ((cu00) obj).invoke();
            default:
                return (cr30) obj;
        }
    }

    public mdz(cr30 cr30Var) {
        this.c = cr30Var;
    }
}
