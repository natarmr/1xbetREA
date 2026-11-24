package a;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class h930 extends bmq0 {
    public final MediaItem b;

    public h930(MediaItem mediaItem) {
        this.b = mediaItem;
    }

    @Override // a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        Object obj = Timeline$Window.p;
        timeline$Window.b(this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
        timeline$Window.j = true;
        return timeline$Window;
    }
}
