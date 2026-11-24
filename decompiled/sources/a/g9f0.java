package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class g9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f10912a;

    public g9f0(SimpleDate simpleDate) {
        this.f10912a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9f0) && this.f10912a.equals(((g9f0) obj).f10912a);
    }

    public final int hashCode() {
        return this.f10912a.hashCode();
    }

    public final String toString() {
        return "OnPassportDateExpireChanged(date=" + this.f10912a + Separators.RPAREN;
    }
}
