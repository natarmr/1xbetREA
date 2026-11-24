package a;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f28138a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public q58(k6z k6zVar, w6k w6kVar, mrq mrqVar, y9q0 y9q0Var, Object obj) {
        this.b = k6zVar;
        this.c = w6kVar;
        this.d = mrqVar;
        this.e = y9q0Var;
        this.f = obj;
        this.g = androidx.compose.runtime.e.e(Boolean.TRUE);
        this.f28138a = 0L;
    }

    public static void a(q58 q58Var, k6z k6zVar, w6k w6kVar, y9q0 y9q0Var, int i) {
        if ((i & 1) != 0) {
            k6zVar = (k6z) q58Var.b;
        }
        if ((i & 2) != 0) {
            w6kVar = (w6k) q58Var.c;
        }
        mrq mrqVar = (mrq) q58Var.d;
        if ((i & 8) != 0) {
            y9q0Var = (y9q0) q58Var.e;
        }
        Object obj = q58Var.f;
        k6z k6zVar2 = (k6z) q58Var.b;
        pz40 pz40Var = (pz40) q58Var.g;
        if (k6zVar == k6zVar2 && Intrinsics.d(w6kVar, (w6k) q58Var.c) && Intrinsics.d(mrqVar, (mrq) q58Var.d) && Intrinsics.d(y9q0Var, (y9q0) q58Var.e)) {
            if (Intrinsics.d(obj, q58Var.f)) {
                return;
            }
            q58Var.f = obj;
            ((hgk0) pz40Var).setValue(Boolean.TRUE);
            return;
        }
        q58Var.b = k6zVar;
        q58Var.c = w6kVar;
        q58Var.d = mrqVar;
        q58Var.e = y9q0Var;
        ((hgk0) pz40Var).setValue(Boolean.TRUE);
    }

    public q58(Cipher cipher) {
        this.b = null;
        this.c = cipher;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.f28138a = 0L;
    }

    public q58(Mac mac) {
        this.b = null;
        this.c = null;
        this.d = mac;
        this.e = null;
        this.f = null;
        this.g = null;
        this.f28138a = 0L;
    }

    public q58(Signature signature) {
        this.b = signature;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.f28138a = 0L;
    }

    public q58(IdentityCredential identityCredential) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = identityCredential;
        this.g = null;
        this.f28138a = 0L;
    }

    public q58(PresentationSession presentationSession) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = presentationSession;
        this.f28138a = 0L;
    }

    public q58(KeyAgreement keyAgreement) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = keyAgreement;
        this.f = null;
        this.g = null;
        this.f28138a = 0L;
    }

    public q58(long j) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.f28138a = j;
    }
}
