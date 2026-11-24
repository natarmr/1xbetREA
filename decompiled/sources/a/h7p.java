package a;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes4.dex */
public final class h7p extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final ctf0 o;
    public final a7q p;
    public final wep q;

    /* JADX WARN: Illegal instructions before constructor call */
    public h7p(ctf0 ctf0Var, mne mneVar, a7q a7qVar, wep wepVar) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new r4p((byte) 3), cvm0.p(rwjVar, rwjVar), new bcn(ctf0Var, (byte) 8), (yzn0) null);
        this.o = ctf0Var;
        this.p = a7qVar;
        this.q = wepVar;
        i3t0.K(this, null, null, new pn(this, null, (byte) 28), 3);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(o6p o6pVar) {
        Parcelable xGames;
        o6pVar.getClass();
        if (o6pVar instanceof n6p) {
            H(new f5o(((n6p) o6pVar).f23006a, (byte) 15));
            return;
        }
        if (!o6pVar.equals(m6p.f21283a)) {
            if (o6pVar.equals(l6p.f19518a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        List<s9p> listL0 = CollectionsKt.L0(((d7p) D()).b);
        if (((d7p) D()).b.size() == ((d7p) D()).f5604a.size() && ((d7p) D()).f5604a.size() > 1) {
            List list = ((d7p) D()).f5604a;
            String strA = this.o.b.a(R.string.select_all, Arrays.copyOf(new Object[0], 0));
            Iterator it = list.iterator();
            int iB = 0;
            while (it.hasNext()) {
                iB += ((s9p) it.next()).b();
            }
            listL0 = kotlin.collections.a.c(new l9p(strA, iB));
        }
        ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
        for (s9p s9pVar : listL0) {
            s9pVar.getClass();
            if (s9pVar instanceof k9p) {
                k9p k9pVar = (k9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Aggregator(k9pVar.b, k9pVar.f17925a, "", false);
            } else if (s9pVar instanceof l9p) {
                l9p l9pVar = (l9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.All(l9pVar.f19666a, l9pVar.b, false);
            } else if (s9pVar instanceof m9p) {
                m9p m9pVar = (m9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Champs(m9pVar.b, m9pVar.f21420a, "", false);
            } else if (s9pVar instanceof n9p) {
                n9p n9pVar = (n9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Line(n9pVar.f23152a, n9pVar.b, false);
            } else if (s9pVar instanceof o9p) {
                o9p o9pVar = (o9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Live(o9pVar.f24890a, o9pVar.b, false);
            } else if (s9pVar instanceof p9p) {
                p9p p9pVar = (p9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Results(p9pVar.f26618a, p9pVar.b, false);
            } else if (s9pVar instanceof q9p) {
                q9p q9pVar = (q9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.Teams(q9pVar.f28361a, q9pVar.b, false);
            } else if (!(s9pVar instanceof r9p)) {
                t9f.b();
                return;
            } else {
                r9p r9pVar = (r9p) s9pVar;
                xGames = new FavoriteGroupHeaderUiItem.XGames(r9pVar.b, r9pVar.f30095a, "", false);
            }
            arrayList.add(xGames);
        }
        G(new y6p(arrayList));
    }
}
