package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class osw0 extends qqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final msw0 f25803a;
    public final icw0 b;
    public final Integer c;

    public osw0(msw0 msw0Var, icw0 icw0Var, Integer num) {
        this.f25803a = msw0Var;
        this.b = icw0Var;
        this.c = num;
    }

    public static osw0 v(msw0 msw0Var, Integer num) throws GeneralSecurityException {
        icw0 icw0VarA;
        h70 h70Var = msw0Var.b;
        if (h70Var == h70.k) {
            if (num == null) {
                hny.o("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            icw0VarA = icw0.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (h70Var != h70.l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(h70Var)));
            }
            if (num != null) {
                hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            icw0VarA = icw0.a(new byte[0]);
        }
        return new osw0(msw0Var, icw0VarA, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f25803a;
    }

    @Override // a.atm0
    public final Integer t() {
        return this.c;
    }

    @Override // a.qqw0
    public final icw0 u() {
        return this.b;
    }
}
