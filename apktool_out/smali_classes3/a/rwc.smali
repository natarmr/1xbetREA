.class public final La/rwc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/do20;

.field public final c:La/nhf0;

.field public final d:La/up70;

.field public final e:La/knf0;

.field public final f:La/us3;

.field public final g:La/q7d0;


# direct methods
.method public constructor <init>(La/mne;La/do20;La/nhf0;La/up70;La/knf0;La/us3;La/q7d0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/rwc;->a:La/mne;

    .line 17
    .line 18
    iput-object p2, p0, La/rwc;->b:La/do20;

    .line 19
    .line 20
    iput-object p3, p0, La/rwc;->c:La/nhf0;

    .line 21
    .line 22
    iput-object p4, p0, La/rwc;->d:La/up70;

    .line 23
    .line 24
    iput-object p5, p0, La/rwc;->e:La/knf0;

    .line 25
    .line 26
    iput-object p6, p0, La/rwc;->f:La/us3;

    .line 27
    .line 28
    iput-object p7, p0, La/rwc;->g:La/q7d0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/lwc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/lwc;

    .line 7
    .line 8
    iget v1, v0, La/lwc;->k:I

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
    iput v1, v0, La/lwc;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lwc;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/lwc;-><init>(La/rwc;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/lwc;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lwc;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/lwc;->k:I

    .line 51
    .line 52
    iget-object p1, p0, La/rwc;->c:La/nhf0;

    .line 53
    .line 54
    iget-object v2, p1, La/nhf0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, La/nhf0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/n0o0;

    .line 64
    .line 65
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, La/sr50;

    .line 70
    .line 71
    iget-object p1, p1, La/sr50;->a:La/zdg0;

    .line 72
    .line 73
    new-instance v2, La/st20;

    .line 74
    .line 75
    const/4 v5, 0x2

    .line 76
    const/4 v6, 0x5

    .line 77
    invoke-direct {v2, v5, v3, v6}, La/st20;-><init>(ILa/yje;B)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-static {v0, p1, v2, v3, v4}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_1
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_2
    if-ne p1, v1, :cond_5

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_5
    :goto_3
    const-string p1, "FIRST_SAVE_SEEN_BANNER_TIMESTAMP"

    .line 99
    .line 100
    iget-object p0, p0, La/rwc;->g:La/q7d0;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string p1, "CMS_PROMOTIONS_WERE_LAUNCHED"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0
.end method
