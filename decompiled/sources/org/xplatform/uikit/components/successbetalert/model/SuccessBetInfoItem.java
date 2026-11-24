package org.xplatform.uikit.components.successbetalert.model;

import a.b1j;
import a.brm0;
import a.kng0;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;", "Landroid/os/Parcelable;", "Simple", "WithCurrency", "Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;", "Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;", "uikit", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface SuccessBetInfoItem extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;", "Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Simple implements SuccessBetInfoItem {
        public static final Parcelable.Creator<Simple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47265a;
        public final String b;

        public Simple(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f47265a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) obj;
            return Intrinsics.d(this.f47265a, simple.f47265a) && Intrinsics.d(this.b, simple.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f47265a.hashCode() * 31);
        }

        public final String toString() {
            return b1j.k("Simple(name=", this.f47265a, ", betValue=", this.b, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47265a);
            parcel.writeString(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;", "Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class WithCurrency implements SuccessBetInfoItem {
        public static final Parcelable.Creator<WithCurrency> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47266a;
        public final String b;
        public final int c;
        public final String d;
        public final boolean e;

        public WithCurrency(int i, String str, String str2, String str3, boolean z) {
            brm0.B(str, str2, str3);
            this.f47266a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithCurrency)) {
                return false;
            }
            WithCurrency withCurrency = (WithCurrency) obj;
            return Intrinsics.d(this.f47266a, withCurrency.f47266a) && Intrinsics.d(this.b, withCurrency.b) && this.c == withCurrency.c && Intrinsics.d(this.d, withCurrency.d) && this.e == withCurrency.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, ua80.b(this.f47266a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbN = b1j.n("WithCurrency(name=", this.f47266a, ", betSum=", this.b, ", color=");
            kng0.w(this.c, ", currency=", this.d, ", showInSnackbar=", sbN);
            return rw2.p(sbN, this.e, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47266a);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }
}
