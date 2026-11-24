package a;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class frm0 extends roi0 {
    public static boolean m() {
        return mhk.a().b(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // a.roi0
    public final Size[] f(int i) {
        if (i == 4101 && m()) {
            return null;
        }
        return super.f(i);
    }

    @Override // a.roi0
    public final Integer[] g() {
        Integer[] numArrG = super.g();
        if (!m()) {
            return numArrG;
        }
        if (numArrG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrG) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // a.roi0
    public final long h(int i, Size size) {
        size.getClass();
        if (i == 4101 && m()) {
            return 0L;
        }
        return super.h(i, size);
    }

    @Override // a.roi0
    public final Size[] i(int i) {
        if (i == 4101 && m()) {
            return null;
        }
        return super.i(i);
    }
}
