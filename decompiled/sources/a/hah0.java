package a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hah0 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xp6 f12725a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public byte f;
    public final gah0 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public hah0(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.j;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new gah0();
        g();
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        xp6 xp6Var;
        xp6 xp6Var2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.f1();
            }
            f(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                f(2);
                this.j = true;
                return;
            }
            return;
        }
        gah0 gah0Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            h();
            if (!this.k) {
                int i4 = gah0Var.b;
                if (i4 != -1 && (xp6Var2 = this.f12725a) != null) {
                    xp6Var2.b(i4, 0.0f, 0);
                }
            } else if (gah0Var.c == 0) {
                int i5 = this.h;
                int i6 = gah0Var.b;
                if (i5 != i6 && (xp6Var = this.f12725a) != null) {
                    xp6Var.c(i6);
                }
            }
            f(0);
            g();
        }
        if (this.e == 2 && i == 0 && this.l) {
            h();
            if (gah0Var.c == 0) {
                int i7 = this.i;
                int i8 = gah0Var.b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    xp6 xp6Var3 = this.f12725a;
                    if (xp6Var3 != null) {
                        xp6Var3.c(i8);
                    }
                }
                f(0);
                g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        int i3;
        xp6 xp6Var;
        this.k = true;
        h();
        boolean z = this.j;
        gah0 gah0Var = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == this.b.b()) {
                        if (gah0Var.c != 0) {
                            i3 = gah0Var.b + 1;
                        }
                    }
                }
                i3 = gah0Var.b;
            } else if (gah0Var.c != 0) {
                i3 = gah0Var.b + 1;
            } else {
                i3 = gah0Var.b;
            }
            this.i = i3;
            if (this.h != i3 && (xp6Var = this.f12725a) != null) {
                xp6Var.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = gah0Var.b;
            if (i4 == -1) {
                i4 = 0;
            }
            xp6 xp6Var2 = this.f12725a;
            if (xp6Var2 != null) {
                xp6Var2.c(i4);
            }
        }
        int i5 = gah0Var.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = gah0Var.f10965a;
        int i6 = gah0Var.c;
        xp6 xp6Var3 = this.f12725a;
        if (xp6Var3 != null) {
            xp6Var3.b(i5, f, i6);
        }
        int i7 = gah0Var.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && gah0Var.c == 0 && this.f != 1) {
            f(0);
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        xp6 xp6Var = this.f12725a;
        if (xp6Var != null) {
            xp6Var.a(i);
        }
    }

    public final void g() {
        this.e = 0;
        this.f = (byte) 0;
        gah0 gah0Var = this.g;
        gah0Var.b = -1;
        gah0Var.f10965a = 0.0f;
        gah0Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146 A[LOOP:2: B:64:0x013a->B:67:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0149 A[SYNTHETIC] */
    public final void h() {
        int top;
        int I;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iF1 = linearLayoutManager.f1();
        gah0 gah0Var = this.g;
        gah0Var.b = iF1;
        if (iF1 == -1) {
            gah0Var.b = -1;
            gah0Var.f10965a = 0.0f;
            gah0Var.c = 0;
            return;
        }
        View viewD = linearLayoutManager.D(iF1);
        if (viewD == null) {
            gah0Var.b = -1;
            gah0Var.f10965a = 0.0f;
            gah0Var.c = 0;
            return;
        }
        int i3 = ((hhe0) viewD.getLayoutParams()).b.left;
        int i4 = ((hhe0) viewD.getLayoutParams()).b.right;
        int i5 = ((hhe0) viewD.getLayoutParams()).b.top;
        int i6 = ((hhe0) viewD.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewD.getHeight() + i5 + i6;
        int width = viewD.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        RecyclerView recyclerView = this.c;
        if (i7 == 0) {
            top = (viewD.getLeft() - i3) - recyclerView.getPaddingLeft();
            if (this.b.b()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewD.getTop() - i5) - recyclerView.getPaddingTop();
        }
        int i8 = -top;
        gah0Var.c = i8;
        if (i8 >= 0) {
            gah0Var.f10965a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int I2 = linearLayoutManager.I();
        if (I2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, I2, 2);
            for (int i9 = 0; i9 < I2; i9++) {
                View viewH = linearLayoutManager.H(i9);
                if (viewH == null) {
                    jf4.n("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewH.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : e43.f7163a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewH.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewH.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewH.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewH.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new s7f((byte) 13));
            int i10 = 1;
            while (true) {
                if (i10 >= I2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[I2 - 1][1] >= i13) {
                        if (linearLayoutManager.I() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                I = linearLayoutManager.I();
                for (int i14 = 0; i14 < I; i14++) {
                    if (!e43.a(linearLayoutManager.H(i14))) {
                        jf4.n("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.I() <= 1) {
            I = linearLayoutManager.I();
            while (i14 < I) {
                if (!e43.a(linearLayoutManager.H(i14))) {
                    jf4.n("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        jf4.n(twn.m(gah0Var.c, "Page can only be offset by a positive amount, not by "));
    }
}
