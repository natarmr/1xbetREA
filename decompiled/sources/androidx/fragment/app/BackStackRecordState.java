package androidx.fragment.app;

import a.h6r;
import a.jf4;
import a.lkz;
import a.zb5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f45368a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(zb5 zb5Var) {
        int size = zb5Var.f44098a.size();
        this.f45368a = new int[size * 6];
        if (!zb5Var.g) {
            jf4.n("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            h6r h6rVar = (h6r) zb5Var.f44098a.get(i2);
            int i3 = i + 1;
            this.f45368a[i] = h6rVar.f12542a;
            ArrayList arrayList = this.b;
            Fragment fragment = h6rVar.b;
            arrayList.add(fragment != null ? fragment.f : null);
            int[] iArr = this.f45368a;
            iArr[i3] = h6rVar.c ? 1 : 0;
            iArr[i + 2] = h6rVar.d;
            iArr[i + 3] = h6rVar.e;
            int i4 = i + 5;
            iArr[i + 4] = h6rVar.f;
            i += 6;
            iArr[i4] = h6rVar.g;
            this.c[i2] = h6rVar.h.ordinal();
            this.d[i2] = h6rVar.i.ordinal();
        }
        this.e = zb5Var.f;
        this.f = zb5Var.i;
        this.g = zb5Var.t;
        this.h = zb5Var.j;
        this.i = zb5Var.k;
        this.j = zb5Var.l;
        this.k = zb5Var.m;
        this.l = zb5Var.n;
        this.m = zb5Var.o;
        this.n = zb5Var.p;
    }

    public final void a(zb5 zb5Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f45368a;
            boolean z = true;
            if (i >= iArr.length) {
                zb5Var.f = this.e;
                zb5Var.i = this.f;
                zb5Var.g = true;
                zb5Var.j = this.h;
                zb5Var.k = this.i;
                zb5Var.l = this.j;
                zb5Var.m = this.k;
                zb5Var.n = this.l;
                zb5Var.o = this.m;
                zb5Var.p = this.n;
                return;
            }
            h6r h6rVar = new h6r();
            int i3 = i + 1;
            h6rVar.f12542a = iArr[i];
            if (e.V(2)) {
                Log.v("FragmentManager", "Instantiate " + zb5Var + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            h6rVar.h = lkz.values()[this.c[i2]];
            h6rVar.i = lkz.values()[this.d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            h6rVar.c = z;
            int i5 = iArr[i4];
            h6rVar.d = i5;
            int i6 = iArr[i + 3];
            h6rVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            h6rVar.f = i8;
            i += 6;
            int i9 = iArr[i7];
            h6rVar.g = i9;
            zb5Var.b = i5;
            zb5Var.c = i6;
            zb5Var.d = i8;
            zb5Var.e = i9;
            zb5Var.b(h6rVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f45368a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f45368a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
