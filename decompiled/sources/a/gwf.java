package a;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public final class gwf extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cwf f12024a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f12024a.c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorF;
        lhn0 lhn0Var = (lhn0) this.f12024a;
        androidx.appcompat.widget.d dVar = lhn0Var.k;
        String string = charSequence == null ? "" : charSequence.toString();
        if (dVar.getVisibility() == 0 && dVar.getWindowVisibility() == 0) {
            try {
                cursorF = lhn0Var.f(lhn0Var.l, string);
                if (cursorF != null) {
                    cursorF.getCount();
                } else {
                    cursorF = null;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorF = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorF != null) {
            filterResults.count = cursorF.getCount();
            filterResults.values = cursorF;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        cwf cwfVar = this.f12024a;
        Cursor cursor = cwfVar.c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        cwfVar.b((Cursor) obj);
    }
}
