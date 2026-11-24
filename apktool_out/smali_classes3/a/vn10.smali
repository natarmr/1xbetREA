.class public final La/vn10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/bo10;

.field public k:B

.field public final synthetic l:La/bo10;


# direct methods
.method public synthetic constructor <init>(La/bo10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vn10;->i:B

    iput-object p1, p0, La/vn10;->l:La/bo10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/vn10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vn10;->l:La/bo10;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/vn10;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/vn10;-><init>(La/bo10;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/vn10;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/vn10;-><init>(La/bo10;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vn10;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/vn10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vn10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vn10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vn10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vn10;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vn10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/vn10;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/vn10;->l:La/bo10;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/vn10;->k:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, La/vn10;->j:La/bo10;

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, La/ko10;->a:La/ko10;

    .line 42
    .line 43
    iput-object p1, v2, La/bo10;->M:La/ko10;

    .line 44
    .line 45
    iget-object p1, v2, La/bo10;->g:La/n660;

    .line 46
    .line 47
    iget-boolean v1, v2, La/bo10;->G:Z

    .line 48
    .line 49
    iput-object v2, p0, La/vn10;->j:La/bo10;

    .line 50
    .line 51
    iput-byte v3, p0, La/vn10;->k:B

    .line 52
    .line 53
    invoke-virtual {p1, v1, p0}, La/n660;->A(ZLa/zje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object v1, v2

    .line 61
    :goto_0
    check-cast p1, La/x9v0;

    .line 62
    .line 63
    iput-object p1, v1, La/bo10;->H:La/x9v0;

    .line 64
    .line 65
    invoke-virtual {v2}, La/bo10;->z()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, La/bo10;->x()V

    .line 69
    .line 70
    .line 71
    iget-object p1, v2, La/bo10;->H:La/x9v0;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    iget-object p1, p1, La/x9v0;->c:La/csr;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move-object p1, v5

    .line 79
    :goto_1
    iput-object p1, v2, La/bo10;->J:La/csr;

    .line 80
    .line 81
    iput-object v5, p0, La/vn10;->j:La/bo10;

    .line 82
    .line 83
    iput-byte v4, p0, La/vn10;->k:B

    .line 84
    .line 85
    invoke-virtual {v2, p0}, La/bo10;->C(La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v0, :cond_5

    .line 90
    .line 91
    :goto_2
    move-object v5, v0

    .line 92
    goto :goto_6

    .line 93
    :cond_5
    :goto_3
    iget-object p0, v2, La/bo10;->H:La/x9v0;

    .line 94
    .line 95
    if-eqz p0, :cond_6

    .line 96
    .line 97
    iget-object p0, p0, La/x9v0;->c:La/csr;

    .line 98
    .line 99
    if-eqz p0, :cond_6

    .line 100
    .line 101
    iget-object p0, p0, La/csr;->a:La/bsr;

    .line 102
    .line 103
    iget-object p0, p0, La/bsr;->a:La/esr;

    .line 104
    .line 105
    :goto_4
    move-object v0, p0

    .line 106
    goto :goto_5

    .line 107
    :cond_6
    sget-object p0, La/esr;->c:La/esr;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :goto_5
    iget-object v6, v2, La/bo10;->v:La/p7m0;

    .line 111
    .line 112
    :cond_7
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    move-object p1, p0

    .line 117
    check-cast p1, La/mav0;

    .line 118
    .line 119
    const/16 v1, 0x1b

    .line 120
    .line 121
    invoke-static {p1, v0, v5, v1}, La/mav0;->a(La/mav0;La/esr;La/esr;I)La/mav0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {v6, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_7

    .line 130
    .line 131
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    :goto_6
    return-object v5

    .line 134
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 135
    .line 136
    iget-byte v6, p0, La/vn10;->k:B

    .line 137
    .line 138
    const/4 v7, 0x3

    .line 139
    if-eqz v6, :cond_b

    .line 140
    .line 141
    if-eq v6, v3, :cond_a

    .line 142
    .line 143
    if-eq v6, v4, :cond_9

    .line 144
    .line 145
    if-ne v6, v7, :cond_8

    .line 146
    .line 147
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_a

    .line 151
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_9
    iget-object v1, p0, La/vn10;->j:La/bo10;

    .line 157
    .line 158
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_a
    iget-object v1, p0, La/vn10;->j:La/bo10;

    .line 163
    .line 164
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object p1, La/ko10;->b:La/ko10;

    .line 172
    .line 173
    iput-object p1, v2, La/bo10;->M:La/ko10;

    .line 174
    .line 175
    iget-object p1, v2, La/bo10;->l:La/gxu;

    .line 176
    .line 177
    iput-object v2, p0, La/vn10;->j:La/bo10;

    .line 178
    .line 179
    iput-byte v3, p0, La/vn10;->k:B

    .line 180
    .line 181
    invoke-virtual {p1, p0}, La/gxu;->p(La/bnn0;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, v0, :cond_c

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_c
    move-object v1, v2

    .line 189
    :goto_7
    check-cast p1, La/sxk0;

    .line 190
    .line 191
    iput-object p1, v1, La/bo10;->I:La/sxk0;

    .line 192
    .line 193
    iget-object p1, v2, La/bo10;->f:La/y3v;

    .line 194
    .line 195
    iput-object v2, p0, La/vn10;->j:La/bo10;

    .line 196
    .line 197
    iput-byte v4, p0, La/vn10;->k:B

    .line 198
    .line 199
    invoke-virtual {p1, p0}, La/y3v;->n(La/zje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v0, :cond_d

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_d
    move-object v1, v2

    .line 207
    :goto_8
    check-cast p1, La/x9v0;

    .line 208
    .line 209
    iput-object p1, v1, La/bo10;->H:La/x9v0;

    .line 210
    .line 211
    invoke-virtual {v2}, La/bo10;->x()V

    .line 212
    .line 213
    .line 214
    iput-object v5, p0, La/vn10;->j:La/bo10;

    .line 215
    .line 216
    iput-byte v7, p0, La/vn10;->k:B

    .line 217
    .line 218
    invoke-virtual {v2, p0}, La/bo10;->C(La/zje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-ne p0, v0, :cond_e

    .line 223
    .line 224
    :goto_9
    move-object v5, v0

    .line 225
    goto :goto_c

    .line 226
    :cond_e
    :goto_a
    iget-object p0, v2, La/bo10;->I:La/sxk0;

    .line 227
    .line 228
    if-eqz p0, :cond_f

    .line 229
    .line 230
    iget-object p0, p0, La/sxk0;->c:Ljava/util/List;

    .line 231
    .line 232
    if-eqz p0, :cond_f

    .line 233
    .line 234
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    check-cast p0, La/ywb0;

    .line 239
    .line 240
    if-eqz p0, :cond_f

    .line 241
    .line 242
    iget-object p0, p0, La/ywb0;->a:La/csr;

    .line 243
    .line 244
    iget-object p0, p0, La/csr;->a:La/bsr;

    .line 245
    .line 246
    iget-object p0, p0, La/bsr;->a:La/esr;

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_f
    sget-object p0, La/esr;->c:La/esr;

    .line 250
    .line 251
    :goto_b
    iget-object p1, v2, La/bo10;->v:La/p7m0;

    .line 252
    .line 253
    :cond_10
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    move-object v1, v0

    .line 258
    check-cast v1, La/mav0;

    .line 259
    .line 260
    const/16 v2, 0x17

    .line 261
    .line 262
    invoke-static {v1, v5, p0, v2}, La/mav0;->a(La/mav0;La/esr;La/esr;I)La/mav0;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    :goto_c
    return-object v5

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
