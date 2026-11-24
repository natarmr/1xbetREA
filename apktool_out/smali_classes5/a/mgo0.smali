.class public final La/mgo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;


# direct methods
.method public synthetic constructor <init>(La/gmq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mgo0;->a:B

    iput-object p1, p0, La/mgo0;->b:La/gmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/mgo0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/high16 v3, -0x80000000

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/mgo0;->b:La/gmq;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/p6w0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/p6w0;

    .line 20
    .line 21
    iget v6, v0, La/p6w0;->j:I

    .line 22
    .line 23
    and-int v7, v6, v3

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v3

    .line 28
    iput v6, v0, La/p6w0;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/p6w0;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/p6w0;-><init>(La/mgo0;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/p6w0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v3, v0, La/p6w0;->j:I

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-ne v3, v4, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    check-cast v5, La/mz40;

    .line 58
    .line 59
    new-instance p0, La/ofv0;

    .line 60
    .line 61
    const/4 v1, 0x7

    .line 62
    invoke-direct {p0, p1, v1}, La/ofv0;-><init>(La/kmq;B)V

    .line 63
    .line 64
    .line 65
    iput v4, v0, La/p6w0;->j:I

    .line 66
    .line 67
    invoke-interface {v5, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, p2, :cond_3

    .line 72
    .line 73
    move-object v1, p2

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_2
    return-object v1

    .line 78
    :pswitch_0
    check-cast v5, La/zj2;

    .line 79
    .line 80
    new-instance p0, La/ofv0;

    .line 81
    .line 82
    const/4 v0, 0x2

    .line 83
    invoke-direct {p0, p1, v0}, La/ofv0;-><init>(La/kmq;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, p0, p2}, La/zj2;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p1, La/wne;->a:La/wne;

    .line 91
    .line 92
    if-ne p0, p1, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_3
    return-object p0

    .line 98
    :pswitch_1
    instance-of v0, p2, La/dio0;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    move-object v0, p2

    .line 103
    check-cast v0, La/dio0;

    .line 104
    .line 105
    iget v6, v0, La/dio0;->j:I

    .line 106
    .line 107
    and-int v7, v6, v3

    .line 108
    .line 109
    if-eqz v7, :cond_5

    .line 110
    .line 111
    sub-int/2addr v6, v3

    .line 112
    iput v6, v0, La/dio0;->j:I

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    new-instance v0, La/dio0;

    .line 116
    .line 117
    invoke-direct {v0, p0, p2}, La/dio0;-><init>(La/mgo0;La/yje;)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iget-object p0, v0, La/dio0;->i:Ljava/lang/Object;

    .line 121
    .line 122
    sget-object p2, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget v3, v0, La/dio0;->j:I

    .line 125
    .line 126
    if-eqz v3, :cond_7

    .line 127
    .line 128
    if-ne v3, v4, :cond_6

    .line 129
    .line 130
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_7
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    check-cast v5, La/qgo0;

    .line 142
    .line 143
    new-instance p0, La/d8n0;

    .line 144
    .line 145
    const/16 v1, 0x10

    .line 146
    .line 147
    invoke-direct {p0, p1, v1}, La/d8n0;-><init>(La/kmq;B)V

    .line 148
    .line 149
    .line 150
    iput v4, v0, La/dio0;->j:I

    .line 151
    .line 152
    invoke-virtual {v5, p0, v0}, La/qgo0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, p2, :cond_8

    .line 157
    .line 158
    move-object v1, p2

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    :goto_6
    return-object v1

    .line 163
    :pswitch_2
    instance-of v0, p2, La/kgo0;

    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    move-object v0, p2

    .line 168
    check-cast v0, La/kgo0;

    .line 169
    .line 170
    iget v6, v0, La/kgo0;->j:I

    .line 171
    .line 172
    and-int v7, v6, v3

    .line 173
    .line 174
    if-eqz v7, :cond_9

    .line 175
    .line 176
    sub-int/2addr v6, v3

    .line 177
    iput v6, v0, La/kgo0;->j:I

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_9
    new-instance v0, La/kgo0;

    .line 181
    .line 182
    invoke-direct {v0, p0, p2}, La/kgo0;-><init>(La/mgo0;La/yje;)V

    .line 183
    .line 184
    .line 185
    :goto_7
    iget-object p0, v0, La/kgo0;->i:Ljava/lang/Object;

    .line 186
    .line 187
    sget-object p2, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget v3, v0, La/kgo0;->j:I

    .line 190
    .line 191
    if-eqz v3, :cond_b

    .line 192
    .line 193
    if-ne v3, v4, :cond_a

    .line 194
    .line 195
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    check-cast v5, La/qgo0;

    .line 207
    .line 208
    new-instance p0, La/d8n0;

    .line 209
    .line 210
    const/16 v1, 0xe

    .line 211
    .line 212
    invoke-direct {p0, p1, v1}, La/d8n0;-><init>(La/kmq;B)V

    .line 213
    .line 214
    .line 215
    iput v4, v0, La/kgo0;->j:I

    .line 216
    .line 217
    invoke-virtual {v5, p0, v0}, La/qgo0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, p2, :cond_c

    .line 222
    .line 223
    move-object v1, p2

    .line 224
    goto :goto_9

    .line 225
    :cond_c
    :goto_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_9
    return-object v1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
