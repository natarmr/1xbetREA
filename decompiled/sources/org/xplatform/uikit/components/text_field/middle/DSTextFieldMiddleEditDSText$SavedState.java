package org.xplatform.uikit.components.text_field.middle;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/uikit/components/text_field/middle/DSTextFieldMiddleEditDSText$SavedState", "Landroid/view/View$BaseSavedState;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class DSTextFieldMiddleEditDSText$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<DSTextFieldMiddleEditDSText$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f47277a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSTextFieldMiddleEditDSText$SavedState(Parcelable parcelable, String str) {
        super(parcelable);
        str.getClass();
        this.f47277a = parcelable;
        this.b = str;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47277a, i);
        parcel.writeString(this.b);
    }
}
