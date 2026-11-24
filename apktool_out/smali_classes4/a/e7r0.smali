.class public final La/e7r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Z

.field public final synthetic k:La/g7r0;


# direct methods
.method public synthetic constructor <init>(La/g7r0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e7r0;->i:B

    iput-object p1, p0, La/e7r0;->k:La/g7r0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e7r0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e7r0;->k:La/g7r0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/e7r0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/e7r0;-><init>(La/g7r0;La/yje;B)V

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
    iput-boolean p0, v0, La/e7r0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/e7r0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/e7r0;-><init>(La/g7r0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v0, La/e7r0;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e7r0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/e7r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/e7r0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/e7r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/e7r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/e7r0;

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/e7r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e7r0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/e7r0;->k:La/g7r0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v15, v0, La/e7r0;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget v0, La/g7r0;->L:I

    .line 18
    .line 19
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, La/w6r0;

    .line 32
    .line 33
    const/16 v22, 0x0

    .line 34
    .line 35
    const v23, 0x7fdfff

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    const/16 v18, 0x0

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    const/16 v20, 0x0

    .line 58
    .line 59
    const/16 v21, 0x0

    .line 60
    .line 61
    invoke-static/range {v3 .. v23}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    if-eqz v15, :cond_1

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {v2, v0}, La/g7r0;->M(Z)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    iget-boolean v0, v0, La/e7r0;->j:Z

    .line 81
    .line 82
    sget-object v1, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v2, La/g7r0;->o:La/vzg0;

    .line 88
    .line 89
    const-string v3, "SAVED_VIDEO_FILTER_KEY"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v1, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v3, v1

    .line 110
    move-object v1, v2

    .line 111
    check-cast v1, La/w6r0;

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const v21, 0x7ffffd

    .line 116
    .line 117
    .line 118
    move-object v4, v3

    .line 119
    const/4 v3, 0x0

    .line 120
    move-object v5, v4

    .line 121
    const/4 v4, 0x0

    .line 122
    move-object v6, v5

    .line 123
    const/4 v5, 0x0

    .line 124
    move-object v7, v6

    .line 125
    const/4 v6, 0x0

    .line 126
    move-object v8, v7

    .line 127
    const/4 v7, 0x0

    .line 128
    move-object v9, v8

    .line 129
    const/4 v8, 0x0

    .line 130
    move-object v10, v9

    .line 131
    const/4 v9, 0x0

    .line 132
    move-object v11, v10

    .line 133
    const/4 v10, 0x0

    .line 134
    move-object v12, v11

    .line 135
    const/4 v11, 0x0

    .line 136
    move-object v13, v12

    .line 137
    const/4 v12, 0x0

    .line 138
    move-object v14, v13

    .line 139
    const/4 v13, 0x0

    .line 140
    move-object v15, v14

    .line 141
    const/4 v14, 0x0

    .line 142
    move-object/from16 v16, v15

    .line 143
    .line 144
    const/4 v15, 0x0

    .line 145
    move-object/from16 v17, v16

    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    move-object/from16 v18, v17

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    move-object/from16 v19, v18

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    move-object/from16 v22, v19

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    move-object/from16 v24, v2

    .line 162
    .line 163
    move v2, v0

    .line 164
    move-object/from16 v0, v22

    .line 165
    .line 166
    invoke-static/range {v1 .. v21}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    move-object/from16 v3, v24

    .line 171
    .line 172
    invoke-virtual {v0, v3, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_2

    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_2
    move-object v1, v0

    .line 182
    move v0, v2

    .line 183
    goto :goto_0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
