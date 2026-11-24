package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zuq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45020a;
    public final String b;

    public zuq0(String str, boolean z) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f45020a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuq0)) {
            return false;
        }
        zuq0 zuq0Var = (zuq0) obj;
        if (this.f45020a != zuq0Var.f45020a || !Intrinsics.d(this.b, zuq0Var.b)) {
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
        return uwx.f36413a.hashCode() + ua80.b(Boolean.hashCode(this.f45020a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f45020a;
    }

    public final String toString() {
        uwx uwxVar = uwx.f36413a;
        StringBuilder sbQ = axq.q("TestRemoteConfigEnabledUiModel(enable=", ", title=", this.b, this.f45020a, ", itemPosition=");
        sbQ.append(uwxVar);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
