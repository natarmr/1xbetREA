package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wva extends wz30 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public final de3 j;
    public final bc0 k;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public b040 x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final r7v l = new r7v(this);
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    public wva(Context context, View view, int i, int i2, boolean z) {
        byte b = 2;
        this.j = new de3(this, b);
        this.k = new bc0(this, b);
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // a.c040
    public final boolean b(fzm0 fzm0Var) {
        for (vva vvaVar : this.i) {
            if (fzm0Var == vvaVar.b) {
                vvaVar.f38089a.c.requestFocus();
                return true;
            }
        }
        if (!fzm0Var.hasVisibleItems()) {
            return false;
        }
        j(fzm0Var);
        b040 b040Var = this.x;
        if (b040Var != null) {
            b040Var.f(fzm0Var);
        }
        return true;
    }

    @Override // a.c040
    public final void c(ox30 ox30Var, boolean z) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ox30Var == ((vva) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((vva) arrayList.get(i2)).b.c(false);
        }
        vva vvaVar = (vva) arrayList.remove(i);
        ox30 ox30Var2 = vvaVar.b;
        a040 a040Var = vvaVar.f38089a;
        xd3 xd3Var = a040Var.z;
        ox30Var2.r(this);
        if (this.A) {
            xd3Var.setExitTransition(null);
            xd3Var.setAnimationStyle(0);
        }
        a040Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q = ((vva) arrayList.get(size2 - 1)).c;
        } else {
            this.q = this.o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((vva) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        b040 b040Var = this.x;
        if (b040Var != null) {
            b040Var.c(ox30Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // a.c040
    public final void d(b040 b040Var) {
        this.x = b040Var;
    }

    @Override // a.tsj0
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            vva[] vvaVarArr = (vva[]) arrayList.toArray(new vva[size]);
            for (int i = size - 1; i >= 0; i--) {
                vva vvaVar = vvaVarArr[i];
                if (vvaVar.f38089a.z.isShowing()) {
                    vvaVar.f38089a.dismiss();
                }
            }
        }
    }

    @Override // a.c040
    public final void e() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((vva) it.next()).f38089a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((mv30) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.tsj0
    public final boolean f() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((vva) arrayList.get(0)).f38089a.z.isShowing();
    }

    @Override // a.c040
    public final boolean i() {
        return false;
    }

    @Override // a.wz30
    public final void j(ox30 ox30Var) {
        ox30Var.b(this, this.b);
        if (f()) {
            u(ox30Var);
        } else {
            this.h.add(ox30Var);
        }
    }

    @Override // a.wz30
    public final void l(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = Gravity.getAbsoluteGravity(this.m, view.getLayoutDirection());
        }
    }

    @Override // a.wz30
    public final void m(boolean z) {
        this.v = z;
    }

    @Override // a.wz30
    public final void n(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // a.wz30
    public final void o(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        vva vvaVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vvaVar = null;
                break;
            }
            vvaVar = (vva) arrayList.get(i);
            if (!vvaVar.f38089a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (vvaVar != null) {
            vvaVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.wz30
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // a.tsj0
    public final void q() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((ox30) it.next());
        }
        arrayList.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // a.tsj0
    public final hil r() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((vva) dw9.l(1, arrayList)).f38089a.c;
    }

    @Override // a.wz30
    public final void s(boolean z) {
        this.w = z;
    }

    @Override // a.wz30
    public final void t(int i) {
        this.s = true;
        this.u = i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(ox30 ox30Var) {
        boolean z;
        int i;
        View childAt;
        vva vvaVar;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem item;
        mv30 mv30Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        mv30 mv30Var2 = new mv30(ox30Var, layoutInflaterFrom, this.f, R.layout.abc_cascading_menu_item_layout);
        if (!f() && this.v) {
            mv30Var2.c = true;
        } else if (f()) {
            int size = ox30Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = ox30Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            mv30Var2.c = z;
        }
        int iK = wz30.k(mv30Var2, context, this.c);
        a040 a040Var = new a040(context, null, this.d, this.e);
        a040Var.Y = this.l;
        a040Var.p = this;
        xd3 xd3Var = a040Var.z;
        xd3Var.setOnDismissListener(this);
        a040Var.o = this.o;
        a040Var.l = this.n;
        a040Var.y = true;
        xd3Var.setFocusable(true);
        xd3Var.setInputMethodMode(2);
        a040Var.o(mv30Var2);
        a040Var.b(iK);
        a040Var.l = this.n;
        ArrayList arrayList = this.i;
        if (arrayList.size() > 0) {
            vvaVar = (vva) dw9.l(1, arrayList);
            ox30 ox30Var2 = vvaVar.b;
            int size2 = ox30Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = 0;
                    item = null;
                    break;
                }
                item = ox30Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = 0;
                    if (ox30Var == item.getSubMenu()) {
                        break;
                    }
                }
                i6++;
            }
            if (item == null) {
                childAt = null;
            } else {
                hil hilVar = vvaVar.f38089a.c;
                ListAdapter adapter = hilVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    mv30Var = (mv30) headerViewListAdapter.getWrappedAdapter();
                } else {
                    mv30Var = (mv30) adapter;
                    headersCount = i;
                }
                int count = mv30Var.getCount();
                int i7 = i;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == mv30Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - hilVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < hilVar.getChildCount()) ? hilVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            vvaVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = a040.Z;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(xd3Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                sf3.E(xd3Var);
            }
            xd3Var.setEnterTransition(null);
            hil hilVar2 = ((vva) arrayList.get(arrayList.size() - 1)).f38089a.c;
            int[] iArr = new int[2];
            hilVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect);
            if (this.q == 1) {
                if (hilVar2.getWidth() + iArr[i] + iK > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iK < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i8 = i2 == 1 ? 1 : i;
            this.q = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                a040Var.o = childAt;
                i4 = i;
                i3 = i4;
            } else {
                int[] iArr2 = new int[2];
                this.o.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.n & 7) == 5) {
                    iArr2[i] = this.o.getWidth() + iArr2[i];
                    iArr3[i] = childAt.getWidth() + iArr3[i];
                }
                i3 = iArr3[i] - iArr2[i];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.n & 5) == 5) {
                width = i8 != 0 ? i3 + iK : i3 - childAt.getWidth();
            } else {
                width = i8 != 0 ? i3 + childAt.getWidth() : i3 - iK;
            }
            a040Var.f = width;
            a040Var.k = true;
            a040Var.j = true;
            a040Var.k(i4);
        } else {
            if (this.r) {
                a040Var.f = this.t;
            }
            if (this.s) {
                a040Var.k(this.u);
            }
            Rect rect2 = this.f40003a;
            a040Var.x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new vva(a040Var, ox30Var, this.q));
        a040Var.q();
        hil hilVar3 = a040Var.c;
        hilVar3.setOnKeyListener(this);
        if (vvaVar == null && this.w && ox30Var.m != null) {
            boolean z2 = i;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, hilVar3, z2);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(ox30Var.m);
            hilVar3.addHeaderView(frameLayout, null, z2);
            a040Var.q();
        }
    }
}
