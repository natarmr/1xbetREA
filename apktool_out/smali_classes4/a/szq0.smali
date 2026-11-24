.class public final La/szq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cyu;

.field public final synthetic l:La/jo20;


# direct methods
.method public synthetic constructor <init>(La/cyu;La/jo20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/szq0;->i:B

    iput-object p1, p0, La/szq0;->k:La/cyu;

    iput-object p2, p0, La/szq0;->l:La/jo20;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/szq0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/szq0;->l:La/jo20;

    .line 4
    .line 5
    iget-object p0, p0, La/szq0;->k:La/cyu;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/szq0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, La/szq0;-><init>(La/cyu;La/jo20;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/szq0;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p0, v1, p1, v2}, La/szq0;-><init>(La/cyu;La/jo20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/szq0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/szq0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/szq0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/szq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/szq0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/szq0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/szq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/szq0;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object v2, p0, La/szq0;->l:La/jo20;

    .line 6
    .line 7
    iget-object v3, p0, La/szq0;->k:La/cyu;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/szq0;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v3, La/cyu;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/roi0;

    .line 38
    .line 39
    iput-boolean v6, p0, La/szq0;->j:Z

    .line 40
    .line 41
    invoke-virtual {p1, v2, p0}, La/roi0;->e(La/jo20;La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-direct {v4, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/abh;

    .line 75
    .line 76
    invoke-static {p1}, La/jeb;->V(La/abh;)La/xah;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :goto_2
    return-object v4

    .line 85
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    iget-boolean v7, p0, La/szq0;->j:Z

    .line 88
    .line 89
    if-eqz v7, :cond_5

    .line 90
    .line 91
    if-ne v7, v6, :cond_4

    .line 92
    .line 93
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v3, La/cyu;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, La/roi0;

    .line 107
    .line 108
    iput-boolean v6, p0, La/szq0;->j:Z

    .line 109
    .line 110
    invoke-virtual {p1, v2, p0}, La/roi0;->e(La/jo20;La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v0, :cond_6

    .line 115
    .line 116
    move-object v4, v0

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Iterable;

    .line 119
    .line 120
    new-instance v4, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-direct {v4, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, La/abh;

    .line 144
    .line 145
    invoke-static {p1}, La/jeb;->V(La/abh;)La/xah;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    :goto_5
    return-object v4

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
