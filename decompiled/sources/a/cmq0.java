package a;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class cmq0 extends pwq {
    public final MediaItem c;

    public cmq0(bmq0 bmq0Var, MediaItem mediaItem) {
        super(bmq0Var);
        this.c = mediaItem;
    }

    @Override // a.pwq, a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        super.m(i, timeline$Window, j);
        MediaItem mediaItem = this.c;
        timeline$Window.b = mediaItem;
        en30 en30Var = mediaItem.b;
        return timeline$Window;
    }
}
