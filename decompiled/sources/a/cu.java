package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cu implements nae0 {
    public static final baf e = new baf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4965a;
    public Object b;
    public Object c;
    public Object d;

    public cu(Context context) {
        this.f4965a = (byte) 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(n6x.U(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.e.class.getCanonicalName()).data, rpd0.A);
        this.b = wsf0.d(typedArrayObtainStyledAttributes.getResourceId(4, 0), context);
        wsf0.d(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
        wsf0.d(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
        wsf0.d(typedArrayObtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList colorStateListA = g7x.A(7, context, typedArrayObtainStyledAttributes);
        this.c = wsf0.d(typedArrayObtainStyledAttributes.getResourceId(9, 0), context);
        wsf0.d(typedArrayObtainStyledAttributes.getResourceId(8, 0), context);
        this.d = wsf0.d(typedArrayObtainStyledAttributes.getResourceId(10, 0), context);
        new Paint().setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void d() {
        if (((Boolean) new oye(0, e, baf.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 9).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void e() {
        if (((Boolean) new oye(0, e, baf.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 10).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public boolean a() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public e70 b() throws GeneralSecurityException {
        iw20 iw20Var;
        i70 i70Var = (i70) this.b;
        if (i70Var == null || (iw20Var = (iw20) this.c) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (i70Var.b != ((sg9) iw20Var.f15470a).f32150a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        h70 h70Var = i70Var.c;
        h70 h70Var2 = h70.e;
        if (h70Var != h70Var2 && ((Integer) this.d) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (h70Var == h70Var2 && ((Integer) this.d) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (h70Var == h70Var2) {
            sg9.a(new byte[0]);
        } else if (h70Var == h70.d) {
            sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
        } else {
            if (h70Var != h70.c) {
                hny.w(((i70) this.b).c, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
        }
        return new e70();
    }

    public q55 c() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((mwb0) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new q55((String) this.b, (byte[]) this.c, (mwb0) this.d);
        }
        jf4.n("Missing required properties:".concat(strConcat));
        return null;
    }

    public nv20 f() {
        btt0 btt0Var = (btt0) this.b;
        return new nv20(new z220((knf0) this.d, (gii0) this.c, btt0Var));
    }

    public nr00 g() {
        btt0 btt0Var = (btt0) this.b;
        return new nr00(new z220((knf0) this.d, (gii0) this.c, btt0Var));
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public long[] n(Fragment fragment, iiy iiyVar) {
        Object g0g0Var;
        fragment.getClass();
        iiyVar.getClass();
        long[] jArr = (long[]) this.d;
        if (jArr != null) {
            return jArr;
        }
        long[] jArr2 = null;
        try {
            e0g0 e0g0Var = j0g0.b;
            Bundle bundle = fragment.g;
            g0g0Var = bundle != null ? bundle.getSerializable((String) this.b) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        long[] jArr3 = g0g0Var instanceof long[] ? (long[]) g0g0Var : null;
        if (jArr3 != null) {
            this.d = jArr3;
            jArr2 = jArr3;
        }
        return jArr2 == null ? (long[]) this.c : jArr2;
    }

    public a1g i(long j, List list, iun iunVar, int i) {
        list.getClass();
        iunVar.getClass();
        return uvw.Q(((hsj) this.b).k(j, list, iunVar, ((ntu) this.c).a(), i, ((pru) this.d).a().b.N), true);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(int i, zje zjeVar) {
        frt frtVar;
        boolean zA;
        ocl oclVar;
        int i2;
        Integer num;
        ocl oclVar2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        Object objD0;
        if (zjeVar instanceof frt) {
            frtVar = (frt) zjeVar;
            int i5 = frtVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frtVar.p = i5 - Integer.MIN_VALUE;
            } else {
                frtVar = new frt(this, zjeVar);
            }
        } else {
            frtVar = new frt(this, zjeVar);
        }
        Object obj = frtVar.n;
        wne wneVar = wne.f39444a;
        int i6 = frtVar.p;
        if (i6 == 0) {
            z1x.P(obj);
            zA = ((iqt) this.c).f15225a.a();
            oclVar = (ocl) this.b;
            if (zA) {
                nou nouVar = (nou) this.d;
                frtVar.m = oclVar;
                frtVar.i = i;
                frtVar.l = zA;
                frtVar.j = i;
                frtVar.k = zA ? 1 : 0;
                frtVar.p = 1;
                Serializable serializableA = nouVar.a(tl5.c, frtVar);
                if (serializableA != wneVar) {
                    i3 = i;
                    z2 = zA ? 1 : 0;
                    obj = serializableA;
                    i4 = z2 ? 1 : 0;
                }
            } else {
                i2 = i;
                num = null;
                oclVar2 = oclVar;
                z = zA ? 1 : 0;
                frtVar.m = null;
                frtVar.i = i;
                frtVar.l = zA;
                frtVar.p = 2;
                h0q0 h0q0Var = (h0q0) oclVar2.f25032a;
                objD0 = qjj.d0(((mne) h0q0Var.c).b, new m9s0(h0q0Var, z, num, i2, null), frtVar);
                if (objD0 != wneVar) {
                    return objD0;
                }
            }
            return wneVar;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i4 = frtVar.k;
        i = frtVar.j;
        z2 = frtVar.l;
        i3 = frtVar.i;
        oclVar = frtVar.m;
        z1x.P(obj);
        boolean z3 = i4 != 0;
        i2 = i;
        num = new Integer((int) ((ql5) obj).e);
        zA = z2;
        i = i3;
        oclVar2 = oclVar;
        z = z3;
        frtVar.m = null;
        frtVar.i = i;
        frtVar.l = zA;
        frtVar.p = 2;
        h0q0 h0q0Var2 = (h0q0) oclVar2.f25032a;
        objD0 = qjj.d0(((mne) h0q0Var2.c).b, new m9s0(h0q0Var2, z, num, i2, null), frtVar);
        if (objD0 != wneVar) {
            return wneVar;
        }
        return objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, zje zjeVar) {
        hdu hduVar;
        if (zjeVar instanceof hdu) {
            hduVar = (hdu) zjeVar;
            int i = hduVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hduVar.m = i - Integer.MIN_VALUE;
            } else {
                hduVar = new hdu(this, zjeVar);
            }
        } else {
            hduVar = new hdu(this, zjeVar);
        }
        Object objA = hduVar.k;
        wne wneVar = wne.f39444a;
        int i2 = hduVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            kwt kwtVar = (kwt) this.c;
            String strA = ((ntu) this.b).a();
            boolean zA = ((k9c) this.d).a();
            hduVar.j = this;
            hduVar.i = j;
            hduVar.m = 1;
            objA = kwtVar.f19019a.a(hduVar, strA, zA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hduVar.i;
            this = hduVar.j;
            z1x.P(objA);
        }
        List list = (List) objA;
        this.getClass();
        if (j <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (j != x1x.D(((pbv) obj).e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027e, code lost:
    
        if (r13.B(r12, r0) == r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r13 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        if (r12.a(true, r0) == r4) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(a.zje r13) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cu.l(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, long j, String str2, String str3, zje zjeVar) {
        v7u v7uVar;
        String string;
        String str4;
        long j2;
        if (zjeVar instanceof v7u) {
            v7uVar = (v7u) zjeVar;
            int i = v7uVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                v7uVar.n = i - Integer.MIN_VALUE;
            } else {
                v7uVar = new v7u(this, zjeVar);
            }
        } else {
            v7uVar = new v7u(this, zjeVar);
        }
        Object objB = v7uVar.l;
        wne wneVar = wne.f39444a;
        int i2 = v7uVar.n;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objB);
            long jA = ((weu) this.c).a(str).a();
            for (Object obj2 : ((luu) this.d).f20692a.a()) {
                if (((lok0) obj2).f20396a == jA) {
                    obj = obj2;
                    break;
                }
            }
            lok0 lok0Var = (lok0) obj;
            if (j == 40) {
                string = "";
            } else if (lok0Var != null && lok0Var.o && lok0Var.n) {
                int i3 = lok0Var.f20396a;
                String strValueOf = lok0Var.u;
                strValueOf.getClass();
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("TopChamps");
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(i3);
                }
                axq.u(bzuVar, strValueOf, "backgrounds", "icon.svg");
                string = ((StringBuilder) bzuVar.b).toString();
            } else {
                StringBuilder sb = new StringBuilder(ujn.h);
                str3.getClass();
                if (str3.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str3);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str3, '/'));
                }
                string = sb.toString();
            }
            r2u r2uVar = (r2u) this.b;
            v7uVar.i = str2;
            v7uVar.j = string;
            v7uVar.k = jA;
            v7uVar.n = 1;
            objB = r2uVar.b(j, v7uVar);
            if (objB == wneVar) {
                return wneVar;
            }
            str4 = string;
            j2 = jA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = v7uVar.k;
            str4 = v7uVar.j;
            str2 = v7uVar.i;
            z1x.P(objB);
        }
        return new gdm0(j2, new ldm0((String) objB, str4, str2, new ynm0(new ynq0(0L))));
    }

    public void o(String str) {
        if (((ljj) ((p7m0) ((qz40) ((fjj) ((clc) ((cmt) this.d).b).b).b.getValue())).getValue()) == ljj.f20154a) {
            ((ht2) ((bbw0) ((peg0) this.c).b).b).f13610a.n(iun.f15405a);
        } else {
            ((ht2) ((bbw0) ((ok50) this.b).f25390a).b).a(str);
        }
    }

    public void p(String str) {
        if (str != null) {
            this.b = str;
        } else {
            hny.u("Null backendName");
        }
    }

    public void q(rs3 rs3Var) {
        rs3Var.getClass();
        this.b = rs3Var;
        ArrayList arrayList = (ArrayList) this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rs3Var.b((t7d[]) it.next());
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(yx5 yx5Var, iiy iiyVar, long[] jArr) {
        iiyVar.getClass();
        Bundle bundle = yx5Var.g;
        if (bundle == null) {
            bundle = new Bundle();
            yx5Var.s0(bundle);
        }
        bundle.putSerializable((String) this.b, jArr);
        this.d = jArr;
    }

    public void s() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public /* synthetic */ cu(Object obj, Object obj2, Object obj3, byte b) {
        this.f4965a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public cu(ywu ywuVar, rrc rrcVar, gst0 gst0Var) {
        this.f4965a = (byte) 4;
        gst0Var.getClass();
        this.b = ywuVar;
        this.c = rrcVar;
        this.d = gst0Var;
    }

    public cu(m1e m1eVar, nvu nvuVar, y3v y3vVar) {
        this.f4965a = (byte) 0;
        m1eVar.getClass();
        this.b = nvuVar;
        this.c = y3vVar;
        this.d = m1eVar;
    }

    public cu(byte b) {
        this.f4965a = b;
        switch (b) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new hz40();
                break;
            default:
                this.c = new ArrayList();
                this.d = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public cu(mne mneVar, mii0 mii0Var, gst0 gst0Var) {
        this.f4965a = (byte) 29;
        gst0Var.getClass();
        this.b = mneVar;
        this.c = mii0Var;
        this.d = gst0Var;
    }

    public cu(btt0 btt0Var, xex xexVar, knf0 knf0Var) {
        this.f4965a = (byte) 6;
        btt0Var.getClass();
        knf0Var.getClass();
        this.b = btt0Var;
        this.c = xexVar;
        this.d = knf0Var;
    }

    public cu(knf0 knf0Var, bbw0 bbw0Var, jmb jmbVar) {
        this.f4965a = (byte) 9;
        knf0Var.getClass();
        this.b = knf0Var;
        this.c = bbw0Var;
        this.d = jmbVar;
    }

    public cu(ap80 ap80Var, knf0 knf0Var, vqc vqcVar) {
        this.f4965a = (byte) 18;
        knf0Var.getClass();
        this.b = ap80Var;
        this.c = knf0Var;
        this.d = vqcVar;
    }

    public cu(ExecutorService executorService, ExecutorService executorService2) {
        this.f4965a = (byte) 1;
        executorService.getClass();
        executorService2.getClass();
        this.b = new aaf(executorService);
        this.c = new aaf(executorService);
        Tasks.forResult(null);
        this.d = new aaf(executorService2);
    }

    public cu(b0c0 b0c0Var) {
        this.f4965a = (byte) 11;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    public cu(ii iiVar, i1w0 i1w0Var, mne mneVar) {
        this.f4965a = (byte) 14;
        this.b = mneVar;
        this.c = i1w0Var;
        this.d = n0k0.a(new n8i(this, (byte) 16));
    }

    public cu(knf0 knf0Var, gii0 gii0Var, btt0 btt0Var) {
        this.f4965a = (byte) 15;
        this.b = btt0Var;
        this.c = gii0Var;
        this.d = knf0Var;
    }

    public /* synthetic */ cu(byte b, boolean z) {
        this.f4965a = b;
    }

    public cu(String str) {
        this.f4965a = (byte) 7;
        this.b = str;
        this.c = new long[0];
    }

    public cu(Signature signature) {
        this.f4965a = (byte) 20;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public cu(Cipher cipher) {
        this.f4965a = (byte) 20;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public cu(Mac mac) {
        this.f4965a = (byte) 20;
        this.d = mac;
        this.c = null;
        this.b = null;
    }
}
