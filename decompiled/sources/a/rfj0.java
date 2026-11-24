package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rfj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30391a;
    public final zsv b;
    public final boolean c;
    public final a4x d;

    public rfj0(boolean z, zsv zsvVar, boolean z2, a4x a4xVar) {
        a4xVar.getClass();
        this.f30391a = z;
        this.b = zsvVar;
        this.c = z2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfj0)) {
            return false;
        }
        rfj0 rfj0Var = (rfj0) obj;
        return this.f30391a == rfj0Var.f30391a && this.b.equals(rfj0Var.b) && this.c == rfj0Var.c && Intrinsics.d(this.d, rfj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f30391a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "SettingsWidgetsUiState(showLoader=" + this.f30391a + ", headerState=" + this.b + ", lastConnection=" + this.c + ", settingsUiModelList=" + this.d + Separators.RPAREN;
    }
}
