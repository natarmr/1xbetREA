package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class wou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nou f39514a;
    public final pru b;

    public wou(nou nouVar, pru pruVar) {
        this.f39514a = nouVar;
        this.b = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        vou vouVar;
        int i;
        boolean z;
        if (zjeVar instanceof vou) {
            vouVar = (vou) zjeVar;
            int i2 = vouVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vouVar.l = i2 - Integer.MIN_VALUE;
            } else {
                vouVar = new vou(this, zjeVar);
            }
        } else {
            vouVar = new vou(this, zjeVar);
        }
        Object obj = vouVar.j;
        wne wneVar = wne.f39444a;
        int i3 = vouVar.l;
        pru pruVar = this.b;
        if (i3 == 0) {
            z1x.P(obj);
            boolean z2 = pruVar.a().l.c;
            if (z2) {
                vouVar.i = z2;
                vouVar.l = 1;
                Serializable serializableA = this.f39514a.a(tl5.c, vouVar);
                if (serializableA == wneVar) {
                    return wneVar;
                }
                obj = serializableA;
                z = z2;
            } else {
                i = 0;
                z = z2;
            }
            return new etc0(z, pruVar.a().V0, i, soc0.f32539a);
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = vouVar.i;
        z1x.P(obj);
        i = ((ql5) obj).h;
        return new etc0(z, pruVar.a().V0, i, soc0.f32539a);
    }
}
