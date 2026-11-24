.class public final La/w7e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qoj0;

.field public final synthetic c:La/g45;


# direct methods
.method public synthetic constructor <init>(La/qoj0;La/g45;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w7e;->a:B

    iput-object p1, p0, La/w7e;->b:La/qoj0;

    iput-object p2, p0, La/w7e;->c:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/w7e;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/w7e;->c:La/g45;

    .line 4
    .line 5
    iget-object v2, p0, La/w7e;->b:La/qoj0;

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
    instance-of v0, p2, La/o8e;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/o8e;

    .line 22
    .line 23
    iget v7, v0, La/o8e;->j:I

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
    iput v7, v0, La/o8e;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/o8e;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/o8e;-><init>(La/w7e;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/o8e;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/o8e;->j:I

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
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/s7e;

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    invoke-direct {p0, p1, v1, v3}, La/s7e;-><init>(La/kmq;La/g45;B)V

    .line 65
    .line 66
    .line 67
    iput v6, v0, La/o8e;->j:I

    .line 68
    .line 69
    invoke-virtual {v2, p0, v0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-object v3, p2

    .line 73
    :goto_1
    return-object v3

    .line 74
    :pswitch_0
    instance-of v0, p2, La/i8e;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, La/i8e;

    .line 80
    .line 81
    iget v7, v0, La/i8e;->j:I

    .line 82
    .line 83
    and-int v8, v7, v5

    .line 84
    .line 85
    if-eqz v8, :cond_3

    .line 86
    .line 87
    sub-int/2addr v7, v5

    .line 88
    iput v7, v0, La/i8e;->j:I

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    new-instance v0, La/i8e;

    .line 92
    .line 93
    invoke-direct {v0, p0, p2}, La/i8e;-><init>(La/w7e;La/yje;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    iget-object p0, v0, La/i8e;->i:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object p2, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget v5, v0, La/i8e;->j:I

    .line 101
    .line 102
    if-eqz v5, :cond_5

    .line 103
    .line 104
    if-ne v5, v6, :cond_4

    .line 105
    .line 106
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, La/s7e;

    .line 120
    .line 121
    invoke-direct {p0, p1, v1, v6}, La/s7e;-><init>(La/kmq;La/g45;B)V

    .line 122
    .line 123
    .line 124
    iput v6, v0, La/i8e;->j:I

    .line 125
    .line 126
    invoke-virtual {v2, p0, v0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-object v3, p2

    .line 130
    :goto_3
    return-object v3

    .line 131
    :pswitch_1
    instance-of v0, p2, La/u7e;

    .line 132
    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    move-object v0, p2

    .line 136
    check-cast v0, La/u7e;

    .line 137
    .line 138
    iget v7, v0, La/u7e;->j:I

    .line 139
    .line 140
    and-int v8, v7, v5

    .line 141
    .line 142
    if-eqz v8, :cond_6

    .line 143
    .line 144
    sub-int/2addr v7, v5

    .line 145
    iput v7, v0, La/u7e;->j:I

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    new-instance v0, La/u7e;

    .line 149
    .line 150
    invoke-direct {v0, p0, p2}, La/u7e;-><init>(La/w7e;La/yje;)V

    .line 151
    .line 152
    .line 153
    :goto_4
    iget-object p0, v0, La/u7e;->i:Ljava/lang/Object;

    .line 154
    .line 155
    sget-object p2, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget v5, v0, La/u7e;->j:I

    .line 158
    .line 159
    if-eqz v5, :cond_8

    .line 160
    .line 161
    if-ne v5, v6, :cond_7

    .line 162
    .line 163
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance p0, La/osa;

    .line 177
    .line 178
    invoke-direct {p0, p1, v1}, La/osa;-><init>(La/kmq;La/g45;)V

    .line 179
    .line 180
    .line 181
    iput v6, v0, La/u7e;->j:I

    .line 182
    .line 183
    invoke-virtual {v2, p0, v0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-object v3, p2

    .line 187
    :goto_5
    return-object v3

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
