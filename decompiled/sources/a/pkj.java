package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pkj {
    public static final String[] b = {"CTRL_PS", Separators.SP, "A", "B", TokenNames.C, "D", TokenNames.E, TokenNames.F, "G", "H", TokenNames.I, "J", TokenNames.K, TokenNames.L, TokenNames.M, "N", TokenNames.O, "P", "Q", TokenNames.R, TokenNames.S, TokenNames.T, TokenNames.U, TokenNames.V, "W", TokenNames.X, "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", Separators.SP, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", Separators.SP, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", Separators.HT, Separators.RETURN, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", Separators.AT, "\\", "^", BundleUtil.UNDERLINE_TAG, "`", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"FLG(n)", "\r", Separators.NEWLINE, ". ", ", ", ": ", "!", Separators.DOUBLE_QUOTE, Separators.POUND, "$", Separators.PERCENT, "&", Separators.QUOTE, Separators.LPAREN, Separators.RPAREN, Separators.STAR, "+", Separators.COMMA, "-", Separators.DOT, Separators.SLASH, Separators.COLON, Separators.SEMICOLON, Separators.LESS_THAN, "=", Separators.GREATER_THAN, Separators.QUESTION, "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", Separators.SP, "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", Separators.COMMA, Separators.DOT, "CTRL_UL", "CTRL_US"};
    public static final Charset g = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db5 f27137a;

    public static int b(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    public final ykj a(db5 db5Var) throws bwq {
        int i;
        int i2;
        wjt wjtVar;
        ykj ykjVar;
        String str;
        int i3;
        int i4;
        char c2;
        char c3;
        boolean z;
        this.f27137a = db5Var;
        r68 r68Var = db5Var.f5785a;
        boolean z2 = db5Var.c;
        int i5 = db5Var.e;
        int i6 = (i5 * 4) + (z2 ? 11 : 14);
        int[] iArr = new int[i6];
        int i7 = ((i5 * 16) + (z2 ? 88 : 112)) * i5;
        boolean[] zArr = new boolean[i7];
        int i8 = 2;
        int i9 = 1;
        if (z2) {
            for (int i10 = 0; i10 < i6; i10++) {
                iArr[i10] = i10;
            }
        } else {
            int i11 = i6 / 2;
            int i12 = ((((i11 - 1) / 15) * 2) + (i6 + 1)) / 2;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = (i13 / 15) + i13;
                iArr[(i11 - i13) - 1] = (i12 - i14) - 1;
                iArr[i11 + i13] = i14 + i12 + 1;
            }
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i = 12;
            i2 = 4;
            if (i15 >= i5) {
                break;
            }
            int i17 = ((i5 - i15) * 4) + (z2 ? 9 : 12);
            int i18 = i15 * 2;
            int i19 = (i6 - 1) - i18;
            int i20 = 0;
            while (i20 < i17) {
                int i21 = i20 * 2;
                int i22 = 0;
                while (i22 < i8) {
                    int i23 = i18 + i22;
                    int i24 = i9;
                    int i25 = i18 + i20;
                    zArr[i16 + i21 + i22] = r68Var.b(iArr[i23], iArr[i25]);
                    int i26 = i19 - i22;
                    zArr[(i17 * 2) + i16 + i21 + i22] = r68Var.b(iArr[i25], iArr[i26]);
                    int i27 = i19 - i20;
                    zArr[(i17 * 4) + i16 + i21 + i22] = r68Var.b(iArr[i26], iArr[i27]);
                    zArr[(i17 * 6) + i16 + i21 + i22] = r68Var.b(iArr[i27], iArr[i23]);
                    i22++;
                    i9 = i24;
                    i5 = i5;
                    i8 = 2;
                }
                i20++;
                i8 = 2;
            }
            i16 += i17 * 8;
            i15++;
            i8 = 2;
        }
        int i28 = i9;
        db5 db5Var2 = this.f27137a;
        int i29 = db5Var2.e;
        int i30 = 6;
        int i31 = 8;
        if (i29 <= 2) {
            wjtVar = wjt.j;
            i = 6;
        } else if (i29 <= 8) {
            wjtVar = wjt.n;
            i = 8;
        } else if (i29 <= 22) {
            wjtVar = wjt.i;
            i = 10;
        } else {
            wjtVar = wjt.h;
        }
        int i32 = db5Var2.d;
        int i33 = i7 / i;
        if (i33 < i32) {
            throw bwq.a();
        }
        int i34 = i7 % i;
        int[] iArr2 = new int[i33];
        int i35 = 0;
        while (i35 < i33) {
            iArr2[i35] = b(zArr, i34, i);
            i35++;
            i34 += i;
        }
        try {
            yox yoxVar = new yox(wjtVar);
            int i36 = i33 - i32;
            int iF = yoxVar.f(iArr2, i36);
            int i37 = i28 << i;
            int i38 = i37 - 1;
            int i39 = 0;
            int i40 = 0;
            while (i39 < i32) {
                int i41 = iArr2[i39];
                if (i41 == 0 || i41 == i38) {
                    throw bwq.a();
                }
                if (i41 == i28 || i41 == i37 - 2) {
                    i40++;
                }
                i39++;
                i28 = 1;
            }
            int i42 = (i32 * i) - i40;
            boolean[] zArr2 = new boolean[i42];
            int i43 = 0;
            int i44 = 0;
            while (i43 < i32) {
                int i45 = iArr2[i43];
                if (i45 != 1) {
                    int i46 = 1;
                    if (i45 == i37 - 2) {
                        int i47 = (i44 + i) - 1;
                        if (i45 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i44, i47, z);
                        i44 = (i - 1) + i44;
                    } else {
                        int i48 = i - 1;
                        while (i48 >= 0) {
                            int i49 = i44 + 1;
                            zArr2[i44] = (i45 & (i46 << i48)) != 0;
                            i48--;
                            i44 = i49;
                            i46 = 1;
                        }
                    }
                } else {
                    int i410 = (i44 + i) - 1;
                    if (i45 > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Arrays.fill(zArr2, i44, i410, z);
                    i44 = (i - 1) + i44;
                }
                i43++;
                i2 = i2;
            }
            int i50 = i2;
            int i51 = (i36 * 100) / i33;
            int i52 = (i42 + 7) / 8;
            byte[] bArr = new byte[i52];
            for (int i53 = 0; i53 < i52; i53++) {
                int i54 = i53 * 8;
                int i55 = i42 - i54;
                bArr[i53] = (byte) (i55 >= 8 ? b(zArr2, i54, 8) : b(zArr2, i54, i55) << (8 - i55));
            }
            StringBuilder sb = new StringBuilder((i42 - 5) / 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Charset charsetForName = g;
            int i56 = 1;
            int i57 = 0;
            int i58 = 1;
            while (true) {
                if (i57 < i42) {
                    int i59 = 5;
                    if (i58 != i30) {
                        int i60 = i58 == i50 ? 4 : 5;
                        if (i42 - i57 >= i60) {
                            int iB = b(zArr2, i57, i60);
                            i57 += i60;
                            int iE = hne.E(i58);
                            ykjVar = null;
                            if (iE == 0) {
                                str = b[iB];
                            } else if (iE == 1) {
                                str = c[iB];
                            } else if (iE == 2) {
                                str = d[iB];
                            } else if (iE == 3) {
                                str = f[iB];
                            } else {
                                if (iE != 4) {
                                    jf4.n("Bad table");
                                    return null;
                                }
                                str = e[iB];
                            }
                            if (!"FLG(n)".equals(str)) {
                                i3 = 4;
                                if (str.startsWith("CTRL_")) {
                                    char cCharAt = str.charAt(5);
                                    if (cCharAt != 'B') {
                                        if (cCharAt == 'D') {
                                            i59 = 4;
                                        } else if (cCharAt != 'P') {
                                            if (cCharAt == 'L') {
                                                i59 = 2;
                                            } else if (cCharAt != 'M') {
                                                i4 = 6;
                                                i59 = 1;
                                            } else {
                                                i4 = 6;
                                                i59 = 3;
                                            }
                                        }
                                        i4 = 6;
                                    } else {
                                        i4 = 6;
                                        i59 = 6;
                                    }
                                    if (str.charAt(i4) == 'L') {
                                        i56 = i59;
                                        i58 = i56;
                                    } else {
                                        i56 = i58;
                                        i58 = i59;
                                    }
                                } else {
                                    i4 = 6;
                                    byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
                                    byteArrayOutputStream.write(bytes, 0, bytes.length);
                                }
                                i30 = i4;
                                i50 = i3;
                                i31 = 8;
                            } else {
                                if (i42 - i57 < 3) {
                                    break;
                                }
                                int iB2 = b(zArr2, i57, 3);
                                i57 += 3;
                                try {
                                    sb.append(byteArrayOutputStream.toString(charsetForName.name()));
                                    byteArrayOutputStream.reset();
                                    if (iB2 == 0) {
                                        c2 = 2;
                                        c3 = 11;
                                        i3 = 4;
                                        sb.append((char) 29);
                                    } else {
                                        if (iB2 == 7) {
                                            throw bwq.a();
                                        }
                                        if (i42 - i57 < iB2 * 4) {
                                            c2 = 2;
                                            c3 = 11;
                                            i3 = 4;
                                        } else {
                                            int i61 = 0;
                                            while (true) {
                                                int i62 = iB2 - 1;
                                                if (iB2 <= 0) {
                                                    c2 = 2;
                                                    c3 = 11;
                                                    i3 = 4;
                                                    uvb uvbVarA = uvb.a(i61);
                                                    if (uvbVarA == null) {
                                                        throw bwq.a();
                                                    }
                                                    charsetForName = Charset.forName(uvbVarA.name());
                                                    break;
                                                }
                                                int iB3 = b(zArr2, i57, 4);
                                                i57 += 4;
                                                if (iB3 < 2 || iB3 > 11) {
                                                    throw bwq.a();
                                                }
                                                i61 = (i61 * 10) + (iB3 - 2);
                                                iB2 = i62;
                                            }
                                        }
                                    }
                                    i4 = 6;
                                } catch (UnsupportedEncodingException e2) {
                                    itt0.o(e2);
                                    return null;
                                }
                            }
                            i58 = i56;
                            i30 = i4;
                            i50 = i3;
                            i31 = 8;
                        }
                    } else if (i42 - i57 >= 5) {
                        int iB4 = b(zArr2, i57, 5);
                        int i63 = i57 + 5;
                        if (iB4 == 0) {
                            if (i42 - i63 >= 11) {
                                iB4 = b(zArr2, i63, 11) + 31;
                                i63 = i57 + 16;
                            }
                        }
                        int i64 = 0;
                        while (true) {
                            if (i64 >= iB4) {
                                i57 = i63;
                                break;
                            }
                            if (i42 - i63 < i31) {
                                i57 = i42;
                                break;
                            }
                            byteArrayOutputStream.write((byte) b(zArr2, i63, i31));
                            i63 += 8;
                            i64++;
                        }
                        i58 = i56;
                    }
                }
                ykjVar = null;
                break;
            }
            try {
                sb.append(byteArrayOutputStream.toString(charsetForName.name()));
                ykj ykjVar2 = new ykj(sb.toString(), String.format("%d%%", Integer.valueOf(i51)), bArr);
                ykjVar2.e = Integer.valueOf(iF);
                return ykjVar2;
            } catch (UnsupportedEncodingException e3) {
                itt0.o(e3);
                return ykjVar;
            }
        } catch (eie0 e4) {
            bwq bwqVar = bwq.c;
            if (sae0.f31885a) {
                throw new bwq(e4);
            }
            throw bwq.c;
        }
    }
}
