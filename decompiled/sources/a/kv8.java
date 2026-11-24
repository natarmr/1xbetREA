package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kv8 implements lv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18945a;

    public kv8(String str) {
        this.f18945a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv8) && this.f18945a.equals(((kv8) obj).f18945a);
    }

    public final int hashCode() {
        return this.f18945a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSortingOptionSelect(sortName=", this.f18945a, Separators.RPAREN);
    }
}
