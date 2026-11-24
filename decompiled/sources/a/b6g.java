package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.calendar.impl.presentation.content.day.CyberCalendarDaySwitcher;

/* JADX INFO: loaded from: classes3.dex */
public final class b6g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberCalendarDaySwitcher f2052a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;

    public b6g(CyberCalendarDaySwitcher cyberCalendarDaySwitcher, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f2052a = cyberCalendarDaySwitcher;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2052a;
    }
}
