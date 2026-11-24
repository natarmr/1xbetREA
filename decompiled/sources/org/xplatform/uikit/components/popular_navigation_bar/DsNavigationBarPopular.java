package org.xplatform.uikit.components.popular_navigation_bar;

import a.bqd0;
import a.ex00;
import a.fx00;
import a.hx00;
import a.j1i;
import a.jx00;
import a.kdb0;
import a.ktt0;
import a.ohs0;
import a.sd;
import a.t9f;
import a.zw00;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsNavigationBarPopular extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1i f47257a;
    public kdb0 b;
    public sd c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsNavigationBarPopular(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.toolBarStyle);
        j1i j1iVar = j1i.f15735a;
        this.f47257a = j1iVar;
        this.c = new sd("", "", "");
        setTag("DsNavigationBarPopular");
        getAmount();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.Z, R.attr.toolBarStyle, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                j1iVar = j1i.b;
            } else if (i2 == 2) {
                j1iVar = j1i.c;
            }
        }
        this.f47257a = j1iVar;
        a();
        setLogo(new hx00(typedArrayObtainStyledAttributes.getResourceId(2, 0)));
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 0);
        String string = strP != null ? strP.toString() : null;
        string = string == null ? "" : string;
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
        String string2 = strP2 != null ? strP2.toString() : null;
        setModel(new sd(string, string2 == null ? "" : string2, ""));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.a(z);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.kdb0, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit.components.popular_navigation_bar.DsNavigationBarPopular] */
    public final void a() {
        ?? zw00Var;
        int iOrdinal = this.f47257a.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            zw00Var = new zw00(context);
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            zw00Var = new ex00(context2);
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        } else {
            Context context3 = getContext();
            context3.getClass();
            zw00Var = new fx00(context3);
        }
        removeAllViews();
        addView(zw00Var);
        this.b = zw00Var;
    }

    public final String getAmount() {
        return this.c.f32009a;
    }

    public final String getAmountAndCurrency() {
        sd sdVar = this.c;
        return ohs0.n(sdVar.f32009a, sdVar.b);
    }

    public final String getVisibleAmount() {
        String visibleText;
        kdb0 kdb0Var = this.b;
        if (kdb0Var == null || (visibleText = kdb0Var.getVisibleText()) == null) {
            return null;
        }
        return visibleText;
    }

    public final void setAccountControlStyle(String str) {
        str.getClass();
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setAccountControlStyle(str);
        }
    }

    public final void setAmountVisibility(boolean z) {
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setAmountVisibility(z);
        }
    }

    public final void setLogo(jx00 jx00Var) {
        jx00Var.getClass();
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setLogo(jx00Var);
        }
    }

    public final void setModel(sd sdVar) {
        sdVar.getClass();
        this.c = sdVar;
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setModel(sdVar);
        }
    }

    public final void setOnAmountClickListener(Function0<Unit> function0) {
        function0.getClass();
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setOnAmountClickListener(function0);
        }
    }

    public final void setOnSearchIconClickListener(Function0<Unit> function0) {
        function0.getClass();
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setOnSearchIconClickListener(function0);
        }
    }

    public final void setSearchIconVisibility(boolean z) {
        kdb0 kdb0Var = this.b;
        if (kdb0Var != null) {
            kdb0Var.setSearchIconVisibility(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void setStyle(String str) {
        j1i j1iVar;
        str.getClass();
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1943252512) {
            if (iHashCode != -1572741327) {
                if (iHashCode == 2027293778 && str.equals("logoLeft")) {
                    j1iVar = j1i.b;
                } else {
                    j1iVar = j1i.f15735a;
                }
            } else if (str.equals("logoRight")) {
                j1iVar = j1i.c;
            } else {
                j1iVar = j1i.f15735a;
            }
        } else if (str.equals("logoCenter")) {
            j1iVar = j1i.f15735a;
        } else {
            j1iVar = j1i.f15735a;
        }
        if (this.f47257a == j1iVar) {
            return;
        }
        this.f47257a = j1iVar;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsNavigationBarPopular(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsNavigationBarPopular(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
