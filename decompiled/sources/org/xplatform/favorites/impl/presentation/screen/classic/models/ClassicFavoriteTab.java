package org.xplatform.favorites.impl.presentation.screen.classic.models;

import a.c0o;
import a.okc;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ClassicFavoriteTab implements Parcelable {
    public static final Parcelable.Creator<ClassicFavoriteTab> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassicFavoriteTab f46639a;
    public static final ClassicFavoriteTab b;
    public static final ClassicFavoriteTab c;
    public static final ClassicFavoriteTab d;
    public static final /* synthetic */ ClassicFavoriteTab[] e;
    public static final /* synthetic */ c0o f;

    static {
        ClassicFavoriteTab classicFavoriteTab = new ClassicFavoriteTab("Events", 0);
        f46639a = classicFavoriteTab;
        ClassicFavoriteTab classicFavoriteTab2 = new ClassicFavoriteTab("Other", 1);
        b = classicFavoriteTab2;
        ClassicFavoriteTab classicFavoriteTab3 = new ClassicFavoriteTab("Tracked", 2);
        c = classicFavoriteTab3;
        ClassicFavoriteTab classicFavoriteTab4 = new ClassicFavoriteTab("Viewed", 3);
        d = classicFavoriteTab4;
        ClassicFavoriteTab[] classicFavoriteTabArr = {classicFavoriteTab, classicFavoriteTab2, classicFavoriteTab3, classicFavoriteTab4};
        e = classicFavoriteTabArr;
        f = new c0o(classicFavoriteTabArr);
        CREATOR = new okc((byte) 4);
    }

    public static ClassicFavoriteTab valueOf(String str) {
        return (ClassicFavoriteTab) Enum.valueOf(ClassicFavoriteTab.class, str);
    }

    public static ClassicFavoriteTab[] values() {
        return (ClassicFavoriteTab[]) e.clone();
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
