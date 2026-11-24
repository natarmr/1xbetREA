package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class gf00 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11182a = -1;
    public final /* synthetic */ hf00 b;

    public gf00(hf00 hf00Var) {
        this.b = hf00Var;
        a();
    }

    public final void a() {
        ox30 ox30Var = this.b.c;
        hz30 hz30Var = ox30Var.v;
        if (hz30Var != null) {
            ox30Var.i();
            ArrayList arrayList = ox30Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((hz30) arrayList.get(i)) == hz30Var) {
                    this.f11182a = i;
                    return;
                }
            }
        }
        this.f11182a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hz30 getItem(int i) {
        ox30 ox30Var = this.b.c;
        ox30Var.i();
        ArrayList arrayList = ox30Var.j;
        int i2 = this.f11182a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (hz30) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ox30 ox30Var = this.b.c;
        ox30Var.i();
        int size = ox30Var.j.size();
        return this.f11182a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((m240) view).d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
