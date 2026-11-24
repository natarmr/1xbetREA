package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qka implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28877a;
    public final /* synthetic */ d9z b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ qka(a4x a4xVar, d9z d9zVar, int i, byte b) {
        this.f28877a = b;
        this.c = a4xVar;
        this.b = d9zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28877a;
        d9z d9zVar = this.b;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        a4x a4xVar = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kc5.F0(a4xVar, d9zVar, (fet) obj, x8x.L(1));
                break;
            case 1:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ngv ngvVar = new ngv(5);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarP = o7k0.p(jm40Var, 98.0f, 64.0f);
                    qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                    qw3 qw3Var2 = new qw3(2.0f, true, new jf4((byte) 14));
                    boolean zG = fetVar.g(a4xVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new oea(a4xVar, (byte) 2);
                        fetVar.o0(objP);
                    }
                    g8x.i(ngvVar, mm40VarP, this.b, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 920);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                j47.q0(a4xVar, d9zVar, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, 108.0f), 1.0f);
                    ngv ngvVar2 = new ngv(5);
                    qw3 qw3Var3 = new qw3(4.0f, true, new jf4((byte) 14));
                    qw3 qw3Var4 = new qw3(2.0f, true, new jf4((byte) 14));
                    boolean zG2 = fetVar2.g(a4xVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new oea(a4xVar, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    g8x.i(ngvVar2, mm40VarC, this.b, null, qw3Var4, qw3Var3, null, false, null, (Function1) objP2, fetVar2, 0, 920);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qka(d9z d9zVar, a4x a4xVar, byte b) {
        this.f28877a = b;
        this.b = d9zVar;
        this.c = a4xVar;
    }
}
