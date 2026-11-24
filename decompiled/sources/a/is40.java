package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class is40 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot40 f15286a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ agk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is40(ot40 ot40Var, mms0 mms0Var, agk0 agk0Var) {
        super(3);
        this.f15286a = ot40Var;
        this.b = mms0Var;
        this.c = agk0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        fetVar.e0(146198586);
        ot40 ot40Var = this.f15286a;
        if (ot40Var.i.f == null) {
            fetVar.r(false);
            return mm40Var;
        }
        Object obj4 = this.b;
        boolean zG = fetVar.g(obj4);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = new lms0(ot40Var, this.c);
            fetVar.o0(objP);
        }
        lms0 lms0Var = (lms0) objP;
        boolean zG2 = fetVar.g(obj4);
        Object objP2 = fetVar.P();
        yje yjeVar = null;
        if (zG2 || objP2 == cl5Var) {
            objP2 = vtb.d(-1, null, null, 6);
            fetVar.o0(objP2);
        }
        htb htbVar = (htb) objP2;
        boolean zI = fetVar.i(lms0Var) | fetVar.i(htbVar);
        Object objP3 = fetVar.P();
        byte b = 2;
        if (zI || objP3 == cl5Var) {
            objP3 = new iq3(lms0Var, htbVar, yjeVar, b);
            fetVar.o0(objP3);
        }
        m0x0.t(fetVar, obj4, (Function2) objP3);
        boolean zI2 = fetVar.i(lms0Var) | fetVar.i(htbVar);
        Object objP4 = fetVar.P();
        if (zI2 || objP4 == cl5Var) {
            objP4 = new hk40(lms0Var, htbVar, yjeVar, b);
            fetVar.o0(objP4);
        }
        woa0 woa0Var = fnn0.f9847a;
        mm40 mm40VarE = mm40Var.e(new cnn0(obj4, null, new enn0((Function2) objP4), 6));
        fetVar.r(false);
        return mm40VarE;
    }
}
