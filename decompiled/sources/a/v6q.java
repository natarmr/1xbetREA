package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7q f36888a;

    public v6q(h7q h7qVar, byte b) {
        h7qVar.getClass();
        switch (b) {
            case 1:
                this.f36888a = h7qVar;
                break;
            case 2:
                this.f36888a = h7qVar;
                break;
            default:
                this.f36888a = h7qVar;
                break;
        }
    }

    public double a(int i, wbq wbqVar) {
        Object next;
        qls0 qls0VarP = pgi0.p(pgi0.h(CollectionsKt.I((List) this.f36888a.c.d.getValue()), new t3t(wbqVar, (byte) 3)), new vls((byte) 27));
        if (i >= 0) {
            Iterator it = qls0VarP.iterator();
            int i2 = 0;
            while (true) {
                pls0 pls0Var = (pls0) it;
                if (!pls0Var.hasNext()) {
                    next = null;
                    break;
                }
                next = pls0Var.next();
                int i3 = i2 + 1;
                if (i == i2) {
                    break;
                }
                i2 = i3;
            }
        } else {
            next = null;
            break;
        }
        quo quoVar = (quo) next;
        if (quoVar != null) {
            return quoVar.f29354a;
        }
        return 0.0d;
    }

    public void b(int i) {
        this.f36888a.c.f28212a.o(null, Integer.valueOf(i));
    }
}
