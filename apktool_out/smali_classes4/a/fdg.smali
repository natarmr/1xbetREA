.class public final La/fdg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/gdg;


# direct methods
.method public constructor <init>(La/gdg;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fdg;->i:La/gdg;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/fdg;

    .line 2
    .line 3
    iget-object p0, p0, La/fdg;->i:La/gdg;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/fdg;-><init>(La/gdg;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, La/yje;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/fdg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/fdg;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/fdg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/fdg;->i:La/gdg;

    .line 7
    .line 8
    invoke-virtual {p0}, La/gdg;->w()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, La/gdg;->x:La/c4m0;

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-ne p1, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, La/gdg;->g:La/lsn;

    .line 26
    .line 27
    iget-object p1, p1, La/lsn;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, La/udg;

    .line 30
    .line 31
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 32
    .line 33
    iget-object p1, p1, La/tcg;->i:La/qoj0;

    .line 34
    .line 35
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v3, La/adg;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v3, p0, v2, v4}, La/adg;-><init>(La/gdg;La/yje;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/fnq;

    .line 46
    .line 47
    invoke-direct {v4, p1, v3, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {v4, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/gdg;->x:La/c4m0;

    .line 59
    .line 60
    :goto_0
    iget-object p1, p0, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 61
    .line 62
    iget p1, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 63
    .line 64
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 65
    .line 66
    iget-byte v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 67
    .line 68
    if-ne p1, v3, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, La/gdg;->h:La/fvt;

    .line 71
    .line 72
    iget-object p1, p1, La/fvt;->a:La/udg;

    .line 73
    .line 74
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 75
    .line 76
    iget-object p1, p1, La/tcg;->j:La/qoj0;

    .line 77
    .line 78
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v3, La/adg;

    .line 83
    .line 84
    invoke-direct {v3, p0, v2, v1}, La/adg;-><init>(La/gdg;La/yje;B)V

    .line 85
    .line 86
    .line 87
    new-instance v1, La/fnq;

    .line 88
    .line 89
    invoke-direct {v1, p1, v3, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v1, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, La/gdg;->x:La/c4m0;

    .line 101
    .line 102
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method
