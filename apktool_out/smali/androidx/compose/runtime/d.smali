.class public abstract Landroidx/compose/runtime/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xez;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xez;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/xez;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/runtime/d;->a:La/xez;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)La/l5d0;
    .locals 7

    .line 1
    new-instance v0, La/l5d0;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    move v3, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v6}, La/l5d0;-><init>(Landroidx/compose/runtime/d;Ljava/lang/Object;ZLa/igk0;Lkotlin/jvm/functions/Function1;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public b()La/f3u0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/d;->a:La/xez;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Lkotlin/jvm/functions/Function1;)La/l5d0;
    .locals 7

    .line 1
    new-instance v0, La/l5d0;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-object v5, p1

    .line 9
    invoke-direct/range {v0 .. v6}, La/l5d0;-><init>(Landroidx/compose/runtime/d;Ljava/lang/Object;ZLa/igk0;Lkotlin/jvm/functions/Function1;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final d(La/l5d0;La/f3u0;)La/f3u0;
    .locals 2

    .line 1
    instance-of p0, p2, La/kgn;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-boolean p0, p1, La/l5d0;->e:Z

    .line 7
    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/kgn;

    .line 12
    .line 13
    iget-object p0, v0, La/kgn;->a:La/pz40;

    .line 14
    .line 15
    invoke-virtual {p1}, La/l5d0;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p0, La/hgk0;

    .line 20
    .line 21
    invoke-virtual {p0, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    instance-of p0, p2, La/z8m0;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    iget-boolean p0, p1, La/l5d0;->b:Z

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    iget-object p0, p1, La/l5d0;->f:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    :cond_1
    iget-boolean p0, p1, La/l5d0;->e:Z

    .line 38
    .line 39
    if-nez p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, La/l5d0;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p2, La/z8m0;

    .line 46
    .line 47
    iget-object v1, p2, La/z8m0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    :goto_0
    move-object v0, p2

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    instance-of p0, p2, La/mqd;

    .line 58
    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    iget-object p0, p1, La/l5d0;->d:Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    check-cast p2, La/mqd;

    .line 64
    .line 65
    iget-object v1, p2, La/mqd;->a:Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    if-ne p0, v1, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_1
    if-nez v0, :cond_7

    .line 71
    .line 72
    iget-boolean p0, p1, La/l5d0;->e:Z

    .line 73
    .line 74
    if-eqz p0, :cond_5

    .line 75
    .line 76
    new-instance p0, La/kgn;

    .line 77
    .line 78
    iget-object p2, p1, La/l5d0;->f:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object p1, p1, La/l5d0;->c:La/igk0;

    .line 81
    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    sget-object p1, La/rek0;->c:La/rek0;

    .line 85
    .line 86
    :cond_4
    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    .line 87
    .line 88
    invoke-direct {v0, p2, p1}, La/hgk0;-><init>(Ljava/lang/Object;La/igk0;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v0}, La/kgn;-><init>(La/pz40;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_5
    iget-object p0, p1, La/l5d0;->d:Lkotlin/jvm/functions/Function1;

    .line 96
    .line 97
    if-eqz p0, :cond_6

    .line 98
    .line 99
    new-instance p1, La/mqd;

    .line 100
    .line 101
    invoke-direct {p1, p0}, La/mqd;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_6
    new-instance p0, La/z8m0;

    .line 106
    .line 107
    invoke-virtual {p1}, La/l5d0;->a()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-direct {p0, p1}, La/z8m0;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_7
    return-object v0
.end method
