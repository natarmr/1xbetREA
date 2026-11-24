package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c9h0 implements h9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3963a;

    public c9h0(ArrayList arrayList) {
        this.f3963a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9h0) && this.f3963a.equals(((c9h0) obj).f3963a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f3963a.hashCode() * 31);
    }

    public final String toString() {
        return hne.o("SuccessfulSearch(categories=", ", allClickAlwaysEnable=false)", this.f3963a);
    }
}
