.class public final La/wuh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/zuh0;


# direct methods
.method public synthetic constructor <init>(La/zuh0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wuh0;->i:B

    iput-object p1, p0, La/wuh0;->l:La/zuh0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wuh0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wuh0;->l:La/zuh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wuh0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wuh0;-><init>(La/zuh0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wuh0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wuh0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wuh0;-><init>(La/zuh0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wuh0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

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
    iget-byte v0, p0, La/wuh0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/e7a;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wuh0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wuh0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/wuh0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/wuh0;->l:La/zuh0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/e7a;

    .line 16
    .line 17
    sget-object v6, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v7, p0, La/wuh0;->j:B

    .line 20
    .line 21
    if-eqz v7, :cond_2

    .line 22
    .line 23
    if-eq v7, v3, :cond_1

    .line 24
    .line 25
    if-ne v7, v4, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    instance-of p1, v0, La/d7a;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget-object p0, v2, La/zuh0;->E:La/ol60;

    .line 49
    .line 50
    new-instance p1, La/ouh0;

    .line 51
    .line 52
    check-cast v0, La/d7a;

    .line 53
    .line 54
    invoke-direct {p1, v0}, La/ouh0;-><init>(La/d7a;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    instance-of p1, v0, La/c7a;

    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    iget-object p1, v2, La/zuh0;->w:La/abu;

    .line 66
    .line 67
    check-cast v0, La/c7a;

    .line 68
    .line 69
    iget-object v0, v0, La/c7a;->a:La/ynb0;

    .line 70
    .line 71
    iput-object v5, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 72
    .line 73
    iput-byte v3, p0, La/wuh0;->j:B

    .line 74
    .line 75
    invoke-virtual {p1, v0, p0}, La/abu;->x(La/ynb0;La/bnn0;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v6, :cond_4

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    :goto_0
    iput-object v5, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 83
    .line 84
    iput-byte v4, p0, La/wuh0;->j:B

    .line 85
    .line 86
    const-wide/16 v0, 0xbb8

    .line 87
    .line 88
    invoke-static {v0, v1, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v6, :cond_5

    .line 93
    .line 94
    :goto_1
    move-object v5, v6

    .line 95
    goto :goto_4

    .line 96
    :cond_5
    :goto_2
    invoke-virtual {v2}, La/zuh0;->y()V

    .line 97
    .line 98
    .line 99
    iget-object p0, v2, La/zuh0;->F:La/p7m0;

    .line 100
    .line 101
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 113
    .line 114
    .line 115
    :goto_4
    return-object v5

    .line 116
    :pswitch_0
    iget-object v0, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, La/kmq;

    .line 119
    .line 120
    sget-object v6, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-byte v7, p0, La/wuh0;->j:B

    .line 123
    .line 124
    if-eqz v7, :cond_9

    .line 125
    .line 126
    if-eq v7, v3, :cond_8

    .line 127
    .line 128
    if-ne v7, v4, :cond_7

    .line 129
    .line 130
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, v2, La/zuh0;->c:La/phf0;

    .line 146
    .line 147
    iput-object v0, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 148
    .line 149
    iput-byte v3, p0, La/wuh0;->j:B

    .line 150
    .line 151
    invoke-virtual {p1, v3, p0}, La/phf0;->v(ZLa/zje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v6, :cond_a

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_a
    :goto_5
    check-cast p1, La/jph0;

    .line 159
    .line 160
    iput-object v5, p0, La/wuh0;->k:Ljava/lang/Object;

    .line 161
    .line 162
    iput-byte v4, p0, La/wuh0;->j:B

    .line 163
    .line 164
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-ne p0, v6, :cond_b

    .line 169
    .line 170
    :goto_6
    move-object v5, v6

    .line 171
    goto :goto_8

    .line 172
    :cond_b
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_8
    return-object v5

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
