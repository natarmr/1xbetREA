package a;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gxc extends i26 {
    public final String g;
    public final boolean h;
    public final lya i;
    public final LinkedHashMap j;
    public String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxc(String str, boolean z, lya lyaVar) {
        super(3, (List) null);
        str.getClass();
        this.g = str;
        this.h = z;
        this.i = lyaVar;
        this.j = new LinkedHashMap();
        w(true);
        this.k = "";
    }

    @Override // a.i26, a.yge0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void n(v46 v46Var, int i) {
        super.n(v46Var, i);
        Integer num = (Integer) this.j.get(Integer.valueOf(((uvc) ((ArrayList) this.f).get(i)).f36341a));
        int iIntValue = num != null ? num.intValue() : 0;
        uk5 uk5Var = ((axc) v46Var).y;
        if (iIntValue > 0) {
            ((AppBarLayout) uk5Var.c).g(false, false, true);
        }
        ((NestedScrollView) uk5Var.g).setScrollY(iIntValue);
    }

    @Override // a.i26
    public final void G(List list) {
        list.getClass();
        ArrayList arrayList = (ArrayList) this.f;
        arrayList.getClass();
        fxc.b = arrayList;
        fxc.c = list;
        amk amkVarW = cy2.w(fxc.f10303a, true);
        arrayList.clear();
        arrayList.addAll(list);
        amkVarW.b(new fvt0(this));
    }

    @Override // a.yge0
    public final long e(int i) {
        return ((uvc) ((ArrayList) this.f).get(i)).f36341a;
    }

    @Override // a.i26, a.yge0
    public final void u(xhe0 xhe0Var) {
        v46 v46Var = (v46) xhe0Var;
        v46Var.getClass();
        uvc uvcVar = (uvc) ((ArrayList) this.f).get(v46Var.d());
        int scrollY = ((NestedScrollView) ((axc) v46Var).y.g).getScrollY();
        this.j.put(Integer.valueOf(uvcVar.f36341a), Integer.valueOf(scrollY));
    }

    @Override // a.i26
    public final v46 z(View view) {
        view.getClass();
        return new axc(this.k, this.g, this.h, this.i, view);
    }
}
