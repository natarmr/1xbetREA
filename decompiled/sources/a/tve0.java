package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class tve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f34596a;

    public tve0(SimpleDate simpleDate) {
        this.f34596a = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tve0) && this.f34596a.equals(((tve0) obj).f34596a);
    }

    public final int hashCode() {
        return this.f34596a.hashCode();
    }

    public final String toString() {
        return "OnPassportDateExpireChanged(date=" + this.f34596a + Separators.RPAREN;
    }
}
