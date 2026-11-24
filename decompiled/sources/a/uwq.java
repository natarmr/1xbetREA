package a;

/* JADX INFO: loaded from: classes.dex */
public final class uwq implements vaz {
    @Override // a.vaz
    public final int a(int i) {
        return si30.b(i * 2.0f);
    }

    @Override // a.vaz
    public final int b(int i) {
        return si30.b(i * 2.0f);
    }

    public final boolean equals(Object obj) {
        return obj instanceof uwq;
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + (Float.hashCode(2.0f) * 31);
    }
}
