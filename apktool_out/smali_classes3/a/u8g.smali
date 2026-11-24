.class public final La/u8g;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/m1e;

.field public final c:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

.field public final d:Z

.field public final e:La/fhj;

.field public final f:La/b3u;

.field public final g:La/j3c;

.field public final h:La/y1u;

.field public final i:La/g2v;

.field public final j:La/mne;

.field public final k:La/duj;

.field public final l:La/p7m0;

.field public final m:La/p7m0;

.field public final n:La/p7m0;

.field public o:La/da10;

.field public p:La/c4m0;

.field public q:La/bby;

.field public r:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;La/m1e;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;ZLa/fhj;La/b3u;La/j3c;La/y1u;La/g2v;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/u8g;->b:La/m1e;

    .line 8
    .line 9
    iput-object p3, p0, La/u8g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 10
    .line 11
    iput-boolean p4, p0, La/u8g;->d:Z

    .line 12
    .line 13
    iput-object p5, p0, La/u8g;->e:La/fhj;

    .line 14
    .line 15
    iput-object p6, p0, La/u8g;->f:La/b3u;

    .line 16
    .line 17
    iput-object p7, p0, La/u8g;->g:La/j3c;

    .line 18
    .line 19
    iput-object p8, p0, La/u8g;->h:La/y1u;

    .line 20
    .line 21
    iput-object p9, p0, La/u8g;->i:La/g2v;

    .line 22
    .line 23
    iput-object p10, p0, La/u8g;->j:La/mne;

    .line 24
    .line 25
    iput-object p11, p0, La/u8g;->k:La/duj;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/u8g;->l:La/p7m0;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/u8g;->m:La/p7m0;

    .line 41
    .line 42
    sget-object p1, La/m8g;->a:La/m8g;

    .line 43
    .line 44
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/u8g;->n:La/p7m0;

    .line 49
    .line 50
    sget-object p1, La/da10;->c:La/da10;

    .line 51
    .line 52
    iput-object p1, p0, La/u8g;->o:La/da10;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final w(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/t8g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/t8g;

    .line 7
    .line 8
    iget v1, v0, La/t8g;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/t8g;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/t8g;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/t8g;-><init>(La/u8g;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, La/t8g;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/t8g;->k:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-boolean p1, p0, La/u8g;->d:Z

    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iput v3, v6, La/t8g;->k:I

    .line 64
    .line 65
    iget-object v1, p0, La/u8g;->g:La/j3c;

    .line 66
    .line 67
    const-wide/16 v2, 0xbd

    .line 68
    .line 69
    const-wide/16 v4, -0x1

    .line 70
    .line 71
    invoke-virtual/range {v1 .. v6}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    :goto_2
    check-cast p1, La/ypl0;

    .line 79
    .line 80
    new-instance v0, La/ril0;

    .line 81
    .line 82
    iget-object v3, p1, La/ypl0;->b:Ljava/lang/String;

    .line 83
    .line 84
    new-instance p0, La/f3n0;

    .line 85
    .line 86
    const-wide/16 v1, 0xbd

    .line 87
    .line 88
    iget-object v4, p1, La/ypl0;->c:La/lel0;

    .line 89
    .line 90
    invoke-direct {p0, v1, v2, v3, v4}, La/f3n0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iget-object v8, p1, La/ypl0;->c:La/lel0;

    .line 98
    .line 99
    const-string v4, ""

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    move-object v5, v3

    .line 103
    invoke-direct/range {v0 .. v8}, La/ril0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;La/lel0;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_5
    iput v2, v6, La/t8g;->k:I

    .line 108
    .line 109
    iget-object p0, p0, La/u8g;->f:La/b3u;

    .line 110
    .line 111
    iget-object p0, p0, La/b3u;->a:La/sjl0;

    .line 112
    .line 113
    const-wide/16 v1, 0x28

    .line 114
    .line 115
    invoke-virtual {p0, v1, v2, v6}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-ne p0, v0, :cond_6

    .line 120
    .line 121
    :goto_3
    return-object v0

    .line 122
    :cond_6
    return-object p0
.end method

.method public final x()V
    .locals 10

    .line 1
    new-instance v0, La/l8g;

    .line 2
    .line 3
    iget-boolean v1, p0, La/u8g;->d:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, La/pb10;->r:La/pb10;

    .line 8
    .line 9
    :goto_0
    move-object v3, v1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-wide/16 v1, -0x1

    .line 12
    .line 13
    sget-object v3, La/pb10;->v:La/pb10;

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x15e

    .line 22
    .line 23
    iget-object v2, p0, La/u8g;->i:La/g2v;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const v6, 0x7f130677

    .line 28
    .line 29
    .line 30
    const v7, 0x7f131690

    .line 31
    .line 32
    .line 33
    invoke-static/range {v2 .. v9}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, La/u8g;->o:La/da10;

    .line 38
    .line 39
    iget-short v2, v2, La/da10;->a:S

    .line 40
    .line 41
    int-to-long v2, v2

    .line 42
    invoke-direct {v0, v1, v2, v3}, La/l8g;-><init>(La/jkm;J)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/u8g;->n:La/p7m0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    sget-object v0, La/da10;->b:La/da10;

    .line 55
    .line 56
    iput-object v0, p0, La/u8g;->o:La/da10;

    .line 57
    .line 58
    return-void
.end method

.method public final y()V
    .locals 6

    .line 1
    iget-object v0, p0, La/u8g;->p:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/u8g;->b:La/m1e;

    .line 14
    .line 15
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/s8g;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-direct {v1, p0, v2, v3}, La/s8g;-><init>(La/u8g;La/yje;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/fnq;

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    invoke-direct {v4, v0, v1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, La/u8g;->j:La/mne;

    .line 37
    .line 38
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 39
    .line 40
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/f1e;

    .line 45
    .line 46
    const/16 v5, 0xb

    .line 47
    .line 48
    invoke-direct {v1, v3, v2, v5}, La/f1e;-><init>(ILa/yje;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/u8g;->p:La/c4m0;

    .line 56
    .line 57
    return-void
.end method

.method public final z(La/da10;)V
    .locals 3

    .line 1
    iput-object p1, p0, La/u8g;->o:La/da10;

    .line 2
    .line 3
    iget-object p1, p0, La/u8g;->n:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/l8g;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/l8g;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, La/u8g;->o:La/da10;

    .line 20
    .line 21
    iget-short p0, p0, La/da10;->a:S

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    iget-object p0, v0, La/l8g;->a:La/jkm;

    .line 25
    .line 26
    new-instance v0, La/l8g;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, La/l8g;-><init>(La/jkm;J)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    move-object v1, p0

    .line 36
    check-cast v1, La/o8g;

    .line 37
    .line 38
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    :cond_2
    return-void
.end method
