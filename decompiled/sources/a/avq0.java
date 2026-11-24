package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class avq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1539a;
    public final String b;

    public avq0(String str, boolean z) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f1539a = z;
        this.b = str;
    }

    @Override // a.bvq0
    public final uwx c() {
        return uwx.f36413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avq0)) {
            return false;
        }
        avq0 avq0Var = (avq0) obj;
        if (this.f1539a != avq0Var.f1539a || !Intrinsics.d(this.b, avq0Var.b)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.bvq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return uwx.f36413a.hashCode() + ua80.b(Boolean.hashCode(this.f1539a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f1539a;
    }

    public final String toString() {
        uwx uwxVar = uwx.f36413a;
        StringBuilder sbQ = axq.q("TestToolsEnabledUiModel(enable=", ", title=", this.b, this.f1539a, ", itemPosition=");
        sbQ.append(uwxVar);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
