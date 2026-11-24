package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class gve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f11971a;

    public gve0(SimpleDate simpleDate) {
        this.f11971a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gve0) && this.f11971a.equals(((gve0) obj).f11971a);
    }

    public final int hashCode() {
        return this.f11971a.hashCode();
    }

    public final String toString() {
        return "OnBirthDateChanged(date=" + this.f11971a + Separators.RPAREN;
    }
}
