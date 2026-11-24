package org.xplatform.personal.impl.presentation.edit_tj.models;

import a.u0c0;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel f46798a;

    public a(ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel) {
        profileEditItemClickableTjUiModel.getClass();
        this.f46798a = profileEditItemClickableTjUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f46798a, ((a) obj).f46798a);
    }

    public final int hashCode() {
        return this.f46798a.hashCode();
    }

    public final String toString() {
        return "OnTextFieldClicked(item=" + this.f46798a + Separators.RPAREN;
    }
}
