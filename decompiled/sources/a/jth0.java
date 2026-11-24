package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jth0 implements kth0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jth0);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "Profile(isFirst=true, isLast=true)";
    }
}
