package a;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class g55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10702a;

    public g55(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            hny.u("Null osRelease");
            throw null;
        }
        if (str2 != null) {
            this.f10702a = z;
        } else {
            hny.u("Null osCodeName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g55)) {
            return false;
        }
        g55 g55Var = (g55) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f10702a == g55Var.f10702a;
    }

    public final int hashCode() {
        return (this.f10702a ? 1231 : 1237) ^ ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return rw2.p(sb, this.f10702a, "}");
    }
}
