package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSette;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes3.dex */
public final class ibo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventCardMiddleSette f14498a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final SportScore e;
    public final TextView f;

    public ibo(EventCardMiddleSette eventCardMiddleSette, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, TextView textView, TextView textView2, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14, ImageView imageView15, ImageView imageView16, ImageView imageView17, ImageView imageView18, ImageView imageView19, ImageView imageView20, TextView textView3, SportScore sportScore, TextView textView4) {
        this.f14498a = eventCardMiddleSette;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = sportScore;
        this.f = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14498a;
    }
}
