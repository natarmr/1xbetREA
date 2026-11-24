package a;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tzg0 extends kc5 {
    public final Bundle l;
    public final rzg0 m;
    public String n;
    public int o;

    public tzg0(Bundle bundle, rzg0 rzg0Var) {
        rzg0Var.getClass();
        this.l = bundle;
        this.m = rzg0Var;
        this.n = "";
    }

    @Override // a.kc5, a.rkj
    public final boolean A() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        return !(bundle.containsKey(str) && bundle.get(str) == null);
    }

    @Override // a.kc5, a.rkj
    public final byte D() {
        return (byte) b8k0.G(this.l, this.n);
    }

    @Override // a.kc5, a.rkj
    public final bld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return Intrinsics.d(this.n, "") ? this : new tzg0(b8k0.L(this.l, this.n), this.m);
    }

    @Override // a.bld
    public final qaj b() {
        return this.m.f31359a;
    }

    @Override // a.bld
    public final int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        boolean zD = Intrinsics.d(ugi0Var.l(), aum0.c);
        Bundle bundle = this.l;
        int size = (zD || Intrinsics.d(ugi0Var.l(), aum0.d)) ? bundle.size() : ugi0Var.d();
        while (true) {
            int i = this.o;
            if (i >= size) {
                return -1;
            }
            String strE = ugi0Var.e(i);
            if (ugi0Var.i(this.o)) {
                strE.getClass();
                if (!bundle.containsKey(strE)) {
                    this.o++;
                }
            }
            this.n = strE;
            int i2 = this.o;
            this.o = i2 + 1;
            return i2;
        }
    }

    @Override // a.kc5, a.rkj
    public final int h() {
        return b8k0.G(this.l, this.n);
    }

    @Override // a.kc5, a.rkj
    public final long i() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final int k(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return b8k0.G(this.l, this.n);
    }

    @Override // a.kc5, a.rkj
    public final short p() {
        return (short) b8k0.G(this.l, this.n);
    }

    @Override // a.kc5, a.rkj
    public final float q() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final double s() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final boolean u() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final char v() {
        String str = this.n;
        str.getClass();
        Bundle bundle = this.l;
        char c = bundle.getChar(str, (char) 0);
        if (c != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c;
        }
        g8x.O(str);
        throw null;
    }

    @Override // a.rkj
    public final Object w(jiy jiyVar) {
        Object objA;
        jiyVar.getClass();
        ugi0 descriptor = jiyVar.getDescriptor();
        if (Intrinsics.d(descriptor, pzg0.f27844a)) {
            lvb lvbVar = lvb.f20706a;
            objA = lvb.a(this);
        } else if (Intrinsics.d(descriptor, pzg0.b)) {
            objA = lwj.b.deserialize(this);
        } else if (Intrinsics.d(descriptor, pzg0.c)) {
            objA = lvj.b.deserialize(this);
        } else if (Intrinsics.d(descriptor, pzg0.d)) {
            objA = huw.a(this);
        } else if (Intrinsics.d(descriptor, pzg0.i) || Intrinsics.d(descriptor, pzg0.j)) {
            objA = cvb.a(this);
        } else if (Intrinsics.d(descriptor, pzg0.k) || Intrinsics.d(descriptor, pzg0.l)) {
            objA = hvb.f13719a.deserialize(this);
        } else if (Intrinsics.d(descriptor, pzg0.e)) {
            Parcelable[] parcelableArrA = cp80.a(this);
            Object objDeserialize = jiyVar.deserialize(stn.l);
            objDeserialize.getClass();
            objA = Arrays.copyOf(parcelableArrA, parcelableArrA.length, azw.G(sre0.f32672a.b(objDeserialize.getClass())));
        } else if (Intrinsics.d(descriptor, pzg0.f)) {
            objA = cp80.a(this);
        } else if (Intrinsics.d(descriptor, pzg0.g) || Intrinsics.d(descriptor, pzg0.h)) {
            objA = dp80.f6452a.deserialize(this);
        } else {
            objA = (Intrinsics.d(descriptor, pzg0.m) || Intrinsics.d(descriptor, pzg0.n) || Intrinsics.d(descriptor, pzg0.o)) ? knk0.f18590a.deserialize(this) : null;
        }
        if (objA != null) {
            return objA;
        }
        ugi0 descriptor2 = jiyVar.getDescriptor();
        boolean zD = Intrinsics.d(descriptor2, ozg0.f26100a);
        Bundle bundle = this.l;
        if (zD) {
            String str = this.n;
            str.getClass();
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
            if (integerArrayList != null) {
                return integerArrayList;
            }
            g8x.O(str);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.b)) {
            String str2 = this.n;
            str2.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str2);
            if (stringArrayList != null) {
                return stringArrayList;
            }
            g8x.O(str2);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.c)) {
            String str3 = this.n;
            str3.getClass();
            boolean[] booleanArray = bundle.getBooleanArray(str3);
            if (booleanArray != null) {
                return tx3.i0(booleanArray);
            }
            g8x.O(str3);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.d)) {
            String str4 = this.n;
            str4.getClass();
            long[] longArray = bundle.getLongArray(str4);
            if (longArray != null) {
                return tx3.f0(longArray);
            }
            g8x.O(str4);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.e)) {
            String str5 = this.n;
            str5.getClass();
            float[] floatArray = bundle.getFloatArray(str5);
            if (floatArray != null) {
                return tx3.d0(floatArray);
            }
            g8x.O(str5);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.f)) {
            String str6 = this.n;
            str6.getClass();
            double[] doubleArray = bundle.getDoubleArray(str6);
            if (doubleArray != null) {
                return tx3.c0(doubleArray);
            }
            g8x.O(str6);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.g)) {
            String str7 = this.n;
            str7.getClass();
            char[] charArray = bundle.getCharArray(str7);
            if (charArray != null) {
                return tx3.b0(charArray);
            }
            g8x.O(str7);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.h)) {
            String str8 = this.n;
            str8.getClass();
            boolean[] booleanArray2 = bundle.getBooleanArray(str8);
            if (booleanArray2 != null) {
                return booleanArray2;
            }
            g8x.O(str8);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.i)) {
            String str9 = this.n;
            str9.getClass();
            char[] charArray2 = bundle.getCharArray(str9);
            if (charArray2 != null) {
                return charArray2;
            }
            g8x.O(str9);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.j)) {
            String str10 = this.n;
            str10.getClass();
            double[] doubleArray2 = bundle.getDoubleArray(str10);
            if (doubleArray2 != null) {
                return doubleArray2;
            }
            g8x.O(str10);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.k)) {
            String str11 = this.n;
            str11.getClass();
            float[] floatArray2 = bundle.getFloatArray(str11);
            if (floatArray2 != null) {
                return floatArray2;
            }
            g8x.O(str11);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.l)) {
            String str12 = this.n;
            str12.getClass();
            int[] intArray = bundle.getIntArray(str12);
            if (intArray != null) {
                return intArray;
            }
            g8x.O(str12);
            throw null;
        }
        if (Intrinsics.d(descriptor2, ozg0.m)) {
            String str13 = this.n;
            str13.getClass();
            long[] longArray2 = bundle.getLongArray(str13);
            if (longArray2 != null) {
                return longArray2;
            }
            g8x.O(str13);
            throw null;
        }
        if (!Intrinsics.d(descriptor2, ozg0.n)) {
            return jiyVar.deserialize(this);
        }
        String str14 = this.n;
        str14.getClass();
        String[] stringArray = bundle.getStringArray(str14);
        if (stringArray != null) {
            return stringArray;
        }
        g8x.O(str14);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final String z() {
        String str = this.n;
        str.getClass();
        String string = this.l.getString(str);
        if (string != null) {
            return string;
        }
        g8x.O(str);
        throw null;
    }
}
