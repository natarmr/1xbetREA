package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pe4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26832a;
    public final /* synthetic */ ze4 b;

    public /* synthetic */ pe4(ze4 ze4Var, byte b) {
        this.f26832a = b;
        this.b = ze4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26832a;
        de4 de4Var = de4.f5929a;
        ze4 ze4Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = ze4.g2;
                ze4Var.K0().x(ae4.f709a);
                return Unit.f46060a;
            case 1:
                qek0 qek0Var2 = ze4.g2;
                ze4Var.K0().x(ld4.f19831a);
                return Unit.f46060a;
            case 2:
                qek0 qek0Var3 = ze4.g2;
                ze4Var.K0().x(rd4.f30272a);
                return Unit.f46060a;
            case 3:
                qek0 qek0Var4 = ze4.g2;
                ze4Var.K0().x(qd4.f28517a);
                return Unit.f46060a;
            case 4:
                y8i y8iVar = ze4Var.Y1;
                if (y8iVar != null) {
                    return new q0h0(y8iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                qek0 qek0Var5 = ze4.g2;
                ze4Var.K0().x(vd4.f37214a);
                return Unit.f46060a;
            case 6:
                qek0 qek0Var6 = ze4.g2;
                ze4Var.K0().x(nd4.f23323a);
                return Unit.f46060a;
            case 7:
                qek0 qek0Var7 = ze4.g2;
                ze4Var.K0().x(ke4.f18135a);
                return Unit.f46060a;
            case 8:
                qek0 qek0Var8 = ze4.g2;
                ze4Var.K0().x(xd4.f40678a);
                return Unit.f46060a;
            case 9:
                qek0 qek0Var9 = ze4.g2;
                ze4Var.K0().x(zd4.f44194a);
                return Unit.f46060a;
            case 10:
                qek0 qek0Var10 = ze4.g2;
                ze4Var.K0().x(de4Var);
                return Unit.f46060a;
            default:
                qek0 qek0Var11 = ze4.g2;
                ze4Var.K0().x(de4Var);
                return Unit.f46060a;
        }
    }
}
