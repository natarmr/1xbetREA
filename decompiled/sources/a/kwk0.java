package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class kwk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19006a;
    public final ArrayList b;

    public kwk0(int i, ArrayList arrayList) {
        this.f19006a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwk0)) {
            return false;
        }
        kwk0 kwk0Var = (kwk0) obj;
        return this.f19006a == kwk0Var.f19006a && this.b.equals(kwk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f19006a) * 31);
    }

    public final String toString() {
        return "SpecialEventTabsContentUiModel(selectedTabIndex=" + this.f19006a + ", tabs=" + this.b + Separators.RPAREN;
    }
}
