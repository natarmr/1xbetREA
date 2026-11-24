package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class mpf0 implements rpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22178a;
    public final boolean b;

    public mpf0(ArrayList arrayList, boolean z) {
        this.f22178a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpf0)) {
            return false;
        }
        mpf0 mpf0Var = (mpf0) obj;
        return this.f22178a.equals(mpf0Var.f22178a) && this.b == mpf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22178a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplySafesAndReplaceWithDoors(safes=" + this.f22178a + ", useSmoke=" + this.b + Separators.RPAREN;
    }
}
