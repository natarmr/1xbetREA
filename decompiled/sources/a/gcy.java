package a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class gcy implements c3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f11081a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f11081a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        ((d3u0) obj2).b(f11081a.format((Date) obj));
    }
}
