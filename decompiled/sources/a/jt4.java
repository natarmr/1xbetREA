package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationFailScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jt4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17081a;
    public final /* synthetic */ ku4 b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ jt4(Throwable th, ku4 ku4Var) {
        this.f17081a = (byte) 2;
        this.c = th;
        this.b = ku4Var;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17081a;
        final byte b2 = 0;
        final byte b3 = 1;
        final Throwable th = this.c;
        final ku4 ku4Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (th instanceof zhi0) {
                    ku4Var.getClass();
                    int errorCode = ((zhi0) th).c.getErrorCode();
                    if (errorCode == 11) {
                        if (errorCode == 37) {
                            sac.V(jiu0.a(ku4Var), ju4.f17133a, null, null, new au4(ku4Var, null, (byte) 2), 14);
                        }
                        String message = th.getMessage();
                        ku4Var.F(message != null ? message : "");
                        if (yt4.f43199a[ku4Var.o.ordinal()] == 1) {
                            ku4Var.D();
                        } else {
                            ku4Var.w();
                        }
                    } else if (errorCode == 24 || errorCode == 26) {
                        String message2 = th.getMessage();
                        ku4Var.F(message2 != null ? message2 : "");
                    } else if (errorCode != 37) {
                        ku4Var.E();
                    } else {
                        if (errorCode == 37) {
                            sac.V(jiu0.a(ku4Var), ju4.f17133a, null, null, new au4(ku4Var, null, (byte) 2), 14);
                        }
                        String message3 = th.getMessage();
                        ku4Var.F(message3 != null ? message3 : "");
                        if (yt4.f43199a[ku4Var.o.ordinal()] == 1) {
                            ku4Var.D();
                        } else {
                            ku4Var.w();
                        }
                    }
                } else {
                    ku4Var.E();
                }
                break;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (th instanceof zhi0) {
                    ku4Var.getClass();
                    int errorCode2 = ((zhi0) th).c.getErrorCode();
                    if (errorCode2 == 11 || errorCode2 == 37) {
                        if (errorCode2 == 37) {
                            sac.V(jiu0.a(ku4Var), ju4.f17133a, null, null, new au4(ku4Var, null, (byte) 2), 14);
                        }
                        String message4 = th.getMessage();
                        ku4Var.F(message4 != null ? message4 : "");
                        if (yt4.f43199a[ku4Var.o.ordinal()] == 1) {
                            ku4Var.D();
                        } else {
                            ku4Var.w();
                        }
                    } else {
                        ku4Var.E();
                    }
                } else {
                    ku4Var.E();
                }
                break;
            case 2:
                i1w0 i1w0Var = ku4Var.q;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    int errorCode3 = zhi0Var.c.getErrorCode();
                    if (errorCode3 == 11) {
                        String message5 = th.getMessage();
                        ku4Var.F(message5 != null ? message5 : "");
                        if (yt4.f43199a[ku4Var.o.ordinal()] == 1) {
                            ku4Var.D();
                        } else {
                            ku4Var.w();
                        }
                    } else if (errorCode3 == 37) {
                        i1w0Var.d(new Function1() { // from class: a.kt4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str;
                                byte b4 = b3;
                                boolean z = true;
                                Throwable th2 = th;
                                ku4 ku4Var2 = ku4Var;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b4) {
                                    case 0:
                                        k0w0Var.getClass();
                                        rek0 rek0Var = ku4Var2.b;
                                        String message6 = th2.getMessage();
                                        str = message6 != null ? message6 : "";
                                        mq4 mq4Var = ku4Var2.o;
                                        if (mq4Var != mq4.f22204a && mq4Var != mq4.c) {
                                            z = false;
                                        }
                                        rek0Var.getClass();
                                        k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str, z));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        rek0 rek0Var2 = ku4Var2.b;
                                        String message7 = th2.getMessage();
                                        str = message7 != null ? message7 : "";
                                        mq4 mq4Var2 = ku4Var2.o;
                                        if (mq4Var2 != mq4.f22204a && mq4Var2 != mq4.c) {
                                            z = false;
                                        }
                                        rek0Var2.getClass();
                                        k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str, z));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (zhi0Var.f44396a == 403) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(rek0.l(ku4Var.b))), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    }
                }
                break;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (th instanceof zhi0) {
                    ku4Var.getClass();
                    if (((zhi0) th).c.getErrorCode() == 37) {
                        ku4Var.q.d(new Function1() { // from class: a.kt4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str;
                                byte b4 = b2;
                                boolean z = true;
                                Throwable th2 = th;
                                ku4 ku4Var2 = ku4Var;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b4) {
                                    case 0:
                                        k0w0Var.getClass();
                                        rek0 rek0Var = ku4Var2.b;
                                        String message6 = th2.getMessage();
                                        str = message6 != null ? message6 : "";
                                        mq4 mq4Var = ku4Var2.o;
                                        if (mq4Var != mq4.f22204a && mq4Var != mq4.c) {
                                            z = false;
                                        }
                                        rek0Var.getClass();
                                        k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str, z));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        rek0 rek0Var2 = ku4Var2.b;
                                        String message7 = th2.getMessage();
                                        str = message7 != null ? message7 : "";
                                        mq4 mq4Var2 = ku4Var2.o;
                                        if (mq4Var2 != mq4.f22204a && mq4Var2 != mq4.c) {
                                            z = false;
                                        }
                                        rek0Var2.getClass();
                                        k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str, z));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else {
                        ku4Var.E();
                    }
                } else {
                    ku4Var.E();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jt4(ku4 ku4Var, Throwable th, byte b) {
        this.f17081a = b;
        this.b = ku4Var;
        this.c = th;
    }
}
