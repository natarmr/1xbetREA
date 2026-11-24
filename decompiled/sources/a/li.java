package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class li implements ew20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hui0 f20081a;

    public li(hui0 hui0Var) {
        this.f20081a = hui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li) && this.f20081a == ((li) obj).f20081a;
    }

    public final int hashCode() {
        return this.f20081a.hashCode();
    }

    public final String toString() {
        return "ActionMarketSettingUiModel(settingActionType=" + this.f20081a + Separators.RPAREN;
    }
}
