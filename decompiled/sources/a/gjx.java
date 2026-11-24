package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class gjx implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gjx f11420a = new gjx();
    public static final ewb0 b = new ewb0("kotlin.time.Instant", zvb0.j);

    /* JADX WARN: Code duplicated, block: B:197:0x0469  */
    /* JADX WARN: Code duplicated, block: B:198:0x047f  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x047f, please report this as an issue */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        int i2;
        int iA;
        fjx fjxVarW;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        bjx bjxVar = bjx.c;
        String strZ = rkjVar.z();
        strZ.getClass();
        if (strZ.length() == 0) {
            fjxVarW = new zpu("An empty string is not a valid Instant", strZ, (byte) 11);
        } else {
            char cCharAt3 = strZ.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strZ.length() && '0' <= (cCharAt2 = strZ.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strZ.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                fjxVarW = ny9.W(strZ, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strZ.charAt(i) >= '2') {
                fjxVarW = ny9.W(strZ, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                fjxVarW = ny9.W(strZ, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                fjxVarW = ny9.W(strZ, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strZ.length() < i7) {
                    fjxVarW = ny9.W(strZ, "The input string is too short");
                } else {
                    zpu zpuVarV = ny9.V(strZ, i5, "'-'", new h7w((byte) 28));
                    if (zpuVarV == null && (zpuVarV = ny9.V(strZ, i5 + 3, "'-'", new h7w((byte) 29))) == null && (zpuVarV = ny9.V(strZ, i5 + 6, "'T' or 't'", new djx((byte) 0))) == null && (zpuVarV = ny9.V(strZ, i5 + 9, "':'", new djx((byte) 1))) == null && (zpuVarV = ny9.V(strZ, i5 + 12, "':'", new djx((byte) 2))) == null) {
                        int[] iArr = ny9.j;
                        for (int i8 = 0; i8 < 10; i8++) {
                            fjxVarW = ny9.V(strZ, i5 + iArr[i8], "an ASCII digit", new djx((byte) 3));
                            if (fjxVarW == null) {
                            }
                        }
                        int iX = ny9.X(i5 + 1, strZ);
                        int iX2 = ny9.X(i5 + 4, strZ);
                        int iX3 = ny9.X(i5 + 7, strZ);
                        int iX4 = ny9.X(i5 + 10, strZ);
                        int iX5 = ny9.X(i5 + 13, strZ);
                        int i9 = i5 + 15;
                        if (strZ.charAt(i9) == '.') {
                            i9 = i7;
                            int iCharAt2 = 0;
                            while (i9 < strZ.length() && '0' <= (cCharAt = strZ.charAt(i9)) && cCharAt < ':') {
                                iCharAt2 = (iCharAt2 * 10) + (strZ.charAt(i9) - '0');
                                i9++;
                            }
                            int i10 = i9 - i7;
                            if (1 > i10 || i10 >= 10) {
                                fjxVarW = ny9.W(strZ, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                            } else {
                                i2 = iCharAt2 * ny9.i[9 - i10];
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i9 >= strZ.length()) {
                            fjxVarW = ny9.W(strZ, "The UTC offset at the end of the string is missing");
                        } else {
                            char cCharAt4 = strZ.charAt(i9);
                            if (cCharAt4 == '+' || cCharAt4 == '-') {
                                int length = strZ.length() - i9;
                                if (length > 9) {
                                    fjxVarW = ny9.W(strZ, "The UTC offset string \"" + ny9.d0(16, strZ.subSequence(i9, strZ.length()).toString()) + "\" is too long");
                                } else if (length % 3 != 0) {
                                    fjxVarW = ny9.W(strZ, "Invalid UTC offset string \"" + strZ.subSequence(i9, strZ.length()).toString() + '\"');
                                } else {
                                    int[] iArr2 = ny9.k;
                                    for (int i11 = 0; i11 < 2 && (i4 = iArr2[i11] + i9) < strZ.length(); i11++) {
                                        if (strZ.charAt(i4) != ':') {
                                            StringBuilder sbM = b1j.m(i4, "Expected ':' at index ", ", got '");
                                            sbM.append(strZ.charAt(i4));
                                            sbM.append('\'');
                                            fjxVarW = ny9.W(strZ, sbM.toString());
                                        }
                                    }
                                    int[] iArr3 = ny9.l;
                                    int i12 = 0;
                                    while (i12 < 6 && (i3 = iArr3[i12] + i9) < strZ.length()) {
                                        char cCharAt5 = strZ.charAt(i3);
                                        int[] iArr4 = iArr3;
                                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                            StringBuilder sbM2 = b1j.m(i3, "Expected an ASCII digit at index ", ", got '");
                                            sbM2.append(strZ.charAt(i3));
                                            sbM2.append('\'');
                                            fjxVarW = ny9.W(strZ, sbM2.toString());
                                        } else {
                                            i12++;
                                            iArr3 = iArr4;
                                        }
                                    }
                                    int iX6 = ny9.X(i9 + 1, strZ);
                                    int iX7 = length > 3 ? ny9.X(i9 + 4, strZ) : 0;
                                    int iX8 = length > 6 ? ny9.X(i9 + 7, strZ) : 0;
                                    if (iX7 > 59) {
                                        fjxVarW = ny9.W(strZ, "Expected offset-minute-of-hour in 0..59, got " + iX7);
                                    } else if (iX8 > 59) {
                                        fjxVarW = ny9.W(strZ, "Expected offset-second-of-minute in 0..59, got " + iX8);
                                    } else if (iX6 <= 17 || (iX6 == 18 && iX7 == 0 && iX8 == 0)) {
                                        iA = vqd.a(iX7, 60, iX6 * 3600, iX8) * (cCharAt4 == '-' ? -1 : 1);
                                        if (1 <= iX || iX >= 13) {
                                            fjxVarW = ny9.W(strZ, "Expected a month number in 1..12, got " + iX);
                                        } else if (1 > iX2) {
                                            StringBuilder sbT = dw9.t("Expected a valid day-of-month for month ", iX, " of year ", ", got ", iCharAt);
                                            sbT.append(iX2);
                                            fjxVarW = ny9.W(strZ, sbT.toString());
                                        } else {
                                            int i13 = iCharAt & 3;
                                            if (iX2 > (iX != 2 ? (iX == 4 || iX == 6 || iX == 9 || iX == 11) ? 30 : 31 : i13 == 0 && (iCharAt % 100 != 0 || iCharAt % Response.BAD_REQUEST == 0) ? 29 : 28)) {
                                                StringBuilder sbT2 = dw9.t("Expected a valid day-of-month for month ", iX, " of year ", ", got ", iCharAt);
                                                sbT2.append(iX2);
                                                fjxVarW = ny9.W(strZ, sbT2.toString());
                                            } else if (iX3 > 23) {
                                                fjxVarW = ny9.W(strZ, "Expected hour in 0..23, got " + iX3);
                                            } else if (iX4 > 59) {
                                                fjxVarW = ny9.W(strZ, "Expected minute-of-hour in 0..59, got " + iX4);
                                            } else if (iX5 > 59) {
                                                fjxVarW = ny9.W(strZ, "Expected second-of-minute in 0..59, got " + iX5);
                                            } else {
                                                long j = iCharAt;
                                                long j2 = 365 * j;
                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iX * 367) - 362) / 12)) + ((long) (iX2 - 1));
                                                if (iX > 2) {
                                                    j3 = (i13 != 0 || (iCharAt % 100 == 0 && iCharAt % Response.BAD_REQUEST != 0)) ? j3 - 2 : (-1) + j3;
                                                }
                                                fjxVarW = new ejx((((j3 - 719528) * 86400) + ((long) vqd.a(iX4, 60, iX3 * 3600, iX5))) - ((long) iA), i2);
                                            }
                                        }
                                    } else {
                                        fjxVarW = ny9.W(strZ, "Expected an offset in -18:00..+18:00, got " + strZ.subSequence(i9, strZ.length()).toString());
                                    }
                                }
                            } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                int i14 = i9 + 1;
                                if (strZ.length() == i14) {
                                    iA = 0;
                                    if (1 <= iX) {
                                        fjxVarW = ny9.W(strZ, "Expected a month number in 1..12, got " + iX);
                                    } else {
                                        fjxVarW = ny9.W(strZ, "Expected a month number in 1..12, got " + iX);
                                    }
                                } else {
                                    fjxVarW = ny9.W(strZ, "Extra text after the instant at position " + i14);
                                }
                            } else {
                                fjxVarW = ny9.W(strZ, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                            }
                        }
                    } else {
                        fjxVarW = zpuVarV;
                    }
                }
            } else {
                fjxVarW = ny9.W(strZ, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return fjxVarW.toInstant();
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bjx bjxVar = (bjx) obj;
        bjxVar.getClass();
        bwnVar.E(bjxVar.toString());
    }
}
