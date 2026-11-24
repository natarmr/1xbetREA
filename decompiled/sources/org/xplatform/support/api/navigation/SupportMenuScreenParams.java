package org.xplatform.support.api.navigation;

import a.axq;
import a.pjn0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;", "Landroid/os/Parcelable;", "AdditionalParams", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SupportMenuScreenParams implements Parcelable {
    public static final Parcelable.Creator<SupportMenuScreenParams> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47110a;
    public final pjn0 b;
    public final AdditionalParams c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;", "Landroid/os/Parcelable;", "None", "CallbackParams", "Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$CallbackParams;", "Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface AdditionalParams extends Parcelable {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$CallbackParams;", "Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class CallbackParams implements AdditionalParams {
            public static final Parcelable.Creator<CallbackParams> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f47111a;

            public CallbackParams(long j) {
                this.f47111a = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CallbackParams) && this.f47111a == ((CallbackParams) obj).f47111a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f47111a);
            }

            public final String toString() {
                return axq.h(this.f47111a, "CallbackParams(callbackAnimatedItemId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.f47111a);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;", "Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class None implements AdditionalParams {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final None f47112a = new None();
            public static final Parcelable.Creator<None> CREATOR = new b();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return 1091976849;
            }

            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public SupportMenuScreenParams(boolean z, pjn0 pjn0Var, AdditionalParams additionalParams) {
        pjn0Var.getClass();
        additionalParams.getClass();
        this.f47110a = z;
        this.b = pjn0Var;
        this.c = additionalParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportMenuScreenParams)) {
            return false;
        }
        SupportMenuScreenParams supportMenuScreenParams = (SupportMenuScreenParams) obj;
        return this.f47110a == supportMenuScreenParams.f47110a && this.b == supportMenuScreenParams.b && Intrinsics.d(this.c, supportMenuScreenParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f47110a) * 31)) * 31);
    }

    public final String toString() {
        return "SupportMenuScreenParams(showNavBar=" + this.f47110a + ", navigationPathType=" + this.b + ", additionalParams=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f47110a ? 1 : 0);
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
    }
}
