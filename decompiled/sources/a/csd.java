package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes.dex */
public final class csd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4882a;

    public final boolean equals(Object obj) {
        if (obj instanceof csd) {
            return this.f4882a == ((csd) obj).f4882a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4882a);
    }

    public final String toString() {
        int i = this.f4882a;
        if (i == 1) {
            return "SUPPORTED";
        }
        return i == 2 ? "UNSUPPORTED" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }
}
