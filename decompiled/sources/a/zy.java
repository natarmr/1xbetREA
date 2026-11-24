package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zy implements az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f45182a;
    public final boolean b;

    public zy(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f45182a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return Intrinsics.d(this.f45182a, zyVar.f45182a) && this.b == zyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f45182a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(additionalCardUiModelList=" + this.f45182a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
