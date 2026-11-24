package org.xplatform.personal.impl.presentation.edit_tj.models;

import a.axq;
import a.brm0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;", "Landroid/os/Parcelable;", "ProfileEditTitleTjUiModel", "ProfileEditItemTjUiModel", "ProfileEditItemClickableTjUiModel", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditTitleTjUiModel;", "impl", "Landroidx/compose/runtime/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ProfileEditTjUiModel extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ProfileEditItemClickableTjUiModel implements ProfileEditTjUiModel {
        public static final Parcelable.Creator<ProfileEditItemClickableTjUiModel> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditProfileTjItemEnum f46795a;
        public final String b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final String i;

        public ProfileEditItemClickableTjUiModel(EditProfileTjItemEnum editProfileTjItemEnum, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            editProfileTjItemEnum.getClass();
            str.getClass();
            str2.getClass();
            this.f46795a = editProfileTjItemEnum;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = str2;
        }

        public static ProfileEditItemClickableTjUiModel a(ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel, String str, int i, boolean z, boolean z2, int i2) {
            EditProfileTjItemEnum editProfileTjItemEnum = profileEditItemClickableTjUiModel.f46795a;
            if ((i2 & 2) != 0) {
                str = profileEditItemClickableTjUiModel.b;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                i = profileEditItemClickableTjUiModel.c;
            }
            int i3 = i;
            int i4 = profileEditItemClickableTjUiModel.d;
            boolean z3 = profileEditItemClickableTjUiModel.e;
            boolean z4 = profileEditItemClickableTjUiModel.f;
            if ((i2 & 64) != 0) {
                z = profileEditItemClickableTjUiModel.g;
            }
            boolean z5 = z;
            if ((i2 & 128) != 0) {
                z2 = profileEditItemClickableTjUiModel.h;
            }
            String str3 = profileEditItemClickableTjUiModel.i;
            editProfileTjItemEnum.getClass();
            str2.getClass();
            str3.getClass();
            return new ProfileEditItemClickableTjUiModel(editProfileTjItemEnum, str2, i3, i4, z3, z4, z5, z2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileEditItemClickableTjUiModel)) {
                return false;
            }
            ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = (ProfileEditItemClickableTjUiModel) obj;
            return this.f46795a == profileEditItemClickableTjUiModel.f46795a && Intrinsics.d(this.b, profileEditItemClickableTjUiModel.b) && this.c == profileEditItemClickableTjUiModel.c && this.d == profileEditItemClickableTjUiModel.d && this.e == profileEditItemClickableTjUiModel.e && this.f == profileEditItemClickableTjUiModel.f && this.g == profileEditItemClickableTjUiModel.g && this.h == profileEditItemClickableTjUiModel.h && Intrinsics.d(this.i, profileEditItemClickableTjUiModel.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.d, twn.a(this.c, ua80.b(this.f46795a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileEditItemClickableTjUiModel(fieldType=");
            sb.append(this.f46795a);
            sb.append(", stringValue=");
            sb.append(this.b);
            sb.append(", value=");
            axq.r(this.c, this.d, ", labelResId=", ", enabled=", sb);
            ua80.u(", isFirst=", ", isLast=", sb, this.e, this.f);
            ua80.u(", visibility=", ", errorText=", sb, this.g, this.h);
            return axq.n(sb, this.i, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f46795a.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ProfileEditItemTjUiModel implements ProfileEditTjUiModel {
        public static final Parcelable.Creator<ProfileEditItemTjUiModel> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditProfileTjItemEnum f46796a;
        public final String b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final String i;

        public ProfileEditItemTjUiModel(EditProfileTjItemEnum editProfileTjItemEnum, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            editProfileTjItemEnum.getClass();
            str.getClass();
            str2.getClass();
            this.f46796a = editProfileTjItemEnum;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = str2;
        }

        public static ProfileEditItemTjUiModel a(ProfileEditItemTjUiModel profileEditItemTjUiModel, String str, boolean z, boolean z2, String str2, int i) {
            EditProfileTjItemEnum editProfileTjItemEnum = profileEditItemTjUiModel.f46796a;
            if ((i & 2) != 0) {
                str = profileEditItemTjUiModel.b;
            }
            String str3 = str;
            int i2 = profileEditItemTjUiModel.c;
            int i3 = profileEditItemTjUiModel.d;
            boolean z3 = profileEditItemTjUiModel.e;
            boolean z4 = profileEditItemTjUiModel.f;
            if ((i & 64) != 0) {
                z = profileEditItemTjUiModel.g;
            }
            boolean z5 = z;
            if ((i & 128) != 0) {
                z2 = profileEditItemTjUiModel.h;
            }
            boolean z6 = z2;
            if ((i & 256) != 0) {
                str2 = profileEditItemTjUiModel.i;
            }
            String str4 = str2;
            editProfileTjItemEnum.getClass();
            str3.getClass();
            str4.getClass();
            return new ProfileEditItemTjUiModel(editProfileTjItemEnum, str3, i2, i3, z3, z4, z5, z6, str4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileEditItemTjUiModel)) {
                return false;
            }
            ProfileEditItemTjUiModel profileEditItemTjUiModel = (ProfileEditItemTjUiModel) obj;
            return this.f46796a == profileEditItemTjUiModel.f46796a && Intrinsics.d(this.b, profileEditItemTjUiModel.b) && this.c == profileEditItemTjUiModel.c && this.d == profileEditItemTjUiModel.d && this.e == profileEditItemTjUiModel.e && this.f == profileEditItemTjUiModel.f && this.g == profileEditItemTjUiModel.g && this.h == profileEditItemTjUiModel.h && Intrinsics.d(this.i, profileEditItemTjUiModel.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.d, twn.a(this.c, ua80.b(this.f46796a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileEditItemTjUiModel(fieldType=");
            sb.append(this.f46796a);
            sb.append(", stringValue=");
            sb.append(this.b);
            sb.append(", value=");
            axq.r(this.c, this.d, ", labelResId=", ", enabled=", sb);
            ua80.u(", isFirst=", ", isLast=", sb, this.e, this.f);
            ua80.u(", visibility=", ", errorText=", sb, this.g, this.h);
            return axq.n(sb, this.i, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f46796a.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditTitleTjUiModel;", "Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ProfileEditTitleTjUiModel implements ProfileEditTjUiModel {
        public static final Parcelable.Creator<ProfileEditTitleTjUiModel> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46797a;

        public ProfileEditTitleTjUiModel(int i) {
            this.f46797a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileEditTitleTjUiModel) && this.f46797a == ((ProfileEditTitleTjUiModel) obj).f46797a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f46797a);
        }

        public final String toString() {
            return ua80.e(this.f46797a, "ProfileEditTitleTjUiModel(titleResId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46797a);
        }
    }
}
