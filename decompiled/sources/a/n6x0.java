package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n6x0 {
    public static final n6x0 b = new n6x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f23015a = new AtomicReference(new j7x0(new okt0((byte) 15)));

    public final Object a(atm0 atm0Var, Class cls) throws GeneralSecurityException {
        j7x0 j7x0Var = (j7x0) this.f23015a.get();
        j7x0Var.getClass();
        m7x0 m7x0Var = new m7x0(atm0Var.getClass(), cls);
        HashMap map = j7x0Var.f16060a;
        if (map.containsKey(m7x0Var)) {
            return ((h7x0) map.get(m7x0Var)).c.mo8a(atm0Var);
        }
        throw new GeneralSecurityException(kng0.l("No PrimitiveConstructor for ", String.valueOf(m7x0Var), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final synchronized void b(rqw0 rqw0Var) {
        Object obj;
        okt0 okt0Var = new okt0((j7x0) this.f23015a.get());
        HashMap map = (HashMap) okt0Var.b;
        switch (rqw0Var.f30953a) {
            case 0:
                obj = tmw0.class;
                break;
            case 1:
                obj = ymw0.class;
                break;
            case 2:
                obj = dnw0.class;
                break;
            case 3:
                obj = cnw0.class;
                break;
            case 4:
                obj = f9x0.class;
                break;
            default:
                obj = xow0.class;
                break;
        }
        if (map.containsKey(obj)) {
            rqw0 rqw0Var2 = (rqw0) map.get(obj);
            if (!rqw0Var2.equals(rqw0Var) || !rqw0Var.equals(rqw0Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(obj)));
            }
        } else {
            map.put(obj, rqw0Var);
        }
        this.f23015a.set(new j7x0(okt0Var));
    }

    public final synchronized void c(h7x0 h7x0Var) {
        okt0 okt0Var = new okt0((j7x0) this.f23015a.get());
        okt0Var.r(h7x0Var);
        this.f23015a.set(new j7x0(okt0Var));
    }
}
