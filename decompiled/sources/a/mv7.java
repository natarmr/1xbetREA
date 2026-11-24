package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mv7 implements ov7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv7 f22443a;

    public final boolean equals(Object obj) {
        if (obj instanceof mv7) {
            return this.f22443a.equals(((mv7) obj).f22443a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22443a.hashCode();
    }

    public final String toString() {
        return "Content(betsSummaryInfoModel=" + this.f22443a + Separators.RPAREN;
    }
}
