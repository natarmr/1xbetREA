package a;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes4.dex */
public final class c5k implements kuc, n1x, hih0 {
    public static final c5k c;
    public static final int[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3775a;
    public Object b;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        c = new c5k(new tm80(fValueOf2, fValueOf2), new tm80(fValueOf, fValueOf));
        d = new int[]{1, 1, 2};
    }

    public c5k(byte b) {
        switch (b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f3775a = new or30();
                this.b = new or30();
                break;
            default:
                this.f3775a = new fuj0((byte) 12);
                this.b = new xr((byte) 2);
                break;
        }
    }

    public void a() {
        String str = (String) this.f3775a;
        try {
            new File((File) ((xzp) this.b).c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public i0g0 b(int i, int i2, p68 p68Var) throws o660 {
        EnumMap enumMap;
        int[] iArrL = n2t0.l(p68Var, i2, false, d, new int[3]);
        try {
            return ((xr) this.b).e(i, p68Var, iArrL);
        } catch (sae0 unused) {
            fuj0 fuj0Var = (fuj0) this.f3775a;
            StringBuilder sb = (StringBuilder) fuj0Var.b;
            sb.setLength(0);
            int[] iArr = (int[]) fuj0Var.f10166a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i3 = p68Var.b;
            int iF = iArrL[1];
            int i4 = 0;
            for (int i5 = 0; i5 < 2 && iF < i3; i5++) {
                int iH = n2t0.h(p68Var, iArr, iF, n2t0.g);
                sb.append((char) ((iH % 10) + 48));
                for (int i6 : iArr) {
                    iF += i6;
                }
                if (iH >= 10) {
                    i4 |= 1 << (1 - i5);
                }
                if (i5 != 1) {
                    iF = p68Var.f(p68Var.e(iF));
                }
            }
            if (sb.length() != 2) {
                throw o660.a();
            }
            if (Integer.parseInt(sb.toString()) % 4 != i4) {
                throw o660.a();
            }
            String string = sb.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(a3g0.class);
                enumMap.put(a3g0.f, Integer.valueOf(string));
            }
            float f = i;
            i0g0 i0g0Var = new i0g0(string, null, new d3g0[]{new d3g0((iArrL[0] + iArrL[1]) / 2.0f, f), new d3g0(iF, f)}, ju5.q);
            if (enumMap != null) {
                i0g0Var.a(enumMap);
            }
            return i0g0Var;
        }
    }

    public Object c(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((Function1) this.f3775a).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:51|136|52|53|134|54|(1:56)(1:60)|57|132|61|(2:63|144)(1:145)|64|49) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:(1:(3:13|14|15)(2:18|19))(3:20|21|22))(4:23|130|24|25)|125|46|47|140|48|(13:51|136|52|53|134|54|(1:56)(1:60)|57|132|61|(2:63|144)(1:145)|64|49)|143|73|(4:76|(3:147|78|150)(1:149)|148|74)|146|80|121|(1:123)|124) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:127|40|41|138|42|(1:45)) */
    /* JADX WARN: Code duplicated, block: B:100:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f7 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0207 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0210 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0217  */
    /* JADX WARN: Code duplicated, block: B:108:0x0219  */
    /* JADX WARN: Code duplicated, block: B:111:0x021e A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:114:0x023c A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0246 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x024e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0250 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0258 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #8 {all -> 0x016d, blocks: (B:48:0x010a, B:49:0x0115, B:51:0x011b), top: B:140:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #5 {all -> 0x0139, blocks: (B:54:0x012a, B:56:0x012e), top: B:134:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a A[Catch: all -> 0x0159, TryCatch #4 {all -> 0x0159, blocks: (B:61:0x013e, B:64:0x0144, B:73:0x0175, B:74:0x0184, B:76:0x018a, B:78:0x0199), top: B:132:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01be A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c7 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x0044, B:87:0x01b6, B:90:0x01be, B:92:0x01c7, B:96:0x01d3, B:98:0x01d7, B:101:0x01f7, B:103:0x0207, B:105:0x0210, B:109:0x021a, B:111:0x021e, B:114:0x023c, B:115:0x0246, B:80:0x019d, B:117:0x0250, B:118:0x0257, B:119:0x0258, B:21:0x006d, B:37:0x00be), top: B:129:0x002a }] */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0239, code lost:
    
        if (a.qcc.P(r10, r7) == r4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0159, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        r8 = r26;
        r5 = r11;
        r7 = r14;
        r1 = r15;
        r12 = r0;
        r0 = r13;
        r13 = r9;
        r10 = r17;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
    
        r19 = r6;
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a2, code lost:
    
        r26 = r5;
        r19 = r6;
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        r1 = r12;
        r12 = r0;
        r0 = r1;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b3, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0202 -> B:39:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r25, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c5k.d(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(zje zjeVar) {
        b1d b1dVar;
        if (zjeVar instanceof b1d) {
            b1dVar = (b1d) zjeVar;
            int i = b1dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1dVar.k = i - Integer.MIN_VALUE;
            } else {
                b1dVar = new b1d(this, zjeVar);
            }
        } else {
            b1dVar = new b1d(this, zjeVar);
        }
        Object objB = b1dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = b1dVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            a1d a1dVar = (a1d) this.f3775a;
            String strA = ((btt0) this.b).a();
            b1dVar.k = 1;
            objB = ((y0d) ((sza) a1dVar.b).invoke()).b(strA, b1dVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Double d2 = ((dwa) ((q16) objB).a()).f6787a;
        if (d2 != null) {
            return new awa(d2.doubleValue());
        }
        jf4.k(null);
        return null;
    }

    public ClipboardManager f() {
        ClipboardManager clipboardManager = (ClipboardManager) this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.f3775a).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object g(int i, zje zjeVar, boolean z) {
        fce fceVar;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof fce) {
            fceVar = (fce) zjeVar;
            int i2 = fceVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fceVar.k = i2 - Integer.MIN_VALUE;
            } else {
                fceVar = new fce(this, zjeVar);
            }
        } else {
            fceVar = new fce(this, zjeVar);
        }
        fce fceVar2 = fceVar;
        Object objA = fceVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = fceVar2.k;
        if (i3 == 0) {
            z1x.P(objA);
            psc pscVar = (psc) this.f3775a;
            knf0Var.getClass();
            String strC = knf0Var.c();
            fceVar2.k = 1;
            objA = ((ybe) ((sza) pscVar.b).invoke()).a(1357, strC, i, z, fceVar2);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable i(int i, zje zjeVar) {
        wzf wzfVar;
        knf0 knf0Var = (knf0) this.f3775a;
        if (zjeVar instanceof wzf) {
            wzfVar = (wzf) zjeVar;
            int i2 = wzfVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzfVar.k = i2 - Integer.MIN_VALUE;
            } else {
                wzfVar = new wzf(this, zjeVar);
            }
        } else {
            wzfVar = new wzf(this, zjeVar);
        }
        wzf wzfVar2 = wzfVar;
        Object objA = wzfVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = wzfVar2.k;
        if (i3 == 0) {
            z1x.P(objA);
            a0g a0gVar = (a0g) ((sza) this.b).invoke();
            knf0Var.getClass();
            String strC = knf0Var.c();
            wzfVar2.k = 1;
            objA = a0gVar.a(1, 1357, 22, i, strC, wzfVar2);
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
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new vzf((zzf) it.next()));
        }
        return arrayList;
    }

    public lk5 j() {
        return new lk5(((xzp) ((epi0) this.f3775a).b).C(), ((uii) ((iw20) this.b).f15470a).r());
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        cgk0 cgk0Var = (cgk0) this.b;
        if (cgk0Var.l() < ((ArrayList) this.f3775a).size() - 1) {
            cgk0Var.m(cgk0Var.l() + 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable l(zje zjeVar) {
        c1d c1dVar;
        a0t0 a0t0Var;
        if (zjeVar instanceof c1d) {
            c1dVar = (c1d) zjeVar;
            int i = c1dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1dVar.k = i - Integer.MIN_VALUE;
            } else {
                c1dVar = new c1d(this, zjeVar);
            }
        } else {
            c1dVar = new c1d(this, zjeVar);
        }
        Object objC = c1dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = c1dVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            a1d a1dVar = (a1d) this.f3775a;
            String strA = ((btt0) this.b).a();
            c1dVar.k = 1;
            objC = ((y0d) ((sza) a1dVar.b).invoke()).c(strA, c1dVar);
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
        Iterable<s2z> iterable = (Iterable) ((q16) objC).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (s2z s2zVar : iterable) {
            s2zVar.getClass();
            Long l = s2zVar.f31529a;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = s2zVar.b;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Double d2 = s2zVar.c;
            if (d2 == null) {
                jf4.k(null);
                return null;
            }
            double dDoubleValue = d2.doubleValue();
            Integer num = s2zVar.d;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            a0t0.f39a.getClass();
            a0t0 a0t0Var2 = a0t0.b;
            if (iIntValue == 1) {
                a0t0Var = a0t0Var2;
            } else {
                a0t0 a0t0Var3 = a0t0.c;
                if (iIntValue == -1) {
                    a0t0Var = a0t0Var3;
                } else {
                    a0t0Var = a0t0Var2;
                }
            }
            arrayList.add(new p2z(jLongValue, jLongValue2, dDoubleValue, a0t0Var));
        }
        return arrayList;
    }

    public boolean m(iiy iiyVar, Object obj) {
        iiyVar.getClass();
        ijq ijqVar = (ijq) this.b;
        return ((((Number) ((thy) this.f3775a).get(obj)).intValue() >>> ijqVar.f14887a) & ((1 << ijqVar.b) - 1)) == ijqVar.c;
    }

    public eb8 n() {
        Double dValueOf;
        List listB = ((neu) this.b).b();
        float f = ((m1u) this.f3775a).f21027a.c.b;
        listB.getClass();
        Iterator it = listB.iterator();
        Double dValueOf2 = null;
        if (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            while (it.hasNext()) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
            }
            dValueOf = Double.valueOf(dDoubleValue);
        } else {
            dValueOf = null;
        }
        double dDoubleValue2 = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        Iterator it2 = listB.iterator();
        if (it2.hasNext()) {
            double dDoubleValue3 = ((Number) it2.next()).doubleValue();
            while (it2.hasNext()) {
                dDoubleValue3 = Math.min(dDoubleValue3, ((Number) it2.next()).doubleValue());
            }
            dValueOf2 = Double.valueOf(dDoubleValue3);
        }
        return new eb8(listB, f, dDoubleValue2, dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(zje zjeVar) {
        z4c z4cVar;
        ts4 ts4Var;
        if (zjeVar instanceof z4c) {
            z4cVar = (z4c) zjeVar;
            int i = z4cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                z4cVar.l = i - Integer.MIN_VALUE;
            } else {
                z4cVar = new z4c(this, zjeVar);
            }
        } else {
            z4cVar = new z4c(this, zjeVar);
        }
        Object obj = z4cVar.j;
        wne wneVar = wne.f39444a;
        int i2 = z4cVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            ts4 ts4Var2 = (ts4) this.f3775a;
            rou rouVar = (rou) this.b;
            z4cVar.i = ts4Var2;
            z4cVar.l = 1;
            Object objA = rouVar.a(false, z4cVar);
            if (objA != wneVar) {
                obj = objA;
                ts4Var = ts4Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ts4Var = z4cVar.i;
        z1x.P(obj);
        String strValueOf = String.valueOf(((m2c0) obj).S);
        z4cVar.i = null;
        z4cVar.l = 2;
        fg40[] fg40VarArr = fg40.f9475a;
        Object objH = ts4Var.h(strValueOf, z4cVar);
        return objH == wneVar ? wneVar : objH;
    }

    @Override // a.hih0
    public void onQueryTextChange(String str) {
        str.getClass();
        aya ayaVar = (aya) this.b;
        bj5 bj5Var = aya.S1;
        ayaVar.I0().y(ayaVar.G0(), str);
    }

    @Override // a.hih0
    public void onQueryTextSubmit(String str) {
        str.getClass();
        j120.X((SearchMaterialViewNew) this.f3775a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.util.List r13, a.h9n0 r14, a.zje r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof a.b5k
            if (r0 == 0) goto L14
            r0 = r15
            a.b5k r0 = (a.b5k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            a.b5k r0 = new a.b5k
            r0.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.j
            a.wne r1 = a.wne.f39444a
            int r2 = r15.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L35
            if (r2 == r3) goto L2f
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L2f:
            a.zhi0 r12 = r15.i
            a.z1x.P(r0)
            goto L79
        L35:
            a.z1x.P(r0)     // Catch: a.zhi0 -> L39
            goto L7a
        L39:
            r0 = move-exception
            r13 = r0
            goto L4c
        L3c:
            a.z1x.P(r0)
            java.lang.Object r0 = r12.f3775a     // Catch: a.zhi0 -> L39
            a.kki r0 = (a.kki) r0     // Catch: a.zhi0 -> L39
            r15.l = r4     // Catch: a.zhi0 -> L39
            java.lang.Object r12 = r0.c(r13, r14, r15)     // Catch: a.zhi0 -> L39
            if (r12 != r1) goto L7a
            goto L77
        L4c:
            boolean r14 = r13.e
            if (r14 != 0) goto L7a
            r15.i = r13
            r15.l = r3
            a.y6h r4 = new a.y6h
            java.lang.Object r12 = r12.b
            r6 = r12
            a.m0o0 r6 = (a.m0o0) r6
            r10 = 0
            r11 = 16
            r5 = 1
            java.lang.Class<a.m0o0> r7 = a.m0o0.class
            java.lang.String r8 = "updateFavoritesFromRemote"
            java.lang.String r9 = "updateFavoritesFromRemote(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Class<a.c5k> r12 = a.c5k.class
            java.lang.Object r12 = a.iom0.x(r4, r12, r15)
            a.wne r14 = a.wne.f39444a
            if (r12 != r14) goto L73
            goto L75
        L73:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        L75:
            if (r12 != r1) goto L78
        L77:
            return r1
        L78:
            r12 = r13
        L79:
            throw r12
        L7a:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c5k.p(java.util.List, a.h9n0, a.zje):java.lang.Object");
    }

    public void q() {
        sln slnVar = (sln) ((es) this.f3775a).f8305a;
        slnVar.b.n(null);
        iun iunVar = iun.f15405a;
        slnVar.f32408a = iunVar;
        u0f u0fVar = (u0f) ((vqc) this.b).b;
        p7m0 p7m0Var = u0fVar.f34851a;
        q4f q4fVar = q4f.b;
        v0f v0fVar = new v0f("", q4fVar, "", 0.0d, 0.0d, ozc.POSSIBLE_PAYOUT, 0.0d, "", iunVar, 0.0d, false, 0.0d, mln.f21999a);
        p7m0Var.getClass();
        p7m0Var.o(null, v0fVar);
        u0fVar.b = q4fVar;
    }

    public Unit r(String str, CameraDevice.StateCallback stateCallback) {
        qcq0 qcq0Var = (qcq0) this.b;
        CameraManager cameraManager = (CameraManager) ((o5d0) this.f3775a).get();
        try {
            Trace.beginSection(((Object) g0a.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                Executor executor = (Executor) qcq0Var.j.getValue();
                executor.getClass();
                cameraManager.openCamera(str, executor, stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, qcq0Var.a());
            }
            return Unit.f46060a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(double d2, zje zjeVar) {
        d1d d1dVar;
        if (zjeVar instanceof d1d) {
            d1dVar = (d1d) zjeVar;
            int i = d1dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1dVar.k = i - Integer.MIN_VALUE;
            } else {
                d1dVar = new d1d(this, zjeVar);
            }
        } else {
            d1dVar = new d1d(this, zjeVar);
        }
        Object objA = d1dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d1dVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            a1d a1dVar = (a1d) this.f3775a;
            String strA = ((btt0) this.b).a();
            lhs0 lhs0Var = new lhs0(d2);
            d1dVar.k = 1;
            objA = ((y0d) ((sza) a1dVar.b).invoke()).a(strA, lhs0Var, d1dVar);
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
        Double d3 = ((dwa) ((q16) objA).a()).f6787a;
        if (d3 != null) {
            return new Double(d3.doubleValue());
        }
        jf4.k(null);
        return null;
    }

    public c5k(gii0 gii0Var, byte b) {
        byte b2 = 21;
        gii0Var.getClass();
        switch (b) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f3775a = gii0Var;
                this.b = new e8g(this, b2);
                break;
            default:
                this.f3775a = gii0Var;
                this.b = new zo4(this, b2);
                break;
        }
    }

    public c5k(knf0 knf0Var, gii0 gii0Var) {
        knf0Var.getClass();
        gii0Var.getClass();
        this.f3775a = knf0Var;
        this.b = new sza(gii0Var, (byte) 19);
    }

    public c5k(Function1 function1) {
        this.f3775a = function1;
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ c5k(Object obj, Object obj2) {
        this.f3775a = obj;
        this.b = obj2;
    }

    public c5k(thy thyVar, ijq ijqVar) {
        this.f3775a = thyVar;
        this.b = ijqVar;
        if (ijqVar.b == 1 && ijqVar.c == 1) {
            return;
        }
        c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar, " was passed"));
        throw null;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
    }
}
