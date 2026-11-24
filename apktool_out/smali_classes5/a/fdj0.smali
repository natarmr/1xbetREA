.class public final La/fdj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/odj0;


# direct methods
.method public synthetic constructor <init>(La/odj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fdj0;->i:B

    iput-object p1, p0, La/fdj0;->j:La/odj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/fdj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fdj0;->j:La/odj0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/fdj0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/fdj0;-><init>(La/odj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/fdj0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/fdj0;-><init>(La/odj0;La/yje;B)V

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
    iget-byte v0, p0, La/fdj0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/fdj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fdj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fdj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fdj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fdj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fdj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
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
    iget-byte v1, v0, La/fdj0;->i:B

    .line 4
    .line 5
    iget-object v0, v0, La/fdj0;->j:La/odj0;

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
    sget v1, La/odj0;->V0:I

    .line 16
    .line 17
    new-instance v1, La/r3j0;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, v2}, La/r3j0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/r3j0;

    .line 28
    .line 29
    const/16 v2, 0xf

    .line 30
    .line 31
    invoke-direct {v1, v2}, La/r3j0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, La/odj0;->h0:La/iqt;

    .line 46
    .line 47
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 48
    .line 49
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-instance v2, La/cxi0;

    .line 54
    .line 55
    const/4 v3, 0x5

    .line 56
    invoke-direct {v2, v3, v1}, La/cxi0;-><init>(BZ)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 60
    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-class v1, La/oqt0;

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    new-instance v11, La/zye0;

    .line 75
    .line 76
    const/16 v1, 0x18

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v11, v0, v2, v1}, La/zye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 80
    .line 81
    .line 82
    new-instance v14, La/vcj0;

    .line 83
    .line 84
    const/4 v1, 0x6

    .line 85
    invoke-direct {v14, v0, v1}, La/vcj0;-><init>(La/odj0;B)V

    .line 86
    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x2d0

    .line 90
    .line 91
    const-string v5, "SettingsViewModel.getAuthorizedData"

    .line 92
    .line 93
    const/4 v6, 0x3

    .line 94
    const-wide/16 v7, 0x5

    .line 95
    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    invoke-static/range {v4 .. v16}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 103
    .line 104
    .line 105
    move-result-object v17

    .line 106
    new-instance v1, La/vcj0;

    .line 107
    .line 108
    const/16 v3, 0x8

    .line 109
    .line 110
    invoke-direct {v1, v0, v3}, La/vcj0;-><init>(La/odj0;B)V

    .line 111
    .line 112
    .line 113
    iget-object v3, v0, La/odj0;->F:La/mne;

    .line 114
    .line 115
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 116
    .line 117
    new-instance v4, La/bdj0;

    .line 118
    .line 119
    const/4 v5, 0x2

    .line 120
    invoke-direct {v4, v0, v2, v5}, La/bdj0;-><init>(La/odj0;La/yje;B)V

    .line 121
    .line 122
    .line 123
    const/16 v22, 0xa

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    move-object/from16 v18, v1

    .line 128
    .line 129
    move-object/from16 v20, v3

    .line 130
    .line 131
    move-object/from16 v21, v4

    .line 132
    .line 133
    invoke-static/range {v17 .. v22}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 134
    .line 135
    .line 136
    :cond_0
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, La/tcj0;

    .line 141
    .line 142
    iget-boolean v1, v1, La/tcj0;->F:Z

    .line 143
    .line 144
    if-nez v1, :cond_1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_1
    iget-object v1, v0, La/odj0;->d0:La/f4u;

    .line 148
    .line 149
    invoke-virtual {v1}, La/f4u;->c()La/j6d0;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-instance v2, La/exi0;

    .line 154
    .line 155
    const/4 v3, 0x1

    .line 156
    invoke-direct {v2, v1, v3}, La/exi0;-><init>(La/j6d0;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    const/4 v1, 0x0

    .line 163
    invoke-virtual {v0, v1}, La/odj0;->N(Z)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v0, La/odj0;->t0:La/zyt;

    .line 167
    .line 168
    invoke-virtual {v2}, La/zyt;->a()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    new-instance v3, La/u49;

    .line 173
    .line 174
    const/16 v4, 0x17

    .line 175
    .line 176
    invoke-direct {v3, v4, v2, v1}, La/u49;-><init>(BIZ)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    new-instance v2, La/rbj0;

    .line 183
    .line 184
    invoke-direct {v2, v1}, La/rbj0;-><init>(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
