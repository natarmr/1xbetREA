package androidx.core.graphics.drawable;

import a.bcu0;
import a.ccu0;
import a.jf4;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(bcu0 bcu0Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f45356a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.f45356a = !bcu0Var.e(1) ? -1 : ((ccu0) bcu0Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (bcu0Var.e(2)) {
            Parcel parcel = ((ccu0) bcu0Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = bcu0Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (bcu0Var.e(4)) {
            i2 = ((ccu0) bcu0Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (bcu0Var.e(5)) {
            i3 = ((ccu0) bcu0Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) bcu0Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (bcu0Var.e(7)) {
            string = ((ccu0) bcu0Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (bcu0Var.e(8)) {
            string2 = ((ccu0) bcu0Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f45356a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                jf4.o("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.f45356a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.f45356a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(Separators.COLON, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, bcu0 bcu0Var) {
        bcu0Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f45356a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f45356a;
        if (-1 != i) {
            bcu0Var.h(1);
            ((ccu0) bcu0Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bcu0Var.h(2);
            Parcel parcel = ((ccu0) bcu0Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bcu0Var.h(3);
            ((ccu0) bcu0Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bcu0Var.h(4);
            ((ccu0) bcu0Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            bcu0Var.h(5);
            ((ccu0) bcu0Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bcu0Var.h(6);
            ((ccu0) bcu0Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bcu0Var.h(7);
            ((ccu0) bcu0Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bcu0Var.h(8);
            ((ccu0) bcu0Var).e.writeString(str2);
        }
    }
}
