package a;

import androidx.media3.common.DrmInitData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fbw extends gbw {
    public final String l;
    public final b4x m;

    public fbw(String str, fbw fbwVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, fbwVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = b4x.o(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fbw(long j, long j2, String str, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, rcf0.e);
        v3x v3xVar = b4x.b;
    }
}
