package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zgq0 extends i26 {
    public final ygq0 g;
    public final w6q0 h;
    public final cym0 i;
    public final cym0 j;
    public final Pair k;
    public final cym0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgq0(ygq0 ygq0Var, List list, w6q0 w6q0Var, cym0 cym0Var, cym0 cym0Var2, Pair pair, cym0 cym0Var3) {
        super(2, list);
        ygq0Var.getClass();
        list.getClass();
        this.g = ygq0Var;
        this.h = w6q0Var;
        this.i = cym0Var;
        this.j = cym0Var2;
        this.k = pair;
        this.l = cym0Var3;
    }

    @Override // a.i26
    public final int A(int i) {
        return i == 1 ? R.layout.cybergame_item_custom_time_filter_dialog : R.layout.cybergame_item_time_filter_dialog;
    }

    @Override // a.i26, a.yge0
    /* JADX INFO: renamed from: E */
    public final v46 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(A(i), viewGroup, false);
        viewInflate.getClass();
        if (i != 1) {
            return new zr50(viewInflate, this.g, new nop0(this, (byte) 18));
        }
        return new rhq0(viewInflate, this.g, this.i, this.j, this.k, this.l);
    }

    @Override // a.i26, a.yge0
    public final int f(int i) {
        return ((ArrayList) this.f).get(i) == ygq0.CUSTOM_DATE ? 1 : 0;
    }

    @Override // a.i26
    public final v46 z(View view) {
        view.getClass();
        return new zr50(view, this.g, this.h);
    }
}
