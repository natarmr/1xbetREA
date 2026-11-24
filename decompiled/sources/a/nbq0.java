package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nbq0 extends diu0 {
    public final List b;
    public final p7m0 c = q7m0.a(hbq0.f12782a);
    public final p7m0 d;

    public nbq0(List list) {
        this.b = list;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            fp9 fp9Var = (fp9) obj;
            boolean z = true;
            if (i != this.b.size() - 1) {
                z = false;
            }
            fp9Var.getClass();
            arrayList.add(new jp9(fp9Var.b, fp9Var.f9917a, z));
            i = i2;
        }
        this.d = q7m0.a(new kbq0(arrayList));
    }
}
