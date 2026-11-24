package a;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class e7x0 extends y4w0 {
    public final gvw J(aa60 aa60Var, String str, int i, aa60 aa60Var2) {
        Parcel parcelG = G();
        mnw0.b(parcelG, aa60Var);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        mnw0.b(parcelG, aa60Var2);
        Parcel parcelE = E(parcelG, 2);
        gvw gvwVarG = aa60.G(parcelE.readStrongBinder());
        parcelE.recycle();
        return gvwVarG;
    }

    public final gvw K(aa60 aa60Var, String str, int i, aa60 aa60Var2) {
        Parcel parcelG = G();
        mnw0.b(parcelG, aa60Var);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        mnw0.b(parcelG, aa60Var2);
        Parcel parcelE = E(parcelG, 3);
        gvw gvwVarG = aa60.G(parcelE.readStrongBinder());
        parcelE.recycle();
        return gvwVarG;
    }
}
