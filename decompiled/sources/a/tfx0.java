package a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tfx0 extends vgx0 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfx0(String str, Class cls, boolean z, boolean z2, byte b) {
        super(str, cls, z, z2);
        this.f = b;
    }

    @Override // a.vgx0
    public void a(Iterator it, whx0 whx0Var) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f37405a;
                    if (!zHasNext) {
                        whx0Var.a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        whx0Var.a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, whx0Var);
                break;
        }
    }

    @Override // a.vgx0
    public void b(Object obj, whx0 whx0Var) {
        switch (this.f) {
            case 1:
                rcw0 rcw0Var = (rcw0) obj;
                if (rcw0Var != null) {
                    pcw0 pcw0Var = rcw0Var.f30261a.c;
                    pcw0Var.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < pcw0Var.c() - pcw0Var.b())) {
                            break;
                        } else if (i >= pcw0Var.c() - pcw0Var.b()) {
                            itt0.a();
                            break;
                        } else {
                            qcw0 qcw0Var = pcw0Var.b;
                            int iB = pcw0Var.b() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) qcw0Var.f28505a[iB];
                            if (((Set) entry.getValue()).isEmpty()) {
                                whx0Var.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    whx0Var.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, whx0Var);
                break;
        }
    }
}
