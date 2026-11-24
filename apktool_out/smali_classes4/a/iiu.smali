.class public final La/iiu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/ywq0;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/ywq0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/iiu;->i:B

    iput-object p3, p0, La/iiu;->m:La/ywq0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/iiu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/iiu;->m:La/ywq0;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p3, La/yje;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/iiu;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p3, p0}, La/iiu;-><init>(BLa/yje;La/ywq0;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/iiu;->k:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/iiu;->l:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/iiu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/iiu;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1, p3, p0}, La/iiu;-><init>(BLa/yje;La/ywq0;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, La/iiu;->k:La/kmq;

    .line 36
    .line 37
    iput-object p2, v0, La/iiu;->l:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, La/iiu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/iiu;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/iiu;->m:La/ywq0;

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
    iget-object v0, v2, La/ywq0;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/n0o0;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/iiu;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, p0, La/iiu;->k:La/kmq;

    .line 36
    .line 37
    iget-object v1, p0, La/iiu;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    iget-object v2, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/v7i;

    .line 44
    .line 45
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, La/sff0;

    .line 50
    .line 51
    iget-boolean v6, v6, La/sff0;->J1:Z

    .line 52
    .line 53
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/sff0;

    .line 58
    .line 59
    iget-boolean v0, v0, La/sff0;->O1:Z

    .line 60
    .line 61
    invoke-virtual {v2, v1, v6, v0}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v4, p0, La/iiu;->k:La/kmq;

    .line 66
    .line 67
    iput-object v4, p0, La/iiu;->l:Ljava/lang/Object;

    .line 68
    .line 69
    iput-boolean v3, p0, La/iiu;->j:Z

    .line 70
    .line 71
    invoke-static {p1, v0, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v5, :cond_2

    .line 76
    .line 77
    move-object v4, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    return-object v4

    .line 82
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v5, p0, La/iiu;->j:Z

    .line 85
    .line 86
    if-eqz v5, :cond_4

    .line 87
    .line 88
    if-ne v5, v3, :cond_3

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, La/iiu;->k:La/kmq;

    .line 102
    .line 103
    iget-object v1, p0, La/iiu;->l:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, La/gmq;

    .line 106
    .line 107
    new-instance v5, La/iiu;

    .line 108
    .line 109
    invoke-direct {v5, v3, v4, v2}, La/iiu;-><init>(BLa/yje;La/ywq0;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v5}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v4, p0, La/iiu;->k:La/kmq;

    .line 117
    .line 118
    iput-object v4, p0, La/iiu;->l:Ljava/lang/Object;

    .line 119
    .line 120
    iput-boolean v3, p0, La/iiu;->j:Z

    .line 121
    .line 122
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_5

    .line 127
    .line 128
    move-object v4, v0

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_3
    return-object v4

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
