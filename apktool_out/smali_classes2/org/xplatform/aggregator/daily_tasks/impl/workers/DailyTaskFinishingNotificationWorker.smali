.class public final Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:La/cr;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    instance-of p2, p1, La/af3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v0

    .line 26
    :goto_0
    const-class p2, La/o4j;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/o5d0;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object p1, v0

    .line 50
    :goto_1
    instance-of v1, p1, La/o4j;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    check-cast p1, La/o4j;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p1, La/o4j;->a:La/cr;

    .line 60
    .line 61
    iput-object p1, p0, Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;->g:La/cr;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 65
    .line 66
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, La/m0j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/m0j;

    .line 7
    .line 8
    iget v1, v0, La/m0j;->k:I

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
    iput v1, v0, La/m0j;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/m0j;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/m0j;-><init>(Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/m0j;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/m0j;->k:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 62
    .line 63
    .line 64
    const/16 v2, 0xb

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/16 v2, 0x13

    .line 71
    .line 72
    if-gt v2, p1, :cond_7

    .line 73
    .line 74
    const/16 v2, 0x18

    .line 75
    .line 76
    if-ge p1, v2, :cond_7

    .line 77
    .line 78
    iget-object p0, p0, Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskFinishingNotificationWorker;->g:La/cr;

    .line 79
    .line 80
    if-eqz p0, :cond_6

    .line 81
    .line 82
    iput v4, v0, La/m0j;->k:I

    .line 83
    .line 84
    iget-object p1, p0, La/cr;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, La/pru;

    .line 87
    .line 88
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p1, p1, La/sff0;->b:La/hl1;

    .line 93
    .line 94
    iget-boolean p1, p1, La/hl1;->z:Z

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object p1, p0, La/cr;->l:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, La/iqt;

    .line 101
    .line 102
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 103
    .line 104
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget-object p1, p0, La/cr;->r:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, La/bby;

    .line 114
    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    invoke-interface {p1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    iget-object p1, p0, La/cr;->o:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v5, p1

    .line 123
    check-cast v5, La/sje;

    .line 124
    .line 125
    iget-object p1, p0, La/cr;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, La/mne;

    .line 128
    .line 129
    iget-object v8, p1, La/mne;->b:La/dvj;

    .line 130
    .line 131
    sget-object v6, La/u4j;->a:La/u4j;

    .line 132
    .line 133
    new-instance v9, La/t4j;

    .line 134
    .line 135
    invoke-direct {v9, p0, v3, v4}, La/t4j;-><init>(La/cr;La/yje;B)V

    .line 136
    .line 137
    .line 138
    const/16 v10, 0xa

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, p0, La/cr;->r:Ljava/lang/Object;

    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_2
    if-ne p0, v1, :cond_7

    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_6
    const-string p0, "dailyTasksNotificationProvider"

    .line 156
    .line 157
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v3

    .line 161
    :cond_7
    :goto_3
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0
.end method
