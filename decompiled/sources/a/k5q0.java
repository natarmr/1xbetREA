package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k5q0 {
    public static final k5q0 b = new k5q0(0);
    public static final k5q0 c = new k5q0(1);
    public static final k5q0 d = new k5q0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17733a;

    public k5q0(int i) {
        this.f17733a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5q0) {
            return this.f17733a == ((k5q0) obj).f17733a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17733a;
    }

    public final String toString() {
        int i = this.f17733a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return kng0.l("TextDecoration[", qf00.a(arrayList, ", ", null, 62), "]");
        }
        return "TextDecoration." + arrayList.get(0);
    }
}
