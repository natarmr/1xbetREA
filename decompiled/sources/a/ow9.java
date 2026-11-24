package a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ow9 implements c1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25959a;
    public final CameraCharacteristics b;
    public final ix9 c;
    public final Set d;
    public final ArrayMap e;
    public final ArrayMap f;
    public final a8z g;
    public final a8z h;
    public final a8z i;

    public ow9(String str, CameraCharacteristics cameraCharacteristics, ix9 ix9Var, lun lunVar, Set set) {
        str.getClass();
        set.getClass();
        this.f25959a = str;
        this.b = cameraCharacteristics;
        this.c = ix9Var;
        this.d = set;
        this.e = new ArrayMap();
        this.f = new ArrayMap();
        wez wezVar = wez.f39042a;
        final byte b = 0;
        this.g = maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b2 = b;
                ow9 ow9Var = this.b;
                switch (b2) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b2 = 1;
        maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b3 = b2;
                ow9 ow9Var = this.b;
                switch (b3) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b3 = 2;
        maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b4 = b3;
                ow9 ow9Var = this.b;
                switch (b4) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b4 = 3;
        maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b5 = b4;
                ow9 ow9Var = this.b;
                switch (b5) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b5 = 4;
        this.h = maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b6 = b5;
                ow9 ow9Var = this.b;
                switch (b6) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b6 = 5;
        maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b7 = b6;
                ow9 ow9Var = this.b;
                switch (b7) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b7 = 6;
        maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b8 = b7;
                ow9 ow9Var = this.b;
                switch (b8) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
        final byte b8 = 7;
        this.i = maz.a(wezVar, new Function0(this) { // from class: a.nw9
            public final /* synthetic */ ow9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objP0;
                byte b9 = b8;
                ow9 ow9Var = this.b;
                switch (b9) {
                    case 0:
                        String str2 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) g0a.b(str2)) + "#supportedExtensions");
                                ix9 ix9Var2 = ow9Var.c;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    List supportedExtensions = ix9Var2.d(str2).getSupportedExtensions();
                                    supportedExtensions.getClass();
                                    objP0 = CollectionsKt.P0(supportedExtensions);
                                } else {
                                    objP0 = xun.f41520a;
                                }
                                return objP0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) g0a.b(str2)), e);
                            return xun.f41520a;
                        }
                    case 1:
                        String str3 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = ow9Var.b.getKeys();
                                if (keys == null) {
                                    keys = iun.f15405a;
                                }
                                return CollectionsKt.P0(keys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) g0a.b(str3)) + '}', e2);
                            return xun.f41520a;
                        }
                    case 2:
                        String str4 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = ow9Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) g0a.b(str4)), e3);
                            return xun.f41520a;
                        }
                    case 3:
                        String str5 = ow9Var.f25959a;
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = ow9Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableCaptureResultKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) g0a.b(str5)), e4);
                            return xun.f41520a;
                        }
                    case 4:
                        String str6 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) g0a.b(str6)) + "#physicalCameraIds");
                                Set physicalCameraIds = ow9Var.b.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) g0a.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                                for (String str7 : set2) {
                                    g0a.a(str7);
                                    arrayList.add(new g0a(str7));
                                }
                                return CollectionsKt.P0(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e5);
                            return xun.f41520a;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) g0a.b(str6)), e6);
                            return xun.f41520a;
                        }
                    case 5:
                        String str8 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable availablePhysicalCameraRequestKeys = ow9Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availablePhysicalCameraRequestKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return xun.f41520a;
                        }
                    case 6:
                        String str9 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = ow9Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionCharacteristicsKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return xun.f41520a;
                        }
                    default:
                        String str10 = ow9Var.f25959a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return xun.f41520a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable availableSessionKeys = ow9Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = iun.f15405a;
                                }
                                return CollectionsKt.P0(availableSessionKeys);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return xun.f41520a;
                        }
                }
            }
        });
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(CameraCharacteristics.class))) {
            return this.b;
        }
        return null;
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        key.getClass();
        if (this.d.contains(key)) {
            try {
                return this.b.get(key);
            } catch (AssertionError unused) {
                udk.d(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.e) {
            obj = this.e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.b.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.e) {
                this.e.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            udk.d(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
            return null;
        }
    }
}
