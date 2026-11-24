package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wj8 implements xj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39249a;
    public final ArrayList b;

    public wj8(ArrayList arrayList, boolean z) {
        this.f39249a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj8)) {
            return false;
        }
        wj8 wj8Var = (wj8) obj;
        return this.f39249a == wj8Var.f39249a && this.b.equals(wj8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f39249a) * 31);
    }

    public final String toString() {
        return "ShowBonusesInfo(showBio=" + this.f39249a + ", list=" + this.b + Separators.RPAREN;
    }
}
