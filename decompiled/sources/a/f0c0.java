package a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f0c0 {
    /* JADX WARN: Code duplicated, block: B:5:0x0021  */
    public static final Long a(String str) {
        Object g0g0Var;
        str.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            String string = StringsKt.u0(new Regex("\\p{C}").replace(str, "")).toString();
            if (StringsKt.W(string)) {
                g0g0Var = null;
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(org.xplatform.personal.impl.presentation.edit.n.v.f32037a, Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date date = simpleDateFormat.parse(string);
                if (date != null) {
                    g0g0Var = Long.valueOf(date.getTime());
                } else {
                    g0g0Var = null;
                }
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (Long) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }
}
