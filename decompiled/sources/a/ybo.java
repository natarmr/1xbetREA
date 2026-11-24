package a;

import java.util.Iterator;
import java.util.List;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ybo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f42348a = q3d.j(1L, 3L);

    public static final List a(long j, d0t d0tVar) {
        Object next;
        Iterator it = d0tVar.K.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BetGroupZip) next).b != j);
        BetGroupZip betGroupZip = (BetGroupZip) next;
        if (betGroupZip != null) {
            return betGroupZip.f;
        }
        return null;
    }
}
