package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ooo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25604a;
    public final int b;

    public ooo(ArrayList arrayList, int i) {
        this.f25604a = new ArrayList(arrayList);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ooo) {
            return this.f25604a.equals(((ooo) obj).f25604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25604a.hashCode();
    }

    public final String toString() {
        return rz4.n(new StringBuilder("{ "), this.f25604a, " }");
    }
}
