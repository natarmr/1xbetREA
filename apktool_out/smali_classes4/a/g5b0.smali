.class public final La/g5b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/j5b0;


# direct methods
.method public synthetic constructor <init>(La/j5b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g5b0;->i:B

    iput-object p1, p0, La/g5b0;->k:La/j5b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g5b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g5b0;->k:La/j5b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/g5b0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/g5b0;-><init>(La/j5b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/g5b0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/g5b0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/g5b0;-><init>(La/j5b0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/g5b0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/g5b0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/g5b0;-><init>(La/j5b0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/g5b0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g5b0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/g5b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g5b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g5b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/g5b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/g5b0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/g5b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/d5b0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/g5b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/g5b0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/g5b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/g5b0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/g5b0;->k:La/j5b0;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/g5b0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    sget-object p0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, v3, La/j5b0;->m:La/p7m0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vro;

    .line 28
    .line 29
    iget-object p0, p0, La/vro;->b:La/tro;

    .line 30
    .line 31
    instance-of p1, p0, La/sro;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    check-cast p0, La/sro;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p0, v4

    .line 39
    :goto_0
    if-eqz p0, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, La/sro;->a:Ljava/util/List;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object p0, v4

    .line 45
    :goto_1
    if-nez p0, :cond_2

    .line 46
    .line 47
    sget-object p0, La/iun;->a:La/iun;

    .line 48
    .line 49
    :cond_2
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iget-object p1, v3, La/j5b0;->h:La/iij;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput-object p0, p1, La/iij;->h:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v5, v3, La/j5b0;->m:La/p7m0;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object p1, p0

    .line 67
    check-cast p1, La/vro;

    .line 68
    .line 69
    new-instance v1, La/sro;

    .line 70
    .line 71
    iget-object v6, v3, La/j5b0;->f:La/ctf0;

    .line 72
    .line 73
    iget-object v7, v3, La/j5b0;->r:La/n0o0;

    .line 74
    .line 75
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, La/sff0;

    .line 80
    .line 81
    iget-object v7, v7, La/sff0;->g:La/mum0;

    .line 82
    .line 83
    iget-object v7, v7, La/mum0;->A:La/r6l0;

    .line 84
    .line 85
    invoke-static {v7}, La/gkb;->b0(La/r6l0;)La/npo;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v0, v2, v6, v7}, La/jwb;->B(Ljava/util/List;ZLa/ctf0;La/npo;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-direct {v1, v0, v6}, La/sro;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    const/4 v6, 0x2

    .line 97
    invoke-static {p1, v1, v4, v6}, La/vro;->a(La/vro;La/tro;La/tro;I)La/vro;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v5, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_3

    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_0
    move-object v0, p0

    .line 111
    check-cast v0, Ljava/util/List;

    .line 112
    .line 113
    sget-object p0, La/wne;->a:La/wne;

    .line 114
    .line 115
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object p0, v3, La/j5b0;->m:La/p7m0;

    .line 119
    .line 120
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/vro;

    .line 125
    .line 126
    iget-object p0, p0, La/vro;->a:La/tro;

    .line 127
    .line 128
    instance-of p1, p0, La/sro;

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    check-cast p0, La/sro;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    move-object p0, v4

    .line 136
    :goto_2
    if-eqz p0, :cond_5

    .line 137
    .line 138
    iget-object p0, p0, La/sro;->a:Ljava/util/List;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    move-object p0, v4

    .line 142
    :goto_3
    if-nez p0, :cond_6

    .line 143
    .line 144
    sget-object p0, La/iun;->a:La/iun;

    .line 145
    .line 146
    :cond_6
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    iget-object p1, v3, La/j5b0;->h:La/iij;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iput-object p0, p1, La/iij;->h:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v5, v3, La/j5b0;->m:La/p7m0;

    .line 158
    .line 159
    :cond_7
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    move-object p1, p0

    .line 164
    check-cast p1, La/vro;

    .line 165
    .line 166
    new-instance v6, La/sro;

    .line 167
    .line 168
    iget-object v7, v3, La/j5b0;->f:La/ctf0;

    .line 169
    .line 170
    iget-object v8, v3, La/j5b0;->r:La/n0o0;

    .line 171
    .line 172
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    check-cast v8, La/sff0;

    .line 177
    .line 178
    iget-object v8, v8, La/sff0;->g:La/mum0;

    .line 179
    .line 180
    iget-object v8, v8, La/mum0;->A:La/r6l0;

    .line 181
    .line 182
    invoke-static {v8}, La/gkb;->b0(La/r6l0;)La/npo;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-static {v0, v1, v7, v8}, La/jwb;->B(Ljava/util/List;ZLa/ctf0;La/npo;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-direct {v6, v0, v7}, La/sro;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    invoke-static {p1, v4, v6, v2}, La/vro;->a(La/vro;La/tro;La/tro;I)La/vro;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {v5, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_7

    .line 202
    .line 203
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_1
    check-cast p0, La/d5b0;

    .line 207
    .line 208
    sget-object v0, La/wne;->a:La/wne;

    .line 209
    .line 210
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, v3, La/j5b0;->p:La/bby;

    .line 214
    .line 215
    if-eqz p1, :cond_8

    .line 216
    .line 217
    invoke-interface {p1, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    iget-object p1, v3, La/j5b0;->d:La/rkt0;

    .line 221
    .line 222
    instance-of v0, p0, La/a5b0;

    .line 223
    .line 224
    if-nez v0, :cond_9

    .line 225
    .line 226
    instance-of p0, p0, La/c5b0;

    .line 227
    .line 228
    if-eqz p0, :cond_a

    .line 229
    .line 230
    :cond_9
    move v1, v2

    .line 231
    :cond_a
    invoke-virtual {p1, v1}, La/rkt0;->g(Z)V

    .line 232
    .line 233
    .line 234
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
