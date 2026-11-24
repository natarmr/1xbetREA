.class public final synthetic La/lme;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/y9q0;

.field public final synthetic b:La/djz;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:La/d7q0;

.field public final synthetic g:La/a8q0;

.field public final synthetic h:La/vuu0;

.field public final synthetic i:La/mm40;

.field public final synthetic j:La/mm40;

.field public final synthetic k:La/mm40;

.field public final synthetic l:La/mm40;

.field public final synthetic m:La/d39;

.field public final synthetic n:La/k7q0;

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:La/rhv0;

.field public final synthetic r:La/vne;

.field public final synthetic s:Lkotlin/jvm/functions/Function1;

.field public final synthetic t:La/qe60;

.field public final synthetic u:La/w6k;


# direct methods
.method public synthetic constructor <init>(La/y9q0;La/djz;IIZLa/d7q0;La/a8q0;La/vuu0;La/mm40;La/mm40;La/mm40;La/mm40;La/d39;La/k7q0;ZZLa/rhv0;La/vne;Lkotlin/jvm/functions/Function1;La/qe60;La/w6k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lme;->a:La/y9q0;

    iput-object p2, p0, La/lme;->b:La/djz;

    iput-boolean p3, p0, La/lme;->c:Z

    iput p4, p0, La/lme;->d:I

    iput-boolean p5, p0, La/lme;->e:Z

    iput-object p6, p0, La/lme;->f:La/d7q0;

    iput-object p7, p0, La/lme;->g:La/a8q0;

    iput-object p8, p0, La/lme;->h:La/vuu0;

    iput-object p9, p0, La/lme;->i:La/mm40;

    iput-object p10, p0, La/lme;->j:La/mm40;

    iput-object p11, p0, La/lme;->k:La/mm40;

    iput-object p12, p0, La/lme;->l:La/mm40;

    iput-object p13, p0, La/lme;->m:La/d39;

    iput-object p14, p0, La/lme;->n:La/k7q0;

    iput-boolean p15, p0, La/lme;->o:Z

    move/from16 p1, p16

    iput-boolean p1, p0, La/lme;->p:Z

    move-object/from16 p1, p17

    iput-object p1, p0, La/lme;->q:La/rhv0;

    move-object/from16 p1, p18

    iput-object p1, p0, La/lme;->r:La/vne;

    move-object/from16 p1, p19

    iput-object p1, p0, La/lme;->s:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p20

    iput-object p1, p0, La/lme;->t:La/qe60;

    move-object/from16 p1, p21

    iput-object p1, p0, La/lme;->u:La/w6k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fet;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_a

    .line 30
    .line 31
    iget-object v8, v0, La/lme;->b:La/djz;

    .line 32
    .line 33
    iget-object v2, v8, La/djz;->g:La/pz40;

    .line 34
    .line 35
    check-cast v2, La/hgk0;

    .line 36
    .line 37
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, La/ycl;

    .line 42
    .line 43
    iget v2, v2, La/ycl;->a:F

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-static {v2, v3}, La/ycl;->b(FF)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v3, v2

    .line 56
    :goto_1
    sget-object v4, La/jm40;->b:La/jm40;

    .line 57
    .line 58
    invoke-static {v4, v2, v3}, La/o7k0;->f(La/mm40;FF)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-boolean v3, v0, La/lme;->c:Z

    .line 63
    .line 64
    iget v4, v0, La/lme;->d:I

    .line 65
    .line 66
    invoke-static {v3, v4}, La/aac;->j0(II)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v0, La/lme;->a:La/y9q0;

    .line 70
    .line 71
    if-ne v3, v5, :cond_2

    .line 72
    .line 73
    const v7, 0x7fffffff

    .line 74
    .line 75
    .line 76
    if-ne v4, v7, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    iget-boolean v7, v0, La/lme;->e:Z

    .line 80
    .line 81
    if-nez v7, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    new-instance v7, La/yuv;

    .line 85
    .line 86
    invoke-direct {v7, v6, v3, v4}, La/yuv;-><init>(La/y9q0;II)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v2, v7}, La/mm40;->e(La/mm40;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_2
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    if-nez v3, :cond_4

    .line 102
    .line 103
    sget-object v3, La/ukd;->a:La/cl5;

    .line 104
    .line 105
    if-ne v7, v3, :cond_5

    .line 106
    .line 107
    :cond_4
    new-instance v7, La/jwd;

    .line 108
    .line 109
    const/16 v3, 0x8

    .line 110
    .line 111
    invoke-direct {v7, v8, v3}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 118
    .line 119
    iget-object v3, v0, La/lme;->f:La/d7q0;

    .line 120
    .line 121
    iget-object v9, v3, La/d7q0;->f:La/pz40;

    .line 122
    .line 123
    check-cast v9, La/hgk0;

    .line 124
    .line 125
    invoke-virtual {v9}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    check-cast v9, La/ma80;

    .line 130
    .line 131
    iget-object v14, v0, La/lme;->g:La/a8q0;

    .line 132
    .line 133
    iget-wide v10, v14, La/a8q0;->b:J

    .line 134
    .line 135
    sget v12, La/o9q0;->c:I

    .line 136
    .line 137
    const/16 p1, 0x20

    .line 138
    .line 139
    shr-long v12, v10, p1

    .line 140
    .line 141
    long-to-int v12, v12

    .line 142
    move-object v13, v6

    .line 143
    iget-wide v5, v3, La/d7q0;->e:J

    .line 144
    .line 145
    move/from16 v18, v4

    .line 146
    .line 147
    move-wide v15, v5

    .line 148
    shr-long v4, v15, p1

    .line 149
    .line 150
    long-to-int v4, v4

    .line 151
    if-eq v12, v4, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    const-wide v19, 0xffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    and-long v4, v10, v19

    .line 160
    .line 161
    long-to-int v12, v4

    .line 162
    and-long v4, v15, v19

    .line 163
    .line 164
    long-to-int v4, v4

    .line 165
    if-eq v12, v4, :cond_7

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    invoke-static {v10, v11}, La/o9q0;->f(J)I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    :goto_3
    iget-wide v4, v14, La/a8q0;->b:J

    .line 173
    .line 174
    iput-wide v4, v3, La/d7q0;->e:J

    .line 175
    .line 176
    iget-object v4, v14, La/a8q0;->a:La/j83;

    .line 177
    .line 178
    iget-object v5, v0, La/lme;->h:La/vuu0;

    .line 179
    .line 180
    invoke-static {v5, v4}, La/pwt0;->a(La/vuu0;La/j83;)La/nls0;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_9

    .line 189
    .line 190
    const/4 v6, 0x1

    .line 191
    if-ne v5, v6, :cond_8

    .line 192
    .line 193
    new-instance v5, La/ylw;

    .line 194
    .line 195
    invoke-direct {v5, v3, v12, v4, v7}, La/ylw;-><init>(La/d7q0;ILa/nls0;Lkotlin/jvm/functions/Function0;)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 200
    .line 201
    .line 202
    const/4 v0, 0x0

    .line 203
    return-object v0

    .line 204
    :cond_9
    new-instance v5, La/lcu0;

    .line 205
    .line 206
    invoke-direct {v5, v3, v12, v4, v7}, La/lcu0;-><init>(La/d7q0;ILa/nls0;Lkotlin/jvm/functions/Function0;)V

    .line 207
    .line 208
    .line 209
    :goto_4
    invoke-static {v2}, La/xf80;->a(La/mm40;)La/mm40;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {v2}, La/lgb;->K(La/mm40;)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v2, v5}, La/mm40;->e(La/mm40;)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    iget-object v3, v0, La/lme;->i:La/mm40;

    .line 222
    .line 223
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget-object v3, v0, La/lme;->j:La/mm40;

    .line 228
    .line 229
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    new-instance v3, La/o7q0;

    .line 234
    .line 235
    invoke-direct {v3, v13}, La/o7q0;-><init>(La/y9q0;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    iget-object v3, v0, La/lme;->k:La/mm40;

    .line 243
    .line 244
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v3, v0, La/lme;->l:La/mm40;

    .line 249
    .line 250
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    iget-object v3, v0, La/lme;->m:La/d39;

    .line 255
    .line 256
    invoke-static {v2, v3}, La/cfx0;->B(La/mm40;La/d39;)La/mm40;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    new-instance v6, La/mme;

    .line 261
    .line 262
    iget-object v7, v0, La/lme;->n:La/k7q0;

    .line 263
    .line 264
    iget-boolean v9, v0, La/lme;->o:Z

    .line 265
    .line 266
    iget-boolean v10, v0, La/lme;->p:Z

    .line 267
    .line 268
    iget-object v11, v0, La/lme;->q:La/rhv0;

    .line 269
    .line 270
    iget-object v12, v0, La/lme;->r:La/vne;

    .line 271
    .line 272
    iget-object v13, v0, La/lme;->s:Lkotlin/jvm/functions/Function1;

    .line 273
    .line 274
    iget-object v15, v0, La/lme;->t:La/qe60;

    .line 275
    .line 276
    iget-object v0, v0, La/lme;->u:La/w6k;

    .line 277
    .line 278
    move-object/from16 v16, v0

    .line 279
    .line 280
    move-object/from16 v17, v3

    .line 281
    .line 282
    invoke-direct/range {v6 .. v18}, La/mme;-><init>(La/k7q0;La/djz;ZZLa/rhv0;La/vne;Lkotlin/jvm/functions/Function1;La/a8q0;La/qe60;La/w6k;La/d39;I)V

    .line 283
    .line 284
    .line 285
    const v0, 0x54340ce8

    .line 286
    .line 287
    .line 288
    invoke-static {v0, v6, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    const/16 v3, 0x30

    .line 293
    .line 294
    invoke-static {v2, v0, v1, v3}, La/ydx;->t(La/mm40;La/ugd;La/fet;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_a
    invoke-virtual {v1}, La/fet;->X()V

    .line 299
    .line 300
    .line 301
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0
.end method
