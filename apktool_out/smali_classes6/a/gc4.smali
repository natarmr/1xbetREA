.class public final La/gc4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/fir0;ILa/md80;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput-byte v0, p0, La/gc4;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/gc4;->k:I

    .line 7
    .line 8
    iput-object p3, p0, La/gc4;->m:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(La/i3t0;ILa/yje;B)V
    .locals 0

    .line 15
    iput-byte p4, p0, La/gc4;->i:B

    iput-object p1, p0, La/gc4;->m:Ljava/lang/Object;

    iput p2, p0, La/gc4;->k:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/gc4;->i:B

    iput-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    iput-object p2, p0, La/gc4;->m:Ljava/lang/Object;

    iput p3, p0, La/gc4;->k:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/gc4;->i:B

    .line 2
    .line 3
    iget v1, p0, La/gc4;->k:I

    .line 4
    .line 5
    iget-object v2, p0, La/gc4;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/gc4;

    .line 11
    .line 12
    iget-object v0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, La/nru0;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 19
    .line 20
    iget v6, p0, La/gc4;->k:I

    .line 21
    .line 22
    const/4 v8, 0x6

    .line 23
    move-object v7, p1

    .line 24
    invoke-direct/range {v3 .. v8}, La/gc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :pswitch_0
    move-object v8, p1

    .line 29
    new-instance p1, La/gc4;

    .line 30
    .line 31
    iget-object p0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/fir0;

    .line 34
    .line 35
    check-cast v2, La/md80;

    .line 36
    .line 37
    invoke-direct {p1, p0, v1, v2, v8}, La/gc4;-><init>(La/fir0;ILa/md80;La/yje;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_1
    move-object v8, p1

    .line 42
    new-instance v4, La/gc4;

    .line 43
    .line 44
    iget-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    check-cast v5, La/w220;

    .line 48
    .line 49
    move-object v6, v2

    .line 50
    check-cast v6, La/cb50;

    .line 51
    .line 52
    iget v7, p0, La/gc4;->k:I

    .line 53
    .line 54
    const/4 v9, 0x4

    .line 55
    invoke-direct/range {v4 .. v9}, La/gc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_2
    move-object v8, p1

    .line 60
    new-instance v4, La/gc4;

    .line 61
    .line 62
    iget-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v5, p1

    .line 65
    check-cast v5, La/img;

    .line 66
    .line 67
    move-object v6, v2

    .line 68
    check-cast v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 69
    .line 70
    iget v7, p0, La/gc4;->k:I

    .line 71
    .line 72
    const/4 v9, 0x3

    .line 73
    invoke-direct/range {v4 .. v9}, La/gc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 74
    .line 75
    .line 76
    return-object v4

    .line 77
    :pswitch_3
    move-object v8, p1

    .line 78
    new-instance p0, La/gc4;

    .line 79
    .line 80
    check-cast v2, La/hk4;

    .line 81
    .line 82
    const/4 p1, 0x2

    .line 83
    invoke-direct {p0, v2, v1, v8, p1}, La/gc4;-><init>(La/i3t0;ILa/yje;B)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_4
    move-object v8, p1

    .line 88
    new-instance p0, La/gc4;

    .line 89
    .line 90
    check-cast v2, La/fh4;

    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    invoke-direct {p0, v2, v1, v8, p1}, La/gc4;-><init>(La/i3t0;ILa/yje;B)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_5
    move-object v8, p1

    .line 98
    new-instance p0, La/gc4;

    .line 99
    .line 100
    check-cast v2, La/kc4;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    invoke-direct {p0, v2, v1, v8, p1}, La/gc4;-><init>(La/i3t0;ILa/yje;B)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gc4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/gc4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/gc4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/gc4;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/gc4;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/gc4;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/gc4;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/gc4;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/gc4;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/gc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/gc4;->i:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget v2, p0, La/gc4;->k:I

    .line 5
    .line 6
    iget-object v3, p0, La/gc4;->m:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/nru0;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-boolean v7, p0, La/gc4;->j:Z

    .line 22
    .line 23
    if-eqz v7, :cond_1

    .line 24
    .line 25
    if-ne v7, v6, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v0, La/nru0;->c:La/knf0;

    .line 39
    .line 40
    invoke-virtual {p1}, La/knf0;->d()La/lnf0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 45
    .line 46
    iget-byte v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 47
    .line 48
    invoke-static {p1, v2, v3, v6}, La/egm0;->g(La/lnf0;IIZ)La/jo20;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, v0, La/nru0;->a:La/nmt0;

    .line 53
    .line 54
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 55
    .line 56
    invoke-virtual {v0, p1, p0}, La/nmt0;->b(La/jo20;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_2

    .line 61
    .line 62
    move-object v5, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 65
    .line 66
    new-instance v5, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 p0, 0xa

    .line 69
    .line 70
    invoke-static {p1, p0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, La/rru0;

    .line 92
    .line 93
    invoke-static {p1}, La/wgm0;->v(La/rru0;)La/oru0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    :goto_2
    return-object v5

    .line 102
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget-boolean v1, p0, La/gc4;->j:Z

    .line 105
    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    if-ne v1, v6, :cond_4

    .line 109
    .line 110
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, La/fir0;

    .line 124
    .line 125
    iget-object p1, p1, La/fir0;->z:La/w4p0;

    .line 126
    .line 127
    check-cast v3, La/md80;

    .line 128
    .line 129
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 130
    .line 131
    invoke-virtual {p1, v2, v3, p0}, La/w4p0;->c(ILa/md80;La/bnn0;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v0, :cond_6

    .line 136
    .line 137
    move-object v5, v0

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_4
    return-object v5

    .line 142
    :pswitch_1
    check-cast v3, La/cb50;

    .line 143
    .line 144
    iget-object v0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/w220;

    .line 147
    .line 148
    iget-object v7, v0, La/w220;->s:La/ouu;

    .line 149
    .line 150
    sget-object v8, La/wne;->a:La/wne;

    .line 151
    .line 152
    iget-boolean v9, p0, La/gc4;->j:Z

    .line 153
    .line 154
    if-eqz v9, :cond_8

    .line 155
    .line 156
    if-ne v9, v6, :cond_7

    .line 157
    .line 158
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_7

    .line 162
    .line 163
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_8

    .line 167
    .line 168
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, La/ouu;->t()La/cb50;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iget-object v4, v3, La/cb50;->a:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v9, p1, La/cb50;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-nez v4, :cond_9

    .line 184
    .line 185
    iget-object p0, v0, La/w220;->q:La/ag3;

    .line 186
    .line 187
    invoke-virtual {v3}, La/cb50;->a()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 195
    .line 196
    const-string v1, "footer_sport_menu_call"

    .line 197
    .line 198
    const-string v2, "option"

    .line 199
    .line 200
    invoke-static {v2, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object p0, v0, La/w220;->k0:La/ix0;

    .line 204
    .line 205
    invoke-virtual {v3}, La/cb50;->a()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object p0, p0, La/ix0;->a:La/s1p;

    .line 213
    .line 214
    const-wide/16 v0, 0xbbe

    .line 215
    .line 216
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 217
    .line 218
    .line 219
    iget-object p0, v7, La/ouu;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, La/qe50;

    .line 222
    .line 223
    const/4 p1, 0x0

    .line 224
    invoke-virtual {p0, v3, p1}, La/qe50;->a(La/cb50;Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_9
    if-lez v2, :cond_b

    .line 229
    .line 230
    instance-of p0, p1, La/za50;

    .line 231
    .line 232
    if-eqz p0, :cond_a

    .line 233
    .line 234
    iget-object p0, v0, La/w220;->Z0:La/obe;

    .line 235
    .line 236
    iget-object p0, p0, La/obe;->a:La/zas0;

    .line 237
    .line 238
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, La/fme;

    .line 241
    .line 242
    iget-object p0, p0, La/fme;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 243
    .line 244
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 245
    .line 246
    .line 247
    :cond_a
    invoke-static {v7, p1, v5, v1}, La/ouu;->o(La/ouu;La/cb50;Lkotlin/jvm/functions/Function1;I)V

    .line 248
    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_b
    invoke-virtual {v7}, La/ouu;->t()La/cb50;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 256
    .line 257
    iget-object v0, v7, La/ouu;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, La/qe50;

    .line 260
    .line 261
    iget-object v0, v0, La/qe50;->b:La/qoj0;

    .line 262
    .line 263
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    if-ne p0, v8, :cond_c

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    :goto_5
    if-ne p0, v8, :cond_d

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    :goto_6
    if-ne p0, v8, :cond_e

    .line 278
    .line 279
    move-object v5, v8

    .line 280
    goto :goto_8

    .line 281
    :cond_e
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    :goto_8
    return-object v5

    .line 284
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 285
    .line 286
    iget-boolean v1, p0, La/gc4;->j:Z

    .line 287
    .line 288
    if-eqz v1, :cond_10

    .line 289
    .line 290
    if-ne v1, v6, :cond_f

    .line 291
    .line 292
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    move-object p1, v5

    .line 300
    goto :goto_9

    .line 301
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p1, La/img;

    .line 307
    .line 308
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 309
    .line 310
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 311
    .line 312
    invoke-virtual {p1, v3, v2, v6, p0}, La/img;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;IZLa/zje;)Ljava/io/Serializable;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    if-ne p1, v0, :cond_11

    .line 317
    .line 318
    move-object p1, v0

    .line 319
    :cond_11
    :goto_9
    return-object p1

    .line 320
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 321
    .line 322
    iget-boolean v7, p0, La/gc4;->j:Z

    .line 323
    .line 324
    if-eqz v7, :cond_13

    .line 325
    .line 326
    if-ne v7, v6, :cond_12

    .line 327
    .line 328
    iget-object p0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast p0, La/hk4;

    .line 331
    .line 332
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_12
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    move-object p1, v3

    .line 344
    check-cast p1, La/hk4;

    .line 345
    .line 346
    iget-object v3, p1, La/hk4;->u:La/rpt;

    .line 347
    .line 348
    iput-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 349
    .line 350
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 351
    .line 352
    invoke-virtual {v3, v2, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    if-ne p0, v0, :cond_14

    .line 357
    .line 358
    move-object v5, v0

    .line 359
    goto :goto_b

    .line 360
    :cond_14
    move-object v10, p1

    .line 361
    move-object p1, p0

    .line 362
    move-object p0, v10

    .line 363
    :goto_a
    check-cast p1, La/qkt;

    .line 364
    .line 365
    sget v0, La/hk4;->b0:I

    .line 366
    .line 367
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    new-instance v0, La/wb4;

    .line 371
    .line 372
    invoke-direct {v0, p1, v1}, La/wb4;-><init>(La/qkt;B)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 376
    .line 377
    .line 378
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    :goto_b
    return-object v5

    .line 381
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 382
    .line 383
    iget-boolean v1, p0, La/gc4;->j:Z

    .line 384
    .line 385
    if-eqz v1, :cond_16

    .line 386
    .line 387
    if-ne v1, v6, :cond_15

    .line 388
    .line 389
    iget-object p0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, La/fh4;

    .line 392
    .line 393
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_15
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    goto :goto_d

    .line 401
    :cond_16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    move-object p1, v3

    .line 405
    check-cast p1, La/fh4;

    .line 406
    .line 407
    iget-object v1, p1, La/fh4;->v:La/rpt;

    .line 408
    .line 409
    iput-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 410
    .line 411
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 412
    .line 413
    invoke-virtual {v1, v2, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    if-ne p0, v0, :cond_17

    .line 418
    .line 419
    move-object v5, v0

    .line 420
    goto :goto_d

    .line 421
    :cond_17
    move-object v10, p1

    .line 422
    move-object p1, p0

    .line 423
    move-object p0, v10

    .line 424
    :goto_c
    check-cast p1, La/qkt;

    .line 425
    .line 426
    sget v0, La/fh4;->c0:I

    .line 427
    .line 428
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    new-instance v0, La/wb4;

    .line 432
    .line 433
    const/4 v1, 0x2

    .line 434
    invoke-direct {v0, p1, v1}, La/wb4;-><init>(La/qkt;B)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 438
    .line 439
    .line 440
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    :goto_d
    return-object v5

    .line 443
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 444
    .line 445
    iget-boolean v1, p0, La/gc4;->j:Z

    .line 446
    .line 447
    if-eqz v1, :cond_19

    .line 448
    .line 449
    if-ne v1, v6, :cond_18

    .line 450
    .line 451
    iget-object p0, p0, La/gc4;->l:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p0, La/kc4;

    .line 454
    .line 455
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_18
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    move-object p1, v3

    .line 467
    check-cast p1, La/kc4;

    .line 468
    .line 469
    iget-object v1, p1, La/kc4;->w:La/rpt;

    .line 470
    .line 471
    iput-object p1, p0, La/gc4;->l:Ljava/lang/Object;

    .line 472
    .line 473
    iput-boolean v6, p0, La/gc4;->j:Z

    .line 474
    .line 475
    invoke-virtual {v1, v2, p0}, La/rpt;->h(ILa/yje;)Ljava/io/Serializable;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    if-ne p0, v0, :cond_1a

    .line 480
    .line 481
    move-object v5, v0

    .line 482
    goto :goto_f

    .line 483
    :cond_1a
    move-object v10, p1

    .line 484
    move-object p1, p0

    .line 485
    move-object p0, v10

    .line 486
    :goto_e
    check-cast p1, La/qkt;

    .line 487
    .line 488
    sget v0, La/kc4;->Y:I

    .line 489
    .line 490
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    new-instance v0, La/wb4;

    .line 494
    .line 495
    invoke-direct {v0, p1, v6}, La/wb4;-><init>(La/qkt;B)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 499
    .line 500
    .line 501
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    :goto_f
    return-object v5

    .line 504
    nop

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
