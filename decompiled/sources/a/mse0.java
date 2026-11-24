package a;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mse0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mse0 f22316a = new mse0();

    public mse0() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        matchResult.getClass();
        return matchResult.next();
    }
}
