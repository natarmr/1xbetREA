.class public final La/axk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/yhi;

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/yje;La/yhi;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/axk0;->i:B

    iput-object p2, p0, La/axk0;->m:La/yhi;

    iput-boolean p3, p0, La/axk0;->n:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/axk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/axk0;

    .line 11
    .line 12
    iget-boolean v1, p0, La/axk0;->n:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iget-object p0, p0, La/axk0;->m:La/yhi;

    .line 16
    .line 17
    invoke-direct {v0, p3, p0, v1, v2}, La/axk0;-><init>(La/yje;La/yhi;ZB)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/axk0;->k:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/axk0;->l:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/axk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/axk0;

    .line 32
    .line 33
    iget-boolean v1, p0, La/axk0;->n:Z

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iget-object p0, p0, La/axk0;->m:La/yhi;

    .line 37
    .line 38
    invoke-direct {v0, p3, p0, v1, v2}, La/axk0;-><init>(La/yje;La/yhi;ZB)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/axk0;->k:La/kmq;

    .line 42
    .line 43
    iput-object p2, v0, La/axk0;->l:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, La/axk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/axk0;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/axk0;->n:Z

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/axk0;->m:La/yhi;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/axk0;->k:La/kmq;

    .line 16
    .line 17
    iget-object v7, p0, La/axk0;->l:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-boolean v9, p0, La/axk0;->j:Z

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    if-ne v9, v3, :cond_0

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
    check-cast v7, Ljava/util/List;

    .line 39
    .line 40
    iget-object p1, v4, La/yhi;->q:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, La/v7i;

    .line 43
    .line 44
    iget-object v2, v4, La/yhi;->s:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, La/pru;

    .line 47
    .line 48
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 53
    .line 54
    invoke-virtual {p1, v7, v1, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, La/wwk0;

    .line 59
    .line 60
    const/4 v2, 0x4

    .line 61
    invoke-direct {v1, v4, v6, v2}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 62
    .line 63
    .line 64
    iput-object v6, p0, La/axk0;->k:La/kmq;

    .line 65
    .line 66
    iput-object v6, p0, La/axk0;->l:Ljava/lang/Object;

    .line 67
    .line 68
    iput-boolean v3, p0, La/axk0;->j:Z

    .line 69
    .line 70
    invoke-static {v0}, La/f7k;->J(La/kmq;)V

    .line 71
    .line 72
    .line 73
    new-instance v2, La/vnq;

    .line 74
    .line 75
    invoke-direct {v2, v0, v1, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v2, p0}, La/acu;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v8, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_0
    if-ne p0, v8, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_1
    if-ne p0, v8, :cond_4

    .line 93
    .line 94
    move-object v6, v8

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    :goto_3
    return-object v6

    .line 99
    :pswitch_0
    iget-object v0, p0, La/axk0;->k:La/kmq;

    .line 100
    .line 101
    iget-object v7, p0, La/axk0;->l:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object v8, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v9, p0, La/axk0;->j:Z

    .line 106
    .line 107
    if-eqz v9, :cond_6

    .line 108
    .line 109
    if-ne v9, v3, :cond_5

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    check-cast v7, Ljava/util/List;

    .line 123
    .line 124
    iget-object p1, v4, La/yhi;->r:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, La/v7i;

    .line 127
    .line 128
    iget-object v2, v4, La/yhi;->s:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, La/pru;

    .line 131
    .line 132
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 137
    .line 138
    invoke-virtual {p1, v7, v1, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance v1, La/wwk0;

    .line 143
    .line 144
    invoke-direct {v1, v4, v6, v5}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 145
    .line 146
    .line 147
    iput-object v6, p0, La/axk0;->k:La/kmq;

    .line 148
    .line 149
    iput-object v6, p0, La/axk0;->l:Ljava/lang/Object;

    .line 150
    .line 151
    iput-boolean v3, p0, La/axk0;->j:Z

    .line 152
    .line 153
    invoke-static {v0}, La/f7k;->J(La/kmq;)V

    .line 154
    .line 155
    .line 156
    new-instance v2, La/vnq;

    .line 157
    .line 158
    invoke-direct {v2, v0, v1, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v2, p0}, La/acu;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v8, :cond_7

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_4
    if-ne p0, v8, :cond_8

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_5
    if-ne p0, v8, :cond_9

    .line 176
    .line 177
    move-object v6, v8

    .line 178
    goto :goto_7

    .line 179
    :cond_9
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    :goto_7
    return-object v6

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
