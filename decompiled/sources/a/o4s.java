package a;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o4s extends q4 {
    public static final ek5 i = new ek5(24);
    public final g5s f;
    public final o0x g;
    public xdr h;

    public o4s(g5s g5sVar, o0x o0xVar, xdr xdrVar) {
        super(i);
        this.f = g5sVar;
        this.g = o0xVar;
        this.h = xdrVar;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i2) {
        n4s n4sVar = (n4s) xhe0Var;
        u4s u4sVar = (u4s) A(i2);
        s4s s4sVar = n4sVar.u;
        u4sVar.getClass();
        s4sVar.setModel(u4sVar);
        dyb.b0(s4sVar, ymx.INTERVAL_1500, new ec3((Object) this, (Object) u4sVar, i2, (Object) n4sVar, (byte) 7));
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i2, List list) {
        n4s n4sVar = (n4s) xhe0Var;
        s4s s4sVar = n4sVar.u;
        list.getClass();
        if (list.isEmpty()) {
            n(n4sVar, i2);
            return;
        }
        bkq bkqVar = new bkq(lgi0.c(pgi0.p(new sx3(list, (byte) 1), new dcr((byte) 14)), new eoh0((byte) 23)));
        while (bkqVar.hasNext()) {
            Object next = bkqVar.next();
            if (next != null) {
                if (next instanceof y4s) {
                    s4sVar.setLabel(((y4s) next).f42019a);
                } else if (next instanceof z4s) {
                    z4s z4sVar = (z4s) next;
                    s4sVar.a(z4sVar.f43785a, z4sVar.b, z4sVar.c, z4sVar.d, z4sVar.e, z4sVar.f, z4sVar.g);
                } else if (next instanceof x4s) {
                    s4sVar.setType(((x4s) next).f40282a);
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        context.getClass();
        return new n4s(new s4s(context, this.f, this.g));
    }
}
