package a;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class l44 {
    public static final Object r = new Object();
    public static ScheduledExecutorService s;
    public static int t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f19386a;
    public final k34 b;
    public final do20 c;
    public nhf0 d;
    public final o44 e;
    public final boolean f;
    public final int g;
    public final oif0 h;
    public final vg00 i = new vg00(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;

    public l44(AudioTrack audioTrack, k34 k34Var, do20 do20Var, l9o0 l9o0Var) {
        int iQ;
        this.f19386a = audioTrack;
        this.b = k34Var;
        this.c = do20Var;
        int i = k34Var.f17601a;
        boolean zI = vtt0.I(i);
        this.f = zI;
        if (zI) {
            iQ = vtt0.q(i) * Integer.bitCount(k34Var.c);
            this.g = iQ;
        } else {
            iQ = -1;
            this.g = -1;
        }
        this.e = new o44(new bbw0((Object) this, (byte) 7), l9o0Var, audioTrack, k34Var.f17601a, iQ, k34Var.f);
        if (do20Var != null) {
            this.d = new nhf0(audioTrack, do20Var);
        }
        this.h = c() ? new oif0(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:101:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x021a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0223  */
    /* JADX WARN: Code duplicated, block: B:65:0x0228  */
    /* JADX WARN: Code duplicated, block: B:69:0x0235  */
    /* JADX WARN: Code duplicated, block: B:71:0x0239  */
    /* JADX WARN: Code duplicated, block: B:73:0x023c  */
    /* JADX WARN: Code duplicated, block: B:75:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0243  */
    /* JADX WARN: Code duplicated, block: B:79:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x024b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0251  */
    /* JADX WARN: Code duplicated, block: B:83:0x0254  */
    /* JADX WARN: Code duplicated, block: B:84:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x025b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0264  */
    /* JADX WARN: Code duplicated, block: B:90:0x028f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0294  */
    /* JADX WARN: Code duplicated, block: B:93:0x029e  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b9  */
    public final long a() {
        l9o0 l9o0Var;
        AudioTrack audioTrack;
        long j;
        o44 o44Var;
        long jB;
        byte b;
        long j2;
        String str;
        long j3;
        boolean z;
        float f;
        long jB2;
        f44 f44Var;
        f44 f44Var2;
        int i;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        boolean z2;
        AudioTimestamp audioTimestamp2;
        f44 f44Var3;
        byte b2;
        byte b3;
        AudioTimestamp audioTimestamp3;
        long j4;
        long j5;
        long j6;
        f44 f44Var4;
        bbw0 bbw0Var;
        long j7;
        long jR;
        long j8;
        long j9;
        Method method;
        long jB3 = b();
        o44 o44Var2 = this.e;
        l9o0 l9o0Var2 = o44Var2.b;
        int i2 = o44Var2.e;
        g44 g44Var = o44Var2.h;
        AudioTrack audioTrack2 = o44Var2.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = o44Var2.c;
            l9o0Var2.getClass();
            j = 1000;
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - o44Var2.l >= 30000) {
                long jR2 = vtt0.R(i2, o44Var2.a());
                if (jR2 == 0) {
                    jB3 = jB3;
                    o44Var2 = o44Var2;
                    l9o0Var = l9o0Var2;
                    i2 = i2;
                    audioTrack = audioTrack2;
                } else {
                    jArr[o44Var2.s] = vtt0.A(o44Var2.i, jR2) - jNanoTime;
                    o44Var2.s = (o44Var2.s + 1) % 10;
                    int i3 = o44Var2.t;
                    if (i3 < 10) {
                        o44Var2.t = i3 + 1;
                    }
                    o44Var2.l = jNanoTime;
                    o44Var2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = o44Var2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        o44Var2.k = (jArr[i4] / ((long) i5)) + o44Var2.k;
                        i4++;
                    }
                    j2 = o44Var2.n;
                    if (o44Var2.g || (method = o44Var2.m) == null) {
                        str = "AudioTrackAudioOutput";
                        j3 = 500000;
                    } else {
                        j3 = 500000;
                        if (jNanoTime - o44Var2.o >= 500000) {
                            try {
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str2 = vtt0.f38024a;
                                long jIntValue = (((long) num.intValue()) * 1000) - o44Var2.f;
                                o44Var2.n = jIntValue;
                                str = "AudioTrackAudioOutput";
                                try {
                                    long jMax = Math.max(jIntValue, 0L);
                                    o44Var2.n = jMax;
                                    if (jMax > 10000000) {
                                        f1t0.g0(str, "Ignoring impossibly large audio latency: " + jMax);
                                        o44Var2.n = 0L;
                                    }
                                } catch (Exception unused) {
                                    o44Var2.m = null;
                                }
                            } catch (Exception unused2) {
                                str = "AudioTrackAudioOutput";
                            }
                            o44Var2.o = jNanoTime;
                        } else {
                            str = "AudioTrackAudioOutput";
                        }
                    }
                    if (j2 != o44Var2.n) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f = o44Var2.i;
                    jB2 = o44Var2.b(jNanoTime);
                    f44Var = g44Var.f10645a;
                    f44Var2 = g44Var.f10645a;
                    l9o0Var = l9o0Var2;
                    i = g44Var.b;
                    audioTrack = audioTrack2;
                    if (!z || jNanoTime - g44Var.g >= g44Var.f) {
                        g44Var.g = jNanoTime;
                        AudioTrack audioTrack3 = f44Var.f8894a;
                        audioTimestamp = f44Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j8 = audioTimestamp.framePosition;
                            j9 = f44Var.d;
                            if (j9 > j8) {
                                z2 = timestamp;
                                if (f44Var.f) {
                                    f44Var.g += j9;
                                    f44Var.f = false;
                                } else {
                                    f44Var.c++;
                                }
                            } else {
                                z2 = timestamp;
                            }
                            f44Var.d = j8;
                            f44Var.e = j8 + f44Var.g + (f44Var.c << 32);
                        } else {
                            z2 = timestamp;
                        }
                        if (z2) {
                            bbw0Var = g44Var.c;
                            j7 = audioTimestamp.nanoTime / 1000;
                            audioTimestamp2 = audioTimestamp;
                            jR = vtt0.R(i, f44Var2.e) + vtt0.y(f, jNanoTime - (f44Var2.b.nanoTime / 1000));
                            if (Math.abs(j7 - jNanoTime) > 5000000) {
                                long j10 = f44Var.e;
                                bbw0Var.getClass();
                                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(j10);
                                sb.append(", ");
                                sb.append(j7);
                                kng0.A(sb, ", ", jNanoTime, ", ");
                                sb.append(jB2);
                                sb.append(", ");
                                sb.append(((l44) bbw0Var.b).b());
                                String string = sb.toString();
                                HashSet hashSet = hn30.f13332a;
                                f1t0.g0(str, string);
                                g44Var.a(4);
                            } else {
                                i2 = i2;
                                if (Math.abs(jR - jB2) > 5000000) {
                                    long j11 = f44Var.e;
                                    bbw0Var.getClass();
                                    o44Var2 = o44Var2;
                                    f44Var3 = f44Var2;
                                    StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                    sb2.append(j11);
                                    sb2.append(", ");
                                    sb2.append(j7);
                                    kng0.A(sb2, ", ", jNanoTime, ", ");
                                    sb2.append(jB2);
                                    sb2.append(", ");
                                    sb2.append(((l44) bbw0Var.b).b());
                                    String string2 = sb2.toString();
                                    HashSet hashSet2 = hn30.f13332a;
                                    f1t0.g0(str, string2);
                                    b2 = 4;
                                    g44Var.a(4);
                                } else {
                                    o44Var2 = o44Var2;
                                    f44Var3 = f44Var2;
                                    b2 = 4;
                                    if (g44Var.d == 4) {
                                        g44Var.a(0);
                                    }
                                }
                            }
                            b3 = g44Var.d;
                            if (b3 != 0) {
                                audioTimestamp3 = audioTimestamp2;
                                if (z2) {
                                    j4 = audioTimestamp3.nanoTime;
                                    if (j4 / 1000 >= g44Var.e) {
                                        g44Var.h = f44Var.e;
                                        g44Var.i = j4 / 1000;
                                        g44Var.a(1);
                                    }
                                } else if (jNanoTime - g44Var.e > j3) {
                                    g44Var.a(3);
                                }
                            } else if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 != 3) {
                                        if (b3 != b2) {
                                            v4i0.e();
                                            return 0L;
                                        }
                                    } else if (z2) {
                                        g44Var.a(0);
                                    }
                                } else if (!z2) {
                                    g44Var.a(0);
                                }
                            } else if (z2) {
                                j5 = f44Var.e;
                                j6 = g44Var.h;
                                if (j5 <= j6) {
                                    f44Var4 = f44Var3;
                                    if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                        g44Var.a(2);
                                    } else if (jNanoTime - g44Var.e > 2000000) {
                                        g44Var.a(3);
                                    } else {
                                        g44Var.h = f44Var.e;
                                        g44Var.i = audioTimestamp2.nanoTime / 1000;
                                    }
                                } else if (jNanoTime - g44Var.e > 2000000) {
                                    g44Var.a(3);
                                } else {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else {
                                g44Var.a(0);
                            }
                        } else {
                            audioTimestamp2 = audioTimestamp;
                        }
                        f44Var3 = f44Var2;
                        b2 = 4;
                        b3 = g44Var.d;
                        if (b3 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= g44Var.e) {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = j4 / 1000;
                                    g44Var.a(1);
                                }
                            } else if (jNanoTime - g44Var.e > j3) {
                                g44Var.a(3);
                            }
                        } else if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != b2) {
                                        v4i0.e();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    g44Var.a(0);
                                }
                            } else if (!z2) {
                                g44Var.a(0);
                            }
                        } else if (z2) {
                            j5 = f44Var.e;
                            j6 = g44Var.h;
                            if (j5 <= j6) {
                                f44Var4 = f44Var3;
                                if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                    g44Var.a(2);
                                } else if (jNanoTime - g44Var.e > 2000000) {
                                    g44Var.a(3);
                                } else {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - g44Var.e > 2000000) {
                                g44Var.a(3);
                            } else {
                                g44Var.h = f44Var.e;
                                g44Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            g44Var.a(0);
                        }
                    } else {
                        jB3 = jB3;
                        o44Var2 = o44Var2;
                        i2 = i2;
                    }
                }
            } else {
                j2 = o44Var2.n;
                if (o44Var2.g) {
                    str = "AudioTrackAudioOutput";
                    j3 = 500000;
                } else {
                    str = "AudioTrackAudioOutput";
                    j3 = 500000;
                }
                if (j2 != o44Var2.n) {
                    z = true;
                } else {
                    z = false;
                }
                f = o44Var2.i;
                jB2 = o44Var2.b(jNanoTime);
                f44Var = g44Var.f10645a;
                f44Var2 = g44Var.f10645a;
                l9o0Var = l9o0Var2;
                i = g44Var.b;
                audioTrack = audioTrack2;
                if (z) {
                    g44Var.g = jNanoTime;
                    AudioTrack audioTrack4 = f44Var.f8894a;
                    audioTimestamp = f44Var.b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j8 = audioTimestamp.framePosition;
                        j9 = f44Var.d;
                        if (j9 > j8) {
                            z2 = timestamp;
                            if (f44Var.f) {
                                f44Var.g += j9;
                                f44Var.f = false;
                            } else {
                                f44Var.c++;
                            }
                        } else {
                            z2 = timestamp;
                        }
                        f44Var.d = j8;
                        f44Var.e = j8 + f44Var.g + (f44Var.c << 32);
                    } else {
                        z2 = timestamp;
                    }
                    if (z2) {
                        bbw0Var = g44Var.c;
                        j7 = audioTimestamp.nanoTime / 1000;
                        audioTimestamp2 = audioTimestamp;
                        jR = vtt0.R(i, f44Var2.e) + vtt0.y(f, jNanoTime - (f44Var2.b.nanoTime / 1000));
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            long j12 = f44Var.e;
                            bbw0Var.getClass();
                            StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb3.append(j12);
                            sb3.append(", ");
                            sb3.append(j7);
                            kng0.A(sb3, ", ", jNanoTime, ", ");
                            sb3.append(jB2);
                            sb3.append(", ");
                            sb3.append(((l44) bbw0Var.b).b());
                            String string3 = sb3.toString();
                            HashSet hashSet3 = hn30.f13332a;
                            f1t0.g0(str, string3);
                            g44Var.a(4);
                        } else {
                            i2 = i2;
                            if (Math.abs(jR - jB2) > 5000000) {
                                long j13 = f44Var.e;
                                bbw0Var.getClass();
                                o44Var2 = o44Var2;
                                f44Var3 = f44Var2;
                                StringBuilder sb4 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb4.append(j13);
                                sb4.append(", ");
                                sb4.append(j7);
                                kng0.A(sb4, ", ", jNanoTime, ", ");
                                sb4.append(jB2);
                                sb4.append(", ");
                                sb4.append(((l44) bbw0Var.b).b());
                                String string4 = sb4.toString();
                                HashSet hashSet4 = hn30.f13332a;
                                f1t0.g0(str, string4);
                                b2 = 4;
                                g44Var.a(4);
                            } else {
                                o44Var2 = o44Var2;
                                f44Var3 = f44Var2;
                                b2 = 4;
                                if (g44Var.d == 4) {
                                    g44Var.a(0);
                                }
                            }
                        }
                        b3 = g44Var.d;
                        if (b3 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= g44Var.e) {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = j4 / 1000;
                                    g44Var.a(1);
                                }
                            } else if (jNanoTime - g44Var.e > j3) {
                                g44Var.a(3);
                            }
                        } else if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != b2) {
                                        v4i0.e();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    g44Var.a(0);
                                }
                            } else if (!z2) {
                                g44Var.a(0);
                            }
                        } else if (z2) {
                            j5 = f44Var.e;
                            j6 = g44Var.h;
                            if (j5 <= j6) {
                                f44Var4 = f44Var3;
                                if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                    g44Var.a(2);
                                } else if (jNanoTime - g44Var.e > 2000000) {
                                    g44Var.a(3);
                                } else {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - g44Var.e > 2000000) {
                                g44Var.a(3);
                            } else {
                                g44Var.h = f44Var.e;
                                g44Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            g44Var.a(0);
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                    }
                    f44Var3 = f44Var2;
                    b2 = 4;
                    b3 = g44Var.d;
                    if (b3 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        if (z2) {
                            j4 = audioTimestamp3.nanoTime;
                            if (j4 / 1000 >= g44Var.e) {
                                g44Var.h = f44Var.e;
                                g44Var.i = j4 / 1000;
                                g44Var.a(1);
                            }
                        } else if (jNanoTime - g44Var.e > j3) {
                            g44Var.a(3);
                        }
                    } else if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                if (b3 != b2) {
                                    v4i0.e();
                                    return 0L;
                                }
                            } else if (z2) {
                                g44Var.a(0);
                            }
                        } else if (!z2) {
                            g44Var.a(0);
                        }
                    } else if (z2) {
                        j5 = f44Var.e;
                        j6 = g44Var.h;
                        if (j5 <= j6) {
                            f44Var4 = f44Var3;
                            if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                g44Var.a(2);
                            } else if (jNanoTime - g44Var.e > 2000000) {
                                g44Var.a(3);
                            } else {
                                g44Var.h = f44Var.e;
                                g44Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (jNanoTime - g44Var.e > 2000000) {
                            g44Var.a(3);
                        } else {
                            g44Var.h = f44Var.e;
                            g44Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        g44Var.a(0);
                    }
                } else {
                    g44Var.g = jNanoTime;
                    AudioTrack audioTrack5 = f44Var.f8894a;
                    audioTimestamp = f44Var.b;
                    timestamp = audioTrack5.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j8 = audioTimestamp.framePosition;
                        j9 = f44Var.d;
                        if (j9 > j8) {
                            z2 = timestamp;
                            if (f44Var.f) {
                                f44Var.g += j9;
                                f44Var.f = false;
                            } else {
                                f44Var.c++;
                            }
                        } else {
                            z2 = timestamp;
                        }
                        f44Var.d = j8;
                        f44Var.e = j8 + f44Var.g + (f44Var.c << 32);
                    } else {
                        z2 = timestamp;
                    }
                    if (z2) {
                        bbw0Var = g44Var.c;
                        j7 = audioTimestamp.nanoTime / 1000;
                        audioTimestamp2 = audioTimestamp;
                        jR = vtt0.R(i, f44Var2.e) + vtt0.y(f, jNanoTime - (f44Var2.b.nanoTime / 1000));
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            long j14 = f44Var.e;
                            bbw0Var.getClass();
                            StringBuilder sb5 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb5.append(j14);
                            sb5.append(", ");
                            sb5.append(j7);
                            kng0.A(sb5, ", ", jNanoTime, ", ");
                            sb5.append(jB2);
                            sb5.append(", ");
                            sb5.append(((l44) bbw0Var.b).b());
                            String string5 = sb5.toString();
                            HashSet hashSet5 = hn30.f13332a;
                            f1t0.g0(str, string5);
                            g44Var.a(4);
                        } else {
                            i2 = i2;
                            if (Math.abs(jR - jB2) > 5000000) {
                                long j15 = f44Var.e;
                                bbw0Var.getClass();
                                o44Var2 = o44Var2;
                                f44Var3 = f44Var2;
                                StringBuilder sb6 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb6.append(j15);
                                sb6.append(", ");
                                sb6.append(j7);
                                kng0.A(sb6, ", ", jNanoTime, ", ");
                                sb6.append(jB2);
                                sb6.append(", ");
                                sb6.append(((l44) bbw0Var.b).b());
                                String string6 = sb6.toString();
                                HashSet hashSet6 = hn30.f13332a;
                                f1t0.g0(str, string6);
                                b2 = 4;
                                g44Var.a(4);
                            } else {
                                o44Var2 = o44Var2;
                                f44Var3 = f44Var2;
                                b2 = 4;
                                if (g44Var.d == 4) {
                                    g44Var.a(0);
                                }
                            }
                        }
                        b3 = g44Var.d;
                        if (b3 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= g44Var.e) {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = j4 / 1000;
                                    g44Var.a(1);
                                }
                            } else if (jNanoTime - g44Var.e > j3) {
                                g44Var.a(3);
                            }
                        } else if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != b2) {
                                        v4i0.e();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    g44Var.a(0);
                                }
                            } else if (!z2) {
                                g44Var.a(0);
                            }
                        } else if (z2) {
                            j5 = f44Var.e;
                            j6 = g44Var.h;
                            if (j5 <= j6) {
                                f44Var4 = f44Var3;
                                if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                    g44Var.a(2);
                                } else if (jNanoTime - g44Var.e > 2000000) {
                                    g44Var.a(3);
                                } else {
                                    g44Var.h = f44Var.e;
                                    g44Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - g44Var.e > 2000000) {
                                g44Var.a(3);
                            } else {
                                g44Var.h = f44Var.e;
                                g44Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            g44Var.a(0);
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                    }
                    f44Var3 = f44Var2;
                    b2 = 4;
                    b3 = g44Var.d;
                    if (b3 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        if (z2) {
                            j4 = audioTimestamp3.nanoTime;
                            if (j4 / 1000 >= g44Var.e) {
                                g44Var.h = f44Var.e;
                                g44Var.i = j4 / 1000;
                                g44Var.a(1);
                            }
                        } else if (jNanoTime - g44Var.e > j3) {
                            g44Var.a(3);
                        }
                    } else if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                if (b3 != b2) {
                                    v4i0.e();
                                    return 0L;
                                }
                            } else if (z2) {
                                g44Var.a(0);
                            }
                        } else if (!z2) {
                            g44Var.a(0);
                        }
                    } else if (z2) {
                        j5 = f44Var.e;
                        j6 = g44Var.h;
                        if (j5 <= j6) {
                            f44Var4 = f44Var3;
                            if (Math.abs((vtt0.y(f, jNanoTime - (f44Var4.b.nanoTime / 1000)) + vtt0.R(i, f44Var4.e)) - (vtt0.y(f, jNanoTime - g44Var.i) + vtt0.R(i, j6))) < 1000) {
                                g44Var.a(2);
                            } else if (jNanoTime - g44Var.e > 2000000) {
                                g44Var.a(3);
                            } else {
                                g44Var.h = f44Var.e;
                                g44Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (jNanoTime - g44Var.e > 2000000) {
                            g44Var.a(3);
                        } else {
                            g44Var.h = f44Var.e;
                            g44Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        g44Var.a(0);
                    }
                }
            }
        } else {
            jB3 = jB3;
            o44Var2 = o44Var2;
            l9o0Var = l9o0Var2;
            i2 = i2;
            audioTrack = audioTrack2;
            j = 1000;
        }
        l9o0Var.getClass();
        long jNanoTime2 = System.nanoTime() / j;
        boolean z3 = g44Var.d == 2;
        if (z3) {
            o44Var = o44Var2;
            float f2 = o44Var.i;
            f44 f44Var5 = g44Var.f10645a;
            jB = vtt0.y(f2, jNanoTime2 - (f44Var5.b.nanoTime / j)) + vtt0.R(g44Var.b, f44Var5.e);
        } else {
            o44Var = o44Var2;
            jB = o44Var.b(jNanoTime2);
        }
        long j16 = jB;
        long jR3 = vtt0.R(i2, jB3);
        if (j16 >= jR3) {
            o44Var.e();
            g44Var.a(0);
            return jR3;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z3 || ((b = g44Var.d) != 0 && b != 1)) {
                o44Var.d(j16);
            }
            long j17 = o44Var.z;
            if (j17 != -9223372036854775807L) {
                long j18 = j16 - o44Var.y;
                long jY = vtt0.y(o44Var.i, jNanoTime2 - j17);
                long j19 = o44Var.y + jY;
                long jAbs = Math.abs(j19 - j16);
                if (j18 != 0 && jAbs < 1000000) {
                    long j20 = (jY * 10) / 100;
                    j16 = vtt0.j(j16, j19 - j20, j19 + j20);
                }
            }
            o44Var.z = jNanoTime2;
            o44Var.y = j16;
        } else if (playState == 1) {
            o44Var.d(j16);
        }
        return j16;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = vtt0.f38024a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.f19386a.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    public final boolean d(ByteBuffer byteBuffer, int i, long j) throws e34 {
        int iWrite;
        boolean z;
        do20 do20Var;
        n44 n44Var;
        krs0 krs0Var;
        long j2 = j;
        k34 k34Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.p == 0) {
            this.p = osj.i(k34Var.f17601a, byteBuffer);
        }
        vg00 vg00Var = this.i;
        vg00Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = vg00Var.f37360a;
        byte b = 16;
        AudioTrack audioTrack = this.f19386a;
        if (threadCurrentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.q;
            this.q = underrunCount;
            if (z3) {
                vg00Var.e(-1, new jf4(b));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (k34Var.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.m;
            } else {
                this.m = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
            } else {
                long j3 = j2;
                if (this.n == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.n = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, iRemaining2);
                    this.n.putLong(8, j3 * 1000);
                    this.n.position(0);
                    this.o = iRemaining2;
                }
                int iRemaining3 = this.n.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.o = 0;
                    } else {
                        this.o -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.n, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.o = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.o = 0;
                        } else {
                            this.o -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.k += (long) iWrite;
                return z;
            }
            if (z) {
                this.l = (((long) this.p) * ((long) i)) + this.l;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (do20Var = this.c) != null && (krs0Var = (n44Var = (n44) do20Var.f6397a).h) != null) {
            q24 q24Var = q24.f;
            n44Var.g = q24Var;
            krs0Var.d(q24Var);
        }
        throw new e34(iWrite, z);
    }
}
