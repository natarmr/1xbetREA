package a;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class w9o0 {
    public static final String b = wv00.h("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f38789a;

    public w9o0(Context context, s2m0 s2m0Var) {
        this.f38789a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
