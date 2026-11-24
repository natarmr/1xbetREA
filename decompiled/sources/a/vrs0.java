package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class vrs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq f37918a;
    public final r8u b;
    public final qpt c;
    public final fqx d;
    public final wox e;

    public vrs0(fq fqVar, qpt qptVar, r8u r8uVar, wox woxVar, fqx fqxVar) {
        fqVar.getClass();
        r8uVar.getClass();
        qptVar.getClass();
        fqxVar.getClass();
        woxVar.getClass();
        this.f37918a = fqVar;
        this.b = r8uVar;
        this.c = qptVar;
        this.d = fqxVar;
        this.e = woxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        urs0 urs0Var;
        if (zjeVar instanceof urs0) {
            urs0Var = (urs0) zjeVar;
            int i = urs0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                urs0Var.k = i - Integer.MIN_VALUE;
            } else {
                urs0Var = new urs0(this, zjeVar);
            }
        } else {
            urs0Var = new urs0(this, zjeVar);
        }
        Object obj = urs0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = urs0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.b.a();
            boolean z = this.c.a() != null;
            boolean zA2 = this.d.a();
            boolean z2 = (zA2 && this.e.f39519a.f26724a.x) || !zA2;
            if (!zA || !z || z2) {
                return Unit.f46060a;
            }
            urs0Var.k = 1;
            if (this.f37918a.f(ny5.f24313a, urs0Var) == wneVar) {
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
