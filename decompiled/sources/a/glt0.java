package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.firebase.auth.PhoneAuthCredential;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class glt0 implements ngw0, mff0 {
    public static Boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11512a;
    public final Object b;
    public final Object c;
    public Object d;

    public glt0(c1x0 c1x0Var, String str) {
        this.f11512a = (byte) 6;
        this.b = c1x0Var;
        this.d = str;
        Context context = c1x0Var.b;
        Pattern pattern = b9x0.f2232a;
        zcw0 zcw0Var = new zcw0(context);
        zcw0Var.g("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(Separators.SLASH);
        sb.append(str);
        sb.append(".pb");
        zcw0Var.k(sb.toString());
        this.c = zcw0Var.l();
    }

    public static Object i(Function1 function1, zje zjeVar) {
        return ((qq40) zjeVar.getContext().get(lwf.t)) == null ? qjj.d0((CoroutineContext) r23.m.getValue(), new a2f(function1, null, (byte) 12), zjeVar) : function1.invoke(zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(float f, j73 j73Var, zje zjeVar) {
        vvv0 vvv0Var;
        if (zjeVar instanceof vvv0) {
            vvv0Var = (vvv0) zjeVar;
            int i = vvv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvv0Var.k = i - Integer.MIN_VALUE;
            } else {
                vvv0Var = new vvv0(this, zjeVar);
            }
        } else {
            vvv0Var = new vvv0(this, zjeVar);
        }
        Object obj = vvv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vvv0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            t910 t910Var = new t910(this, f, j73Var, null);
            vvv0Var.k = 1;
            if (i(t910Var, vvv0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
        izw0 izw0Var = new izw0((tzw0) this.b, (fbv) this.d);
        String str = (String) this.c;
        Parcel parcelG = h0x0Var.G();
        parcelG.writeString(str);
        wmw0.c(parcelG, izw0Var);
        h0x0Var.H(parcelG, 28);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(lxv0 lxv0Var, zje zjeVar) {
        wvv0 wvv0Var;
        if (zjeVar instanceof wvv0) {
            wvv0Var = (wvv0) zjeVar;
            int i = wvv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wvv0Var.k = i - Integer.MIN_VALUE;
            } else {
                wvv0Var = new wvv0(this, zjeVar);
            }
        } else {
            wvv0Var = new wvv0(this, zjeVar);
        }
        Object obj = wvv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wvv0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            ((hgk0) ((pz40) this.d)).setValue(lxv0Var);
            gv60 gv60Var = new gv60(this, lxv0Var, yjeVar, (byte) 24);
            wvv0Var.k = 1;
            if (i(gv60Var, wvv0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(lxv0 lxv0Var, zje zjeVar) {
        xvv0 xvv0Var;
        t33 t33Var = (t33) this.c;
        if (zjeVar instanceof xvv0) {
            xvv0Var = (xvv0) zjeVar;
            int i = xvv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xvv0Var.k = i - Integer.MIN_VALUE;
            } else {
                xvv0Var = new xvv0(this, zjeVar);
            }
        } else {
            xvv0Var = new xvv0(this, zjeVar);
        }
        Object obj = xvv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xvv0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            float fA = ((fht0) this.b).a(lxv0Var);
            if (t33Var.e() && ((Number) ((hgk0) t33Var.e).getValue()).floatValue() == fA) {
                return Unit.f46060a;
            }
            yvv0 yvv0Var = new yvv0(this, fA, null);
            xvv0Var.k = 1;
            if (i(yvv0Var, xvv0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public lxv0 d() {
        return (lxv0) ((hgk0) ((pz40) this.d)).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(long j, zje zjeVar, String str, boolean z) {
        flt0 flt0Var;
        aja ajaVar;
        boolean z2;
        long j2;
        wf30 wf30Var;
        String str2;
        aja ajaVar2;
        Object g0g0Var;
        Object obj;
        List list;
        p7m0 p7m0Var;
        Object value;
        Object objA;
        if (zjeVar instanceof flt0) {
            flt0Var = (flt0) zjeVar;
            int i = flt0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                flt0Var.p = i - Integer.MIN_VALUE;
            } else {
                flt0Var = new flt0(this, zjeVar);
            }
        } else {
            flt0Var = new flt0(this, zjeVar);
        }
        Object objD0 = flt0Var.n;
        wne wneVar = wne.f39444a;
        int i2 = flt0Var.p;
        if (i2 == 0) {
            z1x.P(objD0);
            aja ajaVar3 = (aja) this.c;
            try {
                e0g0 e0g0Var = j0g0.b;
                wf30 wf30Var2 = (wf30) this.b;
                x0u x0uVar = (x0u) this.d;
                flt0Var.j = str;
                flt0Var.k = wf30Var2;
                flt0Var.l = ajaVar3;
                flt0Var.i = j;
                flt0Var.m = z;
                flt0Var.p = 1;
                Object objC = x0uVar.c(flt0Var);
                if (objC != wneVar) {
                    z2 = z;
                    j2 = j;
                    wf30Var = wf30Var2;
                    str2 = str;
                    ajaVar2 = ajaVar3;
                    objD0 = objC;
                }
                return wneVar;
            } catch (Throwable th) {
                th = th;
                ajaVar = ajaVar3;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ajaVar = (aja) flt0Var.k;
                try {
                    z1x.P(objD0);
                    g0g0Var = (List) objD0;
                    e0g0 e0g0Var3 = j0g0.b;
                } catch (Throwable th2) {
                    th = th2;
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                obj = iun.f15405a;
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = obj;
                }
                list = (List) g0g0Var;
                ajaVar.getClass();
                list.getClass();
                rfs rfsVar = ajaVar.f964a;
                rfsVar.getClass();
                p7m0Var = rfsVar.f30402a;
                do {
                    value = p7m0Var.getValue();
                    objA = (egs) value;
                    if (objA instanceof bgs) {
                        objA = bgs.a((bgs) objA, null, list, null, null, null, null, false, 125);
                    }
                } while (!p7m0Var.m(value, objA));
                return Unit.f46060a;
            }
            boolean z3 = flt0Var.m;
            long j3 = flt0Var.i;
            ajaVar2 = flt0Var.l;
            wf30 wf30Var3 = (wf30) flt0Var.k;
            String str3 = flt0Var.j;
            try {
                z1x.P(objD0);
                j2 = j3;
                str2 = str3;
                z2 = z3;
                wf30Var = wf30Var3;
            } catch (Throwable th3) {
                th = th3;
                ajaVar = ajaVar2;
                e0g0 e0g0Var5 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        int iIntValue = ((Number) objD0).intValue();
        flt0Var.j = null;
        flt0Var.k = ajaVar2;
        flt0Var.l = null;
        flt0Var.i = j2;
        flt0Var.m = z2;
        flt0Var.p = 2;
        objD0 = qjj.d0(wf30Var.d.b, new vf30(wf30Var, z2, j2, iIntValue, str2, null), flt0Var);
        if (objD0 != wneVar) {
            ajaVar = ajaVar2;
            g0g0Var = (List) objD0;
            e0g0 e0g0Var6 = j0g0.b;
            obj = iun.f15405a;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = obj;
            }
            list = (List) g0g0Var;
            ajaVar.getClass();
            list.getClass();
            rfs rfsVar2 = ajaVar.f964a;
            rfsVar2.getClass();
            p7m0Var = rfsVar2.f30402a;
            do {
                value = p7m0Var.getValue();
                objA = (egs) value;
                if (objA instanceof bgs) {
                    objA = bgs.a((bgs) objA, null, list, null, null, null, null, false, 125);
                }
            } while (!p7m0Var.m(value, objA));
            return Unit.f46060a;
        }
        return wneVar;
    }

    public boolean f() {
        return !Intrinsics.d(d(), jxv0.f17330a);
    }

    public Object g(float f, yje yjeVar) {
        Object objF = ((t33) this.c).f(yjeVar, new Float(f));
        return objF == wne.f39444a ? objF : Unit.f46060a;
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        hcp0 hcp0Var = (hcp0) this.b;
        njw0 njw0Var = (njw0) xfw0Var;
        if (!TextUtils.isEmpty(njw0Var.e)) {
            hcp0Var.b(new Status(17025, null, null, null), new PhoneAuthCredential(null, null, njw0Var.f, true, njw0Var.e));
            return;
        }
        ((nmt0) ((x4w0) this.d).c).g(new zzaia(Long.valueOf(njw0Var.c), njw0Var.b, njw0Var.f23656a), null, "phone", Boolean.valueOf(njw0Var.d), null, hcp0Var, (x4w0) this.c);
    }

    public td9 j() {
        String strSubstring;
        int i;
        l4x0 l4x0Var;
        l4x0 l4x0Var2;
        final String str = (String) this.d;
        c1x0 c1x0Var = (c1x0) this.b;
        lin0 lin0Var = c1x0Var.f;
        if (!m0x0.X(c1x0Var.b)) {
            return new td9(y7x0.y(), new un00(3, 17));
        }
        Boolean boolValueOf = e;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
                e = boolValueOf;
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    boolValueOf = (Boolean) objInvoke;
                    e = boolValueOf;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                    e = boolValueOf;
                }
            }
        }
        if (boolValueOf.booleanValue()) {
            return new td9(y7x0.y(), new un00(3, 18));
        }
        t7x0 t7x0VarB = c1x0Var.g.b();
        final qdw0 qdw0Var = t7x0VarB.c;
        fdw0 fdw0Var = fdw0.FILE;
        gx3 gx3Var = z0x0.f43591a;
        int iIndexOf = str.indexOf(Separators.POUND);
        final byte b = 0;
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains(Separators.AT)) {
                jf4.o("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!t7x0VarB.h) {
            i = 14;
        } else if (!t7x0VarB.f33489a || !t7x0VarB.b.contains(fdw0Var)) {
            i = 3;
        } else if (qdw0Var.e() != 0) {
            List list = t7x0VarB.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = t7x0VarB.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            l4x0Var2 = new l4x0(null, new un00(i));
        } else {
            try {
                String str2 = t7x0VarB.e;
                if (str2.isEmpty()) {
                    w680 w680Var = (w680) c1x0Var.h.get();
                    if (w680Var.b()) {
                        str2 = ((ApplicationInfo) w680Var.a()).dataDir;
                    } else {
                        k7n0.I(Level.WARNING, c1x0Var.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        l4x0Var = new l4x0(q3x0.c, new un00(3, 7));
                        l4x0Var2 = l4x0Var;
                    }
                }
                String str3 = File.separator;
                String str4 = t7x0VarB.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                final l8w0 l8w0Var = new l8w0();
                l8w0Var.f19624a = vx5.d;
                final byte b2 = 1;
                l8w0Var.b = hfm0.z(new lin0() { // from class: a.g3x0
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // a.lin0
                    public final Object get() {
                        long j;
                        long j2;
                        long j3;
                        long j4;
                        long j5;
                        long j6;
                        long j7;
                        byte b3 = b2;
                        Serializable serializable = qdw0Var;
                        l8w0 l8w0Var2 = l8w0Var;
                        switch (b3) {
                            case 0:
                                int i2 = nnv.f23843a;
                                int i3 = vx40.k;
                                ux40 ux40VarC = new ux40().c(((String) serializable).getBytes());
                                ByteBuffer byteBuffer = ux40VarC.f36424a;
                                byteBuffer.put((byte) 0);
                                char c = '\b';
                                if (byteBuffer.remaining() < 8) {
                                    ux40VarC.a();
                                }
                                ux40 ux40VarC2 = ux40VarC.c("".getBytes());
                                ux40VarC2.a();
                                ByteBuffer byteBuffer2 = ux40VarC2.f36424a;
                                byteBuffer2.flip();
                                if (byteBuffer2.remaining() > 0) {
                                    ux40VarC2.d = byteBuffer2.remaining() + ux40VarC2.d;
                                    long j8 = 0;
                                    switch (byteBuffer2.remaining()) {
                                        case 1:
                                            j = 0;
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 2:
                                            c = '\b';
                                            j2 = 0;
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 3:
                                            c = '\b';
                                            j3 = 0;
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 4:
                                            c = '\b';
                                            j4 = 0;
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 5:
                                            j5 = 0;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 6:
                                            j6 = 0;
                                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 7:
                                            j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 8:
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 9:
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 10:
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 11:
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 12:
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 13:
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 14:
                                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 15:
                                            j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        default:
                                            c99.l("Should never get here.");
                                            return null;
                                    }
                                }
                                long j9 = ux40VarC2.b;
                                long j10 = ux40VarC2.d;
                                long j11 = j9 ^ j10;
                                long j12 = j10 ^ ux40VarC2.c;
                                long j13 = j11 + j12;
                                long j14 = j12 + j13;
                                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                                long j19 = j18 ^ (j18 >>> 33);
                                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                                ux40VarC2.b = j20;
                                ux40VarC2.c = j19 + j20;
                                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(ux40VarC2.b).putLong(ux40VarC2.c).array();
                                bArrArray.getClass();
                                byte[] bArr = (byte[]) bArrArray.clone();
                                ux5 ux5Var = (ux5) l8w0Var2.f19624a;
                                ux5Var.getClass();
                                return ux5Var.a(bArr, bArr.length);
                            default:
                                ux5 ux5Var2 = (ux5) l8w0Var2.f19624a;
                                byte[] bArrM = ((qdw0) serializable).m();
                                ux5Var2.getClass();
                                return ux5Var2.a(bArrM, bArrM.length);
                        }
                    }
                });
                l8w0Var.c = hfm0.z(new lin0() { // from class: a.g3x0
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // a.lin0
                    public final Object get() {
                        long j;
                        long j2;
                        long j3;
                        long j4;
                        long j5;
                        long j6;
                        long j7;
                        byte b3 = b;
                        Serializable serializable = str;
                        l8w0 l8w0Var2 = l8w0Var;
                        switch (b3) {
                            case 0:
                                int i2 = nnv.f23843a;
                                int i3 = vx40.k;
                                ux40 ux40VarC = new ux40().c(((String) serializable).getBytes());
                                ByteBuffer byteBuffer = ux40VarC.f36424a;
                                byteBuffer.put((byte) 0);
                                char c = '\b';
                                if (byteBuffer.remaining() < 8) {
                                    ux40VarC.a();
                                }
                                ux40 ux40VarC2 = ux40VarC.c("".getBytes());
                                ux40VarC2.a();
                                ByteBuffer byteBuffer2 = ux40VarC2.f36424a;
                                byteBuffer2.flip();
                                if (byteBuffer2.remaining() > 0) {
                                    ux40VarC2.d = byteBuffer2.remaining() + ux40VarC2.d;
                                    long j8 = 0;
                                    switch (byteBuffer2.remaining()) {
                                        case 1:
                                            j = 0;
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 2:
                                            c = '\b';
                                            j2 = 0;
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 3:
                                            c = '\b';
                                            j3 = 0;
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 4:
                                            c = '\b';
                                            j4 = 0;
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 5:
                                            j5 = 0;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 6:
                                            j6 = 0;
                                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 7:
                                            j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 8:
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 9:
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 10:
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 11:
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 12:
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 13:
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 14:
                                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        case 15:
                                            j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                                            j7 = byteBuffer2.getLong();
                                            ux40VarC2.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ ux40VarC2.b;
                                            ux40VarC2.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                            byteBuffer2.position(byteBuffer2.limit());
                                            break;
                                        default:
                                            c99.l("Should never get here.");
                                            return null;
                                    }
                                }
                                long j9 = ux40VarC2.b;
                                long j10 = ux40VarC2.d;
                                long j11 = j9 ^ j10;
                                long j12 = j10 ^ ux40VarC2.c;
                                long j13 = j11 + j12;
                                long j14 = j12 + j13;
                                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                                long j19 = j18 ^ (j18 >>> 33);
                                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                                ux40VarC2.b = j20;
                                ux40VarC2.c = j19 + j20;
                                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(ux40VarC2.b).putLong(ux40VarC2.c).array();
                                bArrArray.getClass();
                                byte[] bArr = (byte[]) bArrArray.clone();
                                ux5 ux5Var = (ux5) l8w0Var2.f19624a;
                                ux5Var.getClass();
                                return ux5Var.a(bArr, bArr.length);
                            default:
                                ux5 ux5Var2 = (ux5) l8w0Var2.f19624a;
                                byte[] bArrM = ((qdw0) serializable).m();
                                ux5Var2.getClass();
                                return ux5Var2.a(bArrM, bArrM.length);
                        }
                    }
                });
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = l8w0Var.e().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        try {
                            l4x0 l4x0Var3 = new l4x0((q3x0) ((x8x0) lin0Var.get()).a(uriBuild, new nqd((byte) 12, t7x0VarB.k.r())), new un00(5, 2));
                            StrictMode.setThreadPolicy(threadPolicy);
                            l4x0Var2 = l4x0Var3;
                        } catch (zew0 e2) {
                            k7n0.I(Level.SEVERE, c1x0Var.a(), e2, "Failed to parse snapshot from shared storage for %s", str);
                            l4x0Var2 = new l4x0(null, new un00(9));
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (FileNotFoundException unused2) {
                    k7n0.I(Level.INFO, c1x0Var.a(), null, "Shared storage file not found for %s", str);
                    l4x0Var2 = new l4x0(null, new un00(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e3) {
                k7n0.I(Level.WARNING, c1x0Var.a(), e3, "Failed to read shared file for %s", str);
                l4x0Var = new l4x0(q3x0.c, new un00(3, 10));
                l4x0Var2 = l4x0Var;
            }
        }
        un00 un00Var = l4x0Var2.b;
        q3x0 q3x0Var = l4x0Var2.f19432a;
        if (q3x0Var != null) {
            return new td9(q3x0Var, un00Var);
        }
        int i2 = un00Var.b;
        try {
            x8x0 x8x0Var = (x8x0) lin0Var.get();
            Uri uri = (Uri) this.c;
            yfw0 yfw0Var = (yfw0) y7x0.y().q(7);
            bew0 bew0Var = bew0.b;
            int i3 = ldw0.f19874a;
            bew0 bew0Var2 = bew0.c;
            InputStream inputStreamY = cem0.y(x8x0Var.b(uri));
            try {
                mew0 mew0VarA = ((jew0) yfw0Var).a(inputStreamY, bew0Var2);
                if (inputStreamY != null) {
                    inputStreamY.close();
                }
                return new td9((y7x0) mew0VarA, new un00(4, i2));
            } catch (Throwable th2) {
                if (inputStreamY == null) {
                    throw th2;
                }
                try {
                    inputStreamY.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException | RuntimeException unused3) {
            k7n0.I(Level.INFO, c1x0Var.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return l() ? new td9(q3x0.c, new un00(3, 16)) : new td9(y7x0.y(), new un00(3, 11));
        }
    }

    public void k(Object obj, String str) {
        mkt0 mkt0Var = new mkt0();
        ((mkt0) this.d).c = mkt0Var;
        this.d = mkt0Var;
        mkt0Var.b = obj;
        mkt0Var.f21959a = str;
    }

    public boolean l() {
        w3x0 w3x0VarC = ((c1x0) this.b).g.c();
        return w3x0VarC.t() && ((AbstractCollection) w3x0VarC.y()).contains(fdw0.FILE);
    }

    public String toString() {
        switch (this.f11512a) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                mkt0 mkt0Var = (mkt0) ((mkt0) this.c).c;
                String str = "";
                while (mkt0Var != null) {
                    Object obj = mkt0Var.b;
                    sb.append(str);
                    String str2 = (String) mkt0Var.f21959a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    mkt0Var = (mkt0) mkt0Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((x4w0) this.c).mo2zza(str);
    }

    public glt0(x4w0 x4w0Var, hcp0 hcp0Var, x4w0 x4w0Var2) {
        this.f11512a = (byte) 3;
        this.b = hcp0Var;
        this.c = x4w0Var2;
        this.d = x4w0Var;
    }

    public /* synthetic */ glt0(tzw0 tzw0Var, String str, fbv fbvVar) {
        this.f11512a = (byte) 5;
        this.b = tzw0Var;
        this.c = str;
        this.d = fbvVar;
    }

    public glt0(String str) {
        this.f11512a = (byte) 4;
        mkt0 mkt0Var = new mkt0();
        this.c = mkt0Var;
        this.d = mkt0Var;
        this.b = str;
    }

    public glt0(wf30 wf30Var, aja ajaVar, x0u x0uVar) {
        this.f11512a = (byte) 0;
        wf30Var.getClass();
        ajaVar.getClass();
        this.b = wf30Var;
        this.c = ajaVar;
        this.d = x0uVar;
    }

    public glt0(fht0 fht0Var) {
        this.f11512a = (byte) 2;
        this.b = fht0Var;
        this.c = xf0.c(0.0f);
        this.d = androidx.compose.runtime.e.e(jxv0.f17330a);
    }

    public glt0(IntRange intRange, Method[] methodArr, Method method) {
        this.f11512a = (byte) 1;
        intRange.getClass();
        this.b = intRange;
        this.c = methodArr;
        this.d = method;
    }
}
