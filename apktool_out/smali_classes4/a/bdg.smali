.class public final La/bdg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public synthetic i:Ljava/lang/String;

.field public synthetic j:La/deg;

.field public final synthetic k:La/gdg;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/gdg;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bdg;->k:La/gdg;

    .line 2
    .line 3
    iput-object p2, p0, La/bdg;->l:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, La/deg;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/bdg;

    .line 8
    .line 9
    iget-object v1, p0, La/bdg;->k:La/gdg;

    .line 10
    .line 11
    iget-object p0, p0, La/bdg;->l:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p3}, La/bdg;-><init>(La/gdg;Ljava/lang/String;La/yje;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/bdg;->i:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, v0, La/bdg;->j:La/deg;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/bdg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/bdg;->k:La/gdg;

    .line 2
    .line 3
    iget-object v1, v0, La/gdg;->i:La/qc3;

    .line 4
    .line 5
    iget-object v2, p0, La/bdg;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, La/bdg;->j:La/deg;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    iput-object v2, v0, La/gdg;->s:Ljava/lang/String;

    .line 21
    .line 22
    :cond_0
    iget-object p1, v0, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 23
    .line 24
    iget p1, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 25
    .line 26
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 27
    .line 28
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 29
    .line 30
    iget-object v4, v0, La/gdg;->s:Ljava/lang/String;

    .line 31
    .line 32
    if-ne p1, v2, :cond_1

    .line 33
    .line 34
    const-string p1, ". "

    .line 35
    .line 36
    invoke-static {v4, p1, v4}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    :cond_1
    new-instance p1, La/jc3;

    .line 41
    .line 42
    iget-object p0, p0, La/bdg;->l:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {p1, p0}, La/jc3;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-boolean p0, v0, La/gdg;->r:Z

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    const p0, 0x7f08045e

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const p0, 0x7f080459

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v1, La/qc3;->g:La/p7m0;

    .line 65
    .line 66
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v5, v2

    .line 71
    check-cast v5, La/kc3;

    .line 72
    .line 73
    new-instance v5, La/kc3;

    .line 74
    .line 75
    invoke-direct {v5, v4, p0, p1}, La/kc3;-><init>(Ljava/lang/String;ILa/jc3;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    instance-of v2, v3, La/beg;

    .line 85
    .line 86
    iget-object v5, v1, La/qc3;->f:La/p7m0;

    .line 87
    .line 88
    :cond_4
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    move-object p1, p0

    .line 93
    check-cast p1, La/mc3;

    .line 94
    .line 95
    iget-boolean p1, p1, La/mc3;->a:Z

    .line 96
    .line 97
    new-instance v0, La/mc3;

    .line 98
    .line 99
    invoke-direct {v0, p1, v2}, La/mc3;-><init>(ZZ)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_4

    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0
.end method
