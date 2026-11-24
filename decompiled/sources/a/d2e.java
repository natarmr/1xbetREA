package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class d2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final foi0 f5352a;
    public final fq b;

    public d2e(foi0 foi0Var, fq fqVar) {
        foi0Var.getClass();
        fqVar.getClass();
        this.f5352a = foi0Var;
        this.b = fqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        b2e b2eVar;
        if (zjeVar instanceof b2e) {
            b2eVar = (b2e) zjeVar;
            int i = b2eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2eVar.k = i - Integer.MIN_VALUE;
            } else {
                b2eVar = new b2e(this, zjeVar);
            }
        } else {
            b2eVar = new b2e(this, zjeVar);
        }
        Object obj = b2eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = b2eVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            b2eVar.k = 1;
            if (this.b.f(ky5.f19091a, b2eVar) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        c2e c2eVar;
        if (zjeVar instanceof c2e) {
            c2eVar = (c2e) zjeVar;
            int i = c2eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2eVar.k = i - Integer.MIN_VALUE;
            } else {
                c2eVar = new c2e(this, zjeVar);
            }
        } else {
            c2eVar = new c2e(this, zjeVar);
        }
        Object obj = c2eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = c2eVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            c2eVar.k = 1;
            if (this.b.f(jy5.f17343a, c2eVar) == wneVar) {
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
