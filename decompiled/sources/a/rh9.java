package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rh9 extends tyc {
    public rh9(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int v0(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String w0() {
        int iV0;
        if (y()) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(this.b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int iIntValue = O().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = O().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = O().intValue();
                    } else {
                        int iV1 = v0(iIntValue);
                        if (iV1 != -1) {
                            for (int i = 1; i <= 5 && (iV0 = v0((iIntValue = O().intValue()))) != -1; i++) {
                                iV1 = (iV1 * 16) + iV0;
                            }
                            sb.append((char) iV1);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = O().intValue();
        }
        return sb.toString();
    }

    public final String x0() {
        int i;
        String str = (String) this.d;
        boolean zY = y();
        int i2 = this.b;
        if (zY) {
            i = i2;
        } else {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i = this.b;
            }
            this.b = i2;
        }
        if (i == i2) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        this.b = i;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:190:0x031d  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:254:0x042e  */
    /* JADX WARN: Code duplicated, block: B:260:0x044f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0455  */
    /* JADX WARN: Code duplicated, block: B:266:0x0469  */
    /* JADX WARN: Code duplicated, block: B:270:0x047a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r11v10, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v13, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v14, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v15, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v16, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.di9] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r8v13, types: [a.eld0] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final ArrayList y0() {
        ArrayList arrayList;
        int i;
        ?? di9Var;
        boolean z;
        ci9 ci9Var;
        ArrayList arrayList2;
        int i2;
        String strS;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        ejx ejxVarB;
        ?? r8;
        eld0 eld0Var;
        eld0 eld0Var2;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayListY0;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        yh9 yh9Var;
        String str = null;
        if (y()) {
            return null;
        }
        ?? r3 = 1;
        ArrayList arrayList6 = new ArrayList(1);
        ci9 ci9Var2 = new ci9();
        while (!y() && !y()) {
            int i5 = this.b;
            ArrayList arrayList7 = ci9Var2.f4400a;
            int i6 = 2;
            boolean z4 = false;
            if (arrayList7 == null || arrayList7.isEmpty()) {
                i = 0;
            } else if (u('>')) {
                h0();
                i = 2;
            } else if (u('+')) {
                h0();
                i = 3;
            } else {
                i = 0;
            }
            if (u('*')) {
                di9Var = new di9(i, str);
            } else {
                String strX0 = x0();
                if (strX0 != null) {
                    di9 di9Var2 = new di9(i, strX0);
                    ci9Var2.b += r3;
                    di9Var = di9Var2;
                } else {
                    di9Var = str;
                }
            }
            while (!y()) {
                if (u('.')) {
                    if (di9Var == 0) {
                        di9Var = new di9(i, str);
                    }
                    String strX1 = x0();
                    if (strX1 == null) {
                        throw new ph9("Invalid \".class\" simpleSelectors");
                    }
                    di9Var.a(i6, "class", strX1);
                    ci9Var2.a();
                } else if (u('#')) {
                    if (di9Var == 0) {
                        di9Var = new di9(i, str);
                    }
                    String strX2 = x0();
                    if (strX2 == null) {
                        throw new ph9("Invalid \"#id\" simpleSelectors");
                    }
                    di9Var.a(i6, ParameterNames.ID, strX2);
                    ci9Var2.b += 1000000;
                } else if (u('[')) {
                    if (di9Var == 0) {
                        di9Var = new di9(i, str);
                    }
                    h0();
                    String strX3 = x0();
                    if (strX3 == null) {
                        throw new ph9("Invalid attribute simpleSelectors");
                    }
                    h0();
                    if (u('=')) {
                        i2 = i6;
                    } else if (v("~=")) {
                        i2 = 3;
                    } else {
                        i2 = v("|=") ? 4 : z4 ? 1 : 0;
                    }
                    if (i2 != 0) {
                        h0();
                        if (y()) {
                            strS = str;
                        } else {
                            strS = S();
                            if (strS == null) {
                                strS = x0();
                            }
                        }
                        if (strS == null) {
                            throw new ph9("Invalid attribute simpleSelectors");
                        }
                        h0();
                    } else {
                        strS = str;
                    }
                    if (!u(']')) {
                        throw new ph9("Invalid attribute simpleSelectors");
                    }
                    if (i2 == 0) {
                        i2 = r3 == true ? 1 : 0;
                    }
                    di9Var.a(i2, strX3, strS);
                    ci9Var2.a();
                } else {
                    di9Var = di9Var;
                    if (u(':')) {
                        if (di9Var == 0) {
                            di9Var = new di9(i, str);
                        }
                        String strX4 = x0();
                        if (strX4 == null) {
                            throw new ph9("Invalid pseudo class");
                        }
                        wh9 wh9Var = (wh9) wh9.e.get(strX4);
                        if (wh9Var == null) {
                            wh9Var = wh9.d;
                        }
                        switch (wh9Var.ordinal()) {
                            case 0:
                                z2 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                i3 = 2;
                                vh9 vh9Var = new vh9((byte) 2);
                                ci9Var2.a();
                                obj = vh9Var;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 1:
                                ci9Var2 = ci9Var2;
                                z3 = true;
                                vh9 vh9Var2 = new vh9((byte) 1);
                                ci9Var2.a();
                                obj2 = vh9Var2;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z5 = (wh9Var == wh9.f39155a || wh9Var == wh9.b) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                boolean z6 = (wh9Var == wh9.b || wh9Var == wh9.c) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                int i7 = this.c;
                                String str2 = (String) this.d;
                                if (y()) {
                                    r8 = str;
                                    ci9Var2 = ci9Var2;
                                } else {
                                    int i8 = this.b;
                                    if (u('(')) {
                                        h0();
                                        if (v("odd")) {
                                            eld0Var2 = new eld0(2, r3 == true ? 1 : 0, r3 == true ? (byte) 1 : (byte) 0);
                                        } else {
                                            if (v("even")) {
                                                eld0Var2 = new eld0(2, z4 ? 1 : 0, r3 == true ? (byte) 1 : (byte) 0);
                                            } else {
                                                int i9 = (!u('+') && u('-')) ? -1 : r3 == true ? 1 : 0;
                                                ejx ejxVarB2 = ejx.b(this.b, i7, str2);
                                                if (ejxVarB2 != null) {
                                                    this.b = ejxVarB2.f7928a;
                                                }
                                                if (u('n') || u('N')) {
                                                    if (ejxVarB2 == null) {
                                                        ejxVarB2 = new ejx(1L, this.b);
                                                    }
                                                    h0();
                                                    boolean zU = u('+');
                                                    i4 = (zU || !(zU = u('-'))) ? 1 : -1;
                                                    if (zU) {
                                                        h0();
                                                        ejxVarB = ejx.b(this.b, i7, str2);
                                                        if (ejxVarB != null) {
                                                            this.b = ejxVarB.f7928a;
                                                        } else {
                                                            this.b = i8;
                                                        }
                                                    } else {
                                                        ejxVarB = null;
                                                    }
                                                } else {
                                                    ci9Var2 = ci9Var2;
                                                    ejxVarB = ejxVarB2;
                                                    i4 = i9 == true ? 1 : 0;
                                                    ejxVarB2 = null;
                                                    i9 = r3 == true ? 1 : 0;
                                                }
                                                eld0Var = new eld0(ejxVarB2 == null ? 0 : i9 * ((int) ejxVarB2.b), ejxVarB == 0 ? 0 : i4 * ((int) ejxVarB.b), (byte) 1);
                                                h0();
                                                r8 = eld0Var;
                                                if (!u(')')) {
                                                    this.b = i8;
                                                }
                                            }
                                            r8 = 0;
                                        }
                                        ci9Var2 = ci9Var2;
                                        eld0Var = eld0Var2;
                                        h0();
                                        r8 = eld0Var;
                                        if (!u(')')) {
                                            this.b = i8;
                                            r8 = 0;
                                        }
                                    } else {
                                        r8 = str;
                                        ci9Var2 = ci9Var2;
                                    }
                                }
                                if (r8 == 0) {
                                    throw new ph9("Invalid or missing parameter section for pseudo class: ".concat(strX4));
                                }
                                uh9 uh9Var = new uh9(r8.b, r8.c, di9Var.b, z5, z6);
                                ci9Var2.a();
                                obj = uh9Var;
                                i3 = 2;
                                z2 = true;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                                break;
                            case 6:
                                uh9 uh9Var2 = new uh9(0, 1, null, true, false);
                                ci9Var2.a();
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = uh9Var2;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 7:
                                uh9 uh9Var3 = new uh9(0, 1, null, false, false);
                                ci9Var2.a();
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = uh9Var3;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 8:
                                uh9 uh9Var4 = new uh9(0, 1, di9Var.b, true, true);
                                ci9Var2.a();
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = uh9Var4;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 9:
                                uh9 uh9Var5 = new uh9(0, 1, di9Var.b, false, true);
                                ci9Var2.a();
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = uh9Var5;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 10:
                                zh9 zh9Var = new zh9(str, z4);
                                ci9Var2.a();
                                obj3 = zh9Var;
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = obj3;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 11:
                                zh9 zh9Var2 = new zh9(di9Var.b, r3);
                                ci9Var2.a();
                                obj3 = zh9Var2;
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = obj3;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 12:
                                vh9 vh9Var3 = new vh9(z4 ? (byte) 1 : (byte) 0);
                                ci9Var2.a();
                                obj3 = vh9Var3;
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = obj3;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 13:
                                if (y()) {
                                    arrayListY0 = str;
                                } else {
                                    int i10 = this.b;
                                    if (u('(')) {
                                        h0();
                                        arrayListY0 = y0();
                                        if (arrayListY0 != null && u(')')) {
                                            Iterator it = arrayListY0.iterator();
                                            while (it.hasNext() && (arrayList3 = ((ci9) it.next()).f4400a) != null) {
                                                Iterator it2 = arrayList3.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList4 = ((di9) it2.next()).d) != null) {
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((th9) it3.next()) instanceof xh9) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.b = i10;
                                        }
                                        arrayListY0 = str;
                                    } else {
                                        arrayListY0 = str;
                                    }
                                }
                                if (arrayListY0 == null) {
                                    throw new ph9("Invalid or missing parameter section for pseudo class: ".concat(strX4));
                                }
                                xh9 xh9Var = new xh9();
                                xh9Var.f40878a = arrayListY0;
                                Iterator it4 = arrayListY0.iterator();
                                int i11 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i12 = ((ci9) it4.next()).b;
                                    if (i12 > i11) {
                                        i11 = i12;
                                    }
                                }
                                ci9Var2.b = i11;
                                z3 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                obj2 = xh9Var;
                                i3 = 2;
                                obj = obj2;
                                z2 = z3;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                                break;
                            case 14:
                                if (!y()) {
                                    int i13 = this.b;
                                    if (u('(')) {
                                        h0();
                                        ?? arrayList8 = str;
                                        while (true) {
                                            String strX5 = x0();
                                            arrayList8 = arrayList8;
                                            if (strX5 == null) {
                                                this.b = i13;
                                            } else {
                                                if (arrayList8 == 0) {
                                                    arrayList8 = new ArrayList();
                                                }
                                                arrayList8.add(strX5);
                                                h0();
                                                if (!g0()) {
                                                    if (!u(')')) {
                                                        this.b = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                yh9 yh9Var2 = new yh9(strX4);
                                ci9Var2.a();
                                yh9Var = yh9Var2;
                                z2 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                i3 = i6;
                                obj = yh9Var;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                yh9 yh9Var3 = new yh9(strX4);
                                ci9Var2.a();
                                yh9Var = yh9Var3;
                                z2 = r3 == true ? 1 : 0;
                                ci9Var2 = ci9Var2;
                                i3 = i6;
                                obj = yh9Var;
                                arrayList5 = di9Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    di9Var.d = arrayList5;
                                }
                                arrayList5.add(obj);
                                i6 = i3;
                                r3 = z2;
                                ci9Var2 = ci9Var2;
                                str = null;
                                z4 = false;
                                break;
                            default:
                                throw new ph9("Unsupported pseudo class: ".concat(strX4));
                        }
                    } else {
                        z = r3 == true ? 1 : 0;
                        ci9Var = ci9Var2;
                        if (di9Var != 0) {
                            ci9Var2 = ci9Var;
                            this.b = i5;
                            arrayList = ci9Var2.f4400a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList6.add(ci9Var2);
                            }
                            return arrayList6;
                        }
                        ci9Var2 = ci9Var;
                        arrayList2 = ci9Var2.f4400a;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            ci9Var2.f4400a = arrayList2;
                        }
                        arrayList2.add(di9Var);
                        if (!g0()) {
                            arrayList6.add(ci9Var2);
                            ci9Var2 = new ci9();
                        }
                        r3 = z ? 1 : 0;
                        str = null;
                    }
                }
            }
            z = r3 == true ? 1 : 0;
            ci9Var = ci9Var2;
            if (di9Var != 0) {
                ci9Var2 = ci9Var;
                this.b = i5;
                arrayList = ci9Var2.f4400a;
                if (arrayList != null) {
                    arrayList6.add(ci9Var2);
                }
                return arrayList6;
            }
            ci9Var2 = ci9Var;
            arrayList2 = ci9Var2.f4400a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                ci9Var2.f4400a = arrayList2;
            }
            arrayList2.add(di9Var);
            if (!g0()) {
                arrayList6.add(ci9Var2);
                ci9Var2 = new ci9();
            }
            r3 = z ? 1 : 0;
            str = null;
        }
        arrayList = ci9Var2.f4400a;
        if (arrayList != null) {
            arrayList6.add(ci9Var2);
        }
        return arrayList6;
    }
}
