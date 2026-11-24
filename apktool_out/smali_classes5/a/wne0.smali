.class public final La/wne0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/one0;

.field public final synthetic k:La/xne0;


# direct methods
.method public constructor <init>(La/yje;La/one0;La/xne0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/wne0;->j:La/one0;

    .line 2
    .line 3
    iput-object p3, p0, La/wne0;->k:La/xne0;

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
    new-instance p1, La/wne0;

    .line 2
    .line 3
    iget-object v0, p0, La/wne0;->j:La/one0;

    .line 4
    .line 5
    iget-object p0, p0, La/wne0;->k:La/xne0;

    .line 6
    .line 7
    invoke-direct {p1, p2, v0, p0}, La/wne0;-><init>(La/yje;La/one0;La/xne0;)V

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
    invoke-virtual {p0, p1, p2}, La/wne0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wne0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wne0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/wne0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/wne0;->j:La/one0;

    .line 32
    .line 33
    iget-object p1, p1, La/one0;->b:La/une0;

    .line 34
    .line 35
    iget-wide v4, p1, La/une0;->b:D

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    cmpg-double v1, v4, v6

    .line 40
    .line 41
    iget-object v4, p0, La/wne0;->k:La/xne0;

    .line 42
    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    iput-byte v3, p0, La/wne0;->i:B

    .line 46
    .line 47
    const/4 p1, 0x5

    .line 48
    invoke-virtual {v4, p1, p0}, La/xne0;->w(ILa/bnn0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_4
    iget-object v1, v4, La/xne0;->k:La/qoj0;

    .line 59
    .line 60
    new-instance v4, La/yme0;

    .line 61
    .line 62
    new-instance v5, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 63
    .line 64
    const v6, 0x7f130162

    .line 65
    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    new-array v8, v7, [Ljava/lang/CharSequence;

    .line 69
    .line 70
    invoke-direct {v5, v6, v8}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 74
    .line 75
    iget-object p1, p1, La/une0;->a:Ljava/lang/String;

    .line 76
    .line 77
    new-array v3, v3, [Ljava/lang/CharSequence;

    .line 78
    .line 79
    aput-object p1, v3, v7

    .line 80
    .line 81
    const p1, 0x7f130d4f

    .line 82
    .line 83
    .line 84
    invoke-direct {v6, p1, v3}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    move p1, v7

    .line 88
    new-instance v7, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 89
    .line 90
    const v3, 0x7f130151

    .line 91
    .line 92
    .line 93
    new-array v8, p1, [Ljava/lang/CharSequence;

    .line 94
    .line 95
    invoke-direct {v7, v3, v8}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    new-instance v8, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 99
    .line 100
    const v3, 0x7f13032f

    .line 101
    .line 102
    .line 103
    new-array p1, p1, [Ljava/lang/CharSequence;

    .line 104
    .line 105
    invoke-direct {v8, v3, p1}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    const-string v9, "approveMoveMoney"

    .line 109
    .line 110
    invoke-direct/range {v4 .. v9}, La/yme0;-><init>(Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-byte v2, p0, La/wne0;->i:B

    .line 114
    .line 115
    invoke-virtual {v1, v4, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-ne p0, v0, :cond_5

    .line 120
    .line 121
    :goto_1
    return-object v0

    .line 122
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0
.end method
