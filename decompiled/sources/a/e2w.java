package a;

import android.gov.nist.core.Separators;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class e2w implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiText.ByIntRes f7106a;
    public final UiText.ByString b;

    public e2w(UiText.ByIntRes byIntRes, UiText.ByString byString) {
        this.f7106a = byIntRes;
        this.b = byString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2w)) {
            return false;
        }
        e2w e2wVar = (e2w) obj;
        return this.f7106a.equals(e2wVar.f7106a) && this.b.equals(e2wVar.b);
    }

    public final int hashCode() {
        return this.b.f47189a.hashCode() + (this.f7106a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryHeaderAdapterItem(betCountText=" + this.f7106a + ", betCountSumText=" + this.b + Separators.RPAREN;
    }
}
