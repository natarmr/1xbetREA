package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l4a0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19394a;

    public /* synthetic */ l4a0(ArrayList arrayList) {
        this.f19394a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l4a0) {
            return this.f19394a.equals(((l4a0) obj).f19394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19394a.hashCode();
    }

    public final String toString() {
        return hne.o("Kills(value=", Separators.RPAREN, this.f19394a);
    }
}
