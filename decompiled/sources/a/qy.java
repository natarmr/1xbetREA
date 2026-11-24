package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29510a;
    public final wui0 b;

    public qy(String str, wui0 wui0Var) {
        str.getClass();
        this.f29510a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return Intrinsics.d(this.f29510a, qyVar.f29510a) && this.b == qyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29510a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f29510a + ", position=" + this.b + Separators.RPAREN;
    }
}
