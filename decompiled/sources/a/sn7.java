package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sn7 implements tn7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f32479a;

    public sn7(i4 i4Var) {
        i4Var.getClass();
        this.f32479a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn7) && Intrinsics.d(this.f32479a, ((sn7) obj).f32479a);
    }

    public final int hashCode() {
        return this.f32479a.hashCode();
    }

    public final String toString() {
        return "Success(labelValueRowUiModelList=" + this.f32479a + Separators.RPAREN;
    }
}
