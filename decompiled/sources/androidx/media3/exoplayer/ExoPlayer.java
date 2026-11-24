package androidx.media3.exoplayer;

import a.my90;
import androidx.media3.exoplayer.image.ImageOutput;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends my90 {
    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
