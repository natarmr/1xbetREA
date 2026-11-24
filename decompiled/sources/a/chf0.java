package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class chf0 implements m83, w83, nae0, xo80 {
    public static final String[] d = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] e = {"goldfish"};
    public static final String[] f = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] g = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] h = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] i = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};
    public static final a0d0[] j = {new a0d0("init.svc.qemud", null), new a0d0("init.svc.qemu-props", null), new a0d0("qemu.hw.mainkeys", null), new a0d0("qemu.sf.fake_camera", null), new a0d0("qemu.sf.lcd_density", null), new a0d0("ro.bootloader", "unknown"), new a0d0("ro.bootmode", "unknown"), new a0d0("ro.hardware", "goldfish"), new a0d0("ro.kernel.android.qemud", null), new a0d0("ro.kernel.qemu.gles", null), new a0d0("ro.kernel.qemu", "1"), new a0d0("ro.product.device", "generic"), new a0d0("ro.product.userRepository", "sdk"), new a0d0("ro.product.name", "sdk"), new a0d0("ro.serialno", null)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4357a;
    public Object b;
    public Object c;

    public chf0(gii0 gii0Var, byte b) {
        this.f4357a = b;
        switch (b) {
            case 9:
                this.b = gii0Var;
                this.c = new a13(this, (byte) 18);
                break;
            case 17:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new h8a(this, (byte) 6);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new e8g(this, (byte) 12);
                break;
            default:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new nc((Object) this, (byte) 23);
                break;
        }
    }

    public static boolean Q(o1x o1xVar, Bitmap.Config config) {
        if (!cy2.C(config)) {
            return true;
        }
        if (!((Boolean) qbc.P(o1xVar, t1x.g)).booleanValue()) {
            return false;
        }
        uto0 uto0Var = o1xVar.c;
        if (!(uto0Var instanceof zjt)) {
            return true;
        }
        View view = ((zjt) uto0Var).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static chf0 k(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new chf0((Object) channel, (Object) fileLockLock, (byte) 23);
                } catch (IOException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            channel = null;
            fileLockLock = null;
        }
    }

    public static glz v(o1x o1xVar) {
        uto0 uto0Var = o1xVar.c;
        Object context = uto0Var instanceof zjt ? ((zjt) uto0Var).getView().getContext() : o1xVar.f24504a;
        while (!(context instanceof clz)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((clz) context).x();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(String str, String str2, String str3, zje zjeVar) {
        fqg fqgVar;
        if (zjeVar instanceof fqg) {
            fqgVar = (fqg) zjeVar;
            int i2 = fqgVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fqgVar.k = i2 - Integer.MIN_VALUE;
            } else {
                fqgVar = new fqg(this, zjeVar);
            }
        } else {
            fqgVar = new fqg(this, zjeVar);
        }
        Object objB = fqgVar.i;
        wne wneVar = wne.f39444a;
        int i3 = fqgVar.k;
        if (i3 == 0) {
            z1x.P(objB);
            kpg kpgVar = (kpg) ((e8g) this.c).invoke();
            fqgVar.k = 1;
            objB = kpgVar.b(str, str2, str3, fqgVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(long j2, zje zjeVar) {
        xu6 xu6Var;
        if (zjeVar instanceof xu6) {
            xu6Var = (xu6) zjeVar;
            int i2 = xu6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xu6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                xu6Var = new xu6(this, zjeVar);
            }
        } else {
            xu6Var = new xu6(this, zjeVar);
        }
        Object objW0 = xu6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = xu6Var.k;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            xu6Var.k = 1;
            objW0 = sj3.w0(xu6Var, ou6Var.f25862a, new ju6(j2, ou6Var, null, (byte) 1), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        pu6 pu6Var = (pu6) objW0;
        if (pu6Var != null) {
            return o050.Z(pu6Var, (vby) this.b);
        }
        itt0.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable C(List list, zje zjeVar) {
        av6 av6Var;
        if (zjeVar instanceof av6) {
            av6Var = (av6) zjeVar;
            int i2 = av6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                av6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                av6Var = new av6(this, zjeVar);
            }
        } else {
            av6Var = new av6(this, zjeVar);
        }
        Object objW0 = av6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = av6Var.k;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            av6Var.k = 1;
            ou6Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("select * from bet_events where id in (");
            tnq0.h(list.size(), sb);
            sb.append(Separators.RPAREN);
            objW0 = sj3.w0(av6Var, ou6Var.f25862a, new ah0(sb.toString(), list, ou6Var, null, (byte) 5), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o050.Z((pu6) it.next(), (vby) this.b));
        }
        return arrayList;
    }

    public Object D(yje yjeVar) {
        return sj3.w0(yjeVar, ((ou6) this.c).f25862a, new pd(2, null, (byte) 20), true, false);
    }

    public Object E(long j2, zje zjeVar) {
        return sj3.w0(zjeVar, ((ou6) this.c).f25862a, new hu6(j2, null, (byte) 0), true, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable F(long j2, zje zjeVar) {
        bv6 bv6Var;
        if (zjeVar instanceof bv6) {
            bv6Var = (bv6) zjeVar;
            int i2 = bv6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bv6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                bv6Var = new bv6(this, zjeVar);
            }
        } else {
            bv6Var = new bv6(this, zjeVar);
        }
        Object objW0 = bv6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = bv6Var.k;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            bv6Var.k = 1;
            objW0 = sj3.w0(bv6Var, ou6Var.f25862a, new ju6(j2, ou6Var, null, (byte) 2), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o050.Z((pu6) it.next(), (vby) this.b));
        }
        return arrayList;
    }

    public x4u G() {
        return new x4u(new wti(new zri((gii0) this.b, (byte) 15), (knf0) this.c, (byte) 0));
    }

    public KeyListener H(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof atn)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new atn(keyListener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable I(long j2, zje zjeVar) {
        ev6 ev6Var;
        if (zjeVar instanceof ev6) {
            ev6Var = (ev6) zjeVar;
            int i2 = ev6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ev6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ev6Var = new ev6(this, zjeVar);
            }
        } else {
            ev6Var = new ev6(this, zjeVar);
        }
        Object objW0 = ev6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = ev6Var.k;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            int iA = q4f.l.a();
            ev6Var.k = 1;
            objW0 = sj3.w0(ev6Var, ou6Var.f25862a, new ku6(j2, iA, ou6Var, null), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oja0.a0((pu6) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object J(long j2, int i2, double d2, long j3, long j4, zje zjeVar) {
        fv6 fv6Var;
        if (zjeVar instanceof fv6) {
            fv6Var = (fv6) zjeVar;
            int i3 = fv6Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fv6Var.k = i3 - Integer.MIN_VALUE;
            } else {
                fv6Var = new fv6(this, zjeVar);
            }
        } else {
            fv6Var = new fv6(this, zjeVar);
        }
        Object objW0 = fv6Var.i;
        wne wneVar = wne.f39444a;
        int i4 = fv6Var.k;
        if (i4 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            fv6Var.k = 1;
            objW0 = sj3.w0(fv6Var, ou6Var.f25862a, new lu6(j2, i2, d2, j3, j4, ou6Var, null), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        pu6 pu6Var = (pu6) objW0;
        if (pu6Var != null) {
            return o050.Z(pu6Var, (vby) this.b);
        }
        itt0.a();
        return null;
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Double n(Fragment fragment, iiy iiyVar) {
        double dDoubleValue;
        fragment.getClass();
        iiyVar.getClass();
        Double d2 = (Double) this.c;
        if (d2 != null) {
            dDoubleValue = d2.doubleValue();
        } else {
            Bundle bundle = fragment.g;
            Double dValueOf = bundle != null ? Double.valueOf(bundle.getDouble((String) this.b, Double.NaN)) : null;
            this.c = dValueOf;
            dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : Double.NaN;
        }
        return Double.valueOf(dDoubleValue);
    }

    public Object L(List list, zje zjeVar) {
        ou6 ou6Var = (ou6) this.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i120.f0((qu6) it.next(), (vby) this.b));
        }
        Object objW0 = sj3.w0(zjeVar, ou6Var.f25862a, new nu6(ou6Var, arrayList, null, (byte) 0), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public b49 M(String str) {
        Object value;
        List list;
        ArrayList arrayList;
        Object next;
        long jA = ((viu) this.c).a();
        d49 d49Var = (d49) ((yqc) this.b).b;
        d49Var.getClass();
        gqw0 gqw0Var = gqw0.r;
        p7m0 p7m0Var = d49Var.f5443a.f3714a;
        do {
            value = p7m0Var.getValue();
            list = (List) value;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((z39) obj).i.equals(str)) {
                    arrayList.add(obj);
                }
            }
        } while (!p7m0Var.m(value, arrayList));
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((z39) next).i.equals(str));
        z39 z39Var = (z39) next;
        if (z39Var != null) {
            boolean z = z39Var.h;
            long j2 = z39Var.g;
            if (z) {
                j2 += jA - z39Var.f;
            }
            uen uenVar = wen.b;
            long jL = wen.l(ibc.w0(j2, bfn.MILLISECONDS), bfn.SECONDS);
            if (jL > 0) {
                return new a49(z39Var.f43709a, z39Var.b, z39Var.c, z39Var.d, jL);
            }
        }
        return gqw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r0 == r5) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(a.zje r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.chf0.N(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object O(m0k0 m0k0Var, lvj0 lvj0Var, int i2, gwe gweVar, boolean z, ic9 ic9Var, zje zjeVar) {
        tp tpVar;
        ic9 ic9Var2;
        m0k0 m0k0Var2;
        lvj0 lvj0Var2;
        boolean z2;
        gwe gweVar2;
        int i3;
        chf0 chf0Var = (chf0) this.c;
        if (zjeVar instanceof tp) {
            tpVar = (tp) zjeVar;
            int i4 = tpVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tpVar.q = i4 - Integer.MIN_VALUE;
            } else {
                tpVar = new tp(this, zjeVar);
            }
        } else {
            tpVar = new tp(this, zjeVar);
        }
        Object obj = tpVar.o;
        wne wneVar = wne.f39444a;
        int i5 = tpVar.q;
        yje yjeVar = null;
        if (i5 == 0) {
            z1x.P(obj);
            tpVar.i = m0k0Var;
            tpVar.j = lvj0Var;
            tpVar.k = gweVar;
            ic9Var2 = ic9Var;
            tpVar.l = ic9Var2;
            tpVar.m = i2;
            tpVar.n = z;
            tpVar.q = 1;
            Object objD = chf0Var.D(tpVar);
            if (objD != wneVar) {
                m0k0Var2 = m0k0Var;
                obj = objD;
                lvj0Var2 = lvj0Var;
                z2 = z;
                gweVar2 = gweVar;
                i3 = i2;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = tpVar.n;
        i3 = tpVar.m;
        ic9Var2 = tpVar.l;
        gweVar2 = tpVar.k;
        lvj0Var2 = tpVar.j;
        m0k0Var2 = tpVar.i;
        z1x.P(obj);
        long jLongValue = ((Number) obj).longValue();
        g45 g45Var = (g45) this.b;
        q4f q4fVar = ((ave) g45Var.c).f1521a;
        if (jLongValue < i3 || q4fVar == q4f.c) {
            vwb0 vwb0Var = (vwb0) g45Var.e;
            vwb0Var.getClass();
            if (jLongValue != vwb0Var.b().getInt("max_coupon_size_key", 50)) {
                qu6 qu6VarA0 = o050.a0(m0k0Var2, lvj0Var2, gweVar2, z2 ? q4f.l : q4f.b, ic9Var2);
                tpVar.i = null;
                tpVar.j = null;
                tpVar.k = null;
                tpVar.l = null;
                tpVar.m = i3;
                tpVar.n = z2;
                tpVar.q = 2;
                ou6 ou6Var = (ou6) chf0Var.c;
                Object objW0 = sj3.w0(tpVar, ou6Var.f25862a, new mu6(ou6Var, i120.f0(qu6VarA0, (vby) chf0Var.b), yjeVar, (byte) 0), false, true);
                return objW0 == wneVar ? wneVar : objW0;
            }
        }
        return new Long(-1L);
    }

    public void P() {
        nb7 nb7Var = (nb7) ((h03) this.b).b;
        nb7Var.f23225a.n(null);
        nb7Var.b = false;
        nb7Var.c = false;
        ((h0f) ((lrc) this.c).b).f12232a.o(null, knm0.j());
    }

    public ArrayList R(List list, List list2, h950 h950Var) {
        if (list.isEmpty()) {
            list = list2 == null ? iun.f15405a : list2;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (p2d0 p2d0Var : list) {
            p2d0Var.getClass();
            h950Var.getClass();
            arrayList.add(((ehf0) this.c).d(p2d0Var, h950Var));
        }
        return arrayList;
    }

    public void S(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, mqd0.i, i2, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e0(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void T(Integer num) {
        zg zgVar = (zg) this.b;
        jo20 jo20Var = new jo20();
        if (num != null) {
            jo20Var.put("option", num);
        }
        zgVar.f44322a.a("call_back_create_done", jo20Var.b());
        au0 au0Var = (au0) this.c;
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        au0Var.f1455a.a(cui0.a(yni0Var), 10874L);
    }

    public void U(String str) {
        i8i.D("option", str, ((zg) this.b).f44322a, "call_back_create_error");
        b1j.v(str, ((au0) this.c).f1455a, 10872L);
    }

    public void V(String str, String str2) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            ((zg) this.b).f44322a.a("call_back_order", xp20.f(new Pair("option", intOrNull), new Pair("point", str2)));
            ((au0) this.c).f1455a.a(tx3.l0(new k1p[]{new i1p(intOrNull), new j1p(str2, (byte) 0)}), 10850L);
        }
    }

    public void W(int i2) {
        b1j.w("option", Integer.valueOf(i2), ((zg) this.b).f44322a, "call_back_create_select");
        b1j.r(i2, ((au0) this.c).f1455a, 10870L);
    }

    public AutofillId X(long j2) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionI = y5a.i(this.b);
        i7 i7VarG = cvm0.g((View) this.c);
        Objects.requireNonNull(i7VarG);
        return sf3.l(contentCaptureSessionI, y24.c(i7VarG.f14266a), j2);
    }

    public void Y(String str) {
        str.getClass();
        Iterator it = ((List) ((c14) this.c).f3556a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed((adf0) this.b);
        }
    }

    public void Z(String str) {
        str.getClass();
        Iterator it = ((List) ((c14) this.c).f3556a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((adf0) this.b);
        }
    }

    @Override // a.w83
    public List a(v0 v0Var, d3d0 d3d0Var) {
        v0Var.getClass();
        List list = d3d0Var.e;
        list.getClass();
        return R(list, (List) d3d0Var.l(((zc9) this.b).h), (h950) v0Var.b);
    }

    public void a0(String str) {
        str.getClass();
        Iterator it = ((List) ((c14) this.c).f3556a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured((adf0) this.b);
        }
    }

    @Override // a.w83
    public List b(p4d0 p4d0Var) {
        p4d0Var.getClass();
        s2d0 s2d0Var = p4d0Var.e;
        List list = s2d0Var.z;
        list.getClass();
        return R(list, (List) s2d0Var.l(((zc9) this.b).c), (h950) p4d0Var.b);
    }

    public xsn b0(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        cad cadVar = (cad) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            fhj fhjVar = (fhj) cadVar.b;
            if (!(inputConnection instanceof xsn)) {
                inputConnection = new xsn(editorInfo, inputConnection, (EditText) fhjVar.f9543a);
            }
            inputConnection2 = inputConnection;
        }
        return (xsn) inputConnection2;
    }

    @Override // a.m83
    public Object c(v0 v0Var, p3d0 p3d0Var, wsy wsyVar) {
        v0Var.getClass();
        p3d0Var.getClass();
        wsyVar.getClass();
        m2d0 m2d0Var = (m2d0) h8x.L(p3d0Var, ((zc9) this.b).i);
        if (m2d0Var == null) {
            return null;
        }
        return ((ehf0) this.c).t(wsyVar, m2d0Var, (h950) v0Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    public a780 c0(o1x o1xVar, f7k0 f7k0Var) {
        Context context;
        boolean z;
        boolean z2;
        f7k0 f7k0Var2;
        boolean z3;
        boolean z4;
        LinkedHashMap linkedHashMap;
        Context context2 = o1xVar.f24504a;
        j1h0 j1h0Var = o1xVar.s;
        asb0 asb0Var = o1xVar.t;
        String str = o1xVar.g;
        yzp yzpVar = o1xVar.h;
        vi9 vi9Var = o1xVar.l;
        vi9 vi9Var2 = o1xVar.m;
        vi9 vi9Var3 = o1xVar.n;
        kuo kuoVar = t1x.b;
        Bitmap.Config config = (Bitmap.Config) qbc.P(o1xVar, kuoVar);
        kuo kuoVar2 = t1x.h;
        boolean zBooleanValue = ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue();
        kuo kuoVar3 = q1x.f27974a;
        if (!((List) qbc.P(o1xVar, kuoVar3)).isEmpty()) {
            context = context2;
            if (!tx3.u((Bitmap.Config) qbc.P(o1xVar, kuoVar), lut0.f20691a)) {
                z = false;
            }
            if (cy2.C((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                if (Q(o1xVar, (Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                    z2 = z;
                    f7k0Var2 = f7k0Var;
                    if (((rmv) this.c).c(f7k0Var2)) {
                    }
                    if (z2 || !z3) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (zBooleanValue || !((List) qbc.P(o1xVar, kuoVar3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
                    if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                        if (config != null) {
                            linkedHashMap.put(kuoVar, config);
                        } else {
                            linkedHashMap.remove(kuoVar);
                        }
                    }
                    if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
                        linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
                    }
                    return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
                }
                z2 = z;
                f7k0Var2 = f7k0Var;
                z3 = false;
                if (z2) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
                if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                    if (config != null) {
                        linkedHashMap.put(kuoVar, config);
                    } else {
                        linkedHashMap.remove(kuoVar);
                    }
                }
                if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
                    linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
                }
                return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
            }
            z2 = z;
            f7k0Var2 = f7k0Var;
            z3 = true;
            if (z2) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z4 = false;
            } else {
                z4 = false;
            }
            linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
            if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                if (config != null) {
                    linkedHashMap.put(kuoVar, config);
                } else {
                    linkedHashMap.remove(kuoVar);
                }
            }
            if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
                linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
            }
            return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
        }
        context = context2;
        z = true;
        if (cy2.C((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
            if (Q(o1xVar, (Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                z2 = z;
                f7k0Var2 = f7k0Var;
                if (((rmv) this.c).c(f7k0Var2)) {
                }
                if (z2) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
                if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                    if (config != null) {
                        linkedHashMap.put(kuoVar, config);
                    } else {
                        linkedHashMap.remove(kuoVar);
                    }
                }
                if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
                    linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
                }
                return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
            }
            z2 = z;
            f7k0Var2 = f7k0Var;
            z3 = false;
            if (z2) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z4 = false;
            } else {
                z4 = false;
            }
            linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
            if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
                if (config != null) {
                    linkedHashMap.put(kuoVar, config);
                } else {
                    linkedHashMap.remove(kuoVar);
                }
            }
            if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
                linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
            }
            return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
        }
        z2 = z;
        f7k0Var2 = f7k0Var;
        z3 = true;
        if (z2) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z4 = false;
        } else {
            z4 = false;
        }
        linkedHashMap = new LinkedHashMap(xp20.j(o1xVar.w.n.f20682a, o1xVar.u.f20682a));
        if (config != ((Bitmap.Config) qbc.P(o1xVar, kuoVar))) {
            if (config != null) {
                linkedHashMap.put(kuoVar, config);
            } else {
                linkedHashMap.remove(kuoVar);
            }
        }
        if (z4 != ((Boolean) qbc.P(o1xVar, kuoVar2)).booleanValue()) {
            linkedHashMap.put(kuoVar2, Boolean.valueOf(z4));
        }
        return new a780(context, f7k0Var2, j1h0Var, asb0Var, str, yzpVar, vi9Var, vi9Var2, vi9Var3, new luo(aac.f0(linkedHashMap)));
    }

    @Override // a.w83
    public List d(v0 v0Var, z3 z3Var, int i2) {
        String str;
        h950 h950Var = (h950) v0Var.b;
        if (i2 == 0) {
            throw null;
        }
        if (z3Var instanceof i3d0) {
            List list = ((i3d0) z3Var).v;
            list.getClass();
            return R(list, null, h950Var);
        }
        if (!(z3Var instanceof p3d0)) {
            udk.e(z3Var, "Unknown message: ");
            return null;
        }
        int iE = hne.E(i2);
        if (iE == 1 || iE == 2 || iE == 3) {
            List list2 = ((p3d0) z3Var).x;
            list2.getClass();
            return R(list2, null, h950Var);
        }
        if (i2 == 1) {
            str = "FUNCTION";
        } else if (i2 == 2) {
            str = "PROPERTY";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "PROPERTY_SETTER";
        } else {
            str = "PROPERTY_GETTER";
        }
        throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
    }

    public void d0() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    @Override // a.w83
    public List e(v0 v0Var, p3d0 p3d0Var) {
        p3d0Var.getClass();
        List list = p3d0Var.z;
        list.getClass();
        return R(list, null, (h950) v0Var.b);
    }

    public void e0(boolean z) {
        itn itnVar = (itn) ((fhj) ((cad) this.c).b).b;
        if (itnVar.c != z) {
            if (itnVar.b != null) {
                qsn qsnVarA = qsn.a();
                htn htnVar = itnVar.b;
                qsnVarA.getClass();
                z1x.x(htnVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = qsnVarA.f29266a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    qsnVarA.b.remove(htnVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            itnVar.c = z;
            if (z) {
                itn.a(itnVar.f15362a, qsn.a().c());
            }
        }
    }

    @Override // a.w83
    public ArrayList f(f4d0 f4d0Var, h950 h950Var) {
        f4d0Var.getClass();
        h950Var.getClass();
        List list = f4d0Var.k;
        list.getClass();
        return R(list, (List) f4d0Var.l(((zc9) this.b).l), h950Var);
    }

    public void f0(Fragment fragment, iiy iiyVar, double d2) {
        iiyVar.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putDouble((String) this.b, d2);
        this.c = Double.valueOf(d2);
    }

    @Override // a.w83
    public ArrayList g(a4d0 a4d0Var, h950 h950Var) {
        a4d0Var.getClass();
        h950Var.getClass();
        List list = a4d0Var.r;
        list.getClass();
        return R(list, (List) a4d0Var.l(((zc9) this.b).k), h950Var);
    }

    public void g0(String str) {
        i8i.D("point", str, ((ih5) this.b).f14765a, "cyber_champ_all_call");
        ((zr1) this.c).e(str);
    }

    @Override // a.xo80
    public Object h(sgy sgyVar, ArrayList arrayList) {
        Object g0g0Var;
        Object obj = ((emc) this.c).get(azw.G(sgyVar));
        obj.getClass();
        oz40 oz40Var = (oz40) obj;
        Object wo80Var = oz40Var.f26088a.get();
        if (wo80Var == null) {
            synchronized (oz40Var) {
                wo80Var = oz40Var.f26088a.get();
                if (wo80Var == null) {
                    wo80Var = new wo80();
                    oz40Var.f26088a = new SoftReference(wo80Var);
                }
            }
        }
        wo80 wo80Var2 = (wo80) wo80Var;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tiy((kiy) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = wo80Var2.f39481a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = (jiy) ((Function2) this.b).invoke(sgyVar, arrayList);
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            j0g0 j0g0Var = new j0g0(g0g0Var);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, j0g0Var);
            obj2 = objPutIfAbsent == null ? j0g0Var : objPutIfAbsent;
        }
        return ((j0g0) obj2).f15681a;
    }

    public void h0(long j2, long j3, String str) {
        kt2 kt2Var = ((ih5) this.b).f14765a;
        jo20 jo20Var = new jo20();
        jo20Var.put("point", str);
        if (j2 != -1) {
            jo20Var.put("sport_id", Long.valueOf(j2));
        }
        if (j3 != -1) {
            jo20Var.put("sub_sport_id", Long.valueOf(j3));
        }
        kt2Var.a("main_cyber_more_call", jo20Var.b());
        s1p s1pVar = ((zr1) this.c).f44833a;
        yni0 yni0Var = new yni0();
        if (j3 > 0) {
            yni0Var.add(new i1p((byte) 2, j2));
        }
        if (j3 > 0) {
            yni0Var.add(new i1p((byte) 0, j3));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 3158L);
    }

    @Override // a.m83
    public Object i(v0 v0Var, p3d0 p3d0Var, wsy wsyVar) {
        v0Var.getClass();
        p3d0Var.getClass();
        wsyVar.getClass();
        return null;
    }

    public void i0(i1g i1gVar, long j2, long j3) {
        kt2 kt2Var = ((ih5) this.b).f14765a;
        jo20 jo20Var = new jo20();
        String str = i1gVar.f13996a;
        jo20Var.put("option", str);
        if (j2 != -1) {
            jo20Var.put("sport_id", Long.valueOf(j2));
        }
        if (j3 != -1) {
            jo20Var.put("sub_sport_id", Long.valueOf(j3));
        }
        kt2Var.a("popular_cybersport_all_click", jo20Var.b());
        s1p s1pVar = ((zr1) this.c).f44833a;
        yni0 yni0Var = new yni0();
        if (j2 != -1) {
            yni0Var.add(new i1p((byte) 2, j2));
        }
        if (j3 != -1) {
            yni0Var.add(new i1p((byte) 0, j3));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 11101L);
    }

    @Override // a.w83
    public List j(v0 v0Var, p3d0 p3d0Var) {
        p3d0Var.getClass();
        List list = p3d0Var.y;
        list.getClass();
        return R(list, null, (h950) v0Var.b);
    }

    public Object j0(ArrayList arrayList, zje zjeVar) {
        ou6 ou6Var = (ou6) this.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(i120.f0((qu6) it.next(), (vby) this.b));
        }
        Object objW0 = sj3.w0(zjeVar, ou6Var.f25862a, new nu6(ou6Var, arrayList2, null, (byte) 1), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public a780 k0(a780 a780Var) {
        boolean z;
        luo luoVar = a780Var.j;
        kuo kuoVar = t1x.b;
        if (!cy2.C((Bitmap.Config) qbc.Q(a780Var, kuoVar)) || ((rmv) this.c).a()) {
            z = false;
        } else {
            luoVar.getClass();
            LinkedHashMap linkedHashMapP = xp20.p(luoVar.f20682a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapP.put(kuoVar, config);
            } else {
                linkedHashMapP.remove(kuoVar);
            }
            luoVar = new luo(aac.f0(linkedHashMapP));
            z = true;
        }
        return z ? new a780(a780Var.f354a, a780Var.b, a780Var.c, a780Var.d, a780Var.e, a780Var.f, a780Var.g, a780Var.h, a780Var.i, luoVar) : a780Var;
    }

    @Override // a.w83
    public List l(v0 v0Var, z3 z3Var, int i2) {
        h950 h950Var = (h950) v0Var.b;
        zc9 zc9Var = (zc9) this.b;
        z3Var.getClass();
        if (i2 == 0) {
            throw null;
        }
        if (z3Var instanceof v2d0) {
            v2d0 v2d0Var = (v2d0) z3Var;
            List list = v2d0Var.h;
            list.getClass();
            return R(list, (List) v2d0Var.l(zc9Var.b), h950Var);
        }
        if (z3Var instanceof i3d0) {
            i3d0 i3d0Var = (i3d0) z3Var;
            List list2 = i3d0Var.u;
            list2.getClass();
            return R(list2, (List) i3d0Var.l(zc9Var.d), h950Var);
        }
        if (!(z3Var instanceof p3d0)) {
            udk.e(z3Var, "Unknown message: ");
            return null;
        }
        int iE = hne.E(i2);
        if (iE == 1) {
            p3d0 p3d0Var = (p3d0) z3Var;
            List list3 = p3d0Var.u;
            list3.getClass();
            return R(list3, (List) p3d0Var.l(zc9Var.e), h950Var);
        }
        if (iE == 2) {
            p3d0 p3d0Var2 = (p3d0) z3Var;
            List list4 = p3d0Var2.v;
            list4.getClass();
            return R(list4, (List) p3d0Var2.l(zc9Var.f), h950Var);
        }
        if (iE != 3) {
            jf4.n("Unsupported callable kind with property proto");
            return null;
        }
        p3d0 p3d0Var3 = (p3d0) z3Var;
        List list5 = p3d0Var3.w;
        list5.getClass();
        return R(list5, (List) p3d0Var3.l(zc9Var.g), h950Var);
    }

    public mii0 l0(g950 g950Var, String str) {
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        return new mii0(this, new er30(strB.concat(str)));
    }

    @Override // a.w83
    public List m(v0 v0Var, z3 z3Var, int i2, int i3, i4d0 i4d0Var) {
        if (i2 == 0) {
            throw null;
        }
        List listO = i4d0Var != null ? o(v0Var, z3Var, i2, i3, i4d0Var) : null;
        return listO == null ? iun.f15405a : listO;
    }

    @Override // a.w83
    public List o(v0 v0Var, z3 z3Var, int i2, int i3, i4d0 i4d0Var) {
        if (i2 == 0) {
            throw null;
        }
        i4d0Var.getClass();
        List list = i4d0Var.j;
        list.getClass();
        return R(list, (List) i4d0Var.l(((zc9) this.b).j), (h950) v0Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(yje yjeVar) {
        tu6 tu6Var;
        if (yjeVar instanceof tu6) {
            tu6Var = (tu6) yjeVar;
            int i2 = tu6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tu6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                tu6Var = new tu6(this, yjeVar);
            }
        } else {
            tu6Var = new tu6(this, yjeVar);
        }
        Object objW0 = tu6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = tu6Var.k;
        yje yjeVar2 = null;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            tu6Var.k = 1;
            objW0 = sj3.w0(tu6Var, ou6Var.f25862a, new yp6(ou6Var, yjeVar2, (byte) 4), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o050.Z((pu6) it.next(), (vby) this.b));
        }
        return arrayList;
    }

    public boolean q(String str, String[] strArr) {
        try {
            for (String str2 : strArr) {
                File file = new File(str2);
                if (file.exists() || file.isFile()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(long j2, int i2, double d2, long j3, long j4, zje zjeVar) {
        uu6 uu6Var;
        if (zjeVar instanceof uu6) {
            uu6Var = (uu6) zjeVar;
            int i3 = uu6Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uu6Var.k = i3 - Integer.MIN_VALUE;
            } else {
                uu6Var = new uu6(this, zjeVar);
            }
        } else {
            uu6Var = new uu6(this, zjeVar);
        }
        Object objW0 = uu6Var.i;
        wne wneVar = wne.f39444a;
        int i4 = uu6Var.k;
        if (i4 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            uu6Var.k = 1;
            objW0 = sj3.w0(uu6Var, ou6Var.f25862a, new lu6(j2, i2, d2, j3, j4, ou6Var, null), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return Boolean.valueOf(objW0 != null);
    }

    public Object s(zje zjeVar) {
        Object objW0 = sj3.w0(zjeVar, ((ou6) this.c).f25862a, new pd(2, null, (byte) 21), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(long j2, zje zjeVar) {
        vu6 vu6Var;
        if (zjeVar instanceof vu6) {
            vu6Var = (vu6) zjeVar;
            int i2 = vu6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vu6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                vu6Var = new vu6(this, zjeVar);
            }
        } else {
            vu6Var = new vu6(this, zjeVar);
        }
        Object objW0 = vu6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = vu6Var.k;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            vu6Var.k = 1;
            objW0 = sj3.w0(vu6Var, ou6Var.f25862a, new ju6(j2, ou6Var, null, (byte) 0), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        pu6 pu6Var = (pu6) objW0;
        if (pu6Var != null) {
            return o050.Z(pu6Var, (vby) this.b);
        }
        itt0.a();
        return null;
    }

    public String toString() {
        switch (this.f4357a) {
            case 12:
                try {
                    return x().toString();
                } catch (o660 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public zj2 u(owe oweVar) {
        ou6 ou6Var = (ou6) this.c;
        int iOrdinal = oweVar.ordinal();
        byte b = 1;
        yje yjeVar = null;
        if (iOrdinal == 0) {
            return wwb.C(ou6Var.f25862a, new String[]{"bet_events"}, new gu6(q4f.l.a(), ou6Var, yjeVar, b));
        }
        if (iOrdinal == 1) {
            return wwb.C(ou6Var.f25862a, new String[]{"bet_events"}, new gu6(q4f.l.a(), ou6Var, yjeVar, (byte) 0));
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable w(zje zjeVar) {
        wu6 wu6Var;
        if (zjeVar instanceof wu6) {
            wu6Var = (wu6) zjeVar;
            int i2 = wu6Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wu6Var.k = i2 - Integer.MIN_VALUE;
            } else {
                wu6Var = new wu6(this, zjeVar);
            }
        } else {
            wu6Var = new wu6(this, zjeVar);
        }
        Object objW0 = wu6Var.i;
        wne wneVar = wne.f39444a;
        int i3 = wu6Var.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objW0);
            ou6 ou6Var = (ou6) this.c;
            wu6Var.k = 1;
            objW0 = sj3.w0(wu6Var, ou6Var.f25862a, new yp6(ou6Var, yjeVar, (byte) 4), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oja0.a0((pu6) it.next()));
        }
        return arrayList;
    }

    public r68 x() throws o660 {
        int[] iArr;
        r68 r68Var = (r68) this.c;
        if (r68Var != null) {
            return r68Var;
        }
        nhf0 nhf0Var = (nhf0) this.b;
        r68 r68Var2 = (r68) nhf0Var.d;
        if (r68Var2 == null) {
            mjq mjqVar = (mjq) nhf0Var.f23530a;
            int i2 = mjqVar.b;
            int i3 = mjqVar.c;
            boolean z = true;
            int i4 = 0;
            if (i2 < 40 || i3 < 40) {
                r68 r68Var3 = new r68(i2, i3);
                if (((byte[]) nhf0Var.b).length < i2) {
                    nhf0Var.b = new byte[i2];
                }
                int i5 = 0;
                while (true) {
                    iArr = (int[]) nhf0Var.c;
                    if (i5 >= 32) {
                        break;
                    }
                    iArr[i5] = 0;
                    i5++;
                }
                for (int i6 = 1; i6 < 5; i6++) {
                    byte[] bArrH = mjqVar.h((byte[]) nhf0Var.b, (i3 * i6) / 5);
                    int i7 = (i2 * 4) / 5;
                    for (int i8 = i2 / 5; i8 < i7; i8++) {
                        int i9 = (bArrH[i8] & 255) >> 3;
                        iArr[i9] = iArr[i9] + 1;
                    }
                }
                int iG = nhf0.g(iArr);
                byte[] bArrG = mjqVar.g();
                for (int i10 = 0; i10 < i3; i10++) {
                    int i11 = i10 * i2;
                    for (int i12 = 0; i12 < i2; i12++) {
                        if ((bArrG[i11 + i12] & 255) < iG) {
                            r68Var3.h(i12, i10);
                        }
                    }
                }
                nhf0Var.d = r68Var3;
                r68Var2 = r68Var3;
            } else {
                byte[] bArrG2 = mjqVar.g();
                int i13 = i2 >> 3;
                if ((i2 & 7) != 0) {
                    i13++;
                }
                int i14 = i3 >> 3;
                if ((i3 & 7) != 0) {
                    i14++;
                }
                int i15 = i3 - 8;
                int i16 = i2 - 8;
                int i17 = 2;
                int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i14, i13);
                int i18 = 0;
                while (true) {
                    int i19 = 8;
                    if (i18 >= i14) {
                        break;
                    }
                    boolean z2 = z;
                    int i20 = i18 << 3;
                    if (i20 > i15) {
                        i20 = i15;
                    }
                    int i21 = i4;
                    while (i4 < i13) {
                        int i22 = i17;
                        int i23 = i4 << 3;
                        if (i23 > i16) {
                            i23 = i16;
                        }
                        int i24 = (i20 * i2) + i23;
                        int i25 = i21;
                        int i26 = i25;
                        int i27 = i26;
                        int i28 = 255;
                        while (i25 < i19) {
                            byte[] bArr = bArrG2;
                            int i29 = i20;
                            int i30 = i21;
                            int i31 = i27;
                            int i32 = i28;
                            while (i30 < i19) {
                                int i33 = i30;
                                int i34 = bArr[i24 + i30] & 255;
                                i26 += i34;
                                if (i34 < i32) {
                                    i32 = i34;
                                }
                                if (i34 > i31) {
                                    i31 = i34;
                                }
                                i30 = i33 + 1;
                                i19 = 8;
                            }
                            if (i31 - i32 > 24) {
                                while (true) {
                                    i25++;
                                    i24 += i2;
                                    if (i25 < 8) {
                                        int i35 = i21;
                                        for (int i36 = 8; i35 < i36; i36 = 8) {
                                            i26 += bArr[i24 + i35] & 255;
                                            i35++;
                                            i32 = i32;
                                        }
                                    }
                                }
                            }
                            i25++;
                            i24 += i2;
                            i28 = i32;
                            bArrG2 = bArr;
                            i20 = i29;
                            i19 = 8;
                            i27 = i31;
                        }
                        byte[] bArr2 = bArrG2;
                        int i37 = i20;
                        int i38 = i26 >> 6;
                        int i39 = i28;
                        if (i27 - i39 <= 24) {
                            i38 = i39 / 2;
                            if (i18 > 0 && i4 > 0) {
                                int[] iArr3 = iArr2[i18 - 1];
                                int i40 = i4 - 1;
                                int i41 = (((iArr2[i18][i40] * 2) + iArr3[i4]) + iArr3[i40]) / 4;
                                if (i39 < i41) {
                                    i38 = i41;
                                }
                            }
                        }
                        iArr2[i18][i4] = i38;
                        i4++;
                        i17 = i22;
                        bArrG2 = bArr2;
                        i20 = i37;
                        i19 = 8;
                    }
                    i18++;
                    z = z2;
                    i4 = i21;
                }
                byte[] bArr3 = bArrG2;
                int i42 = i4;
                int i43 = i17;
                r68Var2 = new r68(i2, i3);
                int i44 = i42;
                while (i44 < i14) {
                    int i45 = i44 << 3;
                    if (i45 > i15) {
                        i45 = i15;
                    }
                    int iMin = i44 < i43 ? 2 : Math.min(i44, i14 - 3);
                    int i46 = i42;
                    while (i46 < i13) {
                        int i47 = i46 << 3;
                        if (i47 > i16) {
                            i47 = i16;
                        }
                        int iMin2 = i46 < 2 ? 2 : Math.min(i46, i13 - 3);
                        int i48 = i44;
                        int i49 = -2;
                        int i50 = i42;
                        for (int i51 = 2; i49 <= i51; i51 = 2) {
                            int[] iArr4 = iArr2[iMin + i49];
                            i50 = iArr4[iMin2 - 2] + iArr4[iMin2 - 1] + iArr4[iMin2] + iArr4[iMin2 + 1] + iArr4[iMin2 + 2] + i50;
                            i49++;
                        }
                        int i52 = i50 / 25;
                        int i53 = (i45 * i2) + i47;
                        int i54 = i45;
                        int i55 = i42;
                        while (true) {
                            if (i55 < 8) {
                                int i56 = i46;
                                int i57 = i42;
                                for (int i58 = 8; i57 < i58; i58 = 8) {
                                    int i59 = i57;
                                    if ((bArr3[i53 + i57] & 255) <= i52) {
                                        r68Var2.h(i47 + i59, i54 + i55);
                                    }
                                    i57 = i59 + 1;
                                }
                                i55++;
                                i53 += i2;
                                i46 = i56;
                            }
                        }
                        i46++;
                        i45 = i54;
                        i44 = i48;
                    }
                    i43 = 2;
                    i44++;
                }
                nhf0Var.d = r68Var2;
            }
        }
        this.c = r68Var2;
        return r68Var2;
    }

    public p68 y(p68 p68Var, int i2) throws o660 {
        nhf0 nhf0Var = (nhf0) this.b;
        int[] iArr = (int[]) nhf0Var.c;
        mjq mjqVar = (mjq) nhf0Var.f23530a;
        int i3 = mjqVar.b;
        if (p68Var.b < i3) {
            p68Var = new p68(i3);
        } else {
            int length = p68Var.f26442a.length;
            for (int i4 = 0; i4 < length; i4++) {
                p68Var.f26442a[i4] = 0;
            }
        }
        if (((byte[]) nhf0Var.b).length < i3) {
            nhf0Var.b = new byte[i3];
        }
        for (int i5 = 0; i5 < 32; i5++) {
            iArr[i5] = 0;
        }
        byte[] bArrH = mjqVar.h((byte[]) nhf0Var.b, i2);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = (bArrH[i6] & 255) >> 3;
            iArr[i7] = iArr[i7] + 1;
        }
        int iG = nhf0.g(iArr);
        if (i3 < 3) {
            for (int i8 = 0; i8 < i3; i8++) {
                if ((bArrH[i8] & 255) < iG) {
                    p68Var.j(i8);
                }
            }
        } else {
            int i9 = bArrH[0] & 255;
            int i10 = bArrH[1] & 255;
            int i11 = 1;
            while (i11 < i3 - 1) {
                int i12 = i11 + 1;
                int i13 = bArrH[i12] & 255;
                if ((((i10 * 4) - i9) - i13) / 2 < iG) {
                    p68Var.j(i11);
                }
                i9 = i10;
                i11 = i12;
                i10 = i13;
            }
        }
        return p68Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(String str, String str2, String str3, zje zjeVar) {
        eqg eqgVar;
        if (zjeVar instanceof eqg) {
            eqgVar = (eqg) zjeVar;
            int i2 = eqgVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eqgVar.k = i2 - Integer.MIN_VALUE;
            } else {
                eqgVar = new eqg(this, zjeVar);
            }
        } else {
            eqgVar = new eqg(this, zjeVar);
        }
        Object objA = eqgVar.i;
        wne wneVar = wne.f39444a;
        int i3 = eqgVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            kpg kpgVar = (kpg) ((e8g) this.c).invoke();
            eqgVar.k = 1;
            objA = kpgVar.a(str, str2, str3, eqgVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public /* synthetic */ chf0(Object obj, Object obj2, byte b) {
        this.f4357a = b;
        this.b = obj;
        this.c = obj2;
    }

    public chf0(yqc yqcVar, viu viuVar) {
        this.f4357a = (byte) 20;
        viuVar.getClass();
        this.b = yqcVar;
        this.c = viuVar;
    }

    public chf0(zte0 zte0Var, rpx rpxVar) {
        this.f4357a = (byte) 10;
        zte0Var.getClass();
        rpxVar.getClass();
        this.b = zte0Var;
        this.c = rpxVar;
    }

    public /* synthetic */ chf0(Object obj, byte b) {
        this.f4357a = b;
        this.b = obj;
    }

    public chf0(azj0 azj0Var) {
        this.f4357a = (byte) 24;
        azj0Var.getClass();
        this.b = azj0Var;
        this.c = new jwd(this, (byte) 23);
    }

    public chf0(ym40 ym40Var, n660 n660Var, zc9 zc9Var) {
        this.f4357a = (byte) 7;
        ym40Var.getClass();
        zc9Var.getClass();
        this.b = zc9Var;
        this.c = new ehf0(ym40Var, n660Var);
    }

    public chf0(rrc rrcVar, vby vbyVar) {
        this.f4357a = (byte) 11;
        vbyVar.getClass();
        this.b = vbyVar;
        this.c = ((OnexDatabase) rrcVar.b).j();
    }

    public chf0(gbe0 gbe0Var) {
        Object nqdVar;
        this.f4357a = (byte) 6;
        this.b = gbe0Var;
        int i2 = Build.VERSION.SDK_INT;
        byte b = 3;
        if (i2 < 26) {
            boolean z = smv.f32467a;
        } else {
            if (!smv.f32467a) {
                if (i2 != 26 && i2 != 27) {
                    nqdVar = new nqd(b, true);
                } else {
                    nqdVar = new gst();
                }
            }
            this.c = nqdVar;
        }
        nqdVar = new nqd(b, false);
        this.c = nqdVar;
    }

    public chf0(us00 us00Var) {
        this.f4357a = (byte) 1;
        this.b = us00Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.mumu.store");
    }

    public chf0(EditText editText) {
        this.f4357a = (byte) 8;
        this.b = editText;
        this.c = new cad(editText);
    }

    public chf0(List list) {
        this.f4357a = (byte) 29;
        this.b = list;
        this.c = new xvi(this, (byte) 17);
    }

    public chf0(byte b) {
        this.f4357a = b;
        switch (b) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            default:
                this.b = new adf0();
                this.c = o2e.Z(iun.f15405a);
                break;
        }
    }

    public chf0(esg0 esg0Var, HashMap map, HashMap map2) {
        this.f4357a = (byte) 2;
        this.b = esg0Var;
        this.c = map;
    }

    public chf0(Function2 function2) {
        this.f4357a = (byte) 18;
        this.b = function2;
        this.c = new emc();
    }
}
