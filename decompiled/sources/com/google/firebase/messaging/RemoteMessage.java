package com.google.firebase.messaging;

import a.gx3;
import a.q5x;
import a.sne0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new sne0((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f45666a;
    public gx3 b;

    public RemoteMessage(Bundle bundle) {
        this.f45666a = bundle;
    }

    public final HashMap m() {
        if (this.b == null) {
            gx3 gx3Var = new gx3(0);
            Bundle bundle = this.f45666a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(RemoteMessageConst.FROM) && !str.equals(RemoteMessageConst.MSGTYPE) && !str.equals("collapse_key")) {
                        gx3Var.put(str, str2);
                    }
                }
            }
            this.b = gx3Var;
        }
        return new HashMap(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.d0(parcel, 2, this.f45666a);
        q5x.q0(parcel, iP0);
    }
}
