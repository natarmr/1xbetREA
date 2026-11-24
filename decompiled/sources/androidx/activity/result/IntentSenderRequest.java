package androidx.activity.result;

import a.imw;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new imw((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f45281a;
    public final Intent b;
    public final int c;
    public final int d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.f45281a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f45281a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
