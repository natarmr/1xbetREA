package a;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class rdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rdj f30294a = new rdj();
    public static final AtomicBoolean b = new AtomicBoolean(true);

    public static String a(ynq0 ynq0Var, sdj sdjVar, boolean z, Locale locale) {
        locale.getClass();
        Locale localeM = m(locale);
        String strA = aoq0.a(ynq0Var, sdjVar.f32037a, localeM);
        return z ? j(strA, localeM) : strA;
    }

    public static /* synthetic */ String b(ynq0 ynq0Var) {
        sdj sdjVar = sdj.UNIVERSAL;
        Locale locale = Locale.getDefault();
        locale.getClass();
        return a(ynq0Var, sdjVar, true, locale);
    }

    public static String c(rdj rdjVar, sdj sdjVar, Date date, Locale locale, int i) {
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) == 0;
        if ((i & 32) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        sdjVar.getClass();
        locale.getClass();
        Locale localeM = m(locale);
        if (date == null) {
            return "";
        }
        if (!z2 && date.getTime() <= 0) {
            return "";
        }
        String str = new SimpleDateFormat(sdjVar.f32037a, localeM).format(date);
        str.getClass();
        return z ? j(str, localeM) : str;
    }

    public static String d(rdj rdjVar, Date date, Boolean bool, Locale locale, int i) {
        efj efjVar = efj.UNIVERSAL;
        String str = (i & 16) != 0 ? "" : "-";
        if ((i & 32) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        locale.getClass();
        Locale localeM = m(locale);
        if (date == null || date.getTime() <= 0) {
            return str;
        }
        String str2 = new SimpleDateFormat(!bool.booleanValue() ? "dd.MM.yyyy (hh:mm a)" : "dd.MM.yyyy (HH:mm)", localeM).format(date);
        str2.getClass();
        return j(str2, localeM);
    }

    public static String e(wjo wjoVar, Date date, Locale locale) {
        locale.getClass();
        Locale localeM = m(locale);
        if (date == null || date.getTime() <= 0) {
            return "";
        }
        String str = new SimpleDateFormat(wjoVar.f39272a, localeM).format(date);
        str.getClass();
        return j(str, localeM);
    }

    public static String f(aoq0 aoq0Var, sdj sdjVar, Locale locale, int i) {
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) == 0;
        if ((i & 32) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        locale.getClass();
        Locale localeM = m(locale);
        if (!z2 && aoq0Var.getValue() <= 0) {
            return "";
        }
        String strA = aoq0.a(aoq0Var, sdjVar.f32037a, localeM);
        return z ? j(strA, localeM) : strA;
    }

    public static String g(aoq0 aoq0Var, efj efjVar, Boolean bool, boolean z, int i) {
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        String str = (i & 16) != 0 ? "" : "-";
        Locale locale = Locale.getDefault();
        locale.getClass();
        aoq0Var.getClass();
        Locale localeM = m(locale);
        if (aoq0Var.getValue() <= 0) {
            return str;
        }
        String strA = aoq0.a(aoq0Var, !(bool != null ? bool.booleanValue() : b.get()) ? efjVar.b : efjVar.f7721a, localeM);
        return z ? j(strA, localeM) : strA;
    }

    public static String h(aoq0 aoq0Var, ykq0 ykq0Var, Boolean bool, TimeZone timeZone, int i) {
        String str;
        Locale locale = Locale.US;
        boolean z = (i & 16) == 0;
        String str2 = (i & 32) != 0 ? "" : "-";
        if ((i & 64) != 0) {
            timeZone = TimeZone.getDefault();
            timeZone.getClass();
        }
        if ((i & 128) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        timeZone.getClass();
        locale.getClass();
        Locale localeM = m(locale);
        if (bool.booleanValue() || (str = ykq0Var.b) == null) {
            str = ykq0Var.f42804a;
        }
        return (z || aoq0Var.getValue() > 0) ? j(aoq0Var.d(str, timeZone, localeM), localeM) : str2;
    }

    public static String i(aoq0 aoq0Var, Boolean bool, Function2 function2) {
        aoq0Var.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        Locale localeM = m(locale);
        Object calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(aoq0Var.getValue()));
        calendar.getClass();
        efj efjVar = (efj) function2.invoke(calendar, calendar2);
        return j(aoq0.a(aoq0Var, !bool.booleanValue() ? efjVar.b : efjVar.f7721a, localeM), localeM);
    }

    public static String j(String str, Locale locale) {
        char c = TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? (char) 8295 : (char) 8294;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(c);
        sb.append(str);
        sb.append((char) 8297);
        return sb.toString();
    }

    public static Date k(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.clear();
        gregorianCalendar.setTimeInMillis(j * 1000);
        Date time = gregorianCalendar.getTime();
        time.getClass();
        return time;
    }

    public static void l(boolean z) {
        b.set(z);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    public static Locale m(Locale locale) {
        Locale localeBuild;
        locale.getClass();
        try {
            localeBuild = new Locale.Builder().setLocale(locale).build();
            localeBuild.getClass();
        } catch (IllformedLocaleException unused) {
            String language = locale.getLanguage();
            language.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag(kotlin.text.c.s(StringsKt.u0(language).toString(), '_', '-'));
            if (Intrinsics.d(localeForLanguageTag, Locale.ROOT)) {
                localeForLanguageTag = null;
            } else {
                String language2 = localeForLanguageTag.getLanguage();
                language2.getClass();
                if (StringsKt.W(language2)) {
                    localeForLanguageTag = null;
                }
            }
            if (localeForLanguageTag != null) {
                locale = localeForLanguageTag;
            }
            localeBuild = locale;
        }
        try {
            Locale localeBuild2 = new Locale.Builder().setLocale(localeBuild).setUnicodeLocaleKeyword("nu", "latn").build();
            localeBuild2.getClass();
            return localeBuild2;
        } catch (IllformedLocaleException unused2) {
            return localeBuild;
        }
    }
}
