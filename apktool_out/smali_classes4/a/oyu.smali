.class public final La/oyu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oyu;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/oyu;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/oyu;->j:Ljava/util/List;

    .line 9
    .line 10
    iget-object v2, p0, La/oyu;->k:Ljava/util/List;

    .line 11
    .line 12
    iget-object p0, p0, La/oyu;->l:Ljava/util/List;

    .line 13
    .line 14
    sget-object v3, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/sr20;

    .line 35
    .line 36
    iget-object v3, v3, La/sr20;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {v3}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {p1, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/vr20;

    .line 70
    .line 71
    iget-wide v3, v1, La/vr20;->c:J

    .line 72
    .line 73
    invoke-static {p0, v1, v3, v4}, La/r8x;->Q(Ljava/util/List;La/vr20;J)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iget-wide v4, v1, La/vr20;->c:J

    .line 78
    .line 79
    invoke-static {v2, v1, v4, v5}, La/r8x;->Q(Ljava/util/List;La/vr20;J)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    sget-object v5, La/uyc;->c:La/uyc;

    .line 84
    .line 85
    invoke-static {v1, v3, v4, v5}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    return-object v0

    .line 94
    :pswitch_0
    iget-object v0, p0, La/oyu;->j:Ljava/util/List;

    .line 95
    .line 96
    iget-object v2, p0, La/oyu;->k:Ljava/util/List;

    .line 97
    .line 98
    iget-object p0, p0, La/oyu;->l:Ljava/util/List;

    .line 99
    .line 100
    sget-object v3, La/wne;->a:La/wne;

    .line 101
    .line 102
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, La/mmp0;

    .line 129
    .line 130
    iget-wide v3, v1, La/mmp0;->a:J

    .line 131
    .line 132
    invoke-static {v3, v4, v2}, La/axq;->y(JLjava/util/List;)Z

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    iget-wide v3, v1, La/mmp0;->a:J

    .line 137
    .line 138
    invoke-static {v3, v4, p0}, La/axq;->y(JLjava/util/List;)Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    new-instance v5, La/nmp0;

    .line 143
    .line 144
    iget-wide v6, v1, La/mmp0;->a:J

    .line 145
    .line 146
    iget-object v8, v1, La/mmp0;->b:Ljava/lang/String;

    .line 147
    .line 148
    iget-wide v9, v1, La/mmp0;->c:J

    .line 149
    .line 150
    iget-object v11, v1, La/mmp0;->d:Ljava/util/List;

    .line 151
    .line 152
    invoke-direct/range {v5 .. v13}, La/nmp0;-><init>(JLjava/lang/String;JLjava/util/List;ZZ)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    return-object p1

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/oyu;->i:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    .line 6
    check-cast p2, Ljava/util/List;

    .line 7
    .line 8
    check-cast p3, Ljava/util/List;

    .line 9
    .line 10
    check-cast p4, La/yje;

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, La/oyu;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {p0, v0, p4, v1}, La/oyu;-><init>(ILa/yje;B)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/oyu;->j:Ljava/util/List;

    .line 22
    .line 23
    iput-object p2, p0, La/oyu;->k:Ljava/util/List;

    .line 24
    .line 25
    iput-object p3, p0, La/oyu;->l:Ljava/util/List;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/oyu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    new-instance p0, La/oyu;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p0, v0, p4, v1}, La/oyu;-><init>(ILa/yje;B)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/oyu;->j:Ljava/util/List;

    .line 41
    .line 42
    iput-object p2, p0, La/oyu;->k:Ljava/util/List;

    .line 43
    .line 44
    iput-object p3, p0, La/oyu;->l:Ljava/util/List;

    .line 45
    .line 46
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/oyu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
