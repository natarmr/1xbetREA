package org.xplatform.personal.impl.presentation.edit_tj.models;

import a.u0c0;
import a.w5q0;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5q0 f46799a;
    public final ProfileEditTjUiModel.ProfileEditItemTjUiModel b;

    public b(w5q0 w5q0Var, ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel) {
        profileEditItemTjUiModel.getClass();
        this.f46799a = w5q0Var;
        this.b = profileEditItemTjUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f46799a.equals(bVar.f46799a) && Intrinsics.d(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46799a.f38596a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTextFieldValueChanged(action=" + this.f46799a + ", item=" + this.b + Separators.RPAREN;
    }
}
