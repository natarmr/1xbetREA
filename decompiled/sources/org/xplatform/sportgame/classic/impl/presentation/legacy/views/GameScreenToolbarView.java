package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.a8z;
import a.dyb;
import a.ehu0;
import a.maz;
import a.ncl0;
import a.nsr;
import a.wez;
import a.ymx;
import a.zus;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;

/* JADX INFO: loaded from: classes5.dex */
public final class GameScreenToolbarView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final a8z q;

    /* JADX WARN: Illegal instructions before constructor call */
    public GameScreenToolbarView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 1));
        setBackgroundColor(context.getColor(R.color.static_transparent));
    }

    private final ehu0 getBinding() {
        Object value = this.q.getValue();
        value.getClass();
        return (ehu0) value;
    }

    private final void setToolbarActionsEnabled(boolean z) {
        getBinding().d.setEnabled(z);
        getBinding().c.setEnabled(z);
    }

    public final void u(final ncl0 ncl0Var) {
        ncl0Var.getClass();
        final byte b = 0;
        dyb.b0(getBinding().b, ymx.INTERVAL_500, new Function1() { // from class: a.nrs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                bvs bvsVar = ncl0Var;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        int i = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.a();
                        break;
                    case 1:
                        int i2 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.p();
                        break;
                    default:
                        int i3 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.g();
                        break;
                }
                return Unit.f46060a;
            }
        });
        ImageView imageView = getBinding().d;
        ymx ymxVar = ymx.INTERVAL_1000;
        final byte b2 = 1;
        dyb.b0(imageView, ymxVar, new Function1() { // from class: a.nrs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                bvs bvsVar = ncl0Var;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        int i = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.a();
                        break;
                    case 1:
                        int i2 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.p();
                        break;
                    default:
                        int i3 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.g();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.b0(getBinding().c, ymxVar, new Function1() { // from class: a.nrs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                bvs bvsVar = ncl0Var;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        int i = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.a();
                        break;
                    case 1:
                        int i2 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.p();
                        break;
                    default:
                        int i3 = GameScreenToolbarView.r;
                        view.getClass();
                        bvsVar.g();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    public final void v(zus zusVar) {
        zusVar.getClass();
        getBinding().e.setText(zusVar.f45023a);
        ImageView imageView = getBinding().d;
        boolean z = zusVar.c;
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            getBinding().d.setImageResource(zusVar.b);
        }
        setToolbarActionsEnabled(zusVar.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameScreenToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameScreenToolbarView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
