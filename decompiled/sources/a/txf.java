package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class txf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34696a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ txf(String str, Function0 function0, byte b) {
        this.f34696a = b;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34696a;
        Function0 function0 = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j2e.p(str, function0, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jeb.i(str, function0, (fet) obj, x8x.L(1));
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qzb.n(o7k0.d(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), new wul(lul.e, oe9.c, new ue9(str), true, false, false), this.c, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xia0.z(o7k0.c(o7k0.d(jm40.b, 1.0f), 1.0f), str, function0, fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ txf(String str, Function0 function0, int i, byte b) {
        this.f34696a = b;
        this.b = str;
        this.c = function0;
    }
}
