package a;

/* JADX INFO: loaded from: classes.dex */
public final class rne extends kotlin.coroutines.a {
    public static final kud c = new kud();
    public final String b;

    public rne(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rne) && this.b.equals(((rne) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
