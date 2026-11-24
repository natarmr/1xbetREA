.class public final La/u2g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bmf0;


# instance fields
.field public final a:J

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:La/odd;

.field public volatile d:Ljava/lang/Long;


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function1;)V
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
    iput-wide p1, p0, La/u2g0;->a:J

    .line 8
    .line 9
    iput-object p3, p0, La/u2g0;->b:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    new-instance p1, La/odd;

    .line 12
    .line 13
    invoke-direct {p1}, La/odd;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/u2g0;->c:La/odd;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final y(La/gnf0;JLa/oz2;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/u2g0;->c:La/odd;

    .line 2
    .line 3
    invoke-virtual {p1}, La/pby;->isCompleted()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_4

    .line 8
    .line 9
    iget-object p1, p0, La/u2g0;->c:La/odd;

    .line 10
    .line 11
    invoke-virtual {p1}, La/pby;->isCancelled()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object p1, p4, La/oz2;->b:La/pz2;

    .line 20
    .line 21
    sget-object p2, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Long;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p2, p0, La/u2g0;->d:Ljava/lang/Long;

    .line 40
    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    iput-object p1, p0, La/u2g0;->d:Ljava/lang/Long;

    .line 44
    .line 45
    :cond_1
    iget-object p2, p0, La/u2g0;->d:Ljava/lang/Long;

    .line 46
    .line 47
    iget-wide v0, p0, La/u2g0;->a:J

    .line 48
    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    cmp-long p3, v0, v2

    .line 52
    .line 53
    if-eqz p3, :cond_2

    .line 54
    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    sub-long/2addr v0, v2

    .line 68
    iget-wide v2, p0, La/u2g0;->a:J

    .line 69
    .line 70
    cmp-long p3, v0, v2

    .line 71
    .line 72
    if-lez p3, :cond_2

    .line 73
    .line 74
    iget-object p0, p0, La/u2g0;->c:La/odd;

    .line 75
    .line 76
    const/4 p3, 0x0

    .line 77
    invoke-virtual {p0, p3}, La/pby;->N(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    const-string p0, "CXCP"

    .line 81
    .line 82
    invoke-static {p0}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_4

    .line 87
    .line 88
    new-instance p3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string p4, "Wait for capture result timeout, current: "

    .line 91
    .line 92
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p1, " first: "

    .line 103
    .line 104
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide p1

    .line 111
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget-object p1, p0, La/u2g0;->b:Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    invoke-interface {p1, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    iget-object p0, p0, La/u2g0;->c:La/odd;

    .line 138
    .line 139
    invoke-virtual {p0, p4}, La/pby;->N(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_0
    return-void
.end method
