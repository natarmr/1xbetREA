package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class o7s0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24802a;
    public final /* synthetic */ xae0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ o7s0(xae0 xae0Var, long j, byte b) {
        this.f24802a = b;
        this.b = xae0Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        m7s0 m7s0Var;
        p9s0 p9s0Var;
        byte b = this.f24802a;
        long j = this.c;
        xae0 xae0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof m7s0) {
                    m7s0Var = (m7s0) yjeVar;
                    int i = m7s0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        m7s0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        m7s0Var = new m7s0(this, yjeVar);
                    }
                } else {
                    m7s0Var = new m7s0(this, yjeVar);
                }
                Object obj = m7s0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = m7s0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    s7h s7hVar = new s7h(kmqVar, j, (byte) 11);
                    m7s0Var.j = 1;
                    if (xae0Var.f40549a.c(s7hVar, m7s0Var) == wneVar) {
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
                if (yjeVar instanceof p9s0) {
                    p9s0Var = (p9s0) yjeVar;
                    int i3 = p9s0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p9s0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        p9s0Var = new p9s0(this, yjeVar);
                    }
                } else {
                    p9s0Var = new p9s0(this, yjeVar);
                }
                Object obj2 = p9s0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = p9s0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    s7h s7hVar2 = new s7h(kmqVar, j, (byte) 12);
                    p9s0Var.j = 1;
                    if (xae0Var.f40549a.c(s7hVar2, p9s0Var) == wneVar2) {
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
