package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lvu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kwf0 f20731a;
    public final String b;

    public lvu0(kwf0 kwf0Var, String str) {
        str.getClass();
        this.f20731a = kwf0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvu0)) {
            return false;
        }
        lvu0 lvu0Var = (lvu0) obj;
        return this.f20731a.equals(lvu0Var.f20731a) && Intrinsics.d(this.b, lvu0Var.b);
    }

    public final int hashCode() {
        return ua80.b(this.f20731a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WSSettingsContainer(settingFromRest=" + this.f20731a + ", baseUrl=" + this.b + ", port=)";
    }
}
