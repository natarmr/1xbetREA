package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p3b implements z3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26292a;
    public final n0x b;
    public final String c;

    public p3b(int i, n0x n0xVar, String str) {
        str.getClass();
        this.f26292a = i;
        this.b = n0xVar;
        this.c = str;
        n3d n3dVar = n3d.f22843a;
    }

    @Override // a.z3b
    public final n3d a() {
        return n3d.b;
    }

    @Override // a.z3b
    public final boolean b(z3b z3bVar, z3b z3bVar2) {
        return (z3bVar instanceof p3b) && (z3bVar2 instanceof p3b) && ((p3b) z3bVar).f26292a == ((p3b) z3bVar2).f26292a;
    }

    @Override // a.z3b
    public final Collection c(z3b z3bVar, z3b z3bVar2) {
        if (!(z3bVar instanceof p3b) || !(z3bVar2 instanceof p3b)) {
            return null;
        }
        p3b p3bVar = (p3b) z3bVar;
        p3b p3bVar2 = (p3b) z3bVar2;
        String str = p3bVar2.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str2 = p3bVar.c;
        n0x n0xVar = p3bVar2.b;
        if (!Intrinsics.d(str2, str)) {
            str.getClass();
            linkedHashSet.add(new q3b(str));
        }
        if (!p3bVar.b.equals(n0xVar)) {
            linkedHashSet.add(new r3b(n0xVar));
        }
        return linkedHashSet;
    }

    @Override // a.z3b
    public final boolean d(z3b z3bVar, z3b z3bVar2) {
        return (z3bVar instanceof p3b) && (z3bVar2 instanceof p3b) && z3bVar.equals(z3bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3b)) {
            return false;
        }
        p3b p3bVar = (p3b) obj;
        return this.f26292a == p3bVar.f26292a && this.b.equals(p3bVar.b) && Intrinsics.d(this.c, p3bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, Integer.hashCode(this.f26292a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryCardCollectionItemModel(bannerId=");
        sb.append(this.f26292a);
        sb.append(", picture=");
        sb.append(this.b);
        sb.append(", label=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
