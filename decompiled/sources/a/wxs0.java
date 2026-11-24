package a;

import android.app.Application;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLES31;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.apache.commons.codec.digest.DigestUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class wxs0 implements lix0, Continuation, qfw0, xmw0 {
    public static final /* synthetic */ wxs0 b = new wxs0(22);
    public static final /* synthetic */ wxs0 c = new wxs0(25);
    public static final /* synthetic */ wxs0 d = new wxs0(26);
    public static final /* synthetic */ wxs0 e = new wxs0(27);
    public static final /* synthetic */ wxs0 f = new wxs0(28);
    public static final /* synthetic */ wxs0 g = new wxs0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39945a;

    public wxs0(gii0 gii0Var, fsd fsdVar, mne mneVar, sa10 sa10Var, duj dujVar) {
        this.f39945a = (byte) 12;
        gii0Var.getClass();
        fsdVar.getClass();
    }

    public static double a(int i) {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(37074, iArr[0]);
        GLES20.glBufferData(37074, 4, ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()), 35050);
        GLES30.glBindBufferBase(37074, 0, iArr[0]);
        int i2 = (i + 255) / 256;
        try {
            long jNanoTime = System.nanoTime();
            GLES31.glDispatchCompute(i2, 1, 1);
            GLES31.glMemoryBarrier(8192);
            GLES20.glFinish();
            return (System.nanoTime() - jNanoTime) / 1000000.0d;
        } finally {
            GLES20.glDeleteBuffers(1, iArr, 0);
        }
    }

    public static int c() {
        int iGlCreateShader = GLES20.glCreateShader(37305);
        if (iGlCreateShader == 0) {
            throw new tiu0("glCreateShader failed", null, (byte) 2);
        }
        GLES20.glShaderSource(iGlCreateShader, "#version 310 es\nlayout(local_size_x = 256, local_size_y = 1, local_size_z = 1) in;\nlayout(std430, binding = 0) buffer RaceBuffer {\n    uint sharedCounter;\n};\nvoid main() {\n    atomicAdd(sharedCounter, 1u);\n}");
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            throw new tiu0(kng0.k("glCompileShader failed: ", strGlGetShaderInfoLog), null, (byte) 2);
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            GLES20.glDeleteShader(iGlCreateShader);
            throw new tiu0("glCreateProgram failed", null, (byte) 2);
        }
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glDeleteShader(iGlCreateShader);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 0) {
            return iGlCreateProgram;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new tiu0(kng0.k("glLinkProgram failed: ", strGlGetProgramInfoLog), null, (byte) 2);
    }

    public static String g(long j, String str) {
        str.getClass();
        String strValueOf = String.valueOf(j);
        strValueOf.getClass();
        byte[] bArrMd5 = DigestUtils.md5(new StringBuilder((CharSequence) strValueOf).reverse().toString());
        bArrMd5.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        byte[] bArr = new byte[bytes.length];
        byte[] bytes2 = str.getBytes(charset);
        bytes2.getClass();
        int length = bytes2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) (bytes2[i] ^ bArrMd5[i2 % bArrMd5.length]);
            i++;
            i2++;
        }
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public static lc00 h(String str, String str2) {
        str.getClass();
        str2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (str.length() == 0) {
            lc00VarB.add(gh4.f11281a);
        }
        if (str2.length() == 0) {
            lc00VarB.add(hh4.f13044a);
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    public void d(g93 g93Var, g93 g93Var2) {
        HashSet hashSet = new HashSet();
        Iterator it = g93Var.iterator();
        while (it.hasNext()) {
            hashSet.add(((t83) it.next()).d());
        }
        Iterator it2 = g93Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((t83) it2.next()).d());
        }
    }

    public kzj0 e(h0q0 h0q0Var, ays0 ays0Var, boolean z, int i, boolean z2) {
        ays0 ays0VarB;
        t3u0 t3u0Var = t3u0.c;
        tfk tfkVar = (tfk) h0q0Var.b;
        pzs0 pzs0VarF = f(new q4m0(tfkVar.r1(), t3u0Var), h0q0Var, null, i);
        wsy wsyVarB = pzs0VarF.b();
        wsyVarB.getClass();
        kzj0 kzj0VarS = qsm0.s(wsyVarB);
        if (bdx.k0(kzj0VarS)) {
            return kzj0VarS;
        }
        pzs0VarF.a();
        d(kzj0VarS.getAnnotations(), k93.a(ays0Var));
        if (!bdx.k0(kzj0VarS)) {
            if (bdx.k0(kzj0VarS)) {
                ays0VarB = kzj0VarS.K();
            } else {
                ays0 ays0VarK = kzj0VarS.K();
                fck0 fck0Var = ays0.b;
                ays0VarK.getClass();
                if (ays0Var.isEmpty() && ays0VarK.isEmpty()) {
                    ays0VarB = ays0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) fck0Var.b).values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        j93 j93Var = (j93) ays0Var.f1685a.get(iIntValue);
                        j93 j93Var2 = (j93) ays0VarK.f1685a.get(iIntValue);
                        if (j93Var != null) {
                            if (j93Var2 != null) {
                                g93 i93Var = j93Var.f16117a;
                                g93 g93Var = j93Var2.f16117a;
                                i93Var.getClass();
                                g93Var.getClass();
                                if (i93Var.isEmpty()) {
                                    i93Var = g93Var;
                                } else if (!g93Var.isEmpty()) {
                                    i93Var = new i93(tx3.g0(new g93[]{i93Var, g93Var}), (byte) 1);
                                }
                                j93Var = new j93(i93Var);
                            }
                            j93Var2 = j93Var;
                        } else if (j93Var2 == null) {
                            j93Var2 = null;
                        } else if (j93Var != null) {
                            g93 i93Var2 = j93Var2.f16117a;
                            g93 g93Var2 = j93Var.f16117a;
                            i93Var2.getClass();
                            g93Var2.getClass();
                            if (i93Var2.isEmpty()) {
                                i93Var2 = g93Var2;
                            } else if (!g93Var2.isEmpty()) {
                                i93Var2 = new i93(tx3.g0(new g93[]{i93Var2, g93Var2}), (byte) 1);
                            }
                            j93Var2 = new j93(i93Var2);
                        }
                        if (j93Var2 != null) {
                            arrayList.add(j93Var2);
                        }
                    }
                    ays0VarB = fck0.b(arrayList);
                }
            }
            kzj0VarS = qsm0.z(kzj0VarS, null, ays0VarB, 1);
        }
        kzj0 kzj0VarJ = e0t0.j(kzj0VarS, z);
        if (!z2) {
            return kzj0VarJ;
        }
        p5 p5Var = tfkVar.i;
        p5Var.getClass();
        return q7x.L(kzj0VarJ, ucx.h0(br30.b, ays0Var, p5Var, (List) h0q0Var.c, z));
    }

    public pzs0 f(pzs0 pzs0Var, h0q0 h0q0Var, hzs0 hzs0Var, int i) {
        t3u0 t3u0VarT;
        t3u0 t3u0Var;
        t3u0 t3u0Var2;
        tfk tfkVar = (tfk) h0q0Var.b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + tfkVar.getName());
        }
        if (pzs0Var.c()) {
            hzs0Var.getClass();
            return e0t0.k(hzs0Var);
        }
        wsy wsyVarB = pzs0Var.b();
        wsyVarB.getClass();
        iys0 iys0VarS = wsyVarB.S();
        iys0VarS.getClass();
        foc focVarN = iys0VarS.n();
        pzs0 pzs0Var2 = focVarN instanceof hzs0 ? (pzs0) ((Map) h0q0Var.d).get(focVarN) : null;
        int i2 = 0;
        if (pzs0Var2 == null) {
            kzj0 kzj0VarS = qsm0.s(pzs0Var.b().j0());
            if (!bdx.k0(kzj0VarS) && e0t0.c(kzj0VarS, pnk0.n, null)) {
                iys0 iys0VarS2 = kzj0VarS.S();
                foc focVarN2 = iys0VarS2.n();
                iys0VarS2.getParameters().size();
                kzj0VarS.J().size();
                if (!(focVarN2 instanceof hzs0)) {
                    if (!(focVarN2 instanceof tfk)) {
                        kzj0 kzj0VarI = i(kzj0VarS, h0q0Var, i);
                        xzs0.d(kzj0VarI);
                        for (Object obj : kzj0VarI.J()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            pzs0 pzs0Var3 = (pzs0) obj;
                            if (!pzs0Var3.c()) {
                                wsy wsyVarB2 = pzs0Var3.b();
                                wsyVarB2.getClass();
                                if (!e0t0.c(wsyVarB2, pnk0.m, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new q4m0(kzj0VarI, pzs0Var.a());
                    }
                    tfk tfkVar2 = (tfk) focVarN2;
                    if (h0q0Var.y(tfkVar2)) {
                        t3u0 t3u0Var3 = t3u0.c;
                        c2o c2oVar = c2o.f;
                        String str = tfkVar2.getName().f10896a;
                        str.getClass();
                        return new q4m0(f2o.c(c2oVar, str), t3u0Var3);
                    }
                    List listJ = kzj0VarS.J();
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    for (Object obj2 : listJ) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        arrayList.add(f((pzs0) obj2, h0q0Var, (hzs0) iys0VarS2.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = tfkVar2.i.getParameters();
                    ArrayList arrayList2 = new ArrayList(r3d.q(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((hzs0) it.next()).o1());
                    }
                    kzj0 kzj0VarE = e(new h0q0(h0q0Var, tfkVar2, arrayList, xp20.m(CollectionsKt.T0(arrayList2, arrayList))), kzj0VarS.K(), kzj0VarS.U(), i + 1, false);
                    kzj0 kzj0VarI2 = i(kzj0VarS, h0q0Var, i);
                    kzj0VarE.getClass();
                    return new q4m0(q7x.L(kzj0VarE, kzj0VarI2), pzs0Var.a());
                }
            }
            return pzs0Var;
        }
        if (pzs0Var2.c()) {
            hzs0Var.getClass();
            return e0t0.k(hzs0Var);
        }
        tft0 tft0VarJ0 = pzs0Var2.b().j0();
        t3u0 t3u0VarA = pzs0Var2.a();
        t3u0VarA.getClass();
        t3u0 t3u0VarA2 = pzs0Var.a();
        t3u0VarA2.getClass();
        if (t3u0VarA2 != t3u0VarA && t3u0VarA2 != (t3u0Var2 = t3u0.c) && t3u0VarA == t3u0Var2) {
            t3u0VarA = t3u0VarA2;
        }
        if (hzs0Var == null || (t3u0VarT = hzs0Var.t()) == null) {
            t3u0VarT = t3u0.c;
        }
        if (t3u0VarT != t3u0VarA && t3u0VarT != (t3u0Var = t3u0.c) && t3u0VarA == t3u0Var) {
            t3u0VarA = t3u0Var;
        }
        d(wsyVarB.getAnnotations(), tft0VarJ0.getAnnotations());
        kzj0 kzj0VarJ = e0t0.j(qsm0.s(tft0VarJ0), wsyVarB.U());
        ays0 ays0VarK = wsyVarB.K();
        if (!bdx.k0(kzj0VarJ)) {
            if (bdx.k0(kzj0VarJ)) {
                ays0VarK = kzj0VarJ.K();
            } else {
                ays0 ays0VarK2 = kzj0VarJ.K();
                ays0VarK.getClass();
                fck0 fck0Var = ays0.b;
                ays0VarK2.getClass();
                if (!ays0VarK.isEmpty() || !ays0VarK2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) fck0Var.b).values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        j93 j93Var = (j93) ays0VarK.f1685a.get(iIntValue);
                        j93 j93Var2 = (j93) ays0VarK2.f1685a.get(iIntValue);
                        if (j93Var != null) {
                            if (j93Var2 != null) {
                                g93 i93Var = j93Var.f16117a;
                                g93 g93Var = j93Var2.f16117a;
                                i93Var.getClass();
                                g93Var.getClass();
                                if (i93Var.isEmpty()) {
                                    i93Var = g93Var;
                                } else if (!g93Var.isEmpty()) {
                                    i93Var = new i93(tx3.g0(new g93[]{i93Var, g93Var}), (byte) 1);
                                }
                                j93Var = new j93(i93Var);
                            }
                            j93Var2 = j93Var;
                        } else if (j93Var2 == null) {
                            j93Var2 = null;
                        } else if (j93Var != null) {
                            g93 i93Var2 = j93Var2.f16117a;
                            g93 g93Var2 = j93Var.f16117a;
                            i93Var2.getClass();
                            g93Var2.getClass();
                            if (i93Var2.isEmpty()) {
                                i93Var2 = g93Var2;
                            } else if (!g93Var2.isEmpty()) {
                                i93Var2 = new i93(tx3.g0(new g93[]{i93Var2, g93Var2}), (byte) 1);
                            }
                            j93Var2 = new j93(i93Var2);
                        }
                        if (j93Var2 != null) {
                            arrayList3.add(j93Var2);
                        }
                    }
                    ays0VarK = fck0.b(arrayList3);
                }
            }
            kzj0VarJ = qsm0.z(kzj0VarJ, null, ays0VarK, 1);
        }
        return new q4m0(kzj0VarJ, t3u0VarA);
    }

    public kzj0 i(kzj0 kzj0Var, h0q0 h0q0Var, int i) {
        iys0 iys0VarS = kzj0Var.S();
        List listJ = kzj0Var.J();
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        int i2 = 0;
        for (Object obj : listJ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            pzs0 pzs0Var = (pzs0) obj;
            pzs0 pzs0VarF = f(pzs0Var, h0q0Var, (hzs0) iys0VarS.getParameters().get(i2), i + 1);
            if (!pzs0VarF.c()) {
                pzs0VarF = new q4m0(e0t0.i(pzs0VarF.b(), pzs0Var.b().U()), pzs0VarF.a());
            }
            arrayList.add(pzs0VarF);
            i2 = i3;
        }
        return qsm0.z(kzj0Var, arrayList, null, 2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new CloudMessage(intent);
        }
        return null;
    }

    public String toString() {
        switch (this.f39945a) {
            case 8:
                String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                string.getClass();
                return b1j.k("CreationExtras.Key@", string, Separators.LESS_THAN, sre0.f32672a.b(Application.class).J(), Separators.GREATER_THAN);
            default:
                return super.toString();
        }
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f39945a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new Boolean(((Boolean) shw0.f32236a.get()).booleanValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                List list = btw0.f3204a;
                return (String) qhw0.b.get();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_realtime_events_per_day", 74, 10L).get()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.upload.retry_interval", 51, 600000L).get();
            default:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.sgtm.batch.retry_max_count", 42, 10L).get()).longValue());
        }
    }

    @Override // a.qfw0
    public boolean zzb(Class cls) {
        return false;
    }

    @Override // a.qfw0
    public cgw0 zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public /* synthetic */ wxs0(byte b2) {
        this.f39945a = b2;
    }
}
