package a;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public abstract class up90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f36053a = new IntRange(1300, 5000, 1);

    /* JADX WARN: Code duplicated, block: B:210:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:214:0x0417  */
    /* JADX WARN: Code duplicated, block: B:216:0x0425  */
    /* JADX WARN: Code duplicated, block: B:217:0x042a  */
    /* JADX WARN: Code duplicated, block: B:220:0x042f  */
    /* JADX WARN: Code duplicated, block: B:222:0x043e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0443  */
    /* JADX WARN: Code duplicated, block: B:227:0x044b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0450  */
    /* JADX WARN: Code duplicated, block: B:229:0x0455  */
    /* JADX WARN: Code duplicated, block: B:232:0x0464  */
    /* JADX WARN: Code duplicated, block: B:233:0x046d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0486  */
    /* JADX WARN: Code duplicated, block: B:238:0x048b  */
    /* JADX WARN: Code duplicated, block: B:240:0x0495  */
    /* JADX WARN: Code duplicated, block: B:246:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:252:0x04af  */
    /* JADX WARN: Code duplicated, block: B:254:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:258:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:261:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:264:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:267:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0511  */
    /* JADX WARN: Code duplicated, block: B:273:0x0523  */
    /* JADX WARN: Code duplicated, block: B:276:0x0538  */
    /* JADX WARN: Code duplicated, block: B:278:0x0558 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x055c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    public static final void a(mm40 mm40Var, hr90 hr90Var, Locale locale, tcj tcjVar, rgq0 rgq0Var, kyf kyfVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        tcj tcjVar2;
        rgq0 rgq0Var2;
        mm40 mm40Var3;
        kyf kyfVar2;
        fet fetVar2;
        kyf kyfVar3;
        int i4;
        tcj tcjVar3;
        mm40 mm40Var4;
        rgq0 rgq0Var3;
        List listJ;
        eav0 eav0Var;
        int i5;
        Object obj;
        boolean z;
        Integer numValueOf;
        List list;
        ArrayList arrayList;
        Iterator it;
        int i6;
        boolean z2;
        tcj tcjVar4;
        rgq0 rgq0Var4;
        boolean z3;
        boolean z4;
        int iNextInt;
        Integer num;
        eav0 eav0Var2;
        boolean z5;
        boolean z6;
        Integer numValueOf2;
        SnapshotStateList snapshotStateList;
        v9v0 v9v0Var;
        int iOrdinal;
        boolean z7;
        eav0 eav0Var3;
        Iterator it2;
        u9v0 u9v0Var;
        boolean z8;
        tcj tcjVar5;
        Iterator it3;
        u9v0 u9v0Var2;
        int iIntValue;
        boolean zF;
        boolean z9;
        boolean z10;
        int size;
        int i7;
        cav0 cav0Var;
        Boolean bool;
        boolean zBooleanValue;
        int i8;
        mm40 mm40Var5;
        kyf kyfVar4;
        tcj tcjVar6;
        byte b;
        Object obj2;
        boolean z11;
        boolean z12;
        Object obj3;
        fet fetVar3;
        fet fetVar4;
        int i9;
        int i10;
        tcj tcjVar7 = tcjVar;
        rgq0 rgq0Var5 = rgq0Var;
        fet fetVar5 = fetVar;
        hr90Var.getClass();
        fetVar5.g0(576585079);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar5.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar5.g(hr90Var) : fetVar5.i(hr90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar5.g(locale) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) != 0) {
                i10 = 1024;
            } else if ((i & 4096) == 0 ? fetVar5.g(tcjVar7) : fetVar5.i(tcjVar7)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i9 = 8192;
            } else if ((32768 & i) == 0 ? fetVar5.g(rgq0Var5) : fetVar5.i(rgq0Var5)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if (fetVar5.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar5.Z();
            if ((i & 1) == 0 || fetVar5.B()) {
                mm40 mm40Var6 = i11 != 0 ? jm40.b : mm40Var2;
                if ((i2 & 8) != 0) {
                    tcjVar7 = new tcj(null, null, null, 31);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    rgq0Var5 = new rgq0(false, null, null, new zgp0((byte) 29));
                    i3 &= -57345;
                }
                kyfVar3 = new kyf();
                i4 = i3 & (-458753);
                rgq0 rgq0Var6 = rgq0Var5;
                tcjVar3 = tcjVar7;
                mm40Var4 = mm40Var6;
                rgq0Var3 = rgq0Var6;
            } else {
                fetVar5.X();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                rgq0Var3 = rgq0Var5;
                tcjVar3 = tcjVar7;
                mm40Var4 = mm40Var2;
                kyfVar3 = kyfVar;
            }
            fetVar5.s();
            Context context = (Context) fetVar5.k(dy2.b);
            int i12 = i4 & 896;
            int i13 = i12 ^ 384;
            boolean z13 = (i13 > 256 && fetVar5.g(locale)) || (i4 & 384) == 256;
            Object objP = fetVar5.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj4 = objP;
            if (z13 || objP == cl5Var) {
                context.getClass();
                String string = Settings.System.getString(context.getContentResolver(), "time_12_24");
                Boolean bool2 = Intrinsics.d(string, "24") ? Boolean.TRUE : Intrinsics.d(string, "12") ? Boolean.FALSE : null;
                Boolean boolValueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : d9x.I(locale).b());
                fetVar5.o0(boolValueOf);
                obj4 = boolValueOf;
            }
            Boolean bool3 = (Boolean) obj4;
            boolean zBooleanValue2 = bool3.booleanValue();
            if (hr90Var instanceof fr90) {
                listJ = q3d.j("d", nfj.f23439a, ((fr90) hr90Var).f10008a);
            } else if (!(hr90Var instanceof gr90)) {
                t9f.b();
                return;
            } else {
                gr90 gr90Var = (gr90) hr90Var;
                listJ = q3d.j("t", gr90Var.f11768a, gr90Var.b);
            }
            boolean zG = fetVar5.g(listJ) | ((i13 > 256 && fetVar5.g(locale)) || (i4 & 384) == 256) | fetVar5.h(zBooleanValue2);
            Object objP2 = fetVar5.P();
            Object obj5 = objP2;
            if (zG || objP2 == cl5Var) {
                zp90 zp90Var = new zp90(locale, bool3);
                jl40 jl40Var = new jl40(hr90Var, context, locale, kyfVar3);
                Date date = w9v0.f38800a;
                uo90 uo90Var = new uo90(zp90Var);
                jl40Var.invoke(uo90Var);
                hd9 hd9Var = new hd9(CollectionsKt.L0(uo90Var.b), uo90Var.c, uo90Var.d);
                fetVar5.o0(hd9Var);
                obj5 = hd9Var;
            }
            hd9 hd9Var2 = (hd9) obj5;
            boolean zG2 = fetVar5.g(hd9Var2);
            Object objP3 = fetVar5.P();
            Object obj6 = objP3;
            if (zG2 || objP3 == cl5Var) {
                List list2 = hd9Var2.f12859a;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    u9v0 u9v0Var3 = (u9v0) CollectionsKt.firstOrNull(((v9v0) it4.next()).f37054a);
                    String str = u9v0Var3 != null ? u9v0Var3.f35302a : null;
                    if (str == null) {
                        str = "";
                    }
                    Iterator it5 = it4;
                    if (kotlin.text.c.x(str, "year-", false)) {
                        eav0Var = eav0.f7489a;
                    } else if (kotlin.text.c.x(str, "month-", false)) {
                        eav0Var = eav0.b;
                    } else if (kotlin.text.c.x(str, "day-", false)) {
                        eav0Var = eav0.c;
                    } else if (kotlin.text.c.x(str, "hour-", false)) {
                        eav0Var = eav0.d;
                    } else if (kotlin.text.c.x(str, "minute-", false)) {
                        eav0Var = eav0.e;
                    } else {
                        eav0Var = kotlin.text.c.x(str, "ampm-", false) ? eav0.f : eav0.g;
                    }
                    arrayList2.add(eav0Var);
                    it4 = it5;
                }
                fetVar5.o0(arrayList2);
                obj6 = arrayList2;
            }
            List list3 = (List) obj6;
            boolean zG3 = fetVar5.g(hd9Var2);
            Object objP4 = fetVar5.P();
            if (zG3 || objP4 == cl5Var) {
                List list4 = hd9Var2.f12859a;
                int i14 = 10;
                ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = it6;
                    int i15 = i12;
                    ArrayList arrayList4 = new ArrayList(r3d.q(((v9v0) it6.next()).f37054a, i14));
                    for (Iterator it8 = r6.iterator(); it8.hasNext(); it8 = it8) {
                        u9v0 u9v0Var4 = (u9v0) it8.next();
                        arrayList4.add(new cav0(u9v0Var4.f35302a, u9v0Var4.b, u9v0Var4.d));
                    }
                    arrayList3.add(arrayList4);
                    it6 = it7;
                    i12 = i15;
                    i14 = 10;
                }
                i5 = i12;
                fetVar5.o0(arrayList3);
                obj = arrayList3;
            } else {
                i5 = i12;
                obj = objP4;
            }
            List list5 = (List) obj;
            boolean zG4 = fetVar5.g(list3);
            Object objP5 = fetVar5.P();
            Object obj7 = objP5;
            if (zG4 || objP5 == cl5Var) {
                if (list3.isEmpty()) {
                    z = false;
                } else {
                    if (!list3.isEmpty()) {
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                if (((eav0) it9.next()) != eav0.g) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                fetVar5.o0(boolValueOf2);
                obj7 = boolValueOf2;
            }
            boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
            boolean zG5 = fetVar5.g(tcjVar3.f33721a) | fetVar5.g(hd9Var2) | fetVar5.h(zBooleanValue3) | fetVar5.g(tcjVar3.b) | fetVar5.h(true) | fetVar5.h(true) | fetVar5.h(rgq0Var3.f30450a) | fetVar5.h(true);
            Object objP6 = fetVar5.P();
            if (zG5 || objP6 == cl5Var) {
                boolean zG6 = g(rgq0Var3.b, rgq0Var3.c);
                int iIndexOf = list3.indexOf(eav0.f7489a);
                if (iIndexOf < 0) {
                    zG6 = zG6;
                } else {
                    Object obj8 = hd9Var2.f12859a.get(iIndexOf);
                    v9v0 v9v0Var2 = obj8 instanceof v9v0 ? (v9v0) obj8 : null;
                    Integer numValueOf3 = v9v0Var2 != null ? Integer.valueOf(l1e0.d(v9v0Var2.b, 0, q3d.i(v9v0Var2.f37054a))) : null;
                    numValueOf = numValueOf3 != null ? Integer.valueOf(((Number) ((u9v0) v9v0Var2.f37054a.get(numValueOf3.intValue())).c).intValue()) : null;
                    list = hd9Var2.f12859a;
                    IntRange intRangeH = q3d.h(list);
                    arrayList = new ArrayList(r3d.q(intRangeH, 10));
                    it = intRangeH.iterator();
                    i6 = 0;
                    while (((kkx) it).c) {
                        iNextInt = ((bkx) it).nextInt();
                        num = numValueOf;
                        eav0Var2 = (eav0) list3.get(iNextInt);
                        switch (eav0Var2.ordinal()) {
                            case 0:
                            case 5:
                                z5 = zBooleanValue3;
                                z6 = false;
                                if (eav0Var2 == eav0.g) {
                                    numValueOf2 = Integer.valueOf(i6 - 1);
                                } else {
                                    numValueOf2 = null;
                                }
                                snapshotStateList = new SnapshotStateList();
                                rgq0 rgq0Var7 = rgq0Var3;
                                v9v0Var = (v9v0) list.get(iNextInt);
                                int i16 = i6;
                                iOrdinal = eav0Var2.ordinal();
                                if (iOrdinal != 0) {
                                    z7 = zBooleanValue2;
                                    if (iOrdinal != 1) {
                                        List list6 = (List) list5.get(iNextInt);
                                        if (eav0Var2 != eav0.d || eav0Var2 == eav0.e || eav0Var2 == eav0.f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        snapshotStateList.addAll(list6);
                                        if (zG6 && z10) {
                                            size = snapshotStateList.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                                cav0Var = (cav0) snapshotStateList.get(i7);
                                                int i17 = size;
                                                if (cav0Var.c) {
                                                    snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                }
                                                i7++;
                                                size = i17;
                                            }
                                        }
                                        tcjVar5 = tcjVar3;
                                        eav0Var3 = eav0Var2;
                                    } else {
                                        v9v0Var.getClass();
                                        it3 = v9v0Var.f37054a.iterator();
                                        while (it3.hasNext()) {
                                            u9v0Var2 = (u9v0) it3.next();
                                            iIntValue = ((Number) u9v0Var2.c).intValue();
                                            Iterator it10 = it3;
                                            if (num != null) {
                                                zF = f(tcjVar3, num.intValue(), iIntValue);
                                            } else {
                                                zF = true;
                                            }
                                            boolean z14 = zF;
                                            String str2 = u9v0Var2.f35302a;
                                            eav0 eav0Var4 = eav0Var2;
                                            String str3 = u9v0Var2.b;
                                            if (u9v0Var2.d || !z14) {
                                                z9 = false;
                                            } else {
                                                z9 = true;
                                            }
                                            snapshotStateList.add(new cav0(str2, str3, z9));
                                            it3 = it10;
                                            eav0Var2 = eav0Var4;
                                        }
                                        eav0Var3 = eav0Var2;
                                    }
                                    arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                    i6 = i16;
                                    numValueOf = num;
                                    zBooleanValue3 = z5;
                                    rgq0Var3 = rgq0Var7;
                                    zBooleanValue2 = z7;
                                    tcjVar3 = tcjVar5;
                                } else {
                                    z7 = zBooleanValue2;
                                    eav0Var3 = eav0Var2;
                                    v9v0Var.getClass();
                                    it2 = v9v0Var.f37054a.iterator();
                                    while (it2.hasNext()) {
                                        u9v0Var = (u9v0) it2.next();
                                        boolean zH = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                        tcj tcjVar8 = tcjVar3;
                                        String str4 = u9v0Var.f35302a;
                                        Iterator it11 = it2;
                                        String str5 = u9v0Var.b;
                                        if (u9v0Var.d || !zH) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        snapshotStateList.add(new cav0(str4, str5, z8));
                                        it2 = it11;
                                        tcjVar3 = tcjVar8;
                                    }
                                }
                                tcjVar5 = tcjVar3;
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i16;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var7;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                                break;
                            case 1:
                            case 2:
                            case 4:
                                z5 = zBooleanValue3;
                                z6 = true;
                                if (eav0Var2 == eav0.g) {
                                    numValueOf2 = Integer.valueOf(i6 - 1);
                                } else {
                                    numValueOf2 = null;
                                }
                                snapshotStateList = new SnapshotStateList();
                                rgq0 rgq0Var8 = rgq0Var3;
                                v9v0Var = (v9v0) list.get(iNextInt);
                                int i18 = i6;
                                iOrdinal = eav0Var2.ordinal();
                                if (iOrdinal != 0) {
                                    z7 = zBooleanValue2;
                                    if (iOrdinal != 1) {
                                        List list7 = (List) list5.get(iNextInt);
                                        if (eav0Var2 != eav0.d) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        snapshotStateList.addAll(list7);
                                        if (zG6) {
                                            size = snapshotStateList.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                                cav0Var = (cav0) snapshotStateList.get(i7);
                                                int i19 = size;
                                                if (cav0Var.c) {
                                                    snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                }
                                                i7++;
                                                size = i19;
                                            }
                                        }
                                        tcjVar5 = tcjVar3;
                                        eav0Var3 = eav0Var2;
                                    } else {
                                        v9v0Var.getClass();
                                        it3 = v9v0Var.f37054a.iterator();
                                        while (it3.hasNext()) {
                                            u9v0Var2 = (u9v0) it3.next();
                                            iIntValue = ((Number) u9v0Var2.c).intValue();
                                            Iterator it12 = it3;
                                            if (num != null) {
                                                zF = f(tcjVar3, num.intValue(), iIntValue);
                                            } else {
                                                zF = true;
                                            }
                                            boolean z15 = zF;
                                            String str6 = u9v0Var2.f35302a;
                                            eav0 eav0Var5 = eav0Var2;
                                            String str7 = u9v0Var2.b;
                                            if (u9v0Var2.d) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            snapshotStateList.add(new cav0(str6, str7, z9));
                                            it3 = it12;
                                            eav0Var2 = eav0Var5;
                                        }
                                        eav0Var3 = eav0Var2;
                                    }
                                    arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                    i6 = i18;
                                    numValueOf = num;
                                    zBooleanValue3 = z5;
                                    rgq0Var3 = rgq0Var8;
                                    zBooleanValue2 = z7;
                                    tcjVar3 = tcjVar5;
                                } else {
                                    z7 = zBooleanValue2;
                                    eav0Var3 = eav0Var2;
                                    v9v0Var.getClass();
                                    it2 = v9v0Var.f37054a.iterator();
                                    while (it2.hasNext()) {
                                        u9v0Var = (u9v0) it2.next();
                                        boolean zH2 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                        tcj tcjVar9 = tcjVar3;
                                        String str8 = u9v0Var.f35302a;
                                        Iterator it13 = it2;
                                        String str9 = u9v0Var.b;
                                        if (u9v0Var.d) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        snapshotStateList.add(new cav0(str8, str9, z8));
                                        it2 = it13;
                                        tcjVar3 = tcjVar9;
                                    }
                                }
                                tcjVar5 = tcjVar3;
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i18;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var8;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                                break;
                            case 3:
                                z5 = zBooleanValue3;
                                z6 = rgq0Var3.f30450a;
                                i6 = i6;
                                if (eav0Var2 == eav0.g) {
                                    numValueOf2 = Integer.valueOf(i6 - 1);
                                } else {
                                    numValueOf2 = null;
                                }
                                snapshotStateList = new SnapshotStateList();
                                rgq0 rgq0Var9 = rgq0Var3;
                                v9v0Var = (v9v0) list.get(iNextInt);
                                int i110 = i6;
                                iOrdinal = eav0Var2.ordinal();
                                if (iOrdinal != 0) {
                                    z7 = zBooleanValue2;
                                    if (iOrdinal != 1) {
                                        List list8 = (List) list5.get(iNextInt);
                                        if (eav0Var2 != eav0.d) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        snapshotStateList.addAll(list8);
                                        if (zG6) {
                                            size = snapshotStateList.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                                cav0Var = (cav0) snapshotStateList.get(i7);
                                                int i111 = size;
                                                if (cav0Var.c) {
                                                    snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                }
                                                i7++;
                                                size = i111;
                                            }
                                        }
                                        tcjVar5 = tcjVar3;
                                        eav0Var3 = eav0Var2;
                                    } else {
                                        v9v0Var.getClass();
                                        it3 = v9v0Var.f37054a.iterator();
                                        while (it3.hasNext()) {
                                            u9v0Var2 = (u9v0) it3.next();
                                            iIntValue = ((Number) u9v0Var2.c).intValue();
                                            Iterator it14 = it3;
                                            if (num != null) {
                                                zF = f(tcjVar3, num.intValue(), iIntValue);
                                            } else {
                                                zF = true;
                                            }
                                            boolean z16 = zF;
                                            String str10 = u9v0Var2.f35302a;
                                            eav0 eav0Var6 = eav0Var2;
                                            String str11 = u9v0Var2.b;
                                            if (u9v0Var2.d) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            snapshotStateList.add(new cav0(str10, str11, z9));
                                            it3 = it14;
                                            eav0Var2 = eav0Var6;
                                        }
                                        eav0Var3 = eav0Var2;
                                    }
                                    arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                    i6 = i110;
                                    numValueOf = num;
                                    zBooleanValue3 = z5;
                                    rgq0Var3 = rgq0Var9;
                                    zBooleanValue2 = z7;
                                    tcjVar3 = tcjVar5;
                                } else {
                                    z7 = zBooleanValue2;
                                    eav0Var3 = eav0Var2;
                                    v9v0Var.getClass();
                                    it2 = v9v0Var.f37054a.iterator();
                                    while (it2.hasNext()) {
                                        u9v0Var = (u9v0) it2.next();
                                        boolean zH3 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                        tcj tcjVar10 = tcjVar3;
                                        String str12 = u9v0Var.f35302a;
                                        Iterator it15 = it2;
                                        String str13 = u9v0Var.b;
                                        if (u9v0Var.d) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        snapshotStateList.add(new cav0(str12, str13, z8));
                                        it2 = it15;
                                        tcjVar3 = tcjVar10;
                                    }
                                }
                                tcjVar5 = tcjVar3;
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i110;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var9;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                                break;
                            case 6:
                                int i20 = i6;
                                bool = ((v9v0) list.get(iNextInt)).c;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                i8 = i20 + 1;
                                if (zBooleanValue) {
                                    z5 = zBooleanValue3;
                                    if (((List) list5.get(iNextInt)).size() >= 2) {
                                        i6 = i8;
                                        z6 = true;
                                        if (eav0Var2 == eav0.g) {
                                            numValueOf2 = Integer.valueOf(i6 - 1);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        snapshotStateList = new SnapshotStateList();
                                        rgq0 rgq0Var10 = rgq0Var3;
                                        v9v0Var = (v9v0) list.get(iNextInt);
                                        int i112 = i6;
                                        iOrdinal = eav0Var2.ordinal();
                                        if (iOrdinal != 0) {
                                            z7 = zBooleanValue2;
                                            if (iOrdinal != 1) {
                                                List list9 = (List) list5.get(iNextInt);
                                                if (eav0Var2 != eav0.d) {
                                                    z10 = true;
                                                } else {
                                                    z10 = true;
                                                }
                                                snapshotStateList.addAll(list9);
                                                if (zG6) {
                                                    size = snapshotStateList.size();
                                                    i7 = 0;
                                                    while (i7 < size) {
                                                        cav0Var = (cav0) snapshotStateList.get(i7);
                                                        int i113 = size;
                                                        if (cav0Var.c) {
                                                            snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                        }
                                                        i7++;
                                                        size = i113;
                                                    }
                                                }
                                                tcjVar5 = tcjVar3;
                                                eav0Var3 = eav0Var2;
                                            } else {
                                                v9v0Var.getClass();
                                                it3 = v9v0Var.f37054a.iterator();
                                                while (it3.hasNext()) {
                                                    u9v0Var2 = (u9v0) it3.next();
                                                    iIntValue = ((Number) u9v0Var2.c).intValue();
                                                    Iterator it16 = it3;
                                                    if (num != null) {
                                                        zF = f(tcjVar3, num.intValue(), iIntValue);
                                                    } else {
                                                        zF = true;
                                                    }
                                                    boolean z17 = zF;
                                                    String str14 = u9v0Var2.f35302a;
                                                    eav0 eav0Var7 = eav0Var2;
                                                    String str15 = u9v0Var2.b;
                                                    if (u9v0Var2.d) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    snapshotStateList.add(new cav0(str14, str15, z9));
                                                    it3 = it16;
                                                    eav0Var2 = eav0Var7;
                                                }
                                                eav0Var3 = eav0Var2;
                                            }
                                            arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                            i6 = i112;
                                            numValueOf = num;
                                            zBooleanValue3 = z5;
                                            rgq0Var3 = rgq0Var10;
                                            zBooleanValue2 = z7;
                                            tcjVar3 = tcjVar5;
                                        } else {
                                            z7 = zBooleanValue2;
                                            eav0Var3 = eav0Var2;
                                            v9v0Var.getClass();
                                            it2 = v9v0Var.f37054a.iterator();
                                            while (it2.hasNext()) {
                                                u9v0Var = (u9v0) it2.next();
                                                boolean zH4 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                                tcj tcjVar11 = tcjVar3;
                                                String str16 = u9v0Var.f35302a;
                                                Iterator it17 = it2;
                                                String str17 = u9v0Var.b;
                                                if (u9v0Var.d) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                                snapshotStateList.add(new cav0(str16, str17, z8));
                                                it2 = it17;
                                                tcjVar3 = tcjVar11;
                                            }
                                        }
                                        tcjVar5 = tcjVar3;
                                        arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                        i6 = i112;
                                        numValueOf = num;
                                        zBooleanValue3 = z5;
                                        rgq0Var3 = rgq0Var10;
                                        zBooleanValue2 = z7;
                                        tcjVar3 = tcjVar5;
                                    }
                                } else {
                                    z5 = zBooleanValue3;
                                }
                                i6 = i8;
                                z6 = false;
                                if (eav0Var2 == eav0.g) {
                                    numValueOf2 = Integer.valueOf(i6 - 1);
                                } else {
                                    numValueOf2 = null;
                                }
                                snapshotStateList = new SnapshotStateList();
                                rgq0 rgq0Var11 = rgq0Var3;
                                v9v0Var = (v9v0) list.get(iNextInt);
                                int i114 = i6;
                                iOrdinal = eav0Var2.ordinal();
                                if (iOrdinal != 0) {
                                    z7 = zBooleanValue2;
                                    if (iOrdinal != 1) {
                                        List list10 = (List) list5.get(iNextInt);
                                        if (eav0Var2 != eav0.d) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        snapshotStateList.addAll(list10);
                                        if (zG6) {
                                            size = snapshotStateList.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                                cav0Var = (cav0) snapshotStateList.get(i7);
                                                int i115 = size;
                                                if (cav0Var.c) {
                                                    snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                }
                                                i7++;
                                                size = i115;
                                            }
                                        }
                                        tcjVar5 = tcjVar3;
                                        eav0Var3 = eav0Var2;
                                    } else {
                                        v9v0Var.getClass();
                                        it3 = v9v0Var.f37054a.iterator();
                                        while (it3.hasNext()) {
                                            u9v0Var2 = (u9v0) it3.next();
                                            iIntValue = ((Number) u9v0Var2.c).intValue();
                                            Iterator it18 = it3;
                                            if (num != null) {
                                                zF = f(tcjVar3, num.intValue(), iIntValue);
                                            } else {
                                                zF = true;
                                            }
                                            boolean z18 = zF;
                                            String str18 = u9v0Var2.f35302a;
                                            eav0 eav0Var8 = eav0Var2;
                                            String str19 = u9v0Var2.b;
                                            if (u9v0Var2.d) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            snapshotStateList.add(new cav0(str18, str19, z9));
                                            it3 = it18;
                                            eav0Var2 = eav0Var8;
                                        }
                                        eav0Var3 = eav0Var2;
                                    }
                                    arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                    i6 = i114;
                                    numValueOf = num;
                                    zBooleanValue3 = z5;
                                    rgq0Var3 = rgq0Var11;
                                    zBooleanValue2 = z7;
                                    tcjVar3 = tcjVar5;
                                } else {
                                    z7 = zBooleanValue2;
                                    eav0Var3 = eav0Var2;
                                    v9v0Var.getClass();
                                    it2 = v9v0Var.f37054a.iterator();
                                    while (it2.hasNext()) {
                                        u9v0Var = (u9v0) it2.next();
                                        boolean zH5 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                        tcj tcjVar12 = tcjVar3;
                                        String str110 = u9v0Var.f35302a;
                                        Iterator it19 = it2;
                                        String str111 = u9v0Var.b;
                                        if (u9v0Var.d) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        snapshotStateList.add(new cav0(str110, str111, z8));
                                        it2 = it19;
                                        tcjVar3 = tcjVar12;
                                    }
                                }
                                tcjVar5 = tcjVar3;
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i114;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var11;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                                break;
                            default:
                                t9f.b();
                                break;
                        }
                    }
                    z2 = zBooleanValue3;
                    tcjVar4 = tcjVar3;
                    rgq0Var4 = rgq0Var3;
                    z3 = zBooleanValue2;
                    z4 = false;
                    fetVar5.o0(arrayList);
                    objP6 = arrayList;
                }
                list = hd9Var2.f12859a;
                IntRange intRangeH2 = q3d.h(list);
                arrayList = new ArrayList(r3d.q(intRangeH2, 10));
                it = intRangeH2.iterator();
                i6 = 0;
                while (((kkx) it).c) {
                    iNextInt = ((bkx) it).nextInt();
                    num = numValueOf;
                    eav0Var2 = (eav0) list3.get(iNextInt);
                    switch (eav0Var2.ordinal()) {
                        case 0:
                        case 5:
                            z5 = zBooleanValue3;
                            z6 = false;
                            if (eav0Var2 == eav0.g) {
                                numValueOf2 = Integer.valueOf(i6 - 1);
                            } else {
                                numValueOf2 = null;
                            }
                            snapshotStateList = new SnapshotStateList();
                            rgq0 rgq0Var12 = rgq0Var3;
                            v9v0Var = (v9v0) list.get(iNextInt);
                            int i116 = i6;
                            iOrdinal = eav0Var2.ordinal();
                            if (iOrdinal != 0) {
                                z7 = zBooleanValue2;
                                if (iOrdinal != 1) {
                                    List list11 = (List) list5.get(iNextInt);
                                    if (eav0Var2 != eav0.d) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    snapshotStateList.addAll(list11);
                                    if (zG6) {
                                        size = snapshotStateList.size();
                                        i7 = 0;
                                        while (i7 < size) {
                                            cav0Var = (cav0) snapshotStateList.get(i7);
                                            int i117 = size;
                                            if (cav0Var.c) {
                                                snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                            }
                                            i7++;
                                            size = i117;
                                        }
                                    }
                                    tcjVar5 = tcjVar3;
                                    eav0Var3 = eav0Var2;
                                } else {
                                    v9v0Var.getClass();
                                    it3 = v9v0Var.f37054a.iterator();
                                    while (it3.hasNext()) {
                                        u9v0Var2 = (u9v0) it3.next();
                                        iIntValue = ((Number) u9v0Var2.c).intValue();
                                        Iterator it110 = it3;
                                        if (num != null) {
                                            zF = f(tcjVar3, num.intValue(), iIntValue);
                                        } else {
                                            zF = true;
                                        }
                                        boolean z19 = zF;
                                        String str112 = u9v0Var2.f35302a;
                                        eav0 eav0Var9 = eav0Var2;
                                        String str113 = u9v0Var2.b;
                                        if (u9v0Var2.d) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        snapshotStateList.add(new cav0(str112, str113, z9));
                                        it3 = it110;
                                        eav0Var2 = eav0Var9;
                                    }
                                    eav0Var3 = eav0Var2;
                                }
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i116;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var12;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                            } else {
                                z7 = zBooleanValue2;
                                eav0Var3 = eav0Var2;
                                v9v0Var.getClass();
                                it2 = v9v0Var.f37054a.iterator();
                                while (it2.hasNext()) {
                                    u9v0Var = (u9v0) it2.next();
                                    boolean zH6 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                    tcj tcjVar13 = tcjVar3;
                                    String str114 = u9v0Var.f35302a;
                                    Iterator it111 = it2;
                                    String str115 = u9v0Var.b;
                                    if (u9v0Var.d) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    snapshotStateList.add(new cav0(str114, str115, z8));
                                    it2 = it111;
                                    tcjVar3 = tcjVar13;
                                }
                            }
                            tcjVar5 = tcjVar3;
                            arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                            i6 = i116;
                            numValueOf = num;
                            zBooleanValue3 = z5;
                            rgq0Var3 = rgq0Var12;
                            zBooleanValue2 = z7;
                            tcjVar3 = tcjVar5;
                            break;
                        case 1:
                        case 2:
                        case 4:
                            z5 = zBooleanValue3;
                            z6 = true;
                            if (eav0Var2 == eav0.g) {
                                numValueOf2 = Integer.valueOf(i6 - 1);
                            } else {
                                numValueOf2 = null;
                            }
                            snapshotStateList = new SnapshotStateList();
                            rgq0 rgq0Var13 = rgq0Var3;
                            v9v0Var = (v9v0) list.get(iNextInt);
                            int i118 = i6;
                            iOrdinal = eav0Var2.ordinal();
                            if (iOrdinal != 0) {
                                z7 = zBooleanValue2;
                                if (iOrdinal != 1) {
                                    List list12 = (List) list5.get(iNextInt);
                                    if (eav0Var2 != eav0.d) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    snapshotStateList.addAll(list12);
                                    if (zG6) {
                                        size = snapshotStateList.size();
                                        i7 = 0;
                                        while (i7 < size) {
                                            cav0Var = (cav0) snapshotStateList.get(i7);
                                            int i119 = size;
                                            if (cav0Var.c) {
                                                snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                            }
                                            i7++;
                                            size = i119;
                                        }
                                    }
                                    tcjVar5 = tcjVar3;
                                    eav0Var3 = eav0Var2;
                                } else {
                                    v9v0Var.getClass();
                                    it3 = v9v0Var.f37054a.iterator();
                                    while (it3.hasNext()) {
                                        u9v0Var2 = (u9v0) it3.next();
                                        iIntValue = ((Number) u9v0Var2.c).intValue();
                                        Iterator it112 = it3;
                                        if (num != null) {
                                            zF = f(tcjVar3, num.intValue(), iIntValue);
                                        } else {
                                            zF = true;
                                        }
                                        boolean z110 = zF;
                                        String str116 = u9v0Var2.f35302a;
                                        eav0 eav0Var10 = eav0Var2;
                                        String str117 = u9v0Var2.b;
                                        if (u9v0Var2.d) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        snapshotStateList.add(new cav0(str116, str117, z9));
                                        it3 = it112;
                                        eav0Var2 = eav0Var10;
                                    }
                                    eav0Var3 = eav0Var2;
                                }
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i118;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var13;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                            } else {
                                z7 = zBooleanValue2;
                                eav0Var3 = eav0Var2;
                                v9v0Var.getClass();
                                it2 = v9v0Var.f37054a.iterator();
                                while (it2.hasNext()) {
                                    u9v0Var = (u9v0) it2.next();
                                    boolean zH7 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                    tcj tcjVar14 = tcjVar3;
                                    String str118 = u9v0Var.f35302a;
                                    Iterator it113 = it2;
                                    String str119 = u9v0Var.b;
                                    if (u9v0Var.d) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    snapshotStateList.add(new cav0(str118, str119, z8));
                                    it2 = it113;
                                    tcjVar3 = tcjVar14;
                                }
                            }
                            tcjVar5 = tcjVar3;
                            arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                            i6 = i118;
                            numValueOf = num;
                            zBooleanValue3 = z5;
                            rgq0Var3 = rgq0Var13;
                            zBooleanValue2 = z7;
                            tcjVar3 = tcjVar5;
                            break;
                        case 3:
                            z5 = zBooleanValue3;
                            z6 = rgq0Var3.f30450a;
                            i6 = i6;
                            if (eav0Var2 == eav0.g) {
                                numValueOf2 = Integer.valueOf(i6 - 1);
                            } else {
                                numValueOf2 = null;
                            }
                            snapshotStateList = new SnapshotStateList();
                            rgq0 rgq0Var14 = rgq0Var3;
                            v9v0Var = (v9v0) list.get(iNextInt);
                            int i1110 = i6;
                            iOrdinal = eav0Var2.ordinal();
                            if (iOrdinal != 0) {
                                z7 = zBooleanValue2;
                                if (iOrdinal != 1) {
                                    List list13 = (List) list5.get(iNextInt);
                                    if (eav0Var2 != eav0.d) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    snapshotStateList.addAll(list13);
                                    if (zG6) {
                                        size = snapshotStateList.size();
                                        i7 = 0;
                                        while (i7 < size) {
                                            cav0Var = (cav0) snapshotStateList.get(i7);
                                            int i1111 = size;
                                            if (cav0Var.c) {
                                                snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                            }
                                            i7++;
                                            size = i1111;
                                        }
                                    }
                                    tcjVar5 = tcjVar3;
                                    eav0Var3 = eav0Var2;
                                } else {
                                    v9v0Var.getClass();
                                    it3 = v9v0Var.f37054a.iterator();
                                    while (it3.hasNext()) {
                                        u9v0Var2 = (u9v0) it3.next();
                                        iIntValue = ((Number) u9v0Var2.c).intValue();
                                        Iterator it114 = it3;
                                        if (num != null) {
                                            zF = f(tcjVar3, num.intValue(), iIntValue);
                                        } else {
                                            zF = true;
                                        }
                                        boolean z111 = zF;
                                        String str1110 = u9v0Var2.f35302a;
                                        eav0 eav0Var11 = eav0Var2;
                                        String str1111 = u9v0Var2.b;
                                        if (u9v0Var2.d) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        snapshotStateList.add(new cav0(str1110, str1111, z9));
                                        it3 = it114;
                                        eav0Var2 = eav0Var11;
                                    }
                                    eav0Var3 = eav0Var2;
                                }
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i1110;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var14;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                            } else {
                                z7 = zBooleanValue2;
                                eav0Var3 = eav0Var2;
                                v9v0Var.getClass();
                                it2 = v9v0Var.f37054a.iterator();
                                while (it2.hasNext()) {
                                    u9v0Var = (u9v0) it2.next();
                                    boolean zH8 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                    tcj tcjVar15 = tcjVar3;
                                    String str1112 = u9v0Var.f35302a;
                                    Iterator it115 = it2;
                                    String str1113 = u9v0Var.b;
                                    if (u9v0Var.d) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    snapshotStateList.add(new cav0(str1112, str1113, z8));
                                    it2 = it115;
                                    tcjVar3 = tcjVar15;
                                }
                            }
                            tcjVar5 = tcjVar3;
                            arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                            i6 = i1110;
                            numValueOf = num;
                            zBooleanValue3 = z5;
                            rgq0Var3 = rgq0Var14;
                            zBooleanValue2 = z7;
                            tcjVar3 = tcjVar5;
                            break;
                        case 6:
                            int i21 = i6;
                            bool = ((v9v0) list.get(iNextInt)).c;
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            i8 = i21 + 1;
                            if (zBooleanValue) {
                                z5 = zBooleanValue3;
                                if (((List) list5.get(iNextInt)).size() >= 2) {
                                    i6 = i8;
                                    z6 = true;
                                    if (eav0Var2 == eav0.g) {
                                        numValueOf2 = Integer.valueOf(i6 - 1);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    snapshotStateList = new SnapshotStateList();
                                    rgq0 rgq0Var15 = rgq0Var3;
                                    v9v0Var = (v9v0) list.get(iNextInt);
                                    int i1112 = i6;
                                    iOrdinal = eav0Var2.ordinal();
                                    if (iOrdinal != 0) {
                                        z7 = zBooleanValue2;
                                        if (iOrdinal != 1) {
                                            List list14 = (List) list5.get(iNextInt);
                                            if (eav0Var2 != eav0.d) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            snapshotStateList.addAll(list14);
                                            if (zG6) {
                                                size = snapshotStateList.size();
                                                i7 = 0;
                                                while (i7 < size) {
                                                    cav0Var = (cav0) snapshotStateList.get(i7);
                                                    int i1113 = size;
                                                    if (cav0Var.c) {
                                                        snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                                    }
                                                    i7++;
                                                    size = i1113;
                                                }
                                            }
                                            tcjVar5 = tcjVar3;
                                            eav0Var3 = eav0Var2;
                                        } else {
                                            v9v0Var.getClass();
                                            it3 = v9v0Var.f37054a.iterator();
                                            while (it3.hasNext()) {
                                                u9v0Var2 = (u9v0) it3.next();
                                                iIntValue = ((Number) u9v0Var2.c).intValue();
                                                Iterator it116 = it3;
                                                if (num != null) {
                                                    zF = f(tcjVar3, num.intValue(), iIntValue);
                                                } else {
                                                    zF = true;
                                                }
                                                boolean z112 = zF;
                                                String str1114 = u9v0Var2.f35302a;
                                                eav0 eav0Var12 = eav0Var2;
                                                String str1115 = u9v0Var2.b;
                                                if (u9v0Var2.d) {
                                                    z9 = false;
                                                } else {
                                                    z9 = false;
                                                }
                                                snapshotStateList.add(new cav0(str1114, str1115, z9));
                                                it3 = it116;
                                                eav0Var2 = eav0Var12;
                                            }
                                            eav0Var3 = eav0Var2;
                                        }
                                        arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                        i6 = i1112;
                                        numValueOf = num;
                                        zBooleanValue3 = z5;
                                        rgq0Var3 = rgq0Var15;
                                        zBooleanValue2 = z7;
                                        tcjVar3 = tcjVar5;
                                    } else {
                                        z7 = zBooleanValue2;
                                        eav0Var3 = eav0Var2;
                                        v9v0Var.getClass();
                                        it2 = v9v0Var.f37054a.iterator();
                                        while (it2.hasNext()) {
                                            u9v0Var = (u9v0) it2.next();
                                            boolean zH9 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                            tcj tcjVar16 = tcjVar3;
                                            String str1116 = u9v0Var.f35302a;
                                            Iterator it117 = it2;
                                            String str1117 = u9v0Var.b;
                                            if (u9v0Var.d) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            snapshotStateList.add(new cav0(str1116, str1117, z8));
                                            it2 = it117;
                                            tcjVar3 = tcjVar16;
                                        }
                                    }
                                    tcjVar5 = tcjVar3;
                                    arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                    i6 = i1112;
                                    numValueOf = num;
                                    zBooleanValue3 = z5;
                                    rgq0Var3 = rgq0Var15;
                                    zBooleanValue2 = z7;
                                    tcjVar3 = tcjVar5;
                                }
                            } else {
                                z5 = zBooleanValue3;
                            }
                            i6 = i8;
                            z6 = false;
                            if (eav0Var2 == eav0.g) {
                                numValueOf2 = Integer.valueOf(i6 - 1);
                            } else {
                                numValueOf2 = null;
                            }
                            snapshotStateList = new SnapshotStateList();
                            rgq0 rgq0Var16 = rgq0Var3;
                            v9v0Var = (v9v0) list.get(iNextInt);
                            int i1114 = i6;
                            iOrdinal = eav0Var2.ordinal();
                            if (iOrdinal != 0) {
                                z7 = zBooleanValue2;
                                if (iOrdinal != 1) {
                                    List list15 = (List) list5.get(iNextInt);
                                    if (eav0Var2 != eav0.d) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    snapshotStateList.addAll(list15);
                                    if (zG6) {
                                        size = snapshotStateList.size();
                                        i7 = 0;
                                        while (i7 < size) {
                                            cav0Var = (cav0) snapshotStateList.get(i7);
                                            int i1115 = size;
                                            if (cav0Var.c) {
                                                snapshotStateList.set(i7, cav0.a(cav0Var, false));
                                            }
                                            i7++;
                                            size = i1115;
                                        }
                                    }
                                    tcjVar5 = tcjVar3;
                                    eav0Var3 = eav0Var2;
                                } else {
                                    v9v0Var.getClass();
                                    it3 = v9v0Var.f37054a.iterator();
                                    while (it3.hasNext()) {
                                        u9v0Var2 = (u9v0) it3.next();
                                        iIntValue = ((Number) u9v0Var2.c).intValue();
                                        Iterator it118 = it3;
                                        if (num != null) {
                                            zF = f(tcjVar3, num.intValue(), iIntValue);
                                        } else {
                                            zF = true;
                                        }
                                        boolean z113 = zF;
                                        String str1118 = u9v0Var2.f35302a;
                                        eav0 eav0Var13 = eav0Var2;
                                        String str1119 = u9v0Var2.b;
                                        if (u9v0Var2.d) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        snapshotStateList.add(new cav0(str1118, str1119, z9));
                                        it3 = it118;
                                        eav0Var2 = eav0Var13;
                                    }
                                    eav0Var3 = eav0Var2;
                                }
                                arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                                i6 = i1114;
                                numValueOf = num;
                                zBooleanValue3 = z5;
                                rgq0Var3 = rgq0Var16;
                                zBooleanValue2 = z7;
                                tcjVar3 = tcjVar5;
                            } else {
                                z7 = zBooleanValue2;
                                eav0Var3 = eav0Var2;
                                v9v0Var.getClass();
                                it2 = v9v0Var.f37054a.iterator();
                                while (it2.hasNext()) {
                                    u9v0Var = (u9v0) it2.next();
                                    boolean zH10 = h(tcjVar3, ((Number) u9v0Var.c).intValue());
                                    tcj tcjVar17 = tcjVar3;
                                    String str11110 = u9v0Var.f35302a;
                                    Iterator it119 = it2;
                                    String str11111 = u9v0Var.b;
                                    if (u9v0Var.d) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    snapshotStateList.add(new cav0(str11110, str11111, z8));
                                    it2 = it119;
                                    tcjVar3 = tcjVar17;
                                }
                            }
                            tcjVar5 = tcjVar3;
                            arrayList.add(new t9v0(eav0Var3, snapshotStateList, ((v9v0) list.get(iNextInt)).b, new okt0(), ((v9v0) list.get(iNextInt)).b, z6, numValueOf2));
                            i6 = i1114;
                            numValueOf = num;
                            zBooleanValue3 = z5;
                            rgq0Var3 = rgq0Var16;
                            zBooleanValue2 = z7;
                            tcjVar3 = tcjVar5;
                            break;
                        default:
                            t9f.b();
                            break;
                    }
                }
                z2 = zBooleanValue3;
                tcjVar4 = tcjVar3;
                rgq0Var4 = rgq0Var3;
                z3 = zBooleanValue2;
                z4 = false;
                fetVar5.o0(arrayList);
                objP6 = arrayList;
            } else {
                z2 = zBooleanValue3;
                tcjVar4 = tcjVar3;
                rgq0Var4 = rgq0Var3;
                z3 = zBooleanValue2;
                z4 = false;
            }
            List list16 = (List) objP6;
            Object objP7 = fetVar5.P();
            Object obj9 = objP7;
            if (objP7 == cl5Var) {
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                fetVar5.o0(snapshotStateList2);
                obj9 = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj9;
            int iIndexOf2 = list3.indexOf(eav0.f7489a);
            int iIndexOf3 = list3.indexOf(eav0.b);
            int iIndexOf4 = list3.indexOf(eav0.c);
            if (z2 || iIndexOf2 < 0 || iIndexOf3 < 0 || iIndexOf4 < 0) {
                mm40 mm40Var7 = mm40Var4;
                List list17 = list16;
                int i22 = i4;
                boolean z20 = z4;
                rgq0 rgq0Var17 = rgq0Var4;
                tcj tcjVar18 = tcjVar4;
                kyf kyfVar5 = kyfVar3;
                if (z2 || iIndexOf2 < 0 || iIndexOf3 < 0 || iIndexOf4 >= 0) {
                    mm40Var5 = mm40Var7;
                    kyfVar4 = kyfVar5;
                    tcjVar6 = tcjVar18;
                    if (z2 || iIndexOf2 < 0 || iIndexOf3 >= 0 || iIndexOf4 >= 0) {
                        fetVar5.e0(1476131156);
                        float f = vo90.f37755a;
                        long jA = vo90.a(fetVar5);
                        float f2 = vo90.b;
                        ugg0 ugg0Var = vo90.c;
                        boolean zI = fetVar5.i(list17);
                        Object objP8 = fetVar5.P();
                        if (zI || objP8 == cl5Var) {
                            b = 1;
                            kv80 kv80Var = new kv80(list17, b);
                            fetVar5.o0(kv80Var);
                            obj2 = kv80Var;
                        } else {
                            b = 1;
                            obj2 = objP8;
                        }
                        Function2 function2 = (Function2) obj2;
                        int i23 = (((i22 & 112) == 32 || ((i22 & 64) != 0 && fetVar5.i(hr90Var))) ? b : (byte) 0) | (fetVar5.i(list17) ? 1 : 0) | (fetVar5.i(hd9Var2) ? 1 : 0) | (((((57344 & i22) ^ 24576) <= 16384 || !fetVar5.i(rgq0Var17)) && (i22 & 24576) != 16384) ? (byte) 0 : b);
                        if ((i13 <= 256 || !fetVar5.g(locale)) && (i22 & 384) != 256) {
                            b = 0;
                        }
                        int i24 = i23 | b;
                        boolean z21 = z3;
                        kyfVar4 = kyfVar4;
                        boolean z22 = z2;
                        boolean z23 = ((i24 | (fetVar5.h(z21) ? 1 : 0)) == true ? 1 : 0) | (fetVar5.i(kyfVar4) ? 1 : 0) | (fetVar5.h(z22) ? 1 : 0);
                        rgq0Var4 = rgq0Var17;
                        Object objP9 = fetVar5.P();
                        if (z23 || objP9 == cl5Var) {
                            z11 = false;
                            had hadVar = new had(list17, hd9Var2, hr90Var, rgq0Var4, locale, z21, kyfVar4, z22, snapshotStateList3);
                            list17 = list17;
                            z12 = z22;
                            fetVar5.o0(hadVar);
                            obj3 = hadVar;
                        } else {
                            z12 = z22;
                            z11 = false;
                            obj3 = objP9;
                        }
                        bdx.C(mm40Var5, f, f2, jA, ugg0Var, list17, z12, function2, (xdr) obj3, fetVar5, 221616 | (i22 & 14));
                        mm40Var5 = mm40Var5;
                        fetVar5.r(z11);
                        fetVar4 = fetVar5;
                    } else {
                        fetVar5.e0(1475509947);
                        idx.k(mm40Var5, vo90.f37755a, vo90.b, vo90.c, vo90.a(fetVar), hd9Var2, list17, iIndexOf2, tcjVar6, fetVar, (i22 & 14) | 1073941936 | ((i22 << 18) & 1879048192));
                        fet fetVar6 = fetVar;
                        fetVar6.r(z20);
                        fetVar3 = fetVar6;
                    }
                } else {
                    fetVar5.e0(1474788391);
                    mm40Var5 = mm40Var7;
                    kyfVar4 = kyfVar5;
                    wdx.y(mm40Var5, vo90.f37755a, vo90.a(fetVar), vo90.b, vo90.c, hd9Var2, list17, iIndexOf2, iIndexOf3, tcjVar18, fetVar, (i22 & 14) | 224304, 8 | ((i22 >> 9) & 14));
                    tcjVar6 = tcjVar18;
                    fet fetVar7 = fetVar;
                    fetVar7.r(z20);
                    fetVar3 = fetVar7;
                }
                rgq0Var4 = rgq0Var17;
                fetVar4 = fetVar3;
            } else {
                fetVar5.e0(1473986390);
                int i25 = i4;
                int i26 = (i25 & 14) | 200112;
                int i27 = ((i25 >> 6) & 112) | 64 | i5;
                mm40Var5 = mm40Var4;
                tcj tcjVar19 = tcjVar4;
                vdx.s(mm40Var5, vo90.f37755a, vo90.b, vo90.c, vo90.a(fetVar5), hd9Var2, list16, iIndexOf2, iIndexOf3, iIndexOf4, tcjVar19, locale, fetVar5, i26, i27);
                tcjVar6 = tcjVar19;
                fet fetVar8 = fetVar5;
                fetVar8.r(z4);
                kyfVar4 = kyfVar3;
                fetVar4 = fetVar8;
            }
            mm40Var3 = mm40Var5;
            tcjVar2 = tcjVar6;
            rgq0Var2 = rgq0Var4;
            kyfVar2 = kyfVar4;
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            tcjVar2 = tcjVar7;
            rgq0Var2 = rgq0Var5;
            mm40Var3 = mm40Var2;
            kyfVar2 = kyfVar;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(mm40Var3, hr90Var, locale, tcjVar2, rgq0Var2, kyfVar2, i, i2, (byte) 3);
        }
    }

    public static final boolean b(SnapshotStateList snapshotStateList) {
        paw pawVar;
        if (snapshotStateList.isEmpty()) {
            return true;
        }
        ListIterator listIterator = snapshotStateList.listIterator();
        do {
            pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return true;
            }
        } while (!((cav0) pawVar.next()).c);
        return false;
    }

    public static final int c(int i, psw pswVar) {
        int iOrdinal = pswVar.ordinal();
        if (iOrdinal == 0) {
            return i;
        }
        if (iOrdinal == 1) {
            return i + 1;
        }
        if (iOrdinal == 2) {
            return i;
        }
        if (iOrdinal == 3) {
            return i + 1;
        }
        t9f.b();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[PHI: r2
  0x0030: PHI (r2v2 int) = (r2v1 int), (r2v8 int) binds: [B:21:0x003f, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final boolean d(int i, psw pswVar, ArrayList arrayList, TimeOfDay23 timeOfDay23, TimeOfDay23 timeOfDay24, ArrayList arrayList2, ArrayList arrayList3, boolean z) {
        int iIntValue;
        for (int i2 = 0; i2 < i; i2++) {
            int iC = c(i2, pswVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            int iOrdinal = pswVar.ordinal();
            if (iOrdinal == 0) {
                iC = l1e0.d(iC, 0, 11);
                if (!boolValueOf.equals(Boolean.TRUE)) {
                    iC += 12;
                }
            } else if (iOrdinal == 1) {
                iC %= 12;
                if (!boolValueOf.equals(Boolean.TRUE)) {
                    iC += 12;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return false;
                }
                if (iC == 24) {
                    iC = 0;
                }
            }
            if (((Boolean) arrayList.get(i2)).booleanValue() && ((timeOfDay23 == null || iC >= timeOfDay23.f47287a) && (timeOfDay24 == null || iC <= timeOfDay24.f47287a))) {
                int i3 = (timeOfDay23 == null || iC != timeOfDay23.f47287a) ? 0 : timeOfDay23.b;
                int i4 = (timeOfDay24 == null || iC != timeOfDay24.f47287a) ? 59 : timeOfDay24.b;
                if (i3 > i4) {
                    continue;
                } else {
                    Iterable iterableH = q3d.h(arrayList2);
                    if (!(iterableH instanceof Collection) || !((Collection) iterableH).isEmpty()) {
                        Iterator it = iterableH.iterator();
                        while (((kkx) it).c) {
                            int iNextInt = ((bkx) it).nextInt();
                            if (((Boolean) arrayList3.get(iNextInt)).booleanValue() && i3 <= (iIntValue = ((Number) arrayList2.get(iNextInt)).intValue()) && iIntValue <= i4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean e(tcj tcjVar) {
        int iE;
        SimpleDate simpleDate = tcjVar.f33721a;
        SimpleDate simpleDate2 = tcjVar.b;
        if (simpleDate == null || simpleDate2 == null) {
            return false;
        }
        int i = simpleDate.f47286a;
        int i2 = simpleDate2.f47286a;
        if (i != i2) {
            iE = Intrinsics.e(i, i2);
        } else {
            int i3 = simpleDate.b;
            int i4 = simpleDate2.b;
            iE = i3 != i4 ? Intrinsics.e(i3, i4) : Intrinsics.e(simpleDate.c, simpleDate2.c);
        }
        return iE > 0;
    }

    public static final boolean f(tcj tcjVar, int i, int i2) {
        if (e(tcjVar)) {
            return false;
        }
        SimpleDate simpleDate = tcjVar.f33721a;
        if (simpleDate != null && i == simpleDate.f47286a && i2 < simpleDate.b) {
            return false;
        }
        SimpleDate simpleDate2 = tcjVar.b;
        return simpleDate2 == null || i != simpleDate2.f47286a || i2 <= simpleDate2.b;
    }

    public static final boolean g(TimeOfDay23 timeOfDay23, TimeOfDay23 timeOfDay24) {
        return (timeOfDay23 == null || timeOfDay24 == null || (timeOfDay23.f47287a * 60) + timeOfDay23.b <= (timeOfDay24.f47287a * 60) + timeOfDay24.b) ? false : true;
    }

    public static final boolean h(tcj tcjVar, int i) {
        if (e(tcjVar)) {
            return false;
        }
        SimpleDate simpleDate = tcjVar.f33721a;
        if (simpleDate != null && i < simpleDate.f47286a) {
            return false;
        }
        SimpleDate simpleDate2 = tcjVar.b;
        return simpleDate2 == null || i <= simpleDate2.f47286a;
    }

    public static final int i(psw pswVar, int i, Boolean bool) {
        int iOrdinal = pswVar.ordinal();
        if (iOrdinal == 0) {
            int iD = l1e0.d(i, 0, 11);
            return Intrinsics.d(bool, Boolean.TRUE) ? iD : iD + 12;
        }
        if (iOrdinal == 1) {
            int i2 = i % 12;
            return Intrinsics.d(bool, Boolean.TRUE) ? i2 : i2 + 12;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                t9f.b();
                return 0;
            }
            if (i == 24) {
                return 0;
            }
        }
        return i;
    }

    public static final void j(SnapshotStateList snapshotStateList) {
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            cav0 cav0Var = (cav0) snapshotStateList.get(i);
            if (cav0Var.c) {
                snapshotStateList.set(i, cav0.a(cav0Var, false));
            }
        }
    }
}
