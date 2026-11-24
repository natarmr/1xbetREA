package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gey implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11178a;
    public final zm40 b;

    public /* synthetic */ gey(zm40 zm40Var, byte b) {
        this.f11178a = b;
        this.b = zm40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11178a;
        zm40 zm40Var = this.b;
        switch (b) {
            case 0:
                return new iey(zm40Var);
            case 1:
                yuu yuuVar = zm40Var.h;
                if (yuuVar == null) {
                    String str = zm40Var.getName().f10896a;
                    str.getClass();
                    hny.m(str, " were not set before querying module content", "Dependencies of module ");
                    return null;
                }
                List list = (List) yuuVar.b;
                zm40Var.o1();
                list.contains(zm40Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zm40) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pg80 pg80Var = ((zm40) it2.next()).i;
                    pg80Var.getClass();
                    arrayList.add(pg80Var);
                }
                return new hld(arrayList, "CompositeProvider@ModuleDescriptor for " + zm40Var.getName());
            default:
                return zm40Var.c0(j4m0.i).h;
        }
    }
}
