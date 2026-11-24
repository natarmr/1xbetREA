package a;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class d930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5681a;

    public d930(byte b) {
        switch (b) {
            case 1:
                this.f5681a = new HashMap();
                break;
            default:
                this.f5681a = new HashMap();
                break;
        }
    }

    public void a(Class cls, c930 c930Var) {
        this.f5681a.put(cls, c930Var);
    }

    public void b(String str, RecyclerView recyclerView) {
        str.getClass();
        recyclerView.getClass();
        HashMap map = this.f5681a;
        boolean zContainsKey = map.containsKey(str);
        boolean z = map.get(str) != null;
        if (!zContainsKey) {
            map.put(str, null);
            return;
        }
        if (z) {
            androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.u0((Parcelable) map.get(str));
            }
            map.put(str, null);
        }
    }

    public void c(String str, RecyclerView recyclerView) {
        str.getClass();
        recyclerView.getClass();
        HashMap map = this.f5681a;
        if (map.containsKey(str)) {
            androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            map.put(str, linearLayoutManager != null ? linearLayoutManager.v0() : null);
        }
    }
}
