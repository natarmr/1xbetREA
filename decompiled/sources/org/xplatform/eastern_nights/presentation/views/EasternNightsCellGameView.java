package org.xplatform.eastern_nights.presentation.views;

import a.a8z;
import a.b0d;
import a.bj5;
import a.cjn;
import a.dyb;
import a.edl;
import a.fd5;
import a.lhf;
import a.maz;
import a.n9b;
import a.p3u0;
import a.pn40;
import a.qhn;
import a.r9g;
import a.sab;
import a.uhn;
import a.wez;
import a.xhn;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EasternNightsCellGameView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final a8z q;
    public final TextView r;
    public final Button s;
    public final View t;

    /* JADX WARN: Illegal instructions before constructor call */
    public EasternNightsCellGameView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 20));
        this.r = getBinding().b;
        this.s = getBinding().d;
        this.t = getBinding().e;
    }

    private final qhn getBinding() {
        return (qhn) this.q.getValue();
    }

    private final EasternNightsGameView getGameField() {
        qhn binding = getBinding();
        binding.c.setVisibility(0);
        return binding.c;
    }

    public final void A(xhn xhnVar) {
        C(true);
        this.r.setText(w(xhnVar));
        EasternNightsGameView gameField = getGameField();
        gameField.getClass();
        gameField.g = false;
        gameField.e = true;
        gameField.n = gameField.r.getRow() + 1;
        gameField.o = gameField.r.getColumn();
        bj5 bj5Var = n9b.f23131a;
        int iOrdinal = xhnVar.b.e.ordinal();
        bj5Var.getClass();
        n9b n9bVar = iOrdinal != 1 ? iOrdinal != 2 ? n9b.d : n9b.c : n9b.b;
        gameField.e = true;
        if (n9bVar != n9b.b && n9bVar != n9b.c) {
            gameField.f(false);
            gameField.b.invoke();
            gameField.f = true;
            return;
        }
        SparseArray sparseArray = gameField.i;
        gameField.e = false;
        gameField.c();
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
        gameField.f(true);
        Object obj2 = sparseArray.get(gameField.m - 1);
        obj2.getClass();
        if (((sab) CollectionsKt.U((List) obj2)).getY() + gameField.d < 0.0f) {
            float f = gameField.k;
            int i4 = gameField.p;
            float f2 = i4 * f;
            int i5 = i4 + 1;
            gameField.p = i5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f * i5);
            valueAnimatorOfFloat.addUpdateListener(new fd5(gameField, (byte) 17));
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.addListener(new r9g((Object) gameField, (byte) 4));
            valueAnimatorOfFloat.start();
            gameField.s = valueAnimatorOfFloat;
        } else {
            gameField.c.invoke();
        }
        gameField.e(false);
    }

    public final void B(xhn xhnVar) {
        EasternNightsGameView gameField = getGameField();
        List list = xhnVar.b.k;
        SparseArray sparseArray = gameField.i;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        gameField.e(true);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int size2 = ((List) list.get(i)).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((Number) ((List) list.get(i)).get(i2)).intValue() == 1) {
                    sab sabVar = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.lamp_cell, sabVar);
                    sabVar.setAlpha(1.0f);
                } else {
                    sab sabVar2 = (sab) ((List) sparseArray.get(i)).get(i2);
                    sab.u(R.drawable.japh_cell, sabVar2);
                    sabVar2.setAlpha(1.0f);
                }
                gameField.e = false;
                gameField.f = true;
            }
        }
    }

    public final void C(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 0 : 8);
    }

    public final void D(xhn xhnVar) {
        cjn cjnVar = xhnVar.b;
        if (!cjnVar.i.isEmpty()) {
            this.r.setText(w(xhnVar));
        }
        List list = cjnVar.i;
        List list2 = cjnVar.i;
        List list3 = cjnVar.g;
        C(!list.isEmpty());
        this.t.setVisibility(8);
        EasternNightsGameView gameField = getGameField();
        gameField.getClass();
        gameField.f = false;
        gameField.m = list3.size();
        gameField.l = (byte) 6;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((Number) obj).intValue() != 0) {
                arrayList.add(obj);
            }
        }
        gameField.n = arrayList.size();
        int i = gameField.m;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = gameField.l;
            for (int i3 = 0; i3 < b; i3++) {
                if (i3 == 0) {
                    b0d b0dVar = (b0d) gameField.j.get(i2);
                    pn40 pn40Var = pn40.f27267a;
                    b0dVar.setText("x ".concat(pn40.c(((Number) list3.get(i2)).doubleValue(), p3u0.c)));
                } else {
                    sab sabVar = (sab) ((List) gameField.i.get(i2)).get(i3 - 1);
                    EasternNightsGameView.d(i2, i3, list2, sabVar);
                    gameField.a(i2, sabVar);
                }
            }
        }
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
        EasternNightsGameView gameField = getGameField();
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

    public final String w(xhn xhnVar) {
        String str;
        cjn cjnVar = xhnVar.b;
        List list = cjnVar.h;
        List list2 = cjnVar.i;
        if (list.size() >= list2.size()) {
            pn40 pn40Var = pn40.f27267a;
            String strC = pn40.c(((Number) list.get(list2.size() - 1)).doubleValue(), p3u0.c);
            String upperCase = xhnVar.f40901a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            str = strC + Separators.SP + upperCase;
        } else {
            str = "";
        }
        String string = getContext().getString(R.string.current_money_win_v2, str);
        string.getClass();
        return string;
    }

    public final void x(Function1 function1, Function0 function0, Function0 function2, Function0 function3) {
        getGameField().setOnTakingGameStep(function1);
        getGameField().setOnGameFinished(function0);
        getGameField().setOnEndMove(function2);
        dyb.c0(this.s, new edl((uhn) function3, (byte) 28));
    }

    public final void y() {
        C(false);
        getGameField().b(null);
    }

    public final void z(xhn xhnVar) {
        getGameField().b(xhnVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EasternNightsCellGameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EasternNightsCellGameView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
