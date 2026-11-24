package a;

import android.gov.nist.core.Separators;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class pzz implements yzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitNeGroupEnum f27867a;

    public final boolean equals(Object obj) {
        if (obj instanceof pzz) {
            return this.f27867a == ((pzz) obj).f27867a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27867a.hashCode();
    }

    public final String toString() {
        return "OnAcceptLimitsClick(limitsGroup=" + this.f27867a + Separators.RPAREN;
    }
}
