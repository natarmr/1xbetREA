package androidx.core.app;

import a.bcu0;
import a.ccu0;
import a.dcu0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bcu0 bcu0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        dcu0 dcu0VarG = remoteActionCompat.f45354a;
        boolean z = true;
        if (bcu0Var.e(1)) {
            dcu0VarG = bcu0Var.g();
        }
        remoteActionCompat.f45354a = (IconCompat) dcu0VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (bcu0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ccu0) bcu0Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bcu0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ccu0) bcu0Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) bcu0Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (bcu0Var.e(5)) {
            z2 = ((ccu0) bcu0Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!bcu0Var.e(6)) {
            z = z3;
        } else if (((ccu0) bcu0Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bcu0 bcu0Var) {
        bcu0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f45354a;
        bcu0Var.h(1);
        bcu0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bcu0Var.h(2);
        Parcel parcel = ((ccu0) bcu0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bcu0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        bcu0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        bcu0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        bcu0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
