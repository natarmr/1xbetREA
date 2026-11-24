package a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44137a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public zbw(int i, int i2, String str, String str2, String str3, String str4) {
        this.f44137a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zbw.class == obj.getClass()) {
            zbw zbwVar = (zbw) obj;
            if (this.f44137a == zbwVar.f44137a && this.b == zbwVar.b && TextUtils.equals(this.c, zbwVar.c) && TextUtils.equals(this.d, zbwVar.d) && TextUtils.equals(this.e, zbwVar.e) && TextUtils.equals(this.f, zbwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f44137a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
