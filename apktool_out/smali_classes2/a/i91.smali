.class public final La/i91;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n91;


# direct methods
.method public synthetic constructor <init>(La/n91;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i91;->i:B

    iput-object p1, p0, La/i91;->k:La/n91;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i91;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i91;->k:La/n91;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/i91;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/i91;-><init>(La/n91;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/i91;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/i91;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/i91;-><init>(La/n91;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/i91;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/i91;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ql5;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/i91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i91;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i91;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i91;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/i91;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v13, v1

    .line 11
    check-cast v13, La/ql5;

    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget v1, La/n91;->f0:I

    .line 19
    .line 20
    iget-object v0, v0, La/i91;->k:La/n91;

    .line 21
    .line 22
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v2, v0

    .line 34
    check-cast v2, La/u81;

    .line 35
    .line 36
    const/16 v18, 0x0

    .line 37
    .line 38
    const v19, 0x1fefff

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const-wide/16 v9, 0x0

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    invoke-static/range {v2 .. v19}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    iget-object v1, v0, La/i91;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, La/sw00;

    .line 73
    .line 74
    sget-object v2, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget v2, La/n91;->f0:I

    .line 80
    .line 81
    iget-object v5, v0, La/i91;->k:La/n91;

    .line 82
    .line 83
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 84
    .line 85
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 86
    .line 87
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v6, v2

    .line 95
    check-cast v6, La/u81;

    .line 96
    .line 97
    iget-boolean v3, v1, La/sw00;->a:Z

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const v23, 0x1ff7ff

    .line 102
    .line 103
    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    const-wide/16 v13, 0x0

    .line 111
    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    const/16 v20, 0x0

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    move/from16 v16, v3

    .line 124
    .line 125
    invoke-static/range {v6 .. v23}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_1

    .line 134
    .line 135
    iget-object v0, v5, La/n91;->q:La/mne;

    .line 136
    .line 137
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 138
    .line 139
    new-instance v3, La/c21;

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x7

    .line 143
    const/4 v4, 0x1

    .line 144
    const-class v6, La/n91;

    .line 145
    .line 146
    const-string v7, "handleError"

    .line 147
    .line 148
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 149
    .line 150
    invoke-direct/range {v3 .. v10}, La/c21;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    new-instance v2, La/y81;

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    const/4 v6, 0x4

    .line 157
    invoke-direct {v2, v5, v4, v6}, La/y81;-><init>(La/n91;La/yje;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v0, v3, v2}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, La/n91;->T()V

    .line 164
    .line 165
    .line 166
    iget-boolean v0, v1, La/sw00;->b:Z

    .line 167
    .line 168
    if-nez v0, :cond_2

    .line 169
    .line 170
    iget-boolean v0, v1, La/sw00;->a:Z

    .line 171
    .line 172
    if-eqz v0, :cond_2

    .line 173
    .line 174
    invoke-virtual {v5}, La/n91;->N()V

    .line 175
    .line 176
    .line 177
    :cond_2
    invoke-virtual {v5}, La/n91;->O()V

    .line 178
    .line 179
    .line 180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
