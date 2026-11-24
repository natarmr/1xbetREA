package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class tnc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final snc0 f34227a;
    public final dnc0 b;

    public tnc0(snc0 snc0Var, dnc0 dnc0Var) {
        snc0Var.getClass();
        dnc0Var.getClass();
        this.f34227a = snc0Var;
        this.b = dnc0Var;
    }

    public final void a(List list) {
        list.getClass();
        dnc0 dnc0Var = this.b;
        dnc0Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            no60 no60Var = (no60) it.next();
            List list2 = dnc0Var.c;
            if (list2 != null && !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (((pe8) it2.next()).f26839a == no60Var.f23855a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    vpv0 vpv0Var = no60Var.b;
                    pe8 pe8Var = (pe8) list2.get(i);
                    ArrayList arrayList = new ArrayList(CollectionsKt.m0(list2, pe8Var));
                    arrayList.add(i, pe8.a(pe8Var, vpv0Var == vpv0.b, vpv0Var != vpv0.c, 5119));
                    dnc0Var.c = sj3.y0(arrayList);
                }
            }
        }
    }
}
