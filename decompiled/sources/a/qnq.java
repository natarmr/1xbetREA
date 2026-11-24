package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class qnq implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gmq f29042a;
    public final /* synthetic */ byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public qnq(gmq gmqVar, int i) {
        this.f29042a = gmqVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        pnq pnqVar;
        Object obj;
        if (yjeVar instanceof pnq) {
            pnqVar = (pnq) yjeVar;
            int i = pnqVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnqVar.j = i - Integer.MIN_VALUE;
            } else {
                pnqVar = new pnq(this, yjeVar);
            }
        } else {
            pnqVar = new pnq(this, yjeVar);
        }
        Object obj2 = pnqVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pnqVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            Object obj3 = new Object();
            kie0 kie0Var = new kie0();
            try {
                gmq gmqVar = this.f29042a;
                snq snqVar = new snq(kie0Var, this.b, kmqVar, obj3);
                pnqVar.l = obj3;
                pnqVar.j = 1;
                if (gmqVar.c(snqVar, pnqVar) == wneVar) {
                    return wneVar;
                }
            } catch (t e) {
                e = e;
                obj = obj3;
                if (e.f33092a != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = pnqVar.l;
            try {
                z1x.P(obj2);
            } catch (t e2) {
                e = e2;
                if (e.f33092a != obj) {
                    throw e;
                }
            }
        }
        return Unit.f46060a;
    }
}
