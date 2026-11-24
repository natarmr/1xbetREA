package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class kyg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f19103a;

    public kyg0(pbt pbtVar) {
        pbtVar.getClass();
        this.f19103a = pbtVar;
    }

    public final void a(long j) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f19103a.b.f20589a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putLong("OneXGamesBalanceLocalDataSource.BALANCE_ID_KEY", j);
        editorEdit.apply();
    }
}
