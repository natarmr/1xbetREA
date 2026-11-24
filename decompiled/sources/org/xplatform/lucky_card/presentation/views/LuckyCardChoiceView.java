package org.xplatform.lucky_card.presentation.views;

import a.a8z;
import a.ej10;
import a.fj10;
import a.l910;
import a.maz;
import a.nsr;
import a.wez;
import a.yhu0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;
import org.xplatform.core.presentation.views.cards.LuckyCardButton;

/* JADX INFO: loaded from: classes2.dex */
public final class LuckyCardChoiceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46763a;
    public final ArrayList b;
    public fj10 c;
    public ej10 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public LuckyCardChoiceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46763a = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 28));
        ArrayList arrayList = new ArrayList(6);
        this.b = arrayList;
        arrayList.add(getBinding().h);
        arrayList.add(getBinding().c);
        arrayList.add(getBinding().e);
        arrayList.add(getBinding().d);
        arrayList.add(getBinding().b);
        arrayList.add(getBinding().g);
        LuckyCardButton luckyCardButton = getBinding().h;
        String string = getContext().getString(R.string.factor_4x);
        string.getClass();
        luckyCardButton.a(R.drawable.ic_spade, string);
        LuckyCardButton luckyCardButton2 = getBinding().c;
        String string2 = getContext().getString(R.string.factor_4x);
        string2.getClass();
        luckyCardButton2.a(R.drawable.ic_club, string2);
        LuckyCardButton luckyCardButton3 = getBinding().e;
        String string3 = getContext().getString(R.string.factor_4x);
        string3.getClass();
        luckyCardButton3.a(R.drawable.ic_heart, string3);
        LuckyCardButton luckyCardButton4 = getBinding().d;
        String string4 = getContext().getString(R.string.factor_4x);
        string4.getClass();
        luckyCardButton4.a(R.drawable.ic_diamonds, string4);
        LuckyCardButton luckyCardButton5 = getBinding().b;
        String string5 = getContext().getString(R.string.factor_2x);
        string5.getClass();
        String string6 = getContext().getString(R.string.black);
        string6.getClass();
        luckyCardButton5.b(R.color.static_black, string5, string6);
        LuckyCardButton luckyCardButton6 = getBinding().g;
        String string7 = getContext().getString(R.string.factor_2x);
        string7.getClass();
        String string8 = getContext().getString(R.string.red);
        string8.getClass();
        luckyCardButton6.b(R.color.static_red, string7, string8);
        getBinding().h.setTag(ej10.SPADES);
        getBinding().c.setTag(ej10.CLUBS);
        getBinding().e.setTag(ej10.HEARTS);
        getBinding().b.setTag(ej10.BLACK);
        getBinding().d.setTag(ej10.DIAMONDS);
        getBinding().g.setTag(ej10.RED);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LuckyCardButton) it.next()).setOnClickListener(new l910(this, (byte) 1));
        }
        ej10 ej10Var = this.d;
        if (ej10Var == null) {
            a();
        } else {
            setSelectedType(ej10Var);
        }
    }

    private final yhu0 getBinding() {
        return (yhu0) this.f46763a.getValue();
    }

    public final void a() {
        getBinding().f.setVisibility(0);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((LuckyCardButton) it.next()).setBlackout(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((LuckyCardButton) it.next()).setEnabled(z);
        }
    }

    public final void setListener(fj10 fj10Var) {
        fj10Var.getClass();
        this.c = fj10Var;
    }

    public final void setSelectedType(ej10 ej10Var) {
        ej10Var.getClass();
        getBinding().f.setVisibility(4);
        this.d = ej10Var;
        for (LuckyCardButton luckyCardButton : this.b) {
            if (ej10Var == luckyCardButton.getTag()) {
                luckyCardButton.setBlackout(false);
            } else {
                luckyCardButton.setBlackout(true);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardChoiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardChoiceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
