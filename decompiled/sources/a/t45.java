package a;

/* JADX INFO: loaded from: classes6.dex */
public final class t45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33302a;

    public t45(Integer num) {
        this.f33302a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t45) {
            return this.f33302a.equals(((t45) obj).f33302a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33302a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dw9.q(new StringBuilder("ProductData{productId="), this.f33302a, "}");
    }
}
