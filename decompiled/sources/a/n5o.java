package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n5o f22953a = new n5o(3, y5o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticHighervslowerItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_highervslower_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.firstPlayerRound;
        View viewF = yum0.f(viewInflate, R.id.firstPlayerRound);
        if (viewF != null) {
            iab iabVarA = iab.a(viewF);
            i = R.id.firstPlayerScore;
            View viewF2 = yum0.f(viewInflate, R.id.firstPlayerScore);
            if (viewF2 != null) {
                lth lthVarA = lth.a(viewF2);
                i = R.id.guideline;
                if (((Guideline) yum0.f(viewInflate, R.id.guideline)) != null) {
                    i = R.id.secondPlayerRound;
                    View viewF3 = yum0.f(viewInflate, R.id.secondPlayerRound);
                    if (viewF3 != null) {
                        iab iabVarA2 = iab.a(viewF3);
                        i = R.id.secondPlayerScore;
                        View viewF4 = yum0.f(viewInflate, R.id.secondPlayerScore);
                        if (viewF4 != null) {
                            lth lthVarA2 = lth.a(viewF4);
                            i = R.id.tvFirstPlayerName;
                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerName);
                            if (textView != null) {
                                i = R.id.tvMatchDescription;
                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                                if (textView2 != null) {
                                    i = R.id.tvSecondPlayerName;
                                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerName);
                                    if (textView3 != null) {
                                        return new y5o0((ConstraintLayout) viewInflate, iabVarA, lthVarA, iabVarA2, lthVarA2, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
