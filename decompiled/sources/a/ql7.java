package a;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ql7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28919a;
    public final /* synthetic */ fm7 b;

    public /* synthetic */ ql7(fm7 fm7Var, String str) {
        this.f28919a = (byte) 9;
        this.b = fm7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f28919a;
        final byte b2 = 0;
        final byte b3 = 1;
        final fm7 fm7Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                fm7Var.t.b(th, new i87((byte) 12));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                final byte b4 = 5;
                fm7Var.t.b(th2, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b4;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th3 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th3.getClass();
                                str.getClass();
                                if (th3 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th3.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                fm7Var.t.b(th3, new i87((byte) 11));
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                p7m0 p7m0Var = fm7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    fm7Var.f.getClass();
                } while (!p7m0Var.m(value, jk7.a((jk7) value, false, true, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554412)));
                final byte b5 = 6;
                fm7Var.t.b(th4, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b6 = b5;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th5 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b6) {
                            case 0:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th5.getClass();
                                str.getClass();
                                if (th5 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th5.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 4:
                final Throwable th5 = (Throwable) obj;
                th5.getClass();
                fm7Var.t.b(th5, new Function2() { // from class: a.rl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b6 = b2;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th6 = th5;
                        switch (b6) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th6 instanceof zhi0) && ((zhi0) th6).c == i2o.SelfExclusionChangesProhibited) {
                                    fm7Var2.G(xk7.f41018a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = fm7Var2.u;
                                String str = (String) obj3;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th6 instanceof SocketTimeoutException) || (th6 instanceof UnknownHostException) || (th6 instanceof SSLHandshakeException) || (th6 instanceof ConnectException) || (th6 instanceof IllegalStateException)) {
                                    fm7Var2.G(new jl7(ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))));
                                } else {
                                    fm7Var2.G(new dl7(str));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                fm7Var.t.b(th6, new i87((byte) 9));
                break;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                final byte b6 = 4;
                fm7Var.t.b(th7, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b7 = b6;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th8 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b7) {
                            case 0:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th8.getClass();
                                str.getClass();
                                if (th8 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th8.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                fm7Var.t.b(th8, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b7 = b3;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th9 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b7) {
                            case 0:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th9.getClass();
                                str.getClass();
                                if (th9 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th9.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                final byte b7 = 3;
                fm7Var.t.b(th9, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b8 = b7;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th10 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b8) {
                            case 0:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th10.getClass();
                                str.getClass();
                                if (th10 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th10.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 9:
                final Throwable th10 = (Throwable) obj;
                th10.getClass();
                if (th10 instanceof zhi0) {
                    fm7Var.a0.b(((zhi0) th10).c.getErrorCode());
                }
                p7m0 p7m0Var2 = fm7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    fm7Var.f.getClass();
                } while (!p7m0Var2.m(value2, jk7.a((jk7) value2, false, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33488895)));
                fm7Var.t.b(th10, new Function2() { // from class: a.rl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b8 = b3;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th11 = th10;
                        switch (b8) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th11 instanceof zhi0) && ((zhi0) th11).c == i2o.SelfExclusionChangesProhibited) {
                                    fm7Var2.G(xk7.f41018a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = fm7Var2.u;
                                String str = (String) obj3;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th11 instanceof SocketTimeoutException) || (th11 instanceof UnknownHostException) || (th11 instanceof SSLHandshakeException) || (th11 instanceof ConnectException) || (th11 instanceof IllegalStateException)) {
                                    fm7Var2.G(new jl7(ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))));
                                } else {
                                    fm7Var2.G(new dl7(str));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 10:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                fm7Var.t.b(th11, new i87((byte) 10));
                break;
            case 11:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                fm7Var.t.b(th12, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b8 = b3;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th13 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b8) {
                            case 0:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th13.getClass();
                                str.getClass();
                                if (th13 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th13.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 12:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                fm7Var.t.b(th13, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b8 = b2;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th14 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b8) {
                            case 0:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th14.getClass();
                                str.getClass();
                                if (th14 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th14.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                final byte b8 = 2;
                fm7Var.t.b(th14, new Function2() { // from class: a.sl7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b9 = b8;
                        fm7 fm7Var2 = fm7Var;
                        Throwable th15 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b9) {
                            case 0:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 1:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(yk7.f42774a);
                                break;
                            case 2:
                                th15.getClass();
                                str.getClass();
                                if (th15 instanceof zhi0) {
                                    fm7Var2.G(new il7(str));
                                }
                                break;
                            case 3:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 4:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            case 5:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                            default:
                                th15.getClass();
                                str.getClass();
                                fm7Var2.G(new il7(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ql7(fm7 fm7Var, byte b) {
        this.f28919a = b;
        this.b = fm7Var;
    }
}
