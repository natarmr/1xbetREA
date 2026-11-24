.class public final La/ir60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/bs60;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/bs60;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ir60;->a:B

    iput-object p1, p0, La/ir60;->b:La/kmq;

    iput-object p2, p0, La/ir60;->c:La/bs60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ir60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ir60;->c:La/bs60;

    .line 4
    .line 5
    iget-object v2, p0, La/ir60;->b:La/kmq;

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
    instance-of v0, p2, La/nr60;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/nr60;

    .line 22
    .line 23
    iget v7, v0, La/nr60;->j:I

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
    iput v7, v0, La/nr60;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/nr60;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/nr60;-><init>(La/ir60;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/nr60;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/nr60;->j:I

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
    move-object p0, p1

    .line 60
    check-cast p0, Lkotlin/Pair;

    .line 61
    .line 62
    iget-object v3, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, La/pat;

    .line 65
    .line 66
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/pat;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of v3, v3, La/kat;

    .line 74
    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    instance-of p0, p0, La/kat;

    .line 81
    .line 82
    if-nez p0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/w370;

    .line 89
    .line 90
    iget-boolean p0, p0, La/w370;->b:Z

    .line 91
    .line 92
    if-nez p0, :cond_3

    .line 93
    .line 94
    iput v6, v0, La/nr60;->j:I

    .line 95
    .line 96
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, p2, :cond_3

    .line 101
    .line 102
    move-object v3, p2

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_2
    return-object v3

    .line 107
    :pswitch_0
    instance-of v0, p2, La/hr60;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    move-object v0, p2

    .line 112
    check-cast v0, La/hr60;

    .line 113
    .line 114
    iget v7, v0, La/hr60;->j:I

    .line 115
    .line 116
    and-int v8, v7, v5

    .line 117
    .line 118
    if-eqz v8, :cond_4

    .line 119
    .line 120
    sub-int/2addr v7, v5

    .line 121
    iput v7, v0, La/hr60;->j:I

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    new-instance v0, La/hr60;

    .line 125
    .line 126
    invoke-direct {v0, p0, p2}, La/hr60;-><init>(La/ir60;La/yje;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    iget-object p0, v0, La/hr60;->i:Ljava/lang/Object;

    .line 130
    .line 131
    sget-object p2, La/wne;->a:La/wne;

    .line 132
    .line 133
    iget v5, v0, La/hr60;->j:I

    .line 134
    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    if-ne v5, v6, :cond_5

    .line 138
    .line 139
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object p0, p1

    .line 151
    check-cast p0, Lkotlin/Pair;

    .line 152
    .line 153
    iget-object v3, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v3, La/pat;

    .line 156
    .line 157
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, La/pat;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    instance-of v3, v3, La/kat;

    .line 165
    .line 166
    if-nez v3, :cond_7

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    instance-of p0, p0, La/kat;

    .line 172
    .line 173
    if-nez p0, :cond_7

    .line 174
    .line 175
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    check-cast p0, La/w370;

    .line 180
    .line 181
    iget-boolean p0, p0, La/w370;->b:Z

    .line 182
    .line 183
    if-nez p0, :cond_7

    .line 184
    .line 185
    iput v6, v0, La/hr60;->j:I

    .line 186
    .line 187
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-ne p0, p2, :cond_7

    .line 192
    .line 193
    move-object v3, p2

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_5
    return-object v3

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
