package com.huawei.hms.common.size;

import a.f140;
import a.jf4;
import android.gov.nist.core.Separators;
import com.huawei.hms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Size {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45804a;
    private final int b;

    public Size(int i, int i2) {
        this.f45804a = i;
        this.b = i2;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(Separators.STAR);
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            jf4.o("Size parses failed");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f45804a == size.f45804a && this.b == size.b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.f45804a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return f140.j(this.f45804a, "Width is ", this.b, " Height is ");
    }
}
