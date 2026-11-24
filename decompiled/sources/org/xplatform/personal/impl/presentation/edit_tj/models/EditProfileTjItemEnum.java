package org.xplatform.personal.impl.presentation.edit_tj.models;

import a.h9g;
import a.nek;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;", "Landroid/os/Parcelable;", "", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EditProfileTjItemEnum implements Parcelable {
    public static final Parcelable.Creator<EditProfileTjItemEnum> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nek f46794a;
    public static final EditProfileTjItemEnum b;
    public static final EditProfileTjItemEnum c;
    public static final EditProfileTjItemEnum d;
    public static final EditProfileTjItemEnum e;
    public static final EditProfileTjItemEnum f;
    public static final EditProfileTjItemEnum g;
    public static final EditProfileTjItemEnum h;
    public static final EditProfileTjItemEnum i;
    public static final EditProfileTjItemEnum j;
    public static final EditProfileTjItemEnum k;
    public static final EditProfileTjItemEnum l;
    public static final EditProfileTjItemEnum m;
    public static final EditProfileTjItemEnum n;
    public static final EditProfileTjItemEnum o;
    public static final EditProfileTjItemEnum p;
    public static final EditProfileTjItemEnum q;
    public static final /* synthetic */ EditProfileTjItemEnum[] r;

    static {
        EditProfileTjItemEnum editProfileTjItemEnum = new EditProfileTjItemEnum("EMPTY", 0);
        b = editProfileTjItemEnum;
        EditProfileTjItemEnum editProfileTjItemEnum2 = new EditProfileTjItemEnum("BASIC_DATA_TITLE", 1);
        c = editProfileTjItemEnum2;
        EditProfileTjItemEnum editProfileTjItemEnum3 = new EditProfileTjItemEnum("LOCATION_TITLE", 2);
        d = editProfileTjItemEnum3;
        EditProfileTjItemEnum editProfileTjItemEnum4 = new EditProfileTjItemEnum("DOCUMENT_TITLE", 3);
        e = editProfileTjItemEnum4;
        EditProfileTjItemEnum editProfileTjItemEnum5 = new EditProfileTjItemEnum("SURNAME", 4);
        f = editProfileTjItemEnum5;
        EditProfileTjItemEnum editProfileTjItemEnum6 = new EditProfileTjItemEnum("NAME", 5);
        g = editProfileTjItemEnum6;
        EditProfileTjItemEnum editProfileTjItemEnum7 = new EditProfileTjItemEnum("MIDDLE_NAME", 6);
        h = editProfileTjItemEnum7;
        EditProfileTjItemEnum editProfileTjItemEnum8 = new EditProfileTjItemEnum("BIRTHDATE", 7);
        i = editProfileTjItemEnum8;
        EditProfileTjItemEnum editProfileTjItemEnum9 = new EditProfileTjItemEnum(CommonConstant.RETKEY.GENDER, 8);
        j = editProfileTjItemEnum9;
        EditProfileTjItemEnum editProfileTjItemEnum10 = new EditProfileTjItemEnum("RESIDENT_STATUS", 9);
        k = editProfileTjItemEnum10;
        EditProfileTjItemEnum editProfileTjItemEnum11 = new EditProfileTjItemEnum("COUNTRY", 10);
        l = editProfileTjItemEnum11;
        EditProfileTjItemEnum editProfileTjItemEnum12 = new EditProfileTjItemEnum("REGION", 11);
        m = editProfileTjItemEnum12;
        EditProfileTjItemEnum editProfileTjItemEnum13 = new EditProfileTjItemEnum("CITY", 12);
        n = editProfileTjItemEnum13;
        EditProfileTjItemEnum editProfileTjItemEnum14 = new EditProfileTjItemEnum("REGISTRATION_ADDRESS", 13);
        o = editProfileTjItemEnum14;
        EditProfileTjItemEnum editProfileTjItemEnum15 = new EditProfileTjItemEnum("PASSPORT_NUMBER", 14);
        p = editProfileTjItemEnum15;
        EditProfileTjItemEnum editProfileTjItemEnum16 = new EditProfileTjItemEnum("INN", 15);
        q = editProfileTjItemEnum16;
        r = new EditProfileTjItemEnum[]{editProfileTjItemEnum, editProfileTjItemEnum2, editProfileTjItemEnum3, editProfileTjItemEnum4, editProfileTjItemEnum5, editProfileTjItemEnum6, editProfileTjItemEnum7, editProfileTjItemEnum8, editProfileTjItemEnum9, editProfileTjItemEnum10, editProfileTjItemEnum11, editProfileTjItemEnum12, editProfileTjItemEnum13, editProfileTjItemEnum14, editProfileTjItemEnum15, editProfileTjItemEnum16};
        f46794a = new nek();
        CREATOR = new h9g((byte) 25);
    }

    public static EditProfileTjItemEnum valueOf(String str) {
        return (EditProfileTjItemEnum) Enum.valueOf(EditProfileTjItemEnum.class, str);
    }

    public static EditProfileTjItemEnum[] values() {
        return (EditProfileTjItemEnum[]) r.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
