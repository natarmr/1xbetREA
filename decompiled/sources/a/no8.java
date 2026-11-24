package a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class no8 extends pvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23857a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no8(Object obj, byte b) {
        this.f23857a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x019a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x0203  */
    /* JADX WARN: Code duplicated, block: B:172:0x0258  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x0169. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x01ba. Please report as an issue. */
    @Override // a.pvm0
    public final void A(View view, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ton0 ton0Var;
        ton0 ton0Var2;
        View view2;
        boolean zCanScrollHorizontally;
        boolean zCanScrollHorizontally2;
        View view3;
        boolean zCanScrollVertically;
        byte b = this.f23857a;
        int i = 5;
        Object obj = this.b;
        boolean z5 = false;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top > bottomSheetBehavior.F) {
                            i = 6;
                        }
                    }
                    i = 3;
                } else if (!bottomSheetBehavior.J || !bottomSheetBehavior.P(view, f2)) {
                    i = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (!bottomSheetBehavior.b) {
                            int i2 = bottomSheetBehavior.F;
                            if (top2 < i2) {
                                if (top2 < Math.abs(top2 - bottomSheetBehavior.H)) {
                                    i = 3;
                                }
                            } else if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.H)) {
                            }
                            i = 6;
                        } else if (Math.abs(top2 - bottomSheetBehavior.E) < Math.abs(top2 - bottomSheetBehavior.H)) {
                            i = 3;
                        }
                    } else if (!bottomSheetBehavior.b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                            i = 6;
                        }
                    }
                } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                    if (view.getTop() <= (bottomSheetBehavior.G() + bottomSheetBehavior.X) / 2) {
                        if (!bottomSheetBehavior.b && Math.abs(view.getTop() - bottomSheetBehavior.G()) >= Math.abs(view.getTop() - bottomSheetBehavior.F)) {
                            i = 6;
                        } else {
                            i = 3;
                        }
                    }
                }
                bottomSheetBehavior.Q(view, i, true);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                switch (sideSheetBehavior.f45578a.f27062a) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (z) {
                    i = 3;
                } else {
                    piz pizVar = sideSheetBehavior.f45578a;
                    switch (pizVar.f27062a) {
                        case 0:
                            if (Math.abs((pizVar.b.k * f) + view.getLeft()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            if (Math.abs((pizVar.b.k * f) + view.getRight()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.f45578a.f27062a) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                        }
                        if (!z3) {
                            piz pizVar2 = sideSheetBehavior.f45578a;
                            switch (pizVar2.f27062a) {
                                case 0:
                                    if (view.getRight() < (pizVar2.C() - pizVar2.D()) / 2) {
                                        z5 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() > (pizVar2.C() + pizVar2.b.m) / 2) {
                                        z5 = true;
                                    }
                                    break;
                            }
                            if (!z5) {
                                i = 3;
                            }
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f45578a.C()) < Math.abs(left - sideSheetBehavior.f45578a.D())) {
                            i = 3;
                        }
                    }
                }
                sideSheetBehavior.A(view, i, true);
                break;
            default:
                view.getClass();
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                ygu0 ygu0Var = swipeBackLayout.f47212a;
                int i3 = swipeBackLayout.e;
                if (i3 != 0 && i3 != swipeBackLayout.getDragRange()) {
                    if (swipeBackLayout.getEnableFlingBack()) {
                        int iOrdinal = swipeBackLayout.l.ordinal();
                        if (iOrdinal == 0) {
                            if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 2000.0d) {
                                ton0Var = swipeBackLayout.l;
                                ton0Var2 = ton0.f34294a;
                                view2 = swipeBackLayout.k;
                                if (ton0Var == ton0Var2) {
                                    if (view2 != null) {
                                        zCanScrollHorizontally2 = view2.canScrollHorizontally(1);
                                    } else {
                                        zCanScrollHorizontally2 = false;
                                    }
                                    if (!zCanScrollHorizontally2) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                    }
                                } else {
                                    if (view2 != null) {
                                        zCanScrollHorizontally = view2.canScrollHorizontally(-1);
                                    } else {
                                        zCanScrollHorizontally = false;
                                    }
                                    if (!zCanScrollHorizontally) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                }
                            }
                            if (swipeBackLayout.e >= swipeBackLayout.getFinishAnchor()) {
                                z4 = true;
                            } else {
                                swipeBackLayout.getFinishAnchor();
                                z4 = false;
                            }
                        } else if (iOrdinal == 1) {
                            if (f2 >= 0.0f && Math.abs(f2) > Math.abs(f) && Math.abs(f2) > 2000.0d) {
                                ton0 ton0Var3 = swipeBackLayout.l;
                                ton0 ton0Var4 = ton0.b;
                                View view4 = swipeBackLayout.k;
                                if (ton0Var3 == ton0Var4) {
                                    if (!(view4 != null ? view4.canScrollVertically(-1) : false)) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                } else if (!(view4 != null ? view4.canScrollVertically(1) : false)) {
                                    view3 = swipeBackLayout.k;
                                    if (view3 != null) {
                                        zCanScrollVertically = view3.canScrollVertically(-1);
                                    } else {
                                        zCanScrollVertically = false;
                                    }
                                    if (zCanScrollVertically) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                            }
                            if (swipeBackLayout.e >= swipeBackLayout.getFinishAnchor()) {
                                z4 = true;
                            } else {
                                swipeBackLayout.getFinishAnchor();
                                z4 = false;
                            }
                        } else if (iOrdinal == 2) {
                            if (Math.abs(f) > Math.abs(f2)) {
                                ton0Var = swipeBackLayout.l;
                                ton0Var2 = ton0.f34294a;
                                view2 = swipeBackLayout.k;
                                if (ton0Var == ton0Var2) {
                                    if (view2 != null) {
                                        zCanScrollHorizontally2 = view2.canScrollHorizontally(1);
                                    } else {
                                        zCanScrollHorizontally2 = false;
                                    }
                                    if (!zCanScrollHorizontally2) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                } else {
                                    if (view2 != null) {
                                        zCanScrollHorizontally = view2.canScrollHorizontally(-1);
                                    } else {
                                        zCanScrollHorizontally = false;
                                    }
                                    if (!zCanScrollHorizontally) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                }
                            }
                            if (swipeBackLayout.e >= swipeBackLayout.getFinishAnchor()) {
                                z4 = true;
                            } else {
                                swipeBackLayout.getFinishAnchor();
                                z4 = false;
                            }
                        } else if (iOrdinal != 3) {
                            t9f.b();
                            break;
                        } else {
                            if (f2 <= 0.0f && Math.abs(f2) > Math.abs(f) && Math.abs(f2) > 2000.0d) {
                                ton0 ton0Var5 = swipeBackLayout.l;
                                ton0 ton0Var6 = ton0.b;
                                View view5 = swipeBackLayout.k;
                                if (ton0Var5 == ton0Var6) {
                                    if (!(view5 != null ? view5.canScrollVertically(-1) : false)) {
                                        view3 = swipeBackLayout.k;
                                        if (view3 != null) {
                                            zCanScrollVertically = view3.canScrollVertically(-1);
                                        } else {
                                            zCanScrollVertically = false;
                                        }
                                        if (zCanScrollVertically) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                } else if (!(view5 != null ? view5.canScrollVertically(1) : false)) {
                                    view3 = swipeBackLayout.k;
                                    if (view3 != null) {
                                        zCanScrollVertically = view3.canScrollVertically(-1);
                                    } else {
                                        zCanScrollVertically = false;
                                    }
                                    if (zCanScrollVertically) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                            }
                            if (swipeBackLayout.e >= swipeBackLayout.getFinishAnchor()) {
                                z4 = true;
                            } else {
                                swipeBackLayout.getFinishAnchor();
                                z4 = false;
                            }
                        }
                    } else if (swipeBackLayout.e >= swipeBackLayout.getFinishAnchor()) {
                        z4 = true;
                    } else {
                        swipeBackLayout.getFinishAnchor();
                        z4 = false;
                    }
                    int iOrdinal2 = swipeBackLayout.l.ordinal();
                    if (iOrdinal2 == 0) {
                        if (ygu0Var.n(z4 ? swipeBackLayout.c : 0, 0)) {
                            WeakHashMap weakHashMap = rgu0.f30456a;
                            swipeBackLayout.postInvalidateOnAnimation();
                        }
                    } else if (iOrdinal2 == 1) {
                        if (ygu0Var.n(0, z4 ? swipeBackLayout.b : 0)) {
                            WeakHashMap weakHashMap2 = rgu0.f30456a;
                            swipeBackLayout.postInvalidateOnAnimation();
                        }
                    } else if (iOrdinal2 == 2) {
                        if (ygu0Var.n(z4 ? -swipeBackLayout.c : 0, 0)) {
                            WeakHashMap weakHashMap3 = rgu0.f30456a;
                            swipeBackLayout.postInvalidateOnAnimation();
                        }
                    } else if (iOrdinal2 != 3) {
                        t9f.b();
                    } else if (ygu0Var.n(0, z4 ? -swipeBackLayout.b : 0)) {
                        WeakHashMap weakHashMap4 = rgu0.f30456a;
                        swipeBackLayout.postInvalidateOnAnimation();
                    }
                }
                break;
        }
    }

    @Override // a.pvm0
    public final boolean C(View view, int i) {
        WeakReference weakReference;
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i2 = bottomSheetBehavior.P;
                if (i2 == 1 || bottomSheetBehavior.g0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.d0 == i) {
                    View view2 = null;
                    if (bottomSheetBehavior.e) {
                        WeakReference weakReference2 = bottomSheetBehavior.f0;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        }
                    } else {
                        ArrayList arrayList = bottomSheetBehavior.Z;
                        if (!arrayList.isEmpty()) {
                            view2 = (View) ((WeakReference) arrayList.get(0)).get();
                        }
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                SystemClock.uptimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.Y;
                return weakReference3 != null && weakReference3.get() == view;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
            default:
                view.getClass();
                return view == ((SwipeBackLayout) obj).j;
        }
    }

    @Override // a.pvm0
    public final int m(View view, int i) {
        int iC;
        int i2;
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return view.getLeft();
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                piz pizVar = sideSheetBehavior.f45578a;
                switch (pizVar.f27062a) {
                    case 0:
                        iC = -pizVar.b.l;
                        break;
                    default:
                        iC = pizVar.C();
                        break;
                }
                piz pizVar2 = sideSheetBehavior.f45578a;
                switch (pizVar2.f27062a) {
                    case 0:
                        i2 = pizVar2.b.o;
                        break;
                    default:
                        i2 = pizVar2.b.m;
                        break;
                }
                return r7x.u(i, iC, i2);
            default:
                view.getClass();
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                if (swipeBackLayout.i == son0.c) {
                    View view2 = swipeBackLayout.k;
                    if ((view2 != null ? view2.canScrollHorizontally(-1) : false) || i <= 0) {
                        View view3 = swipeBackLayout.k;
                        if (!(view3 != null ? view3.canScrollHorizontally(1) : false) && i < 0) {
                            swipeBackLayout.l = ton0.c;
                        }
                    } else {
                        swipeBackLayout.l = ton0.f34294a;
                    }
                }
                if (swipeBackLayout.l == ton0.f34294a) {
                    View view4 = swipeBackLayout.k;
                    if (!(view4 != null ? view4.canScrollHorizontally(-1) : false) && i > 0) {
                        return Math.min(Math.max(i, swipeBackLayout.getPaddingLeft()), swipeBackLayout.c);
                    }
                }
                if (swipeBackLayout.l != ton0.c) {
                    return 0;
                }
                View view5 = swipeBackLayout.k;
                if ((view5 != null ? view5.canScrollHorizontally(1) : false) || i >= 0) {
                    return 0;
                }
                return Math.min(Math.max(i, -swipeBackLayout.c), swipeBackLayout.getPaddingLeft());
        }
    }

    @Override // a.pvm0
    public final int n(View view, int i) {
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return r7x.u(i, ((BottomSheetBehavior) obj).G(), v(view));
            case 1:
                return view.getTop();
            default:
                view.getClass();
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                if (swipeBackLayout.i == son0.b) {
                    View view2 = swipeBackLayout.k;
                    if ((view2 != null ? view2.canScrollVertically(-1) : false) || i <= 0) {
                        View view3 = swipeBackLayout.k;
                        if (!(view3 != null ? view3.canScrollVertically(1) : false) && i < 0) {
                            swipeBackLayout.l = ton0.d;
                        }
                    } else {
                        swipeBackLayout.l = ton0.b;
                    }
                }
                if (swipeBackLayout.l == ton0.b) {
                    View view4 = swipeBackLayout.k;
                    if (!(view4 != null ? view4.canScrollVertically(-1) : false) && i > 0) {
                        return Math.min(Math.max(i, swipeBackLayout.getPaddingTop()), swipeBackLayout.b);
                    }
                }
                if (swipeBackLayout.l != ton0.d) {
                    return 0;
                }
                View view5 = swipeBackLayout.k;
                if ((view5 != null ? view5.canScrollVertically(1) : false) || i >= 0) {
                    return 0;
                }
                return Math.min(Math.max(i, -swipeBackLayout.b), swipeBackLayout.getPaddingTop());
        }
    }

    @Override // a.pvm0
    public int u(View view) {
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 2:
                view.getClass();
                return ((SwipeBackLayout) obj).c;
            default:
                return super.u(view);
        }
    }

    @Override // a.pvm0
    public int v(View view) {
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            case 1:
            default:
                return super.v(view);
            case 2:
                view.getClass();
                return ((SwipeBackLayout) obj).b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pvm0
    public final void y(int i) {
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.O(1);
                    }
                }
                break;
            case 1:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.y(1);
                    }
                }
                break;
            default:
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                byte b2 = swipeBackLayout.d;
                if (i != b2) {
                    boolean z = b2 == 1 || b2 == 2;
                    boolean z2 = i == 0;
                    if (z && z2 && swipeBackLayout.e == swipeBackLayout.getDragRange()) {
                        swipeBackLayout.getDoOnFinish().invoke();
                    }
                    swipeBackLayout.d = i;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    @Override // a.pvm0
    public final void z(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iAbs;
        byte b = this.f23857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((BottomSheetBehavior) obj).C(i2);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    piz pizVar = sideSheetBehavior.f45578a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (pizVar.f27062a) {
                        case 0:
                            if (left <= pizVar.b.m) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i3 = pizVar.b.m;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                piz pizVar2 = sideSheetBehavior.f45578a;
                switch (pizVar2.f27062a) {
                    case 0:
                        pizVar2.D();
                        pizVar2.C();
                        break;
                    default:
                        int i4 = pizVar2.b.m;
                        pizVar2.C();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
                return;
            default:
                view.getClass();
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) obj;
                int iOrdinal = swipeBackLayout.l.ordinal();
                if (iOrdinal == 0) {
                    iAbs = Math.abs(i);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            iAbs = Math.abs(i);
                        } else if (iOrdinal != 3) {
                            t9f.b();
                            return;
                        }
                    }
                    iAbs = Math.abs(i2);
                }
                swipeBackLayout.e = iAbs;
                float finishAnchor = iAbs / swipeBackLayout.getFinishAnchor();
                if (finishAnchor >= 1.0f) {
                    finishAnchor = 1.0f;
                }
                float dragRange = swipeBackLayout.e / swipeBackLayout.getDragRange();
                swipeBackLayout.getDoOnSwipeBack().invoke(Float.valueOf(finishAnchor), Float.valueOf(dragRange < 1.0f ? dragRange : 1.0f));
                return;
        }
    }
}
