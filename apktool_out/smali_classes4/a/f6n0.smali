.class public final La/f6n0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/f6n0;->i:B

    iput-object p1, p0, La/f6n0;->l:Ljava/lang/Object;

    iput-object p2, p0, La/f6n0;->m:Ljava/lang/Object;

    iput-wide p3, p0, La/f6n0;->k:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte p1, p0, La/f6n0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/f6n0;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/f6n0;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/f6n0;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, La/y3v;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v5, p0, La/f6n0;->k:J

    .line 19
    .line 20
    const/4 v8, 0x2

    .line 21
    move-object v7, p2

    .line 22
    invoke-direct/range {v2 .. v8}, La/f6n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    move-object v8, p2

    .line 27
    new-instance v3, La/f6n0;

    .line 28
    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, La/t33;

    .line 31
    .line 32
    move-object v5, v0

    .line 33
    check-cast v5, La/ngk0;

    .line 34
    .line 35
    iget-wide v6, p0, La/f6n0;->k:J

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    invoke-direct/range {v3 .. v9}, La/f6n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :pswitch_1
    move-object v8, p2

    .line 43
    new-instance v3, La/f6n0;

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    check-cast v4, La/n660;

    .line 47
    .line 48
    move-object v5, v0

    .line 49
    check-cast v5, La/ql5;

    .line 50
    .line 51
    iget-wide v6, p0, La/f6n0;->k:J

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct/range {v3 .. v9}, La/f6n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/f6n0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/f6n0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/f6n0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/f6n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/f6n0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/f6n0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/f6n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/f6n0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/f6n0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/f6n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/f6n0;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/f6n0;->k:J

    .line 4
    .line 5
    iget-object v3, p0, La/f6n0;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, La/f6n0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v8, p0, La/f6n0;->j:Z

    .line 19
    .line 20
    if-eqz v8, :cond_1

    .line 21
    .line 22
    if-ne v8, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v4, La/y3v;

    .line 36
    .line 37
    iget-object p1, v4, La/y3v;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/vqc;

    .line 40
    .line 41
    check-cast v3, Ljava/lang/String;

    .line 42
    .line 43
    iput-boolean v7, p0, La/f6n0;->j:Z

    .line 44
    .line 45
    iget-object p1, p1, La/vqc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, La/azj0;

    .line 48
    .line 49
    const-class v4, La/hd5;

    .line 50
    .line 51
    sget-object v5, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p1, v4, v1, v2}, La/azj0;->b(La/sgy;J)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, La/hd5;

    .line 62
    .line 63
    invoke-interface {p1, v3, p0}, La/hd5;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_2

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    check-cast p1, Lokhttp3/ResponseBody;

    .line 72
    .line 73
    new-instance v5, La/hc5;

    .line 74
    .line 75
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->a()Ljava/io/InputStream;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->d()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    invoke-direct {v5, p0, v0, v1}, La/hc5;-><init>(Ljava/io/InputStream;J)V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-object v5

    .line 87
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-boolean v8, p0, La/f6n0;->j:Z

    .line 90
    .line 91
    if-eqz v8, :cond_4

    .line 92
    .line 93
    if-ne v8, v7, :cond_3

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    check-cast v4, La/t33;

    .line 107
    .line 108
    check-cast v3, La/ngk0;

    .line 109
    .line 110
    new-instance p1, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, p1}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, La/ne60;

    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    iget-wide v1, p1, La/ne60;->a:J

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    const-wide/16 v1, 0x0

    .line 127
    .line 128
    :goto_2
    new-instance p1, La/ne60;

    .line 129
    .line 130
    invoke-direct {p1, v1, v2}, La/ne60;-><init>(J)V

    .line 131
    .line 132
    .line 133
    iput-boolean v7, p0, La/f6n0;->j:Z

    .line 134
    .line 135
    invoke-virtual {v4, p0, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v0, :cond_6

    .line 140
    .line 141
    move-object v5, v0

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_4
    return-object v5

    .line 146
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 147
    .line 148
    iget-boolean v8, p0, La/f6n0;->j:Z

    .line 149
    .line 150
    if-eqz v8, :cond_8

    .line 151
    .line 152
    if-ne v8, v7, :cond_7

    .line 153
    .line 154
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    check-cast v4, La/n660;

    .line 166
    .line 167
    iget-object p1, v4, La/n660;->a:Ljava/lang/Object;

    .line 168
    .line 169
    move-object v8, p1

    .line 170
    check-cast v8, La/nw20;

    .line 171
    .line 172
    move-object v11, v3

    .line 173
    check-cast v11, La/ql5;

    .line 174
    .line 175
    iget-wide v9, v11, La/ql5;->a:J

    .line 176
    .line 177
    new-array v12, v7, [J

    .line 178
    .line 179
    const/4 p1, 0x0

    .line 180
    aput-wide v1, v12, p1

    .line 181
    .line 182
    iput-boolean v7, p0, La/f6n0;->j:Z

    .line 183
    .line 184
    move-object v13, p0

    .line 185
    invoke-virtual/range {v8 .. v13}, La/nw20;->m(JLa/ql5;[JLa/zje;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-ne p0, v0, :cond_9

    .line 190
    .line 191
    move-object v5, v0

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    :goto_6
    return-object v5

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
