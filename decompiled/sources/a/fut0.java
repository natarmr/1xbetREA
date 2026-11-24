package a;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class fut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10182a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static fut0 b;

    public fut0(y2m0 y2m0Var) {
    }

    public final boolean a(q45 q45Var) {
        return TextUtils.isEmpty(q45Var.c) || q45Var.f + q45Var.e < (System.currentTimeMillis() / 1000) + 3600;
    }
}
