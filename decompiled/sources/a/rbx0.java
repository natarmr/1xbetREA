package a;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class rbx0 extends y4w0 implements mex0 {
    @Override // a.mex0
    public final gvw zzd() {
        Parcel parcelE = E(G(), 1);
        gvw gvwVarG = aa60.G(parcelE.readStrongBinder());
        parcelE.recycle();
        return gvwVarG;
    }

    @Override // a.mex0
    public final int zze() {
        Parcel parcelE = E(G(), 2);
        int i = parcelE.readInt();
        parcelE.recycle();
        return i;
    }
}
