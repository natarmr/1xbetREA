.class public final La/pmh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qmh0;


# direct methods
.method public synthetic constructor <init>(La/qmh0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pmh0;->i:B

    iput-object p1, p0, La/pmh0;->k:La/qmh0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pmh0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pmh0;->k:La/qmh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pmh0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/pmh0;-><init>(La/qmh0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/pmh0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/pmh0;-><init>(La/qmh0;La/yje;B)V

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
    iget-byte v0, p0, La/pmh0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/pmh0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/pmh0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/pmh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/pmh0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/pmh0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/pmh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pmh0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/pmh0;->k:La/qmh0;

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
    iget-boolean v6, v0, La/pmh0;->j:Z

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
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v4, La/qmh0;->u:La/m1e;

    .line 34
    .line 35
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v6, La/yng0;

    .line 40
    .line 41
    const/4 v7, 0x5

    .line 42
    invoke-direct {v6, v4, v5, v7}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    iput-boolean v3, v0, La/pmh0;->j:Z

    .line 46
    .line 47
    new-instance v3, La/vnq;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    sget-object v5, La/h660;->a:La/h660;

    .line 51
    .line 52
    invoke-direct {v3, v5, v6, v4}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, v3, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-ne v0, v1, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    :goto_0
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    if-ne v0, v1, :cond_4

    .line 70
    .line 71
    move-object v5, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    :goto_3
    return-object v5

    .line 76
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v6, v0, La/pmh0;->j:Z

    .line 79
    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    if-ne v6, v3, :cond_5

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object/from16 v0, p1

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v4, La/qmh0;->p:La/rsu;

    .line 98
    .line 99
    iput-boolean v3, v0, La/pmh0;->j:Z

    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/rsu;->a(La/zje;)Ljava/io/Serializable;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v1, :cond_7

    .line 106
    .line 107
    move-object v5, v1

    .line 108
    goto :goto_6

    .line 109
    :cond_7
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_8

    .line 116
    .line 117
    move-object v8, v0

    .line 118
    goto :goto_5

    .line 119
    :cond_8
    sget v1, La/qmh0;->y:I

    .line 120
    .line 121
    new-instance v1, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 122
    .line 123
    iget-object v2, v4, La/qmh0;->v:La/ctf0;

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    new-array v6, v3, [Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 129
    .line 130
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const v7, 0x7f13015c

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v1, v3, v2}, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;-><init>(ILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    move-object v8, v1

    .line 149
    :goto_5
    iget-object v1, v4, La/qmh0;->r:La/rsu;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v1, v1, La/rsu;->a:La/n660;

    .line 155
    .line 156
    iget-object v1, v1, La/n660;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, La/hmh0;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v1, v1, La/hmh0;->a:La/p7m0;

    .line 164
    .line 165
    invoke-virtual {v1, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 169
    .line 170
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object v6, v1

    .line 180
    check-cast v6, La/mmh0;

    .line 181
    .line 182
    const/4 v15, 0x0

    .line 183
    const/16 v16, 0x1fc

    .line 184
    .line 185
    sget-object v7, La/klh0;->a:La/klh0;

    .line 186
    .line 187
    const/4 v9, 0x0

    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    invoke-static/range {v6 .. v16}, La/mmh0;->a(La/mmh0;La/llh0;Ljava/util/List;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/amh0;I)La/mmh0;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_9

    .line 202
    .line 203
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    :goto_6
    return-object v5

    .line 206
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
