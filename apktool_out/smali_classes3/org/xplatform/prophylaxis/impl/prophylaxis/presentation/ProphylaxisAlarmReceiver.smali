.class public final Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public a:La/h760;

.field public b:La/ylt0;

.field public c:La/orc;

.field public d:La/ctf0;

.field public e:La/s64;

.field public f:La/qu;

.field public final g:La/sje;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/tvk;->a:La/rwj;

    .line 5
    .line 6
    sget-object v0, La/dvj;->c:La/dvj;

    .line 7
    .line 8
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->g:La/sje;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 1
    const/4 v4, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p2, v4

    .line 10
    :goto_0
    instance-of v0, p2, Landroid/app/Application;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/app/Application;

    .line 15
    .line 16
    move-object v2, p2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object v2, v4

    .line 19
    :goto_1
    if-nez v2, :cond_2

    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    instance-of p2, v2, La/af3;

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    move-object p2, v2

    .line 27
    check-cast p2, La/af3;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object p2, v4

    .line 31
    :goto_2
    const-class v0, La/x0d0;

    .line 32
    .line 33
    if-eqz p2, :cond_6

    .line 34
    .line 35
    invoke-interface {p2}, La/af3;->d()La/wcf0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, La/o5d0;

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    invoke-interface {p2}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, La/ze3;

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move-object p2, v4

    .line 55
    :goto_3
    instance-of v1, p2, La/x0d0;

    .line 56
    .line 57
    if-nez v1, :cond_5

    .line 58
    .line 59
    move-object p2, v4

    .line 60
    :cond_5
    check-cast p2, La/x0d0;

    .line 61
    .line 62
    if-eqz p2, :cond_6

    .line 63
    .line 64
    iget-object v0, p2, La/x0d0;->a:La/c1d0;

    .line 65
    .line 66
    iget-object v1, p2, La/x0d0;->b:La/h760;

    .line 67
    .line 68
    iget-object v3, p2, La/x0d0;->c:La/ctf0;

    .line 69
    .line 70
    iget-object v5, p2, La/x0d0;->d:La/s64;

    .line 71
    .line 72
    iget-object p2, p2, La/x0d0;->e:La/qu;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->a:La/h760;

    .line 84
    .line 85
    invoke-interface {v0}, La/c1d0;->e()La/ylt0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->b:La/ylt0;

    .line 90
    .line 91
    invoke-interface {v0}, La/c1d0;->c()La/orc;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->c:La/orc;

    .line 96
    .line 97
    iput-object v3, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->d:La/ctf0;

    .line 98
    .line 99
    iput-object v5, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->e:La/s64;

    .line 100
    .line 101
    iput-object p2, p0, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->f:La/qu;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    sget-object v6, La/y0d0;->a:La/y0d0;

    .line 108
    .line 109
    new-instance v7, La/en4;

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    invoke-direct {v7, p2, v0}, La/en4;-><init>(Landroid/content/BroadcastReceiver$PendingResult;B)V

    .line 113
    .line 114
    .line 115
    new-instance v0, La/kpb0;

    .line 116
    .line 117
    const/4 v5, 0x2

    .line 118
    move-object v1, p0

    .line 119
    move-object v3, p1

    .line 120
    invoke-direct/range {v0 .. v5}, La/kpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    const/16 v10, 0xc

    .line 124
    .line 125
    iget-object v5, v1, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->g:La/sje;

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    move-object v9, v0

    .line 129
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
