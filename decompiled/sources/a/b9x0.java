package a;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f2232a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = y8x0.f42217a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
