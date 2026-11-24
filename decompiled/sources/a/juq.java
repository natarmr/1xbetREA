package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class juq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17169a;
    public final dwb b;

    public juq(String str, dwb dwbVar) {
        str.getClass();
        this.f17169a = str;
        this.b = dwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juq)) {
            return false;
        }
        juq juqVar = (juq) obj;
        return Intrinsics.d(this.f17169a, juqVar.f17169a) && this.b.equals(juqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17169a.hashCode() * 31);
    }

    public final String toString() {
        return "ForecastModel(titleText=" + this.f17169a + ", forecastLevel=" + this.b + Separators.RPAREN;
    }
}
