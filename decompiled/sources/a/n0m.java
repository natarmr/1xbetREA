package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n0m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22705a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n0m(mm40 mm40Var, long j, long j2, int i, ope opeVar, long j3, String str) {
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.f = i;
        this.g = opeVar;
        this.e = j3;
        this.h = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22705a;
        int i = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ope opeVar = (ope) obj4;
                String str = (String) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(this.b, 20.0f);
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarL = s5x0.L(i120.Q(s5x0.J(mm40VarE.e(i120.S(jm40.b, 2.0f, this.c, ugg0Var)), 2.0f), this.d, ugg0Var), 6.0f, 0.0f, 2);
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    String strL = tdc.L(i, opeVar);
                    y9q0 y9q0VarJ = tdc.J(g1t0.b());
                    long j = this.e;
                    v8q0.a(strL, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarJ, fetVar, 0, 0, 131066);
                    v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 110586);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dyb.b(this.b, (IntRange) obj4, (IntRange) obj3, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n0m(mm40 mm40Var, IntRange intRange, IntRange intRange2, long j, long j2, long j3, int i) {
        this.b = mm40Var;
        this.g = intRange;
        this.h = intRange2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
    }
}
