package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class l6c implements m6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19500a;
    public final boolean b;

    public l6c(String str, boolean z) {
        j6c j6cVar = j6c.f15977a;
        str.getClass();
        this.f19500a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6c)) {
            return false;
        }
        l6c l6cVar = (l6c) obj;
        if (!Intrinsics.d(this.f19500a, l6cVar.f19500a)) {
            return false;
        }
        j6c j6cVar = j6c.f15977a;
        return this.b == l6cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((j6c.f15977a.hashCode() + twn.a(R.style.DSButton_Large_Secondary, this.f19500a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        j6c j6cVar = j6c.f15977a;
        StringBuilder sbP = kng0.p(R.style.DSButton_Large_Secondary, "Visible(title=", this.f19500a, ", style=", ", action=");
        sbP.append(j6cVar);
        sbP.append(", enable=");
        sbP.append(this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
