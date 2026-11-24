package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i26 extends yge0 {
    public final /* synthetic */ byte d;
    public Object e;
    public Object f;

    public i26(List list, Function1 function1) {
        this.d = (byte) 0;
        list.getClass();
        this.e = function1;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(list);
    }

    public int A(int i) {
        return R.layout.holder_cms_news_banner;
    }

    public void B(v46 v46Var, int i) {
        Object obj = ((ArrayList) this.f).get(i);
        View view = v46Var.f40887a;
        view.getClass();
        dyb.c0(view, new qo5(this, obj, (byte) 11));
        v46Var.t(obj);
        obj.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public void C(f1a0 f1a0Var, int i) {
        boolean z;
        final my90 my90Var = ((PlayerControlView) this.f).Q1;
        if (my90Var == null) {
            return;
        }
        if (i == 0) {
            D(f1a0Var);
            return;
        }
        final g1a0 g1a0Var = (g1a0) ((List) this.e).get(i - 1);
        final ccs0 ccs0Var = g1a0Var.f10503a.b;
        if (((ulo) my90Var).v().w.get(ccs0Var) != null) {
            z = g1a0Var.f10503a.e[g1a0Var.b];
        }
        f1a0Var.u.setText(g1a0Var.c);
        f1a0Var.v.setVisibility(z ? 0 : 4);
        f1a0Var.f40887a.setOnClickListener(new View.OnClickListener() { // from class: a.h1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ulo uloVar = (ulo) my90Var;
                if (uloVar.w(29)) {
                    nyj nyjVar = (nyj) uloVar.v();
                    nyjVar.getClass();
                    myj myjVar = new myj(nyjVar);
                    g1a0 g1a0Var2 = g1a0Var;
                    myjVar.e(new pcs0(ccs0Var, b4x.t(Integer.valueOf(g1a0Var2.b))));
                    myjVar.i(g1a0Var2.f10503a.b.c, false);
                    uloVar.R(myjVar.a());
                    String str = g1a0Var2.c;
                    i26 i26Var = this.f12274a;
                    i26Var.F(str);
                    ((PlayerControlView) i26Var.f).r.dismiss();
                }
            }
        });
    }

    public abstract void D(f1a0 f1a0Var);

    public v46 E(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(A(i), viewGroup, false);
        viewInflate.getClass();
        return z(viewInflate);
    }

    public abstract void F(String str);

    public void G(List list) {
        list.getClass();
        ArrayList arrayList = (ArrayList) this.f;
        arrayList.clear();
        arrayList.addAll(list);
        g();
    }

    @Override // a.yge0
    public final int d() {
        switch (this.d) {
            case 0:
                return ((ArrayList) this.f).size();
            case 1:
                List list = (List) this.f;
                if (list == null) {
                    return 0;
                }
                return list.size();
            default:
                if (((List) this.e).isEmpty()) {
                    return 0;
                }
                return ((List) this.e).size() + 1;
        }
    }

    @Override // a.yge0
    public int f(int i) {
        switch (this.d) {
            case 1:
                return ((dp) this.e).d(i, (List) this.f);
            default:
                return super.f(i);
        }
    }

    @Override // a.yge0
    public void n(xhe0 xhe0Var, int i) {
        switch (this.d) {
            case 0:
                B((v46) xhe0Var, i);
                break;
            case 1:
                ((dp) this.e).e((List) this.f, i, xhe0Var, null);
                break;
            default:
                C((f1a0) xhe0Var, i);
                break;
        }
    }

    @Override // a.yge0
    public void o(xhe0 xhe0Var, int i, List list) {
        switch (this.d) {
            case 1:
                ((dp) this.e).e((List) this.f, i, xhe0Var, list);
                break;
            default:
                super.o(xhe0Var, i, list);
                break;
        }
    }

    @Override // a.yge0
    public xhe0 p(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                return E(viewGroup, i);
            case 1:
                return ((dp) this.e).f(viewGroup, i);
            default:
                return new f1a0(LayoutInflater.from(((PlayerControlView) this.f).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Override // a.yge0
    public boolean r(xhe0 xhe0Var) {
        switch (this.d) {
            case 1:
                return ((dp) this.e).g(xhe0Var);
            default:
                return super.r(xhe0Var);
        }
    }

    @Override // a.yge0
    public void s(xhe0 xhe0Var) {
        switch (this.d) {
            case 1:
                ((dp) this.e).h(xhe0Var);
                break;
        }
    }

    @Override // a.yge0
    public void t(xhe0 xhe0Var) {
        switch (this.d) {
            case 1:
                ((dp) this.e).i(xhe0Var);
                break;
        }
    }

    @Override // a.yge0
    public void u(xhe0 xhe0Var) {
        switch (this.d) {
            case 1:
                ((dp) this.e).j(xhe0Var);
                break;
        }
    }

    public v46 z(View view) {
        view.getClass();
        return new gif(view, (byte) 0);
    }

    public i26() {
        this.d = (byte) 1;
        this.e = new dp();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i26(int i, List list) {
        this((i & 1) != 0 ? iun.f15405a : list, new h26((byte) 2));
        this.d = (byte) 0;
    }

    public i26(PlayerControlView playerControlView) {
        this.d = (byte) 2;
        this.f = playerControlView;
        this.e = new ArrayList();
    }
}
