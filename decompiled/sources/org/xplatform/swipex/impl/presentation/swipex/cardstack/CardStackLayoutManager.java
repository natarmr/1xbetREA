package org.xplatform.swipex.impl.presentation.swipex.cardstack;

import a.fy2;
import a.hhe0;
import a.msj;
import a.pna;
import a.qna;
import a.rhe0;
import a.rna;
import a.ron0;
import a.sj3;
import a.sna;
import a.t9f;
import a.the0;
import a.tna;
import a.vna;
import a.wna;
import a.xna;
import a.zj;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;", "Landroidx/recyclerview/widget/b;", "La/rhe0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CardStackLayoutManager extends b implements rhe0 {
    public final qna p;
    public final rna q;
    public final xna r;
    public ron0 s;
    public final Handler t;

    public CardStackLayoutManager(qna qnaVar, rna rnaVar) {
        qnaVar.getClass();
        this.p = qnaVar;
        this.q = rnaVar;
        xna xnaVar = new xna();
        xnaVar.f41165a = wna.f39437a;
        xnaVar.b = vna.c;
        xnaVar.g = -1;
        this.r = xnaVar;
        this.s = new ron0(null, 15);
        this.t = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 E() {
        return new hhe0(-1, -1);
    }

    @Override // androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        int i2;
        msjVar.getClass();
        the0Var.getClass();
        xna xnaVar = this.r;
        if (xnaVar.f == S()) {
            return 0;
        }
        int iOrdinal = xnaVar.f41165a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            xnaVar.e -= i;
        } else {
            i = 0;
        }
        vna vnaVar = xnaVar.b;
        if (vnaVar == vna.c || (((i2 = xnaVar.e) >= 0 && vnaVar == vna.b) || (i2 <= 0 && vnaVar == vna.f37710a))) {
            U0(msjVar);
            return i;
        }
        xnaVar.e = 0;
        U0(msjVar);
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final void H0(int i) {
        int iS = S();
        xna xnaVar = this.r;
        if ((i == xnaVar.f || i < 0 || iS < i) ? false : !xnaVar.f41165a.a()) {
            xnaVar.f = i;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        the0Var.getClass();
        int iS = S();
        xna xnaVar = this.r;
        if ((i == xnaVar.f || i < 0 || iS < i) ? false : !xnaVar.f41165a.a()) {
            int i2 = xnaVar.f;
            if (i2 < i) {
                xnaVar.h = 0.0f;
                xnaVar.g = i;
                tna tnaVar = new tna(sna.f32483a, this);
                tnaVar.f32207a = xnaVar.f;
                S0(tnaVar);
                return;
            }
            xnaVar.h = 0.0f;
            xnaVar.g = i;
            xnaVar.f = i2 - 1;
            tna tnaVar2 = new tna(sna.d, this);
            tnaVar2.f32207a = xnaVar.f;
            S0(tnaVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    public final void U0(msj msjVar) {
        wna wnaVar;
        char c;
        float f;
        char c2;
        float f2;
        View viewFindViewById;
        int i = this.n;
        xna xnaVar = this.r;
        xnaVar.c = i;
        xnaVar.d = this.o;
        wna wnaVar2 = xnaVar.f41165a;
        wnaVar2.getClass();
        float f3 = 0.0f;
        int i2 = 1;
        ?? r8 = 0;
        if ((wnaVar2 == wna.f || wnaVar2 == wna.d) && xnaVar.f < xnaVar.g && xnaVar.c < Math.abs(xnaVar.e)) {
            zj zjVar = ((float) xnaVar.e) < 0.0f ? zj.f44462a : zj.b;
            View viewD = D(xnaVar.f);
            if (viewD != null) {
                C0(viewD, msjVar);
            }
            int iOrdinal = xnaVar.f41165a.ordinal();
            if (iOrdinal != 3) {
                wnaVar = iOrdinal != 5 ? wna.f39437a : wna.g;
            } else {
                wnaVar = wna.e;
            }
            xnaVar.f41165a = wnaVar;
            int i3 = xnaVar.f + 1;
            xnaVar.f = i3;
            xnaVar.e = 0;
            if (i3 == xnaVar.g) {
                xnaVar.g = -1;
            }
            this.t.post(new fy2(this, zjVar, (byte) 23));
        }
        C(msjVar);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = this.n - getPaddingLeft();
        int paddingBottom = this.o - getPaddingBottom();
        int i4 = xnaVar.f;
        rna rnaVar = this.q;
        int iMin = Math.min(i4 + rnaVar.f30779a, S());
        int i5 = xnaVar.f;
        while (i5 < iMin) {
            View viewE = msjVar.e(i5);
            viewE.getClass();
            m(viewE, r8, r8);
            b0(viewE);
            b.a0(viewE, paddingLeft, paddingTop, paddingLeft2, paddingBottom);
            viewE.setTranslationX(f3);
            viewE.setTranslationY(f3);
            viewE.setScaleX(1.0f);
            viewE.setScaleY(1.0f);
            viewE.setRotation(f3);
            viewE.setAlpha(1.0f);
            View viewFindViewById2 = viewE.findViewById(R.id.cardGradient);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setAlpha(f3);
            }
            int i6 = xnaVar.f;
            if (i5 == i6) {
                viewE.setTranslationX(xnaVar.e);
                viewE.setTranslationY(f3);
                viewE.setScaleX(1.0f);
                viewE.setScaleY(1.0f);
                if (xnaVar.a() == f3) {
                    f2 = f3;
                } else {
                    f2 = f3;
                    if (xnaVar.f41165a != wna.c && (viewFindViewById = viewE.findViewById(R.id.cardGradient)) != null) {
                        viewFindViewById.setAlpha(1.0f);
                        int iOrdinal2 = (((float) xnaVar.e) < f2 ? zj.f44462a : zj.b).ordinal();
                        if (iOrdinal2 == 0) {
                            viewFindViewById.setBackgroundResource(R.drawable.dislike_gradient);
                        } else {
                            if (iOrdinal2 != i2) {
                                t9f.b();
                                return;
                            }
                            viewFindViewById.setBackgroundResource(R.drawable.like_gradient);
                        }
                    }
                }
                viewE.setRotation(((xnaVar.e * 20.0f) / this.n) * xnaVar.h);
                f = f2;
                c = 3;
            } else {
                float f4 = f3;
                int i7 = i5 - i6;
                View viewFindViewById3 = viewE.findViewById(R.id.cardGradient);
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setAlpha(1.0f);
                    viewFindViewById3.setBackgroundResource(R.drawable.card_background);
                    if (i7 != i2) {
                        if (i7 != 2) {
                            c2 = 3;
                            if (i7 == 3) {
                                viewE.setAlpha(xnaVar.a() / 2.0f);
                            }
                        } else {
                            c2 = 3;
                            viewE.setAlpha((xnaVar.a() / 2.0f) + 0.5f);
                        }
                        c = c2;
                    } else {
                        c = 3;
                        viewFindViewById3.setAlpha(1.0f - xnaVar.a());
                    }
                } else {
                    c = 3;
                }
                int i8 = i7 - 1;
                int iX = sj3.X(rnaVar.b);
                float f5 = i7 * iX;
                viewE.setTranslationY(-(f5 - (xnaVar.a() * (f5 - (iX * i8)))));
                float f6 = 1.0f - (i7 * 0.100000024f);
                viewE.setScaleX((xnaVar.a() * ((1.0f - (i8 * 0.100000024f)) - f6)) + f6);
                f = f4;
                viewE.setRotation(f);
            }
            i5++;
            f3 = f;
            i2 = 1;
            r8 = 0;
        }
        float f7 = f3;
        wna wnaVar3 = xnaVar.f41165a;
        wnaVar3.getClass();
        if (wnaVar3 == wna.b) {
            zj zjVar2 = ((float) xnaVar.e) < f7 ? zj.f44462a : zj.b;
            xnaVar.a();
            this.p.d(zjVar2);
        }
    }

    @Override // a.rhe0
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        msjVar.getClass();
        the0Var.getClass();
        U0(msjVar);
        if (the0Var.f) {
            xna xnaVar = this.r;
            View viewD = D(xnaVar.f);
            if (viewD != null) {
                int i = xnaVar.f;
                this.p.c(viewD);
            }
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void w0(int i) {
        xna xnaVar = this.r;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            wna wnaVar = wna.b;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar;
            return;
        }
        int i2 = xnaVar.g;
        if (i2 == -1) {
            wna wnaVar2 = wna.f39437a;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar2;
            xnaVar.g = -1;
            return;
        }
        if (xnaVar.f == i2) {
            wna wnaVar3 = wna.f39437a;
            xnaVar.getClass();
            xnaVar.f41165a = wnaVar3;
            xnaVar.g = -1;
        }
    }

    public CardStackLayoutManager(int i) {
        this(pna.f27278a, rna.c);
    }

    public CardStackLayoutManager() {
        this(0);
    }
}
