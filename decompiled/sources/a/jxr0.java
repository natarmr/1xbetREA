package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jxr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17323a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ jxr0(pz40 pz40Var, byte b) {
        this.f17323a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17323a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                qkx qkxVar = (qkx) pz40Var.getValue();
                long j = qkxVar.f28908a;
                return qkxVar;
            case 1:
                qkx qkxVar2 = (qkx) pz40Var.getValue();
                long j2 = qkxVar2.f28908a;
                return qkxVar2;
            case 2:
                return (String) pz40Var.getValue();
            case 3:
                return ((p6u0) pz40Var.getValue()).c;
            case 4:
                return ((p6u0) pz40Var.getValue()).d;
            case 5:
                ((p6u0) pz40Var.getValue()).getClass();
                return Integer.valueOf(R.drawable.ic_glyph_map_pin);
            case 6:
                return ((xpu0) pz40Var.getValue()).b.f32602a;
            case 7:
                return ((xpu0) pz40Var.getValue()).b.b;
            case 8:
                return Boolean.valueOf(((xpu0) pz40Var.getValue()).b.c);
            case 9:
                return ((hcv0) pz40Var.getValue()).c;
            case 10:
                return ((hcv0) pz40Var.getValue()).b;
            case 11:
                return ((wbv0) pz40Var.getValue()).c;
            case 12:
                return ((wbv0) pz40Var.getValue()).d;
            case 13:
                return ((icv0) pz40Var.getValue()).d;
            default:
                return ((icv0) pz40Var.getValue()).e;
        }
    }
}
