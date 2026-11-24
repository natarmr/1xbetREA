package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qfk extends pfk {
    public final mg80 g;
    public final m3d0 h;
    public final String i;
    public final swq j;

    public qfk(mg80 mg80Var, m3d0 m3d0Var, h950 h950Var, e28 e28Var, kfy kfyVar, f6i f6iVar, String str, Function0 function0) {
        m3d0Var.getClass();
        h950Var.getClass();
        e28Var.getClass();
        f6iVar.getClass();
        g4d0 g4d0Var = m3d0Var.g;
        g4d0Var.getClass();
        roi0 roi0Var = new roi0(g4d0Var);
        xbu0 xbu0Var = xbu0.b;
        n4d0 n4d0Var = m3d0Var.h;
        n4d0Var.getClass();
        g45 g45Var = new g45(f6iVar, h950Var, mg80Var, roi0Var, tnq0.j(n4d0Var), e28Var, kfyVar, (qgd) null, iun.f15405a);
        List list = m3d0Var.d;
        list.getClass();
        List list2 = m3d0Var.e;
        list2.getClass();
        List list3 = m3d0Var.f;
        list3.getClass();
        super(g45Var, list, list2, list3, function0);
        this.g = mg80Var;
        this.h = m3d0Var;
        this.i = str;
        this.j = ((ng80) mg80Var).f;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        ux50 ux50Var = ux50.f36425a;
        List listI = i(cekVar, function1);
        Iterable iterable = (Iterable) ((f6i) this.b.f10647a).m;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((klc) it.next()).c(this.j));
        }
        return CollectionsKt.q0(listI, arrayList);
    }

    @Override // a.pfk, a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        ((gqw0) ((f6i) this.b.f10647a).k).getClass();
        ux50Var.getClass();
        mg80 mg80Var = this.g;
        mg80Var.getClass();
        g950Var.getClass();
        String str = ((ng80) mg80Var).f.f32934a.f34663a;
        g950Var.b().getClass();
        str.getClass();
        return super.d(g950Var, ux50Var);
    }

    @Override // a.pfk
    public final qlc l(g950 g950Var) {
        g950Var.getClass();
        return new qlc(this.j, g950Var);
    }

    @Override // a.pfk
    public final Set n() {
        return xun.f41520a;
    }

    @Override // a.pfk
    public final Set o() {
        return xun.f41520a;
    }

    @Override // a.pfk
    public final Set p() {
        return xun.f41520a;
    }

    @Override // a.pfk
    public final boolean q(g950 g950Var) {
        g950Var.getClass();
        if (m().contains(g950Var)) {
            return true;
        }
        Iterable iterable = (Iterable) ((f6i) this.b.f10647a).m;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((klc) it.next()).a(this.j, g950Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }

    @Override // a.pfk
    public final void h(ArrayList arrayList, Function1 function1) {
    }
}
