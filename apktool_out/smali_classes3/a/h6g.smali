.class public final La/h6g;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

.field public final d:La/fhj;

.field public final e:La/b3u;

.field public final f:La/j3c;

.field public final g:La/y1u;

.field public final h:La/z1u;

.field public final i:La/g2v;

.field public final j:La/mne;

.field public final k:La/duj;

.field public final l:La/ctf0;

.field public final m:La/p7m0;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public p:La/c5g;

.field public q:La/da10;

.field public r:La/bby;

.field public s:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;La/fhj;La/b3u;La/j3c;La/y1u;La/z1u;La/g2v;La/mne;La/duj;La/ctf0;)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/h6g;->b:La/vzg0;

    .line 8
    .line 9
    iput-object p2, p0, La/h6g;->c:Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 10
    .line 11
    iput-object p3, p0, La/h6g;->d:La/fhj;

    .line 12
    .line 13
    iput-object p4, p0, La/h6g;->e:La/b3u;

    .line 14
    .line 15
    iput-object p5, p0, La/h6g;->f:La/j3c;

    .line 16
    .line 17
    iput-object p6, p0, La/h6g;->g:La/y1u;

    .line 18
    .line 19
    iput-object p7, p0, La/h6g;->h:La/z1u;

    .line 20
    .line 21
    iput-object p8, p0, La/h6g;->i:La/g2v;

    .line 22
    .line 23
    iput-object p9, p0, La/h6g;->j:La/mne;

    .line 24
    .line 25
    iput-object p10, p0, La/h6g;->k:La/duj;

    .line 26
    .line 27
    iput-object p11, p0, La/h6g;->l:La/ctf0;

    .line 28
    .line 29
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, La/h6g;->m:La/p7m0;

    .line 36
    .line 37
    new-instance p2, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 38
    .line 39
    const-string p3, "selected_time_key"

    .line 40
    .line 41
    invoke-virtual {p1, p3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/Long;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide p3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/util/Date;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide p3

    .line 63
    :goto_0
    const-wide/16 p5, 0x0

    .line 64
    .line 65
    invoke-direct {p2, p3, p4, p5, p6}, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;-><init>(JJ)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, La/h6g;->n:La/p7m0;

    .line 73
    .line 74
    sget-object p1, La/nch;->a:La/nch;

    .line 75
    .line 76
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, La/h6g;->o:La/p7m0;

    .line 81
    .line 82
    sget-object p1, La/da10;->c:La/da10;

    .line 83
    .line 84
    iput-object p1, p0, La/h6g;->q:La/da10;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final A(La/da10;)V
    .locals 3

    .line 1
    iput-object p1, p0, La/h6g;->q:La/da10;

    .line 2
    .line 3
    iget-object p1, p0, La/h6g;->o:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/mch;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/mch;

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
    iget-object p0, p0, La/h6g;->q:La/da10;

    .line 20
    .line 21
    iget-short p0, p0, La/da10;->a:S

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    iget-object p0, v0, La/mch;->a:La/jkm;

    .line 25
    .line 26
    new-instance v0, La/mch;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, La/mch;-><init>(La/jkm;J)V

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
    check-cast v1, La/och;

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

.method public final w(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/f6g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/f6g;

    .line 7
    .line 8
    iget v1, v0, La/f6g;->k:I

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
    iput v1, v0, La/f6g;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/f6g;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/f6g;-><init>(La/h6g;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, La/f6g;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/f6g;->k:I

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
    iget-object p1, p0, La/h6g;->c:Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 60
    .line 61
    iget-boolean p1, p1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iput v3, v6, La/f6g;->k:I

    .line 66
    .line 67
    iget-object v1, p0, La/h6g;->f:La/j3c;

    .line 68
    .line 69
    const-wide/16 v2, 0xbd

    .line 70
    .line 71
    const-wide/16 v4, -0x1

    .line 72
    .line 73
    invoke-virtual/range {v1 .. v6}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    check-cast p1, La/ypl0;

    .line 81
    .line 82
    new-instance v0, La/ril0;

    .line 83
    .line 84
    iget-object v3, p1, La/ypl0;->b:Ljava/lang/String;

    .line 85
    .line 86
    new-instance p0, La/f3n0;

    .line 87
    .line 88
    const-wide/16 v1, 0xbd

    .line 89
    .line 90
    iget-object v4, p1, La/ypl0;->c:La/lel0;

    .line 91
    .line 92
    invoke-direct {p0, v1, v2, v3, v4}, La/f3n0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    iget-object v8, p1, La/ypl0;->c:La/lel0;

    .line 100
    .line 101
    const-string v4, ""

    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    move-object v5, v3

    .line 105
    invoke-direct/range {v0 .. v8}, La/ril0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;La/lel0;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    iput v2, v6, La/f6g;->k:I

    .line 110
    .line 111
    iget-object p0, p0, La/h6g;->e:La/b3u;

    .line 112
    .line 113
    iget-object p0, p0, La/b3u;->a:La/sjl0;

    .line 114
    .line 115
    const-wide/16 v1, 0x28

    .line 116
    .line 117
    invoke-virtual {p0, v1, v2, v6}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_6

    .line 122
    .line 123
    :goto_3
    return-object v0

    .line 124
    :cond_6
    return-object p0
.end method

.method public final x()V
    .locals 10

    .line 1
    new-instance v0, La/mch;

    .line 2
    .line 3
    iget-object v1, p0, La/h6g;->c:Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 4
    .line 5
    iget-boolean v1, v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, La/pb10;->r:La/pb10;

    .line 10
    .line 11
    :goto_0
    move-object v3, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    sget-object v3, La/pb10;->v:La/pb10;

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    const/4 v8, 0x0

    .line 23
    const/16 v9, 0x15e

    .line 24
    .line 25
    iget-object v2, p0, La/h6g;->i:La/g2v;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const v6, 0x7f130677

    .line 30
    .line 31
    .line 32
    const v7, 0x7f131690

    .line 33
    .line 34
    .line 35
    invoke-static/range {v2 .. v9}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, La/h6g;->q:La/da10;

    .line 40
    .line 41
    iget-short v2, v2, La/da10;->a:S

    .line 42
    .line 43
    int-to-long v2, v2

    .line 44
    invoke-direct {v0, v1, v2, v3}, La/mch;-><init>(La/jkm;J)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/h6g;->o:La/p7m0;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    sget-object v0, La/da10;->b:La/da10;

    .line 57
    .line 58
    iput-object v0, p0, La/h6g;->q:La/da10;

    .line 59
    .line 60
    return-void
.end method

.method public final y()V
    .locals 8

    .line 1
    iget-object v0, p0, La/h6g;->s:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, p0, La/h6g;->j:La/mne;

    .line 14
    .line 15
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 16
    .line 17
    new-instance v3, La/d6g;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {v3, p0, v0}, La/d6g;-><init>(La/h6g;B)V

    .line 21
    .line 22
    .line 23
    new-instance v6, La/igb;

    .line 24
    .line 25
    const/16 v0, 0x11

    .line 26
    .line 27
    invoke-direct {v6, p0, v1, v0}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v7, 0xa

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/h6g;->s:La/bby;

    .line 38
    .line 39
    return-void
.end method

.method public final z(I)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, La/h6g;->n:La/p7m0;

    .line 10
    .line 11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 16
    .line 17
    iget-wide v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object p1, p0, La/h6g;->j:La/mne;

    .line 31
    .line 32
    iget-object v5, p1, La/mne;->a:La/rwj;

    .line 33
    .line 34
    new-instance v3, La/d6g;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-direct {v3, p0, p1}, La/d6g;-><init>(La/h6g;B)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/b1f;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    const/4 v1, 0x7

    .line 44
    invoke-direct {v6, p0, v0, p1, v1}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v7, 0xa

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 51
    .line 52
    .line 53
    return-void
.end method
