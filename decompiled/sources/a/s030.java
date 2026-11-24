package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class s030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31394a;

    public s030(ArrayList arrayList) {
        this.f31394a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s030) && this.f31394a.equals(((s030) obj).f31394a);
    }

    public final int hashCode() {
        return this.f31394a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateEvents(events=", Separators.RPAREN, this.f31394a);
    }
}
