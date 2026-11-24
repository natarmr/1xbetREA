package org.xplatform.core.navigation.authorization.model;

import a.ibw0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/core/navigation/authorization/model/AuthType;", "Landroid/os/Parcelable;", "", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthType implements Parcelable {
    public static final Parcelable.Creator<AuthType> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AuthType f46456a;
    public static final AuthType b;
    public static final /* synthetic */ AuthType[] c;

    static {
        AuthType authType = new AuthType("LOGIN", 0);
        f46456a = authType;
        AuthType authType2 = new AuthType("REGISTRATION", 1);
        b = authType2;
        c = new AuthType[]{authType, authType2};
        CREATOR = new ibw0((byte) 16);
    }

    public static AuthType valueOf(String str) {
        return (AuthType) Enum.valueOf(AuthType.class, str);
    }

    public static AuthType[] values() {
        return (AuthType[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
