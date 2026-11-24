package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4143a;
    public final List b;

    public cd30(String str, List list) {
        list.getClass();
        this.f4143a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd30)) {
            return false;
        }
        cd30 cd30Var = (cd30) obj;
        return this.f4143a.equals(cd30Var.f4143a) && Intrinsics.d(this.b, cd30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4143a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("MatchProgressModel(title=", this.f4143a, ", pointByPoints=", this.b, Separators.RPAREN);
    }
}
