package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y6a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42087a;
    public final ArrayList b;

    public y6a(String str, ArrayList arrayList) {
        this.f42087a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6a)) {
            return false;
        }
        y6a y6aVar = (y6a) obj;
        return this.f42087a.equals(y6aVar.f42087a) && this.b.equals(y6aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42087a.hashCode() * 31);
    }

    public final String toString() {
        return "CaptchaRequired(id=" + this.f42087a + ", tasks=" + this.b + Separators.RPAREN;
    }
}
