package com.google.android.gms.fido.fido2.api.common;

import a.e9d0;
import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new lgw0((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45507a;

    public UvmEntries(ArrayList arrayList) {
        this.f45507a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        List list = ((UvmEntries) obj).f45507a;
        List list2 = this.f45507a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f45507a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    public final JSONArray m() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f45507a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.c);
                    jSONArray2.put((int) uvmEntry.b);
                    jSONArray2.put((int) uvmEntry.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            e9d0.m("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.n0(parcel, 1, this.f45507a);
        q5x.q0(parcel, iP0);
    }
}
