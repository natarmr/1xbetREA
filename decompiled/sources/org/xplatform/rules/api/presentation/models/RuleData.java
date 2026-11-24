package org.xplatform.rules.api.presentation.models;

import a.lun;
import a.sne0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/rules/api/presentation/models/RuleData;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RuleData implements Parcelable {
    public static final Parcelable.Creator<RuleData> CREATOR = new sne0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46902a;
    public final Map b;
    public final String c;
    public final String d;

    public RuleData(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        this.f46902a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46902a);
        Map map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RuleData(String str, int i, Map map, String str2) {
        if ((i & 2) != 0) {
            map = lun.f20680a;
            map.getClass();
        }
        str2 = (i & 4) != 0 ? "" : str2;
        this(str, str2, str2, map);
    }
}
