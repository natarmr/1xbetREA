package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5872a;

    public dd1(String str) {
        this.f5872a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd1) && this.f5872a.equals(((dd1) obj).f5872a);
    }

    public final int hashCode() {
        return this.f5872a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnDailyTasksContainerClick(option=", this.f5872a, Separators.RPAREN);
    }
}
