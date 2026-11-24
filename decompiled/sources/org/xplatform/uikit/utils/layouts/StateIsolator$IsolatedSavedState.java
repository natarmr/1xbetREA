package org.xplatform.uikit.utils.layouts;

import a.lgk0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/uikit/utils/layouts/StateIsolator$IsolatedSavedState", "Landroid/view/View$BaseSavedState;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StateIsolator$IsolatedSavedState extends View.BaseSavedState {
    public static final Parcelable.ClassLoaderCreator<StateIsolator$IsolatedSavedState> CREATOR = new lgk0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f47288a;

    public StateIsolator$IsolatedSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        this.f47288a = parcel.readSparseArray(classLoader == null ? StateIsolator$IsolatedSavedState.class.getClassLoader() : classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeSparseArray(this.f47288a);
    }
}
