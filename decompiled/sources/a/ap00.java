package a;

/* JADX INFO: loaded from: classes.dex */
public final class ap00 extends mva {
    public static final ap00 b = new ap00(false);

    public final boolean equals(Object obj) {
        if (obj instanceof ap00) {
            return this.f22447a == ((ap00) obj).f22447a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22447a);
    }

    public final String toString() {
        return brm0.o(new StringBuilder("Loading(endOfPaginationReached="), this.f22447a, ')');
    }
}
