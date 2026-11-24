.class public final La/hke;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:La/yzn;

.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;

.field public static final i:Ljava/util/List;

.field public static final j:Ljava/util/List;

.field public static final k:Ljava/util/List;

.field public static final l:Ljava/util/List;

.field public static final m:Ljava/util/List;

.field public static final n:Ljava/util/Map;

.field public static final o:Ljava/util/Map;

.field public static final p:Ljava/util/Map;

.field public static final q:Ljava/util/Map;

.field public static final r:La/odd;

.field public static final s:Ljava/util/List;

.field public static final t:Ljava/util/List;

.field public static final u:Ljava/util/List;

.field public static final v:Ljava/util/Map;

.field public static final w:Ljava/util/Map;

.field public static final x:Ljava/util/Map;

.field public static final y:Ljava/util/Map;

.field public static final z:Ljava/util/Map;


# instance fields
.field public final a:La/iev;

.field public final b:La/c1a;

.field public final c:La/qev;

.field public final d:La/pg00;

.field public e:La/odd;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    filled-new-array {v0, v2, v3}, [Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sput-object v4, La/hke;->f:Ljava/util/List;

    .line 25
    .line 26
    filled-new-array {v0, v3}, [Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sput-object v4, La/hke;->g:Ljava/util/List;

    .line 35
    .line 36
    const/4 v4, 0x6

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const/4 v5, 0x5

    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    filled-new-array {v0, v4, v2, v5}, [Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    sput-object v6, La/hke;->h:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    sput-object v6, La/hke;->i:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    sput-object v6, La/hke;->j:Ljava/util/List;

    .line 67
    .line 68
    filled-new-array {v2, v5}, [Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    sput-object v5, La/hke;->k:Ljava/util/List;

    .line 77
    .line 78
    filled-new-array {v0, v2, v3}, [Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    sput-object v5, La/hke;->l:Ljava/util/List;

    .line 87
    .line 88
    filled-new-array {v0, v3}, [Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    sput-object v5, La/hke;->m:Ljava/util/List;

    .line 97
    .line 98
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 99
    .line 100
    const/4 v6, 0x1

    .line 101
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    new-instance v8, Lkotlin/Pair;

    .line 106
    .line 107
    invoke-direct {v8, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v8}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    sput-object v8, La/hke;->n:Ljava/util/Map;

    .line 115
    .line 116
    new-instance v8, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-direct {v8, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v8}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    sput-object v8, La/hke;->o:Ljava/util/Map;

    .line 126
    .line 127
    sget-object v8, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 128
    .line 129
    new-instance v9, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-direct {v9, v8, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v9}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    sput-object v9, La/hke;->p:Ljava/util/Map;

    .line 139
    .line 140
    new-instance v9, Lkotlin/Pair;

    .line 141
    .line 142
    invoke-direct {v9, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v10, Lkotlin/Pair;

    .line 146
    .line 147
    invoke-direct {v10, v8, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    filled-new-array {v9, v10}, [Lkotlin/Pair;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    invoke-static {v9}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    sput-object v9, La/hke;->q:Ljava/util/Map;

    .line 159
    .line 160
    new-instance v9, La/k0g0;

    .line 161
    .line 162
    const/4 v10, 0x0

    .line 163
    invoke-direct {v9, v1, v10}, La/k0g0;-><init>(ILa/pz2;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v9}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sput-object v1, La/hke;->r:La/odd;

    .line 171
    .line 172
    const/4 v1, 0x0

    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    filled-new-array {v1, v7, v0, v2}, [Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    sput-object v2, La/hke;->s:Ljava/util/List;

    .line 186
    .line 187
    filled-new-array {v1, v3, v7, v0, v4}, [Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    sput-object v2, La/hke;->t:Ljava/util/List;

    .line 196
    .line 197
    filled-new-array {v1, v7, v0}, [Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    sput-object v1, La/hke;->u:Ljava/util/List;

    .line 206
    .line 207
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 208
    .line 209
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 210
    .line 211
    new-instance v4, Lkotlin/Pair;

    .line 212
    .line 213
    invoke-direct {v4, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v4}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    sput-object v4, La/hke;->v:Ljava/util/Map;

    .line 221
    .line 222
    new-instance v4, Lkotlin/Pair;

    .line 223
    .line 224
    invoke-direct {v4, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    new-instance v7, Lkotlin/Pair;

    .line 228
    .line 229
    invoke-direct {v7, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    filled-new-array {v4, v7}, [Lkotlin/Pair;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    sput-object v3, La/hke;->w:Ljava/util/Map;

    .line 241
    .line 242
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 243
    .line 244
    new-instance v4, Lkotlin/Pair;

    .line 245
    .line 246
    invoke-direct {v4, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v4}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    sput-object v1, La/hke;->x:Ljava/util/Map;

    .line 254
    .line 255
    new-instance v1, Lkotlin/Pair;

    .line 256
    .line 257
    invoke-direct {v1, v8, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    sput-object v1, La/hke;->y:Ljava/util/Map;

    .line 265
    .line 266
    new-instance v1, Lkotlin/Pair;

    .line 267
    .line 268
    invoke-direct {v1, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    new-instance v3, Lkotlin/Pair;

    .line 272
    .line 273
    invoke-direct {v3, v8, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    filled-new-array {v1, v3}, [Lkotlin/Pair;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    sput-object v0, La/hke;->z:Ljava/util/Map;

    .line 285
    .line 286
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 287
    .line 288
    new-instance v1, Lkotlin/Pair;

    .line 289
    .line 290
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    new-instance v1, La/yzn;

    .line 301
    .line 302
    invoke-direct {v1, v0, v6}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 303
    .line 304
    .line 305
    sput-object v1, La/hke;->A:La/yzn;

    .line 306
    .line 307
    return-void
.end method

.method public constructor <init>(La/iev;La/c1a;La/qev;La/pg00;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/hke;->a:La/iev;

    .line 17
    .line 18
    iput-object p2, p0, La/hke;->b:La/c1a;

    .line 19
    .line 20
    iput-object p3, p0, La/hke;->c:La/qev;

    .line 21
    .line 22
    iput-object p4, p0, La/hke;->d:La/pg00;

    .line 23
    .line 24
    return-void
.end method

.method public static b(La/hke;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)La/odd;
    .locals 14

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v2, p2

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v0, p8, 0x4

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v3, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object/from16 v3, p3

    .line 17
    .line 18
    :goto_1
    and-int/lit8 v0, p8, 0x8

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    move-object v4, v1

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    move-object/from16 v4, p4

    .line 25
    .line 26
    :goto_2
    and-int/lit8 v0, p8, 0x10

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    move-object v5, v1

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    move-object/from16 v5, p5

    .line 33
    .line 34
    :goto_3
    and-int/lit8 v0, p8, 0x20

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    move-object v6, v1

    .line 39
    goto :goto_4

    .line 40
    :cond_4
    move-object/from16 v6, p6

    .line 41
    .line 42
    :goto_4
    and-int/lit8 v0, p8, 0x40

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    move-object v7, v1

    .line 47
    goto :goto_5

    .line 48
    :cond_5
    move-object/from16 v7, p7

    .line 49
    .line 50
    :goto_5
    const-string v12, "Controller3A#update3A: cancelling previous request "

    .line 51
    .line 52
    iget-object v0, p0, La/hke;->a:La/iev;

    .line 53
    .line 54
    iget-object v0, v0, La/iev;->c:La/bev;

    .line 55
    .line 56
    invoke-virtual {v0}, La/bev;->d()La/cmf0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    iget-object v0, p0, La/hke;->c:La/qev;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/16 v11, 0x380

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    move-object v1, p1

    .line 70
    invoke-static/range {v0 .. v11}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/hke;->a:La/iev;

    .line 74
    .line 75
    iget-object p0, p0, La/hke;->c:La/qev;

    .line 76
    .line 77
    invoke-virtual {p0}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v0, p0}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, La/hke;->r:La/odd;

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    if-eqz p1, :cond_7

    .line 93
    .line 94
    iget v8, p1, La/z40;->a:I

    .line 95
    .line 96
    sget-object v9, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-interface {v0, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Ljava/util/List;

    .line 114
    .line 115
    :cond_7
    if-eqz v2, :cond_8

    .line 116
    .line 117
    iget-byte v8, v2, La/q70;->a:B

    .line 118
    .line 119
    sget-object v9, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-interface {v0, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Ljava/util/List;

    .line 137
    .line 138
    :cond_8
    if-eqz v3, :cond_9

    .line 139
    .line 140
    iget-byte v8, v3, La/va5;->a:B

    .line 141
    .line 142
    sget-object v9, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-interface {v0, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    check-cast v8, Ljava/util/List;

    .line 160
    .line 161
    :cond_9
    if-eqz v4, :cond_a

    .line 162
    .line 163
    iget-byte v8, v4, La/xjq;->a:B

    .line 164
    .line 165
    sget-object v9, Landroid/hardware/camera2/CaptureResult;->FLASH_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-interface {v0, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    check-cast v8, Ljava/util/List;

    .line 183
    .line 184
    :cond_a
    new-instance v13, La/l0g0;

    .line 185
    .line 186
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-direct {v13, v0}, La/l0g0;-><init>(Ljava/util/Map;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, La/hke;->d:La/pg00;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v0, v0, La/pg00;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 199
    .line 200
    invoke-virtual {v0, v13}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, La/hke;->c:La/qev;

    .line 204
    .line 205
    const/4 v10, 0x0

    .line 206
    const/16 v11, 0x380

    .line 207
    .line 208
    const/4 v8, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    move-object v1, p1

    .line 211
    invoke-static/range {v0 .. v11}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, La/hke;->a:La/iev;

    .line 215
    .line 216
    iget-object v1, p0, La/hke;->c:La/qev;

    .line 217
    .line 218
    invoke-virtual {v1}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v0, v1}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 223
    .line 224
    .line 225
    iget-object v0, v13, La/l0g0;->d:La/odd;

    .line 226
    .line 227
    monitor-enter p0

    .line 228
    :try_start_0
    const-string v1, "CXCP"

    .line 229
    .line 230
    new-instance v2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v3, p0, La/hke;->e:La/odd;

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    iget-object v1, p0, La/hke;->e:La/odd;

    .line 248
    .line 249
    if-eqz v1, :cond_b

    .line 250
    .line 251
    const-string v2, "A newer call for 3A state update initiated."

    .line 252
    .line 253
    invoke-static {v1, v2}, La/zvw;->G(La/bby;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :catchall_0
    move-exception v0

    .line 258
    goto :goto_7

    .line 259
    :cond_b
    :goto_6
    iput-object v0, p0, La/hke;->e:La/odd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    .line 261
    monitor-exit p0

    .line 262
    return-object v0

    .line 263
    :goto_7
    monitor-exit p0

    .line 264
    throw v0
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/vt00;La/vt00;La/z40;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;Ljava/lang/Long;La/zje;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    move/from16 v3, p9

    .line 8
    .line 9
    move-object/from16 v4, p12

    .line 10
    .line 11
    iget-object v5, v0, La/hke;->d:La/pg00;

    .line 12
    .line 13
    sget-object v6, La/hke;->r:La/odd;

    .line 14
    .line 15
    iget-object v7, v0, La/hke;->c:La/qev;

    .line 16
    .line 17
    iget-object v8, v0, La/hke;->a:La/iev;

    .line 18
    .line 19
    instance-of v9, v4, La/gke;

    .line 20
    .line 21
    if-eqz v9, :cond_0

    .line 22
    .line 23
    move-object v9, v4

    .line 24
    check-cast v9, La/gke;

    .line 25
    .line 26
    iget v10, v9, La/gke;->r:I

    .line 27
    .line 28
    const/high16 v11, -0x80000000

    .line 29
    .line 30
    and-int v12, v10, v11

    .line 31
    .line 32
    if-eqz v12, :cond_0

    .line 33
    .line 34
    sub-int/2addr v10, v11

    .line 35
    iput v10, v9, La/gke;->r:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v9, La/gke;

    .line 39
    .line 40
    invoke-direct {v9, v0, v4}, La/gke;-><init>(La/hke;La/zje;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v4, v9, La/gke;->p:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object v10, La/wne;->a:La/wne;

    .line 46
    .line 47
    iget v11, v9, La/gke;->r:I

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v13, 0x1

    .line 51
    const-string v14, "CXCP"

    .line 52
    .line 53
    const/4 v15, 0x0

    .line 54
    if-eqz v11, :cond_2

    .line 55
    .line 56
    if-ne v11, v13, :cond_1

    .line 57
    .line 58
    iget-byte v1, v9, La/gke;->o:B

    .line 59
    .line 60
    iget-object v2, v9, La/gke;->n:La/l0g0;

    .line 61
    .line 62
    iget-object v3, v9, La/gke;->m:La/mie0;

    .line 63
    .line 64
    iget-object v10, v9, La/gke;->l:Ljava/lang/Long;

    .line 65
    .line 66
    iget-object v11, v9, La/gke;->k:La/z40;

    .line 67
    .line 68
    iget-object v13, v9, La/gke;->j:La/vt00;

    .line 69
    .line 70
    iget-object v9, v9, La/gke;->i:La/vt00;

    .line 71
    .line 72
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-object/from16 v18, v6

    .line 76
    .line 77
    move-object v6, v4

    .line 78
    move-object v4, v3

    .line 79
    move v3, v1

    .line 80
    goto/16 :goto_16

    .line 81
    .line 82
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v15

    .line 88
    :cond_2
    invoke-static {v4}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    move-object/from16 v11, p5

    .line 93
    .line 94
    iput-object v11, v4, La/mie0;->a:Ljava/lang/Object;

    .line 95
    .line 96
    sget-object v11, La/c1a;->a0:La/b1a;

    .line 97
    .line 98
    iget-object v13, v0, La/hke;->b:La/c1a;

    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v13}, La/b1a;->a(La/c1a;)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-nez v11, :cond_3

    .line 108
    .line 109
    iput-object v15, v4, La/mie0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    :cond_3
    if-nez v1, :cond_4

    .line 112
    .line 113
    iget-object v11, v4, La/mie0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    if-nez v11, :cond_4

    .line 116
    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    new-instance v0, La/k0g0;

    .line 120
    .line 121
    invoke-direct {v0, v12, v15}, La/k0g0;-><init>(ILa/pz2;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :cond_4
    iget-object v11, v0, La/hke;->c:La/qev;

    .line 130
    .line 131
    const/16 v26, 0x0

    .line 132
    .line 133
    const/16 v27, 0x38f

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    const/16 v20, 0x0

    .line 142
    .line 143
    const/16 v24, 0x0

    .line 144
    .line 145
    const/16 v25, 0x0

    .line 146
    .line 147
    move-object/from16 v21, p1

    .line 148
    .line 149
    move-object/from16 v22, p2

    .line 150
    .line 151
    move-object/from16 v23, p3

    .line 152
    .line 153
    move-object/from16 v16, v11

    .line 154
    .line 155
    invoke-static/range {v16 .. v27}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-virtual {v8, v11}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 163
    .line 164
    .line 165
    iget-object v11, v8, La/iev;->c:La/bev;

    .line 166
    .line 167
    invoke-virtual {v11}, La/bev;->d()La/cmf0;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    if-nez v11, :cond_5

    .line 172
    .line 173
    :goto_1
    move-object/from16 v18, v6

    .line 174
    .line 175
    goto/16 :goto_22

    .line 176
    .line 177
    :cond_5
    iget-object v11, v4, La/mie0;->a:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v11, La/vt00;

    .line 180
    .line 181
    const/4 v13, 0x3

    .line 182
    if-nez v11, :cond_6

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    iget-byte v11, v11, La/vt00;->a:B

    .line 186
    .line 187
    if-ne v11, v13, :cond_7

    .line 188
    .line 189
    const-string v11, "lock3A - sending a request to unlock af first."

    .line 190
    .line 191
    invoke-static {v14, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    sget-object v11, La/hke;->o:Ljava/util/Map;

    .line 195
    .line 196
    invoke-virtual {v8, v11}, La/iev;->e(Ljava/util/Map;)Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-nez v11, :cond_7

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_7
    :goto_2
    if-eqz v1, :cond_8

    .line 204
    .line 205
    iget-byte v11, v1, La/vt00;->a:B

    .line 206
    .line 207
    const/4 v12, 0x1

    .line 208
    if-ne v11, v12, :cond_b

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    const/4 v12, 0x1

    .line 212
    :goto_3
    iget-object v11, v4, La/mie0;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v11, La/vt00;

    .line 215
    .line 216
    if-eqz v11, :cond_9

    .line 217
    .line 218
    iget-byte v11, v11, La/vt00;->a:B

    .line 219
    .line 220
    if-ne v11, v12, :cond_b

    .line 221
    .line 222
    :cond_9
    if-eqz v2, :cond_a

    .line 223
    .line 224
    iget-byte v11, v2, La/vt00;->a:B

    .line 225
    .line 226
    if-ne v11, v12, :cond_b

    .line 227
    .line 228
    :cond_a
    move-object/from16 v12, p7

    .line 229
    .line 230
    move-object/from16 v13, p11

    .line 231
    .line 232
    move-object/from16 v18, v6

    .line 233
    .line 234
    goto/16 :goto_18

    .line 235
    .line 236
    :cond_b
    if-nez p8, :cond_16

    .line 237
    .line 238
    if-eqz v1, :cond_d

    .line 239
    .line 240
    iget-byte v11, v1, La/vt00;->a:B

    .line 241
    .line 242
    if-ne v11, v12, :cond_c

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_c
    move v11, v12

    .line 246
    goto :goto_5

    .line 247
    :cond_d
    :goto_4
    const/4 v11, 0x0

    .line 248
    :goto_5
    iget-object v15, v4, La/mie0;->a:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v15, La/vt00;

    .line 251
    .line 252
    if-eqz v15, :cond_f

    .line 253
    .line 254
    iget-byte v15, v15, La/vt00;->a:B

    .line 255
    .line 256
    if-ne v15, v12, :cond_e

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_e
    move v15, v12

    .line 260
    goto :goto_7

    .line 261
    :cond_f
    :goto_6
    const/4 v15, 0x0

    .line 262
    :goto_7
    if-eqz v2, :cond_11

    .line 263
    .line 264
    iget-byte v13, v2, La/vt00;->a:B

    .line 265
    .line 266
    if-ne v13, v12, :cond_10

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_10
    const/4 v12, 0x1

    .line 270
    goto :goto_9

    .line 271
    :cond_11
    :goto_8
    const/4 v12, 0x0

    .line 272
    :goto_9
    if-nez v11, :cond_12

    .line 273
    .line 274
    if-nez v15, :cond_12

    .line 275
    .line 276
    if-nez v12, :cond_12

    .line 277
    .line 278
    sget-object v11, La/lun;->a:La/lun;

    .line 279
    .line 280
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-object/from16 v18, v6

    .line 284
    .line 285
    goto :goto_b

    .line 286
    :cond_12
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 287
    .line 288
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 289
    .line 290
    .line 291
    if-eqz v11, :cond_13

    .line 292
    .line 293
    sget-object v11, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 294
    .line 295
    move-object/from16 v18, v6

    .line 296
    .line 297
    sget-object v6, La/hke;->f:Ljava/util/List;

    .line 298
    .line 299
    invoke-interface {v13, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_13
    move-object/from16 v18, v6

    .line 304
    .line 305
    :goto_a
    if-eqz v12, :cond_14

    .line 306
    .line 307
    sget-object v6, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 308
    .line 309
    sget-object v11, La/hke;->g:Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {v13, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    :cond_14
    if-eqz v15, :cond_15

    .line 315
    .line 316
    sget-object v6, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 317
    .line 318
    sget-object v11, La/hke;->h:Ljava/util/List;

    .line 319
    .line 320
    invoke-interface {v13, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    :cond_15
    move-object v11, v13

    .line 324
    :goto_b
    new-instance v6, La/yzn;

    .line 325
    .line 326
    const/4 v12, 0x1

    .line 327
    invoke-direct {v6, v11, v12}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 328
    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_16
    move-object/from16 v18, v6

    .line 332
    .line 333
    move-object/from16 v6, p8

    .line 334
    .line 335
    :goto_c
    new-instance v11, La/l0g0;

    .line 336
    .line 337
    new-instance v12, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-direct {v12, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v13, p10

    .line 343
    .line 344
    invoke-direct {v11, v6, v12, v13}, La/l0g0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object v6, v5, La/pg00;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 351
    .line 352
    invoke-virtual {v6, v11}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    if-nez v1, :cond_17

    .line 356
    .line 357
    const/4 v12, 0x3

    .line 358
    goto :goto_d

    .line 359
    :cond_17
    iget-byte v6, v1, La/vt00;->a:B

    .line 360
    .line 361
    const/4 v12, 0x3

    .line 362
    if-ne v6, v12, :cond_18

    .line 363
    .line 364
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 365
    .line 366
    goto :goto_e

    .line 367
    :cond_18
    :goto_d
    const/4 v6, 0x0

    .line 368
    :goto_e
    if-nez v2, :cond_19

    .line 369
    .line 370
    goto :goto_f

    .line 371
    :cond_19
    iget-byte v13, v2, La/vt00;->a:B

    .line 372
    .line 373
    if-ne v13, v12, :cond_1a

    .line 374
    .line 375
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 376
    .line 377
    goto :goto_10

    .line 378
    :cond_1a
    :goto_f
    const/4 v12, 0x0

    .line 379
    :goto_10
    if-nez v6, :cond_1b

    .line 380
    .line 381
    if-eqz v12, :cond_1c

    .line 382
    .line 383
    :cond_1b
    new-instance v13, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v15, "lock3A - setting aeLock="

    .line 386
    .line 387
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v15, ", awbLock="

    .line 394
    .line 395
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v13

    .line 405
    invoke-static {v14, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    iget-object v13, v0, La/hke;->c:La/qev;

    .line 409
    .line 410
    const/16 v28, 0x0

    .line 411
    .line 412
    const/16 v30, 0x17f

    .line 413
    .line 414
    const/16 v20, 0x0

    .line 415
    .line 416
    const/16 v21, 0x0

    .line 417
    .line 418
    const/16 v22, 0x0

    .line 419
    .line 420
    const/16 v23, 0x0

    .line 421
    .line 422
    const/16 v24, 0x0

    .line 423
    .line 424
    const/16 v25, 0x0

    .line 425
    .line 426
    const/16 v26, 0x0

    .line 427
    .line 428
    move-object/from16 v27, v6

    .line 429
    .line 430
    move-object/from16 v29, v12

    .line 431
    .line 432
    move-object/from16 v19, v13

    .line 433
    .line 434
    invoke-static/range {v19 .. v30}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 435
    .line 436
    .line 437
    :cond_1c
    invoke-virtual {v7}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    invoke-virtual {v8, v6}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 442
    .line 443
    .line 444
    new-instance v6, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    const-string v12, "lock3A - waiting for"

    .line 447
    .line 448
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    const-string v12, ""

    .line 452
    .line 453
    if-eqz v1, :cond_1e

    .line 454
    .line 455
    iget-byte v13, v1, La/vt00;->a:B

    .line 456
    .line 457
    const/4 v15, 0x1

    .line 458
    if-ne v13, v15, :cond_1d

    .line 459
    .line 460
    goto :goto_11

    .line 461
    :cond_1d
    const-string v13, " ae"

    .line 462
    .line 463
    goto :goto_12

    .line 464
    :cond_1e
    const/4 v15, 0x1

    .line 465
    :goto_11
    move-object v13, v12

    .line 466
    :goto_12
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    iget-object v13, v4, La/mie0;->a:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v13, La/vt00;

    .line 472
    .line 473
    if-eqz v13, :cond_20

    .line 474
    .line 475
    iget-byte v13, v13, La/vt00;->a:B

    .line 476
    .line 477
    if-ne v13, v15, :cond_1f

    .line 478
    .line 479
    goto :goto_13

    .line 480
    :cond_1f
    const-string v13, " af"

    .line 481
    .line 482
    goto :goto_14

    .line 483
    :cond_20
    :goto_13
    move-object v13, v12

    .line 484
    :goto_14
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    if-eqz v2, :cond_22

    .line 488
    .line 489
    iget-byte v13, v2, La/vt00;->a:B

    .line 490
    .line 491
    if-ne v13, v15, :cond_21

    .line 492
    .line 493
    goto :goto_15

    .line 494
    :cond_21
    const-string v12, " awb"

    .line 495
    .line 496
    :cond_22
    :goto_15
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    const-string v12, " to converge before locking them."

    .line 500
    .line 501
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    invoke-static {v14, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    iget-object v6, v11, La/l0g0;->d:La/odd;

    .line 512
    .line 513
    iput-object v1, v9, La/gke;->i:La/vt00;

    .line 514
    .line 515
    iput-object v2, v9, La/gke;->j:La/vt00;

    .line 516
    .line 517
    move-object/from16 v12, p7

    .line 518
    .line 519
    iput-object v12, v9, La/gke;->k:La/z40;

    .line 520
    .line 521
    move-object/from16 v13, p11

    .line 522
    .line 523
    iput-object v13, v9, La/gke;->l:Ljava/lang/Long;

    .line 524
    .line 525
    iput-object v4, v9, La/gke;->m:La/mie0;

    .line 526
    .line 527
    iput-object v11, v9, La/gke;->n:La/l0g0;

    .line 528
    .line 529
    iput-byte v3, v9, La/gke;->o:B

    .line 530
    .line 531
    const/4 v15, 0x1

    .line 532
    iput v15, v9, La/gke;->r:I

    .line 533
    .line 534
    invoke-virtual {v6, v9}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    if-ne v6, v10, :cond_23

    .line 539
    .line 540
    return-object v10

    .line 541
    :cond_23
    move-object v9, v1

    .line 542
    move-object v10, v13

    .line 543
    move-object v13, v2

    .line 544
    move-object v2, v11

    .line 545
    move-object v11, v12

    .line 546
    :goto_16
    check-cast v6, La/k0g0;

    .line 547
    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    const-string v12, "lock3A - converged at frame number="

    .line 551
    .line 552
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    iget-object v12, v6, La/k0g0;->b:La/pz2;

    .line 556
    .line 557
    if-eqz v12, :cond_24

    .line 558
    .line 559
    iget-object v12, v12, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 560
    .line 561
    move/from16 p1, v3

    .line 562
    .line 563
    move-object/from16 p2, v4

    .line 564
    .line 565
    invoke-virtual {v12}, Landroid/hardware/camera2/CaptureResult;->getFrameNumber()J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    new-instance v12, Ljava/lang/Long;

    .line 570
    .line 571
    invoke-direct {v12, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 572
    .line 573
    .line 574
    goto :goto_17

    .line 575
    :cond_24
    move/from16 p1, v3

    .line 576
    .line 577
    move-object/from16 p2, v4

    .line 578
    .line 579
    const/4 v12, 0x0

    .line 580
    :goto_17
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v3, ", status="

    .line 584
    .line 585
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    iget-byte v3, v6, La/k0g0;->a:B

    .line 589
    .line 590
    new-instance v4, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    const-string v12, "Status(value="

    .line 593
    .line 594
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    const/16 v3, 0x29

    .line 601
    .line 602
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-static {v14, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 617
    .line 618
    .line 619
    iget-byte v1, v6, La/k0g0;->a:B

    .line 620
    .line 621
    if-nez v1, :cond_25

    .line 622
    .line 623
    move/from16 v3, p1

    .line 624
    .line 625
    move-object/from16 v4, p2

    .line 626
    .line 627
    move-object/from16 v20, v11

    .line 628
    .line 629
    goto :goto_19

    .line 630
    :cond_25
    iget-object v0, v2, La/l0g0;->d:La/odd;

    .line 631
    .line 632
    return-object v0

    .line 633
    :goto_18
    move-object v9, v1

    .line 634
    move-object/from16 v20, v12

    .line 635
    .line 636
    move-object v10, v13

    .line 637
    move-object v13, v2

    .line 638
    :goto_19
    iget-object v1, v4, La/mie0;->a:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v1, La/vt00;

    .line 641
    .line 642
    new-instance v2, Ljava/lang/Integer;

    .line 643
    .line 644
    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 645
    .line 646
    .line 647
    if-nez v9, :cond_26

    .line 648
    .line 649
    const/16 v29, 0x0

    .line 650
    .line 651
    goto :goto_1a

    .line 652
    :cond_26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 653
    .line 654
    move-object/from16 v29, v3

    .line 655
    .line 656
    :goto_1a
    if-nez v13, :cond_27

    .line 657
    .line 658
    const/16 v31, 0x0

    .line 659
    .line 660
    goto :goto_1b

    .line 661
    :cond_27
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 662
    .line 663
    move-object/from16 v31, v3

    .line 664
    .line 665
    :goto_1b
    if-eqz v29, :cond_28

    .line 666
    .line 667
    const/4 v12, 0x1

    .line 668
    goto :goto_1c

    .line 669
    :cond_28
    const/4 v12, 0x0

    .line 670
    :goto_1c
    if-eqz v1, :cond_29

    .line 671
    .line 672
    const/4 v3, 0x1

    .line 673
    goto :goto_1d

    .line 674
    :cond_29
    const/4 v3, 0x0

    .line 675
    :goto_1d
    if-eqz v31, :cond_2a

    .line 676
    .line 677
    const/16 v16, 0x1

    .line 678
    .line 679
    goto :goto_1e

    .line 680
    :cond_2a
    const/16 v16, 0x0

    .line 681
    .line 682
    :goto_1e
    if-nez v12, :cond_2b

    .line 683
    .line 684
    if-nez v3, :cond_2b

    .line 685
    .line 686
    if-nez v16, :cond_2b

    .line 687
    .line 688
    sget-object v3, La/lun;->a:La/lun;

    .line 689
    .line 690
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    goto :goto_1f

    .line 694
    :cond_2b
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 695
    .line 696
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 697
    .line 698
    .line 699
    if-eqz v12, :cond_2c

    .line 700
    .line 701
    sget-object v6, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 702
    .line 703
    sget-object v9, La/hke;->i:Ljava/util/List;

    .line 704
    .line 705
    invoke-interface {v4, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    :cond_2c
    if-eqz v3, :cond_2d

    .line 709
    .line 710
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 711
    .line 712
    sget-object v6, La/hke;->k:Ljava/util/List;

    .line 713
    .line 714
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    :cond_2d
    if-eqz v16, :cond_2e

    .line 718
    .line 719
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 720
    .line 721
    sget-object v6, La/hke;->j:Ljava/util/List;

    .line 722
    .line 723
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    :cond_2e
    move-object v3, v4

    .line 727
    :goto_1f
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    if-nez v4, :cond_2f

    .line 732
    .line 733
    new-instance v4, La/yzn;

    .line 734
    .line 735
    const/4 v12, 0x1

    .line 736
    invoke-direct {v4, v3, v12}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 737
    .line 738
    .line 739
    new-instance v3, La/l0g0;

    .line 740
    .line 741
    invoke-direct {v3, v4, v2, v10}, La/l0g0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    iget-object v2, v5, La/pg00;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 748
    .line 749
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    iget-object v2, v0, La/hke;->c:La/qev;

    .line 753
    .line 754
    const/16 v30, 0x0

    .line 755
    .line 756
    const/16 v32, 0x17f

    .line 757
    .line 758
    const/16 v22, 0x0

    .line 759
    .line 760
    const/16 v23, 0x0

    .line 761
    .line 762
    const/16 v24, 0x0

    .line 763
    .line 764
    const/16 v25, 0x0

    .line 765
    .line 766
    const/16 v26, 0x0

    .line 767
    .line 768
    const/16 v27, 0x0

    .line 769
    .line 770
    const/16 v28, 0x0

    .line 771
    .line 772
    move-object/from16 v21, v2

    .line 773
    .line 774
    invoke-static/range {v21 .. v32}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v2, v29

    .line 778
    .line 779
    move-object/from16 v4, v31

    .line 780
    .line 781
    new-instance v5, Ljava/lang/StringBuilder;

    .line 782
    .line 783
    const-string v6, "lock3A - submitting request with aeLock="

    .line 784
    .line 785
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    const-string v2, " , awbLock="

    .line 792
    .line 793
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    invoke-static {v14, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 804
    .line 805
    .line 806
    invoke-virtual {v7}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-virtual {v8, v2}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 811
    .line 812
    .line 813
    iget-object v2, v3, La/l0g0;->d:La/odd;

    .line 814
    .line 815
    goto :goto_20

    .line 816
    :cond_2f
    const/4 v2, 0x0

    .line 817
    :goto_20
    if-nez v1, :cond_30

    .line 818
    .line 819
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    return-object v2

    .line 823
    :cond_30
    if-eqz v20, :cond_31

    .line 824
    .line 825
    iget-object v1, v7, La/qev;->a:La/c14;

    .line 826
    .line 827
    iget-object v1, v1, La/c14;->a:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v1, La/h7m0;

    .line 830
    .line 831
    iget-object v15, v1, La/h7m0;->a:La/z40;

    .line 832
    .line 833
    iget-object v1, v0, La/hke;->c:La/qev;

    .line 834
    .line 835
    const/16 v29, 0x0

    .line 836
    .line 837
    const/16 v30, 0x3fe

    .line 838
    .line 839
    const/16 v21, 0x0

    .line 840
    .line 841
    const/16 v22, 0x0

    .line 842
    .line 843
    const/16 v23, 0x0

    .line 844
    .line 845
    const/16 v24, 0x0

    .line 846
    .line 847
    const/16 v25, 0x0

    .line 848
    .line 849
    const/16 v26, 0x0

    .line 850
    .line 851
    const/16 v27, 0x0

    .line 852
    .line 853
    const/16 v28, 0x0

    .line 854
    .line 855
    move-object/from16 v19, v1

    .line 856
    .line 857
    invoke-static/range {v19 .. v30}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v7}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    invoke-virtual {v8, v1}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 865
    .line 866
    .line 867
    goto :goto_21

    .line 868
    :cond_31
    const/4 v15, 0x0

    .line 869
    :goto_21
    const-string v1, "lock3A - submitting a request to lock af."

    .line 870
    .line 871
    invoke-static {v14, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 872
    .line 873
    .line 874
    sget-object v1, La/hke;->n:Ljava/util/Map;

    .line 875
    .line 876
    invoke-virtual {v8, v1}, La/iev;->e(Ljava/util/Map;)Z

    .line 877
    .line 878
    .line 879
    move-result v1

    .line 880
    if-nez v1, :cond_32

    .line 881
    .line 882
    :goto_22
    return-object v18

    .line 883
    :cond_32
    iget-object v1, v0, La/hke;->c:La/qev;

    .line 884
    .line 885
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 886
    .line 887
    const/4 v4, 0x0

    .line 888
    const/16 v5, 0x2ff

    .line 889
    .line 890
    const/4 v6, 0x0

    .line 891
    const/4 v9, 0x0

    .line 892
    const/4 v10, 0x0

    .line 893
    const/4 v11, 0x0

    .line 894
    const/4 v12, 0x0

    .line 895
    const/4 v13, 0x0

    .line 896
    const/4 v14, 0x0

    .line 897
    const/16 v16, 0x0

    .line 898
    .line 899
    move-object/from16 p1, v1

    .line 900
    .line 901
    move-object/from16 p10, v3

    .line 902
    .line 903
    move-object/from16 p11, v4

    .line 904
    .line 905
    move/from16 p12, v5

    .line 906
    .line 907
    move-object/from16 p2, v6

    .line 908
    .line 909
    move-object/from16 p3, v9

    .line 910
    .line 911
    move-object/from16 p4, v10

    .line 912
    .line 913
    move-object/from16 p5, v11

    .line 914
    .line 915
    move-object/from16 p6, v12

    .line 916
    .line 917
    move-object/from16 p7, v13

    .line 918
    .line 919
    move-object/from16 p8, v14

    .line 920
    .line 921
    move-object/from16 p9, v16

    .line 922
    .line 923
    invoke-static/range {p1 .. p12}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 924
    .line 925
    .line 926
    if-eqz v15, :cond_33

    .line 927
    .line 928
    iget-object v0, v0, La/hke;->c:La/qev;

    .line 929
    .line 930
    const/4 v1, 0x0

    .line 931
    const/16 v3, 0x3fe

    .line 932
    .line 933
    const/4 v4, 0x0

    .line 934
    const/4 v5, 0x0

    .line 935
    const/4 v6, 0x0

    .line 936
    const/4 v9, 0x0

    .line 937
    const/4 v10, 0x0

    .line 938
    const/4 v11, 0x0

    .line 939
    const/4 v12, 0x0

    .line 940
    const/4 v13, 0x0

    .line 941
    move-object/from16 p0, v0

    .line 942
    .line 943
    move-object/from16 p10, v1

    .line 944
    .line 945
    move/from16 p11, v3

    .line 946
    .line 947
    move-object/from16 p2, v4

    .line 948
    .line 949
    move-object/from16 p3, v5

    .line 950
    .line 951
    move-object/from16 p4, v6

    .line 952
    .line 953
    move-object/from16 p5, v9

    .line 954
    .line 955
    move-object/from16 p6, v10

    .line 956
    .line 957
    move-object/from16 p7, v11

    .line 958
    .line 959
    move-object/from16 p8, v12

    .line 960
    .line 961
    move-object/from16 p9, v13

    .line 962
    .line 963
    move-object/from16 p1, v15

    .line 964
    .line 965
    invoke-static/range {p0 .. p11}, La/qev;->b(La/qev;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v7}, La/qev;->a()Ljava/util/LinkedHashMap;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    invoke-virtual {v8, v0}, La/iev;->f(Ljava/util/LinkedHashMap;)V

    .line 973
    .line 974
    .line 975
    :cond_33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    return-object v2
.end method
