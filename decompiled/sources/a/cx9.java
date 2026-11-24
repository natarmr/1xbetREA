package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f5112a;
    public final qcq0 b;
    public final gx9 c;
    public final o5d0 d;
    public final sje e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final vae0 k;
    public final n0o0 l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public cx9(o5d0 o5d0Var, qcq0 qcq0Var, Context context, PackageManager packageManager, gx9 gx9Var, o5d0 o5d0Var2, r1a r1aVar, bby bbyVar) {
        o5d0Var.getClass();
        qcq0Var.getClass();
        packageManager.getClass();
        gx9Var.getClass();
        o5d0Var2.getClass();
        r1aVar.getClass();
        bbyVar.getClass();
        this.f5112a = o5d0Var;
        this.b = qcq0Var;
        this.c = gx9Var;
        this.d = o5d0Var2;
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), qcq0Var.h).plus(new rne("Camera2DeviceCache")));
        this.e = sjeVarA;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        this.j = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        r1aVar.a(p1a.b, new w1((Object) this, (byte) 19));
        this.k = vtb.g0(i120.W(nkb.y(new d09((Object) this, (yje) null, (byte) 14))), sjeVarA, new o6m0(Long.MAX_VALUE), 1);
        this.l = maz.b(new vb8((Object) this, (byte) 28));
    }

    public static void e(hzb0 hzb0Var, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (dub.w0(hzb0Var, arrayList) instanceof ytb) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        zw9 zw9Var;
        jzj jzjVar;
        if (zjeVar instanceof zw9) {
            zw9Var = (zw9) zjeVar;
            int i = zw9Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zw9Var.m = i - Integer.MIN_VALUE;
            } else {
                zw9Var = new zw9(this, zjeVar);
            }
        } else {
            zw9Var = new zw9(this, zjeVar);
        }
        Object objAwait = zw9Var.k;
        wne wneVar = wne.f39444a;
        int i2 = zw9Var.m;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objAwait);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.h;
                    g0a g0aVar = new g0a(str);
                    Object objM = linkedHashMap.get(g0aVar);
                    if (objM == null) {
                        objM = qjj.M(this.e, this.b.f, new ax9(str, this, yjeVar, (byte) 0), 2);
                        linkedHashMap.put(g0aVar, objM);
                    }
                    jzjVar = (jzj) objM;
                } catch (Throwable th) {
                    throw th;
                }
            }
            zw9Var.i = str;
            zw9Var.j = jzjVar;
            zw9Var.m = 1;
            objAwait = jzjVar.await(zw9Var);
            if (objAwait == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzj jzjVar2 = zw9Var.j;
            String str2 = zw9Var.i;
            z1x.P(objAwait);
            jzjVar = jzjVar2;
            str = str2;
        }
        ea0 ea0Var = (ea0) objAwait;
        if (ea0Var != null) {
            return ea0Var;
        }
        Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) g0a.b(str)));
        synchronized (this.f) {
            this.h.remove(new g0a(str), jzjVar);
        }
        return ea0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zje zjeVar) {
        bx9 bx9Var;
        jzj jzjVar;
        if (zjeVar instanceof bx9) {
            bx9Var = (bx9) zjeVar;
            int i = bx9Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                bx9Var.m = i - Integer.MIN_VALUE;
            } else {
                bx9Var = new bx9(this, zjeVar);
            }
        } else {
            bx9Var = new bx9(this, zjeVar);
        }
        Object objAwait = bx9Var.k;
        wne wneVar = wne.f39444a;
        int i2 = bx9Var.m;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objAwait);
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.i;
                    g0a g0aVar = new g0a(str);
                    Object objM = linkedHashMap.get(g0aVar);
                    if (objM == null) {
                        objM = qjj.M(this.e, this.b.f, new ax9(str, this, yjeVar, b), 2);
                        linkedHashMap.put(g0aVar, objM);
                    }
                    jzjVar = (jzj) objM;
                } catch (Throwable th) {
                    throw th;
                }
            }
            bx9Var.i = str;
            bx9Var.j = jzjVar;
            bx9Var.m = 1;
            objAwait = jzjVar.await(bx9Var);
            if (objAwait == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzj jzjVar2 = bx9Var.j;
            String str2 = bx9Var.i;
            z1x.P(objAwait);
            jzjVar = jzjVar2;
            str = str2;
        }
        fx9 fx9Var = (fx9) objAwait;
        if (fx9Var != null) {
            return fx9Var;
        }
        Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) g0a.b(str)));
        synchronized (this.f) {
            this.i.remove(new g0a(str), jzjVar);
        }
        return fx9Var;
    }

    public final void c(hzb0 hzb0Var, String str, boolean z) {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = this.g;
        }
        ArrayList arrayListD = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Log.i("CXCP", "New camera " + str + " detected");
                        arrayListD = d();
                        break;
                    }
                } while (!Intrinsics.d(((g0a) it.next()).f10449a, str));
            } else {
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListD = d();
                break;
            }
        } else {
            if (z) {
                t9f.b();
                return;
            }
            if (arrayList == null) {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayListD = d();
                break;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.d(((g0a) it2.next()).f10449a, str)) {
                        Log.i("CXCP", "Unavailable camera " + str + " detected");
                        arrayListD = d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= this.j || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            e(hzb0Var, arrayList);
        }
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.f5112a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                g0a.a(str);
                arrayList.add(new g0a(str));
            }
            if (arrayList.size() < this.j) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.f) {
                this.g = arrayList;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }
}
