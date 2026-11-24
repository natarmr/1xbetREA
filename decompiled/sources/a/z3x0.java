package a;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class z3x0 extends EncodedKeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3x0(byte[] bArr, byte b) {
        super(bArr);
        this.f43740a = b;
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        switch (this.f43740a) {
        }
        return "raw";
    }
}
