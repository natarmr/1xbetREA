.class public final La/ucs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mzs0;
.implements La/zmh0;


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    iput-byte p1, p0, La/ucs0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 300
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 301
    invoke-static {}, La/wy40;->l()La/wy40;

    move-result-object p1

    iput-object p1, p0, La/ucs0;->d:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 302
    iput p1, p0, La/ucs0;->b:I

    .line 303
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 304
    invoke-static {}, La/tz40;->a()La/tz40;

    move-result-object p1

    iput-object p1, p0, La/ucs0;->f:Ljava/lang/Object;

    return-void

    .line 305
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/f7u;La/vjj;La/hay;I)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/ucs0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 287
    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 288
    iput-object p2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 289
    iput p4, p0, La/ucs0;->b:I

    .line 290
    invoke-interface {p3}, La/hay;->getTypeParameters()Ljava/util/ArrayList;

    move-result-object p1

    .line 291
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 292
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    add-int/lit8 p4, p3, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 293
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p3, p4

    goto :goto_0

    .line 294
    :cond_0
    iput-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 295
    iget-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    check-cast p1, La/f7u;

    .line 296
    iget-object p1, p1, La/f7u;->b:Ljava/lang/Object;

    check-cast p1, La/v7i;

    .line 297
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    check-cast p1, La/eu00;

    .line 298
    new-instance p2, La/caz;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {p1, p2}, La/eu00;->d(Lkotlin/jvm/functions/Function1;)La/xg;

    move-result-object p1

    iput-object p1, p0, La/ucs0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/uw9;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/ucs0;->a:B

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 270
    sget-object p1, La/jev;->a:La/z04;

    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    sget-object v0, La/z04;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    move-result p1

    .line 273
    iput p1, p0, La/ucs0;->b:I

    const/4 p1, 0x0

    .line 274
    invoke-static {p1}, La/o2e;->X(Z)La/x04;

    move-result-object p1

    iput-object p1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 275
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 276
    new-instance p1, La/svu;

    invoke-direct {p1, p0}, La/svu;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, La/ucs0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xrs0;I)V
    .locals 2

    const/4 v0, 0x7

    iput-byte v0, p0, La/ucs0;->a:B

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 307
    new-instance p1, La/q8b;

    const/4 v0, 0x5

    new-array v1, v0, [B

    .line 308
    invoke-direct {p1, v1, v0}, La/q8b;-><init>([BI)V

    .line 309
    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 310
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 311
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 312
    iput p2, p0, La/ucs0;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ucs0;->a:B

    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 278
    iput p1, p0, La/ucs0;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/ucs0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, La/ucs0;->b:I

    .line 12
    .line 13
    invoke-static {}, La/n4c;->H()V

    .line 14
    .line 15
    .line 16
    const v1, 0x8b31

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1}, La/ucs0;->i(IILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x8b30

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p1, p2}, La/ucs0;->i(IILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    filled-new-array {p1}, [I

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const v1, 0x8b82

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 40
    .line 41
    .line 42
    aget p2, p2, p1

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    if-ne p2, v1, :cond_0

    .line 46
    .line 47
    move p2, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move p2, p1

    .line 50
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Unable to link shader program: \n"

    .line 53
    .line 54
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2, p2}, La/n4c;->I(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 72
    .line 73
    .line 74
    new-instance p2, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 80
    .line 81
    new-array p2, v1, [I

    .line 82
    .line 83
    const v2, 0x8b89

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 87
    .line 88
    .line 89
    aget v0, p2, p1

    .line 90
    .line 91
    new-array v0, v0, [La/bst;

    .line 92
    .line 93
    iput-object v0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    move v3, p1

    .line 96
    :goto_1
    aget v0, p2, p1

    .line 97
    .line 98
    if-ge v3, v0, :cond_3

    .line 99
    .line 100
    iget v2, p0, La/ucs0;->b:I

    .line 101
    .line 102
    new-array v0, v1, [I

    .line 103
    .line 104
    const v4, 0x8b8a

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 108
    .line 109
    .line 110
    aget v4, v0, p1

    .line 111
    .line 112
    new-array v11, v4, [B

    .line 113
    .line 114
    new-array v5, v1, [I

    .line 115
    .line 116
    new-array v7, v1, [I

    .line 117
    .line 118
    new-array v9, v1, [I

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Ljava/lang/String;

    .line 128
    .line 129
    move v5, p1

    .line 130
    :goto_2
    if-ge v5, v4, :cond_2

    .line 131
    .line 132
    aget-byte v6, v11, v5

    .line 133
    .line 134
    if-nez v6, :cond_1

    .line 135
    .line 136
    move v4, v5

    .line 137
    goto :goto_3

    .line 138
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    :goto_3
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 142
    .line 143
    .line 144
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 145
    .line 146
    .line 147
    new-instance v2, La/bst;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    iget-object v4, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v4, [La/bst;

    .line 155
    .line 156
    aput-object v2, v4, v3

    .line 157
    .line 158
    iget-object v4, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object p2, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 174
    .line 175
    new-array p2, v1, [I

    .line 176
    .line 177
    iget v0, p0, La/ucs0;->b:I

    .line 178
    .line 179
    const v2, 0x8b86

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 183
    .line 184
    .line 185
    aget v0, p2, p1

    .line 186
    .line 187
    new-array v0, v0, [La/gst;

    .line 188
    .line 189
    iput-object v0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 190
    .line 191
    move v3, p1

    .line 192
    :goto_4
    aget v0, p2, p1

    .line 193
    .line 194
    if-ge v3, v0, :cond_6

    .line 195
    .line 196
    iget v2, p0, La/ucs0;->b:I

    .line 197
    .line 198
    new-array v0, v1, [I

    .line 199
    .line 200
    const v4, 0x8b87

    .line 201
    .line 202
    .line 203
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 204
    .line 205
    .line 206
    new-array v9, v1, [I

    .line 207
    .line 208
    aget v4, v0, p1

    .line 209
    .line 210
    new-array v11, v4, [B

    .line 211
    .line 212
    new-array v5, v1, [I

    .line 213
    .line 214
    new-array v7, v1, [I

    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v8, 0x0

    .line 220
    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Ljava/lang/String;

    .line 224
    .line 225
    move v5, p1

    .line 226
    :goto_5
    if-ge v5, v4, :cond_5

    .line 227
    .line 228
    aget-byte v6, v11, v5

    .line 229
    .line 230
    if-nez v6, :cond_4

    .line 231
    .line 232
    move v4, v5

    .line 233
    goto :goto_6

    .line 234
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_5
    :goto_6
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 241
    .line 242
    .line 243
    new-instance v2, La/gst;

    .line 244
    .line 245
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v4, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v4, [La/gst;

    .line 251
    .line 252
    aput-object v2, v4, v3

    .line 253
    .line 254
    iget-object v4, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v4, Ljava/util/HashMap;

    .line 257
    .line 258
    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    add-int/lit8 v3, v3, 0x1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_6
    invoke-static {}, La/n4c;->H()V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public constructor <init>([La/tjf0;[La/fmo;La/rds0;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    iput-byte v0, p0, La/ucs0;->a:B

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    array-length v1, p1

    array-length v2, p2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 281
    iput-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 282
    invoke-virtual {p2}, [La/fmo;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [La/fmo;

    iput-object p2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 283
    iput-object p3, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 284
    iput-object p4, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 285
    array-length p1, p1

    iput p1, p0, La/ucs0;->b:I

    return-void
.end method

.method public static i(IILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x8b81

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 20
    .line 21
    .line 22
    aget v1, v1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ", source: \n"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p2, v0}, La/n4c;->I(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, La/n4c;->H()V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public B()Lkotlin/Unit;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Closing "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "CXCP"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/x04;

    .line 23
    .line 24
    invoke-virtual {v0}, La/x04;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/uw9;

    .line 33
    .line 34
    invoke-virtual {p0}, La/uw9;->c()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    sget-object v0, La/wne;->a:La/wne;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0
.end method

.method public C()V
    .locals 4

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/uw9;

    .line 4
    .line 5
    iget-object v0, p0, La/uw9;->i:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    const-string v1, "CXCP"

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v3, "#stopRepeating"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/uw9;->a:La/fy9;

    .line 31
    .line 32
    invoke-interface {p0}, La/fy9;->M0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    monitor-exit v0

    .line 39
    throw p0
.end method

.method public D(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/x04;

    .line 16
    .line 17
    invoke-virtual {v0}, La/x04;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string p1, "CXCP"

    .line 25
    .line 26
    new-instance p3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p4, "Failed to submit "

    .line 29
    .line 30
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p2, ": "

    .line 37
    .line 38
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " is closed."

    .line 45
    .line 46
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    return v1

    .line 57
    :cond_0
    const-string v0, "CXCP#buildCaptureSequence"

    .line 58
    .line 59
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    check-cast v2, La/uw9;

    .line 66
    .line 67
    iget-object v0, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v8, v0

    .line 70
    check-cast v8, La/svu;

    .line 71
    .line 72
    move v3, p1

    .line 73
    move-object v4, p2

    .line 74
    move-object v5, p3

    .line 75
    move-object v6, p4

    .line 76
    move-object v7, p5

    .line 77
    move-object/from16 v9, p6

    .line 78
    .line 79
    invoke-virtual/range {v2 .. v9}, La/uw9;->b(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;La/svu;Ljava/util/List;)La/tw9;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 83
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 84
    .line 85
    .line 86
    const/4 p3, 0x1

    .line 87
    if-nez p1, :cond_c

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    if-eqz p4, :cond_b

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    check-cast p4, La/cmf0;

    .line 112
    .line 113
    iget-object p4, p4, La/cmf0;->f:La/dfx;

    .line 114
    .line 115
    if-eqz p4, :cond_2

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_a

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, La/cmf0;

    .line 132
    .line 133
    iget-object p2, p1, La/cmf0;->f:La/dfx;

    .line 134
    .line 135
    if-eqz p2, :cond_9

    .line 136
    .line 137
    iget-object p2, p2, La/dfx;->a:La/uz2;

    .line 138
    .line 139
    instance-of p4, p2, Ljava/lang/AutoCloseable;

    .line 140
    .line 141
    if-eqz p4, :cond_4

    .line 142
    .line 143
    invoke-virtual {p2}, La/uz2;->close()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    instance-of p4, p2, Ljava/util/concurrent/ExecutorService;

    .line 148
    .line 149
    if-eqz p4, :cond_8

    .line 150
    .line 151
    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 152
    .line 153
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    if-ne p2, p4, :cond_5

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    if-nez p4, :cond_9

    .line 165
    .line 166
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 167
    .line 168
    .line 169
    move v0, v1

    .line 170
    :cond_6
    :goto_0
    if-nez p4, :cond_7

    .line 171
    .line 172
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 173
    .line 174
    const-wide/16 v3, 0x1

    .line 175
    .line 176
    invoke-interface {p2, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 177
    .line 178
    .line 179
    move-result p4
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 180
    goto :goto_0

    .line 181
    :catch_0
    if-nez v0, :cond_6

    .line 182
    .line 183
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move v0, p3

    .line 187
    goto :goto_0

    .line 188
    :cond_7
    if-eqz v0, :cond_9

    .line 189
    .line 190
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_8
    invoke-static {}, La/e9d0;->o()V

    .line 199
    .line 200
    .line 201
    return v1

    .line 202
    :cond_9
    :goto_1
    iget-object p2, p1, La/cmf0;->d:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result p4

    .line 212
    if-eqz p4, :cond_3

    .line 213
    .line 214
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p4

    .line 218
    check-cast p4, La/bmf0;

    .line 219
    .line 220
    invoke-interface {p4, p1}, La/bmf0;->q(La/cmf0;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_a
    return p3

    .line 225
    :cond_b
    :goto_3
    const-string p1, "CXCP"

    .line 226
    .line 227
    new-instance p3, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string p4, "Failed to submit "

    .line 230
    .line 231
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string p2, ": "

    .line 238
    .line 239
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string p0, " failed to build CaptureSequence."

    .line 246
    .line 247
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 255
    .line 256
    .line 257
    return v1

    .line 258
    :cond_c
    iget-object p4, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p4, La/x04;

    .line 261
    .line 262
    invoke-virtual {p4}, La/x04;->b()Z

    .line 263
    .line 264
    .line 265
    move-result p4

    .line 266
    if-eqz p4, :cond_d

    .line 267
    .line 268
    const-string p1, "CXCP"

    .line 269
    .line 270
    new-instance p3, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string p4, "Failed to submit "

    .line 273
    .line 274
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string p2, ": "

    .line 281
    .line 282
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string p0, " is closed."

    .line 289
    .line 290
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    return v1

    .line 301
    :cond_d
    iget-boolean p2, p1, La/tw9;->b:Z

    .line 302
    .line 303
    if-nez p2, :cond_e

    .line 304
    .line 305
    iget-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast p2, Ljava/util/ArrayList;

    .line 308
    .line 309
    monitor-enter p2

    .line 310
    :try_start_2
    iget-object p4, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p4, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 315
    .line 316
    .line 317
    monitor-exit p2

    .line 318
    goto :goto_4

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    move-object p0, v0

    .line 321
    monitor-exit p2

    .line 322
    throw p0

    .line 323
    :cond_e
    :goto_4
    :try_start_3
    const-string p2, "CXCP"

    .line 324
    .line 325
    new-instance p4, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v0, " submitting "

    .line 334
    .line 335
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p4

    .line 345
    invoke-static {p2, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    const-string p2, "InvokeInternalListeners"

    .line 349
    .line 350
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    iget-object p2, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    move p4, v1

    .line 360
    :goto_5
    if-ge p4, p2, :cond_10

    .line 361
    .line 362
    iget-object v0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, La/gnf0;

    .line 369
    .line 370
    iget-object v2, p1, La/tw9;->e:Ljava/util/List;

    .line 371
    .line 372
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    move v3, v1

    .line 377
    :goto_6
    if-ge v3, v2, :cond_f

    .line 378
    .line 379
    iget-object v4, p1, La/tw9;->e:Ljava/util/List;

    .line 380
    .line 381
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    check-cast v4, La/bmf0;

    .line 386
    .line 387
    invoke-interface {v4, v0}, La/bmf0;->k(La/gnf0;)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v3, v3, 0x1

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :catchall_1
    move-exception v0

    .line 394
    move-object p2, v0

    .line 395
    move p3, v1

    .line 396
    goto/16 :goto_19

    .line 397
    .line 398
    :cond_f
    add-int/lit8 p4, p4, 0x1

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_10
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 402
    .line 403
    .line 404
    const-string p2, "InvokeRequestListeners"

    .line 405
    .line 406
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    iget-object p2, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 412
    .line 413
    .line 414
    move-result p2

    .line 415
    move p4, v1

    .line 416
    :goto_7
    if-ge p4, p2, :cond_12

    .line 417
    .line 418
    iget-object v0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v0, La/gnf0;

    .line 425
    .line 426
    invoke-interface {v0}, La/gnf0;->getRequest()La/cmf0;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    iget-object v2, v2, La/cmf0;->d:Ljava/util/List;

    .line 431
    .line 432
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    move v3, v1

    .line 437
    :goto_8
    if-ge v3, v2, :cond_11

    .line 438
    .line 439
    invoke-interface {v0}, La/gnf0;->getRequest()La/cmf0;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    iget-object v4, v4, La/cmf0;->d:Ljava/util/List;

    .line 444
    .line 445
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    check-cast v4, La/bmf0;

    .line 450
    .line 451
    invoke-interface {v4, v0}, La/bmf0;->k(La/gnf0;)V

    .line 452
    .line 453
    .line 454
    add-int/lit8 v3, v3, 0x1

    .line 455
    .line 456
    goto :goto_8

    .line 457
    :cond_11
    add-int/lit8 p4, p4, 0x1

    .line 458
    .line 459
    goto :goto_7

    .line 460
    :cond_12
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 461
    .line 462
    .line 463
    monitor-enter p1
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 464
    :try_start_4
    iget-object p2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast p2, La/x04;

    .line 467
    .line 468
    invoke-virtual {p2}, La/x04;->b()Z

    .line 469
    .line 470
    .line 471
    move-result p2

    .line 472
    if-eqz p2, :cond_17

    .line 473
    .line 474
    const-string p2, "CXCP"

    .line 475
    .line 476
    new-instance p3, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 479
    .line 480
    .line 481
    const-string p4, "Failed to submit "

    .line 482
    .line 483
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    const-string p4, ": "

    .line 490
    .line 491
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string p4, " is closed."

    .line 498
    .line 499
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p3

    .line 506
    invoke-static {p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 507
    .line 508
    .line 509
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 510
    iget-boolean p2, p1, La/tw9;->b:Z

    .line 511
    .line 512
    if-nez p2, :cond_2c

    .line 513
    .line 514
    iget-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast p2, Ljava/util/ArrayList;

    .line 517
    .line 518
    monitor-enter p2

    .line 519
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast p0, Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    monitor-exit p2

    .line 527
    const-string p0, "InvokeInternalListeners"

    .line 528
    .line 529
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 535
    .line 536
    .line 537
    move-result p0

    .line 538
    move p2, v1

    .line 539
    :goto_9
    if-ge p2, p0, :cond_14

    .line 540
    .line 541
    iget-object p3, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 542
    .line 543
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p3

    .line 547
    check-cast p3, La/gnf0;

    .line 548
    .line 549
    iget-object p4, p1, La/tw9;->e:Ljava/util/List;

    .line 550
    .line 551
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 552
    .line 553
    .line 554
    move-result p4

    .line 555
    move v0, v1

    .line 556
    :goto_a
    if-ge v0, p4, :cond_13

    .line 557
    .line 558
    iget-object v2, p1, La/tw9;->e:Ljava/util/List;

    .line 559
    .line 560
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    check-cast v2, La/bmf0;

    .line 565
    .line 566
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    invoke-interface {v2, v3}, La/bmf0;->q(La/cmf0;)V

    .line 571
    .line 572
    .line 573
    add-int/lit8 v0, v0, 0x1

    .line 574
    .line 575
    goto :goto_a

    .line 576
    :cond_13
    add-int/lit8 p2, p2, 0x1

    .line 577
    .line 578
    goto :goto_9

    .line 579
    :cond_14
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 580
    .line 581
    .line 582
    const-string p0, "InvokeRequestListeners"

    .line 583
    .line 584
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 588
    .line 589
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 590
    .line 591
    .line 592
    move-result p0

    .line 593
    move p2, v1

    .line 594
    :goto_b
    if-ge p2, p0, :cond_16

    .line 595
    .line 596
    iget-object p3, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 597
    .line 598
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object p3

    .line 602
    check-cast p3, La/gnf0;

    .line 603
    .line 604
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 605
    .line 606
    .line 607
    move-result-object p4

    .line 608
    iget-object p4, p4, La/cmf0;->d:Ljava/util/List;

    .line 609
    .line 610
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 611
    .line 612
    .line 613
    move-result p4

    .line 614
    move v0, v1

    .line 615
    :goto_c
    if-ge v0, p4, :cond_15

    .line 616
    .line 617
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    iget-object v2, v2, La/cmf0;->d:Ljava/util/List;

    .line 622
    .line 623
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, La/bmf0;

    .line 628
    .line 629
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    invoke-interface {v2, v3}, La/bmf0;->q(La/cmf0;)V

    .line 634
    .line 635
    .line 636
    add-int/lit8 v0, v0, 0x1

    .line 637
    .line 638
    goto :goto_c

    .line 639
    :cond_15
    add-int/lit8 p2, p2, 0x1

    .line 640
    .line 641
    goto :goto_b

    .line 642
    :cond_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 643
    .line 644
    .line 645
    return v1

    .line 646
    :catchall_2
    move-exception v0

    .line 647
    move-object p2, v0

    .line 648
    goto/16 :goto_18

    .line 649
    .line 650
    :cond_17
    :try_start_6
    const-string p2, "CXCP#submit(CaptureSequence)"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 651
    .line 652
    :try_start_7
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    iget-object p2, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast p2, La/uw9;

    .line 658
    .line 659
    invoke-virtual {p2, p1}, La/uw9;->d(La/tw9;)Ljava/lang/Integer;

    .line 660
    .line 661
    .line 662
    move-result-object p2

    .line 663
    const/4 p4, -0x1

    .line 664
    if-eqz p2, :cond_18

    .line 665
    .line 666
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result p2

    .line 670
    goto :goto_d

    .line 671
    :catchall_3
    move-exception v0

    .line 672
    move-object p2, v0

    .line 673
    goto/16 :goto_17

    .line 674
    .line 675
    :cond_18
    move p2, p4

    .line 676
    :goto_d
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    iput-object v0, p1, La/tw9;->m:Ljava/lang/Integer;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 681
    .line 682
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 683
    .line 684
    .line 685
    :try_start_9
    monitor-exit p1

    .line 686
    if-eq p2, p4, :cond_1d

    .line 687
    .line 688
    const-string p2, "InvokeInternalListeners"

    .line 689
    .line 690
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    iget-object p2, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 696
    .line 697
    .line 698
    move-result p2

    .line 699
    move p4, v1

    .line 700
    :goto_e
    if-ge p4, p2, :cond_1a

    .line 701
    .line 702
    iget-object v0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    check-cast v0, La/gnf0;

    .line 709
    .line 710
    iget-object v2, p1, La/tw9;->e:Ljava/util/List;

    .line 711
    .line 712
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    move v3, v1

    .line 717
    :goto_f
    if-ge v3, v2, :cond_19

    .line 718
    .line 719
    iget-object v4, p1, La/tw9;->e:Ljava/util/List;

    .line 720
    .line 721
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v4

    .line 725
    check-cast v4, La/bmf0;

    .line 726
    .line 727
    invoke-interface {v4, v0}, La/bmf0;->n(La/gnf0;)V

    .line 728
    .line 729
    .line 730
    add-int/lit8 v3, v3, 0x1

    .line 731
    .line 732
    goto :goto_f

    .line 733
    :cond_19
    add-int/lit8 p4, p4, 0x1

    .line 734
    .line 735
    goto :goto_e

    .line 736
    :cond_1a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 737
    .line 738
    .line 739
    const-string p2, "InvokeRequestListeners"

    .line 740
    .line 741
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    iget-object p2, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 745
    .line 746
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 747
    .line 748
    .line 749
    move-result p2

    .line 750
    move p4, v1

    .line 751
    :goto_10
    if-ge p4, p2, :cond_1c

    .line 752
    .line 753
    iget-object v0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 754
    .line 755
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    check-cast v0, La/gnf0;

    .line 760
    .line 761
    invoke-interface {v0}, La/gnf0;->getRequest()La/cmf0;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    iget-object v2, v2, La/cmf0;->d:Ljava/util/List;

    .line 766
    .line 767
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    move v3, v1

    .line 772
    :goto_11
    if-ge v3, v2, :cond_1b

    .line 773
    .line 774
    invoke-interface {v0}, La/gnf0;->getRequest()La/cmf0;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    iget-object v4, v4, La/cmf0;->d:Ljava/util/List;

    .line 779
    .line 780
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    check-cast v4, La/bmf0;

    .line 785
    .line 786
    invoke-interface {v4, v0}, La/bmf0;->n(La/gnf0;)V

    .line 787
    .line 788
    .line 789
    add-int/lit8 v3, v3, 0x1

    .line 790
    .line 791
    goto :goto_11

    .line 792
    :cond_1b
    add-int/lit8 p4, p4, 0x1

    .line 793
    .line 794
    goto :goto_10

    .line 795
    :cond_1c
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_9
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 796
    .line 797
    .line 798
    :try_start_a
    const-string p2, "CXCP"

    .line 799
    .line 800
    new-instance p4, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 803
    .line 804
    .line 805
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    const-string v0, " submitted "

    .line 809
    .line 810
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object p4

    .line 820
    invoke-static {p2, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_a
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 821
    .line 822
    .line 823
    move p2, p3

    .line 824
    goto :goto_12

    .line 825
    :catchall_4
    move-exception v0

    .line 826
    move-object p2, v0

    .line 827
    goto/16 :goto_19

    .line 828
    .line 829
    :cond_1d
    :try_start_b
    const-string p2, "CXCP"

    .line 830
    .line 831
    new-instance p3, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 834
    .line 835
    .line 836
    const-string p4, "Failed to submit "

    .line 837
    .line 838
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    const-string p4, ": "

    .line 845
    .line 846
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    const-string p4, " received -1 from submit."

    .line 853
    .line 854
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object p3

    .line 861
    invoke-static {p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_b
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 862
    .line 863
    .line 864
    move p2, v1

    .line 865
    move p3, p2

    .line 866
    :goto_12
    if-nez p2, :cond_22

    .line 867
    .line 868
    iget-boolean p2, p1, La/tw9;->b:Z

    .line 869
    .line 870
    if-nez p2, :cond_22

    .line 871
    .line 872
    iget-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast p2, Ljava/util/ArrayList;

    .line 875
    .line 876
    monitor-enter p2

    .line 877
    :try_start_c
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast p0, Ljava/util/ArrayList;

    .line 880
    .line 881
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 882
    .line 883
    .line 884
    monitor-exit p2

    .line 885
    const-string p0, "InvokeInternalListeners"

    .line 886
    .line 887
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 891
    .line 892
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 893
    .line 894
    .line 895
    move-result p0

    .line 896
    move p2, v1

    .line 897
    :goto_13
    if-ge p2, p0, :cond_1f

    .line 898
    .line 899
    iget-object p4, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 900
    .line 901
    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object p4

    .line 905
    check-cast p4, La/gnf0;

    .line 906
    .line 907
    iget-object v0, p1, La/tw9;->e:Ljava/util/List;

    .line 908
    .line 909
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 910
    .line 911
    .line 912
    move-result v0

    .line 913
    move v2, v1

    .line 914
    :goto_14
    if-ge v2, v0, :cond_1e

    .line 915
    .line 916
    iget-object v3, p1, La/tw9;->e:Ljava/util/List;

    .line 917
    .line 918
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    check-cast v3, La/bmf0;

    .line 923
    .line 924
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 925
    .line 926
    .line 927
    move-result-object v4

    .line 928
    invoke-interface {v3, v4}, La/bmf0;->q(La/cmf0;)V

    .line 929
    .line 930
    .line 931
    add-int/lit8 v2, v2, 0x1

    .line 932
    .line 933
    goto :goto_14

    .line 934
    :cond_1e
    add-int/lit8 p2, p2, 0x1

    .line 935
    .line 936
    goto :goto_13

    .line 937
    :cond_1f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 938
    .line 939
    .line 940
    const-string p0, "InvokeRequestListeners"

    .line 941
    .line 942
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 946
    .line 947
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 948
    .line 949
    .line 950
    move-result p0

    .line 951
    move p2, v1

    .line 952
    :goto_15
    if-ge p2, p0, :cond_21

    .line 953
    .line 954
    iget-object p4, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 955
    .line 956
    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object p4

    .line 960
    check-cast p4, La/gnf0;

    .line 961
    .line 962
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    iget-object v0, v0, La/cmf0;->d:Ljava/util/List;

    .line 967
    .line 968
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 969
    .line 970
    .line 971
    move-result v0

    .line 972
    move v2, v1

    .line 973
    :goto_16
    if-ge v2, v0, :cond_20

    .line 974
    .line 975
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    iget-object v3, v3, La/cmf0;->d:Ljava/util/List;

    .line 980
    .line 981
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    check-cast v3, La/bmf0;

    .line 986
    .line 987
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 988
    .line 989
    .line 990
    move-result-object v4

    .line 991
    invoke-interface {v3, v4}, La/bmf0;->q(La/cmf0;)V

    .line 992
    .line 993
    .line 994
    add-int/lit8 v2, v2, 0x1

    .line 995
    .line 996
    goto :goto_16

    .line 997
    :cond_20
    add-int/lit8 p2, p2, 0x1

    .line 998
    .line 999
    goto :goto_15

    .line 1000
    :cond_21
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1001
    .line 1002
    .line 1003
    return p3

    .line 1004
    :catchall_5
    move-exception v0

    .line 1005
    move-object p0, v0

    .line 1006
    monitor-exit p2

    .line 1007
    throw p0

    .line 1008
    :cond_22
    return p3

    .line 1009
    :goto_17
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1010
    .line 1011
    .line 1012
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 1013
    :goto_18
    :try_start_e
    monitor-exit p1

    .line 1014
    throw p2
    :try_end_e
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 1015
    :goto_19
    if-nez p3, :cond_27

    .line 1016
    .line 1017
    iget-boolean p3, p1, La/tw9;->b:Z

    .line 1018
    .line 1019
    if-nez p3, :cond_27

    .line 1020
    .line 1021
    iget-object p3, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast p3, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    monitor-enter p3

    .line 1026
    :try_start_f
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast p0, Ljava/util/ArrayList;

    .line 1029
    .line 1030
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1031
    .line 1032
    .line 1033
    monitor-exit p3

    .line 1034
    const-string p0, "InvokeInternalListeners"

    .line 1035
    .line 1036
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1040
    .line 1041
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 1042
    .line 1043
    .line 1044
    move-result p0

    .line 1045
    move p3, v1

    .line 1046
    :goto_1a
    if-ge p3, p0, :cond_24

    .line 1047
    .line 1048
    iget-object p4, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1049
    .line 1050
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p4

    .line 1054
    check-cast p4, La/gnf0;

    .line 1055
    .line 1056
    iget-object v0, p1, La/tw9;->e:Ljava/util/List;

    .line 1057
    .line 1058
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1059
    .line 1060
    .line 1061
    move-result v0

    .line 1062
    move v2, v1

    .line 1063
    :goto_1b
    if-ge v2, v0, :cond_23

    .line 1064
    .line 1065
    iget-object v3, p1, La/tw9;->e:Ljava/util/List;

    .line 1066
    .line 1067
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v3

    .line 1071
    check-cast v3, La/bmf0;

    .line 1072
    .line 1073
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    invoke-interface {v3, v4}, La/bmf0;->q(La/cmf0;)V

    .line 1078
    .line 1079
    .line 1080
    add-int/lit8 v2, v2, 0x1

    .line 1081
    .line 1082
    goto :goto_1b

    .line 1083
    :cond_23
    add-int/lit8 p3, p3, 0x1

    .line 1084
    .line 1085
    goto :goto_1a

    .line 1086
    :cond_24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1087
    .line 1088
    .line 1089
    const-string p0, "InvokeRequestListeners"

    .line 1090
    .line 1091
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1092
    .line 1093
    .line 1094
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1095
    .line 1096
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 1097
    .line 1098
    .line 1099
    move-result p0

    .line 1100
    move p3, v1

    .line 1101
    :goto_1c
    if-ge p3, p0, :cond_26

    .line 1102
    .line 1103
    iget-object p4, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1104
    .line 1105
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object p4

    .line 1109
    check-cast p4, La/gnf0;

    .line 1110
    .line 1111
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    iget-object v0, v0, La/cmf0;->d:Ljava/util/List;

    .line 1116
    .line 1117
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    move v2, v1

    .line 1122
    :goto_1d
    if-ge v2, v0, :cond_25

    .line 1123
    .line 1124
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    iget-object v3, v3, La/cmf0;->d:Ljava/util/List;

    .line 1129
    .line 1130
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v3

    .line 1134
    check-cast v3, La/bmf0;

    .line 1135
    .line 1136
    invoke-interface {p4}, La/gnf0;->getRequest()La/cmf0;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    invoke-interface {v3, v4}, La/bmf0;->q(La/cmf0;)V

    .line 1141
    .line 1142
    .line 1143
    add-int/lit8 v2, v2, 0x1

    .line 1144
    .line 1145
    goto :goto_1d

    .line 1146
    :cond_25
    add-int/lit8 p3, p3, 0x1

    .line 1147
    .line 1148
    goto :goto_1c

    .line 1149
    :cond_26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1150
    .line 1151
    .line 1152
    goto :goto_1e

    .line 1153
    :catchall_6
    move-exception v0

    .line 1154
    move-object p0, v0

    .line 1155
    monitor-exit p3

    .line 1156
    throw p0

    .line 1157
    :cond_27
    :goto_1e
    throw p2

    .line 1158
    :catch_1
    iget-boolean p2, p1, La/tw9;->b:Z

    .line 1159
    .line 1160
    if-nez p2, :cond_2c

    .line 1161
    .line 1162
    iget-object p2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast p2, Ljava/util/ArrayList;

    .line 1165
    .line 1166
    monitor-enter p2

    .line 1167
    :try_start_10
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 1168
    .line 1169
    check-cast p0, Ljava/util/ArrayList;

    .line 1170
    .line 1171
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 1172
    .line 1173
    .line 1174
    monitor-exit p2

    .line 1175
    const-string p0, "InvokeInternalListeners"

    .line 1176
    .line 1177
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1178
    .line 1179
    .line 1180
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1181
    .line 1182
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 1183
    .line 1184
    .line 1185
    move-result p0

    .line 1186
    move p2, v1

    .line 1187
    :goto_1f
    if-ge p2, p0, :cond_29

    .line 1188
    .line 1189
    iget-object p3, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1190
    .line 1191
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object p3

    .line 1195
    check-cast p3, La/gnf0;

    .line 1196
    .line 1197
    iget-object p4, p1, La/tw9;->e:Ljava/util/List;

    .line 1198
    .line 1199
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 1200
    .line 1201
    .line 1202
    move-result p4

    .line 1203
    move v0, v1

    .line 1204
    :goto_20
    if-ge v0, p4, :cond_28

    .line 1205
    .line 1206
    iget-object v2, p1, La/tw9;->e:Ljava/util/List;

    .line 1207
    .line 1208
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v2

    .line 1212
    check-cast v2, La/bmf0;

    .line 1213
    .line 1214
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v3

    .line 1218
    invoke-interface {v2, v3}, La/bmf0;->q(La/cmf0;)V

    .line 1219
    .line 1220
    .line 1221
    add-int/lit8 v0, v0, 0x1

    .line 1222
    .line 1223
    goto :goto_20

    .line 1224
    :cond_28
    add-int/lit8 p2, p2, 0x1

    .line 1225
    .line 1226
    goto :goto_1f

    .line 1227
    :cond_29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1228
    .line 1229
    .line 1230
    const-string p0, "InvokeRequestListeners"

    .line 1231
    .line 1232
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    iget-object p0, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1236
    .line 1237
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 1238
    .line 1239
    .line 1240
    move-result p0

    .line 1241
    move p2, v1

    .line 1242
    :goto_21
    if-ge p2, p0, :cond_2b

    .line 1243
    .line 1244
    iget-object p3, p1, La/tw9;->d:Ljava/util/ArrayList;

    .line 1245
    .line 1246
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p3

    .line 1250
    check-cast p3, La/gnf0;

    .line 1251
    .line 1252
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 1253
    .line 1254
    .line 1255
    move-result-object p4

    .line 1256
    iget-object p4, p4, La/cmf0;->d:Ljava/util/List;

    .line 1257
    .line 1258
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 1259
    .line 1260
    .line 1261
    move-result p4

    .line 1262
    move v0, v1

    .line 1263
    :goto_22
    if-ge v0, p4, :cond_2a

    .line 1264
    .line 1265
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    iget-object v2, v2, La/cmf0;->d:Ljava/util/List;

    .line 1270
    .line 1271
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v2

    .line 1275
    check-cast v2, La/bmf0;

    .line 1276
    .line 1277
    invoke-interface {p3}, La/gnf0;->getRequest()La/cmf0;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    invoke-interface {v2, v3}, La/bmf0;->q(La/cmf0;)V

    .line 1282
    .line 1283
    .line 1284
    add-int/lit8 v0, v0, 0x1

    .line 1285
    .line 1286
    goto :goto_22

    .line 1287
    :cond_2a
    add-int/lit8 p2, p2, 0x1

    .line 1288
    .line 1289
    goto :goto_21

    .line 1290
    :cond_2b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1291
    .line 1292
    .line 1293
    goto :goto_23

    .line 1294
    :catchall_7
    move-exception v0

    .line 1295
    move-object p0, v0

    .line 1296
    monitor-exit p2

    .line 1297
    throw p0

    .line 1298
    :catch_2
    :cond_2c
    :goto_23
    return v1

    .line 1299
    :catchall_8
    move-exception v0

    .line 1300
    move-object p0, v0

    .line 1301
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1302
    .line 1303
    .line 1304
    throw p0
.end method

.method public a(La/fq80;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/ucs0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/util/SparseArray;

    .line 8
    .line 9
    iget-object v3, v0, La/ucs0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Landroid/util/SparseIntArray;

    .line 12
    .line 13
    iget-object v4, v0, La/ucs0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/q8b;

    .line 16
    .line 17
    iget-object v5, v0, La/ucs0;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/xrs0;

    .line 20
    .line 21
    iget-object v6, v5, La/xrs0;->h:Landroid/util/SparseArray;

    .line 22
    .line 23
    iget-object v7, v5, La/xrs0;->i:Landroid/util/SparseBooleanArray;

    .line 24
    .line 25
    iget-object v8, v5, La/xrs0;->f:La/tyj;

    .line 26
    .line 27
    iget-object v9, v5, La/xrs0;->c:Ljava/util/List;

    .line 28
    .line 29
    iget-byte v10, v5, La/xrs0;->a:B

    .line 30
    .line 31
    invoke-virtual {v1}, La/fq80;->z()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    const/4 v12, 0x2

    .line 36
    if-eq v11, v12, :cond_0

    .line 37
    .line 38
    goto/16 :goto_14

    .line 39
    .line 40
    :cond_0
    const/4 v11, 0x0

    .line 41
    const/4 v13, 0x1

    .line 42
    if-eq v10, v13, :cond_2

    .line 43
    .line 44
    if-eq v10, v12, :cond_2

    .line 45
    .line 46
    iget v14, v5, La/xrs0;->n:I

    .line 47
    .line 48
    if-ne v14, v13, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v14, La/coq0;

    .line 52
    .line 53
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v15

    .line 57
    check-cast v15, La/coq0;

    .line 58
    .line 59
    invoke-virtual {v15}, La/coq0;->d()J

    .line 60
    .line 61
    .line 62
    move-result-wide v12

    .line 63
    invoke-direct {v14, v12, v13}, La/coq0;-><init>(J)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_0
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    move-object v14, v9

    .line 75
    check-cast v14, La/coq0;

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v1}, La/fq80;->z()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    and-int/lit16 v9, v9, 0x80

    .line 82
    .line 83
    if-nez v9, :cond_3

    .line 84
    .line 85
    goto/16 :goto_14

    .line 86
    .line 87
    :cond_3
    const/4 v9, 0x1

    .line 88
    invoke-virtual {v1, v9}, La/fq80;->N(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, La/fq80;->G()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/4 v12, 0x3

    .line 96
    invoke-virtual {v1, v12}, La/fq80;->N(I)V

    .line 97
    .line 98
    .line 99
    iget-object v13, v4, La/q8b;->b:[B

    .line 100
    .line 101
    const/4 v15, 0x2

    .line 102
    invoke-virtual {v1, v13, v11, v15}, La/fq80;->k([BII)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v11}, La/q8b;->m(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v12}, La/q8b;->o(I)V

    .line 109
    .line 110
    .line 111
    const/16 v13, 0xd

    .line 112
    .line 113
    invoke-virtual {v4, v13}, La/q8b;->g(I)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iput v12, v5, La/xrs0;->t:I

    .line 118
    .line 119
    iget-object v12, v4, La/q8b;->b:[B

    .line 120
    .line 121
    invoke-virtual {v1, v12, v11, v15}, La/fq80;->k([BII)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v11}, La/q8b;->m(I)V

    .line 125
    .line 126
    .line 127
    const/4 v12, 0x4

    .line 128
    invoke-virtual {v4, v12}, La/q8b;->o(I)V

    .line 129
    .line 130
    .line 131
    const/16 v12, 0xc

    .line 132
    .line 133
    invoke-virtual {v4, v12}, La/q8b;->g(I)I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    invoke-virtual {v1, v13}, La/fq80;->N(I)V

    .line 138
    .line 139
    .line 140
    const/16 v13, 0x2000

    .line 141
    .line 142
    const/16 v12, 0x15

    .line 143
    .line 144
    if-ne v10, v15, :cond_4

    .line 145
    .line 146
    iget-object v15, v5, La/xrs0;->r:La/ass0;

    .line 147
    .line 148
    if-nez v15, :cond_4

    .line 149
    .line 150
    new-instance v18, La/sbx0;

    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    sget-object v23, La/vtt0;->b:[B

    .line 155
    .line 156
    const/16 v19, 0x15

    .line 157
    .line 158
    const/16 v20, 0x0

    .line 159
    .line 160
    const/16 v21, 0x0

    .line 161
    .line 162
    invoke-direct/range {v18 .. v23}, La/sbx0;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v15, v18

    .line 166
    .line 167
    invoke-virtual {v8, v12, v15}, La/tyj;->a(ILa/sbx0;)La/ass0;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    iput-object v15, v5, La/xrs0;->r:La/ass0;

    .line 172
    .line 173
    if-eqz v15, :cond_4

    .line 174
    .line 175
    iget-object v11, v5, La/xrs0;->m:La/huo;

    .line 176
    .line 177
    new-instance v0, La/zrs0;

    .line 178
    .line 179
    invoke-direct {v0, v9, v12, v13}, La/zrs0;-><init>(III)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v15, v14, v11, v0}, La/ass0;->b(La/coq0;La/huo;La/zrs0;)V

    .line 183
    .line 184
    .line 185
    :cond_4
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->clear()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, La/fq80;->a()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    :goto_2
    if-lez v0, :cond_1d

    .line 196
    .line 197
    iget-object v11, v4, La/q8b;->b:[B

    .line 198
    .line 199
    const/4 v15, 0x5

    .line 200
    const/4 v13, 0x0

    .line 201
    invoke-virtual {v1, v11, v13, v15}, La/fq80;->k([BII)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v13}, La/q8b;->m(I)V

    .line 205
    .line 206
    .line 207
    const/16 v11, 0x8

    .line 208
    .line 209
    invoke-virtual {v4, v11}, La/q8b;->g(I)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    const/4 v13, 0x3

    .line 214
    invoke-virtual {v4, v13}, La/q8b;->o(I)V

    .line 215
    .line 216
    .line 217
    const/16 v13, 0xd

    .line 218
    .line 219
    invoke-virtual {v4, v13}, La/q8b;->g(I)I

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    const/4 v13, 0x4

    .line 224
    invoke-virtual {v4, v13}, La/q8b;->o(I)V

    .line 225
    .line 226
    .line 227
    const/16 v13, 0xc

    .line 228
    .line 229
    invoke-virtual {v4, v13}, La/q8b;->g(I)I

    .line 230
    .line 231
    .line 232
    move-result v17

    .line 233
    iget v13, v1, La/fq80;->b:I

    .line 234
    .line 235
    add-int v15, v13, v17

    .line 236
    .line 237
    const/16 v23, -0x1

    .line 238
    .line 239
    const/16 v24, 0x0

    .line 240
    .line 241
    move/from16 v26, v23

    .line 242
    .line 243
    move-object/from16 v27, v24

    .line 244
    .line 245
    move-object/from16 v29, v27

    .line 246
    .line 247
    const/16 v28, 0x0

    .line 248
    .line 249
    move/from16 v23, v0

    .line 250
    .line 251
    :goto_3
    iget v0, v1, La/fq80;->b:I

    .line 252
    .line 253
    if-ge v0, v15, :cond_15

    .line 254
    .line 255
    invoke-virtual {v1}, La/fq80;->z()I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    invoke-virtual {v1}, La/fq80;->z()I

    .line 260
    .line 261
    .line 262
    move-result v24

    .line 263
    move-object/from16 v31, v4

    .line 264
    .line 265
    iget v4, v1, La/fq80;->b:I

    .line 266
    .line 267
    add-int v4, v4, v24

    .line 268
    .line 269
    if-le v4, v15, :cond_5

    .line 270
    .line 271
    :goto_4
    move-object/from16 v32, v6

    .line 272
    .line 273
    move/from16 v33, v9

    .line 274
    .line 275
    move-object/from16 v16, v14

    .line 276
    .line 277
    const/4 v4, 0x4

    .line 278
    goto/16 :goto_b

    .line 279
    .line 280
    :cond_5
    const/16 v24, 0xac

    .line 281
    .line 282
    const/16 v25, 0x87

    .line 283
    .line 284
    const/16 v30, 0x81

    .line 285
    .line 286
    move-object/from16 v32, v6

    .line 287
    .line 288
    const/4 v6, 0x5

    .line 289
    if-ne v0, v6, :cond_a

    .line 290
    .line 291
    invoke-virtual {v1}, La/fq80;->B()J

    .line 292
    .line 293
    .line 294
    move-result-wide v33

    .line 295
    const-wide/32 v35, 0x41432d33

    .line 296
    .line 297
    .line 298
    cmp-long v0, v33, v35

    .line 299
    .line 300
    if-nez v0, :cond_6

    .line 301
    .line 302
    move/from16 v26, v30

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_6
    const-wide/32 v35, 0x45414333

    .line 306
    .line 307
    .line 308
    cmp-long v0, v33, v35

    .line 309
    .line 310
    if-nez v0, :cond_7

    .line 311
    .line 312
    move/from16 v26, v25

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_7
    const-wide/32 v35, 0x41432d34

    .line 316
    .line 317
    .line 318
    cmp-long v0, v33, v35

    .line 319
    .line 320
    if-nez v0, :cond_8

    .line 321
    .line 322
    :goto_5
    move/from16 v26, v24

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_8
    const-wide/32 v24, 0x48455643

    .line 326
    .line 327
    .line 328
    cmp-long v0, v33, v24

    .line 329
    .line 330
    if-nez v0, :cond_9

    .line 331
    .line 332
    const/16 v26, 0x24

    .line 333
    .line 334
    :cond_9
    :goto_6
    move/from16 v25, v4

    .line 335
    .line 336
    :goto_7
    move/from16 v33, v9

    .line 337
    .line 338
    move-object/from16 v16, v14

    .line 339
    .line 340
    :goto_8
    const/4 v4, 0x4

    .line 341
    goto/16 :goto_a

    .line 342
    .line 343
    :cond_a
    const/16 v6, 0x6a

    .line 344
    .line 345
    if-ne v0, v6, :cond_b

    .line 346
    .line 347
    move/from16 v25, v4

    .line 348
    .line 349
    move/from16 v33, v9

    .line 350
    .line 351
    move-object/from16 v16, v14

    .line 352
    .line 353
    move/from16 v26, v30

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_b
    const/16 v6, 0x7a

    .line 357
    .line 358
    if-ne v0, v6, :cond_c

    .line 359
    .line 360
    move/from16 v33, v9

    .line 361
    .line 362
    move-object/from16 v16, v14

    .line 363
    .line 364
    move/from16 v26, v25

    .line 365
    .line 366
    move/from16 v25, v4

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_c
    const/16 v6, 0x7f

    .line 370
    .line 371
    if-ne v0, v6, :cond_f

    .line 372
    .line 373
    invoke-virtual {v1}, La/fq80;->z()I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    const/16 v6, 0x15

    .line 378
    .line 379
    if-ne v0, v6, :cond_d

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_d
    const/16 v6, 0xe

    .line 383
    .line 384
    if-ne v0, v6, :cond_e

    .line 385
    .line 386
    const/16 v26, 0x88

    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_e
    const/16 v6, 0x21

    .line 390
    .line 391
    if-ne v0, v6, :cond_9

    .line 392
    .line 393
    const/16 v26, 0x8b

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_f
    const/16 v6, 0x7b

    .line 397
    .line 398
    if-ne v0, v6, :cond_10

    .line 399
    .line 400
    const/16 v0, 0x8a

    .line 401
    .line 402
    move/from16 v26, v0

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_10
    const/16 v6, 0xa

    .line 406
    .line 407
    if-ne v0, v6, :cond_11

    .line 408
    .line 409
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 410
    .line 411
    const/4 v6, 0x3

    .line 412
    invoke-virtual {v1, v6, v0}, La/fq80;->x(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v1}, La/fq80;->z()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    move-object/from16 v27, v0

    .line 425
    .line 426
    move/from16 v25, v4

    .line 427
    .line 428
    move/from16 v28, v6

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_11
    const/16 v6, 0x59

    .line 432
    .line 433
    if-ne v0, v6, :cond_13

    .line 434
    .line 435
    new-instance v0, Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 438
    .line 439
    .line 440
    :goto_9
    iget v6, v1, La/fq80;->b:I

    .line 441
    .line 442
    if-ge v6, v4, :cond_12

    .line 443
    .line 444
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 445
    .line 446
    move/from16 v25, v4

    .line 447
    .line 448
    const/4 v4, 0x3

    .line 449
    invoke-virtual {v1, v4, v6}, La/fq80;->x(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-virtual {v1}, La/fq80;->z()I

    .line 458
    .line 459
    .line 460
    move-object/from16 v16, v14

    .line 461
    .line 462
    const/4 v4, 0x4

    .line 463
    new-array v14, v4, [B

    .line 464
    .line 465
    move/from16 v33, v9

    .line 466
    .line 467
    const/4 v9, 0x0

    .line 468
    invoke-virtual {v1, v14, v9, v4}, La/fq80;->k([BII)V

    .line 469
    .line 470
    .line 471
    new-instance v9, La/yrs0;

    .line 472
    .line 473
    invoke-direct {v9, v6, v14}, La/yrs0;-><init>(Ljava/lang/String;[B)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-object/from16 v14, v16

    .line 480
    .line 481
    move/from16 v4, v25

    .line 482
    .line 483
    move/from16 v9, v33

    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_12
    move/from16 v25, v4

    .line 487
    .line 488
    move/from16 v33, v9

    .line 489
    .line 490
    move-object/from16 v16, v14

    .line 491
    .line 492
    const/4 v4, 0x4

    .line 493
    move-object/from16 v29, v0

    .line 494
    .line 495
    const/16 v26, 0x59

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_13
    move/from16 v25, v4

    .line 499
    .line 500
    move/from16 v33, v9

    .line 501
    .line 502
    move-object/from16 v16, v14

    .line 503
    .line 504
    const/4 v4, 0x4

    .line 505
    const/16 v6, 0x6f

    .line 506
    .line 507
    if-ne v0, v6, :cond_14

    .line 508
    .line 509
    const/16 v0, 0x101

    .line 510
    .line 511
    move/from16 v26, v0

    .line 512
    .line 513
    :cond_14
    :goto_a
    iget v0, v1, La/fq80;->b:I

    .line 514
    .line 515
    sub-int v0, v25, v0

    .line 516
    .line 517
    invoke-virtual {v1, v0}, La/fq80;->N(I)V

    .line 518
    .line 519
    .line 520
    move-object/from16 v14, v16

    .line 521
    .line 522
    move-object/from16 v4, v31

    .line 523
    .line 524
    move-object/from16 v6, v32

    .line 525
    .line 526
    move/from16 v9, v33

    .line 527
    .line 528
    goto/16 :goto_3

    .line 529
    .line 530
    :cond_15
    move-object/from16 v31, v4

    .line 531
    .line 532
    goto/16 :goto_4

    .line 533
    .line 534
    :goto_b
    invoke-virtual {v1, v15}, La/fq80;->M(I)V

    .line 535
    .line 536
    .line 537
    new-instance v25, La/sbx0;

    .line 538
    .line 539
    iget-object v0, v1, La/fq80;->a:[B

    .line 540
    .line 541
    invoke-static {v0, v13, v15}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 542
    .line 543
    .line 544
    move-result-object v30

    .line 545
    invoke-direct/range {v25 .. v30}, La/sbx0;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 546
    .line 547
    .line 548
    move-object/from16 v0, v25

    .line 549
    .line 550
    const/4 v6, 0x6

    .line 551
    if-eq v11, v6, :cond_16

    .line 552
    .line 553
    const/4 v6, 0x5

    .line 554
    if-ne v11, v6, :cond_17

    .line 555
    .line 556
    :cond_16
    move/from16 v11, v26

    .line 557
    .line 558
    :cond_17
    add-int/lit8 v17, v17, 0x5

    .line 559
    .line 560
    sub-int v6, v23, v17

    .line 561
    .line 562
    const/4 v15, 0x2

    .line 563
    if-ne v10, v15, :cond_18

    .line 564
    .line 565
    move v9, v11

    .line 566
    goto :goto_c

    .line 567
    :cond_18
    move v9, v12

    .line 568
    :goto_c
    invoke-virtual {v7, v9}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 569
    .line 570
    .line 571
    move-result v13

    .line 572
    if-eqz v13, :cond_19

    .line 573
    .line 574
    const/16 v13, 0x15

    .line 575
    .line 576
    goto :goto_e

    .line 577
    :cond_19
    const/16 v13, 0x15

    .line 578
    .line 579
    if-ne v10, v15, :cond_1a

    .line 580
    .line 581
    if-ne v11, v13, :cond_1a

    .line 582
    .line 583
    iget-object v0, v5, La/xrs0;->r:La/ass0;

    .line 584
    .line 585
    goto :goto_d

    .line 586
    :cond_1a
    invoke-virtual {v8, v11, v0}, La/tyj;->a(ILa/sbx0;)La/ass0;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    :goto_d
    if-ne v10, v15, :cond_1b

    .line 591
    .line 592
    const/16 v11, 0x2000

    .line 593
    .line 594
    invoke-virtual {v3, v9, v11}, Landroid/util/SparseIntArray;->get(II)I

    .line 595
    .line 596
    .line 597
    move-result v14

    .line 598
    if-ge v12, v14, :cond_1c

    .line 599
    .line 600
    :cond_1b
    invoke-virtual {v3, v9, v12}, Landroid/util/SparseIntArray;->put(II)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    :cond_1c
    :goto_e
    move v0, v6

    .line 607
    move v12, v13

    .line 608
    move-object/from16 v14, v16

    .line 609
    .line 610
    move-object/from16 v4, v31

    .line 611
    .line 612
    move-object/from16 v6, v32

    .line 613
    .line 614
    move/from16 v9, v33

    .line 615
    .line 616
    const/16 v13, 0x2000

    .line 617
    .line 618
    goto/16 :goto_2

    .line 619
    .line 620
    :cond_1d
    move-object/from16 v32, v6

    .line 621
    .line 622
    move/from16 v33, v9

    .line 623
    .line 624
    move-object/from16 v16, v14

    .line 625
    .line 626
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    const/4 v13, 0x0

    .line 631
    :goto_f
    if-ge v13, v0, :cond_20

    .line 632
    .line 633
    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    const/4 v9, 0x1

    .line 642
    invoke-virtual {v7, v1, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 643
    .line 644
    .line 645
    iget-object v6, v5, La/xrs0;->j:Landroid/util/SparseBooleanArray;

    .line 646
    .line 647
    invoke-virtual {v6, v4, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    check-cast v6, La/ass0;

    .line 655
    .line 656
    if-eqz v6, :cond_1f

    .line 657
    .line 658
    iget-object v8, v5, La/xrs0;->r:La/ass0;

    .line 659
    .line 660
    if-eq v6, v8, :cond_1e

    .line 661
    .line 662
    iget-object v8, v5, La/xrs0;->m:La/huo;

    .line 663
    .line 664
    new-instance v9, La/zrs0;

    .line 665
    .line 666
    move/from16 v11, v33

    .line 667
    .line 668
    const/16 v12, 0x2000

    .line 669
    .line 670
    invoke-direct {v9, v11, v1, v12}, La/zrs0;-><init>(III)V

    .line 671
    .line 672
    .line 673
    move-object/from16 v14, v16

    .line 674
    .line 675
    invoke-interface {v6, v14, v8, v9}, La/ass0;->b(La/coq0;La/huo;La/zrs0;)V

    .line 676
    .line 677
    .line 678
    :goto_10
    move-object/from16 v1, v32

    .line 679
    .line 680
    goto :goto_11

    .line 681
    :cond_1e
    move-object/from16 v14, v16

    .line 682
    .line 683
    move/from16 v11, v33

    .line 684
    .line 685
    const/16 v12, 0x2000

    .line 686
    .line 687
    goto :goto_10

    .line 688
    :goto_11
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_1f
    move-object/from16 v14, v16

    .line 693
    .line 694
    move-object/from16 v1, v32

    .line 695
    .line 696
    move/from16 v11, v33

    .line 697
    .line 698
    const/16 v12, 0x2000

    .line 699
    .line 700
    :goto_12
    add-int/lit8 v13, v13, 0x1

    .line 701
    .line 702
    move-object/from16 v32, v1

    .line 703
    .line 704
    move/from16 v33, v11

    .line 705
    .line 706
    move-object/from16 v16, v14

    .line 707
    .line 708
    goto :goto_f

    .line 709
    :cond_20
    move-object/from16 v1, v32

    .line 710
    .line 711
    const/4 v15, 0x2

    .line 712
    if-ne v10, v15, :cond_21

    .line 713
    .line 714
    iget-boolean v0, v5, La/xrs0;->o:Z

    .line 715
    .line 716
    if-nez v0, :cond_23

    .line 717
    .line 718
    iget-object v0, v5, La/xrs0;->m:La/huo;

    .line 719
    .line 720
    invoke-interface {v0}, La/huo;->o()V

    .line 721
    .line 722
    .line 723
    const/4 v9, 0x0

    .line 724
    iput v9, v5, La/xrs0;->n:I

    .line 725
    .line 726
    const/4 v0, 0x1

    .line 727
    iput-boolean v0, v5, La/xrs0;->o:Z

    .line 728
    .line 729
    return-void

    .line 730
    :cond_21
    move-object/from16 v2, p0

    .line 731
    .line 732
    const/4 v0, 0x1

    .line 733
    const/4 v9, 0x0

    .line 734
    iget v2, v2, La/ucs0;->b:I

    .line 735
    .line 736
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 737
    .line 738
    .line 739
    if-ne v10, v0, :cond_22

    .line 740
    .line 741
    move v11, v9

    .line 742
    goto :goto_13

    .line 743
    :cond_22
    iget v1, v5, La/xrs0;->n:I

    .line 744
    .line 745
    add-int/lit8 v11, v1, -0x1

    .line 746
    .line 747
    :goto_13
    iput v11, v5, La/xrs0;->n:I

    .line 748
    .line 749
    if-nez v11, :cond_23

    .line 750
    .line 751
    iget-object v1, v5, La/xrs0;->m:La/huo;

    .line 752
    .line 753
    invoke-interface {v1}, La/huo;->o()V

    .line 754
    .line 755
    .line 756
    iput-boolean v0, v5, La/xrs0;->o:Z

    .line 757
    .line 758
    :cond_23
    :goto_14
    return-void
.end method

.method public b(La/coq0;La/huo;La/zrs0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(La/are0;)La/hzs0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/xg;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/gaz;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/f7u;

    .line 20
    .line 21
    iget-object p0, p0, La/f7u;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/mzs0;

    .line 24
    .line 25
    invoke-interface {p0, p1}, La/mzs0;->c(La/are0;)La/hzs0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public d()V
    .locals 10

    .line 1
    iget-object v0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/tw9;

    .line 37
    .line 38
    const-string v2, "InvokeInternalListeners"

    .line 39
    .line 40
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v1, La/tw9;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    move v4, v3

    .line 51
    :goto_1
    if-ge v4, v2, :cond_1

    .line 52
    .line 53
    iget-object v5, v1, La/tw9;->d:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, La/gnf0;

    .line 60
    .line 61
    iget-object v6, v1, La/tw9;->e:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    move v7, v3

    .line 68
    :goto_2
    if-ge v7, v6, :cond_0

    .line 69
    .line 70
    iget-object v8, v1, La/tw9;->e:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, La/bmf0;

    .line 77
    .line 78
    invoke-interface {v5}, La/gnf0;->getRequest()La/cmf0;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-interface {v8, v9}, La/bmf0;->q(La/cmf0;)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 92
    .line 93
    .line 94
    const-string v2, "InvokeRequestListeners"

    .line 95
    .line 96
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, La/tw9;->d:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    move v4, v3

    .line 106
    :goto_3
    if-ge v4, v2, :cond_3

    .line 107
    .line 108
    iget-object v5, v1, La/tw9;->d:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, La/gnf0;

    .line 115
    .line 116
    invoke-interface {v5}, La/gnf0;->getRequest()La/cmf0;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v6, v6, La/cmf0;->d:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    move v7, v3

    .line 127
    :goto_4
    if-ge v7, v6, :cond_2

    .line 128
    .line 129
    invoke-interface {v5}, La/gnf0;->getRequest()La/cmf0;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    iget-object v8, v8, La/cmf0;->d:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    check-cast v8, La/bmf0;

    .line 140
    .line 141
    invoke-interface {v5}, La/gnf0;->getRequest()La/cmf0;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-interface {v8, v9}, La/bmf0;->q(La/cmf0;)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_4
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, La/uw9;

    .line 162
    .line 163
    iget-object v0, p0, La/uw9;->i:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v0

    .line 166
    :try_start_1
    const-string v1, "CXCP"

    .line 167
    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v3, "#abortCaptures"

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    iget-object p0, p0, La/uw9;->a:La/fy9;

    .line 189
    .line 190
    invoke-interface {p0}, La/fy9;->C()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    .line 192
    .line 193
    monitor-exit v0

    .line 194
    return-void

    .line 195
    :catchall_0
    move-exception p0

    .line 196
    monitor-exit v0

    .line 197
    throw p0

    .line 198
    :catchall_1
    move-exception p0

    .line 199
    monitor-exit v0

    .line 200
    throw p0
.end method

.method public e(Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/vx9;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/ucs0;->f(La/vx9;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public f(La/vx9;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g(La/drd;)V
    .locals 5

    .line 1
    invoke-interface {p1}, La/drd;->c()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/u15;

    .line 20
    .line 21
    iget-object v2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/wy40;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v1, v3}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v1}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, La/wy40;

    .line 36
    .line 37
    invoke-interface {p1, v1}, La/drd;->g(La/u15;)La/crd;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v1, v4, v2}, La/wy40;->x(La/u15;La/crd;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public h(DF)V
    .locals 4

    .line 1
    iget-object v0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iget-object v1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [D

    .line 11
    .line 12
    invoke-static {v1, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    neg-int v1, v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, [D

    .line 24
    .line 25
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v2, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, [F

    .line 34
    .line 35
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    new-array v2, v0, [D

    .line 42
    .line 43
    iput-object v2, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, [D

    .line 48
    .line 49
    add-int/lit8 v3, v1, 0x1

    .line 50
    .line 51
    sub-int/2addr v0, v1

    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    invoke-static {v2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, [D

    .line 60
    .line 61
    aput-wide p1, v0, v1

    .line 62
    .line 63
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, [F

    .line 66
    .line 67
    aput p3, p0, v1

    .line 68
    .line 69
    return-void
.end method

.method public j()La/t7a;
    .locals 9

    .line 1
    new-instance v0, La/t7a;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/wy40;

    .line 15
    .line 16
    invoke-static {v2}, La/b780;->j(La/drd;)La/b780;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget v3, p0, La/ucs0;->b:I

    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v5, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/tz40;

    .line 34
    .line 35
    sget-object v5, La/eoo0;->b:La/eoo0;

    .line 36
    .line 37
    new-instance v5, Landroid/util/ArrayMap;

    .line 38
    .line 39
    invoke-direct {v5}, Landroid/util/ArrayMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p0, v7}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v5, v7, v8}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p0, La/eoo0;

    .line 73
    .line 74
    invoke-direct {p0, v5}, La/eoo0;-><init>(Landroid/util/ArrayMap;)V

    .line 75
    .line 76
    .line 77
    move-object v5, p0

    .line 78
    invoke-direct/range {v0 .. v5}, La/t7a;-><init>(Ljava/util/ArrayList;La/b780;ILjava/util/ArrayList;La/eoo0;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public k(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget p0, p0, La/ucs0;->b:I

    .line 2
    .line 3
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, La/n4c;->H()V

    .line 11
    .line 12
    .line 13
    return p0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, La/drv0;->a:La/drv0;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, La/drv0;->a(Landroid/graphics/Paint;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, La/fbc;->d(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
.end method

.method public m()I
    .locals 2

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, La/r03;->a:[I

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    aget p0, v0, p0

    .line 20
    .line 21
    :goto_0
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return v1

    .line 32
    :cond_2
    return v0

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public n()I
    .locals 2

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, La/r03;->b:[I

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    aget p0, v0, p0

    .line 20
    .line 21
    :goto_0
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq p0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return v0

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public o(La/ucs0;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [La/tjf0;

    .line 4
    .line 5
    aget-object v0, v0, p2

    .line 6
    .line 7
    iget-object v1, p1, La/ucs0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [La/tjf0;

    .line 10
    .line 11
    aget-object v1, v1, p2

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, [La/fmo;

    .line 22
    .line 23
    aget-object p0, p0, p2

    .line 24
    .line 25
    iget-object p1, p1, La/ucs0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, [La/fmo;

    .line 28
    .line 29
    aget-object p1, p1, p2

    .line 30
    .line 31
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public p(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [La/tjf0;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public q(F)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/high16 v0, 0x437f0000    # 255.0f

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    float-to-double v0, p1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float p1, v0

    .line 14
    float-to-int p1, p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public r(I)V
    .locals 2

    .line 1
    iget v0, p0, La/ucs0;->b:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, La/ucs0;->b:I

    .line 7
    .line 8
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/graphics/Paint;

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1d

    .line 15
    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    sget-object v0, La/drv0;->a:La/drv0;

    .line 19
    .line 20
    invoke-virtual {v0, p0, p1}, La/drv0;->b(Landroid/graphics/Paint;I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 25
    .line 26
    invoke-static {p1}, La/dj8;->d0(I)Landroid/graphics/PorterDuff$Mode;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public s(J)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, La/drv0;->a:La/drv0;

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1, p2}, La/drv0;->c(Landroid/graphics/Paint;J)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p1, p2}, La/fbc;->U(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public t(La/a4d;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, La/a4d;->a:Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ucs0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "pos ="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, [D

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " period="

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, [F

    .line 37
    .line 38
    invoke-static {p0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "GraphRequestProcessor-"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget p0, p0, La/ucs0;->b:I

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    xor-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public v(La/x03;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p1, La/x03;->a:Landroid/graphics/PathEffect;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/ucs0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public w(Landroid/graphics/Shader;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    if-nez p1, :cond_2

    .line 18
    .line 19
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public y(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x2

    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_2

    .line 18
    .line 19
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public z(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
