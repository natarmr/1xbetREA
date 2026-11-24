package a;

import android.app.Application;
import android.content.Context;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.PhoneAuthCredential;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Mac;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class hcp0 implements OnCompleteListener, r9x0, efw0, nmw0, Continuation, r2x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12835a;
    public Object b;
    public Object c;

    public hcp0(gii0 gii0Var, byte b) {
        this.f12835a = b;
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.b = gii0Var;
                this.c = new rbt0(this, (byte) 24);
                break;
            default:
                this.b = gii0Var;
                this.c = new nxo0(this, (byte) 10);
                break;
        }
    }

    public static hcp0 w(fix0 fix0Var) throws GeneralSecurityException {
        int i = f3x0.f8885a[fix0Var.ordinal()];
        boolean z = false;
        byte b = 21;
        byte b2 = 6;
        if (i == 1) {
            return new hcp0(new h70("HmacSha256", b2), fix0.f9611a, z, b);
        }
        if (i == 2) {
            return new hcp0(new h70("HmacSha384", b2), fix0.b, z, b);
        }
        if (i == 3) {
            return new hcp0(new h70("HmacSha512", b2), fix0.c, z, b);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(fix0Var)));
    }

    @Override // a.efw0
    public void a(Status status) {
        try {
            ((efw0) this.b).a(status);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Override // a.efw0
    public void b(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            ((efw0) this.b).b(status, phoneAuthCredential);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Override // a.efw0
    public void c(cmt0 cmt0Var) {
        try {
            ((efw0) this.b).c(cmt0Var);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    @Override // a.efw0
    public void d(zzaia zzaiaVar, biw0 biw0Var) {
        try {
            ((efw0) this.b).d(zzaiaVar, biw0Var);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    @Override // a.r9x0
    public byte[] e(byte[] bArr, int i) {
        return bArr.length <= 64 ? ((t9x0) this.b).e(bArr, i) : ((u9x0) this.c).e(bArr, i);
    }

    @Override // a.efw0
    public void f(zzaia zzaiaVar) {
        try {
            ((efw0) this.b).f(zzaiaVar);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    @Override // a.nmw0
    public h0q0 g(jlw0 jlw0Var) {
        h0q0 h0q0VarJ = ((h0q0) this.b).J();
        String str = (String) this.c;
        h0q0VarJ.N(str, jlw0Var);
        ((HashMap) h0q0VarJ.d).put(str, Boolean.TRUE);
        return h0q0VarJ;
    }

    @Override // a.efw0
    public void h(fht0 fht0Var) {
        try {
            ((efw0) this.b).h(fht0Var);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    @Override // a.efw0
    public void i(jiw0 jiw0Var) {
        try {
            ((efw0) this.b).i(jiw0Var);
        } catch (RemoteException e) {
            ((zz2) this.c).i("RemoteException when sending get recaptcha config response.", e, new Object[0]);
        }
    }

    @Override // a.r2x0
    public byte[] j(byte[] bArr, fck0 fck0Var) throws GeneralSecurityException {
        fix0 fix0Var = (fix0) this.b;
        byte[] bArrB = ((icw0) fck0Var.b).b();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(ibm0.E(bArrB), ghm0.z(fix0Var));
        gix0 gix0Var = gix0.f;
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) gix0Var.f11371a.zza("EC")).generatePrivate(eCPrivateKeySpec);
        ECParameterSpec eCParameterSpecZ = ghm0.z(fix0Var);
        byte[] bArrB2 = ghm0.B(eCPrivateKey, (ECPublicKey) ((KeyFactory) gix0Var.f11371a.zza("EC")).generatePublic(new ECPublicKeySpec(ghm0.A(eCParameterSpecZ.getCurve(), eix0.f7881a, bArr), eCParameterSpecZ)));
        byte[] bArrB3 = egm0.B(bArr, ((icw0) fck0Var.c).b());
        byte[] bArrB4 = egm0.B(c3x0.m, zza());
        h70 h70Var = (h70) this.c;
        int macLength = Mac.getInstance(h70Var.b).getMacLength();
        byte[] bArr2 = c3x0.o;
        Charset charset = x7x0.f40437a;
        return h70Var.a(macLength, h70Var.b(egm0.B(bArr2, bArrB4, "eae_prk".getBytes(charset), bArrB2), null), egm0.B(c3x0.b(2, macLength), bArr2, bArrB4, "shared_secret".getBytes(charset), bArrB3));
    }

    public View k(int i, int i2, int i3, int i4) {
        ku5 ku5Var = (ku5) this.c;
        zfu0 zfu0Var = (zfu0) this.b;
        int iB = zfu0Var.b();
        int iF = zfu0Var.f();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewG = zfu0Var.g(i);
            int iA = zfu0Var.a(viewG);
            int iH = zfu0Var.h(viewG);
            ku5Var.c = iB;
            ku5Var.d = iF;
            ku5Var.e = iA;
            ku5Var.f = iH;
            if (i3 != 0) {
                ku5Var.b = i3;
                if (ku5Var.a()) {
                    return viewG;
                }
            }
            if (i4 != 0) {
                ku5Var.b = i4;
                if (ku5Var.a()) {
                    view = viewG;
                }
            }
            i += i5;
        }
        return view;
    }

    public tft0 l(fay fayVar) {
        tft0 tft0VarZ;
        kzj0 kzj0Var = fayVar.f;
        return (kzj0Var == null || (tft0VarZ = vsm0.z(kzj0Var)) == null) ? (a2o) ((n0o0) this.b).getValue() : tft0VarZ;
    }

    public wsy m(hzs0 hzs0Var, fay fayVar) {
        hzs0Var.getClass();
        fayVar.getClass();
        return (wsy) ((zt00) this.c).invoke(new ozs0(hzs0Var, fayVar));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object n(int i, zje zjeVar, String str, String str2) {
        dqr0 dqr0Var;
        String str3;
        xpr0 xpr0Var;
        if (zjeVar instanceof dqr0) {
            dqr0Var = (dqr0) zjeVar;
            int i2 = dqr0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqr0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                dqr0Var = new dqr0(this, zjeVar);
            }
        } else {
            dqr0Var = new dqr0(this, zjeVar);
        }
        dqr0 dqr0Var2 = dqr0Var;
        Object objA = dqr0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = dqr0Var2.l;
        if (i3 == 0) {
            z1x.P(objA);
            pmi0 pmi0Var = (pmi0) this.c;
            String strC = ((knf0) this.b).c();
            str3 = str2;
            dqr0Var2.i = str3;
            dqr0Var2.l = 1;
            objA = ((nqr0) ((lkr0) pmi0Var.f27236a).invoke()).a(strC, str, i, 1, 70, dqr0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = dqr0Var2.i;
            z1x.P(objA);
            str3 = str4;
        }
        Iterable<bqr0> iterable = ((gqr0) ((dx5) objA).a()).f11747a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (bqr0 bqr0Var : iterable) {
            bqr0Var.getClass();
            Integer num = bqr0Var.f3047a;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            Long l = bqr0Var.i;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            y2m0 y2m0Var = xpr0.b;
            Integer num2 = bqr0Var.b;
            if (num2 == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue2 = num2.intValue();
            y2m0Var.getClass();
            xpr0[] xpr0VarArrValues = xpr0.values();
            int length = xpr0VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    xpr0Var = xpr0.CANCELED;
                    break;
                }
                xpr0Var = xpr0VarArrValues[i4];
                if (iIntValue2 == xpr0Var.f41282a) {
                    break;
                }
                i4++;
            }
            xpr0 xpr0Var2 = xpr0Var;
            String str5 = bqr0Var.c;
            if (str5 == null) {
                jf4.k(null);
                return null;
            }
            String str6 = bqr0Var.d;
            if (str6 == null) {
                jf4.k(null);
                return null;
            }
            Integer num3 = bqr0Var.e;
            if (num3 == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue3 = num3.intValue();
            String strValueOf = String.valueOf(bqr0Var.f);
            Integer num4 = bqr0Var.g;
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            Long l2 = bqr0Var.h;
            arrayList.add(new ypr0(iIntValue, xpr0Var2, str5, str6, iIntValue3, strValueOf, iIntValue4, jLongValue, l2 != null ? l2.longValue() : 0L));
        }
        return new cqr0(str3, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Serializable o(String str, String str2, zje zjeVar) {
        hfs0 hfs0Var;
        if (zjeVar instanceof hfs0) {
            hfs0Var = (hfs0) zjeVar;
            int i = hfs0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hfs0Var.k = i - Integer.MIN_VALUE;
            } else {
                hfs0Var = new hfs0(this, zjeVar);
            }
        } else {
            hfs0Var = new hfs0(this, zjeVar);
        }
        hfs0 hfs0Var2 = hfs0Var;
        Object objA = hfs0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = hfs0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            ani0 ani0Var = (ani0) this.b;
            String strA = ((btt0) this.c).a();
            hfs0Var2.k = 1;
            objA = ((oes0) ((lkr0) ani0Var.f1155a).invoke()).a(strA, str, str2, "application/vnd.xenvelop+json", hfs0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable<q7w> iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (q7w q7wVar : iterable) {
            q7wVar.getClass();
            Long l = q7wVar.f28271a;
            long jLongValue = l != null ? l.longValue() : 0L;
            Double d = q7wVar.b;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
            Double d2 = q7wVar.c;
            if (d2 != null) {
                dDoubleValue = d2.doubleValue();
            }
            arrayList.add(new n7w(dDoubleValue2, dDoubleValue, jLongValue));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        h5w0 h5w0Var = (h5w0) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (h5w0Var.f) {
            h5w0Var.e.remove(taskCompletionSource);
        }
    }

    public Object p(long j, boolean z, long j2, long j3, yje yjeVar) throws n7p {
        tnp0 rnp0Var = j2 == 40 ? new rnp0(j, j2, j3, null) : new snp0(j, j2);
        if (z) {
            Object objT = ((phf0) this.c).t(rnp0Var, yjeVar);
            return objT == wne.f39444a ? objT : Unit.f46060a;
        }
        Object objU = ((es) this.b).u(rnp0Var, yjeVar);
        return objU == wne.f39444a ? objU : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(zje zjeVar) {
        gnt0 gnt0Var;
        if (zjeVar instanceof gnt0) {
            gnt0Var = (gnt0) zjeVar;
            int i = gnt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnt0Var.k = i - Integer.MIN_VALUE;
            } else {
                gnt0Var = new gnt0(this, zjeVar);
            }
        } else {
            gnt0Var = new gnt0(this, zjeVar);
        }
        Object objD0 = gnt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gnt0Var.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objD0);
            rrd rrdVar = (rrd) this.b;
            tl5 tl5Var = tl5.f34128a;
            gnt0Var.k = 1;
            objD0 = qjj.d0(((mne) rrdVar.h).b, new qv3(rrdVar, null), gnt0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        for (Object obj2 : (Iterable) objD0) {
            if (((ql5) obj2).i == txs0.d) {
                obj = obj2;
                break;
            }
        }
        ql5 ql5Var = (ql5) obj;
        if (ql5Var != null) {
            ((gst0) this.c).h(ql5Var.c, ql5Var.d);
        }
        return Unit.f46060a;
    }

    public void r(pym0 pym0Var) {
        Object value;
        Object value2;
        ezk ezkVar;
        ezk ezkVar2;
        ezk ezkVar3;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        j1q0 j1q0Var = (j1q0) this.b;
        if (pym0Var instanceof auq0) {
            boolean z = !((auq0) pym0Var).f1491a;
            m1q0 m1q0Var = j1q0Var.f15748a;
            m1q0Var.f21021a.d("WEB_VIEW_DEBUGGABLE", z);
            p7m0 p7m0Var = m1q0Var.b;
            do {
                value7 = p7m0Var.getValue();
            } while (!p7m0Var.m(value7, ghp.a((ghp) value7, false, false, false, false, false, false, false, z, false, false, false, false, false, false, false, false, false, false, false, 1048447)));
            return;
        }
        if (pym0Var instanceof ztq0) {
            boolean z2 = !((ztq0) pym0Var).f44974a;
            m1q0 m1q0Var2 = j1q0Var.f15748a;
            m1q0Var2.f21021a.d("TEST_AGGREGATOR", z2);
            p7m0 p7m0Var2 = m1q0Var2.b;
            do {
                value6 = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value6, ghp.a((ghp) value6, false, false, false, false, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048559)));
            return;
        }
        if (pym0Var instanceof buq0) {
            boolean z3 = !((buq0) pym0Var).f3245a;
            m1q0 m1q0Var3 = j1q0Var.f15748a;
            m1q0Var3.f21021a.d("CHECK_GEO", z3);
            p7m0 p7m0Var3 = m1q0Var3.b;
            do {
                value5 = p7m0Var3.getValue();
            } while (!p7m0Var3.m(value5, ghp.a((ghp) value5, false, false, false, false, false, z3, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048543)));
            return;
        }
        if (pym0Var instanceof juq0) {
            boolean z4 = !((juq0) pym0Var).f17170a;
            m1q0 m1q0Var4 = j1q0Var.f15748a;
            p7m0 p7m0Var4 = m1q0Var4.b;
            do {
                value4 = p7m0Var4.getValue();
            } while (!p7m0Var4.m(value4, ghp.a((ghp) value4, false, false, false, z4, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048567)));
            m1q0Var4.f21021a.d("SHOW_TEST_BANNER", z4);
            return;
        }
        if (pym0Var instanceof kuq0) {
            boolean z5 = !((kuq0) pym0Var).f18924a;
            m1q0 m1q0Var5 = j1q0Var.f15748a;
            m1q0Var5.f21021a.d("MARKET_NUMBER_VISIBILITY", z5);
            p7m0 p7m0Var5 = m1q0Var5.b;
            do {
                value3 = p7m0Var5.getValue();
            } while (!p7m0Var5.m(value3, ghp.a((ghp) value3, false, false, false, false, false, false, z5, false, false, false, false, false, false, false, false, false, false, false, false, 1048511)));
            return;
        }
        if (pym0Var instanceof ruq0) {
            m1q0 m1q0Var6 = j1q0Var.f15748a;
            m1q0 m1q0Var7 = j1q0Var.f15748a;
            if (m1q0Var6.p()) {
                j1q0Var.i(false);
            }
            if (m1q0Var7.g()) {
                j1q0Var.d(false);
            }
            j1q0Var.h(!((ruq0) pym0Var).f31138a);
            if (m1q0Var7.o()) {
                ezkVar3 = ezk.b;
            } else if (m1q0Var7.p()) {
                ezkVar3 = ezk.c;
            } else {
                ezkVar3 = m1q0Var7.g() ? ezk.d : ezk.f8675a;
            }
            m1q0Var7.g = ezkVar3;
            return;
        }
        if (pym0Var instanceof suq0) {
            m1q0 m1q0Var8 = j1q0Var.f15748a;
            m1q0 m1q0Var9 = j1q0Var.f15748a;
            if (m1q0Var8.o()) {
                j1q0Var.h(false);
            }
            if (m1q0Var9.g()) {
                j1q0Var.d(false);
            }
            j1q0Var.i(!((suq0) pym0Var).f32834a);
            if (m1q0Var9.o()) {
                ezkVar2 = ezk.b;
            } else if (m1q0Var9.p()) {
                ezkVar2 = ezk.c;
            } else {
                ezkVar2 = m1q0Var9.g() ? ezk.d : ezk.f8675a;
            }
            m1q0Var9.g = ezkVar2;
            return;
        }
        if (pym0Var instanceof guq0) {
            m1q0 m1q0Var10 = j1q0Var.f15748a;
            m1q0 m1q0Var11 = j1q0Var.f15748a;
            if (m1q0Var10.p()) {
                j1q0Var.i(false);
            }
            if (m1q0Var11.o()) {
                j1q0Var.h(false);
            }
            j1q0Var.d(!((guq0) pym0Var).f11942a);
            if (m1q0Var11.o()) {
                ezkVar = ezk.b;
            } else if (m1q0Var11.p()) {
                ezkVar = ezk.c;
            } else {
                ezkVar = m1q0Var11.g() ? ezk.d : ezk.f8675a;
            }
            m1q0Var11.g = ezkVar;
            return;
        }
        if (pym0Var instanceof muq0) {
            if (j1q0Var.f15748a.m()) {
                j1q0Var.f(false);
            }
            j1q0Var.e(!((muq0) pym0Var).f22424a);
            return;
        }
        if (pym0Var instanceof nuq0) {
            if (j1q0Var.f15748a.l()) {
                j1q0Var.e(false);
            }
            j1q0Var.f(!((nuq0) pym0Var).f24158a);
            return;
        }
        if (pym0Var instanceof luq0) {
            boolean z6 = !((luq0) pym0Var).f20685a;
            m1q0 m1q0Var12 = j1q0Var.f15748a;
            m1q0Var12.f21021a.d("SHOW_PUSH_INFO", z6);
            p7m0 p7m0Var6 = m1q0Var12.b;
            do {
                value2 = p7m0Var6.getValue();
            } while (!p7m0Var6.m(value2, ghp.a((ghp) value2, false, false, false, false, false, false, false, false, false, false, z6, false, false, false, false, false, false, false, false, 1047551)));
            return;
        }
        if (pym0Var instanceof duq0) {
            boolean z7 = !((duq0) pym0Var).f6709a;
            m1q0 m1q0Var13 = j1q0Var.f15748a;
            m1q0Var13.f21021a.d("HIGHLIGHT_DESIGN_SYSTEM", z7);
            p7m0 p7m0Var7 = m1q0Var13.b;
            do {
                value = p7m0Var7.getValue();
            } while (!p7m0Var7.m(value, ghp.a((ghp) value, false, false, false, false, false, false, false, false, false, false, false, z7, false, false, false, false, false, false, false, 1046527)));
            return;
        }
        if (pym0Var instanceof ouq0) {
            boolean z8 = !((ouq0) pym0Var).f25889a;
            m1q0 m1q0Var14 = j1q0Var.f15748a;
            m1q0Var14.f21021a.d("SPECIAL_EVENT_ENABLE", z8);
            p7m0 p7m0Var8 = m1q0Var14.b;
            while (true) {
                Object value8 = p7m0Var8.getValue();
                boolean z9 = z8;
                if (p7m0Var8.m(value8, ghp.a((ghp) value8, false, false, false, false, false, false, false, false, false, false, false, false, z9, false, false, false, false, false, false, 1044479))) {
                    return;
                } else {
                    z8 = z9;
                }
            }
        } else if (pym0Var instanceof iuq0) {
            boolean z10 = !((iuq0) pym0Var).f15409a;
            m1q0 m1q0Var15 = j1q0Var.f15748a;
            m1q0Var15.f21021a.d("NEW_ALT_APP_START_PARTNER", z10);
            p7m0 p7m0Var9 = m1q0Var15.b;
            while (true) {
                Object value9 = p7m0Var9.getValue();
                boolean z11 = z10;
                if (p7m0Var9.m(value9, ghp.a((ghp) value9, false, false, false, false, false, false, false, false, false, false, false, false, false, z11, false, false, false, false, false, 1040383))) {
                    return;
                } else {
                    z10 = z11;
                }
            }
        } else {
            if (pym0Var instanceof cuq0) {
                boolean z12 = ((cuq0) pym0Var).f4999a;
                xaq0 xaq0Var = (xaq0) this.c;
                yje yjeVar = null;
                if (!z12) {
                    waq0 waq0Var = xaq0Var.f40570a;
                    p7m0 p7m0Var10 = waq0Var.e;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var10.getClass();
                    p7m0Var10.o(null, bool);
                    waq0Var.f = sac.V((vne) waq0Var.c.getValue(), vaq0.f37104a, null, null, new z2n0(waq0Var, yjeVar, (byte) 14), 14);
                    return;
                }
                waq0 waq0Var2 = xaq0Var.f40570a;
                p7m0 p7m0Var11 = waq0Var2.e;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var11.getClass();
                p7m0Var11.o(null, bool2);
                waq0Var2.d.n(null);
                bby bbyVar = waq0Var2.f;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                    return;
                }
                return;
            }
            if (pym0Var instanceof puq0) {
                boolean z13 = !((puq0) pym0Var).f27630a;
                m1q0 m1q0Var16 = j1q0Var.f15748a;
                m1q0Var16.f21021a.d("TEST_DOMAIN_ENABLED", z13);
                p7m0 p7m0Var12 = m1q0Var16.b;
                while (true) {
                    Object value10 = p7m0Var12.getValue();
                    boolean z14 = z13;
                    if (p7m0Var12.m(value10, ghp.a((ghp) value10, false, false, false, false, false, false, false, false, false, false, false, false, false, false, z14, false, false, false, false, 1015807))) {
                        return;
                    } else {
                        z13 = z14;
                    }
                }
            } else {
                if (pym0Var instanceof quq0) {
                    j1q0Var.g(!((quq0) pym0Var).f29358a);
                    return;
                }
                if (pym0Var instanceof tuq0) {
                    boolean z15 = !((tuq0) pym0Var).f34563a;
                    m1q0 m1q0Var17 = j1q0Var.f15748a;
                    m1q0Var17.f21021a.d("TEST_TOOLS_ENABLED", z15);
                    p7m0 p7m0Var13 = m1q0Var17.b;
                    while (true) {
                        Object value11 = p7m0Var13.getValue();
                        boolean z16 = z15;
                        if (p7m0Var13.m(value11, ghp.a((ghp) value11, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, z16, false, false, false, 983039))) {
                            return;
                        } else {
                            z15 = z16;
                        }
                    }
                } else if (pym0Var instanceof fuq0) {
                    boolean z17 = !((fuq0) pym0Var).f10177a;
                    m1q0 m1q0Var18 = j1q0Var.f15748a;
                    m1q0Var18.f21021a.d("LOG_FAILED_EVENT", z17);
                    p7m0 p7m0Var14 = m1q0Var18.b;
                    while (true) {
                        Object value12 = p7m0Var14.getValue();
                        boolean z18 = z17;
                        if (p7m0Var14.m(value12, ghp.a((ghp) value12, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, z18, 524287))) {
                            return;
                        } else {
                            z17 = z18;
                        }
                    }
                } else {
                    if (!(pym0Var instanceof euq0)) {
                        if (pym0Var instanceof huq0) {
                            j1q0Var.f15748a.f21021a.d("TEST_MULTIPLY_STRINGS_ENABLE", !((huq0) pym0Var).f13694a);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    boolean z19 = !((euq0) pym0Var).f8435a;
                    m1q0 m1q0Var19 = j1q0Var.f15748a;
                    m1q0Var19.f21021a.d("INTERNET_EMULATION_ENABLED", z19);
                    p7m0 p7m0Var15 = m1q0Var19.b;
                    while (true) {
                        Object value13 = p7m0Var15.getValue();
                        boolean z20 = z19;
                        if (p7m0Var15.m(value13, ghp.a((ghp) value13, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, z20, false, 786431))) {
                            return;
                        } else {
                            z19 = z20;
                        }
                    }
                }
            }
        }
    }

    public boolean s(View view) {
        ku5 ku5Var = (ku5) this.c;
        zfu0 zfu0Var = (zfu0) this.b;
        int iB = zfu0Var.b();
        int iF = zfu0Var.f();
        int iA = zfu0Var.a(view);
        int iH = zfu0Var.h(view);
        ku5Var.c = iB;
        ku5Var.d = iF;
        ku5Var.e = iA;
        ku5Var.f = iH;
        ku5Var.b = 24579;
        return ku5Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r8.F(r9, r10, r1) == r2) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(a.vne r8, a.xdr r9, a.zje r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            a.q99 r0 = (a.q99) r0
            boolean r1 = r10 instanceof a.fuv0
            if (r1 == 0) goto L17
            r1 = r10
            a.fuv0 r1 = (a.fuv0) r1
            int r2 = r1.n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.n = r2
            goto L1c
        L17:
            a.fuv0 r1 = new a.fuv0
            r1.<init>(r7, r10)
        L1c:
            java.lang.Object r10 = r1.l
            a.wne r2 = a.wne.f39444a
            int r3 = r1.n
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L48
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L37
            a.j99 r7 = r1.k
            a.xdr r8 = r1.j
            a.vne r9 = r1.i
            a.z1x.P(r10)
        L33:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L5f
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L3e:
            a.j99 r7 = r1.k
            a.xdr r8 = r1.j
            a.vne r9 = r1.i
            a.z1x.P(r10)
            goto L71
        L48:
            a.z1x.P(r10)
        L4b:
            java.lang.Object r10 = r0.j()
            boolean r10 = r10 instanceof a.ytb
            if (r10 == 0) goto L4b
            java.lang.Object r7 = r7.b
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r7.invoke()
            a.j99 r7 = new a.j99
            r7.<init>(r0)
        L5f:
            r1.i = r8
            r1.j = r9
            r1.k = r7
            r1.n = r5
            java.lang.Object r10 = r7.b(r1)
            if (r10 != r2) goto L6e
            goto L8b
        L6e:
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r7.c()
            r1.i = r9
            r1.j = r8
            r1.k = r7
            r1.n = r4
            java.lang.Object r10 = r8.F(r9, r10, r1)
            if (r10 != r2) goto L33
        L8b:
            return r2
        L8c:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hcp0.t(a.vne, a.xdr, a.zje):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            s0x.H(exception);
            String message = exception.getMessage();
            s0x.H(message);
            return Tasks.forException(new hnw0(message));
        }
        jiw0 jiw0Var = (jiw0) task.getResult();
        String str = jiw0Var.f16595a;
        if (str == null || str.isEmpty()) {
            return Tasks.forException(new hnw0(kng0.k("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.b)));
        }
        gvw0 gvw0Var = new gvw0('/');
        w4p0 w4p0Var = new w4p0((byte) 27);
        w4p0Var.b = gvw0Var;
        List listD = new ikt0(w4p0Var).d(str);
        String str2 = listD.size() != 4 ? null : (String) listD.get(3);
        if (TextUtils.isEmpty(str2)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(str)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.b));
        }
        zcw0 zcw0Var = (zcw0) this.c;
        Object obj = zcw0Var.f;
        nfq nfqVar = (nfq) zcw0Var.d;
        nfqVar.a();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient((Application) nfqVar.f23449a, str2);
        zcw0 zcw0Var2 = (zcw0) this.c;
        String str3 = (String) this.b;
        synchronized (zcw0Var2.f44186a) {
            zcw0Var2.c = jiw0Var;
            ((HashMap) zcw0Var2.b).put(str3, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }

    public String toString() {
        switch (this.f12835a) {
            case 13:
                return "Bounds{lower=" + ((pfx) this.b) + " upper=" + ((pfx) this.c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    public yni0 u(xzs0 xzs0Var, List list, fay fayVar) {
        tft0 tft0VarZ;
        vzs0 vzs0Var = xzs0Var.f41769a;
        yni0 yni0Var = new yni0();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            wsy wsyVar = (wsy) it.next();
            foc focVarN = wsyVar.S().n();
            if (focVarN instanceof wm40) {
                Set set = fayVar.e;
                tft0 tft0VarJ0 = wsyVar.j0();
                if (tft0VarJ0 instanceof kkq) {
                    kkq kkqVar = (kkq) tft0VarJ0;
                    kzj0 kzj0VarZ = kkqVar.b;
                    if (!kzj0VarZ.S().getParameters().isEmpty() && kzj0VarZ.S().n() != null) {
                        List<hzs0> parameters = kzj0VarZ.S().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
                        for (hzs0 hzs0Var : parameters) {
                            pzs0 q4m0Var = (pzs0) CollectionsKt.W(hzs0Var.getIndex(), wsyVar.J());
                            boolean z = set != null && set.contains(hzs0Var);
                            if (q4m0Var == null || z) {
                                q4m0Var = new q4m0(hzs0Var);
                            } else {
                                wsy wsyVarB = q4m0Var.b();
                                wsyVarB.getClass();
                                if (vzs0Var.d(wsyVarB) == null) {
                                    q4m0Var = new q4m0(hzs0Var);
                                }
                            }
                            arrayList.add(q4m0Var);
                        }
                        kzj0VarZ = qsm0.z(kzj0VarZ, arrayList, null, 2);
                    }
                    kzj0 kzj0VarZ2 = kkqVar.c;
                    if (!kzj0VarZ2.S().getParameters().isEmpty() && kzj0VarZ2.S().n() != null) {
                        List<hzs0> parameters2 = kzj0VarZ2.S().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(parameters2, 10));
                        for (hzs0 hzs0Var2 : parameters2) {
                            pzs0 q4m0Var2 = (pzs0) CollectionsKt.W(hzs0Var2.getIndex(), wsyVar.J());
                            boolean z2 = set != null && set.contains(hzs0Var2);
                            if (q4m0Var2 == null || z2) {
                                q4m0Var2 = new q4m0(hzs0Var2);
                            } else {
                                wsy wsyVarB2 = q4m0Var2.b();
                                wsyVarB2.getClass();
                                if (vzs0Var.d(wsyVarB2) == null) {
                                    q4m0Var2 = new q4m0(hzs0Var2);
                                }
                            }
                            arrayList2.add(q4m0Var2);
                        }
                        kzj0VarZ2 = qsm0.z(kzj0VarZ2, arrayList2, null, 2);
                    }
                    tft0VarZ = ucx.W(kzj0VarZ, kzj0VarZ2);
                } else {
                    if (!(tft0VarJ0 instanceof kzj0)) {
                        t9f.b();
                        return null;
                    }
                    kzj0 kzj0Var = (kzj0) tft0VarJ0;
                    if (kzj0Var.S().getParameters().isEmpty() || kzj0Var.S().n() == null) {
                        tft0VarZ = kzj0Var;
                    } else {
                        List<hzs0> parameters3 = kzj0Var.S().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(parameters3, 10));
                        for (hzs0 hzs0Var3 : parameters3) {
                            pzs0 q4m0Var3 = (pzs0) CollectionsKt.W(hzs0Var3.getIndex(), wsyVar.J());
                            boolean z3 = set != null && set.contains(hzs0Var3);
                            if (q4m0Var3 == null || z3) {
                                q4m0Var3 = new q4m0(hzs0Var3);
                            } else {
                                wsy wsyVarB3 = q4m0Var3.b();
                                wsyVarB3.getClass();
                                if (vzs0Var.d(wsyVarB3) == null) {
                                    q4m0Var3 = new q4m0(hzs0Var3);
                                }
                            }
                            arrayList3.add(q4m0Var3);
                        }
                        tft0VarZ = qsm0.z(kzj0Var, arrayList3, null, 2);
                    }
                }
                yni0Var.add(xzs0Var.f(xsm0.n(tft0VarZ, tft0VarJ0), t3u0.e));
            } else if (focVarN instanceof hzs0) {
                Set set2 = fayVar.e;
                if (set2 == null || !set2.contains(focVarN)) {
                    List upperBounds = ((hzs0) focVarN).getUpperBounds();
                    upperBounds.getClass();
                    yni0Var.addAll(u(xzs0Var, upperBounds, fayVar));
                } else {
                    yni0Var.add(l(fayVar));
                }
            }
        }
        return cui0.a(yni0Var);
    }

    public synchronized void v(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    f1t0.g0("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    f1t0.g0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public zyw0 x() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            hny.o("Key size is not set");
            return null;
        }
        if (((drq) this.c) != null) {
            return new zyw0(num.intValue(), (drq) this.c);
        }
        hny.o("Variant is not set");
        return null;
    }

    public void y(int i) throws InvalidAlgorithmParameterException {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    @Override // a.r2x0
    public byte[] zza() throws GeneralSecurityException {
        int i = f3x0.f8885a[((fix0) this.b).ordinal()];
        if (i == 1) {
            return c3x0.c;
        }
        if (i == 2) {
            return c3x0.d;
        }
        if (i == 3) {
            return c3x0.e;
        }
        hny.o("Could not determine HPKE KEM ID");
        return null;
    }

    public /* synthetic */ hcp0(Object obj, Object obj2, byte b) {
        this.f12835a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hcp0(Object obj, Object obj2, boolean z, byte b) {
        this.f12835a = b;
        this.c = obj;
        this.b = obj2;
    }

    public hcp0(q7d0 q7d0Var) {
        this.f12835a = (byte) 6;
        q7d0Var.getClass();
        this.b = q7d0Var;
        this.c = "";
    }

    public hcp0(Function0 function0) {
        this.f12835a = (byte) 14;
        this.b = function0;
        this.c = vtb.d(Integer.MAX_VALUE, null, null, 6);
    }

    public hcp0(efw0 efw0Var, zz2 zz2Var) {
        this.f12835a = (byte) 17;
        s0x.H(efw0Var);
        this.b = efw0Var;
        s0x.H(zz2Var);
        this.c = zz2Var;
    }

    public hcp0(ani0 ani0Var, btt0 btt0Var) {
        this.f12835a = (byte) 4;
        btt0Var.getClass();
        this.b = ani0Var;
        this.c = btt0Var;
    }

    public /* synthetic */ hcp0(byte b) {
        this.f12835a = b;
    }

    public hcp0(rrd rrdVar, gst0 gst0Var) {
        this.f12835a = (byte) 9;
        gst0Var.getClass();
        this.b = rrdVar;
        this.c = gst0Var;
    }

    public hcp0(knf0 knf0Var, pmi0 pmi0Var) {
        this.f12835a = (byte) 3;
        knf0Var.getClass();
        this.b = knf0Var;
        this.c = pmi0Var;
    }

    public hcp0(j1q0 j1q0Var, xaq0 xaq0Var, j6m0 j6m0Var) {
        this.f12835a = (byte) 1;
        j1q0Var.getClass();
        xaq0Var.getClass();
        this.b = j1q0Var;
        this.c = xaq0Var;
    }

    public hcp0(gst0 gst0Var, okt0 okt0Var) {
        this.f12835a = (byte) 8;
        gst0Var.getClass();
        this.b = gst0Var;
        this.c = okt0Var;
    }

    public hcp0(xi70 xi70Var) {
        this.f12835a = (byte) 5;
        eu00 eu00Var = new eu00("Type parameter upper bound erasure results");
        this.b = maz.b(new cvs0(this, (byte) 5));
        this.c = eu00Var.c(new caz(this, (byte) 24));
    }

    public hcp0(zcw0 zcw0Var, String str) {
        this.f12835a = (byte) 19;
        this.b = str;
        Objects.requireNonNull(zcw0Var);
        this.c = zcw0Var;
    }

    public hcp0(zfu0 zfu0Var) {
        this.f12835a = (byte) 10;
        this.b = zfu0Var;
        ku5 ku5Var = new ku5();
        ku5Var.b = 0;
        this.c = ku5Var;
    }

    public hcp0(Context context) {
        this.f12835a = (byte) 11;
        this.b = context;
    }

    public hcp0(WindowInsetsAnimation.Bounds bounds) {
        this.f12835a = (byte) 13;
        this.b = pfx.d(bounds.getLowerBound());
        this.c = pfx.d(bounds.getUpperBound());
    }
}
