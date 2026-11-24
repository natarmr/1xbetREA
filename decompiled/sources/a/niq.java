package a;

/* JADX INFO: loaded from: classes.dex */
public final class niq implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23601a;

    public niq(int i) {
        this.f23601a = i;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return 0;
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return 0;
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return 0;
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return this.f23601a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof niq) && this.f23601a == ((niq) obj).f23601a;
    }

    public final int hashCode() {
        return this.f23601a * 961;
    }

    public final String toString() {
        return ua80.e(this.f23601a, "Insets(left=0, top=", ", right=0, bottom=0)");
    }
}
