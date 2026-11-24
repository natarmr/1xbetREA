.class public final La/v6g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:J

.field public final synthetic j:La/w6g;

.field public final synthetic k:Ljava/util/ArrayList;

.field public final synthetic l:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;


# direct methods
.method public constructor <init>(JLa/w6g;Ljava/util/ArrayList;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/v6g;->i:J

    .line 2
    .line 3
    iput-object p3, p0, La/v6g;->j:La/w6g;

    .line 4
    .line 5
    iput-object p4, p0, La/v6g;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p5, p0, La/v6g;->l:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/v6g;

    .line 2
    .line 3
    iget-object v4, p0, La/v6g;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v5, p0, La/v6g;->l:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 6
    .line 7
    iget-wide v1, p0, La/v6g;->i:J

    .line 8
    .line 9
    iget-object v3, p0, La/v6g;->j:La/w6g;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/v6g;-><init>(JLa/w6g;Ljava/util/ArrayList;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/v6g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v6g;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v6g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-wide v0, p0, La/v6g;->i:J

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/c5g;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v0, 0x5

    .line 32
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    iget-object p1, p0, La/v6g;->j:La/w6g;

    .line 41
    .line 42
    iget-object v0, p1, La/w6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 43
    .line 44
    iget-object v7, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;->a:La/yag;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    invoke-direct/range {v2 .. v8}, La/c5g;-><init>(IIIILa/yag;Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p1, La/w6g;->s:La/bby;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p1, La/w6g;->j:La/mne;

    .line 63
    .line 64
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 65
    .line 66
    new-instance v9, La/s6g;

    .line 67
    .line 68
    const/4 v3, 0x3

    .line 69
    invoke-direct {v9, p1, v3}, La/s6g;-><init>(La/w6g;B)V

    .line 70
    .line 71
    .line 72
    new-instance v7, La/kv;

    .line 73
    .line 74
    move-object v4, v2

    .line 75
    move-object v2, v7

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x7

    .line 78
    iget-object v5, p0, La/v6g;->k:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v6, p0, La/v6g;->l:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 81
    .line 82
    move-object v3, p1

    .line 83
    invoke-direct/range {v2 .. v8}, La/kv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 84
    .line 85
    .line 86
    move-object p0, v3

    .line 87
    const/16 v8, 0xa

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    move-object v3, v0

    .line 91
    move-object v6, v1

    .line 92
    move-object v7, v2

    .line 93
    move-object v4, v9

    .line 94
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/w6g;->s:La/bby;

    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method
