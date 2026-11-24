package a;

import android.adservices.measurement.MeasurementManager;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class mmv {
    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture m(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture n(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture o(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture p(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SurfaceSyncGroup q(Object obj) {
        return (SurfaceSyncGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
