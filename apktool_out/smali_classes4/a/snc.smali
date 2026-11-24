.class public final La/snc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/boc;


# direct methods
.method public synthetic constructor <init>(La/boc;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/snc;->i:B

    iput-object p1, p0, La/snc;->j:La/boc;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/snc;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/snc;->j:La/boc;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/snc;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/snc;-><init>(La/boc;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/snc;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/snc;-><init>(La/boc;La/yje;B)V

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
    iget-byte v0, p0, La/snc;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ya50;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/snc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/snc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/snc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/snc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/snc;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/snc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/snc;->i:B

    .line 4
    .line 5
    iget-object v0, v0, La/snc;->j:La/boc;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/onc;

    .line 20
    .line 21
    iget-boolean v1, v1, La/onc;->i:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, La/lnc;

    .line 26
    .line 27
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, La/onc;

    .line 32
    .line 33
    iget-object v2, v2, La/onc;->b:Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 34
    .line 35
    invoke-direct {v1, v2}, La/lnc;-><init>(Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    sget-object v2, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;->f:La/c0o;

    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v4, v1

    .line 50
    check-cast v4, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 51
    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v1, v0, La/boc;->o:La/vzg0;

    .line 56
    .line 57
    const-string v2, "CURRENT_TAB_KEY"

    .line 58
    .line 59
    invoke-virtual {v1, v2, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v4}, La/boc;->M(Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 77
    .line 78
    move-object v3, v2

    .line 79
    move-object v2, v13

    .line 80
    check-cast v2, La/onc;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    const/16 v12, 0x1fd

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    invoke-static/range {v2 .. v12}, La/onc;->a(La/onc;La/ymc;Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;La/kmc;ILa/zpv;ZZLjava/lang/String;ZI)La/onc;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v1, v13, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 109
    .line 110
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v0, La/boc;->q:La/pru;

    .line 114
    .line 115
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, v0, La/boc;->r:La/lbu;

    .line 120
    .line 121
    invoke-virtual {v2}, La/lbu;->j()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    iget-object v2, v1, La/sff0;->L:La/rib0;

    .line 126
    .line 127
    iget-boolean v5, v2, La/rib0;->a:Z

    .line 128
    .line 129
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 130
    .line 131
    iget-object v2, v1, La/mum0;->i:La/he;

    .line 132
    .line 133
    iget-object v6, v2, La/he;->a:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v8, v1, La/mum0;->B:La/vcp;

    .line 136
    .line 137
    iget-object v1, v1, La/mum0;->n:La/aeo0;

    .line 138
    .line 139
    iget-object v7, v1, La/aeo0;->a:Ljava/lang/String;

    .line 140
    .line 141
    new-instance v3, La/ymc;

    .line 142
    .line 143
    invoke-direct/range {v3 .. v8}, La/ymc;-><init>(ZZLjava/lang/String;Ljava/lang/String;La/vcp;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 147
    .line 148
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 149
    .line 150
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-object v9, v1

    .line 158
    check-cast v9, La/onc;

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x1fe

    .line 163
    .line 164
    const/4 v11, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    const/4 v13, 0x0

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    move-object v10, v3

    .line 174
    invoke-static/range {v9 .. v19}, La/onc;->a(La/onc;La/ymc;Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;La/kmc;ILa/zpv;ZZLjava/lang/String;ZI)La/onc;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_3

    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
