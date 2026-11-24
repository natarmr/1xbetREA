package a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c800 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp f3889a;
    public final /* synthetic */ gkz b;
    public final /* synthetic */ gkz c;
    public final /* synthetic */ n0o0 d;
    public final /* synthetic */ cp e;

    public c800(cp cpVar, gkz gkzVar, gkz gkzVar2, n0o0 n0o0Var, cp cpVar2) {
        this.f3889a = cpVar;
        this.b = gkzVar;
        this.c = gkzVar2;
        this.d = n0o0Var;
        this.e = cpVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.f3889a;
            yfu0 yfu0Var = cpVar.u;
            ((ssx) yfu0Var).d.o((b800) this.d.getValue());
            this.b.A(((a800) cpVar.u()).f400a);
            this.c.A(((a800) cpVar.u()).b);
            ssx ssxVar = (ssx) yfu0Var;
            ssxVar.b.a(((a800) cpVar.u()).d);
            RecyclerView recyclerView = ssxVar.d;
            recyclerView.post(new jto(recyclerView, ssxVar.b, ((a800) cpVar.u()).c, ((a800) cpVar.u()).f400a.size()));
            int i = ((a800) cpVar.u()).e ? 2 : 0;
            ssxVar.c.setLayoutDirection(i);
            ssxVar.d.setLayoutDirection(i);
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<hpa> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof hpa) {
                        arrayList2.add(obj3);
                    }
                }
                for (hpa hpaVar : arrayList2) {
                    if (!(hpaVar instanceof hpa)) {
                        t9f.b();
                        return null;
                    }
                    ((ssx) this.e.u).b.a(hpaVar.f13431a);
                }
            }
        }
        return Unit.f46060a;
    }
}
