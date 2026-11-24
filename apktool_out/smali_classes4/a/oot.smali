.class public final La/oot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gmq;Ljava/lang/Object;ZB)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/oot;->a:B

    iput-object p1, p0, La/oot;->c:Ljava/lang/Object;

    iput-object p2, p0, La/oot;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/oot;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([La/gmq;ZLjava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/oot;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/oot;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, La/oot;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/oot;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/oot;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/oot;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, La/oot;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/oot;->c:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/high16 v5, -0x80000000

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La/f700;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/f700;

    .line 24
    .line 25
    iget v8, v0, La/f700;->j:I

    .line 26
    .line 27
    and-int v9, v8, v5

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    sub-int/2addr v8, v5

    .line 32
    iput v8, v0, La/f700;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La/f700;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La/f700;-><init>(La/oot;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La/f700;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v5, v0, La/f700;->j:I

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v3, La/utb;

    .line 62
    .line 63
    new-instance p0, La/n7c;

    .line 64
    .line 65
    check-cast v2, La/wdu;

    .line 66
    .line 67
    const/4 v4, 0x2

    .line 68
    invoke-direct {p0, p1, v2, v1, v4}, La/n7c;-><init>(La/kmq;Ljava/lang/Object;ZB)V

    .line 69
    .line 70
    .line 71
    iput v7, v0, La/f700;->j:I

    .line 72
    .line 73
    invoke-virtual {v3, p0, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, p2, :cond_3

    .line 78
    .line 79
    move-object v6, p2

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    :goto_1
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_2
    return-object v6

    .line 84
    :pswitch_0
    instance-of v0, p2, La/e5u;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    move-object v0, p2

    .line 89
    check-cast v0, La/e5u;

    .line 90
    .line 91
    iget v8, v0, La/e5u;->j:I

    .line 92
    .line 93
    and-int v9, v8, v5

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    sub-int/2addr v8, v5

    .line 98
    iput v8, v0, La/e5u;->j:I

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    new-instance v0, La/e5u;

    .line 102
    .line 103
    invoke-direct {v0, p0, p2}, La/e5u;-><init>(La/oot;La/yje;)V

    .line 104
    .line 105
    .line 106
    :goto_3
    iget-object p0, v0, La/e5u;->i:Ljava/lang/Object;

    .line 107
    .line 108
    sget-object p2, La/wne;->a:La/wne;

    .line 109
    .line 110
    iget v5, v0, La/e5u;->j:I

    .line 111
    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    if-ne v5, v7, :cond_5

    .line 115
    .line 116
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    check-cast v3, [La/gmq;

    .line 128
    .line 129
    new-instance p0, La/ti3;

    .line 130
    .line 131
    const/4 v4, 0x6

    .line 132
    invoke-direct {p0, v3, v4}, La/ti3;-><init>([La/gmq;B)V

    .line 133
    .line 134
    .line 135
    new-instance v4, La/xpp;

    .line 136
    .line 137
    check-cast v2, Ljava/util/List;

    .line 138
    .line 139
    invoke-direct {v4, v6, v1, v2}, La/xpp;-><init>(La/yje;ZLjava/util/List;)V

    .line 140
    .line 141
    .line 142
    iput v7, v0, La/e5u;->j:I

    .line 143
    .line 144
    invoke-static {v0, p1, v4, p0, v3}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, p2, :cond_7

    .line 149
    .line 150
    move-object v6, p2

    .line 151
    goto :goto_5

    .line 152
    :cond_7
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_5
    return-object v6

    .line 155
    :pswitch_1
    instance-of v0, p2, La/mot;

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    move-object v0, p2

    .line 160
    check-cast v0, La/mot;

    .line 161
    .line 162
    iget v8, v0, La/mot;->j:I

    .line 163
    .line 164
    and-int v9, v8, v5

    .line 165
    .line 166
    if-eqz v9, :cond_8

    .line 167
    .line 168
    sub-int/2addr v8, v5

    .line 169
    iput v8, v0, La/mot;->j:I

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_8
    new-instance v0, La/mot;

    .line 173
    .line 174
    invoke-direct {v0, p0, p2}, La/mot;-><init>(La/oot;La/yje;)V

    .line 175
    .line 176
    .line 177
    :goto_6
    iget-object p0, v0, La/mot;->i:Ljava/lang/Object;

    .line 178
    .line 179
    sget-object p2, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget v5, v0, La/mot;->j:I

    .line 182
    .line 183
    if-eqz v5, :cond_a

    .line 184
    .line 185
    if-ne v5, v7, :cond_9

    .line 186
    .line 187
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    check-cast v3, La/a1g;

    .line 199
    .line 200
    new-instance p0, La/n7c;

    .line 201
    .line 202
    check-cast v2, La/zri;

    .line 203
    .line 204
    invoke-direct {p0, p1, v2, v1, v7}, La/n7c;-><init>(La/kmq;Ljava/lang/Object;ZB)V

    .line 205
    .line 206
    .line 207
    iput v7, v0, La/mot;->j:I

    .line 208
    .line 209
    invoke-virtual {v3, p0, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    if-ne p0, p2, :cond_b

    .line 214
    .line 215
    move-object v6, p2

    .line 216
    goto :goto_8

    .line 217
    :cond_b
    :goto_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_8
    return-object v6

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
