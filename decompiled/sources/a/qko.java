package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28895a;
    public final long b;

    public qko(long j, long j2) {
        if (j2 == 0) {
            this.f28895a = 0L;
            this.b = 1L;
        } else {
            this.f28895a = j;
            this.b = j2;
        }
    }

    public final String toString() {
        return this.f28895a + Separators.SLASH + this.b;
    }
}
