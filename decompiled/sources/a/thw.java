package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class thw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fdv0 f33980a;

    public thw(fdv0 fdv0Var) {
        this.f33980a = fdv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thw) && this.f33980a.equals(((thw) obj).f33980a);
    }

    public final int hashCode() {
        return this.f33980a.hashCode();
    }

    public final String toString() {
        return "OnWidgetButtonClick(widgetButtonAction=" + this.f33980a + Separators.RPAREN;
    }
}
