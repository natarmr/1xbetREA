package org.xplatform.favorites.impl.presentation.screen.category_image_header.models;

import a.c0o;
import a.qo7;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CategoryImageHeaderTab implements Parcelable {
    public static final Parcelable.Creator<CategoryImageHeaderTab> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CategoryImageHeaderTab f46638a;
    public static final CategoryImageHeaderTab b;
    public static final CategoryImageHeaderTab c;
    public static final CategoryImageHeaderTab d;
    public static final /* synthetic */ CategoryImageHeaderTab[] e;
    public static final /* synthetic */ c0o f;

    static {
        CategoryImageHeaderTab categoryImageHeaderTab = new CategoryImageHeaderTab("Sport", 0);
        f46638a = categoryImageHeaderTab;
        CategoryImageHeaderTab categoryImageHeaderTab2 = new CategoryImageHeaderTab("XGames", 1);
        b = categoryImageHeaderTab2;
        CategoryImageHeaderTab categoryImageHeaderTab3 = new CategoryImageHeaderTab("Casino", 2);
        c = categoryImageHeaderTab3;
        CategoryImageHeaderTab categoryImageHeaderTab4 = new CategoryImageHeaderTab("Viewed", 3);
        d = categoryImageHeaderTab4;
        CategoryImageHeaderTab[] categoryImageHeaderTabArr = {categoryImageHeaderTab, categoryImageHeaderTab2, categoryImageHeaderTab3, categoryImageHeaderTab4};
        e = categoryImageHeaderTabArr;
        f = new c0o(categoryImageHeaderTabArr);
        CREATOR = new qo7((byte) 19);
    }

    public static CategoryImageHeaderTab valueOf(String str) {
        return (CategoryImageHeaderTab) Enum.valueOf(CategoryImageHeaderTab.class, str);
    }

    public static CategoryImageHeaderTab[] values() {
        return (CategoryImageHeaderTab[]) e.clone();
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
