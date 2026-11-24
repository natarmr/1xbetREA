package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import org.xplatform.core.presentation.bet_settings.ChipView;

/* JADX INFO: loaded from: classes3.dex */
public final class yjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f42743a;
    public final AppCompatEditText b;
    public final AppCompatEditText c;
    public final AppCompatEditText d;
    public final ChipView e;
    public final ChipView f;
    public final ChipView g;
    public final ChipView h;
    public final ChipView i;
    public final LinearLayout j;
    public final TextView k;
    public final TextView l;

    public yjk(LinearLayout linearLayout, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, ChipView chipView, ChipView chipView2, ChipView chipView3, ChipView chipView4, ChipView chipView5, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f42743a = linearLayout;
        this.b = appCompatEditText;
        this.c = appCompatEditText2;
        this.d = appCompatEditText3;
        this.e = chipView;
        this.f = chipView2;
        this.g = chipView3;
        this.h = chipView4;
        this.i = chipView5;
        this.j = linearLayout2;
        this.k = textView;
        this.l = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42743a;
    }
}
