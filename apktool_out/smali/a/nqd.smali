.class public final La/nqd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qgk0;
.implements La/rmv;
.implements La/phi0;
.implements La/v8x0;


# static fields
.field public static final c:La/nqd;

.field public static final d:La/nqd;

.field public static final e:La/nqd;


# instance fields
.field public final synthetic a:B

.field public b:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/nqd;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, La/nqd;-><init>(BZ)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/nqd;->c:La/nqd;

    .line 9
    .line 10
    new-instance v0, La/nqd;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, La/nqd;-><init>(BZ)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/nqd;->d:La/nqd;

    .line 17
    .line 18
    new-instance v0, La/nqd;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v2, v1}, La/nqd;-><init>(BZ)V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/nqd;->e:La/nqd;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x7

    iput-byte v0, p0, La/nqd;->a:B

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    const-class v0, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 192
    sget-object v1, La/khk;->a:La/kpd0;

    invoke-virtual {v1, v0}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 193
    :goto_0
    iput-boolean v0, p0, La/nqd;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 198
    iput-byte p1, p0, La/nqd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 186
    iput-byte p1, p0, La/nqd;->a:B

    iput-boolean p2, p0, La/nqd;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/dcy;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/nqd;->a:B

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iget-object p1, p1, La/dcy;->h:La/olc;

    .line 189
    sget-object v0, La/olc;->a:La/olc;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, La/nqd;->b:Z

    return-void
.end method

.method public constructor <init>(La/ke60;La/je60;)V
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    iput-byte v0, p0, La/nqd;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, La/je60;->a:I

    .line 8
    .line 9
    iget-object p2, p2, La/je60;->b:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    move v0, v4

    .line 23
    :goto_1
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    new-array v1, v0, [B

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    new-instance p2, La/q8b;

    .line 45
    .line 46
    invoke-direct {p2, v1, v0}, La/q8b;-><init>([BI)V

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p1, La/ke60;->a:Z

    .line 50
    .line 51
    if-nez v0, :cond_10

    .line 52
    .line 53
    invoke-virtual {p2}, La/q8b;->f()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iput-boolean v2, p0, La/nqd;->b:Z

    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_2
    const/4 v0, 0x2

    .line 64
    invoke-virtual {p2, v0}, La/q8b;->g(I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p2}, La/q8b;->f()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    iget-boolean v6, p1, La/ke60;->b:Z

    .line 73
    .line 74
    if-nez v6, :cond_f

    .line 75
    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    iput-boolean v4, p0, La/nqd;->b:Z

    .line 79
    .line 80
    goto :goto_7

    .line 81
    :cond_3
    if-eq v1, v3, :cond_5

    .line 82
    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {p2}, La/q8b;->f()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    move v5, v4

    .line 92
    :goto_3
    invoke-virtual {p2}, La/q8b;->n()V

    .line 93
    .line 94
    .line 95
    iget-boolean v6, p1, La/ke60;->d:Z

    .line 96
    .line 97
    if-eqz v6, :cond_e

    .line 98
    .line 99
    invoke-virtual {p2}, La/q8b;->f()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    iget-boolean v6, p1, La/ke60;->e:Z

    .line 106
    .line 107
    if-eqz v6, :cond_6

    .line 108
    .line 109
    invoke-virtual {p2}, La/q8b;->n()V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    new-instance p0, La/ie60;

    .line 114
    .line 115
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :cond_7
    :goto_4
    iget-boolean v6, p1, La/ke60;->c:Z

    .line 120
    .line 121
    if-nez v6, :cond_d

    .line 122
    .line 123
    if-eq v1, v3, :cond_8

    .line 124
    .line 125
    invoke-virtual {p2}, La/q8b;->n()V

    .line 126
    .line 127
    .line 128
    :cond_8
    iget p1, p1, La/ke60;->f:I

    .line 129
    .line 130
    invoke-virtual {p2, p1}, La/q8b;->o(I)V

    .line 131
    .line 132
    .line 133
    if-eq v1, v0, :cond_9

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    if-nez v5, :cond_9

    .line 138
    .line 139
    invoke-virtual {p2, v3}, La/q8b;->o(I)V

    .line 140
    .line 141
    .line 142
    :cond_9
    if-eq v1, v3, :cond_b

    .line 143
    .line 144
    if-nez v1, :cond_a

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_a
    const/16 p1, 0x8

    .line 148
    .line 149
    invoke-virtual {p2, p1}, La/q8b;->g(I)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    goto :goto_6

    .line 154
    :cond_b
    :goto_5
    const/16 p1, 0xff

    .line 155
    .line 156
    :goto_6
    if-eqz p1, :cond_c

    .line 157
    .line 158
    move v2, v4

    .line 159
    :cond_c
    iput-boolean v2, p0, La/nqd;->b:Z

    .line 160
    .line 161
    :goto_7
    return-void

    .line 162
    :cond_d
    new-instance p0, La/ie60;

    .line 163
    .line 164
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :cond_e
    new-instance p0, La/ie60;

    .line 169
    .line 170
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_f
    new-instance p0, La/ie60;

    .line 175
    .line 176
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_10
    new-instance p0, La/ie60;

    .line 181
    .line 182
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 183
    .line 184
    .line 185
    throw p0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;La/l9o0;)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/nqd;->a:B

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    new-instance p0, La/bzs0;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, La/bzs0;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x0

    .line 196
    invoke-virtual {p3, p2, p0}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 197
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p3, p1, p0}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    return-void
.end method


# virtual methods
.method public B(La/sgy;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public G(La/sgy;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public K(La/sgy;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public bridge synthetic b(La/h0q0;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, La/cem0;->y(La/h0q0;)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 6
    .line 7
    const/16 v0, 0x1000

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    instance-of p0, p1, La/e9x0;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    move-object p0, p1

    .line 16
    check-cast p0, La/e9x0;

    .line 17
    .line 18
    invoke-interface {p0}, La/e9x0;->zza()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    cmp-long p0, v1, v3

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0x200

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-wide/16 v3, 0x1000

    .line 36
    .line 37
    cmp-long p0, v1, v3

    .line 38
    .line 39
    if-gez p0, :cond_1

    .line 40
    .line 41
    long-to-int v0, v1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    :goto_0
    invoke-static {p1, v0}, La/tdw0;->h(Ljava/io/InputStream;I)La/tdw0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-static {p0, v0}, La/q3x0;->a(La/tdw0;Z)La/q3x0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {p1, v0}, La/tdw0;->h(Ljava/io/InputStream;I)La/tdw0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {p0, v0}, La/q3x0;->a(La/tdw0;Z)La/q3x0;

    .line 61
    .line 62
    .line 63
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :goto_1
    const/4 v0, 0x0

    .line 65
    invoke-static {p1, v0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    :catchall_1
    move-exception v0

    .line 71
    invoke-static {p1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public c(La/f7k0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public d()La/bjk;
    .locals 3

    .line 1
    new-instance v0, La/bjk;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {v0, v2, v1, v1, p0}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public e(Ljava/io/File;Ljava/io/BufferedInputStream;[B)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/nqd;->a:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/16 v2, 0x2000

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/io/FileOutputStream;

    .line 12
    .line 13
    invoke-direct {v0, p1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-array p1, v2, [B

    .line 17
    .line 18
    move v2, v4

    .line 19
    :goto_0
    if-eq v2, v1, :cond_2

    .line 20
    .line 21
    iget-boolean v3, p0, La/nqd;->b:Z

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iput-boolean v4, p0, La/nqd;->b:Z

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/io/InputStream;->read([B)I

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, La/qoe;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, p1, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/io/InputStream;->read([B)I

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    invoke-static {v0, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :pswitch_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 64
    .line 65
    invoke-direct {v0, p1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 66
    .line 67
    .line 68
    :try_start_2
    new-array p1, v2, [B

    .line 69
    .line 70
    move v2, v4

    .line 71
    :goto_2
    if-eq v2, v1, :cond_5

    .line 72
    .line 73
    iget-boolean v3, p0, La/nqd;->b:Z

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    iput-boolean v4, p0, La/nqd;->b:Z

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Ljava/io/InputStream;->read([B)I

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    new-instance p0, La/qoe;

    .line 90
    .line 91
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :catchall_2
    move-exception p0

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {v0, p1, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, p1}, Ljava/io/InputStream;->read([B)I

    .line 101
    .line 102
    .line 103
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 110
    :catchall_3
    move-exception p1

    .line 111
    invoke-static {v0, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/nqd;->b:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, La/nqd;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method public h(La/sgy;La/sgy;La/jiy;)V
    .locals 1

    .line 1
    invoke-interface {p3}, La/jiy;->getDescriptor()La/ugi0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, La/ugi0;->l()La/c3x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of p3, p1, La/tua0;

    .line 10
    .line 11
    const-string v0, "Serializer for "

    .line 12
    .line 13
    if-nez p3, :cond_2

    .line 14
    .line 15
    sget-object p3, La/ygi0;->b:La/ygi0;

    .line 16
    .line 17
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-nez p3, :cond_2

    .line 22
    .line 23
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p0, La/aum0;->c:La/aum0;

    .line 29
    .line 30
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    sget-object p0, La/aum0;->d:La/aum0;

    .line 37
    .line 38
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    instance-of p0, p1, La/zvb0;

    .line 45
    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    instance-of p0, p1, La/zgi0;

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :cond_1
    invoke-interface {p2}, La/sgy;->J()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p2, " of kind "

    .line 58
    .line 59
    const-string p3, " cannot be serialized polymorphically with class discriminator."

    .line 60
    .line 61
    invoke-static {v0, p0, p2, p1, p3}, La/c99;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-interface {p2}, La/sgy;->J()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p2, " can\'t be registered as a subclass for polymorphic serialization because its kind "

    .line 70
    .line 71
    const-string p3, " is not concrete. To work with multiple hierarchies, register it as a base class."

    .line 72
    .line 73
    invoke-static {v0, p0, p2, p1, p3}, La/c99;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nqd;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "IncorrectFragmentation{expected="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p0, La/nqd;->b:Z

    .line 19
    .line 20
    xor-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    const-string v1, "}"

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
