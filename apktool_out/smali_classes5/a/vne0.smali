.class public final La/vne0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/xne0;

.field public final synthetic k:La/one0;


# direct methods
.method public constructor <init>(La/yje;La/one0;La/xne0;)V
    .locals 0

    .line 1
    iput-object p3, p0, La/vne0;->j:La/xne0;

    .line 2
    .line 3
    iput-object p2, p0, La/vne0;->k:La/one0;

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/vne0;

    .line 2
    .line 3
    iget-object v0, p0, La/vne0;->j:La/xne0;

    .line 4
    .line 5
    iget-object p0, p0, La/vne0;->k:La/one0;

    .line 6
    .line 7
    invoke-direct {p1, p2, p0, v0}, La/vne0;-><init>(La/yje;La/one0;La/xne0;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/vne0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vne0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vne0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/vne0;->k:La/one0;

    .line 2
    .line 3
    iget-object v0, v0, La/one0;->b:La/une0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/vne0;->i:B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, La/vne0;->j:La/xne0;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v6, La/xne0;->j:La/p7m0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v2, La/pne0;->a:La/pne0;

    .line 43
    .line 44
    invoke-virtual {p1, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object p1, v6, La/xne0;->d:La/s5k;

    .line 48
    .line 49
    iget-wide v2, v0, La/une0;->b:D

    .line 50
    .line 51
    iput-byte v5, p0, La/vne0;->i:B

    .line 52
    .line 53
    iget-object p1, p1, La/s5k;->a:La/z220;

    .line 54
    .line 55
    invoke-virtual {p1, v2, v3, p0}, La/z220;->G(DLa/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    :goto_0
    if-ne p1, v1, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    :goto_1
    iget-object p1, v6, La/xne0;->k:La/qoj0;

    .line 68
    .line 69
    new-instance v2, La/yme0;

    .line 70
    .line 71
    new-instance v3, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 72
    .line 73
    const v7, 0x7f130371

    .line 74
    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    new-array v9, v8, [Ljava/lang/CharSequence;

    .line 78
    .line 79
    invoke-direct {v3, v7, v9}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    new-instance v7, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 83
    .line 84
    iget-object v0, v0, La/une0;->a:Ljava/lang/String;

    .line 85
    .line 86
    new-array v9, v5, [Ljava/lang/CharSequence;

    .line 87
    .line 88
    aput-object v0, v9, v8

    .line 89
    .line 90
    const v0, 0x7f130d50

    .line 91
    .line 92
    .line 93
    invoke-direct {v7, v0, v9}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 97
    .line 98
    const v9, 0x7f130e5d

    .line 99
    .line 100
    .line 101
    new-array v8, v8, [Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-direct {v0, v9, v8}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, v3, v7, v0}, La/yme0;-><init>(Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;)V

    .line 107
    .line 108
    .line 109
    iput-byte v4, p0, La/vne0;->i:B

    .line 110
    .line 111
    invoke-virtual {p1, v2, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v1, :cond_5

    .line 116
    .line 117
    :goto_2
    return-object v1

    .line 118
    :cond_5
    :goto_3
    invoke-virtual {v6, v5}, La/xne0;->x(Z)V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0
.end method
