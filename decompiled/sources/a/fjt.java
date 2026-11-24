package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fjt extends ajt implements e540 {
    public erp b = erp.c;
    public boolean c;

    public final void f(gjt gjtVar) {
        oak0 oak0Var;
        if (!this.c) {
            this.b = this.b.clone();
            this.c = true;
        }
        erp erpVar = this.b;
        erp erpVar2 = gjtVar.f11417a;
        erpVar.getClass();
        int i = 0;
        while (true) {
            int size = erpVar2.f8293a.b.size();
            oak0Var = erpVar2.f8293a;
            if (i >= size) {
                break;
            }
            erpVar.g((Map.Entry) oak0Var.b.get(i));
            i++;
        }
        Iterator it = oak0Var.c().iterator();
        while (it.hasNext()) {
            erpVar.g((Map.Entry) it.next());
        }
    }
}
