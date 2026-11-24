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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams;", "Landroid/os/Parcelable;", "PickerType", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PickerDialogParams implements Parcelable {
    public static final Parcelable.Creator<PickerDialogParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerType f46801a;
    public final AnalyticsEntryPoint b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "Landroid/os/Parcelable;", "Phone", "Country", "Region", "City", "Currency", "Citizenship", "Document", "Language", "Gender", "ResidentStatus", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Citizenship;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$City;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Country;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Currency;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Document;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Gender;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Language;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Region;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$ResidentStatus;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface PickerType extends Parcelable {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Citizenship;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Citizenship implements PickerType {
            public static final Parcelable.Creator<Citizenship> CREATOR = new b();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46802a;

            public Citizenship(Integer num) {
                this.f46802a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46802a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Citizenship) && Intrinsics.d(this.f46802a, ((Citizenship) obj).f46802a);
            }

            public final int hashCode() {
                Integer num = this.f46802a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46802a, "Citizenship(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46802a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$City;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class City implements PickerType {
            public static final Parcelable.Creator<City> CREATOR = new c();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46803a;

            public City(Integer num) {
                this.f46803a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46803a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof City) && Intrinsics.d(this.f46803a, ((City) obj).f46803a);
            }

            public final int hashCode() {
                Integer num = this.f46803a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46803a, "City(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46803a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Country;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Country implements PickerType {
            public static final Parcelable.Creator<Country> CREATOR = new d();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46804a;

            public Country(Integer num) {
                this.f46804a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46804a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Country) && Intrinsics.d(this.f46804a, ((Country) obj).f46804a);
            }

            public final int hashCode() {
                Integer num = this.f46804a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46804a, "Country(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46804a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Currency;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Currency implements PickerType {
            public static final Parcelable.Creator<Currency> CREATOR = new e();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46805a;

            public Currency(Integer num) {
                this.f46805a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46805a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Currency) && Intrinsics.d(this.f46805a, ((Currency) obj).f46805a);
            }

            public final int hashCode() {
                Integer num = this.f46805a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46805a, "Currency(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46805a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Document;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Document implements PickerType {
            public static final Parcelable.Creator<Document> CREATOR = new f();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46806a;

            public Document(Integer num) {
                this.f46806a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46806a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Document) && Intrinsics.d(this.f46806a, ((Document) obj).f46806a);
            }

            public final int hashCode() {
                Integer num = this.f46806a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46806a, "Document(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46806a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Gender;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Gender implements PickerType {
            public static final Parcelable.Creator<Gender> CREATOR = new g();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46807a;

            public Gender(Integer num) {
                this.f46807a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46807a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Gender) && Intrinsics.d(this.f46807a, ((Gender) obj).f46807a);
            }

            public final int hashCode() {
                Integer num = this.f46807a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46807a, "Gender(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46807a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Language;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Language implements PickerType {
            public static final Parcelable.Creator<Language> CREATOR = new h();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46808a;

            public Language(Integer num) {
                this.f46808a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46808a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Language) && Intrinsics.d(this.f46808a, ((Language) obj).f46808a);
            }

            public final int hashCode() {
                Integer num = this.f46808a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46808a, "Language(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46808a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Phone implements PickerType {
            public static final Parcelable.Creator<Phone> CREATOR = new i();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46809a;
            public final boolean b;
            public final boolean c;

            public Phone(Integer num, boolean z, boolean z2) {
                this.f46809a = num;
                this.b = z;
                this.c = z2;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46809a;
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
                return Intrinsics.d(this.f46809a, phone.f46809a) && this.b == phone.b && this.c == phone.c;
            }

            public final int hashCode() {
                Integer num = this.f46809a;
                return Boolean.hashCode(this.c) + brm0.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Phone(selectedId=");
                sb.append(this.f46809a);
                sb.append(", phoneFilterEnable=");
                sb.append(this.b);
                sb.append(", isEnterCodeManuallyEnabled=");
                return rw2.p(sb, this.c, Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46809a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
                parcel.writeInt(this.b ? 1 : 0);
                parcel.writeInt(this.c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Region;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Region implements PickerType {
            public static final Parcelable.Creator<Region> CREATOR = new j();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46810a;

            public Region(Integer num) {
                this.f46810a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46810a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Region) && Intrinsics.d(this.f46810a, ((Region) obj).f46810a);
            }

            public final int hashCode() {
                Integer num = this.f46810a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46810a, "Region(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46810a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$ResidentStatus;", "Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class ResidentStatus implements PickerType {
            public static final Parcelable.Creator<ResidentStatus> CREATOR = new k();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f46811a;

            public ResidentStatus(Integer num) {
                this.f46811a = num;
            }

            @Override // org.xplatform.picker.api.presentation.PickerDialogParams.PickerType
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final Integer getF46811a() {
                return this.f46811a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResidentStatus) && Intrinsics.d(this.f46811a, ((ResidentStatus) obj).f46811a);
            }

            public final int hashCode() {
                Integer num = this.f46811a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return h97.j(this.f46811a, "ResidentStatus(selectedId=", Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Integer num = this.f46811a;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    kng0.y(parcel, 1, num);
                }
            }
        }

        /* JADX INFO: renamed from: b0 */
        Integer getF46811a();
    }

    public PickerDialogParams(PickerType pickerType, AnalyticsEntryPoint analyticsEntryPoint) {
        pickerType.getClass();
        analyticsEntryPoint.getClass();
        this.f46801a = pickerType;
        this.b = analyticsEntryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46801a, i);
        this.b.writeToParcel(parcel, i);
    }
}
