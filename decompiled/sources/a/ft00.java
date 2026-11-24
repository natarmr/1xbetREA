package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ft00 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut00 f10088a;
    public final String b;

    public ft00(ut00 ut00Var, String str) {
        this.f10088a = ut00Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft00)) {
            return false;
        }
        ft00 ft00Var = (ft00) obj;
        return this.f10088a.equals(ft00Var.f10088a) && this.b.equals(ft00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10088a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationChoiceScreenParams(locationType=" + this.f10088a + ", requestKey=" + this.b + Separators.RPAREN;
    }
}
