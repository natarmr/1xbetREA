package a;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class emd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8040a;

    public emd(byte b) {
        switch (b) {
            case 1:
                this.f8040a = new ArrayList();
                new ArrayList();
                kd40.f18088a.getClass();
                List listA = jd40.a();
                ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((ffy) ((kd40) it.next())).getClass();
                    arrayList.add(new efy());
                }
                break;
            default:
                this.f8040a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f8040a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lrs0 lrs0Var = (lrs0) arrayList.get(size);
            Matrix matrix = cut0.f5002a;
            if (lrs0Var != null && !lrs0Var.f20549a) {
                cut0.a(path, lrs0Var.d.l() / 100.0f, lrs0Var.e.l() / 100.0f, lrs0Var.f.l() / 360.0f);
            }
        }
    }
}
