.class public final synthetic La/bu2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/ycl;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:La/l7m0;

.field public final synthetic g:J

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/ycl;La/l7m0;La/l7m0;FFLa/l7m0;JLa/ugd;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bu2;->a:La/ycl;

    iput-object p2, p0, La/bu2;->b:La/l7m0;

    iput-object p3, p0, La/bu2;->c:La/l7m0;

    iput p4, p0, La/bu2;->d:F

    iput p5, p0, La/bu2;->e:F

    iput-object p6, p0, La/bu2;->f:La/l7m0;

    iput-wide p7, p0, La/bu2;->g:J

    iput-object p9, p0, La/bu2;->h:La/ugd;

    iput-object p10, p0, La/bu2;->i:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/hh80;

    .line 6
    .line 7
    move-object/from16 v4, p2

    .line 8
    .line 9
    check-cast v4, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v5, 0x12

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eq v3, v5, :cond_2

    .line 43
    .line 44
    move v3, v7

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v3, v6

    .line 47
    :goto_1
    and-int/lit8 v5, v2, 0x1

    .line 48
    .line 49
    invoke-virtual {v4, v5, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_7

    .line 54
    .line 55
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 56
    .line 57
    iget-object v5, v0, La/bu2;->a:La/ycl;

    .line 58
    .line 59
    move v8, v2

    .line 60
    iget-object v2, v0, La/bu2;->b:La/l7m0;

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    sget-object v10, La/jm40;->b:La/jm40;

    .line 64
    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    iget v5, v5, La/ycl;->a:F

    .line 68
    .line 69
    new-instance v11, La/ez20;

    .line 70
    .line 71
    iget-object v12, v0, La/bu2;->c:La/l7m0;

    .line 72
    .line 73
    iget v13, v0, La/bu2;->d:F

    .line 74
    .line 75
    invoke-direct {v11, v12, v2, v13, v5}, La/ez20;-><init>(La/l7m0;La/l7m0;FF)V

    .line 76
    .line 77
    .line 78
    invoke-static {v10, v11}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_4

    .line 83
    :cond_3
    invoke-interface {v1}, La/hh80;->d()F

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    iget v11, v0, La/bu2;->e:F

    .line 88
    .line 89
    sub-float/2addr v5, v11

    .line 90
    new-instance v11, La/ycl;

    .line 91
    .line 92
    invoke-direct {v11, v5}, La/ycl;-><init>(F)V

    .line 93
    .line 94
    .line 95
    sget-object v12, La/qmk;->a:La/zcl;

    .line 96
    .line 97
    invoke-static {v5, v9}, La/ycl;->a(FF)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-ltz v5, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/4 v11, 0x0

    .line 105
    :goto_2
    if-eqz v11, :cond_5

    .line 106
    .line 107
    iget v5, v11, La/ycl;->a:F

    .line 108
    .line 109
    move v12, v5

    .line 110
    goto :goto_3

    .line 111
    :cond_5
    move v12, v9

    .line 112
    :goto_3
    const/4 v14, 0x0

    .line 113
    const/16 v15, 0xd

    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    :goto_4
    invoke-interface {v3, v5}, La/mm40;->e(La/mm40;)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget-object v5, v0, La/bu2;->f:La/l7m0;

    .line 126
    .line 127
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    check-cast v10, La/ycl;

    .line 132
    .line 133
    iget v10, v10, La/ycl;->a:F

    .line 134
    .line 135
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, La/ycl;

    .line 140
    .line 141
    iget v5, v5, La/ycl;->a:F

    .line 142
    .line 143
    const/16 v11, 0xc

    .line 144
    .line 145
    invoke-static {v10, v5, v9, v9, v11}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v3, v5}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    const/high16 v5, 0x3f800000    # 1.0f

    .line 154
    .line 155
    invoke-static {v3, v5}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    sget-object v5, La/jd8;->n:La/ljc;

    .line 160
    .line 161
    iget-wide v9, v0, La/bu2;->g:J

    .line 162
    .line 163
    invoke-static {v3, v9, v10, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 168
    .line 169
    invoke-static {v5, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    iget-wide v9, v4, La/fet;->T:J

    .line 174
    .line 175
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-static {v4, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, La/fet;->i0()V

    .line 193
    .line 194
    .line 195
    iget-boolean v10, v4, La/fet;->S:Z

    .line 196
    .line 197
    if-eqz v10, :cond_6

    .line 198
    .line 199
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 200
    .line 201
    invoke-virtual {v4, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    invoke-virtual {v4}, La/fet;->r0()V

    .line 206
    .line 207
    .line 208
    :goto_5
    sget-object v10, La/gqw0;->x:La/shd;

    .line 209
    .line 210
    invoke-static {v4, v5, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    sget-object v5, La/gqw0;->w:La/shd;

    .line 214
    .line 215
    invoke-static {v4, v9, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    sget-object v6, La/gqw0;->y:La/shd;

    .line 223
    .line 224
    invoke-static {v4, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 228
    .line 229
    .line 230
    sget-object v5, La/gqw0;->v:La/shd;

    .line 231
    .line 232
    invoke-static {v4, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 233
    .line 234
    .line 235
    and-int/lit8 v3, v8, 0xe

    .line 236
    .line 237
    or-int/lit16 v3, v3, 0x1b0

    .line 238
    .line 239
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    iget-object v3, v0, La/bu2;->h:La/ugd;

    .line 244
    .line 245
    iget-object v0, v0, La/bu2;->i:La/l7m0;

    .line 246
    .line 247
    move-object/from16 v16, v3

    .line 248
    .line 249
    move-object v3, v0

    .line 250
    move-object/from16 v0, v16

    .line 251
    .line 252
    invoke-virtual/range {v0 .. v5}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v7}, La/fet;->r(Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_7
    invoke-virtual {v4}, La/fet;->X()V

    .line 260
    .line 261
    .line 262
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0
.end method
