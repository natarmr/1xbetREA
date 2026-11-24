package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e5t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7250a;
    public final /* synthetic */ d930 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ e5t(byte b, cp cpVar, d930 d930Var) {
        this.f7250a = b;
        this.b = d930Var;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7250a;
        cp cpVar = this.c;
        d930 d930Var = this.b;
        switch (b) {
            case 0:
                d930Var.c(String.valueOf(cpVar.d()), ((q7b0) cpVar.u).b.getGameCollection());
                break;
            case 1:
                d930Var.c(String.valueOf(cpVar.d()), ((v6b0) cpVar.u).b);
                break;
            case 2:
                d930Var.c(twn.m(cpVar.d(), "LargeBannerGamesCollectionAdapterDelegate.SCROLL_STATE_KEEPER_KEY"), ((r7b0) cpVar.u).b);
                break;
            case 3:
                d930Var.b(twn.m(cpVar.d(), "LargeBannerGamesCollectionAdapterDelegate.SCROLL_STATE_KEEPER_KEY"), ((r7b0) cpVar.u).b);
                break;
            case 4:
                d930Var.b(String.valueOf(cpVar.d()), ((js10) cpVar.u).b);
                break;
            default:
                d930Var.c(String.valueOf(cpVar.d()), ((js10) cpVar.u).b);
                break;
        }
        return Unit.f46060a;
    }
}
