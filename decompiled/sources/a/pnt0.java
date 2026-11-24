package a;

import java.io.File;
import org.xplatform.consultantchat.presentation.workers.UploadWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class pnt0 extends zje {
    public String i;
    public String j;
    public rei0 k;
    public i050 l;
    public File m;
    public /* synthetic */ Object n;
    public final /* synthetic */ UploadWorker o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnt0(UploadWorker uploadWorker, zje zjeVar) {
        super(zjeVar);
        this.o = uploadWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(this);
    }
}
