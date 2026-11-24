package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qvr0 implements tvr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29400a;

    public qvr0(String str) {
        this.f29400a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvr0) && this.f29400a.equals(((qvr0) obj).f29400a);
    }

    public final int hashCode() {
        return this.f29400a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFileDownLoadConfirmationDialog(fileSizeText=", this.f29400a, Separators.RPAREN);
    }
}
