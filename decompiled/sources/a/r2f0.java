package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class r2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f29731a;

    public r2f0(SimpleDate simpleDate) {
        this.f29731a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2f0) && this.f29731a.equals(((r2f0) obj).f29731a);
    }

    public final int hashCode() {
        return this.f29731a.hashCode();
    }

    public final String toString() {
        return "OnBirthDateChanged(date=" + this.f29731a + Separators.RPAREN;
    }
}
