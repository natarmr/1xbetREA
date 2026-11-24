package org.xplatform.dragons_gold.presentation.views;

import a.a8z;
import a.bj5;
import a.dyb;
import a.edl;
import a.efl;
import a.lhf;
import a.maz;
import a.mfl;
import a.n9b;
import a.p3u0;
import a.pn40;
import a.r9g;
import a.rfl;
import a.sab;
import a.ugl;
import a.vgl;
import a.wez;
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

/* JADX INFO: loaded from: classes4.dex */
public final class DragonsGoldCellGameView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final a8z q;
    public final TextView r;
    public final Button s;
    public final View t;

    /* JADX WARN: Illegal instructions before constructor call */
    public DragonsGoldCellGameView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 19));
        this.r = getBinding().b;
        this.s = getBinding().d;
        this.t = getBinding().e;
    }

    private final efl getBinding() {
        return (efl) this.q.getValue();
    }

    private final DragonsGoldGameView getGameField() {
        efl binding = getBinding();
        binding.c.setVisibility(0);
        return binding.c;
    }

    public final void A(ugl uglVar) {
        DragonsGoldGameView gameField = getGameField();
        List list = uglVar.b.k;
        SparseArray sparseArray = gameField.i;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        gameField.c(true);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int size2 = ((List) list.get(i)).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((Number) ((List) list.get(i)).get(i2)).intValue() == 1) {
                    sab sabVar = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.dragons_gold_win_cell, sabVar);
                    sabVar.setAlpha(1.0f);
                } else {
                    sab sabVar2 = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.dragons_gold_lose_cell, sabVar2);
                    sabVar2.setAlpha(1.0f);
                }
                gameField.e = false;
                gameField.f = true;
            }
        }
    }

    public final void B() {
        DragonsGoldGameView gameField = getGameField();
        int i = gameField.n;
        if (i == 1 || i == 2 || i == 3) {
            gameField.d(true);
            gameField.c(false);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            int i2 = gameField.m;
            for (int i3 = 0; i3 < i2; i3++) {
                valueAnimatorOfFloat.addUpdateListener(new rfl(gameField, i3, (byte) 1));
            }
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.start();
            gameField.s = valueAnimatorOfFloat;
        }
    }

    public final void C(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 0 : 8);
    }

    public final void D(ugl uglVar) {
        vgl vglVar = uglVar.b;
        if (!vglVar.i.isEmpty()) {
            this.r.setText(w(uglVar));
        }
        C(!vglVar.i.isEmpty());
        getGameField().a(uglVar);
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
        DragonsGoldGameView gameField = getGameField();
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

    public final String w(ugl uglVar) {
        vgl vglVar = uglVar.b;
        List list = vglVar.h;
        List list2 = vglVar.i;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(((Number) list.get(list2.size() - 1)).doubleValue(), p3u0.c);
        String upperCase = uglVar.f35630a.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String string = getContext().getString(R.string.current_money_win_v2, strC + Separators.SP + upperCase);
        string.getClass();
        return string;
    }

    public final void x(Function1 function1, Function0 function0, Function0 function2, Function0 function3) {
        getGameField().setOnTakingGameStep(function1);
        getGameField().setOnGameFinished(function0);
        getGameField().setOnEndMove(function2);
        dyb.c0(this.s, new edl((mfl) function3, (byte) 3));
    }

    public final void y() {
        C(false);
        DragonsGoldGameView gameField = getGameField();
        int i = DragonsGoldGameView.u;
        gameField.a(null);
    }

    public final void z(ugl uglVar) {
        byte b = 1;
        C(true);
        this.r.setText(w(uglVar));
        DragonsGoldGameView gameField = getGameField();
        gameField.getClass();
        gameField.g = false;
        gameField.e = true;
        gameField.n = gameField.r.getRow() + 1;
        gameField.o = gameField.r.getColumn();
        bj5 bj5Var = n9b.f23131a;
        int iOrdinal = uglVar.b.e.ordinal() + 1;
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
        gameField.b();
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
        if (((sab) CollectionsKt.U((List) obj2)).getY() + gameField.d < 0.0f) {
            float f = gameField.k;
            int i4 = gameField.p;
            float f2 = i4 * f;
            int i5 = i4 + 1;
            gameField.p = i5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f * i5);
            int i6 = gameField.m;
            for (int i7 = 0; i7 < i6; i7++) {
                valueAnimatorOfFloat.addUpdateListener(new rfl(gameField, i7, (byte) 0));
            }
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.addListener(new r9g(gameField, b));
            valueAnimatorOfFloat.start();
            gameField.s = valueAnimatorOfFloat;
        } else {
            gameField.c.invoke();
        }
        gameField.c(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DragonsGoldCellGameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DragonsGoldCellGameView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
