package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class d9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5703a;

    public final boolean equals(Object obj) {
        if (obj instanceof d9j) {
            return this.f5703a.equals(((d9j) obj).f5703a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5703a.hashCode();
    }

    public final String toString() {
        return hne.o("SecondPlayerThrows(value=", Separators.RPAREN, this.f5703a);
    }
}
