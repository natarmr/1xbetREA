package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fzn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10415a;
    public final /* synthetic */ pzn b;
    public final /* synthetic */ alo c;
    public final /* synthetic */ toj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzn(pzn pznVar, alo aloVar, toj0 toj0Var, byte b) {
        super(1);
        this.f10415a = b;
        this.b = pznVar;
        this.c = aloVar;
        this.d = toj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10415a;
        pzn pznVar = this.b;
        toj0 toj0Var = this.d;
        alo aloVar = this.c;
        float f = 1.0f;
        switch (b) {
            case 0:
                int iOrdinal = ((azn) obj).ordinal();
                if (iOrdinal == 0) {
                    fwo fwoVar = pznVar.f27854a.f16780a;
                    if (fwoVar != null) {
                        f = fwoVar.f10268a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    fwo fwoVar2 = aloVar.f1078a.f16780a;
                    f = fwoVar2 != null ? fwoVar2.f10268a : toj0Var.f;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((azn) obj).ordinal();
                if (iOrdinal2 == 0) {
                    k1h0 k1h0Var = pznVar.f27854a.d;
                    if (k1h0Var != null) {
                        f = k1h0Var.f17523a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    k1h0 k1h0Var2 = aloVar.f1078a.d;
                    f = k1h0Var2 != null ? k1h0Var2.f17523a : toj0Var.g;
                }
                return Float.valueOf(f);
        }
    }
}
