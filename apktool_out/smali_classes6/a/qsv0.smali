.class public final synthetic La/qsv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/fuj0;

.field public final synthetic d:La/w6k;

.field public final synthetic e:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/fuj0;La/w6k;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/qsv0;->a:B

    iput-object p1, p0, La/qsv0;->b:La/l7m0;

    iput-object p2, p0, La/qsv0;->c:La/fuj0;

    iput-object p3, p0, La/qsv0;->d:La/w6k;

    iput-object p4, p0, La/qsv0;->e:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/qsv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/qsv0;->e:La/ugd;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v11, p1

    .line 12
    check-cast v11, La/fet;

    .line 13
    .line 14
    move-object/from16 v0, p2

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    and-int/lit8 v5, v0, 0x3

    .line 23
    .line 24
    if-eq v5, v1, :cond_0

    .line 25
    .line 26
    move v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v3

    .line 29
    :goto_0
    and-int/2addr v0, v2

    .line 30
    invoke-virtual {v11, v0, v1}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object v0, La/jm40;->b:La/jm40;

    .line 37
    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 45
    .line 46
    invoke-static {v1, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-wide v5, v11, La/fet;->T:J

    .line 51
    .line 52
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v11}, La/fet;->i0()V

    .line 70
    .line 71
    .line 72
    iget-boolean v6, v11, La/fet;->S:Z

    .line 73
    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 77
    .line 78
    invoke-virtual {v11, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v11}, La/fet;->r0()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 86
    .line 87
    invoke-static {v11, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, La/gqw0;->w:La/shd;

    .line 91
    .line 92
    invoke-static {v11, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v3, La/gqw0;->y:La/shd;

    .line 100
    .line 101
    invoke-static {v11, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, La/gqw0;->v:La/shd;

    .line 108
    .line 109
    invoke-static {v11, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    sget-object v6, La/tsv0;->b:La/tsv0;

    .line 113
    .line 114
    new-instance v0, La/kqj0;

    .line 115
    .line 116
    const/4 v1, 0x5

    .line 117
    invoke-direct {v0, v4, v1}, La/kqj0;-><init>(La/ugd;B)V

    .line 118
    .line 119
    .line 120
    const v1, 0x67ef2167

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    const v12, 0x30030

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x1

    .line 131
    const/4 v5, 0x0

    .line 132
    iget-object v7, p0, La/qsv0;->b:La/l7m0;

    .line 133
    .line 134
    iget-object v8, p0, La/qsv0;->c:La/fuj0;

    .line 135
    .line 136
    iget-object v9, p0, La/qsv0;->d:La/w6k;

    .line 137
    .line 138
    invoke-static/range {v5 .. v13}, La/qsm0;->q(La/mm40;La/tsv0;La/l7m0;La/fuj0;La/w6k;La/ugd;La/fet;II)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    invoke-virtual {v11}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_0
    move-object v6, p1

    .line 152
    check-cast v6, La/fet;

    .line 153
    .line 154
    move-object/from16 v0, p2

    .line 155
    .line 156
    check-cast v0, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    and-int/lit8 v5, v0, 0x3

    .line 163
    .line 164
    if-eq v5, v1, :cond_3

    .line 165
    .line 166
    move v3, v2

    .line 167
    :cond_3
    and-int/2addr v0, v2

    .line 168
    invoke-virtual {v6, v0, v3}, La/fet;->U(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_4

    .line 173
    .line 174
    sget-object v1, La/tsv0;->b:La/tsv0;

    .line 175
    .line 176
    new-instance v0, La/kqj0;

    .line 177
    .line 178
    const/4 v2, 0x7

    .line 179
    invoke-direct {v0, v4, v2}, La/kqj0;-><init>(La/ugd;B)V

    .line 180
    .line 181
    .line 182
    const v2, 0x3ecf1a3b

    .line 183
    .line 184
    .line 185
    invoke-static {v2, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const v7, 0x30030

    .line 190
    .line 191
    .line 192
    const/4 v8, 0x1

    .line 193
    const/4 v0, 0x0

    .line 194
    iget-object v2, p0, La/qsv0;->b:La/l7m0;

    .line 195
    .line 196
    iget-object v3, p0, La/qsv0;->c:La/fuj0;

    .line 197
    .line 198
    iget-object v4, p0, La/qsv0;->d:La/w6k;

    .line 199
    .line 200
    invoke-static/range {v0 .. v8}, La/qsm0;->q(La/mm40;La/tsv0;La/l7m0;La/fuj0;La/w6k;La/ugd;La/fet;II)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_4
    invoke-virtual {v6}, La/fet;->X()V

    .line 205
    .line 206
    .line 207
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_1
    move-object v6, p1

    .line 211
    check-cast v6, La/fet;

    .line 212
    .line 213
    move-object/from16 v0, p2

    .line 214
    .line 215
    check-cast v0, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    and-int/lit8 v5, v0, 0x3

    .line 222
    .line 223
    if-eq v5, v1, :cond_5

    .line 224
    .line 225
    move v3, v2

    .line 226
    :cond_5
    and-int/2addr v0, v2

    .line 227
    invoke-virtual {v6, v0, v3}, La/fet;->U(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_6

    .line 232
    .line 233
    sget-object v1, La/tsv0;->d:La/tsv0;

    .line 234
    .line 235
    new-instance v0, La/kqj0;

    .line 236
    .line 237
    const/4 v2, 0x6

    .line 238
    invoke-direct {v0, v4, v2}, La/kqj0;-><init>(La/ugd;B)V

    .line 239
    .line 240
    .line 241
    const v2, 0x8363f9e

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    const v7, 0x30030

    .line 249
    .line 250
    .line 251
    const/4 v8, 0x1

    .line 252
    const/4 v0, 0x0

    .line 253
    iget-object v2, p0, La/qsv0;->b:La/l7m0;

    .line 254
    .line 255
    iget-object v3, p0, La/qsv0;->c:La/fuj0;

    .line 256
    .line 257
    iget-object v4, p0, La/qsv0;->d:La/w6k;

    .line 258
    .line 259
    invoke-static/range {v0 .. v8}, La/qsm0;->q(La/mm40;La/tsv0;La/l7m0;La/fuj0;La/w6k;La/ugd;La/fet;II)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_6
    invoke-virtual {v6}, La/fet;->X()V

    .line 264
    .line 265
    .line 266
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
