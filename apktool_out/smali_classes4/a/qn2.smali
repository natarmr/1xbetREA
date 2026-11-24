.class public final La/qn2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/yn2;


# direct methods
.method public synthetic constructor <init>(La/yn2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qn2;->i:B

    iput-object p1, p0, La/qn2;->k:La/yn2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qn2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qn2;->k:La/yn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qn2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qn2;-><init>(La/yn2;La/yje;B)V

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
    iput-boolean p0, v0, La/qn2;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/qn2;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/qn2;-><init>(La/yn2;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

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
    iget-byte v0, p0, La/qn2;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qn2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/qn2;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/qn2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qn2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qn2;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/qn2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qn2;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/qn2;->k:La/yn2;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-boolean v0, v0, La/qn2;->j:Z

    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget v1, La/yn2;->g0:I

    .line 19
    .line 20
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object v5, v4

    .line 32
    move-object v4, v5

    .line 33
    check-cast v4, La/xm2;

    .line 34
    .line 35
    const/4 v15, 0x0

    .line 36
    const v17, 0x1ffff

    .line 37
    .line 38
    .line 39
    move-object v6, v5

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v7, v6

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v8, v7

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v9, v8

    .line 46
    const/4 v8, 0x0

    .line 47
    move-object v10, v9

    .line 48
    const/4 v9, 0x0

    .line 49
    move-object v11, v10

    .line 50
    const/4 v10, 0x0

    .line 51
    move-object v12, v11

    .line 52
    const/4 v11, 0x0

    .line 53
    move-object v13, v12

    .line 54
    const/4 v12, 0x0

    .line 55
    move-object v14, v13

    .line 56
    const/4 v13, 0x0

    .line 57
    move-object/from16 v16, v14

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    move-object/from16 v18, v16

    .line 61
    .line 62
    move/from16 v16, v0

    .line 63
    .line 64
    move-object/from16 v0, v18

    .line 65
    .line 66
    invoke-static/range {v4 .. v17}, La/xm2;->a(La/xm2;ZZZLjava/util/List;Ljava/util/List;La/ym2;ZZZZZZI)La/xm2;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    if-eqz v16, :cond_0

    .line 77
    .line 78
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, La/xm2;

    .line 83
    .line 84
    iget-object v0, v0, La/xm2;->d:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-virtual {v2}, La/yn2;->M()V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_0
    if-eqz v16, :cond_2

    .line 97
    .line 98
    iget-object v0, v2, La/yn2;->a0:La/bby;

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-ne v0, v3, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {v2}, La/yn2;->M()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    :goto_1
    if-nez v16, :cond_3

    .line 114
    .line 115
    invoke-virtual {v2, v3}, La/yn2;->O(Z)V

    .line 116
    .line 117
    .line 118
    :cond_3
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_4
    move/from16 v0, v16

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 125
    .line 126
    iget-boolean v4, v0, La/qn2;->j:Z

    .line 127
    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    if-ne v4, v3, :cond_5

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 137
    .line 138
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object v4, v2, La/yn2;->B:La/oif0;

    .line 147
    .line 148
    iput-boolean v3, v0, La/qn2;->j:Z

    .line 149
    .line 150
    invoke-virtual {v4, v0}, La/oif0;->z(La/zje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-ne v0, v1, :cond_7

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    :goto_3
    iget-object v0, v2, La/yn2;->a0:La/bby;

    .line 158
    .line 159
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, La/yn2;->M()V

    .line 163
    .line 164
    .line 165
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_4
    return-object v1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
