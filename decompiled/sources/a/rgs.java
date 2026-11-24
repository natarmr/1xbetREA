package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class rgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq f30452a;
    public final fqx b;
    public final wox c;
    public final r8u d;
    public final qpt e;

    public rgs(fq fqVar, qpt qptVar, r8u r8uVar, wox woxVar, fqx fqxVar) {
        fqVar.getClass();
        fqxVar.getClass();
        woxVar.getClass();
        r8uVar.getClass();
        qptVar.getClass();
        this.f30452a = fqVar;
        this.b = fqxVar;
        this.c = woxVar;
        this.d = r8uVar;
        this.e = qptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        qgs qgsVar;
        if (zjeVar instanceof qgs) {
            qgsVar = (qgs) zjeVar;
            int i = qgsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgsVar.k = i - Integer.MIN_VALUE;
            } else {
                qgsVar = new qgs(this, zjeVar);
            }
        } else {
            qgsVar = new qgs(this, zjeVar);
        }
        Object obj = qgsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = qgsVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.b.a();
            boolean z = (zA && this.c.f39519a.f26724a.x) || !zA;
            boolean zA2 = this.d.a();
            boolean z2 = this.e.a() != null;
            if (!z || !zA2 || !z2) {
                return Unit.f46060a;
            }
            qgsVar.k = 1;
            if (this.f30452a.f(mle.f21985a, qgsVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
