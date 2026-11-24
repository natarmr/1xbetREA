package androidx.fragment.app;

import a.lkz;
import a.m1r;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45375a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;

    public FragmentState(Parcel parcel) {
        this.f45375a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    public final Fragment a(m1r m1rVar) {
        Fragment fragmentA = m1rVar.a(this.f45375a);
        fragmentA.f = this.b;
        fragmentA.p = this.c;
        fragmentA.r = this.d;
        fragmentA.s = true;
        fragmentA.z = this.e;
        fragmentA.A = this.f;
        fragmentA.B = this.g;
        fragmentA.f1 = this.h;
        fragmentA.m = this.i;
        fragmentA.Z = this.j;
        fragmentA.Y = this.k;
        fragmentA.t1 = lkz.values()[this.l];
        fragmentA.i = this.m;
        fragmentA.j = this.n;
        fragmentA.n1 = this.o;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f45375a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        String str2 = this.m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.n);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45375a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public FragmentState(Fragment fragment) {
        this.f45375a = fragment.getClass().getName();
        this.b = fragment.f;
        this.c = fragment.p;
        this.d = fragment.r;
        this.e = fragment.z;
        this.f = fragment.A;
        this.g = fragment.B;
        this.h = fragment.f1;
        this.i = fragment.m;
        this.j = fragment.Z;
        this.k = fragment.Y;
        this.l = fragment.t1.ordinal();
        this.m = fragment.i;
        this.n = fragment.j;
        this.o = fragment.n1;
    }
}
