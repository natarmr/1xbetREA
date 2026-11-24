package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ujp0 extends w46 {
    public final p7m0 b;

    public ujp0(List list) {
        list.getClass();
        p7m0 p7m0VarA = q7m0.a(mjp0.f21907a);
        this.b = p7m0VarA;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            bop0.b.getClass();
            int iOrdinal = m6m0.j(iIntValue).ordinal();
            if (iOrdinal == 0) {
                arrayList.add(new xt(bop0.FIRST, R.string.add_to_first_team, R.drawable.ic_first_team));
            } else if (iOrdinal == 1) {
                arrayList.add(new xt(bop0.SECOND, R.string.add_to_second_team, R.drawable.ic_second_team));
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    throw null;
                }
                arrayList.add(lif0.f20102a);
            }
        }
        p7m0VarA.o(null, new ljp0(arrayList));
    }
}
