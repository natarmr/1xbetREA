package a;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class jjq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f16630a;

    public jjq(SparseBooleanArray sparseBooleanArray) {
        this.f16630a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jjq) {
            return this.f16630a.equals(((jjq) obj).f16630a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16630a.hashCode();
    }
}
