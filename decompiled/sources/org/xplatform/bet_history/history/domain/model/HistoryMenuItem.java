package org.xplatform.bet_history.history.domain.model;

import a.yoo;
import android.javax.sip.message.Request;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HistoryMenuItem implements Parcelable {
    public static final Parcelable.Creator<HistoryMenuItem> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HistoryMenuItem f46392a;
    public static final HistoryMenuItem b;
    public static final HistoryMenuItem c;
    public static final HistoryMenuItem d;
    public static final HistoryMenuItem e;
    public static final HistoryMenuItem f;
    public static final HistoryMenuItem g;
    public static final HistoryMenuItem h;
    public static final HistoryMenuItem i;
    public static final HistoryMenuItem j;
    public static final HistoryMenuItem k;
    public static final HistoryMenuItem l;
    public static final HistoryMenuItem m;
    public static final /* synthetic */ HistoryMenuItem[] n;

    static {
        HistoryMenuItem historyMenuItem = new HistoryMenuItem("NOTIFY", 0);
        f46392a = historyMenuItem;
        HistoryMenuItem historyMenuItem2 = new HistoryMenuItem("HIDE", 1);
        b = historyMenuItem2;
        HistoryMenuItem historyMenuItem3 = new HistoryMenuItem("COPY", 2);
        c = historyMenuItem3;
        HistoryMenuItem historyMenuItem4 = new HistoryMenuItem("PRINT", 3);
        d = historyMenuItem4;
        HistoryMenuItem historyMenuItem5 = new HistoryMenuItem("EDIT", 4);
        e = historyMenuItem5;
        HistoryMenuItem historyMenuItem6 = new HistoryMenuItem("AUTOSALE", 5);
        f = historyMenuItem6;
        HistoryMenuItem historyMenuItem7 = new HistoryMenuItem("SALE", 6);
        g = historyMenuItem7;
        HistoryMenuItem historyMenuItem8 = new HistoryMenuItem("POWERBET", 7);
        h = historyMenuItem8;
        HistoryMenuItem historyMenuItem9 = new HistoryMenuItem("SHARE", 8);
        i = historyMenuItem9;
        HistoryMenuItem historyMenuItem10 = new HistoryMenuItem("TRANSACTION", 9);
        j = historyMenuItem10;
        HistoryMenuItem historyMenuItem11 = new HistoryMenuItem("DUPLICATE_COUPON", 10);
        k = historyMenuItem11;
        HistoryMenuItem historyMenuItem12 = new HistoryMenuItem(Request.CANCEL, 11);
        l = historyMenuItem12;
        HistoryMenuItem historyMenuItem13 = new HistoryMenuItem("MORE", 12);
        m = historyMenuItem13;
        n = new HistoryMenuItem[]{historyMenuItem, historyMenuItem2, historyMenuItem3, historyMenuItem4, historyMenuItem5, historyMenuItem6, historyMenuItem7, historyMenuItem8, historyMenuItem9, historyMenuItem10, historyMenuItem11, historyMenuItem12, historyMenuItem13};
        CREATOR = new yoo((byte) 27);
    }

    public static HistoryMenuItem valueOf(String str) {
        return (HistoryMenuItem) Enum.valueOf(HistoryMenuItem.class, str);
    }

    public static HistoryMenuItem[] values() {
        return (HistoryMenuItem[]) n.clone();
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
