package org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo;

import a.bww;
import a.r7x;
import a.s930;
import a.v930;
import a.yke;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xplatform.related.api.presentation.RelatedContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerBehavior;", "La/yke;", "Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchInfoContainerBehavior extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46999a = new ArrayList();
    public boolean b;

    @Override // a.yke
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f) {
        view2.getClass();
        if (f == -0.0f) {
            return false;
        }
        this.b = true;
        return false;
    }

    @Override // a.yke
    public final void p(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) view;
        view2.getClass();
        iArr.getClass();
        ArrayList arrayList = this.f46999a;
        if (i2 > 5 && !arrayList.isEmpty() && !this.b) {
            arrayList.clear();
            matchInfoContainerView.getCompressAnimator().j = false;
        }
        if (!matchInfoContainerView.getCompressAnimator().j || i2 <= 0) {
            return;
        }
        if (i2 > 5) {
            arrayList.add(Integer.valueOf(i2));
        }
        iArr[1] = i2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    @Override // a.yke
    public final void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        float f;
        MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) view;
        view2.getClass();
        iArr.getClass();
        if (i3 < 0) {
            v930 compressAnimator = matchInfoContainerView.getCompressAnimator();
            int iAbs = Math.abs(i3);
            MatchInfoContainerView matchInfoContainerView2 = compressAnimator.c;
            if (compressAnimator.f) {
                f = 50.0f;
            } else {
                if (compressAnimator.d.c == 1.0f) {
                    if (bww.O(matchInfoContainerView2.f1) && !matchInfoContainerView2.g1) {
                        matchInfoContainerView2.setCompress(false);
                        compressAnimator.j = false;
                        matchInfoContainerView2.setupDisableWhenAnim(true);
                    }
                } else if (!matchInfoContainerView2.g1) {
                    AnimatorSet animatorSet = compressAnimator.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    compressAnimator.h = null;
                    compressAnimator.i = false;
                    compressAnimator.j = true;
                    matchInfoContainerView2.setupDisableWhenAnim(false);
                    s930 s930Var = compressAnimator.d;
                    int i4 = s930Var.e;
                    MatchInfoContainerView matchInfoContainerView3 = s930Var.j;
                    int i5 = s930Var.f;
                    int i6 = i4 + i5;
                    f = 50.0f;
                    float f2 = s930Var.d;
                    if (f2 == 0.0f) {
                        int i7 = compressAnimator.f37014a;
                        if (i6 < i7) {
                            int i8 = compressAnimator.b;
                            int iU = i5 == 0 ? r7x.u(i4 + iAbs, i8, i7) : r7x.u(i4 + iAbs, 0, i7 - i8);
                            s930Var.e = iU;
                            matchInfoContainerView3.A(iU);
                            s930 s930Var2 = compressAnimator.d;
                            int i9 = s930Var2.g;
                            int i10 = s930Var2.i;
                            if (i9 != i10) {
                                int iU2 = r7x.u((iAbs / 2) + i9, s930Var2.h, i10);
                                s930Var2.g = iU2;
                                s930Var2.j.v(iU2);
                            }
                        } else if (i5 == 0 && i4 == i7) {
                            float fT = r7x.t((iAbs / 100.0f) + s930Var.c, 0.0f, 1.0f);
                            s930Var.c = fT;
                            matchInfoContainerView3.z(fT);
                        } else if (i6 == i7) {
                            s930Var.a(i7, 0);
                        }
                    } else {
                        float fT2 = r7x.t(f2 - (iAbs / 50.0f), 0.0f, 1.0f);
                        s930Var.d = fT2;
                        matchInfoContainerView3.x(fT2);
                    }
                }
                f = 50.0f;
            }
        } else {
            f = 50.0f;
        }
        if (i <= 0 || matchInfoContainerView.getCompressAnimator().j) {
            return;
        }
        v930 compressAnimator2 = matchInfoContainerView.getCompressAnimator();
        MatchInfoContainerView matchInfoContainerView4 = compressAnimator2.c;
        if (compressAnimator2.e) {
            return;
        }
        if (compressAnimator2.d.d == 1.0f) {
            if (bww.O(matchInfoContainerView4.f1) || matchInfoContainerView4.g1) {
                return;
            }
            matchInfoContainerView4.setCompress(true);
            compressAnimator2.i = false;
            matchInfoContainerView4.setupDisableWhenAnim(true);
            return;
        }
        if (matchInfoContainerView4.g1) {
            return;
        }
        AnimatorSet animatorSet2 = compressAnimator2.g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        compressAnimator2.g = null;
        compressAnimator2.j = false;
        compressAnimator2.i = true;
        matchInfoContainerView4.setupDisableWhenAnim(false);
        s930 s930Var3 = compressAnimator2.d;
        int i11 = s930Var3.e;
        MatchInfoContainerView matchInfoContainerView5 = s930Var3.j;
        int i12 = s930Var3.f;
        int i13 = i11 + i12;
        float f3 = s930Var3.c;
        if (f3 != 0.0f) {
            float fT3 = r7x.t(f3 - (i / f), 0.0f, 1.0f);
            s930Var3.c = fT3;
            matchInfoContainerView5.z(fT3);
            return;
        }
        int i14 = compressAnimator2.b;
        if (i13 <= i14) {
            if (i12 == i14 && i11 == 0) {
                float fT4 = r7x.t((i / 100.0f) + s930Var3.d, 0.0f, 1.0f);
                s930Var3.d = fT4;
                matchInfoContainerView5.x(fT4);
                return;
            } else {
                if (i13 == i14) {
                    s930Var3.a(0, i14);
                    return;
                }
                return;
            }
        }
        int i15 = compressAnimator2.f37014a;
        int iU3 = i12 == i14 ? r7x.u(i11 - i, 0, i15 - i14) : r7x.u(i11 - i, i14, i15);
        s930Var3.e = iU3;
        matchInfoContainerView5.A(iU3);
        s930 s930Var4 = compressAnimator2.d;
        int i16 = s930Var4.g;
        int i17 = s930Var4.h;
        if (i16 != i17) {
            int iU4 = r7x.u(i16 - (i / 2), i17, s930Var4.i);
            s930Var4.g = iU4;
            s930Var4.j.v(iU4);
        }
    }

    @Override // a.yke
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        view2.getClass();
        view3.getClass();
        if (i == 2) {
            return (view2 instanceof SubGamesContainerView) || (view2 instanceof RelatedContainerView);
        }
        return false;
    }

    @Override // a.yke
    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) view;
        view2.getClass();
        if (this.b) {
            if (matchInfoContainerView.getCompressAnimator().i) {
                matchInfoContainerView.getCompressAnimator().a();
            }
            if (matchInfoContainerView.getCompressAnimator().j) {
                matchInfoContainerView.getCompressAnimator().b(true);
            }
            this.b = false;
            return;
        }
        if (matchInfoContainerView.getCompressAnimator().i) {
            matchInfoContainerView.getCompressAnimator().a();
        }
        if (matchInfoContainerView.getCompressAnimator().j) {
            matchInfoContainerView.getCompressAnimator().b(false);
        }
    }
}
