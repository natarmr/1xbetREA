package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d3b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5395a;
    public final /* synthetic */ w4t b;

    public /* synthetic */ d3b0(w4t w4tVar, byte b) {
        this.f5395a = b;
        this.b = w4tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5395a;
        w4t w4tVar = this.b;
        oyg0 oyg0Var = (oyg0) obj;
        u2b0 u2b0Var = (u2b0) obj2;
        switch (b) {
            case 0:
                oyg0Var.getClass();
                u2b0Var.getClass();
                List<Object> list = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Object pe40Var : list) {
                    if (pe40Var instanceof pe40) {
                        w4t w4tVar2 = ((pe40) pe40Var).f26833a;
                        if (w4tVar2.equals(w4tVar)) {
                            pe40Var = new pe40(w4tVar2, ayx.f1691a);
                        }
                    }
                    arrayList.add(pe40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            default:
                List<Object> list2 = u2b0Var.l;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (Object pe40Var2 : list2) {
                    if (pe40Var2 instanceof pe40) {
                        w4t w4tVar3 = ((pe40) pe40Var2).f26833a;
                        if (w4tVar3.equals(w4tVar)) {
                            pe40Var2 = new pe40(w4tVar3, eyx.f8647a);
                        }
                    }
                    arrayList2.add(pe40Var2);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList2, 2047);
        }
    }
}
