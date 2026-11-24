package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class fdz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9379a;
    public final gdz b;

    public /* synthetic */ fdz(gdz gdzVar, byte b) {
        this.f9379a = b;
        this.b = gdzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9379a;
        gdz gdzVar = this.b;
        switch (b) {
            case 0:
                zm40 zm40Var = gdzVar.d;
                zm40Var.o1();
                return x2x.i0((hld) zm40Var.l.getValue(), gdzVar.e);
            case 1:
                zm40 zm40Var2 = gdzVar.d;
                zm40Var2.o1();
                return Boolean.valueOf(x2x.g0((hld) zm40Var2.l.getValue(), gdzVar.e));
            default:
                cu00 cu00Var = gdzVar.g;
                iiy[] iiyVarArr = gdz.i;
                boolean zBooleanValue = ((Boolean) yqm0.s(cu00Var, iiyVarArr[1])).booleanValue();
                swq swqVar = gdzVar.e;
                zm40 zm40Var3 = gdzVar.d;
                if (zBooleanValue) {
                    return br30.b;
                }
                List list = (List) yqm0.s(gdzVar.f, iiyVarArr[0]);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mg80) it.next()).y());
                }
                return obb.L("package view scope for " + swqVar + " in " + zm40Var3.getName(), CollectionsKt.r0(arrayList, new t5n0(zm40Var3, swqVar)));
        }
    }
}
