.class public final La/of4;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:B

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/of4;->j:B

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p0, p0, La/of4;->j:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/of4;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {p0, v0, p2, v1}, La/of4;-><init>(ILa/yje;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/of4;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/of4;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, v0, p2, v1}, La/of4;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/of4;->l:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

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
    iget-byte v0, p0, La/of4;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/of4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/of4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/of4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/of4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/of4;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/of4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/of4;->j:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/of4;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/inn0;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v7, p0, La/of4;->k:B

    .line 19
    .line 20
    if-eqz v7, :cond_2

    .line 21
    .line 22
    if-eq v7, v3, :cond_1

    .line 23
    .line 24
    if-ne v7, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_6

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/of4;->l:Ljava/lang/Object;

    .line 42
    .line 43
    iput-byte v3, p0, La/of4;->k:B

    .line 44
    .line 45
    invoke-static {v0, v1, p0, v4}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v6, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    :goto_0
    check-cast p1, La/dpa0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 55
    .line 56
    .line 57
    :goto_1
    iput-object v0, p0, La/of4;->l:Ljava/lang/Object;

    .line 58
    .line 59
    iput-byte v4, p0, La/of4;->k:B

    .line 60
    .line 61
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 62
    .line 63
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v6, :cond_4

    .line 68
    .line 69
    :goto_2
    move-object v5, v6

    .line 70
    goto :goto_6

    .line 71
    :cond_4
    :goto_3
    check-cast p1, La/woa0;

    .line 72
    .line 73
    iget-object v1, p1, La/woa0;->a:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_5

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, La/dpa0;

    .line 90
    .line 91
    invoke-virtual {v2}, La/dpa0;->a()V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, La/dpa0;

    .line 121
    .line 122
    iget-boolean v1, v1, La/dpa0;->d:Z

    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_8
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    :goto_6
    return-object v5

    .line 130
    :pswitch_0
    iget-object v0, p0, La/of4;->l:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, La/inn0;

    .line 133
    .line 134
    sget-object v6, La/wne;->a:La/wne;

    .line 135
    .line 136
    iget-byte v7, p0, La/of4;->k:B

    .line 137
    .line 138
    if-eqz v7, :cond_b

    .line 139
    .line 140
    if-eq v7, v3, :cond_a

    .line 141
    .line 142
    if-ne v7, v4, :cond_9

    .line 143
    .line 144
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_9

    .line 148
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_a

    .line 152
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iput-object v0, p0, La/of4;->l:Ljava/lang/Object;

    .line 160
    .line 161
    iput-byte v3, p0, La/of4;->k:B

    .line 162
    .line 163
    const/4 p1, 0x3

    .line 164
    invoke-static {v0, v1, p0, p1}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v6, :cond_c

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_c
    :goto_7
    iput-object v5, p0, La/of4;->l:Ljava/lang/Object;

    .line 172
    .line 173
    iput-byte v4, p0, La/of4;->k:B

    .line 174
    .line 175
    sget-object p1, La/tto0;->a:La/bk9;

    .line 176
    .line 177
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 178
    .line 179
    invoke-static {v0, p1, p0}, La/tto0;->i(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, v6, :cond_d

    .line 184
    .line 185
    :goto_8
    move-object v5, v6

    .line 186
    goto :goto_a

    .line 187
    :cond_d
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_a
    return-object v5

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
