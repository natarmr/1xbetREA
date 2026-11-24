package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zan implements bbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f44078a;
    public final String b;
    public final String c;
    public final ue9 d;

    public zan(i4 i4Var, String str, String str2, ue9 ue9Var) {
        i4Var.getClass();
        this.f44078a = i4Var;
        this.b = str;
        this.c = str2;
        this.d = ue9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zan)) {
            return false;
        }
        zan zanVar = (zan) obj;
        return Intrinsics.d(this.f44078a, zanVar.f44078a) && Intrinsics.d(this.b, zanVar.b) && this.c.equals(zanVar.c) && this.d.equals(zanVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f44078a.hashCode() * 31;
        String str = this.b;
        return brm0.e(ua80.b(ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d.f35513a), 961, false);
    }

    public final String toString() {
        return "Content(cardModelList=" + this.f44078a + ", dsHeaderLabel=" + this.b + ", dsHeaderTag=" + this.c + ", dsHeaderButtonStyle=" + this.d + ", dsShowBadge=false, dsHeaderIcon=null, dsCounterValue=null)";
    }
}
