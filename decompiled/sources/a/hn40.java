package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13333a;

    public hn40(ArrayList arrayList) {
        this.f13333a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn40) && this.f13333a.equals(((hn40) obj).f13333a);
    }

    public final int hashCode() {
        return this.f13333a.hashCode();
    }

    public final String toString() {
        return hne.o("ModuleInfoState(modules=", Separators.RPAREN, this.f13333a);
    }
}
