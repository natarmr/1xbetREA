package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class s9d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y78 f31847a;
    public final v9d b;
    public final iun c;
    public final ArrayList d;
    public v9d e;
    public int f;
    public final t43 g;
    public mr20 h;
    public final List i;

    public s9d(y78 y78Var, v9d v9dVar) {
        v9dVar.getClass();
        this.f31847a = y78Var;
        this.b = v9dVar;
        this.c = iun.f15405a;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = v9dVar;
        this.f = -1;
        this.g = new t43(this, (byte) 1);
        this.h = new mr20(v9dVar, v9dVar, arrayList);
        this.i = q3d.j(new l24((byte) 1), new l24((byte) 2), new byc(), new xti0(), new h98(), new l24((byte) 4), new l24((byte) 0), new gtw(), new l24((byte) 3));
    }

    public final void a(int i, int i2) {
        if (i2 != 4) {
            ArrayList arrayList = this.d;
            for (int size = arrayList.size() - 1; size > i; size--) {
                ir20 ir20Var = (ir20) arrayList.get(size);
                ir20Var.getClass();
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 == 3 ? 1 : i2;
                w6x.a(i3, ir20Var.b, ir20Var.d());
                if (i3 == 4) {
                    throw new byw("If closing action is not NOTHING, marker should be gone");
                }
                arrayList.remove(size);
            }
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.d;
        this.e = arrayList.isEmpty() ? this.b : ((ir20) CollectionsKt.d0(arrayList)).f15236a;
    }
}
