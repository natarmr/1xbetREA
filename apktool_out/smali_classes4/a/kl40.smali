.class public final La/kl40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/nl40;


# direct methods
.method public synthetic constructor <init>(La/nl40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kl40;->i:B

    iput-object p1, p0, La/kl40;->k:La/nl40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kl40;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kl40;->k:La/nl40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kl40;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kl40;-><init>(La/nl40;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/kl40;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/kl40;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/kl40;-><init>(La/nl40;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/kl40;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/kl40;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/kl40;-><init>(La/nl40;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/kl40;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/kl40;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/kl40;-><init>(La/nl40;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/kl40;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kl40;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kam0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kl40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kl40;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kl40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/bqr;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kl40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kl40;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kl40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/kl40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/kl40;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/kl40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/xsr;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/kl40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/kl40;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/kl40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kl40;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/kl40;->k:La/nl40;

    .line 6
    .line 7
    iget-object v0, v0, La/kl40;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, La/kam0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v0, La/nl40;->a0:I

    .line 21
    .line 22
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v4, v0

    .line 34
    check-cast v4, La/dl40;

    .line 35
    .line 36
    iget-object v2, v1, La/kam0;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v5, v4, La/dl40;->v:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    xor-int/lit8 v17, v5, 0x1

    .line 45
    .line 46
    const-wide/16 v19, 0x0

    .line 47
    .line 48
    const v21, 0xcfffff

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    move-object/from16 v18, v2

    .line 65
    .line 66
    invoke-static/range {v4 .. v21}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_0
    move-object v8, v0

    .line 80
    check-cast v8, La/bqr;

    .line 81
    .line 82
    sget-object v0, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget v0, La/nl40;->a0:I

    .line 88
    .line 89
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object v3, v0

    .line 101
    check-cast v3, La/dl40;

    .line 102
    .line 103
    const-wide/16 v18, 0x0

    .line 104
    .line 105
    const v20, 0xffffdf

    .line 106
    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    invoke-static/range {v3 .. v20}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_1
    move-object v10, v0

    .line 137
    check-cast v10, Ljava/util/List;

    .line 138
    .line 139
    sget-object v0, La/wne;->a:La/wne;

    .line 140
    .line 141
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget v0, La/nl40;->a0:I

    .line 145
    .line 146
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 147
    .line 148
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 149
    .line 150
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-object v3, v0

    .line 158
    check-cast v3, La/dl40;

    .line 159
    .line 160
    const-wide/16 v18, 0x0

    .line 161
    .line 162
    const v20, 0xfff7ff

    .line 163
    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    const/4 v5, 0x0

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v7, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v9, 0x0

    .line 171
    const/4 v11, 0x0

    .line 172
    const/4 v12, 0x0

    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    const/16 v16, 0x0

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    invoke-static/range {v3 .. v20}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_2

    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_2
    check-cast v0, La/xsr;

    .line 194
    .line 195
    sget-object v1, La/wne;->a:La/wne;

    .line 196
    .line 197
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    instance-of v12, v0, La/usr;

    .line 201
    .line 202
    iget-object v0, v2, La/nl40;->o:La/vzg0;

    .line 203
    .line 204
    const-string v1, "auto_start_stream_enabled_key"

    .line 205
    .line 206
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v0, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 214
    .line 215
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 216
    .line 217
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-object v3, v1

    .line 225
    check-cast v3, La/dl40;

    .line 226
    .line 227
    const-wide/16 v18, 0x0

    .line 228
    .line 229
    const v20, 0xff7fff

    .line 230
    .line 231
    .line 232
    const/4 v4, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    const/4 v9, 0x0

    .line 238
    const/4 v10, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v13, 0x0

    .line 241
    const/4 v14, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    invoke-static/range {v3 .. v20}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_3

    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
