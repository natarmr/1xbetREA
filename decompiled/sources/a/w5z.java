package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w5z implements ao80, opb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38604a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public w5z(j83 j83Var, w6k w6kVar, mrq mrqVar, y9q0 y9q0Var, List list, boolean z) {
        int i;
        j83 j83Var2 = j83Var;
        y9q0 y9q0Var2 = y9q0Var;
        this.f38604a = j83Var2;
        this.b = list;
        wez wezVar = wez.b;
        final byte b = 0;
        this.c = maz.a(wezVar, new Function0(this) { // from class: a.cw40
            public final /* synthetic */ w5z b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                Object obj = null;
                int i2 = 1;
                w5z w5zVar = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) w5zVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float f = ((zn80) obj2).f44663a.f();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float f2 = ((zn80) obj3).f44663a.f();
                                    if (Float.compare(f, f2) < 0) {
                                        obj2 = obj3;
                                        f = f2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        zn80 zn80Var = (zn80) obj;
                        return Float.valueOf(zn80Var != null ? zn80Var.f44663a.f() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) w5zVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((zn80) obj4).f44663a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((zn80) obj5).f44663a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        zn80 zn80Var2 = (zn80) obj;
                        return Float.valueOf(zn80Var2 != null ? zn80Var2.f44663a.i.c() : 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.a(wezVar, new Function0(this) { // from class: a.cw40
            public final /* synthetic */ w5z b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                Object obj = null;
                int i2 = 1;
                w5z w5zVar = this.b;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) w5zVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float f = ((zn80) obj2).f44663a.f();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float f2 = ((zn80) obj3).f44663a.f();
                                    if (Float.compare(f, f2) < 0) {
                                        obj2 = obj3;
                                        f = f2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        zn80 zn80Var = (zn80) obj;
                        return Float.valueOf(zn80Var != null ? zn80Var.f44663a.f() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) w5zVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((zn80) obj4).f44663a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((zn80) obj5).f44663a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        zn80 zn80Var2 = (zn80) obj;
                        return Float.valueOf(zn80Var2 != null ? zn80Var2.f44663a.i.c() : 0.0f);
                }
            }
        });
        eo80 eo80Var = y9q0Var2.b;
        j83 j83Var3 = k83.f17854a;
        ArrayList arrayList = j83Var2.d;
        String str = j83Var2.b;
        List listA0 = (arrayList == null || (listA0 = CollectionsKt.A0(arrayList, new s7f((byte) 16))) == null) ? iun.f15405a : listA0;
        ArrayList arrayList2 = new ArrayList();
        xw3 xw3Var = new xw3();
        int size = listA0.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            i83 i83Var = (i83) listA0.get(i2);
            i83 i83VarA = i83.a(i83Var, eo80Var.a((eo80) i83Var.f14321a), b, 14);
            Object obj = i83VarA.f14321a;
            int i4 = i83VarA.c;
            int i5 = i83VarA.b;
            while (i3 < i5 && !xw3Var.isEmpty()) {
                i83 i83Var2 = (i83) xw3Var.last();
                int i6 = i83Var2.c;
                listA0 = listA0;
                Object obj2 = i83Var2.f14321a;
                if (i5 < i6) {
                    arrayList2.add(new i83(i3, i5, obj2));
                    i3 = i5;
                } else {
                    int i7 = size;
                    arrayList2.add(new i83(i3, i6, obj2));
                    i3 = i83Var2.c;
                    while (!xw3Var.isEmpty() && i3 == ((i83) xw3Var.last()).c) {
                        xw3Var.removeLast();
                    }
                    size = i7;
                }
            }
            List list2 = listA0;
            int i8 = size;
            if (i3 < i5) {
                arrayList2.add(new i83(i3, i5, eo80Var));
                i3 = i5;
            }
            i83 i83Var3 = (i83) xw3Var.k();
            if (i83Var3 != null) {
                int i9 = i83Var3.c;
                Object obj3 = i83Var3.f14321a;
                int i10 = i83Var3.b;
                if (i10 == i5 && i9 == i4) {
                    xw3Var.removeLast();
                    xw3Var.addLast(new i83(i5, i4, ((eo80) obj3).a((eo80) obj)));
                } else if (i10 == i9) {
                    arrayList2.add(new i83(i10, i9, obj3));
                    xw3Var.removeLast();
                    xw3Var.addLast(new i83(i5, i4, obj));
                } else {
                    if (i9 < i4) {
                        e9d0.o();
                        throw null;
                    }
                    xw3Var.addLast(new i83(i5, i4, ((eo80) obj3).a((eo80) obj)));
                }
            } else {
                xw3Var.addLast(new i83(i5, i4, obj));
            }
            i2++;
            listA0 = list2;
            size = i8;
            b = 0;
        }
        while (i3 <= str.length() && !xw3Var.isEmpty()) {
            i83 i83Var4 = (i83) xw3Var.last();
            Object obj4 = i83Var4.f14321a;
            int i11 = i83Var4.c;
            arrayList2.add(new i83(i3, i11, obj4));
            while (!xw3Var.isEmpty() && i11 == ((i83) xw3Var.last()).c) {
                xw3Var.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str.length()) {
            arrayList2.add(new i83(i3, str.length(), eo80Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new i83(0, 0, eo80Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i12 = i;
        while (i12 < size2) {
            i83 i83Var5 = (i83) arrayList2.get(i12);
            int i13 = i83Var5.b;
            int i14 = i83Var5.c;
            String strSubstring = i13 != i14 ? str.substring(i13, i14) : "";
            List listA = k83.a(j83Var2, i13, i14, new sy2((byte) 16));
            j83 j83Var4 = new j83(strSubstring, listA == null ? iun.f15405a : listA);
            eo80 eo80Var2 = (eo80) i83Var5.f14321a;
            if (eo80Var2.b == 0) {
                eo80Var2 = new eo80(eo80Var2.f8127a, eo80Var.b, eo80Var2.c, eo80Var2.d, eo80Var2.e, eo80Var2.f, eo80Var2.g, eo80Var2.h, eo80Var2.i);
            }
            y9q0 y9q0Var3 = new y9q0(y9q0Var2.f42262a, eo80Var.a(eo80Var2));
            List list3 = j83Var4.f16067a;
            List list4 = list3 == null ? iun.f15405a : list3;
            List list5 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i15 = 0;
            while (i15 < size3) {
                i83 i83Var6 = (i83) list5.get(i15);
                eo80 eo80Var3 = eo80Var;
                int i16 = i83Var6.b;
                y9q0 y9q0Var4 = y9q0Var3;
                int i17 = i83Var6.c;
                if (k83.b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        ycx.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new i83(i16 - i13, i17 - i13, i83Var6.f14321a));
                }
                i15++;
                list5 = list5;
                y9q0Var3 = y9q0Var4;
                eo80Var = eo80Var3;
            }
            arrayList3.add(new zn80(new v03(strSubstring, y9q0Var3, list4, arrayList4, mrqVar, w6kVar, z), i13, i14));
            i12++;
            j83Var2 = j83Var;
            y9q0Var2 = y9q0Var;
            str = str;
        }
        this.e = arrayList3;
    }

    public static dnq d0(utb utbVar) {
        byte b = 6;
        return new dnq(new lsa(utbVar, b), new x5v(3, null, b), (byte) 1);
    }

    public static String l(ouj0 ouj0Var, long j) {
        int i;
        String strB0 = CollectionsKt.b0(ouj0Var.e, "##", null, null, new r520((byte) 5), 30);
        long j2 = ouj0Var.b;
        int iA = ouj0Var.f;
        q4f q4fVar = q4f.m;
        if (iA == q4fVar.a()) {
            ezc ezcVar = ezc.CONFIRM_ANY_CHANGE;
            i = 0;
        } else {
            i = ouj0Var.g;
        }
        if (iA == q4fVar.a() || iA == q4f.l.a()) {
            iA = q4f.c.a();
        }
        String strValueOf = String.valueOf(j);
        strValueOf.getClass();
        String string = new StringBuilder((CharSequence) strValueOf).reverse().toString();
        StringBuilder sb = new StringBuilder(strB0);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(j2);
        sb.append(BundleUtil.UNDERLINE_TAG);
        axq.r(i, iA, BundleUtil.UNDERLINE_TAG, BundleUtil.UNDERLINE_TAG, sb);
        sb.append(string);
        return kcx.N(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(String str, zje zjeVar) {
        t5z t5zVar;
        if (zjeVar instanceof t5z) {
            t5zVar = (t5z) zjeVar;
            int i = t5zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5zVar.k = i - Integer.MIN_VALUE;
            } else {
                t5zVar = new t5z(this, zjeVar);
            }
        } else {
            t5zVar = new t5z(this, zjeVar);
        }
        Object objA = t5zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t5zVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            reu reuVar = (reu) this.f38604a;
            t5zVar.k = 1;
            objA = ((njg) reuVar.b).a(str, t5zVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ljg ljgVar = (ljg) objA;
        if (ljgVar.b.c.length() != 0 && ljgVar.c.c.length() != 0) {
            return ljgVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (r11 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable B(a.jvn r9, int r10, a.zje r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            a.knf0 r0 = (a.knf0) r0
            boolean r1 = r11 instanceof a.h8r0
            if (r1 == 0) goto L17
            r1 = r11
            a.h8r0 r1 = (a.h8r0) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.m = r2
            goto L1c
        L17:
            a.h8r0 r1 = new a.h8r0
            r1.<init>(r8, r11)
        L1c:
            java.lang.Object r11 = r1.k
            a.wne r2 = a.wne.f39444a
            int r3 = r1.m
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3f
            if (r3 == r6) goto L39
            if (r3 != r5) goto L32
            java.util.List r9 = r1.i
            a.z1x.P(r11)
            goto Laa
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L39:
            int r10 = r1.j
            a.z1x.P(r11)
            goto L91
        L3f:
            a.z1x.P(r11)
            java.lang.Object r11 = r8.f38604a
            a.ok50 r11 = (a.ok50) r11
            int r3 = r0.b()
            java.lang.String r0 = r0.c()
            r9.getClass()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            a.e3c.o(r7, r9)
            a.ulb.m0(r7, r10)
            a.tlb.I(r7, r3)
            java.lang.String r9 = "gr"
            r3 = 1357(0x54d, float:1.902E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.put(r9, r3)
            java.lang.String r9 = "lng"
            r7.put(r9, r0)
            a.tlb.a0(r7)
            r9 = 22
            a.tlb.m0(r9, r7)
            r1.j = r10
            r1.m = r6
            java.lang.Object r9 = r11.f25390a
            a.sza r9 = (a.sza) r9
            java.lang.Object r9 = r9.invoke()
            a.gmb r9 = (a.gmb) r9
            a.fk9 r11 = new a.fk9
            r11.<init>(r4)
            java.lang.Object r11 = r9.c(r7, r11, r1)
            if (r11 != r2) goto L91
            goto La9
        L91:
            a.dx5 r11 = (a.dx5) r11
            java.lang.Object r9 = r11.a()
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r11 = r8.e
            a.sjl0 r11 = (a.sjl0) r11
            r1.i = r9
            r1.j = r10
            r1.m = r5
            java.io.Serializable r11 = r11.d(r1)
            if (r11 != r2) goto Laa
        La9:
            return r2
        Laa:
            java.util.List r11 = (java.util.List) r11
            a.knb r9 = a.d7x.K(r9, r11, r4)
            java.util.ArrayList r9 = a.sj3.H0(r9)
            java.lang.Object r8 = r8.c
            a.gzq0 r8 = (a.gzq0) r8
            r8.getClass()
            a.ir30 r8 = r8.b
            r8.d(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.B(a.jvn, int, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r10 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable C(a.jvn r8, int r9, a.zje r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            a.knf0 r0 = (a.knf0) r0
            boolean r1 = r10 instanceof a.i8r0
            if (r1 == 0) goto L17
            r1 = r10
            a.i8r0 r1 = (a.i8r0) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.m = r2
            goto L1c
        L17:
            a.i8r0 r1 = new a.i8r0
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.k
            a.wne r2 = a.wne.f39444a
            int r3 = r1.m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L37
            if (r3 != r4) goto L30
            java.util.List r8 = r1.i
            a.z1x.P(r10)
            goto La3
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L37:
            int r9 = r1.j
            a.z1x.P(r10)
            goto L8a
        L3d:
            a.z1x.P(r10)
            java.lang.Object r10 = r7.b
            a.yk50 r10 = (a.yk50) r10
            int r3 = r0.b()
            java.lang.String r0 = r0.c()
            r8.getClass()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            a.e3c.o(r6, r8)
            a.ulb.m0(r6, r9)
            a.tlb.I(r6, r3)
            java.lang.String r8 = "gr"
            r3 = 1357(0x54d, float:1.902E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.put(r8, r3)
            java.lang.String r8 = "lng"
            r6.put(r8, r0)
            a.tlb.a0(r6)
            r8 = 22
            a.tlb.m0(r8, r6)
            r1.j = r9
            r1.m = r5
            java.lang.Object r8 = r10.b
            a.sza r8 = (a.sza) r8
            java.lang.Object r8 = r8.invoke()
            a.hmb r8 = (a.hmb) r8
            java.lang.Object r10 = r8.d(r6, r1)
            if (r10 != r2) goto L8a
            goto La2
        L8a:
            a.dx5 r10 = (a.dx5) r10
            java.lang.Object r8 = r10.a()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r10 = r7.e
            a.sjl0 r10 = (a.sjl0) r10
            r1.i = r8
            r1.j = r9
            r1.m = r4
            java.io.Serializable r10 = r10.d(r1)
            if (r10 != r2) goto La3
        La2:
            return r2
        La3:
            java.util.List r10 = (java.util.List) r10
            a.knb r8 = a.d7x.K(r8, r10, r5)
            java.util.ArrayList r8 = a.sj3.H0(r8)
            java.lang.Object r7 = r7.c
            a.gzq0 r7 = (a.gzq0) r7
            r7.getClass()
            a.ir30 r7 = r7.f12193a
            r7.d(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.C(a.jvn, int, a.zje):java.io.Serializable");
    }

    public qz40 D(Object obj, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f38604a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
        Object objA = linkedHashMap2.get(str);
        if (objA == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            objA = q7m0.a(linkedHashMap.get(str));
            linkedHashMap2.put(str, objA);
        }
        return (qz40) objA;
    }

    public int E(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int iF = q3d.f(arrayList, Integer.valueOf(i));
        int i2 = iF < 0 ? -(iF + 1) : iF + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int F(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:77|24|25|79|26|27|28|(1:31)|65) */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00de -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014a -> B:67:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014e -> B:52:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0158 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(java.lang.String r19, a.zje r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.G(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[LOOP:1: B:35:0x00ae->B:37:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable H(int i, zje zjeVar, boolean z) {
        zrl0 zrl0Var;
        Object obj;
        Object objI;
        List list;
        Object obj2;
        List list2;
        ArrayList<jkp> arrayList;
        ArrayList arrayList2;
        if (zjeVar instanceof zrl0) {
            zrl0Var = (zrl0) zjeVar;
            int i2 = zrl0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zrl0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                zrl0Var = new zrl0(this, zjeVar);
            }
        } else {
            zrl0Var = new zrl0(this, zjeVar);
        }
        Object obj3 = zrl0Var.l;
        Serializable serializable = wne.f39444a;
        int i3 = zrl0Var.n;
        if (i3 == 0) {
            z1x.P(obj3);
            zrl0Var.i = z;
            zrl0Var.j = i;
            zrl0Var.n = 1;
            Serializable serializableN = n(zrl0Var);
            obj = serializableN;
            if (serializableN != serializable) {
            }
            return serializable;
        }
        if (i3 == 1) {
            i = zrl0Var.j;
            z = zrl0Var.i;
            z1x.P(obj3);
            obj = obj3;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = zrl0Var.k;
            z1x.P(obj3);
            obj2 = obj3;
        }
        list2 = (List) obj2;
        arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (axq.y(((jkp) obj4).f16682a, list2)) {
                arrayList.add(obj4);
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (jkp jkpVar : arrayList) {
            jkpVar.e = true;
            arrayList2.add(jkpVar);
        }
        h(arrayList2);
        return arrayList2;
        List list3 = (List) obj;
        zrl0Var.k = list3;
        zrl0Var.i = z;
        zrl0Var.j = i;
        zrl0Var.n = 2;
        if (z) {
            n660 n660Var = (n660) this.b;
            List listL0 = CollectionsKt.L0((CopyOnWriteArrayList) n660Var.b);
            boolean zIsEmpty = listL0.isEmpty();
            objI = listL0;
            if (zIsEmpty) {
                List listJ = J();
                n660Var.b(listJ);
                objI = listJ;
            }
        } else {
            objI = I(i, zrl0Var);
        }
        if (objI != serializable) {
            list = list3;
            obj2 = objI;
            list2 = (List) obj2;
            arrayList = new ArrayList();
            while (r6.hasNext()) {
                if (axq.y(((jkp) obj4).f16682a, list2)) {
                    arrayList.add(obj4);
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            while (r7.hasNext()) {
                jkpVar.e = true;
                arrayList2.add(jkpVar);
            }
            h(arrayList2);
            return arrayList2;
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(int i, zje zjeVar) {
        asl0 asl0Var;
        if (zjeVar instanceof asl0) {
            asl0Var = (asl0) zjeVar;
            int i2 = asl0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asl0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                asl0Var = new asl0(this, zjeVar);
            }
        } else {
            asl0Var = new asl0(this, zjeVar);
        }
        Object objV = asl0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = asl0Var.l;
        if (i3 == 0) {
            z1x.P(objV);
            List listJ = J();
            if (!listJ.isEmpty()) {
                return listJ.size() > i ? listJ.subList(0, i) : listJ;
            }
            asl0Var.i = this;
            asl0Var.l = 1;
            objV = v(i, asl0Var);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = asl0Var.i;
            z1x.P(objV);
        }
        List list = (List) objV;
        this.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((jkp) it.next()).f16682a));
        }
        return arrayList;
    }

    public List J() {
        try {
            String strC = q7d0.c((q7d0) this.d, "SAVED_SPORTS_ID");
            if (strC != null && strC.length() != 0) {
                vby vbyVar = (vby) this.e;
                vbyVar.getClass();
                return (List) vbyVar.b(new zw3(s710.f31729a, (byte) 0), strC);
            }
            return iun.f15405a;
        } catch (Exception unused) {
            return iun.f15405a;
        }
    }

    public List K() {
        q7d0 q7d0Var = (q7d0) ((n660) this.b).f22981a;
        q7d0Var.getClass();
        String string = q7d0Var.a().getString("SPORTS_POSITION", "");
        String str = string != null ? string : "";
        if (str.length() == 0) {
            return iun.f15405a;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(r3d.q(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(String str, String str2, long j, zje zjeVar) {
        u5z u5zVar;
        Object g0g0Var;
        if (zjeVar instanceof u5z) {
            u5zVar = (u5z) zjeVar;
            int i = u5zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5zVar.k = i - Integer.MIN_VALUE;
            } else {
                u5zVar = new u5z(this, zjeVar);
            }
        } else {
            u5zVar = new u5z(this, zjeVar);
        }
        Object objA = u5zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = u5zVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                bzu bzuVar = (bzu) this.d;
                znq0 znq0Var = new znq0(j);
                dfj dfjVar = dfj.UNIQUE_4;
                Locale.ENGLISH.getClass();
                String strK0 = jtv.K0(znq0Var, dfjVar, 4);
                u5zVar.k = 1;
                objA = ((k1u0) bzuVar.b).a(str, str2, strK0, u5zVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            g0g0Var = (w0u0) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        iun iunVar = iun.f15405a;
        return g0g0Var instanceof g0g0 ? new w0u0(-1, -1L, false, new b1u0(-1, -1L, "", "", iunVar), new b1u0(-1, -1L, "", "", iunVar), iunVar, iunVar) : g0g0Var;
    }

    public Serializable M(int i, jvn jvnVar, y9s y9sVar, long j, bnn0 bnn0Var) {
        Object g0g0Var;
        Object g0g0Var2;
        rrt0 rrt0Var = (rrt0) this.e;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Boolean.valueOf(rrt0Var.a().b);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = Boolean.FALSE;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
        try {
            g0g0Var2 = new Long(rrt0Var.a().f18785a);
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Object l = new Long(0L);
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = l;
        }
        return p(((Number) g0g0Var2).longValue(), i, zBooleanValue, jvnVar, y9sVar, j, bnn0Var);
    }

    public Serializable N(boolean z, boolean z2, int i, jvn jvnVar, y9s y9sVar, bnn0 bnn0Var) {
        Object g0g0Var;
        Object g0g0Var2;
        rrt0 rrt0Var = (rrt0) this.e;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Boolean.valueOf(rrt0Var.a().c);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = Boolean.FALSE;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
        try {
            g0g0Var2 = new Long(rrt0Var.a().f18785a);
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Object l = new Long(0L);
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = l;
        }
        return q(z, z2, ((Number) g0g0Var2).longValue(), i, jvnVar, zBooleanValue, y9sVar, bnn0Var);
    }

    public utb O() {
        return aoq.c(((kc60) this.d).a(), new fe0((yje) null, (Object) this, (Object) ((pru) this.e).a(), (byte) 14));
    }

    public a1g P(boolean z, boolean z2) {
        gmq eu4Var;
        qv2 qv2Var = (qv2) this.f38604a;
        yje yjeVar = null;
        dnq dnqVarD0 = d0(aoq.c(((rpt) qv2Var.e).e(xvs.LIVE), new xa60(qv2Var, z, yjeVar, (byte) 1)));
        nc0 nc0Var = (nc0) this.b;
        dnq dnqVarD1 = d0(aoq.c(((rpt) nc0Var.g).e(xvs.LINE), new xa60(nc0Var, z, yjeVar, (byte) 0)));
        if (z2) {
            pzu pzuVar = (pzu) this.c;
            eu4Var = d0(aoq.c(new vsg0(new mt00((Object) pzuVar, yjeVar, (byte) 25)), new xpp(yjeVar, (Object) pzuVar, z, (byte) 14)));
        } else {
            eu4Var = new eu4(new qb60(iun.f15405a), (byte) 12);
        }
        return dub.f0(dnqVarD0, dnqVarD1, eu4Var, new pbp(this, z2, yjeVar, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object Q(double d, long j, zje zjeVar) {
        ra20 ra20Var;
        long j2;
        if (zjeVar instanceof ra20) {
            ra20Var = (ra20) zjeVar;
            int i = ra20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ra20Var.l = i - Integer.MIN_VALUE;
            } else {
                ra20Var = new ra20(this, zjeVar);
            }
        } else {
            ra20Var = new ra20(this, zjeVar);
        }
        ra20 ra20Var2 = ra20Var;
        Object objJ0 = ra20Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = ra20Var2.l;
        if (i2 == 0) {
            z1x.P(objJ0);
            pzu pzuVar = (pzu) this.f38604a;
            Map mapU = ((pzu) ((p4u) this.b).f26374a).U();
            int i3 = ((csr0) ((gxu) ((p4u) this.d).f26374a).f12096a).f4906a;
            krr0 krr0VarG = ((pzu) ((ivn) this.c).f15453a).G();
            ra20Var2.i = j;
            ra20Var2.l = 1;
            objJ0 = pzuVar.j0(d, mapU, i3, krr0VarG, j, ra20Var2);
            if (objJ0 == wneVar) {
                return wneVar;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = ra20Var2.i;
            z1x.P(objJ0);
        }
        ((hg5) this.e).a().a(((npr0) objJ0).c, j2);
        return objJ0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.h7q] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r64v0, types: [byte, int] */
    public Object R(long j, double d, double d2, double d3, boolean z, int i, long j2, double d4, String str, long j3, boolean z2, boolean z3, ezc ezcVar, boolean z4, int i2, zje zjeVar) {
        vg20 vg20Var;
        int i3;
        boolean z5;
        wne wneVar;
        ezc ezcVar2;
        long j4;
        boolean z6;
        ?? r16;
        Object obj;
        boolean z7;
        double d5;
        double d6;
        long j5;
        double d7;
        String str2;
        long j6;
        boolean z8;
        long j7;
        ezc ezcVar3;
        boolean z9;
        ?? r23;
        long j8;
        double d8;
        Object obj2;
        long j9;
        double d9;
        ql5 ql5Var;
        boolean z10;
        wne wneVar2;
        ezc ezcVar4;
        long j10;
        double d10;
        boolean z11;
        ?? r38;
        double d11;
        long j11;
        String str3;
        w5z w5zVar;
        double d12 = d;
        double d13 = d3;
        boolean z12 = z;
        String str4 = str;
        if (zjeVar instanceof vg20) {
            vg20Var = (vg20) zjeVar;
            int i4 = vg20Var.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vg20Var.z = i4 - Integer.MIN_VALUE;
            } else {
                vg20Var = new vg20(this, zjeVar);
            }
        } else {
            vg20Var = new vg20(this, zjeVar);
        }
        Object obj3 = vg20Var.x;
        wne wneVar3 = wne.f39444a;
        int i5 = vg20Var.z;
        if (i5 == 0) {
            z1x.P(obj3);
            if (z3) {
                nou nouVar = (nou) this.d;
                vg20Var.v = str4;
                vg20Var.w = ezcVar;
                vg20Var.i = j;
                vg20Var.l = d12;
                vg20Var.m = d2;
                vg20Var.n = d13;
                vg20Var.p = z12;
                i3 = i;
                vg20Var.t = i3;
                vg20Var.j = j2;
                vg20Var.o = d4;
                vg20Var.k = j3;
                z8 = z2;
                vg20Var.q = z8;
                vg20Var.r = z3;
                vg20Var.s = z4;
                vg20Var.u = i2;
                vg20Var.z = 1;
                Serializable serializableA = nouVar.a(tl5.c, vg20Var);
                wneVar = wneVar3;
                if (serializableA != wneVar) {
                    j7 = j3;
                    ezcVar3 = ezcVar;
                    z9 = z4;
                    r23 = i2;
                    j8 = j;
                    d8 = d2;
                    obj2 = serializableA;
                    j9 = j2;
                    d9 = d4;
                    z6 = z3;
                    ql5Var = (ql5) obj2;
                    z10 = z8;
                    wneVar2 = wneVar;
                    ezcVar4 = ezcVar3;
                    j10 = j7;
                    d10 = d8;
                    z11 = z9;
                    r38 = r23;
                    d11 = d9;
                    j11 = j8;
                    str3 = str4;
                    w5zVar = this;
                }
            } else {
                i3 = i;
                z5 = z2;
                wneVar = wneVar3;
                ahu ahuVar = (ahu) this.c;
                bm5 bm5Var = bm5.m;
                vg20Var.v = str4;
                ezcVar2 = ezcVar;
                vg20Var.w = ezcVar2;
                vg20Var.i = j;
                vg20Var.l = d12;
                vg20Var.m = d2;
                vg20Var.n = d13;
                vg20Var.p = z12;
                vg20Var.t = i3;
                vg20Var.j = j2;
                vg20Var.o = d4;
                vg20Var.k = j3;
                vg20Var.q = z5;
                vg20Var.r = z3;
                vg20Var.s = z4;
                vg20Var.u = i2;
                vg20Var.z = 2;
                Serializable serializableB = ahuVar.b(bm5Var, vg20Var);
                if (serializableB != wneVar) {
                    j4 = j;
                    z6 = z3;
                    r16 = i2;
                    obj = serializableB;
                    z7 = z4;
                    d5 = d2;
                    d6 = d13;
                    j5 = j2;
                    d7 = d4;
                    str2 = str;
                    j6 = j3;
                    ql5Var = (ql5) obj;
                    j10 = j6;
                    z10 = z5;
                    wneVar2 = wneVar;
                    ezcVar4 = ezcVar2;
                    r38 = r16;
                    z11 = z7;
                    d10 = d5;
                    j11 = j4;
                    w5zVar = this;
                    str3 = str2;
                    j9 = j5;
                    d11 = d7;
                    d13 = d6;
                }
            }
            return wneVar;
        }
        if (i5 == 1) {
            byte b = vg20Var.u;
            boolean z13 = vg20Var.s;
            boolean z14 = vg20Var.r;
            boolean z15 = vg20Var.q;
            long j12 = vg20Var.k;
            double d14 = vg20Var.o;
            long j13 = vg20Var.j;
            i3 = vg20Var.t;
            boolean z16 = vg20Var.p;
            double d15 = vg20Var.n;
            d8 = vg20Var.m;
            double d16 = vg20Var.l;
            j8 = vg20Var.i;
            ezc ezcVar5 = vg20Var.w;
            String str5 = vg20Var.v;
            z1x.P(obj3);
            obj2 = obj3;
            ezcVar3 = ezcVar5;
            wneVar = wneVar3;
            str4 = str5;
            j9 = j13;
            z12 = z16;
            z6 = z14;
            z8 = z15;
            d12 = d16;
            r23 = b;
            z9 = z13;
            j7 = j12;
            d9 = d14;
            d13 = d15;
            ql5Var = (ql5) obj2;
            z10 = z8;
            wneVar2 = wneVar;
            ezcVar4 = ezcVar3;
            j10 = j7;
            d10 = d8;
            z11 = z9;
            r38 = r23;
            d11 = d9;
            j11 = j8;
            str3 = str4;
            w5zVar = this;
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    z1x.P(obj3);
                    return obj3;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            byte b2 = vg20Var.u;
            boolean z17 = vg20Var.s;
            boolean z18 = vg20Var.r;
            boolean z19 = vg20Var.q;
            j6 = vg20Var.k;
            d7 = vg20Var.o;
            long j14 = vg20Var.j;
            int i6 = vg20Var.t;
            boolean z20 = vg20Var.p;
            z7 = z17;
            d6 = vg20Var.n;
            d5 = vg20Var.m;
            double d17 = vg20Var.l;
            long j15 = vg20Var.i;
            ezc ezcVar6 = vg20Var.w;
            j4 = j15;
            String str6 = vg20Var.v;
            z1x.P(obj3);
            str2 = str6;
            j5 = j14;
            z5 = z19;
            i3 = i6;
            z12 = z20;
            wneVar = wneVar3;
            z6 = z18;
            d12 = d17;
            obj = obj3;
            r16 = b2;
            ezcVar2 = ezcVar6;
            ql5Var = (ql5) obj;
            j10 = j6;
            z10 = z5;
            wneVar2 = wneVar;
            ezcVar4 = ezcVar2;
            r38 = r16;
            z11 = z7;
            d10 = d5;
            j11 = j4;
            w5zVar = this;
            str3 = str2;
            j9 = j5;
            d11 = d7;
            d13 = d6;
        }
        ql5 ql5Var2 = ql5Var;
        ?? r0 = (h7q) w5zVar.f38604a;
        long jB = ((ort) w5zVar.b).b();
        int id = ((uzc) w5zVar.e).b().getId();
        vg20Var.v = null;
        vg20Var.w = null;
        vg20Var.i = j11;
        vg20Var.l = d12;
        vg20Var.m = d10;
        vg20Var.n = d13;
        vg20Var.p = z12;
        vg20Var.t = i3;
        vg20Var.j = j9;
        double d18 = d11;
        vg20Var.o = d18;
        vg20Var.k = j10;
        vg20Var.q = z10;
        vg20Var.r = z6;
        vg20Var.s = z11;
        vg20Var.u = r38 == true ? (byte) 1 : (byte) 0;
        vg20Var.z = 3;
        double d19 = d10;
        wne wneVar4 = wneVar2;
        long j16 = j11;
        Object objC = r0.c(j16, d12, d19, d13, z12, i3, j9, d18, str3, j10, z10, z6, ql5Var2, jB, ezcVar4, id, z11, r38, vg20Var);
        return objC == wneVar4 ? wneVar4 : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object S(long j, zje zjeVar) {
        ra60 ra60Var;
        n0o0 n0o0Var = (n0o0) this.e;
        if (zjeVar instanceof ra60) {
            ra60Var = (ra60) zjeVar;
            int i = ra60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ra60Var.l = i - Integer.MIN_VALUE;
            } else {
                ra60Var = new ra60(this, zjeVar);
            }
        } else {
            ra60Var = new ra60(this, zjeVar);
        }
        Object objW = ra60Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ra60Var.l;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objW);
            f7u f7uVar = (f7u) this.f38604a;
            boolean z = ((sff0) n0o0Var.getValue()).J1;
            boolean z2 = ((sff0) n0o0Var.getValue()).O1;
            ra60Var.i = j;
            ra60Var.l = 1;
            objW = f7uVar.w(z, z2, ra60Var);
            if (objW == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ra60Var.i;
            z1x.P(objW);
        }
        return new p6d((gmq) objW, ((goo) ((f4u) this.b).b).f11640a.a(j).f22099a, new opu(this, j, (yje) null), b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r11 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r11 == r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(long r9, a.zje r11, boolean r12) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.T(long, a.zje, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[LOOP:0: B:38:0x00f7->B:40:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object U(Long l, Long l2, int i, boolean z, zje zjeVar) throws Throwable {
        hnf0 hnf0Var;
        Long l3;
        Long l4;
        boolean z2;
        int i2;
        String str;
        Long l5;
        cpc cpcVar;
        Long l6;
        boolean z3;
        String str2;
        int i3;
        long j;
        int iA;
        long j2;
        Long l7;
        LinkedHashMap linkedHashMap;
        vkr0 vkr0Var;
        Object objV;
        List list;
        List list2;
        boolean zIsEmpty;
        if (zjeVar instanceof hnf0) {
            hnf0Var = (hnf0) zjeVar;
            int i4 = hnf0Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hnf0Var.r = i4 - Integer.MIN_VALUE;
            } else {
                hnf0Var = new hnf0(this, zjeVar);
            }
        } else {
            hnf0Var = new hnf0(this, zjeVar);
        }
        hnf0 hnf0Var2 = hnf0Var;
        Object objB = hnf0Var2.p;
        Object obj = wne.f39444a;
        int i5 = hnf0Var2.r;
        if (i5 == 0) {
            z1x.P(objB);
            ahu ahuVar = (ahu) this.c;
            hnf0Var2.i = l;
            l3 = l2;
            hnf0Var2.j = l3;
            hnf0Var2.k = null;
            hnf0Var2.m = i;
            hnf0Var2.n = z;
            hnf0Var2.r = 1;
            objB = ahuVar.b(bm5.f2822a, hnf0Var2);
            if (objB != obj) {
                l4 = l;
                z2 = z;
                i2 = i;
                str = null;
            }
            return obj;
        }
        if (i5 == 1) {
            z2 = hnf0Var2.n;
            i2 = hnf0Var2.m;
            String str3 = hnf0Var2.k;
            Long l8 = hnf0Var2.j;
            l4 = hnf0Var2.i;
            z1x.P(objB);
            str = str3;
            l3 = l8;
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    z1x.P(objB);
                    return objB;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hnf0Var2.o;
            z3 = hnf0Var2.n;
            int i6 = hnf0Var2.m;
            cpcVar = hnf0Var2.l;
            String str4 = hnf0Var2.k;
            l5 = hnf0Var2.j;
            l6 = hnf0Var2.i;
            z1x.P(objB);
            i3 = i6;
            str2 = str4;
        }
        Iterable<xuf> iterable = (Iterable) objB;
        iA = wp20.a(r3d.q(iterable, 10));
        if (iA < 16) {
            iA = 16;
        }
        j2 = j;
        l7 = l5;
        linkedHashMap = new LinkedHashMap(iA);
        for (xuf xufVar : iterable) {
            linkedHashMap.put(xufVar.b, xufVar.f);
        }
        hnf0Var2.i = null;
        hnf0Var2.j = null;
        hnf0Var2.k = null;
        hnf0Var2.l = null;
        hnf0Var2.m = i3;
        hnf0Var2.n = z3;
        hnf0Var2.r = 3;
        vkr0Var = cpcVar.f4739a;
        if (z3) {
            list = (List) ((hw3) vkr0Var.d).f13752a.getValue();
            list2 = list;
            if (list == null) {
                list2 = iun.f15405a;
            }
            if (l6 == null) {
                zIsEmpty = list2.isEmpty();
                objV = list2;
                if (zIsEmpty) {
                    objV = vkr0Var.w(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
                }
            } else {
                objV = vkr0Var.w(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
            }
        } else {
            objV = vkr0Var.v(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
        }
        if (objV != obj) {
            return obj;
        }
        return objV;
        ql5 ql5Var = (ql5) objB;
        if (ql5Var.i.a() || ((lbu) this.e).j() || !((pru) this.d).a().K) {
            return iun.f15405a;
        }
        cpc cpcVar2 = (cpc) this.f38604a;
        long j3 = ql5Var.f28916a;
        a7q a7qVar = (a7q) this.b;
        hnf0Var2.i = l4;
        hnf0Var2.j = l3;
        hnf0Var2.k = str;
        hnf0Var2.l = cpcVar2;
        hnf0Var2.m = i2;
        hnf0Var2.n = z2;
        hnf0Var2.o = j3;
        hnf0Var2.r = 2;
        objB = ((xr) a7qVar.f384a).f(hnf0Var2);
        if (objB != obj) {
            Long l9 = l4;
            l5 = l3;
            cpcVar = cpcVar2;
            l6 = l9;
            z3 = z2;
            str2 = str;
            i3 = i2;
            j = j3;
            Iterable<xuf> iterable2 = (Iterable) objB;
            iA = wp20.a(r3d.q(iterable2, 10));
            if (iA < 16) {
                iA = 16;
            }
            j2 = j;
            l7 = l5;
            linkedHashMap = new LinkedHashMap(iA);
            while (r1.hasNext()) {
                linkedHashMap.put(xufVar.b, xufVar.f);
            }
            hnf0Var2.i = null;
            hnf0Var2.j = null;
            hnf0Var2.k = null;
            hnf0Var2.l = null;
            hnf0Var2.m = i3;
            hnf0Var2.n = z3;
            hnf0Var2.r = 3;
            vkr0Var = cpcVar.f4739a;
            if (z3) {
                list = (List) ((hw3) vkr0Var.d).f13752a.getValue();
                list2 = list;
                if (list == null) {
                    list2 = iun.f15405a;
                }
                if (l6 == null) {
                    zIsEmpty = list2.isEmpty();
                    objV = list2;
                    if (zIsEmpty) {
                        objV = vkr0Var.w(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
                    }
                } else {
                    objV = vkr0Var.w(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
                }
            } else {
                objV = vkr0Var.v(j2, l6, l7, str2, i3, linkedHashMap, hnf0Var2);
            }
            if (objV != obj) {
                return objV;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x023b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0245  */
    /* JADX WARN: Code duplicated, block: B:46:0x0251  */
    /* JADX WARN: Code duplicated, block: B:48:0x0254  */
    /* JADX WARN: Code duplicated, block: B:50:0x0257  */
    /* JADX WARN: Code duplicated, block: B:52:0x025a  */
    /* JADX WARN: Code duplicated, block: B:53:0x025e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0264  */
    /* JADX WARN: Code duplicated, block: B:56:0x0268  */
    /* JADX WARN: Code duplicated, block: B:57:0x026c  */
    /* JADX WARN: Code duplicated, block: B:61:0x028c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0298  */
    /* JADX WARN: Code duplicated, block: B:66:0x029b  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x02af  */
    /* JADX WARN: Code duplicated, block: B:74:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0303  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x032b, code lost:
    
        if (kotlin.Unit.f46060a == r10) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(java.util.List r31, a.q4f r32, a.g920 r33, a.kuw r34, long r35, java.lang.String r37, java.util.List r38, long r39, a.zje r41) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.V(java.util.List, a.q4f, a.g920, a.kuw, long, java.lang.String, java.util.List, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object W(long j, zje zjeVar, String str) {
        v5z v5zVar;
        Object g0g0Var;
        Throwable thA;
        ljg ljgVar;
        long j2;
        ueh uehVar;
        w5z w5zVar;
        long j3;
        ypl0 ypl0Var;
        Object objL;
        ueh uehVar2;
        ypl0 ypl0Var2;
        w5z w5zVar2;
        ljg ljgVar2;
        w0u0 w0u0Var;
        Object objU;
        ypl0 ypl0Var3;
        w0u0 w0u0Var2;
        ueh uehVar3;
        ljg ljgVar3;
        if (zjeVar instanceof v5z) {
            v5zVar = (v5z) zjeVar;
            int i = v5zVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5zVar.r = i - Integer.MIN_VALUE;
            } else {
                v5zVar = new v5z(this, zjeVar);
            }
        } else {
            v5zVar = new v5z(this, zjeVar);
        }
        v5z v5zVar2 = v5zVar;
        Object objA = v5zVar2.p;
        wne wneVar = wne.f39444a;
        int i2 = v5zVar2.r;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                v5zVar2.i = str;
                v5zVar2.j = this;
                v5zVar2.o = j;
                v5zVar2.r = 1;
                objA = A(str, v5zVar2);
                if (objA == wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                j = v5zVar2.o;
                this = v5zVar2.j;
                str = v5zVar2.i;
                z1x.P(objA);
            } else {
                if (i2 == 2) {
                    long j4 = v5zVar2.o;
                    ljg ljgVar4 = v5zVar2.k;
                    w5z w5zVar3 = v5zVar2.j;
                    z1x.P(objA);
                    j2 = j4;
                    this = w5zVar3;
                    ljgVar = ljgVar4;
                    uehVar = (ueh) objA;
                    j3c j3cVar = (j3c) this.c;
                    v5zVar2.i = null;
                    v5zVar2.j = this;
                    v5zVar2.k = ljgVar;
                    v5zVar2.l = uehVar;
                    v5zVar2.o = j2;
                    v5zVar2.r = 3;
                    objA = j3cVar.a(40L, j2, v5zVar2);
                    if (objA == wneVar) {
                        w5zVar = this;
                        j3 = j2;
                        ypl0Var = (ypl0) objA;
                        String str2 = ljgVar.b.c;
                        String str3 = ljgVar.c.c;
                        long j5 = ljgVar.f.f44687a;
                        v5zVar2.i = null;
                        v5zVar2.j = w5zVar;
                        v5zVar2.k = ljgVar;
                        v5zVar2.l = uehVar;
                        v5zVar2.m = ypl0Var;
                        v5zVar2.o = j3;
                        v5zVar2.r = 4;
                        objL = w5zVar.L(str2, str3, j5, v5zVar2);
                        if (objL != wneVar) {
                            ljg ljgVar5 = ljgVar;
                            uehVar2 = uehVar;
                            ypl0Var2 = ypl0Var;
                            objA = objL;
                            w5zVar2 = w5zVar;
                            ljgVar2 = ljgVar5;
                            w0u0Var = (w0u0) objA;
                            String str4 = ljgVar2.b.c;
                            String str5 = ljgVar2.c.c;
                            v5zVar2.i = null;
                            v5zVar2.j = null;
                            v5zVar2.k = ljgVar2;
                            v5zVar2.l = uehVar2;
                            v5zVar2.m = ypl0Var2;
                            v5zVar2.n = w0u0Var;
                            v5zVar2.o = j3;
                            v5zVar2.r = 5;
                            objU = w5zVar2.u(str4, str5, v5zVar2);
                            if (objU != wneVar) {
                                ypl0Var3 = ypl0Var2;
                                w0u0Var2 = w0u0Var;
                                uehVar3 = uehVar2;
                                ljgVar3 = ljgVar2;
                                objA = objU;
                            }
                        }
                    }
                    return wneVar;
                }
                if (i2 == 3) {
                    j3 = v5zVar2.o;
                    uehVar = v5zVar2.l;
                    ljgVar = v5zVar2.k;
                    w5zVar = v5zVar2.j;
                    z1x.P(objA);
                    ypl0Var = (ypl0) objA;
                    String str6 = ljgVar.b.c;
                    String str7 = ljgVar.c.c;
                    long j6 = ljgVar.f.f44687a;
                    v5zVar2.i = null;
                    v5zVar2.j = w5zVar;
                    v5zVar2.k = ljgVar;
                    v5zVar2.l = uehVar;
                    v5zVar2.m = ypl0Var;
                    v5zVar2.o = j3;
                    v5zVar2.r = 4;
                    objL = w5zVar.L(str6, str7, j6, v5zVar2);
                    if (objL != wneVar) {
                        ljg ljgVar6 = ljgVar;
                        uehVar2 = uehVar;
                        ypl0Var2 = ypl0Var;
                        objA = objL;
                        w5zVar2 = w5zVar;
                        ljgVar2 = ljgVar6;
                        w0u0Var = (w0u0) objA;
                        String str8 = ljgVar2.b.c;
                        String str9 = ljgVar2.c.c;
                        v5zVar2.i = null;
                        v5zVar2.j = null;
                        v5zVar2.k = ljgVar2;
                        v5zVar2.l = uehVar2;
                        v5zVar2.m = ypl0Var2;
                        v5zVar2.n = w0u0Var;
                        v5zVar2.o = j3;
                        v5zVar2.r = 5;
                        objU = w5zVar2.u(str8, str9, v5zVar2);
                        if (objU != wneVar) {
                            ypl0Var3 = ypl0Var2;
                            w0u0Var2 = w0u0Var;
                            uehVar3 = uehVar2;
                            ljgVar3 = ljgVar2;
                            objA = objU;
                        }
                    }
                    return wneVar;
                }
                if (i2 == 4) {
                    j3 = v5zVar2.o;
                    ypl0Var2 = v5zVar2.m;
                    uehVar2 = v5zVar2.l;
                    ljgVar2 = v5zVar2.k;
                    w5zVar2 = v5zVar2.j;
                    z1x.P(objA);
                    w0u0Var = (w0u0) objA;
                    String str10 = ljgVar2.b.c;
                    String str11 = ljgVar2.c.c;
                    v5zVar2.i = null;
                    v5zVar2.j = null;
                    v5zVar2.k = ljgVar2;
                    v5zVar2.l = uehVar2;
                    v5zVar2.m = ypl0Var2;
                    v5zVar2.n = w0u0Var;
                    v5zVar2.o = j3;
                    v5zVar2.r = 5;
                    objU = w5zVar2.u(str10, str11, v5zVar2);
                    if (objU != wneVar) {
                        ypl0Var3 = ypl0Var2;
                        w0u0Var2 = w0u0Var;
                        uehVar3 = uehVar2;
                        ljgVar3 = ljgVar2;
                        objA = objU;
                    }
                    return wneVar;
                }
                if (i2 != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w0u0 w0u0Var3 = v5zVar2.n;
                ypl0 ypl0Var4 = v5zVar2.m;
                ueh uehVar4 = v5zVar2.l;
                ljg ljgVar7 = v5zVar2.k;
                z1x.P(objA);
                w0u0Var2 = w0u0Var3;
                ypl0Var3 = ypl0Var4;
                uehVar3 = uehVar4;
                ljgVar3 = ljgVar7;
            }
            g0g0Var = new fzt0(ljgVar3, uehVar3, ypl0Var3, w0u0Var2, (qrh) objA);
            e0g0 e0g0Var2 = j0g0.b;
            thA = j0g0.a(g0g0Var);
            if (thA != null) {
                thA.printStackTrace();
            }
            return g0g0Var;
            ljg ljgVar8 = (ljg) objA;
            v5zVar2.i = null;
            v5zVar2.j = this;
            v5zVar2.k = ljgVar8;
            v5zVar2.o = j;
            v5zVar2.r = 2;
            Object objY = this.y(str, v5zVar2);
            if (objY != wneVar) {
                ljgVar = ljgVar8;
                objA = objY;
                j2 = j;
                uehVar = (ueh) objA;
                j3c j3cVar2 = (j3c) this.c;
                v5zVar2.i = null;
                v5zVar2.j = this;
                v5zVar2.k = ljgVar;
                v5zVar2.l = uehVar;
                v5zVar2.o = j2;
                v5zVar2.r = 3;
                objA = j3cVar2.a(40L, j2, v5zVar2);
                if (objA == wneVar) {
                    w5zVar = this;
                    j3 = j2;
                    ypl0Var = (ypl0) objA;
                    String str12 = ljgVar.b.c;
                    String str13 = ljgVar.c.c;
                    long j7 = ljgVar.f.f44687a;
                    v5zVar2.i = null;
                    v5zVar2.j = w5zVar;
                    v5zVar2.k = ljgVar;
                    v5zVar2.l = uehVar;
                    v5zVar2.m = ypl0Var;
                    v5zVar2.o = j3;
                    v5zVar2.r = 4;
                    objL = w5zVar.L(str12, str13, j7, v5zVar2);
                    if (objL != wneVar) {
                        ljg ljgVar9 = ljgVar;
                        uehVar2 = uehVar;
                        ypl0Var2 = ypl0Var;
                        objA = objL;
                        w5zVar2 = w5zVar;
                        ljgVar2 = ljgVar9;
                        w0u0Var = (w0u0) objA;
                        String str14 = ljgVar2.b.c;
                        String str15 = ljgVar2.c.c;
                        v5zVar2.i = null;
                        v5zVar2.j = null;
                        v5zVar2.k = ljgVar2;
                        v5zVar2.l = uehVar2;
                        v5zVar2.m = ypl0Var2;
                        v5zVar2.n = w0u0Var;
                        v5zVar2.o = j3;
                        v5zVar2.r = 5;
                        objU = w5zVar2.u(str14, str15, v5zVar2);
                        if (objU != wneVar) {
                            ypl0Var3 = ypl0Var2;
                            w0u0Var2 = w0u0Var;
                            uehVar3 = uehVar2;
                            ljgVar3 = ljgVar2;
                            objA = objU;
                            g0g0Var = new fzt0(ljgVar3, uehVar3, ypl0Var3, w0u0Var2, (qrh) objA);
                            e0g0 e0g0Var3 = j0g0.b;
                            thA = j0g0.a(g0g0Var);
                            if (thA != null) {
                                thA.printStackTrace();
                            }
                            return g0g0Var;
                        }
                    }
                }
            }
            return wneVar;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    public int X(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f38604a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((Intrinsics.e(cCharAt, 8192) < 0 || Intrinsics.e(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Serializable Y(int i, zje zjeVar) throws Throwable {
        efc0 efc0Var;
        Serializable g0g0Var;
        w5z w5zVar;
        Serializable serializable;
        if (zjeVar instanceof efc0) {
            efc0Var = (efc0) zjeVar;
            int i2 = efc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                efc0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                efc0Var = new efc0(this, zjeVar);
            }
        } else {
            efc0Var = new efc0(this, zjeVar);
        }
        efc0 efc0Var2 = efc0Var;
        Object objC = efc0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = efc0Var2.l;
        try {
            if (i3 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                jw20 jw20Var = (jw20) this.e;
                String strC = ((knf0) this.d).c();
                String strA = ((btt0) this.c).a();
                efc0Var2.i = this;
                efc0Var2.l = 1;
                objC = ((ufc0) ((rta0) jw20Var.b).invoke()).c(strC, i, strA, "application/vnd.xenvelop+json", efc0Var2);
                if (objC == wneVar) {
                    return wneVar;
                }
                w5zVar = this;
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w5zVar = efc0Var2.i;
                z1x.P(objC);
            }
            List list = ((phc0) ((dx5) objC).a()).f26990a;
            if (list != null) {
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zdx.N((mhc0) it.next()));
                }
                agc0 agc0Var = (agc0) w5zVar.f38604a;
                agc0Var.getClass();
                ArrayList arrayList2 = agc0Var.f818a;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                serializable = arrayList;
            } else {
                serializable = iun.f15405a;
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = serializable;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        ((agc0) this.f38604a).f818a.clear();
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Z(ouj0 ouj0Var, boolean z, zje zjeVar) {
        ca20 ca20Var;
        if (zjeVar instanceof ca20) {
            ca20Var = (ca20) zjeVar;
            int i = ca20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ca20Var.k = i - Integer.MIN_VALUE;
            } else {
                ca20Var = new ca20(this, zjeVar);
            }
        } else {
            ca20Var = new ca20(this, zjeVar);
        }
        Object objD0 = ca20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ca20Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.e).b;
            ys8 ys8Var = new ys8((Object) this, (Object) ouj0Var, z, (yje) null, (byte) 19);
            ca20Var.k = 1;
            objD0 = qjj.d0(dvjVar, ys8Var, ca20Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return l8x.t0((q16) objD0);
    }

    @Override // a.opb0
    public void a() {
        int dimension;
        tpb0 tpb0Var = (tpb0) this.f38604a;
        bqb0 bqb0Var = (bqb0) this.e;
        if (bqb0Var != null) {
            dimension = (int) tpb0Var.getResources().getDimension(bqb0Var.b);
        } else {
            dimension = 0;
        }
        Drawable drawable = (Drawable) this.d;
        if (drawable != null) {
            drawable.setBounds(dimension, dimension, tpb0Var.getMeasuredWidth() - dimension, tpb0Var.getMeasuredHeight() - dimension);
        }
        ((s1g) this.b).b(dimension, dimension, tpb0Var.getMeasuredWidth() - dimension, tpb0Var.getMeasuredHeight() - dimension);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a0(ouj0 ouj0Var, long j, boolean z, int i, zje zjeVar) {
        da20 da20Var;
        long j2;
        w5z w5zVar;
        ouj0 ouj0Var2;
        if (zjeVar instanceof da20) {
            da20Var = (da20) zjeVar;
            int i2 = da20Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                da20Var.o = i2 - Integer.MIN_VALUE;
            } else {
                da20Var = new da20(this, zjeVar);
            }
        } else {
            da20Var = new da20(this, zjeVar);
        }
        Object objD0 = da20Var.m;
        wne wneVar = wne.f39444a;
        int i3 = da20Var.o;
        if (i3 == 0) {
            z1x.P(objD0);
            long jW0 = ibc.w0(j, bfn.MILLISECONDS);
            da20Var.i = ouj0Var;
            da20Var.j = j;
            da20Var.k = z;
            da20Var.l = i;
            da20Var.o = 1;
            if (qcc.P(jW0, da20Var) != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            i = da20Var.l;
            z = da20Var.k;
            j = da20Var.j;
            ouj0Var = da20Var.i;
            z1x.P(objD0);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = da20Var.j;
            ouj0Var2 = da20Var.i;
            z1x.P(objD0);
            j2 = j3;
            w5zVar = this;
        }
        return w5zVar.e0((q16) objD0, ouj0Var2, j2);
        j2 = j;
        boolean z2 = z;
        int i4 = i;
        ouj0 ouj0Var3 = ouj0Var;
        dvj dvjVar = ((mne) this.e).b;
        w5zVar = this;
        eae eaeVar = new eae(w5zVar, ouj0Var3, z2, i4, (yje) null);
        da20Var.i = ouj0Var3;
        da20Var.j = j2;
        da20Var.k = z2;
        da20Var.l = i4;
        da20Var.o = 2;
        objD0 = qjj.d0(dvjVar, eaeVar, da20Var);
        if (objD0 != wneVar) {
            ouj0Var2 = ouj0Var3;
            return w5zVar.e0((q16) objD0, ouj0Var2, j2);
        }
        return wneVar;
    }

    @Override // a.ao80
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zn80) arrayList.get(i)).f44663a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b0(String str, double d, long j, zje zjeVar) {
        mkr0 mkr0Var;
        gkr0 gkr0Var = (gkr0) this.c;
        if (zjeVar instanceof mkr0) {
            mkr0Var = (mkr0) zjeVar;
            int i = mkr0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkr0Var.k = i - Integer.MIN_VALUE;
            } else {
                mkr0Var = new mkr0(this, zjeVar);
            }
        } else {
            mkr0Var = new mkr0(this, zjeVar);
        }
        Object objD = mkr0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mkr0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            roi0 roi0Var = (roi0) this.b;
            String strA = ((btt0) this.f38604a).a();
            Long l = new Long(j);
            Integer num = new Integer(gkr0Var.b().f20312a);
            okr0 okr0Var = (okr0) gkr0Var.b.getValue();
            Long l2 = new Long(okr0Var != null ? okr0Var.c : 0L);
            Map mapA = ((sd80) this.d).a();
            ArrayList arrayList = new ArrayList(mapA.size());
            Iterator it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(jtt0.t((Map.Entry) it.next()));
            }
            zkr0 zkr0Var = new zkr0(l, num, l2, arrayList, new Double(d), str);
            mkr0Var.k = 1;
            objD = ((gir0) ((lkr0) roi0Var.f30839a).invoke()).d(strA, zkr0Var, mkr0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return epv0.Z((nu) ((dx5) objD).a());
    }

    @Override // a.opb0
    public void c(dqb0 dqb0Var) {
        bqb0 bqb0Var = dqb0Var instanceof bqb0 ? (bqb0) dqb0Var : null;
        if (bqb0Var == null) {
            return;
        }
        List list = u0d.f34849a;
        Context context = ((tpb0) this.f38604a).getContext();
        context.getClass();
        u0d.s(context, bqb0Var.f3020a, null, Integer.valueOf(R.drawable.ic_power_of_power_player_placeholder), (List) ((n0o0) this.c).getValue(), new ppb0(this, (byte) 0), null, 34);
        this.e = bqb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object c0(ouj0 ouj0Var, long j, int i, zje zjeVar) {
        ea20 ea20Var;
        byte b;
        ouj0 ouj0Var2;
        long j2;
        if (zjeVar instanceof ea20) {
            ea20Var = (ea20) zjeVar;
            int i2 = ea20Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ea20Var.n = i2 - Integer.MIN_VALUE;
            } else {
                ea20Var = new ea20(this, zjeVar);
            }
        } else {
            ea20Var = new ea20(this, zjeVar);
        }
        Object objD0 = ea20Var.l;
        wne wneVar = wne.f39444a;
        int i3 = ea20Var.n;
        if (i3 == 0) {
            z1x.P(objD0);
            long jW0 = ibc.w0(j, bfn.MILLISECONDS);
            ea20Var.i = ouj0Var;
            ea20Var.j = j;
            ea20Var.k = i;
            ea20Var.n = 1;
            b = i;
            if (qcc.P(jW0, ea20Var) != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            byte b2 = ea20Var.k;
            j = ea20Var.j;
            ouj0Var = ea20Var.i;
            z1x.P(objD0);
            b = b2;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = ea20Var.j;
            ouj0Var2 = ea20Var.i;
            z1x.P(objD0);
        }
        return e0((q16) objD0, ouj0Var2, j2);
        dvj dvjVar = ((mne) this.e).b;
        xj1 xj1Var = new xj1(this, ouj0Var, b, (yje) null);
        ea20Var.i = ouj0Var;
        ea20Var.j = j;
        ea20Var.k = b;
        ea20Var.n = 2;
        objD0 = qjj.d0(dvjVar, xj1Var, ea20Var);
        if (objD0 != wneVar) {
            ouj0Var2 = ouj0Var;
            j2 = j;
            return e0((q16) objD0, ouj0Var2, j2);
        }
        return wneVar;
    }

    @Override // a.opb0
    public int d() {
        return 0;
    }

    @Override // a.ao80
    public float e() {
        return ((Number) ((a8z) this.d).getValue()).floatValue();
    }

    public pa20 e0(q16 q16Var, ouj0 ouj0Var, long j) throws m07 {
        pa20 pa20Var;
        String str;
        Long l;
        knf0 knf0Var = (knf0) this.d;
        gi7 gi7Var = (gi7) q16Var.d;
        if (gi7Var != null && (str = gi7Var.d) != null && !StringsKt.W(str)) {
            gi7 gi7Var2 = (gi7) q16Var.d;
            throw new m07(str, (gi7Var2 == null || (l = gi7Var2.e) == null) ? j : l.longValue());
        }
        pa20 pa20VarT0 = l8x.t0(q16Var);
        if (!(pa20VarT0 instanceof oa20)) {
            return pa20VarT0;
        }
        oa20 oa20Var = (oa20) pa20VarT0;
        String str2 = oa20Var.f24910a;
        long j2 = ouj0Var.f25881a;
        String strA = knf0Var.a();
        String strC = knf0Var.c();
        List<ru6> list = oa20Var.l;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ru6 ru6Var : list) {
            ru6Var.getClass();
            bzu bzuVar = new bzu((byte) 19);
            cww.F(bzuVar, "Coef", Double.valueOf(ru6Var.c));
            cww.F(bzuVar, "GameId", Long.valueOf(ru6Var.d));
            cww.F(bzuVar, "Kind", Integer.valueOf(ru6Var.e.f36034a));
            cww.G(bzuVar, "Param", new BigDecimal(String.valueOf(ru6Var.f)).toPlainString());
            cww.F(bzuVar, "PlayerId", Long.valueOf(ru6Var.g));
            cww.F(bzuVar, "Type", Long.valueOf(ru6Var.h));
            zfa0 zfa0Var = ru6Var.i;
            xfa0 xfa0Var = zfa0Var instanceof xfa0 ? (xfa0) zfa0Var : null;
            if (xfa0Var != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = xfa0Var.b.iterator();
                while (it.hasNext()) {
                    pa20 pa20Var2 = pa20VarT0;
                    jdy jdyVarB = ncy.b(Long.valueOf(((Number) it.next()).longValue()));
                    jdyVarB.getClass();
                    arrayList2.add(jdyVarB);
                    pa20VarT0 = pa20Var2;
                }
                pa20Var = pa20VarT0;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = xfa0Var.c.iterator();
                while (it2.hasNext()) {
                    jdy jdyVarB2 = ncy.b(Long.valueOf(((Number) it2.next()).longValue()));
                    jdyVarB2.getClass();
                    arrayList3.add(jdyVarB2);
                }
                bzuVar.h(new edy(linkedHashMap), "PlayersDuel");
            } else {
                pa20Var = pa20VarT0;
            }
            cww.F(bzuVar, "UiFeature", Integer.valueOf(ru6Var.j));
            Double d = ru6Var.k;
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                if (dDoubleValue != 0.0d) {
                    cww.F(bzuVar, "OptionLowerCf", Double.valueOf(dDoubleValue));
                }
            }
            arrayList.add(bzuVar.a());
            pa20VarT0 = pa20Var;
        }
        pa20 pa20Var3 = pa20VarT0;
        pxg0 pxg0Var = new pxg0(str2, j2, strA, strC, arrayList, ouj0Var.k, ouj0Var.f, ouj0Var.l, ouj0Var.g, ouj0Var.x, ouj0Var.h, ouj0Var.i, iun.f15405a);
        f920 f920Var = (f920) this.f38604a;
        f920Var.getClass();
        f920Var.f9135a = pxg0Var;
        return pa20Var3;
    }

    @Override // a.ao80
    public float f() {
        return ((Number) ((a8z) this.c).getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[Catch: all -> 0x0034, LOOP:0: B:29:0x0059->B:31:0x005d, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0076 -> B:35:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void f0(a.zje r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            a.q99 r0 = (a.q99) r0
            java.lang.Object r1 = r7.e
            a.xw3 r1 = (a.xw3) r1
            boolean r2 = r8 instanceof a.czb0
            if (r2 == 0) goto L1b
            r2 = r8
            a.czb0 r2 = (a.czb0) r2
            int r3 = r2.l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.l = r3
            goto L20
        L1b:
            a.czb0 r2 = new a.czb0
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.j
            a.wne r3 = a.wne.f39444a
            int r4 = r2.l
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L36
            int r4 = r2.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L34
            goto L79
        L34:
            r8 = move-exception
            goto L7e
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return
        L3c:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L34
            goto L4c
        L40:
            a.z1x.P(r8)
        L43:
            r2.l = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.g(r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L4c
            goto L78
        L4c:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L4f:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L43
            java.lang.Object r8 = r0.j()     // Catch: java.lang.Throwable -> L34
        L59:
            boolean r4 = r8 instanceof a.ytb     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L68
            a.ztb.c(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.j()     // Catch: java.lang.Throwable -> L34
            goto L59
        L68:
            int r4 = r1.c     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L34
            a.ens r8 = (a.ens) r8     // Catch: java.lang.Throwable -> L34
            r2.i = r4     // Catch: java.lang.Throwable -> L34
            r2.l = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.invoke(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L79
        L78:
            return
        L79:
            int r8 = r1.c     // Catch: java.lang.Throwable -> L34
            if (r4 != r8) goto L4f
            goto L43
        L7e:
            r7.h0(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.f0(a.zje):void");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi g(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f38604a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(F(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:41|42|43|106|44|45|118|46|(3:49|114|50)|48|95) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:116|34) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:49|114|50) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:112|32|(2:116|34)(1:38)|108|39|(11:41|42|43|106|44|45|118|46|(3:49|114|50)|48|95)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0236  */
    /* JADX WARN: Code duplicated, block: B:103:0x023e  */
    /* JADX WARN: Code duplicated, block: B:112:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7 A[Catch: all -> 0x0188, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0188, blocks: (B:32:0x00e0, B:41:0x00f7), top: B:112:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0229  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        if (r0 == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        r17 = r7;
        r7 = r5;
        r5 = r14;
        r13 = r12;
        r12 = r10;
        r9 = r8;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        r15 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0189, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0197 -> B:31:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01d0 -> B:82:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01d6 -> B:82:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0212 -> B:97:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x021d -> B:83:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0229 -> B:82:0x01d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g0(java.lang.String r21, java.lang.String r22, a.zje r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.g0(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    public void h(List list) {
        n660 n660Var = (n660) this.b;
        n660Var.j();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((jkp) it.next()).f16682a));
        }
        n660Var.b(arrayList);
    }

    public void h0(Throwable th) {
        xw3 xw3Var = (xw3) this.e;
        q99 q99Var = (q99) this.d;
        if (q99Var.e(th, false)) {
            for (Object objJ = q99Var.j(); !(objJ instanceof ytb); objJ = q99Var.j()) {
                ztb.c(objJ);
                xw3Var.addLast(objJ);
            }
            if (xw3Var.isEmpty()) {
                return;
            }
            ((Function1) this.f38604a).invoke(new ArrayList(xw3Var));
            xw3Var.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0079 -> B:30:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(a.zje r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a.cv00
            if (r0 == 0) goto L13
            r0 = r10
            a.cv00 r0 = (a.cv00) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.cv00 r0 = new a.cv00
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            java.util.Iterator r2 = r0.i
            a.z1x.P(r10)
            goto L7c
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L34:
            a.z1x.P(r10)
            goto L4a
        L38:
            a.z1x.P(r10)
            java.lang.Object r10 = r9.c
            a.znt r10 = (a.znt) r10
            r0.l = r5
            a.chf0 r10 = r10.f44690a
            java.io.Serializable r10 = r10.p(r0)
            if (r10 != r1) goto L4a
            goto L7b
        L4a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L5a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5a
            goto L85
        L5a:
            java.util.Iterator r10 = r10.iterator()
            r2 = r10
        L5f:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L85
            java.lang.Object r10 = r2.next()
            a.qu6 r10 = (a.qu6) r10
            java.lang.Object r6 = r9.d
            a.z7u r6 = (a.z7u) r6
            long r7 = r10.B
            r0.i = r2
            r0.l = r4
            java.lang.Object r10 = r6.c(r7, r0)
            if (r10 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L5f
            r3 = r5
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.i(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i0(zje zjeVar) {
        ga20 ga20Var;
        if (zjeVar instanceof ga20) {
            ga20Var = (ga20) zjeVar;
            int i = ga20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ga20Var.k = i - Integer.MIN_VALUE;
            } else {
                ga20Var = new ga20(this, zjeVar);
            }
        } else {
            ga20Var = new ga20(this, zjeVar);
        }
        Object objD0 = ga20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ga20Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            pxg0 pxg0Var = ((f920) this.f38604a).f9135a;
            if (pxg0Var == null) {
                throw new ss3();
            }
            dvj dvjVar = ((mne) this.e).b;
            mq10 mq10Var = new mq10((Object) this, (Object) pxg0Var, yjeVar, (byte) 5);
            ga20Var.k = 1;
            objD0 = qjj.d0(dvjVar, mq10Var, ga20Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        q16 q16Var = (q16) objD0;
        if (q16Var.c != i2o.BetAlreadySaved) {
            return (String) q16Var.a();
        }
        String str = (String) q16Var.d;
        if (str != null) {
            return str;
        }
        jf4.k(null);
        return null;
    }

    public uw9 j(fy9 fy9Var, Map map, Map map2) {
        fy9Var.getClass();
        map.getClass();
        map2.getClass();
        qcq0 qcq0Var = (qcq0) this.f38604a;
        tz9 tz9Var = (tz9) this.b;
        lrm0 lrm0Var = (lrm0) this.c;
        bsm0 bsm0Var = (bsm0) this.e;
        jx9 jx9Var = (jx9) this.d;
        jx9Var.getClass();
        jx9Var.b.getClass();
        b1a b1aVar = c1a.a0;
        c1a c1aVarA = jx9Var.f17293a.a(tz9Var.f34794a);
        b1aVar.getClass();
        return new uw9(fy9Var, qcq0Var, map, map2, lrm0Var, bsm0Var, b1a.c(c1aVarA));
    }

    public void j0(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.f38604a).put(str, obj);
        qz40 qz40Var = (qz40) ((LinkedHashMap) this.c).get(str);
        if (qz40Var != null) {
            ((p7m0) qz40Var).n(obj);
        }
        qz40 qz40Var2 = (qz40) ((LinkedHashMap) this.d).get(str);
        if (qz40Var2 != null) {
            ((p7m0) qz40Var2).n(obj);
        }
    }

    @Override // a.opb0
    public void k(Canvas canvas) {
        ((s1g) this.b).a(canvas);
        Drawable drawable = (Drawable) this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public boolean k0(Object obj) {
        return !(((q99) this.d).f(obj) instanceof ytb);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object m(List list, long j, long j2, String str, zje zjeVar) {
        z920 z920Var;
        String str2;
        if (zjeVar instanceof z920) {
            z920Var = (z920) zjeVar;
            int i = z920Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                z920Var.l = i - Integer.MIN_VALUE;
            } else {
                z920Var = new z920(this, zjeVar);
            }
        } else {
            z920Var = new z920(this, zjeVar);
        }
        Object objD0 = z920Var.j;
        wne wneVar = wne.f39444a;
        int i2 = z920Var.l;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.e).b;
            xw4 xw4Var = new xw4((byte) 2, j2, j, null, this, list);
            str2 = str;
            z920Var.i = str2;
            z920Var.l = 1;
            objD0 = qjj.d0(dvjVar, xw4Var, z920Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = z920Var.i;
            z1x.P(objD0);
        }
        return new a40(str2, ((Number) ((q16) objD0).a()).doubleValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable n(zje zjeVar) {
        wrl0 wrl0Var;
        if (zjeVar instanceof wrl0) {
            wrl0Var = (wrl0) zjeVar;
            int i = wrl0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrl0Var.l = i - Integer.MIN_VALUE;
            } else {
                wrl0Var = new wrl0(this, zjeVar);
            }
        } else {
            wrl0Var = new wrl0(this, zjeVar);
        }
        Object objD = wrl0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = wrl0Var.l;
        if (i2 == 0) {
            z1x.P(objD);
            sjl0 sjl0Var = (sjl0) this.f38604a;
            wrl0Var.i = this;
            wrl0Var.l = 1;
            objD = sjl0Var.d(wrl0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = wrl0Var.i;
            z1x.P(objD);
        }
        Iterable<ril0> iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (ril0 ril0Var : iterable) {
            ril0Var.getClass();
            arrayList.add(new jkp(60, ril0Var.f30549a, 0L, ril0Var.b, null, false));
        }
        this.getClass();
        int iA = wp20.a(r3d.q(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : arrayList) {
            linkedHashMap.put(Long.valueOf(((jkp) obj).f16682a), obj);
        }
        esg0 esg0Var = (esg0) this.c;
        List listA = ((t52) esg0Var.b).a();
        if (listA.isEmpty()) {
            String strC = q7d0.c((q7d0) esg0Var.e, "saved_allowed_sport_ids");
            if (strC == null) {
                listA = iun.f15405a;
            } else {
                vby vbyVar = (vby) esg0Var.f;
                vbyVar.getClass();
                listA = (List) vbyVar.b(new zw3(s710.f31729a, (byte) 0), strC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            jkp jkpVar = (jkp) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
            if (jkpVar != null) {
                arrayList2.add(jkpVar);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:32:0x007f->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(int i, zje zjeVar, boolean z) {
        xrl0 xrl0Var;
        List<jkp> list;
        List list2;
        boolean z2;
        Iterator it;
        if (zjeVar instanceof xrl0) {
            xrl0Var = (xrl0) zjeVar;
            int i2 = xrl0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xrl0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                xrl0Var = new xrl0(this, zjeVar);
            }
        } else {
            xrl0Var = new xrl0(this, zjeVar);
        }
        Object objN = xrl0Var.l;
        Serializable serializable = wne.f39444a;
        int i3 = xrl0Var.n;
        if (i3 == 0) {
            z1x.P(objN);
            xrl0Var.i = z;
            xrl0Var.j = i;
            xrl0Var.n = 1;
            objN = n(xrl0Var);
            if (objN != serializable) {
            }
            return serializable;
        }
        if (i3 == 1) {
            i = xrl0Var.j;
            z = xrl0Var.i;
            z1x.P(objN);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = xrl0Var.k;
            z1x.P(objN);
        }
        list2 = (List) objN;
        for (jkp jkpVar : list) {
            z2 = false;
            if (list2 == null || !list2.isEmpty()) {
                it = list2.iterator();
                while (it.hasNext()) {
                    if (((jkp) it.next()).f16682a == jkpVar.f16682a) {
                        z2 = true;
                        break;
                    }
                }
            }
            jkpVar.e = z2;
        }
        return list;
        List list3 = (List) objN;
        xrl0Var.k = list3;
        xrl0Var.i = z;
        xrl0Var.j = i;
        xrl0Var.n = 2;
        Serializable serializableH = H(i, xrl0Var, z);
        if (serializableH != serializable) {
            objN = serializableH;
            list = list3;
            list2 = (List) objN;
            while (r9.hasNext()) {
                z2 = false;
                if (list2 == null) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((jkp) it.next()).f16682a == jkpVar.f16682a) {
                            z2 = true;
                            break;
                            break;
                        }
                    }
                } else {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((jkp) it.next()).f16682a == jkpVar.f16682a) {
                            z2 = true;
                            break;
                            break;
                        }
                    }
                }
                jkpVar.e = z2;
            }
            return list;
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable p(long j, int i, boolean z, jvn jvnVar, y9s y9sVar, long j2, zje zjeVar) {
        k8r0 k8r0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof k8r0) {
            k8r0Var = (k8r0) zjeVar;
            int i2 = k8r0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k8r0Var.m = i2 - Integer.MIN_VALUE;
            } else {
                k8r0Var = new k8r0(this, zjeVar);
            }
        } else {
            k8r0Var = new k8r0(this, zjeVar);
        }
        Object objA = k8r0Var.k;
        wne wneVar = wne.f39444a;
        int i3 = k8r0Var.m;
        if (i3 == 0) {
            z1x.P(objA);
            epi0 epi0Var = (epi0) this.f38604a;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            jvnVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            e3c.o(linkedHashMap, jvnVar);
            ulb.m0(linkedHashMap, i);
            ulb.K(iB, linkedHashMap);
            ulb.P(linkedHashMap);
            ulb.V(linkedHashMap, strC);
            linkedHashMap.put("ref", 1);
            ulb.l0(linkedHashMap, z, j);
            tlb.m0(22, linkedHashMap);
            k8r0Var.j = y9sVar;
            k8r0Var.i = j2;
            k8r0Var.m = 1;
            objA = ((f8r0) ((enj0) epi0Var.b).invoke()).a(linkedHashMap, new fk9(false), k8r0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = k8r0Var.i;
            y9sVar = k8r0Var.j;
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nas nasVarD0 = ay3.d0((rt10) it.next(), sip.b, j2);
            if (nasVarD0 != null) {
                arrayList.add(nasVarD0);
            }
        }
        j8r0 j8r0Var = (j8r0) this.c;
        j8r0Var.getClass();
        y9sVar.getClass();
        ir30 ir30Var = (ir30) j8r0Var.f16100a.get(y9sVar);
        if (ir30Var != null) {
            ir30Var.d(arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable q(boolean z, boolean z2, long j, int i, jvn jvnVar, boolean z3, y9s y9sVar, zje zjeVar) {
        l8r0 l8r0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof l8r0) {
            l8r0Var = (l8r0) zjeVar;
            int i2 = l8r0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l8r0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                l8r0Var = new l8r0(this, zjeVar);
            }
        } else {
            l8r0Var = new l8r0(this, zjeVar);
        }
        Object objA = l8r0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = l8r0Var.l;
        if (i3 == 0) {
            z1x.P(objA);
            ilp0 ilp0Var = (ilp0) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            jvnVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            e3c.o(linkedHashMap, jvnVar);
            ulb.m0(linkedHashMap, i);
            ulb.K(iB, linkedHashMap);
            ulb.P(linkedHashMap);
            ulb.S(linkedHashMap, z2);
            ulb.V(linkedHashMap, strC);
            linkedHashMap.put("ref", 1);
            ulb.l0(linkedHashMap, z3, j);
            tlb.m0(22, linkedHashMap);
            l8r0Var.i = y9sVar;
            l8r0Var.l = 1;
            objA = ((m8r0) ((enj0) ilp0Var.f14992a).invoke()).a(linkedHashMap, new fk9(false), l8r0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y9sVar = l8r0Var.i;
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nas nasVarD0 = ay3.d0((rt10) it.next(), sip.c, 0L);
            if (nasVarD0 != null) {
                arrayList.add(nasVarD0);
            }
        }
        j8r0 j8r0Var = (j8r0) this.c;
        j8r0Var.getClass();
        y9sVar.getClass();
        ir30 ir30Var = (ir30) j8r0Var.f16100a.get(y9sVar);
        if (ir30Var != null) {
            ir30Var.d(arrayList);
        }
        return arrayList;
    }

    public gmq r(y9s y9sVar) {
        j8r0 j8r0Var = (j8r0) this.c;
        j8r0Var.getClass();
        ir30 ir30Var = (ir30) j8r0Var.f16100a.get(y9sVar);
        if (ir30Var != null) {
            return ir30Var.c();
        }
        return new eu4(null, (byte) 12);
    }

    public List s(y9s y9sVar) {
        j8r0 j8r0Var = (j8r0) this.c;
        j8r0Var.getClass();
        ir30 ir30Var = (ir30) j8r0Var.f16100a.get(y9sVar);
        List list = ir30Var != null ? (List) ir30Var.b() : null;
        return list == null ? iun.f15405a : list;
    }

    public p6d t(boolean z) {
        gzq0 gzq0Var = (gzq0) this.c;
        return z ? gzq0Var.f12193a.c() : gzq0Var.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(String str, String str2, zje zjeVar) {
        r5z r5zVar;
        Object g0g0Var;
        if (zjeVar instanceof r5z) {
            r5zVar = (r5z) zjeVar;
            int i = r5zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5zVar.k = i - Integer.MIN_VALUE;
            } else {
                r5zVar = new r5z(this, zjeVar);
            }
        } else {
            r5zVar = new r5z(this, zjeVar);
        }
        Object objE = r5zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = r5zVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objE);
                e0g0 e0g0Var = j0g0.b;
                ezt eztVar = (ezt) this.e;
                r5zVar.k = 1;
                objE = eztVar.f8685a.e(str, str2, r5zVar);
                if (objE == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objE);
            }
            g0g0Var = (qrh) objE;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        iun iunVar = iun.f15405a;
        return g0g0Var instanceof g0g0 ? new qrh(new vrh(iunVar, iunVar, "", ""), new vrh(iunVar, iunVar, "", "")) : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(int i, zje zjeVar) {
        yrl0 yrl0Var;
        if (zjeVar instanceof yrl0) {
            yrl0Var = (yrl0) zjeVar;
            int i2 = yrl0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yrl0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                yrl0Var = new yrl0(this, zjeVar);
            }
        } else {
            yrl0Var = new yrl0(this, zjeVar);
        }
        Object objN = yrl0Var.j;
        Object obj = wne.f39444a;
        int i3 = yrl0Var.l;
        if (i3 == 0) {
            z1x.P(objN);
            yrl0Var.i = i;
            yrl0Var.l = 1;
            objN = n(yrl0Var);
            if (objN == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = yrl0Var.i;
            z1x.P(objN);
        }
        Iterable<jkp> iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (jkp jkpVar : iterable) {
            jkpVar.e = true;
            arrayList.add(jkpVar);
        }
        List listD0 = CollectionsKt.D0(arrayList, i);
        h(listD0);
        return listD0;
    }

    public float w(int i, boolean z) {
        Layout layout = (Layout) this.f38604a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|67|22|(1:25)|60) */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        r9 = r13;
        r13 = r10;
        r10 = r11;
        r11 = r9;
        r6 = r12;
        r12 = r0;
        r0 = r2;
        r2 = r14;
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f5 -> B:13:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.util.List r11, java.lang.String r12, boolean r13, a.zje r14) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5z.x(java.util.List, java.lang.String, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(String str, zje zjeVar) {
        s5z s5zVar;
        Object g0g0Var;
        if (zjeVar instanceof s5z) {
            s5zVar = (s5z) zjeVar;
            int i = s5zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5zVar.k = i - Integer.MIN_VALUE;
            } else {
                s5zVar = new s5z(this, zjeVar);
            }
        } else {
            s5zVar = new s5z(this, zjeVar);
        }
        Object objF = s5zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = s5zVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                e0g0 e0g0Var = j0g0.b;
                uyn uynVar = (uyn) this.b;
                s5zVar.k = 1;
                objF = ((xex) uynVar.f36498a).F(str, s5zVar);
                if (objF == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objF);
            }
            g0g0Var = (ueh) objF;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iun iunVar = iun.f15405a;
        return g0g0Var instanceof g0g0 ? new ueh(0, iunVar, new qeh(iunVar, new ieh(iunVar, iunVar))) : g0g0Var;
    }

    public float z(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f38604a;
        if (!z2) {
            return w(i, z);
        }
        int I = g7x.I(layout, i, z2);
        int lineStart = layout.getLineStart(I);
        int lineEnd = layout.getLineEnd(I);
        if (i != lineStart && i != lineEnd) {
            return w(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return w(i, z);
        }
        int iE = E(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(F(iE))) == -1;
        int iX = X(lineEnd, lineStart);
        int iF = F(iE);
        int i4 = lineStart - iF;
        int i5 = iX - iF;
        Bidi bidiG = g(iE);
        Bidi bidiCreateLineBidi = bidiG != null ? bidiG.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(I) : layout.getLineRight(I);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        m6z[] m6zVarArr = new m6z[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            m6zVarArr[i6] = new m6z(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, m6zVarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (m6zVarArr[i8].f21295a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == m6zVarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(I);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(m6zVarArr[i3 - 1].f21295a) : layout.getPrimaryHorizontal(m6zVarArr[i3 + 1].f21295a);
            }
            return layout.getLineRight(I);
        }
        int iX2 = i > iX ? X(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (m6zVarArr[i9].b == iX2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == m6zVarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(I);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(m6zVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(m6zVarArr[i2 + 1].b);
        }
        return layout.getLineRight(I);
    }

    public w5z(pzu pzuVar, p4u p4uVar, ivn ivnVar, p4u p4uVar2, hg5 hg5Var) {
        hg5Var.getClass();
        this.f38604a = pzuVar;
        this.b = p4uVar;
        this.c = ivnVar;
        this.d = p4uVar2;
        this.e = hg5Var;
    }

    public w5z(tpb0 tpb0Var) {
        this.f38604a = tpb0Var;
        s1g s1gVar = new s1g(tpb0Var, R.color.static_black_40);
        s1gVar.b = R.color.cyber_synthetic_power_of_power_player_bg;
        Context context = tpb0Var.getContext();
        context.getClass();
        s1gVar.c.setColor(sj3.P(R.color.cyber_synthetic_power_of_power_player_bg, context));
        s1gVar.c(tpb0Var.getResources().getDimension(R.dimen.corner_radius_8));
        this.b = s1gVar;
        this.c = maz.b(new ssa0(this, (byte) 8));
    }

    public w5z(agc0 agc0Var, xyt xytVar, btt0 btt0Var, knf0 knf0Var, jw20 jw20Var) {
        agc0Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f38604a = agc0Var;
        this.b = xytVar;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = jw20Var;
    }

    public w5z(on4 on4Var, ik4 ik4Var, gst0 gst0Var, rrc rrcVar, nr nrVar) {
        gst0Var.getClass();
        this.f38604a = on4Var;
        this.b = ik4Var;
        this.c = gst0Var;
        this.d = rrcVar;
        this.e = nrVar;
    }

    public w5z(h7q h7qVar, ort ortVar, ahu ahuVar, nou nouVar, uzc uzcVar) {
        h7qVar.getClass();
        this.f38604a = h7qVar;
        this.b = ortVar;
        this.c = ahuVar;
        this.d = nouVar;
        this.e = uzcVar;
    }

    public w5z(f7u f7uVar, f4u f4uVar, a1d a1dVar, pru pruVar) {
        this.f38604a = f7uVar;
        this.b = f4uVar;
        this.c = a1dVar;
        this.d = pruVar;
        this.e = maz.b(new pu50(this, (byte) 6));
    }

    public w5z(nv20 nv20Var, knf0 knf0Var, bca0 bca0Var, mne mneVar, kuy kuyVar) {
        knf0Var.getClass();
        bca0Var.getClass();
        kuyVar.getClass();
        this.f38604a = nv20Var;
        this.b = knf0Var;
        this.c = bca0Var;
        this.d = mneVar;
        this.e = kuyVar;
    }

    public w5z(soc socVar, nbu nbuVar, ntu ntuVar, kc60 kc60Var, pru pruVar) {
        ntuVar.getClass();
        this.f38604a = socVar;
        this.b = nbuVar;
        this.c = ntuVar;
        this.d = kc60Var;
        this.e = pruVar;
    }

    public w5z(sjl0 sjl0Var, n660 n660Var, esg0 esg0Var, q7d0 q7d0Var, vby vbyVar) {
        sjl0Var.getClass();
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f38604a = sjl0Var;
        this.b = n660Var;
        this.c = esg0Var;
        this.d = q7d0Var;
        this.e = vbyVar;
    }

    public w5z(ok50 ok50Var, yk50 yk50Var, gzq0 gzq0Var, knf0 knf0Var, sjl0 sjl0Var) {
        gzq0Var.getClass();
        knf0Var.getClass();
        sjl0Var.getClass();
        this.f38604a = ok50Var;
        this.b = yk50Var;
        this.c = gzq0Var;
        this.d = knf0Var;
        this.e = sjl0Var;
    }

    public w5z(ljf0 ljf0Var, roi0 roi0Var, knf0 knf0Var, sjl0 sjl0Var, mne mneVar) {
        knf0Var.getClass();
        sjl0Var.getClass();
        this.f38604a = ljf0Var;
        this.b = roi0Var;
        this.c = knf0Var;
        this.d = sjl0Var;
        this.e = mneVar;
    }

    public w5z(Context context, String str, String str2) {
        context.getClass();
        this.f38604a = context;
        this.e = str2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("oksdkprefs", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().putString(HiAnalyticsConstant.BI_KEY_APP_ID, str).putString("app_key", str2).apply();
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("oksdkprefs", 0);
        sharedPreferences2.getClass();
        this.b = sharedPreferences2.getString("acctkn", null);
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("oksdkprefs", 0);
        sharedPreferences3.getClass();
        this.c = sharedPreferences3.getString("ssk", null);
        SharedPreferences sharedPreferences4 = context.getSharedPreferences("oksdkprefs", 0);
        sharedPreferences4.getClass();
        this.d = sharedPreferences4.getString("ok_sdk_tkn", null);
        new ConcurrentLinkedQueue();
        context.getSharedPreferences("ok.payment", 0).getClass();
    }

    public w5z(epi0 epi0Var, ilp0 ilp0Var, j8r0 j8r0Var, knf0 knf0Var, rrt0 rrt0Var) {
        j8r0Var.getClass();
        knf0Var.getClass();
        rrt0Var.getClass();
        this.f38604a = epi0Var;
        this.b = ilp0Var;
        this.c = j8r0Var;
        this.d = knf0Var;
        this.e = rrt0Var;
    }

    public w5z(btt0 btt0Var, roi0 roi0Var, gkr0 gkr0Var, sd80 sd80Var, knf0 knf0Var) {
        btt0Var.getClass();
        gkr0Var.getClass();
        sd80Var.getClass();
        knf0Var.getClass();
        this.f38604a = btt0Var;
        this.b = roi0Var;
        this.c = gkr0Var;
        this.d = sd80Var;
        this.e = knf0Var;
    }

    public w5z(a13 a13Var) {
        this.f38604a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public w5z(Map map) {
        map.getClass();
        this.f38604a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ufd(this, (byte) 4);
    }

    public w5z(Layout layout) {
        this.f38604a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iU = StringsKt.U('\n', length, 4, ((Layout) this.f38604a).getText());
            length = iU < 0 ? ((Layout) this.f38604a).getText().length() : iU + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f38604a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public w5z(qgd qgdVar) {
        this.f38604a = (b930) qgdVar.b;
        this.b = (g9m0) qgdVar.d;
        this.c = (ub00) qgdVar.e;
        this.d = (gst) qgdVar.f;
        this.e = (pv00) qgdVar.h;
    }

    public w5z(f920 f920Var, abu abuVar, btt0 btt0Var, knf0 knf0Var, mne mneVar) {
        f920Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f38604a = f920Var;
        this.b = abuVar;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public /* synthetic */ w5z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f38604a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public w5z(wdk0 wdk0Var, mne mneVar, ctf0 ctf0Var, ii iiVar, ux00 ux00Var, svu svuVar) {
        wdk0Var.getClass();
        ctf0Var.getClass();
        iiVar.getClass();
        this.f38604a = wdk0Var;
        this.b = mneVar;
        this.c = ctf0Var;
        this.d = iiVar;
        this.e = svuVar;
    }

    public w5z(qcq0 qcq0Var, tz9 tz9Var, lrm0 lrm0Var, jx9 jx9Var, bsm0 bsm0Var) {
        qcq0Var.getClass();
        jx9Var.getClass();
        bsm0Var.getClass();
        this.f38604a = qcq0Var;
        this.b = tz9Var;
        this.c = lrm0Var;
        this.d = jx9Var;
        this.e = bsm0Var;
    }

    public w5z(vft vftVar, ens ensVar) {
        this.f38604a = vftVar;
        this.b = ensVar;
        this.c = o2e.X(false);
        this.d = vtb.d(Integer.MAX_VALUE, null, new ppb0(this, (byte) 2), 2);
        this.e = new xw3();
    }
}
