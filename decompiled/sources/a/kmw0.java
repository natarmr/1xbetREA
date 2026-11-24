package a;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class kmw0 extends ryw0 {
    public long d;
    public String e;

    @Override // a.ryw0
    public final boolean n1() {
        Calendar calendar = Calendar.getInstance();
        this.d = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.e = rw2.o(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long q1() {
        o1();
        return this.d;
    }

    public final String r1() {
        o1();
        return this.e;
    }
}
