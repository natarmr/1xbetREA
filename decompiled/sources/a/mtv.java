package a;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mtv {
    public static final zsb0 b = new zsb0("fire-global");
    public static final zsb0 c = new zsb0("fire-count");
    public static final zsb0 d = new zsb0("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8y f22386a;

    public mtv(Context context, String str) {
        this.f22386a = new s8y(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static zsb0 c(az40 az40Var, String str) {
        for (Map.Entry entry : az40Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((zsb0) entry.getKey()).f44898a;
                        str2.getClass();
                        return new zsb0(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void d(az40 az40Var, String str) {
        zsb0 zsb0VarC = c(az40Var, str);
        if (zsb0VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) efx.w(az40Var, zsb0VarC, new HashSet()));
        hashSet.remove(str);
        if (!hashSet.isEmpty()) {
            az40Var.d(zsb0VarC, hashSet);
        } else {
            az40Var.b();
            az40Var.f1700a.remove(zsb0VarC);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) eeq.U(kotlin.coroutines.g.f46065a, new slx(this.f22386a, null, (byte) 6))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new x35(((zsb0) entry.getKey()).f44898a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f22386a.a(new dls((byte) 3, jCurrentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(zsb0 zsb0Var, long j) {
        if (b(((Long) this.f22386a.b(zsb0Var, -1L)).longValue()).equals(b(j))) {
            return false;
        }
        return true;
    }
}
