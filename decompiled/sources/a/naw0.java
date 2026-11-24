package a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class naw0 extends f9w0 {
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw0(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 0);
        this.b = taskCompletionSource;
    }

    @Override // a.f9w0
    public final boolean D(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) o9w0.a(parcel, Status.CREATOR);
        o9w0.b(parcel);
        dqm0.y(status, null, this.b);
        return true;
    }
}
