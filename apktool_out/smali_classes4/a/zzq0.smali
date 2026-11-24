.class public final La/zzq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cyu;

.field public final synthetic l:La/sip;

.field public final synthetic m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic n:La/jo20;


# direct methods
.method public synthetic constructor <init>(La/cyu;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/zzq0;->i:B

    iput-object p1, p0, La/zzq0;->k:La/cyu;

    iput-object p2, p0, La/zzq0;->l:La/sip;

    iput-object p3, p0, La/zzq0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    iput-object p4, p0, La/zzq0;->n:La/jo20;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zzq0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/zzq0;

    .line 7
    .line 8
    iget-object v5, p0, La/zzq0;->n:La/jo20;

    .line 9
    .line 10
    const/4 v7, 0x2

    .line 11
    iget-object v2, p0, La/zzq0;->k:La/cyu;

    .line 12
    .line 13
    iget-object v3, p0, La/zzq0;->l:La/sip;

    .line 14
    .line 15
    iget-object v4, p0, La/zzq0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 16
    .line 17
    move-object v6, p1

    .line 18
    invoke-direct/range {v1 .. v7}, La/zzq0;-><init>(La/cyu;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    move-object v7, p1

    .line 23
    new-instance v2, La/zzq0;

    .line 24
    .line 25
    iget-object v6, p0, La/zzq0;->n:La/jo20;

    .line 26
    .line 27
    const/4 v8, 0x1

    .line 28
    iget-object v3, p0, La/zzq0;->k:La/cyu;

    .line 29
    .line 30
    iget-object v4, p0, La/zzq0;->l:La/sip;

    .line 31
    .line 32
    iget-object v5, p0, La/zzq0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, La/zzq0;-><init>(La/cyu;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_1
    move-object v7, p1

    .line 39
    new-instance v2, La/zzq0;

    .line 40
    .line 41
    iget-object v6, p0, La/zzq0;->n:La/jo20;

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    iget-object v3, p0, La/zzq0;->k:La/cyu;

    .line 45
    .line 46
    iget-object v4, p0, La/zzq0;->l:La/sip;

    .line 47
    .line 48
    iget-object v5, p0, La/zzq0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 49
    .line 50
    invoke-direct/range {v2 .. v8}, La/zzq0;-><init>(La/cyu;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zzq0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/zzq0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/zzq0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/zzq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/zzq0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/zzq0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/zzq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/zzq0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/zzq0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/zzq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zzq0;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object v2, p0, La/zzq0;->n:La/jo20;

    .line 6
    .line 7
    iget-object v3, p0, La/zzq0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 8
    .line 9
    iget-object v4, p0, La/zzq0;->k:La/cyu;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v8, p0, La/zzq0;->l:La/sip;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v9, p0, La/zzq0;->j:Z

    .line 23
    .line 24
    if-eqz v9, :cond_1

    .line 25
    .line 26
    if-ne v9, v7, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v4, La/cyu;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, La/roi0;

    .line 42
    .line 43
    iput-boolean v7, p0, La/zzq0;->j:Z

    .line 44
    .line 45
    invoke-virtual {p1, v8, v3, v2, p0}, La/roi0;->k(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 54
    .line 55
    new-instance v5, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, La/fzq0;

    .line 79
    .line 80
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-static {p1, v0}, La/n8n0;->m(La/fzq0;Z)La/nyg;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    :goto_2
    return-object v5

    .line 93
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget-boolean v9, p0, La/zzq0;->j:Z

    .line 96
    .line 97
    if-eqz v9, :cond_5

    .line 98
    .line 99
    if-ne v9, v7, :cond_4

    .line 100
    .line 101
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v4, La/cyu;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, La/roi0;

    .line 115
    .line 116
    iput-boolean v7, p0, La/zzq0;->j:Z

    .line 117
    .line 118
    invoke-virtual {p1, v8, v3, v2, p0}, La/roi0;->k(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v0, :cond_6

    .line 123
    .line 124
    move-object v5, v0

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Iterable;

    .line 127
    .line 128
    new-instance v5, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, La/fzq0;

    .line 152
    .line 153
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-static {p1, v0}, La/n8n0;->m(La/fzq0;Z)La/nyg;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_7
    :goto_5
    return-object v5

    .line 166
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget-boolean v9, p0, La/zzq0;->j:Z

    .line 169
    .line 170
    if-eqz v9, :cond_9

    .line 171
    .line 172
    if-ne v9, v7, :cond_8

    .line 173
    .line 174
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, v4, La/cyu;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, La/roi0;

    .line 188
    .line 189
    iput-boolean v7, p0, La/zzq0;->j:Z

    .line 190
    .line 191
    invoke-virtual {p1, v8, v3, v2, p0}, La/roi0;->k(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v0, :cond_a

    .line 196
    .line 197
    move-object v5, v0

    .line 198
    goto :goto_8

    .line 199
    :cond_a
    :goto_6
    check-cast p1, Ljava/lang/Iterable;

    .line 200
    .line 201
    new-instance v5, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_b

    .line 219
    .line 220
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, La/fzq0;

    .line 225
    .line 226
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    invoke-static {p1, v0}, La/n8n0;->m(La/fzq0;Z)La/nyg;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_b
    :goto_8
    return-object v5

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
