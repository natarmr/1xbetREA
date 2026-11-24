.class public final La/mm70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/nm70;


# direct methods
.method public synthetic constructor <init>(La/nm70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mm70;->i:B

    iput-object p1, p0, La/mm70;->k:La/nm70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/mm70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mm70;->k:La/nm70;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mm70;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mm70;-><init>(La/nm70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mm70;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mm70;-><init>(La/nm70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mm70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mm70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mm70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mm70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mm70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mm70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mm70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/mm70;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/mm70;->k:La/nm70;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/mm70;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v2, La/nm70;->p:La/m1e;

    .line 32
    .line 33
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, v2, La/nm70;->u:La/p7m0;

    .line 38
    .line 39
    iget-object v5, v2, La/nm70;->v:La/p7m0;

    .line 40
    .line 41
    new-instance v6, La/p220;

    .line 42
    .line 43
    const/4 v7, 0x4

    .line 44
    const/4 v8, 0x2

    .line 45
    invoke-direct {v6, v7, v4, v8}, La/p220;-><init>(ILa/yje;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1, v5, v6}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, La/lh70;

    .line 53
    .line 54
    const/16 v4, 0xd

    .line 55
    .line 56
    invoke-direct {v1, v2, v4}, La/lh70;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    iput-boolean v3, p0, La/mm70;->j:Z

    .line 60
    .line 61
    invoke-virtual {p1, v1, p0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v0, :cond_2

    .line 66
    .line 67
    move-object v4, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    :goto_1
    return-object v4

    .line 72
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 73
    .line 74
    iget-boolean v5, p0, La/mm70;->j:Z

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    if-ne v5, v3, :cond_3

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, v2, La/nm70;->l:La/gni0;

    .line 92
    .line 93
    iget-object v1, v2, La/nm70;->j:La/nqt;

    .line 94
    .line 95
    invoke-virtual {v1}, La/nqt;->a()La/w05;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-boolean v3, p0, La/mm70;->j:Z

    .line 100
    .line 101
    invoke-virtual {p1, v1, p0}, La/gni0;->a(La/w05;La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v0, :cond_5

    .line 106
    .line 107
    move-object v4, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_3
    return-object v4

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
