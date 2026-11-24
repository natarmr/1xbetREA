package a;

import androidx.media3.common.MediaItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uo {
    public static final uo c = new uo(new so[0]);
    public static final so d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35986a;
    public final so[] b;

    static {
        so soVar = new so(-1, new int[0], new MediaItem[0], new long[0], new String[0], new to[0]);
        int[] iArr = soVar.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = soVar.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(soVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(soVar.f, 0);
        to[] toVarArr = soVar.g;
        d = new so(0, iArrCopyOf, mediaItemArr, jArrCopyOf, strArr, (to[]) Arrays.copyOf(toVarArr, Math.max(0, toVarArr.length)));
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
        vtt0.H(4);
    }

    public uo(so[] soVarArr) {
        this.f35986a = soVarArr.length;
        this.b = soVarArr;
    }

    public final so a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo.class != obj.getClass()) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f35986a == uoVar.f35986a && Arrays.equals(this.b, uoVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.f35986a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            so[] soVarArr = this.b;
            if (i >= soVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, contentResumeOffsetUs=0, ads=[");
            soVarArr[i].getClass();
            soVarArr[i].getClass();
            for (int i2 = 0; i2 < soVarArr[i].d.length; i2++) {
                sb.append("ad(state=");
                int i3 = soVarArr[i].d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(soVarArr[i].e[i2]);
                sb.append(')');
                if (i2 < soVarArr[i].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < soVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
