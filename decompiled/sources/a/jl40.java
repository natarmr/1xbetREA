package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.icu.text.DateFormatSymbols;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.text.AttributedCharacterIterator;
import java.text.Bidi;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jl40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16699a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jl40(hr90 hr90Var, Context context, Locale locale, kyf kyfVar) {
        this.f16699a = (byte) 22;
        this.b = hr90Var;
        this.c = context;
        this.d = locale;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0330  */
    /* JADX WARN: Code duplicated, block: B:118:0x0341  */
    /* JADX WARN: Code duplicated, block: B:121:0x0348  */
    /* JADX WARN: Code duplicated, block: B:123:0x034c  */
    /* JADX WARN: Code duplicated, block: B:124:0x034f  */
    /* JADX WARN: Code duplicated, block: B:127:0x036e  */
    /* JADX WARN: Code duplicated, block: B:131:0x037d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0384  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x0410  */
    /* JADX WARN: Code duplicated, block: B:143:0x042b  */
    /* JADX WARN: Code duplicated, block: B:149:0x044e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0480  */
    /* JADX WARN: Code duplicated, block: B:156:0x048c  */
    /* JADX WARN: Code duplicated, block: B:158:0x048f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0492  */
    /* JADX WARN: Code duplicated, block: B:163:0x049c  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:251:0x0677  */
    /* JADX WARN: Code duplicated, block: B:343:0x0859  */
    /* JADX WARN: Code duplicated, block: B:386:0x094c  */
    /* JADX WARN: Code duplicated, block: B:387:0x094f  */
    /* JADX WARN: Code duplicated, block: B:432:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj) throws Throwable {
        char c;
        char c2;
        boolean z;
        List listL0;
        int i;
        int iNextIndex;
        v9v0 v9v0Var;
        int iIntValue;
        Iterable iterableC;
        boolean zBooleanValue;
        Throwable th;
        char c3;
        IntRange intRange;
        Iterable iterable;
        List listA;
        int i2;
        mdj mdjVar;
        scj scjVar;
        xev0 xev0Var;
        int i3;
        int i4;
        List listD0;
        ArrayList arrayList;
        Iterator it;
        v9v0 v9v0Var2;
        v9v0 v9v0Var3;
        int actualMaximum;
        String bestDateTimePattern;
        int i5;
        ArrayList arrayList2;
        Iterator it2;
        lc00 lc00VarB;
        Iterator it3;
        int iOrdinal;
        v9v0 v9v0Var4;
        int iNextInt;
        StringBuilder sb;
        String str;
        boolean z2;
        int iNextInt2;
        String str2;
        StringBuilder sb2;
        int i6;
        String str3;
        String string;
        Integer num;
        int iIntValue2;
        hr90 hr90Var = (hr90) this.b;
        Context context = (Context) this.c;
        Locale locale = (Locale) this.d;
        uo90 uo90Var = (uo90) obj;
        uo90Var.getClass();
        ArrayList arrayList3 = uo90Var.b;
        zp90 zp90Var = uo90Var.f36001a;
        Locale locale2 = zp90Var.f44749a;
        if (hr90Var != null) {
            if (hr90Var instanceof fr90) {
                IntRange intRange2 = up90.f36053a;
                fr90 fr90Var = (fr90) hr90Var;
                nfj nfjVar = nfj.f23439a;
                SimpleDate simpleDate = fr90Var.f10008a;
                if (simpleDate == null) {
                    Calendar calendar = Calendar.getInstance(locale);
                    simpleDate = new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                }
                xdr xdrVar = fr90Var.d;
                Function2 function2 = fr90Var.c;
                Function1 function1 = fr90Var.b;
                context.getClass();
                intRange2.getClass();
                zej zejVar = zej.c;
                context.getClass();
                zejVar.getClass();
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(locale2);
                Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
                contextCreateConfigurationContext.getClass();
                Set set = zejVar.b;
                if (set.size() == 1) {
                    listA = CollectionsKt.L0(set);
                    intRange = intRange2;
                    th = null;
                } else {
                    th = null;
                    AttributedCharacterIterator toCharacterIterator = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale2, zejVar.f44255a), locale2).formatToCharacterIterator(w9v0.f38800a);
                    toCharacterIterator.getClass();
                    StringBuilder sb3 = new StringBuilder();
                    char cFirst = toCharacterIterator.first();
                    while (true) {
                        if (cFirst == 65535) {
                            break;
                        }
                        sb3.append(cFirst);
                        cFirst = toCharacterIterator.next();
                    }
                    String string2 = sb3.toString();
                    if (string2.length() == 0) {
                        listA = uo90.a(contextCreateConfigurationContext, zejVar);
                        intRange = intRange2;
                    } else {
                        int length = string2.length();
                        mdj[] mdjVarArr = new mdj[length];
                        char cFirst2 = toCharacterIterator.first();
                        intRange = intRange2;
                        int i7 = 0;
                        for (c3 = 65535; cFirst2 != c3 && i7 < length; c3 = 65535) {
                            Iterator<T> it4 = toCharacterIterator.getAttributes().keySet().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    i2 = i7;
                                    mdjVar = null;
                                    break;
                                }
                                AttributedCharacterIterator.Attribute attribute = (AttributedCharacterIterator.Attribute) it4.next();
                                attribute.getClass();
                                i2 = i7;
                                if (attribute.equals(java.text.DateFormat.Field.YEAR)) {
                                    mdjVar = mdj.f21599a;
                                } else if (attribute.equals(java.text.DateFormat.Field.MONTH)) {
                                    mdjVar = mdj.b;
                                } else {
                                    mdjVar = attribute.equals(java.text.DateFormat.Field.DAY_OF_MONTH) ? mdj.c : null;
                                }
                                if (mdjVar != null) {
                                    break;
                                }
                                i7 = i2;
                            }
                            mdjVarArr[i2] = mdjVar;
                            cFirst2 = toCharacterIterator.next();
                            i7 = i2 + 1;
                        }
                        boolean z3 = TextUtils.getLayoutDirectionFromLocale(locale2) == 1;
                        if (string2.length() == 0) {
                            iterable = iun.f15405a;
                        } else {
                            Bidi bidi = new Bidi(string2, z3 ? -1 : -2);
                            int length2 = string2.length();
                            byte[] bArr = new byte[length2];
                            int i8 = 0;
                            while (i8 < length2) {
                                bArr[i8] = (byte) bidi.getLevelAt(i8);
                                i8++;
                                length2 = length2;
                            }
                            int length3 = string2.length();
                            Object[] objArr = new Object[length3];
                            for (int i9 = 0; i9 < length3; i9++) {
                                objArr[i9] = Integer.valueOf(i9);
                            }
                            Bidi.reorderVisually(bArr, 0, objArr, 0, string2.length());
                            ArrayList arrayList4 = new ArrayList(length3);
                            for (int i10 = 0; i10 < length3; i10++) {
                                Object obj2 = objArr[i10];
                                obj2.getClass();
                                arrayList4.add((Integer) obj2);
                            }
                            iterable = arrayList4;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it5 = iterable.iterator();
                        while (it5.hasNext()) {
                            mdj mdjVar2 = (mdj) tx3.G(((Number) it5.next()).intValue(), mdjVarArr);
                            if (mdjVar2 != null) {
                                arrayList5.add(mdjVar2);
                            }
                        }
                        List listL1 = CollectionsKt.L0(CollectionsKt.O0(arrayList5));
                        if (!Intrinsics.d(CollectionsKt.P0(listL1), set)) {
                            listL1 = null;
                        }
                        listA = listL1 == null ? uo90.a(contextCreateConfigurationContext, zejVar) : listL1;
                    }
                }
                uo90Var.c = listA;
                try {
                    String bestDateTimePattern2 = DateFormat.getBestDateTimePattern(locale2, "y");
                    String bestDateTimePattern3 = DateFormat.getBestDateTimePattern(locale2, TokenNames.M);
                    String bestDateTimePattern4 = DateFormat.getBestDateTimePattern(locale2, "d");
                    bestDateTimePattern2.getClass();
                    String strD = uo90.d(bestDateTimePattern2, 'y');
                    bestDateTimePattern3.getClass();
                    String strD2 = uo90.d(bestDateTimePattern3, 'M');
                    bestDateTimePattern4.getClass();
                    scjVar = new scj(strD, strD2, uo90.d(bestDateTimePattern4, 'd'));
                } catch (Throwable unused) {
                    scjVar = scj.d;
                }
                NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale2);
                integerInstance.setGroupingUsed(false);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(locale2);
                List listL2 = CollectionsKt.L0(intRange);
                integerInstance.setMinimumIntegerDigits(1);
                ArrayList arrayList6 = new ArrayList(r3d.q(listL2, 10));
                Iterator it6 = listL2.iterator();
                int i11 = 0;
                while (it6.hasNext()) {
                    Object next = it6.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        q3d.p();
                        throw th;
                    }
                    int iIntValue3 = ((Number) next).intValue();
                    String strM = twn.m(i11, "year-");
                    StringBuilder sb4 = new StringBuilder();
                    Iterator it7 = it6;
                    sb4.append(integerInstance.format(Integer.valueOf(iIntValue3)));
                    String str4 = scjVar.f31989a;
                    if (str4 != null) {
                        sb4.append(str4);
                    }
                    arrayList6.add(new u9v0(strM, sb4.toString(), Integer.valueOf(iIntValue3), ((Boolean) function1.invoke(Integer.valueOf(iIntValue3))).booleanValue()));
                    i11 = i12;
                    it6 = it7;
                    function1 = function1;
                }
                int i13 = simpleDate.f47286a;
                int i14 = simpleDate.b;
                int iIndexOf = listL2.indexOf(Integer.valueOf(i13));
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                v9v0 v9v0Var5 = new v9v0(iIndexOf, th, arrayList6);
                integerInstance.setMinimumIntegerDigits(1);
                nfj nfjVar2 = nfj.f23439a;
                String bestDateTimePattern5 = DateFormat.getBestDateTimePattern(locale2, "yMMMMd");
                bestDateTimePattern5.getClass();
                if (StringsKt.O(bestDateTimePattern5, "MMMM", false)) {
                    xev0Var = xev0.f40762a;
                } else {
                    String bestDateTimePattern6 = DateFormat.getBestDateTimePattern(locale2, "yMMMd");
                    bestDateTimePattern6.getClass();
                    xev0Var = StringsKt.O(bestDateTimePattern6, "MMMM", false) ? xev0.f40762a : xev0.b;
                }
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale2);
                int iOrdinal2 = xev0Var.ordinal();
                if (iOrdinal2 != 0) {
                    i4 = 1;
                    if (iOrdinal2 == 1) {
                        i3 = 0;
                    } else {
                        if (iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        i3 = 2;
                    }
                    String[] months = dateFormatSymbols.getMonths(i4, i3);
                    months.getClass();
                    listD0 = CollectionsKt.D0(tx3.g0(months), 12);
                    integerInstance.setMinimumIntegerDigits(i4);
                    IntRange intRange3 = new IntRange(i4, 12, i4);
                    arrayList = new ArrayList(r3d.q(intRange3, 10));
                    it = intRange3.iterator();
                    while (((kkx) it).c) {
                        iNextInt2 = ((bkx) it).nextInt();
                        int i15 = iNextInt2 - 1;
                        str2 = (String) CollectionsKt.W(i15, listD0);
                        if (str2 == null) {
                            sb2 = new StringBuilder();
                            i6 = iNextInt2;
                            sb2.append(integerInstance.format(Integer.valueOf(i6)));
                            str3 = scjVar.b;
                            if (str3 != null) {
                                sb2.append(str3);
                            }
                            string = sb2.toString();
                        } else {
                            if (StringsKt.W(str2)) {
                                str2 = null;
                            }
                            if (str2 == null) {
                                sb2 = new StringBuilder();
                                i6 = iNextInt2;
                                sb2.append(integerInstance.format(Integer.valueOf(i6)));
                                str3 = scjVar.b;
                                if (str3 != null) {
                                    sb2.append(str3);
                                }
                                string = sb2.toString();
                            } else {
                                string = str2;
                                i6 = iNextInt2;
                            }
                        }
                        num = (Integer) CollectionsKt.W(i13, listL2);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = i13;
                        }
                        arrayList.add(new u9v0(twn.m(i15, "month-"), string, Integer.valueOf(i6), ((Boolean) function2.invoke(Integer.valueOf(iIntValue2), Integer.valueOf(i6))).booleanValue()));
                        it = it;
                        v9v0Var5 = v9v0Var5;
                        listL2 = listL2;
                        listD0 = listD0;
                    }
                    v9v0Var2 = v9v0Var5;
                    int i16 = i14 - 1;
                    v9v0Var3 = new v9v0(l1e0.d(i16, 0, 11), null, arrayList);
                    gregorianCalendar.set(1, i13);
                    gregorianCalendar.set(2, i16);
                    gregorianCalendar.set(5, 1);
                    actualMaximum = gregorianCalendar.getActualMaximum(5);
                    bestDateTimePattern = DateFormat.getBestDateTimePattern(locale2, "yMd");
                    bestDateTimePattern.getClass();
                    if (uo90.c(bestDateTimePattern, 'd')) {
                        i5 = 2;
                    } else {
                        i5 = 1;
                    }
                    integerInstance.setMinimumIntegerDigits(i5);
                    IntRange intRange4 = new IntRange(1, 31, 1);
                    arrayList2 = new ArrayList(r3d.q(intRange4, 10));
                    it2 = intRange4.iterator();
                    while (((kkx) it2).c) {
                        iNextInt = ((bkx) it2).nextInt();
                        sb = new StringBuilder();
                        sb.append(integerInstance.format(Integer.valueOf(iNextInt)));
                        str = scjVar.c;
                        if (str != null) {
                            sb.append(str);
                        }
                        String string3 = sb.toString();
                        if (iNextInt <= actualMaximum || !((Boolean) xdrVar.F(Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(iNextInt))).booleanValue()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList2.add(new u9v0(twn.m(iNextInt - 1, "day-"), string3, Integer.valueOf(iNextInt), z2));
                    }
                    l1e0.d(simpleDate.c - 1, 0, 30);
                    lc00VarB = kotlin.collections.a.b();
                    it3 = uo90Var.c.iterator();
                    while (it3.hasNext()) {
                        iOrdinal = ((mdj) it3.next()).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                lc00VarB.add(v9v0Var3);
                            } else {
                                if (iOrdinal == 2) {
                                    t9f.b();
                                    return null;
                                }
                                nfj nfjVar3 = nfj.f23439a;
                            }
                            v9v0Var4 = v9v0Var2;
                        } else {
                            v9v0Var4 = v9v0Var2;
                            lc00VarB.add(v9v0Var4);
                        }
                        v9v0Var2 = v9v0Var4;
                    }
                    w3d.u(arrayList3, kotlin.collections.a.a(lc00VarB));
                } else {
                    i3 = 1;
                }
                i4 = 1;
                String[] months2 = dateFormatSymbols.getMonths(i4, i3);
                months2.getClass();
                listD0 = CollectionsKt.D0(tx3.g0(months2), 12);
                integerInstance.setMinimumIntegerDigits(i4);
                IntRange intRange5 = new IntRange(i4, 12, i4);
                arrayList = new ArrayList(r3d.q(intRange5, 10));
                it = intRange5.iterator();
                while (((kkx) it).c) {
                    iNextInt2 = ((bkx) it).nextInt();
                    int i17 = iNextInt2 - 1;
                    str2 = (String) CollectionsKt.W(i17, listD0);
                    if (str2 == null) {
                        sb2 = new StringBuilder();
                        i6 = iNextInt2;
                        sb2.append(integerInstance.format(Integer.valueOf(i6)));
                        str3 = scjVar.b;
                        if (str3 != null) {
                            sb2.append(str3);
                        }
                        string = sb2.toString();
                    } else {
                        if (StringsKt.W(str2)) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            sb2 = new StringBuilder();
                            i6 = iNextInt2;
                            sb2.append(integerInstance.format(Integer.valueOf(i6)));
                            str3 = scjVar.b;
                            if (str3 != null) {
                                sb2.append(str3);
                            }
                            string = sb2.toString();
                        } else {
                            string = str2;
                            i6 = iNextInt2;
                        }
                    }
                    num = (Integer) CollectionsKt.W(i13, listL2);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = i13;
                    }
                    arrayList.add(new u9v0(twn.m(i17, "month-"), string, Integer.valueOf(i6), ((Boolean) function2.invoke(Integer.valueOf(iIntValue2), Integer.valueOf(i6))).booleanValue()));
                    it = it;
                    v9v0Var5 = v9v0Var5;
                    listL2 = listL2;
                    listD0 = listD0;
                }
                v9v0Var2 = v9v0Var5;
                int i18 = i14 - 1;
                v9v0Var3 = new v9v0(l1e0.d(i18, 0, 11), null, arrayList);
                gregorianCalendar.set(1, i13);
                gregorianCalendar.set(2, i18);
                gregorianCalendar.set(5, 1);
                actualMaximum = gregorianCalendar.getActualMaximum(5);
                bestDateTimePattern = DateFormat.getBestDateTimePattern(locale2, "yMd");
                bestDateTimePattern.getClass();
                if (uo90.c(bestDateTimePattern, 'd')) {
                    i5 = 2;
                } else {
                    i5 = 1;
                }
                integerInstance.setMinimumIntegerDigits(i5);
                IntRange intRange6 = new IntRange(1, 31, 1);
                arrayList2 = new ArrayList(r3d.q(intRange6, 10));
                it2 = intRange6.iterator();
                while (((kkx) it2).c) {
                    iNextInt = ((bkx) it2).nextInt();
                    sb = new StringBuilder();
                    sb.append(integerInstance.format(Integer.valueOf(iNextInt)));
                    str = scjVar.c;
                    if (str != null) {
                        sb.append(str);
                    }
                    String string4 = sb.toString();
                    if (iNextInt <= actualMaximum) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    arrayList2.add(new u9v0(twn.m(iNextInt - 1, "day-"), string4, Integer.valueOf(iNextInt), z2));
                }
                l1e0.d(simpleDate.c - 1, 0, 30);
                lc00VarB = kotlin.collections.a.b();
                it3 = uo90Var.c.iterator();
                while (it3.hasNext()) {
                    iOrdinal = ((mdj) it3.next()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            lc00VarB.add(v9v0Var3);
                        } else {
                            if (iOrdinal == 2) {
                                t9f.b();
                                return null;
                            }
                            nfj nfjVar4 = nfj.f23439a;
                        }
                        v9v0Var4 = v9v0Var2;
                    } else {
                        v9v0Var4 = v9v0Var2;
                        lc00VarB.add(v9v0Var4);
                    }
                    v9v0Var2 = v9v0Var4;
                }
                w3d.u(arrayList3, kotlin.collections.a.a(lc00VarB));
            } else if (hr90Var instanceof gr90) {
                gr90 gr90Var = (gr90) hr90Var;
                TimeOfDay23 timeOfDay23 = gr90Var.f11768a;
                if (timeOfDay23 == null) {
                    Calendar calendar2 = Calendar.getInstance(locale);
                    timeOfDay23 = new TimeOfDay23(calendar2.get(11), calendar2.get(12));
                }
                int i19 = timeOfDay23.f47287a;
                int i20 = timeOfDay23.b;
                byte b = gr90Var.b.f42569a;
                Function1 function3 = gr90Var.c;
                Function1 function4 = gr90Var.d;
                psw pswVarI = d9x.I(locale2);
                if (zp90Var.b.booleanValue()) {
                    if (!pswVarI.b()) {
                        pswVarI = psw.c;
                    }
                } else if (!pswVarI.a()) {
                    pswVarI = psw.b;
                }
                String str5 = "hma";
                String str6 = "Hm";
                String bestDateTimePattern7 = DateFormat.getBestDateTimePattern(locale2, pswVarI.b() ? "Hm" : "hma");
                bestDateTimePattern7.getClass();
                int iOrdinal3 = pswVarI.ordinal();
                if (iOrdinal3 != 0) {
                    c = 'K';
                    if (iOrdinal3 == 1) {
                        c2 = 'h';
                    } else if (iOrdinal3 == 2) {
                        c2 = 'H';
                    } else {
                        if (iOrdinal3 != 3) {
                            t9f.b();
                            return null;
                        }
                        c2 = 'k';
                    }
                } else {
                    c = 'K';
                    c2 = 'K';
                }
                boolean zC = uo90.c(bestDateTimePattern7, c2);
                boolean zC2 = uo90.c(bestDateTimePattern7, 'm');
                int iOrdinal4 = pswVarI.ordinal();
                if (iOrdinal4 == 0) {
                    z = false;
                    listL0 = CollectionsKt.L0(new IntRange(0, 11, 1));
                } else if (iOrdinal4 == 1) {
                    z = false;
                    listL0 = CollectionsKt.L0(new IntRange(1, 12, 1));
                } else if (iOrdinal4 == 2) {
                    z = false;
                    listL0 = CollectionsKt.L0(new IntRange(0, 23, 1));
                } else {
                    if (iOrdinal4 != 3) {
                        t9f.b();
                        return null;
                    }
                    listL0 = CollectionsKt.L0(new IntRange(1, 24, 1));
                    z = false;
                }
                NumberFormat integerInstance2 = NumberFormat.getIntegerInstance(locale2);
                integerInstance2.setGroupingUsed(z);
                boolean z4 = pswVarI.a() && i19 >= 12;
                integerInstance2.setMinimumIntegerDigits(zC ? 2 : 1);
                ArrayList arrayList7 = new ArrayList(r3d.q(listL0, 10));
                Iterator it8 = listL0.iterator();
                int i21 = 0;
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        q3d.p();
                        throw null;
                    }
                    Iterator it9 = it8;
                    int iIntValue4 = ((Number) next2).intValue();
                    if (pswVarI.b()) {
                        zBooleanValue = ((Boolean) function3.invoke(Integer.valueOf(iIntValue4))).booleanValue();
                        str5 = str5;
                    } else {
                        int iD = (iIntValue4 == 0 || iIntValue4 == 12) ? 0 : l1e0.d(iIntValue4, 1, 11);
                        if (z4) {
                            iD += 12;
                        }
                        zBooleanValue = ((Boolean) function3.invoke(Integer.valueOf(iD))).booleanValue();
                    }
                    String str7 = integerInstance2.format(Integer.valueOf(iIntValue4));
                    str7.getClass();
                    arrayList7.add(new u9v0("hour-" + i21, str7, Integer.valueOf(iIntValue4), zBooleanValue));
                    str5 = str5;
                    pswVarI = pswVarI;
                    i21 = i22;
                    it8 = it9;
                    str6 = str6;
                    z4 = z4;
                }
                psw pswVar = pswVarI;
                String str8 = str5;
                String str9 = str6;
                int iOrdinal5 = pswVar.ordinal();
                if (iOrdinal5 == 0) {
                    i = i19 % 12;
                } else if (iOrdinal5 == 1) {
                    i = i19 % 12;
                    if (i == 0) {
                        i = 12;
                    }
                } else if (iOrdinal5 == 2) {
                    i = i19;
                } else {
                    if (iOrdinal5 != 3) {
                        t9f.b();
                        return null;
                    }
                    if (i19 == 0) {
                        i = 24;
                    } else {
                        i = i19;
                    }
                }
                int iIndexOf2 = listL0.indexOf(Integer.valueOf(i));
                if (iIndexOf2 < 0) {
                    iIndexOf2 = 0;
                }
                v9v0 v9v0Var6 = new v9v0(iIndexOf2, null, arrayList7);
                List listL3 = CollectionsKt.L0(l1e0.m(b, l1e0.o(0, 60)));
                integerInstance2.setMinimumIntegerDigits(zC2 ? 2 : 1);
                ArrayList arrayList8 = new ArrayList(r3d.q(listL3, 10));
                Iterator it10 = listL3.iterator();
                int i23 = 0;
                while (it10.hasNext()) {
                    Object next3 = it10.next();
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int iIntValue5 = ((Number) next3).intValue();
                    String str10 = integerInstance2.format(Integer.valueOf(iIntValue5));
                    str10.getClass();
                    arrayList8.add(new u9v0("minute-" + i23, str10, Integer.valueOf(iIntValue5), ((Boolean) function4.invoke(Integer.valueOf(iIntValue5))).booleanValue()));
                    it10 = it10;
                    i23 = i24;
                }
                int iIndexOf3 = listL3.indexOf(Integer.valueOf(i20));
                if (iIndexOf3 >= 0) {
                    iNextIndex = iIndexOf3;
                } else {
                    ListIterator listIterator = listL3.listIterator(listL3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((Number) listIterator.previous()).intValue() <= i20) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (iNextIndex < 0) {
                        iNextIndex = 0;
                    }
                }
                v9v0 v9v0Var7 = new v9v0(iNextIndex, null, arrayList8);
                boolean z5 = pswVar.a() && uo90.b(listL0, false, function3);
                boolean z6 = pswVar.a() && uo90.b(listL0, true, function3);
                if (pswVar.a()) {
                    String[] amPmStrings = new java.text.DateFormatSymbols(locale2).getAmPmStrings();
                    amPmStrings.getClass();
                    String str11 = (String) tx3.G(0, amPmStrings);
                    if (str11 == null) {
                        str11 = "AM";
                    }
                    String str12 = (String) tx3.G(1, amPmStrings);
                    if (str12 == null) {
                        str12 = "PM";
                    }
                    v9v0Var = new v9v0((i19 < 12 ? 1 : 0) ^ 1, null, q3d.j(new u9v0("ampm-0", str11, Boolean.TRUE, z5), new u9v0("ampm-1", str12, Boolean.FALSE, z6)));
                } else {
                    v9v0Var = null;
                }
                boolean zB = pswVar.b();
                String bestDateTimePattern8 = DateFormat.getBestDateTimePattern(locale2, zB ? str9 : str8);
                char[] cArr = zB ? new char[]{'H', 'k'} : new char[]{'h', c};
                ArrayList arrayList9 = new ArrayList(cArr.length);
                for (char c4 : cArr) {
                    bestDateTimePattern8.getClass();
                    arrayList9.add(Integer.valueOf(StringsKt.U(c4, 0, 6, bestDateTimePattern8)));
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj3 : arrayList9) {
                    if (((Number) obj3).intValue() >= 0) {
                        arrayList10.add(obj3);
                    }
                }
                Integer num2 = (Integer) CollectionsKt.j0(arrayList10);
                int iIntValue6 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                bestDateTimePattern8.getClass();
                int iU = StringsKt.U('m', 0, 6, bestDateTimePattern8);
                Integer numValueOf = Integer.valueOf(iU);
                if (iU < 0) {
                    numValueOf = null;
                }
                int iIntValue7 = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
                char[] cArr2 = {'a', 'b', 'B'};
                if (zB) {
                    iIntValue = Integer.MAX_VALUE;
                } else {
                    ArrayList arrayList11 = new ArrayList(3);
                    for (int i25 = 0; i25 < 3; i25++) {
                        arrayList11.add(Integer.valueOf(StringsKt.U(cArr2[i25], 0, 6, bestDateTimePattern8)));
                    }
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj4 : arrayList11) {
                        if (((Number) obj4).intValue() >= 0) {
                            arrayList12.add(obj4);
                        }
                    }
                    Integer num3 = (Integer) CollectionsKt.j0(arrayList12);
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = Integer.MAX_VALUE;
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                if (iIntValue6 != Integer.MAX_VALUE) {
                    arrayList13.add(new Pair(Integer.valueOf(iIntValue6), vgq0.f37395a));
                }
                if (iIntValue7 != Integer.MAX_VALUE) {
                    arrayList13.add(new Pair(Integer.valueOf(iIntValue7), vgq0.b));
                }
                if (!zB) {
                    if (iIntValue != Integer.MAX_VALUE) {
                        arrayList13.add(new Pair(Integer.valueOf(iIntValue), vgq0.c));
                    } else {
                        arrayList13.add(new Pair(Integer.valueOf((iIntValue7 != Integer.MAX_VALUE ? iIntValue7 : iIntValue6 != Integer.MAX_VALUE ? iIntValue6 : -1) + 1), vgq0.c));
                    }
                }
                List listA0 = CollectionsKt.A0(arrayList13, new lk30((byte) 17));
                ArrayList arrayList14 = new ArrayList(r3d.q(listA0, 10));
                Iterator it11 = listA0.iterator();
                while (it11.hasNext()) {
                    arrayList14.add((vgq0) ((Pair) it11.next()).b);
                }
                if (arrayList14.isEmpty()) {
                    List listJ = q3d.j(vgq0.f37395a, vgq0.b);
                    if (zB) {
                        iterableC = iun.f15405a;
                    } else {
                        iterableC = kotlin.collections.a.c(vgq0.c);
                    }
                    arrayList14 = CollectionsKt.q0(listJ, iterableC);
                } else {
                    Iterator it12 = arrayList14.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            List listJ2 = q3d.j(vgq0.f37395a, vgq0.b);
                            if (zB) {
                                iterableC = iun.f15405a;
                            } else {
                                iterableC = kotlin.collections.a.c(vgq0.c);
                            }
                            arrayList14 = CollectionsKt.q0(listJ2, iterableC);
                        } else if (((vgq0) it12.next()) == vgq0.f37395a) {
                        }
                    }
                }
                ArrayList arrayList15 = new ArrayList(arrayList14);
                if (pswVar.a()) {
                    if (arrayList15.isEmpty()) {
                        arrayList15.add(vgq0.c);
                        break;
                    }
                    Iterator it13 = arrayList15.iterator();
                    do {
                        if (!it13.hasNext()) {
                            arrayList15.add(vgq0.c);
                            break;
                        }
                    } while (((vgq0) it13.next()) != vgq0.c);
                }
                lc00 lc00VarB2 = kotlin.collections.a.b();
                Iterator it14 = arrayList15.iterator();
                while (it14.hasNext()) {
                    int iOrdinal6 = ((vgq0) it14.next()).ordinal();
                    if (iOrdinal6 == 0) {
                        lc00VarB2.add(v9v0Var6);
                    } else if (iOrdinal6 == 1) {
                        lc00VarB2.add(v9v0Var7);
                    } else {
                        if (iOrdinal6 != 2) {
                            t9f.b();
                            return null;
                        }
                        if (v9v0Var != null) {
                            lc00VarB2.add(v9v0Var);
                        }
                    }
                }
                w3d.u(arrayList3, kotlin.collections.a.a(lc00VarB2));
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jl40.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ jl40(Object obj, Object obj2, Object obj3, byte b) {
        this.f16699a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
