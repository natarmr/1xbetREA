.class public final La/zs6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dt6;


# direct methods
.method public synthetic constructor <init>(La/dt6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zs6;->i:B

    iput-object p1, p0, La/zs6;->k:La/dt6;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zs6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zs6;->k:La/dt6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zs6;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/zs6;-><init>(La/dt6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/zs6;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/zs6;-><init>(La/dt6;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zs6;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/zs6;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/zs6;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/zs6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/zs6;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/zs6;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/zs6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zs6;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/zs6;->k:La/dt6;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/zs6;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v4, La/dt6;->w:La/yfu;

    .line 36
    .line 37
    invoke-virtual {v2}, La/yfu;->d()La/vae0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-boolean v3, v0, La/zs6;->j:Z

    .line 42
    .line 43
    invoke-static {v2, v0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    move-object v5, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    check-cast v0, La/jg7;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    sget v1, La/dt6;->e0:I

    .line 56
    .line 57
    invoke-virtual {v4, v0}, La/dt6;->a0(La/jg7;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    :goto_1
    return-object v5

    .line 63
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 64
    .line 65
    iget-boolean v6, v0, La/zs6;->j:Z

    .line 66
    .line 67
    if-eqz v6, :cond_5

    .line 68
    .line 69
    if-ne v6, v3, :cond_4

    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object/from16 v0, p1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v4, La/dt6;->r:La/u4a;

    .line 85
    .line 86
    iput-boolean v3, v0, La/zs6;->j:Z

    .line 87
    .line 88
    invoke-virtual {v2, v0}, La/u4a;->a(La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    move-object v5, v1

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    sget v0, La/dt6;->e0:I

    .line 103
    .line 104
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 105
    .line 106
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 107
    .line 108
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object v2, v1

    .line 116
    check-cast v2, La/c820;

    .line 117
    .line 118
    iget-object v6, v2, La/c820;->e:La/jfc0;

    .line 119
    .line 120
    if-eqz v6, :cond_8

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const/16 v11, 0x17

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    invoke-static/range {v6 .. v11}, La/jfc0;->a(La/jfc0;La/azc0;La/rlc0;ZZI)La/jfc0;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    move-object v15, v3

    .line 132
    goto :goto_3

    .line 133
    :cond_8
    move-object v15, v5

    .line 134
    :goto_3
    const/16 v21, 0x0

    .line 135
    .line 136
    const/16 v22, 0x1fef

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v12, 0x0

    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    move-object v10, v2

    .line 153
    invoke-static/range {v10 .. v22}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_4
    return-object v5

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
