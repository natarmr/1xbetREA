package org.xplatform.uikit.components.toolbar.base.styles;

import a.imw;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/toolbar/base/styles/NavigationBarSavedState;", "Landroid/view/View$BaseSavedState;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NavigationBarSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<NavigationBarSavedState> CREATOR = new imw((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47280a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f47280a ? 1 : 0);
    }
}
