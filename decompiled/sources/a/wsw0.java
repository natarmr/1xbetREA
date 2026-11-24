package a;

import android.gov.nist.core.Separators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wsw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f39712a = new y6x0(tsw0.class, new zow0((byte) 16));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new vow0((byte) 17));
    public static final j5x0 c = new j5x0(usw0.class, new qow0((byte) 17));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new epw0((byte) 17));

    public static tsw0 a(ogx0 ogx0Var, lpw0 lpw0Var) throws GeneralSecurityException {
        pfw pfwVar;
        hbb hbbVar = hbb.o;
        pfw pfwVar2 = pfw.o;
        pfw pfwVar3 = pfw.n;
        pfw pfwVar4 = pfw.m;
        pfw pfwVar5 = pfw.k;
        pfw pfwVar6 = pfw.l;
        pfw pfwVar7 = pfw.j;
        zex0 zex0VarT = bfx0.t();
        zex0VarT.g(ogx0Var.t().C());
        zex0VarT.f(ogx0Var.t().B());
        zex0VarT.h(4);
        fpw0 fpw0VarE = ktt0.E(((bfx0) zex0VarT.c()).c());
        if (fpw0VarE instanceof mrw0) {
            pfwVar = pfwVar7;
        } else if (fpw0VarE instanceof vrw0) {
            pfwVar = pfwVar6;
        } else if (fpw0VarE instanceof muw0) {
            pfwVar = pfwVar5;
        } else if (fpw0VarE instanceof brw0) {
            pfwVar = pfwVar4;
        } else if (fpw0VarE instanceof jrw0) {
            pfwVar = pfwVar3;
        } else {
            if (!(fpw0VarE instanceof srw0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(fpw0VarE)));
            }
            pfwVar = pfwVar2;
        }
        if (lpw0Var.equals(lpw0.c)) {
            hbbVar = hbb.n;
        } else if (lpw0Var != lpw0.e) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
        }
        String strZ = ogx0Var.z();
        sqw0 sqw0Var = (sqw0) fpw0VarE;
        if (strZ == null) {
            hny.o("kekUri must be set");
            return null;
        }
        if (sqw0Var.a()) {
            hny.o("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((pfwVar == pfwVar7 && (sqw0Var instanceof mrw0)) || ((pfwVar == pfwVar6 && (sqw0Var instanceof vrw0)) || ((pfwVar == pfwVar5 && (sqw0Var instanceof muw0)) || ((pfwVar == pfwVar4 && (sqw0Var instanceof brw0)) || ((pfwVar == pfwVar3 && (sqw0Var instanceof jrw0)) || (pfwVar == pfwVar2 && (sqw0Var instanceof srw0))))))) {
            return new tsw0(hbbVar, strZ, pfwVar, sqw0Var);
        }
        throw new GeneralSecurityException(b1j.k("Cannot use parsing strategy ", pfwVar.b, " when new keys are picked according to ", String.valueOf(sqw0Var), Separators.DOT));
    }

    public static ogx0 b(tsw0 tsw0Var) {
        try {
            bfx0 bfx0VarV = bfx0.v(ktt0.F(tsw0Var.d), dkw0.b);
            ngx0 ngx0VarX = ogx0.x();
            String str = tsw0Var.b;
            ngx0VarX.d();
            ogx0.w((ogx0) ngx0VarX.b, str);
            ngx0VarX.d();
            ogx0.v((ogx0) ngx0VarX.b, bfx0VarV);
            return (ogx0) ngx0VarX.c();
        } catch (qkw0 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
