package androidx.customview.view;

import a.jf4;
import a.lgk0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f45367a;
    public static final AbsSavedState b = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new lgk0(1);

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f45367a = parcelable == b ? null : parcelable;
        } else {
            jf4.o("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f45367a, i);
    }

    public AbsSavedState() {
        this.f45367a = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f45367a = parcelable == null ? b : parcelable;
    }
}
