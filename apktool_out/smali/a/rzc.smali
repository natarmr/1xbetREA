.class public final La/rzc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/uzc;


# direct methods
.method public synthetic constructor <init>(La/uzc;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rzc;->i:B

    iput-object p1, p0, La/rzc;->l:La/uzc;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rzc;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rzc;->l:La/uzc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/rzc;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/rzc;-><init>(La/uzc;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/rzc;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/rzc;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/rzc;-><init>(La/uzc;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/rzc;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rzc;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rzc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rzc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rzc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hzb0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/rzc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rzc;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/rzc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rzc;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/rzc;->l:La/uzc;

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
    iget-object v0, p0, La/rzc;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/kmq;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/rzc;->j:Z

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
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object v4, p0, La/rzc;->k:Ljava/lang/Object;

    .line 40
    .line 41
    iput-boolean v3, p0, La/rzc;->j:Z

    .line 42
    .line 43
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v5, :cond_2

    .line 48
    .line 49
    move-object v4, v5

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v4

    .line 54
    :pswitch_0
    iget-object v0, p0, La/rzc;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/hzb0;

    .line 57
    .line 58
    sget-object v5, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v6, p0, La/rzc;->j:Z

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    if-ne v6, v3, :cond_3

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, La/qzc;

    .line 78
    .line 79
    invoke-direct {p1, v0}, La/qzc;-><init>(La/hzb0;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, v1, La/uzc;->a:La/q7d0;

    .line 83
    .line 84
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v2, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/yw9;

    .line 92
    .line 93
    const/16 v6, 0xf

    .line 94
    .line 95
    invoke-direct {v2, v1, p1, v6}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    iput-object v4, p0, La/rzc;->k:Ljava/lang/Object;

    .line 99
    .line 100
    iput-boolean v3, p0, La/rzc;->j:Z

    .line 101
    .line 102
    invoke-static {v0, v2, p0}, La/q7x;->t(La/hzb0;Lkotlin/jvm/functions/Function0;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v5, :cond_5

    .line 107
    .line 108
    move-object v4, v5

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    :goto_3
    return-object v4

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
