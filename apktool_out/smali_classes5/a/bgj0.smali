.class public final La/bgj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ngj0;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ngj0;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/bgj0;->i:B

    iput-object p1, p0, La/bgj0;->k:La/ngj0;

    iput-object p2, p0, La/bgj0;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/bgj0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/bgj0;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/bgj0;->k:La/ngj0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/bgj0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/bgj0;-><init>(La/ngj0;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/bgj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/bgj0;-><init>(La/ngj0;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bgj0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/bgj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bgj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bgj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/bgj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/bgj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/bgj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/bgj0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bgj0;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/bgj0;->k:La/ngj0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/bgj0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v2, La/ngj0;->p0:La/nv20;

    .line 34
    .line 35
    iget-object v2, v2, La/ngj0;->N:La/x4u;

    .line 36
    .line 37
    iget-object v2, v2, La/x4u;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/okt0;

    .line 40
    .line 41
    iget-object v2, v2, La/okt0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/btt0;

    .line 44
    .line 45
    iget-object v2, v2, La/btt0;->a:La/vwb0;

    .line 46
    .line 47
    const-string v3, "refresh_token"

    .line 48
    .line 49
    invoke-static {v2, v3}, La/vwb0;->d(La/vwb0;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-boolean v5, p0, La/bgj0;->j:Z

    .line 54
    .line 55
    invoke-virtual {p1, v1, v2, p0}, La/nv20;->e(Ljava/lang/String;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v0, :cond_2

    .line 60
    .line 61
    move-object v3, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_1
    return-object v3

    .line 66
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v6, p0, La/bgj0;->j:Z

    .line 69
    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    if-ne v6, v5, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v2, La/ngj0;->m0:La/bbw0;

    .line 86
    .line 87
    iput-boolean v5, p0, La/bgj0;->j:Z

    .line 88
    .line 89
    invoke-virtual {p1, v1, p0}, La/bbw0;->q(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_5

    .line 94
    .line 95
    move-object v3, v0

    .line 96
    goto :goto_5

    .line 97
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    sget p0, La/ngj0;->Y0:I

    .line 106
    .line 107
    iget-object p0, v2, La/ngj0;->B:La/i1w0;

    .line 108
    .line 109
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object v0, v2, La/ngj0;->i0:La/s9m0;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v0, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$TestSectionScreen;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    new-instance v1, La/e1w0;

    .line 128
    .line 129
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 130
    .line 131
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 132
    .line 133
    .line 134
    new-instance v0, La/c8d;

    .line 135
    .line 136
    sget-object v2, La/y7d;->a:La/v7d;

    .line 137
    .line 138
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    new-instance v1, La/w0w0;

    .line 146
    .line 147
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 148
    .line 149
    .line 150
    new-instance v0, La/c8d;

    .line 151
    .line 152
    sget-object v2, La/y7d;->a:La/v7d;

    .line 153
    .line 154
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_3
    const/4 v0, 0x0

    .line 161
    invoke-static {p0, p1, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_4
    move-object v0, p1

    .line 166
    check-cast v0, La/paw;

    .line 167
    .line 168
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/oe50;

    .line 179
    .line 180
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_5
    return-object v3

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
