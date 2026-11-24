package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class rac extends yge0 {
    public final Function1 d;
    public final Function1 e;
    public final ArrayList f;
    public final mjr0 g;
    public int h;
    public RecyclerView i;

    public rac(mjr0 mjr0Var) {
        iun iunVar = iun.f15405a;
        h26 h26Var = new h26((byte) 0);
        h26 h26Var2 = new h26((byte) 1);
        iunVar.getClass();
        this.d = h26Var;
        this.e = h26Var2;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(iunVar);
        this.g = mjr0Var;
    }

    @Override // a.yge0
    public final int d() {
        return this.f.size();
    }

    @Override // a.yge0
    public final void m(RecyclerView recyclerView) {
        this.i = recyclerView;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        v46 v46Var = (v46) xhe0Var;
        Object obj = this.f.get(i);
        View view = v46Var.f40887a;
        view.getClass();
        dyb.c0(view, new qo5(this, obj, (byte) 10));
        view.setOnLongClickListener(new g26(this, obj, (byte) 0));
        v46Var.t(obj);
        obj.getClass();
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = p77.y;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_chip_fg_new, viewGroup, false);
        viewInflate.getClass();
        return new p77(viewInflate, new h8a(this, (byte) 13), new bna(this, (byte) 23));
    }
}
