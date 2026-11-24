package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2x f33349a;
    public final ArrayList b;
    public final int c;

    public t53(r2x r2xVar, ArrayList arrayList) {
        Object obj;
        this.f33349a = r2xVar;
        this.b = arrayList;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int iC = ((n63) obj).b.c();
            int i = 1;
            int size = arrayList.size() - 1;
            if (1 <= size) {
                while (true) {
                    Object obj2 = arrayList.get(i);
                    int iC2 = ((n63) obj2).b.c();
                    if (iC < iC2) {
                        obj = obj2;
                        iC = iC2;
                    }
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            obj = null;
        }
        n63 n63Var = (n63) obj;
        this.c = n63Var != null ? n63Var.b.c() : 0;
    }
}
