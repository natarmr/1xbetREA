package a;

import android.gov.nist.core.Separators;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zre implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44849a;
    public final /* synthetic */ cp b;

    public /* synthetic */ zre(cp cpVar, byte b) {
        this.f44849a = b;
        this.b = cpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        byte b = this.f44849a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((RecyclerView) ((rcu0) cpVar.u).b.q.g).b0();
                break;
            case 1:
                ((hth) cpVar.u).e.setText(((tog) cpVar.u()).f34281a.f25594a);
                break;
            case 2:
                yfu0 yfu0Var = cpVar.u;
                if (((jth) yfu0Var).f17100a.getLayoutDirection() == 0) {
                    str = ((cov) cpVar.u()).j.f37736a;
                    str2 = ((cov) cpVar.u()).j.b;
                } else {
                    str = ((cov) cpVar.u()).j.b;
                    str2 = ((cov) cpVar.u()).j.f37736a;
                }
                ((jth) yfu0Var).g.setText(w6x.q(str, Separators.COLON, str2));
                break;
            default:
                yfu0 yfu0Var2 = cpVar.u;
                if (((qth) yfu0Var2).f29299a.getLayoutDirection() == 1) {
                    str3 = ((m4k0) cpVar.u()).d.f10670a;
                    str4 = ((m4k0) cpVar.u()).d.b;
                } else {
                    str3 = ((m4k0) cpVar.u()).d.b;
                    str4 = ((m4k0) cpVar.u()).d.f10670a;
                }
                ((qth) yfu0Var2).g.setText(w6x.q(str3, "-", str4));
                break;
        }
    }
}
