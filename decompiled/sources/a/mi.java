package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mi implements fw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iui0 f21821a;

    public mi(iui0 iui0Var) {
        this.f21821a = iui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi) && this.f21821a == ((mi) obj).f21821a;
    }

    public final int hashCode() {
        return this.f21821a.hashCode();
    }

    public final String toString() {
        return "ActionMarketSettingUiModel(settingActionType=" + this.f21821a + Separators.RPAREN;
    }
}
