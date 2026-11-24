.class public final La/t2h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/o3c;


# direct methods
.method public synthetic constructor <init>(La/o3c;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t2h;->i:B

    iput-object p1, p0, La/t2h;->m:La/o3c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/t2h;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/t2h;

    .line 7
    .line 8
    iget-object p0, p0, La/t2h;->m:La/o3c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/t2h;-><init>(La/o3c;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/t2h;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/t2h;

    .line 18
    .line 19
    iget-object p0, p0, La/t2h;->m:La/o3c;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/t2h;-><init>(La/o3c;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/t2h;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t2h;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/t2h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t2h;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t2h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t2h;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/t2h;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/t2h;->m:La/o3c;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/t2h;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/kmq;

    .line 16
    .line 17
    sget-object v6, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v7, p0, La/t2h;->k:B

    .line 20
    .line 21
    if-eqz v7, :cond_2

    .line 22
    .line 23
    if-eq v7, v3, :cond_1

    .line 24
    .line 25
    if-ne v7, v4, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    iget-object v0, p0, La/t2h;->j:La/kmq;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v1, La/o3c;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/j3c;

    .line 47
    .line 48
    iput-object v5, p0, La/t2h;->l:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v0, p0, La/t2h;->j:La/kmq;

    .line 51
    .line 52
    iput-byte v3, p0, La/t2h;->k:B

    .line 53
    .line 54
    invoke-virtual {p1, p0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v6, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    iput-object v5, p0, La/t2h;->l:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v5, p0, La/t2h;->j:La/kmq;

    .line 64
    .line 65
    iput-byte v4, p0, La/t2h;->k:B

    .line 66
    .line 67
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, v6, :cond_4

    .line 72
    .line 73
    :goto_1
    move-object v5, v6

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_3
    return-object v5

    .line 78
    :pswitch_0
    iget-object v0, p0, La/t2h;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/kmq;

    .line 81
    .line 82
    sget-object v6, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-byte v7, p0, La/t2h;->k:B

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    if-eqz v7, :cond_7

    .line 88
    .line 89
    if-eq v7, v3, :cond_6

    .line 90
    .line 91
    if-ne v7, v4, :cond_5

    .line 92
    .line 93
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_9

    .line 97
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_a

    .line 101
    :cond_6
    iget-object v0, p0, La/t2h;->j:La/kmq;

    .line 102
    .line 103
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_6

    .line 109
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 113
    .line 114
    iget-object p1, v1, La/o3c;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, La/rou;

    .line 117
    .line 118
    iput-object v5, p0, La/t2h;->l:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v0, p0, La/t2h;->j:La/kmq;

    .line 121
    .line 122
    iput-byte v3, p0, La/t2h;->k:B

    .line 123
    .line 124
    invoke-virtual {p1, v8, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v6, :cond_8

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_8
    :goto_4
    check-cast p1, La/m2c0;

    .line 132
    .line 133
    iget-object p1, p1, La/m2c0;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_9

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    goto :goto_5

    .line 146
    :cond_9
    move p1, v8

    .line 147
    :goto_5
    new-instance v1, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 150
    .line 151
    .line 152
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :goto_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 156
    .line 157
    new-instance v1, La/g0g0;

    .line 158
    .line 159
    invoke-direct {v1, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :goto_7
    new-instance p1, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-direct {p1, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 165
    .line 166
    .line 167
    instance-of v2, v1, La/g0g0;

    .line 168
    .line 169
    if-eqz v2, :cond_a

    .line 170
    .line 171
    move-object v1, p1

    .line 172
    :cond_a
    iput-object v5, p0, La/t2h;->l:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v5, p0, La/t2h;->j:La/kmq;

    .line 175
    .line 176
    iput-byte v4, p0, La/t2h;->k:B

    .line 177
    .line 178
    invoke-interface {v0, v1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-ne p0, v6, :cond_b

    .line 183
    .line 184
    :goto_8
    move-object v5, v6

    .line 185
    goto :goto_a

    .line 186
    :cond_b
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_a
    return-object v5

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
