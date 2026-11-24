package org.xplatform.apple_fortune.presentation.views;

import a.a8z;
import a.b33;
import a.bj5;
import a.cr3;
import a.dr3;
import a.dyb;
import a.h5;
import a.lp3;
import a.maz;
import a.n9b;
import a.p3u0;
import a.pn40;
import a.sab;
import a.wez;
import a.yp3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class AppleFortuneCellGameView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final a8z q;
    public final TextView r;
    public final Button s;
    public final View t;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppleFortuneCellGameView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 6));
        this.r = getBinding().c;
        this.s = getBinding().d;
        this.t = getBinding().e;
    }

    private final lp3 getBinding() {
        return (lp3) this.q.getValue();
    }

    private final AppleFortuneGameView getGameField() {
        lp3 binding = getBinding();
        binding.b.setVisibility(0);
        return binding.b;
    }

    public final void A(cr3 cr3Var) {
        AppleFortuneGameView gameField = getGameField();
        List list = cr3Var.b.k;
        SparseArray sparseArray = gameField.i;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        gameField.b(true);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int size2 = ((List) list.get(i)).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((Number) ((List) list.get(i)).get(i2)).intValue() == 1) {
                    sab sabVar = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.apple_cell, sabVar);
                    sabVar.setAlpha(1.0f);
                } else {
                    sab sabVar2 = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.apple_bited_cell, sabVar2);
                    sabVar2.setAlpha(1.0f);
                }
                gameField.e = false;
                gameField.f = true;
            }
        }
    }

    public final void B() {
        AppleFortuneGameView gameField = getGameField();
        int i = gameField.n;
        byte b = 1;
        if (i == 1 || i == 2 || i == 3) {
            gameField.d(true);
            gameField.b(false);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            int i2 = gameField.m;
            for (int i3 = 0; i3 < i2; i3++) {
                valueAnimatorOfFloat.addUpdateListener(new yp3(gameField, i3, b));
            }
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.start();
        }
    }

    public final void C(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 0 : 8);
    }

    public final void D(cr3 cr3Var) {
        dr3 dr3Var = cr3Var.b;
        if (!dr3Var.i.isEmpty()) {
            this.r.setText(w(cr3Var));
        }
        C(!dr3Var.i.isEmpty());
        getGameField().c(cr3Var);
        this.t.setVisibility(8);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return motionEvent.getPointerCount() > 1;
    }

    public final void u() {
        AppleFortuneGameView gameField = getGameField();
        gameField.k = 0;
        gameField.l = (byte) 0;
        gameField.m = 0;
        gameField.n = 0;
        gameField.p = 0;
        gameField.o = 0;
        gameField.q = 0;
    }

    public final void v(boolean z) {
        getGameField().h = z;
    }

    public final String w(cr3 cr3Var) {
        dr3 dr3Var = cr3Var.b;
        List list = dr3Var.h;
        List list2 = dr3Var.i;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(((Number) list.get(list2.size() - 1)).doubleValue(), p3u0.c);
        String upperCase = cr3Var.f4823a.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String string = getContext().getString(R.string.current_money_win_v2, strC + Separators.SP + upperCase);
        string.getClass();
        return string;
    }

    public final void x(Function1 function1, Function0 function0, Function0 function2, Function0 function3) {
        getGameField().setOnTakingGameStep(function1);
        getGameField().setOnGameFinished(function0);
        getGameField().setOnEndMove(function2);
        dyb.c0(this.s, new b33(function3, (byte) 7));
    }

    public final void y() {
        C(false);
        AppleFortuneGameView gameField = getGameField();
        int i = AppleFortuneGameView.t;
        gameField.c(null);
    }

    public final void z(cr3 cr3Var) {
        C(true);
        this.r.setText(w(cr3Var));
        AppleFortuneGameView gameField = getGameField();
        gameField.getClass();
        byte b = 0;
        gameField.g = false;
        gameField.e = true;
        gameField.n = gameField.r.getRow() + 1;
        gameField.o = gameField.r.getColumn();
        bj5 bj5Var = n9b.f23131a;
        int iOrdinal = cr3Var.b.e.ordinal() + 1;
        bj5Var.getClass();
        n9b n9bVar = iOrdinal != 1 ? iOrdinal != 2 ? n9b.d : n9b.c : n9b.b;
        gameField.e = true;
        if (n9bVar != n9b.b && n9bVar != n9b.c) {
            gameField.d(false);
            gameField.b.invoke();
            gameField.f = true;
            return;
        }
        SparseArray sparseArray = gameField.i;
        gameField.e = false;
        gameField.a();
        int i = gameField.n;
        if (i < 3) {
            if (i <= 2) {
                gameField.p = i - 1;
            } else {
                Context context = gameField.getContext();
                context.getClass();
                if (context.getResources().getBoolean(R.bool.isTablet)) {
                    gameField.p--;
                }
                int i2 = gameField.m;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object obj = sparseArray.get(i3);
                    obj.getClass();
                    if (((sab) CollectionsKt.U((List) obj)).getY() + (gameField.k * 2) > gameField.getY() + gameField.getHeight()) {
                        gameField.p++;
                    }
                }
            }
        }
        gameField.d(true);
        Object obj2 = sparseArray.get(gameField.m - 1);
        obj2.getClass();
        if (((sab) CollectionsKt.U((List) obj2)).getY() < 0.0f) {
            float f = gameField.k;
            int i4 = gameField.p;
            float f2 = i4 * f;
            int i5 = i4 + 1;
            gameField.p = i5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f * i5);
            int i6 = gameField.m;
            for (int i7 = 0; i7 < i6; i7++) {
                valueAnimatorOfFloat.addUpdateListener(new yp3(gameField, i7, b));
            }
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.start();
        }
        gameField.b(false);
        gameField.c.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppleFortuneCellGameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppleFortuneCellGameView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
