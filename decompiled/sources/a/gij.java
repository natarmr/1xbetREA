package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gij implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11349a;
    public final ArrayList b;

    public gij(ArrayList arrayList, boolean z) {
        this.f11349a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gij)) {
            return false;
        }
        gij gijVar = (gij) obj;
        return this.f11349a == gijVar.f11349a && this.b.equals(gijVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return sre0.f32672a.b(gij.class).v() + BundleUtil.UNDERLINE_TAG + this.f11349a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f11349a) * 31);
    }

    public final String toString() {
        return "DayExpressUiItem(live=" + this.f11349a + ", expressEventUiModelList=" + this.b + Separators.RPAREN;
    }
}
