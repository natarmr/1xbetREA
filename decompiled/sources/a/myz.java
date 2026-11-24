package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class myz implements qyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uxz f22627a;

    public final boolean equals(Object obj) {
        if (obj instanceof myz) {
            return this.f22627a.equals(((myz) obj).f22627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22627a.hashCode();
    }

    public final String toString() {
        return "ShowBottomSheetDialog(selectedLimit=" + this.f22627a + Separators.RPAREN;
    }
}
