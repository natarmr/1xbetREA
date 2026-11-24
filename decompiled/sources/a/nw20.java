package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class nw20 implements hih0, o860, s5a, h1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24215a;
    public Object b;

    public nw20(gii0 gii0Var, byte b) {
        byte b2 = 24;
        byte b3 = 11;
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.f24215a = gii0Var;
                this.b = new l3a0(this, b3);
                break;
            case 17:
                this.f24215a = gii0Var;
                this.b = new p7d0(this, b3);
                break;
            case 18:
                this.f24215a = gii0Var;
                this.b = new tie0(this, (byte) 0);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f24215a = gii0Var;
                this.b = new goi0(this, b3);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f24215a = gii0Var;
                this.b = new goi0(this, b2);
                break;
            default:
                this.f24215a = gii0Var;
                this.b = new pl70(this, b2);
                break;
        }
    }

    public void a(qaj qajVar) {
        for (Pair pair : (ArrayList) this.b) {
            sgy sgyVar = (sgy) pair.f46059a;
            jiy jiyVar = (jiy) pair.b;
            sgy sgyVar2 = (sgy) this.f24215a;
            sgyVar.getClass();
            jiyVar.getClass();
            qajVar.j(sgyVar2, sgyVar, jiyVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory b(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.b;
        if (map == null) {
            Context context = (Context) this.f24215a;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(Separators.COMMA, -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.b = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.b = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(Map map, zje zjeVar) {
        xea0 xea0Var;
        if (zjeVar instanceof xea0) {
            xea0Var = (xea0) zjeVar;
            int i = xea0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xea0Var.k = i - Integer.MIN_VALUE;
            } else {
                xea0Var = new xea0(this, zjeVar);
            }
        } else {
            xea0Var = new xea0(this, zjeVar);
        }
        Object objD = xea0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xea0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            xea0Var.k = 1;
            objD = wea0Var.d(map, xea0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((dx5) objD).a();
    }

    @Override // a.s5a
    public void cancel() {
        if (((a14) this.b).compareAndSet(1, 1)) {
            return;
        }
        ((kk0) this.f24215a).invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Map map, zje zjeVar) {
        yea0 yea0Var;
        if (zjeVar instanceof yea0) {
            yea0Var = (yea0) zjeVar;
            int i = yea0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yea0Var.k = i - Integer.MIN_VALUE;
            } else {
                yea0Var = new yea0(this, zjeVar);
            }
        } else {
            yea0Var = new yea0(this, zjeVar);
        }
        Object objE = yea0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yea0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            yea0Var.k = 1;
            objE = wea0Var.e(map, yea0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        return ((dx5) objE).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Map map, zje zjeVar) {
        zea0 zea0Var;
        if (zjeVar instanceof zea0) {
            zea0Var = (zea0) zjeVar;
            int i = zea0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zea0Var.k = i - Integer.MIN_VALUE;
            } else {
                zea0Var = new zea0(this, zjeVar);
            }
        } else {
            zea0Var = new zea0(this, zjeVar);
        }
        Object objC = zea0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zea0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            zea0Var.k = 1;
            objC = wea0Var.c(map, zea0Var);
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

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable f(int i, int i2, zje zjeVar) {
        kh30 kh30Var;
        long j;
        long jLongValue;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof kh30) {
            kh30Var = (kh30) zjeVar;
            int i3 = kh30Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kh30Var.k = i3 - Integer.MIN_VALUE;
            } else {
                kh30Var = new kh30(this, zjeVar);
            }
        } else {
            kh30Var = new kh30(this, zjeVar);
        }
        kh30 kh30Var2 = kh30Var;
        Object objA = kh30Var2.i;
        wne wneVar = wne.f39444a;
        int i4 = kh30Var2.k;
        if (i4 == 0) {
            z1x.P(objA);
            nr00 nr00Var = (nr00) this.f24215a;
            knf0Var.getClass();
            String strC = knf0Var.c();
            kh30Var2.k = 1;
            objA = ((dh30) ((tpv) nr00Var.f23980a).invoke()).a(i, 1, i2, strC, kh30Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable iterable = (Iterable) ((q16) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m1k0 m1k0Var = (m1k0) it.next();
            m1k0Var.getClass();
            String str = m1k0Var.f21013a;
            if (str == null) {
                str = "";
            }
            String str2 = m1k0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            Long l = m1k0Var.c;
            long jLongValue2 = l != null ? l.longValue() : 0L;
            String str3 = m1k0Var.d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = m1k0Var.e;
            if (str4 == null) {
                str4 = "";
            }
            Long l2 = m1k0Var.f;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            String str5 = m1k0Var.g;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = m1k0Var.h;
            if (str6 == null) {
                str6 = "";
            }
            Long l3 = m1k0Var.k;
            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
            Long l4 = m1k0Var.l;
            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
            Long l5 = m1k0Var.m;
            long jLongValue6 = l5 != null ? l5.longValue() : 0L;
            Long l6 = m1k0Var.n;
            long jLongValue7 = l6 != null ? l6.longValue() : 0L;
            Boolean bool = m1k0Var.o;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Iterator it2 = it;
            Boolean bool2 = m1k0Var.p;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String str7 = m1k0Var.q;
            String str8 = str7 == null ? "" : str7;
            Double d = m1k0Var.r;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Long l7 = m1k0Var.s;
            long jLongValue8 = l7 != null ? l7.longValue() : 0L;
            String str9 = m1k0Var.t;
            String str10 = str9 != null ? str9 : "";
            Double d2 = m1k0Var.u;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Long l8 = m1k0Var.v;
            if (l8 != null) {
                jLongValue = l8.longValue();
                j = jLongValue8;
            } else {
                j = jLongValue8;
                jLongValue = 0;
            }
            arrayList.add(new j1k0(str, str2, jLongValue2, str3, str4, jLongValue3, str5, str6, jLongValue4, jLongValue5, jLongValue6, jLongValue7, zBooleanValue, zBooleanValue2, str8, dDoubleValue, j, str10, dDoubleValue2, jLongValue));
            it = it2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Map map, zje zjeVar) {
        afa0 afa0Var;
        if (zjeVar instanceof afa0) {
            afa0Var = (afa0) zjeVar;
            int i = afa0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                afa0Var.k = i - Integer.MIN_VALUE;
            } else {
                afa0Var = new afa0(this, zjeVar);
            }
        } else {
            afa0Var = new afa0(this, zjeVar);
        }
        Object objA = afa0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = afa0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            afa0Var.k = 1;
            objA = wea0Var.a(map, afa0Var);
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
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Map map, zje zjeVar) {
        bfa0 bfa0Var;
        if (zjeVar instanceof bfa0) {
            bfa0Var = (bfa0) zjeVar;
            int i = bfa0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfa0Var.k = i - Integer.MIN_VALUE;
            } else {
                bfa0Var = new bfa0(this, zjeVar);
            }
        } else {
            bfa0Var = new bfa0(this, zjeVar);
        }
        Object objB = bfa0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bfa0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            bfa0Var.k = 1;
            objB = wea0Var.b(map, bfa0Var);
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
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(int i, zje zjeVar, String str) {
        qhk0 qhk0Var;
        if (zjeVar instanceof qhk0) {
            qhk0Var = (qhk0) zjeVar;
            int i2 = qhk0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qhk0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                qhk0Var = new qhk0(this, zjeVar);
            }
        } else {
            qhk0Var = new qhk0(this, zjeVar);
        }
        Object objA = qhk0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = qhk0Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            nhk0 nhk0Var = (nhk0) ((goi0) this.b).invoke();
            String strM = twn.m(i, "info_social_cyber_");
            qhk0Var.k = 1;
            objA = nhk0Var.a(strM, str, qhk0Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, String str2, String str3, zje zjeVar) {
        cvd0 cvd0Var;
        if (zjeVar instanceof cvd0) {
            cvd0Var = (cvd0) zjeVar;
            int i = cvd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvd0Var.k = i - Integer.MIN_VALUE;
            } else {
                cvd0Var = new cvd0(this, zjeVar);
            }
        } else {
            cvd0Var = new cvd0(this, zjeVar);
        }
        Object objA = cvd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cvd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            vud0 vud0Var = (vud0) ((p7d0) this.b).invoke();
            cvd0Var.k = 1;
            objA = vud0Var.a(str, str2, str3, cvd0Var);
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
        return ((dx5) objA).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(3:(1:(2:13|79)(2:14|15))(2:16|96)|52|(9:24|86|25|26|94|27|28|(1:31)|77)(1:(2:83|84)(1:85)))(4:17|92|18|19))(2:22|(9:24|86|25|26|94|27|28|(1:31)|77)(1:(2:83|84)(1:85)))|90|32|(6:35|36|88|37|38|33)|98|43|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:35|36|88|37|38|33) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:24|86|25|26|94|27|28|(1:31)|77) */
    /* JADX WARN: Code duplicated, block: B:24:0x013f  */
    /* JADX WARN: Code duplicated, block: B:31:0x016e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0195 A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #2 {all -> 0x01ba, blocks: (B:32:0x0182, B:33:0x018f, B:35:0x0195), top: B:90:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x0210  */
    /* JADX WARN: Code duplicated, block: B:64:0x0218  */
    /* JADX WARN: Code duplicated, block: B:67:0x0227  */
    /* JADX WARN: Code duplicated, block: B:69:0x0230  */
    /* JADX WARN: Code duplicated, block: B:71:0x0237  */
    /* JADX WARN: Code duplicated, block: B:72:0x0239  */
    /* JADX WARN: Code duplicated, block: B:75:0x023e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0262  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x026b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0273  */
    /* JADX WARN: Code duplicated, block: B:82:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x027f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0285  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01aa, code lost:
    
        r1 = r8;
        r8 = r2;
        r2 = r4;
        r4 = r12;
        r7 = r23;
        r20 = r10;
        r10 = r5;
        r11 = r6;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bb, code lost:
    
        r23 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c0, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c4, code lost:
    
        r1 = r23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01cf -> B:52:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0262 -> B:79:0x0265). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable k(a.sip r23, java.lang.String r24, a.jvn r25, int r26, boolean r27, long r28, a.zje r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nw20.k(a.sip, java.lang.String, a.jvn, int, boolean, long, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(Map map, zje zjeVar) {
        cfa0 cfa0Var;
        if (zjeVar instanceof cfa0) {
            cfa0Var = (cfa0) zjeVar;
            int i = cfa0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfa0Var.k = i - Integer.MIN_VALUE;
            } else {
                cfa0Var = new cfa0(this, zjeVar);
            }
        } else {
            cfa0Var = new cfa0(this, zjeVar);
        }
        Object objF = cfa0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cfa0Var.k;
        if (i2 == 0) {
            z1x.P(objF);
            wea0 wea0Var = (wea0) ((l3a0) this.b).invoke();
            cfa0Var.k = 1;
            objF = wea0Var.f(map, cfa0Var);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        return ((dx5) objF).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(long j, ql5 ql5Var, long[] jArr, zje zjeVar) {
        fti0 fti0Var;
        if (zjeVar instanceof fti0) {
            fti0Var = (fti0) zjeVar;
            int i = fti0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fti0Var.l = i - Integer.MIN_VALUE;
            } else {
                fti0Var = new fti0(this, zjeVar);
            }
        } else {
            fti0Var = new fti0(this, zjeVar);
        }
        Object obj = fti0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fti0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (j == 0) {
                j = ql5Var.f28916a;
            }
            nvu nvuVar = (nvu) this.f24215a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            fti0Var.i = jArr;
            fti0Var.l = 1;
            Object objD = ((y8n0) ((enj0) nvuVar.d).invoke()).d(((btt0) nvuVar.c).a(), new d6n0(j, tx3.f0(jArrCopyOf)), fti0Var);
            if (objD != wneVar) {
                objD = Unit.f46060a;
            }
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jArr = fti0Var.i;
            z1x.P(obj);
        }
        mii0 mii0Var = (mii0) this.b;
        for (long j2 : jArr) {
            ((ev7) mii0Var.d).f8454a.add(Long.valueOf(j2));
        }
        return Unit.f46060a;
    }

    public Object n(String str, xwn xwnVar, bnn0 bnn0Var) {
        if (xwnVar != null) {
            yje yjeVar = null;
            if (xwnVar instanceof vwn) {
                xex xexVar = (xex) this.f24215a;
                Object objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str, ((vwn) xwnVar).f38160a, yjeVar, (byte) 5), bnn0Var);
                wne wneVar = wne.f39444a;
                if (objD0 != wneVar) {
                    objD0 = Unit.f46060a;
                }
                return objD0 == wneVar ? objD0 : Unit.f46060a;
            }
            if (xwnVar instanceof wwn) {
                xex xexVar2 = (xex) this.b;
                Object objD1 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str, ((wwn) xwnVar).f39892a, yjeVar, (byte) 5), bnn0Var);
                wne wneVar2 = wne.f39444a;
                if (objD1 != wneVar2) {
                    objD1 = Unit.f46060a;
                }
                return objD1 == wneVar2 ? objD1 : Unit.f46060a;
            }
        }
        t9f.b();
        return null;
    }

    public void o(String str) {
        Object value;
        ArrayList arrayList;
        long jA = ((viu) this.b).a();
        d49 d49Var = (d49) ((iw20) this.f24215a).f15470a;
        d49Var.getClass();
        p7m0 p7m0Var = d49Var.f5443a.f3714a;
        do {
            value = p7m0Var.getValue();
            List<z39> list = (List) value;
            arrayList = new ArrayList(r3d.q(list, 10));
            for (z39 z39VarA : list) {
                if (z39VarA.i.equals(str) && z39VarA.h) {
                    z39VarA = z39.a(z39VarA, 0L, (jA - z39VarA.f) + z39VarA.g, false, null, 319);
                }
                arrayList.add(z39VarA);
            }
        } while (!p7m0Var.m(value, arrayList));
    }

    @Override // a.hih0
    public void onQueryTextChange(String str) {
        str.getClass();
        ((du20) this.f24215a).invoke(Boolean.valueOf(str.length() == 0));
        f730 f730Var = (f730) this.b;
        e3c.n(f730Var.t);
        f730Var.t = sac.V(jiu0.a(f730Var), d730.f5577a, null, f730Var.m.f22085a, new mq10((Object) f730Var, (Object) str, (yje) null, (byte) 18), 10);
    }

    @Override // a.hih0
    public void onQueryTextSubmit(String str) {
        str.getClass();
    }

    public void p(Bundle bundle) {
        h0h0 h0h0Var = (h0h0) this.f24215a;
        i0h0 i0h0Var = h0h0Var.f12236a;
        if (!h0h0Var.e) {
            h0h0Var.a();
        }
        if (i0h0Var.x().i.compareTo(lkz.d) >= 0) {
            hny.t(i0h0Var.x().i, "performRestore cannot be called when owner is ");
            return;
        }
        if (h0h0Var.g) {
            jf4.n("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleL = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleL = b8k0.L(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        h0h0Var.f = bundleL;
        h0h0Var.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078 A[LOOP:0: B:10:0x0033->B:23:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[EDGE_INSN: B:34:0x007b->B:24:0x007b BREAK  A[LOOP:0: B:10:0x0033->B:23:0x0078], SYNTHETIC] */
    public void q(Bundle bundle) {
        bundle.getClass();
        h0h0 h0h0Var = (h0h0) this.f24215a;
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = h0h0Var.f;
        if (bundle2 != null) {
            bundleV.putAll(bundle2);
        }
        synchronized (h0h0Var.c) {
            hz40 hz40Var = h0h0Var.d;
            Object[] objArr = hz40Var.b;
            Object[] objArr2 = hz40Var.c;
            long[] jArr = hz40Var.f13891a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                String str = (String) objArr[i4];
                                Bundle bundleA = ((g0h0) objArr2[i4]).a();
                                str.getClass();
                                bundleV.putBundle(str, bundleA);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (bundleV.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleV);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public Serializable r(int i, int i2, zje zjeVar, String str) {
        p8g0 p8g0Var;
        List arrayList;
        ?? arrayList2;
        l2g0 l2g0Var;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof p8g0) {
            p8g0Var = (p8g0) zjeVar;
            int i3 = p8g0Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p8g0Var.k = i3 - Integer.MIN_VALUE;
            } else {
                p8g0Var = new p8g0(this, zjeVar);
            }
        } else {
            p8g0Var = new p8g0(this, zjeVar);
        }
        Object objA = p8g0Var.i;
        wne wneVar = wne.f39444a;
        int i4 = p8g0Var.k;
        if (i4 == 0) {
            z1x.P(objA);
            ljf0 ljf0Var = (ljf0) this.f24215a;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            str.getClass();
            Map<String, String> mapF = xp20.f(new Pair("country", String.valueOf(i2)), new Pair("fcountry", String.valueOf(iB)), new Pair(ParameterNames.TEXT, str), new Pair("count", String.valueOf(i)), new Pair("lng", strC), new Pair("ref", String.valueOf(1)), new Pair("gr", String.valueOf(1357)));
            p8g0Var.k = 1;
            objA = ((vgh0) ((rta0) ljf0Var.f20148a).invoke()).a(mapF, p8g0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List<tgh0> list = ((ugh0) ((dx5) objA).a()).b;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (tgh0 tgh0Var : list) {
            List<mgh0> list2 = tgh0Var.c;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (mgh0 mgh0Var : list2) {
                    List<qgh0> list3 = mgh0Var.d;
                    if (list3 != null) {
                        arrayList2 = new ArrayList();
                        for (qgh0 qgh0Var : list3) {
                            Long l = tgh0Var.f33913a;
                            long jLongValue = l != null ? l.longValue() : 0L;
                            qgh0Var.getClass();
                            String str2 = mgh0Var.c;
                            Long l2 = mgh0Var.f21744a;
                            if (str2 == null || l2 == null) {
                                l2g0Var = null;
                            } else {
                                String str3 = qgh0Var.d;
                                Long l3 = qgh0Var.f28684a;
                                Long l4 = qgh0Var.i;
                                if (str3 == null || l4 == null) {
                                    l2g0Var = null;
                                } else {
                                    if (l3 == null) {
                                        jf4.k(null);
                                        return null;
                                    }
                                    long jLongValue2 = l3.longValue();
                                    long jLongValue3 = l3.longValue();
                                    Long l5 = qgh0Var.b;
                                    if (l5 != null) {
                                        jLongValue = l5.longValue();
                                    }
                                    long j = jLongValue;
                                    String str4 = qgh0Var.c;
                                    String str5 = str4 == null ? "" : str4;
                                    String str6 = mgh0Var.c;
                                    long jLongValue4 = l2.longValue();
                                    String str7 = mgh0Var.b;
                                    String str8 = str7 == null ? "" : str7;
                                    iun iunVar = iun.f15405a;
                                    String str9 = qgh0Var.d;
                                    String str10 = qgh0Var.e;
                                    String str11 = str10 == null ? "" : str10;
                                    List list4 = qgh0Var.j;
                                    List list5 = list4 == null ? iunVar : list4;
                                    List list6 = qgh0Var.k;
                                    List list7 = list6 == null ? iunVar : list6;
                                    String str12 = qgh0Var.g;
                                    String str13 = str12 == null ? "" : str12;
                                    String str14 = qgh0Var.f;
                                    String str15 = str14 == null ? "" : str14;
                                    long jLongValue5 = l4.longValue();
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    String str16 = qgh0Var.q;
                                    String str17 = str16 == null ? "" : str16;
                                    Boolean bool = qgh0Var.o;
                                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                    Integer num = qgh0Var.p;
                                    l2g0Var = new l2g0(jLongValue2, jLongValue3, j, 0L, str5, 0L, str6, jLongValue4, str8, iunVar, iunVar, str9, str11, list5, list7, str13, "", str15, jLongValue5, lunVar, str17, zBooleanValue, num != null ? num.intValue() : 0, 0, iunVar);
                                }
                            }
                            if (l2g0Var != null) {
                                arrayList2.add(l2g0Var);
                            }
                        }
                    } else {
                        arrayList2 = iun.f15405a;
                    }
                    w3d.u(arrayList, arrayList2);
                }
            } else {
                arrayList = iun.f15405a;
            }
            w3d.u(arrayList3, arrayList);
        }
        return arrayList3;
    }

    public void s(sgy sgyVar, jiy jiyVar) {
        sgyVar.getClass();
        jiyVar.getClass();
        ((ArrayList) this.b).add(new Pair(sgyVar, jiyVar));
    }

    public nw20(kt2 kt2Var) {
        kt2Var.getClass();
        this.f24215a = kt2Var;
        this.b = iun.f15405a;
    }

    public nw20(iw20 iw20Var, viu viuVar) {
        viuVar.getClass();
        this.f24215a = iw20Var;
        this.b = viuVar;
    }

    public /* synthetic */ nw20(Object obj, Object obj2) {
        this.f24215a = obj;
        this.b = obj2;
    }

    public nw20(nr00 nr00Var, knf0 knf0Var, lme0 lme0Var) {
        knf0Var.getClass();
        this.f24215a = nr00Var;
        this.b = knf0Var;
    }

    public nw20(q7d0 q7d0Var, vwb0 vwb0Var) {
        q7d0Var.getClass();
        vwb0Var.getClass();
        this.f24215a = q7d0Var;
        this.b = vwb0Var;
    }

    public nw20(ddm0 ddm0Var, he1 he1Var) {
        ddm0Var.getClass();
        this.f24215a = ddm0Var;
        this.b = he1Var;
    }

    public nw20(sqt sqtVar, c5c c5cVar, gqt gqtVar) {
        this.f24215a = c5cVar;
        this.b = gqtVar;
    }

    public nw20(dpi0 dpi0Var, knf0 knf0Var) {
        knf0Var.getClass();
        this.f24215a = dpi0Var;
        this.b = knf0Var;
    }

    public nw20(ljf0 ljf0Var, o8g0 o8g0Var, knf0 knf0Var) {
        o8g0Var.getClass();
        knf0Var.getClass();
        this.f24215a = ljf0Var;
        this.b = knf0Var;
    }

    public nw20(sgy sgyVar) {
        sgyVar.getClass();
        this.f24215a = sgyVar;
        this.b = new ArrayList();
    }

    public nw20(h0h0 h0h0Var) {
        this.f24215a = h0h0Var;
        kd30 kd30Var = new kd30();
        kd30Var.f18086a = h0h0Var;
        this.b = kd30Var;
    }

    public nw20(kk0 kk0Var) {
        this.f24215a = kk0Var;
        this.b = new a14(0);
    }

    public nw20() {
        this.f24215a = new HashMap();
        this.b = new HashMap();
    }

    public nw20(dwb0 dwb0Var) {
        this.f24215a = new HashMap(dwb0Var.f6790a);
        this.b = new HashMap(dwb0Var.b);
    }

    public nw20(Context context) {
        this.b = null;
        this.f24215a = context;
    }

    public nw20(Map map) {
        this.f24215a = map;
        this.b = new eu00("Java nullability annotation states").d(new caz(this, (byte) 7));
    }
}
