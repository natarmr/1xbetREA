package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fxt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f10327a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, zje zjeVar) {
        ext extVar;
        if (zjeVar instanceof ext) {
            extVar = (ext) zjeVar;
            int i2 = extVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extVar.k = i2 - Integer.MIN_VALUE;
            } else {
                extVar = new ext(this, zjeVar);
            }
        } else {
            extVar = new ext(this, zjeVar);
        }
        Object objD0 = extVar.i;
        wne wneVar = wne.f39444a;
        int i3 = extVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objD0);
            extVar.k = 1;
            z220 z220Var = this.f10327a;
            objD0 = qjj.d0(((mne) z220Var.b).b, new u52((Object) z220Var, i, yjeVar, (byte) 26), extVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return CollectionsKt.D0(l8x.v0((kgb) objD0), 5);
    }
}
