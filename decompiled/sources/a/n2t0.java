package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2t0 extends jl60 {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[][] f;
    public static final int[][] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f22819a = new StringBuilder(20);
    public final c5k b = new c5k((byte) 2);
    public final qgn c = new qgn((byte) 0);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20][];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    public static int h(p68 p68Var, int[] iArr, int i, int[][] iArr2) {
        jl60.e(i, p68Var, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fD = jl60.d(iArr, iArr2[i3], 0.7f);
            if (fD < f2) {
                i2 = i3;
                f2 = fD;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw o660.a();
    }

    public static int[] l(p68 p68Var, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2 = p68Var.b;
        int iF = z ? p68Var.f(i) : p68Var.e(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = iF;
        while (iF < i2) {
            if (p68Var.d(iF) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (jl60.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i4, iF};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            iF++;
        }
        throw o660.a();
    }

    public static int[] m(p68 p68Var) {
        int[] iArr = new int[3];
        int[] iArrL = null;
        boolean zH = false;
        int i = 0;
        while (!zH) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrL = l(p68Var, i, false, d, iArr);
            int i2 = iArrL[0];
            int i3 = iArrL[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zH = p68Var.h(i4, i2);
            }
            i = i3;
        }
        return iArrL;
    }

    @Override // a.jl60
    public i0g0 b(int i, p68 p68Var, Map map) {
        return k(i, p68Var, m(p68Var), map);
    }

    public boolean g(String str) throws bwq {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            CharSequence charSequenceSubSequence = str.subSequence(0, i);
            int length2 = charSequenceSubSequence.length();
            int i2 = 0;
            for (int i3 = length2 - 1; i3 >= 0; i3 -= 2) {
                int iCharAt = charSequenceSubSequence.charAt(i3) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    throw bwq.a();
                }
                i2 += iCharAt;
            }
            int i4 = i2 * 3;
            for (int i5 = length2 - 2; i5 >= 0; i5 -= 2) {
                int iCharAt2 = charSequenceSubSequence.charAt(i5) - '0';
                if (iCharAt2 < 0 || iCharAt2 > 9) {
                    throw bwq.a();
                }
                i4 += iCharAt2;
            }
            if ((1000 - i4) % 10 == iDigit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(p68 p68Var, int i) {
        return l(p68Var, i, false, d, new int[3]);
    }

    public abstract int j(p68 p68Var, int[] iArr, StringBuilder sb);

    public i0g0 k(int i, p68 p68Var, int[] iArr, Map map) throws bwq, q9c, o660 {
        int length;
        String str = null;
        e3g0 e3g0Var = map == null ? null : (e3g0) map.get(gkj.j);
        if (e3g0Var != null) {
            e3g0Var.a(new d3g0((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f22819a;
        sb.setLength(0);
        int iJ = j(p68Var, iArr, sb);
        if (e3g0Var != null) {
            e3g0Var.a(new d3g0(iJ, i));
        }
        int[] iArrI = i(p68Var, iJ);
        if (e3g0Var != null) {
            e3g0Var.a(new d3g0((iArrI[0] + iArrI[1]) / 2.0f, i));
        }
        int i2 = iArrI[1];
        int i3 = (i2 - iArrI[0]) + i2;
        if (i3 >= p68Var.b || !p68Var.h(i2, i3)) {
            throw o660.a();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw bwq.a();
        }
        if (!g(string)) {
            throw q9c.a();
        }
        float f2 = (iArr[1] + iArr[0]) / 2.0f;
        float f3 = (iArrI[1] + iArrI[0]) / 2.0f;
        ju5 ju5VarN = n();
        float f4 = i;
        i0g0 i0g0Var = new i0g0(string, null, new d3g0[]{new d3g0(f2, f4), new d3g0(f3, f4)}, ju5VarN);
        try {
            i0g0 i0g0VarB = this.b.b(i, iArrI[1], p68Var);
            i0g0Var.b(a3g0.i, i0g0VarB.f13947a);
            i0g0Var.a(i0g0VarB.e);
            d3g0[] d3g0VarArr = i0g0VarB.c;
            d3g0[] d3g0VarArr2 = i0g0Var.c;
            if (d3g0VarArr2 == null) {
                i0g0Var.c = d3g0VarArr;
            } else if (d3g0VarArr != null && d3g0VarArr.length > 0) {
                d3g0[] d3g0VarArr3 = new d3g0[d3g0VarArr2.length + d3g0VarArr.length];
                System.arraycopy(d3g0VarArr2, 0, d3g0VarArr3, 0, d3g0VarArr2.length);
                System.arraycopy(d3g0VarArr, 0, d3g0VarArr3, d3g0VarArr2.length, d3g0VarArr.length);
                i0g0Var.c = d3g0VarArr3;
            }
            length = i0g0VarB.f13947a.length();
        } catch (sae0 unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(gkj.k);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    throw o660.a();
                }
                if (length == iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        if (ju5VarN == ju5.h || ju5VarN == ju5.o) {
            qgn qgnVar = this.c;
            synchronized (qgnVar) {
                if (qgnVar.f28694a.isEmpty()) {
                    qgnVar.a(new int[]{0, 19}, "US/CA");
                    qgnVar.a(new int[]{30, 39}, "US");
                    qgnVar.a(new int[]{60, 139}, "US/CA");
                    qgnVar.a(new int[]{300, 379}, "FR");
                    qgnVar.a(new int[]{Response.ALTERNATIVE_SERVICE}, "BG");
                    qgnVar.a(new int[]{383}, "SI");
                    qgnVar.a(new int[]{385}, "HR");
                    qgnVar.a(new int[]{387}, "BA");
                    qgnVar.a(new int[]{Response.BAD_REQUEST, 440}, "DE");
                    qgnVar.a(new int[]{450, 459}, "JP");
                    qgnVar.a(new int[]{460, 469}, "RU");
                    qgnVar.a(new int[]{471}, "TW");
                    qgnVar.a(new int[]{474}, "EE");
                    qgnVar.a(new int[]{475}, "LV");
                    qgnVar.a(new int[]{476}, "AZ");
                    qgnVar.a(new int[]{477}, "LT");
                    qgnVar.a(new int[]{478}, "UZ");
                    qgnVar.a(new int[]{479}, "LK");
                    qgnVar.a(new int[]{Response.TEMPORARILY_UNAVAILABLE}, "PH");
                    qgnVar.a(new int[]{Response.CALL_OR_TRANSACTION_DOES_NOT_EXIST}, "BY");
                    qgnVar.a(new int[]{Response.LOOP_DETECTED}, "UA");
                    qgnVar.a(new int[]{Response.ADDRESS_INCOMPLETE}, "MD");
                    qgnVar.a(new int[]{Response.AMBIGUOUS}, "AM");
                    qgnVar.a(new int[]{Response.BUSY_HERE}, "GE");
                    qgnVar.a(new int[]{Response.REQUEST_TERMINATED}, "KZ");
                    qgnVar.a(new int[]{Response.BAD_EVENT}, "HK");
                    qgnVar.a(new int[]{490, 499}, "JP");
                    qgnVar.a(new int[]{500, 509}, "GB");
                    qgnVar.a(new int[]{520}, "GR");
                    qgnVar.a(new int[]{528}, "LB");
                    qgnVar.a(new int[]{529}, "CY");
                    qgnVar.a(new int[]{531}, "MK");
                    qgnVar.a(new int[]{535}, "MT");
                    qgnVar.a(new int[]{539}, "IE");
                    qgnVar.a(new int[]{540, 549}, "BE/LU");
                    qgnVar.a(new int[]{560}, "PT");
                    qgnVar.a(new int[]{569}, "IS");
                    qgnVar.a(new int[]{570, 579}, "DK");
                    qgnVar.a(new int[]{590}, "PL");
                    qgnVar.a(new int[]{594}, "RO");
                    qgnVar.a(new int[]{599}, "HU");
                    qgnVar.a(new int[]{Response.BUSY_EVERYWHERE, 601}, "ZA");
                    qgnVar.a(new int[]{Response.DECLINE}, "GH");
                    qgnVar.a(new int[]{608}, "BH");
                    qgnVar.a(new int[]{609}, "MU");
                    qgnVar.a(new int[]{611}, "MA");
                    qgnVar.a(new int[]{613}, "DZ");
                    qgnVar.a(new int[]{616}, "KE");
                    qgnVar.a(new int[]{618}, "CI");
                    qgnVar.a(new int[]{619}, "TN");
                    qgnVar.a(new int[]{621}, "SY");
                    qgnVar.a(new int[]{622}, "EG");
                    qgnVar.a(new int[]{624}, "LY");
                    qgnVar.a(new int[]{625}, "JO");
                    qgnVar.a(new int[]{626}, "IR");
                    qgnVar.a(new int[]{627}, "KW");
                    qgnVar.a(new int[]{628}, "SA");
                    qgnVar.a(new int[]{629}, "AE");
                    qgnVar.a(new int[]{640, 649}, "FI");
                    qgnVar.a(new int[]{690, 695}, "CN");
                    qgnVar.a(new int[]{700, 709}, "NO");
                    qgnVar.a(new int[]{729}, "IL");
                    qgnVar.a(new int[]{730, 739}, "SE");
                    qgnVar.a(new int[]{740}, "GT");
                    qgnVar.a(new int[]{741}, "SV");
                    qgnVar.a(new int[]{742}, "HN");
                    qgnVar.a(new int[]{743}, "NI");
                    qgnVar.a(new int[]{744}, "CR");
                    qgnVar.a(new int[]{745}, "PA");
                    qgnVar.a(new int[]{746}, "DO");
                    qgnVar.a(new int[]{750}, "MX");
                    qgnVar.a(new int[]{754, 755}, "CA");
                    qgnVar.a(new int[]{759}, "VE");
                    qgnVar.a(new int[]{760, 769}, "CH");
                    qgnVar.a(new int[]{770}, "CO");
                    qgnVar.a(new int[]{773}, "UY");
                    qgnVar.a(new int[]{775}, "PE");
                    qgnVar.a(new int[]{777}, "BO");
                    qgnVar.a(new int[]{779}, "AR");
                    qgnVar.a(new int[]{780}, "CL");
                    qgnVar.a(new int[]{784}, "PY");
                    qgnVar.a(new int[]{785}, "PE");
                    qgnVar.a(new int[]{786}, "EC");
                    qgnVar.a(new int[]{789, 790}, "BR");
                    qgnVar.a(new int[]{800, 839}, "IT");
                    qgnVar.a(new int[]{840, 849}, "ES");
                    qgnVar.a(new int[]{850}, "CU");
                    qgnVar.a(new int[]{858}, "SK");
                    qgnVar.a(new int[]{859}, "CZ");
                    qgnVar.a(new int[]{860}, "YU");
                    qgnVar.a(new int[]{865}, "MN");
                    qgnVar.a(new int[]{867}, "KP");
                    qgnVar.a(new int[]{868, 869}, "TR");
                    qgnVar.a(new int[]{870, 879}, "NL");
                    qgnVar.a(new int[]{880}, "KR");
                    qgnVar.a(new int[]{885}, "TH");
                    qgnVar.a(new int[]{888}, "SG");
                    qgnVar.a(new int[]{890}, SDPKeywords.IN);
                    qgnVar.a(new int[]{893}, "VN");
                    qgnVar.a(new int[]{896}, "PK");
                    qgnVar.a(new int[]{899}, "ID");
                    qgnVar.a(new int[]{900, 919}, "AT");
                    qgnVar.a(new int[]{930, 939}, "AU");
                    qgnVar.a(new int[]{940, 949}, "AZ");
                    qgnVar.a(new int[]{955}, "MY");
                    qgnVar.a(new int[]{958}, "MO");
                }
            }
            int i5 = Integer.parseInt(string.substring(0, 3));
            int size = qgnVar.f28694a.size();
            for (int i6 = 0; i6 < size; i6++) {
                int[] iArr3 = (int[]) qgnVar.f28694a.get(i6);
                int i7 = iArr3[0];
                if (i5 < i7) {
                    break;
                }
                if (iArr3.length != 1) {
                    i7 = iArr3[1];
                }
                if (i5 <= i7) {
                    str = (String) qgnVar.b.get(i6);
                    break;
                }
            }
            if (str != null) {
                i0g0Var.b(a3g0.h, str);
            }
        }
        int i8 = ju5VarN == ju5.g ? 4 : 0;
        i0g0Var.b(a3g0.m, "]E" + i8);
        return i0g0Var;
    }

    public abstract ju5 n();
}
