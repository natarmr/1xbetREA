package a;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jtw0 extends y4w0 implements mtw0 {
    @Override // a.mtw0
    public final void n(List list) {
        Parcel parcelG = G();
        parcelG.writeTypedList(list);
        I(parcelG);
    }
}
