.class public final La/x9q;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1u;

.field public final p:La/i1u;

.field public final q:La/v6q;

.field public final r:La/zr1;

.field public final s:La/mii0;


# direct methods
.method public constructor <init>(La/i1u;La/i1u;La/v6q;La/zr1;La/mii0;La/mne;)V
    .locals 6

    .line 1
    new-instance v2, La/v9q;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, v0}, La/v9q;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v3, La/rnp;

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    invoke-direct {v3, v0}, La/rnp;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p6, La/mne;->a:La/rwj;

    .line 14
    .line 15
    invoke-static {v0, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/x9q;->o:La/i1u;

    .line 26
    .line 27
    iput-object p2, v0, La/x9q;->p:La/i1u;

    .line 28
    .line 29
    iput-object p3, v0, La/x9q;->q:La/v6q;

    .line 30
    .line 31
    iput-object p4, v0, La/x9q;->r:La/zr1;

    .line 32
    .line 33
    iput-object p5, v0, La/x9q;->s:La/mii0;

    .line 34
    .line 35
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p3, p6, La/mne;->b:La/dvj;

    .line 40
    .line 41
    sget-object p1, La/w9q;->a:La/w9q;

    .line 42
    .line 43
    new-instance p4, La/hij;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    const/16 p5, 0x17

    .line 47
    .line 48
    invoke-direct {p4, v0, p2, p5}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 p5, 0xa

    .line 52
    .line 53
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, La/r9q;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, La/r9q;->a:La/njx;

    .line 7
    .line 8
    iget-object v0, p1, La/njx;->d:La/fcq;

    .line 9
    .line 10
    invoke-virtual {v0}, La/fcq;->C()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, La/x9q;->r:La/zr1;

    .line 15
    .line 16
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 17
    .line 18
    new-instance v3, La/j1p;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v3, v1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-wide/16 v3, 0xd19

    .line 29
    .line 30
    invoke-virtual {v2, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    const-string v2, "option"

    .line 39
    .line 40
    const-string v3, "finbet_type_choose"

    .line 41
    .line 42
    iget-object v4, p0, La/x9q;->s:La/mii0;

    .line 43
    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    if-eq v0, v1, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    if-eq v0, v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, v4, La/mii0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/kt2;

    .line 56
    .line 57
    const-string v1, "bull"

    .line 58
    .line 59
    invoke-static {v2, v1, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, v4, La/mii0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/kt2;

    .line 66
    .line 67
    const-string v1, "bear"

    .line 68
    .line 69
    invoke-static {v2, v1, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v0, v4, La/mii0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/kt2;

    .line 76
    .line 77
    const-string v1, "random"

    .line 78
    .line 79
    invoke-static {v2, v1, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    iget-object v0, p0, La/x9q;->q:La/v6q;

    .line 83
    .line 84
    iget p1, p1, La/njx;->a:I

    .line 85
    .line 86
    invoke-virtual {v0, p1}, La/v6q;->b(I)V

    .line 87
    .line 88
    .line 89
    sget-object p1, La/s9q;->a:La/s9q;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
