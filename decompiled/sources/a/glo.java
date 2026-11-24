package a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class glo implements sg00, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11502a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ glo(yx90 yx90Var, int i) {
        this.b = yx90Var;
        this.f11502a = i;
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        bmq0 bmq0Var = ((yx90) this.b).f43410a;
        ((ky90) obj).k(this.f11502a ? 1 : 0);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = x9x.R((Context) this.b).edit();
        editorEdit.putBoolean("proxy_retention", this.f11502a);
        editorEdit.apply();
    }

    public /* synthetic */ glo(Context context, boolean z) {
        this.b = context;
        this.f11502a = z;
    }
}
