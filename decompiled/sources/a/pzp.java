package a;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pzp implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27857a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ z6e c;

    public /* synthetic */ pzp(cp cpVar, z6e z6eVar, byte b) {
        this.f27857a = b;
        this.b = cpVar;
        this.c = z6eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f27857a;
        z6e z6eVar = this.c;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                z6eVar.invoke(new l1o(((pde0) cpVar.u()).f26804a));
                break;
            case 1:
                String str = ((rdi0) cpVar.u()).b;
                z6eVar.invoke(str != null ? new k1o(str) : new l1o(((rdi0) cpVar.u()).f30293a));
                break;
            case 2:
                z6eVar.invoke(new l1o(((rde0) cpVar.u()).f30288a));
                break;
            case 3:
                String str2 = ((xdi0) cpVar.u()).b;
                z6eVar.invoke(str2 != null ? new k1o(str2) : new l1o(((xdi0) cpVar.u()).f40694a));
                break;
            case 4:
                z6eVar.invoke(new l1o(((sde0) cpVar.u()).f32031a));
                break;
            case 5:
                String str3 = ((ydi0) cpVar.u()).b;
                z6eVar.invoke(str3 != null ? new k1o(str3) : new l1o(((ydi0) cpVar.u()).f42440a));
                break;
            default:
                String str4 = ((lfi0) cpVar.u()).b;
                z6eVar.invoke(str4 != null ? new k1o(str4) : new l1o(((lfi0) cpVar.u()).f19958a));
                break;
        }
    }

    public /* synthetic */ pzp(z6e z6eVar, cp cpVar, byte b) {
        this.f27857a = b;
        this.c = z6eVar;
        this.b = cpVar;
    }
}
