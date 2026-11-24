package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29909a;

    public final boolean equals(Object obj) {
        if (obj instanceof r5x) {
            return this.f29909a.equals(((r5x) obj).f29909a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29909a.hashCode();
    }

    public final String toString() {
        return hne.o("FirstPlayerCards(value=", Separators.RPAREN, this.f29909a);
    }
}
