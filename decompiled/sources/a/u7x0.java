package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u7x0 implements qpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f35207a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public u7x0(hhi0 hhi0Var) {
        this.f35207a = new HashMap(hhi0Var.f13065a);
        this.b = new HashMap(hhi0Var.b);
        this.c = new HashMap(hhi0Var.c);
        this.d = new HashMap(hhi0Var.d);
    }

    @Override // a.qpw0
    public final vkr0 a(atm0 atm0Var) throws GeneralSecurityException {
        Class<?> cls = atm0Var.getClass();
        HashMap map = this.f35207a;
        if (map.containsKey(cls)) {
            return ((j5x0) map.get(atm0Var.getClass())).b.a(atm0Var);
        }
        throw new GeneralSecurityException(kng0.l("No Key serializer for ", String.valueOf(atm0Var.getClass()), " available"));
    }

    @Override // a.qpw0
    public final atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        String str = (String) vkr0Var.b;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return ((e5x0) map.get(str)).b.c(vkr0Var);
        }
        throw new GeneralSecurityException(kng0.l("No Key Parser for requested key type ", str, " available"));
    }
}
