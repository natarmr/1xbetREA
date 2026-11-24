package a;

import android.gov.nist.core.Separators;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class olw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y50 f25478a;

    static {
        flw0 flw0VarX = glw0.x();
        flw0VarX.f(-62135596800L);
        flw0VarX.g(0);
        flw0 flw0VarX2 = glw0.x();
        flw0VarX2.f(253402300799L);
        flw0VarX2.g(999999999);
        flw0 flw0VarX3 = glw0.x();
        flw0VarX3.f(0L);
        flw0VarX3.g(0);
        f25478a = new y50((byte) 17);
        try {
            Class.forName("java.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    public static glw0 a(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        glw0 glw0Var;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            hny.j(0, kng0.l("Failed to parse timestamp: invalid timestamp \"", str, Separators.DOUBLE_QUOTE));
            return null;
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            hny.j(0, "Failed to parse timestamp: missing valid timezone offset.");
            return null;
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        boolean z = true;
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = ((SimpleDateFormat) f25478a.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) >= '0') {
                        glw0Var = null;
                        if (strSubstring.charAt(i) <= '9') {
                            iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                        }
                    } else {
                        glw0Var = null;
                    }
                    hny.j(0, "Invalid nanoseconds.");
                    return glw0Var;
                }
            }
        }
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                hny.j(0, "Invalid offset value: ".concat(strSubstring4));
                return null;
            }
            try {
                long j = ((Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60) + Long.parseLong(strSubstring4.substring(iIndexOf4 + 1))) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j : time + j;
            } catch (NumberFormatException e) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
                parseException.initCause(e);
                throw parseException;
            }
        } else if (str.length() != iIndexOf2 + 1) {
            hny.j(0, kng0.l("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), Separators.DOUBLE_QUOTE));
            return null;
        }
        try {
            if (!(time >= -62135596800L && time <= 253402300799L)) {
                throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + time + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                long j2 = iCharAt / 1000000000;
                long j3 = time + j2;
                if (!((j2 ^ time) < 0) && !((time ^ j3) >= 0)) {
                    throw new ArithmeticException();
                }
                iCharAt %= 1000000000;
                time = j3;
            }
            if (iCharAt < 0) {
                iCharAt += 1000000000;
                long j4 = time - 1;
                boolean z2 = (1 ^ time) >= 0;
                if ((time ^ j4) < 0) {
                    z = false;
                }
                if (!z2 && !z) {
                    throw new ArithmeticException();
                }
                time = j4;
            }
            flw0 flw0VarX = glw0.x();
            flw0VarX.f(time);
            flw0VarX.g(iCharAt);
            glw0 glw0Var2 = (glw0) flw0VarX.c();
            b(glw0Var2);
            return glw0Var2;
        } catch (IllegalArgumentException e2) {
            ParseException parseException2 = new ParseException(kng0.l("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException2.initCause(e2);
            throw parseException2;
        }
    }

    public static void b(glw0 glw0Var) {
        long jW = glw0Var.w();
        int iT = glw0Var.t();
        if (jW < -62135596800L || jW > 253402300799L || iT < 0 || iT >= 1000000000) {
            c99.q(brm0.q(iT, jW, "Timestamp is not valid. See proto definition for valid values. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos ("), ") must be in range [0, +999,999,999].");
        }
    }
}
