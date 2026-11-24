package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelTimerView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;

/* JADX INFO: loaded from: classes3.dex */
public final class g1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10529a;
    public final Button b;
    public final Button c;
    public final Button d;
    public final Button e;
    public final Button f;
    public final Button g;
    public final Button h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;
    public final View k;
    public final ImageView l;
    public final RecyclerView m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final TextView p;
    public final LuckyWheelTimerView q;
    public final LuckyWheelTimerView r;
    public final TextView s;
    public final LuckyWheelView t;

    public g1r(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, ImageView imageView, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, LuckyWheelTimerView luckyWheelTimerView, LuckyWheelTimerView luckyWheelTimerView2, TextView textView2, LuckyWheelView luckyWheelView) {
        this.f10529a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = button4;
        this.f = button5;
        this.g = button6;
        this.h = button7;
        this.i = constraintLayout2;
        this.j = constraintLayout3;
        this.k = view;
        this.l = imageView;
        this.m = recyclerView;
        this.n = linearLayout;
        this.o = linearLayout2;
        this.p = textView;
        this.q = luckyWheelTimerView;
        this.r = luckyWheelTimerView2;
        this.s = textView2;
        this.t = luckyWheelView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10529a;
    }
}
