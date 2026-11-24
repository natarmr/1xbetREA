package a;

import java.io.Serializable;
import java.util.ArrayList;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class img {
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1d f15024a;
    public final laj b;
    public final knf0 c;

    static {
        uen uenVar = wen.b;
        d = ibc.v0(30, bfn.SECONDS);
    }

    public img(a1d a1dVar, laj lajVar, knf0 knf0Var) {
        knf0Var.getClass();
        this.f15024a = a1dVar;
        this.b = lajVar;
        this.c = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable a(CyberGamesPage cyberGamesPage, int i, boolean z, zje zjeVar) {
        hmg hmgVar;
        if (zjeVar instanceof hmg) {
            hmgVar = (hmg) zjeVar;
            int i2 = hmgVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hmgVar.k = i2 - Integer.MIN_VALUE;
            } else {
                hmgVar = new hmg(this, zjeVar);
            }
        } else {
            hmgVar = new hmg(this, zjeVar);
        }
        hmg hmgVar2 = hmgVar;
        Object objD = hmgVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = hmgVar2.k;
        if (i3 == 0) {
            z1x.P(objD);
            byte b = cyberGamesPage.f46556a;
            knf0 knf0Var = this.c;
            knf0Var.getClass();
            String strC = knf0Var.c();
            hmgVar2.k = 1;
            objD = this.f15024a.d(b, 1, strC, i, 1357, z, 22, hmgVar2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        Iterable<fmg> iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (fmg fmgVar : iterable) {
            fmgVar.getClass();
            Long l = fmgVar.f9779a;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = fmgVar.b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new cmg(jLongValue, str));
        }
        return arrayList;
    }
}
