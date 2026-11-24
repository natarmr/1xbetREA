package a;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ktm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18874a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
