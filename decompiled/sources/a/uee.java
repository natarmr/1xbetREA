package a;

import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uee implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35523a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ uee(ContentLoadingProgressBar contentLoadingProgressBar, byte b) {
        this.f35523a = b;
        this.b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f35523a;
        ContentLoadingProgressBar contentLoadingProgressBar = this.b;
        switch (b) {
            case 0:
                int i = ContentLoadingProgressBar.g;
                contentLoadingProgressBar.b = false;
                contentLoadingProgressBar.f45358a = -1L;
                contentLoadingProgressBar.setVisibility(8);
                break;
            case 1:
                int i2 = ContentLoadingProgressBar.g;
                contentLoadingProgressBar.c = false;
                if (!contentLoadingProgressBar.d) {
                    contentLoadingProgressBar.f45358a = System.currentTimeMillis();
                    contentLoadingProgressBar.setVisibility(0);
                }
                break;
            case 2:
                int i3 = ContentLoadingProgressBar.g;
                contentLoadingProgressBar.f45358a = -1L;
                contentLoadingProgressBar.d = false;
                contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.e);
                contentLoadingProgressBar.b = false;
                if (!contentLoadingProgressBar.c) {
                    contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f, 500L);
                    contentLoadingProgressBar.c = true;
                }
                break;
            default:
                int i4 = ContentLoadingProgressBar.g;
                contentLoadingProgressBar.d = true;
                contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f);
                contentLoadingProgressBar.c = false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = contentLoadingProgressBar.f45358a;
                long j2 = jCurrentTimeMillis - j;
                if (j2 >= 500 || j == -1) {
                    contentLoadingProgressBar.setVisibility(8);
                } else if (!contentLoadingProgressBar.b) {
                    contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.e, 500 - j2);
                    contentLoadingProgressBar.b = true;
                }
                break;
        }
    }
}
