package a;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class pef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f26848a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final ehf0 j;

    public pef() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new ehf0(cryptoInfo);
    }
}
