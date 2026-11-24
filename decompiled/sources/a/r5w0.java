package a;

import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes2.dex */
public final class r5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsb0 f29908a;
    public final n0o0 b;

    public r5w0(wsb0 wsb0Var, akh0 akh0Var, vby vbyVar) {
        this.f29908a = wsb0Var;
        this.b = maz.b(new ugu0(akh0Var, vbyVar, (byte) 12));
        new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT);
    }
}
