package a;

import org.xplatform.widget.impl.workers.FavoritesGamesRequestWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class afp extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ FavoritesGamesRequestWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afp(FavoritesGamesRequestWorker favoritesGamesRequestWorker, zje zjeVar) {
        super(zjeVar);
        this.k = favoritesGamesRequestWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
