.class public final La/xcz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bch0;


# static fields
.field public static final y:La/v0h0;


# instance fields
.field public final a:La/pcz;

.field public b:Z

.field public c:La/mcz;

.field public d:Z

.field public final e:La/t8z;

.field public final f:La/pz40;

.field public final g:La/gy40;

.field public h:F

.field public i:Z

.field public final j:La/ywj;

.field public final k:Z

.field public l:La/e7z;

.field public final m:La/a9z;

.field public final n:La/la5;

.field public final o:La/dbz;

.field public final p:La/hru;

.field public final q:La/tbz;

.field public final r:La/jru;

.field public final s:La/qbz;

.field public final t:La/pz40;

.field public final u:La/pz40;

.field public final v:La/pz40;

.field public final w:La/pz40;

.field public final x:La/ieu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/hvy;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/hvy;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/z8z;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-direct {v1, v2}, La/z8z;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/xcz;->y:La/v0h0;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 142
    new-instance v0, La/pvj;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La/pvj;-><init>(I)V

    .line 143
    invoke-direct {p0, p1, p2, v0}, La/xcz;-><init>(IILa/pcz;)V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move p1, p3

    .line 146
    :cond_0
    invoke-direct {p0, p1, p3}, La/xcz;-><init>(II)V

    return-void
.end method

.method public constructor <init>(IILa/pcz;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/xcz;->a:La/pcz;

    .line 5
    .line 6
    new-instance p3, La/t8z;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p3, p1, p2, v0}, La/t8z;-><init>(IIB)V

    .line 10
    .line 11
    .line 12
    iput-object p3, p0, La/xcz;->e:La/t8z;

    .line 13
    .line 14
    sget-object p2, La/ddz;->a:La/mcz;

    .line 15
    .line 16
    sget-object p3, La/m2a;->v:La/m2a;

    .line 17
    .line 18
    invoke-static {p2, p3}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iput-object p2, p0, La/xcz;->f:La/pz40;

    .line 23
    .line 24
    new-instance p2, La/gy40;

    .line 25
    .line 26
    invoke-direct {p2}, La/gy40;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/xcz;->g:La/gy40;

    .line 30
    .line 31
    new-instance p2, La/ebz;

    .line 32
    .line 33
    const/4 p3, 0x3

    .line 34
    invoke-direct {p2, p0, p3}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance p3, La/ywj;

    .line 38
    .line 39
    invoke-direct {p3, p2}, La/ywj;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    iput-object p3, p0, La/xcz;->j:La/ywj;

    .line 43
    .line 44
    iput-boolean v0, p0, La/xcz;->k:Z

    .line 45
    .line 46
    new-instance p2, La/a9z;

    .line 47
    .line 48
    invoke-direct {p2, p0, v0}, La/a9z;-><init>(La/bch0;B)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, La/xcz;->m:La/a9z;

    .line 52
    .line 53
    new-instance p2, La/la5;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, La/xcz;->n:La/la5;

    .line 59
    .line 60
    new-instance p2, La/dbz;

    .line 61
    .line 62
    invoke-direct {p2}, La/dbz;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, La/xcz;->o:La/dbz;

    .line 66
    .line 67
    new-instance p2, La/hru;

    .line 68
    .line 69
    const/16 p3, 0x19

    .line 70
    .line 71
    invoke-direct {p2, p3}, La/hru;-><init>(B)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, La/xcz;->p:La/hru;

    .line 75
    .line 76
    new-instance p2, La/tbz;

    .line 77
    .line 78
    new-instance p3, La/z08;

    .line 79
    .line 80
    const/16 v0, 0x8

    .line 81
    .line 82
    invoke-direct {p3, p0, p1, v0}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p2, p3}, La/tbz;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, La/xcz;->q:La/tbz;

    .line 89
    .line 90
    new-instance p1, La/jru;

    .line 91
    .line 92
    const/16 p2, 0x1a

    .line 93
    .line 94
    invoke-direct {p1, p0, p2}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, La/xcz;->r:La/jru;

    .line 98
    .line 99
    new-instance p1, La/qbz;

    .line 100
    .line 101
    invoke-direct {p1}, La/qbz;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, La/xcz;->s:La/qbz;

    .line 105
    .line 106
    invoke-static {}, La/m8x;->J()La/pz40;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, La/xcz;->t:La/pz40;

    .line 111
    .line 112
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iput-object p2, p0, La/xcz;->u:La/pz40;

    .line 119
    .line 120
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-object p1, p0, La/xcz;->v:La/pz40;

    .line 125
    .line 126
    invoke-static {}, La/m8x;->J()La/pz40;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p0, La/xcz;->w:La/pz40;

    .line 131
    .line 132
    new-instance p1, La/ieu;

    .line 133
    .line 134
    const/16 p2, 0x17

    .line 135
    .line 136
    invoke-direct {p1, p2}, La/ieu;-><init>(B)V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, La/xcz;->x:La/ieu;

    .line 140
    .line 141
    return-void
.end method

.method public constructor <init>(La/uwq;II)V
    .locals 1

    .line 144
    new-instance v0, La/fcz;

    invoke-direct {v0, p1}, La/fcz;-><init>(La/uwq;)V

    .line 145
    invoke-direct {p0, p2, p3, v0}, La/xcz;-><init>(IILa/pcz;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/wcz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/wcz;

    .line 7
    .line 8
    iget v1, v0, La/wcz;->m:I

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
    iput v1, v0, La/wcz;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wcz;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/wcz;-><init>(La/xcz;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/wcz;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wcz;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p1, v0, La/wcz;->j:La/bnn0;

    .line 51
    .line 52
    move-object p2, p1

    .line 53
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    iget-object p1, v0, La/wcz;->i:La/c050;

    .line 56
    .line 57
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p3, p0, La/xcz;->f:La/pz40;

    .line 65
    .line 66
    check-cast p3, La/hgk0;

    .line 67
    .line 68
    invoke-virtual {p3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    sget-object v2, La/ddz;->a:La/mcz;

    .line 73
    .line 74
    if-ne p3, v2, :cond_4

    .line 75
    .line 76
    iput-object p1, v0, La/wcz;->i:La/c050;

    .line 77
    .line 78
    move-object p3, p2

    .line 79
    check-cast p3, La/bnn0;

    .line 80
    .line 81
    iput-object p3, v0, La/wcz;->j:La/bnn0;

    .line 82
    .line 83
    iput v5, v0, La/wcz;->m:I

    .line 84
    .line 85
    iget-object p3, p0, La/xcz;->n:La/la5;

    .line 86
    .line 87
    invoke-virtual {p3, v0}, La/la5;->i(La/zje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    if-ne p3, v1, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    :goto_1
    iput-object v3, v0, La/wcz;->i:La/c050;

    .line 95
    .line 96
    iput-object v3, v0, La/wcz;->j:La/bnn0;

    .line 97
    .line 98
    iput v4, v0, La/wcz;->m:I

    .line 99
    .line 100
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2, v0}, La/ywj;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->v:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->u:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(IILa/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/vcz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/vcz;

    .line 7
    .line 8
    iget v1, v0, La/vcz;->k:I

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
    iput v1, v0, La/vcz;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vcz;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/vcz;-><init>(La/xcz;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/vcz;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vcz;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput-boolean v5, p0, La/xcz;->i:Z

    .line 54
    .line 55
    new-instance p3, La/ydu;

    .line 56
    .line 57
    invoke-direct {p3, p0, p1, p2, v3}, La/ydu;-><init>(La/xcz;IILa/yje;)V

    .line 58
    .line 59
    .line 60
    iput v5, v0, La/vcz;->k:I

    .line 61
    .line 62
    sget-object p1, La/c050;->a:La/c050;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p3, v0}, La/xcz;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    if-ne p1, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    iput-boolean v4, p0, La/xcz;->i:Z

    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :goto_2
    iput-boolean v4, p0, La/xcz;->i:Z

    .line 77
    .line 78
    throw p1
.end method

.method public final g(La/mcz;ZZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/mcz;->l:Ljava/util/List;

    .line 6
    .line 7
    iget v3, v1, La/mcz;->b:I

    .line 8
    .line 9
    iget-object v4, v1, La/mcz;->a:La/ncz;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, v0, La/xcz;->q:La/tbz;

    .line 16
    .line 17
    iput v5, v6, La/tbz;->e:I

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    iget-object v6, v0, La/xcz;->x:La/ieu;

    .line 21
    .line 22
    iget-object v7, v0, La/xcz;->e:La/t8z;

    .line 23
    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    iget-boolean v8, v0, La/xcz;->b:Z

    .line 27
    .line 28
    if-eqz v8, :cond_2

    .line 29
    .line 30
    iput-object v1, v0, La/xcz;->c:La/mcz;

    .line 31
    .line 32
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    :cond_0
    invoke-static {v1}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :try_start_0
    invoke-virtual {v6}, La/ieu;->o()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    iget v0, v4, La/ncz;->a:I

    .line 55
    .line 56
    iget-object v4, v7, La/t8z;->b:La/cgk0;

    .line 57
    .line 58
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v0, v4, :cond_1

    .line 63
    .line 64
    iget-object v0, v7, La/t8z;->c:La/cgk0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne v3, v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {v6}, La/ieu;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    :goto_0
    invoke-static {v1, v2, v5}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :goto_1
    invoke-static {v1, v2, v5}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    const/4 v8, 0x1

    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    iput-boolean v8, v0, La/xcz;->b:Z

    .line 90
    .line 91
    :cond_3
    if-eqz v4, :cond_4

    .line 92
    .line 93
    iget v10, v4, La/ncz;->a:I

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    const/4 v10, 0x0

    .line 97
    :goto_2
    if-nez v10, :cond_6

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    const/4 v10, 0x0

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    :goto_3
    move v10, v8

    .line 105
    :goto_4
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    iget-object v11, v0, La/xcz;->v:La/pz40;

    .line 110
    .line 111
    check-cast v11, La/hgk0;

    .line 112
    .line 113
    invoke-virtual {v11, v10}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-boolean v10, v1, La/mcz;->c:Z

    .line 117
    .line 118
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    iget-object v11, v0, La/xcz;->u:La/pz40;

    .line 123
    .line 124
    check-cast v11, La/hgk0;

    .line 125
    .line 126
    invoke-virtual {v11, v10}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget v10, v0, La/xcz;->h:F

    .line 130
    .line 131
    iget v11, v1, La/mcz;->d:F

    .line 132
    .line 133
    sub-float/2addr v10, v11

    .line 134
    iput v10, v0, La/xcz;->h:F

    .line 135
    .line 136
    iget-object v10, v0, La/xcz;->f:La/pz40;

    .line 137
    .line 138
    check-cast v10, La/hgk0;

    .line 139
    .line 140
    invoke-virtual {v10, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    const-string v10, "scrollOffset should be non-negative"

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    if-eqz p3, :cond_8

    .line 147
    .line 148
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    int-to-float v0, v3

    .line 152
    cmpl-float v0, v0, v11

    .line 153
    .line 154
    if-ltz v0, :cond_7

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    invoke-static {v10}, La/adx;->c(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :goto_5
    iget-object v0, v7, La/t8z;->c:La/cgk0;

    .line 161
    .line 162
    invoke-virtual {v0, v3}, La/cgk0;->m(I)V

    .line 163
    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_8
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    check-cast v12, La/ncz;

    .line 171
    .line 172
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, La/ncz;

    .line 177
    .line 178
    const-wide/16 v13, -0x1

    .line 179
    .line 180
    if-eqz v12, :cond_9

    .line 181
    .line 182
    iget v12, v12, La/ncz;->a:I

    .line 183
    .line 184
    move-object v15, v10

    .line 185
    int-to-long v9, v12

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    move-object v15, v10

    .line 188
    move-wide v9, v13

    .line 189
    :goto_6
    const-string v12, "firstVisibleItem:index"

    .line 190
    .line 191
    invoke-static {v9, v10, v12}, La/ahy;->k0(JLjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    if-eqz v2, :cond_a

    .line 195
    .line 196
    iget v2, v2, La/ncz;->a:I

    .line 197
    .line 198
    int-to-long v13, v2

    .line 199
    :cond_a
    const-string v2, "lastVisibleItem:index"

    .line 200
    .line 201
    invoke-static {v13, v14, v2}, La/ahy;->k0(JLjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    if-eqz v4, :cond_b

    .line 208
    .line 209
    iget-object v5, v4, La/ncz;->l:Ljava/lang/Object;

    .line 210
    .line 211
    :cond_b
    iput-object v5, v7, La/t8z;->e:Ljava/lang/Object;

    .line 212
    .line 213
    iget-boolean v2, v7, La/t8z;->d:Z

    .line 214
    .line 215
    if-nez v2, :cond_c

    .line 216
    .line 217
    iget v2, v1, La/mcz;->o:I

    .line 218
    .line 219
    if-lez v2, :cond_f

    .line 220
    .line 221
    :cond_c
    iput-boolean v8, v7, La/t8z;->d:Z

    .line 222
    .line 223
    int-to-float v2, v3

    .line 224
    cmpl-float v2, v2, v11

    .line 225
    .line 226
    if-ltz v2, :cond_d

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_d
    invoke-static {v15}, La/adx;->c(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_7
    if-eqz v4, :cond_e

    .line 233
    .line 234
    iget v9, v4, La/ncz;->a:I

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_e
    const/4 v9, 0x0

    .line 238
    :goto_8
    invoke-virtual {v7, v9, v3}, La/t8z;->a(II)V

    .line 239
    .line 240
    .line 241
    :cond_f
    iget-boolean v2, v0, La/xcz;->k:Z

    .line 242
    .line 243
    if-eqz v2, :cond_10

    .line 244
    .line 245
    iget-object v2, v0, La/xcz;->a:La/pcz;

    .line 246
    .line 247
    iget-object v0, v0, La/xcz;->r:La/jru;

    .line 248
    .line 249
    invoke-interface {v2, v0, v1}, La/pcz;->a(La/jru;La/mcz;)V

    .line 250
    .line 251
    .line 252
    :cond_10
    :goto_9
    if-eqz p2, :cond_11

    .line 253
    .line 254
    iget v0, v1, La/mcz;->f:F

    .line 255
    .line 256
    iget-object v2, v1, La/mcz;->i:La/w6k;

    .line 257
    .line 258
    iget-object v1, v1, La/mcz;->h:La/vne;

    .line 259
    .line 260
    invoke-virtual {v6, v0, v2, v1}, La/ieu;->s(FLa/w6k;La/vne;)V

    .line 261
    .line 262
    .line 263
    :cond_11
    return-void
.end method

.method public final h()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->e:La/t8z;

    .line 2
    .line 3
    iget-object p0, p0, La/t8z;->b:La/cgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->e:La/t8z;

    .line 2
    .line 3
    iget-object p0, p0, La/t8z;->c:La/cgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final j()La/mcz;
    .locals 0

    .line 1
    iget-object p0, p0, La/xcz;->f:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mcz;

    .line 10
    .line 11
    return-object p0
.end method

.method public final k(II)V
    .locals 4

    .line 1
    iget-object v0, p0, La/xcz;->j:La/ywj;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/xcz;->f:La/pz40;

    .line 10
    .line 11
    check-cast v0, La/hgk0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/mcz;

    .line 18
    .line 19
    iget-object v0, v0, La/mcz;->h:La/vne;

    .line 20
    .line 21
    new-instance v1, La/wi6;

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, p0, v3, v2}, La/wi6;-><init>(La/xcz;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {v0, v3, v3, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, p1, p2, v0}, La/xcz;->m(IIZ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final l(IILa/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, La/c9z;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x1

    .line 5
    move-object v1, p0

    .line 6
    move v2, p1

    .line 7
    move v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, La/c9z;-><init>(La/bch0;IILa/yje;B)V

    .line 9
    .line 10
    .line 11
    sget-object p0, La/c050;->a:La/c050;

    .line 12
    .line 13
    invoke-virtual {v1, p0, v0, p3}, La/xcz;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method public final m(IIZ)V
    .locals 4

    .line 1
    iget-object v0, p0, La/xcz;->e:La/t8z;

    .line 2
    .line 3
    iget-object v1, v0, La/t8z;->b:La/cgk0;

    .line 4
    .line 5
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, La/t8z;->c:La/cgk0;

    .line 13
    .line 14
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, p2, :cond_2

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, La/xcz;->o:La/dbz;

    .line 21
    .line 22
    invoke-virtual {v1}, La/dbz;->e()V

    .line 23
    .line 24
    .line 25
    iput-object v2, v1, La/dbz;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    iput v3, v1, La/dbz;->c:I

    .line 29
    .line 30
    iget-object v1, p0, La/xcz;->a:La/pcz;

    .line 31
    .line 32
    instance-of v3, v1, La/sj9;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    check-cast v1, La/sj9;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v1, v2

    .line 40
    :goto_0
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, La/sj9;->k()V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0, p1, p2}, La/t8z;->a(II)V

    .line 46
    .line 47
    .line 48
    iput-object v2, v0, La/t8z;->e:Ljava/lang/Object;

    .line 49
    .line 50
    if-eqz p3, :cond_4

    .line 51
    .line 52
    iget-object p0, p0, La/xcz;->l:La/e7z;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, La/e7z;->l()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void

    .line 60
    :cond_4
    iget-object p0, p0, La/xcz;->t:La/pz40;

    .line 61
    .line 62
    invoke-static {p0}, La/m8x;->Z(La/pz40;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
