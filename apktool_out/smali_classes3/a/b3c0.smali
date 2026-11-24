.class public final La/b3c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lpb;

.field public final b:La/x2c0;

.field public final c:La/knf0;

.field public final d:La/vwb0;

.field public final e:La/us3;

.field public final f:La/mne;

.field public final g:La/btt0;


# direct methods
.method public constructor <init>(La/lpb;La/x2c0;La/knf0;La/vwb0;La/us3;La/mne;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/b3c0;->a:La/lpb;

    .line 20
    .line 21
    iput-object p2, p0, La/b3c0;->b:La/x2c0;

    .line 22
    .line 23
    iput-object p3, p0, La/b3c0;->c:La/knf0;

    .line 24
    .line 25
    iput-object p4, p0, La/b3c0;->d:La/vwb0;

    .line 26
    .line 27
    iput-object p5, p0, La/b3c0;->e:La/us3;

    .line 28
    .line 29
    iput-object p6, p0, La/b3c0;->f:La/mne;

    .line 30
    .line 31
    iput-object p7, p0, La/b3c0;->g:La/btt0;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(ZLa/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/b3c0;->b(La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object p1, p0, La/b3c0;->b:La/x2c0;

    .line 9
    .line 10
    invoke-virtual {p1}, La/x2c0;->a()La/m2c0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p2}, La/b3c0;->b(La/yje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object p1
.end method

.method public final b(La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/b3c0;->f:La/mne;

    .line 2
    .line 3
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 4
    .line 5
    new-instance v1, La/c670;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0x17

    .line 9
    .line 10
    invoke-direct {v1, p0, v2, v3}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/b3c0;->d:La/vwb0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v1, "available_multicurrency_key"

    .line 9
    .line 10
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final d(ZZLjava/lang/String;La/rl40;Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 8

    .line 1
    instance-of v0, p6, La/a3c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/a3c0;

    .line 7
    .line 8
    iget v1, v0, La/a3c0;->k:I

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
    iput v1, v0, La/a3c0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/a3c0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/a3c0;-><init>(La/b3c0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/a3c0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/a3c0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p6, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p6, p0, La/b3c0;->a:La/lpb;

    .line 53
    .line 54
    iget-object v2, p0, La/b3c0;->e:La/us3;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/b3c0;->g:La/btt0;

    .line 60
    .line 61
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iput v3, v0, La/a3c0;->k:I

    .line 66
    .line 67
    iget-object p6, p6, La/lpb;->a:La/gii0;

    .line 68
    .line 69
    const-class v2, La/z2c0;

    .line 70
    .line 71
    sget-object v3, La/sre0;->a:La/tre0;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p6, v2}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p6

    .line 81
    check-cast p6, La/z2c0;

    .line 82
    .line 83
    iget-byte v3, p4, La/rl40;->a:B

    .line 84
    .line 85
    new-instance v2, La/jnt0;

    .line 86
    .line 87
    move v6, p1

    .line 88
    move v7, p2

    .line 89
    move-object v4, p3

    .line 90
    move-object v5, p5

    .line 91
    invoke-direct/range {v2 .. v7}, La/jnt0;-><init>(ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p6, p0, v2, v0}, La/z2c0;->b(Ljava/lang/String;La/jnt0;La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-ne p0, v1, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_1
    if-ne p0, v1, :cond_4

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_4
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 107
    .line 108
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object p0, v0

    .line 113
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 114
    .line 115
    new-instance p1, La/g0g0;

    .line 116
    .line 117
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    move-object p0, p1

    .line 121
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 122
    .line 123
    instance-of p2, p0, La/g0g0;

    .line 124
    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    move-object p0, p1

    .line 128
    :cond_5
    return-object p0
.end method
