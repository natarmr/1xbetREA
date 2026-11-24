package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45247a;

    public zzc0(String str) {
        this.f45247a = str;
    }

    public final Object a(ljf0 ljf0Var) {
        Object obj = ((HashMap) ljf0Var.f20148a).get(this);
        if (obj != null) {
            return obj;
        }
        hny.u(this.f45247a);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzc0.class != obj.getClass()) {
            return false;
        }
        return this.f45247a.equals(((zzc0) obj).f45247a);
    }

    public final int hashCode() {
        return this.f45247a.hashCode();
    }

    public final String toString() {
        return axq.n(new StringBuilder("Prop{name='"), this.f45247a, "'}");
    }
}
