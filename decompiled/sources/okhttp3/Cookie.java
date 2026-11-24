package okhttp3;

import a.brm0;
import a.jf4;
import a.rw2;
import a.ua80;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Cookie {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46087a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001c\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x009a  */
        public static long b(int i, String str) {
            int iA = a(0, i, str, false);
            Matcher matcher = Cookie.n.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iV = -1;
            int i5 = -1;
            int i6 = -1;
            while (iA < i) {
                int iA2 = a(iA + 1, i, str, true);
                matcher.region(iA, iA2);
                if (i3 == -1 && matcher.usePattern(Cookie.n).matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(Cookie.m).matches()) {
                    String strGroup4 = matcher.group(1);
                    strGroup4.getClass();
                    i4 = Integer.parseInt(strGroup4);
                } else if (iV == -1) {
                    Pattern pattern = Cookie.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        strGroup5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = strGroup5.toLowerCase(locale);
                        lowerCase.getClass();
                        String strPattern = pattern.pattern();
                        strPattern.getClass();
                        iV = StringsKt.V(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i2 != -1 && matcher.usePattern(Cookie.k).matches()) {
                        String strGroup6 = matcher.group(1);
                        strGroup6.getClass();
                        i2 = Integer.parseInt(strGroup6);
                    }
                } else if (i2 != -1) {
                }
                iA = a(iA2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            if (iV == -1) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            if (1 > i4 || i4 >= 32) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            if (i3 < 0 || i3 >= 24) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            if (i5 < 0 || i5 >= 60) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            if (i6 < 0 || i6 >= 60) {
                jf4.o("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.f46122a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iV - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f46087a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.f46087a.equals(this.f46087a) && cookie.b.equals(this.b) && cookie.c == this.c && cookie.d.equals(this.d) && cookie.e.equals(this.e) && cookie.f == this.f && cookie.g == this.g && cookie.h == this.h && cookie.i == this.i && Intrinsics.d(cookie.j, this.j);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(527, 31, this.f46087a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f46087a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = DateFormattingKt.f46170a.get().format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
