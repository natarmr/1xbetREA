package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wca implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38915a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ bbl0 c;

    public /* synthetic */ wca(cp cpVar, bbl0 bbl0Var, byte b) {
        this.f38915a = b;
        this.b = cpVar;
        this.c = bbl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38915a;
        bbl0 bbl0Var = this.c;
        cp cpVar = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                tpp0 tpp0Var = (tpp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(tpp0Var.f34345a), Boolean.valueOf(tpp0Var.c));
                break;
            case 1:
                view.getClass();
                tpp0 tpp0Var2 = (tpp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(tpp0Var2.b), Boolean.valueOf(tpp0Var2.d));
                break;
            case 2:
                view.getClass();
                spp0 spp0Var = (spp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var.f32598a), Boolean.valueOf(spp0Var.e));
                break;
            case 3:
                view.getClass();
                spp0 spp0Var2 = (spp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var2.b), Boolean.valueOf(spp0Var2.f));
                break;
            case 4:
                view.getClass();
                spp0 spp0Var3 = (spp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var3.c), Boolean.valueOf(spp0Var3.g));
                break;
            case 5:
                view.getClass();
                spp0 spp0Var4 = (spp0) ((uca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var4.d), Boolean.valueOf(spp0Var4.h));
                break;
            case 6:
                view.getClass();
                tpp0 tpp0Var3 = (tpp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(tpp0Var3.f34345a), Boolean.valueOf(tpp0Var3.c));
                break;
            case 7:
                view.getClass();
                tpp0 tpp0Var4 = (tpp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(tpp0Var4.b), Boolean.valueOf(tpp0Var4.d));
                break;
            case 8:
                view.getClass();
                spp0 spp0Var5 = (spp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var5.f32598a), Boolean.valueOf(spp0Var5.e));
                break;
            case 9:
                view.getClass();
                spp0 spp0Var6 = (spp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var6.b), Boolean.valueOf(spp0Var6.f));
                break;
            case 10:
                view.getClass();
                spp0 spp0Var7 = (spp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var7.c), Boolean.valueOf(spp0Var7.g));
                break;
            case 11:
                view.getClass();
                spp0 spp0Var8 = (spp0) ((yca) cpVar.u()).c;
                bbl0Var.invoke(Long.valueOf(spp0Var8.d), Boolean.valueOf(spp0Var8.h));
                break;
            case 12:
                view.getClass();
                bbl0Var.invoke(Long.valueOf(((qca) cpVar.u()).d.p()), Boolean.valueOf(((qca) cpVar.u()).d.n()));
                break;
            case 13:
                view.getClass();
                bbl0Var.invoke(Long.valueOf(((qca) cpVar.u()).d.u()), Boolean.valueOf(((qca) cpVar.u()).d.s()));
                break;
            case 14:
                view.getClass();
                tpp0 tpp0Var5 = (tpp0) ((htq) cpVar.u()).b;
                bbl0Var.invoke(Long.valueOf(tpp0Var5.f34345a), Boolean.valueOf(tpp0Var5.c));
                break;
            default:
                view.getClass();
                tpp0 tpp0Var6 = (tpp0) ((htq) cpVar.u()).b;
                bbl0Var.invoke(Long.valueOf(tpp0Var6.b), Boolean.valueOf(tpp0Var6.d));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wca(bbl0 bbl0Var, cp cpVar, byte b) {
        this.f38915a = b;
        this.c = bbl0Var;
        this.b = cpVar;
    }
}
