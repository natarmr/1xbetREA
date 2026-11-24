package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k540 implements m540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17701a;

    public k540(ArrayList arrayList) {
        this.f17701a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k540) && this.f17701a.equals(((k540) obj).f17701a);
    }

    public final int hashCode() {
        return this.f17701a.hashCode();
    }

    public final String toString() {
        return hne.o("AddNewParticipants(users=", Separators.RPAREN, this.f17701a);
    }
}
