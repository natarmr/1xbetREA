package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vwv implements gy20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38172a;
    public final String b;

    public vwv(String str, String str2) {
        str2.getClass();
        this.f38172a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwv)) {
            return false;
        }
        vwv vwvVar = (vwv) obj;
        return this.f38172a.equals(vwvVar.f38172a) && Intrinsics.d(this.b, vwvVar.b);
    }

    @Override // a.gy20
    public final String getKey() {
        return this.f38172a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38172a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HiddenGroupsUiModel(key=", this.f38172a, ", title=", this.b, Separators.RPAREN);
    }
}
