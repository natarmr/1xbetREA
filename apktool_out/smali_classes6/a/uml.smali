.class public final La/uml;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:I

.field public k:I

.field public l:B

.field public final synthetic m:La/lml;

.field public final synthetic n:I

.field public final synthetic o:F

.field public final synthetic p:La/pzh;

.field public final synthetic q:F


# direct methods
.method public constructor <init>(La/lml;IFLa/pzh;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uml;->m:La/lml;

    .line 2
    .line 3
    iput p2, p0, La/uml;->n:I

    .line 4
    .line 5
    iput p3, p0, La/uml;->o:F

    .line 6
    .line 7
    iput-object p4, p0, La/uml;->p:La/pzh;

    .line 8
    .line 9
    iput p5, p0, La/uml;->q:F

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/uml;

    .line 2
    .line 3
    iget-object v4, p0, La/uml;->p:La/pzh;

    .line 4
    .line 5
    iget v5, p0, La/uml;->q:F

    .line 6
    .line 7
    iget-object v1, p0, La/uml;->m:La/lml;

    .line 8
    .line 9
    iget v2, p0, La/uml;->n:I

    .line 10
    .line 11
    iget v3, p0, La/uml;->o:F

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/uml;-><init>(La/lml;IFLa/pzh;FLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/uml;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uml;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/uml;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/uml;->m:La/lml;

    .line 4
    .line 5
    iget-object v2, v1, La/lml;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v1, La/lml;->b:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, v1, La/lml;->d:Ljava/util/List;

    .line 10
    .line 11
    sget-object v5, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v6, v0, La/uml;->l:B

    .line 14
    .line 15
    const/4 v7, 0x3

    .line 16
    iget v8, v0, La/uml;->n:I

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    iget v11, v0, La/uml;->q:F

    .line 21
    .line 22
    iget-object v12, v0, La/uml;->p:La/pzh;

    .line 23
    .line 24
    const/4 v13, 0x2

    .line 25
    if-eqz v6, :cond_3

    .line 26
    .line 27
    if-eq v6, v9, :cond_2

    .line 28
    .line 29
    if-eq v6, v13, :cond_1

    .line 30
    .line 31
    if-ne v6, v7, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    return-object v0

    .line 45
    :cond_1
    iget v1, v0, La/uml;->k:I

    .line 46
    .line 47
    iget v6, v0, La/uml;->j:I

    .line 48
    .line 49
    iget v14, v0, La/uml;->i:I

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v18, v2

    .line 55
    .line 56
    move/from16 v17, v9

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_2
    iget v1, v0, La/uml;->i:I

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v1, La/lml;->a:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-lez v1, :cond_4

    .line 82
    .line 83
    iget v6, v0, La/uml;->o:F

    .line 84
    .line 85
    int-to-float v14, v1

    .line 86
    mul-float/2addr v6, v14

    .line 87
    const/high16 v14, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-static {v14, v6}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-static {v6}, La/si30;->b(F)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    iget-object v14, v12, La/pzh;->b:La/xcz;

    .line 98
    .line 99
    neg-float v15, v11

    .line 100
    int-to-float v7, v6

    .line 101
    mul-float/2addr v15, v7

    .line 102
    sget-object v7, La/ihn;->d:La/z73;

    .line 103
    .line 104
    invoke-static {v1, v10, v7, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    iput v1, v0, La/uml;->i:I

    .line 109
    .line 110
    iput v6, v0, La/uml;->j:I

    .line 111
    .line 112
    iput-byte v9, v0, La/uml;->l:B

    .line 113
    .line 114
    invoke-static {v14, v15, v7, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-ne v6, v5, :cond_4

    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    :goto_0
    invoke-static {v4}, La/q3d;->i(Ljava/util/List;)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    move v14, v1

    .line 127
    move v1, v10

    .line 128
    :goto_1
    if-ge v1, v6, :cond_6

    .line 129
    .line 130
    iget-object v7, v12, La/pzh;->b:La/xcz;

    .line 131
    .line 132
    neg-float v15, v11

    .line 133
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v16

    .line 137
    check-cast v16, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->floatValue()F

    .line 140
    .line 141
    .line 142
    move-result v16

    .line 143
    mul-float v15, v15, v16

    .line 144
    .line 145
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v16

    .line 149
    move/from16 v17, v9

    .line 150
    .line 151
    move-object/from16 v9, v16

    .line 152
    .line 153
    check-cast v9, Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    check-cast v9, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    move-object/from16 v18, v2

    .line 170
    .line 171
    move-object/from16 v2, v16

    .line 172
    .line 173
    check-cast v2, La/ghn;

    .line 174
    .line 175
    invoke-static {v9, v10, v2, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iput v14, v0, La/uml;->i:I

    .line 180
    .line 181
    iput v6, v0, La/uml;->j:I

    .line 182
    .line 183
    iput v1, v0, La/uml;->k:I

    .line 184
    .line 185
    iput-byte v13, v0, La/uml;->l:B

    .line 186
    .line 187
    invoke-static {v7, v15, v2, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-ne v2, v5, :cond_5

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    move/from16 v9, v17

    .line 197
    .line 198
    move-object/from16 v2, v18

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_6
    move-object/from16 v18, v2

    .line 202
    .line 203
    invoke-static {v11}, La/si30;->b(F)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iget-object v2, v12, La/pzh;->b:La/xcz;

    .line 208
    .line 209
    invoke-virtual {v2}, La/xcz;->i()I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    rem-int/2addr v2, v1

    .line 214
    div-int/lit8 v7, v1, 0x2

    .line 215
    .line 216
    if-gt v2, v7, :cond_7

    .line 217
    .line 218
    neg-int v2, v2

    .line 219
    goto :goto_3

    .line 220
    :cond_7
    sub-int v2, v1, v2

    .line 221
    .line 222
    :goto_3
    iget-object v7, v12, La/pzh;->b:La/xcz;

    .line 223
    .line 224
    neg-float v9, v11

    .line 225
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    mul-float/2addr v4, v9

    .line 236
    int-to-float v2, v2

    .line 237
    add-float/2addr v4, v2

    .line 238
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    move-object/from16 v3, v18

    .line 255
    .line 256
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, La/ghn;

    .line 261
    .line 262
    invoke-static {v2, v10, v3, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    iput v14, v0, La/uml;->i:I

    .line 267
    .line 268
    iput v6, v0, La/uml;->j:I

    .line 269
    .line 270
    iput v1, v0, La/uml;->k:I

    .line 271
    .line 272
    const/4 v1, 0x3

    .line 273
    iput-byte v1, v0, La/uml;->l:B

    .line 274
    .line 275
    invoke-static {v7, v4, v2, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-ne v0, v5, :cond_8

    .line 280
    .line 281
    :goto_4
    return-object v5

    .line 282
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0
.end method
