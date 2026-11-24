.class public final La/x5k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r6k0;

.field public final b:Ljava/lang/String;

.field public final c:La/jt2;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;

.field public final f:La/sje;

.field public g:La/c4m0;

.field public final h:La/g090;

.field public final i:La/pox;


# direct methods
.method public constructor <init>(La/r6k0;Ljava/lang/String;La/jt2;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, La/x5k0;->a:La/r6k0;

    .line 18
    .line 19
    move-object/from16 v2, p2

    .line 20
    .line 21
    iput-object v2, v0, La/x5k0;->b:Ljava/lang/String;

    .line 22
    .line 23
    move-object/from16 v2, p3

    .line 24
    .line 25
    iput-object v2, v0, La/x5k0;->c:La/jt2;

    .line 26
    .line 27
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    new-instance v3, La/y5k0;

    .line 30
    .line 31
    sget-object v14, La/lun;->a:La/lun;

    .line 32
    .line 33
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/16 v23, 0x0

    .line 37
    .line 38
    const/16 v24, 0x0

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const-string v11, ""

    .line 48
    .line 49
    const-string v12, ""

    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    const-string v15, ""

    .line 53
    .line 54
    const-string v16, ""

    .line 55
    .line 56
    const-string v17, ""

    .line 57
    .line 58
    const/16 v18, 0x0

    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/16 v20, 0x0

    .line 63
    .line 64
    const/16 v21, 0x0

    .line 65
    .line 66
    const/16 v22, -0x1

    .line 67
    .line 68
    invoke-direct/range {v3 .. v24}, La/y5k0;-><init>(Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipListener;ZZZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object v2, v0, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 75
    .line 76
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object v2, v0, La/x5k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 83
    .line 84
    sget-object v2, La/tvk;->a:La/rwj;

    .line 85
    .line 86
    sget-object v2, La/dvj;->c:La/dvj;

    .line 87
    .line 88
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iput-object v2, v0, La/x5k0;->f:La/sje;

    .line 104
    .line 105
    new-instance v2, La/g090;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v1, v2, La/g090;->a:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance v3, Ljava/util/concurrent/atomic/AtomicLong;

    .line 116
    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 122
    .line 123
    .line 124
    iput-object v3, v2, La/g090;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v2, v0, La/x5k0;->h:La/g090;

    .line 127
    .line 128
    new-instance v2, La/pox;

    .line 129
    .line 130
    invoke-direct {v2, v1}, La/pox;-><init>(La/r6k0;)V

    .line 131
    .line 132
    .line 133
    iput-object v2, v0, La/x5k0;->i:La/pox;

    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/y5k0;

    .line 8
    .line 9
    iget-object v1, v1, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, La/x5k0;->a:La/r6k0;

    .line 14
    .line 15
    invoke-virtual {v2}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2, v1}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    new-instance v1, La/w5k0;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-direct {v1, v2}, La/w5k0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/y5k0;

    .line 33
    .line 34
    :cond_0
    new-instance v1, La/w5k0;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, v2}, La/w5k0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/x5k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
