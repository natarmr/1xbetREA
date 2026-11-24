package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ynx extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42961a;

    public static ynx a() {
        return new ynx("Protocol message contained an invalid tag (zero).");
    }

    public static ynx b() {
        return new ynx("Protocol message had invalid UTF-8.");
    }

    public static vnx d() {
        return new vnx("Protocol message tag had invalid wire type.");
    }

    public static ynx e() {
        return new ynx("CodedInputStream encountered a malformed varint.");
    }

    public static ynx f() {
        return new ynx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ynx g() {
        return new ynx("Failed to parse the message.");
    }

    public static ynx h() {
        return new ynx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
