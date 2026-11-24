.class public final La/io0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/qo0;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(La/qo0;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/io0;->i:B

    iput-object p1, p0, La/io0;->l:La/qo0;

    iput-boolean p2, p0, La/io0;->m:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/io0;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/io0;->m:Z

    .line 4
    .line 5
    iget-object p0, p0, La/io0;->l:La/qo0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/io0;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/io0;-><init>(La/qo0;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/io0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/io0;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/io0;-><init>(La/qo0;ZLa/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/io0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/io0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v1, p2, v2}, La/io0;-><init>(La/qo0;ZLa/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/io0;->k:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/io0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/io0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/io0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/io0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/io0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/io0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/io0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/cm80;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/io0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/io0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/io0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/io0;->i:B

    .line 2
    .line 3
    sget-object v1, La/sn0;->a:La/sn0;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/io0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v6, v0

    .line 15
    check-cast v6, Ljava/util/List;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v5, p0, La/io0;->j:Z

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    if-ne v5, v3, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v8, La/yk0;->c:La/yk0;

    .line 37
    .line 38
    sget p1, La/qo0;->V:I

    .line 39
    .line 40
    iget-object v5, p0, La/io0;->l:La/qo0;

    .line 41
    .line 42
    invoke-virtual {v5, v8}, La/qo0;->S(La/yk0;)La/un0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of p1, p1, La/rn0;

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    xor-int/2addr v2, v3

    .line 53
    if-eq p1, v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v5, v8, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object v4, p0, La/io0;->k:Ljava/lang/Object;

    .line 59
    .line 60
    iput-boolean v3, p0, La/io0;->j:Z

    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    iget-boolean v9, p0, La/io0;->m:Z

    .line 64
    .line 65
    move-object v10, p0

    .line 66
    invoke-virtual/range {v5 .. v10}, La/qo0;->W(Ljava/util/List;ZLa/yk0;ZLa/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v0, :cond_3

    .line 71
    .line 72
    move-object v4, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_1
    return-object v4

    .line 77
    :pswitch_0
    move-object v10, p0

    .line 78
    iget-object p0, v10, La/io0;->k:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v6, p0

    .line 81
    check-cast v6, Ljava/util/List;

    .line 82
    .line 83
    sget-object p0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v0, v10, La/io0;->j:Z

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    if-ne v0, v3, :cond_4

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, La/bo0;

    .line 103
    .line 104
    invoke-direct {p1, v6, v3}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 105
    .line 106
    .line 107
    sget v0, La/qo0;->V:I

    .line 108
    .line 109
    iget-object v5, v10, La/io0;->l:La/qo0;

    .line 110
    .line 111
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    sget-object v8, La/yk0;->b:La/yk0;

    .line 115
    .line 116
    invoke-virtual {v5, v8}, La/qo0;->S(La/yk0;)La/un0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of p1, p1, La/rn0;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    xor-int/2addr v0, v3

    .line 127
    if-eq p1, v0, :cond_6

    .line 128
    .line 129
    invoke-virtual {v5, v8, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    iput-object v4, v10, La/io0;->k:Ljava/lang/Object;

    .line 133
    .line 134
    iput-boolean v3, v10, La/io0;->j:Z

    .line 135
    .line 136
    const/4 v7, 0x1

    .line 137
    iget-boolean v9, v10, La/io0;->m:Z

    .line 138
    .line 139
    invoke-virtual/range {v5 .. v10}, La/qo0;->W(Ljava/util/List;ZLa/yk0;ZLa/zje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, p0, :cond_7

    .line 144
    .line 145
    move-object v4, p0

    .line 146
    goto :goto_3

    .line 147
    :cond_7
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_3
    return-object v4

    .line 150
    :pswitch_1
    move-object v10, p0

    .line 151
    iget-object p0, v10, La/io0;->k:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, La/cm80;

    .line 154
    .line 155
    sget-object v0, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget-boolean v5, v10, La/io0;->j:Z

    .line 158
    .line 159
    if-eqz v5, :cond_9

    .line 160
    .line 161
    if-ne v5, v3, :cond_8

    .line 162
    .line 163
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iput-object v4, v10, La/io0;->k:Ljava/lang/Object;

    .line 175
    .line 176
    iput-boolean v3, v10, La/io0;->j:Z

    .line 177
    .line 178
    sget p1, La/qo0;->V:I

    .line 179
    .line 180
    if-eqz p0, :cond_10

    .line 181
    .line 182
    instance-of p1, p0, La/tl80;

    .line 183
    .line 184
    iget-object v5, v10, La/io0;->l:La/qo0;

    .line 185
    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    sget-object p0, La/yk0;->c:La/yk0;

    .line 189
    .line 190
    sget-object p1, La/qn0;->a:La/qn0;

    .line 191
    .line 192
    invoke-virtual {v5, p0, p1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_a
    instance-of p1, p0, La/zl80;

    .line 197
    .line 198
    iget-boolean v9, v10, La/io0;->m:Z

    .line 199
    .line 200
    if-eqz p1, :cond_d

    .line 201
    .line 202
    check-cast p0, La/zl80;

    .line 203
    .line 204
    iget-boolean p1, p0, La/zl80;->b:Z

    .line 205
    .line 206
    if-eqz p1, :cond_b

    .line 207
    .line 208
    sget-object p0, La/yk0;->c:La/yk0;

    .line 209
    .line 210
    invoke-virtual {v5, p0, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 211
    .line 212
    .line 213
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_b
    iget-object v6, p0, La/zl80;->a:Ljava/util/List;

    .line 217
    .line 218
    const/4 v7, 0x1

    .line 219
    sget-object v8, La/yk0;->c:La/yk0;

    .line 220
    .line 221
    invoke-virtual/range {v5 .. v10}, La/qo0;->W(Ljava/util/List;ZLa/yk0;ZLa/zje;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    if-ne p0, v0, :cond_c

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_d
    instance-of p1, p0, La/wl80;

    .line 232
    .line 233
    if-eqz p1, :cond_10

    .line 234
    .line 235
    check-cast p0, La/wl80;

    .line 236
    .line 237
    iget-object v6, p0, La/wl80;->a:Ljava/util/List;

    .line 238
    .line 239
    const/4 v7, 0x1

    .line 240
    sget-object v8, La/yk0;->c:La/yk0;

    .line 241
    .line 242
    invoke-virtual/range {v5 .. v10}, La/qo0;->W(Ljava/util/List;ZLa/yk0;ZLa/zje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    if-ne p0, v0, :cond_e

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    :goto_5
    if-ne p0, v0, :cond_f

    .line 252
    .line 253
    move-object v4, v0

    .line 254
    goto :goto_7

    .line 255
    :cond_f
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    :goto_7
    return-object v4

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
