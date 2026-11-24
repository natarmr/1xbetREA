package a;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class feq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ geq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ feq0(geq0 geq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = geq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        geq0 geq0Var = this.k;
        switch (b) {
            case 0:
                feq0 feq0Var = new feq0(geq0Var, yjeVar, (byte) 0);
                feq0Var.j = obj;
                return feq0Var;
            default:
                feq0 feq0Var2 = new feq0(geq0Var, yjeVar, (byte) 1);
                feq0Var2.j = obj;
                return feq0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((feq0) create((heq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((feq0) create((ieq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        geq0 geq0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                heq0 heq0Var = (heq0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (heq0Var == null) {
                    t9f.b();
                    return null;
                }
                boolean z = heq0Var.f12935a;
                iiy[] iiyVarArr = geq0.O1;
                geq0Var.G0().h.setClickable(z);
                geq0Var.G0().e.setClickable(z);
                return Unit.f46060a;
            default:
                ieq0 ieq0Var = (ieq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                uk10 uk10Var = ieq0Var.f14647a;
                String str = ieq0Var.b;
                double d = ieq0Var.c;
                String str2 = ieq0Var.d;
                boolean z2 = ieq0Var.e;
                boolean z3 = ieq0Var.g;
                double d2 = ieq0Var.f;
                iiy[] iiyVarArr2 = geq0.O1;
                boolean z4 = true;
                boolean z5 = d > 0.0d;
                uk10Var.getClass();
                if (uk10Var != uk10.FREE_SPIN && uk10Var != uk10.SPECIAL_BONUS && uk10Var != uk10.DOUBLE_BONUS && uk10Var != uk10.FREE_BET && uk10Var != uk10.RETURN_HALF) {
                    z4 = false;
                }
                geq0Var.G0().c.setVisibility(z4 ? 0 : 8);
                geq0Var.G0().d.setVisibility(z4 ? 0 : 8);
                geq0Var.G0().b.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    geq0Var.G0().d.setText(geq0Var.H(R.string.bonus));
                    geq0Var.G0().b.setText(str);
                }
                x5r x5rVarG0 = geq0Var.G0();
                AppCompatButton appCompatButton = x5rVarG0.h;
                AppCompatTextView appCompatTextView = x5rVarG0.f;
                AppCompatTextView appCompatTextView2 = x5rVarG0.g;
                if (z5 && z2) {
                    appCompatTextView2.setText(geq0Var.H(R.string.win_title));
                    TypedValue typedValue = j5d.f15927a;
                    Context context = geq0Var.G0().f40331a.getContext();
                    context.getClass();
                    appCompatTextView2.setTextColor(context.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var = pn40.f27267a;
                    appCompatTextView.setText(geq0Var.I(R.string.games_win_status_return_half_placeholder_v2, pn40.d(d, str2, p3u0.g)));
                } else if (z5) {
                    appCompatTextView2.setText(geq0Var.H(R.string.win_title));
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = geq0Var.G0().f40331a.getContext();
                    context2.getClass();
                    appCompatTextView2.setTextColor(context2.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var2 = pn40.f27267a;
                    appCompatTextView.setText(geq0Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str2));
                } else {
                    appCompatTextView2.setText(geq0Var.H(R.string.game_bad_luck));
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context3 = geq0Var.G0().f40331a.getContext();
                    context3.getClass();
                    appCompatTextView2.setTextColor(context3.getColor(R.color.static_white_60));
                    appCompatTextView.setText(geq0Var.H(R.string.try_again_new_lottery));
                }
                pn40 pn40Var3 = pn40.f27267a;
                appCompatButton.setText(geq0Var.I(R.string.play_more, pn40.c(d2, p3u0.g), str2));
                appCompatButton.setVisibility(z3 ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
