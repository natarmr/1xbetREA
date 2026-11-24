package a;

import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.login.core.presentation.model.AuthDataModel;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final class rc4 extends x2t0 {
    public final ctf0 h;
    public final ojj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc4(ctf0 ctf0Var, ojj ojjVar) {
        super(new a04((byte) 6));
        ctf0Var.getClass();
        this.h = ctf0Var;
        this.i = ojjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.j3t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object a(pc4 pc4Var, zje zjeVar) {
        qc4 qc4Var;
        String strA;
        if (zjeVar instanceof qc4) {
            qc4Var = (qc4) zjeVar;
            int i = qc4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc4Var.l = i - Integer.MIN_VALUE;
            } else {
                qc4Var = new qc4(this, zjeVar);
            }
        } else {
            qc4Var = new qc4(this, zjeVar);
        }
        Object obj = qc4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = qc4Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            qc4Var.i = pc4Var;
            qc4Var.l = 1;
            if (x2t0.f(this, pc4Var, qc4Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pc4Var = qc4Var.i;
            z1x.P(obj);
        }
        boolean z = pc4Var instanceof mc4;
        ad4 ad4Var = ad4.f660a;
        tc4 tc4Var = tc4.f33701a;
        if (z) {
            mc4 mc4Var = (mc4) pc4Var;
            Throwable th = mc4Var.f21534a;
            AuthDataModel authDataModel = mc4Var.b;
            if (th == null || (th instanceof UnknownHostException) || (th instanceof el50)) {
                g(cd4.f4144a);
            } else if (th instanceof fn50) {
                g(new xc4((fn50) th));
            } else if (th instanceof n64) {
                g(tc4Var);
            } else if (th instanceof kj50) {
                g(ad4Var);
            } else if (th instanceof k6a) {
                g(new zc4(authDataModel));
            } else {
                boolean z2 = th instanceof i660;
                ctf0 ctf0Var = this.h;
                if (z2) {
                    String message = ((i660) th).getMessage();
                    strA = message != null ? message : "";
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.check_user_data, Arrays.copyOf(new Object[0], 0));
                    }
                    g(new bd4(strA));
                } else if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    Integer numValueOf = Integer.valueOf(zhi0Var.c.getErrorCode());
                    String message2 = zhi0Var.getMessage();
                    strA = message2 != null ? message2 : "";
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.check_user_data, Arrays.copyOf(new Object[0], 0));
                    }
                    g(new yc4(numValueOf, strA));
                } else {
                    this.i.c("Login error: " + th.getMessage(), th);
                    g(new ed4(th));
                }
            }
        } else if (pc4Var instanceof nc4) {
            ConfirmationNewPlaceResultType confirmationNewPlaceResultType = ((nc4) pc4Var).f23273a;
            if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Success) {
                g(new wc4(((ConfirmationNewPlaceResultType.Success) confirmationNewPlaceResultType).f46937a));
            } else if (confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Error) {
                g(vc4.f37169a);
            } else {
                if (!(confirmationNewPlaceResultType instanceof ConfirmationNewPlaceResultType.Canceled)) {
                    t9f.b();
                    return null;
                }
                g(uc4.f35411a);
            }
        } else if (pc4Var instanceof lc4) {
            lc4 lc4Var = (lc4) pc4Var;
            rvs0 rvs0Var = lc4Var.f19782a;
            AuthDataModel authDataModel2 = lc4Var.b;
            if (!(rvs0Var instanceof mvs0)) {
                if (rvs0Var instanceof qvs0) {
                    g(new dd4(vu4.a(authDataModel2)));
                } else if (rvs0Var instanceof ovs0) {
                    ovs0 ovs0Var = (ovs0) rvs0Var;
                    g(new xc4(new fn50(ovs0Var.f25940a, ovs0Var.b, ovs0Var.c, ovs0Var.f, ovs0Var.d, ovs0Var.e, ovs0Var.g)));
                } else if (rvs0Var instanceof pvs0) {
                    pvs0 pvs0Var = (pvs0) rvs0Var;
                    g(new yc4(Integer.valueOf(pvs0Var.f27677a), pvs0Var.b));
                } else {
                    if (!(rvs0Var instanceof nvs0)) {
                        t9f.b();
                        return null;
                    }
                    Class cls = ((nvs0) rvs0Var).f24202a;
                    if (cls.equals(n64.class)) {
                        g(tc4Var);
                    } else if (cls.equals(kj50.class)) {
                        g(ad4Var);
                    } else if (cls.equals(k6a.class)) {
                        g(new zc4(authDataModel2));
                    } else {
                        g(tc4Var);
                    }
                }
            }
        } else {
            if (!Intrinsics.d(pc4Var, oc4.f25010a)) {
                t9f.b();
                return null;
            }
            e();
        }
        return Unit.f46060a;
    }
}
