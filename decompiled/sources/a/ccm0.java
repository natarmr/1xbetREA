package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ccm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4119a;
    public final ArrayList b;

    public ccm0(String str, ArrayList arrayList) {
        this.f4119a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccm0)) {
            return false;
        }
        ccm0 ccm0Var = (ccm0) obj;
        return this.f4119a.equals(ccm0Var.f4119a) && this.b.equals(ccm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4119a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSubMenuDialog(title=" + this.f4119a + ", subMenuItemList=" + this.b + Separators.RPAREN;
    }
}
