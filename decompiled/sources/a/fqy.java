package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9997a;
    public x8x b;
    public final ArrayList c = new ArrayList(0);
    public fqy d;
    public fqy e;
    public aqy f;
    public final ArrayList g;

    public fqy(int i) {
        this.f9997a = i;
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new lgy());
        }
        this.g = arrayList;
    }

    public final x8x a() {
        x8x x8xVar = this.b;
        if (x8xVar != null) {
            return x8xVar;
        }
        Intrinsics.h("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fqy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fqy fqyVar = (fqy) obj;
        return this.f9997a == fqyVar.f9997a && a().equals(fqyVar.a()) && Intrinsics.d(this.c, fqyVar.c) && Intrinsics.d(this.e, fqyVar.e) && Intrinsics.d(this.d, fqyVar.d) && Intrinsics.d(this.f, fqyVar.f) && Intrinsics.d(this.g, fqyVar.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.f9997a * 31)) * 31);
    }
}
