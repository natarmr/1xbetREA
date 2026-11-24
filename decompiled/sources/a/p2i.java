package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p2i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26250a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ s3i c;

    public /* synthetic */ p2i(Function1 function1, s3i s3iVar, byte b) {
        this.f26250a = b;
        this.b = function1;
        this.c = s3iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26250a;
        s3i s3iVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(s3iVar);
                break;
            case 1:
                function1.invoke(s3iVar);
                break;
            default:
                function1.invoke(s3iVar);
                break;
        }
        return Unit.f46060a;
    }
}
