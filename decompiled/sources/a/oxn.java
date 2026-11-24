package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class oxn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ zsf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxn(t33 t33Var, long j, zsf zsfVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = j;
        this.m = zsfVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 2);
            case 3:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 3);
            case 4:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 4);
            default:
                return new oxn(this.k, this.l, this.m, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((oxn) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zsf zsfVar = this.m;
        long j = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    y3d y3dVar = new y3d(j);
                    uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar, uts0VarM0, null, null, this, 12) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    y3d y3dVar2 = new y3d(j);
                    uts0 uts0VarM1 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar2, uts0VarM1, null, null, this, 12) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    y3d y3dVar3 = new y3d(j);
                    uts0 uts0VarM2 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar3, uts0VarM2, null, null, this, 12) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    y3d y3dVar4 = new y3d(j);
                    uts0 uts0VarM3 = ro4.m0(Response.BUSY_EVERYWHERE, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar4, uts0VarM3, null, null, this, 12) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    y3d y3dVar5 = new y3d(j);
                    uts0 uts0VarM4 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar5, uts0VarM4, null, null, this, 12) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    y3d y3dVar6 = new y3d(j);
                    uts0 uts0VarM5 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
                    this.j = true;
                    if (t33.a(this.k, y3dVar6, uts0VarM5, null, null, this, 12) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
