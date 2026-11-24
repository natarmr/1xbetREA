package a;

import android.accounts.Account;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zcw0 implements ngw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44186a;
    public Object b = "files";
    public Object c = "common";
    public Object e = b9x0.b;
    public Object d = "";
    public Object f = b4x.l();

    public /* synthetic */ zcw0(Context context) {
        this.f44186a = context.getPackageName();
    }

    public brw0 a() throws GeneralSecurityException {
        if (((Integer) this.f44186a) == null) {
            hny.o("AES key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            hny.o("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            hny.o("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.d;
        if (num == null) {
            hny.o("tag size is not set");
            return null;
        }
        if (((fhn) this.e) == null) {
            hny.o("hash type is not set");
            return null;
        }
        if (((arw0) this.f) == null) {
            hny.o("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        fhn fhnVar = (fhn) this.e;
        if (fhnVar == fhn.e) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (fhnVar == fhn.f) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (fhnVar == fhn.g) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (fhnVar == fhn.h) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (fhnVar != fhn.i) {
                hny.o("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new brw0(((Integer) this.f44186a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (arw0) this.f, (fhn) this.e);
    }

    public xzw0 b() throws GeneralSecurityException {
        vzw0 vzw0Var = (vzw0) this.f44186a;
        if (vzw0Var == null) {
            hny.o("Elliptic curve type is not set");
            return null;
        }
        if (((uzw0) this.b) == null) {
            hny.o("Hash type is not set");
            return null;
        }
        if (((fpw0) this.d) == null) {
            hny.o("DEM parameters are not set");
            return null;
        }
        if (((p50) this.e) == null) {
            hny.o("Variant is not set");
            return null;
        }
        vzw0 vzw0Var2 = vzw0.e;
        if (vzw0Var != vzw0Var2 && ((wzw0) this.c) == null) {
            hny.o("Point format is not set");
            return null;
        }
        if (vzw0Var != vzw0Var2 || ((wzw0) this.c) == null) {
            return new xzw0((vzw0) this.f44186a, (uzw0) this.b, (wzw0) this.c, (fpw0) this.d, (p50) this.e, (icw0) this.f);
        }
        hny.o("For Curve25519 point format must not be set");
        return null;
    }

    public Task c(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        String str2 = Separators.STAR;
        if (str == null || str.isEmpty()) {
            str = Separators.STAR;
        }
        Task taskI = i(str);
        if (bool.booleanValue() || taskI == null) {
            if (!str.isEmpty()) {
                str2 = str;
            }
            if (bool.booleanValue() || (taskContinueWithTask = i(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.e;
                fck0 fck0Var = firebaseAuth.e;
                String str3 = firebaseAuth.i;
                fck0Var.getClass();
                taskContinueWithTask = fck0Var.s(new cew0(str3, (byte) 1)).continueWithTask(new hcp0(this, str2));
            }
            taskI = taskContinueWithTask;
        }
        return taskI.continueWithTask(new owp0(this, recaptchaAction));
    }

    public void d(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f44186a = Integer.valueOf(i);
    }

    public void e(fpw0 fpw0Var) throws GeneralSecurityException {
        if (!xzw0.g.contains(fpw0Var)) {
            throw new GeneralSecurityException(kng0.l("Invalid DEM parameters ", String.valueOf(fpw0Var), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.d = fpw0Var;
    }

    public void f(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void g(String str) {
        aem0.C(b9x0.f2232a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        aem0.C(!b9x0.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        String str = (String) this.f44186a;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
        String str4 = (String) this.d;
        String str5 = ((zzaia) xfw0Var).b;
        ajw0 ajw0Var = new ajw0();
        s0x.E(str);
        ajw0Var.f998a = str;
        s0x.E(str2);
        ajw0Var.b = str2;
        ajw0Var.c = str3;
        ajw0Var.d = str4;
        ajw0Var.e = str5;
        nmt0 nmt0Var = (nmt0) this.f;
        hcp0 hcp0Var = (hcp0) this.e;
        ywq0 ywq0Var = (ywq0) nmt0Var.f23789a;
        mkt0 mkt0Var = new mkt0();
        mkt0Var.f21959a = hcp0Var;
        mkt0Var.b = this;
        mkt0Var.c = nmt0Var;
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/signupNewUser", (String) ywq0Var.f), ajw0Var, mkt0Var, new ziw0(), (fht0) rfw0Var.b);
    }

    public Task i(String str) {
        Task task;
        synchronized (this.f44186a) {
            task = (Task) ((HashMap) this.b).get(str);
        }
        return task;
    }

    public void j(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public void k(String str) {
        if (str.startsWith(Separators.SLASH)) {
            str = str.substring(1);
        }
        Pattern pattern = b9x0.f2232a;
        this.d = str;
    }

    public Uri l() {
        String strO;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = y8x0.f42217a;
        Account account2 = (Account) this.e;
        aem0.C(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        aem0.C(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        aem0.C(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (y8x0.f42217a.equals(account2)) {
            strO = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strO = rw2.o(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, Separators.COLON, str4);
        }
        String str5 = (String) this.d;
        StringBuilder sb = new StringBuilder(strO.length() + str2.length() + str.length() + 2 + 1 + 1 + str5.length());
        f140.v(sb, Separators.SLASH, str, Separators.SLASH, str2);
        String strM = ua80.m(sb, Separators.SLASH, strO, Separators.SLASH, str5);
        rcf0 rcf0VarG = ((u3x) this.f).g();
        Pattern pattern = l9x0.f19679a;
        return new Uri.Builder().scheme("android").authority((String) this.f44186a).path(strM).encodedFragment(rcf0VarG.isEmpty() ? null : "transform=".concat(new pfw("+").b(rcf0VarG))).build();
    }

    public void m(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.e).a(msm0.v(str));
    }
}
