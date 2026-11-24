package a;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class cwf extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5078a;
    public boolean b;
    public Cursor c;
    public int d;
    public awf e;
    public bwf f;
    public gwf g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                awf awfVar = this.e;
                if (awfVar != null) {
                    cursor2.unregisterContentObserver(awfVar);
                }
                bwf bwfVar = this.f;
                if (bwfVar != null) {
                    cursor2.unregisterDataSetObserver(bwfVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                awf awfVar2 = this.e;
                if (awfVar2 != null) {
                    cursor.registerContentObserver(awfVar2);
                }
                bwf bwfVar2 = this.f;
                if (bwfVar2 != null) {
                    cursor.registerDataSetObserver(bwfVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f5078a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f5078a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f5078a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5078a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            lhn0 lhn0Var = (lhn0) this;
            view = lhn0Var.j.inflate(lhn0Var.i, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        gwf gwfVar = this.g;
        if (gwfVar != null) {
            return gwfVar;
        }
        gwf gwfVar2 = new gwf();
        gwfVar2.f12024a = this;
        this.g = gwfVar2;
        return gwfVar2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f5078a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f5078a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5078a) {
            jf4.n("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            jf4.n(twn.m(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            lhn0 lhn0Var = (lhn0) this;
            view = lhn0Var.j.inflate(lhn0Var.h, viewGroup, false);
            view.setTag(new khn0(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(lhn0Var.o);
        }
        a(view, this.c);
        return view;
    }
}
