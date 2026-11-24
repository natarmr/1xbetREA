.class public final La/xsu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cfr;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ggm0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, La/tpv;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La/tpv;-><init>(La/gii0;B)V

    iput-object v0, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/hm7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/j9s0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/khb0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/kpd0;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const-class v0, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    invoke-virtual {p1, v0}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rkc0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/y1f0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/z300;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v3, p1, La/z300;->a:La/btt0;

    .line 5
    .line 6
    iget-object v4, p1, La/z300;->b:La/gii0;

    .line 7
    .line 8
    iget-object v0, p1, La/z300;->c:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/cad;

    .line 12
    .line 13
    iget-object v0, p1, La/z300;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/ctf0;

    .line 16
    .line 17
    iget-object v1, p1, La/z300;->e:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v1

    .line 20
    check-cast v5, La/kuy;

    .line 21
    .line 22
    iget-object p1, p1, La/z300;->f:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, p1

    .line 25
    check-cast v6, La/e400;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, La/rrd;

    .line 43
    .line 44
    new-instance v1, La/wsz;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v0 .. v6}, La/rrd;-><init>(La/wsz;La/cad;La/btt0;La/gii0;La/kuy;La/e400;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/xsu;->a:Ljava/lang/Object;

    .line 53
    .line 54
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 69
    iput-object p1, p0, La/xsu;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)La/vsg0;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/xsu;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/cyu;

    .line 7
    .line 8
    iget-object v0, p0, La/cyu;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/zb30;

    .line 11
    .line 12
    iget-object v1, v0, La/zb30;->a:La/or30;

    .line 13
    .line 14
    const-wide/16 v2, 0x1e

    .line 15
    .line 16
    sget-object v0, La/bfn;->e:La/bfn;

    .line 17
    .line 18
    invoke-static {v2, v3, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    new-instance v5, La/ffd;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const/16 v4, 0x19

    .line 26
    .line 27
    invoke-direct {v5, p0, p1, v0, v4}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v6, 0xdc

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, La/d4v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d4v;

    .line 7
    .line 8
    iget v1, v0, La/d4v;->k:I

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
    iput v1, v0, La/d4v;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d4v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d4v;-><init>(La/xsu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d4v;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d4v;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/xsu;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/fuj0;

    .line 53
    .line 54
    iput v3, v0, La/d4v;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, La/fuj0;->v(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-ne p2, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 64
    .line 65
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_5

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    move-object v0, p2

    .line 85
    check-cast v0, La/uft0;

    .line 86
    .line 87
    iget-object v1, v0, La/uft0;->a:Ljava/lang/String;

    .line 88
    .line 89
    const-string v2, ""

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    iget-object v1, v0, La/uft0;->d:La/ufp0;

    .line 98
    .line 99
    iget-object v1, v1, La/ufp0;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_4

    .line 106
    .line 107
    iget-object v1, v0, La/uft0;->e:La/ufp0;

    .line 108
    .line 109
    iget-object v1, v1, La/ufp0;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    iget-object v0, v0, La/uft0;->f:La/znq0;

    .line 118
    .line 119
    invoke-interface {v0}, La/aoq0;->b()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    const-wide/16 v2, 0x0

    .line 124
    .line 125
    cmp-long v0, v0, v2

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    return-object p0
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/xsu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/oyw;

    .line 4
    .line 5
    invoke-virtual {p0}, La/jwq;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    return-void
.end method
