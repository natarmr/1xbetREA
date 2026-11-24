package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wxl0 implements xxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39938a;
    public final rwl0 b;

    public wxl0(String str, rwl0 rwl0Var) {
        str.getClass();
        this.f39938a = str;
        this.b = rwl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxl0)) {
            return false;
        }
        wxl0 wxl0Var = (wxl0) obj;
        return Intrinsics.d(this.f39938a, wxl0Var.f39938a) && this.b.equals(wxl0Var.b);
    }

    @Override // a.xxl0
    public final String getTitle() {
        return this.f39938a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39938a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(title=" + this.f39938a + ", stadiumInfoUiModel=" + this.b + Separators.RPAREN;
    }
}
