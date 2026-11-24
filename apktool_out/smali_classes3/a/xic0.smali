.class public final synthetic La/xic0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;
.implements La/fer;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hjc0;


# direct methods
.method public synthetic constructor <init>(La/hjc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xic0;->a:B

    iput-object p1, p0, La/xic0;->b:La/hjc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/xic0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xic0;->b:La/hjc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/pl5;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/hjc0;->A(La/pl5;La/yje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, La/wne;->a:La/wne;

    .line 15
    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    :goto_0
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget-object p2, p0, La/hjc0;->j:La/p7m0;

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, La/zic0;

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    iget v1, v0, La/zic0;->b:I

    .line 40
    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    xor-int/lit8 v4, v3, 0x1

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v5, 0x2

    .line 50
    invoke-static/range {v0 .. v5}, La/zic0;->a(La/zic0;ZIZZI)La/zic0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p2, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, La/hjc0;->z()V

    .line 63
    .line 64
    .line 65
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_1
    check-cast p1, La/i16;

    .line 69
    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    instance-of p2, p1, La/w06;

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    if-eqz p2, :cond_5

    .line 77
    .line 78
    check-cast p1, La/w06;

    .line 79
    .line 80
    iget-boolean p1, p1, La/w06;->a:Z

    .line 81
    .line 82
    iget-object p0, p0, La/hjc0;->l:La/p7m0;

    .line 83
    .line 84
    invoke-static {p1, p0, v0}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    instance-of p2, p1, La/a16;

    .line 89
    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    check-cast p1, La/a16;

    .line 93
    .line 94
    iget-object p1, p1, La/a16;->a:La/le8;

    .line 95
    .line 96
    iget p1, p1, La/le8;->a:I

    .line 97
    .line 98
    invoke-virtual {p0, p1}, La/hjc0;->y(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    instance-of p2, p1, La/c16;

    .line 103
    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0}, La/hjc0;->x()V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    instance-of p1, p1, La/g16;

    .line 111
    .line 112
    if-eqz p1, :cond_8

    .line 113
    .line 114
    iget-object p1, p0, La/hjc0;->k:La/p7m0;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    sget-object p2, La/ajc0;->a:La/ajc0;

    .line 120
    .line 121
    invoke-virtual {p1, v0, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, La/hjc0;->f:La/m1e;

    .line 125
    .line 126
    invoke-interface {p1}, La/m1e;->c()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0}, La/hjc0;->z()V

    .line 133
    .line 134
    .line 135
    :cond_8
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()La/wdr;
    .locals 10

    .line 1
    iget-byte v0, p0, La/xic0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/rer;

    .line 7
    .line 8
    const-string v6, "updateRotationData(Lorg/xplatform/bonus_games/impl/core/domain/models/BalanceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    iget-object v3, p0, La/xic0;->b:La/hjc0;

    .line 13
    .line 14
    const-class v4, La/hjc0;

    .line 15
    .line 16
    const-string v5, "updateRotationData"

    .line 17
    .line 18
    invoke-direct/range {v1 .. v7}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    new-instance v2, La/xo;

    .line 23
    .line 24
    const-string v7, "observeConnectionState(Z)V"

    .line 25
    .line 26
    const/4 v8, 0x4

    .line 27
    const/4 v3, 0x2

    .line 28
    iget-object v4, p0, La/xic0;->b:La/hjc0;

    .line 29
    .line 30
    const-class v5, La/hjc0;

    .line 31
    .line 32
    const-string v6, "observeConnectionState"

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_1
    new-instance v3, La/xo;

    .line 39
    .line 40
    const-string v8, "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V"

    .line 41
    .line 42
    const/4 v9, 0x4

    .line 43
    const/4 v4, 0x2

    .line 44
    iget-object v5, p0, La/xic0;->b:La/hjc0;

    .line 45
    .line 46
    const-class v6, La/hjc0;

    .line 47
    .line 48
    const-string v7, "handleCommand"

    .line 49
    .line 50
    invoke-direct/range {v3 .. v9}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-byte v0, p0, La/xic0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/kmq;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of v0, p1, La/fer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p1, La/fer;

    .line 20
    .line 21
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :cond_0
    return v1

    .line 30
    :pswitch_0
    instance-of v0, p1, La/kmq;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    instance-of v0, p1, La/fer;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p1, La/fer;

    .line 43
    .line 44
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_1
    return v1

    .line 53
    :pswitch_1
    instance-of v0, p1, La/kmq;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    instance-of v0, p1, La/fer;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p1, La/fer;

    .line 66
    .line 67
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    :cond_2
    return v1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/xic0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :pswitch_1
    invoke-virtual {p0}, La/xic0;->b()La/wdr;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
