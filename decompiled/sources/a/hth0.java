package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hth0 implements kth0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hth0);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Header(isFirst=false, isLast=false)";
    }
}
