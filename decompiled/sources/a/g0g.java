package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10457a;
    public final /* synthetic */ n0x b;

    public /* synthetic */ g0g(n0x n0xVar) {
        this.f10457a = (byte) 6;
        this.b = n0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10457a;
        n0x n0xVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ozb.a(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                feb.D(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dub.T(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rcb.l(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                n6m.a(n0xVar, (fet) obj, x8x.L(7));
                break;
            case 5:
                ((Integer) obj2).getClass();
                o9m.g(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 6:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
                    k1xVar.c = n0xVar.a();
                    mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar, 0, 30);
                    zcl zclVar = qmk.f28987a;
                    dww.c(mz3VarX, null, o7k0.s(o7k0.e(jm40.b, 24.0f), 74.0f), y3d.g, fetVar, 3120, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                e9x.s(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jtt0.c(n0xVar, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                jpm0.b(n0xVar, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ktt0.b(n0xVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ g0g(n0x n0xVar, int i, byte b) {
        this.f10457a = b;
        this.b = n0xVar;
    }
}
