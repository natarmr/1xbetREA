package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ljp0 implements njp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20164a;

    public ljp0(ArrayList arrayList) {
        this.f20164a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljp0) && this.f20164a.equals(((ljp0) obj).f20164a);
    }

    public final int hashCode() {
        return this.f20164a.hashCode();
    }

    public final String toString() {
        return hne.o("Config(data=", Separators.RPAREN, this.f20164a);
    }
}
