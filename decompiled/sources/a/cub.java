package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class cub implements noj0, kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q99 f4980a;
    public final vae0 b;
    public final List c;

    public cub(sje sjeVar, i99 i99Var) {
        q99 q99VarC = vtb.c(1, i99Var, null);
        this.f4980a = q99VarC;
        vae0 vae0VarG0 = vtb.g0(xkb.V(q99VarC), sjeVar, new o6m0(Long.MAX_VALUE), 0);
        this.b = vae0VarG0;
        qjj.W(sjeVar, null, null, new igb((Object) this, (yje) null, (byte) 2), 3);
        this.c = vae0VarG0.f37082a.d();
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object objM = this.f4980a.m(yjeVar, obj);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        bub bubVar;
        if (yjeVar instanceof bub) {
            bubVar = (bub) yjeVar;
            int i = bubVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bubVar.k = i - Integer.MIN_VALUE;
            } else {
                bubVar = new bub(this, yjeVar);
            }
        } else {
            bubVar = new bub(this, yjeVar);
        }
        Object obj = bubVar.i;
        wne wneVar = wne.f39444a;
        int i2 = bubVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            bubVar.k = 1;
            if (this.b.f37082a.c(kmqVar, bubVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        csj.b();
        return null;
    }

    @Override // a.noj0
    public final List d() {
        return this.c;
    }
}
