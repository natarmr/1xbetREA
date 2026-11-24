.class public final La/r3i0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;La/sqt;La/ctf0;La/vzg0;)V
    .locals 8

    .line 1
    iget-wide v0, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/w46;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, La/q3i0;

    .line 10
    .line 11
    iget-object p3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    .line 12
    .line 13
    iget-byte p3, p3, La/ygq0;->a:B

    .line 14
    .line 15
    iget-wide v2, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long p4, v2, v4

    .line 20
    .line 21
    sget-object v6, La/kfj;->a:La/kfj;

    .line 22
    .line 23
    if-gtz p4, :cond_0

    .line 24
    .line 25
    move-object p4, v6

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p4, La/lfj;

    .line 28
    .line 29
    new-instance v7, Ljava/util/Date;

    .line 30
    .line 31
    invoke-direct {v7, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p4, v7}, La/lfj;-><init>(Ljava/util/Date;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    cmp-long v2, v0, v4

    .line 38
    .line 39
    if-gtz v2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance v6, La/lfj;

    .line 43
    .line 44
    new-instance v2, Ljava/util/Date;

    .line 45
    .line 46
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v6, v2}, La/lfj;-><init>(Ljava/util/Date;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-direct {p2, p3, p4, v6}, La/q3i0;-><init>(ILa/mfj;La/mfj;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 56
    .line 57
    .line 58
    sget-object p2, La/i99;->a:La/i99;

    .line 59
    .line 60
    new-instance p3, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance p3, La/th50;

    .line 66
    .line 67
    const/16 p4, 0x18

    .line 68
    .line 69
    invoke-direct {p3, p4}, La/th50;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 73
    .line 74
    .line 75
    const/4 p3, 0x0

    .line 76
    const p4, 0x7fffffff

    .line 77
    .line 78
    .line 79
    invoke-static {p3, p4, p2}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 80
    .line 81
    .line 82
    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 83
    .line 84
    invoke-static {p1}, La/sqt;->f(La/jhq0;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, La/r3i0;->b:Ljava/util/List;

    .line 89
    .line 90
    return-void
.end method
