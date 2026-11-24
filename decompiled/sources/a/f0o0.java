package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class f0o0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8725a;
    public final /* synthetic */ rwk b;
    public final /* synthetic */ xvs c;

    public /* synthetic */ f0o0(rwk rwkVar, xvs xvsVar, byte b) {
        this.f8725a = b;
        this.b = rwkVar;
        this.c = xvsVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        c0o0 c0o0Var;
        i0o0 i0o0Var;
        byte b = this.f8725a;
        xvs xvsVar = this.c;
        rwk rwkVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof c0o0) {
                    c0o0Var = (c0o0) yjeVar;
                    int i = c0o0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0o0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        c0o0Var = new c0o0(this, yjeVar);
                    }
                } else {
                    c0o0Var = new c0o0(this, yjeVar);
                }
                Object obj = c0o0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = c0o0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    e0o0 e0o0Var = new e0o0(kmqVar, xvsVar, (byte) 0);
                    c0o0Var.j = 1;
                    if (rwkVar.c(e0o0Var, c0o0Var) == wneVar) {
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
                if (yjeVar instanceof i0o0) {
                    i0o0Var = (i0o0) yjeVar;
                    int i3 = i0o0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        i0o0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        i0o0Var = new i0o0(this, yjeVar);
                    }
                } else {
                    i0o0Var = new i0o0(this, yjeVar);
                }
                Object obj2 = i0o0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = i0o0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    e0o0 e0o0Var2 = new e0o0(kmqVar, xvsVar, (byte) 1);
                    i0o0Var.j = 1;
                    if (rwkVar.c(e0o0Var2, i0o0Var) == wneVar2) {
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
