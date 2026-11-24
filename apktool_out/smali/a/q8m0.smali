.class public final La/q8m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nkj;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/q8m0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/mnn0;->d:La/rgn0;

    .line 8
    .line 9
    iput-object v0, p0, La/q8m0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/gbi0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/q8m0;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, La/q8m0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(La/hmk0;La/a780;)La/okj;
    .locals 6

    .line 1
    iget-byte v0, p0, La/q8m0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q8m0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, La/hmk0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, La/hmk0;->a:La/y1x;

    .line 12
    .line 13
    const-string v2, "image/svg+xml"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, La/y1x;->V0()La/u99;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    sget-object v4, La/ikj;->b:La/qg9;

    .line 28
    .line 29
    invoke-interface {v0, v2, v3, v4}, La/u99;->m0(JLa/qg9;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    sget-object v2, La/ikj;->a:La/qg9;

    .line 36
    .line 37
    const-wide/16 v3, 0x400

    .line 38
    .line 39
    invoke-interface {v0, v3, v4, v2}, La/u99;->y0(JLa/qg9;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    const-wide/16 v4, -0x1

    .line 44
    .line 45
    cmp-long v0, v2, v4

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :cond_0
    new-instance v1, La/mnn0;

    .line 50
    .line 51
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    invoke-direct {v1, p1, p2, p0}, La/mnn0;-><init>(La/y1x;La/a780;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v1

    .line 57
    :pswitch_0
    invoke-static {p2}, La/t1x;->e(La/a780;)Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v2, p2, La/a780;->a:Landroid/content/Context;

    .line 62
    .line 63
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 64
    .line 65
    if-eq v0, v3, :cond_2

    .line 66
    .line 67
    invoke-static {}, La/y6;->B()Landroid/graphics/Bitmap$Config;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-ne v0, v3, :cond_9

    .line 72
    .line 73
    :cond_2
    iget-object v0, p1, La/hmk0;->a:La/y1x;

    .line 74
    .line 75
    invoke-interface {v0}, La/y1x;->getFileSystem()La/yzp;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v4, La/yzp;->a:La/ggy;

    .line 80
    .line 81
    if-ne v3, v4, :cond_3

    .line 82
    .line 83
    invoke-interface {v0}, La/y1x;->Q0()La/y190;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-virtual {v3}, La/y190;->toFile()Ljava/io/File;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, La/o8m0;->d(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-interface {v0}, La/y1x;->getMetadata()La/x1x;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    instance-of v3, v0, La/oy3;

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v0, La/oy3;

    .line 111
    .line 112
    iget-object v0, v0, La/oy3;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v2, v0}, La/o8m0;->b(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/ImageDecoder$Source;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_0

    .line 119
    :cond_4
    instance-of v3, v0, La/xfe;

    .line 120
    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 124
    .line 125
    const/16 v4, 0x1d

    .line 126
    .line 127
    if-lt v3, v4, :cond_5

    .line 128
    .line 129
    :try_start_0
    check-cast v0, La/xfe;

    .line 130
    .line 131
    iget-object v0, v0, La/xfe;->a:Landroid/content/res/AssetFileDescriptor;

    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    sget v5, Landroid/system/OsConstants;->SEEK_SET:I

    .line 142
    .line 143
    invoke-static {v2, v3, v4, v5}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 144
    .line 145
    .line 146
    new-instance v2, La/hrd;

    .line 147
    .line 148
    const/4 v3, 0x7

    .line 149
    invoke-direct {v2, v0, v3}, La/hrd;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, La/xl50;->c(La/hrd;)Landroid/graphics/ImageDecoder$Source;

    .line 153
    .line 154
    .line 155
    move-result-object v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_0

    .line 157
    :cond_5
    instance-of v3, v0, La/etf0;

    .line 158
    .line 159
    if-eqz v3, :cond_6

    .line 160
    .line 161
    move-object v3, v0

    .line 162
    check-cast v3, La/etf0;

    .line 163
    .line 164
    iget-object v4, v3, La/etf0;->a:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_6

    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget v2, v3, La/etf0;->b:I

    .line 181
    .line 182
    invoke-static {v0, v2}, La/o8m0;->c(Landroid/content/res/Resources;I)Landroid/graphics/ImageDecoder$Source;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    goto :goto_0

    .line 187
    :cond_6
    instance-of v2, v0, La/xf9;

    .line 188
    .line 189
    if-eqz v2, :cond_7

    .line 190
    .line 191
    check-cast v0, La/xf9;

    .line 192
    .line 193
    iget-object v0, v0, La/xf9;->a:Ljava/nio/ByteBuffer;

    .line 194
    .line 195
    invoke-static {v0}, La/o8m0;->e(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    goto :goto_0

    .line 200
    :catch_0
    :cond_7
    move-object v0, v1

    .line 201
    :goto_0
    if-nez v0, :cond_8

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_8
    new-instance v1, La/x68;

    .line 205
    .line 206
    iget-object p1, p1, La/hmk0;->a:La/y1x;

    .line 207
    .line 208
    check-cast p0, La/gbi0;

    .line 209
    .line 210
    invoke-direct {v1, v0, p1, p2, p0}, La/x68;-><init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;La/a780;La/gbi0;)V

    .line 211
    .line 212
    .line 213
    :cond_9
    :goto_1
    return-object v1

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
