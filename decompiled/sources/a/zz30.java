package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class zz30 extends hil {
    public final byte m;
    public final byte n;
    public gz30 o;
    public hz30 p;

    public zz30(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = (byte) 21;
            this.n = (byte) 22;
        } else {
            this.m = (byte) 22;
            this.n = (byte) 21;
        }
    }

    @Override // a.hil, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        mv30 mv30Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                mv30Var = (mv30) headerViewListAdapter.getWrappedAdapter();
            } else {
                mv30Var = (mv30) adapter;
                headersCount = 0;
            }
            hz30 hz30VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= mv30Var.getCount()) ? null : mv30Var.getItem(i);
            hz30 hz30Var = this.p;
            if (hz30Var != hz30VarB) {
                ox30 ox30Var = mv30Var.f22440a;
                if (hz30Var != null) {
                    this.o.d(ox30Var, hz30Var);
                }
                this.p = hz30VarB;
                if (hz30VarB != null) {
                    this.o.p(ox30Var, hz30VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (mv30) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (mv30) adapter).f22440a.c(false);
        return true;
    }

    public void setHoverListener(gz30 gz30Var) {
        this.o = gz30Var;
    }

    @Override // a.hil, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
