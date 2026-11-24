package a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ai30 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f906a;
    public final /* synthetic */ com.google.android.material.datepicker.i b;
    public final /* synthetic */ com.google.android.material.datepicker.e c;

    public /* synthetic */ ai30(com.google.android.material.datepicker.e eVar, com.google.android.material.datepicker.i iVar, byte b) {
        this.f906a = b;
        this.c = eVar;
        this.b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f906a;
        com.google.android.material.datepicker.i iVar = this.b;
        com.google.android.material.datepicker.e eVar = this.c;
        switch (b) {
            case 0:
                int iF1 = ((LinearLayoutManager) eVar.O1.getLayoutManager()).f1();
                iVar.i = 2;
                eVar.z0(iVar.z(iF1 + 1));
                break;
            default:
                int iH1 = ((LinearLayoutManager) eVar.O1.getLayoutManager()).h1();
                iVar.i = 1;
                eVar.z0(iVar.z(iH1 - 1));
                break;
        }
    }
}
