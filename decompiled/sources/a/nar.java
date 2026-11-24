package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23203a;

    public nar(ArrayList arrayList) {
        this.f23203a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nar) && this.f23203a.equals(((nar) obj).f23203a);
    }

    public final int hashCode() {
        return this.f23203a.hashCode();
    }

    public final String toString() {
        return hne.o("FullDescriptionModel(description=", Separators.RPAREN, this.f23203a);
    }
}
