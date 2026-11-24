package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g57 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10704a;
    public final /* synthetic */ z77 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ g57(Function1 function1, z77 z77Var) {
        this.f10704a = (byte) 2;
        this.c = function1;
        this.b = z77Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10704a;
        byte b2 = 8;
        qv7 qv7Var = qv7.f29375a;
        byte b3 = 0;
        byte b4 = 1;
        Function1 function1 = this.c;
        z77 z77Var = this.b;
        byte b5 = 3;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                x77 x77Var = (x77) z77Var;
                rv7 rv7Var = x77Var.h;
                if (rv7Var instanceof pv7) {
                    hcz.e(hczVar, null, null, new ugd(-1913822417, true, new h57(z77Var, function1, b3)), 3);
                } else if (!rv7Var.equals(qv7Var)) {
                    t9f.b();
                    return null;
                }
                ArrayList arrayList = x77Var.g;
                hczVar.f(arrayList.size(), new ci2(new os6(b2), arrayList, (byte) 25), new ci2(arrayList, z77Var, (byte) 26), new ugd(2039820996, true, new o57(arrayList, z77Var, function1, b3)));
                if (x77Var.j && !x77Var.k) {
                    hcz.e(hczVar, null, null, hp4.f13425a, 3);
                }
                return Unit.f46060a;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                x77 x77Var2 = (x77) z77Var;
                ArrayList arrayList2 = x77Var2.g;
                hczVar2.f(arrayList2.size(), new at7(new qbd(b5), arrayList2, (byte) 21), new j13(arrayList2, (byte) 10, false), new ugd(2039820996, true, new o57(arrayList2, z77Var, function1, b4)));
                if (x77Var2.j && !x77Var2.k) {
                    hcz.e(hczVar2, null, null, gq80.f11720a, 3);
                }
                return Unit.f46060a;
            case 2:
                function1.invoke(new l27(((j8w) z77Var.f().n.get(((Integer) obj).intValue())).b));
                return Unit.f46060a;
            default:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                x77 x77Var3 = (x77) z77Var;
                rv7 rv7Var2 = x77Var3.h;
                byte b6 = 2;
                if (rv7Var2 instanceof pv7) {
                    hcz.e(hczVar3, null, null, new ugd(830471909, true, new h57(z77Var, function1, b6)), 3);
                } else if (!rv7Var2.equals(qv7Var)) {
                    t9f.b();
                    return null;
                }
                ArrayList arrayList3 = x77Var3.g;
                hczVar3.f(arrayList3.size(), new zcn0(new ofo0((byte) 9), arrayList3, b2), new t9l0(arrayList3, (byte) 7), new ugd(2039820996, true, new o57(arrayList3, z77Var, function1, b6)));
                if (x77Var3.j && !x77Var3.k) {
                    hcz.e(hczVar3, null, null, nia0.d, 3);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g57(z77 z77Var, Function1 function1, byte b) {
        this.f10704a = b;
        this.b = z77Var;
        this.c = function1;
    }
}
