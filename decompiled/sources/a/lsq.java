package a;

import android.javax.sip.header.PriorityHeader;

/* JADX INFO: loaded from: classes.dex */
public final class lsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20592a;

    public final boolean equals(Object obj) {
        if (obj instanceof lsq) {
            return this.f20592a == ((lsq) obj).f20592a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20592a);
    }

    public final String toString() {
        int i = this.f20592a;
        if (i == 0) {
            return PriorityHeader.NORMAL;
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
