package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u170 implements y170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f34890a;

    public u170(ArrayList arrayList) {
        this.f34890a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u170) && this.f34890a.equals(((u170) obj).f34890a);
    }

    public final int hashCode() {
        return this.f34890a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f34890a);
    }
}
