package a;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yx2 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yx2 f43401a = new yx2();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        iy2 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = ey2.f8605a;
        gkx gkxVarC = contentCaptureManager.c();
        Object[] objArr = gkxVarC.c;
        long[] jArr = gkxVarC.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        hz40 hz40Var = ((vai0) objArr[(i << 3) + i3]).f37089a.d.f23193a;
                        Object objG = hz40Var.g(xai0.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = hz40Var.g(mai0.n);
                            m6 m6Var = (m6) (objG2 != null ? objG2 : null);
                            if (m6Var != null && (function0 = (Function0) m6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        iy2 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = ey2.f8605a;
        gkx gkxVarC = contentCaptureManager.c();
        Object[] objArr = gkxVarC.c;
        long[] jArr = gkxVarC.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        hz40 hz40Var = ((vai0) objArr[(i << 3) + i3]).f37089a.d.f23193a;
                        Object objG = hz40Var.g(xai0.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.d(objG, Boolean.TRUE)) {
                            Object objG2 = hz40Var.g(mai0.m);
                            m6 m6Var = (m6) (objG2 != null ? objG2 : null);
                            if (m6Var != null && (function1 = (Function1) m6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        iy2 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = ey2.b;
        gkx gkxVarC = contentCaptureManager.c();
        Object[] objArr = gkxVarC.c;
        long[] jArr = gkxVarC.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        hz40 hz40Var = ((vai0) objArr[(i << 3) + i3]).f37089a.d.f23193a;
                        Object objG = hz40Var.g(xai0.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.d(objG, Boolean.FALSE)) {
                            Object objG2 = hz40Var.g(mai0.m);
                            m6 m6Var = (m6) (objG2 != null ? objG2 : null);
                            if (m6Var != null && (function1 = (Function1) m6Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
