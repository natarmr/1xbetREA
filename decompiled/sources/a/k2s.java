package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k2s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17590a;
    public final /* synthetic */ o2s b;

    public /* synthetic */ k2s(o2s o2sVar, byte b) {
        this.f17590a = b;
        this.b = o2sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17590a;
        o2s o2sVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(Math.round(o2sVar.j));
            case 1:
                return Integer.valueOf(Math.round(o2sVar.i.l()));
            case 2:
                return Float.valueOf(((Number) o2sVar.c.d()).floatValue() == 0.0f ? l1e0.c(1.0f - (((Number) o2sVar.d.d()).floatValue() * 2.0f), 0.0f, 1.0f) : l1e0.c(1.0f - (((Number) o2sVar.c.d()).floatValue() * 2.0f), 0.0f, 1.0f));
            case 3:
                return Float.valueOf(l1e0.c(1.0f - (((Number) o2sVar.c.d()).floatValue() * 2.0f), 0.0f, 1.0f));
            case 4:
                return Float.valueOf((float) Math.max(0.0d, (((Number) o2sVar.c.d()).doubleValue() - 0.5d) / 0.5d));
            case 5:
                return Float.valueOf(((Number) o2sVar.c.d()).floatValue() == 0.0f ? l1e0.c(1.0f - ((Number) o2sVar.d.d()).floatValue(), 0.0f, 1.0f) : 1.0f);
            case 6:
                return new Pair(o2sVar.g.getValue(), Float.valueOf(o2sVar.e.l()));
            default:
                return Float.valueOf(o2sVar.i.l() - o2sVar.j);
        }
    }
}
