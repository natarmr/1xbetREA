package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class yoy extends ppy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43006a;

    public yoy(ArrayList arrayList) {
        this.f43006a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoy) && this.f43006a.equals(((yoy) obj).f43006a);
    }

    public final int hashCode() {
        return this.f43006a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f43006a + ')';
    }
}
