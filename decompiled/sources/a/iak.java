package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class iak extends w46 {
    public final i1w0 b;
    public final sqt c;
    public final yfu d;
    public final nou e;
    public final m0u f;
    public final f5a g;
    public final ctf0 h;
    public p7k i;
    public p7k j;
    public final ArrayList k;
    public final ra10 l;
    public final ra10 m;
    public final p7m0 n;
    public final p7m0 o;
    public final ol60 p;

    public iak(i1w0 i1w0Var, sqt sqtVar, yfu yfuVar, nou nouVar, m0u m0uVar, f5a f5aVar, ctf0 ctf0Var, sa10 sa10Var) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = sqtVar;
        this.d = yfuVar;
        this.e = nouVar;
        this.f = m0uVar;
        this.g = f5aVar;
        this.h = ctf0Var;
        p7k p7kVar = p7k.UNKNOWN;
        this.i = p7kVar;
        this.j = p7kVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        pb10 pb10Var = pb10.g;
        this.l = sa10.b(sa10Var, pb10Var, R.string.data_is_missing, R.string.refresh_data, new wej(0, this, iak.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 4), 16);
        this.m = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new wej(0, this, iak.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 5), 16);
        this.n = q7m0.a(gak.f10970a);
        this.o = q7m0.a(new z9k(CollectionsKt.L0(arrayList), false));
        this.p = new ol60(1, i99.b);
        w();
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, gak.f10970a));
        sac.V(jiu0.a(this), new y9k(this, (byte) 1), null, null, new xsj((w46) this, (yje) null, (byte) 16), 14);
    }

    public final void x(dak dakVar) {
        sac.V(jiu0.a(this), new x2i((byte) 27), null, null, new e9g(this, dakVar, null, (byte) 23), 14);
    }
}
