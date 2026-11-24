package a;

import org.xplatform.aggregator.daily_tasks.impl.workers.DailyTaskFinishingNotificationWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class m0j extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ DailyTaskFinishingNotificationWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j(DailyTaskFinishingNotificationWorker dailyTaskFinishingNotificationWorker, zje zjeVar) {
        super(zjeVar);
        this.j = dailyTaskFinishingNotificationWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
