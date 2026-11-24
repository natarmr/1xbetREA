package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class plg0 extends i26 {
    public final dke0 g;

    public plg0(dke0 dke0Var) {
        super(3, (List) null);
        this.g = dke0Var;
    }

    @Override // a.i26
    public final int A(int i) {
        if (i != 1) {
            return i != 2 ? R.layout.view_text_by_holder : R.layout.view_rule_ref;
        }
        return R.layout.view_rule_image;
    }

    @Override // a.i26, a.yge0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final v46 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(A(i), viewGroup, false);
        viewInflate.getClass();
        dke0 dke0Var = this.g;
        if (i != 1) {
            return i != 2 ? new gif(viewInflate, (byte) 3) : new v70(viewInflate, dke0Var, (byte) 7);
        }
        return new v70(viewInflate, dke0Var, (byte) 5);
    }

    @Override // a.yge0
    public final long e(int i) {
        return i;
    }

    @Override // a.i26, a.yge0
    public final int f(int i) {
        ykg0 ykg0Var = (ykg0) ((ArrayList) this.f).get(i);
        ysw yswVar = ykg0Var.c;
        if (yswVar.c.length() != 0 || yswVar.d.length() <= 0) {
            return (yswVar.c.length() <= 0 || ykg0Var.e == clg0.BUTTON) ? 0 : 2;
        }
        return 1;
    }

    @Override // a.i26
    public final v46 z(View view) {
        view.getClass();
        throw new ss3((byte) 29);
    }
}
