package a;

/* JADX INFO: loaded from: classes.dex */
public final class ox40 implements u1e {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ox40);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (Integer.hashCode(4) * 31);
    }

    public final String toString() {
        return "MultipleConnection(numOfReaders=4, numOfWriters=1)";
    }
}
