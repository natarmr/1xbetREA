package a;

/* JADX INFO: loaded from: classes6.dex */
public final class u3b implements z3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3b f34987a = new u3b();
    public static final n3d b = n3d.f22843a;

    @Override // a.z3b
    public final n3d a() {
        return b;
    }

    @Override // a.z3b
    public final boolean b(z3b z3bVar, z3b z3bVar2) {
        return (z3bVar instanceof u3b) && (z3bVar2 instanceof u3b);
    }

    @Override // a.z3b
    public final boolean d(z3b z3bVar, z3b z3bVar2) {
        return z3bVar.equals(z3bVar2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u3b);
    }

    public final int hashCode() {
        return 2005969527;
    }

    public final String toString() {
        return "CategoryCardShimmerModel";
    }
}
