package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ag30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f810a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ cp f;
    public final /* synthetic */ pz40 g;

    public ag30(pz40 pz40Var, cp cpVar, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, cp cpVar2, pz40 pz40Var5) {
        this.f810a = pz40Var;
        this.b = cpVar;
        this.c = pz40Var2;
        this.d = pz40Var3;
        this.e = pz40Var4;
        this.f = cpVar2;
        this.g = pz40Var5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<kpa> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof kpa) {
                        arrayList2.add(obj3);
                    }
                }
                for (kpa kpaVar : arrayList2) {
                    if (kpaVar != null) {
                        boolean z = kpaVar instanceof ipa;
                        cp cpVar = this.f;
                        if (z) {
                            ((hgk0) this.e).setValue(Boolean.valueOf(((yf30) cpVar.u()).b));
                            ((vsx) cpVar.u).b.a(((ipa) kpaVar).f15152a);
                        } else if (kpaVar instanceof jpa) {
                            ((hgk0) this.g).setValue(dyb.r0(((yf30) cpVar.u()).f42522a));
                        }
                    }
                    t9f.b();
                    return null;
                }
            }
        }
        cp cpVar2 = this.b;
        ((hgk0) this.f810a).setValue(Boolean.valueOf(((yf30) cpVar2.u()).b));
        ((hgk0) this.c).setValue(dyb.r0(((yf30) cpVar2.u()).f42522a));
        ((hgk0) this.d).setValue(Boolean.valueOf(((yf30) cpVar2.u()).d));
        ((vsx) cpVar2.u).b.a(((yf30) cpVar2.u()).c);
        return Unit.f46060a;
    }
}
