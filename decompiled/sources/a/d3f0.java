package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class d3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f5401a;

    public d3f0(SimpleDate simpleDate) {
        this.f5401a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3f0) && this.f5401a.equals(((d3f0) obj).f5401a);
    }

    public final int hashCode() {
        return this.f5401a.hashCode();
    }

    public final String toString() {
        return "OnPassportDateExpireChanged(date=" + this.f5401a + Separators.RPAREN;
    }
}
