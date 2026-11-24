package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h6w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12549a;
    public final ArrayList b;

    public h6w0(String str, ArrayList arrayList) {
        this.f12549a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6w0)) {
            return false;
        }
        h6w0 h6w0Var = (h6w0) obj;
        return this.f12549a.equals(h6w0Var.f12549a) && this.b.equals(h6w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12549a.hashCode() * 31);
    }

    public final String toString() {
        return "FingerprintGroup(name=" + this.f12549a + ", parameters=" + this.b + ')';
    }
}
