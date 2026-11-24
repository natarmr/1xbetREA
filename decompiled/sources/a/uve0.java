package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class uve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f36346a;

    public uve0(SimpleDate simpleDate) {
        this.f36346a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uve0) && this.f36346a.equals(((uve0) obj).f36346a);
    }

    public final int hashCode() {
        return this.f36346a.hashCode();
    }

    public final String toString() {
        return "OnPassportDateIssueChanged(date=" + this.f36346a + Separators.RPAREN;
    }
}
