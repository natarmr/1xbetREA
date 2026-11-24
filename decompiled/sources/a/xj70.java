package a;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xj70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yj70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj70(yj70 yj70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yj70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yj70 yj70Var = this.k;
        switch (b) {
            case 0:
                xj70 xj70Var = new xj70(yj70Var, yjeVar, (byte) 0);
                xj70Var.j = obj;
                return xj70Var;
            default:
                xj70 xj70Var2 = new xj70(yj70Var, yjeVar, (byte) 1);
                xj70Var2.j = obj;
                return xj70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xj70) create((bk70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xj70) create((ck70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strH;
        String strI;
        byte b = this.i;
        yj70 yj70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                bk70 bk70Var = (bk70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (bk70Var != null) {
                    if (bk70Var instanceof zj70) {
                        boolean z = ((zj70) bk70Var).f44471a;
                        iiy[] iiyVarArr = yj70.O1;
                        yj70Var.G0().e.setClickable(z);
                        yj70Var.G0().b.setClickable(z);
                    } else if (bk70Var instanceof ak70) {
                        boolean z2 = ((ak70) bk70Var).f1009a;
                        iiy[] iiyVarArr2 = yj70.O1;
                        yj70Var.G0().f17482a.setClickable(!z2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                ck70 ck70Var = (ck70) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = ck70Var.f4493a;
                double d = ck70Var.b;
                String str = ck70Var.c;
                boolean z4 = ck70Var.d;
                boolean z5 = ck70Var.e;
                double d2 = ck70Var.f;
                boolean z6 = ck70Var.g;
                boolean z7 = ck70Var.h;
                iiy[] iiyVarArr3 = yj70.O1;
                k0r k0rVarG0 = yj70Var.G0();
                AppCompatButton appCompatButton = k0rVarG0.e;
                AppCompatTextView appCompatTextView = k0rVarG0.c;
                AppCompatTextView appCompatTextView2 = k0rVarG0.d;
                if (z3 && z5) {
                    appCompatTextView2.setText(z7 ? yj70Var.H(R.string.domino_fish) : yj70Var.H(R.string.draw_game));
                    TypedValue typedValue = j5d.f15927a;
                    Context context = yj70Var.G0().f17482a.getContext();
                    context.getClass();
                    appCompatTextView2.setTextColor(context.getColor(R.color.static_white_60));
                    pn40 pn40Var = pn40.f27267a;
                    appCompatTextView.setText(yj70Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str));
                } else if (z3 && z4) {
                    appCompatTextView2.setText(z7 ? yj70Var.H(R.string.domino_fish) : yj70Var.H(R.string.win_title));
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = yj70Var.G0().f17482a.getContext();
                    context2.getClass();
                    appCompatTextView2.setTextColor(context2.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var2 = pn40.f27267a;
                    appCompatTextView.setText(yj70Var.I(R.string.games_win_status_return_half_placeholder_v2, pn40.d(d, str, p3u0.g)));
                } else if (z3) {
                    appCompatTextView2.setText(z7 ? yj70Var.H(R.string.domino_fish) : yj70Var.H(R.string.win_title));
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context3 = yj70Var.G0().f17482a.getContext();
                    context3.getClass();
                    appCompatTextView2.setTextColor(context3.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var3 = pn40.f27267a;
                    appCompatTextView.setText(yj70Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str));
                } else {
                    if (z7) {
                        strH = yj70Var.H(R.string.domino_fish);
                    } else {
                        strH = z4 ? yj70Var.H(R.string.win_title) : yj70Var.H(R.string.game_bad_luck);
                    }
                    appCompatTextView2.setText(strH);
                    if (z4) {
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = yj70Var.G0().f17482a.getContext();
                        context4.getClass();
                        appCompatTextView2.setTextColor(context4.getColor(R.color.end_game_win_title_color));
                    } else {
                        TypedValue typedValue5 = j5d.f15927a;
                        Context context5 = yj70Var.G0().f17482a.getContext();
                        context5.getClass();
                        appCompatTextView2.setTextColor(context5.getColor(R.color.static_white_60));
                    }
                    if (z4) {
                        pn40 pn40Var4 = pn40.f27267a;
                        strI = yj70Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str);
                    } else {
                        strI = yj70Var.H(R.string.try_again_new_lottery);
                    }
                    appCompatTextView.setText(strI);
                }
                pn40 pn40Var5 = pn40.f27267a;
                appCompatButton.setText(yj70Var.I(R.string.play_more, pn40.c(d2, p3u0.g), str));
                appCompatButton.setVisibility(z6 ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
