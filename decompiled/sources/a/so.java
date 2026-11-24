package a;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32518a;
    public final Uri[] b;
    public final MediaItem[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final to[] g;

    static {
        hne.s(0, 1, 2, 3, 4);
        hne.s(5, 6, 7, 8, 9);
        vtt0.H(10);
        vtt0.H(11);
    }

    public so(int i, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, String[] strArr, to[] toVarArr) {
        Uri uri;
        int i2 = 0;
        x0x.A(iArr.length == mediaItemArr.length);
        x0x.A(iArr.length == toVarArr.length);
        this.f32518a = i;
        this.d = iArr;
        this.c = mediaItemArr;
        this.e = jArr;
        this.b = new Uri[mediaItemArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 >= uriArr.length) {
                this.f = strArr;
                this.g = toVarArr;
                return;
            }
            MediaItem mediaItem = mediaItemArr[i2];
            if (mediaItem == null) {
                uri = null;
            } else {
                en30 en30Var = mediaItem.b;
                en30Var.getClass();
                uri = en30Var.f8073a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || so.class != obj.getClass()) {
            return false;
        }
        so soVar = (so) obj;
        return this.f32518a == soVar.f32518a && Arrays.equals(this.c, soVar.c) && Arrays.equals(this.d, soVar.d) && Arrays.equals(this.e, soVar.e) && Arrays.equals(this.f, soVar.f) && Arrays.equals(this.g, soVar.g);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.f32518a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
