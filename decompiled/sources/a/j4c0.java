package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class j4c0 extends q4 {
    public final m0x f;
    public Function2 g;

    public j4c0(m0x m0xVar) {
        super(ek5.f);
        this.f = m0xVar;
        this.g = null;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        hvw hvwVar = (hvw) A(i);
        m4c0 m4c0Var = ((i4c0) xhe0Var).u;
        View view = m4c0Var.f;
        LoadableImageView loadableImageView = m4c0Var.d;
        hvwVar.getClass();
        m0x m0xVar = this.f;
        m0xVar.getClass();
        boolean z = hvwVar instanceof o4c0;
        if (z) {
            o4c0 o4c0Var = (o4c0) hvwVar;
            loadableImageView.a(o4c0Var.c, m0xVar, new zga0((Object) o4c0Var.d, (Object) m4c0Var, (byte) 26), o4c0Var.e);
            m4c0Var.setLabel$impl(o4c0Var.b);
            view.setVisibility(8);
        }
        boolean z2 = hvwVar instanceof bqj0;
        view.setVisibility(8);
        byte b = 0;
        loadableImageView.setVisibility(z2 ? 8 : 0);
        m4c0Var.e.setVisibility(z2 ? 8 : 0);
        m4c0Var.c.setVisibility(z2 ? 0 : 8);
        if (z2) {
            x0x.s(m4c0Var);
        } else {
            x0x.O(m4c0Var);
        }
        if (z) {
            m4c0Var.setOnClickListener(new h4c0(this, hvwVar, i, b));
        }
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        i4c0 i4c0Var = (i4c0) xhe0Var;
        m4c0 m4c0Var = i4c0Var.u;
        list.getClass();
        if (list.isEmpty()) {
            n(i4c0Var, i);
            return;
        }
        bkq bkqVar = new bkq(lgi0.c(pgi0.p(new sx3(list, (byte) 1), new wyb0((byte) 7)), new eoh0((byte) 23)));
        while (bkqVar.hasNext()) {
            Object next = bkqVar.next();
            if (next != null) {
                if (next instanceof q4c0) {
                    m4c0Var.setLabel$impl(((q4c0) next).f28091a);
                } else if (next instanceof r4c0) {
                    r4c0 r4c0Var = (r4c0) next;
                    n0x n0xVar = r4c0Var.f29829a;
                    Function2 function2 = r4c0Var.b;
                    Function1 function1 = r4c0Var.c;
                    m0x m0xVar = this.f;
                    m0xVar.getClass();
                    m4c0Var.d.a(n0xVar, m0xVar, new zga0((Object) function2, (Object) m4c0Var, (byte) 26), function1);
                } else if (next instanceof p4c0) {
                    m4c0Var.f.setVisibility(8);
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        context.getClass();
        return new i4c0(new m4c0(context));
    }
}
