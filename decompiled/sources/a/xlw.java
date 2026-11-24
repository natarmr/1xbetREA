package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xlw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f41096a;
    public final /* synthetic */ byte b;

    public xlw(Function2 function2, byte b) {
        this.b = b;
        this.f41096a = function2;
    }

    public final float a(float f, j6z j6zVar, j6z j6zVar2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (j6zVar2.I(j6zVar, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (j6zVar.g() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (j6zVar2.I(j6zVar, (((long) Float.floatToRawIntBits(((int) (j6zVar.g() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
