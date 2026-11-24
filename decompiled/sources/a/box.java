package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class box extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2953a;

    public static box a() {
        return new box("Protocol message had invalid UTF-8.");
    }

    public static xnx b() {
        return new xnx("Protocol message tag had invalid wire type.");
    }

    public static box d() {
        return new box("CodedInputStream encountered a malformed varint.");
    }

    public static box e() {
        return new box("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static box f() {
        return new box("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
