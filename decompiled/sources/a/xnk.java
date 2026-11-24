package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xnk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41173a = 1;
    public final /* synthetic */ gok b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ xnk(gok gokVar, qdz qdzVar, Function1 function1, int i) {
        this.b = gokVar;
        this.c = qdzVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41173a;
        Function1 function1 = this.d;
        qdz qdzVar = this.c;
        gok gokVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eok eokVar = (eok) gokVar;
                    if (eokVar != null) {
                        if (eokVar instanceof cok) {
                            fetVar.e0(1294201456);
                            dub.d(((cok) gokVar).d, function1, fetVar, 0);
                            fetVar.r(false);
                        } else if (eokVar instanceof dok) {
                            fetVar.e0(1294511084);
                            dok dokVar = (dok) gokVar;
                            dub.F(dokVar.d, qdzVar.b(dokVar.f6419a, new svj((byte) 13), fetVar, 0), function1, fetVar, 0);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(41746261, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            default:
                num.getClass();
                dub.p(gokVar, qdzVar, function1, fetVar, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xnk(gok gokVar, Function1 function1, qdz qdzVar) {
        this.b = gokVar;
        this.d = function1;
        this.c = qdzVar;
    }
}
