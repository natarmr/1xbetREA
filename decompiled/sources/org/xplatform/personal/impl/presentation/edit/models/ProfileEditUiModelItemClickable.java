package org.xplatform.personal.impl.presentation.edit.models;

import a.brm0;
import a.f140;
import a.k9x;
import a.kng0;
import a.p6t0;
import a.r6t0;
import a.rw2;
import a.twn;
import a.ua80;
import a.w2c0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;", "Payload", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ProfileEditUiModelItemClickable extends ProfileEditUiModel {
    public static final Parcelable.Creator<ProfileEditUiModelItemClickable> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2c0 f46791a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload;", "La/r6t0;", "Landroid/os/Parcelable;", "Error", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload$Error;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Payload extends r6t0, Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload$Error;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload;", "value", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Error implements Payload {
            public static final Parcelable.Creator<Error> CREATOR = new e();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46792a;

            public /* synthetic */ Error(String str) {
                this.f46792a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Error) {
                    return this.f46792a.equals(((Error) obj).f46792a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f46792a.hashCode();
            }

            public final String toString() {
                return kng0.l("Error(value=", this.f46792a, Separators.RPAREN);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.f46792a);
            }
        }
    }

    public ProfileEditUiModelItemClickable(w2c0 w2c0Var, int i, String str, boolean z, boolean z2, String str2, boolean z3) {
        w2c0Var.getClass();
        str.getClass();
        this.f46791a = w2c0Var;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = z3;
    }

    public static ProfileEditUiModelItemClickable z(ProfileEditUiModelItemClickable profileEditUiModelItemClickable, int i, String str, boolean z, boolean z2, String str2, int i2) {
        w2c0 w2c0Var = profileEditUiModelItemClickable.f46791a;
        if ((i2 & 2) != 0) {
            i = profileEditUiModelItemClickable.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = profileEditUiModelItemClickable.c;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            z = profileEditUiModelItemClickable.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = profileEditUiModelItemClickable.e;
        }
        boolean z4 = profileEditUiModelItemClickable.g;
        profileEditUiModelItemClickable.getClass();
        w2c0Var.getClass();
        str3.getClass();
        str2.getClass();
        return new ProfileEditUiModelItemClickable(w2c0Var, i3, str3, z3, z2, str2, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileEditUiModelItemClickable)) {
            return false;
        }
        ProfileEditUiModelItemClickable profileEditUiModelItemClickable = (ProfileEditUiModelItemClickable) obj;
        return this.f46791a == profileEditUiModelItemClickable.f46791a && this.b == profileEditUiModelItemClickable.b && Intrinsics.d(this.c, profileEditUiModelItemClickable.c) && this.d == profileEditUiModelItemClickable.d && this.e == profileEditUiModelItemClickable.e && this.f.equals(profileEditUiModelItemClickable.f) && this.g == profileEditUiModelItemClickable.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.e(brm0.e(ua80.b(twn.a(this.b, this.f46791a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel, a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ProfileEditUiModelItemClickable) || !(p6t0Var2 instanceof ProfileEditUiModelItemClickable)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new Payload.Error(((ProfileEditUiModelItemClickable) p6t0Var).f), new Payload.Error(((ProfileEditUiModelItemClickable) p6t0Var2).f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel
    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    public final String toString() {
        String strL = kng0.l("Error(value=", this.f, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("ProfileEditUiModelItemClickable(profileItemKey=");
        sb.append(this.f46791a);
        sb.append(", selectedId=");
        sb.append(this.b);
        sb.append(", text=");
        brm0.C(this.c, ", visible=", ", enabled=", sb, this.d);
        f140.s(", error=", strL, ", header=", sb, this.e);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }

    @Override // org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel
    /* JADX INFO: renamed from: u, reason: from getter */
    public final w2c0 getF46791a() {
        return this.f46791a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46791a.name());
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
