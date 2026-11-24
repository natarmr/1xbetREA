package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class swa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qwa0 f32913a;
    public final String b;

    public swa0(qwa0 qwa0Var, String str) {
        str.getClass();
        this.f32913a = qwa0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swa0)) {
            return false;
        }
        swa0 swa0Var = (swa0) obj;
        return this.f32913a.equals(swa0Var.f32913a) && Intrinsics.d(this.b, swa0Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f32913a.hashCode() * 31)) * 31) + 1659520583;
    }

    public final String toString() {
        return "PopUpBonusState(popUpBonusModel=" + this.f32913a + ", service=" + this.b + ", bannerImageUrl=/static/img/android/casino/bonus_message/Onboard.webp)";
    }
}
