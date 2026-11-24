.class public final synthetic La/s4f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r7f;


# direct methods
.method public synthetic constructor <init>(La/r7f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s4f;->a:B

    iput-object p1, p0, La/s4f;->b:La/r7f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/s4f;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/s4f;->b:La/r7f;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/r7f;->C1:La/w4f;

    .line 10
    .line 11
    sget-object v1, La/w4f;->c:La/w4f;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/r7f;->Z()V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, La/r7f;->Z()V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    invoke-virtual {p0}, La/r7f;->Z()V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    invoke-virtual {p0}, La/r7f;->Z()V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_3
    iget-object v0, p0, La/r7f;->W1:La/p7m0;

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    move-object v1, p0

    .line 46
    check-cast v1, La/n9h0;

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    const/16 v12, 0x7fb

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-static/range {v1 .. v12}, La/n9h0;->a(La/n9h0;ZZZLjava/lang/String;IZZZZZI)La/n9h0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_4
    iput-boolean v1, p0, La/r7f;->x1:Z

    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_5
    invoke-virtual {p0}, La/r7f;->Z()V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_6
    iget-object v0, p0, La/r7f;->D0:La/v88;

    .line 85
    .line 86
    iget-object v1, p0, La/r7f;->V0:La/i1w0;

    .line 87
    .line 88
    iget-object p0, p0, La/r7f;->l:La/p4u;

    .line 89
    .line 90
    invoke-virtual {p0}, La/p4u;->b()J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    const/4 p0, 0x1

    .line 95
    invoke-virtual {v0, v1, p0, v2, v3}, La/v88;->a(La/i1w0;ZJ)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_7
    iget-object v0, p0, La/r7f;->E1:La/bby;

    .line 102
    .line 103
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 104
    .line 105
    .line 106
    sget-object v0, La/f3f;->a:La/f3f;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, La/r7f;->R(La/c4f;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, La/r7f;->W1:La/p7m0;

    .line 112
    .line 113
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v3, v2

    .line 118
    check-cast v3, La/n9h0;

    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const/16 v14, 0x7fe

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x0

    .line 132
    invoke-static/range {v3 .. v14}, La/n9h0;->a(La/n9h0;ZZZLjava/lang/String;IZZZZZI)La/n9h0;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    iget-object v2, p0, La/r7f;->X1:La/p7m0;

    .line 143
    .line 144
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move-object v3, v0

    .line 149
    check-cast v3, La/pwq0;

    .line 150
    .line 151
    iget-object v4, v3, La/pwq0;->l:La/hao0;

    .line 152
    .line 153
    if-eqz v4, :cond_4

    .line 154
    .line 155
    invoke-static {v4, v1}, La/hao0;->a(La/hao0;Z)La/hao0;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    :goto_0
    move-object v12, v4

    .line 160
    goto :goto_1

    .line 161
    :cond_4
    const/4 v4, 0x0

    .line 162
    goto :goto_0

    .line 163
    :goto_1
    const/4 v13, 0x0

    .line 164
    const/16 v14, 0x17ff

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/4 v5, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x0

    .line 174
    invoke-static/range {v3 .. v14}, La/pwq0;->a(La/pwq0;ZLjava/lang/String;Ljava/util/List;ZZZZILa/hao0;ZI)La/pwq0;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    iget-object p0, p0, La/r7f;->o1:La/xre;

    .line 185
    .line 186
    sget-object v0, La/jit0;->a:La/jit0;

    .line 187
    .line 188
    invoke-virtual {p0, v0}, La/xre;->a(La/lit0;)V

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_8
    iget-object v0, p0, La/r7f;->W1:La/p7m0;

    .line 195
    .line 196
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    move-object v1, p0

    .line 201
    check-cast v1, La/n9h0;

    .line 202
    .line 203
    const/4 v11, 0x0

    .line 204
    const/16 v12, 0x7fe

    .line 205
    .line 206
    const/4 v2, 0x0

    .line 207
    const/4 v3, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    const/4 v6, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x0

    .line 214
    const/4 v10, 0x0

    .line 215
    invoke-static/range {v1 .. v12}, La/n9h0;->a(La/n9h0;ZZZLjava/lang/String;IZZZZZI)La/n9h0;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_5

    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_9
    iget-object p0, p0, La/r7f;->u1:La/n0o0;

    .line 229
    .line 230
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, La/sff0;

    .line 235
    .line 236
    iget-object p0, p0, La/sff0;->a:La/gx7;

    .line 237
    .line 238
    iget-object p0, p0, La/gx7;->c:La/b3f;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_a
    iget-object v0, p0, La/r7f;->W1:La/p7m0;

    .line 242
    .line 243
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    move-object v2, v1

    .line 248
    check-cast v2, La/n9h0;

    .line 249
    .line 250
    const/4 v12, 0x0

    .line 251
    const/16 v13, 0x7fb

    .line 252
    .line 253
    const/4 v3, 0x0

    .line 254
    const/4 v4, 0x1

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v10, 0x0

    .line 261
    const/4 v11, 0x0

    .line 262
    invoke-static/range {v2 .. v13}, La/n9h0;->a(La/n9h0;ZZZLjava/lang/String;IZZZZZI)La/n9h0;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_6

    .line 271
    .line 272
    iget-object p0, p0, La/r7f;->d2:La/ol60;

    .line 273
    .line 274
    sget-object v0, La/d3f;->a:La/d3f;

    .line 275
    .line 276
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object p0

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
