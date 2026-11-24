package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bom implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2940a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ hzc0 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ Function2 g;

    public /* synthetic */ bom(boolean z, List list, mm40 mm40Var, hzc0 hzc0Var, Integer num, Function2 function2, byte b) {
        this.f2940a = b;
        this.b = z;
        this.c = list;
        this.d = mm40Var;
        this.e = hzc0Var;
        this.f = num;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2940a;
        boolean z = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                final mm40 mm40Var = this.d;
                final hzc0 hzc0Var = this.e;
                if (z) {
                    hcz.g(hczVar, 6, null, null, new ugd(690230471, true, new ydr() { // from class: a.aom
                        @Override // a.ydr
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            byte b3 = b2;
                            hzc0 hzc0Var2 = hzc0Var;
                            mm40 mm40Var2 = mm40Var;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    fet fetVar = (fet) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((k8z) obj2).getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                                        uzb.I(mm40Var2, hzc0Var2, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    fet fetVar2 = (fet) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((g9z) obj2).getClass();
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                                        uzb.I(mm40Var2, hzc0Var2, fetVar2, 6);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }), 6);
                } else {
                    List list = this.c;
                    hczVar.f(list.size(), null, new v2m(list, (byte) 8), new ugd(802480018, true, new dom(list, mm40Var, hzc0Var, this.f, this.g, (byte) 1)));
                }
                break;
            default:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                final mm40 mm40Var2 = this.d;
                final hzc0 hzc0Var2 = this.e;
                if (z) {
                    final byte b3 = 0;
                    i8z.f(i8zVar, 6, null, null, new ugd(-446664106, true, new ydr() { // from class: a.aom
                        @Override // a.ydr
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            byte b4 = b3;
                            hzc0 hzc0Var3 = hzc0Var2;
                            mm40 mm40Var3 = mm40Var2;
                            switch (b4) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    fet fetVar = (fet) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((k8z) obj2).getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                                        uzb.I(mm40Var3, hzc0Var3, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    fet fetVar2 = (fet) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((g9z) obj2).getClass();
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                                        uzb.I(mm40Var3, hzc0Var3, fetVar2, 6);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }), 14);
                } else {
                    List list2 = this.c;
                    i8zVar.e(list2.size(), null, null, new v2m(list2, (byte) 7), new ugd(-1117249557, true, new dom(list2, mm40Var2, hzc0Var2, this.f, this.g, (byte) 0)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
