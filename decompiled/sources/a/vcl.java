package a;

import org.xplatform.consultantchat.presentation.workers.DownloadWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class vcl extends zje {
    public String i;
    public String j;
    public String k;
    public i050 l;
    public rcl m;
    public DownloadWorker n;
    public vcl o;
    public Throwable p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ DownloadWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcl(DownloadWorker downloadWorker, zje zjeVar) {
        super(zjeVar);
        this.x = downloadWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
