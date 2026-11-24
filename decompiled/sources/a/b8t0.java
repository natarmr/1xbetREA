package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class b8t0 implements jiy {
    public static final b8t0 b = new b8t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0o f2174a = new g0o("kotlin.Unit", Unit.f46060a);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        this.f2174a.deserialize(rkjVar);
        return Unit.f46060a;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.f2174a.getDescriptor();
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.f2174a.serialize(bwnVar, unit);
    }
}
