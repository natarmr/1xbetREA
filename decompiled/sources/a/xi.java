package a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class xi implements c040 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40919a;
    public Context b;
    public ox30 c;
    public final LayoutInflater d;
    public b040 e;
    public n240 h;
    public wi i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public ui s;
    public ui t;
    public lfr u;
    public vi v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final do20 w = new do20(this);

    public xi(Context context) {
        this.f40919a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // a.c040
    public final void a(Context context, ox30 ox30Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = ox30Var;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int measuredWidth = this.n;
        if (this.l) {
            if (this.i == null) {
                wi wiVar = new wi(this, this.f40919a);
                this.i = wiVar;
                if (this.k) {
                    wiVar.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.c040
    public final boolean b(fzm0 fzm0Var) {
        boolean z;
        if (fzm0Var.hasVisibleItems()) {
            fzm0 fzm0Var2 = fzm0Var;
            while (true) {
                ox30 ox30Var = fzm0Var2.z;
                if (ox30Var == this.c) {
                    break;
                }
                fzm0Var2 = (fzm0) ox30Var;
            }
            hz30 hz30Var = fzm0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof m240) && ((m240) childAt).getItemData() == hz30Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = fzm0Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = fzm0Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                ui uiVar = new ui(this, this.b, fzm0Var, view);
                this.t = uiVar;
                uiVar.h = z;
                wz30 wz30Var = uiVar.j;
                if (wz30Var != null) {
                    wz30Var.m(z);
                }
                ui uiVar2 = this.t;
                if (!uiVar2.b()) {
                    if (uiVar2.f == null) {
                        jf4.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    uiVar2.d(0, 0, false, false);
                }
                b040 b040Var = this.e;
                if (b040Var != null) {
                    b040Var.f(fzm0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // a.c040
    public final void c(ox30 ox30Var, boolean z) {
        j();
        ui uiVar = this.t;
        if (uiVar != null && uiVar.b()) {
            uiVar.j.dismiss();
        }
        b040 b040Var = this.e;
        if (b040Var != null) {
            b040Var.c(ox30Var, z);
        }
    }

    @Override // a.c040
    public final void d(b040 b040Var) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.c040
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            ox30 ox30Var = this.c;
            if (ox30Var != null) {
                ox30Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    hz30 hz30Var = (hz30) arrayListL.get(i2);
                    if ((hz30Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        hz30 itemData = childAt instanceof m240 ? ((m240) childAt).getItemData() : null;
                        View viewF = f(hz30Var, childAt, viewGroup);
                        if (hz30Var != itemData) {
                            viewF.setPressed(false);
                            viewF.jumpDrawablesToCurrentState();
                        }
                        if (viewF != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewF.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewF);
                            }
                            ((ViewGroup) this.h).addView(viewF, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        ox30 ox30Var2 = this.c;
        if (ox30Var2 != null) {
            ox30Var2.i();
            ArrayList arrayList2 = ox30Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                pz30 pz30Var = ((hz30) arrayList2.get(i3)).A;
            }
        }
        ox30 ox30Var3 = this.c;
        if (ox30Var3 != null) {
            ox30Var3.i();
            arrayList = ox30Var3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((hz30) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        wi wiVar = this.i;
        if (z) {
            if (wiVar == null) {
                wiVar = new wi(this, this.f40919a);
                this.i = wiVar;
            }
            ViewGroup viewGroup3 = (ViewGroup) wiVar.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                wi wiVar2 = this.i;
                actionMenuView.getClass();
                aj ajVarJ = ActionMenuView.j();
                ajVarJ.f950a = true;
                actionMenuView.addView(wiVar2, ajVarJ);
            }
        } else if (wiVar != null) {
            Object parent = wiVar.getParent();
            Object obj = this.h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f(hz30 hz30Var, View view, ViewGroup viewGroup) {
        View actionView = hz30Var.getActionView();
        if (actionView == null || hz30Var.e()) {
            m240 m240Var = view instanceof m240 ? (m240) view : (m240) this.d.inflate(this.g, viewGroup, false);
            m240Var.d(hz30Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) m240Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
            vi viVar = this.v;
            if (viVar == null) {
                viVar = new vi(this);
                this.v = viVar;
            }
            actionMenuItemView.setPopupCallback(viVar);
            actionView = (View) m240Var;
        }
        actionView.setVisibility(hz30Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof aj)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // a.c040
    public final boolean g(hz30 hz30Var) {
        return false;
    }

    @Override // a.c040
    public final boolean h(hz30 hz30Var) {
        return false;
    }

    @Override // a.c040
    public final boolean i() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        xi xiVar = this;
        ox30 ox30Var = xiVar.c;
        if (ox30Var != null) {
            arrayListL = ox30Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = xiVar.p;
        int i3 = xiVar.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) xiVar.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            hz30 hz30Var = (hz30) arrayListL.get(i4);
            int i7 = hz30Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (xiVar.q && hz30Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (xiVar.l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = xiVar.r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            hz30 hz30Var2 = (hz30) arrayListL.get(i9);
            int i11 = hz30Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = hz30Var2.b;
            if (z3) {
                View viewF = xiVar.f(hz30Var2, null, viewGroup);
                viewF.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewF.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                hz30Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewF2 = xiVar.f(hz30Var2, null, viewGroup);
                        viewF2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewF2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            hz30 hz30Var3 = (hz30) arrayListL.get(i13);
                            if (hz30Var3.b == i12) {
                                if ((hz30Var3.x & 32) == 32) {
                                    i8++;
                                }
                                hz30Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    hz30Var2.f(z5);
                } else {
                    hz30Var2.f(false);
                }
                i9++;
                i = 2;
                xiVar = this;
                z = true;
            }
            i9++;
            i = 2;
            xiVar = this;
            z = true;
        }
        return z;
    }

    public final boolean j() {
        Object obj;
        lfr lfrVar = this.u;
        if (lfrVar != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(lfrVar);
            this.u = null;
            return true;
        }
        ui uiVar = this.s;
        if (uiVar == null) {
            return false;
        }
        if (uiVar.b()) {
            uiVar.j.dismiss();
        }
        return true;
    }

    public final boolean k() {
        ui uiVar = this.s;
        return uiVar != null && uiVar.b();
    }

    public final boolean l() {
        ox30 ox30Var;
        boolean z = false;
        if (this.l && !k() && (ox30Var = this.c) != null && this.h != null && this.u == null) {
            ox30Var.i();
            if (!ox30Var.j.isEmpty()) {
                lfr lfrVar = new lfr(this, new ui(this, this.b, this.c, this.i), z, (byte) 1);
                this.u = lfrVar;
                ((View) this.h).post(lfrVar);
                return true;
            }
        }
        return false;
    }
}
