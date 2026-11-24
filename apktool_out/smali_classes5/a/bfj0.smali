.class public final La/bfj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lorg/xplatform/settings/impl/presentation/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bfj0;->i:B

    iput-object p1, p0, La/bfj0;->l:Lorg/xplatform/settings/impl/presentation/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bfj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bfj0;->l:Lorg/xplatform/settings/impl/presentation/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bfj0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bfj0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bfj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bfj0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bfj0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/e7a;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bfj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bfj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bfj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/tm4;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bfj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bfj0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bfj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bfj0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/bfj0;->l:Lorg/xplatform/settings/impl/presentation/a;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/e7a;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v7, v0, La/bfj0;->j:Z

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v4, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    instance-of v3, v1, La/d7a;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    sget-object v3, La/tvk;->a:La/rwj;

    .line 42
    .line 43
    sget-object v3, La/ys10;->a:La/vs10;

    .line 44
    .line 45
    new-instance v7, La/bai0;

    .line 46
    .line 47
    const/16 v8, 0x10

    .line 48
    .line 49
    invoke-direct {v7, v2, v1, v5, v8}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    iput-object v5, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 53
    .line 54
    iput-boolean v4, v0, La/bfj0;->j:Z

    .line 55
    .line 56
    invoke-static {v3, v7, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v6, :cond_2

    .line 61
    .line 62
    move-object v5, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v5

    .line 67
    :pswitch_0
    iget-object v1, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/tm4;

    .line 70
    .line 71
    sget-object v6, La/wne;->a:La/wne;

    .line 72
    .line 73
    iget-boolean v7, v0, La/bfj0;->j:Z

    .line 74
    .line 75
    if-eqz v7, :cond_4

    .line 76
    .line 77
    if-ne v7, v4, :cond_3

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, v2, Lorg/xplatform/settings/impl/presentation/a;->m0:La/im4;

    .line 91
    .line 92
    iput-object v1, v0, La/bfj0;->k:Ljava/lang/Object;

    .line 93
    .line 94
    iput-boolean v4, v0, La/bfj0;->j:Z

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v4, La/jl4;->a:La/jl4;

    .line 100
    .line 101
    invoke-virtual {v3, v4, v0}, La/im4;->j(La/xl4;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v6, :cond_5

    .line 106
    .line 107
    move-object v5, v6

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    :goto_2
    if-eqz v1, :cond_8

    .line 110
    .line 111
    instance-of v0, v1, La/sm4;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    sget-object v0, La/n1j0;->a:La/n1j0;

    .line 116
    .line 117
    invoke-virtual {v2, v0, v5}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    instance-of v0, v1, La/rm4;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast v1, La/rm4;

    .line 126
    .line 127
    iget-object v0, v1, La/rm4;->a:Ljava/lang/Throwable;

    .line 128
    .line 129
    iget-object v1, v1, La/rm4;->b:La/uu4;

    .line 130
    .line 131
    invoke-virtual {v2, v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->B(Ljava/lang/Throwable;La/uu4;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    iget-object v0, v2, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 135
    .line 136
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    move-object v2, v1

    .line 141
    check-cast v2, La/caj0;

    .line 142
    .line 143
    const/16 v24, 0x0

    .line 144
    .line 145
    const v25, 0x1fffffe

    .line 146
    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x0

    .line 155
    const/4 v10, 0x0

    .line 156
    const/4 v11, 0x0

    .line 157
    const/4 v12, 0x0

    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const/16 v18, 0x0

    .line 166
    .line 167
    const/16 v19, 0x0

    .line 168
    .line 169
    const/16 v20, 0x0

    .line 170
    .line 171
    const/16 v21, 0x0

    .line 172
    .line 173
    const/16 v22, 0x0

    .line 174
    .line 175
    const/16 v23, 0x0

    .line 176
    .line 177
    invoke-static/range {v2 .. v25}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_7

    .line 186
    .line 187
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 191
    .line 192
    .line 193
    :goto_4
    return-object v5

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
