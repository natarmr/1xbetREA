package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class mnh implements onh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f22087a;
    public final SimpleDate b;

    public mnh(SimpleDate simpleDate, SimpleDate simpleDate2) {
        this.f22087a = simpleDate;
        this.b = simpleDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnh)) {
            return false;
        }
        mnh mnhVar = (mnh) obj;
        return this.f22087a.equals(mnhVar.f22087a) && this.b.equals(mnhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22087a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(startDate=" + this.f22087a + ", endDate=" + this.b + Separators.RPAREN;
    }
}
