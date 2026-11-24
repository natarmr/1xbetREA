package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uzg0 extends j47 {
    public final Bundle u;
    public final rzg0 v;
    public String w;

    public uzg0(Bundle bundle, rzg0 rzg0Var) {
        rzg0Var.getClass();
        this.u = bundle;
        this.v = rzg0Var;
        this.w = "";
    }

    @Override // a.j47, a.bwn
    public final void B(int i) {
        String str = this.w;
        str.getClass();
        this.u.putInt(str, i);
    }

    @Override // a.bwn
    public final void C(jiy jiyVar, Object obj) {
        jiyVar.getClass();
        ugi0 descriptor = jiyVar.getDescriptor();
        if (Intrinsics.d(descriptor, pzg0.f27844a)) {
            lvb lvbVar = lvb.f20706a;
            obj.getClass();
            lvb.b(this, (CharSequence) obj);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.b)) {
            lwj lwjVar = lwj.b;
            obj.getClass();
            lwjVar.serialize(this, (Parcelable) obj);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.c)) {
            lvj lvjVar = lvj.b;
            obj.getClass();
            lvjVar.serialize(this, (Serializable) obj);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.d)) {
            wgi0 wgi0Var = huw.f13700a;
            obj.getClass();
            IBinder iBinder = (IBinder) obj;
            iBinder.getClass();
            if (!(this instanceof uzg0)) {
                c99.s(h8x.G(huw.f13700a.f39119a, this));
                return;
            }
            String str = this.w;
            str.getClass();
            this.u.putBinder(str, iBinder);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.i) || Intrinsics.d(descriptor, pzg0.j)) {
            wgi0 wgi0Var2 = cvb.f5021a;
            obj.getClass();
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            charSequenceArr.getClass();
            if (!(this instanceof uzg0)) {
                c99.s(h8x.G(cvb.f5021a.f39119a, this));
                return;
            }
            String str2 = this.w;
            str2.getClass();
            this.u.putCharSequenceArray(str2, charSequenceArr);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.k) || Intrinsics.d(descriptor, pzg0.l)) {
            hvb hvbVar = hvb.f13719a;
            obj.getClass();
            hvbVar.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.e) || Intrinsics.d(descriptor, pzg0.f)) {
            wgi0 wgi0Var3 = cp80.f4733a;
            obj.getClass();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            parcelableArr.getClass();
            if (!(this instanceof uzg0)) {
                c99.s(h8x.G(cp80.f4733a.f39119a, this));
                return;
            }
            String str3 = this.w;
            str3.getClass();
            this.u.putParcelableArray(str3, parcelableArr);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.g) || Intrinsics.d(descriptor, pzg0.h)) {
            dp80 dp80Var = dp80.f6452a;
            obj.getClass();
            dp80Var.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.d(descriptor, pzg0.m) || Intrinsics.d(descriptor, pzg0.n) || Intrinsics.d(descriptor, pzg0.o)) {
            knk0 knk0Var = knk0.f18590a;
            obj.getClass();
            knk0Var.serialize(this, (SparseArray) obj);
            return;
        }
        ugi0 descriptor2 = jiyVar.getDescriptor();
        boolean zD = Intrinsics.d(descriptor2, ozg0.f26100a);
        Bundle bundle = this.u;
        if (zD) {
            String str4 = this.w;
            obj.getClass();
            str4.getClass();
            bundle.putIntegerArrayList(str4, l8x.q0((List) obj));
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.b)) {
            String str5 = this.w;
            obj.getClass();
            str5.getClass();
            bundle.putStringArrayList(str5, l8x.q0((List) obj));
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.c)) {
            String str6 = this.w;
            obj.getClass();
            boolean[] zArrF0 = CollectionsKt.F0((List) obj);
            str6.getClass();
            bundle.putBooleanArray(str6, zArrF0);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.d)) {
            String str7 = this.w;
            obj.getClass();
            long[] jArrM0 = CollectionsKt.M0((List) obj);
            str7.getClass();
            bundle.putLongArray(str7, jArrM0);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.e)) {
            String str8 = this.w;
            obj.getClass();
            float[] fArrI0 = CollectionsKt.I0((List) obj);
            str8.getClass();
            bundle.putFloatArray(str8, fArrI0);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.f)) {
            String str9 = this.w;
            obj.getClass();
            List list = (List) obj;
            double[] dArr = new double[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                dArr[i] = ((Number) it.next()).doubleValue();
                i++;
            }
            str9.getClass();
            bundle.putDoubleArray(str9, dArr);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.g)) {
            String str10 = this.w;
            obj.getClass();
            char[] cArrH0 = CollectionsKt.H0((List) obj);
            str10.getClass();
            bundle.putCharArray(str10, cArrH0);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.h)) {
            String str11 = this.w;
            obj.getClass();
            str11.getClass();
            bundle.putBooleanArray(str11, (boolean[]) obj);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.i)) {
            String str12 = this.w;
            obj.getClass();
            str12.getClass();
            bundle.putCharArray(str12, (char[]) obj);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.j)) {
            String str13 = this.w;
            obj.getClass();
            str13.getClass();
            bundle.putDoubleArray(str13, (double[]) obj);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.k)) {
            String str14 = this.w;
            obj.getClass();
            str14.getClass();
            bundle.putFloatArray(str14, (float[]) obj);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.l)) {
            String str15 = this.w;
            obj.getClass();
            str15.getClass();
            bundle.putIntArray(str15, (int[]) obj);
            return;
        }
        if (Intrinsics.d(descriptor2, ozg0.m)) {
            String str16 = this.w;
            obj.getClass();
            str16.getClass();
            bundle.putLongArray(str16, (long[]) obj);
            return;
        }
        if (!Intrinsics.d(descriptor2, ozg0.n)) {
            jiyVar.serialize(this, obj);
            return;
        }
        String str17 = this.w;
        obj.getClass();
        str17.getClass();
        bundle.putStringArray(str17, (String[]) obj);
    }

    @Override // a.j47, a.bwn
    public final void E(String str) {
        str.getClass();
        String str2 = this.w;
        str2.getClass();
        this.u.putString(str2, str);
    }

    @Override // a.j47, a.bwn
    public final cld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        boolean zD = Intrinsics.d(this.w, "");
        rzg0 rzg0Var = this.v;
        if (zD) {
            rzg0Var.getClass();
            return this;
        }
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        String str = this.w;
        str.getClass();
        this.u.putBundle(str, bundleV);
        rzg0Var.getClass();
        return new uzg0(bundleV, rzg0Var);
    }

    @Override // a.bwn
    public final qaj b() {
        return this.v.f31359a;
    }

    @Override // a.j47, a.bwn
    public final void g(double d) {
        String str = this.w;
        str.getClass();
        this.u.putDouble(str, d);
    }

    @Override // a.j47, a.bwn
    public final void h(byte b) {
        String str = this.w;
        str.getClass();
        this.u.putInt(str, b);
    }

    @Override // a.j47, a.bwn
    public final void l(long j) {
        String str = this.w;
        str.getClass();
        this.u.putLong(str, j);
    }

    @Override // a.j47, a.bwn
    public final void q() {
        String str = this.w;
        str.getClass();
        this.u.putString(str, null);
    }

    @Override // a.j47, a.bwn
    public final void r(short s) {
        String str = this.w;
        str.getClass();
        this.u.putInt(str, s);
    }

    @Override // a.j47, a.bwn
    public final void s(boolean z) {
        String str = this.w;
        str.getClass();
        this.u.putBoolean(str, z);
    }

    @Override // a.j47, a.bwn
    public final void t(float f) {
        String str = this.w;
        str.getClass();
        this.u.putFloat(str, f);
    }

    @Override // a.cld
    public final boolean u(ugi0 ugi0Var) {
        ugi0Var.getClass();
        this.v.getClass();
        return false;
    }

    @Override // a.j47
    public final void v0(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        this.w = ugi0Var.e(i);
        this.v.getClass();
    }

    @Override // a.j47, a.bwn
    public final void w(char c) {
        String str = this.w;
        str.getClass();
        this.u.putChar(str, c);
    }

    @Override // a.j47, a.bwn
    public final void y(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        String str = this.w;
        str.getClass();
        this.u.putInt(str, i);
    }
}
