package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f45131a;
    public final AppCompatImageView b;
    public final LinearLayoutCompat c;
    public final AppCompatTextView d;

    public zwx(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView) {
        this.f45131a = linearLayoutCompat;
        this.b = appCompatImageView;
        this.c = linearLayoutCompat2;
        this.d = appCompatTextView;
    }

    public static zwx a(View view) {
        int i = R.id.imageSection;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.imageSection);
        if (appCompatImageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(view, R.id.titleSection);
            if (appCompatTextView != null) {
                return new zwx(linearLayoutCompat, appCompatImageView, linearLayoutCompat, appCompatTextView);
            }
            i = R.id.titleSection;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45131a;
    }
}
