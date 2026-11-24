.class public final La/owu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Throwable;

.field public final synthetic m:La/yhi;


# direct methods
.method public synthetic constructor <init>(La/yhi;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/owu;->i:B

    iput-object p1, p0, La/owu;->m:La/yhi;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/owu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/owu;->m:La/yhi;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/owu;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, p3, v1}, La/owu;-><init>(La/yhi;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/owu;->k:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/owu;->l:Ljava/lang/Throwable;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/owu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/owu;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, p3, v1}, La/owu;-><init>(La/yhi;La/yje;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/owu;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/owu;->l:Ljava/lang/Throwable;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/owu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/owu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/owu;->m:La/yhi;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/owu;->k:La/kmq;

    .line 13
    .line 14
    iget-object v5, p0, La/owu;->l:Ljava/lang/Throwable;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/owu;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v5}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_4

    .line 40
    .line 41
    iget-object p1, v1, La/yhi;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/lsn;

    .line 44
    .line 45
    iget-object p1, p1, La/lsn;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, La/nvu;

    .line 48
    .line 49
    iget-object p1, p1, La/nvu;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, La/g8n0;

    .line 52
    .line 53
    iget-object p1, p1, La/g8n0;->b:La/ir30;

    .line 54
    .line 55
    invoke-virtual {p1}, La/ir30;->b()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    sget-object p1, La/iun;->a:La/iun;

    .line 64
    .line 65
    :cond_2
    iput-object v4, p0, La/owu;->k:La/kmq;

    .line 66
    .line 67
    iput-object v4, p0, La/owu;->l:Ljava/lang/Throwable;

    .line 68
    .line 69
    iput-boolean v3, p0, La/owu;->j:Z

    .line 70
    .line 71
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v6, :cond_3

    .line 76
    .line 77
    move-object v4, v6

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    return-object v4

    .line 82
    :cond_4
    throw v5

    .line 83
    :pswitch_0
    iget-object v0, p0, La/owu;->k:La/kmq;

    .line 84
    .line 85
    iget-object v5, p0, La/owu;->l:Ljava/lang/Throwable;

    .line 86
    .line 87
    sget-object v6, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-boolean v7, p0, La/owu;->j:Z

    .line 90
    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    if-ne v7, v3, :cond_5

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v5}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_9

    .line 111
    .line 112
    iget-object p1, v1, La/yhi;->h:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, La/svt;

    .line 115
    .line 116
    iget-object p1, p1, La/svt;->a:La/nvu;

    .line 117
    .line 118
    iget-object p1, p1, La/nvu;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, La/g8n0;

    .line 121
    .line 122
    iget-object p1, p1, La/g8n0;->c:La/ir30;

    .line 123
    .line 124
    invoke-virtual {p1}, La/ir30;->b()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    if-nez p1, :cond_7

    .line 131
    .line 132
    sget-object p1, La/iun;->a:La/iun;

    .line 133
    .line 134
    :cond_7
    iput-object v4, p0, La/owu;->k:La/kmq;

    .line 135
    .line 136
    iput-object v4, p0, La/owu;->l:Ljava/lang/Throwable;

    .line 137
    .line 138
    iput-boolean v3, p0, La/owu;->j:Z

    .line 139
    .line 140
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-ne p0, v6, :cond_8

    .line 145
    .line 146
    move-object v4, v6

    .line 147
    goto :goto_3

    .line 148
    :cond_8
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_3
    return-object v4

    .line 151
    :cond_9
    throw v5

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
