package a;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nk70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ok70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk70(ok70 ok70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ok70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ok70 ok70Var = this.k;
        switch (b) {
            case 0:
                nk70 nk70Var = new nk70(ok70Var, yjeVar, (byte) 0);
                nk70Var.j = obj;
                return nk70Var;
            default:
                nk70 nk70Var2 = new nk70(ok70Var, yjeVar, (byte) 1);
                nk70Var2.j = obj;
                return nk70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nk70) create((rk70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nk70) create((sk70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ok70 ok70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                rk70 rk70Var = (rk70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (rk70Var != null) {
                    if (rk70Var instanceof pk70) {
                        boolean z = ((pk70) rk70Var).f27122a;
                        iiy[] iiyVarArr = ok70.O1;
                        ok70Var.G0().e.setClickable(z);
                        ok70Var.G0().b.setClickable(z);
                    } else if (rk70Var instanceof qk70) {
                        boolean z2 = ((qk70) rk70Var).f28872a;
                        iiy[] iiyVarArr2 = ok70.O1;
                        ok70Var.G0().f17482a.setClickable(!z2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                sk70 sk70Var = (sk70) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = sk70Var.f32334a;
                double d = sk70Var.b;
                String str = sk70Var.c;
                boolean z4 = sk70Var.d;
                boolean z5 = sk70Var.e;
                double d2 = sk70Var.f;
                boolean z6 = sk70Var.g;
                iiy[] iiyVarArr3 = ok70.O1;
                k0r k0rVarG0 = ok70Var.G0();
                AppCompatButton appCompatButton = k0rVarG0.e;
                AppCompatTextView appCompatTextView = k0rVarG0.c;
                AppCompatTextView appCompatTextView2 = k0rVarG0.d;
                if (z3 && z5) {
                    appCompatTextView2.setText(ok70Var.H(R.string.draw_game));
                    TypedValue typedValue = j5d.f15927a;
                    Context context = ok70Var.G0().f17482a.getContext();
                    context.getClass();
                    appCompatTextView2.setTextColor(context.getColor(R.color.static_white_60));
                    pn40 pn40Var = pn40.f27267a;
                    appCompatTextView.setText(ok70Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str));
                } else if (z3 && z4) {
                    appCompatTextView2.setText(ok70Var.H(R.string.win_title));
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = ok70Var.G0().f17482a.getContext();
                    context2.getClass();
                    appCompatTextView2.setTextColor(context2.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var2 = pn40.f27267a;
                    appCompatTextView.setText(ok70Var.I(R.string.games_win_status_return_half_placeholder_v2, pn40.d(d, str, p3u0.g)));
                } else if (z3) {
                    appCompatTextView2.setText(ok70Var.H(R.string.win_title));
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context3 = ok70Var.G0().f17482a.getContext();
                    context3.getClass();
                    appCompatTextView2.setTextColor(context3.getColor(R.color.end_game_win_title_color));
                    pn40 pn40Var3 = pn40.f27267a;
                    appCompatTextView.setText(ok70Var.I(R.string.games_win_status, "", pn40.c(d, p3u0.g), str));
                } else {
                    appCompatTextView2.setText(ok70Var.H(R.string.game_bad_luck));
                    TypedValue typedValue4 = j5d.f15927a;
                    Context context4 = ok70Var.G0().f17482a.getContext();
                    context4.getClass();
                    appCompatTextView2.setTextColor(context4.getColor(R.color.static_white_60));
                    appCompatTextView.setText(ok70Var.H(R.string.try_again_new_lottery));
                }
                pn40 pn40Var4 = pn40.f27267a;
                appCompatButton.setText(ok70Var.I(R.string.play_more, pn40.c(d2, p3u0.g), str));
                appCompatButton.setVisibility(z6 ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
