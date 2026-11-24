package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gyu extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xzp l;
    public final /* synthetic */ sip m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyu(yje yjeVar, xzp xzpVar, sip sipVar, long j, long j2) {
        super(3, yjeVar);
        this.l = xzpVar;
        this.m = sipVar;
        this.n = j;
        this.o = j2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        gyu gyuVar = new gyu((yje) obj3, this.l, this.m, this.n, this.o);
        gyuVar.j = (kmq) obj;
        gyuVar.k = obj2;
        return gyuVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        or30 or30Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            c3c0 c3c0Var = (c3c0) this.k;
            u8u u8uVar = (u8u) this.l.b;
            c3c0Var.getClass();
            ouu ouuVar = (ouu) u8uVar.b;
            jvn jvnVarB = ((uzc) u8uVar.c).b();
            lnf0 lnf0VarD = ((knf0) ouuVar.d).d();
            jo20 jo20Var = new jo20();
            qbt.a(jo20Var, jvnVarB);
            qbt.c(c3c0Var.f3668a, jo20Var);
            qbt.g(lnf0VarD.b, jo20Var);
            qbt.h(jo20Var);
            qbt.j(lnf0VarD.f20342a, jo20Var);
            qbt.k(jo20Var, this.o);
            qbt.l(jo20Var);
            qbt.n(this.n, jo20Var);
            qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
            qbt.p(jo20Var);
            jo20 jo20VarB = jo20Var.b();
            cyu cyuVar = (cyu) ouuVar.c;
            sip sipVar = this.m;
            int iOrdinal = sipVar.ordinal();
            if (iOrdinal == 0) {
                or30Var = (or30) cyuVar.b;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                or30Var = (or30) cyuVar.f5196a;
            }
            vsg0 vsg0VarR = gfx.R(or30Var, kpb.v(sipVar), null, new xg0(ouuVar, sipVar, jo20VarB, null, (byte) 20), 252);
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0VarR, this) == wneVar) {
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
    }
}
