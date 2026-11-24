package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dvw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f6766a = new y6x0(jrw0.class, new qow0((byte) 19));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesEaxKey", new zow0((byte) 19));
    public static final j5x0 c = new j5x0(crw0.class, new tow0((byte) 19));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesEaxKey", new cpw0((byte) 19));

    public static drq a(lpw0 lpw0Var) throws GeneralSecurityException {
        drq drqVar = drq.f;
        if (lpw0Var == lpw0.c) {
            return drq.e;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return drqVar;
        }
        if (lpw0Var == lpw0.e) {
            return drq.g;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(drq drqVar) {
        if (drqVar.equals(drq.e)) {
            return lpw0.c;
        }
        if (drqVar == drq.f) {
            return lpw0.f;
        }
        if (drqVar == drq.g) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(drqVar)));
    }

    public static bbx0 c(jrw0 jrw0Var) {
        if (jrw0Var.c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(jrw0Var.c)));
        }
        abx0 abx0VarV = bbx0.v();
        int i = jrw0Var.b;
        abx0VarV.d();
        ((bbx0) abx0VarV.b).zze = i;
        return (bbx0) abx0VarV.c();
    }
}
