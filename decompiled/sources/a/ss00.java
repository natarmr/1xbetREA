package a;

import android.gov.nist.core.Separators;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ss00 {
    public static final ss00 b = c(new LocaleList(new Locale[0]));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts00 f32705a;

    public ss00(ts00 ts00Var) {
        this.f32705a = ts00Var;
    }

    public static ss00 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(Separators.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return c(new LocaleList(localeArr));
    }

    public static ss00 c(LocaleList localeList) {
        return new ss00(new ts00(localeList));
    }

    public final boolean b() {
        return this.f32705a.f34441a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ss00) {
            return this.f32705a.equals(((ss00) obj).f32705a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32705a.f34441a.hashCode();
    }

    public final String toString() {
        return this.f32705a.f34441a.toString();
    }
}
