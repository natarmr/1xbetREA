package org.xplatform.security.api.presentation.models;

import a.brm0;
import a.qo7;
import a.rz4;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.navigation.EndFlowNavigation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BindEmailScreenParams implements Parcelable {
    public static final Parcelable.Creator<BindEmailScreenParams> CREATOR = new qo7((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EndFlowNavigation f46928a;
    public final boolean b;
    public final int c;

    public BindEmailScreenParams(EndFlowNavigation endFlowNavigation, boolean z, int i) {
        endFlowNavigation.getClass();
        this.f46928a = endFlowNavigation;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindEmailScreenParams)) {
            return false;
        }
        BindEmailScreenParams bindEmailScreenParams = (BindEmailScreenParams) obj;
        return Intrinsics.d(this.f46928a, bindEmailScreenParams.f46928a) && this.b == bindEmailScreenParams.b && this.c == bindEmailScreenParams.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f46928a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BindEmailScreenParams(onFlowSuccessNavigateTo=");
        sb.append(this.f46928a);
        sb.append(", showExtraInfo=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46928a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
    }
}
