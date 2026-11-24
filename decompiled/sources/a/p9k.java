package a;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class p9k extends w46 {
    public final i1w0 b;
    public final tqt c;
    public final yfu d;
    public final nou e;
    public final m0u f;
    public final f5a g;
    public final ctf0 h;
    public final int i;
    public n8k j;
    public n8k k;
    public final ArrayList l;
    public final ra10 m;
    public final ra10 n;
    public final p7m0 o;
    public final p7m0 p;
    public final ol60 q;

    public p9k(i1w0 i1w0Var, tqt tqtVar, yfu yfuVar, nou nouVar, m0u m0uVar, f5a f5aVar, ctf0 ctf0Var, int i, sa10 sa10Var) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = tqtVar;
        this.d = yfuVar;
        this.e = nouVar;
        this.f = m0uVar;
        this.g = f5aVar;
        this.h = ctf0Var;
        this.i = i;
        n8k n8kVar = n8k.UNKNOWN;
        this.j = n8kVar;
        this.k = n8kVar;
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        pb10 pb10Var = pb10.g;
        this.m = sa10.b(sa10Var, pb10Var, R.string.data_is_missing, R.string.refresh_data, new wej(0, this, p9k.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 2), 16);
        this.n = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new wej(0, this, p9k.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 3), 16);
        this.o = q7m0.a(n9k.f23144a);
        this.p = q7m0.a(new g9k(CollectionsKt.L0(arrayList), false));
        this.q = new ol60(1, i99.b);
        w();
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.o;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, n9k.f23144a));
        sac.V(jiu0.a(this), new f9k(this, (byte) 1), null, null, new xsj((w46) this, (yje) null, (byte) 12), 14);
    }

    public final void x() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void y(k9k k9kVar) {
        sac.V(jiu0.a(this), new x2i((byte) 26), null, null, new e9g(this, k9kVar, null, (byte) 22), 14);
    }
}
