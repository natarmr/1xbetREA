package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n9e implements p9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23135a;

    public n9e(ArrayList arrayList) {
        this.f23135a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9e) && this.f23135a.equals(((n9e) obj).f23135a);
    }

    public final int hashCode() {
        return this.f23135a.hashCode();
    }

    public final String toString() {
        return hne.o("LoadCompleted(items=", Separators.RPAREN, this.f23135a);
    }
}
