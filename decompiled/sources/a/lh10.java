package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class lh10 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f20033a;
    public final /* synthetic */ lwf b;
    public final /* synthetic */ nie0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ imm i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ ugd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh10(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, float f, float f2, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, imm immVar, Function1 function1, cms0 cms0Var, cms0 cms0Var2, String str, String str2, ugd ugdVar) {
        super(3);
        this.f20033a = pz40Var;
        this.b = lwfVar;
        this.c = nie0Var;
        this.d = f;
        this.e = f2;
        this.f = l7m0Var;
        this.g = l7m0Var2;
        this.h = l7m0Var3;
        this.i = immVar;
        this.j = function1;
        this.k = cms0Var;
        this.l = cms0Var2;
        this.m = str;
        this.n = str2;
        this.o = ugdVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        Unit unit = Unit.f46060a;
        this.f20033a.setValue(unit);
        this.b.getClass();
        nie0 nie0Var = this.c;
        if (nie0Var.f23583a == cmd.f4598a) {
            nie0Var.f23583a = cmd.b;
        }
        fetVar.e0(-593112342);
        n0q n0qVar = o7k0.c;
        mm40 mm40VarK0 = mrv.k0(n0qVar, "BASE_CONTENT_ID");
        byte b = 0;
        tj30 tj30VarC = zq8.c(gqw0.b, false);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
        mkd.c0.getClass();
        fetVar.i0();
        boolean z = fetVar.S;
        pcy pcyVar = e7z.u1;
        if (z) {
            fetVar.l(pcyVar);
        } else {
            fetVar.r0();
        }
        shd shdVar = gqw0.x;
        jpm0.o(fetVar, tj30VarC, shdVar);
        shd shdVar2 = gqw0.w;
        jpm0.o(fetVar, bh90VarM, shdVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        shd shdVar3 = gqw0.y;
        jpm0.o(fetVar, numValueOf, shdVar3);
        jpm0.n(fetVar);
        shd shdVar4 = gqw0.v;
        jpm0.o(fetVar, mm40VarC0, shdVar4);
        l7m0 l7m0Var = this.f;
        boolean zG = fetVar.g(l7m0Var);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = new eb3(l7m0Var, (byte) 3);
            fetVar.o0(objP);
        }
        mm40 mm40VarT = i4w0.T(n0qVar, (Function1) objP);
        zcl zclVar = qmk.i;
        zcl zclVar2 = qmk.f28987a;
        mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar, zclVar, mm40VarT);
        l7m0 l7m0Var2 = this.g;
        boolean zG2 = fetVar.g(l7m0Var2);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == cl5Var) {
            objP2 = new eb3(l7m0Var2, (byte) 4);
            fetVar.o0(objP2);
        }
        zq8.a(0, fetVar, rq8.K(mm40VarE, (Function1) objP2));
        jm40 jm40Var = jm40.b;
        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
        l7m0 l7m0Var3 = this.h;
        boolean zG3 = fetVar.g(l7m0Var3);
        Object objP3 = fetVar.P();
        byte b2 = 6;
        if (zG3 || objP3 == cl5Var) {
            objP3 = new eb3(l7m0Var3, b2);
            fetVar.o0(objP3);
        }
        mm40 mm40VarX = yyw.X(rq8.L(mm40VarD, (Function1) objP3), null, fetVar, 1);
        Function1 function1 = this.j;
        l7m0 l7m0Var4 = this.k;
        l7m0 l7m0Var5 = this.l;
        hlm.c(mm40VarX, this.i, null, null, null, null, null, null, null, u1c.M(-906219299, new jh10(function1, l7m0Var4, l7m0Var5, b), fetVar), u1c.M(1361563471, new kh10(this.m, l7m0Var2, l7m0Var5, this.n), fetVar), u1c.M(-2076753682, new jh10(function1, l7m0Var4, l7m0Var5, (byte) 1), fetVar), fetVar, 805309440, 54, 500);
        fetVar.r(true);
        mm40 mm40VarK1 = mrv.k0(ju70.J(o7k0.e(o7k0.d(jm40Var, 1.0f), this.d - this.e), null, (3 & 1) != 0), "CONTENT_ID");
        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
        int iHashCode2 = Long.hashCode(fetVar.T);
        bh90 bh90VarM2 = fetVar.m();
        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK1);
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(pcyVar);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, tj30VarC2, shdVar);
        jpm0.o(fetVar, bh90VarM2, shdVar2);
        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
        jpm0.o(fetVar, mm40VarC1, shdVar4);
        ua80.p(6, this.o, jr8.f16991a, fetVar, true);
        fetVar.r(false);
        return unit;
    }
}
