package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class f9u0 implements h9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9173a;

    public f9u0(ArrayList arrayList) {
        this.f9173a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9u0) && this.f9173a.equals(((f9u0) obj).f9173a);
    }

    public final int hashCode() {
        return this.f9173a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowContent(content=", Separators.RPAREN, this.f9173a);
    }
}
