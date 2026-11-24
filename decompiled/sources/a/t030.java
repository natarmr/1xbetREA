package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9s f33099a;

    public t030(l9s l9sVar) {
        l9sVar.getClass();
        this.f33099a = l9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t030) && Intrinsics.d(this.f33099a, ((t030) obj).f33099a);
    }

    public final int hashCode() {
        return this.f33099a.hashCode();
    }

    public final String toString() {
        return "UpdateGameDetailsModel(model=" + this.f33099a + Separators.RPAREN;
    }
}
