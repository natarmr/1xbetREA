package a;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class c760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3847a;
    public IconCompat b;
    public final boolean c;
    public final int d;
    public final CharSequence e;
    public final PendingIntent f;

    public c760(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatB = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.c = true;
        this.b = iconCompatB;
        if (iconCompatB != null && iconCompatB.d() == 2) {
            this.d = iconCompatB.c();
        }
        this.e = g760.b(charSequence);
        this.f = pendingIntent;
        this.f3847a = bundle;
        this.c = true;
    }
}
