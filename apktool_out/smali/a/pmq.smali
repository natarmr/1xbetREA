.class public final La/pmq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mie0;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/kmq;


# direct methods
.method public synthetic constructor <init>(La/mie0;La/xdr;La/kmq;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pmq;->a:B

    iput-object p1, p0, La/pmq;->b:La/mie0;

    iput-object p2, p0, La/pmq;->c:La/xdr;

    iput-object p3, p0, La/pmq;->d:La/kmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/pmq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/pmq;->d:La/kmq;

    .line 4
    .line 5
    iget-object v2, p0, La/pmq;->c:La/xdr;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    iget-object v7, p0, La/pmq;->b:La/mie0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of v0, p2, La/poq;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    check-cast v0, La/poq;

    .line 25
    .line 26
    iget v9, v0, La/poq;->l:I

    .line 27
    .line 28
    and-int v10, v9, v4

    .line 29
    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    sub-int/2addr v9, v4

    .line 33
    iput v9, v0, La/poq;->l:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, La/poq;

    .line 37
    .line 38
    invoke-direct {v0, p0, p2}, La/poq;-><init>(La/pmq;La/yje;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p0, v0, La/poq;->j:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object p2, La/wne;->a:La/wne;

    .line 44
    .line 45
    iget v4, v0, La/poq;->l:I

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    if-eq v4, v5, :cond_2

    .line 50
    .line 51
    if-ne v4, v6, :cond_1

    .line 52
    .line 53
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_2
    iget-object p1, v0, La/poq;->i:La/mie0;

    .line 62
    .line 63
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, v7, La/mie0;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v7, v0, La/poq;->i:La/mie0;

    .line 73
    .line 74
    iput v5, v0, La/poq;->l:I

    .line 75
    .line 76
    invoke-interface {v2, p0, p1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, p2, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object p1, v7

    .line 84
    :goto_1
    iput-object p0, p1, La/mie0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object p0, v7, La/mie0;->a:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v8, v0, La/poq;->i:La/mie0;

    .line 89
    .line 90
    iput v6, v0, La/poq;->l:I

    .line 91
    .line 92
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, p2, :cond_5

    .line 97
    .line 98
    :goto_2
    move-object v8, p2

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_4
    return-object v8

    .line 103
    :pswitch_0
    instance-of v0, p2, La/omq;

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    move-object v0, p2

    .line 108
    check-cast v0, La/omq;

    .line 109
    .line 110
    iget v9, v0, La/omq;->l:I

    .line 111
    .line 112
    and-int v10, v9, v4

    .line 113
    .line 114
    if-eqz v10, :cond_6

    .line 115
    .line 116
    sub-int/2addr v9, v4

    .line 117
    iput v9, v0, La/omq;->l:I

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_6
    new-instance v0, La/omq;

    .line 121
    .line 122
    invoke-direct {v0, p0, p2}, La/omq;-><init>(La/pmq;La/yje;)V

    .line 123
    .line 124
    .line 125
    :goto_5
    iget-object p0, v0, La/omq;->j:Ljava/lang/Object;

    .line 126
    .line 127
    sget-object p2, La/wne;->a:La/wne;

    .line 128
    .line 129
    iget v4, v0, La/omq;->l:I

    .line 130
    .line 131
    if-eqz v4, :cond_9

    .line 132
    .line 133
    if-eq v4, v5, :cond_8

    .line 134
    .line 135
    if-ne v4, v6, :cond_7

    .line 136
    .line 137
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_8
    iget-object p1, v0, La/omq;->i:La/mie0;

    .line 146
    .line 147
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object p0, v7, La/mie0;->a:Ljava/lang/Object;

    .line 155
    .line 156
    sget-object v3, La/lv00;->i:Ljava/lang/Object;

    .line 157
    .line 158
    if-ne p0, v3, :cond_b

    .line 159
    .line 160
    move-object p0, p1

    .line 161
    :cond_a
    move-object p1, v7

    .line 162
    goto :goto_6

    .line 163
    :cond_b
    iput-object v7, v0, La/omq;->i:La/mie0;

    .line 164
    .line 165
    iput v5, v0, La/omq;->l:I

    .line 166
    .line 167
    invoke-interface {v2, p0, p1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-ne p0, p2, :cond_a

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :goto_6
    iput-object p0, p1, La/mie0;->a:Ljava/lang/Object;

    .line 175
    .line 176
    iget-object p0, v7, La/mie0;->a:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v8, v0, La/omq;->i:La/mie0;

    .line 179
    .line 180
    iput v6, v0, La/omq;->l:I

    .line 181
    .line 182
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne p0, p2, :cond_c

    .line 187
    .line 188
    :goto_7
    move-object v8, p2

    .line 189
    goto :goto_9

    .line 190
    :cond_c
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_9
    return-object v8

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
