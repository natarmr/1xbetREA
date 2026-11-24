package org.xplatform.cyber.section.api.presentation.rules;

import a.axq;
import a.brm0;
import a.equ0;
import a.f140;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VirtualSportRulesParams implements Parcelable {
    public static final Parcelable.Creator<VirtualSportRulesParams> CREATOR = new equ0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46567a;
    public final String b;
    public final String c;
    public final String d;

    public VirtualSportRulesParams(long j, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f46567a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualSportRulesParams)) {
            return false;
        }
        VirtualSportRulesParams virtualSportRulesParams = (VirtualSportRulesParams) obj;
        return this.f46567a == virtualSportRulesParams.f46567a && Intrinsics.d(this.b, virtualSportRulesParams.b) && Intrinsics.d(this.c, virtualSportRulesParams.c) && Intrinsics.d(this.d, virtualSportRulesParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f46567a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46567a, "VirtualSportRulesParams(sportId=", ", disciplineName=", this.b);
        f140.v(sbO, ", champName=", this.c, ", rulesKey=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46567a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
