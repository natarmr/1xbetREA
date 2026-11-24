.class public final La/n1i0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/p1i0;


# direct methods
.method public synthetic constructor <init>(La/p1i0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n1i0;->i:B

    iput-object p1, p0, La/n1i0;->k:La/p1i0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n1i0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/n1i0;->k:La/p1i0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/n1i0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/n1i0;-><init>(La/p1i0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/n1i0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/n1i0;-><init>(La/p1i0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n1i0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/n1i0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/n1i0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/n1i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/n1i0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/n1i0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/n1i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/n1i0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/n1i0;->k:La/p1i0;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/n1i0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/p1i0;->p:La/svu;

    .line 32
    .line 33
    iget-object p1, p1, La/svu;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/es;

    .line 36
    .line 37
    iget-object p1, p1, La/es;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/jh7;

    .line 40
    .line 41
    iget-object p1, p1, La/jh7;->a:La/qoj0;

    .line 42
    .line 43
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-boolean v4, p0, La/n1i0;->j:Z

    .line 48
    .line 49
    invoke-static {p1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    move-object v1, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/Set;

    .line 58
    .line 59
    iget-object p0, v3, La/p1i0;->u:La/ugf0;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/ugf0;->g0(Ljava/util/Set;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, v3, La/p1i0;->v:La/i1w0;

    .line 65
    .line 66
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, La/c8d;

    .line 71
    .line 72
    sget-object v1, La/y7d;->a:La/v7d;

    .line 73
    .line 74
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 75
    .line 76
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_1
    move-object v0, p1

    .line 85
    check-cast v0, La/paw;

    .line 86
    .line 87
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/oe50;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_2
    return-object v1

    .line 106
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 107
    .line 108
    iget-boolean v5, p0, La/n1i0;->j:Z

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    if-ne v5, v4, :cond_4

    .line 113
    .line 114
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object p1, v3, La/p1i0;->o:La/vzg0;

    .line 126
    .line 127
    const-string v1, "SELECTED_IDS_KEY"

    .line 128
    .line 129
    invoke-virtual {p1, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, [I

    .line 134
    .line 135
    if-eqz p1, :cond_6

    .line 136
    .line 137
    iget-object v1, v3, La/p1i0;->s:La/dpi0;

    .line 138
    .line 139
    invoke-static {p1}, La/tx3;->k0([I)Ljava/util/Set;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-boolean v4, p0, La/n1i0;->j:Z

    .line 144
    .line 145
    invoke-virtual {v1, p1, p0}, La/dpi0;->i(Ljava/util/Set;La/bnn0;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-ne p0, v0, :cond_6

    .line 150
    .line 151
    move-object v1, v0

    .line 152
    goto :goto_4

    .line 153
    :cond_6
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_4
    return-object v1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
