package a;

import android.gov.nist.core.Separators;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class duc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6692a;
    public final long b;

    public duc(OkHttpClient okHttpClient) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f6692a = okHttpClient;
        this.b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duc)) {
            return false;
        }
        duc ducVar = (duc) obj;
        return this.f6692a.equals(ducVar.f6692a) && this.b == ducVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f6692a.hashCode() * 31);
    }

    public final String toString() {
        return "SmartClient(okHttpClient=" + this.f6692a + ", createTime=" + this.b + Separators.RPAREN;
    }
}
