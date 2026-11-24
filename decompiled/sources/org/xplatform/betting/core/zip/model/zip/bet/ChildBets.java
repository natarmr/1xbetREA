package org.xplatform.betting.core.zip.model.zip.bet;

import a.qo7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChildBets implements Parcelable {
    public static final Parcelable.Creator<ChildBets> CREATOR = new qo7((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46431a;
    public final ArrayList b;

    public /* synthetic */ ChildBets(int i, int i2) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, new ArrayList());
    }

    public final boolean a(BetZip betZip) {
        betZip.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.f46431a) {
            return false;
        }
        arrayList.add(betZip);
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46431a);
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BetZip) it.next()).writeToParcel(parcel, i);
        }
    }

    public ChildBets(int i, ArrayList arrayList) {
        this.f46431a = i;
        this.b = arrayList;
    }
}
