.class public final synthetic La/g6m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:La/h6m;

.field public final synthetic d:La/cgk0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:La/cgk0;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;La/h6m;La/cgk0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/cgk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/g6m;->a:Z

    iput-object p2, p0, La/g6m;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/g6m;->c:La/h6m;

    iput-object p4, p0, La/g6m;->d:La/cgk0;

    iput-object p5, p0, La/g6m;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/g6m;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/g6m;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/g6m;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/g6m;->i:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, La/g6m;->j:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, La/g6m;->k:La/cgk0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v9

    .line 26
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    sget-object v10, La/jm40;->b:La/jm40;

    .line 33
    .line 34
    iget-boolean v12, v0, La/g6m;->a:Z

    .line 35
    .line 36
    iget-object v13, v0, La/g6m;->b:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    if-eqz v12, :cond_2

    .line 39
    .line 40
    const v1, -0x676a309b

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, La/ukd;->a:La/cl5;

    .line 51
    .line 52
    if-ne v1, v2, :cond_1

    .line 53
    .line 54
    new-instance v1, La/nw6;

    .line 55
    .line 56
    const/16 v2, 0x9

    .line 57
    .line 58
    iget-object v3, v0, La/g6m;->d:La/cgk0;

    .line 59
    .line 60
    invoke-direct {v1, v3, v2}, La/nw6;-><init>(La/cgk0;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v2, La/b5m;

    .line 75
    .line 76
    invoke-direct {v2, v1, v13}, La/b5m;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v10, v2}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, La/cjl;

    .line 84
    .line 85
    const/16 v3, 0xa

    .line 86
    .line 87
    invoke-direct {v2, v13, v3}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const v1, -0x676712f6

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 105
    .line 106
    .line 107
    move-object v1, v10

    .line 108
    :goto_1
    sget-object v2, La/uc9;->c:La/mw3;

    .line 109
    .line 110
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 111
    .line 112
    invoke-static {v2, v3, v5, v8}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-wide v3, v5, La/fet;->T:J

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, La/fet;->i0()V

    .line 136
    .line 137
    .line 138
    iget-boolean v6, v5, La/fet;->S:Z

    .line 139
    .line 140
    if-eqz v6, :cond_3

    .line 141
    .line 142
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 143
    .line 144
    invoke-virtual {v5, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-virtual {v5}, La/fet;->r0()V

    .line 149
    .line 150
    .line 151
    :goto_2
    sget-object v6, La/gqw0;->x:La/shd;

    .line 152
    .line 153
    invoke-static {v5, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    sget-object v2, La/gqw0;->w:La/shd;

    .line 157
    .line 158
    invoke-static {v5, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    sget-object v3, La/gqw0;->y:La/shd;

    .line 166
    .line 167
    invoke-static {v5, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 171
    .line 172
    .line 173
    sget-object v2, La/gqw0;->v:La/shd;

    .line 174
    .line 175
    invoke-static {v5, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 176
    .line 177
    .line 178
    sget-object v1, La/qmk;->a:La/zcl;

    .line 179
    .line 180
    const/high16 v1, 0x40800000    # 4.0f

    .line 181
    .line 182
    const/high16 v11, 0x3f800000    # 1.0f

    .line 183
    .line 184
    invoke-static {v10, v1, v5, v10, v11}, La/ua80;->d(La/jm40;FLa/fet;La/jm40;F)La/mm40;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    const/4 v7, 0x6

    .line 189
    iget-object v2, v0, La/g6m;->c:La/h6m;

    .line 190
    .line 191
    iget-object v3, v0, La/g6m;->e:Lkotlin/jvm/functions/Function0;

    .line 192
    .line 193
    iget-object v4, v0, La/g6m;->f:Lkotlin/jvm/functions/Function0;

    .line 194
    .line 195
    move-object v6, v5

    .line 196
    iget-object v5, v0, La/g6m;->g:Lkotlin/jvm/functions/Function0;

    .line 197
    .line 198
    invoke-static/range {v1 .. v7}, La/nkb;->w(La/mm40;La/h6m;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v10, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    const/16 v18, 0x0

    .line 206
    .line 207
    const/16 v19, 0xd

    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const/high16 v16, 0x41400000    # 12.0f

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    move-object v5, v6

    .line 219
    const/4 v6, 0x0

    .line 220
    iget-object v3, v0, La/g6m;->h:Lkotlin/jvm/functions/Function1;

    .line 221
    .line 222
    iget-object v4, v0, La/g6m;->i:Lkotlin/jvm/functions/Function1;

    .line 223
    .line 224
    invoke-static/range {v1 .. v6}, La/nkb;->r(La/mm40;La/h6m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 225
    .line 226
    .line 227
    move-object v6, v5

    .line 228
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v2, La/h6m;->h:La/f5m;

    .line 232
    .line 233
    iget-object v3, v1, La/f5m;->a:La/go8;

    .line 234
    .line 235
    if-nez v3, :cond_4

    .line 236
    .line 237
    iget-object v1, v1, La/f5m;->b:Ljava/lang/String;

    .line 238
    .line 239
    if-nez v1, :cond_4

    .line 240
    .line 241
    iget-object v1, v2, La/h6m;->i:La/b6m;

    .line 242
    .line 243
    if-eqz v1, :cond_5

    .line 244
    .line 245
    :cond_4
    move v8, v9

    .line 246
    :cond_5
    new-instance v11, La/odv;

    .line 247
    .line 248
    const/16 v16, 0x3

    .line 249
    .line 250
    iget-object v14, v0, La/g6m;->j:Lkotlin/jvm/functions/Function1;

    .line 251
    .line 252
    iget-object v15, v0, La/g6m;->k:La/cgk0;

    .line 253
    .line 254
    invoke-direct/range {v11 .. v16}, La/odv;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    const v0, -0x7a86003

    .line 258
    .line 259
    .line 260
    invoke-static {v0, v11, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const/16 v1, 0x180

    .line 265
    .line 266
    invoke-static {v2, v8, v0, v6, v1}, La/lgb;->r(Ljava/lang/Object;ZLa/ugd;La/fet;I)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_6
    move-object v6, v5

    .line 271
    invoke-virtual {v6}, La/fet;->X()V

    .line 272
    .line 273
    .line 274
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0
.end method
