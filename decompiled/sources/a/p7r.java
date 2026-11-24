package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p7r extends c2 implements ue80 {
    public final /* synthetic */ s7r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7r(s7r s7rVar) {
        super((byte) 7);
        this.c = s7rVar;
    }

    @Override // a.ue80
    public final void b(Object obj) {
        Object obj2;
        r7r r7rVar;
        ((odd) this.b).N(new bf80(obj));
        s7r s7rVar = this.c;
        c14 c14Var = s7rVar.f;
        do {
            obj2 = c14Var.f3556a;
            r7r r7rVar2 = (r7r) obj2;
            int iOrdinal = r7rVar2.ordinal();
            if (iOrdinal == 0) {
                r7rVar = r7r.b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + s7rVar + "! State is " + r7rVar2 + ' ');
                }
                r7rVar = r7r.d;
            }
        } while (!c14Var.a(obj2, r7rVar));
        Iterator it = s7rVar.h.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
        if (r7rVar == r7r.d) {
            Iterator it2 = s7rVar.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw rw2.h(it2);
            }
        }
    }
}
