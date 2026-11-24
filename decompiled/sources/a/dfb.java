package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5992a;
    public final List b;

    public dfb(String str, List list) {
        this.f5992a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfb)) {
            return false;
        }
        dfb dfbVar = (dfb) obj;
        return this.f5992a.equals(dfbVar.f5992a) && this.b.equals(dfbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5992a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("GroupModel(title=", this.f5992a, ", opponents=", this.b, Separators.RPAREN);
    }
}
