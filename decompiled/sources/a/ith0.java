package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ith0 implements kth0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ith0);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "LongLines(isFirst=true, isLast=false)";
    }
}
