.class public final La/mnb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/yqc;

.field public final c:La/rrc;

.field public final d:La/ot;

.field public final e:La/jyg0;

.field public final f:La/sp;

.field public final g:La/trm0;


# direct methods
.method public synthetic constructor <init>(La/yqc;La/rrc;La/ot;La/jyg0;La/sp;La/trm0;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/mnb;->a:B

    iput-object p1, p0, La/mnb;->b:La/yqc;

    iput-object p2, p0, La/mnb;->c:La/rrc;

    iput-object p3, p0, La/mnb;->d:La/ot;

    iput-object p4, p0, La/mnb;->e:La/jyg0;

    iput-object p5, p0, La/mnb;->f:La/sp;

    iput-object p6, p0, La/mnb;->g:La/trm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/ql5;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/mnb;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mnb;->c:La/rrc;

    .line 4
    .line 5
    iget-object v2, p0, La/mnb;->b:La/yqc;

    .line 6
    .line 7
    iget-object v3, p0, La/mnb;->f:La/sp;

    .line 8
    .line 9
    iget-object v4, p0, La/mnb;->e:La/jyg0;

    .line 10
    .line 11
    iget-object v5, p0, La/mnb;->g:La/trm0;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    iget-object v8, p0, La/mnb;->d:La/ot;

    .line 17
    .line 18
    const/high16 v9, -0x80000000

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    instance-of v0, p2, La/nnb;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move-object v0, p2

    .line 29
    check-cast v0, La/nnb;

    .line 30
    .line 31
    iget v11, v0, La/nnb;->k:I

    .line 32
    .line 33
    and-int v12, v11, v9

    .line 34
    .line 35
    if-eqz v12, :cond_0

    .line 36
    .line 37
    sub-int/2addr v11, v9

    .line 38
    iput v11, v0, La/nnb;->k:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, La/nnb;

    .line 42
    .line 43
    invoke-direct {v0, p0, p2}, La/nnb;-><init>(La/mnb;La/zje;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object p0, v0, La/nnb;->i:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p2, La/wne;->a:La/wne;

    .line 49
    .line 50
    iget v9, v0, La/nnb;->k:I

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    if-ne v9, v10, :cond_1

    .line 55
    .line 56
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, La/bm5;->c:La/bm5;

    .line 68
    .line 69
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, La/bm5;->a:La/bm5;

    .line 73
    .line 74
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 75
    .line 76
    .line 77
    sget-object p0, La/bm5;->i:La/bm5;

    .line 78
    .line 79
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, La/bm5;->b:La/bm5;

    .line 83
    .line 84
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, La/bm5;->j:La/bm5;

    .line 88
    .line 89
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, La/bm5;->d:La/bm5;

    .line 93
    .line 94
    invoke-virtual {v5, p0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 95
    .line 96
    .line 97
    iget-wide v5, p1, La/ql5;->a:J

    .line 98
    .line 99
    invoke-static {v4, v5, v6}, La/jyg0;->a(La/jyg0;J)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, p1}, La/sp;->b(La/ql5;)V

    .line 103
    .line 104
    .line 105
    iput v10, v0, La/nnb;->k:I

    .line 106
    .line 107
    invoke-virtual {v2, v0}, La/yqc;->u(La/zje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, p2, :cond_3

    .line 112
    .line 113
    move-object v6, p2

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    :goto_1
    invoke-virtual {v1}, La/rrc;->E()V

    .line 116
    .line 117
    .line 118
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_2
    return-object v6

    .line 121
    :pswitch_0
    instance-of v0, p2, La/lnb;

    .line 122
    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    move-object v0, p2

    .line 126
    check-cast v0, La/lnb;

    .line 127
    .line 128
    iget v11, v0, La/lnb;->k:I

    .line 129
    .line 130
    and-int v12, v11, v9

    .line 131
    .line 132
    if-eqz v12, :cond_4

    .line 133
    .line 134
    sub-int/2addr v11, v9

    .line 135
    iput v11, v0, La/lnb;->k:I

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    new-instance v0, La/lnb;

    .line 139
    .line 140
    invoke-direct {v0, p0, p2}, La/lnb;-><init>(La/mnb;La/zje;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    iget-object p0, v0, La/lnb;->i:Ljava/lang/Object;

    .line 144
    .line 145
    sget-object p2, La/wne;->a:La/wne;

    .line 146
    .line 147
    iget v9, v0, La/lnb;->k:I

    .line 148
    .line 149
    if-eqz v9, :cond_6

    .line 150
    .line 151
    if-ne v9, v10, :cond_5

    .line 152
    .line 153
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, La/bm5;->c:La/bm5;

    .line 165
    .line 166
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 167
    .line 168
    .line 169
    sget-object p0, La/bm5;->a:La/bm5;

    .line 170
    .line 171
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, La/bm5;->i:La/bm5;

    .line 175
    .line 176
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, La/bm5;->b:La/bm5;

    .line 180
    .line 181
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, La/bm5;->j:La/bm5;

    .line 185
    .line 186
    invoke-virtual {v8, p0, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 187
    .line 188
    .line 189
    sget-object p0, La/bm5;->d:La/bm5;

    .line 190
    .line 191
    invoke-virtual {v5, p0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 192
    .line 193
    .line 194
    iget-wide v5, p1, La/ql5;->a:J

    .line 195
    .line 196
    invoke-static {v4, v5, v6}, La/jyg0;->a(La/jyg0;J)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, p1}, La/sp;->b(La/ql5;)V

    .line 200
    .line 201
    .line 202
    iput v10, v0, La/lnb;->k:I

    .line 203
    .line 204
    invoke-virtual {v2, v0}, La/yqc;->u(La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    if-ne p0, p2, :cond_7

    .line 209
    .line 210
    move-object v6, p2

    .line 211
    goto :goto_5

    .line 212
    :cond_7
    :goto_4
    invoke-virtual {v1}, La/rrc;->E()V

    .line 213
    .line 214
    .line 215
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    :goto_5
    return-object v6

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
