.class public abstract La/tut0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:La/wut0;

.field public static b:La/vkr0;

.field public static c:La/fvt0;

.field public static final d:Ljava/util/ArrayList;

.field public static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/tut0;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v0, La/w7f;->y:La/w7f;

    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final a(La/vvt0;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v1, La/tut0;->b:La/vkr0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v1, :cond_4

    .line 5
    .line 6
    iget-object v2, v1, La/vkr0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, La/wut0;

    .line 9
    .line 10
    iget-object v3, v2, La/wut0;->e:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, p0, La/vvt0;->c:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    iget-object v5, v2, La/wut0;->o:Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Ljava/lang/String;

    .line 21
    .line 22
    const-string v6, "lang"

    .line 23
    .line 24
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, La/vvt0;->c:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    iget-object v5, v2, La/wut0;->d:La/a8z;

    .line 30
    .line 31
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "device_id"

    .line 36
    .line 37
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v2, v2, La/wut0;->u:La/a8z;

    .line 41
    .line 42
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    iget-object v4, p0, La/vvt0;->c:Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    const-string v5, "external_device_id"

    .line 53
    .line 54
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v2, p0, La/vvt0;->c:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    const-string v4, "v"

    .line 60
    .line 61
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v2, La/fd40;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    iput v4, v2, La/fd40;->a:I

    .line 71
    .line 72
    const-string v7, ""

    .line 73
    .line 74
    iput-object v7, v2, La/fd40;->b:Ljava/lang/String;

    .line 75
    .line 76
    iput-object v7, v2, La/fd40;->c:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v4, v2, La/fd40;->e:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v5, 0x4

    .line 86
    iput-byte v5, v2, La/fd40;->d:B

    .line 87
    .line 88
    iget-object v5, p0, La/vvt0;->c:Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-interface {v4, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    iget-object v4, p0, La/vvt0;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iput-object v4, v2, La/fd40;->b:Ljava/lang/String;

    .line 99
    .line 100
    iget v4, p0, La/vvt0;->b:I

    .line 101
    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    iput v4, v2, La/fd40;->a:I

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iput-object v3, v2, La/fd40;->c:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v8, La/svt0;

    .line 112
    .line 113
    invoke-direct {v8, v2}, La/svt0;-><init>(La/fd40;)V

    .line 114
    .line 115
    .line 116
    move-object v2, v0

    .line 117
    new-instance v0, La/ce40;

    .line 118
    .line 119
    move-object v3, v2

    .line 120
    invoke-virtual {v1}, La/vkr0;->m()La/kf60;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v4, v3

    .line 125
    new-instance v3, La/ywu;

    .line 126
    .line 127
    const/16 v5, 0xc

    .line 128
    .line 129
    invoke-direct {v3, v5}, La/ywu;-><init>(B)V

    .line 130
    .line 131
    .line 132
    iput-object v7, v3, La/ywu;->b:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v7, v3, La/ywu;->c:Ljava/lang/Object;

    .line 135
    .line 136
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v5, v3, La/ywu;->d:Ljava/lang/Object;

    .line 142
    .line 143
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v9, v8, La/svt0;->b:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iput-object v9, v3, La/ywu;->b:Ljava/lang/Object;

    .line 154
    .line 155
    iget-object v6, v8, La/svt0;->c:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iput-object v6, v3, La/ywu;->c:Ljava/lang/Object;

    .line 161
    .line 162
    iget-object v6, v8, La/svt0;->d:Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-interface {v5, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 168
    .line 169
    .line 170
    iget-byte v10, v8, La/svt0;->e:B

    .line 171
    .line 172
    iget v5, v8, La/svt0;->a:I

    .line 173
    .line 174
    if-eqz v5, :cond_2

    .line 175
    .line 176
    iget-object v4, v1, La/vkr0;->b:Ljava/lang/Object;

    .line 177
    .line 178
    move-object v11, v4

    .line 179
    check-cast v11, La/wut0;

    .line 180
    .line 181
    iget-object v4, v11, La/wut0;->d:La/a8z;

    .line 182
    .line 183
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    iget-object v5, v11, La/wut0;->o:Lkotlin/jvm/functions/Function0;

    .line 190
    .line 191
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/lang/String;

    .line 196
    .line 197
    move-object v6, p0

    .line 198
    invoke-direct/range {v0 .. v6}, La/ce40;-><init>(La/vkr0;La/kf60;La/ywu;Ljava/lang/String;Ljava/lang/String;La/vvt0;)V

    .line 199
    .line 200
    .line 201
    new-instance p0, La/s1o;

    .line 202
    .line 203
    iget-object v2, v1, La/vkr0;->d:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, La/ilp0;

    .line 206
    .line 207
    invoke-direct {p0, v1, v10, v0, v2}, La/s1o;-><init>(La/vkr0;ILa/ce40;La/ilp0;)V

    .line 208
    .line 209
    .line 210
    new-instance v0, La/wa3;

    .line 211
    .line 212
    iget-object v2, v11, La/wut0;->t:La/gfk0;

    .line 213
    .line 214
    invoke-direct {v0, v1, p0, v8, v2}, La/wa3;-><init>(La/vkr0;La/s1o;La/svt0;La/gfk0;)V

    .line 215
    .line 216
    .line 217
    new-instance p0, La/tnx;

    .line 218
    .line 219
    invoke-direct {p0, v1, v0}, La/tnx;-><init>(La/vkr0;La/wa3;)V

    .line 220
    .line 221
    .line 222
    new-instance v0, La/cwq0;

    .line 223
    .line 224
    sget-object v2, La/bwq0;->a:La/bwq0;

    .line 225
    .line 226
    invoke-direct {v0, v1, v10, p0}, La/cwq0;-><init>(La/vkr0;ILa/tnx;)V

    .line 227
    .line 228
    .line 229
    new-instance p0, La/v2e0;

    .line 230
    .line 231
    iget-object v2, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, La/n0o0;

    .line 234
    .line 235
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, La/kvq0;

    .line 240
    .line 241
    invoke-direct {p0, v1, v9, v2, v0}, La/v2e0;-><init>(La/vkr0;Ljava/lang/String;La/kvq0;La/cwq0;)V

    .line 242
    .line 243
    .line 244
    new-instance v0, La/imx;

    .line 245
    .line 246
    const/16 v2, 0x2e

    .line 247
    .line 248
    invoke-static {v9, v2}, Lkotlin/text/StringsKt;->q0(Ljava/lang/String;C)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    iget-object v3, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, La/n0o0;

    .line 255
    .line 256
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, La/kvq0;

    .line 261
    .line 262
    invoke-direct {v0, v1, v2, v3, p0}, La/imx;-><init>(La/vkr0;Ljava/lang/String;La/kvq0;La/v2e0;)V

    .line 263
    .line 264
    .line 265
    new-instance p0, La/imx;

    .line 266
    .line 267
    iget-object v2, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v2, La/n0o0;

    .line 270
    .line 271
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, La/kvq0;

    .line 276
    .line 277
    invoke-direct {p0, v1, v9, v2, v0}, La/imx;-><init>(La/vkr0;Ljava/lang/String;La/kvq0;La/imx;)V

    .line 278
    .line 279
    .line 280
    if-lez v10, :cond_1

    .line 281
    .line 282
    new-instance v0, La/s1o;

    .line 283
    .line 284
    invoke-direct {v0, v1, v10, p0}, La/s1o;-><init>(La/vkr0;ILa/imx;)V

    .line 285
    .line 286
    .line 287
    move-object p0, v0

    .line 288
    :cond_1
    new-instance v0, La/td9;

    .line 289
    .line 290
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 291
    .line 292
    .line 293
    iput-object v7, v0, La/td9;->b:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v7, v0, La/td9;->c:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-virtual {p0, v0}, La/p4;->q0(La/td9;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    return-object p0

    .line 305
    :cond_2
    throw v4

    .line 306
    :cond_3
    move-object v4, v0

    .line 307
    throw v4

    .line 308
    :cond_4
    move-object v4, v0

    .line 309
    const-string p0, "apiManager"

    .line 310
    .line 311
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v4
.end method

.method public static final b(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, La/tut0;->e:I

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f0b0009

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    sput v0, La/tut0;->e:I

    .line 23
    .line 24
    :goto_0
    new-instance v1, La/wut0;

    .line 25
    .line 26
    new-instance v2, La/nvt0;

    .line 27
    .line 28
    invoke-direct {v2, p0}, La/nvt0;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0, v0, v2}, La/wut0;-><init>(Landroid/content/Context;ILa/nvt0;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, La/tut0;->a:La/wut0;

    .line 35
    .line 36
    new-instance p0, La/vkr0;

    .line 37
    .line 38
    invoke-direct {p0, v1}, La/vkr0;-><init>(La/wut0;)V

    .line 39
    .line 40
    .line 41
    sput-object p0, La/tut0;->b:La/vkr0;

    .line 42
    .line 43
    new-instance p0, La/fvt0;

    .line 44
    .line 45
    iget-object v0, v1, La/wut0;->p:La/nmt0;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    sput-object p0, La/tut0;->c:La/fvt0;

    .line 56
    .line 57
    sget-object p0, La/w7f;->x:La/w7f;

    .line 58
    .line 59
    invoke-static {p0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v0, La/tut0;->b:La/vkr0;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, La/vkr0;->m()La/kf60;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/n0o0;->a()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v0, v2}, La/kf60;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    iput-object p0, v0, La/kf60;->c:La/a8z;

    .line 93
    .line 94
    invoke-static {}, La/tut0;->c()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    new-instance p0, La/kvt0;

    .line 101
    .line 102
    const-string v0, "stats.trackVisitor"

    .line 103
    .line 104
    invoke-direct {p0, v0}, La/vvt0;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v0, La/wvt0;->c:La/n0o0;

    .line 108
    .line 109
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 117
    .line 118
    new-instance v2, La/qaq0;

    .line 119
    .line 120
    const/16 v3, 0x9

    .line 121
    .line 122
    invoke-direct {v2, p0, v1, v3}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 126
    .line 127
    .line 128
    :cond_2
    return-void

    .line 129
    :cond_3
    const-string p0, "apiManager"

    .line 130
    .line 131
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_4
    const-string p0, "<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml"

    .line 136
    .line 137
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public static final c()Z
    .locals 4

    .line 1
    sget-object v0, La/tut0;->c:La/fvt0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, La/fvt0;->q()La/uut0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, La/uut0;->h:I

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    iget-wide v2, v0, La/uut0;->d:J

    .line 16
    .line 17
    mul-int/lit16 v1, v1, 0x3e8

    .line 18
    .line 19
    int-to-long v0, v1

    .line 20
    add-long/2addr v2, v0

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    cmp-long v0, v2, v0

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_2
    const-string v0, "authManager"

    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    throw v0
.end method
