package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDicePoker;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class tbc implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33656a = 1;
    public final View b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;

    public tbc(EventCardMiddleDicePoker eventCardMiddleDicePoker, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, SportScore sportScore, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, DsTimer dsTimer, TextView textView5, TextView textView6) {
        this.f = eventCardMiddleDicePoker;
        this.d = textView;
        this.e = textView2;
        this.c = textView3;
        this.g = textView4;
        this.b = sportScore;
        this.h = dsTimer;
        this.i = textView5;
        this.j = textView6;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f33656a;
        View view = this.f;
        switch (b) {
            case 0:
                return (Chip) view;
            case 1:
                return (ConstraintLayout) this.b;
            default:
                return (EventCardMiddleDicePoker) view;
        }
    }

    public tbc(ConstraintLayout constraintLayout, Group group, ImageView imageView, RecyclerView recyclerView, DsShimmerView dsShimmerView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.b = constraintLayout;
        this.f = group;
        this.c = imageView;
        this.g = recyclerView;
        this.h = dsShimmerView;
        this.d = textView;
        this.e = textView2;
        this.i = textView3;
        this.j = view;
    }

    public tbc(Chip chip, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, CardView cardView, CardView cardView2, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.f = chip;
        this.c = imageView;
        this.b = constraintLayout;
        this.g = imageView2;
        this.h = cardView;
        this.i = cardView2;
        this.d = textView;
        this.e = textView2;
        this.j = linearLayout;
    }
}
