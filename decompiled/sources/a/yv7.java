package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yv7 implements zv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43307a;
    public final boolean b;

    public yv7(ArrayList arrayList, boolean z) {
        this.f43307a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv7)) {
            return false;
        }
        yv7 yv7Var = (yv7) obj;
        return this.f43307a.equals(yv7Var.f43307a) && this.b == yv7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f43307a.hashCode() * 31);
    }

    public final String toString() {
        return "Update(data=" + this.f43307a + ", showRelatedGames=" + this.b + Separators.RPAREN;
    }
}
