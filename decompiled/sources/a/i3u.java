package a;

import java.io.Serializable;
import java.util.List;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class i3u implements g3u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final img f14114a;
    public final sjl0 b;

    public i3u(img imgVar, sjl0 sjl0Var) {
        sjl0Var.getClass();
        this.f14114a = imgVar;
        this.b = sjl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(int i, zje zjeVar) {
        h3u h3uVar;
        List list;
        if (zjeVar instanceof h3u) {
            h3uVar = (h3u) zjeVar;
            int i2 = h3uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3uVar.m = i2 - Integer.MIN_VALUE;
            } else {
                h3uVar = new h3u(this, zjeVar);
            }
        } else {
            h3uVar = new h3u(this, zjeVar);
        }
        Object objB = h3uVar.k;
        wne wneVar = wne.f39444a;
        int i3 = h3uVar.m;
        if (i3 == 0) {
            z1x.P(objB);
            h3uVar.i = i;
            h3uVar.m = 1;
            objB = this.b.b(h3uVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            i = h3uVar.i;
            z1x.P(objB);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = h3uVar.j;
            z1x.P(objB);
        }
        return q8a.K((List) objB, list);
        List list2 = (List) objB;
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        h3uVar.j = list2;
        h3uVar.i = i;
        h3uVar.m = 2;
        Object objA = this.f14114a.a(real, i, true, h3uVar);
        if (objA != wneVar) {
            objB = objA;
            list = list2;
            return q8a.K((List) objB, list);
        }
        return wneVar;
    }
}
