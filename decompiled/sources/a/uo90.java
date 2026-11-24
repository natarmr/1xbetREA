package a;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class uo90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zp90 f36001a;
    public final ArrayList b = new ArrayList();
    public List c;
    public final iun d;

    public uo90(zp90 zp90Var) {
        this.f36001a = zp90Var;
        iun iunVar = iun.f15405a;
        this.c = iunVar;
        this.d = iunVar;
    }

    public static ArrayList a(Context context, zej zejVar) {
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(context);
        dateFormatOrder.getClass();
        int length = dateFormatOrder.length;
        Character[] chArr = new Character[length];
        int length2 = dateFormatOrder.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            chArr[i2] = Character.valueOf(dateFormatOrder[i2]);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            mdj mdjVar = null;
            if (i >= length) {
                break;
            }
            char cCharValue = chArr[i].charValue();
            if (cCharValue == 'L' || cCharValue == 'M') {
                mdjVar = mdj.b;
            } else if (cCharValue == 'd') {
                mdjVar = mdj.c;
            } else if (cCharValue == 'y') {
                mdjVar = mdj.f21599a;
            }
            if (mdjVar != null) {
                arrayList.add(mdjVar);
            }
            i++;
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listL0) {
            if (zejVar.b.contains((mdj) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = Intrinsics.d(CollectionsKt.P0(arrayList2), zejVar.b) ? arrayList2 : null;
        if (arrayList3 != null) {
            return arrayList3;
        }
        List list = w9v0.b;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (zejVar.b.contains((mdj) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public static boolean b(List list, boolean z, Function1 function1) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                int iD = (iIntValue == 0 || iIntValue == 12) ? 0 : l1e0.d(iIntValue, 1, 11);
                if (z) {
                    iD += 12;
                }
                if (((Boolean) function1.invoke(Integer.valueOf(iD))).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(String str, char c) {
        int i;
        int iT = StringsKt.T(str);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (i2 <= iT) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\'' && (i = i2 + 1) <= iT && str.charAt(i) == '\'') {
                i2 += 2;
            } else {
                if (cCharAt == '\'') {
                    z = !z;
                } else if (!z) {
                    if (cCharAt == c) {
                        i3++;
                        if (i3 >= 2) {
                            return true;
                        }
                    } else {
                        i2++;
                        i3 = 0;
                    }
                }
                i2++;
            }
        }
        return false;
    }

    public static String d(String str, char c) {
        IntRange intRange;
        int i;
        int i2;
        int iT = StringsKt.T(str);
        int iCharCount = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
        while (true) {
            if (i3 > iT) {
                if (i4 == -1) {
                    intRange = null;
                    break;
                }
                intRange = new IntRange(i4, iT, 1);
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\'' && (i2 = i3 + 1) <= iT && str.charAt(i2) == '\'') {
                i3 += 2;
            } else {
                if (cCharAt == '\'') {
                    z = !z;
                } else if (!z) {
                    if (cCharAt != c) {
                        if (i4 != -1) {
                            intRange = new IntRange(i4, i3 - 1, 1);
                            break;
                        }
                    } else if (i4 == -1) {
                        i4 = i3;
                        i3++;
                    }
                }
                i3++;
            }
        }
        if (intRange != null && (i = intRange.b + 1) < str.length()) {
            String strSubstring = str.substring(i);
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            while (i5 < strSubstring.length()) {
                char cCharAt2 = strSubstring.charAt(i5);
                if (cCharAt2 == '\'') {
                    int i6 = i5 + 1;
                    if (i6 >= strSubstring.length() || strSubstring.charAt(i6) != '\'') {
                        i5 = i6;
                    } else {
                        sb.append('\'');
                        i5 += 2;
                    }
                } else {
                    sb.append(cCharAt2);
                    i5++;
                }
            }
            String string = StringsKt.u0(sb.toString()).toString();
            if (string.length() > 0) {
                while (iCharCount < string.length()) {
                    int iCodePointAt = string.codePointAt(iCharCount);
                    if (Character.isLetter(iCodePointAt)) {
                        return string;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
        }
        return null;
    }
}
