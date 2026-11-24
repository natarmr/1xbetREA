package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class qkw0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28907a;

    public static skw0 a() {
        return new skw0("Protocol message tag had invalid wire type.");
    }

    public static qkw0 b() {
        return new qkw0("Protocol message contained an invalid tag (zero).");
    }

    public static qkw0 d() {
        return new qkw0("Protocol message had invalid UTF-8.");
    }

    public static qkw0 e() {
        return new qkw0("CodedInputStream encountered a malformed varint.");
    }

    public static qkw0 f() {
        return new qkw0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static qkw0 g() {
        return new qkw0("Failed to parse the message.");
    }

    public static qkw0 h() {
        return new qkw0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
