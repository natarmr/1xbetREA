.class public final La/tr60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/bs60;


# direct methods
.method public synthetic constructor <init>(La/bs60;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tr60;->i:B

    iput-object p1, p0, La/tr60;->j:La/bs60;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/tr60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tr60;->j:La/bs60;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/tr60;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/tr60;-><init>(La/bs60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/tr60;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/tr60;-><init>(La/bs60;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/tr60;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/tr60;-><init>(La/bs60;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tr60;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tr60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tr60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tr60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/tr60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/tr60;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/tr60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lkotlin/Pair;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/tr60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/tr60;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/tr60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/tr60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tr60;->j:La/bs60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/bs60;->G:La/hnu;

    .line 14
    .line 15
    invoke-virtual {p1}, La/hnu;->b()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v0, p0, La/bs60;->I:La/b8u;

    .line 20
    .line 21
    invoke-virtual {v0}, La/b8u;->c()La/qg40;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, La/qg40;->a:I

    .line 26
    .line 27
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/w370;

    .line 32
    .line 33
    iget-object v1, v1, La/w370;->g:La/f3b;

    .line 34
    .line 35
    iget-object v1, v1, La/f3b;->c:La/a4x;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    sget-object v1, La/iun;->a:La/iun;

    .line 40
    .line 41
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, La/lxl;

    .line 67
    .line 68
    iget-wide v4, v3, La/lxl;->a:J

    .line 69
    .line 70
    long-to-int v4, v4

    .line 71
    if-ne v4, p1, :cond_1

    .line 72
    .line 73
    sget-object v4, La/uxl;->b:La/uxl;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    sget-object v4, La/uxl;->a:La/uxl;

    .line 77
    .line 78
    :goto_1
    invoke-static {v3, v4}, La/lxl;->a(La/lxl;La/uxl;)La/lxl;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    new-instance v1, La/al1;

    .line 87
    .line 88
    const/4 v3, 0x3

    .line 89
    invoke-direct {v1, v3, v0, p1, v2}, La/al1;-><init>(BIILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 99
    .line 100
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, La/bs60;->y:La/oeg0;

    .line 104
    .line 105
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v0, La/c8d;

    .line 114
    .line 115
    sget-object v1, La/y7d;->a:La/v7d;

    .line 116
    .line 117
    sget-object v2, La/o0w0;->a:La/o0w0;

    .line 118
    .line 119
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const/4 v0, 0x0

    .line 127
    invoke-virtual {p1, v0}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :goto_2
    move-object v0, p1

    .line 132
    check-cast v0, La/paw;

    .line 133
    .line 134
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, La/oe50;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 154
    .line 155
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, La/bs60;->M:La/ali;

    .line 159
    .line 160
    const/4 p1, 0x1

    .line 161
    invoke-virtual {p0, p1}, La/ali;->p(Z)La/ewt;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
