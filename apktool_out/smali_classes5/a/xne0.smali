.class public final La/xne0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

.field public final c:La/hnu;

.field public final d:La/s5k;

.field public final e:La/abu;

.field public final f:La/rne0;

.field public final g:La/pzu;

.field public final h:La/duj;

.field public final i:La/zpu;

.field public final j:La/p7m0;

.field public final k:La/qoj0;


# direct methods
.method public constructor <init>(Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;La/hnu;La/s5k;La/abu;La/rne0;La/pzu;La/duj;La/zpu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xne0;->b:Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

    .line 5
    .line 6
    iput-object p2, p0, La/xne0;->c:La/hnu;

    .line 7
    .line 8
    iput-object p3, p0, La/xne0;->d:La/s5k;

    .line 9
    .line 10
    iput-object p4, p0, La/xne0;->e:La/abu;

    .line 11
    .line 12
    iput-object p5, p0, La/xne0;->f:La/rne0;

    .line 13
    .line 14
    iput-object p6, p0, La/xne0;->g:La/pzu;

    .line 15
    .line 16
    iput-object p7, p0, La/xne0;->h:La/duj;

    .line 17
    .line 18
    iput-object p8, p0, La/xne0;->i:La/zpu;

    .line 19
    .line 20
    sget-object p1, La/pne0;->a:La/pne0;

    .line 21
    .line 22
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/xne0;->j:La/p7m0;

    .line 27
    .line 28
    invoke-static {}, La/ckb;->F()La/qoj0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/xne0;->k:La/qoj0;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1}, La/xne0;->x(Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final w(ILa/bnn0;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const v1, 0x7f130e5d

    .line 3
    .line 4
    .line 5
    const v2, 0x7f1307bb

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/xne0;->k:La/qoj0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, La/yme0;

    .line 20
    .line 21
    new-instance v0, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 22
    .line 23
    new-array v4, v3, [Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-direct {v0, v2, v4}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 29
    .line 30
    const v4, 0x7f130e2d

    .line 31
    .line 32
    .line 33
    new-array v5, v3, [Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-direct {v2, v4, v5}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    new-instance v4, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 39
    .line 40
    new-array v3, v3, [Ljava/lang/CharSequence;

    .line 41
    .line 42
    invoke-direct {v4, v1, v3}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0, v2, v4}, La/yme0;-><init>(Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, La/wne;->a:La/wne;

    .line 53
    .line 54
    if-ne p0, p1, :cond_1

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_2
    new-instance p1, La/yme0;

    .line 61
    .line 62
    new-instance v0, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 63
    .line 64
    new-array v4, v3, [Ljava/lang/CharSequence;

    .line 65
    .line 66
    invoke-direct {v0, v2, v4}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    new-instance v2, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 70
    .line 71
    const v4, 0x7f131739

    .line 72
    .line 73
    .line 74
    new-array v5, v3, [Ljava/lang/CharSequence;

    .line 75
    .line 76
    invoke-direct {v2, v4, v5}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 80
    .line 81
    new-array v3, v3, [Ljava/lang/CharSequence;

    .line 82
    .line 83
    invoke-direct {v4, v1, v3}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0, v2, v4}, La/yme0;-><init>(Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;Lorg/xplatform/ui_core/resources/UiText$ByRes;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object p1, La/wne;->a:La/wne;

    .line 94
    .line 95
    if-ne p0, p1, :cond_3

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method

.method public final x(Z)V
    .locals 9

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/d8e0;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    const/16 v8, 0xc

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, La/xne0;->h:La/duj;

    .line 12
    .line 13
    const-class v4, La/duj;

    .line 14
    .line 15
    const-string v5, "handleError"

    .line 16
    .line 17
    const-string v6, "handleError(Ljava/lang/Throwable;)V"

    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, La/d8e0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 20
    .line 21
    .line 22
    new-instance v4, La/lv;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/16 v3, 0xd

    .line 26
    .line 27
    invoke-direct {v4, p0, p1, v2, v3}, La/lv;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v5, 0xe

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    return-void
.end method
