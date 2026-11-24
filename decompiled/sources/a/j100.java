package a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j100 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15707a;
    public final /* synthetic */ p100 b;

    public /* synthetic */ j100(p100 p100Var, byte b) {
        this.f15707a = b;
        this.b = p100Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15707a;
        final p100 p100Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 3;
                p100Var.t.b(th, new Function2() { // from class: a.i100
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        LimitNeGroupEnum limitNeGroupEnum;
                        Object value2;
                        Object value3;
                        Object value4;
                        LimitNeGroupEnum limitNeGroupEnum2;
                        Object value5;
                        Object value6;
                        byte b3 = b2;
                        String str = "";
                        p100 p100Var2 = p100Var;
                        switch (b3) {
                            case 0:
                                oyg0 oyg0Var = p100Var2.f;
                                Throwable th2 = (Throwable) obj2;
                                th2.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar = p100Var2.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, e100.a((e100) value, null, null, 0, false, false, null, null, null, 4087)));
                                if (th2 instanceof zhi0) {
                                    if (((zhi0) th2).c == i2o.SecondRequesetDenied && (limitNeGroupEnum = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar = p100Var2.w;
                                        lscVar.getClass();
                                        lscVar.f20571a.a(limitNeGroupEnum);
                                        Map mapN = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var2 = ocjVar.f25029a;
                                        do {
                                            value2 = p7m0Var2.getValue();
                                            value2.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var2.m(value2, e100.a((e100) value2, null, null, 0, false, false, null, mapN, null, 1023)));
                                    }
                                    String message = th2.getMessage();
                                    if (message != null) {
                                        str = message;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            case 1:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var3 = p100Var2.i.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var3.m(value3, e100.a((e100) value3, null, null, 0, false, true, null, null, null, 4071)));
                                break;
                            case 2:
                                oyg0 oyg0Var2 = p100Var2.f;
                                Throwable th3 = (Throwable) obj2;
                                th3.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar2 = p100Var2.i;
                                p7m0 p7m0Var4 = ocjVar2.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    oyg0Var2.getClass();
                                } while (!p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, null, 4087)));
                                if (th3 instanceof zhi0) {
                                    if (((zhi0) th3).c == i2o.SecondRequesetDenied && (limitNeGroupEnum2 = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar2 = p100Var2.w;
                                        lscVar2.getClass();
                                        lscVar2.f20571a.a(limitNeGroupEnum2);
                                        Map mapN2 = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                                        do {
                                            value5 = p7m0Var5.getValue();
                                            value5.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var5.m(value5, e100.a((e100) value5, null, null, 0, false, false, null, mapN2, null, 1023)));
                                    }
                                    String message2 = th3.getMessage();
                                    if (message2 != null) {
                                        str = message2;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            default:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var6 = p100Var2.i.f25029a;
                                do {
                                    value6 = p7m0Var6.getValue();
                                    value6.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var6.m(value6, e100.a((e100) value6, null, null, 0, false, true, null, null, null, 4079)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 1:
                th.getClass();
                final byte b3 = 0;
                p100Var.t.b(th, new Function2() { // from class: a.i100
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        LimitNeGroupEnum limitNeGroupEnum;
                        Object value2;
                        Object value3;
                        Object value4;
                        LimitNeGroupEnum limitNeGroupEnum2;
                        Object value5;
                        Object value6;
                        byte b4 = b3;
                        String str = "";
                        p100 p100Var2 = p100Var;
                        switch (b4) {
                            case 0:
                                oyg0 oyg0Var = p100Var2.f;
                                Throwable th2 = (Throwable) obj2;
                                th2.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar = p100Var2.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, e100.a((e100) value, null, null, 0, false, false, null, null, null, 4087)));
                                if (th2 instanceof zhi0) {
                                    if (((zhi0) th2).c == i2o.SecondRequesetDenied && (limitNeGroupEnum = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar = p100Var2.w;
                                        lscVar.getClass();
                                        lscVar.f20571a.a(limitNeGroupEnum);
                                        Map mapN = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var2 = ocjVar.f25029a;
                                        do {
                                            value2 = p7m0Var2.getValue();
                                            value2.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var2.m(value2, e100.a((e100) value2, null, null, 0, false, false, null, mapN, null, 1023)));
                                    }
                                    String message = th2.getMessage();
                                    if (message != null) {
                                        str = message;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            case 1:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var3 = p100Var2.i.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var3.m(value3, e100.a((e100) value3, null, null, 0, false, true, null, null, null, 4071)));
                                break;
                            case 2:
                                oyg0 oyg0Var2 = p100Var2.f;
                                Throwable th3 = (Throwable) obj2;
                                th3.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar2 = p100Var2.i;
                                p7m0 p7m0Var4 = ocjVar2.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    oyg0Var2.getClass();
                                } while (!p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, null, 4087)));
                                if (th3 instanceof zhi0) {
                                    if (((zhi0) th3).c == i2o.SecondRequesetDenied && (limitNeGroupEnum2 = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar2 = p100Var2.w;
                                        lscVar2.getClass();
                                        lscVar2.f20571a.a(limitNeGroupEnum2);
                                        Map mapN2 = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                                        do {
                                            value5 = p7m0Var5.getValue();
                                            value5.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var5.m(value5, e100.a((e100) value5, null, null, 0, false, false, null, mapN2, null, 1023)));
                                    }
                                    String message2 = th3.getMessage();
                                    if (message2 != null) {
                                        str = message2;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            default:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var6 = p100Var2.i.f25029a;
                                do {
                                    value6 = p7m0Var6.getValue();
                                    value6.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var6.m(value6, e100.a((e100) value6, null, null, 0, false, true, null, null, null, 4079)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 2:
                th.getClass();
                final byte b4 = 2;
                p100Var.t.b(th, new Function2() { // from class: a.i100
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        LimitNeGroupEnum limitNeGroupEnum;
                        Object value2;
                        Object value3;
                        Object value4;
                        LimitNeGroupEnum limitNeGroupEnum2;
                        Object value5;
                        Object value6;
                        byte b5 = b4;
                        String str = "";
                        p100 p100Var2 = p100Var;
                        switch (b5) {
                            case 0:
                                oyg0 oyg0Var = p100Var2.f;
                                Throwable th2 = (Throwable) obj2;
                                th2.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar = p100Var2.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, e100.a((e100) value, null, null, 0, false, false, null, null, null, 4087)));
                                if (th2 instanceof zhi0) {
                                    if (((zhi0) th2).c == i2o.SecondRequesetDenied && (limitNeGroupEnum = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar = p100Var2.w;
                                        lscVar.getClass();
                                        lscVar.f20571a.a(limitNeGroupEnum);
                                        Map mapN = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var2 = ocjVar.f25029a;
                                        do {
                                            value2 = p7m0Var2.getValue();
                                            value2.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var2.m(value2, e100.a((e100) value2, null, null, 0, false, false, null, mapN, null, 1023)));
                                    }
                                    String message = th2.getMessage();
                                    if (message != null) {
                                        str = message;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            case 1:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var3 = p100Var2.i.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var3.m(value3, e100.a((e100) value3, null, null, 0, false, true, null, null, null, 4071)));
                                break;
                            case 2:
                                oyg0 oyg0Var2 = p100Var2.f;
                                Throwable th3 = (Throwable) obj2;
                                th3.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar2 = p100Var2.i;
                                p7m0 p7m0Var4 = ocjVar2.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    oyg0Var2.getClass();
                                } while (!p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, null, 4087)));
                                if (th3 instanceof zhi0) {
                                    if (((zhi0) th3).c == i2o.SecondRequesetDenied && (limitNeGroupEnum2 = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar2 = p100Var2.w;
                                        lscVar2.getClass();
                                        lscVar2.f20571a.a(limitNeGroupEnum2);
                                        Map mapN2 = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                                        do {
                                            value5 = p7m0Var5.getValue();
                                            value5.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var5.m(value5, e100.a((e100) value5, null, null, 0, false, false, null, mapN2, null, 1023)));
                                    }
                                    String message2 = th3.getMessage();
                                    if (message2 != null) {
                                        str = message2;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            default:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var6 = p100Var2.i.f25029a;
                                do {
                                    value6 = p7m0Var6.getValue();
                                    value6.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var6.m(value6, e100.a((e100) value6, null, null, 0, false, true, null, null, null, 4079)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b5 = 1;
                p100Var.t.b(th, new Function2() { // from class: a.i100
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        LimitNeGroupEnum limitNeGroupEnum;
                        Object value2;
                        Object value3;
                        Object value4;
                        LimitNeGroupEnum limitNeGroupEnum2;
                        Object value5;
                        Object value6;
                        byte b6 = b5;
                        String str = "";
                        p100 p100Var2 = p100Var;
                        switch (b6) {
                            case 0:
                                oyg0 oyg0Var = p100Var2.f;
                                Throwable th2 = (Throwable) obj2;
                                th2.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar = p100Var2.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, e100.a((e100) value, null, null, 0, false, false, null, null, null, 4087)));
                                if (th2 instanceof zhi0) {
                                    if (((zhi0) th2).c == i2o.SecondRequesetDenied && (limitNeGroupEnum = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar = p100Var2.w;
                                        lscVar.getClass();
                                        lscVar.f20571a.a(limitNeGroupEnum);
                                        Map mapN = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var2 = ocjVar.f25029a;
                                        do {
                                            value2 = p7m0Var2.getValue();
                                            value2.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var2.m(value2, e100.a((e100) value2, null, null, 0, false, false, null, mapN, null, 1023)));
                                    }
                                    String message = th2.getMessage();
                                    if (message != null) {
                                        str = message;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            case 1:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var3 = p100Var2.i.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var3.m(value3, e100.a((e100) value3, null, null, 0, false, true, null, null, null, 4071)));
                                break;
                            case 2:
                                oyg0 oyg0Var2 = p100Var2.f;
                                Throwable th3 = (Throwable) obj2;
                                th3.getClass();
                                ((String) obj3).getClass();
                                ocj ocjVar2 = p100Var2.i;
                                p7m0 p7m0Var4 = ocjVar2.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    oyg0Var2.getClass();
                                } while (!p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, null, 4087)));
                                if (th3 instanceof zhi0) {
                                    if (((zhi0) th3).c == i2o.SecondRequesetDenied && (limitNeGroupEnum2 = ((e100) p100Var2.D()).l) != null) {
                                        lsc lscVar2 = p100Var2.w;
                                        lscVar2.getClass();
                                        lscVar2.f20571a.a(limitNeGroupEnum2);
                                        Map mapN2 = xp20.n((ConcurrentHashMap) p100Var2.u.f30855a.b.b);
                                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                                        do {
                                            value5 = p7m0Var5.getValue();
                                            value5.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var5.m(value5, e100.a((e100) value5, null, null, 0, false, false, null, mapN2, null, 1023)));
                                    }
                                    String message2 = th3.getMessage();
                                    if (message2 != null) {
                                        str = message2;
                                    }
                                }
                                p100Var2.G(new c100(str));
                                break;
                            default:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                p7m0 p7m0Var6 = p100Var2.i.f25029a;
                                do {
                                    value6 = p7m0Var6.getValue();
                                    value6.getClass();
                                    p100Var2.f.getClass();
                                } while (!p7m0Var6.m(value6, e100.a((e100) value6, null, null, 0, false, true, null, null, null, 4079)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
