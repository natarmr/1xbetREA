package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mv30 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox30 f22440a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public mv30(ox30 ox30Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.f22440a = ox30Var;
        this.f = i;
        a();
    }

    public final void a() {
        ox30 ox30Var = this.f22440a;
        hz30 hz30Var = ox30Var.v;
        if (hz30Var != null) {
            ox30Var.i();
            ArrayList arrayList = ox30Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((hz30) arrayList.get(i)) == hz30Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hz30 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        ox30 ox30Var = this.f22440a;
        if (z) {
            ox30Var.i();
            arrayListL = ox30Var.j;
        } else {
            arrayListL = ox30Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (hz30) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        ox30 ox30Var = this.f22440a;
        if (z) {
            ox30Var.i();
            arrayListL = ox30Var.j;
        } else {
            arrayListL = ox30Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f22440a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        m240 m240Var = (m240) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        m240Var.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
