package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dfk extends pfk {
    public static final /* synthetic */ int h = 0;
    public final cu00 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public dfk(ffk ffkVar) {
        g45 g45Var = ffkVar.l;
        s2d0 s2d0Var = ffkVar.e;
        List list = s2d0Var.q;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (njq.A.e(((i3d0) obj).d).booleanValue()) {
                arrayListU.add(obj);
            }
        }
        List list2 = s2d0Var.r;
        ArrayList arrayListU2 = twn.u(list2);
        for (Object obj2 : list2) {
            if (njq.L.e(((p3d0) obj2).d).booleanValue()) {
                arrayListU2.add(obj2);
            }
        }
        super(g45Var, arrayListU, arrayListU2, iun.f15405a, t55.i);
        eu00 eu00Var = (eu00) ((f6i) g45Var.f10647a).e;
        v9k v9kVar = new v9k(this, (byte) 10);
        eu00Var.getClass();
        this.g = new cu00(eu00Var, v9kVar);
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return (Collection) this.g.invoke();
    }
}
