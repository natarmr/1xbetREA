package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45376a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f45376a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f45373a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.e = null;
                fragmentManagerState.f = new ArrayList();
                fragmentManagerState.g = new ArrayList();
                fragmentManagerState.f45374a = parcel.createStringArrayList();
                fragmentManagerState.b = parcel.createStringArrayList();
                fragmentManagerState.c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.d = parcel.readInt();
                fragmentManagerState.e = parcel.readString();
                fragmentManagerState.f = parcel.createStringArrayList();
                fragmentManagerState.g = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f45376a) {
            case 0:
                return new BackStackRecordState[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            default:
                return new FragmentState[i];
        }
    }
}
