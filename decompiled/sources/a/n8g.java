package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n8g implements o8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5g f23085a;
    public final ArrayList b;

    public n8g(x5g x5gVar, ArrayList arrayList) {
        this.f23085a = x5gVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8g)) {
            return false;
        }
        n8g n8gVar = (n8g) obj;
        return this.f23085a.equals(n8gVar.f23085a) && this.b.equals(n8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23085a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultState(dayOfWeekViewParams=" + this.f23085a + ", weeksState=" + this.b + Separators.RPAREN;
    }
}
