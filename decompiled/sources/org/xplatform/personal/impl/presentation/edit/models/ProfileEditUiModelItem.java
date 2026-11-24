package org.xplatform.personal.impl.presentation.edit.models;

import a.brm0;
import a.k9x;
import a.kng0;
import a.p6t0;
import a.r6t0;
import a.ua80;
import a.w2c0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;", "Payload", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ProfileEditUiModelItem extends ProfileEditUiModel {
    public static final Parcelable.Creator<ProfileEditUiModelItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2c0 f46788a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload;", "La/r6t0;", "Landroid/os/Parcelable;", "Text", "Error", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Error;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Text;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Payload extends r6t0, Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Error;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload;", "value", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Error implements Payload {
            public static final Parcelable.Creator<Error> CREATOR = new b();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46789a;

            public /* synthetic */ Error(String str) {
                this.f46789a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Error) {
                    return this.f46789a.equals(((Error) obj).f46789a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f46789a.hashCode();
            }

            public final String toString() {
                return kng0.l("Error(value=", this.f46789a, Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.f46789a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Text;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload;", "value", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Text implements Payload {
            public static final Parcelable.Creator<Text> CREATOR = new c();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46790a;

            public /* synthetic */ Text(String str) {
                this.f46790a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Text) {
                    return this.f46790a.equals(((Text) obj).f46790a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f46790a.hashCode();
            }

            public final String toString() {
                return kng0.l("Text(value=", this.f46790a, Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.f46790a);
            }
        }
    }

    public ProfileEditUiModelItem(w2c0 w2c0Var, String str, boolean z, boolean z2, String str2, boolean z3) {
        w2c0Var.getClass();
        this.f46788a = w2c0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = z3;
    }

    public static ProfileEditUiModelItem z(ProfileEditUiModelItem profileEditUiModelItem, String str, String str2, int i) {
        w2c0 w2c0Var = profileEditUiModelItem.f46788a;
        if ((i & 2) != 0) {
            str = profileEditUiModelItem.b;
        }
        String str3 = str;
        boolean z = profileEditUiModelItem.c;
        boolean z2 = profileEditUiModelItem.d;
        boolean z3 = profileEditUiModelItem.f;
        profileEditUiModelItem.getClass();
        w2c0Var.getClass();
        str3.getClass();
        return new ProfileEditUiModelItem(w2c0Var, str3, z, z2, str2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileEditUiModelItem)) {
            return false;
        }
        ProfileEditUiModelItem profileEditUiModelItem = (ProfileEditUiModelItem) obj;
        return this.f46788a == profileEditUiModelItem.f46788a && this.b.equals(profileEditUiModelItem.b) && this.c == profileEditUiModelItem.c && this.d == profileEditUiModelItem.d && this.e.equals(profileEditUiModelItem.e) && this.f == profileEditUiModelItem.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(brm0.e(brm0.e(ua80.b(this.f46788a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel, a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ProfileEditUiModelItem) || !(p6t0Var2 instanceof ProfileEditUiModelItem)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ProfileEditUiModelItem profileEditUiModelItem = (ProfileEditUiModelItem) p6t0Var;
        ProfileEditUiModelItem profileEditUiModelItem2 = (ProfileEditUiModelItem) p6t0Var2;
        k9x.G(linkedHashSet, new Payload.Text(profileEditUiModelItem.b), new Payload.Text(profileEditUiModelItem2.b));
        k9x.G(linkedHashSet, new Payload.Error(profileEditUiModelItem.e), new Payload.Error(profileEditUiModelItem2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel
    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final String toString() {
        String strL = kng0.l("Text(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Error(value=", this.e, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("ProfileEditUiModelItem(profileItemKey=");
        sb.append(this.f46788a);
        sb.append(", text=");
        sb.append(strL);
        sb.append(", visible=");
        ua80.u(", enabled=", ", error=", sb, this.c, this.d);
        return defpackage.c.c(strL2, ", header=", Separators.RPAREN, sb, this.f);
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel
    /* JADX INFO: renamed from: u, reason: from getter */
    public final w2c0 getF46788a() {
        return this.f46788a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46788a.name());
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
