package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24352a;
    public final /* synthetic */ g00 b;

    public /* synthetic */ nz(g00 g00Var, byte b) {
        this.f24352a = b;
        this.b = g00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        byte b = this.f24352a;
        final byte b2 = 0;
        final g00 g00Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                ctf0 ctf0Var = g00Var.o;
                p7m0 p7m0Var = g00Var.A;
                g00Var.n.a(th);
                if ((th instanceof p4c) || (th instanceof orv0)) {
                    do {
                        value = p7m0Var.getValue();
                        List<Object> list = (List) value;
                        arrayList = new ArrayList(r3d.q(list, 10));
                        for (Object objC : list) {
                            if (objC instanceof x7q0) {
                                x7q0 x7q0Var = (x7q0) objC;
                                if (x7q0Var.f40425a == vqp.j) {
                                    objC = x7q0.c(x7q0Var, null, ctf0Var.f(R.string.check_phone_error, new Object[0]), 15);
                                }
                            }
                            arrayList.add(objC);
                        }
                    } while (!p7m0Var.m(value, arrayList));
                } else if (th instanceof t1c) {
                    do {
                        value2 = p7m0Var.getValue();
                        List<Object> list2 = (List) value2;
                        arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (Object objC2 : list2) {
                            if (objC2 instanceof x7q0) {
                                x7q0 x7q0Var2 = (x7q0) objC2;
                                if (x7q0Var2.f40425a == vqp.i) {
                                    objC2 = x7q0.c(x7q0Var2, null, ctf0Var.f(R.string.incorrect_email, new Object[0]), 15);
                                }
                            }
                            arrayList2.add(objC2);
                        }
                    } while (!p7m0Var.m(value2, arrayList2));
                } else {
                    final byte b3 = 4;
                    g00Var.y(th, new Function2() { // from class: a.oz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b4 = b3;
                            g00 g00Var2 = g00Var;
                            Throwable th2 = (Throwable) obj2;
                            String str = (String) obj3;
                            switch (b4) {
                                case 0:
                                    th2.getClass();
                                    str.getClass();
                                    g00Var2.y.f(str);
                                    break;
                                case 1:
                                    th2.getClass();
                                    str.getClass();
                                    g00Var2.y.f(str);
                                    break;
                                case 2:
                                    th2.getClass();
                                    str.getClass();
                                    g00Var2.y.f(str);
                                    break;
                                case 3:
                                    th2.getClass();
                                    str.getClass();
                                    g00Var2.y.f(str);
                                    break;
                                default:
                                    th2.getClass();
                                    str.getClass();
                                    g00Var2.y.f(str);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                }
                break;
            case 1:
                th.getClass();
                final byte b4 = 1;
                g00Var.y(th, new Function2() { // from class: a.oz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b4;
                        g00 g00Var2 = g00Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 2:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 3:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                g00Var.n.a(th);
                break;
            case 2:
                th.getClass();
                g00Var.y(th, new Function2() { // from class: a.oz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b2;
                        g00 g00Var2 = g00Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 2:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 3:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                g00Var.n.a(th);
                break;
            case 3:
                th.getClass();
                final byte b5 = 3;
                g00Var.y(th, new Function2() { // from class: a.oz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b6 = b5;
                        g00 g00Var2 = g00Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b6) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 2:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 3:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                g00Var.n.a(th);
                break;
            default:
                th.getClass();
                final byte b6 = 2;
                g00Var.y(th, new Function2() { // from class: a.oz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b7 = b6;
                        g00 g00Var2 = g00Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b7) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 2:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            case 3:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                g00Var2.y.f(str);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                g00Var.n.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
