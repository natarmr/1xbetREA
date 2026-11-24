.class public final La/mz90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/nz90;


# direct methods
.method public synthetic constructor <init>(La/nz90;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mz90;->i:B

    iput-object p1, p0, La/mz90;->k:La/nz90;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mz90;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mz90;->k:La/nz90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mz90;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mz90;-><init>(La/nz90;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/mz90;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/mz90;-><init>(La/nz90;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/mz90;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mz90;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mz90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mz90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mz90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/mz90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/mz90;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/mz90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/mz90;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mz90;->k:La/nz90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, La/i3t0;->f:La/oyg0;

    .line 9
    .line 10
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 11
    .line 12
    sget-object v3, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v4, p0, La/mz90;->j:Z

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    if-ne v4, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v3, v5

    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget p1, La/nz90;->v:I

    .line 38
    .line 39
    iget-object v4, v2, La/ocj;->a:La/p7m0;

    .line 40
    .line 41
    :cond_2
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-object v7, p1

    .line 49
    check-cast v7, La/x48;

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    const/16 v12, 0x38

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    invoke-static/range {v7 .. v12}, La/x48;->a(La/x48;ZZZII)La/x48;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v4, p1, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    iget-object p1, v1, La/nz90;->p:La/svu;

    .line 68
    .line 69
    iget-object v4, v1, La/nz90;->q:Ljava/lang/String;

    .line 70
    .line 71
    iput-boolean v6, p0, La/mz90;->j:Z

    .line 72
    .line 73
    iget-object p1, p1, La/svu;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, La/kz90;

    .line 76
    .line 77
    iget-object v6, p1, La/kz90;->d:La/mne;

    .line 78
    .line 79
    iget-object v6, v6, La/mne;->b:La/dvj;

    .line 80
    .line 81
    new-instance v7, La/oed;

    .line 82
    .line 83
    const/16 v8, 0xa

    .line 84
    .line 85
    invoke-direct {v7, p1, v4, v5, v8}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v6, v7, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v3, :cond_3

    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :cond_3
    :goto_0
    check-cast p1, La/gz90;

    .line 97
    .line 98
    iget-object v8, p1, La/gz90;->a:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    sget p0, La/nz90;->v:I

    .line 107
    .line 108
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 109
    .line 110
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-object v1, p1

    .line 118
    check-cast v1, La/x48;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    const/16 v6, 0x38

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    const/4 v3, 0x0

    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-static/range {v1 .. v6}, La/x48;->a(La/x48;ZZZII)La/x48;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    iget-object v7, p1, La/gz90;->b:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-nez p0, :cond_7

    .line 147
    .line 148
    sget p0, La/nz90;->v:I

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    const p1, 0x3fffffff    # 1.9999999f

    .line 155
    .line 156
    .line 157
    rem-int p0, p1, p0

    .line 158
    .line 159
    sub-int/2addr p1, p0

    .line 160
    iget-object p0, v1, La/nz90;->o:La/vzg0;

    .line 161
    .line 162
    const-string v0, "KEY_CURRENT_PHOTO"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Ljava/lang/Integer;

    .line 169
    .line 170
    if-eqz p0, :cond_6

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    :cond_6
    :goto_1
    move v9, p1

    .line 177
    goto :goto_2

    .line 178
    :cond_7
    const/4 p1, 0x0

    .line 179
    goto :goto_1

    .line 180
    :goto_2
    sget p0, La/nz90;->v:I

    .line 181
    .line 182
    iget-object p1, v2, La/ocj;->a:La/p7m0;

    .line 183
    .line 184
    :cond_8
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-object v0, p0

    .line 192
    check-cast v0, La/x48;

    .line 193
    .line 194
    new-instance v3, La/x48;

    .line 195
    .line 196
    const/4 v4, 0x0

    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v6, 0x0

    .line 199
    invoke-direct/range {v3 .. v9}, La/x48;-><init>(ZZZLjava/util/List;Ljava/util/List;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-eqz p0, :cond_8

    .line 207
    .line 208
    invoke-virtual {v1}, La/nz90;->N()V

    .line 209
    .line 210
    .line 211
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_4
    return-object v3

    .line 214
    :pswitch_0
    iget-boolean p0, p0, La/mz90;->j:Z

    .line 215
    .line 216
    sget-object v0, La/wne;->a:La/wne;

    .line 217
    .line 218
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, La/x48;

    .line 226
    .line 227
    iget-boolean p1, p1, La/x48;->a:Z

    .line 228
    .line 229
    if-nez p1, :cond_9

    .line 230
    .line 231
    if-eqz p0, :cond_a

    .line 232
    .line 233
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    check-cast p0, La/x48;

    .line 238
    .line 239
    iget-boolean p0, p0, La/x48;->b:Z

    .line 240
    .line 241
    if-nez p0, :cond_9

    .line 242
    .line 243
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    check-cast p0, La/x48;

    .line 248
    .line 249
    iget-boolean p0, p0, La/x48;->c:Z

    .line 250
    .line 251
    if-eqz p0, :cond_a

    .line 252
    .line 253
    :cond_9
    invoke-virtual {v1}, La/nz90;->M()V

    .line 254
    .line 255
    .line 256
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
