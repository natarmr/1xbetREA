package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class m7c0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21313a;

    public final boolean equals(Object obj) {
        if (obj instanceof m7c0) {
            return this.f21313a.equals(((m7c0) obj).f21313a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21313a.hashCode();
    }

    public final String toString() {
        return hne.o("GameList(value=", Separators.RPAREN, this.f21313a);
    }
}
