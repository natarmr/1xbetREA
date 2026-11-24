package org.xplatform.uikit.components.account_info;

import a.ajl;
import a.bjl;
import a.bqd0;
import a.ful;
import a.gul;
import a.ke;
import a.ktt0;
import a.qe;
import a.qzb;
import a.re;
import a.t9f;
import a.uzb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsAccountInfo extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ke f47224a;
    public final ful b;
    public final gul c;
    public boolean d;
    public boolean e;
    public View.OnClickListener f;
    public final boolean g;
    public CharSequence h;
    public CharSequence i;
    public boolean j;
    public int k;
    public final qe l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit.components.account_info.DsAccountInfo] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6, types: [a.qe, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public DsAccountInfo(Context context, AttributeSet attributeSet) {
        ?? bjlVar;
        super(context, attributeSet);
        context.getClass();
        re reVar = re.f30310a;
        this.b = ful.e;
        this.c = gul.e;
        this.d = true;
        this.e = true;
        this.h = "";
        this.i = "";
        this.j = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.c, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i != 0 && i == 1) {
            reVar = re.b;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(11, false);
        if (z) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, R.style.DSButton_Medium_Primary);
            Context context2 = getContext();
            context2.getClass();
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, bqd0.A);
            this.b = qzb.e1(typedArrayObtainStyledAttributes2.getInt(3, 0));
            this.c = uzb.H0(typedArrayObtainStyledAttributes2.getInt(4, 0));
            typedArrayObtainStyledAttributes2.recycle();
            String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 9);
            this.i = strP == null ? "" : strP;
            this.g = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(4, true);
            this.k = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.ic_glyph_plus_small);
        }
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 12);
        this.h = strP2 != null ? strP2 : "";
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, R.dimen.space_4);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        String strP3 = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
        String string = strP3 != null ? strP3.toString() : null;
        String strP4 = ktt0.p(typedArrayObtainStyledAttributes, context, 10);
        String string2 = strP4 != null ? strP4.toString() : null;
        if (string != null && string2 != null) {
            setModel(new ke(string, string2));
        }
        typedArrayObtainStyledAttributes.recycle();
        int iOrdinal = reVar.ordinal();
        if (iOrdinal == 0) {
            Context context3 = getContext();
            context3.getClass();
            bjlVar = new bjl(context3);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            Context context4 = getContext();
            context4.getClass();
            bjlVar = new ajl(context4);
        }
        ke keVar = this.f47224a;
        if (keVar != null) {
            bjlVar.setModel(keVar);
        }
        bjlVar.setLabel(this.h);
        bjlVar.setHasButton(z);
        bjlVar.setButtonText(this.i);
        bjlVar.setClickListener(this.f);
        bjlVar.setButtonStyle(this.b);
        bjlVar.setButtonType(this.c);
        bjlVar.b(this.g);
        bjlVar.setButtonIconAutoMirrored(z2);
        bjlVar.setButtonEnabled(this.j);
        bjlVar.setButtonIconRes(this.k);
        bjlVar.setButtonVisible(this.d);
        bjlVar.setAmountCurrencyVisible(this.e);
        bjlVar.setAmountCurrencyMargin(dimensionPixelSize);
        this.l = bjlVar;
        removeAllViews();
        addView(bjlVar);
    }

    public final String getAmount() {
        String str;
        ke keVar = this.f47224a;
        return (keVar == null || (str = keVar.f18129a) == null) ? "" : str;
    }

    public final String getAmountAndCurrency() {
        String str;
        ke keVar = this.f47224a;
        return (keVar == null || (str = keVar.b) == null) ? "" : str;
    }

    public final CharSequence getVisibleAmount() {
        CharSequence visibleAmount;
        qe qeVar = this.l;
        return (qeVar == null || (visibleAmount = qeVar.getVisibleAmount()) == null) ? "" : visibleAmount;
    }

    public final void setAmountCurrencyVisible(boolean z) {
        this.e = z;
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setClickListener(onClickListener);
        }
    }

    public final void setButtonEnabled(boolean z) {
        this.j = z;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setButtonEnabled(z);
        }
    }

    public final void setButtonIconRes(int i) {
        this.k = i;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setButtonIconRes(i);
        }
    }

    public final void setButtonText(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setButtonText(string);
    }

    public final void setButtonVisible(boolean z) {
        this.d = z;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setButtonVisible(z);
        }
    }

    public final void setLabel(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setLabel(string);
    }

    public final void setModel(ke keVar) {
        keVar.getClass();
        this.f47224a = keVar;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setModel(keVar);
        }
    }

    public final void setButtonText(CharSequence charSequence) {
        charSequence.getClass();
        this.i = charSequence;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setButtonText(charSequence);
        }
    }

    public final void setLabel(CharSequence charSequence) {
        charSequence.getClass();
        this.h = charSequence;
        qe qeVar = this.l;
        if (qeVar != null) {
            qeVar.setLabel(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAccountInfo(Context context) {
        this(context, null);
        context.getClass();
    }
}
