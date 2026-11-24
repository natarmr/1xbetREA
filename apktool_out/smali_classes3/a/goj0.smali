.class public final La/goj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hoj0;


# direct methods
.method public synthetic constructor <init>(La/hoj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/goj0;->i:B

    iput-object p1, p0, La/goj0;->k:La/hoj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/goj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/goj0;->k:La/hoj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/goj0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/goj0;-><init>(La/hoj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/goj0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/goj0;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/goj0;-><init>(La/hoj0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/goj0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/goj0;-><init>(La/hoj0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/goj0;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/goj0;-><init>(La/hoj0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

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
    iget-byte v0, p0, La/goj0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/goj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/goj0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/goj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/goj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/goj0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/goj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/goj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/goj0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/goj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/goj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/goj0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/goj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/goj0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/goj0;->k:La/hoj0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/goj0;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, v3, La/hoj0;->m:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, La/hoj0;->w()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-boolean p0, v3, La/hoj0;->m:Z

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget-boolean v5, p0, La/goj0;->j:Z

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    if-ne v5, v2, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, v3, La/hoj0;->c:La/e1u;

    .line 53
    .line 54
    iget-object v1, v3, La/hoj0;->i:Ljava/io/File;

    .line 55
    .line 56
    iget-object v5, v3, La/hoj0;->h:Ljava/lang/String;

    .line 57
    .line 58
    iput-boolean v2, p0, La/goj0;->j:Z

    .line 59
    .line 60
    invoke-virtual {p1, v1, v5, p0}, La/e1u;->b(Ljava/io/File;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_3

    .line 65
    .line 66
    move-object v4, v0

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_4

    .line 75
    .line 76
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    iget-object p0, v3, La/hoj0;->p:La/p7m0;

    .line 80
    .line 81
    new-instance v0, La/wnj0;

    .line 82
    .line 83
    iget-object v1, v3, La/hoj0;->l:La/aqt;

    .line 84
    .line 85
    invoke-virtual {v1}, La/aqt;->a()V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, p1}, La/wnj0;-><init>(Ljava/io/File;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_1
    return-object v4

    .line 100
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget-boolean v5, p0, La/goj0;->j:Z

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    if-ne v5, v2, :cond_5

    .line 107
    .line 108
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v3, La/hoj0;->c:La/e1u;

    .line 120
    .line 121
    iget-object v1, v3, La/hoj0;->i:Ljava/io/File;

    .line 122
    .line 123
    iget-object v5, v3, La/hoj0;->h:Ljava/lang/String;

    .line 124
    .line 125
    iput-boolean v2, p0, La/goj0;->j:Z

    .line 126
    .line 127
    invoke-virtual {p1, v1, v5, p0}, La/e1u;->b(Ljava/io/File;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v0, :cond_7

    .line 132
    .line 133
    move-object v4, v0

    .line 134
    goto :goto_3

    .line 135
    :cond_7
    :goto_2
    check-cast p1, Ljava/io/File;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_8

    .line 142
    .line 143
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    iget-object p0, v3, La/hoj0;->d:La/bwl;

    .line 147
    .line 148
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, La/pzu;

    .line 151
    .line 152
    iget-object v0, p0, La/pzu;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, La/q7d0;

    .line 155
    .line 156
    const-string v1, "BaseChannelId"

    .line 157
    .line 158
    invoke-static {v0, v1}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object p0, p0, La/pzu;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p0, La/us3;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const-string p0, "prod_id_channel_base"

    .line 170
    .line 171
    invoke-static {v0, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iget-object v0, v3, La/hoj0;->e:La/nek;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, La/nek;->g(Ljava/io/File;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, v3, La/hoj0;->o:La/p7m0;

    .line 185
    .line 186
    new-instance v2, La/sxg0;

    .line 187
    .line 188
    new-instance v5, La/foj0;

    .line 189
    .line 190
    invoke-direct {v5, p1, v0, p0}, La/foj0;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object p0, v3, La/hoj0;->l:La/aqt;

    .line 194
    .line 195
    invoke-virtual {p0}, La/aqt;->a()V

    .line 196
    .line 197
    .line 198
    invoke-direct {v2, v5}, La/sxg0;-><init>(La/foj0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    :goto_3
    return-object v4

    .line 210
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 211
    .line 212
    iget-boolean v5, p0, La/goj0;->j:Z

    .line 213
    .line 214
    if-eqz v5, :cond_a

    .line 215
    .line 216
    if-ne v5, v2, :cond_9

    .line 217
    .line 218
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object p1, v3, La/hoj0;->b:La/ieu;

    .line 230
    .line 231
    iget-object v1, v3, La/hoj0;->h:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v5, v3, La/hoj0;->i:Ljava/io/File;

    .line 234
    .line 235
    iput-boolean v2, p0, La/goj0;->j:Z

    .line 236
    .line 237
    invoke-virtual {p1, v1, v5, p0}, La/ieu;->m(Ljava/lang/String;Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-ne p1, v0, :cond_b

    .line 242
    .line 243
    move-object v4, v0

    .line 244
    goto :goto_5

    .line 245
    :cond_b
    :goto_4
    check-cast p1, Ljava/io/File;

    .line 246
    .line 247
    iget-object p0, v3, La/hoj0;->n:La/p7m0;

    .line 248
    .line 249
    new-instance v0, La/gm00;

    .line 250
    .line 251
    invoke-direct {v0, p1}, La/gm00;-><init>(Ljava/io/File;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    :goto_5
    return-object v4

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
