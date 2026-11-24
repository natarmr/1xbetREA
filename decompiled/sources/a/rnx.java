package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rnx implements vj30, cnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cnx f30809a;
    public final k6z b;

    public rnx(cnx cnxVar, k6z k6zVar) {
        this.f30809a = cnxVar;
        this.b = k6zVar;
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.f30809a.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.f30809a.B0(j);
    }

    @Override // a.vj30
    public final uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            xcx.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new qnx(i, i2, map, function1);
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.f30809a.G0(j);
    }

    @Override // a.cnx
    public final boolean M() {
        return this.f30809a.M();
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.f30809a.T(f);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.f30809a.X(j);
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f30809a.getDensity();
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.b;
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.f30809a.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.f30809a.p(j);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.f30809a.r0(i);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.f30809a.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return this.f30809a.s0(f);
    }

    @Override // a.w6k
    public final float v0() {
        return this.f30809a.v0();
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.f30809a.w0(f);
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.f30809a.z(i);
    }
}
