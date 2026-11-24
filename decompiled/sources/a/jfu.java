package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class jfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f16447a;

    public /* synthetic */ jfu(pru pruVar) {
        this.f16447a = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    public static ArrayList a(sff0 sff0Var, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amb0 amb0Var = (amb0) it.next();
            amb0 amb0Var2 = amb0.TOP;
            if (amb0Var != amb0Var2 && amb0Var != (amb0Var2 = amb0.SPORT) && ((!sff0Var.c.f7565a.f12870a || amb0Var != (amb0Var2 = amb0.CYBER)) && (!sff0Var.d.f27973a.f6914a || amb0Var != (amb0Var2 = amb0.ONE_X_GAMES)))) {
                amb0Var2 = amb0.AGGREGATOR;
                if (amb0Var == amb0Var2) {
                    hl1 hl1Var = sff0Var.b;
                    if (!hl1Var.C && !hl1Var.f13233a.b) {
                        amb0Var2 = null;
                    }
                } else {
                    amb0Var2 = null;
                }
            }
            if (amb0Var2 != null) {
                arrayList.add(amb0Var2);
            }
        }
        return arrayList;
    }

    public List b() {
        sff0 sff0VarA = this.f16447a.a();
        ArrayList arrayListA = a(sff0VarA, sff0VarA.L.g);
        if (arrayListA.isEmpty()) {
            arrayListA = a(sff0VarA, q3d.j(amb0.TOP, amb0.SPORT, amb0.CYBER, amb0.AGGREGATOR, amb0.ONE_X_GAMES));
        }
        return CollectionsKt.L0(CollectionsKt.O0(arrayListA));
    }
}
