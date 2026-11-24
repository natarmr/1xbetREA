.class public final La/ek80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lhf0;

.field public final b:La/bvc;

.field public final c:La/lne;

.field public d:La/bby;

.field public final e:La/p7m0;


# direct methods
.method public constructor <init>(La/lhf0;La/bvc;La/lne;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ek80;->a:La/lhf0;

    .line 8
    .line 9
    iput-object p2, p0, La/ek80;->b:La/bvc;

    .line 10
    .line 11
    iput-object p3, p0, La/ek80;->c:La/lne;

    .line 12
    .line 13
    new-instance p1, La/xl80;

    .line 14
    .line 15
    sget-object p2, La/iun;->a:La/iun;

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    invoke-direct {p1, p2, p3}, La/xl80;-><init>(Ljava/util/List;Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/ek80;->e:La/p7m0;

    .line 26
    .line 27
    invoke-virtual {p0, p3}, La/ek80;->a(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, La/ek80;->e:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/am80;

    .line 8
    .line 9
    instance-of v1, v0, La/ul80;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/ul80;

    .line 14
    .line 15
    iget-boolean v0, v0, La/ul80;->b:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La/ek80;->d:La/bby;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :cond_2
    const-class v5, La/ek80;

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, ".loadNextPageInternally"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, La/xj80;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v3, 0x1

    .line 48
    const-string v6, "setErrorState"

    .line 49
    .line 50
    const-string v7, "setErrorState(Ljava/lang/Throwable;)V"

    .line 51
    .line 52
    move-object v4, p0

    .line 53
    invoke-direct/range {v2 .. v9}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 54
    .line 55
    .line 56
    new-instance v10, La/a220;

    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-direct {v10, v4, p1, p0, v1}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v11, 0x56

    .line 64
    .line 65
    iget-object v6, v4, La/ek80;->b:La/bvc;

    .line 66
    .line 67
    iget-object v8, v4, La/ek80;->c:La/lne;

    .line 68
    .line 69
    move-object v7, v0

    .line 70
    move-object v9, v2

    .line 71
    invoke-static/range {v6 .. v11}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput-object p0, v4, La/ek80;->d:La/bby;

    .line 76
    .line 77
    return-void
.end method

.method public final b(ZLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/ek80;->a:La/lhf0;

    .line 2
    .line 3
    iget-object v1, v0, La/lhf0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/cyu;

    .line 6
    .line 7
    instance-of v2, p2, La/ck80;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    check-cast v2, La/ck80;

    .line 13
    .line 14
    iget v3, v2, La/ck80;->l:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/ck80;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/ck80;

    .line 27
    .line 28
    invoke-direct {v2, p0, p2}, La/ck80;-><init>(La/ek80;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v2, La/ck80;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/ck80;->l:I

    .line 36
    .line 37
    iget-object p0, p0, La/ek80;->e:La/p7m0;

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-boolean p1, v2, La/ck80;->i:Z

    .line 46
    .line 47
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, v1, La/cyu;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, La/p7m0;

    .line 63
    .line 64
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/util/List;

    .line 69
    .line 70
    new-instance v4, La/xl80;

    .line 71
    .line 72
    invoke-direct {v4, p2, p1}, La/xl80;-><init>(Ljava/util/List;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v6, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iput-boolean p1, v2, La/ck80;->i:Z

    .line 82
    .line 83
    iput v5, v2, La/ck80;->l:I

    .line 84
    .line 85
    invoke-static {v0, p1, v2}, La/lhf0;->H(La/lhf0;ZLa/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-ne p2, v3, :cond_3

    .line 90
    .line 91
    return-object v3

    .line 92
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    iget-object v0, v1, La/cyu;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/p7m0;

    .line 101
    .line 102
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/util/List;

    .line 107
    .line 108
    new-instance v1, La/ul80;

    .line 109
    .line 110
    invoke-direct {v1, v0, p2, p1}, La/ul80;-><init>(Ljava/util/List;ZZ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0
.end method
