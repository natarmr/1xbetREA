.class public final La/qkw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ukw;


# direct methods
.method public synthetic constructor <init>(La/ukw;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qkw;->i:B

    iput-object p1, p0, La/qkw;->k:La/ukw;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qkw;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qkw;->k:La/ukw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/qkw;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/qkw;-><init>(La/ukw;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/qkw;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/qkw;-><init>(La/ukw;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/qkw;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/qkw;-><init>(La/ukw;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/qkw;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qkw;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qkw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qkw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qkw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qkw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qkw;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qkw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/qkw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/qkw;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/qkw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qkw;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/qkw;->k:La/ukw;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/qkw;->j:Z

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
    iget-object v2, v5, La/ukw;->L:La/r2u;

    .line 36
    .line 37
    iput-boolean v3, v0, La/qkw;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v0}, La/r2u;->c(La/zje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    move-object v7, v0

    .line 48
    check-cast v7, Ljava/util/List;

    .line 49
    .line 50
    sget v0, La/ukw;->X:I

    .line 51
    .line 52
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 53
    .line 54
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 55
    .line 56
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object v6, v0

    .line 64
    check-cast v6, La/zjw;

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const v19, 0x7fff7

    .line 69
    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x0

    .line 78
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    invoke-static/range {v6 .. v19}, La/zjw;->a(La/zjw;Ljava/util/List;La/ekw;Ljava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)La/zjw;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_1
    return-object v4

    .line 96
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v6, v0, La/qkw;->j:Z

    .line 99
    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    if-ne v6, v3, :cond_4

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v5, La/ukw;->C:La/hvt;

    .line 116
    .line 117
    iget-object v2, v2, La/hvt;->a:La/b2g;

    .line 118
    .line 119
    iget-object v2, v2, La/b2g;->a:La/ehf0;

    .line 120
    .line 121
    iget-object v2, v2, La/ehf0;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, La/or30;

    .line 124
    .line 125
    iget-object v2, v2, La/or30;->a:La/p7m0;

    .line 126
    .line 127
    new-instance v4, La/h2c;

    .line 128
    .line 129
    const/16 v6, 0x10

    .line 130
    .line 131
    invoke-direct {v4, v2, v6}, La/h2c;-><init>(La/p7m0;B)V

    .line 132
    .line 133
    .line 134
    new-instance v2, La/v6w;

    .line 135
    .line 136
    const/4 v6, 0x7

    .line 137
    invoke-direct {v2, v5, v6}, La/v6w;-><init>(Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    iput-boolean v3, v0, La/qkw;->j:Z

    .line 141
    .line 142
    new-instance v3, La/uap;

    .line 143
    .line 144
    const/16 v5, 0xc

    .line 145
    .line 146
    invoke-direct {v3, v2, v5}, La/uap;-><init>(La/kmq;B)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v4, v3, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sget-object v2, La/wne;->a:La/wne;

    .line 154
    .line 155
    if-ne v0, v2, :cond_6

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_2
    if-ne v0, v1, :cond_7

    .line 161
    .line 162
    move-object v4, v1

    .line 163
    goto :goto_4

    .line 164
    :cond_7
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    :goto_4
    return-object v4

    .line 167
    :pswitch_1
    iget-boolean v0, v0, La/qkw;->j:Z

    .line 168
    .line 169
    sget-object v1, La/wne;->a:La/wne;

    .line 170
    .line 171
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    sget v1, La/ukw;->X:I

    .line 177
    .line 178
    invoke-virtual {v5}, La/ukw;->Z()V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_8
    iget-object v1, v5, La/ukw;->T:La/bby;

    .line 183
    .line 184
    if-eqz v1, :cond_9

    .line 185
    .line 186
    invoke-interface {v1, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    :goto_5
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, La/zjw;

    .line 194
    .line 195
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 196
    .line 197
    invoke-virtual {v5, v0, v1}, La/ukw;->O(ZLa/ekw;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
