package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z650 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43849a;
    public final /* synthetic */ p850 b;

    public /* synthetic */ z650(p850 p850Var, byte b) {
        this.f43849a = b;
        this.b = p850Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f43849a;
        p850 p850Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                List<jge> list = ((p650) p850Var.D()).h;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (jge jgeVarQ : list) {
                    if (jgeVarQ.a() instanceof x98) {
                        jgeVarQ = thb.Q(jgeVarQ);
                    }
                    arrayList.add(jgeVarQ);
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((jge) obj2).getKey(), obj2);
                }
                ArrayList<jge> arrayListX = thb.x(p850Var.s.p(((p650) p850Var.D()).f26438a));
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayListX, 10));
                for (jge jgeVar : arrayListX) {
                    jge jgeVar2 = (jge) linkedHashMap.get(jgeVar.getKey());
                    if (jgeVar2 != null) {
                        jgeVar = jgeVar2;
                    }
                    arrayList2.add(jgeVar);
                }
                p7m0 p7m0Var = p850Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    p850Var.f.getClass();
                } while (!p7m0Var.m(value, p650.a((p650) value, null, arrayList2, null, false, 262015)));
                break;
            default:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var2 = p850Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    p850Var.f.getClass();
                } while (!p7m0Var2.m(value2, p650.a((p650) value2, pb0Var.f26680a, null, null, false, 262079)));
                break;
        }
        return Unit.f46060a;
    }
}
