.class public final La/dku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i89;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i89;Ljava/lang/Object;JLjava/util/List;Ljava/util/List;ZZB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/dku;->a:B

    iput-object p1, p0, La/dku;->b:La/i89;

    iput-object p2, p0, La/dku;->h:Ljava/lang/Object;

    iput-wide p3, p0, La/dku;->c:J

    iput-object p5, p0, La/dku;->d:Ljava/util/List;

    iput-object p6, p0, La/dku;->e:Ljava/util/List;

    iput-boolean p7, p0, La/dku;->f:Z

    iput-boolean p8, p0, La/dku;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/dku;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/dku;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/dku;->b:La/i89;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v2, v1, La/iku;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/iku;

    .line 26
    .line 27
    iget v9, v2, La/iku;->j:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v2, La/iku;->j:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/iku;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/iku;-><init>(La/dku;La/yje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v2, La/iku;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v7, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v9, v2, La/iku;->j:I

    .line 47
    .line 48
    if-eqz v9, :cond_2

    .line 49
    .line 50
    if-ne v9, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v10, La/cku;

    .line 64
    .line 65
    move-object v12, v3

    .line 66
    check-cast v12, La/f7u;

    .line 67
    .line 68
    iget-boolean v1, v0, La/dku;->g:Z

    .line 69
    .line 70
    const/16 v19, 0x2

    .line 71
    .line 72
    iget-wide v13, v0, La/dku;->c:J

    .line 73
    .line 74
    iget-object v15, v0, La/dku;->d:Ljava/util/List;

    .line 75
    .line 76
    iget-object v3, v0, La/dku;->e:Ljava/util/List;

    .line 77
    .line 78
    iget-boolean v0, v0, La/dku;->f:Z

    .line 79
    .line 80
    move-object/from16 v11, p1

    .line 81
    .line 82
    move/from16 v17, v0

    .line 83
    .line 84
    move/from16 v18, v1

    .line 85
    .line 86
    move-object/from16 v16, v3

    .line 87
    .line 88
    invoke-direct/range {v10 .. v19}, La/cku;-><init>(La/kmq;Ljava/lang/Object;JLjava/util/List;Ljava/util/List;ZZB)V

    .line 89
    .line 90
    .line 91
    iput v8, v2, La/iku;->j:I

    .line 92
    .line 93
    invoke-virtual {v4, v10, v2}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v7, :cond_3

    .line 98
    .line 99
    move-object v5, v7

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_2
    return-object v5

    .line 104
    :pswitch_0
    instance-of v2, v1, La/fku;

    .line 105
    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    move-object v2, v1

    .line 109
    check-cast v2, La/fku;

    .line 110
    .line 111
    iget v9, v2, La/fku;->j:I

    .line 112
    .line 113
    and-int v10, v9, v7

    .line 114
    .line 115
    if-eqz v10, :cond_4

    .line 116
    .line 117
    sub-int/2addr v9, v7

    .line 118
    iput v9, v2, La/fku;->j:I

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    new-instance v2, La/fku;

    .line 122
    .line 123
    invoke-direct {v2, v0, v1}, La/fku;-><init>(La/dku;La/yje;)V

    .line 124
    .line 125
    .line 126
    :goto_3
    iget-object v1, v2, La/fku;->i:Ljava/lang/Object;

    .line 127
    .line 128
    sget-object v7, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget v9, v2, La/fku;->j:I

    .line 131
    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    if-ne v9, v8, :cond_5

    .line 135
    .line 136
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance v9, La/cku;

    .line 148
    .line 149
    move-object v11, v3

    .line 150
    check-cast v11, La/dgu;

    .line 151
    .line 152
    iget-boolean v1, v0, La/dku;->g:Z

    .line 153
    .line 154
    const/16 v18, 0x1

    .line 155
    .line 156
    iget-wide v12, v0, La/dku;->c:J

    .line 157
    .line 158
    iget-object v14, v0, La/dku;->d:Ljava/util/List;

    .line 159
    .line 160
    iget-object v15, v0, La/dku;->e:Ljava/util/List;

    .line 161
    .line 162
    iget-boolean v0, v0, La/dku;->f:Z

    .line 163
    .line 164
    move-object/from16 v10, p1

    .line 165
    .line 166
    move/from16 v16, v0

    .line 167
    .line 168
    move/from16 v17, v1

    .line 169
    .line 170
    invoke-direct/range {v9 .. v18}, La/cku;-><init>(La/kmq;Ljava/lang/Object;JLjava/util/List;Ljava/util/List;ZZB)V

    .line 171
    .line 172
    .line 173
    iput v8, v2, La/fku;->j:I

    .line 174
    .line 175
    invoke-virtual {v4, v9, v2}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v7, :cond_7

    .line 180
    .line 181
    move-object v5, v7

    .line 182
    goto :goto_5

    .line 183
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    :goto_5
    return-object v5

    .line 186
    :pswitch_1
    instance-of v2, v1, La/aku;

    .line 187
    .line 188
    if-eqz v2, :cond_8

    .line 189
    .line 190
    move-object v2, v1

    .line 191
    check-cast v2, La/aku;

    .line 192
    .line 193
    iget v9, v2, La/aku;->j:I

    .line 194
    .line 195
    and-int v10, v9, v7

    .line 196
    .line 197
    if-eqz v10, :cond_8

    .line 198
    .line 199
    sub-int/2addr v9, v7

    .line 200
    iput v9, v2, La/aku;->j:I

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_8
    new-instance v2, La/aku;

    .line 204
    .line 205
    invoke-direct {v2, v0, v1}, La/aku;-><init>(La/dku;La/yje;)V

    .line 206
    .line 207
    .line 208
    :goto_6
    iget-object v1, v2, La/aku;->i:Ljava/lang/Object;

    .line 209
    .line 210
    sget-object v7, La/wne;->a:La/wne;

    .line 211
    .line 212
    iget v9, v2, La/aku;->j:I

    .line 213
    .line 214
    if-eqz v9, :cond_a

    .line 215
    .line 216
    if-ne v9, v8, :cond_9

    .line 217
    .line 218
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_a
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    new-instance v9, La/cku;

    .line 230
    .line 231
    move-object v11, v3

    .line 232
    check-cast v11, La/f7u;

    .line 233
    .line 234
    iget-boolean v1, v0, La/dku;->g:Z

    .line 235
    .line 236
    const/16 v18, 0x0

    .line 237
    .line 238
    iget-wide v12, v0, La/dku;->c:J

    .line 239
    .line 240
    iget-object v14, v0, La/dku;->d:Ljava/util/List;

    .line 241
    .line 242
    iget-object v15, v0, La/dku;->e:Ljava/util/List;

    .line 243
    .line 244
    iget-boolean v0, v0, La/dku;->f:Z

    .line 245
    .line 246
    move-object/from16 v10, p1

    .line 247
    .line 248
    move/from16 v16, v0

    .line 249
    .line 250
    move/from16 v17, v1

    .line 251
    .line 252
    invoke-direct/range {v9 .. v18}, La/cku;-><init>(La/kmq;Ljava/lang/Object;JLjava/util/List;Ljava/util/List;ZZB)V

    .line 253
    .line 254
    .line 255
    iput v8, v2, La/aku;->j:I

    .line 256
    .line 257
    invoke-virtual {v4, v9, v2}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-ne v0, v7, :cond_b

    .line 262
    .line 263
    move-object v5, v7

    .line 264
    goto :goto_8

    .line 265
    :cond_b
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_8
    return-object v5

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
