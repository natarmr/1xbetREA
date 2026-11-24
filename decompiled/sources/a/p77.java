package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes6.dex */
public final class p77 extends v46 {
    public static final /* synthetic */ int y = 0;
    public final /* synthetic */ byte u = 0;
    public final Object v;
    public final wdr w;
    public final Object x;

    public p77(View view, h8a h8aVar, bna bnaVar) {
        super(view);
        this.v = h8aVar;
        this.w = bnaVar;
        TextView textView = (TextView) view;
        this.x = new dtx(textView, textView, (byte) 0);
    }

    @Override // a.v46
    public final void t(Object obj) {
        int i;
        byte b = this.u;
        Object obj2 = this.v;
        Object obj3 = this.x;
        View view = this.f40887a;
        switch (b) {
            case 0:
                m77 m77Var = (m77) obj;
                m77Var.getClass();
                s77 s77Var = m77Var.f21305a;
                TypedValue typedValue = j5d.f15927a;
                Context context = view.getContext();
                context.getClass();
                int iA = j5d.a(context, R.attr.uikitPrimary, false);
                Context context2 = view.getContext();
                context2.getClass();
                int iA2 = j5d.a(context2, R.attr.uikitSecondary, false);
                TextView textView = (TextView) view.findViewById(R.id.itemTitle);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_type);
                View viewFindViewById = view.findViewById(R.id.divider);
                viewFindViewById.getClass();
                q77 q77Var = (q77) obj3;
                viewFindViewById.setVisibility(Intrinsics.d((m77) dw9.l(1, (ArrayList) q77Var.f), m77Var) ? 8 : 0);
                textView.getClass();
                boolean z = m77Var.b;
                UiText.ByRes byResA = g47.a(s77Var, (String) obj2, (sys0) q77Var.j);
                Context context3 = textView.getContext();
                int i2 = byResA.f47188a;
                CharSequence[] charSequenceArr = byResA.b;
                textView.setText(context3.getString(i2, Arrays.copyOf(charSequenceArr, charSequenceArr.length)));
                if (z) {
                    textView.setTextColor(iA);
                }
                Context context4 = view.getContext();
                switch (s77Var.ordinal()) {
                    case 0:
                        i = R.drawable.ic_nav_history;
                        break;
                    case 1:
                    case 6:
                        i = R.drawable.ic_nav_toto;
                        break;
                    case 2:
                        i = R.drawable.ic_autobet_history;
                        break;
                    case 3:
                        i = R.drawable.ic_unsettled_history;
                        break;
                    case 4:
                        i = R.drawable.ic_replace;
                        break;
                    case 5:
                        i = R.drawable.ic_aggregator_history;
                        break;
                    case 7:
                        i = R.drawable.glyph_loto;
                        break;
                    default:
                        t9f.b();
                        break;
                }
                Drawable drawableU = epv0.U(i, context4);
                if (drawableU != null) {
                    if (!z) {
                        iA = iA2;
                    }
                    drawableU.setTint(iA);
                    imageView.setImageDrawable(drawableU);
                }
                textView.setOnClickListener(new wg(this, m77Var, (byte) 5));
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                view.setClickable(true);
                TextView textView2 = ((dtx) obj3).c;
                textView2.setText((CharSequence) pair.b);
                if (d() == ((Number) ((h8a) obj2).invoke()).intValue()) {
                    textView2.setTextAppearance(R.style.TextAppearance_AppTheme_New_Body2_Medium);
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context5 = view.getContext();
                    context5.getClass();
                    textView2.setTextColor(context5.getColor(R.color.static_white));
                    textView2.setBackgroundResource(R.drawable.shape_chip_checked_new);
                } else {
                    textView2.setTextAppearance(R.style.TextAppearance_AppTheme_New_Body2);
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context6 = view.getContext();
                    context6.getClass();
                    textView2.setTextColor(j5d.a(context6, R.attr.uikitTextPrimary, false));
                    textView2.setBackgroundResource(R.drawable.shape_chip_unchecked_new);
                }
                rw40 rw40Var = new rw40(this, pair, (byte) 11);
                ymx ymxVar = ivb0.b;
                ymxVar.getClass();
                view.setOnClickListener(new cjj(ymxVar, true, new olh(rw40Var, (byte) 15)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p77(q77 q77Var, View view, String str, ur6 ur6Var) {
        super(view);
        view.getClass();
        str.getClass();
        this.x = q77Var;
        this.v = str;
        this.w = ur6Var;
    }
}
