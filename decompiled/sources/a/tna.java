package a;

import android.javax.sip.message.Response;
import android.view.View;
import android.view.animation.Interpolator;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class tna extends she0 {
    public final sna i;
    public final CardStackLayoutManager j;

    public tna(sna snaVar, CardStackLayoutManager cardStackLayoutManager) {
        this.i = snaVar;
        this.j = cardStackLayoutManager;
    }

    @Override // a.she0
    public final void d(int i, int i2, the0 the0Var, qhe0 qhe0Var) {
        int i3;
        the0Var.getClass();
        CardStackLayoutManager cardStackLayoutManager = this.j;
        ron0 ron0Var = cardStackLayoutManager.s;
        pek pekVar = ven.b;
        zj zjVar = ron0Var.f30848a;
        bpn0 bpn0Var = ron0Var.c;
        Interpolator interpolator = ron0Var.d;
        zjVar.getClass();
        bpn0Var.getClass();
        interpolator.getClass();
        if (this.i == sna.d) {
            xna xnaVar = cardStackLayoutManager.r;
            int iOrdinal = zjVar.ordinal();
            if (iOrdinal == 0) {
                i3 = -xnaVar.c;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i3 = xnaVar.c;
            }
            qhe0Var.b(-(i3 * 2), -(cardStackLayoutManager.r.d / 4), Response.BUSY_EVERYWHERE, interpolator);
        }
    }

    @Override // a.she0
    public final void e() {
        CardStackLayoutManager cardStackLayoutManager = this.j;
        qna qnaVar = cardStackLayoutManager.p;
        xna xnaVar = cardStackLayoutManager.r;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0) {
            wna wnaVar = wna.d;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar;
            cardStackLayoutManager.D(xnaVar.f);
            int i = xnaVar.f;
            qnaVar.getClass();
            return;
        }
        if (iOrdinal == 1) {
            wna wnaVar2 = wna.f;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar2;
            cardStackLayoutManager.D(xnaVar.f);
            int i2 = xnaVar.f;
            qnaVar.getClass();
            return;
        }
        if (iOrdinal == 2) {
            wna wnaVar3 = wna.c;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar3;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            wna wnaVar4 = wna.c;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar4;
        }
    }

    @Override // a.she0
    public final void f() {
        CardStackLayoutManager cardStackLayoutManager = this.j;
        xna xnaVar = cardStackLayoutManager.r;
        qna qnaVar = cardStackLayoutManager.p;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal == 2) {
            qnaVar.getClass();
            return;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        View viewD = cardStackLayoutManager.D(xnaVar.f);
        if (viewD != null) {
            int i = xnaVar.f;
            qnaVar.c(viewD);
        }
    }

    @Override // a.she0
    public final void g(View view, the0 the0Var, qhe0 qhe0Var) {
        int i;
        int i2;
        view.getClass();
        the0Var.getClass();
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        CardStackLayoutManager cardStackLayoutManager = this.j;
        ron0 ron0Var = cardStackLayoutManager.s;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                qhe0Var.b((-translationX) * 5, (-translationY) * 5, ron0Var.b, ron0Var.d);
                return;
            }
            if (iOrdinal == 2) {
                qhe0Var.b(translationX, translationY, ron0Var.b, ron0Var.d);
                return;
            } else if (iOrdinal == 3) {
                qhe0Var.b(translationX, translationY, ron0Var.b, ron0Var.d);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        xna xnaVar = cardStackLayoutManager.r;
        int iOrdinal2 = ron0Var.f30848a.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i = xnaVar.c;
            } else {
                t9f.b();
                i2 = 0;
            }
            qhe0Var.b(-i2, -(cardStackLayoutManager.r.d / 4), ron0Var.b, ron0Var.d);
        }
        i = -xnaVar.c;
        i2 = i * 2;
        qhe0Var.b(-i2, -(cardStackLayoutManager.r.d / 4), ron0Var.b, ron0Var.d);
    }
}
