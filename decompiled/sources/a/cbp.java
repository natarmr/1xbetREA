package a;

import org.xplatform.favorites.impl.data.workers.FavoriteLocalNotificationWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class cbp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ FavoriteLocalNotificationWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbp(FavoriteLocalNotificationWorker favoriteLocalNotificationWorker, zje zjeVar) {
        super(zjeVar);
        this.j = favoriteLocalNotificationWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
