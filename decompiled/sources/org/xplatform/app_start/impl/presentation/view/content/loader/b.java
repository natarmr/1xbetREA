package org.xplatform.app_start.impl.presentation.view.content.loader;

import a.a3e;
import a.a8z;
import a.asj0;
import a.bg5;
import a.do5;
import a.dp;
import a.e1l;
import a.e9k;
import a.f33;
import a.f8l0;
import a.gbn;
import a.gcl0;
import a.gh5;
import a.hny;
import a.ij4;
import a.iun;
import a.jj3;
import a.l9;
import a.lq4;
import a.maz;
import a.mym0;
import a.nq8;
import a.o33;
import a.or3;
import a.qmk0;
import a.r7x;
import a.rtl0;
import a.svj;
import a.t9f;
import a.tx3;
import a.vbk;
import a.wez;
import a.wg3;
import a.wjj0;
import a.xx3;
import a.yg3;
import a.yum0;
import a.zdh;
import a.zx3;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq8 f46317a;
    public final boolean b;
    public final bg5 c;
    public final a8z d;
    public final a8z e;
    public final a8z f;
    public final a8z g;
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;
    public int l;
    public wg3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        byte b = 0;
        LayoutInflater.from(context).inflate(R.layout.app_start_loader_view, this);
        FrozenRecyclerView frozenRecyclerView = (FrozenRecyclerView) yum0.f(this, R.id.loaderRv);
        if (frozenRecyclerView == 0) {
            hny.u("Missing required view with ID: ".concat(getResources().getResourceName(R.id.loaderRv)));
            throw null;
        }
        byte b2 = 1;
        this.f46317a = new nq8(this, frozenRecyclerView, (byte) 1);
        ?? r0 = context.getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 0;
        this.b = r0;
        bg5 bg5Var = new bg5();
        byte b3 = 3;
        gbn gbnVar = new gbn(new gh5((byte) 4), new lq4(b3, (byte) 5), new ij4((byte) 21), zx3.o);
        dp dpVar = bg5Var.d;
        dpVar.b(gbnVar);
        byte b4 = 8;
        dpVar.b(new gbn(new o33(b4), new l9(b3, (byte) 22), new or3((byte) 9), zx3.b));
        dpVar.b(new gbn(new gcl0((byte) 16), new asj0(b3, b4), new f8l0(b3), wjj0.o));
        dpVar.b(new gbn(new svj((byte) 28), new e9k(b3, b4), new vbk((byte) 27), zdh.u));
        this.c = bg5Var;
        yg3 yg3Var = new yg3(context, b);
        wez wezVar = wez.b;
        this.d = maz.a(wezVar, yg3Var);
        this.e = maz.a(wezVar, new yg3(context, b2));
        this.f = maz.a(wezVar, new yg3(context, (byte) 2));
        this.g = maz.a(wezVar, new yg3(context, b3));
        this.h = maz.a(wezVar, new f33((byte) 11));
        this.i = maz.a(wezVar, new f33((byte) 12));
        this.j = maz.a(wezVar, new f33((byte) 13));
        this.k = maz.a(wezVar, new f33((byte) 14));
        this.m = wg3.b;
        frozenRecyclerView.setOverScrollMode(2);
        frozenRecyclerView.setTouchscreenBlocksFocus(true);
        frozenRecyclerView.setLayoutDirection(r0);
        frozenRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, r0));
        frozenRecyclerView.setHasFixedSize(true);
    }

    private final xx3[] getArrowArray() {
        return (xx3[]) this.k.getValue();
    }

    private final int getArrowSpace() {
        return ((Number) this.f.getValue()).intValue();
    }

    private final int getBallSpace() {
        return ((Number) this.e.getValue()).intValue();
    }

    private final do5[] getBallsArray() {
        return (do5[]) this.i.getValue();
    }

    private final int getDotSpace() {
        return ((Number) this.d.getValue()).intValue();
    }

    private final e1l[] getDotsArray() {
        return (e1l[]) this.j.getValue();
    }

    private final int getSportsManSpace() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final rtl0[] getSportsMenArray() {
        return (rtl0[]) this.h.getValue();
    }

    private final void setItemDecoration(wg3 wg3Var) {
        int ballSpace;
        int iOrdinal = wg3Var.ordinal();
        if (iOrdinal == 0) {
            ballSpace = getBallSpace();
        } else if (iOrdinal == 1) {
            ballSpace = getDotSpace();
        } else if (iOrdinal == 2) {
            ballSpace = getArrowSpace();
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            ballSpace = getSportsManSpace();
        }
        ((FrozenRecyclerView) this.f46317a.c).m(new qmk0(ballSpace, 0, 0, 0, 0, 0, null, null, 222));
    }

    public final void a(int i) {
        do5[] ballsArray;
        int i2;
        List listG0;
        char c;
        if (i < this.l) {
            return;
        }
        int iOrdinal = this.m.ordinal();
        int i3 = 0;
        if (iOrdinal != 0) {
            char c2 = 2;
            if (iOrdinal == 1) {
                e1l[] dotsArray = getDotsArray();
                ArrayList arrayList = new ArrayList(dotsArray.length);
                int length = dotsArray.length;
                int i4 = 0;
                while (i3 < length) {
                    e1l e1lVar = dotsArray[i3];
                    int i5 = i4 + 1;
                    if (i4 <= i) {
                        e1l[] dotsArray2 = getDotsArray();
                        getDotsArray()[i4].getClass();
                        dotsArray2[i4] = new e1l(R.attr.uikitStaticWhite);
                    }
                    arrayList.add(Unit.f46060a);
                    i3++;
                    i4 = i5;
                }
                int i6 = i + 1;
                if (i6 < getDotsArray().length) {
                    e1l[] dotsArray3 = getDotsArray();
                    getDotsArray()[i6].getClass();
                    dotsArray3[i6] = new e1l(R.attr.uikitStaticWhite40);
                }
                if (i < getDotsArray().length - 2) {
                    e1l[] dotsArray4 = getDotsArray();
                    int i7 = i + 2;
                    getDotsArray()[i7].getClass();
                    dotsArray4[i7] = new e1l(R.attr.uikitStaticWhite30);
                }
                ballsArray = getDotsArray();
            } else if (iOrdinal == 2) {
                xx3[] arrowArray = getArrowArray();
                ArrayList arrayList2 = new ArrayList(arrowArray.length);
                int length2 = arrowArray.length;
                int i8 = 0;
                while (i3 < length2) {
                    xx3 xx3Var = arrowArray[i3];
                    int i9 = i8 + 1;
                    if (i8 <= i) {
                        xx3[] arrowArray2 = getArrowArray();
                        getArrowArray()[i8].getClass();
                        arrowArray2[i8] = new xx3(R.attr.uikitStaticWhite);
                    }
                    arrayList2.add(Unit.f46060a);
                    i3++;
                    i8 = i9;
                }
                if (i < getArrowArray().length - 1) {
                    xx3[] arrowArray3 = getArrowArray();
                    int i10 = i + 1;
                    getArrowArray()[i10].getClass();
                    arrowArray3[i10] = new xx3(R.attr.uikitStaticWhite40);
                }
                if (i < getArrowArray().length - 2) {
                    xx3[] arrowArray4 = getArrowArray();
                    int i11 = i + 2;
                    getArrowArray()[i11].getClass();
                    arrowArray4[i11] = new xx3(R.attr.uikitStaticWhite30);
                }
                ballsArray = getArrowArray();
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                rtl0[] sportsMenArray = getSportsMenArray();
                ArrayList arrayList3 = new ArrayList(sportsMenArray.length);
                int length3 = sportsMenArray.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length3) {
                    rtl0 rtl0Var = sportsMenArray[i12];
                    int i14 = i13 + 1;
                    int i15 = this.l;
                    if (i15 > i13 || i13 > i) {
                        c = c2;
                        if (i13 < i || i13 < i15) {
                            getSportsMenArray()[i13] = rtl0.c(getSportsMenArray()[i13], false, 0, 6);
                        }
                    } else {
                        c = c2;
                        getSportsMenArray()[i13] = rtl0.c(getSportsMenArray()[i13], true, R.attr.uikitStaticWhite, 4);
                    }
                    arrayList3.add(Unit.f46060a);
                    i12++;
                    i13 = i14;
                    c2 = c;
                }
                if (i < getSportsMenArray().length - 1) {
                    int i16 = i + 1;
                    getSportsMenArray()[i16] = rtl0.c(getSportsMenArray()[i16], false, R.attr.uikitStaticWhite40, 5);
                }
                if (i < getSportsMenArray().length - 2) {
                    int i17 = i + 2;
                    getSportsMenArray()[i17] = rtl0.c(getSportsMenArray()[i17], false, R.attr.uikitStaticWhite30, 5);
                }
                ballsArray = getSportsMenArray();
            }
        } else {
            do5[] ballsArray2 = getBallsArray();
            ArrayList arrayList4 = new ArrayList(ballsArray2.length);
            int length4 = ballsArray2.length;
            int i18 = 0;
            int i19 = 0;
            while (i18 < length4) {
                do5 do5Var = ballsArray2[i18];
                int i20 = i19 + 1;
                if (i19 <= i) {
                    do5[] ballsArray3 = getBallsArray();
                    do5 do5Var2 = getBallsArray()[i19];
                    boolean z = i19 == i;
                    switch (i19) {
                        case 0:
                            i2 = R.drawable.ic_ball_1;
                            break;
                        case 1:
                            i2 = R.drawable.ic_ball_2;
                            break;
                        case 2:
                            i2 = R.drawable.ic_ball_3;
                            break;
                        case 3:
                            i2 = R.drawable.ic_ball_4;
                            break;
                        case 4:
                            i2 = R.drawable.ic_ball_5;
                            break;
                        case 5:
                            i2 = R.drawable.ic_ball_6;
                            break;
                        case 6:
                            i2 = R.drawable.ic_ball_7;
                            break;
                        case 7:
                            i2 = R.drawable.ic_ball_8;
                            break;
                        default:
                            ballsArray = getBallsArray();
                            break;
                    }
                    do5Var2.getClass();
                    ballsArray3[i19] = new do5(z, i2);
                }
                arrayList4.add(Unit.f46060a);
                i18++;
                i19 = i20;
            }
            ballsArray = getBallsArray();
        }
        this.l = i;
        bg5 bg5Var = this.c;
        if (Intrinsics.d(bg5Var.e.f, tx3.g0(ballsArray))) {
            return;
        }
        if (!this.b) {
            listG0 = tx3.g0(ballsArray);
        } else if (ballsArray.length == 0) {
            listG0 = iun.f15405a;
        } else {
            listG0 = tx3.j0(ballsArray);
            Collections.reverse(listG0);
        }
        bg5Var.A(listG0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((FrozenRecyclerView) this.f46317a.c).setAdapter(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((FrozenRecyclerView) this.f46317a.c).setAdapter(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AppStartLoaderView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AppStartLoaderView$SavedState appStartLoaderView$SavedState = (AppStartLoaderView$SavedState) parcelable;
        this.m = appStartLoaderView$SavedState.b;
        this.l = appStartLoaderView$SavedState.c;
        super.onRestoreInstanceState(appStartLoaderView$SavedState.f46316a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AppStartLoaderView$SavedState(super.onSaveInstanceState(), this.m, this.l);
    }

    public final void setContainerLayoutParams(jj3 jj3Var) {
        jj3Var.getClass();
        setId(jj3Var.f16602a);
        a3e a3eVar = new a3e(jj3Var.b, jj3Var.c);
        r7x.E(a3eVar, jj3Var);
        mym0.q(this, jj3Var);
        setLayoutParams(a3eVar);
    }

    public final void setLoaderType(wg3 wg3Var) {
        wg3Var.getClass();
        this.m = wg3Var;
        setItemDecoration(wg3Var);
    }
}
