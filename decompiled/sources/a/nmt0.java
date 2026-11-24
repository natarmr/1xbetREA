package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nmt0 implements jix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23789a;

    public nmt0(gii0 gii0Var) {
        gii0Var.getClass();
        this.f23789a = new lkr0(gii0Var, (byte) 19);
    }

    public static void e(nmt0 nmt0Var, ljw0 ljw0Var, hcp0 hcp0Var, ngw0 ngw0Var) {
        if (!ljw0Var.f20172a && TextUtils.isEmpty(ljw0Var.l)) {
            nmt0Var.g(new zzaia(Long.valueOf(ljw0Var.d), ljw0Var.c, ljw0Var.b), ljw0Var.g, ljw0Var.f, Boolean.valueOf(ljw0Var.h), ljw0Var.a(), hcp0Var, ngw0Var);
            return;
        }
        hcp0Var.h(new fht0(ljw0Var.f20172a ? new Status(17012, null, null, null) : msm0.v(ljw0Var.l), ljw0Var.a(), ljw0Var.e, ljw0Var.n));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.sip r7, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Virtual r8, a.jo20 r9, a.zje r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f23789a
            a.lkr0 r0 = (a.lkr0) r0
            boolean r1 = r10 instanceof a.kru0
            if (r1 == 0) goto L17
            r1 = r10
            a.kru0 r1 = (a.kru0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.kru0 r1 = new a.kru0
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r10 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L71
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5e
            if (r6 != r5) goto L5a
            java.lang.Object r6 = r0.invoke()
            a.nqu0 r6 = (a.nqu0) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r4
            java.lang.Object r6 = r6.a(r7, r9, r1)
            if (r6 != r10) goto L57
            goto L70
        L57:
            a.dx5 r6 = (a.dx5) r6
            goto L73
        L5a:
            a.t9f.b()
            return r3
        L5e:
            java.lang.Object r6 = r0.invoke()
            a.nqu0 r6 = (a.nqu0) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r5
            java.lang.Object r6 = r6.b(r7, r9, r1)
            if (r6 != r10) goto L71
        L70:
            return r10
        L71:
            a.dx5 r6 = (a.dx5) r6
        L73:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nmt0.a(a.sip, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Virtual, a.jo20, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(jo20 jo20Var, zje zjeVar) {
        lru0 lru0Var;
        if (zjeVar instanceof lru0) {
            lru0Var = (lru0) zjeVar;
            int i = lru0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lru0Var.k = i - Integer.MIN_VALUE;
            } else {
                lru0Var = new lru0(this, zjeVar);
            }
        } else {
            lru0Var = new lru0(this, zjeVar);
        }
        Object objC = lru0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lru0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            nqu0 nqu0Var = (nqu0) ((lkr0) this.f23789a).invoke();
            lru0Var.k = 1;
            objC = nqu0Var.c(jo20Var, lru0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((dx5) objC).a();
    }

    public void c(uaq0 uaq0Var) {
        rbq0 rbq0Var = (rbq0) ((roi0) this.f23789a).f30839a;
        rbq0Var.getClass();
        sac.V((vne) rbq0Var.c.getValue(), qbq0.f28452a, null, null, new ssl0((Object) rbq0Var, (Object) uaq0Var, (yje) null, (byte) 22), 14);
    }

    public int d(Context context, b9v b9vVar) {
        int i;
        int iC;
        s0x.H(context);
        s0x.H(b9vVar);
        int i2 = b9vVar.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f23789a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i2, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f23789a;
        synchronized (sparseIntArray2) {
            iC = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i3);
                    if (iKeyAt > i2 && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iC == -1) {
                iC = oav.e.c(context, i2);
            }
            sparseIntArray2.put(i2, iC);
        }
        return iC;
    }

    public void f(mhw0 mhw0Var, hcp0 hcp0Var) {
        ywq0 ywq0Var = (ywq0) this.f23789a;
        fuj0 fuj0Var = new fuj0(this, hcp0Var);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/emailLinkSignin", (String) ywq0Var.f), mhw0Var, fuj0Var, new phw0(), (fht0) rfw0Var.b);
    }

    public void g(zzaia zzaiaVar, String str, String str2, Boolean bool, com.google.firebase.auth.zzc zzcVar, hcp0 hcp0Var, ngw0 ngw0Var) {
        String str3 = zzaiaVar.b;
        h70 h70Var = new h70();
        s0x.E(str3);
        h70Var.b = str3;
        ywq0 ywq0Var = (ywq0) this.f23789a;
        xzp xzpVar = new xzp(this, ngw0Var, str2, str, bool, zzcVar, hcp0Var, zzaiaVar);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/getAccountInfo", (String) ywq0Var.f), h70Var, xzpVar, new yhw0(), (fht0) rfw0Var.b);
    }

    public void h(String str, ngw0 ngw0Var) {
        s0x.E(str);
        zzaia zzaiaVarM = zzaia.m(str);
        if (zzaiaVarM.zzg()) {
            ngw0Var.h(zzaiaVarM);
            return;
        }
        y60 y60Var = new y60(zzaiaVarM.f45523a);
        ywq0 ywq0Var = (ywq0) this.f23789a;
        ikt0 ikt0Var = new ikt0();
        ikt0Var.f14945a = ngw0Var;
        rfw0 rfw0Var = (rfw0) ywq0Var.c;
        hhm0.G(rfw0Var.M("/token", (String) ywq0Var.f), y60Var, ikt0Var, new zzaia(), (fht0) rfw0Var.b);
    }

    @Override // a.jix0
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((lix0) this.f23789a).b(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public nmt0(ArrayList arrayList) {
        this.f23789a = Collections.unmodifiableList(arrayList);
    }

    public nmt0(jau0 jau0Var) {
        jau0Var.getClass();
        this.f23789a = jau0Var;
    }

    public nmt0(fmg0 fmg0Var) {
        fmg0Var.getClass();
        this.f23789a = fmg0Var;
    }

    public /* synthetic */ nmt0(Object obj) {
        this.f23789a = obj;
    }
}
