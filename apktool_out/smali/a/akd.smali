.class public final La/akd;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/bkd;


# direct methods
.method public constructor <init>(La/bkd;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/akd;->o:La/bkd;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/akd;

    .line 2
    .line 3
    iget-object p0, p0, La/akd;->o:La/bkd;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/akd;-><init>(La/bkd;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/akd;->n:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/fgi0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/akd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/akd;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/akd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/akd;->o:La/bkd;

    .line 2
    .line 3
    iget-object v1, v0, La/bkd;->a:La/vy40;

    .line 4
    .line 5
    iget-object v2, v0, La/bkd;->c:Landroidx/collection/MutableIntList;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, p0, La/akd;->m:Z

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    if-ne v4, v5, :cond_0

    .line 15
    .line 16
    iget v4, p0, La/akd;->l:I

    .line 17
    .line 18
    iget v6, p0, La/akd;->k:I

    .line 19
    .line 20
    iget v7, p0, La/akd;->j:I

    .line 21
    .line 22
    iget-object v8, p0, La/akd;->n:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v8, La/fgi0;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/akd;->n:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v8, p1

    .line 43
    check-cast v8, La/fgi0;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    move v6, v4

    .line 47
    move v7, v6

    .line 48
    :goto_0
    iget p1, v0, La/bkd;->d:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0xa

    .line 51
    .line 52
    iget v9, v2, Landroidx/collection/MutableIntList;->b:I

    .line 53
    .line 54
    invoke-static {p1, v9}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-ge v7, p1, :cond_2

    .line 59
    .line 60
    add-int/lit8 p1, v7, 0x1

    .line 61
    .line 62
    invoke-virtual {v2, v7}, Landroidx/collection/MutableIntList;->c(I)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    const-string v10, " "

    .line 67
    .line 68
    packed-switch v9, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    const-string v0, "unknown op: "

    .line 72
    .line 73
    invoke-static {v9, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :pswitch_0
    const-string v0, "recompose pending"

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :pswitch_1
    iget-object v0, v0, La/bkd;->b:La/vy40;

    .line 84
    .line 85
    add-int/lit8 v1, v4, 0x1

    .line 86
    .line 87
    invoke-virtual {v0, v4}, La/vy40;->g(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v4, "reuse "

    .line 94
    .line 95
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move v4, v1

    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :pswitch_2
    invoke-virtual {v1, v6}, La/vy40;->g(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-static {v1, v0}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 120
    .line 121
    add-int/lit8 v6, v6, 0x2

    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v2, "apply "

    .line 126
    .line 127
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :pswitch_3
    add-int/lit8 v0, v7, 0x2

    .line 140
    .line 141
    invoke-virtual {v2, p1}, Landroidx/collection/MutableIntList;->c(I)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    add-int/lit8 v2, v6, 0x1

    .line 146
    .line 147
    invoke-virtual {v1, v6}, La/vy40;->g(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v6, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v9, "insertTopDown "

    .line 154
    .line 155
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :goto_1
    move v6, v0

    .line 172
    move-object v0, p1

    .line 173
    move p1, v6

    .line 174
    move v6, v2

    .line 175
    goto/16 :goto_2

    .line 176
    .line 177
    :pswitch_4
    add-int/lit8 v0, v7, 0x2

    .line 178
    .line 179
    invoke-virtual {v2, p1}, Landroidx/collection/MutableIntList;->c(I)I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    add-int/lit8 v2, v6, 0x1

    .line 184
    .line 185
    invoke-virtual {v1, v6}, La/vy40;->g(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    new-instance v6, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v9, "insertBottomUp "

    .line 192
    .line 193
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    goto :goto_1

    .line 210
    :pswitch_5
    const-string v0, "clear"

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :pswitch_6
    add-int/lit8 v0, v7, 0x2

    .line 214
    .line 215
    invoke-virtual {v2, p1}, Landroidx/collection/MutableIntList;->c(I)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    add-int/lit8 v1, v7, 0x3

    .line 220
    .line 221
    invoke-virtual {v2, v0}, Landroidx/collection/MutableIntList;->c(I)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    add-int/lit8 v9, v7, 0x4

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Landroidx/collection/MutableIntList;->c(I)I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    const-string v2, "move "

    .line 232
    .line 233
    invoke-static {v2, p1, v10, v10, v0}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    move p1, v9

    .line 245
    goto :goto_2

    .line 246
    :pswitch_7
    add-int/lit8 v0, v7, 0x2

    .line 247
    .line 248
    invoke-virtual {v2, p1}, Landroidx/collection/MutableIntList;->c(I)I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    add-int/lit8 v1, v7, 0x3

    .line 253
    .line 254
    invoke-virtual {v2, v0}, Landroidx/collection/MutableIntList;->c(I)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    const-string v2, "remove "

    .line 259
    .line 260
    invoke-static {p1, v2, v0, v10}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move p1, v1

    .line 265
    goto :goto_2

    .line 266
    :pswitch_8
    add-int/lit8 v0, v6, 0x1

    .line 267
    .line 268
    invoke-virtual {v1, v6}, La/vy40;->g(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v2, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v6, "down "

    .line 275
    .line 276
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    move v6, v0

    .line 287
    move-object v0, v1

    .line 288
    goto :goto_2

    .line 289
    :pswitch_9
    const-string v0, "up"

    .line 290
    .line 291
    :goto_2
    const-string v1, ": "

    .line 292
    .line 293
    invoke-static {v7, v1, v0}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iput-object v8, p0, La/akd;->n:Ljava/lang/Object;

    .line 298
    .line 299
    iput p1, p0, La/akd;->j:I

    .line 300
    .line 301
    iput v6, p0, La/akd;->k:I

    .line 302
    .line 303
    iput v4, p0, La/akd;->l:I

    .line 304
    .line 305
    iput-boolean v5, p0, La/akd;->m:Z

    .line 306
    .line 307
    invoke-virtual {v8, p0, v0}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    return-object v3

    .line 311
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object p0

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
