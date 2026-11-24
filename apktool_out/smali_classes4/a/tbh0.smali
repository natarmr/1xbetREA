.class public final synthetic La/tbh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:La/c5n0;

.field public final synthetic e:La/pz40;

.field public final synthetic f:I

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(ZILjava/util/ArrayList;La/c5n0;La/pz40;ILa/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/tbh0;->a:Z

    iput p2, p0, La/tbh0;->b:I

    iput-object p3, p0, La/tbh0;->c:Ljava/util/ArrayList;

    iput-object p4, p0, La/tbh0;->d:La/c5n0;

    iput-object p5, p0, La/tbh0;->e:La/pz40;

    iput p6, p0, La/tbh0;->f:I

    iput-object p7, p0, La/tbh0;->g:La/ugd;

    iput p8, p0, La/tbh0;->h:I

    iput p9, p0, La/tbh0;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ou90;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-boolean v4, v0, La/tbh0;->a:Z

    .line 16
    .line 17
    iget v5, v0, La/tbh0;->b:I

    .line 18
    .line 19
    iget-object v6, v0, La/tbh0;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v7, v0, La/tbh0;->d:La/c5n0;

    .line 22
    .line 23
    iget-object v8, v0, La/tbh0;->e:La/pz40;

    .line 24
    .line 25
    iget v9, v0, La/tbh0;->f:I

    .line 26
    .line 27
    iget-object v10, v0, La/tbh0;->g:La/ugd;

    .line 28
    .line 29
    iget v11, v0, La/tbh0;->h:I

    .line 30
    .line 31
    iget v0, v0, La/tbh0;->i:I

    .line 32
    .line 33
    const-string v12, "width and height must be >= 0"

    .line 34
    .line 35
    const/high16 v13, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v15, 0x0

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    move/from16 v16, v5

    .line 45
    .line 46
    move v3, v15

    .line 47
    :goto_0
    if-ge v3, v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v17

    .line 53
    move-object/from16 v14, v17

    .line 54
    .line 55
    check-cast v14, La/pu90;

    .line 56
    .line 57
    move/from16 v17, v3

    .line 58
    .line 59
    iget v3, v14, La/pu90;->a:I

    .line 60
    .line 61
    sub-int v3, v16, v3

    .line 62
    .line 63
    invoke-virtual {v1, v14, v3, v15, v13}, La/ou90;->g(La/pu90;IIF)V

    .line 64
    .line 65
    .line 66
    new-instance v13, La/qvx;

    .line 67
    .line 68
    invoke-interface {v1, v3}, La/w6k;->r0(I)F

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    iget v14, v14, La/pu90;->a:I

    .line 73
    .line 74
    invoke-interface {v1, v14}, La/w6k;->r0(I)F

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    invoke-direct {v13, v15, v14}, La/qvx;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    sub-int/2addr v3, v9

    .line 85
    add-int/lit8 v13, v17, 0x1

    .line 86
    .line 87
    move/from16 v16, v3

    .line 88
    .line 89
    move v3, v13

    .line 90
    const/high16 v13, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    sget-object v3, La/wbh0;->b:La/wbh0;

    .line 95
    .line 96
    new-instance v4, La/sbh0;

    .line 97
    .line 98
    const/4 v6, 0x1

    .line 99
    invoke-direct {v4, v10, v11, v8, v6}, La/sbh0;-><init>(La/ugd;ILa/pz40;B)V

    .line 100
    .line 101
    .line 102
    new-instance v9, La/ugd;

    .line 103
    .line 104
    const v10, -0x6a8073e2

    .line 105
    .line 106
    .line 107
    invoke-direct {v9, v10, v6, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v7, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/4 v6, 0x0

    .line 119
    :goto_1
    if-ge v6, v4, :cond_9

    .line 120
    .line 121
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, La/pj30;

    .line 126
    .line 127
    if-ltz v5, :cond_1

    .line 128
    .line 129
    const/4 v9, 0x1

    .line 130
    goto :goto_2

    .line 131
    :cond_1
    const/4 v9, 0x0

    .line 132
    :goto_2
    if-ltz v0, :cond_2

    .line 133
    .line 134
    const/4 v10, 0x1

    .line 135
    goto :goto_3

    .line 136
    :cond_2
    const/4 v10, 0x0

    .line 137
    :goto_3
    and-int/2addr v9, v10

    .line 138
    if-nez v9, :cond_3

    .line 139
    .line 140
    invoke-static {v12}, La/zcx;->a(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    invoke-static {v5, v5, v0, v0}, La/r4e;->h(IIII)J

    .line 144
    .line 145
    .line 146
    move-result-wide v9

    .line 147
    invoke-interface {v7, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v13, 0x0

    .line 153
    invoke-virtual {v1, v7, v13, v13, v9}, La/ou90;->g(La/pu90;IIF)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    move v13, v15

    .line 160
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    move v4, v13

    .line 165
    move v14, v4

    .line 166
    :goto_4
    if-ge v4, v3, :cond_5

    .line 167
    .line 168
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    check-cast v15, La/pu90;

    .line 173
    .line 174
    move/from16 v17, v3

    .line 175
    .line 176
    const/high16 v3, 0x3f800000    # 1.0f

    .line 177
    .line 178
    invoke-virtual {v1, v15, v14, v13, v3}, La/ou90;->m(La/pu90;IIF)V

    .line 179
    .line 180
    .line 181
    new-instance v13, La/qvx;

    .line 182
    .line 183
    invoke-interface {v1, v14}, La/w6k;->r0(I)F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    move/from16 v18, v4

    .line 188
    .line 189
    iget v4, v15, La/pu90;->a:I

    .line 190
    .line 191
    invoke-interface {v1, v4}, La/w6k;->r0(I)F

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-direct {v13, v3, v4}, La/qvx;-><init>(FF)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    iget v3, v15, La/pu90;->a:I

    .line 202
    .line 203
    add-int/2addr v3, v9

    .line 204
    add-int/2addr v14, v3

    .line 205
    add-int/lit8 v4, v18, 0x1

    .line 206
    .line 207
    move/from16 v3, v17

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    goto :goto_4

    .line 211
    :cond_5
    sget-object v3, La/wbh0;->b:La/wbh0;

    .line 212
    .line 213
    new-instance v4, La/sbh0;

    .line 214
    .line 215
    const/4 v6, 0x2

    .line 216
    invoke-direct {v4, v10, v11, v8, v6}, La/sbh0;-><init>(La/ugd;ILa/pz40;B)V

    .line 217
    .line 218
    .line 219
    new-instance v6, La/ugd;

    .line 220
    .line 221
    const v9, -0xa309962

    .line 222
    .line 223
    .line 224
    const/4 v10, 0x1

    .line 225
    invoke-direct {v6, v9, v10, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v7, v3, v6}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    const/4 v13, 0x0

    .line 237
    :goto_5
    if-ge v13, v4, :cond_9

    .line 238
    .line 239
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, La/pj30;

    .line 244
    .line 245
    if-ltz v5, :cond_6

    .line 246
    .line 247
    move v7, v10

    .line 248
    goto :goto_6

    .line 249
    :cond_6
    const/4 v7, 0x0

    .line 250
    :goto_6
    if-ltz v0, :cond_7

    .line 251
    .line 252
    move v9, v10

    .line 253
    goto :goto_7

    .line 254
    :cond_7
    const/4 v9, 0x0

    .line 255
    :goto_7
    and-int/2addr v7, v9

    .line 256
    if-nez v7, :cond_8

    .line 257
    .line 258
    invoke-static {v12}, La/zcx;->a(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    invoke-static {v5, v5, v0, v0}, La/r4e;->h(IIII)J

    .line 262
    .line 263
    .line 264
    move-result-wide v14

    .line 265
    invoke-interface {v6, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    const/4 v7, 0x0

    .line 270
    const/4 v9, 0x0

    .line 271
    invoke-virtual {v1, v6, v7, v7, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 272
    .line 273
    .line 274
    add-int/lit8 v13, v13, 0x1

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_9
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_a

    .line 286
    .line 287
    invoke-interface {v8, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0
.end method
