package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class bqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cog f3021a;

    public bqc(cog cogVar, byte b) {
        cogVar.getClass();
        switch (b) {
            case 1:
                this.f3021a = cogVar;
                break;
            case 2:
                this.f3021a = cogVar;
                break;
            default:
                this.f3021a = cogVar;
                break;
        }
    }

    public Unit a() {
        p7m0 p7m0Var = this.f3021a.f4698a.c;
        p7m0Var.o(null, Boolean.valueOf(!((Boolean) p7m0Var.getValue()).booleanValue()));
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }
}
