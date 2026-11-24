.class public final synthetic La/dpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/i3m;

.field public final synthetic b:Z

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/sek;

.field public final synthetic e:La/bek;

.field public final synthetic f:La/z5s;

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Z

.field public final synthetic j:La/mm40;

.field public final synthetic k:La/ugd;

.field public final synthetic l:La/l7m0;

.field public final synthetic m:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/i3m;ZLa/l7m0;La/sek;La/bek;La/z5s;ZLkotlin/jvm/functions/Function1;ZLa/mm40;La/ugd;La/l7m0;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dpg;->a:La/i3m;

    iput-boolean p2, p0, La/dpg;->b:Z

    iput-object p3, p0, La/dpg;->c:La/l7m0;

    iput-object p4, p0, La/dpg;->d:La/sek;

    iput-object p5, p0, La/dpg;->e:La/bek;

    iput-object p6, p0, La/dpg;->f:La/z5s;

    iput-boolean p7, p0, La/dpg;->g:Z

    iput-object p8, p0, La/dpg;->h:Lkotlin/jvm/functions/Function1;

    iput-boolean p9, p0, La/dpg;->i:Z

    iput-object p10, p0, La/dpg;->j:La/mm40;

    iput-object p11, p0, La/dpg;->k:La/ugd;

    iput-object p12, p0, La/dpg;->l:La/l7m0;

    iput-object p13, p0, La/dpg;->m:La/l7m0;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/p6t0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/a4x;

    .line 10
    .line 11
    move-object/from16 v13, p3

    .line 12
    .line 13
    check-cast v13, La/fet;

    .line 14
    .line 15
    move-object/from16 v3, p4

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 v4, v3, 0x6

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v4, 0x2

    .line 42
    :goto_0
    or-int/2addr v4, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v4, v3

    .line 45
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v13, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/16 v3, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v3, 0x10

    .line 59
    .line 60
    :goto_2
    or-int/2addr v4, v3

    .line 61
    :cond_3
    and-int/lit16 v3, v4, 0x93

    .line 62
    .line 63
    const/16 v5, 0x92

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    const/4 v15, 0x0

    .line 67
    if-eq v3, v5, :cond_4

    .line 68
    .line 69
    move v3, v6

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move v3, v15

    .line 72
    :goto_3
    and-int/lit8 v5, v4, 0x1

    .line 73
    .line 74
    invoke-virtual {v13, v5, v3}, La/fet;->U(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_a

    .line 79
    .line 80
    instance-of v3, v1, La/kxs;

    .line 81
    .line 82
    iget-object v5, v0, La/dpg;->m:La/l7m0;

    .line 83
    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    const v1, -0x1a03a296

    .line 87
    .line 88
    .line 89
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, La/dpg;->l:La/l7m0;

    .line 93
    .line 94
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    invoke-static {v5}, La/mrv;->y(La/l7m0;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_6

    .line 111
    .line 112
    iget-boolean v1, v0, La/dpg;->b:Z

    .line 113
    .line 114
    if-nez v1, :cond_5

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move v6, v15

    .line 118
    :cond_6
    :goto_4
    sget-object v1, La/w3m;->a:La/uts0;

    .line 119
    .line 120
    new-instance v1, La/o3m;

    .line 121
    .line 122
    iget-object v3, v0, La/dpg;->a:La/i3m;

    .line 123
    .line 124
    invoke-direct {v1, v6, v3, v15}, La/o3m;-><init>(ZLjava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    sget-object v3, La/jm40;->b:La/jm40;

    .line 128
    .line 129
    invoke-static {v3, v1}, La/kbc;->O(La/mm40;La/xdr;)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v3, "GAME_STREAM"

    .line 134
    .line 135
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget-object v1, v0, La/dpg;->f:La/z5s;

    .line 140
    .line 141
    iget-wide v7, v1, La/z5s;->d:J

    .line 142
    .line 143
    iget-wide v9, v1, La/z5s;->e:J

    .line 144
    .line 145
    iget-boolean v1, v0, La/dpg;->g:Z

    .line 146
    .line 147
    invoke-static {v2, v1}, La/p7x;->D(La/a4x;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    const/4 v14, 0x0

    .line 152
    iget-object v4, v0, La/dpg;->c:La/l7m0;

    .line 153
    .line 154
    iget-object v5, v0, La/dpg;->d:La/sek;

    .line 155
    .line 156
    iget-object v6, v0, La/dpg;->e:La/bek;

    .line 157
    .line 158
    iget-object v12, v0, La/dpg;->h:Lkotlin/jvm/functions/Function1;

    .line 159
    .line 160
    invoke-static/range {v3 .. v14}, La/zss;->b(La/mm40;La/l7m0;La/sek;La/bek;JJZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :cond_7
    const v2, -0x6c31119b

    .line 169
    .line 170
    .line 171
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 172
    .line 173
    .line 174
    iget-boolean v2, v0, La/dpg;->i:Z

    .line 175
    .line 176
    iget-object v3, v0, La/dpg;->k:La/ugd;

    .line 177
    .line 178
    if-eqz v2, :cond_9

    .line 179
    .line 180
    invoke-static {v5}, La/mrv;->y(La/l7m0;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-nez v2, :cond_9

    .line 185
    .line 186
    const v2, -0x19f07192

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 190
    .line 191
    .line 192
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 193
    .line 194
    invoke-static {v2, v15}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iget-wide v7, v13, La/fet;->T:J

    .line 199
    .line 200
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    iget-object v0, v0, La/dpg;->j:La/mm40;

    .line 209
    .line 210
    invoke-static {v13, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 215
    .line 216
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v13}, La/fet;->i0()V

    .line 220
    .line 221
    .line 222
    iget-boolean v8, v13, La/fet;->S:Z

    .line 223
    .line 224
    if-eqz v8, :cond_8

    .line 225
    .line 226
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 227
    .line 228
    invoke-virtual {v13, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_8
    invoke-virtual {v13}, La/fet;->r0()V

    .line 233
    .line 234
    .line 235
    :goto_5
    sget-object v8, La/gqw0;->x:La/shd;

    .line 236
    .line 237
    invoke-static {v13, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 238
    .line 239
    .line 240
    sget-object v2, La/gqw0;->w:La/shd;

    .line 241
    .line 242
    invoke-static {v13, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    sget-object v5, La/gqw0;->y:La/shd;

    .line 250
    .line 251
    invoke-static {v13, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 255
    .line 256
    .line 257
    sget-object v2, La/gqw0;->v:La/shd;

    .line 258
    .line 259
    invoke-static {v13, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    and-int/lit8 v0, v4, 0xe

    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v3, v1, v13, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 275
    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_9
    const v0, -0x19ed33b7

    .line 279
    .line 280
    .line 281
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 282
    .line 283
    .line 284
    and-int/lit8 v0, v4, 0xe

    .line 285
    .line 286
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v3, v1, v13, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 294
    .line 295
    .line 296
    :goto_6
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 297
    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_a
    invoke-virtual {v13}, La/fet;->X()V

    .line 301
    .line 302
    .line 303
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    return-object v0
.end method
