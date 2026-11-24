package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.victoryformula.VictoryFormulaView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w6o f38633a = new w6o(3, t8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticVictoryFormulaItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_victory_formula_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            VictoryFormulaView victoryFormulaView = (VictoryFormulaView) viewInflate;
            return new t8o0(victoryFormulaView, victoryFormulaView);
        }
        hny.u("rootView");
        return null;
    }
}
