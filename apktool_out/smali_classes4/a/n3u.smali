.class public final La/n3u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/d4u;


# direct methods
.method public synthetic constructor <init>(La/d4u;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n3u;->i:B

    iput-object p1, p0, La/n3u;->l:La/d4u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n3u;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/n3u;

    .line 7
    .line 8
    iget-object p0, p0, La/n3u;->l:La/d4u;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/n3u;-><init>(La/d4u;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/n3u;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/n3u;

    .line 18
    .line 19
    iget-object p0, p0, La/n3u;->l:La/d4u;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/n3u;-><init>(La/d4u;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/n3u;->k:Ljava/lang/Object;

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
    iget-byte v0, p0, La/n3u;->i:B

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
    invoke-virtual {p0, p1, p2}, La/n3u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/n3u;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/n3u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/n3u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/n3u;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/n3u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/n3u;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/n3u;->l:La/d4u;

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
    iget-object v0, p0, La/n3u;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/kmq;

    .line 16
    .line 17
    sget-object v6, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v7, p0, La/n3u;->j:B

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, v1, La/d4u;->f:La/pmi;

    .line 43
    .line 44
    iput-object v0, p0, La/n3u;->k:Ljava/lang/Object;

    .line 45
    .line 46
    iput-byte v3, p0, La/n3u;->j:B

    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v6, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    new-instance v1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput-object v5, p0, La/n3u;->k:Ljava/lang/Object;

    .line 67
    .line 68
    iput-byte v4, p0, La/n3u;->j:B

    .line 69
    .line 70
    invoke-interface {v0, v1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v6, :cond_4

    .line 75
    .line 76
    :goto_1
    move-object v5, v6

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_3
    return-object v5

    .line 81
    :pswitch_0
    iget-object v0, p0, La/n3u;->k:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/kmq;

    .line 84
    .line 85
    sget-object v6, La/wne;->a:La/wne;

    .line 86
    .line 87
    iget-byte v7, p0, La/n3u;->j:B

    .line 88
    .line 89
    if-eqz v7, :cond_7

    .line 90
    .line 91
    if-eq v7, v3, :cond_6

    .line 92
    .line 93
    if-ne v7, v4, :cond_5

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_9

    .line 99
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_a

    .line 103
    :cond_6
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
    iget-object p1, v1, La/d4u;->l:La/lyt;

    .line 115
    .line 116
    sget-object v1, La/mvc;->l:La/mvc;

    .line 117
    .line 118
    iput-object v0, p0, La/n3u;->k:Ljava/lang/Object;

    .line 119
    .line 120
    iput-byte v3, p0, La/n3u;->j:B

    .line 121
    .line 122
    invoke-virtual {p1, v1, p0}, La/lyt;->b(La/mvc;La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v6, :cond_8

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_8
    :goto_4
    check-cast p1, Ljava/lang/Iterable;

    .line 130
    .line 131
    new-instance v1, Ljava/util/ArrayList;

    .line 132
    .line 133
    const/16 v2, 0xa

    .line 134
    .line 135
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, La/uvc;

    .line 157
    .line 158
    invoke-static {v2}, La/bkb;->k0(La/uvc;)La/uog;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_9
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :goto_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 170
    .line 171
    new-instance v1, La/g0g0;

    .line 172
    .line 173
    invoke-direct {v1, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    :goto_7
    new-instance p1, La/j0g0;

    .line 177
    .line 178
    invoke-direct {p1, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iput-object v5, p0, La/n3u;->k:Ljava/lang/Object;

    .line 182
    .line 183
    iput-byte v4, p0, La/n3u;->j:B

    .line 184
    .line 185
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-ne p0, v6, :cond_a

    .line 190
    .line 191
    :goto_8
    move-object v5, v6

    .line 192
    goto :goto_a

    .line 193
    :cond_a
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    :goto_a
    return-object v5

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
