package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aen0 implements den0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aan0 f738a;

    public aen0(aan0 aan0Var) {
        this.f738a = aan0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aen0) && this.f738a.equals(((aen0) obj).f738a);
    }

    public final int hashCode() {
        return this.f738a.hashCode();
    }

    public final String toString() {
        return "OnNotificationIconClicked(model=" + this.f738a + Separators.RPAREN;
    }
}
