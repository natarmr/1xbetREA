package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11758a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gr(byte b, long j, Object obj, Object obj2, boolean z) {
        this.f11758a = b;
        this.d = obj;
        this.b = j;
        this.c = z;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f11758a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                sgb sgbVar = (sgb) obj;
                m0o0 m0o0Var = (m0o0) ((nr) obj2).b;
                sgbVar.getClass();
                i5p i5pVar = new i5p(-1, 0, sgbVar.b(), this.b, sgbVar instanceof qgb ? ((qgb) sgbVar).b : 0L, 0L, 0L, sgbVar, h5p.f12492a, "", "", "", this.c);
                abp abpVar = m0o0Var.b;
                abpVar.getClass();
                p7m0 p7m0Var = abpVar.d;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new iap(CollectionsKt.r0(abp.e((kap) value), i5pVar))));
                break;
            default:
                ((Function1) obj2).invoke(new jzl(this.b, this.c, (uzl) obj));
                break;
        }
        return Unit.f46060a;
    }
}
