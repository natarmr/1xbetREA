.class public final La/z260;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/v360;


# direct methods
.method public synthetic constructor <init>(La/v360;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z260;->i:B

    iput-object p1, p0, La/z260;->k:La/v360;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z260;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z260;->k:La/v360;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/z260;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/z260;-><init>(La/v360;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/z260;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/z260;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/z260;-><init>(La/v360;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/z260;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/z260;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/z260;-><init>(La/v360;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/z260;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/z260;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/z260;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z260;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z260;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/z260;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/z260;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/z260;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/z260;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/z260;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/z260;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z260;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/z260;->k:La/v360;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/z260;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, La/sw00;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v0, La/v360;->x0:I

    .line 21
    .line 22
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v4, v0

    .line 34
    check-cast v4, La/c260;

    .line 35
    .line 36
    iget-boolean v7, v1, La/sw00;->a:Z

    .line 37
    .line 38
    const/4 v14, 0x0

    .line 39
    const v15, 0x3ffdf

    .line 40
    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    invoke-static/range {v4 .. v15}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    iget-object v0, v0, La/z260;->j:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v10, v0

    .line 66
    check-cast v10, Ljava/util/List;

    .line 67
    .line 68
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget v0, La/v360;->x0:I

    .line 74
    .line 75
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 76
    .line 77
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 78
    .line 79
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-object v3, v0

    .line 87
    check-cast v3, La/c260;

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, 0x3fbff

    .line 91
    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v12, 0x0

    .line 101
    invoke-static/range {v3 .. v14}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_1
    iget-object v1, v0, La/z260;->j:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Ljava/util/List;

    .line 117
    .line 118
    sget-object v2, La/wne;->a:La/wne;

    .line 119
    .line 120
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, v0, La/z260;->k:La/v360;

    .line 124
    .line 125
    iget-object v4, v3, La/v360;->o0:La/hjd;

    .line 126
    .line 127
    new-instance v5, La/did;

    .line 128
    .line 129
    invoke-direct {v5, v1}, La/did;-><init>(Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const/4 v8, 0x6

    .line 134
    const/4 v6, 0x0

    .line 135
    invoke-static/range {v3 .. v8}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 139
    .line 140
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 141
    .line 142
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-object v2, v1

    .line 150
    check-cast v2, La/c260;

    .line 151
    .line 152
    const/4 v12, 0x0

    .line 153
    const v13, 0x3fef7

    .line 154
    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 158
    const/4 v5, 0x0

    .line 159
    const/4 v6, 0x0

    .line 160
    const/4 v7, 0x0

    .line 161
    const/4 v8, 0x0

    .line 162
    const/4 v9, 0x0

    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    invoke-static/range {v2 .. v13}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_2

    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
