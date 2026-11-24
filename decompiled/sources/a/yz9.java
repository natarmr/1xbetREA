package a;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ux9 f43505a;
    public final p7d b;
    public final fhn c;
    public final i2a d;
    public final f4w0 e;
    public final nwp0 f;
    public final c1a g;
    public final l4a h;
    public final ehf0 i;
    public final vqc j;
    public final DynamicRangeProfiles k;

    public yz9(ux9 ux9Var, p7d p7dVar, fhn fhnVar, i2a i2aVar, f4w0 f4w0Var, nwp0 nwp0Var, c1a c1aVar, l4a l4aVar, ehf0 ehf0Var) {
        vqc vqcVarT;
        ux9Var.getClass();
        p7dVar.getClass();
        fhnVar.getClass();
        i2aVar.getClass();
        f4w0Var.getClass();
        this.f43505a = ux9Var;
        this.b = p7dVar;
        this.c = fhnVar;
        this.d = i2aVar;
        this.e = f4w0Var;
        this.f = nwp0Var;
        this.g = c1aVar;
        this.h = l4aVar;
        this.i = ehf0Var;
        this.j = new vqc((byte) 4);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesB = null;
        if (i >= 33 && c1aVar != null && (vqcVarT = mbc.T(c1aVar)) != null) {
            if (i < 33) {
                c99.v(ua80.e(i, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesB = ((dgn) vqcVarT.b).b();
        }
        this.k = dynamicRangeProfilesB;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0370  */
    /* JADX WARN: Code duplicated, block: B:210:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0247  */
    /* JADX WARN: Code duplicated, block: B:99:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01ad, please report this as an issue */
    public final xz9 a(int i, xii0 xii0Var, boolean z, sev sevVar, Integer num, Map map, Map map2) {
        ArrayList arrayList;
        boolean z2;
        LinkedHashMap linkedHashMap;
        int i2;
        e3a e3aVar;
        ArrayList arrayList2;
        e3a e3aVar2;
        String str;
        if80 if80Var;
        if80 if80Var2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        hf80 hf80Var;
        String str2;
        if80 if80Var3;
        if80 if80Var4;
        m2a m2aVar;
        jf80 jf80Var;
        kf80 kf80Var;
        gf80 gf80VarD;
        e3a e3aVar3;
        LinkedHashMap linkedHashMap3;
        f4w0 f4w0Var;
        List list;
        Long l;
        kf80 kf80Var2;
        Long l2;
        jf80 jf80Var2;
        Class cls;
        m2a m2aVar2;
        m2a m2aVar3 = m2a.x;
        Integer num2 = 0;
        map.getClass();
        map2.getClass();
        boolean z3 = i == 2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        boolean z4 = z3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (xii0Var != null) {
            t7a t7aVar = xii0Var.g;
            ehf0 ehf0Var = this.i;
            if (ehf0Var != null) {
                c14 c14Var = ((x0a) ehf0Var.b).f40062a;
                List list2 = xii0Var.c;
                list2.getClass();
                c14Var.f3556a = CollectionsKt.L0(list2);
                c14 c14Var2 = (c14) ((chf0) ehf0Var.c).c;
                List list3 = xii0Var.d;
                list3.getClass();
                c14Var2.f3556a = CollectionsKt.L0(list3);
            }
            int i3 = t7aVar.c;
            if (i3 == -1) {
                i3 = 1;
            }
            linkedHashMap5.putAll(this.f.a(new onf0(i3)));
            linkedHashMap5.putAll(s5x0.U(t7aVar.b));
            if (i == 2) {
                dd40 dd40Var = n1a.f22740a;
                num.getClass();
                linkedHashMap5.put(dd40Var, num);
            }
            String str3 = (String) xii0Var.g.b.e(hx9.j, null);
            Iterator it = xii0Var.f40947a.iterator();
            e3a e3aVar4 = null;
            while (it.hasNext()) {
                a55 a55Var = (a55) it.next();
                m2a m2aVar4 = m2aVar3;
                hzj hzjVar = a55Var.f252a;
                int i4 = i3;
                int i5 = a55Var.d;
                hzjVar.getClass();
                String str4 = str3;
                String str5 = str3 == null ? null : str4;
                agn agnVar = a55Var.e;
                agnVar.getClass();
                int i6 = a55Var.c;
                boolean z5 = z4;
                int i7 = Build.VERSION.SDK_INT;
                Iterator it2 = it;
                if (i7 >= 33) {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    hf80 hf80Var2 = new hf80(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.k;
                    if (dynamicRangeProfiles == null) {
                        hf80Var = hf80Var2;
                    } else {
                        Long lA = bgn.a(agnVar, dynamicRangeProfiles);
                        if (lA != null) {
                            hf80Var = new hf80(lA.longValue());
                        } else {
                            if (l8x.g0()) {
                                Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + agnVar);
                            }
                            hf80Var = hf80Var2;
                        }
                    }
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    hf80Var = null;
                }
                Size size = hzjVar.h;
                size.getClass();
                int i8 = hzjVar.i;
                if (str5 == null) {
                    str2 = null;
                } else {
                    g0a.a(str5);
                    str2 = str5;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        if80Var4 = null;
                    } else {
                        if80Var3 = new if80(2);
                    }
                    if (z) {
                        cls = a55Var.f252a.j;
                        if (Intrinsics.d(cls, MediaCodec.class)) {
                            m2aVar2 = m2a.B;
                        } else if (Intrinsics.d(cls, SurfaceHolder.class)) {
                            m2aVar2 = m2a.y;
                        } else if (Intrinsics.d(cls, SurfaceTexture.class)) {
                            m2aVar2 = m2a.z;
                        } else {
                            m2aVar = m2aVar4;
                        }
                        m2aVar = m2aVar2;
                    } else {
                        m2aVar = m2aVar4;
                    }
                    if (z5) {
                        jf80Var = null;
                    } else {
                        c1a c1aVar = this.g;
                        l2 = (Long) map.get(hzjVar);
                        if (l2 != null) {
                            jf80Var2 = new jf80(l2.longValue());
                        } else {
                            jf80Var2 = null;
                        }
                        if (i7 >= 33 || jf80Var2 == null || c1aVar == null) {
                            if (l8x.j0()) {
                                Log.w("CXCP", "Expected stream use case for " + hzjVar + ", " + jf80Var2 + " cannot be set!");
                            }
                            jf80Var2 = null;
                        } else {
                            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key.getClass();
                            long[] jArr = (long[]) ((ow9) c1aVar).c(key);
                            if (jArr == null || !tx3.x(jArr, jf80Var2.f16412a)) {
                                if (l8x.j0()) {
                                    Log.w("CXCP", "Expected stream use case for " + hzjVar + ", " + jf80Var2 + " cannot be set!");
                                }
                                jf80Var2 = null;
                            }
                        }
                        jf80Var = jf80Var2;
                    }
                    if (z5) {
                        kf80Var = null;
                    } else {
                        l = (Long) map2.get(hzjVar);
                        if (l != null) {
                            kf80Var2 = new kf80(l.longValue());
                        } else {
                            kf80Var2 = null;
                        }
                        kf80Var = kf80Var2;
                    }
                    gf80VarD = xi70.d(i8, 544, m2aVar, hf80Var, if80Var4, jf80Var, kf80Var, size, str2);
                    List list4 = a55Var.b;
                    list4.getClass();
                    for (hzj hzjVar2 : CollectionsKt.r0(list4, hzjVar)) {
                        e3aVar3 = new e3a(kotlin.collections.a.c(gf80VarD));
                        linkedHashMap6.put(e3aVar3, hzjVar2);
                        if (i5 != -1) {
                            linkedHashMap3 = linkedHashMap2;
                            list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                            if (list == null) {
                                linkedHashMap3.put(Integer.valueOf(i5), q3d.l(e3aVar3));
                            } else {
                                list.add(e3aVar3);
                            }
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                        if (Intrinsics.d(hzjVar2, hzjVar)) {
                            f4w0Var = this.e;
                            hzjVar2.getClass();
                            if (f4w0Var.g(hzjVar2, xii0Var)) {
                                e3aVar4 = e3aVar3;
                            }
                        }
                        linkedHashMap2 = linkedHashMap3;
                        i5 = i5;
                    }
                    str3 = str4;
                    m2aVar3 = m2aVar4;
                    i3 = i4;
                    z4 = z5;
                    it = it2;
                    linkedHashMap4 = linkedHashMap2;
                    arrayList4 = arrayList3;
                } else {
                    if80Var3 = new if80(1);
                }
                if80Var4 = if80Var3;
                if (z) {
                    cls = a55Var.f252a.j;
                    if (Intrinsics.d(cls, MediaCodec.class)) {
                        m2aVar2 = m2a.B;
                    } else if (Intrinsics.d(cls, SurfaceHolder.class)) {
                        m2aVar2 = m2a.y;
                    } else if (Intrinsics.d(cls, SurfaceTexture.class)) {
                        m2aVar2 = m2a.z;
                    } else {
                        m2aVar = m2aVar4;
                    }
                    m2aVar = m2aVar2;
                } else {
                    m2aVar = m2aVar4;
                }
                if (z5) {
                    c1a c1aVar2 = this.g;
                    l2 = (Long) map.get(hzjVar);
                    if (l2 != null) {
                        jf80Var2 = new jf80(l2.longValue());
                    } else {
                        jf80Var2 = null;
                    }
                    if (i7 >= 33) {
                        if (l8x.j0()) {
                            Log.w("CXCP", "Expected stream use case for " + hzjVar + ", " + jf80Var2 + " cannot be set!");
                        }
                        jf80Var2 = null;
                    } else {
                        if (l8x.j0()) {
                            Log.w("CXCP", "Expected stream use case for " + hzjVar + ", " + jf80Var2 + " cannot be set!");
                        }
                        jf80Var2 = null;
                    }
                    jf80Var = jf80Var2;
                } else {
                    jf80Var = null;
                }
                if (z5) {
                    l = (Long) map2.get(hzjVar);
                    if (l != null) {
                        kf80Var2 = new kf80(l.longValue());
                    } else {
                        kf80Var2 = null;
                    }
                    kf80Var = kf80Var2;
                } else {
                    kf80Var = null;
                }
                gf80VarD = xi70.d(i8, 544, m2aVar, hf80Var, if80Var4, jf80Var, kf80Var, size, str2);
                List list5 = a55Var.b;
                list5.getClass();
                while (r6.hasNext()) {
                    e3aVar3 = new e3a(kotlin.collections.a.c(gf80VarD));
                    linkedHashMap6.put(e3aVar3, hzjVar2);
                    if (i5 != -1) {
                        linkedHashMap3 = linkedHashMap2;
                        list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                        if (list == null) {
                            linkedHashMap3.put(Integer.valueOf(i5), q3d.l(e3aVar3));
                        } else {
                            list.add(e3aVar3);
                        }
                    } else {
                        linkedHashMap3 = linkedHashMap2;
                    }
                    if (Intrinsics.d(hzjVar2, hzjVar)) {
                        f4w0Var = this.e;
                        hzjVar2.getClass();
                        if (f4w0Var.g(hzjVar2, xii0Var)) {
                            e3aVar4 = e3aVar3;
                        }
                    }
                    linkedHashMap2 = linkedHashMap3;
                    i5 = i5;
                }
                str3 = str4;
                m2aVar3 = m2aVar4;
                i3 = i4;
                z4 = z5;
                it = it2;
                linkedHashMap4 = linkedHashMap2;
                arrayList4 = arrayList3;
            }
            int i9 = i3;
            ArrayList arrayList5 = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            if (xii0Var.i == null || e3aVar4 == null) {
                arrayList = arrayList5;
            } else {
                arrayList = arrayList5;
                arrayList.add(new ffx(e3aVar4, ((gf80) CollectionsKt.v0(e3aVar4.f7123a)).b));
            }
            i2 = i9;
        } else {
            arrayList = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            i2 = 1;
        }
        i2a i2aVar = this.d;
        if (i2aVar.a().a(CaptureSessionStuckQuirk.class) && l8x.f0("CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        String str6 = Build.MODEL;
        str6.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str6.toLowerCase(locale);
        lowerCase.getClass();
        boolean zX = kotlin.text.c.x(lowerCase, "cph", false);
        vz9 vz9Var = new vz9((!z2 || mhk.a().b(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && mhk.a().b(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new x860(i2aVar.a().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, wz9.f40013a), zX ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.j.b) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.c || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.f45306a || CloseCameraDeviceOnCameraGraphCloseQuirk.b)) ? z2 : true : false, 9);
        if (xii0Var != null) {
            t7a t7aVar2 = xii0Var.g;
            Integer num3 = (Integer) t7aVar2.b.e(fpt0.O0, num2);
            Objects.requireNonNull(num3);
            int iIntValue = num3.intValue();
            Integer num4 = (Integer) t7aVar2.b.e(fpt0.P0, num2);
            Objects.requireNonNull(num4);
            int iIntValue2 = num4.intValue();
            if (iIntValue != 1 && iIntValue2 != 1) {
                if (iIntValue == 2) {
                    num2 = 2;
                } else if (iIntValue2 == 2) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
            }
        } else {
            num2 = null;
        }
        Range rangeA = xii0Var != null ? xii0Var.g.a() : null;
        if (Intrinsics.d(rangeA, h55.h)) {
            rangeA = null;
        }
        jo20 jo20Var = new jo20();
        if (z2) {
            jo20Var.put(n1a.c, Boolean.TRUE);
        }
        if (num2 != null) {
            jo20Var.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
        }
        jo20Var.put(n1a.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeA != null) {
            jo20Var.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        jo20 jo20VarB = jo20Var.b();
        if (rangeA != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        if (num2 != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
        }
        if (xii0Var != null) {
            String str7 = (String) xii0Var.g.b.e(hx9.j, null);
            a55 a55Var2 = xii0Var.b;
            if (a55Var2 != null) {
                hzj hzjVar3 = a55Var2.f252a;
                hzjVar3.getClass();
                if (str7 == null) {
                    str7 = null;
                }
                int i10 = a55Var2.c;
                Size size2 = hzjVar3.h;
                size2.getClass();
                int i11 = hzjVar3.i;
                if (str7 == null) {
                    str = null;
                } else {
                    g0a.a(str7);
                    str = str7;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if80Var2 = null;
                    } else {
                        if80Var = new if80(2);
                    }
                    e3aVar2 = new e3a(kotlin.collections.a.c(xi70.d(i11, 1000, null, null, if80Var2, null, null, size2, str)));
                    linkedHashMap6.put(e3aVar2, hzjVar3);
                } else {
                    if80Var = new if80(1);
                }
                if80Var2 = if80Var;
                e3aVar2 = new e3a(kotlin.collections.a.c(xi70.d(i11, 1000, null, null, if80Var2, null, null, size2, str)));
                linkedHashMap6.put(e3aVar2, hzjVar3);
            } else {
                e3aVar2 = null;
            }
            e3aVar = e3aVar2;
        } else {
            e3aVar = null;
        }
        l4a l4aVar = this.h;
        if (l4aVar != null) {
            u15 u15Var = sw9.f32911a;
            arrayList2 = null;
            if (l4aVar.f19393a.e(sw9.f32911a, null) != null) {
                hny.b();
                return null;
            }
        } else {
            arrayList2 = null;
        }
        return new xz9(new tz9(this.c.b, CollectionsKt.L0(linkedHashMap6.keySet()), CollectionsKt.L0(linkedHashMap.values()), arrayList.isEmpty() ? arrayList2 : arrayList, e3aVar, i2, linkedHashMap5, i, jo20VarB, q3d.j(this.f43505a, this.b), q3d.k(sevVar), vz9Var), xp20.n(linkedHashMap6));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) g0a.b(this.c.b)) + '>';
    }
}
