package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c6p implements f6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3828a;

    public c6p(ArrayList arrayList) {
        this.f3828a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6p) && this.f3828a.equals(((c6p) obj).f3828a);
    }

    public final int hashCode() {
        return this.f3828a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f3828a);
    }
}
