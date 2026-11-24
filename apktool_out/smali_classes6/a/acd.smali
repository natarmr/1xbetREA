.class public final La/acd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/pl7;

.field public final synthetic k:La/w2d;

.field public final synthetic l:La/xcz;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pl7;La/w2d;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/acd;->i:B

    iput-object p1, p0, La/acd;->j:La/pl7;

    iput-object p2, p0, La/acd;->k:La/w2d;

    iput-object p3, p0, La/acd;->l:La/xcz;

    iput-object p4, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/acd;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/acd;

    .line 7
    .line 8
    iget-object v4, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 v6, 0x3

    .line 11
    iget-object v1, p0, La/acd;->j:La/pl7;

    .line 12
    .line 13
    iget-object v2, p0, La/acd;->k:La/w2d;

    .line 14
    .line 15
    iget-object v3, p0, La/acd;->l:La/xcz;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/acd;-><init>(La/pl7;La/w2d;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v1, La/acd;

    .line 24
    .line 25
    iget-object v5, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    iget-object v2, p0, La/acd;->j:La/pl7;

    .line 29
    .line 30
    iget-object v3, p0, La/acd;->k:La/w2d;

    .line 31
    .line 32
    iget-object v4, p0, La/acd;->l:La/xcz;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v7}, La/acd;-><init>(La/pl7;La/w2d;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    move-object v6, p2

    .line 39
    new-instance v1, La/acd;

    .line 40
    .line 41
    iget-object v5, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    iget-object v2, p0, La/acd;->j:La/pl7;

    .line 45
    .line 46
    iget-object v3, p0, La/acd;->k:La/w2d;

    .line 47
    .line 48
    iget-object v4, p0, La/acd;->l:La/xcz;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v7}, La/acd;-><init>(La/pl7;La/w2d;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_2
    move-object v6, p2

    .line 55
    new-instance v1, La/acd;

    .line 56
    .line 57
    iget-object v5, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    iget-object v2, p0, La/acd;->j:La/pl7;

    .line 61
    .line 62
    iget-object v3, p0, La/acd;->k:La/w2d;

    .line 63
    .line 64
    iget-object v4, p0, La/acd;->l:La/xcz;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v7}, La/acd;-><init>(La/pl7;La/w2d;La/xcz;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/acd;->i:B

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
    invoke-virtual {p0, p1, p2}, La/acd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/acd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/acd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/acd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/acd;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/acd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/acd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/acd;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/acd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/acd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/acd;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/acd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/acd;->i:B

    .line 2
    .line 3
    sget-object v1, La/gj7;->a:La/gj7;

    .line 4
    .line 5
    iget-object v2, p0, La/acd;->m:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/acd;->l:La/xcz;

    .line 9
    .line 10
    const/high16 v5, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object v6, p0, La/acd;->k:La/w2d;

    .line 13
    .line 14
    iget-object p0, p0, La/acd;->j:La/pl7;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, La/pl7;->e()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    iget-object p0, v6, La/w2d;->a:La/x2d;

    .line 31
    .line 32
    invoke-virtual {p0, v5}, La/x2d;->b(F)V

    .line 33
    .line 34
    .line 35
    sget-object p0, La/xcz;->y:La/v0h0;

    .line 36
    .line 37
    invoke-virtual {v4, v3, v3}, La/xcz;->k(II)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, La/pl7;->e()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    iget-object p0, v6, La/w2d;->a:La/x2d;

    .line 58
    .line 59
    invoke-virtual {p0, v5}, La/x2d;->b(F)V

    .line 60
    .line 61
    .line 62
    sget-object p0, La/xcz;->y:La/v0h0;

    .line 63
    .line 64
    invoke-virtual {v4, v3, v3}, La/xcz;->k(II)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0}, La/pl7;->e()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_2

    .line 83
    .line 84
    iget-object p0, v6, La/w2d;->a:La/x2d;

    .line 85
    .line 86
    invoke-virtual {p0, v5}, La/x2d;->b(F)V

    .line 87
    .line 88
    .line 89
    sget-object p0, La/xcz;->y:La/v0h0;

    .line 90
    .line 91
    invoke-virtual {v4, v3, v3}, La/xcz;->k(II)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 101
    .line 102
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p0}, La/pl7;->e()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    iget-object p0, v6, La/w2d;->a:La/x2d;

    .line 112
    .line 113
    invoke-virtual {p0, v5}, La/x2d;->b(F)V

    .line 114
    .line 115
    .line 116
    sget-object p0, La/xcz;->y:La/v0h0;

    .line 117
    .line 118
    invoke-virtual {v4, v3, v3}, La/xcz;->k(II)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
