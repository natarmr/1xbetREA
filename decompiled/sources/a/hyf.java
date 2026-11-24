package a;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f13857a = new Regex("Resource ID #0x[0-9a-fA-F]+", nse0.IGNORE_CASE);

    public static String a(String str) {
        return str.length() <= 1000 ? str : str.substring(0, 1000);
    }
}
