package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class jcm implements lcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f16284a;

    public jcm(SimpleDate simpleDate) {
        this.f16284a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcm) && this.f16284a.equals(((jcm) obj).f16284a);
    }

    public final int hashCode() {
        return this.f16284a.hashCode();
    }

    public final String toString() {
        return "Date(date=" + this.f16284a + Separators.RPAREN;
    }
}
