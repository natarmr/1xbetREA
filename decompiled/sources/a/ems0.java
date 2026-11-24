package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ems0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vdv0 f8063a;
    public vdv0 b;
    public vdv0 c;
    public zr40 d;
    public boolean e;
    public ywu f;
    public ywu g;
    public ywu h;
    public int i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [a.xzk0, a.zzk0] */
    /* JADX WARN: Type inference failed for: r0v105, types: [a.zzk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [a.yzk0, a.zzk0] */
    public final void a(int i, int i2, float f, fms0 fms0Var) {
        char c;
        cky ckyVar;
        int i3;
        iyf iyfVar;
        Iterator it;
        zzk0 zzk0Var;
        iyf iyfVar2;
        Integer num;
        String str;
        String str2;
        Object obj;
        Object obj2;
        byte b;
        byte b2;
        Iterator it2;
        ?? xzk0Var;
        iyf iyfVar3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        float fMin;
        float fA;
        ems0 ems0Var = this;
        vdv0 vdv0Var = ems0Var.c;
        zr40 zr40Var = ems0Var.d;
        ems0Var.i = i2;
        if (ems0Var.e) {
            System.nanoTime();
            bs40 bs40Var = zr40Var.f;
            bs40 bs40Var2 = zr40Var.e;
            ArrayList<qt40> arrayList = zr40Var.r;
            qt40 qt40Var = zr40Var.d;
            qt40 qt40Var2 = zr40Var.c;
            ArrayList<qs40> arrayList2 = zr40Var.t;
            new HashSet();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet<String> hashSet3 = new HashSet();
            HashMap map = new HashMap();
            zr40 zr40Var2 = zr40Var.Y;
            if (zr40Var2 != null) {
                qt40Var2.e(zr40Var2, zr40Var2.c);
                zr40 zr40Var3 = zr40Var.Y;
                qt40Var.e(zr40Var3, zr40Var3.d);
            }
            int i4 = zr40Var.x;
            if (i4 != -1 && qt40Var2.i == -1) {
                qt40Var2.i = i4;
            }
            if (bs40.b(bs40Var2.f3110a, bs40Var.f3110a)) {
                hashSet2.add("alpha");
            }
            String str8 = "translationZ";
            if (bs40.b(0.0f, 0.0f)) {
                hashSet2.add("translationZ");
            }
            byte b3 = bs40Var2.b;
            byte b4 = bs40Var.b;
            if (b3 != b4 && (b3 == 4 || b4 == 4)) {
                hashSet2.add("alpha");
            }
            if (bs40.b(bs40Var2.c, bs40Var.c)) {
                hashSet2.add("rotationZ");
            }
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
                hashSet2.add("pathRotate");
            }
            float f2 = Float.NaN;
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
                hashSet2.add("progress");
            }
            if (bs40.b(bs40Var2.d, bs40Var.d)) {
                hashSet2.add("rotationX");
            }
            Object obj3 = "rotationX";
            if (bs40.b(bs40Var2.e, bs40Var.e)) {
                hashSet2.add("rotationY");
            }
            Object obj4 = "rotationY";
            if (bs40.b(bs40Var2.h, bs40Var.h)) {
                hashSet2.add("pivotX");
            }
            Object obj5 = "rotationZ";
            if (bs40.b(bs40Var2.i, bs40Var.i)) {
                hashSet2.add("pivotY");
            }
            Object obj6 = "progress";
            String str9 = "scaleX";
            if (bs40.b(bs40Var2.f, bs40Var.f)) {
                hashSet2.add("scaleX");
            }
            Object obj7 = "pivotX";
            String str10 = "scaleY";
            if (bs40.b(bs40Var2.g, bs40Var.g)) {
                hashSet2.add("scaleY");
            }
            Object obj8 = "pivotY";
            if (bs40.b(bs40Var2.j, bs40Var.j)) {
                hashSet2.add("translationX");
            }
            Object obj9 = "translationX";
            String str11 = "translationY";
            if (bs40.b(bs40Var2.k, bs40Var.k)) {
                hashSet2.add("translationY");
            }
            if (bs40.b(bs40Var2.l, bs40Var.l)) {
                hashSet2.add("translationZ");
            }
            String str12 = "elevation";
            if (bs40.b(0.0f, 0.0f)) {
                hashSet2.add("elevation");
            }
            if (arrayList2 != null) {
                for (qs40 qs40Var : arrayList2) {
                    bs40 bs40Var3 = bs40Var;
                    if (qs40Var instanceof ts40) {
                        ts40 ts40Var = (ts40) qs40Var;
                        qt40 qt40Var3 = new qt40();
                        str6 = str11;
                        qt40Var3.h = f2;
                        qt40Var3.i = -1;
                        qt40Var3.j = null;
                        str7 = str8;
                        qt40Var3.k = Float.NaN;
                        qt40Var3.l = null;
                        qt40Var3.m = new HashMap();
                        qt40Var3.n = 0;
                        qt40Var3.o = new double[18];
                        qt40Var3.p = new double[18];
                        if (qt40Var2.j != null) {
                            float f3 = ts40Var.f29242a / 100.0f;
                            qt40Var3.b = f3;
                            qt40Var3.n = ts40Var.j;
                            float f4 = Float.isNaN(ts40Var.f) ? f3 : ts40Var.f;
                            str4 = str9;
                            float f5 = Float.isNaN(ts40Var.g) ? f3 : ts40Var.g;
                            str5 = str10;
                            float f6 = qt40Var.f;
                            float f7 = qt40Var2.f;
                            float f8 = f6 - f7;
                            float f9 = qt40Var.g;
                            float f10 = qt40Var2.g;
                            qt40Var3.c = qt40Var3.b;
                            qt40Var3.f = (int) ((f8 * f4) + f7);
                            qt40Var3.g = (int) (((f9 - f10) * f5) + f10);
                            int i5 = ts40Var.j;
                            str3 = str12;
                            float f11 = ts40Var.h;
                            if (i5 == 1) {
                                float f12 = Float.isNaN(f11) ? f3 : ts40Var.h;
                                float f13 = qt40Var.d;
                                float f14 = qt40Var2.d;
                                qt40Var3.d = rw2.a(f13, f14, f12, f14);
                                if (!Float.isNaN(ts40Var.i)) {
                                    f3 = ts40Var.i;
                                }
                                float f15 = qt40Var.e;
                                float f16 = qt40Var2.e;
                                qt40Var3.e = rw2.a(f15, f16, f3, f16);
                            } else if (i5 != 2) {
                                float f17 = Float.isNaN(f11) ? f3 : ts40Var.h;
                                float f18 = qt40Var.d;
                                float f19 = qt40Var2.d;
                                qt40Var3.d = rw2.a(f18, f19, f17, f19);
                                if (!Float.isNaN(ts40Var.i)) {
                                    f3 = ts40Var.i;
                                }
                                float f20 = qt40Var.e;
                                float f21 = qt40Var2.e;
                                qt40Var3.e = rw2.a(f20, f21, f3, f21);
                            } else {
                                if (Float.isNaN(f11)) {
                                    float f22 = qt40Var.d;
                                    float f23 = qt40Var2.d;
                                    fMin = rw2.a(f22, f23, f3, f23);
                                } else {
                                    fMin = ts40Var.h * Math.min(f5, f4);
                                }
                                qt40Var3.d = fMin;
                                if (Float.isNaN(ts40Var.i)) {
                                    float f24 = qt40Var.e;
                                    float f25 = qt40Var2.e;
                                    fA = rw2.a(f24, f25, f3, f25);
                                } else {
                                    fA = ts40Var.i;
                                }
                                qt40Var3.e = fA;
                            }
                            qt40Var3.j = qt40Var2.j;
                            qt40Var3.f29283a = fhn.f(ts40Var.e);
                            qt40Var3.i = -1;
                            f2 = Float.NaN;
                        } else {
                            str3 = str12;
                            str4 = str9;
                            str5 = str10;
                            int i6 = ts40Var.j;
                            int i7 = ts40Var.f29242a;
                            if (i6 == 1) {
                                f2 = Float.NaN;
                                float f26 = i7 / 100.0f;
                                qt40Var3.b = f26;
                                float f27 = Float.isNaN(ts40Var.f) ? f26 : ts40Var.f;
                                float f28 = Float.isNaN(ts40Var.g) ? f26 : ts40Var.g;
                                float f29 = qt40Var.f - qt40Var2.f;
                                float f30 = f26;
                                float f31 = qt40Var.g - qt40Var2.g;
                                qt40Var3.c = qt40Var3.b;
                                if (!Float.isNaN(ts40Var.h)) {
                                    f30 = ts40Var.h;
                                }
                                float f32 = qt40Var2.d;
                                float f33 = qt40Var2.f;
                                float f34 = (f33 / 2.0f) + f32;
                                float f35 = qt40Var2.e;
                                float f36 = qt40Var2.g;
                                float f37 = ((qt40Var.f / 2.0f) + qt40Var.d) - f34;
                                float f38 = ((qt40Var.g / 2.0f) + qt40Var.e) - ((f36 / 2.0f) + f35);
                                float f39 = f37 * f30;
                                float f40 = f29 * f27;
                                float f41 = f40 / 2.0f;
                                qt40Var3.d = (int) ((f32 + f39) - f41);
                                float f42 = f30 * f38;
                                float f43 = f31 * f28;
                                float f44 = f43 / 2.0f;
                                qt40Var3.e = (int) ((f35 + f42) - f44);
                                qt40Var3.f = (int) (f33 + f40);
                                qt40Var3.g = (int) (f36 + f43);
                                float f45 = Float.isNaN(ts40Var.i) ? 0.0f : ts40Var.i;
                                float f46 = (-f38) * f45;
                                float f47 = f37 * f45;
                                qt40Var3.n = 1;
                                float f48 = (int) ((qt40Var2.d + f39) - f41);
                                float f49 = (int) ((qt40Var2.e + f42) - f44);
                                qt40Var3.d = f48 + f46;
                                qt40Var3.e = f49 + f47;
                                qt40Var3.j = qt40Var3.j;
                                qt40Var3.f29283a = fhn.f(ts40Var.e);
                                qt40Var3.i = -1;
                            } else if (i6 != 2) {
                                float f50 = i7 / 100.0f;
                                qt40Var3.b = f50;
                                float f51 = Float.isNaN(ts40Var.f) ? f50 : ts40Var.f;
                                float f52 = Float.isNaN(ts40Var.g) ? f50 : ts40Var.g;
                                float f53 = qt40Var.f;
                                float f54 = qt40Var2.f;
                                float f55 = f53 - f54;
                                float f56 = qt40Var.g;
                                float f57 = qt40Var2.g;
                                float f58 = f56 - f57;
                                qt40Var3.c = qt40Var3.b;
                                float f59 = qt40Var2.d;
                                float f60 = (f54 / 2.0f) + f59;
                                float f61 = qt40Var2.e;
                                float f62 = ((f53 / 2.0f) + qt40Var.d) - f60;
                                float f63 = ((f56 / 2.0f) + qt40Var.e) - ((f57 / 2.0f) + f61);
                                float f64 = f55 * f51;
                                float f65 = f64 / 2.0f;
                                qt40Var3.d = (int) (((f62 * f50) + f59) - f65);
                                float f66 = f58 * f52;
                                float f67 = f66 / 2.0f;
                                qt40Var3.e = (int) (((f63 * f50) + f61) - f67);
                                qt40Var3.f = (int) (f54 + f64);
                                qt40Var3.g = (int) (f57 + f66);
                                float f68 = Float.isNaN(ts40Var.h) ? f50 : ts40Var.h;
                                f2 = Float.NaN;
                                float f69 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                                float f70 = f68;
                                float f71 = Float.isNaN(ts40Var.i) ? f50 : ts40Var.i;
                                float f72 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                                float f73 = f71;
                                qt40Var3.n = 0;
                                qt40Var3.d = (int) (((f72 * f63) + ((f70 * f62) + qt40Var2.d)) - f65);
                                qt40Var3.e = (int) (((f63 * f73) + ((f62 * f69) + qt40Var2.e)) - f67);
                                qt40Var3.f29283a = fhn.f(ts40Var.e);
                                qt40Var3.i = -1;
                            } else {
                                f2 = Float.NaN;
                                float f74 = i7 / 100.0f;
                                qt40Var3.b = f74;
                                float f75 = Float.isNaN(ts40Var.f) ? f74 : ts40Var.f;
                                float f76 = Float.isNaN(ts40Var.g) ? f74 : ts40Var.g;
                                float f77 = qt40Var.f;
                                float f78 = qt40Var2.f;
                                float f79 = f77 - f78;
                                float f80 = qt40Var.g;
                                float f81 = qt40Var2.g;
                                float f82 = f80 - f81;
                                qt40Var3.c = qt40Var3.b;
                                float f83 = qt40Var2.d;
                                float f84 = (f78 / 2.0f) + f83;
                                float f85 = qt40Var2.e;
                                float f86 = (f77 / 2.0f) + qt40Var.d;
                                float f87 = ((f80 / 2.0f) + qt40Var.e) - ((f81 / 2.0f) + f85);
                                float f88 = f79 * f75;
                                qt40Var3.d = (int) ((((f86 - f84) * f74) + f83) - (f88 / 2.0f));
                                float f89 = f82 * f76;
                                qt40Var3.e = (int) (((f87 * f74) + f85) - (f89 / 2.0f));
                                qt40Var3.f = (int) (f78 + f88);
                                qt40Var3.g = (int) (f81 + f89);
                                qt40Var3.n = 2;
                                if (!Float.isNaN(ts40Var.h)) {
                                    qt40Var3.d = (int) (ts40Var.h * (i - ((int) qt40Var3.f)));
                                }
                                if (!Float.isNaN(ts40Var.i)) {
                                    qt40Var3.e = (int) (ts40Var.i * (i2 - ((int) qt40Var3.g)));
                                }
                                qt40Var3.j = qt40Var3.j;
                                qt40Var3.f29283a = fhn.f(ts40Var.e);
                                qt40Var3.i = -1;
                            }
                        }
                        qt40 qt40Var4 = null;
                        for (qt40 qt40Var5 : arrayList) {
                            if (qt40Var3.c == qt40Var5.c) {
                                qt40Var4 = qt40Var5;
                            }
                        }
                        if (qt40Var4 != null) {
                            arrayList.remove(qt40Var4);
                        }
                        int iBinarySearch = Collections.binarySearch(arrayList, qt40Var3);
                        if (iBinarySearch == 0) {
                            hxm0.u("MotionController", " KeyPath position \"" + qt40Var3.c + "\" outside of range");
                        }
                        arrayList.add((-iBinarySearch) - 1, qt40Var3);
                        int i8 = ts40Var.d;
                        if (i8 != -1) {
                            zr40Var.b = i8;
                        }
                    } else {
                        str3 = str12;
                        str4 = str9;
                        str5 = str10;
                        str6 = str11;
                        str7 = str8;
                        if (qs40Var instanceof ss40) {
                            qs40Var.a(hashSet3);
                        } else {
                            qs40Var.b(map);
                            qs40Var.a(hashSet2);
                        }
                    }
                    bs40Var = bs40Var3;
                    str8 = str7;
                    str11 = str6;
                    str9 = str4;
                    str10 = str5;
                    str12 = str3;
                }
            }
            String str13 = str12;
            String str14 = str9;
            String str15 = str10;
            bs40 bs40Var4 = bs40Var;
            String str16 = str11;
            String str17 = str8;
            byte b5 = 10;
            if (hashSet2.isEmpty()) {
                c = 3;
            } else {
                zr40Var.v = new HashMap();
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    String str18 = (String) it3.next();
                    if (str18.startsWith("CUSTOM,")) {
                        zz2 zz2Var = new zz2(b5);
                        String str19 = str18.split(Separators.COMMA)[1];
                        for (qs40 qs40Var2 : arrayList2) {
                            Iterator it4 = it3;
                            HashMap map2 = qs40Var2.c;
                            if (map2 != null && (iyfVar3 = (iyf) map2.get(str19)) != null) {
                                zz2Var.b(qs40Var2.f29242a, iyfVar3);
                            }
                            it3 = it4;
                        }
                        it2 = it3;
                        xzk0Var = new yzk0();
                        String str20 = str18.split(Separators.COMMA)[1];
                        xzk0Var.f = zz2Var;
                    } else {
                        it2 = it3;
                        xzk0Var = new xzk0();
                        xzk0Var.f = str18;
                    }
                    xzk0Var.e = str18;
                    zr40Var.v.put(str18, xzk0Var);
                    it3 = it2;
                    b5 = 10;
                }
                c = 3;
                if (arrayList2 != null) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        qs40 qs40Var3 = (qs40) it5.next();
                        if (qs40Var3 instanceof rs40) {
                            HashMap map3 = zr40Var.v;
                            rs40 rs40Var = (rs40) qs40Var3;
                            for (String str21 : map3.keySet()) {
                                it5 = it5;
                                zzk0 zzk0Var2 = (zzk0) map3.get(str21);
                                if (zzk0Var2 != null) {
                                    HashMap map4 = map3;
                                    if (str21.startsWith("CUSTOM")) {
                                        iyf iyfVar4 = (iyf) rs40Var.c.get(str21.substring(7));
                                        if (iyfVar4 != null) {
                                            ((yzk0) zzk0Var2).f.b(rs40Var.f29242a, iyfVar4);
                                        }
                                        map3 = map4;
                                    } else {
                                        switch (str21.hashCode()) {
                                            case -1249320806:
                                                obj3 = obj3;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                b = str21.equals(obj3) ? (byte) 0 : (byte) -1;
                                                break;
                                            case -1249320805:
                                                Object obj10 = obj4;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(obj10)) {
                                                    obj4 = obj10;
                                                    obj3 = obj3;
                                                    b = 1;
                                                } else {
                                                    obj4 = obj10;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -1249320804:
                                                Object obj11 = obj5;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(obj11)) {
                                                    obj5 = obj11;
                                                    obj3 = obj3;
                                                    b = 2;
                                                } else {
                                                    obj5 = obj11;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -1225497657:
                                                Object obj12 = obj9;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(obj12)) {
                                                    b = 3;
                                                    obj9 = obj12;
                                                    obj3 = obj3;
                                                } else {
                                                    obj9 = obj12;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -1225497656:
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(str16)) {
                                                    b = 4;
                                                    obj3 = obj3;
                                                }
                                                obj3 = obj3;
                                                break;
                                            case -1225497655:
                                                String str22 = str17;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(str22)) {
                                                    b = 5;
                                                    str17 = str22;
                                                    obj3 = obj3;
                                                } else {
                                                    str17 = str22;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -1001078227:
                                                Object obj13 = obj6;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                if (str21.equals(obj13)) {
                                                    obj6 = obj13;
                                                    obj3 = obj3;
                                                    b = 6;
                                                } else {
                                                    obj6 = obj13;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -987906986:
                                                Object obj14 = obj7;
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                if (str21.equals(obj14)) {
                                                    b = 7;
                                                    obj2 = obj14;
                                                    obj3 = obj3;
                                                } else {
                                                    obj2 = obj14;
                                                    obj3 = obj3;
                                                }
                                                break;
                                            case -987906985:
                                                Object obj15 = obj8;
                                                str = str13;
                                                str2 = str14;
                                                if (str21.equals(obj15)) {
                                                    obj2 = obj7;
                                                    b = 8;
                                                    obj = obj15;
                                                    obj3 = obj3;
                                                } else {
                                                    obj = obj15;
                                                    obj3 = obj3;
                                                    obj2 = obj7;
                                                }
                                                break;
                                            case -908189618:
                                                String str23 = str14;
                                                str = str13;
                                                if (str21.equals(str23)) {
                                                    Object obj16 = obj8;
                                                    obj2 = obj7;
                                                    b = 9;
                                                    obj = obj16;
                                                    str2 = str23;
                                                    obj3 = obj3;
                                                } else {
                                                    str2 = str23;
                                                    obj3 = obj3;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                }
                                                break;
                                            case -908189617:
                                                String str24 = str15;
                                                str = str13;
                                                if (str21.equals(str24)) {
                                                    str15 = str24;
                                                    obj3 = obj3;
                                                    str2 = str14;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                    b = 10;
                                                } else {
                                                    str15 = str24;
                                                    str2 = str14;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                }
                                                break;
                                            case -4379043:
                                                String str25 = str13;
                                                if (str21.equals(str25)) {
                                                    Object obj17 = obj8;
                                                    obj2 = obj7;
                                                    b = 11;
                                                    str2 = str14;
                                                    obj = obj17;
                                                    str = str25;
                                                    obj3 = obj3;
                                                } else {
                                                    str = str25;
                                                    str2 = str14;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                }
                                                break;
                                            case 92909918:
                                                if (str21.equals("alpha")) {
                                                    b2 = 12;
                                                    str = str13;
                                                    str2 = str14;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                    b = b2;
                                                    obj3 = obj3;
                                                }
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                break;
                                            case 803192288:
                                                if (str21.equals("pathRotate")) {
                                                    b2 = 13;
                                                    str = str13;
                                                    str2 = str14;
                                                    obj = obj8;
                                                    obj2 = obj7;
                                                    b = b2;
                                                    obj3 = obj3;
                                                }
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                break;
                                            default:
                                                str = str13;
                                                str2 = str14;
                                                obj = obj8;
                                                obj2 = obj7;
                                                break;
                                        }
                                        switch (b) {
                                            case 0:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.h)) {
                                                    zzk0Var2.b(rs40Var.h, rs40Var.f29242a);
                                                }
                                                break;
                                            case 1:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.i)) {
                                                    zzk0Var2.b(rs40Var.i, rs40Var.f29242a);
                                                }
                                                break;
                                            case 2:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.g)) {
                                                    zzk0Var2.b(rs40Var.g, rs40Var.f29242a);
                                                }
                                                break;
                                            case 3:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.o)) {
                                                    zzk0Var2.b(rs40Var.o, rs40Var.f29242a);
                                                }
                                                break;
                                            case 4:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.p)) {
                                                    zzk0Var2.b(rs40Var.p, rs40Var.f29242a);
                                                }
                                                break;
                                            case 5:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.q)) {
                                                    zzk0Var2.b(rs40Var.q, rs40Var.f29242a);
                                                }
                                                break;
                                            case 6:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.r)) {
                                                    zzk0Var2.b(rs40Var.r, rs40Var.f29242a);
                                                }
                                                break;
                                            case 7:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.h)) {
                                                    zzk0Var2.b(rs40Var.j, rs40Var.f29242a);
                                                }
                                                break;
                                            case 8:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.i)) {
                                                    zzk0Var2.b(rs40Var.k, rs40Var.f29242a);
                                                }
                                                break;
                                            case 9:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.m)) {
                                                    zzk0Var2.b(rs40Var.m, rs40Var.f29242a);
                                                }
                                                break;
                                            case 10:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.n)) {
                                                    zzk0Var2.b(rs40Var.n, rs40Var.f29242a);
                                                }
                                                break;
                                            case 11:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.f)) {
                                                    zzk0Var2.b(rs40Var.f, rs40Var.f29242a);
                                                }
                                                break;
                                            case 12:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.e)) {
                                                    zzk0Var2.b(rs40Var.e, rs40Var.f29242a);
                                                }
                                                break;
                                            case 13:
                                                obj3 = obj3;
                                                if (!Float.isNaN(rs40Var.l)) {
                                                    zzk0Var2.b(rs40Var.l, rs40Var.f29242a);
                                                }
                                                break;
                                            default:
                                                obj3 = obj3;
                                                System.err.println("not supported by KeyAttributes ".concat(str21));
                                                break;
                                        }
                                        map3 = map4;
                                        obj7 = obj2;
                                        obj8 = obj;
                                        str14 = str2;
                                        str13 = str;
                                    }
                                }
                            }
                        }
                        obj7 = obj7;
                        it5 = it5;
                        obj8 = obj8;
                        str14 = str14;
                        str13 = str13;
                    }
                }
                bs40Var2.a(zr40Var.v, 0);
                bs40Var4.a(zr40Var.v, 100);
                for (String str26 : zr40Var.v.keySet()) {
                    int iIntValue = (!map.containsKey(str26) || (num = (Integer) map.get(str26)) == null) ? 0 : num.intValue();
                    zzk0 zzk0Var3 = (zzk0) zr40Var.v.get(str26);
                    if (zzk0Var3 != null) {
                        zzk0Var3.d(iIntValue);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                if (zr40Var.u == null) {
                    zr40Var.u = new HashMap();
                }
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    String str27 = (String) it6.next();
                    if (!zr40Var.u.containsKey(str27)) {
                        if (str27.startsWith("CUSTOM,")) {
                            zz2 zz2Var2 = new zz2((byte) 10);
                            String str28 = str27.split(Separators.COMMA)[1];
                            for (qs40 qs40Var4 : arrayList2) {
                                Iterator it7 = it6;
                                HashMap map5 = qs40Var4.c;
                                if (map5 != null && (iyfVar2 = (iyf) map5.get(str28)) != null) {
                                    zz2Var2.b(qs40Var4.f29242a, iyfVar2);
                                }
                                it6 = it7;
                            }
                            it = it6;
                            yzk0 yzk0Var = new yzk0();
                            String str29 = str27.split(Separators.COMMA)[1];
                            yzk0Var.f = zz2Var2;
                            zzk0Var = yzk0Var;
                        } else {
                            it = it6;
                            xzk0 xzk0Var2 = new xzk0();
                            xzk0Var2.f = str27;
                            zzk0Var = xzk0Var2;
                        }
                        zzk0Var.e = str27;
                        it6 = it;
                    }
                }
                if (arrayList2 != null) {
                    for (qs40 qs40Var5 : arrayList2) {
                    }
                }
                for (String str30 : zr40Var.u.keySet()) {
                    ((rlu0) zr40Var.u.get(str30)).e(map.containsKey(str30) ? ((Integer) map.get(str30)).intValue() : 0);
                }
            }
            int size = arrayList.size();
            int i9 = size + 2;
            qt40[] qt40VarArr = new qt40[i9];
            qt40VarArr[0] = qt40Var2;
            qt40VarArr[size + 1] = qt40Var;
            if (arrayList.size() > 0 && zr40Var.b == -1) {
                zr40Var.b = 0;
            }
            Iterator it8 = arrayList.iterator();
            int i10 = 1;
            while (it8.hasNext()) {
                qt40VarArr[i10] = (qt40) it8.next();
                i10++;
            }
            HashSet hashSet4 = new HashSet();
            for (String str31 : qt40Var.m.keySet()) {
                if (qt40Var2.m.containsKey(str31)) {
                    if (!hashSet2.contains("CUSTOM," + str31)) {
                        hashSet4.add(str31);
                    }
                }
            }
            String[] strArr = (String[]) hashSet4.toArray(new String[0]);
            zr40Var.o = strArr;
            zr40Var.p = new int[strArr.length];
            int i11 = 0;
            while (true) {
                String[] strArr2 = zr40Var.o;
                if (i11 < strArr2.length) {
                    String str32 = strArr2[i11];
                    zr40Var.p[i11] = 0;
                    for (int i12 = 0; i12 < i9; i12++) {
                        if (qt40VarArr[i12].m.containsKey(str32) && (iyfVar = (iyf) qt40VarArr[i12].m.get(str32)) != null) {
                            int[] iArr = zr40Var.p;
                            iArr[i11] = iyfVar.d() + iArr[i11];
                            break;
                        }
                    }
                    i11++;
                } else {
                    boolean z = qt40VarArr[0].i != -1;
                    int length = 18 + strArr2.length;
                    boolean[] zArr = new boolean[length];
                    for (int i13 = 1; i13 < i9; i13++) {
                        qt40 qt40Var6 = qt40VarArr[i13];
                        qt40 qt40Var7 = qt40VarArr[i13 - 1];
                        boolean zB = qt40.b(qt40Var6.d, qt40Var7.d);
                        boolean zB2 = qt40.b(qt40Var6.e, qt40Var7.e);
                        zArr[0] = zArr[0] | qt40.b(qt40Var6.c, qt40Var7.c);
                        zArr[1] = zArr[1] | (zB || zB2 || z);
                        zArr[2] = (zB || zB2 || z) | zArr[2];
                        zArr[c] = zArr[c] | qt40.b(qt40Var6.f, qt40Var7.f);
                        zArr[4] = qt40.b(qt40Var6.g, qt40Var7.g) | zArr[4];
                    }
                    int i14 = 0;
                    for (int i15 = 1; i15 < length; i15++) {
                        if (zArr[i15]) {
                            i14++;
                        }
                    }
                    zr40Var.l = new int[i14];
                    int iMax = Math.max(2, i14);
                    zr40Var.m = new double[iMax];
                    zr40Var.n = new double[iMax];
                    int i16 = 0;
                    for (int i17 = 1; i17 < length; i17++) {
                        if (zArr[i17]) {
                            zr40Var.l[i16] = i17;
                            i16++;
                        }
                    }
                    int[] iArr2 = {i9, zr40Var.l.length};
                    Class cls = Double.TYPE;
                    double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                    double[] dArr2 = new double[i9];
                    int i18 = 0;
                    while (i18 < i9) {
                        qt40 qt40Var8 = qt40VarArr[i18];
                        double[] dArr3 = dArr[i18];
                        int[] iArr3 = zr40Var.l;
                        float f90 = qt40Var8.c;
                        float f91 = qt40Var8.d;
                        float f92 = qt40Var8.e;
                        float f93 = qt40Var8.f;
                        qt40[] qt40VarArr2 = qt40VarArr;
                        float f94 = qt40Var8.g;
                        float f95 = qt40Var8.h;
                        int i19 = i18;
                        float[] fArr = new float[6];
                        fArr[0] = f90;
                        fArr[1] = f91;
                        fArr[2] = f92;
                        fArr[c] = f93;
                        fArr[4] = f94;
                        fArr[5] = f95;
                        int i20 = 0;
                        for (int i21 : iArr3) {
                            if (i21 < 6) {
                                dArr3[i20] = fArr[i21];
                                i20++;
                            }
                        }
                        dArr2[i19] = qt40VarArr2[i19].b;
                        i18 = i19 + 1;
                        qt40VarArr = qt40VarArr2;
                    }
                    qt40[] qt40VarArr3 = qt40VarArr;
                    int i22 = 0;
                    while (true) {
                        int[] iArr4 = zr40Var.l;
                        if (i22 < iArr4.length) {
                            if (iArr4[i22] < 6) {
                                String strN = axq.n(new StringBuilder(), qt40.q[zr40Var.l[i22]], " [");
                                for (int i23 = 0; i23 < i9; i23++) {
                                    strN = strN + dArr[i23][i22];
                                }
                            }
                            i22++;
                        } else {
                            zr40Var.g = new kpb[zr40Var.o.length + 1];
                            int i24 = 0;
                            while (true) {
                                String[] strArr3 = zr40Var.o;
                                if (i24 < strArr3.length) {
                                    String str33 = strArr3[i24];
                                    int i25 = 0;
                                    int i26 = 0;
                                    double[] dArr4 = null;
                                    double[][] dArr5 = null;
                                    while (i25 < i9) {
                                        if (qt40VarArr3[i25].m.containsKey(str33)) {
                                            if (dArr5 == null) {
                                                dArr4 = new double[i9];
                                                iyf iyfVar5 = (iyf) qt40VarArr3[i25].m.get(str33);
                                                dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i9, iyfVar5 == null ? 0 : iyfVar5.d());
                                            }
                                            qt40 qt40Var9 = qt40VarArr3[i25];
                                            dArr4[i26] = qt40Var9.b;
                                            double[] dArr6 = dArr5[i26];
                                            iyf iyfVar6 = (iyf) qt40Var9.m.get(str33);
                                            if (iyfVar6 == null) {
                                                i3 = i24;
                                            } else {
                                                i3 = i24;
                                                if (iyfVar6.d() == 1) {
                                                    dArr6[0] = iyfVar6.b();
                                                } else {
                                                    int iD = iyfVar6.d();
                                                    float[] fArr2 = new float[iD];
                                                    iyfVar6.c(fArr2);
                                                    int i27 = 0;
                                                    int i28 = 0;
                                                    while (i27 < iD) {
                                                        dArr6[i28] = fArr2[i27];
                                                        i27++;
                                                        iD = iD;
                                                        i28++;
                                                        fArr2 = fArr2;
                                                    }
                                                }
                                            }
                                            i26++;
                                        } else {
                                            i3 = i24;
                                            str33 = str33;
                                            i25 = i25;
                                        }
                                        i25++;
                                        str33 = str33;
                                        i24 = i3;
                                    }
                                    int i29 = i24;
                                    double[] dArrCopyOf = Arrays.copyOf(dArr4, i26);
                                    double[][] dArr7 = (double[][]) Arrays.copyOf(dArr5, i26);
                                    int i30 = i29 + 1;
                                    zr40Var.g[i30] = kpb.y(zr40Var.b, dArrCopyOf, dArr7);
                                    i24 = i30;
                                } else {
                                    zr40Var.g[0] = kpb.y(zr40Var.b, dArr2, dArr);
                                    if (qt40VarArr3[0].i != -1) {
                                        int[] iArr5 = new int[i9];
                                        double[] dArr8 = new double[i9];
                                        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls, i9, 2);
                                        for (int i31 = 0; i31 < i9; i31++) {
                                            qt40 qt40Var10 = qt40VarArr3[i31];
                                            iArr5[i31] = qt40Var10.i;
                                            dArr8[i31] = qt40Var10.b;
                                            double[] dArr10 = dArr9[i31];
                                            dArr10[0] = qt40Var10.d;
                                            dArr10[1] = qt40Var10.e;
                                        }
                                        zr40Var.h = new aw3(iArr5, dArr8, dArr9);
                                    }
                                    zr40Var.w = new HashMap();
                                    if (arrayList2 != null) {
                                        float fG = f2;
                                        for (String str34 : hashSet3) {
                                            if (str34.equals("pathRotate")) {
                                                aky akyVar = new aky();
                                                akyVar.g = k0t0.a(str34);
                                                ckyVar = akyVar;
                                            } else {
                                                zjy zjyVar = new zjy();
                                                zjyVar.g = k0t0.a(str34);
                                                ckyVar = zjyVar;
                                            }
                                            if (ckyVar.e == 1 && Float.isNaN(fG)) {
                                                fG = zr40Var.g();
                                            }
                                            ckyVar.b = str34;
                                            zr40Var.w.put(str34, ckyVar);
                                        }
                                        for (qs40 qs40Var6 : arrayList2) {
                                            if (qs40Var6 instanceof ss40) {
                                                ((ss40) qs40Var6).f(zr40Var.w);
                                            }
                                        }
                                        Iterator it9 = zr40Var.w.values().iterator();
                                        while (it9.hasNext()) {
                                            ((cky) it9.next()).d();
                                        }
                                    }
                                    ems0Var = this;
                                    ems0Var.e = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        vdv0.b(vdv0Var, ems0Var.f8063a, ems0Var.b, fms0Var, f);
        vdv0Var.getClass();
        ywu ywuVar = ems0Var.h;
        System.nanoTime();
        zr40Var.h(ywuVar, f);
    }
}
