package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class tk90 extends vk90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34084a;
    public final ArrayList b;

    public tk90(int i, ArrayList arrayList) {
        this.f34084a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk90)) {
            return false;
        }
        tk90 tk90Var = (tk90) obj;
        return this.f34084a == tk90Var.f34084a && this.b.equals(tk90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f34084a) * 31);
    }

    public final String toString() {
        return "Data(sportId=" + this.f34084a + ", statistic=" + this.b + Separators.RPAREN;
    }
}
