package a;

/* JADX INFO: loaded from: classes.dex */
public final class bp00 extends mva {
    public static final bp00 b = new bp00(true);
    public static final bp00 c = new bp00(false);

    public final boolean equals(Object obj) {
        if (obj instanceof bp00) {
            return this.f22447a == ((bp00) obj).f22447a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22447a);
    }

    public final String toString() {
        return brm0.o(new StringBuilder("NotLoading(endOfPaginationReached="), this.f22447a, ')');
    }
}
