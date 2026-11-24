.class public final La/xla0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/cma0;


# direct methods
.method public synthetic constructor <init>(La/cma0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xla0;->i:B

    iput-object p1, p0, La/xla0;->k:La/cma0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xla0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xla0;->k:La/cma0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xla0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/xla0;-><init>(La/cma0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/xla0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/xla0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/xla0;-><init>(La/cma0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/xla0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/xla0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/xla0;-><init>(La/cma0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/xla0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/xla0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xla0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hdm0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/xla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/xla0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/xla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/xla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/xla0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/xla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xla0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/xla0;->k:La/cma0;

    .line 6
    .line 7
    iget-object v0, v0, La/xla0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v7, v0

    .line 13
    check-cast v7, La/uaq0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v2, La/cma0;->E:La/fhj;

    .line 21
    .line 22
    iget-object v4, v2, La/cma0;->o:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v5, v2, La/cma0;->p:J

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    invoke-virtual/range {v3 .. v9}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 33
    .line 34
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-object v10, v0

    .line 44
    check-cast v10, La/lla0;

    .line 45
    .line 46
    const/16 v21, 0x0

    .line 47
    .line 48
    const/16 v22, 0xffb

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    const/16 v18, 0x0

    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/16 v20, 0x0

    .line 63
    .line 64
    invoke-static/range {v10 .. v22}, La/lla0;->a(La/lla0;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZI)La/lla0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_0
    check-cast v0, La/hdm0;

    .line 78
    .line 79
    sget-object v1, La/wne;->a:La/wne;

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    instance-of v1, v0, La/gdm0;

    .line 85
    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    move-object v3, v0

    .line 89
    check-cast v3, La/gdm0;

    .line 90
    .line 91
    iget-object v3, v3, La/gdm0;->b:La/odm0;

    .line 92
    .line 93
    invoke-interface {v3}, La/odm0;->a()La/bom0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    instance-of v3, v3, La/znm0;

    .line 98
    .line 99
    if-nez v3, :cond_1

    .line 100
    .line 101
    iget-object v3, v2, La/cma0;->L:La/bby;

    .line 102
    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    new-instance v10, La/yla0;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-direct {v10, v2, v3, v5}, La/yla0;-><init>(La/cma0;La/yje;B)V

    .line 114
    .line 115
    .line 116
    const/16 v11, 0x2c

    .line 117
    .line 118
    const-wide/16 v5, 0x1e

    .line 119
    .line 120
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    invoke-static/range {v4 .. v11}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput-object v3, v2, La/cma0;->L:La/bby;

    .line 129
    .line 130
    :cond_1
    if-eqz v1, :cond_3

    .line 131
    .line 132
    move-object v1, v0

    .line 133
    check-cast v1, La/gdm0;

    .line 134
    .line 135
    iget-object v1, v1, La/gdm0;->b:La/odm0;

    .line 136
    .line 137
    invoke-interface {v1}, La/odm0;->a()La/bom0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    instance-of v12, v1, La/znm0;

    .line 142
    .line 143
    iget-object v3, v2, La/cma0;->E:La/fhj;

    .line 144
    .line 145
    iget-object v4, v2, La/cma0;->o:Ljava/lang/String;

    .line 146
    .line 147
    iget-wide v5, v2, La/cma0;->p:J

    .line 148
    .line 149
    iget-object v1, v2, La/cma0;->C:La/wyu;

    .line 150
    .line 151
    invoke-virtual {v1}, La/wyu;->a()La/uaq0;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    const-wide/16 v8, 0x0

    .line 156
    .line 157
    invoke-virtual/range {v3 .. v9}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 162
    .line 163
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 164
    .line 165
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, La/lla0;

    .line 174
    .line 175
    move-object v4, v0

    .line 176
    check-cast v4, La/gdm0;

    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/16 v15, 0xdf9

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    const/4 v10, 0x0

    .line 186
    const/4 v11, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    invoke-static/range {v3 .. v15}, La/lla0;->a(La/lla0;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZI)La/lla0;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_2

    .line 197
    .line 198
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 202
    .line 203
    sget-object v1, La/wne;->a:La/wne;

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget v1, La/cma0;->M:I

    .line 209
    .line 210
    iget-object v1, v2, La/cma0;->G:La/duj;

    .line 211
    .line 212
    new-instance v3, La/cz90;

    .line 213
    .line 214
    const/16 v4, 0x1b

    .line 215
    .line 216
    invoke-direct {v3, v2, v4}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 220
    .line 221
    .line 222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
