.class public final La/dc5;
.super La/lls0;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/Object;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dc5;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dc5;->a:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/dc5;->b:Landroid/content/Context;

    .line 13
    .line 14
    const-string p1, "BackgroundBlurCoilTransformation(25.0)"

    .line 15
    .line 16
    iput-object p1, p0, La/dc5;->c:Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/dc5;->b:Landroid/content/Context;

    .line 26
    .line 27
    const-string p1, "BlurCoilTransformation(25.0)"

    .line 28
    .line 29
    iput-object p1, p0, La/dc5;->c:Ljava/lang/String;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dc5;->a:B

    iget-object p0, p0, La/dc5;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Landroid/graphics/Bitmap;La/f7k0;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dc5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/16 v5, 0x5a

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    int-to-float p2, p2

    .line 17
    const v0, 0x3f0ccccd    # 0.55f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p2, v0

    .line 21
    float-to-int p2, p2

    .line 22
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    int-to-float v6, v6

    .line 27
    mul-float/2addr v6, v0

    .line 28
    float-to-int v6, v6

    .line 29
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 30
    .line 31
    invoke-static {p2, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v6, p0, La/dc5;->b:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v5, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    new-instance v5, Landroid/graphics/Canvas;

    .line 45
    .line 46
    invoke-direct {v5, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, p1, v3, v3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-virtual {p0, v6, p2}, La/dc5;->d(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Landroid/renderscript/RSRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    :goto_0
    return-object p2

    .line 78
    :pswitch_0
    iget-object v0, p2, La/f7k0;->a:La/umk;

    .line 79
    .line 80
    instance-of v6, v0, La/rmk;

    .line 81
    .line 82
    if-eqz v6, :cond_0

    .line 83
    .line 84
    check-cast v0, La/rmk;

    .line 85
    .line 86
    iget v0, v0, La/rmk;->a:I

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_1
    iget-object p2, p2, La/f7k0;->b:La/umk;

    .line 94
    .line 95
    instance-of v6, p2, La/rmk;

    .line 96
    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    check-cast p2, La/rmk;

    .line 100
    .line 101
    iget p2, p2, La/rmk;->a:I

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    :goto_2
    invoke-static {p1, v0, p2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, La/dc5;->b:Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {v5, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    sget-object v6, La/dc5;->d:Ljava/lang/Object;

    .line 122
    .line 123
    monitor-enter v6

    .line 124
    :try_start_1
    new-instance v7, Landroid/graphics/Canvas;

    .line 125
    .line 126
    invoke-direct {v7, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 127
    .line 128
    .line 129
    const/high16 v8, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v7, v8, v8}, Landroid/graphics/Canvas;->scale(FF)V

    .line 132
    .line 133
    .line 134
    new-instance v8, Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, p1, v3, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    .line 151
    :try_start_2
    invoke-virtual {p0, v0, p2}, La/dc5;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Landroid/renderscript/RSRuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :catchall_0
    move-exception p0

    .line 156
    goto :goto_4

    .line 157
    :catch_1
    move-exception p0

    .line 158
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 159
    .line 160
    .line 161
    :goto_3
    monitor-exit v6

    .line 162
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    int-to-float p0, p0

    .line 167
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-float v0, v0

    .line 172
    div-float/2addr p0, v0

    .line 173
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    int-to-float v0, v0

    .line 178
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    int-to-float v3, v3

    .line 183
    div-float/2addr v0, v3

    .line 184
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    int-to-float v3, v3

    .line 189
    mul-float/2addr v3, v0

    .line 190
    mul-float/2addr p0, v3

    .line 191
    float-to-int v0, v3

    .line 192
    float-to-int v5, p0

    .line 193
    invoke-static {p1, v0, v5, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    int-to-float v0, v0

    .line 205
    sub-float/2addr v0, v3

    .line 206
    const/high16 v3, 0x40000000    # 2.0f

    .line 207
    .line 208
    div-float/2addr v0, v3

    .line 209
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    int-to-float v4, v4

    .line 214
    sub-float/2addr v4, p0

    .line 215
    div-float/2addr v4, v3

    .line 216
    sget-object p0, La/dc5;->d:Ljava/lang/Object;

    .line 217
    .line 218
    monitor-enter p0

    .line 219
    :try_start_4
    new-instance v3, Landroid/graphics/Canvas;

    .line 220
    .line 221
    invoke-direct {v3, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 222
    .line 223
    .line 224
    new-instance v5, Landroid/graphics/Paint;

    .line 225
    .line 226
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, p1, v0, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 236
    .line 237
    .line 238
    monitor-exit p0

    .line 239
    return-object p2

    .line 240
    :catchall_1
    move-exception p1

    .line 241
    monitor-exit p0

    .line 242
    throw p1

    .line 243
    :goto_4
    monitor-exit v6

    .line 244
    throw p0

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 6
    :try_start_1
    new-instance v0, Landroid/renderscript/RenderScript$RSMessageHandler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_FULL:Landroid/renderscript/Allocation$MipmapControl;

    .line 15
    .line 16
    const/16 v1, 0x80

    .line 17
    .line 18
    invoke-static {p1, p2, v0, v1}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 22
    :try_start_2
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p1, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 27
    .line 28
    .line 29
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    :try_start_3
    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {p1, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v0}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 39
    .line 40
    .line 41
    const/high16 v3, 0x41c80000    # 25.0f

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    .line 48
    .line 49
    :try_start_4
    invoke-virtual {v1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/renderscript/BaseObj;->destroy()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :catchall_1
    move-exception p2

    .line 68
    move-object v2, p0

    .line 69
    :goto_0
    move-object p0, p2

    .line 70
    goto :goto_2

    .line 71
    :catchall_2
    move-exception p2

    .line 72
    move-object v1, p0

    .line 73
    :goto_1
    move-object v2, v1

    .line 74
    goto :goto_0

    .line 75
    :catchall_3
    move-exception p2

    .line 76
    move-object v0, p0

    .line 77
    move-object v1, v0

    .line 78
    goto :goto_1

    .line 79
    :catchall_4
    move-exception p1

    .line 80
    move-object v0, p0

    .line 81
    move-object v1, v0

    .line 82
    move-object v2, v1

    .line 83
    move-object p0, p1

    .line 84
    move-object p1, v2

    .line 85
    :goto_2
    if-eqz p1, :cond_0

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    .line 88
    .line 89
    .line 90
    :cond_0
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 93
    .line 94
    .line 95
    :cond_1
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 98
    .line 99
    .line 100
    :cond_2
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/renderscript/BaseObj;->destroy()V

    .line 103
    .line 104
    .line 105
    :cond_3
    throw p0
.end method

.method public d(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 6
    :try_start_1
    new-instance v0, Landroid/renderscript/RenderScript$RSMessageHandler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {p1, p2, v0, v1}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 21
    :try_start_2
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p1, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    :try_start_3
    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {p1, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2, v0}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 38
    .line 39
    .line 40
    const/high16 v3, 0x41c80000    # 25.0f

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {v1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Landroid/renderscript/BaseObj;->destroy()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    move-exception p2

    .line 67
    move-object v2, p0

    .line 68
    :goto_0
    move-object p0, p2

    .line 69
    goto :goto_2

    .line 70
    :catchall_2
    move-exception p2

    .line 71
    move-object v1, p0

    .line 72
    :goto_1
    move-object v2, v1

    .line 73
    goto :goto_0

    .line 74
    :catchall_3
    move-exception p2

    .line 75
    move-object v0, p0

    .line 76
    move-object v1, v0

    .line 77
    goto :goto_1

    .line 78
    :catchall_4
    move-exception p1

    .line 79
    move-object v0, p0

    .line 80
    move-object v1, v0

    .line 81
    move-object v2, v1

    .line 82
    move-object p0, p1

    .line 83
    move-object p1, v2

    .line 84
    :goto_2
    if-eqz p1, :cond_0

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    .line 87
    .line 88
    .line 89
    :cond_0
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 92
    .line 93
    .line 94
    :cond_1
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 97
    .line 98
    .line 99
    :cond_2
    if-eqz v2, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/renderscript/BaseObj;->destroy()V

    .line 102
    .line 103
    .line 104
    :cond_3
    throw p0
.end method
