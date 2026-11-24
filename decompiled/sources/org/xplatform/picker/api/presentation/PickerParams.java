package org.xplatform.picker.api.presentation;

import a.brm0;
import a.h97;
import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams;", "Landroid/os/Parcelable;", "Phone", "Country", "Region", "City", "Currency", "Citizenship", "Document", "Language", "Gender", "ResidentStatus", "Lorg/xplatform/picker/api/presentation/PickerParams$Citizenship;", "Lorg/xplatform/picker/api/presentation/PickerParams$City;", "Lorg/xplatform/picker/api/presentation/PickerParams$Country;", "Lorg/xplatform/picker/api/presentation/PickerParams$Currency;", "Lorg/xplatform/picker/api/presentation/PickerParams$Document;", "Lorg/xplatform/picker/api/presentation/PickerParams$Gender;", "Lorg/xplatform/picker/api/presentation/PickerParams$Language;", "Lorg/xplatform/picker/api/presentation/PickerParams$Phone;", "Lorg/xplatform/picker/api/presentation/PickerParams$Region;", "Lorg/xplatform/picker/api/presentation/PickerParams$ResidentStatus;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class PickerParams implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Citizenship;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Citizenship extends PickerParams {
        public static final Parcelable.Creator<Citizenship> CREATOR = new l();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46812a;

        public Citizenship(Integer num) {
            this.f46812a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46812a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Citizenship) && Intrinsics.d(this.f46812a, ((Citizenship) obj).f46812a);
        }

        public final int hashCode() {
            Integer num = this.f46812a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46812a, "Citizenship(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46812a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$City;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class City extends PickerParams {
        public static final Parcelable.Creator<City> CREATOR = new m();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46813a;

        public City(Integer num) {
            this.f46813a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46813a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof City) && Intrinsics.d(this.f46813a, ((City) obj).f46813a);
        }

        public final int hashCode() {
            Integer num = this.f46813a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46813a, "City(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46813a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Country;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Country extends PickerParams {
        public static final Parcelable.Creator<Country> CREATOR = new n();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46814a;

        public Country(Integer num) {
            this.f46814a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46814a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Country) && Intrinsics.d(this.f46814a, ((Country) obj).f46814a);
        }

        public final int hashCode() {
            Integer num = this.f46814a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46814a, "Country(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46814a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Currency;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Currency extends PickerParams {
        public static final Parcelable.Creator<Currency> CREATOR = new o();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46815a;

        public Currency(Integer num) {
            this.f46815a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46815a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Currency) && Intrinsics.d(this.f46815a, ((Currency) obj).f46815a);
        }

        public final int hashCode() {
            Integer num = this.f46815a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46815a, "Currency(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46815a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Document;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Document extends PickerParams {
        public static final Parcelable.Creator<Document> CREATOR = new p();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46816a;

        public Document(Integer num) {
            this.f46816a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46816a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Document) && Intrinsics.d(this.f46816a, ((Document) obj).f46816a);
        }

        public final int hashCode() {
            Integer num = this.f46816a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46816a, "Document(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46816a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Gender;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Gender extends PickerParams {
        public static final Parcelable.Creator<Gender> CREATOR = new q();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46817a;

        public Gender(Integer num) {
            this.f46817a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46817a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gender) && Intrinsics.d(this.f46817a, ((Gender) obj).f46817a);
        }

        public final int hashCode() {
            Integer num = this.f46817a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46817a, "Gender(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46817a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Language;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Language extends PickerParams {
        public static final Parcelable.Creator<Language> CREATOR = new r();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46818a;

        public Language(Integer num) {
            this.f46818a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46818a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Language) && Intrinsics.d(this.f46818a, ((Language) obj).f46818a);
        }

        public final int hashCode() {
            Integer num = this.f46818a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46818a, "Language(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46818a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Phone;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Phone extends PickerParams {
        public static final Parcelable.Creator<Phone> CREATOR = new s();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46819a;
        public final boolean b;
        public final boolean c;

        public Phone(Integer num, boolean z, boolean z2) {
            this.f46819a = num;
            this.b = z;
            this.c = z2;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46819a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            return Intrinsics.d(this.f46819a, phone.f46819a) && this.b == phone.b && this.c == phone.c;
        }

        public final int hashCode() {
            Integer num = this.f46819a;
            return Boolean.hashCode(this.c) + brm0.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Phone(selectedId=");
            sb.append(this.f46819a);
            sb.append(", phoneFilterEnable=");
            sb.append(this.b);
            sb.append(", isEnterCodeManuallyEnabled=");
            return rw2.p(sb, this.c, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46819a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$Region;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Region extends PickerParams {
        public static final Parcelable.Creator<Region> CREATOR = new t();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46820a;

        public Region(Integer num) {
            this.f46820a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46820a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Region) && Intrinsics.d(this.f46820a, ((Region) obj).f46820a);
        }

        public final int hashCode() {
            Integer num = this.f46820a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46820a, "Region(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46820a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerParams$ResidentStatus;", "Lorg/xplatform/picker/api/presentation/PickerParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ResidentStatus extends PickerParams {
        public static final Parcelable.Creator<ResidentStatus> CREATOR = new u();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f46821a;

        public ResidentStatus(Integer num) {
            this.f46821a = num;
        }

        @Override // org.xplatform.picker.api.presentation.PickerParams
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final Integer getF46821a() {
            return this.f46821a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResidentStatus) && Intrinsics.d(this.f46821a, ((ResidentStatus) obj).f46821a);
        }

        public final int hashCode() {
            Integer num = this.f46821a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return h97.j(this.f46821a, "ResidentStatus(selectedId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.f46821a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public abstract Integer getF46821a();
}
