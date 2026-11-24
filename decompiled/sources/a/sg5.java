package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sg5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32144a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ sg5(String str, String str2, pz40 pz40Var, byte b) {
        this.f32144a = b;
        this.b = str;
        this.c = str2;
        this.d = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32144a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        pz40 pz40Var = this.d;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false);
                    y9q0 y9q0VarT = ibm0.t(g1t0.p(), fetVar);
                    n05 n05Var = new n05(qmk.r, qmk.w, qmk.n);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new we(pz40Var, (byte) 25);
                        fetVar.o0(objP);
                    }
                    aad.e(this.b, x7zVarI, y9q0VarT, (Function1) objP, 2, false, 1, 0, null, n05Var, fetVar, 1600512, Response.UNSUPPORTED_URI_SCHEME);
                    v8q0.a(this.c, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.p(), fetVar), fetVar, 0, 24576, 114668);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x7z x7zVar = new x7z(1.0f, false);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    mm40 mm40VarE0 = o2e.e0(ohs0.i(fetVar2, mm40VarC1, gqw0.v, 1.0f, false), "WALLET_SUM");
                    y9q0 y9q0VarT2 = ibm0.t(g1t0.a(), fetVar2);
                    n05 n05Var2 = new n05(qmk.o, qmk.q, qmk.n);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new we(pz40Var, (byte) 26);
                        fetVar2.o0(objP2);
                    }
                    aad.e(this.b, mm40VarE0, y9q0VarT2, (Function1) objP2, 2, false, 1, 0, null, n05Var2, fetVar2, 1600512, Response.UNSUPPORTED_URI_SCHEME);
                    v8q0.a(this.c, o2e.e0(s5x0.N(jm40.b, 2.0f, 0.0f, 0.0f, 0.0f, 14), "WALLET_CURRENCY"), 0L, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.a(), fetVar2), fetVar2, 0, 24576, 114668);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
