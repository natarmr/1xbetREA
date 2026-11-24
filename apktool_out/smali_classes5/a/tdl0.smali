.class public final La/tdl0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/he1;

.field public final b:La/dpi0;

.field public final c:La/k3h0;

.field public final d:La/jym0;

.field public final e:La/i9s;

.field public final f:La/xyt;

.field public final g:La/knf0;

.field public final h:La/pc90;

.field public final i:La/mne;

.field public final j:La/m530;

.field public final k:La/x2b;

.field public final l:La/us3;

.field public final m:La/yr20;

.field public final n:La/nf6;


# direct methods
.method public constructor <init>(La/he1;La/dpi0;La/k3h0;La/jym0;La/i9s;La/xyt;La/knf0;La/pc90;La/mne;La/m530;La/x2b;La/us3;La/yr20;La/nf6;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/tdl0;->a:La/he1;

    .line 35
    .line 36
    iput-object p2, p0, La/tdl0;->b:La/dpi0;

    .line 37
    .line 38
    iput-object p3, p0, La/tdl0;->c:La/k3h0;

    .line 39
    .line 40
    iput-object p4, p0, La/tdl0;->d:La/jym0;

    .line 41
    .line 42
    iput-object p5, p0, La/tdl0;->e:La/i9s;

    .line 43
    .line 44
    iput-object p6, p0, La/tdl0;->f:La/xyt;

    .line 45
    .line 46
    iput-object p7, p0, La/tdl0;->g:La/knf0;

    .line 47
    .line 48
    iput-object p8, p0, La/tdl0;->h:La/pc90;

    .line 49
    .line 50
    iput-object p9, p0, La/tdl0;->i:La/mne;

    .line 51
    .line 52
    iput-object p10, p0, La/tdl0;->j:La/m530;

    .line 53
    .line 54
    iput-object p11, p0, La/tdl0;->k:La/x2b;

    .line 55
    .line 56
    iput-object p12, p0, La/tdl0;->l:La/us3;

    .line 57
    .line 58
    iput-object p13, p0, La/tdl0;->m:La/yr20;

    .line 59
    .line 60
    iput-object p14, p0, La/tdl0;->n:La/nf6;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a(La/qdl0;La/are;ZZILa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v2, v0, La/rdl0;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, La/rdl0;

    .line 9
    .line 10
    iget v3, v2, La/rdl0;->k:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, La/rdl0;->k:I

    .line 20
    .line 21
    :goto_0
    move-object v8, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, La/rdl0;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, La/rdl0;-><init>(La/tdl0;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v8, La/rdl0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v9, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v8, La/rdl0;->k:I

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v10, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 55
    .line 56
    iget-object v0, p0, La/tdl0;->i:La/mne;

    .line 57
    .line 58
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v0, La/sdl0;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v1, p0

    .line 64
    move-object v2, p1

    .line 65
    move-object v3, p2

    .line 66
    move v6, p3

    .line 67
    move/from16 v5, p4

    .line 68
    .line 69
    move/from16 v4, p5

    .line 70
    .line 71
    invoke-direct/range {v0 .. v7}, La/sdl0;-><init>(La/tdl0;La/qdl0;La/are;IZZLa/yje;)V

    .line 72
    .line 73
    .line 74
    iput v10, v8, La/rdl0;->k:I

    .line 75
    .line 76
    invoke-static {v11, v0, v8}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-ne v0, v9, :cond_3

    .line 81
    .line 82
    return-object v9

    .line 83
    :cond_3
    :goto_2
    check-cast v0, La/k9s;

    .line 84
    .line 85
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    return-object v0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 90
    .line 91
    new-instance v1, La/g0g0;

    .line 92
    .line 93
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method
