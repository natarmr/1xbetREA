package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class lcb0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19791a;
    public final kcb0 b;
    public final hjm c;

    public lcb0(boolean z, kcb0 kcb0Var, hjm hjmVar) {
        this.f19791a = z;
        this.b = kcb0Var;
        this.c = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcb0)) {
            return false;
        }
        lcb0 lcb0Var = (lcb0) obj;
        return this.f19791a == lcb0Var.f19791a && this.b.equals(lcb0Var.b) && this.c.equals(lcb0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b + BundleUtil.UNDERLINE_TAG + this.f19791a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f19791a) * 31)) * 31);
    }

    public final String toString() {
        return "PopularHeaderUiItem(live=" + this.f19791a + ", type=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
