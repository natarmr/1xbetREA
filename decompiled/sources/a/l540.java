package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l540 implements m540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19437a;

    public l540(ArrayList arrayList) {
        this.f19437a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l540) && this.f19437a.equals(((l540) obj).f19437a);
    }

    public final int hashCode() {
        return this.f19437a.hashCode();
    }

    public final String toString() {
        return hne.o("LeaveParticipants(users=", Separators.RPAREN, this.f19437a);
    }
}
