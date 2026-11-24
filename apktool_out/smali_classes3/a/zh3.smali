.class public final La/zh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rwk;

.field public final synthetic c:La/ij3;


# direct methods
.method public synthetic constructor <init>(La/rwk;La/ij3;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zh3;->a:B

    iput-object p1, p0, La/zh3;->b:La/rwk;

    iput-object p2, p0, La/zh3;->c:La/ij3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zh3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/zh3;->c:La/ij3;

    .line 4
    .line 5
    iget-object v2, p0, La/zh3;->b:La/rwk;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/mi3;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/mi3;

    .line 22
    .line 23
    iget v7, v0, La/mi3;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/mi3;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/mi3;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/mi3;-><init>(La/zh3;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/mi3;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/mi3;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/ua;

    .line 60
    .line 61
    const/16 v3, 0x18

    .line 62
    .line 63
    invoke-direct {p0, p1, v1, v3}, La/ua;-><init>(La/kmq;La/w46;B)V

    .line 64
    .line 65
    .line 66
    iput v6, v0, La/mi3;->j:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, p2, :cond_3

    .line 73
    .line 74
    move-object v3, p2

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_2
    return-object v3

    .line 79
    :pswitch_0
    instance-of v0, p2, La/di3;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, La/di3;

    .line 85
    .line 86
    iget v7, v0, La/di3;->j:I

    .line 87
    .line 88
    and-int v8, v7, v5

    .line 89
    .line 90
    if-eqz v8, :cond_4

    .line 91
    .line 92
    sub-int/2addr v7, v5

    .line 93
    iput v7, v0, La/di3;->j:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    new-instance v0, La/di3;

    .line 97
    .line 98
    invoke-direct {v0, p0, p2}, La/di3;-><init>(La/zh3;La/yje;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object p0, v0, La/di3;->i:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p2, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget v5, v0, La/di3;->j:I

    .line 106
    .line 107
    if-eqz v5, :cond_6

    .line 108
    .line 109
    if-ne v5, v6, :cond_5

    .line 110
    .line 111
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p0, La/yh3;

    .line 123
    .line 124
    invoke-direct {p0, p1, v1, v6}, La/yh3;-><init>(La/kmq;La/ij3;B)V

    .line 125
    .line 126
    .line 127
    iput v6, v0, La/di3;->j:I

    .line 128
    .line 129
    invoke-virtual {v2, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, p2, :cond_7

    .line 134
    .line 135
    move-object v3, p2

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v3

    .line 140
    :pswitch_1
    instance-of v0, p2, La/wh3;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, La/wh3;

    .line 146
    .line 147
    iget v7, v0, La/wh3;->j:I

    .line 148
    .line 149
    and-int v8, v7, v5

    .line 150
    .line 151
    if-eqz v8, :cond_8

    .line 152
    .line 153
    sub-int/2addr v7, v5

    .line 154
    iput v7, v0, La/wh3;->j:I

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    new-instance v0, La/wh3;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, La/wh3;-><init>(La/zh3;La/yje;)V

    .line 160
    .line 161
    .line 162
    :goto_6
    iget-object p0, v0, La/wh3;->i:Ljava/lang/Object;

    .line 163
    .line 164
    sget-object p2, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget v5, v0, La/wh3;->j:I

    .line 167
    .line 168
    if-eqz v5, :cond_a

    .line 169
    .line 170
    if-ne v5, v6, :cond_9

    .line 171
    .line 172
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance p0, La/yh3;

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    invoke-direct {p0, p1, v1, v3}, La/yh3;-><init>(La/kmq;La/ij3;B)V

    .line 187
    .line 188
    .line 189
    iput v6, v0, La/wh3;->j:I

    .line 190
    .line 191
    invoke-virtual {v2, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, p2, :cond_b

    .line 196
    .line 197
    move-object v3, p2

    .line 198
    goto :goto_8

    .line 199
    :cond_b
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_8
    return-object v3

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
