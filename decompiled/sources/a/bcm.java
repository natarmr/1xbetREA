package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class bcm implements dcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f2360a;
    public final SimpleDate b;
    public final String c;

    public bcm(SimpleDate simpleDate, SimpleDate simpleDate2, String str) {
        this.f2360a = simpleDate;
        this.b = simpleDate2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcm)) {
            return false;
        }
        bcm bcmVar = (bcm) obj;
        return this.f2360a.equals(bcmVar.f2360a) && this.b.equals(bcmVar.b) && this.c.equals(bcmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2360a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(startDate=");
        sb.append(this.f2360a);
        sb.append(", endDate=");
        sb.append(this.b);
        sb.append(", datePattern=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
