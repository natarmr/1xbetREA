.class public final La/rg70;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/oqt;

.field public final c:La/vcu;

.field public final d:La/egu;

.field public final e:La/pyb;

.field public final f:La/ztt;

.field public final g:La/mne;

.field public final h:Z

.field public final i:La/q99;

.field public j:Z


# direct methods
.method public constructor <init>(La/i1w0;La/oqt;La/qa60;La/vcu;La/egu;La/pyb;La/ztt;La/mne;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, La/w46;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, La/rg70;->b:La/oqt;

    .line 26
    .line 27
    iput-object p4, p0, La/rg70;->c:La/vcu;

    .line 28
    .line 29
    iput-object p5, p0, La/rg70;->d:La/egu;

    .line 30
    .line 31
    iput-object p6, p0, La/rg70;->e:La/pyb;

    .line 32
    .line 33
    iput-object p7, p0, La/rg70;->f:La/ztt;

    .line 34
    .line 35
    move-object/from16 p1, p8

    .line 36
    .line 37
    iput-object p1, p0, La/rg70;->g:La/mne;

    .line 38
    .line 39
    move/from16 p1, p9

    .line 40
    .line 41
    iput-boolean p1, p0, La/rg70;->h:Z

    .line 42
    .line 43
    const/4 p1, 0x7

    .line 44
    const/4 p4, 0x0

    .line 45
    const/4 p5, 0x0

    .line 46
    invoke-static {p4, p5, p5, p1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/rg70;->i:La/q99;

    .line 51
    .line 52
    invoke-virtual {p2}, La/oqt;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput-boolean p1, p0, La/rg70;->j:Z

    .line 57
    .line 58
    invoke-virtual {p3}, La/qa60;->a()La/vae0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, La/vf20;

    .line 63
    .line 64
    const/4 v6, 0x4

    .line 65
    const/16 v7, 0x1a

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    const-class v3, La/rg70;

    .line 69
    .line 70
    const-string v4, "handleCommand"

    .line 71
    .line 72
    const-string v5, "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V"

    .line 73
    .line 74
    move-object v2, p0

    .line 75
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    new-instance p2, La/fnq;

    .line 79
    .line 80
    const/4 p3, 0x4

    .line 81
    invoke-direct {p2, p1, v0, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 82
    .line 83
    .line 84
    new-instance p1, La/pr60;

    .line 85
    .line 86
    const/4 p4, 0x3

    .line 87
    invoke-direct {p1, p4, p5, p3}, La/pr60;-><init>(ILa/yje;B)V

    .line 88
    .line 89
    .line 90
    new-instance p3, La/dnq;

    .line 91
    .line 92
    const/4 p4, 0x1

    .line 93
    invoke-direct {p3, p2, p1, p4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p3, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 101
    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final w(La/qg70;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/rg70;->g:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/wk60;

    .line 10
    .line 11
    const/16 v2, 0xf

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/wk60;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/ku60;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v4, p0, p1, v5, v2}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    const/16 v5, 0xa

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 26
    .line 27
    .line 28
    return-void
.end method
