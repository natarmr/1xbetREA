package a;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class enk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8098a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f8098a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
