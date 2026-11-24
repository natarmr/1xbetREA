package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class apd0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1246a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ apd0(w6k w6kVar, String str, y9q0 y9q0Var, String str2, long j, g9q0 g9q0Var) {
        this.c = w6kVar;
        this.d = str;
        this.f = y9q0Var;
        this.e = str2;
        this.b = j;
        this.g = g9q0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        String str;
        Pair pair;
        mm40 mm40VarD;
        byte b = this.f1246a;
        byte b2 = 2;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                w6k w6kVar = (w6k) obj8;
                String str2 = (String) obj7;
                y9q0 y9q0Var = (y9q0) obj5;
                String str3 = (String) obj6;
                g9q0 g9q0Var = (g9q0) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int iW0 = (int) w6kVar.w0(lr8Var.d());
                    int iW1 = (int) w6kVar.w0(4.0f);
                    boolean zG = fetVar.g(str2) | fetVar.g(y9q0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = Integer.valueOf((int) (g9q0.a(g9q0Var, str2, y9q0Var, 0, 0, 0L, null, 1020).c >> 32));
                        fetVar.o0(objP);
                    }
                    int iIntValue2 = ((Number) objP).intValue();
                    boolean zG2 = fetVar.g(str3) | fetVar.g(y9q0Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        a9q0 a9q0VarA = g9q0.a(g9q0Var, str3, y9q0Var, 0, 0, 0L, null, 1020);
                        y9q0Var = y9q0Var;
                        objP2 = Integer.valueOf((int) (a9q0VarA.c >> 32));
                        fetVar.o0(objP2);
                    }
                    if (((Number) objP2).intValue() + iIntValue2 + iW1 <= iW0) {
                        pair = new Pair(y9q0Var, Boolean.FALSE);
                        str = str3;
                    } else {
                        y9q0 y9q0VarA = y9q0.a(y9q0Var, 0L, this.b, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213);
                        str = str3;
                        pair = (((int) (g9q0.a(g9q0Var, str2, y9q0VarA, 0, 0, 0L, null, 1020).c >> 32)) + ((int) (g9q0.a(g9q0Var, str3, y9q0VarA, 0, 0, 0L, null, 1020).c >> 32))) + iW1 <= iW0 ? new Pair(y9q0VarA, Boolean.FALSE) : new Pair(y9q0VarA, Boolean.TRUE);
                    }
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1589557688, new lfc0(((Boolean) pair.b).booleanValue(), str2, (y9q0) pair.f46059a, str), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ftv0 ftv0Var = (ftv0) obj8;
                ywv0 ywv0Var = (ywv0) obj7;
                l7m0 l7m0Var = (l7m0) obj6;
                dvv0 dvv0Var = (dvv0) obj5;
                ugd ugdVar = (ugd) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((j810) obj).getClass();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nuv0 nuv0Var = ftv0Var.f10134a;
                    int i = (int) (this.b >> 32);
                    mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
                    boolean zG3 = fetVar2.g(ywv0Var);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new gtv0(ywv0Var, b2);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarE0 = x4d0.e0(mm40VarB, (Function1) objP3);
                    if (ftv0Var.b) {
                        cxv0 cxv0Var = pvm0.s(ywv0Var).f3395a;
                        mm40VarD = o7k0.s(mm40VarE0, 512.0f);
                    } else {
                        mm40VarD = o7k0.d(mm40VarE0, 1.0f);
                    }
                    boolean zG4 = fetVar2.g(ywv0Var);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new gtv0(ywv0Var, (byte) 3);
                        fetVar2.o0(objP4);
                    }
                    vsm0.i(i4w0.T(mm40VarD, (Function1) objP4), ywv0Var, nuv0Var, l7m0Var, dvv0Var, i, ugdVar, fetVar2, 1572864);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ apd0(ftv0 ftv0Var, long j, ywv0 ywv0Var, l7m0 l7m0Var, dvv0 dvv0Var, ugd ugdVar) {
        this.c = ftv0Var;
        this.b = j;
        this.d = ywv0Var;
        this.e = l7m0Var;
        this.f = dvv0Var;
        this.g = ugdVar;
    }
}
