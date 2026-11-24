package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zzm0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1n0 f45263a;

    public zzm0(e1n0 e1n0Var) {
        this.f45263a = e1n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzm0) && this.f45263a.equals(((zzm0) obj).f45263a);
    }

    public final int hashCode() {
        return this.f45263a.hashCode();
    }

    public final String toString() {
        return "OnTextFieldItemClick(subSectionTextFieldItem=" + this.f45263a + Separators.RPAREN;
    }
}
