package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class rsn implements qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ glz f31039a;

    public rsn(EmojiCompatInitializer emojiCompatInitializer, glz glzVar) {
        this.f31039a = glzVar;
    }

    @Override // a.qvj
    public final void onResume(clz clzVar) {
        (Build.VERSION.SDK_INT >= 28 ? qqd.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new tsn((byte) 0), 500L);
        this.f31039a.f(this);
    }
}
