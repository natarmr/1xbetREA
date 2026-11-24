package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class apf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1249a;

    public /* synthetic */ apf(ArrayList arrayList) {
        this.f1249a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apf) {
            return this.f1249a.equals(((apf) obj).f1249a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1249a.hashCode();
    }

    public final String toString() {
        return hne.o("Players(value=", Separators.RPAREN, this.f1249a);
    }
}
