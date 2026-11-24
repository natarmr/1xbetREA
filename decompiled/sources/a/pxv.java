package a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pxv {
    public static final Range f = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1a f27774a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;

    public pxv(c1a c1aVar) {
        c1aVar.getClass();
        this.f27774a = c1aVar;
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.oxv
            public final /* synthetic */ pxv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listG0;
                byte b2 = b;
                pxv pxvVar = this.b;
                switch (b2) {
                    case 0:
                        c1a c1aVar2 = pxvVar.f27774a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ow9) c1aVar2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) pxvVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            itt0.a();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = v7k0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = v7k0.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        c1a c1aVar3 = pxvVar.f27774a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new erm0(streamConfigurationMap, new cf80(c1aVar3));
                        }
                        jf4.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((erm0) pxvVar.d.getValue()).d.f30839a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listG0 = tx3.g0(highSpeedVideoSizes)) == null) ? iun.f15405a : listG0;
                }
            }
        });
        final byte b2 = 1;
        this.c = maz.b(new Function0(this) { // from class: a.oxv
            public final /* synthetic */ pxv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listG0;
                byte b3 = b2;
                pxv pxvVar = this.b;
                switch (b3) {
                    case 0:
                        c1a c1aVar2 = pxvVar.f27774a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ow9) c1aVar2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) pxvVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            itt0.a();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = v7k0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = v7k0.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        c1a c1aVar3 = pxvVar.f27774a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new erm0(streamConfigurationMap, new cf80(c1aVar3));
                        }
                        jf4.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((erm0) pxvVar.d.getValue()).d.f30839a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listG0 = tx3.g0(highSpeedVideoSizes)) == null) ? iun.f15405a : listG0;
                }
            }
        });
        final byte b3 = 2;
        this.d = maz.b(new Function0(this) { // from class: a.oxv
            public final /* synthetic */ pxv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listG0;
                byte b4 = b3;
                pxv pxvVar = this.b;
                switch (b4) {
                    case 0:
                        c1a c1aVar2 = pxvVar.f27774a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ow9) c1aVar2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) pxvVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            itt0.a();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = v7k0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = v7k0.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        c1a c1aVar3 = pxvVar.f27774a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new erm0(streamConfigurationMap, new cf80(c1aVar3));
                        }
                        jf4.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((erm0) pxvVar.d.getValue()).d.f30839a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listG0 = tx3.g0(highSpeedVideoSizes)) == null) ? iun.f15405a : listG0;
                }
            }
        });
        final byte b4 = 3;
        this.e = maz.b(new Function0(this) { // from class: a.oxv
            public final /* synthetic */ pxv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listG0;
                byte b5 = b4;
                pxv pxvVar = this.b;
                switch (b5) {
                    case 0:
                        c1a c1aVar2 = pxvVar.f27774a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ow9) c1aVar2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) pxvVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            itt0.a();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = v7k0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = v7k0.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        c1a c1aVar3 = pxvVar.f27774a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ow9) c1aVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new erm0(streamConfigurationMap, new cf80(c1aVar3));
                        }
                        jf4.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((erm0) pxvVar.d.getValue()).d.f30839a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listG0 = tx3.g0(highSpeedVideoSizes)) == null) ? iun.f15405a : listG0;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayListN0 = CollectionsKt.N0((Collection) CollectionsKt.U(list));
        Iterator it = CollectionsKt.O(list, 1).iterator();
        while (it.hasNext()) {
            arrayListN0.retainAll((List) it.next());
        }
        return arrayListN0;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && CollectionsKt.L0(CollectionsKt.O0(list)).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (Intrinsics.d(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object g0g0Var;
        List listL0;
        try {
            e0g0 e0g0Var = j0g0.b;
            erm0 erm0Var = (erm0) this.d.getValue();
            erm0Var.getClass();
            size.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) erm0Var.d.f30839a;
            g0g0Var = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Range[] rangeArr = (Range[]) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        return (rangeArr == null || (listL0 = CollectionsKt.L0(tx3.z(rangeArr))) == null) ? iun.f15405a : listL0;
    }
}
