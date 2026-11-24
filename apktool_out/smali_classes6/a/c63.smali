.class public final synthetic La/c63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/util/ArrayList;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/c63;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/c63;->b:J

    iput-object p3, p0, La/c63;->d:Ljava/lang/Object;

    iput p4, p0, La/c63;->c:F

    return-void
.end method

.method public synthetic constructor <init>(La/ywv0;FJ)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/c63;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c63;->d:Ljava/lang/Object;

    iput p2, p0, La/c63;->c:F

    iput-wide p3, p0, La/c63;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;JF)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/c63;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c63;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/c63;->b:J

    iput p4, p0, La/c63;->c:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c63;->a:B

    .line 4
    .line 5
    iget v2, v0, La/c63;->c:F

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/c63;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, La/ywv0;

    .line 14
    .line 15
    move-object/from16 v5, p1

    .line 16
    .line 17
    check-cast v5, La/fhl;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v4, La/ywv0;->d:La/glt0;

    .line 23
    .line 24
    iget-object v1, v1, La/glt0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/t33;

    .line 27
    .line 28
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    div-float/2addr v1, v2

    .line 39
    const/high16 v2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {v1, v3, v2}, La/l1e0;->c(FFF)F

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    cmpl-float v1, v12, v3

    .line 46
    .line 47
    if-lez v1, :cond_0

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x76

    .line 51
    .line 52
    iget-wide v6, v0, La/c63;->b:J

    .line 53
    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    const-wide/16 v10, 0x0

    .line 57
    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    invoke-static/range {v5 .. v16}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 61
    .line 62
    .line 63
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    check-cast v4, Ljava/util/List;

    .line 67
    .line 68
    move-object/from16 v5, p1

    .line 69
    .line 70
    check-cast v5, La/fhl;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {v5}, La/fhl;->d()J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    const/16 v16, 0x20

    .line 80
    .line 81
    shr-long v1, v1, v16

    .line 82
    .line 83
    long-to-int v1, v1

    .line 84
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-interface {v5}, La/fhl;->d()J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    const-wide v17, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long v6, v6, v17

    .line 98
    .line 99
    long-to-int v2, v6

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, La/st8;

    .line 119
    .line 120
    iget v7, v6, La/st8;->a:I

    .line 121
    .line 122
    int-to-float v7, v7

    .line 123
    iget v8, v6, La/st8;->b:I

    .line 124
    .line 125
    int-to-float v8, v8

    .line 126
    iget v9, v6, La/st8;->c:I

    .line 127
    .line 128
    int-to-float v9, v9

    .line 129
    iget v6, v6, La/st8;->d:I

    .line 130
    .line 131
    int-to-float v6, v6

    .line 132
    cmpg-float v10, v3, v7

    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x1

    .line 136
    if-gtz v10, :cond_2

    .line 137
    .line 138
    cmpg-float v10, v7, v1

    .line 139
    .line 140
    if-gtz v10, :cond_2

    .line 141
    .line 142
    cmpl-float v10, v8, v3

    .line 143
    .line 144
    if-ltz v10, :cond_2

    .line 145
    .line 146
    cmpg-float v10, v8, v2

    .line 147
    .line 148
    if-gtz v10, :cond_2

    .line 149
    .line 150
    move v10, v12

    .line 151
    goto :goto_1

    .line 152
    :cond_2
    move v10, v11

    .line 153
    :goto_1
    cmpg-float v13, v3, v9

    .line 154
    .line 155
    if-gtz v13, :cond_3

    .line 156
    .line 157
    cmpg-float v13, v9, v1

    .line 158
    .line 159
    if-gtz v13, :cond_3

    .line 160
    .line 161
    cmpl-float v13, v6, v3

    .line 162
    .line 163
    if-ltz v13, :cond_3

    .line 164
    .line 165
    cmpg-float v13, v6, v2

    .line 166
    .line 167
    if-gtz v13, :cond_3

    .line 168
    .line 169
    move v11, v12

    .line 170
    :cond_3
    if-nez v10, :cond_4

    .line 171
    .line 172
    if-eqz v11, :cond_1

    .line 173
    .line 174
    :cond_4
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    int-to-long v10, v7

    .line 179
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    int-to-long v7, v7

    .line 184
    shl-long v10, v10, v16

    .line 185
    .line 186
    and-long v7, v7, v17

    .line 187
    .line 188
    or-long/2addr v7, v10

    .line 189
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    int-to-long v9, v9

    .line 194
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    int-to-long v11, v6

    .line 199
    shl-long v9, v9, v16

    .line 200
    .line 201
    and-long v11, v11, v17

    .line 202
    .line 203
    or-long v10, v9, v11

    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const/16 v15, 0x1f0

    .line 207
    .line 208
    move-wide v8, v7

    .line 209
    iget-wide v6, v0, La/c63;->b:J

    .line 210
    .line 211
    iget v12, v0, La/c63;->c:F

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    invoke-static/range {v5 .. v15}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_1
    check-cast v4, Ljava/util/ArrayList;

    .line 222
    .line 223
    move-object/from16 v1, p1

    .line 224
    .line 225
    check-cast v1, La/ou90;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-wide v5, v0, La/c63;->b:J

    .line 231
    .line 232
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    div-int/lit8 v0, v0, 0x2

    .line 237
    .line 238
    invoke-static {v5, v6}, La/p4e;->h(J)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    div-int/lit8 v5, v5, 0x2

    .line 243
    .line 244
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    check-cast v4, La/pu90;

    .line 249
    .line 250
    if-eqz v4, :cond_6

    .line 251
    .line 252
    int-to-float v0, v0

    .line 253
    const/high16 v6, 0x40000000    # 2.0f

    .line 254
    .line 255
    div-float/2addr v2, v6

    .line 256
    sub-float/2addr v0, v2

    .line 257
    invoke-static {v0}, La/si30;->b(F)I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    iget v2, v4, La/pu90;->b:I

    .line 262
    .line 263
    div-int/lit8 v2, v2, 0x2

    .line 264
    .line 265
    sub-int/2addr v5, v2

    .line 266
    invoke-virtual {v1, v4, v0, v5, v3}, La/ou90;->m(La/pu90;IIF)V

    .line 267
    .line 268
    .line 269
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
