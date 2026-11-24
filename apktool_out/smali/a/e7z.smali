.class public final La/e7z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zjd;
.implements La/dg80;
.implements La/mkd;


# static fields
.field public static final t1:La/neg0;

.field public static final u1:La/pcy;

.field public static final v1:La/z6z;

.field public static final w1:La/l13;


# instance fields
.field public A:La/k6z;

.field public B:La/wgu0;

.field public Y:La/xld;

.field public Z:La/c7z;

.field public final a:Z

.field public b:I

.field public c:Z

.field public d:J

.field public e:Z

.field public f:Z

.field public f1:La/c7z;

.field public g:I

.field public g1:Z

.field public h:Z

.field public final h1:La/tzi;

.field public i:La/e7z;

.field public final i1:La/i7z;

.field public j:I

.field public j1:La/r7z;

.field public final k:La/nw20;

.field public k1:La/s460;

.field public l:La/xz40;

.field public l1:Z

.field public m:Z

.field public m1:La/mm40;

.field public n:La/e7z;

.field public n1:La/mm40;

.field public o:La/cg80;

.field public o1:La/d33;

.field public p:La/bhu0;

.field public p1:La/e33;

.field public q:I

.field public q1:Z

.field public r:Z

.field public r1:I

.field public s:Z

.field public s1:Z

.field public t:La/nai0;

.field public u:Z

.field public final v:La/xz40;

.field public w:Z

.field public x:La/tj30;

.field public y:La/u8u;

.field public z:La/w6k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/neg0;

    .line 2
    .line 3
    const-string v1, "Undefined intrinsics block and it is required"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, La/neg0;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/e7z;->t1:La/neg0;

    .line 10
    .line 11
    new-instance v0, La/pcy;

    .line 12
    .line 13
    const/16 v1, 0x12

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/pcy;-><init>(B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/e7z;->u1:La/pcy;

    .line 19
    .line 20
    new-instance v0, La/z6z;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/e7z;->v1:La/z6z;

    .line 26
    .line 27
    new-instance v0, La/l13;

    .line 28
    .line 29
    const/16 v1, 0x13

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/l13;-><init>(B)V

    .line 32
    .line 33
    .line 34
    sput-object v0, La/e7z;->w1:La/l13;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v0

    .line 109
    :goto_0
    sget-object v1, La/pai0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 110
    invoke-direct {p0, p1, v0}, La/e7z;-><init>(ZI)V

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/e7z;->a:Z

    .line 5
    .line 6
    iput p2, p0, La/e7z;->b:I

    .line 7
    .line 8
    const-wide p1, 0x7fffffff7fffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/e7z;->d:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, La/e7z;->e:Z

    .line 17
    .line 18
    iput-boolean p1, p0, La/e7z;->f:Z

    .line 19
    .line 20
    const/4 p2, -0x4

    .line 21
    iput p2, p0, La/e7z;->g:I

    .line 22
    .line 23
    new-instance p2, La/nw20;

    .line 24
    .line 25
    new-instance v0, La/xz40;

    .line 26
    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    new-array v2, v1, [La/e7z;

    .line 30
    .line 31
    invoke-direct {v0, v2}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, La/y2x;

    .line 35
    .line 36
    const/16 v3, 0x1b

    .line 37
    .line 38
    invoke-direct {v2, p0, v3}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, v0, v2}, La/nw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, La/e7z;->k:La/nw20;

    .line 45
    .line 46
    new-instance p2, La/xz40;

    .line 47
    .line 48
    new-array v0, v1, [La/e7z;

    .line 49
    .line 50
    invoke-direct {p2, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, La/e7z;->v:La/xz40;

    .line 54
    .line 55
    iput-boolean p1, p0, La/e7z;->w:Z

    .line 56
    .line 57
    sget-object p2, La/e7z;->t1:La/neg0;

    .line 58
    .line 59
    iput-object p2, p0, La/e7z;->x:La/tj30;

    .line 60
    .line 61
    sget-object p2, La/h7z;->a:La/z6k;

    .line 62
    .line 63
    iput-object p2, p0, La/e7z;->z:La/w6k;

    .line 64
    .line 65
    sget-object p2, La/k6z;->a:La/k6z;

    .line 66
    .line 67
    iput-object p2, p0, La/e7z;->A:La/k6z;

    .line 68
    .line 69
    sget-object p2, La/e7z;->v1:La/z6z;

    .line 70
    .line 71
    iput-object p2, p0, La/e7z;->B:La/wgu0;

    .line 72
    .line 73
    sget-object p2, La/xld;->d0:La/wld;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object p2, La/wld;->b:La/bh90;

    .line 79
    .line 80
    iput-object p2, p0, La/e7z;->Y:La/xld;

    .line 81
    .line 82
    sget-object p2, La/c7z;->c:La/c7z;

    .line 83
    .line 84
    iput-object p2, p0, La/e7z;->Z:La/c7z;

    .line 85
    .line 86
    iput-object p2, p0, La/e7z;->f1:La/c7z;

    .line 87
    .line 88
    new-instance p2, La/tzi;

    .line 89
    .line 90
    invoke-direct {p2, p0}, La/tzi;-><init>(La/e7z;)V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, La/e7z;->h1:La/tzi;

    .line 94
    .line 95
    new-instance p2, La/i7z;

    .line 96
    .line 97
    invoke-direct {p2, p0}, La/i7z;-><init>(La/e7z;)V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, La/e7z;->i1:La/i7z;

    .line 101
    .line 102
    iput-boolean p1, p0, La/e7z;->l1:Z

    .line 103
    .line 104
    sget-object p1, La/jm40;->b:La/jm40;

    .line 105
    .line 106
    iput-object p1, p0, La/e7z;->m1:La/mm40;

    .line 107
    .line 108
    return-void
.end method

.method public static U(La/e7z;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_2
    iget-object p2, p0, La/e7z;->i:La/e7z;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 26
    .line 27
    invoke-static {p2}, La/xcx;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget-object p2, p0, La/e7z;->o:La/cg80;

    .line 31
    .line 32
    if-nez p2, :cond_4

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_4
    iget-boolean v3, p0, La/e7z;->r:Z

    .line 36
    .line 37
    if-nez v3, :cond_b

    .line 38
    .line 39
    iget-boolean v3, p0, La/e7z;->a:Z

    .line 40
    .line 41
    if-nez v3, :cond_b

    .line 42
    .line 43
    check-cast p2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 44
    .line 45
    invoke-virtual {p2, p0, v2, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->x(La/e7z;ZZZ)V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 51
    .line 52
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/i810;->f:La/i7z;

    .line 58
    .line 59
    iget-object p2, p0, La/i7z;->a:La/e7z;

    .line 60
    .line 61
    invoke-virtual {p2}, La/e7z;->v()La/e7z;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object p0, p0, La/i7z;->a:La/e7z;

    .line 66
    .line 67
    iget-object p0, p0, La/e7z;->Z:La/c7z;

    .line 68
    .line 69
    if-eqz p2, :cond_b

    .line 70
    .line 71
    sget-object v0, La/c7z;->c:La/c7z;

    .line 72
    .line 73
    if-eq p0, v0, :cond_b

    .line 74
    .line 75
    :goto_2
    iget-object v0, p2, La/e7z;->Z:La/c7z;

    .line 76
    .line 77
    if-ne v0, p0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p2}, La/e7z;->v()La/e7z;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object p2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_9

    .line 93
    .line 94
    if-ne p0, v2, :cond_8

    .line 95
    .line 96
    iget-object p0, p2, La/e7z;->i:La/e7z;

    .line 97
    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2, p1}, La/e7z;->T(Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_7
    invoke-virtual {p2, p1}, La/e7z;->V(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 109
    .line 110
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_9
    iget-object p0, p2, La/e7z;->i:La/e7z;

    .line 115
    .line 116
    const/4 v0, 0x6

    .line 117
    if-eqz p0, :cond_a

    .line 118
    .line 119
    invoke-static {p2, p1, v0}, La/e7z;->U(La/e7z;ZI)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    invoke-static {p2, p1, v0}, La/e7z;->W(La/e7z;ZI)V

    .line 124
    .line 125
    .line 126
    :cond_b
    :goto_4
    return-void
.end method

.method public static W(La/e7z;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move p2, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move p2, v1

    .line 22
    :goto_1
    iget-boolean v3, p0, La/e7z;->r:Z

    .line 23
    .line 24
    if-nez v3, :cond_8

    .line 25
    .line 26
    iget-boolean v3, p0, La/e7z;->a:Z

    .line 27
    .line 28
    if-nez v3, :cond_8

    .line 29
    .line 30
    iget-object v3, p0, La/e7z;->o:La/cg80;

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_3
    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    invoke-virtual {v3, p0, v1, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->x(La/e7z;ZZZ)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_8

    .line 41
    .line 42
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 43
    .line 44
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 45
    .line 46
    iget-object p0, p0, La/sj30;->f:La/i7z;

    .line 47
    .line 48
    iget-object p2, p0, La/i7z;->a:La/e7z;

    .line 49
    .line 50
    invoke-virtual {p2}, La/e7z;->v()La/e7z;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object p0, p0, La/i7z;->a:La/e7z;

    .line 55
    .line 56
    iget-object p0, p0, La/e7z;->Z:La/c7z;

    .line 57
    .line 58
    if-eqz p2, :cond_8

    .line 59
    .line 60
    sget-object v0, La/c7z;->c:La/c7z;

    .line 61
    .line 62
    if-eq p0, v0, :cond_8

    .line 63
    .line 64
    :goto_2
    iget-object v0, p2, La/e7z;->Z:La/c7z;

    .line 65
    .line 66
    if-ne v0, p0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p2}, La/e7z;->v()La/e7z;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    if-ne p0, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2, p1}, La/e7z;->V(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 90
    .line 91
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    const/4 p0, 0x6

    .line 96
    invoke-static {p2, p1, p0}, La/e7z;->W(La/e7z;ZI)V

    .line 97
    .line 98
    .line 99
    :cond_8
    :goto_4
    return-void
.end method

.method public static X(La/e7z;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object v1, v0, La/i7z;->d:La/a7z;

    .line 4
    .line 5
    sget-object v2, La/d7z;->a:[I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v1, v2, v1

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v1, v2, :cond_4

    .line 15
    .line 16
    iget-boolean v1, v0, La/i7z;->e:Z

    .line 17
    .line 18
    const/4 v3, 0x6

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {p0, v2, v3}, La/e7z;->U(La/e7z;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-boolean v0, v0, La/i7z;->f:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, La/e7z;->T(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, La/e7z;->r()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {p0, v2, v3}, La/e7z;->W(La/e7z;ZI)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, La/e7z;->q()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v2}, La/e7z;->V(Z)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void

    .line 52
    :cond_4
    iget-object p0, v0, La/i7z;->d:La/a7z;

    .line 53
    .line 54
    const-string v0, "Unexpected state "

    .line 55
    .line 56
    invoke-static {p0, v0}, La/hny;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private final k(La/e7z;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/e7z;->h(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object v1, p1, La/e7z;->n:La/e7z;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, La/e7z;->h(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Cannot insert "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, " because it already has a parent or an owner. This tree: "

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " Other tree: "

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public final A()La/xz40;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/e7z;->g0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/e7z;->j:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/e7z;->k:La/nw20;

    .line 9
    .line 10
    iget-object p0, p0, La/nw20;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/xz40;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object p0, p0, La/e7z;->l:La/xz40;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final B(JLa/raw;IZ)V
    .locals 9

    .line 1
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 2
    .line 3
    iget-object v0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/s460;

    .line 6
    .line 7
    sget-object v1, La/s460;->w1:La/mb50;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, La/s460;->d1(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    iget-object p0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    check-cast v2, La/s460;

    .line 17
    .line 18
    sget-object v3, La/s460;->B1:La/q460;

    .line 19
    .line 20
    move-object v6, p3

    .line 21
    move v7, p4

    .line 22
    move v8, p5

    .line 23
    invoke-virtual/range {v2 .. v8}, La/s460;->m1(La/r460;JLa/raw;IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final C(ILa/e7z;)V
    .locals 2

    .line 1
    iget-object v0, p2, La/e7z;->n:La/e7z;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, La/e7z;->o:La/cg80;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p2}, La/e7z;->k(La/e7z;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p0, p2, La/e7z;->n:La/e7z;

    .line 18
    .line 19
    iget-object v0, p0, La/e7z;->k:La/nw20;

    .line 20
    .line 21
    iget-object v1, v0, La/nw20;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/xz40;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, La/xz40;->a(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, La/nw20;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, La/y2x;

    .line 31
    .line 32
    invoke-virtual {p1}, La/y2x;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/e7z;->P()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p2, La/e7z;->a:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, La/e7z;->j:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, La/e7z;->j:I

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, La/e7z;->H()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/e7z;->o:La/cg80;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, p1}, La/e7z;->c(La/cg80;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p2, La/e7z;->i1:La/i7z;

    .line 59
    .line 60
    iget p1, p1, La/i7z;->l:I

    .line 61
    .line 62
    if-lez p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, La/e7z;->i1:La/i7z;

    .line 65
    .line 66
    iget v0, p1, La/i7z;->l:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, La/i7z;->d(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p1, p2, La/e7z;->r1:I

    .line 74
    .line 75
    if-lez p1, :cond_5

    .line 76
    .line 77
    iget p1, p0, La/e7z;->r1:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/e7z;->b0(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/e7z;->l1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 6
    .line 7
    iget-object v1, v0, La/tzi;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/rdx;

    .line 10
    .line 11
    iget-object v0, v0, La/tzi;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/s460;

    .line 14
    .line 15
    iget-object v0, v0, La/s460;->w:La/s460;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-object v2, p0, La/e7z;->k1:La/s460;

    .line 19
    .line 20
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v3, v1, La/s460;->u1:La/bg80;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move-object v3, v2

    .line 32
    :goto_1
    if-eqz v3, :cond_1

    .line 33
    .line 34
    iput-object v1, p0, La/e7z;->k1:La/s460;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v1, La/s460;->w:La/s460;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v1, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, La/e7z;->l1:Z

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, La/e7z;->k1:La/s460;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    iget-object v1, v0, La/s460;->u1:La/bg80;

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_5
    const-string p0, "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"

    .line 57
    .line 58
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    throw p0

    .line 63
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 64
    .line 65
    invoke-virtual {v0}, La/s460;->o1()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_7
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_8

    .line 74
    .line 75
    invoke-virtual {v0}, La/e7z;->D()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_8
    iget-object p0, p0, La/e7z;->o:La/cg80;

    .line 80
    .line 81
    if-eqz p0, :cond_9

    .line 82
    .line 83
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 86
    .line 87
    .line 88
    :cond_9
    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 2
    .line 3
    iget-object v0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/s460;

    .line 6
    .line 7
    iget-object p0, p0, La/tzi;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/rdx;

    .line 10
    .line 11
    :goto_0
    if-eq v0, p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, La/x6z;

    .line 17
    .line 18
    iget-object v1, v0, La/s460;->u1:La/bg80;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v1, La/gfv;

    .line 23
    .line 24
    invoke-virtual {v1}, La/gfv;->c()V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, v0, La/s460;->v:La/s460;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p0, p0, La/s460;->u1:La/bg80;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    check-cast p0, La/gfv;

    .line 35
    .line 36
    invoke-virtual {p0}, La/gfv;->c()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final F()V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/e7z;->F()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, La/e7z;->i:La/e7z;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, La/e7z;->U(La/e7z;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0, v2, v1}, La/e7z;->W(La/e7z;ZI)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final G()V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/e7z;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 7
    .line 8
    iget-object v0, v0, La/tzi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/o460;

    .line 11
    .line 12
    iget-object v0, v0, La/lm40;->f:La/lm40;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, La/e7z;->n1:La/mm40;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :goto_0
    iput-boolean v1, p0, La/e7z;->s:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-object v0, p0, La/e7z;->t:La/nai0;

    .line 26
    .line 27
    iput-boolean v1, p0, La/e7z;->u:Z

    .line 28
    .line 29
    new-instance v1, La/mie0;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v2, La/nai0;

    .line 35
    .line 36
    invoke-direct {v2}, La/nai0;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, v1, La/mie0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {p0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, La/cg80;->getSnapshotObserver()La/eg80;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, La/wqv;

    .line 50
    .line 51
    const/16 v4, 0x1c

    .line 52
    .line 53
    invoke-direct {v3, p0, v1, v4}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v2, La/eg80;->d:La/r580;

    .line 57
    .line 58
    iget-object v2, v2, La/eg80;->a:La/pgk0;

    .line 59
    .line 60
    invoke-virtual {v2, p0, v4, v3}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    iput-boolean v2, p0, La/e7z;->u:Z

    .line 65
    .line 66
    iget-object v1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, La/nai0;

    .line 69
    .line 70
    iput-object v1, p0, La/e7z;->t:La/nai0;

    .line 71
    .line 72
    iput-boolean v2, p0, La/e7z;->s:Z

    .line 73
    .line 74
    invoke-static {p0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, La/cg80;->getSemanticsOwner()La/wai0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, p0, v0}, La/wai0;->b(La/e7z;La/nai0;)V

    .line 83
    .line 84
    .line 85
    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->z()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final H()V
    .locals 1

    .line 1
    iget v0, p0, La/e7z;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/e7z;->m:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/e7z;->n:La/e7z;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, La/e7z;->H()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->o:La/cg80;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final J()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget-boolean p0, p0, La/sj30;->t:Z

    .line 6
    .line 7
    return p0
.end method

.method public final K()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, La/i810;->r:La/h810;

    .line 8
    .line 9
    sget-object v0, La/h810;->c:La/h810;

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final L()V
    .locals 6

    .line 1
    iget-object v0, p0, La/e7z;->Z:La/c7z;

    .line 2
    .line 3
    sget-object v1, La/c7z;->c:La/c7z;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/e7z;->g()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 11
    .line 12
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    :try_start_0
    iput-boolean v0, p0, La/i810;->g:Z

    .line 20
    .line 21
    iget-boolean v2, p0, La/i810;->l:Z

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "replace() called on item that was not placed"

    .line 26
    .line 27
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    iput-boolean v1, p0, La/i810;->Y:Z

    .line 34
    .line 35
    iget-object v2, p0, La/i810;->r:La/h810;

    .line 36
    .line 37
    sget-object v3, La/h810;->c:La/h810;

    .line 38
    .line 39
    if-eq v2, v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v0, v1

    .line 43
    :goto_1
    iget-wide v2, p0, La/i810;->o:J

    .line 44
    .line 45
    iget-object v4, p0, La/i810;->p:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    iget-object v5, p0, La/i810;->q:La/dfv;

    .line 48
    .line 49
    invoke-virtual {p0, v2, v3, v4, v5}, La/i810;->J0(JLkotlin/jvm/functions/Function1;La/dfv;)V

    .line 50
    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-boolean v0, p0, La/i810;->Y:Z

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, La/i810;->f:La/i7z;

    .line 59
    .line 60
    iget-object v0, v0, La/i7z;->a:La/e7z;

    .line 61
    .line 62
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/e7z;->T(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    iput-boolean v1, p0, La/i810;->g:Z

    .line 72
    .line 73
    return-void

    .line 74
    :goto_2
    iput-boolean v1, p0, La/i810;->g:Z

    .line 75
    .line 76
    throw v0
.end method

.method public final M(III)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, La/e7z;->k:La/nw20;

    .line 23
    .line 24
    iget-object v4, v3, La/nw20;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, La/xz40;

    .line 27
    .line 28
    iget-object v5, v3, La/nw20;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, La/y2x;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, La/xz40;->k(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v5}, La/y2x;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, La/e7z;

    .line 40
    .line 41
    iget-object v3, v3, La/nw20;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, La/xz40;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, La/xz40;->a(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, La/y2x;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, La/e7z;->P()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/e7z;->H()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/e7z;->F()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final N(La/e7z;)V
    .locals 4

    .line 1
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget v0, v0, La/i7z;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 8
    .line 9
    iget v1, v0, La/i7z;->l:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/i7z;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, La/e7z;->i()V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, La/e7z;->n:La/e7z;

    .line 25
    .line 26
    iget v1, p1, La/e7z;->r1:I

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, La/e7z;->r1:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, La/e7z;->b0(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p1, La/e7z;->h1:La/tzi;

    .line 38
    .line 39
    iget-object v1, v1, La/tzi;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/s460;

    .line 42
    .line 43
    iput-object v0, v1, La/s460;->w:La/s460;

    .line 44
    .line 45
    iget-boolean v1, p1, La/e7z;->a:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget v1, p0, La/e7z;->j:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    iput v1, p0, La/e7z;->j:I

    .line 54
    .line 55
    iget-object p1, p1, La/e7z;->k:La/nw20;

    .line 56
    .line 57
    iget-object p1, p1, La/nw20;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/xz40;

    .line 60
    .line 61
    iget-object v1, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 62
    .line 63
    iget p1, p1, La/xz40;->c:I

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    :goto_0
    if-ge v2, p1, :cond_3

    .line 67
    .line 68
    aget-object v3, v1, v2

    .line 69
    .line 70
    check-cast v3, La/e7z;

    .line 71
    .line 72
    iget-object v3, v3, La/e7z;->h1:La/tzi;

    .line 73
    .line 74
    iget-object v3, v3, La/tzi;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, La/s460;

    .line 77
    .line 78
    iput-object v0, v3, La/s460;->w:La/s460;

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {p0}, La/e7z;->H()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, La/e7z;->P()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final O(La/s460;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/cg80;->getRectManager()La/oge0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, La/e7z;->i1:La/i7z;

    .line 12
    .line 13
    iget-object v2, v1, La/i7z;->d:La/a7z;

    .line 14
    .line 15
    sget-object v3, La/a7z;->e:La/a7z;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    if-ne v2, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, La/e7z;->r()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, La/e7z;->q()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v4

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    :goto_1
    move v2, v5

    .line 37
    :goto_2
    iget v3, p0, La/e7z;->g:I

    .line 38
    .line 39
    const/4 v6, -0x4

    .line 40
    if-eq v3, v6, :cond_7

    .line 41
    .line 42
    if-eqz v0, :cond_7

    .line 43
    .line 44
    iget-object v3, p0, La/e7z;->h1:La/tzi;

    .line 45
    .line 46
    iget-object v3, v3, La/tzi;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, La/s460;

    .line 49
    .line 50
    if-ne p1, v3, :cond_3

    .line 51
    .line 52
    iput-boolean v5, p0, La/e7z;->f:Z

    .line 53
    .line 54
    if-nez v2, :cond_7

    .line 55
    .line 56
    invoke-virtual {v0, p0}, La/oge0;->g(La/e7z;)V

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_3
    iput-boolean v5, p0, La/e7z;->e:Z

    .line 61
    .line 62
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v3, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 67
    .line 68
    iget p1, p1, La/xz40;->c:I

    .line 69
    .line 70
    :goto_3
    if-ge v4, p1, :cond_5

    .line 71
    .line 72
    aget-object v7, v3, v4

    .line 73
    .line 74
    check-cast v7, La/e7z;

    .line 75
    .line 76
    iput-boolean v5, v7, La/e7z;->f:Z

    .line 77
    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0, v7}, La/oge0;->g(La/e7z;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget p1, p0, La/e7z;->g:I

    .line 87
    .line 88
    if-eq p1, v6, :cond_6

    .line 89
    .line 90
    iput-boolean v5, v0, La/oge0;->f:Z

    .line 91
    .line 92
    invoke-virtual {v0, p0}, La/oge0;->d(La/e7z;)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    iget-object p1, v0, La/oge0;->c:La/zz2;

    .line 97
    .line 98
    iget-object p1, p1, La/zz2;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, [J

    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x2

    .line 103
    .line 104
    aget-wide v2, p1, p0

    .line 105
    .line 106
    const/16 v4, 0x3f

    .line 107
    .line 108
    shr-long v4, v2, v4

    .line 109
    .line 110
    const-wide/16 v6, 0x1

    .line 111
    .line 112
    and-long/2addr v4, v6

    .line 113
    const/16 v6, 0x3c

    .line 114
    .line 115
    shl-long/2addr v4, v6

    .line 116
    or-long/2addr v2, v4

    .line 117
    aput-wide v2, p1, p0

    .line 118
    .line 119
    :cond_6
    invoke-virtual {v0}, La/oge0;->j()V

    .line 120
    .line 121
    .line 122
    :cond_7
    :goto_4
    iget-object p0, v1, La/i7z;->p:La/sj30;

    .line 123
    .line 124
    invoke-virtual {p0}, La/sj30;->N0()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/e7z;->P()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, La/e7z;->w:Z

    .line 17
    .line 18
    return-void
.end method

.method public final Q()V
    .locals 4

    .line 1
    iget-object v0, p0, La/e7z;->k:La/nw20;

    .line 2
    .line 3
    iget-object v1, v0, La/nw20;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/xz40;

    .line 6
    .line 7
    iget v1, v1, La/xz40;->c:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    iget-object v2, v0, La/nw20;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/xz40;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, La/e7z;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, La/e7z;->N(La/e7z;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, La/xz40;->g()V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/y2x;

    .line 36
    .line 37
    invoke-virtual {p0}, La/y2x;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final R(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "count ("

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ") must be greater than 0"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/2addr p2, p1

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    if-gt p1, p2, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, La/e7z;->k:La/nw20;

    .line 32
    .line 33
    iget-object v1, v0, La/nw20;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, La/xz40;

    .line 36
    .line 37
    iget-object v1, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v1, v1, p2

    .line 40
    .line 41
    check-cast v1, La/e7z;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, La/e7z;->N(La/e7z;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, La/nw20;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/xz40;

    .line 49
    .line 50
    invoke-virtual {v1, p2}, La/xz40;->k(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/y2x;

    .line 57
    .line 58
    invoke-virtual {v0}, La/y2x;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v1, La/e7z;

    .line 62
    .line 63
    if-eq p2, p1, :cond_1

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 8

    .line 1
    iget-object v0, p0, La/e7z;->Z:La/c7z;

    .line 2
    .line 3
    sget-object v1, La/c7z;->c:La/c7z;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/e7z;->g()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 11
    .line 12
    iget-object v1, p0, La/i7z;->p:La/sj30;

    .line 13
    .line 14
    iget-object p0, v1, La/sj30;->f:La/i7z;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_0
    iput-boolean v0, v1, La/sj30;->g:Z

    .line 19
    .line 20
    iget-boolean v0, v1, La/sj30;->k:Z

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, "replace called on unplaced item"

    .line 25
    .line 26
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget-boolean v0, v1, La/sj30;->t:Z

    .line 33
    .line 34
    iget-wide v2, v1, La/sj30;->n:J

    .line 35
    .line 36
    iget v4, v1, La/sj30;->q:F

    .line 37
    .line 38
    iget-object v5, v1, La/sj30;->o:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    iget-object v6, v1, La/sj30;->p:La/dfv;

    .line 41
    .line 42
    invoke-virtual/range {v1 .. v6}, La/sj30;->I0(JFLkotlin/jvm/functions/Function1;La/dfv;)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-boolean v0, v1, La/sj30;->h1:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, La/i7z;->a:La/e7z;

    .line 52
    .line 53
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v7}, La/e7z;->V(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_2
    iput-boolean v7, v1, La/sj30;->g:Z

    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_1
    iget-object p0, p0, La/i7z;->a:La/e7z;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/e7z;->Z(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    iput-boolean v7, v1, La/sj30;->g:Z

    .line 75
    .line 76
    throw p0
.end method

.method public final T(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->y(La/e7z;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final V(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->y(La/e7z;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final Y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p0, p0, La/xz40;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, La/e7z;

    .line 15
    .line 16
    iget-object v3, v2, La/e7z;->f1:La/c7z;

    .line 17
    .line 18
    iput-object v3, v2, La/e7z;->Z:La/c7z;

    .line 19
    .line 20
    sget-object v4, La/c7z;->c:La/c7z;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, La/e7z;->Y()V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final Z(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/e7z;->Y:La/xld;

    .line 2
    .line 3
    sget-object v1, La/sld;->a:La/zfn;

    .line 4
    .line 5
    check-cast v0, La/bh90;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, La/qld;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast v0, La/rld;

    .line 19
    .line 20
    new-instance v1, La/yw9;

    .line 21
    .line 22
    const/16 v2, 0x12

    .line 23
    .line 24
    invoke-direct {v1, v0, p0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1}, La/sac;->t0(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    throw p1
.end method

.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La/e7z;->p:La/bhu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/k33;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La/e7z;->j1:La/r7z;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/r7z;->j(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, La/e7z;->s1:Z

    .line 17
    .line 18
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 19
    .line 20
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/wso0;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    :goto_0
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget-boolean v2, v1, La/lm40;->n:Z

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, La/lm40;->U0()V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move-object v1, v0

    .line 38
    :goto_1
    if-eqz v1, :cond_5

    .line 39
    .line 40
    iget-boolean v2, v1, La/lm40;->n:Z

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-virtual {v1}, La/lm40;->W0()V

    .line 45
    .line 46
    .line 47
    :cond_4
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    :goto_2
    if-eqz v0, :cond_7

    .line 51
    .line 52
    iget-boolean v1, v0, La/lm40;->n:Z

    .line 53
    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    invoke-virtual {v0}, La/lm40;->Q0()V

    .line 57
    .line 58
    .line 59
    :cond_6
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_7
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_8

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    iput-object v0, p0, La/e7z;->t:La/nai0;

    .line 71
    .line 72
    iput-boolean v1, p0, La/e7z;->s:Z

    .line 73
    .line 74
    :cond_8
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 75
    .line 76
    if-eqz v0, :cond_9

    .line 77
    .line 78
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 79
    .line 80
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_9

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    iget-object v2, v0, La/jw2;->h:La/fy40;

    .line 93
    .line 94
    iget v3, p0, La/e7z;->b:I

    .line 95
    .line 96
    invoke-virtual {v2, v3}, La/fy40;->g(I)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_9

    .line 101
    .line 102
    iget-object v2, v0, La/jw2;->a:La/j910;

    .line 103
    .line 104
    iget-object v0, v0, La/jw2;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 105
    .line 106
    iget p0, p0, La/e7z;->b:I

    .line 107
    .line 108
    invoke-virtual {v2, v0, p0, v1}, La/j910;->z(Landroid/view/View;IZ)V

    .line 109
    .line 110
    .line 111
    :cond_9
    return-void
.end method

.method public final a0(La/w6k;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/e7z;->z:La/w6k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, La/e7z;->z:La/w6k;

    .line 10
    .line 11
    invoke-virtual {p0}, La/e7z;->F()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, La/e7z;->D()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, La/e7z;->o:La/cg80;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/e7z;->E()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 37
    .line 38
    iget-object p0, p0, La/tzi;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, La/lm40;

    .line 41
    .line 42
    :goto_1
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {p0}, La/yzj;->b()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    return-void
.end method

.method public final b(La/mm40;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 6
    .line 7
    const/16 v7, 0x10

    .line 8
    .line 9
    invoke-virtual {v2, v7}, La/tzi;->j(I)Z

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget-object v3, v2, La/tzi;->f:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v9, v3

    .line 16
    check-cast v9, La/wso0;

    .line 17
    .line 18
    const/16 v10, 0x400

    .line 19
    .line 20
    invoke-virtual {v2, v10}, La/tzi;->j(I)Z

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    iput-object v1, v0, La/e7z;->m1:La/mm40;

    .line 25
    .line 26
    iget-object v3, v2, La/tzi;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/rdx;

    .line 29
    .line 30
    iget-object v4, v2, La/tzi;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, La/e7z;

    .line 33
    .line 34
    iget-object v5, v2, La/tzi;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, La/lm40;

    .line 37
    .line 38
    iget-object v6, v2, La/tzi;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v12, v6

    .line 41
    check-cast v12, La/o460;

    .line 42
    .line 43
    if-eq v5, v12, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v5, "padChain called on already padded chain"

    .line 47
    .line 48
    invoke-static {v5}, La/xcx;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v5, v2, La/tzi;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, La/lm40;

    .line 54
    .line 55
    iput-object v12, v5, La/lm40;->e:La/lm40;

    .line 56
    .line 57
    iput-object v5, v12, La/lm40;->f:La/lm40;

    .line 58
    .line 59
    iget-object v5, v2, La/tzi;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, La/vy40;

    .line 62
    .line 63
    iget v6, v5, La/vy40;->b:I

    .line 64
    .line 65
    invoke-virtual {v4}, La/e7z;->v()La/e7z;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    move-object v14, v4

    .line 70
    :goto_1
    if-eqz v13, :cond_1

    .line 71
    .line 72
    invoke-virtual {v13}, La/e7z;->v()La/e7z;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    move-object/from16 v22, v14

    .line 77
    .line 78
    move-object v14, v13

    .line 79
    move-object/from16 v13, v22

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v13, v14, La/e7z;->h1:La/tzi;

    .line 83
    .line 84
    iget-object v14, v13, La/tzi;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v14, La/vy40;

    .line 87
    .line 88
    if-nez v14, :cond_2

    .line 89
    .line 90
    new-instance v14, La/vy40;

    .line 91
    .line 92
    invoke-direct {v14}, La/vy40;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v14, v13, La/tzi;->i:Ljava/lang/Object;

    .line 96
    .line 97
    :cond_2
    iget v15, v14, La/vy40;->b:I

    .line 98
    .line 99
    const/4 v10, 0x1

    .line 100
    sub-int/2addr v15, v10

    .line 101
    if-ltz v15, :cond_3

    .line 102
    .line 103
    invoke-virtual {v14, v15}, La/vy40;->l(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    check-cast v15, La/vy40;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    new-instance v15, La/vy40;

    .line 111
    .line 112
    invoke-direct {v15}, La/vy40;-><init>()V

    .line 113
    .line 114
    .line 115
    :goto_2
    iget-object v7, v13, La/tzi;->j:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v7, La/vy40;

    .line 118
    .line 119
    if-nez v7, :cond_4

    .line 120
    .line 121
    new-instance v7, La/vy40;

    .line 122
    .line 123
    invoke-direct {v7}, La/vy40;-><init>()V

    .line 124
    .line 125
    .line 126
    :cond_4
    move/from16 v16, v10

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    iput-object v10, v13, La/tzi;->j:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v7, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v1, v10

    .line 135
    :goto_3
    invoke-virtual {v7}, La/vy40;->j()Z

    .line 136
    .line 137
    .line 138
    move-result v17

    .line 139
    if-eqz v17, :cond_8

    .line 140
    .line 141
    iget v10, v7, La/vy40;->b:I

    .line 142
    .line 143
    add-int/lit8 v10, v10, -0x1

    .line 144
    .line 145
    invoke-virtual {v7, v10}, La/vy40;->l(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    check-cast v10, La/mm40;

    .line 150
    .line 151
    move-object/from16 p1, v1

    .line 152
    .line 153
    instance-of v1, v10, La/i7d;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    check-cast v10, La/i7d;

    .line 158
    .line 159
    iget-object v1, v10, La/i7d;->c:La/mm40;

    .line 160
    .line 161
    invoke-virtual {v7, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v10, La/i7d;->b:La/mm40;

    .line 165
    .line 166
    invoke-virtual {v7, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    instance-of v1, v10, La/km40;

    .line 171
    .line 172
    if-eqz v1, :cond_6

    .line 173
    .line 174
    invoke-virtual {v15, v10}, La/vy40;->a(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    move-object/from16 v1, p1

    .line 178
    .line 179
    move-object/from16 v18, v2

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_6
    if-nez p1, :cond_7

    .line 183
    .line 184
    new-instance v1, La/b530;

    .line 185
    .line 186
    move-object/from16 v18, v2

    .line 187
    .line 188
    const/16 v2, 0x1b

    .line 189
    .line 190
    invoke-direct {v1, v15, v2}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    move-object/from16 v18, v2

    .line 195
    .line 196
    move-object/from16 v1, p1

    .line 197
    .line 198
    :goto_5
    invoke-interface {v10, v1}, La/mm40;->b(Lkotlin/jvm/functions/Function1;)Z

    .line 199
    .line 200
    .line 201
    :goto_6
    move-object/from16 v2, v18

    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    goto :goto_3

    .line 205
    :cond_8
    move-object/from16 v18, v2

    .line 206
    .line 207
    iget v1, v15, La/vy40;->b:I

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    if-ne v1, v6, :cond_11

    .line 211
    .line 212
    iget-object v1, v12, La/lm40;->f:La/lm40;

    .line 213
    .line 214
    move/from16 v19, v2

    .line 215
    .line 216
    :goto_7
    if-eqz v1, :cond_d

    .line 217
    .line 218
    if-ge v2, v6, :cond_d

    .line 219
    .line 220
    invoke-virtual {v5, v2}, La/vy40;->g(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, La/km40;

    .line 225
    .line 226
    invoke-virtual {v15, v2}, La/vy40;->g(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v20

    .line 230
    const/16 p1, 0x2

    .line 231
    .line 232
    move-object/from16 v10, v20

    .line 233
    .line 234
    check-cast v10, La/km40;

    .line 235
    .line 236
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v20

    .line 240
    if-eqz v20, :cond_9

    .line 241
    .line 242
    move-object/from16 v20, v5

    .line 243
    .line 244
    move-object/from16 v21, v15

    .line 245
    .line 246
    move/from16 v5, p1

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    move-object/from16 v20, v5

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    move-object/from16 v21, v15

    .line 256
    .line 257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    if-ne v5, v15, :cond_a

    .line 262
    .line 263
    move/from16 v5, v16

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_a
    move/from16 v5, v19

    .line 267
    .line 268
    :goto_8
    if-eqz v5, :cond_c

    .line 269
    .line 270
    move/from16 v15, v16

    .line 271
    .line 272
    if-eq v5, v15, :cond_b

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_b
    invoke-static {v3, v10, v1}, La/tzi;->z(La/km40;La/km40;La/lm40;)V

    .line 276
    .line 277
    .line 278
    :goto_9
    iget-object v1, v1, La/lm40;->f:La/lm40;

    .line 279
    .line 280
    add-int/lit8 v2, v2, 0x1

    .line 281
    .line 282
    move-object/from16 v5, v20

    .line 283
    .line 284
    move-object/from16 v15, v21

    .line 285
    .line 286
    const/16 v16, 0x1

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 290
    .line 291
    :goto_a
    move-object v5, v1

    .line 292
    goto :goto_b

    .line 293
    :cond_d
    move-object/from16 v20, v5

    .line 294
    .line 295
    move-object/from16 v21, v15

    .line 296
    .line 297
    const/16 p1, 0x2

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :goto_b
    if-ge v2, v6, :cond_10

    .line 301
    .line 302
    if-eqz v5, :cond_f

    .line 303
    .line 304
    iget-object v1, v4, La/e7z;->n1:La/mm40;

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    const/16 v16, 0x1

    .line 309
    .line 310
    :goto_c
    const/4 v15, 0x1

    .line 311
    goto :goto_d

    .line 312
    :cond_e
    move/from16 v16, v19

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :goto_d
    xor-int/lit8 v6, v16, 0x1

    .line 316
    .line 317
    move-object/from16 v1, v18

    .line 318
    .line 319
    move-object/from16 v3, v20

    .line 320
    .line 321
    move-object/from16 v4, v21

    .line 322
    .line 323
    invoke-virtual/range {v1 .. v6}, La/tzi;->x(ILa/vy40;La/vy40;La/lm40;Z)V

    .line 324
    .line 325
    .line 326
    move-object v5, v12

    .line 327
    :goto_e
    const/4 v10, 0x1

    .line 328
    goto/16 :goto_16

    .line 329
    .line 330
    :cond_f
    const-string v0, "structuralUpdate requires a non-null tail"

    .line 331
    .line 332
    invoke-static {v0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    throw v0

    .line 337
    :cond_10
    move-object/from16 v2, v18

    .line 338
    .line 339
    move-object/from16 v5, v20

    .line 340
    .line 341
    move-object/from16 v15, v21

    .line 342
    .line 343
    goto/16 :goto_13

    .line 344
    .line 345
    :cond_11
    move/from16 v19, v2

    .line 346
    .line 347
    move-object/from16 v2, v18

    .line 348
    .line 349
    const/16 p1, 0x2

    .line 350
    .line 351
    iget-object v10, v4, La/e7z;->n1:La/mm40;

    .line 352
    .line 353
    if-eqz v10, :cond_14

    .line 354
    .line 355
    if-nez v6, :cond_14

    .line 356
    .line 357
    move-object v3, v12

    .line 358
    move/from16 v1, v19

    .line 359
    .line 360
    :goto_f
    iget v4, v15, La/vy40;->b:I

    .line 361
    .line 362
    if-ge v1, v4, :cond_12

    .line 363
    .line 364
    invoke-virtual {v15, v1}, La/vy40;->g(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, La/km40;

    .line 369
    .line 370
    invoke-static {v4, v3}, La/tzi;->c(La/km40;La/lm40;)La/lm40;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    add-int/lit8 v1, v1, 0x1

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_12
    iget-object v1, v9, La/lm40;->e:La/lm40;

    .line 378
    .line 379
    :goto_10
    if-eqz v1, :cond_13

    .line 380
    .line 381
    if-eq v1, v12, :cond_13

    .line 382
    .line 383
    iget v3, v1, La/lm40;->c:I

    .line 384
    .line 385
    or-int v3, v19, v3

    .line 386
    .line 387
    iput v3, v1, La/lm40;->d:I

    .line 388
    .line 389
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 390
    .line 391
    move/from16 v19, v3

    .line 392
    .line 393
    goto :goto_10

    .line 394
    :cond_13
    move-object v1, v2

    .line 395
    move-object v3, v5

    .line 396
    move-object v5, v12

    .line 397
    move-object v4, v15

    .line 398
    goto :goto_e

    .line 399
    :cond_14
    if-nez v1, :cond_17

    .line 400
    .line 401
    iget-object v1, v12, La/lm40;->f:La/lm40;

    .line 402
    .line 403
    move/from16 v6, v19

    .line 404
    .line 405
    :goto_11
    if-eqz v1, :cond_15

    .line 406
    .line 407
    iget v10, v5, La/vy40;->b:I

    .line 408
    .line 409
    if-ge v6, v10, :cond_15

    .line 410
    .line 411
    invoke-static {v1}, La/tzi;->f(La/lm40;)La/lm40;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iget-object v1, v1, La/lm40;->f:La/lm40;

    .line 416
    .line 417
    add-int/lit8 v6, v6, 0x1

    .line 418
    .line 419
    goto :goto_11

    .line 420
    :cond_15
    invoke-virtual {v4}, La/e7z;->v()La/e7z;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    if-eqz v1, :cond_16

    .line 425
    .line 426
    iget-object v1, v1, La/e7z;->h1:La/tzi;

    .line 427
    .line 428
    iget-object v1, v1, La/tzi;->d:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, La/rdx;

    .line 431
    .line 432
    goto :goto_12

    .line 433
    :cond_16
    const/4 v1, 0x0

    .line 434
    :goto_12
    iput-object v1, v3, La/s460;->w:La/s460;

    .line 435
    .line 436
    iput-object v3, v2, La/tzi;->e:Ljava/lang/Object;

    .line 437
    .line 438
    :goto_13
    move-object v1, v2

    .line 439
    move-object v3, v5

    .line 440
    move-object v5, v12

    .line 441
    move-object v4, v15

    .line 442
    move/from16 v10, v19

    .line 443
    .line 444
    goto :goto_16

    .line 445
    :cond_17
    if-eqz v10, :cond_18

    .line 446
    .line 447
    const/16 v16, 0x1

    .line 448
    .line 449
    :goto_14
    const/4 v10, 0x1

    .line 450
    goto :goto_15

    .line 451
    :cond_18
    move/from16 v16, v19

    .line 452
    .line 453
    goto :goto_14

    .line 454
    :goto_15
    xor-int/lit8 v6, v16, 0x1

    .line 455
    .line 456
    move-object v1, v2

    .line 457
    const/4 v2, 0x0

    .line 458
    move-object v3, v5

    .line 459
    move-object v5, v12

    .line 460
    move-object v4, v15

    .line 461
    invoke-virtual/range {v1 .. v6}, La/tzi;->x(ILa/vy40;La/vy40;La/lm40;Z)V

    .line 462
    .line 463
    .line 464
    :goto_16
    iput-object v4, v1, La/tzi;->h:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-virtual {v3}, La/vy40;->d()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v14, v3}, La/vy40;->a(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v7}, La/vy40;->d()V

    .line 473
    .line 474
    .line 475
    iput-object v7, v13, La/tzi;->j:Ljava/lang/Object;

    .line 476
    .line 477
    iget-object v2, v5, La/lm40;->f:La/lm40;

    .line 478
    .line 479
    if-nez v2, :cond_19

    .line 480
    .line 481
    :goto_17
    const/4 v2, 0x0

    .line 482
    goto :goto_18

    .line 483
    :cond_19
    move-object v9, v2

    .line 484
    goto :goto_17

    .line 485
    :goto_18
    iput-object v2, v9, La/lm40;->e:La/lm40;

    .line 486
    .line 487
    iput-object v2, v5, La/lm40;->f:La/lm40;

    .line 488
    .line 489
    const/4 v3, -0x1

    .line 490
    iput v3, v5, La/lm40;->d:I

    .line 491
    .line 492
    iput-object v2, v5, La/lm40;->h:La/s460;

    .line 493
    .line 494
    if-eq v9, v5, :cond_1a

    .line 495
    .line 496
    goto :goto_19

    .line 497
    :cond_1a
    const-string v2, "trimChain did not update the head"

    .line 498
    .line 499
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :goto_19
    iput-object v9, v1, La/tzi;->g:Ljava/lang/Object;

    .line 503
    .line 504
    if-eqz v10, :cond_1b

    .line 505
    .line 506
    invoke-virtual {v1}, La/tzi;->y()V

    .line 507
    .line 508
    .line 509
    :cond_1b
    const/16 v2, 0x10

    .line 510
    .line 511
    invoke-virtual {v1, v2}, La/tzi;->j(I)Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    const/16 v3, 0x400

    .line 516
    .line 517
    invoke-virtual {v1, v3}, La/tzi;->j(I)Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    iget-object v4, v0, La/e7z;->i1:La/i7z;

    .line 522
    .line 523
    invoke-virtual {v4}, La/i7z;->j()V

    .line 524
    .line 525
    .line 526
    iget-object v4, v0, La/e7z;->i:La/e7z;

    .line 527
    .line 528
    if-nez v4, :cond_1c

    .line 529
    .line 530
    const/16 v4, 0x200

    .line 531
    .line 532
    invoke-virtual {v1, v4}, La/tzi;->j(I)Z

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    if-eqz v1, :cond_1c

    .line 537
    .line 538
    invoke-virtual {v0, v0}, La/e7z;->c0(La/e7z;)V

    .line 539
    .line 540
    .line 541
    :cond_1c
    if-ne v8, v2, :cond_1d

    .line 542
    .line 543
    if-eq v11, v3, :cond_1e

    .line 544
    .line 545
    :cond_1d
    invoke-static {v0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-interface {v1}, La/cg80;->getRectManager()La/oge0;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, La/e7z;->I()Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_1e

    .line 561
    .line 562
    iget v4, v0, La/e7z;->g:I

    .line 563
    .line 564
    const/4 v5, -0x4

    .line 565
    if-eq v4, v5, :cond_1e

    .line 566
    .line 567
    iget-object v4, v1, La/oge0;->c:La/zz2;

    .line 568
    .line 569
    invoke-virtual {v1, v0}, La/oge0;->d(La/e7z;)I

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    iget-object v1, v4, La/zz2;->b:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, [J

    .line 576
    .line 577
    add-int/lit8 v0, v0, 0x2

    .line 578
    .line 579
    aget-wide v4, v1, v0

    .line 580
    .line 581
    const-wide v6, -0x6000000000000001L

    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    and-long/2addr v4, v6

    .line 587
    const-wide/high16 v6, 0x2000000000000000L

    .line 588
    .line 589
    int-to-long v8, v3

    .line 590
    mul-long/2addr v8, v6

    .line 591
    or-long v3, v4, v8

    .line 592
    .line 593
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 594
    .line 595
    int-to-long v7, v2

    .line 596
    mul-long/2addr v7, v5

    .line 597
    or-long v2, v3, v7

    .line 598
    .line 599
    aput-wide v2, v1, v0

    .line 600
    .line 601
    :cond_1e
    return-void
.end method

.method public final b0(I)V
    .locals 2

    .line 1
    iget v0, p0, La/e7z;->r1:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, La/e7z;->r1:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/e7z;->b0(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, La/e7z;->r1:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, La/e7z;->r1:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/e7z;->b0(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, La/e7z;->r1:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final c(La/cg80;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, v1}, La/e7z;->h(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Cannot attach "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, " as it already is attached.  Tree: "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, La/e7z;->n:La/e7z;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, La/e7z;->o:La/cg80;

    .line 42
    .line 43
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, La/e7z;->o:La/cg80;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v0, v2

    .line 60
    :goto_1
    invoke-virtual {p0, v1}, La/e7z;->h(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v4, p0, La/e7z;->n:La/e7z;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v4, v1}, La/e7z;->h(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move-object v4, v2

    .line 74
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v6, "Attaching to a different owner("

    .line 77
    .line 78
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v6, ") than the parent\'s owner("

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, "). This tree: "

    .line 93
    .line 94
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, " Parent tree: "

    .line 101
    .line 102
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, p0, La/e7z;->i1:La/i7z;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-object v5, v3, La/i7z;->p:La/sj30;

    .line 125
    .line 126
    iput-boolean v4, v5, La/sj30;->t:Z

    .line 127
    .line 128
    invoke-interface {p1}, La/cg80;->getRectManager()La/oge0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5, p0}, La/oge0;->g(La/e7z;)V

    .line 133
    .line 134
    .line 135
    iget-object v5, v3, La/i7z;->q:La/i810;

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    sget-object v6, La/h810;->a:La/h810;

    .line 140
    .line 141
    iput-object v6, v5, La/i810;->r:La/h810;

    .line 142
    .line 143
    :cond_5
    iget-object v5, p0, La/e7z;->h1:La/tzi;

    .line 144
    .line 145
    iget-object v6, v5, La/tzi;->e:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v6, La/s460;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    iget-object v7, v0, La/e7z;->h1:La/tzi;

    .line 152
    .line 153
    iget-object v7, v7, La/tzi;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v7, La/rdx;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    move-object v7, v2

    .line 159
    :goto_4
    iput-object v7, v6, La/s460;->w:La/s460;

    .line 160
    .line 161
    iput-object p1, p0, La/e7z;->o:La/cg80;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    iget v6, v0, La/e7z;->q:I

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    const/4 v6, -0x1

    .line 169
    :goto_5
    add-int/2addr v6, v4

    .line 170
    iput v6, p0, La/e7z;->q:I

    .line 171
    .line 172
    iget-object v6, p0, La/e7z;->n1:La/mm40;

    .line 173
    .line 174
    if-eqz v6, :cond_8

    .line 175
    .line 176
    invoke-virtual {p0, v6}, La/e7z;->b(La/mm40;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    iput-object v2, p0, La/e7z;->n1:La/mm40;

    .line 180
    .line 181
    move-object v2, p1

    .line 182
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget v6, p0, La/e7z;->b:I

    .line 189
    .line 190
    invoke-virtual {v2, v6, p0}, La/ey40;->j(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-boolean v2, p0, La/e7z;->h:Z

    .line 194
    .line 195
    if-eqz v2, :cond_9

    .line 196
    .line 197
    invoke-virtual {p0, p0}, La/e7z;->c0(La/e7z;)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    iget-object v2, p0, La/e7z;->n:La/e7z;

    .line 202
    .line 203
    if-eqz v2, :cond_a

    .line 204
    .line 205
    iget-object v2, v2, La/e7z;->i:La/e7z;

    .line 206
    .line 207
    if-nez v2, :cond_b

    .line 208
    .line 209
    :cond_a
    iget-object v2, p0, La/e7z;->i:La/e7z;

    .line 210
    .line 211
    :cond_b
    invoke-virtual {p0, v2}, La/e7z;->c0(La/e7z;)V

    .line 212
    .line 213
    .line 214
    iget-object v2, p0, La/e7z;->i:La/e7z;

    .line 215
    .line 216
    if-nez v2, :cond_c

    .line 217
    .line 218
    const/16 v2, 0x200

    .line 219
    .line 220
    invoke-virtual {v5, v2}, La/tzi;->j(I)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_c

    .line 225
    .line 226
    invoke-virtual {p0, p0}, La/e7z;->c0(La/e7z;)V

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_6
    iget-boolean v2, p0, La/e7z;->s1:Z

    .line 230
    .line 231
    if-nez v2, :cond_d

    .line 232
    .line 233
    iget-object v2, v5, La/tzi;->g:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, La/lm40;

    .line 236
    .line 237
    :goto_7
    if-eqz v2, :cond_d

    .line 238
    .line 239
    invoke-virtual {v2}, La/lm40;->P0()V

    .line 240
    .line 241
    .line 242
    iget-object v2, v2, La/lm40;->f:La/lm40;

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_d
    iget-object v2, p0, La/e7z;->k:La/nw20;

    .line 246
    .line 247
    iget-object v2, v2, La/nw20;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v2, La/xz40;

    .line 250
    .line 251
    iget-object v6, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 252
    .line 253
    iget v2, v2, La/xz40;->c:I

    .line 254
    .line 255
    :goto_8
    if-ge v1, v2, :cond_e

    .line 256
    .line 257
    aget-object v7, v6, v1

    .line 258
    .line 259
    check-cast v7, La/e7z;

    .line 260
    .line 261
    invoke-virtual {v7, p1}, La/e7z;->c(La/cg80;)V

    .line 262
    .line 263
    .line 264
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_e
    iget-boolean v1, p0, La/e7z;->s1:Z

    .line 268
    .line 269
    if-nez v1, :cond_f

    .line 270
    .line 271
    invoke-virtual {v5}, La/tzi;->v()V

    .line 272
    .line 273
    .line 274
    :cond_f
    invoke-virtual {p0}, La/e7z;->F()V

    .line 275
    .line 276
    .line 277
    if-eqz v0, :cond_10

    .line 278
    .line 279
    invoke-virtual {v0}, La/e7z;->F()V

    .line 280
    .line 281
    .line 282
    :cond_10
    iget-object v0, p0, La/e7z;->o1:La/d33;

    .line 283
    .line 284
    if-eqz v0, :cond_11

    .line 285
    .line 286
    invoke-virtual {v0, p1}, La/d33;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    :cond_11
    invoke-virtual {v3}, La/i7z;->j()V

    .line 290
    .line 291
    .line 292
    iget-boolean v0, p0, La/e7z;->s1:Z

    .line 293
    .line 294
    if-nez v0, :cond_12

    .line 295
    .line 296
    const/16 v0, 0x8

    .line 297
    .line 298
    invoke-virtual {v5, v0}, La/tzi;->j(I)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_12

    .line 303
    .line 304
    invoke-virtual {p0}, La/e7z;->G()V

    .line 305
    .line 306
    .line 307
    :cond_12
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_13

    .line 314
    .line 315
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    if-eqz p1, :cond_13

    .line 320
    .line 321
    invoke-virtual {p0}, La/e7z;->x()La/nai0;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-eqz v0, :cond_13

    .line 326
    .line 327
    iget-object v0, v0, La/nai0;->a:La/hz40;

    .line 328
    .line 329
    sget-object v1, La/xai0;->r:La/zai0;

    .line 330
    .line 331
    invoke-virtual {v0, v1}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-ne v0, v4, :cond_13

    .line 336
    .line 337
    iget-object v0, p1, La/jw2;->h:La/fy40;

    .line 338
    .line 339
    iget v1, p0, La/e7z;->b:I

    .line 340
    .line 341
    invoke-virtual {v0, v1}, La/fy40;->a(I)Z

    .line 342
    .line 343
    .line 344
    iget-object v0, p1, La/jw2;->a:La/j910;

    .line 345
    .line 346
    iget-object p1, p1, La/jw2;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 347
    .line 348
    iget p0, p0, La/e7z;->b:I

    .line 349
    .line 350
    invoke-virtual {v0, p1, p0, v4}, La/j910;->z(Landroid/view/View;IZ)V

    .line 351
    .line 352
    .line 353
    :cond_13
    return-void
.end method

.method public final c0(La/e7z;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/e7z;->i:La/e7z;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, La/e7z;->i:La/e7z;

    .line 10
    .line 11
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, La/i7z;->q:La/i810;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, La/i810;

    .line 20
    .line 21
    invoke-direct {p1, v0}, La/i810;-><init>(La/i7z;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, La/i7z;->q:La/i810;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, La/e7z;->h1:La/tzi;

    .line 27
    .line 28
    iget-object v0, p1, La/tzi;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/s460;

    .line 31
    .line 32
    iget-object p1, p1, La/tzi;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, La/rdx;

    .line 35
    .line 36
    iget-object p1, p1, La/s460;->v:La/s460;

    .line 37
    .line 38
    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, La/s460;->b1()V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, La/s460;->v:La/s460;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    iput-object p1, v0, La/i7z;->q:La/i810;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, v0, La/i7z;->f:Z

    .line 57
    .line 58
    iput-boolean p1, v0, La/i7z;->e:Z

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, La/e7z;->F()V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, La/e7z;->Z:La/c7z;

    .line 2
    .line 3
    iput-object v0, p0, La/e7z;->f1:La/c7z;

    .line 4
    .line 5
    sget-object v0, La/c7z;->c:La/c7z;

    .line 6
    .line 7
    iput-object v0, p0, La/e7z;->Z:La/c7z;

    .line 8
    .line 9
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, La/xz40;->c:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, p0, :cond_1

    .line 19
    .line 20
    aget-object v2, v0, v1

    .line 21
    .line 22
    check-cast v2, La/e7z;

    .line 23
    .line 24
    iget-object v3, v2, La/e7z;->Z:La/c7z;

    .line 25
    .line 26
    sget-object v4, La/c7z;->c:La/c7z;

    .line 27
    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, La/e7z;->d()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final d0(La/tj30;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/e7z;->x:La/tj30;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, La/e7z;->x:La/tj30;

    .line 10
    .line 11
    iget-object v0, p0, La/e7z;->y:La/u8u;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, La/u8u;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/pz40;

    .line 18
    .line 19
    check-cast v0, La/hgk0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, La/e7z;->F()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "onReuse is only expected on attached node"

    .line 8
    .line 9
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, La/e7z;->p:La/bhu0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, La/k33;->e()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, La/e7z;->j1:La/r7z;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/r7z;->j(Z)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iput-boolean v1, p0, La/e7z;->u:Z

    .line 28
    .line 29
    iget-boolean v0, p0, La/e7z;->s1:Z

    .line 30
    .line 31
    iget-object v2, p0, La/e7z;->h1:La/tzi;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iput-boolean v1, p0, La/e7z;->s1:Z

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    iget-object v0, v2, La/tzi;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, La/wso0;

    .line 41
    .line 42
    move-object v3, v0

    .line 43
    :goto_0
    if-eqz v3, :cond_5

    .line 44
    .line 45
    iget-boolean v4, v3, La/lm40;->n:Z

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    invoke-virtual {v3}, La/lm40;->U0()V

    .line 50
    .line 51
    .line 52
    :cond_4
    iget-object v3, v3, La/lm40;->e:La/lm40;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    move-object v3, v0

    .line 56
    :goto_1
    if-eqz v3, :cond_7

    .line 57
    .line 58
    iget-boolean v4, v3, La/lm40;->n:Z

    .line 59
    .line 60
    if-eqz v4, :cond_6

    .line 61
    .line 62
    invoke-virtual {v3}, La/lm40;->W0()V

    .line 63
    .line 64
    .line 65
    :cond_6
    iget-object v3, v3, La/lm40;->e:La/lm40;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_7
    :goto_2
    if-eqz v0, :cond_9

    .line 69
    .line 70
    iget-boolean v3, v0, La/lm40;->n:Z

    .line 71
    .line 72
    if-eqz v3, :cond_8

    .line 73
    .line 74
    invoke-virtual {v0}, La/lm40;->Q0()V

    .line 75
    .line 76
    .line 77
    :cond_8
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_9
    :goto_3
    iget v0, p0, La/e7z;->b:I

    .line 81
    .line 82
    iget-object v3, p0, La/e7z;->o:La/cg80;

    .line 83
    .line 84
    if-eqz v3, :cond_a

    .line 85
    .line 86
    invoke-interface {v3}, La/cg80;->getRectManager()La/oge0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-eqz v3, :cond_a

    .line 91
    .line 92
    invoke-virtual {v3, p0}, La/oge0;->h(La/e7z;)V

    .line 93
    .line 94
    .line 95
    :cond_a
    sget-object v3, La/pai0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    const/4 v4, 0x1

    .line 98
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iput v3, p0, La/e7z;->b:I

    .line 103
    .line 104
    iget-object v3, p0, La/e7z;->o:La/cg80;

    .line 105
    .line 106
    if-eqz v3, :cond_b

    .line 107
    .line 108
    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v5, v0}, La/ey40;->h(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget v5, p0, La/e7z;->b:I

    .line 122
    .line 123
    invoke-virtual {v3, v5, p0}, La/ey40;->j(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_b
    iget-object v3, v2, La/tzi;->g:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, La/lm40;

    .line 129
    .line 130
    :goto_4
    if-eqz v3, :cond_c

    .line 131
    .line 132
    invoke-virtual {v3}, La/lm40;->P0()V

    .line 133
    .line 134
    .line 135
    iget-object v3, v3, La/lm40;->f:La/lm40;

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_c
    invoke-virtual {v2}, La/tzi;->v()V

    .line 139
    .line 140
    .line 141
    const/16 v3, 0x8

    .line 142
    .line 143
    invoke-virtual {v2, v3}, La/tzi;->j(I)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_d

    .line 148
    .line 149
    invoke-virtual {p0}, La/e7z;->G()V

    .line 150
    .line 151
    .line 152
    :cond_d
    invoke-static {p0}, La/e7z;->X(La/e7z;)V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, La/e7z;->o:La/cg80;

    .line 156
    .line 157
    if-eqz v2, :cond_f

    .line 158
    .line 159
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_f

    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-eqz v2, :cond_f

    .line 172
    .line 173
    iget-object v3, v2, La/jw2;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 174
    .line 175
    iget-object v5, v2, La/jw2;->a:La/j910;

    .line 176
    .line 177
    iget-object v2, v2, La/jw2;->h:La/fy40;

    .line 178
    .line 179
    invoke-virtual {v2, v0}, La/fy40;->g(I)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_e

    .line 184
    .line 185
    invoke-virtual {v5, v3, v0, v1}, La/j910;->z(Landroid/view/View;IZ)V

    .line 186
    .line 187
    .line 188
    :cond_e
    invoke-virtual {p0}, La/e7z;->x()La/nai0;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_f

    .line 193
    .line 194
    iget-object v0, v0, La/nai0;->a:La/hz40;

    .line 195
    .line 196
    sget-object v1, La/xai0;->r:La/zai0;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-ne v0, v4, :cond_f

    .line 203
    .line 204
    iget v0, p0, La/e7z;->b:I

    .line 205
    .line 206
    invoke-virtual {v2, v0}, La/fy40;->a(I)Z

    .line 207
    .line 208
    .line 209
    iget v0, p0, La/e7z;->b:I

    .line 210
    .line 211
    invoke-virtual {v5, v3, v0, v4}, La/j910;->z(Landroid/view/View;IZ)V

    .line 212
    .line 213
    .line 214
    :cond_f
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 215
    .line 216
    if-eqz v0, :cond_10

    .line 217
    .line 218
    invoke-interface {v0}, La/cg80;->getRectManager()La/oge0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_10

    .line 223
    .line 224
    invoke-virtual {v0, p0}, La/oge0;->g(La/e7z;)V

    .line 225
    .line 226
    .line 227
    :cond_10
    return-void
.end method

.method public final e0(La/mm40;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/e7z;->m1:La/mm40;

    .line 6
    .line 7
    sget-object v1, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 13
    .line 14
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iget-boolean v0, p0, La/e7z;->s1:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "modifier is updated when deactivated"

    .line 22
    .line 23
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/e7z;->b(La/mm40;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, La/e7z;->s:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, La/e7z;->G()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void

    .line 43
    :cond_4
    iput-object p1, p0, La/e7z;->n1:La/mm40;

    .line 44
    .line 45
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, La/e7z;->p:La/bhu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/k33;->f()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La/e7z;->j1:La/r7z;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, La/r7z;->f()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 16
    .line 17
    iget-object v0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/s460;

    .line 20
    .line 21
    iget-object p0, p0, La/tzi;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/rdx;

    .line 24
    .line 25
    iget-object p0, p0, La/s460;->v:La/s460;

    .line 26
    .line 27
    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, La/s460;->t1()V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, La/s460;->v:La/s460;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public final f0(La/wgu0;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/e7z;->B:La/wgu0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, La/e7z;->B:La/wgu0;

    .line 10
    .line 11
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 12
    .line 13
    iget-object p0, p0, La/tzi;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/lm40;

    .line 16
    .line 17
    iget p1, p0, La/lm40;->d:I

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    and-int/2addr p1, v0

    .line 22
    if-eqz p1, :cond_8

    .line 23
    .line 24
    :goto_0
    if-eqz p0, :cond_8

    .line 25
    .line 26
    iget p1, p0, La/lm40;->c:I

    .line 27
    .line 28
    and-int/2addr p1, v0

    .line 29
    if-eqz p1, :cond_7

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    move-object v1, p0

    .line 33
    move-object v2, p1

    .line 34
    :goto_1
    if-eqz v1, :cond_7

    .line 35
    .line 36
    instance-of v3, v1, La/gpa0;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    check-cast v1, La/gpa0;

    .line 41
    .line 42
    invoke-interface {v1}, La/gpa0;->H0()V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_0
    iget v3, v1, La/lm40;->c:I

    .line 47
    .line 48
    and-int/2addr v3, v0

    .line 49
    if-eqz v3, :cond_6

    .line 50
    .line 51
    instance-of v3, v1, La/f3k;

    .line 52
    .line 53
    if-eqz v3, :cond_6

    .line 54
    .line 55
    move-object v3, v1

    .line 56
    check-cast v3, La/f3k;

    .line 57
    .line 58
    iget-object v3, v3, La/f3k;->p:La/lm40;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    :goto_2
    const/4 v5, 0x1

    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    iget v6, v3, La/lm40;->c:I

    .line 65
    .line 66
    and-int/2addr v6, v0

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    if-ne v4, v5, :cond_1

    .line 72
    .line 73
    move-object v1, v3

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    if-nez v2, :cond_2

    .line 76
    .line 77
    new-instance v2, La/xz40;

    .line 78
    .line 79
    new-array v5, v0, [La/lm40;

    .line 80
    .line 81
    invoke-direct {v2, v5}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v1, p1

    .line 90
    :cond_3
    invoke-virtual {v2, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_3
    iget-object v3, v3, La/lm40;->f:La/lm40;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    if-ne v4, v5, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_4
    invoke-static {v2}, La/vcc;->V(La/xz40;)La/lm40;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    iget p1, p0, La/lm40;->d:I

    .line 105
    .line 106
    and-int/2addr p1, v0

    .line 107
    if-eqz p1, :cond_8

    .line 108
    .line 109
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, La/e7z;->Z:La/c7z;

    .line 2
    .line 3
    iput-object v0, p0, La/e7z;->f1:La/c7z;

    .line 4
    .line 5
    sget-object v0, La/c7z;->c:La/c7z;

    .line 6
    .line 7
    iput-object v0, p0, La/e7z;->Z:La/c7z;

    .line 8
    .line 9
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, La/xz40;->c:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, p0, :cond_1

    .line 19
    .line 20
    aget-object v2, v0, v1

    .line 21
    .line 22
    check-cast v2, La/e7z;

    .line 23
    .line 24
    iget-object v3, v2, La/e7z;->Z:La/c7z;

    .line 25
    .line 26
    sget-object v4, La/c7z;->b:La/c7z;

    .line 27
    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, La/e7z;->g()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 6

    .line 1
    iget v0, p0, La/e7z;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, La/e7z;->m:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, La/e7z;->m:Z

    .line 11
    .line 12
    iget-object v1, p0, La/e7z;->l:La/xz40;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, La/xz40;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    new-array v2, v2, [La/e7z;

    .line 21
    .line 22
    invoke-direct {v1, v2}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, La/e7z;->l:La/xz40;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, La/xz40;->g()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, La/e7z;->k:La/nw20;

    .line 31
    .line 32
    iget-object v2, v2, La/nw20;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/xz40;

    .line 35
    .line 36
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v2, v2, La/xz40;->c:I

    .line 39
    .line 40
    :goto_0
    if-ge v0, v2, :cond_2

    .line 41
    .line 42
    aget-object v4, v3, v0

    .line 43
    .line 44
    check-cast v4, La/e7z;

    .line 45
    .line 46
    iget-boolean v5, v4, La/e7z;->a:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, La/e7z;->A()La/xz40;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v5, v1, La/xz40;->c:I

    .line 55
    .line 56
    invoke-virtual {v1, v5, v4}, La/xz40;->c(ILa/xz40;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 67
    .line 68
    iget-object v0, p0, La/i7z;->p:La/sj30;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    iput-boolean v1, v0, La/sj30;->A:Z

    .line 72
    .line 73
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    iput-boolean v1, p0, La/i810;->u:Z

    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final h(I)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/e7z;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v2, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 40
    .line 41
    iget p0, p0, La/xz40;->c:I

    .line 42
    .line 43
    move v3, v1

    .line 44
    :goto_1
    if-ge v3, p0, :cond_1

    .line 45
    .line 46
    aget-object v4, v2, v3

    .line 47
    .line 48
    check-cast v4, La/e7z;

    .line 49
    .line 50
    add-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {v4, v5}, La/e7z;->h(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-static {p1, v1, p0}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_2
    return-object p0
.end method

.method public final h0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final i()V
    .locals 11

    .line 1
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, La/e7z;->h(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v0, "Cannot detach node that is already detached!  Tree: "

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, La/xcx;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    invoke-static {}, La/csj;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, La/e7z;->i1:La/i7z;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, La/e7z;->D()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, La/e7z;->F()V

    .line 50
    .line 51
    .line 52
    iget-object v3, v4, La/i7z;->p:La/sj30;

    .line 53
    .line 54
    sget-object v5, La/c7z;->c:La/c7z;

    .line 55
    .line 56
    iput-object v5, v3, La/sj30;->l:La/c7z;

    .line 57
    .line 58
    iget-object v3, v4, La/i7z;->q:La/i810;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    iput-object v5, v3, La/i810;->j:La/c7z;

    .line 63
    .line 64
    :cond_2
    iget-object v3, v4, La/i7z;->p:La/sj30;

    .line 65
    .line 66
    iget-object v3, v3, La/sj30;->y:La/f7z;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    iput-boolean v5, v3, La/f7z;->b:Z

    .line 70
    .line 71
    iput-boolean v2, v3, La/f7z;->c:Z

    .line 72
    .line 73
    iput-boolean v2, v3, La/f7z;->e:Z

    .line 74
    .line 75
    iput-boolean v2, v3, La/f7z;->d:Z

    .line 76
    .line 77
    iput-boolean v2, v3, La/f7z;->f:Z

    .line 78
    .line 79
    iput-boolean v2, v3, La/f7z;->g:Z

    .line 80
    .line 81
    iput-object v1, v3, La/f7z;->h:La/b22;

    .line 82
    .line 83
    iget-object v3, v4, La/i7z;->q:La/i810;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    iget-object v3, v3, La/i810;->s:La/f7z;

    .line 88
    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iput-boolean v5, v3, La/f7z;->b:Z

    .line 92
    .line 93
    iput-boolean v2, v3, La/f7z;->c:Z

    .line 94
    .line 95
    iput-boolean v2, v3, La/f7z;->e:Z

    .line 96
    .line 97
    iput-boolean v2, v3, La/f7z;->d:Z

    .line 98
    .line 99
    iput-boolean v2, v3, La/f7z;->f:Z

    .line 100
    .line 101
    iput-boolean v2, v3, La/f7z;->g:Z

    .line 102
    .line 103
    iput-object v1, v3, La/f7z;->h:La/b22;

    .line 104
    .line 105
    :cond_3
    iget-object v3, p0, La/e7z;->h1:La/tzi;

    .line 106
    .line 107
    iget-object v6, v3, La/tzi;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v6, La/s460;

    .line 110
    .line 111
    iget-object v7, v3, La/tzi;->f:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v7, La/wso0;

    .line 114
    .line 115
    iget-object v8, v3, La/tzi;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v8, La/rdx;

    .line 118
    .line 119
    iget-object v8, v8, La/s460;->v:La/s460;

    .line 120
    .line 121
    :goto_0
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-nez v9, :cond_5

    .line 126
    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    invoke-virtual {v6}, La/s460;->z1()V

    .line 130
    .line 131
    .line 132
    iget-object v9, v6, La/s460;->u:La/e7z;

    .line 133
    .line 134
    invoke-virtual {v9}, La/e7z;->J()Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-eqz v9, :cond_4

    .line 139
    .line 140
    invoke-virtual {v6}, La/s460;->u1()V

    .line 141
    .line 142
    .line 143
    :cond_4
    iget-object v6, v6, La/s460;->v:La/s460;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    iget-object v6, p0, La/e7z;->p1:La/e33;

    .line 147
    .line 148
    if-eqz v6, :cond_6

    .line 149
    .line 150
    invoke-virtual {v6, v0}, La/e33;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_6
    move-object v6, v7

    .line 154
    :goto_1
    if-eqz v6, :cond_8

    .line 155
    .line 156
    iget-boolean v8, v6, La/lm40;->n:Z

    .line 157
    .line 158
    if-eqz v8, :cond_7

    .line 159
    .line 160
    invoke-virtual {v6}, La/lm40;->W0()V

    .line 161
    .line 162
    .line 163
    :cond_7
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_8
    iput-boolean v5, p0, La/e7z;->r:Z

    .line 167
    .line 168
    iget-object v6, p0, La/e7z;->k:La/nw20;

    .line 169
    .line 170
    iget-object v6, v6, La/nw20;->a:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, La/xz40;

    .line 173
    .line 174
    iget-object v8, v6, La/xz40;->a:[Ljava/lang/Object;

    .line 175
    .line 176
    iget v6, v6, La/xz40;->c:I

    .line 177
    .line 178
    move v9, v2

    .line 179
    :goto_2
    if-ge v9, v6, :cond_9

    .line 180
    .line 181
    aget-object v10, v8, v9

    .line 182
    .line 183
    check-cast v10, La/e7z;

    .line 184
    .line 185
    invoke-virtual {v10}, La/e7z;->i()V

    .line 186
    .line 187
    .line 188
    add-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    iput-boolean v2, p0, La/e7z;->r:Z

    .line 192
    .line 193
    :goto_3
    if-eqz v7, :cond_b

    .line 194
    .line 195
    iget-boolean v6, v7, La/lm40;->n:Z

    .line 196
    .line 197
    if-eqz v6, :cond_a

    .line 198
    .line 199
    invoke-virtual {v7}, La/lm40;->Q0()V

    .line 200
    .line 201
    .line 202
    :cond_a
    iget-object v7, v7, La/lm40;->e:La/lm40;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_b
    move-object v6, v0

    .line 206
    check-cast v6, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 207
    .line 208
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    iget v8, p0, La/e7z;->b:I

    .line 213
    .line 214
    invoke-virtual {v7, v8}, La/ey40;->h(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    iget-object v7, v6, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 218
    .line 219
    iget-object v8, v7, La/h7k;->e:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v8, La/oif0;

    .line 222
    .line 223
    iget-object v9, v8, La/oif0;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v9, La/clc;

    .line 226
    .line 227
    invoke-virtual {v9, p0}, La/clc;->g(La/e7z;)Z

    .line 228
    .line 229
    .line 230
    iget-object v9, v8, La/oif0;->c:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v9, La/clc;

    .line 233
    .line 234
    invoke-virtual {v9, p0}, La/clc;->g(La/e7z;)Z

    .line 235
    .line 236
    .line 237
    iget-object v8, v8, La/oif0;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v8, La/clc;

    .line 240
    .line 241
    invoke-virtual {v8, p0}, La/clc;->g(La/e7z;)Z

    .line 242
    .line 243
    .line 244
    iget-object v7, v7, La/h7k;->f:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v7, La/kd30;

    .line 247
    .line 248
    iget-object v7, v7, La/kd30;->a:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v7, La/xz40;

    .line 251
    .line 252
    invoke-virtual {v7, p0}, La/xz40;->j(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    iput-boolean v5, v6, Landroidx/compose/ui/platform/AndroidComposeView;->n1:Z

    .line 256
    .line 257
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_c

    .line 262
    .line 263
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-eqz v5, :cond_c

    .line 268
    .line 269
    iget-object v7, v5, La/jw2;->h:La/fy40;

    .line 270
    .line 271
    iget v8, p0, La/e7z;->b:I

    .line 272
    .line 273
    invoke-virtual {v7, v8}, La/fy40;->g(I)Z

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-eqz v7, :cond_c

    .line 278
    .line 279
    iget-object v7, v5, La/jw2;->a:La/j910;

    .line 280
    .line 281
    iget-object v5, v5, La/jw2;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 282
    .line 283
    iget v8, p0, La/e7z;->b:I

    .line 284
    .line 285
    invoke-virtual {v7, v5, v8, v2}, La/j910;->z(Landroid/view/View;IZ)V

    .line 286
    .line 287
    .line 288
    :cond_c
    invoke-interface {v0}, La/cg80;->getRectManager()La/oge0;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v5, p0}, La/oge0;->h(La/e7z;)V

    .line 293
    .line 294
    .line 295
    iput-object v1, p0, La/e7z;->o:La/cg80;

    .line 296
    .line 297
    invoke-virtual {p0, v1}, La/e7z;->c0(La/e7z;)V

    .line 298
    .line 299
    .line 300
    iput v2, p0, La/e7z;->q:I

    .line 301
    .line 302
    iget-object v5, v4, La/i7z;->p:La/sj30;

    .line 303
    .line 304
    const v7, 0x7fffffff

    .line 305
    .line 306
    .line 307
    iput v7, v5, La/sj30;->i:I

    .line 308
    .line 309
    iput v7, v5, La/sj30;->h:I

    .line 310
    .line 311
    iput-boolean v2, v5, La/sj30;->t:Z

    .line 312
    .line 313
    iget-object v4, v4, La/i7z;->q:La/i810;

    .line 314
    .line 315
    if-eqz v4, :cond_d

    .line 316
    .line 317
    iput v7, v4, La/i810;->i:I

    .line 318
    .line 319
    iput v7, v4, La/i810;->h:I

    .line 320
    .line 321
    sget-object v5, La/h810;->c:La/h810;

    .line 322
    .line 323
    iput-object v5, v4, La/i810;->r:La/h810;

    .line 324
    .line 325
    :cond_d
    const/16 v4, 0x8

    .line 326
    .line 327
    invoke-virtual {v3, v4}, La/tzi;->j(I)Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_e

    .line 332
    .line 333
    iget-object v3, p0, La/e7z;->t:La/nai0;

    .line 334
    .line 335
    iput-object v1, p0, La/e7z;->t:La/nai0;

    .line 336
    .line 337
    iput-boolean v2, p0, La/e7z;->s:Z

    .line 338
    .line 339
    invoke-interface {v0}, La/cg80;->getSemanticsOwner()La/wai0;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0, p0, v3}, La/wai0;->b(La/e7z;La/nai0;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->z()V

    .line 347
    .line 348
    .line 349
    :cond_e
    return-void
.end method

.method public final j(La/x5a;La/dfv;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 2
    .line 3
    iget-object v0, v0, La/tzi;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/s460;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, La/s460;->Z0(La/x5a;La/dfv;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    invoke-virtual {p0, p1}, La/e7z;->Z(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, La/e7z;->i:La/e7z;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, La/e7z;->U(La/e7z;ZI)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, v2, v1}, La/e7z;->W(La/e7z;ZI)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 15
    .line 16
    iget-object v0, v0, La/i7z;->p:La/sj30;

    .line 17
    .line 18
    iget-boolean v1, v0, La/sj30;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-wide v0, v0, La/pu90;->d:J

    .line 23
    .line 24
    new-instance v2, La/p4e;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/p4e;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_1
    iget-object v0, p0, La/e7z;->o:La/cg80;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-wide v1, v2, La/p4e;->a:J

    .line 38
    .line 39
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->t(La/e7z;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public final m()Ljava/util/List;
    .locals 9

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/i810;->t:La/xz40;

    .line 9
    .line 10
    iget-object v1, p0, La/i810;->f:La/i7z;

    .line 11
    .line 12
    iget-object v2, v1, La/i7z;->a:La/e7z;

    .line 13
    .line 14
    invoke-virtual {v2}, La/e7z;->o()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-boolean v2, p0, La/i810;->u:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, La/xz40;->f()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v1, v1, La/i7z;->a:La/e7z;

    .line 27
    .line 28
    invoke-virtual {v1}, La/e7z;->A()La/xz40;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v2, v2, La/xz40;->c:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v5, v2, :cond_2

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    check-cast v6, La/e7z;

    .line 43
    .line 44
    iget v7, v0, La/xz40;->c:I

    .line 45
    .line 46
    if-gt v7, v5, :cond_1

    .line 47
    .line 48
    iget-object v6, v6, La/e7z;->i1:La/i7z;

    .line 49
    .line 50
    iget-object v6, v6, La/i7z;->q:La/i810;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object v6, v6, La/e7z;->i1:La/i7z;

    .line 60
    .line 61
    iget-object v6, v6, La/i7z;->q:La/i810;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v7, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v8, v7, v5

    .line 69
    .line 70
    aput-object v6, v7, v5

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v1}, La/e7z;->o()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, La/ty40;

    .line 80
    .line 81
    iget-object v1, v1, La/ty40;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, La/xz40;

    .line 84
    .line 85
    iget v1, v1, La/xz40;->c:I

    .line 86
    .line 87
    iget v2, v0, La/xz40;->c:I

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, La/xz40;->l(II)V

    .line 90
    .line 91
    .line 92
    iput-boolean v4, p0, La/i810;->u:Z

    .line 93
    .line 94
    invoke-virtual {v0}, La/xz40;->f()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public final n()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    invoke-virtual {p0}, La/sj30;->x0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final o()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/xz40;->f()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final p()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->k:La/nw20;

    .line 2
    .line 3
    iget-object p0, p0, La/nw20;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/xz40;

    .line 6
    .line 7
    invoke-virtual {p0}, La/xz40;->f()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget-boolean p0, p0, La/sj30;->w:Z

    .line 6
    .line 7
    return p0
.end method

.method public final r()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget-boolean p0, p0, La/sj30;->v:Z

    .line 6
    .line 7
    return p0
.end method

.method public final s()La/c7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget-object p0, p0, La/sj30;->l:La/c7z;

    .line 6
    .line 7
    return-object p0
.end method

.method public final t()La/c7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, La/i810;->j:La/c7z;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    sget-object p0, La/c7z;->c:La/c7z;

    .line 14
    .line 15
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, La/yyw;->a0(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La/e7z;->o()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/ty40;

    .line 10
    .line 11
    iget-object v1, v1, La/ty40;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/xz40;

    .line 14
    .line 15
    iget v1, v1, La/xz40;->c:I

    .line 16
    .line 17
    iget-object v2, p0, La/e7z;->x:La/tj30;

    .line 18
    .line 19
    iget-boolean v3, p0, La/e7z;->s1:Z

    .line 20
    .line 21
    invoke-virtual {p0}, La/e7z;->J()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, " children: "

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, " measurePolicy: "

    .line 39
    .line 40
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, " deactivated: "

    .line 47
    .line 48
    const-string v1, " isVirtual: "

    .line 49
    .line 50
    iget-boolean p0, p0, La/e7z;->a:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v5, v3, p0}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 53
    .line 54
    .line 55
    const-string p0, " isPlaced: "

    .line 56
    .line 57
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public final u()La/u8u;
    .locals 2

    .line 1
    iget-object v0, p0, La/e7z;->y:La/u8u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/u8u;

    .line 6
    .line 7
    iget-object v1, p0, La/e7z;->x:La/tj30;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/u8u;-><init>(La/e7z;La/tj30;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/e7z;->y:La/u8u;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final v()La/e7z;
    .locals 2

    .line 1
    iget-object p0, p0, La/e7z;->n:La/e7z;

    .line 2
    .line 3
    :goto_0
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/e7z;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, La/e7z;->n:La/e7z;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object p0
.end method

.method public final w()I
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget p0, p0, La/sj30;->i:I

    .line 6
    .line 7
    return p0
.end method

.method public final x()La/nai0;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, La/e7z;->s1:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/tzi;->j(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, La/e7z;->t:La/nai0;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final y()F
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 4
    .line 5
    iget p0, p0, La/sj30;->g1:F

    .line 6
    .line 7
    return p0
.end method

.method public final z()La/xz40;
    .locals 5

    .line 1
    iget-boolean v0, p0, La/e7z;->w:Z

    .line 2
    .line 3
    iget-object v1, p0, La/e7z;->v:La/xz40;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, La/xz40;->g()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, La/xz40;->c:I

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, La/xz40;->c(ILa/xz40;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, v1, La/xz40;->c:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    sget-object v4, La/e7z;->w1:La/l13;

    .line 25
    .line 26
    invoke-static {v0, v3, v2, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v3, p0, La/e7z;->w:Z

    .line 30
    .line 31
    :cond_0
    return-object v1
.end method
