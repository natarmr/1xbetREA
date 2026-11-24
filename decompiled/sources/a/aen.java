package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class aen implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f737a;
    public final /* synthetic */ vae0 b;

    public /* synthetic */ aen(vae0 vae0Var, byte b) {
        this.f737a = b;
        this.b = vae0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ydn ydnVar;
        s6v s6vVar;
        byte b = this.f737a;
        vae0 vae0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ydn) {
                    ydnVar = (ydn) yjeVar;
                    int i = ydnVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ydnVar.j = i - Integer.MIN_VALUE;
                    } else {
                        ydnVar = new ydn(this, yjeVar);
                    }
                } else {
                    ydnVar = new ydn(this, yjeVar);
                }
                Object obj = ydnVar.i;
                wne wneVar = wne.f39444a;
                int i2 = ydnVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    k0f k0fVar = new k0f(kmqVar, (byte) 19);
                    ydnVar.j = 1;
                    if (vae0Var.f37082a.c(k0fVar, ydnVar) == wneVar) {
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
            default:
                if (yjeVar instanceof s6v) {
                    s6vVar = (s6v) yjeVar;
                    int i3 = s6vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s6vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        s6vVar = new s6v(this, yjeVar);
                    }
                } else {
                    s6vVar = new s6v(this, yjeVar);
                }
                Object obj2 = s6vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = s6vVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    b4v b4vVar = new b4v(kmqVar, (byte) 4);
                    s6vVar.j = 1;
                    if (vae0Var.f37082a.c(b4vVar, s6vVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
