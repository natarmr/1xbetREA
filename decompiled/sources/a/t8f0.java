package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class t8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f33509a;

    public t8f0(SimpleDate simpleDate) {
        this.f33509a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8f0) && this.f33509a.equals(((t8f0) obj).f33509a);
    }

    public final int hashCode() {
        return this.f33509a.hashCode();
    }

    public final String toString() {
        return "OnBirthDateChanged(date=" + this.f33509a + Separators.RPAREN;
    }
}
