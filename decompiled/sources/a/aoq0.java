package a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public interface aoq0 {
    static /* synthetic */ String a(aoq0 aoq0Var, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return aoq0Var.d(str, timeZone, locale);
    }

    default long b() {
        if (this instanceof znq0) {
            return ((znq0) this).f44687a;
        }
        if (this instanceof ynq0) {
            return ((ynq0) this).f42952a / 1000;
        }
        t9f.b();
        return 0L;
    }

    default long c() {
        if (this instanceof znq0) {
            return ((znq0) this).f44687a * 1000;
        }
        if (this instanceof ynq0) {
            return ((ynq0) this).f42952a;
        }
        t9f.b();
        return 0L;
    }

    default String d(String str, TimeZone timeZone, Locale locale) {
        str.getClass();
        timeZone.getClass();
        locale.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.clear();
        gregorianCalendar.setTimeInMillis(c());
        Date time = gregorianCalendar.getTime();
        time.getClass();
        String str2 = simpleDateFormat.format(time);
        str2.getClass();
        return str2;
    }

    long getValue();
}
