.class public final La/h7k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/e7z;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/h7k;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/h7k;->d:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, La/oif0;

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    invoke-direct {p1, v0}, La/oif0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/h7k;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, La/kd30;

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    invoke-direct {p1, v0}, La/kd30;-><init>(B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/h7k;->f:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance p1, La/xz40;

    .line 27
    .line 28
    const/16 v0, 0x10

    .line 29
    .line 30
    new-array v1, v0, [La/e7z;

    .line 31
    .line 32
    invoke-direct {p1, v1}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/h7k;->g:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance p1, La/xz40;

    .line 38
    .line 39
    new-array v0, v0, [La/qj30;

    .line 40
    .line 41
    invoke-direct {p1, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, La/h7k;->h:Ljava/lang/Object;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(La/l4e;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/h7k;->a:B

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, La/h7k;->b:Z

    .line 60
    iput-boolean v0, p0, La/h7k;->c:Z

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/h7k;->f:Ljava/lang/Object;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, La/h7k;->h:Ljava/lang/Object;

    .line 64
    new-instance v0, La/q96;

    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object v0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/h7k;->g:Ljava/lang/Object;

    .line 68
    iput-object p1, p0, La/h7k;->d:Ljava/lang/Object;

    .line 69
    iput-object p1, p0, La/h7k;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/roi0;La/ieu;La/onv;La/e1u;La/ahu;La/pmi;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/h7k;->a:B

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, La/h7k;->d:Ljava/lang/Object;

    .line 51
    iput-object p2, p0, La/h7k;->e:Ljava/lang/Object;

    .line 52
    iput-object p3, p0, La/h7k;->f:Ljava/lang/Object;

    .line 53
    iput-object p4, p0, La/h7k;->g:Ljava/lang/Object;

    .line 54
    iput-object p5, p0, La/h7k;->h:Ljava/lang/Object;

    .line 55
    iput-object p6, p0, La/h7k;->i:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, La/h7k;->b:Z

    .line 57
    iput-boolean p1, p0, La/h7k;->c:Z

    return-void
.end method

.method public constructor <init>(ZZLa/y190;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 10

    const/4 v0, 0x1

    iput-byte v0, p0, La/h7k;->a:B

    .line 47
    sget-object v9, La/lun;->a:La/lun;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 48
    invoke-direct/range {v1 .. v9}, La/h7k;-><init>(ZZLa/y190;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(ZZLa/y190;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/h7k;->a:B

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-boolean p1, p0, La/h7k;->b:Z

    .line 72
    iput-boolean p2, p0, La/h7k;->c:Z

    .line 73
    iput-object p3, p0, La/h7k;->d:Ljava/lang/Object;

    .line 74
    iput-object p4, p0, La/h7k;->e:Ljava/lang/Object;

    .line 75
    iput-object p5, p0, La/h7k;->f:Ljava/lang/Object;

    .line 76
    iput-object p6, p0, La/h7k;->g:Ljava/lang/Object;

    .line 77
    iput-object p7, p0, La/h7k;->h:Ljava/lang/Object;

    .line 78
    invoke-static {p8}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, La/h7k;->i:Ljava/lang/Object;

    return-void
.end method

.method public static f(La/e7z;La/p4e;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/e7z;->i:La/e7z;

    .line 2
    .line 3
    iget-object v1, p0, La/e7z;->i1:La/i7z;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, La/i7z;->q:La/i810;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, La/p4e;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, La/i810;->L0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, La/i7z;->q:La/i810;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, La/i810;->n:La/p4e;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, La/p4e;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, La/i810;->L0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, La/e7z;->i:La/e7z;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, La/e7z;->W(La/e7z;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, La/e7z;->t()La/c7z;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, La/c7z;->a:La/c7z;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, La/e7z;->U(La/e7z;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, La/e7z;->t()La/c7z;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, La/c7z;->b:La/c7z;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, La/e7z;->T(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
.end method

.method public static g(La/e7z;La/p4e;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, La/e7z;->Z:La/c7z;

    .line 5
    .line 6
    sget-object v2, La/c7z;->c:La/c7z;

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, La/e7z;->d()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, La/e7z;->i1:La/i7z;

    .line 14
    .line 15
    iget-object v1, v1, La/i7z;->p:La/sj30;

    .line 16
    .line 17
    iget-wide v2, p1, La/p4e;->a:J

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, La/sj30;->L0(J)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object p1, p0, La/e7z;->i1:La/i7z;

    .line 25
    .line 26
    iget-object p1, p1, La/i7z;->p:La/sj30;

    .line 27
    .line 28
    iget-boolean v1, p1, La/sj30;->j:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-wide v1, p1, La/pu90;->d:J

    .line 33
    .line 34
    new-instance p1, La/p4e;

    .line 35
    .line 36
    invoke-direct {p1, v1, v2}, La/p4e;-><init>(J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    :goto_0
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-object v1, p0, La/e7z;->Z:La/c7z;

    .line 44
    .line 45
    sget-object v2, La/c7z;->c:La/c7z;

    .line 46
    .line 47
    if-ne v1, v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, La/e7z;->d()V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget-object v1, p0, La/e7z;->i1:La/i7z;

    .line 53
    .line 54
    iget-object v1, v1, La/i7z;->p:La/sj30;

    .line 55
    .line 56
    iget-wide v2, p1, La/p4e;->a:J

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, La/sj30;->L0(J)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move p1, v0

    .line 64
    :goto_1
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz p1, :cond_6

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0}, La/e7z;->s()La/c7z;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v3, La/c7z;->a:La/c7z;

    .line 77
    .line 78
    if-ne v2, v3, :cond_5

    .line 79
    .line 80
    const/4 p0, 0x3

    .line 81
    invoke-static {v1, v0, p0}, La/e7z;->W(La/e7z;ZI)V

    .line 82
    .line 83
    .line 84
    return p1

    .line 85
    :cond_5
    invoke-virtual {p0}, La/e7z;->s()La/c7z;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v2, La/c7z;->b:La/c7z;

    .line 90
    .line 91
    if-ne p0, v2, :cond_6

    .line 92
    .line 93
    invoke-virtual {v1, v0}, La/e7z;->V(Z)V

    .line 94
    .line 95
    .line 96
    :cond_6
    return p1
.end method

.method public static m(La/e7z;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-boolean v0, v0, La/i7z;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/e7z;->t()La/c7z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/c7z;->c:La/c7z;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 17
    .line 18
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, La/i810;->s:La/f7z;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, La/f7z;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static n(La/e7z;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La/e7z;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, La/e7z;->s()La/c7z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/c7z;->c:La/c7z;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 16
    .line 17
    iget-object v0, v0, La/i7z;->p:La/sj30;

    .line 18
    .line 19
    iget-object v0, v0, La/sj30;->y:La/f7z;

    .line 20
    .line 21
    invoke-virtual {v0}, La/f7z;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, La/e7z;->i1:La/i7z;

    .line 34
    .line 35
    iget-object v0, v0, La/i7z;->d:La/a7z;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, La/a7z;->a:La/a7z;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, La/e7z;->J()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static r(La/e7z;)Z
    .locals 4

    .line 1
    iget-object v0, p0, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/e7z;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, La/i7z;->p:La/sj30;

    .line 11
    .line 12
    iget-boolean v1, v1, La/sj30;->u:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/h7k;->n(La/e7z;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, La/e7z;->K()Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, La/h7k;->m(La/e7z;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/i7z;->p:La/sj30;

    .line 41
    .line 42
    iget-object p0, p0, La/sj30;->y:La/f7z;

    .line 43
    .line 44
    invoke-virtual {p0}, La/f7z;->e()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    iget-object p0, v0, La/i7z;->q:La/i810;

    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, La/i810;->s:La/f7z;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, La/f7z;->e()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ne p0, v2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_1
    :goto_0
    return v2
.end method


# virtual methods
.method public A(La/e7z;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, La/e7z;->s1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/e7z;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/p4e;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-static {p1, p0}, La/h7k;->f(La/e7z;La/p4e;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    invoke-static {p1, p0}, La/h7k;->g(La/e7z;La/p4e;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public B(La/e7z;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    iget-object v0, v0, La/i7z;->d:La/a7z;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, La/e7z;->i1:La/i7z;

    .line 34
    .line 35
    iget-object p2, p2, La/i7z;->p:La/sj30;

    .line 36
    .line 37
    iput-boolean v2, p2, La/sj30;->v:Z

    .line 38
    .line 39
    iget-boolean p2, p1, La/e7z;->s1:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, La/h7k;->n(La/e7z;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, La/e7z;->r()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, La/h7k;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, La/oif0;

    .line 72
    .line 73
    sget-object v0, La/eox;->c:La/eox;

    .line 74
    .line 75
    invoke-virtual {p2, p1, v0}, La/oif0;->a(La/e7z;La/eox;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-boolean p0, p0, La/h7k;->c:Z

    .line 79
    .line 80
    if-nez p0, :cond_6

    .line 81
    .line 82
    return v2

    .line 83
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    iget-object p0, p0, La/h7k;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, La/xz40;

    .line 90
    .line 91
    new-instance v0, La/qj30;

    .line 92
    .line 93
    invoke-direct {v0, p1, v1, p2}, La/qj30;-><init>(La/e7z;ZZ)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_1
    return v1
.end method

.method public C(J)V
    .locals 3

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e7z;

    .line 4
    .line 5
    iget-object v1, p0, La/h7k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/p4e;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v1, v1, La/p4e;->a:J

    .line 14
    .line 15
    invoke-static {v1, v2, p1, p2}, La/p4e;->c(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-nez v1, :cond_5

    .line 20
    .line 21
    iget-boolean v1, p0, La/h7k;->b:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, "updateRootConstraints called while measuring"

    .line 26
    .line 27
    invoke-static {v1}, La/xcx;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance v1, La/p4e;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2}, La/p4e;-><init>(J)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, La/h7k;->i:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v0}, La/e7z;->I()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object p2, v0, La/e7z;->i1:La/i7z;

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    iget-object p1, v0, La/e7z;->i:La/e7z;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput-boolean v1, p2, La/i7z;->e:Z

    .line 52
    .line 53
    :cond_3
    iget-object p2, p2, La/i7z;->p:La/sj30;

    .line 54
    .line 55
    iput-boolean v1, p2, La/sj30;->v:Z

    .line 56
    .line 57
    iget-object p0, p0, La/h7k;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/oif0;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    sget-object p1, La/eox;->a:La/eox;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    sget-object p1, La/eox;->c:La/eox;

    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, v0, p1}, La/oif0;->a(La/e7z;La/eox;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    :goto_2
    return-void
.end method

.method public a(La/i7k;ILjava/util/ArrayList;La/nog0;)V
    .locals 6

    .line 1
    iget-object p1, p1, La/i7k;->d:La/hev0;

    .line 2
    .line 3
    iget-object v0, p1, La/hev0;->c:La/nog0;

    .line 4
    .line 5
    iget-object v1, p1, La/hev0;->i:La/i7k;

    .line 6
    .line 7
    iget-object v2, p1, La/hev0;->h:La/i7k;

    .line 8
    .line 9
    if-nez v0, :cond_a

    .line 10
    .line 11
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/l4e;

    .line 14
    .line 15
    iget-object v3, v0, La/k4e;->d:La/cmw;

    .line 16
    .line 17
    if-eq p1, v3, :cond_a

    .line 18
    .line 19
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    if-nez p4, :cond_1

    .line 26
    .line 27
    new-instance p4, La/nog0;

    .line 28
    .line 29
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p4, La/nog0;->a:La/hev0;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p4, La/nog0;->b:Ljava/util/ArrayList;

    .line 41
    .line 42
    iput-object p1, p4, La/nog0;->a:La/hev0;

    .line 43
    .line 44
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    iput-object p4, p1, La/hev0;->c:La/nog0;

    .line 48
    .line 49
    iget-object v0, p4, La/nog0;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, v2, La/i7k;->k:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, La/d7k;

    .line 71
    .line 72
    instance-of v4, v3, La/i7k;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    check-cast v3, La/i7k;

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    iget-object v0, v1, La/i7k;->k:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, La/d7k;

    .line 99
    .line 100
    instance-of v4, v3, La/i7k;

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    check-cast v3, La/i7k;

    .line 105
    .line 106
    invoke-virtual {p0, v3, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v0, 0x1

    .line 111
    if-ne p2, v0, :cond_7

    .line 112
    .line 113
    instance-of v3, p1, La/ocu0;

    .line 114
    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, La/ocu0;

    .line 119
    .line 120
    iget-object v3, v3, La/ocu0;->k:La/i7k;

    .line 121
    .line 122
    iget-object v3, v3, La/i7k;->k:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, La/d7k;

    .line 139
    .line 140
    instance-of v5, v4, La/i7k;

    .line 141
    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    check-cast v4, La/i7k;

    .line 145
    .line 146
    invoke-virtual {p0, v4, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    iget-object v2, v2, La/i7k;->l:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, La/i7k;

    .line 167
    .line 168
    invoke-virtual {p0, v3, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    iget-object v1, v1, La/i7k;->l:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, La/i7k;

    .line 189
    .line 190
    invoke-virtual {p0, v2, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    if-ne p2, v0, :cond_a

    .line 195
    .line 196
    instance-of v0, p1, La/ocu0;

    .line 197
    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    check-cast p1, La/ocu0;

    .line 201
    .line 202
    iget-object p1, p1, La/ocu0;->k:La/i7k;

    .line 203
    .line 204
    iget-object p1, p1, La/i7k;->l:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, La/i7k;

    .line 221
    .line 222
    invoke-virtual {p0, v0, p2, p3, p4}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    :goto_6
    return-void
.end method

.method public b(La/l4e;)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, La/l4e;->u0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_29

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    move-object v4, v2

    .line 20
    check-cast v4, La/k4e;

    .line 21
    .line 22
    iget-object v2, v4, La/k4e;->U:[La/j4e;

    .line 23
    .line 24
    iget-object v3, v4, La/k4e;->R:[La/w2e;

    .line 25
    .line 26
    iget-object v5, v4, La/k4e;->M:La/w2e;

    .line 27
    .line 28
    iget-object v6, v4, La/k4e;->K:La/w2e;

    .line 29
    .line 30
    iget-object v7, v4, La/k4e;->L:La/w2e;

    .line 31
    .line 32
    iget-object v8, v4, La/k4e;->J:La/w2e;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    aget-object v10, v2, v9

    .line 36
    .line 37
    const/4 v11, 0x1

    .line 38
    aget-object v2, v2, v11

    .line 39
    .line 40
    iget v12, v4, La/k4e;->i0:I

    .line 41
    .line 42
    const/16 v13, 0x8

    .line 43
    .line 44
    if-ne v12, v13, :cond_0

    .line 45
    .line 46
    iput-boolean v11, v4, La/k4e;->a:Z

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget v12, v4, La/k4e;->x:F

    .line 50
    .line 51
    const/high16 v13, 0x3f800000    # 1.0f

    .line 52
    .line 53
    cmpg-float v14, v12, v13

    .line 54
    .line 55
    sget-object v15, La/j4e;->c:La/j4e;

    .line 56
    .line 57
    move/from16 v16, v9

    .line 58
    .line 59
    const/4 v9, 0x2

    .line 60
    if-gez v14, :cond_1

    .line 61
    .line 62
    if-ne v10, v15, :cond_1

    .line 63
    .line 64
    iput v9, v4, La/k4e;->s:I

    .line 65
    .line 66
    :cond_1
    iget v14, v4, La/k4e;->A:F

    .line 67
    .line 68
    cmpg-float v17, v14, v13

    .line 69
    .line 70
    if-gez v17, :cond_2

    .line 71
    .line 72
    if-ne v2, v15, :cond_2

    .line 73
    .line 74
    iput v9, v4, La/k4e;->t:I

    .line 75
    .line 76
    :cond_2
    move/from16 v17, v13

    .line 77
    .line 78
    iget v13, v4, La/k4e;->Y:F

    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    cmpl-float v13, v13, v18

    .line 83
    .line 84
    sget-object v9, La/j4e;->a:La/j4e;

    .line 85
    .line 86
    sget-object v11, La/j4e;->b:La/j4e;

    .line 87
    .line 88
    move-object/from16 v19, v1

    .line 89
    .line 90
    const/4 v1, 0x3

    .line 91
    if-lez v13, :cond_8

    .line 92
    .line 93
    if-ne v10, v15, :cond_4

    .line 94
    .line 95
    if-eq v2, v11, :cond_3

    .line 96
    .line 97
    if-ne v2, v9, :cond_4

    .line 98
    .line 99
    :cond_3
    iput v1, v4, La/k4e;->s:I

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    if-ne v2, v15, :cond_6

    .line 103
    .line 104
    if-eq v10, v11, :cond_5

    .line 105
    .line 106
    if-ne v10, v9, :cond_6

    .line 107
    .line 108
    :cond_5
    iput v1, v4, La/k4e;->t:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    if-ne v10, v15, :cond_8

    .line 112
    .line 113
    if-ne v2, v15, :cond_8

    .line 114
    .line 115
    iget v13, v4, La/k4e;->s:I

    .line 116
    .line 117
    if-nez v13, :cond_7

    .line 118
    .line 119
    iput v1, v4, La/k4e;->s:I

    .line 120
    .line 121
    :cond_7
    iget v13, v4, La/k4e;->t:I

    .line 122
    .line 123
    if-nez v13, :cond_8

    .line 124
    .line 125
    iput v1, v4, La/k4e;->t:I

    .line 126
    .line 127
    :cond_8
    :goto_1
    if-ne v10, v15, :cond_a

    .line 128
    .line 129
    iget v13, v4, La/k4e;->s:I

    .line 130
    .line 131
    const/4 v1, 0x1

    .line 132
    if-ne v13, v1, :cond_a

    .line 133
    .line 134
    iget-object v1, v8, La/w2e;->f:La/w2e;

    .line 135
    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    iget-object v1, v7, La/w2e;->f:La/w2e;

    .line 139
    .line 140
    if-nez v1, :cond_a

    .line 141
    .line 142
    :cond_9
    move-object v10, v11

    .line 143
    :cond_a
    if-ne v2, v15, :cond_c

    .line 144
    .line 145
    iget v1, v4, La/k4e;->t:I

    .line 146
    .line 147
    const/4 v13, 0x1

    .line 148
    if-ne v1, v13, :cond_c

    .line 149
    .line 150
    iget-object v1, v6, La/w2e;->f:La/w2e;

    .line 151
    .line 152
    if-eqz v1, :cond_b

    .line 153
    .line 154
    iget-object v1, v5, La/w2e;->f:La/w2e;

    .line 155
    .line 156
    if-nez v1, :cond_c

    .line 157
    .line 158
    :cond_b
    move-object v2, v11

    .line 159
    :cond_c
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 160
    .line 161
    iput-object v10, v1, La/hev0;->d:La/j4e;

    .line 162
    .line 163
    iget v13, v4, La/k4e;->s:I

    .line 164
    .line 165
    iput v13, v1, La/hev0;->a:I

    .line 166
    .line 167
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 168
    .line 169
    iput-object v2, v1, La/hev0;->d:La/j4e;

    .line 170
    .line 171
    move-object/from16 v21, v3

    .line 172
    .line 173
    iget v3, v4, La/k4e;->t:I

    .line 174
    .line 175
    iput v3, v1, La/hev0;->a:I

    .line 176
    .line 177
    sget-object v1, La/j4e;->d:La/j4e;

    .line 178
    .line 179
    if-eq v10, v1, :cond_d

    .line 180
    .line 181
    if-eq v10, v9, :cond_d

    .line 182
    .line 183
    if-ne v10, v11, :cond_e

    .line 184
    .line 185
    :cond_d
    if-eq v2, v1, :cond_26

    .line 186
    .line 187
    if-eq v2, v9, :cond_26

    .line 188
    .line 189
    if-ne v2, v11, :cond_e

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_e
    const/high16 v22, 0x3f000000    # 0.5f

    .line 194
    .line 195
    if-ne v10, v15, :cond_10

    .line 196
    .line 197
    if-eq v2, v11, :cond_f

    .line 198
    .line 199
    if-ne v2, v9, :cond_10

    .line 200
    .line 201
    :cond_f
    const/4 v5, 0x3

    .line 202
    goto :goto_2

    .line 203
    :cond_10
    move-object v7, v2

    .line 204
    move-object v5, v11

    .line 205
    goto/16 :goto_5

    .line 206
    .line 207
    :goto_2
    if-ne v13, v5, :cond_13

    .line 208
    .line 209
    if-ne v2, v11, :cond_11

    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    move-object v7, v11

    .line 214
    move-object/from16 v3, p0

    .line 215
    .line 216
    move-object v5, v11

    .line 217
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 218
    .line 219
    .line 220
    :cond_11
    invoke-virtual {v4}, La/k4e;->m()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    int-to-float v1, v8

    .line 225
    iget v2, v4, La/k4e;->Y:F

    .line 226
    .line 227
    mul-float/2addr v1, v2

    .line 228
    add-float v1, v1, v22

    .line 229
    .line 230
    float-to-int v6, v1

    .line 231
    move-object v7, v9

    .line 232
    move-object/from16 v3, p0

    .line 233
    .line 234
    move-object v5, v9

    .line 235
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 236
    .line 237
    .line 238
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 239
    .line 240
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 241
    .line 242
    invoke-virtual {v4}, La/k4e;->s()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 250
    .line 251
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 252
    .line 253
    invoke-virtual {v4}, La/k4e;->m()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 258
    .line 259
    .line 260
    const/4 v5, 0x1

    .line 261
    iput-boolean v5, v4, La/k4e;->a:Z

    .line 262
    .line 263
    :cond_12
    :goto_3
    move-object/from16 v1, v19

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_13
    move-object v7, v9

    .line 268
    move-object v6, v11

    .line 269
    const/4 v5, 0x1

    .line 270
    if-ne v13, v5, :cond_14

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    const/4 v8, 0x0

    .line 274
    move-object/from16 v3, p0

    .line 275
    .line 276
    move-object v7, v2

    .line 277
    move-object v5, v6

    .line 278
    move v6, v1

    .line 279
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 283
    .line 284
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 285
    .line 286
    invoke-virtual {v4}, La/k4e;->s()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    iput v2, v1, La/vmk;->m:I

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_14
    move-object v5, v6

    .line 294
    const/4 v6, 0x2

    .line 295
    if-ne v13, v6, :cond_17

    .line 296
    .line 297
    iget-object v6, v0, La/k4e;->U:[La/j4e;

    .line 298
    .line 299
    aget-object v6, v6, v16

    .line 300
    .line 301
    if-eq v6, v7, :cond_16

    .line 302
    .line 303
    if-ne v6, v1, :cond_15

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_15
    move-object v9, v7

    .line 307
    move-object v7, v2

    .line 308
    goto :goto_5

    .line 309
    :cond_16
    :goto_4
    invoke-virtual {v0}, La/k4e;->s()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    int-to-float v1, v1

    .line 314
    mul-float/2addr v12, v1

    .line 315
    add-float v12, v12, v22

    .line 316
    .line 317
    float-to-int v6, v12

    .line 318
    invoke-virtual {v4}, La/k4e;->m()I

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    move-object/from16 v3, p0

    .line 323
    .line 324
    move-object v5, v7

    .line 325
    move-object v7, v2

    .line 326
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 330
    .line 331
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 332
    .line 333
    invoke-virtual {v4}, La/k4e;->s()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 338
    .line 339
    .line 340
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 341
    .line 342
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 343
    .line 344
    invoke-virtual {v4}, La/k4e;->m()I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 349
    .line 350
    .line 351
    const/4 v2, 0x1

    .line 352
    iput-boolean v2, v4, La/k4e;->a:Z

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_17
    move-object v9, v7

    .line 356
    move-object v7, v2

    .line 357
    const/4 v2, 0x1

    .line 358
    aget-object v6, v21, v16

    .line 359
    .line 360
    iget-object v6, v6, La/w2e;->f:La/w2e;

    .line 361
    .line 362
    if-eqz v6, :cond_18

    .line 363
    .line 364
    aget-object v6, v21, v2

    .line 365
    .line 366
    iget-object v2, v6, La/w2e;->f:La/w2e;

    .line 367
    .line 368
    if-nez v2, :cond_19

    .line 369
    .line 370
    :cond_18
    const/4 v6, 0x0

    .line 371
    const/4 v8, 0x0

    .line 372
    move-object/from16 v3, p0

    .line 373
    .line 374
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 375
    .line 376
    .line 377
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 378
    .line 379
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 380
    .line 381
    invoke-virtual {v4}, La/k4e;->s()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 386
    .line 387
    .line 388
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 389
    .line 390
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 391
    .line 392
    invoke-virtual {v4}, La/k4e;->m()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 397
    .line 398
    .line 399
    const/4 v1, 0x1

    .line 400
    iput-boolean v1, v4, La/k4e;->a:Z

    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :cond_19
    :goto_5
    if-ne v7, v15, :cond_1b

    .line 405
    .line 406
    if-eq v10, v5, :cond_1a

    .line 407
    .line 408
    if-ne v10, v9, :cond_1b

    .line 409
    .line 410
    :cond_1a
    const/4 v2, 0x3

    .line 411
    goto :goto_7

    .line 412
    :cond_1b
    move-object v6, v5

    .line 413
    move-object v2, v7

    .line 414
    move-object v5, v9

    .line 415
    :goto_6
    const/4 v1, 0x1

    .line 416
    goto/16 :goto_9

    .line 417
    .line 418
    :goto_7
    if-ne v3, v2, :cond_1e

    .line 419
    .line 420
    if-ne v10, v5, :cond_1c

    .line 421
    .line 422
    const/4 v6, 0x0

    .line 423
    const/4 v8, 0x0

    .line 424
    move-object v7, v5

    .line 425
    move-object/from16 v3, p0

    .line 426
    .line 427
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 428
    .line 429
    .line 430
    :cond_1c
    invoke-virtual {v4}, La/k4e;->s()I

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    iget v1, v4, La/k4e;->Y:F

    .line 435
    .line 436
    iget v2, v4, La/k4e;->Z:I

    .line 437
    .line 438
    const/4 v3, -0x1

    .line 439
    if-ne v2, v3, :cond_1d

    .line 440
    .line 441
    div-float v1, v17, v1

    .line 442
    .line 443
    :cond_1d
    int-to-float v2, v6

    .line 444
    mul-float/2addr v2, v1

    .line 445
    add-float v2, v2, v22

    .line 446
    .line 447
    float-to-int v8, v2

    .line 448
    move-object v7, v9

    .line 449
    move-object/from16 v3, p0

    .line 450
    .line 451
    move-object v5, v9

    .line 452
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 453
    .line 454
    .line 455
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 456
    .line 457
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 458
    .line 459
    invoke-virtual {v4}, La/k4e;->s()I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 464
    .line 465
    .line 466
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 467
    .line 468
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 469
    .line 470
    invoke-virtual {v4}, La/k4e;->m()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 475
    .line 476
    .line 477
    const/4 v2, 0x1

    .line 478
    iput-boolean v2, v4, La/k4e;->a:Z

    .line 479
    .line 480
    goto/16 :goto_3

    .line 481
    .line 482
    :cond_1e
    move-object v6, v5

    .line 483
    move-object v5, v9

    .line 484
    const/4 v2, 0x1

    .line 485
    if-ne v3, v2, :cond_1f

    .line 486
    .line 487
    const/4 v1, 0x0

    .line 488
    const/4 v8, 0x0

    .line 489
    move-object/from16 v3, p0

    .line 490
    .line 491
    move-object v7, v6

    .line 492
    move-object v5, v10

    .line 493
    move v6, v1

    .line 494
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 495
    .line 496
    .line 497
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 498
    .line 499
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 500
    .line 501
    invoke-virtual {v4}, La/k4e;->m()I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    iput v2, v1, La/vmk;->m:I

    .line 506
    .line 507
    goto/16 :goto_3

    .line 508
    .line 509
    :cond_1f
    const/4 v8, 0x2

    .line 510
    if-ne v3, v8, :cond_22

    .line 511
    .line 512
    iget-object v8, v0, La/k4e;->U:[La/j4e;

    .line 513
    .line 514
    aget-object v8, v8, v2

    .line 515
    .line 516
    if-eq v8, v5, :cond_21

    .line 517
    .line 518
    if-ne v8, v1, :cond_20

    .line 519
    .line 520
    goto :goto_8

    .line 521
    :cond_20
    move-object v2, v7

    .line 522
    goto :goto_6

    .line 523
    :cond_21
    :goto_8
    invoke-virtual {v4}, La/k4e;->s()I

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    invoke-virtual {v0}, La/k4e;->m()I

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    int-to-float v1, v1

    .line 532
    mul-float/2addr v14, v1

    .line 533
    add-float v14, v14, v22

    .line 534
    .line 535
    float-to-int v8, v14

    .line 536
    move-object/from16 v3, p0

    .line 537
    .line 538
    move-object v7, v5

    .line 539
    move-object v5, v10

    .line 540
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 541
    .line 542
    .line 543
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 544
    .line 545
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 546
    .line 547
    invoke-virtual {v4}, La/k4e;->s()I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 552
    .line 553
    .line 554
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 555
    .line 556
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 557
    .line 558
    invoke-virtual {v4}, La/k4e;->m()I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 563
    .line 564
    .line 565
    const/4 v1, 0x1

    .line 566
    iput-boolean v1, v4, La/k4e;->a:Z

    .line 567
    .line 568
    goto/16 :goto_3

    .line 569
    .line 570
    :cond_22
    move/from16 v18, v8

    .line 571
    .line 572
    aget-object v1, v21, v18

    .line 573
    .line 574
    iget-object v1, v1, La/w2e;->f:La/w2e;

    .line 575
    .line 576
    if-eqz v1, :cond_23

    .line 577
    .line 578
    const/16 v20, 0x3

    .line 579
    .line 580
    aget-object v1, v21, v20

    .line 581
    .line 582
    iget-object v1, v1, La/w2e;->f:La/w2e;

    .line 583
    .line 584
    if-nez v1, :cond_20

    .line 585
    .line 586
    :cond_23
    move-object v5, v6

    .line 587
    const/4 v6, 0x0

    .line 588
    const/4 v8, 0x0

    .line 589
    move-object/from16 v3, p0

    .line 590
    .line 591
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 592
    .line 593
    .line 594
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 595
    .line 596
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 597
    .line 598
    invoke-virtual {v4}, La/k4e;->s()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 603
    .line 604
    .line 605
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 606
    .line 607
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 608
    .line 609
    invoke-virtual {v4}, La/k4e;->m()I

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 614
    .line 615
    .line 616
    const/4 v1, 0x1

    .line 617
    iput-boolean v1, v4, La/k4e;->a:Z

    .line 618
    .line 619
    goto/16 :goto_3

    .line 620
    .line 621
    :goto_9
    if-ne v10, v15, :cond_12

    .line 622
    .line 623
    if-ne v2, v15, :cond_12

    .line 624
    .line 625
    if-eq v13, v1, :cond_24

    .line 626
    .line 627
    if-ne v3, v1, :cond_25

    .line 628
    .line 629
    :cond_24
    move-object v5, v6

    .line 630
    goto :goto_a

    .line 631
    :cond_25
    const/4 v8, 0x2

    .line 632
    if-ne v3, v8, :cond_12

    .line 633
    .line 634
    if-ne v13, v8, :cond_12

    .line 635
    .line 636
    iget-object v2, v0, La/k4e;->U:[La/j4e;

    .line 637
    .line 638
    aget-object v3, v2, v16

    .line 639
    .line 640
    if-ne v3, v5, :cond_12

    .line 641
    .line 642
    aget-object v2, v2, v1

    .line 643
    .line 644
    if-ne v2, v5, :cond_12

    .line 645
    .line 646
    invoke-virtual {v0}, La/k4e;->s()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    int-to-float v1, v1

    .line 651
    mul-float/2addr v12, v1

    .line 652
    add-float v12, v12, v22

    .line 653
    .line 654
    float-to-int v6, v12

    .line 655
    invoke-virtual {v0}, La/k4e;->m()I

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    int-to-float v1, v1

    .line 660
    mul-float/2addr v14, v1

    .line 661
    add-float v14, v14, v22

    .line 662
    .line 663
    float-to-int v8, v14

    .line 664
    move-object v7, v5

    .line 665
    move-object/from16 v3, p0

    .line 666
    .line 667
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 668
    .line 669
    .line 670
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 671
    .line 672
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 673
    .line 674
    invoke-virtual {v4}, La/k4e;->s()I

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 679
    .line 680
    .line 681
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 682
    .line 683
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 684
    .line 685
    invoke-virtual {v4}, La/k4e;->m()I

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 690
    .line 691
    .line 692
    const/4 v1, 0x1

    .line 693
    iput-boolean v1, v4, La/k4e;->a:Z

    .line 694
    .line 695
    goto/16 :goto_3

    .line 696
    .line 697
    :goto_a
    const/4 v6, 0x0

    .line 698
    const/4 v8, 0x0

    .line 699
    move-object v7, v5

    .line 700
    move-object/from16 v3, p0

    .line 701
    .line 702
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 703
    .line 704
    .line 705
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 706
    .line 707
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 708
    .line 709
    invoke-virtual {v4}, La/k4e;->s()I

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    iput v2, v1, La/vmk;->m:I

    .line 714
    .line 715
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 716
    .line 717
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 718
    .line 719
    invoke-virtual {v4}, La/k4e;->m()I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    iput v2, v1, La/vmk;->m:I

    .line 724
    .line 725
    goto/16 :goto_3

    .line 726
    .line 727
    :cond_26
    :goto_b
    invoke-virtual {v4}, La/k4e;->s()I

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    if-ne v10, v1, :cond_27

    .line 732
    .line 733
    invoke-virtual {v0}, La/k4e;->s()I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    iget v8, v8, La/w2e;->g:I

    .line 738
    .line 739
    sub-int/2addr v3, v8

    .line 740
    iget v7, v7, La/w2e;->g:I

    .line 741
    .line 742
    sub-int/2addr v3, v7

    .line 743
    move-object v10, v9

    .line 744
    :cond_27
    invoke-virtual {v4}, La/k4e;->m()I

    .line 745
    .line 746
    .line 747
    move-result v7

    .line 748
    if-ne v2, v1, :cond_28

    .line 749
    .line 750
    invoke-virtual {v0}, La/k4e;->m()I

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    iget v2, v6, La/w2e;->g:I

    .line 755
    .line 756
    sub-int/2addr v1, v2

    .line 757
    iget v2, v5, La/w2e;->g:I

    .line 758
    .line 759
    sub-int v7, v1, v2

    .line 760
    .line 761
    move v8, v7

    .line 762
    move-object v7, v9

    .line 763
    :goto_c
    move v6, v3

    .line 764
    move-object v5, v10

    .line 765
    move-object/from16 v3, p0

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :cond_28
    move v8, v7

    .line 769
    move-object v7, v2

    .line 770
    goto :goto_c

    .line 771
    :goto_d
    invoke-virtual/range {v3 .. v8}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 772
    .line 773
    .line 774
    iget-object v1, v4, La/k4e;->d:La/cmw;

    .line 775
    .line 776
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 777
    .line 778
    invoke-virtual {v4}, La/k4e;->s()I

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 783
    .line 784
    .line 785
    iget-object v1, v4, La/k4e;->e:La/ocu0;

    .line 786
    .line 787
    iget-object v1, v1, La/hev0;->e:La/vmk;

    .line 788
    .line 789
    invoke-virtual {v4}, La/k4e;->m()I

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    invoke-virtual {v1, v2}, La/vmk;->d(I)V

    .line 794
    .line 795
    .line 796
    const/4 v1, 0x1

    .line 797
    iput-boolean v1, v4, La/k4e;->a:Z

    .line 798
    .line 799
    goto/16 :goto_3

    .line 800
    .line 801
    :cond_29
    return-void
.end method

.method public c()V
    .locals 10

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/l4e;

    .line 4
    .line 5
    iget-object v1, p0, La/h7k;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, La/h7k;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, La/h7k;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/l4e;

    .line 19
    .line 20
    iget-object v4, v3, La/k4e;->d:La/cmw;

    .line 21
    .line 22
    invoke-virtual {v4}, La/cmw;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v4, v3, La/k4e;->e:La/ocu0;

    .line 26
    .line 27
    invoke-virtual {v4}, La/ocu0;->f()V

    .line 28
    .line 29
    .line 30
    iget-object v4, v3, La/k4e;->d:La/cmw;

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, La/k4e;->e:La/ocu0;

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v4, v3, La/l4e;->u0:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v6, :cond_8

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, La/k4e;

    .line 60
    .line 61
    instance-of v9, v6, La/qiv;

    .line 62
    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    new-instance v7, La/riv;

    .line 66
    .line 67
    invoke-direct {v7, v6}, La/hev0;-><init>(La/k4e;)V

    .line 68
    .line 69
    .line 70
    iget-object v8, v6, La/k4e;->d:La/cmw;

    .line 71
    .line 72
    invoke-virtual {v8}, La/cmw;->f()V

    .line 73
    .line 74
    .line 75
    iget-object v8, v6, La/k4e;->e:La/ocu0;

    .line 76
    .line 77
    invoke-virtual {v8}, La/ocu0;->f()V

    .line 78
    .line 79
    .line 80
    check-cast v6, La/qiv;

    .line 81
    .line 82
    iget v6, v6, La/qiv;->y0:I

    .line 83
    .line 84
    iput v6, v7, La/hev0;->f:I

    .line 85
    .line 86
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v6}, La/k4e;->z()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    iget-object v9, v6, La/k4e;->b:La/nbb;

    .line 97
    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    new-instance v9, La/nbb;

    .line 101
    .line 102
    invoke-direct {v9, v6, v8}, La/nbb;-><init>(La/k4e;I)V

    .line 103
    .line 104
    .line 105
    iput-object v9, v6, La/k4e;->b:La/nbb;

    .line 106
    .line 107
    :cond_2
    if-nez v5, :cond_3

    .line 108
    .line 109
    new-instance v5, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-object v8, v6, La/k4e;->b:La/nbb;

    .line 115
    .line 116
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-object v8, v6, La/k4e;->d:La/cmw;

    .line 121
    .line 122
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-virtual {v6}, La/k4e;->A()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_7

    .line 130
    .line 131
    iget-object v8, v6, La/k4e;->c:La/nbb;

    .line 132
    .line 133
    if-nez v8, :cond_5

    .line 134
    .line 135
    new-instance v8, La/nbb;

    .line 136
    .line 137
    invoke-direct {v8, v6, v7}, La/nbb;-><init>(La/k4e;I)V

    .line 138
    .line 139
    .line 140
    iput-object v8, v6, La/k4e;->c:La/nbb;

    .line 141
    .line 142
    :cond_5
    if-nez v5, :cond_6

    .line 143
    .line 144
    new-instance v5, Ljava/util/HashSet;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v7, v6, La/k4e;->c:La/nbb;

    .line 150
    .line 151
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    iget-object v7, v6, La/k4e;->e:La/ocu0;

    .line 156
    .line 157
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_2
    instance-of v7, v6, La/jvv;

    .line 161
    .line 162
    if-eqz v7, :cond_0

    .line 163
    .line 164
    new-instance v7, La/ivv;

    .line 165
    .line 166
    invoke-direct {v7, v6}, La/hev0;-><init>(La/k4e;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_8
    if-eqz v5, :cond_9

    .line 174
    .line 175
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 176
    .line 177
    .line 178
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, La/hev0;

    .line 193
    .line 194
    invoke-virtual {v5}, La/hev0;->f()V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_c

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, La/hev0;

    .line 213
    .line 214
    iget-object v5, v4, La/hev0;->b:La/k4e;

    .line 215
    .line 216
    if-ne v5, v3, :cond_b

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    invoke-virtual {v4}, La/hev0;->d()V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, La/k4e;->d:La/cmw;

    .line 227
    .line 228
    invoke-virtual {p0, v2, v8, v1}, La/h7k;->j(La/hev0;ILjava/util/ArrayList;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, La/k4e;->e:La/ocu0;

    .line 232
    .line 233
    invoke-virtual {p0, v0, v7, v1}, La/h7k;->j(La/hev0;ILjava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    iput-boolean v8, p0, La/h7k;->b:Z

    .line 237
    .line 238
    return-void
.end method

.method public d(La/l4e;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, La/h7k;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move-wide v7, v4

    .line 19
    :goto_0
    if-ge v6, v3, :cond_d

    .line 20
    .line 21
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    check-cast v9, La/nog0;

    .line 26
    .line 27
    iget-object v9, v9, La/nog0;->a:La/hev0;

    .line 28
    .line 29
    instance-of v10, v9, La/nbb;

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    move-object v10, v9

    .line 34
    check-cast v10, La/nbb;

    .line 35
    .line 36
    iget v10, v10, La/hev0;->f:I

    .line 37
    .line 38
    if-eq v10, v2, :cond_2

    .line 39
    .line 40
    :goto_1
    move-object/from16 p0, v1

    .line 41
    .line 42
    move-wide v0, v4

    .line 43
    move/from16 v16, v6

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_0
    if-nez v2, :cond_1

    .line 48
    .line 49
    instance-of v10, v9, La/cmw;

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v10, v9, La/ocu0;

    .line 55
    .line 56
    if-nez v10, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget-object v10, v0, La/k4e;->d:La/cmw;

    .line 62
    .line 63
    :goto_2
    iget-object v10, v10, La/hev0;->h:La/i7k;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v10, v0, La/k4e;->e:La/ocu0;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    if-nez v2, :cond_4

    .line 70
    .line 71
    iget-object v11, v0, La/k4e;->d:La/cmw;

    .line 72
    .line 73
    :goto_4
    iget-object v11, v11, La/hev0;->i:La/i7k;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    iget-object v11, v0, La/k4e;->e:La/ocu0;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_5
    iget-object v12, v9, La/hev0;->h:La/i7k;

    .line 80
    .line 81
    iget-object v13, v9, La/hev0;->i:La/i7k;

    .line 82
    .line 83
    iget-object v14, v12, La/i7k;->l:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    iget-object v14, v13, La/i7k;->l:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    invoke-virtual {v9}, La/hev0;->j()J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    if-eqz v10, :cond_a

    .line 100
    .line 101
    if-eqz v11, :cond_a

    .line 102
    .line 103
    invoke-static {v12, v4, v5}, La/nog0;->b(La/i7k;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    move-object/from16 p0, v1

    .line 108
    .line 109
    invoke-static {v13, v4, v5}, La/nog0;->a(La/i7k;J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    sub-long/2addr v10, v14

    .line 114
    iget v4, v13, La/i7k;->f:I

    .line 115
    .line 116
    neg-int v5, v4

    .line 117
    move/from16 v16, v6

    .line 118
    .line 119
    int-to-long v5, v5

    .line 120
    cmp-long v5, v10, v5

    .line 121
    .line 122
    if-ltz v5, :cond_5

    .line 123
    .line 124
    int-to-long v4, v4

    .line 125
    add-long/2addr v10, v4

    .line 126
    :cond_5
    neg-long v0, v0

    .line 127
    sub-long/2addr v0, v14

    .line 128
    iget v4, v12, La/i7k;->f:I

    .line 129
    .line 130
    int-to-long v4, v4

    .line 131
    sub-long/2addr v0, v4

    .line 132
    cmp-long v6, v0, v4

    .line 133
    .line 134
    if-ltz v6, :cond_6

    .line 135
    .line 136
    sub-long/2addr v0, v4

    .line 137
    :cond_6
    iget-object v4, v9, La/hev0;->b:La/k4e;

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    iget v4, v4, La/k4e;->f0:F

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    const/4 v5, 0x1

    .line 145
    if-ne v2, v5, :cond_8

    .line 146
    .line 147
    iget v4, v4, La/k4e;->g0:F

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const/high16 v4, -0x40800000    # -1.0f

    .line 154
    .line 155
    :goto_6
    const/4 v5, 0x0

    .line 156
    cmpl-float v5, v4, v5

    .line 157
    .line 158
    const/high16 v6, 0x3f800000    # 1.0f

    .line 159
    .line 160
    if-lez v5, :cond_9

    .line 161
    .line 162
    long-to-float v0, v0

    .line 163
    div-float/2addr v0, v4

    .line 164
    long-to-float v1, v10

    .line 165
    sub-float v5, v6, v4

    .line 166
    .line 167
    div-float/2addr v1, v5

    .line 168
    add-float/2addr v1, v0

    .line 169
    float-to-long v0, v1

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    const-wide/16 v0, 0x0

    .line 172
    .line 173
    :goto_7
    long-to-float v0, v0

    .line 174
    mul-float v1, v0, v4

    .line 175
    .line 176
    const/high16 v5, 0x3f000000    # 0.5f

    .line 177
    .line 178
    add-float/2addr v1, v5

    .line 179
    float-to-long v9, v1

    .line 180
    invoke-static {v6, v4, v0, v5}, La/rw2;->a(FFFF)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    float-to-long v0, v0

    .line 185
    add-long/2addr v9, v14

    .line 186
    add-long/2addr v9, v0

    .line 187
    iget v0, v12, La/i7k;->f:I

    .line 188
    .line 189
    int-to-long v0, v0

    .line 190
    add-long/2addr v0, v9

    .line 191
    iget v4, v13, La/i7k;->f:I

    .line 192
    .line 193
    int-to-long v4, v4

    .line 194
    sub-long/2addr v0, v4

    .line 195
    goto :goto_8

    .line 196
    :cond_a
    move-object/from16 p0, v1

    .line 197
    .line 198
    move/from16 v16, v6

    .line 199
    .line 200
    if-eqz v10, :cond_b

    .line 201
    .line 202
    iget v0, v12, La/i7k;->f:I

    .line 203
    .line 204
    int-to-long v0, v0

    .line 205
    invoke-static {v12, v0, v1}, La/nog0;->b(La/i7k;J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    iget v4, v12, La/i7k;->f:I

    .line 210
    .line 211
    int-to-long v4, v4

    .line 212
    add-long/2addr v4, v14

    .line 213
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    goto :goto_8

    .line 218
    :cond_b
    if-eqz v11, :cond_c

    .line 219
    .line 220
    iget v0, v13, La/i7k;->f:I

    .line 221
    .line 222
    int-to-long v0, v0

    .line 223
    invoke-static {v13, v0, v1}, La/nog0;->a(La/i7k;J)J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    iget v4, v13, La/i7k;->f:I

    .line 228
    .line 229
    neg-int v4, v4

    .line 230
    int-to-long v4, v4

    .line 231
    add-long/2addr v4, v14

    .line 232
    neg-long v0, v0

    .line 233
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 234
    .line 235
    .line 236
    move-result-wide v0

    .line 237
    goto :goto_8

    .line 238
    :cond_c
    iget v0, v12, La/i7k;->f:I

    .line 239
    .line 240
    int-to-long v0, v0

    .line 241
    invoke-virtual {v9}, La/hev0;->j()J

    .line 242
    .line 243
    .line 244
    move-result-wide v4

    .line 245
    add-long/2addr v4, v0

    .line 246
    iget v0, v13, La/i7k;->f:I

    .line 247
    .line 248
    int-to-long v0, v0

    .line 249
    sub-long v0, v4, v0

    .line 250
    .line 251
    :goto_8
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v7

    .line 255
    add-int/lit8 v6, v16, 0x1

    .line 256
    .line 257
    move-object/from16 v1, p0

    .line 258
    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    const-wide/16 v4, 0x0

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_d
    long-to-int v0, v7

    .line 266
    return v0
.end method

.method public e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/h7k;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/kd30;

    .line 4
    .line 5
    iget-object v1, v0, La/kd30;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/xz40;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/e7z;

    .line 14
    .line 15
    iget p1, p0, La/e7z;->r1:I

    .line 16
    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, La/xz40;->g()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, La/e7z;->q1:Z

    .line 27
    .line 28
    :cond_0
    iget p0, v1, La/xz40;->c:I

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "Compose:onPositionedCallbacks"

    .line 33
    .line 34
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0}, La/kd30;->I()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    return-void
.end method

.method public h()V
    .locals 7

    .line 1
    iget-object p0, p0, La/h7k;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xz40;

    .line 4
    .line 5
    iget v0, p0, La/xz40;->c:I

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v1, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    aget-object v3, v1, v2

    .line 15
    .line 16
    check-cast v3, La/qj30;

    .line 17
    .line 18
    iget-object v4, v3, La/qj30;->a:La/e7z;

    .line 19
    .line 20
    invoke-virtual {v4}, La/e7z;->I()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iget-boolean v4, v3, La/qj30;->b:Z

    .line 27
    .line 28
    iget-object v5, v3, La/qj30;->a:La/e7z;

    .line 29
    .line 30
    iget-boolean v3, v3, La/qj30;->c:Z

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-static {v5, v3, v6}, La/e7z;->W(La/e7z;ZI)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {v5, v3, v6}, La/e7z;->U(La/e7z;ZI)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, La/xz40;->g()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public i(La/e7z;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, La/e7z;->A()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, La/xz40;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, La/e7z;

    .line 15
    .line 16
    invoke-virtual {v2}, La/e7z;->K()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, La/e7z;->s1:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, La/h7k;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, La/oif0;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, La/oif0;->f(La/e7z;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, La/e7z;->L()V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, v2}, La/h7k;->i(La/e7z;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void
.end method

.method public j(La/hev0;ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p1, La/hev0;->h:La/i7k;

    .line 2
    .line 3
    iget-object v1, p1, La/hev0;->i:La/i7k;

    .line 4
    .line 5
    iget-object v0, v0, La/i7k;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/d7k;

    .line 23
    .line 24
    instance-of v4, v2, La/i7k;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v2, La/i7k;

    .line 29
    .line 30
    invoke-virtual {p0, v2, p2, p3, v3}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v4, v2, La/hev0;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v2, La/hev0;

    .line 39
    .line 40
    iget-object v2, v2, La/hev0;->h:La/i7k;

    .line 41
    .line 42
    invoke-virtual {p0, v2, p2, p3, v3}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, v1, La/i7k;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/d7k;

    .line 63
    .line 64
    instance-of v2, v1, La/i7k;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, La/i7k;

    .line 69
    .line 70
    invoke-virtual {p0, v1, p2, p3, v3}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    instance-of v2, v1, La/hev0;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, La/hev0;

    .line 79
    .line 80
    iget-object v1, v1, La/hev0;->i:La/i7k;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p2, p3, v3}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const/4 v0, 0x1

    .line 87
    if-ne p2, v0, :cond_7

    .line 88
    .line 89
    check-cast p1, La/ocu0;

    .line 90
    .line 91
    iget-object p1, p1, La/ocu0;->k:La/i7k;

    .line 92
    .line 93
    iget-object p1, p1, La/i7k;->k:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/d7k;

    .line 110
    .line 111
    instance-of v1, v0, La/i7k;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, La/i7k;

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2, p3, v3}, La/h7k;->a(La/i7k;ILjava/util/ArrayList;La/nog0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    return-void
.end method

.method public k(La/e7z;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/h7k;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 13
    .line 14
    iget-boolean v0, v0, La/i7z;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, La/h7k;->l(La/e7z;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public l(La/e7z;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, La/e7z;->A()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, La/xz40;->c:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_8

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, La/e7z;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, La/e7z;->s()La/c7z;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    sget-object v6, La/c7z;->a:La/c7z;

    .line 24
    .line 25
    if-eq v5, v6, :cond_1

    .line 26
    .line 27
    iget-object v5, v3, La/e7z;->i1:La/i7z;

    .line 28
    .line 29
    iget-object v5, v5, La/i7z;->p:La/sj30;

    .line 30
    .line 31
    iget-object v5, v5, La/sj30;->y:La/f7z;

    .line 32
    .line 33
    invoke-virtual {v5}, La/f7z;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-eqz p2, :cond_7

    .line 41
    .line 42
    invoke-virtual {v3}, La/e7z;->t()La/c7z;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    sget-object v6, La/c7z;->a:La/c7z;

    .line 47
    .line 48
    if-eq v5, v6, :cond_1

    .line 49
    .line 50
    iget-object v5, v3, La/e7z;->i1:La/i7z;

    .line 51
    .line 52
    iget-object v5, v5, La/i7z;->q:La/i810;

    .line 53
    .line 54
    if-eqz v5, :cond_7

    .line 55
    .line 56
    iget-object v5, v5, La/i810;->s:La/f7z;

    .line 57
    .line 58
    if-eqz v5, :cond_7

    .line 59
    .line 60
    invoke-virtual {v5}, La/f7z;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ne v5, v4, :cond_7

    .line 65
    .line 66
    :cond_1
    :goto_1
    invoke-static {v3}, La/p7x;->E(La/e7z;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    iget-object v6, v3, La/e7z;->i1:La/i7z;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    iget-boolean v5, v6, La/i7z;->e:Z

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    iget-object v5, p0, La/h7k;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, La/oif0;

    .line 83
    .line 84
    invoke-virtual {v5, v3}, La/oif0;->f(La/e7z;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_2

    .line 89
    .line 90
    invoke-virtual {p0, v3, v4}, La/h7k;->y(La/e7z;Z)Z

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {p0, v3, v4}, La/h7k;->k(La/e7z;Z)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    .line 98
    .line 99
    iget-boolean v4, v6, La/i7z;->e:Z

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {v3}, La/e7z;->r()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    :goto_3
    if-eqz v4, :cond_5

    .line 107
    .line 108
    invoke-virtual {p0, v3, p2}, La/h7k;->y(La/e7z;Z)Z

    .line 109
    .line 110
    .line 111
    :cond_5
    if-eqz p2, :cond_6

    .line 112
    .line 113
    iget-boolean v4, v6, La/i7z;->e:Z

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-virtual {v3}, La/e7z;->r()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    :goto_4
    if-nez v4, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0, v3, p2}, La/h7k;->l(La/e7z;Z)V

    .line 123
    .line 124
    .line 125
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_8
    if-eqz p2, :cond_9

    .line 129
    .line 130
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 131
    .line 132
    iget-boolean v0, v0, La/i7z;->e:Z

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_9
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    :goto_5
    if-eqz v0, :cond_a

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2}, La/h7k;->y(La/e7z;Z)Z

    .line 142
    .line 143
    .line 144
    :cond_a
    return-void
.end method

.method public o(Ljava/util/List;Z)Ljava/util/List;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iput-boolean v0, p0, La/h7k;->c:Z

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iput-boolean v0, p0, La/h7k;->b:Z

    .line 8
    .line 9
    :goto_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/zfs0;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    sget-object p0, La/sds0;->a:La/sds0;

    .line 30
    .line 31
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-wide v1, v1, La/zfs0;->b:J

    .line 37
    .line 38
    const-wide/16 v3, 0x3e8

    .line 39
    .line 40
    mul-long v5, v1, v3

    .line 41
    .line 42
    invoke-virtual {p2, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 43
    .line 44
    .line 45
    new-instance v5, La/zds0;

    .line 46
    .line 47
    invoke-direct {v5, v1, v2}, La/zds0;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/zfs0;

    .line 68
    .line 69
    iget-wide v5, v1, La/zfs0;->b:J

    .line 70
    .line 71
    mul-long/2addr v5, v3

    .line 72
    invoke-virtual {v0, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 73
    .line 74
    .line 75
    const/4 v2, 0x6

    .line 76
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eq v5, v2, :cond_2

    .line 85
    .line 86
    new-instance v2, La/zds0;

    .line 87
    .line 88
    iget-wide v5, v1, La/zfs0;->b:J

    .line 89
    .line 90
    invoke-direct {v2, v5, v6}, La/zds0;-><init>(J)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {p0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :goto_2
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v1

    .line 107
    invoke-virtual {p2, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method public p(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;ILjava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p10

    .line 6
    .line 7
    instance-of v3, v2, La/a3v;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/a3v;

    .line 13
    .line 14
    iget v4, v3, La/a3v;->w:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/a3v;->w:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/a3v;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/a3v;-><init>(La/h7k;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/a3v;->u:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/a3v;->w:I

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    sget-object v7, La/tes0;->a:La/tes0;

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x2

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v8, :cond_3

    .line 46
    .line 47
    if-eq v5, v9, :cond_2

    .line 48
    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    iget-boolean v1, v3, La/a3v;->t:Z

    .line 52
    .line 53
    iget v5, v3, La/a3v;->s:I

    .line 54
    .line 55
    iget-wide v11, v3, La/a3v;->i:J

    .line 56
    .line 57
    iget-object v13, v3, La/a3v;->r:Ljava/util/Collection;

    .line 58
    .line 59
    check-cast v13, Ljava/util/Collection;

    .line 60
    .line 61
    iget-object v14, v3, La/a3v;->q:La/zfs0;

    .line 62
    .line 63
    iget-object v15, v3, La/a3v;->p:Ljava/util/Iterator;

    .line 64
    .line 65
    iget-object v6, v3, La/a3v;->o:Ljava/util/Collection;

    .line 66
    .line 67
    check-cast v6, Ljava/util/Collection;

    .line 68
    .line 69
    iget-object v9, v3, La/a3v;->n:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move/from16 v16, v8

    .line 75
    .line 76
    const/4 v8, 0x3

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v10

    .line 85
    :cond_2
    iget-boolean v1, v3, La/a3v;->t:Z

    .line 86
    .line 87
    iget v5, v3, La/a3v;->s:I

    .line 88
    .line 89
    iget-wide v11, v3, La/a3v;->i:J

    .line 90
    .line 91
    iget-object v6, v3, La/a3v;->n:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move v14, v5

    .line 97
    move/from16 v16, v8

    .line 98
    .line 99
    move-object v5, v3

    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :cond_3
    iget-boolean v1, v3, La/a3v;->t:Z

    .line 103
    .line 104
    iget v5, v3, La/a3v;->s:I

    .line 105
    .line 106
    iget-wide v11, v3, La/a3v;->i:J

    .line 107
    .line 108
    iget-object v6, v3, La/a3v;->n:Ljava/util/List;

    .line 109
    .line 110
    iget-object v9, v3, La/a3v;->m:Ljava/lang/Integer;

    .line 111
    .line 112
    iget-object v13, v3, La/a3v;->l:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v14, v3, La/a3v;->k:Ljava/lang/Long;

    .line 115
    .line 116
    iget-object v15, v3, La/a3v;->j:Ljava/lang/Long;

    .line 117
    .line 118
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move v2, v1

    .line 124
    move-object v1, v6

    .line 125
    move-object v6, v13

    .line 126
    move-object/from16 v13, v17

    .line 127
    .line 128
    move-object/from16 v17, v14

    .line 129
    .line 130
    move v14, v5

    .line 131
    move-object/from16 v5, v17

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    if-nez v1, :cond_5

    .line 138
    .line 139
    iput-boolean v8, v0, La/h7k;->b:Z

    .line 140
    .line 141
    :cond_5
    iget-object v2, v0, La/h7k;->h:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, La/ahu;

    .line 144
    .line 145
    iput-object v1, v3, La/a3v;->j:Ljava/lang/Long;

    .line 146
    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    iput-object v5, v3, La/a3v;->k:Ljava/lang/Long;

    .line 150
    .line 151
    move-object/from16 v6, p5

    .line 152
    .line 153
    iput-object v6, v3, La/a3v;->l:Ljava/lang/String;

    .line 154
    .line 155
    move-object/from16 v9, p6

    .line 156
    .line 157
    iput-object v9, v3, La/a3v;->m:Ljava/lang/Integer;

    .line 158
    .line 159
    move-object/from16 v11, p8

    .line 160
    .line 161
    iput-object v11, v3, La/a3v;->n:Ljava/util/List;

    .line 162
    .line 163
    move-wide/from16 v12, p1

    .line 164
    .line 165
    iput-wide v12, v3, La/a3v;->i:J

    .line 166
    .line 167
    move/from16 v14, p7

    .line 168
    .line 169
    iput v14, v3, La/a3v;->s:I

    .line 170
    .line 171
    move/from16 v15, p9

    .line 172
    .line 173
    iput-boolean v15, v3, La/a3v;->t:Z

    .line 174
    .line 175
    iput v8, v3, La/a3v;->w:I

    .line 176
    .line 177
    invoke-static {v2, v3}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-ne v2, v4, :cond_6

    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    .line 185
    :cond_6
    move/from16 v17, v15

    .line 186
    .line 187
    move-object v15, v1

    .line 188
    move-object v1, v11

    .line 189
    move-wide v11, v12

    .line 190
    move-object v13, v2

    .line 191
    move/from16 v2, v17

    .line 192
    .line 193
    :goto_1
    check-cast v13, La/ql5;

    .line 194
    .line 195
    iget-object v13, v13, La/ql5;->i:La/txs0;

    .line 196
    .line 197
    invoke-virtual {v13}, La/txs0;->a()Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-eqz v13, :cond_7

    .line 202
    .line 203
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_7
    iget-object v13, v0, La/h7k;->e:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v13, La/ieu;

    .line 215
    .line 216
    iput-object v10, v3, La/a3v;->j:Ljava/lang/Long;

    .line 217
    .line 218
    iput-object v10, v3, La/a3v;->k:Ljava/lang/Long;

    .line 219
    .line 220
    iput-object v10, v3, La/a3v;->l:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v10, v3, La/a3v;->m:Ljava/lang/Integer;

    .line 223
    .line 224
    iput-object v1, v3, La/a3v;->n:Ljava/util/List;

    .line 225
    .line 226
    iput-wide v11, v3, La/a3v;->i:J

    .line 227
    .line 228
    iput v14, v3, La/a3v;->s:I

    .line 229
    .line 230
    iput-boolean v2, v3, La/a3v;->t:Z

    .line 231
    .line 232
    move/from16 v16, v8

    .line 233
    .line 234
    const/4 v8, 0x2

    .line 235
    iput v8, v3, La/a3v;->w:I

    .line 236
    .line 237
    const/4 v8, 0x0

    .line 238
    move-object/from16 p9, v3

    .line 239
    .line 240
    move-object/from16 p5, v5

    .line 241
    .line 242
    move-object/from16 p6, v6

    .line 243
    .line 244
    move/from16 p7, v8

    .line 245
    .line 246
    move-object/from16 p8, v9

    .line 247
    .line 248
    move-wide/from16 p2, v11

    .line 249
    .line 250
    move-object/from16 p1, v13

    .line 251
    .line 252
    move-object/from16 p4, v15

    .line 253
    .line 254
    invoke-virtual/range {p1 .. p9}, La/ieu;->g(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    move-object/from16 v5, p9

    .line 259
    .line 260
    if-ne v3, v4, :cond_8

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    move-object v6, v1

    .line 264
    move v1, v2

    .line 265
    move-object v2, v3

    .line 266
    :goto_2
    check-cast v2, Ljava/lang/Iterable;

    .line 267
    .line 268
    new-instance v3, Ljava/util/ArrayList;

    .line 269
    .line 270
    const/16 v8, 0xa

    .line 271
    .line 272
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object v15, v2

    .line 284
    move-object v13, v3

    .line 285
    move-object v3, v5

    .line 286
    move-object v9, v6

    .line 287
    move v5, v14

    .line 288
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_a

    .line 293
    .line 294
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    move-object v14, v2

    .line 299
    check-cast v14, La/zfs0;

    .line 300
    .line 301
    iget-object v2, v0, La/h7k;->i:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v2, La/pmi;

    .line 304
    .line 305
    iget-object v6, v14, La/zfs0;->f:Ljava/lang/String;

    .line 306
    .line 307
    iput-object v10, v3, La/a3v;->j:Ljava/lang/Long;

    .line 308
    .line 309
    iput-object v10, v3, La/a3v;->k:Ljava/lang/Long;

    .line 310
    .line 311
    iput-object v10, v3, La/a3v;->l:Ljava/lang/String;

    .line 312
    .line 313
    iput-object v10, v3, La/a3v;->m:Ljava/lang/Integer;

    .line 314
    .line 315
    iput-object v9, v3, La/a3v;->n:Ljava/util/List;

    .line 316
    .line 317
    move-object v8, v13

    .line 318
    check-cast v8, Ljava/util/Collection;

    .line 319
    .line 320
    iput-object v8, v3, La/a3v;->o:Ljava/util/Collection;

    .line 321
    .line 322
    iput-object v15, v3, La/a3v;->p:Ljava/util/Iterator;

    .line 323
    .line 324
    iput-object v14, v3, La/a3v;->q:La/zfs0;

    .line 325
    .line 326
    iput-object v8, v3, La/a3v;->r:Ljava/util/Collection;

    .line 327
    .line 328
    iput-wide v11, v3, La/a3v;->i:J

    .line 329
    .line 330
    iput v5, v3, La/a3v;->s:I

    .line 331
    .line 332
    iput-boolean v1, v3, La/a3v;->t:Z

    .line 333
    .line 334
    const/4 v8, 0x3

    .line 335
    iput v8, v3, La/a3v;->w:I

    .line 336
    .line 337
    invoke-virtual {v2, v6, v3}, La/pmi;->z(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    if-ne v2, v4, :cond_9

    .line 342
    .line 343
    :goto_4
    return-object v4

    .line 344
    :cond_9
    move-object v6, v13

    .line 345
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v14, v2}, La/zfs0;->a(La/zfs0;Ljava/lang/String;)La/zfs0;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-object v13, v6

    .line 355
    goto :goto_3

    .line 356
    :cond_a
    check-cast v13, Ljava/util/List;

    .line 357
    .line 358
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    const/4 v3, 0x0

    .line 363
    if-eqz v2, :cond_b

    .line 364
    .line 365
    iget-boolean v2, v0, La/h7k;->b:Z

    .line 366
    .line 367
    if-eqz v2, :cond_b

    .line 368
    .line 369
    move/from16 v2, v16

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_b
    move v2, v3

    .line 373
    :goto_6
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eqz v4, :cond_c

    .line 378
    .line 379
    iget-boolean v4, v0, La/h7k;->b:Z

    .line 380
    .line 381
    if-nez v4, :cond_c

    .line 382
    .line 383
    move/from16 v4, v16

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_c
    move v4, v3

    .line 387
    :goto_7
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-ge v6, v5, :cond_d

    .line 392
    .line 393
    iget-boolean v6, v0, La/h7k;->b:Z

    .line 394
    .line 395
    if-eqz v6, :cond_d

    .line 396
    .line 397
    move/from16 v6, v16

    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_d
    move v6, v3

    .line 401
    :goto_8
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-ge v8, v5, :cond_e

    .line 406
    .line 407
    iget-boolean v5, v0, La/h7k;->b:Z

    .line 408
    .line 409
    if-nez v5, :cond_e

    .line 410
    .line 411
    move/from16 v5, v16

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_e
    move v5, v3

    .line 415
    :goto_9
    iget-object v8, v0, La/h7k;->f:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v8, La/onv;

    .line 418
    .line 419
    iget-object v8, v8, La/onv;->a:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v8, La/nhf0;

    .line 422
    .line 423
    iget-object v8, v8, La/nhf0;->a:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v8, La/vi5;

    .line 426
    .line 427
    iget-boolean v8, v8, La/vi5;->c:Z

    .line 428
    .line 429
    iget-object v10, v0, La/h7k;->g:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v10, La/e1u;

    .line 432
    .line 433
    iget-object v10, v10, La/e1u;->b:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v10, La/nhf0;

    .line 436
    .line 437
    iget-object v10, v10, La/nhf0;->a:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v10, La/vi5;

    .line 440
    .line 441
    iget-object v10, v10, La/vi5;->b:Ljava/util/List;

    .line 442
    .line 443
    if-nez v1, :cond_f

    .line 444
    .line 445
    return-object v9

    .line 446
    :cond_f
    sget-object v1, La/fxn;->a:La/fxn;

    .line 447
    .line 448
    if-eqz v2, :cond_12

    .line 449
    .line 450
    if-eqz v8, :cond_11

    .line 451
    .line 452
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_10

    .line 457
    .line 458
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    goto :goto_a

    .line 463
    :cond_10
    sget-object v1, La/iun;->a:La/iun;

    .line 464
    .line 465
    :goto_a
    invoke-virtual {v0, v10, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    goto :goto_b

    .line 474
    :cond_11
    const/4 v8, 0x2

    .line 475
    new-array v0, v8, [La/w9h0;

    .line 476
    .line 477
    aput-object v7, v0, v3

    .line 478
    .line 479
    aput-object v1, v0, v16

    .line 480
    .line 481
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    :goto_b
    invoke-static {v9, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    return-object v0

    .line 490
    :cond_12
    if-eqz v4, :cond_15

    .line 491
    .line 492
    iget-boolean v2, v0, La/h7k;->b:Z

    .line 493
    .line 494
    if-nez v2, :cond_13

    .line 495
    .line 496
    sget-object v0, La/iun;->a:La/iun;

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_13
    if-eqz v8, :cond_14

    .line 500
    .line 501
    invoke-virtual {v0, v10, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    goto :goto_c

    .line 506
    :cond_14
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    :goto_c
    invoke-static {v9, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    return-object v0

    .line 515
    :cond_15
    sget-object v2, La/kfs0;->a:La/kfs0;

    .line 516
    .line 517
    if-eqz v6, :cond_17

    .line 518
    .line 519
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-static {v9, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    invoke-virtual {v0, v13, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    if-eqz v8, :cond_16

    .line 536
    .line 537
    invoke-virtual {v0, v10, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    goto :goto_d

    .line 542
    :cond_16
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    :goto_d
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    return-object v0

    .line 551
    :cond_17
    if-eqz v5, :cond_19

    .line 552
    .line 553
    invoke-virtual {v0, v13, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    invoke-static {v9, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    if-eqz v8, :cond_18

    .line 562
    .line 563
    invoke-virtual {v0, v10, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    goto :goto_e

    .line 568
    :cond_18
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    :goto_e
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    return-object v0

    .line 577
    :cond_19
    iget-boolean v1, v0, La/h7k;->b:Z

    .line 578
    .line 579
    if-eqz v1, :cond_1a

    .line 580
    .line 581
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-static {v9, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-virtual {v0, v13, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    return-object v0

    .line 598
    :cond_1a
    invoke-virtual {v0, v13, v3}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-static {v9, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    return-object v0
.end method

.method public q(JZLjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    instance-of v2, v1, La/b3v;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/b3v;

    .line 11
    .line 12
    iget v3, v2, La/b3v;->v:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/b3v;->v:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/b3v;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/b3v;-><init>(La/h7k;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/b3v;->t:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/b3v;->v:I

    .line 34
    .line 35
    sget-object v5, La/tes0;->a:La/tes0;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v8, :cond_3

    .line 44
    .line 45
    if-eq v4, v7, :cond_2

    .line 46
    .line 47
    if-ne v4, v6, :cond_1

    .line 48
    .line 49
    iget-boolean v4, v2, La/b3v;->j:Z

    .line 50
    .line 51
    iget-wide v10, v2, La/b3v;->i:J

    .line 52
    .line 53
    iget-object v7, v2, La/b3v;->s:Ljava/util/Collection;

    .line 54
    .line 55
    check-cast v7, Ljava/util/Collection;

    .line 56
    .line 57
    iget-object v12, v2, La/b3v;->r:La/zfs0;

    .line 58
    .line 59
    iget-object v13, v2, La/b3v;->q:Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v14, v2, La/b3v;->p:Ljava/util/Collection;

    .line 62
    .line 63
    check-cast v14, Ljava/util/Collection;

    .line 64
    .line 65
    iget-object v15, v2, La/b3v;->k:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v16, v14

    .line 71
    .line 72
    move v14, v6

    .line 73
    move-object/from16 v6, v16

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v9

    .line 83
    :cond_2
    iget-boolean v4, v2, La/b3v;->j:Z

    .line 84
    .line 85
    iget-wide v10, v2, La/b3v;->i:J

    .line 86
    .line 87
    iget-object v7, v2, La/b3v;->k:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_3
    iget-boolean v4, v2, La/b3v;->j:Z

    .line 95
    .line 96
    iget-wide v10, v2, La/b3v;->i:J

    .line 97
    .line 98
    iget-object v12, v2, La/b3v;->o:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v13, v2, La/b3v;->n:Ljava/lang/Long;

    .line 101
    .line 102
    iget-object v14, v2, La/b3v;->m:Ljava/lang/Integer;

    .line 103
    .line 104
    iget-object v15, v2, La/b3v;->l:Ljava/lang/Long;

    .line 105
    .line 106
    iget-object v6, v2, La/b3v;->k:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move/from16 v16, v4

    .line 112
    .line 113
    move-object v4, v1

    .line 114
    move-object v1, v15

    .line 115
    move/from16 v15, v16

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, La/h7k;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, La/ahu;

    .line 124
    .line 125
    move-object/from16 v4, p4

    .line 126
    .line 127
    iput-object v4, v2, La/b3v;->k:Ljava/util/List;

    .line 128
    .line 129
    move-object/from16 v6, p5

    .line 130
    .line 131
    iput-object v6, v2, La/b3v;->l:Ljava/lang/Long;

    .line 132
    .line 133
    move-object/from16 v10, p6

    .line 134
    .line 135
    iput-object v10, v2, La/b3v;->m:Ljava/lang/Integer;

    .line 136
    .line 137
    move-object/from16 v11, p7

    .line 138
    .line 139
    iput-object v11, v2, La/b3v;->n:Ljava/lang/Long;

    .line 140
    .line 141
    move-object/from16 v12, p8

    .line 142
    .line 143
    iput-object v12, v2, La/b3v;->o:Ljava/lang/String;

    .line 144
    .line 145
    move-wide/from16 v13, p1

    .line 146
    .line 147
    iput-wide v13, v2, La/b3v;->i:J

    .line 148
    .line 149
    move/from16 v15, p3

    .line 150
    .line 151
    iput-boolean v15, v2, La/b3v;->j:Z

    .line 152
    .line 153
    iput v8, v2, La/b3v;->v:I

    .line 154
    .line 155
    invoke-static {v1, v2}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v1, v3, :cond_5

    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :cond_5
    move-object/from16 v16, v4

    .line 164
    .line 165
    move-object v4, v1

    .line 166
    move-object v1, v6

    .line 167
    move-object/from16 v6, v16

    .line 168
    .line 169
    move-wide/from16 v16, v13

    .line 170
    .line 171
    move-object v14, v10

    .line 172
    move-object v13, v11

    .line 173
    move-wide/from16 v10, v16

    .line 174
    .line 175
    :goto_1
    check-cast v4, La/ql5;

    .line 176
    .line 177
    iget-object v4, v4, La/ql5;->i:La/txs0;

    .line 178
    .line 179
    invoke-virtual {v4}, La/txs0;->a()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    :cond_6
    if-nez v1, :cond_7

    .line 191
    .line 192
    iput-boolean v8, v0, La/h7k;->c:Z

    .line 193
    .line 194
    :cond_7
    iget-object v4, v0, La/h7k;->e:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, La/ieu;

    .line 197
    .line 198
    iput-object v6, v2, La/b3v;->k:Ljava/util/List;

    .line 199
    .line 200
    iput-object v9, v2, La/b3v;->l:Ljava/lang/Long;

    .line 201
    .line 202
    iput-object v9, v2, La/b3v;->m:Ljava/lang/Integer;

    .line 203
    .line 204
    iput-object v9, v2, La/b3v;->n:Ljava/lang/Long;

    .line 205
    .line 206
    iput-object v9, v2, La/b3v;->o:Ljava/lang/String;

    .line 207
    .line 208
    iput-wide v10, v2, La/b3v;->i:J

    .line 209
    .line 210
    iput-boolean v15, v2, La/b3v;->j:Z

    .line 211
    .line 212
    iput v7, v2, La/b3v;->v:I

    .line 213
    .line 214
    const/4 v7, 0x1

    .line 215
    move-object/from16 p4, v1

    .line 216
    .line 217
    move-object/from16 p9, v2

    .line 218
    .line 219
    move-object/from16 p1, v4

    .line 220
    .line 221
    move/from16 p7, v7

    .line 222
    .line 223
    move-wide/from16 p2, v10

    .line 224
    .line 225
    move-object/from16 p6, v12

    .line 226
    .line 227
    move-object/from16 p5, v13

    .line 228
    .line 229
    move-object/from16 p8, v14

    .line 230
    .line 231
    invoke-virtual/range {p1 .. p9}, La/ieu;->g(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-ne v1, v3, :cond_8

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_8
    move-object v7, v6

    .line 239
    move v4, v15

    .line 240
    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    .line 241
    .line 242
    new-instance v6, Ljava/util/ArrayList;

    .line 243
    .line 244
    const/16 v12, 0xa

    .line 245
    .line 246
    invoke-static {v1, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    move-object v13, v1

    .line 258
    move-object v15, v7

    .line 259
    :goto_3
    move-object v7, v6

    .line 260
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_a

    .line 265
    .line 266
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    move-object v12, v1

    .line 271
    check-cast v12, La/zfs0;

    .line 272
    .line 273
    iget-object v1, v0, La/h7k;->i:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v1, La/pmi;

    .line 276
    .line 277
    iget-object v6, v12, La/zfs0;->f:Ljava/lang/String;

    .line 278
    .line 279
    iput-object v15, v2, La/b3v;->k:Ljava/util/List;

    .line 280
    .line 281
    iput-object v9, v2, La/b3v;->l:Ljava/lang/Long;

    .line 282
    .line 283
    iput-object v9, v2, La/b3v;->m:Ljava/lang/Integer;

    .line 284
    .line 285
    iput-object v9, v2, La/b3v;->n:Ljava/lang/Long;

    .line 286
    .line 287
    iput-object v9, v2, La/b3v;->o:Ljava/lang/String;

    .line 288
    .line 289
    move-object v14, v7

    .line 290
    check-cast v14, Ljava/util/Collection;

    .line 291
    .line 292
    iput-object v14, v2, La/b3v;->p:Ljava/util/Collection;

    .line 293
    .line 294
    iput-object v13, v2, La/b3v;->q:Ljava/util/Iterator;

    .line 295
    .line 296
    iput-object v12, v2, La/b3v;->r:La/zfs0;

    .line 297
    .line 298
    iput-object v14, v2, La/b3v;->s:Ljava/util/Collection;

    .line 299
    .line 300
    iput-wide v10, v2, La/b3v;->i:J

    .line 301
    .line 302
    iput-boolean v4, v2, La/b3v;->j:Z

    .line 303
    .line 304
    const/4 v14, 0x3

    .line 305
    iput v14, v2, La/b3v;->v:I

    .line 306
    .line 307
    invoke-virtual {v1, v6, v2}, La/pmi;->z(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-ne v1, v3, :cond_9

    .line 312
    .line 313
    :goto_4
    return-object v3

    .line 314
    :cond_9
    move-object v6, v7

    .line 315
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v12, v1}, La/zfs0;->a(La/zfs0;Ljava/lang/String;)La/zfs0;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_a
    check-cast v7, Ljava/util/List;

    .line 326
    .line 327
    iget-object v1, v0, La/h7k;->d:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v1, La/roi0;

    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    iget-object v1, v1, La/roi0;->a:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v1, La/nhf0;

    .line 337
    .line 338
    iget-object v1, v1, La/nhf0;->a:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v1, La/vi5;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    iput-object v7, v1, La/vi5;->b:Ljava/util/List;

    .line 346
    .line 347
    iput-boolean v8, v1, La/vi5;->c:Z

    .line 348
    .line 349
    if-nez v4, :cond_b

    .line 350
    .line 351
    sget-object v0, La/iun;->a:La/iun;

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_b
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_e

    .line 359
    .line 360
    if-eqz v15, :cond_c

    .line 361
    .line 362
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    if-eqz v1, :cond_c

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :cond_c
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_e

    .line 378
    .line 379
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, La/w9h0;

    .line 384
    .line 385
    instance-of v2, v2, La/zfs0;

    .line 386
    .line 387
    if-eqz v2, :cond_d

    .line 388
    .line 389
    iget-boolean v1, v0, La/h7k;->c:Z

    .line 390
    .line 391
    if-eqz v1, :cond_e

    .line 392
    .line 393
    sget-object v0, La/sds0;->a:La/sds0;

    .line 394
    .line 395
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    goto :goto_7

    .line 400
    :cond_e
    :goto_6
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_f

    .line 405
    .line 406
    iget-boolean v1, v0, La/h7k;->c:Z

    .line 407
    .line 408
    if-eqz v1, :cond_f

    .line 409
    .line 410
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    goto :goto_7

    .line 415
    :cond_f
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_10

    .line 420
    .line 421
    invoke-virtual {v0, v7, v8}, La/h7k;->o(Ljava/util/List;Z)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    goto :goto_7

    .line 426
    :cond_10
    sget-object v0, La/iun;->a:La/iun;

    .line 427
    .line 428
    :goto_7
    invoke-static {v15, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    return-object v0
.end method

.method public s(La/k4e;La/j4e;ILa/j4e;I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/q96;

    .line 4
    .line 5
    iput-object p2, v0, La/q96;->a:La/j4e;

    .line 6
    .line 7
    iput-object p4, v0, La/q96;->b:La/j4e;

    .line 8
    .line 9
    iput p3, v0, La/q96;->c:I

    .line 10
    .line 11
    iput p5, v0, La/q96;->d:I

    .line 12
    .line 13
    iget-object p0, p0, La/h7k;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/r96;

    .line 16
    .line 17
    invoke-interface {p0, p1, v0}, La/r96;->b(La/k4e;La/q96;)V

    .line 18
    .line 19
    .line 20
    iget p0, v0, La/q96;->e:I

    .line 21
    .line 22
    invoke-virtual {p1, p0}, La/k4e;->T(I)V

    .line 23
    .line 24
    .line 25
    iget p0, v0, La/q96;->f:I

    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/k4e;->O(I)V

    .line 28
    .line 29
    .line 30
    iget-boolean p0, v0, La/q96;->h:Z

    .line 31
    .line 32
    iput-boolean p0, p1, La/k4e;->F:Z

    .line 33
    .line 34
    iget p0, v0, La/q96;->g:I

    .line 35
    .line 36
    invoke-virtual {p1, p0}, La/k4e;->K(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public t(Lkotlin/jvm/functions/Function0;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/h7k;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/oif0;

    .line 6
    .line 7
    iget-object v2, v0, La/oif0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/clc;

    .line 10
    .line 11
    iget-object v3, v1, La/h7k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/e7z;

    .line 14
    .line 15
    invoke-virtual {v3}, La/e7z;->I()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    const-string v4, "performMeasureAndLayout called with unattached root"

    .line 22
    .line 23
    invoke-static {v4}, La/xcx;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v3}, La/e7z;->J()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    const-string v4, "performMeasureAndLayout called with unplaced root"

    .line 33
    .line 34
    invoke-static {v4}, La/xcx;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-boolean v4, v1, La/h7k;->b:Z

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    const-string v4, "performMeasureAndLayout called during measure layout"

    .line 42
    .line 43
    invoke-static {v4}, La/xcx;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v4, v1, La/h7k;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, La/p4e;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x1

    .line 52
    if-eqz v4, :cond_e

    .line 53
    .line 54
    iput-boolean v6, v1, La/h7k;->b:Z

    .line 55
    .line 56
    iput-boolean v6, v1, La/h7k;->c:Z

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {v0}, La/oif0;->E()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_c

    .line 63
    .line 64
    move v4, v5

    .line 65
    :cond_3
    :goto_0
    iget-object v7, v0, La/oif0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v7, La/clc;

    .line 68
    .line 69
    iget-object v8, v7, La/clc;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v8, La/mlk0;

    .line 72
    .line 73
    iget-object v9, v0, La/oif0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v9, La/clc;

    .line 76
    .line 77
    iget-object v10, v9, La/clc;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v10, La/mlk0;

    .line 80
    .line 81
    iget-object v11, v2, La/clc;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v11, La/mlk0;

    .line 84
    .line 85
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    if-nez v11, :cond_5

    .line 90
    .line 91
    iget-object v7, v2, La/clc;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, La/mlk0;

    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, La/e7z;

    .line 100
    .line 101
    invoke-virtual {v2, v7}, La/clc;->g(La/e7z;)Z

    .line 102
    .line 103
    .line 104
    iget-object v8, v7, La/e7z;->i:La/e7z;

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    move v8, v6

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move v8, v5

    .line 111
    :goto_1
    move v9, v5

    .line 112
    goto :goto_3

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_5
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-nez v11, :cond_7

    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, La/e7z;

    .line 127
    .line 128
    invoke-virtual {v9, v7}, La/clc;->g(La/e7z;)Z

    .line 129
    .line 130
    .line 131
    iget-object v8, v7, La/e7z;->i:La/e7z;

    .line 132
    .line 133
    if-eqz v8, :cond_6

    .line 134
    .line 135
    move v8, v6

    .line 136
    goto :goto_2

    .line 137
    :cond_6
    move v8, v5

    .line 138
    :goto_2
    move v9, v6

    .line 139
    goto :goto_3

    .line 140
    :cond_7
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-nez v9, :cond_b

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, La/e7z;

    .line 151
    .line 152
    invoke-virtual {v7, v8}, La/clc;->g(La/e7z;)Z

    .line 153
    .line 154
    .line 155
    move v9, v6

    .line 156
    move-object v7, v8

    .line 157
    move v8, v5

    .line 158
    :goto_3
    if-eqz v9, :cond_8

    .line 159
    .line 160
    invoke-virtual {v1, v7, v8}, La/h7k;->x(La/e7z;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    goto :goto_4

    .line 165
    :cond_8
    invoke-virtual {v1, v7, v8}, La/h7k;->y(La/e7z;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    iget-object v9, v7, La/e7z;->i1:La/i7z;

    .line 170
    .line 171
    iget-boolean v9, v9, La/i7z;->f:Z

    .line 172
    .line 173
    if-eqz v9, :cond_9

    .line 174
    .line 175
    sget-object v9, La/eox;->b:La/eox;

    .line 176
    .line 177
    invoke-virtual {v0, v7, v9}, La/oif0;->a(La/e7z;La/eox;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    invoke-virtual {v7}, La/e7z;->q()Z

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-eqz v9, :cond_a

    .line 185
    .line 186
    sget-object v9, La/eox;->d:La/eox;

    .line 187
    .line 188
    invoke-virtual {v0, v7, v9}, La/oif0;->a(La/e7z;La/eox;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_4
    if-ne v7, v3, :cond_3

    .line 192
    .line 193
    if-eqz v8, :cond_3

    .line 194
    .line 195
    move v4, v6

    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_b
    if-eqz p1, :cond_d

    .line 199
    .line 200
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_c
    move v4, v5

    .line 205
    :cond_d
    :goto_5
    iput-boolean v5, v1, La/h7k;->b:Z

    .line 206
    .line 207
    iput-boolean v5, v1, La/h7k;->c:Z

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :goto_6
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    :catchall_1
    move-exception v0

    .line 212
    iput-boolean v5, v1, La/h7k;->b:Z

    .line 213
    .line 214
    iput-boolean v5, v1, La/h7k;->c:Z

    .line 215
    .line 216
    throw v0

    .line 217
    :cond_e
    move v4, v5

    .line 218
    :goto_7
    iget-object v0, v1, La/h7k;->g:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, La/xz40;

    .line 221
    .line 222
    iget-object v1, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 223
    .line 224
    iget v2, v0, La/xz40;->c:I

    .line 225
    .line 226
    move v3, v5

    .line 227
    :goto_8
    if-ge v3, v2, :cond_1a

    .line 228
    .line 229
    aget-object v7, v1, v3

    .line 230
    .line 231
    check-cast v7, La/e7z;

    .line 232
    .line 233
    iget-object v7, v7, La/e7z;->h1:La/tzi;

    .line 234
    .line 235
    iget-object v8, v7, La/tzi;->d:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v8, La/rdx;

    .line 238
    .line 239
    const/high16 v9, 0x400000

    .line 240
    .line 241
    invoke-static {v9}, La/t460;->g(I)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    iget-object v11, v8, La/rdx;->D1:La/wso0;

    .line 246
    .line 247
    if-eqz v10, :cond_f

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_f
    iget-object v11, v11, La/lm40;->e:La/lm40;

    .line 251
    .line 252
    if-nez v11, :cond_10

    .line 253
    .line 254
    goto/16 :goto_10

    .line 255
    .line 256
    :cond_10
    :goto_9
    sget-object v12, La/s460;->w1:La/mb50;

    .line 257
    .line 258
    invoke-virtual {v8, v10}, La/s460;->j1(Z)La/lm40;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    :goto_a
    if-eqz v8, :cond_19

    .line 263
    .line 264
    iget v10, v8, La/lm40;->d:I

    .line 265
    .line 266
    and-int/2addr v10, v9

    .line 267
    if-eqz v10, :cond_19

    .line 268
    .line 269
    iget v10, v8, La/lm40;->c:I

    .line 270
    .line 271
    and-int/2addr v10, v9

    .line 272
    if-eqz v10, :cond_18

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    move-object v12, v8

    .line 276
    move-object v13, v10

    .line 277
    :goto_b
    if-eqz v12, :cond_18

    .line 278
    .line 279
    instance-of v14, v12, La/g6z;

    .line 280
    .line 281
    if-eqz v14, :cond_11

    .line 282
    .line 283
    check-cast v12, La/g6z;

    .line 284
    .line 285
    iget-object v14, v7, La/tzi;->d:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v14, La/rdx;

    .line 288
    .line 289
    invoke-interface {v12, v14}, La/g6z;->N(La/j6z;)V

    .line 290
    .line 291
    .line 292
    goto :goto_f

    .line 293
    :cond_11
    iget v14, v12, La/lm40;->c:I

    .line 294
    .line 295
    and-int/2addr v14, v9

    .line 296
    if-eqz v14, :cond_17

    .line 297
    .line 298
    instance-of v14, v12, La/f3k;

    .line 299
    .line 300
    if-eqz v14, :cond_17

    .line 301
    .line 302
    move-object v14, v12

    .line 303
    check-cast v14, La/f3k;

    .line 304
    .line 305
    iget-object v14, v14, La/f3k;->p:La/lm40;

    .line 306
    .line 307
    move v15, v5

    .line 308
    :goto_c
    if-eqz v14, :cond_16

    .line 309
    .line 310
    iget v5, v14, La/lm40;->c:I

    .line 311
    .line 312
    and-int/2addr v5, v9

    .line 313
    if-eqz v5, :cond_15

    .line 314
    .line 315
    add-int/lit8 v15, v15, 0x1

    .line 316
    .line 317
    if-ne v15, v6, :cond_12

    .line 318
    .line 319
    move-object v12, v14

    .line 320
    goto :goto_d

    .line 321
    :cond_12
    if-nez v13, :cond_13

    .line 322
    .line 323
    new-instance v13, La/xz40;

    .line 324
    .line 325
    const/16 v5, 0x10

    .line 326
    .line 327
    new-array v5, v5, [La/lm40;

    .line 328
    .line 329
    invoke-direct {v13, v5}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_13
    if-eqz v12, :cond_14

    .line 333
    .line 334
    invoke-virtual {v13, v12}, La/xz40;->b(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    move-object v12, v10

    .line 338
    :cond_14
    invoke-virtual {v13, v14}, La/xz40;->b(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_15
    :goto_d
    iget-object v14, v14, La/lm40;->f:La/lm40;

    .line 342
    .line 343
    const/4 v5, 0x0

    .line 344
    goto :goto_c

    .line 345
    :cond_16
    if-ne v15, v6, :cond_17

    .line 346
    .line 347
    :goto_e
    const/4 v5, 0x0

    .line 348
    goto :goto_b

    .line 349
    :cond_17
    :goto_f
    invoke-static {v13}, La/vcc;->V(La/xz40;)La/lm40;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    goto :goto_e

    .line 354
    :cond_18
    if-eq v8, v11, :cond_19

    .line 355
    .line 356
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 357
    .line 358
    const/4 v5, 0x0

    .line 359
    goto :goto_a

    .line 360
    :cond_19
    :goto_10
    add-int/lit8 v3, v3, 0x1

    .line 361
    .line 362
    const/4 v5, 0x0

    .line 363
    goto/16 :goto_8

    .line 364
    .line 365
    :cond_1a
    invoke-virtual {v0}, La/xz40;->g()V

    .line 366
    .line 367
    .line 368
    return v4
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-byte v0, p0, La/h7k;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/Map;

    .line 14
    .line 15
    iget-object v1, p0, La/h7k;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/Long;

    .line 18
    .line 19
    iget-object v2, p0, La/h7k;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Long;

    .line 22
    .line 23
    iget-object v3, p0, La/h7k;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ljava/lang/Long;

    .line 26
    .line 27
    iget-object v4, p0, La/h7k;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/lang/Long;

    .line 30
    .line 31
    new-instance v5, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-boolean v6, p0, La/h7k;->b:Z

    .line 37
    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    const-string v6, "isRegularFile"

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-boolean p0, p0, La/h7k;->c:Z

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    const-string p0, "isDirectory"

    .line 50
    .line 51
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz v4, :cond_2

    .line 55
    .line 56
    new-instance p0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v6, "byteCount="

    .line 59
    .line 60
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_2
    if-eqz v3, :cond_3

    .line 78
    .line 79
    new-instance p0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v4, "createdAt="

    .line 82
    .line 83
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_3
    if-eqz v2, :cond_4

    .line 101
    .line 102
    new-instance p0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v3, "lastModifiedAt="

    .line 105
    .line 106
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_4
    if-eqz v1, :cond_5

    .line 124
    .line 125
    new-instance p0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v2, "lastAccessedAt="

    .line 128
    .line 129
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_6

    .line 151
    .line 152
    new-instance p0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v1, "extras="

    .line 155
    .line 156
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    :cond_6
    const/4 v9, 0x0

    .line 170
    const/16 v10, 0x38

    .line 171
    .line 172
    const-string v6, ", "

    .line 173
    .line 174
    const-string v7, "FileMetadata("

    .line 175
    .line 176
    const-string v8, ")"

    .line 177
    .line 178
    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u(La/e7z;J)V
    .locals 12

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e7z;

    .line 4
    .line 5
    iget-boolean v1, p1, La/e7z;->s1:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-string v1, "measureAndLayout called on root"

    .line 14
    .line 15
    invoke-static {v1}, La/xcx;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, La/e7z;->I()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    const-string v1, "performMeasureAndLayout called with unattached root"

    .line 25
    .line 26
    invoke-static {v1}, La/xcx;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {v0}, La/e7z;->J()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-string v0, "performMeasureAndLayout called with unplaced root"

    .line 36
    .line 37
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    iget-boolean v0, p0, La/h7k;->b:Z

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    const-string v0, "performMeasureAndLayout called during measure layout"

    .line 45
    .line 46
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, La/p4e;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v0, :cond_8

    .line 56
    .line 57
    iput-boolean v1, p0, La/h7k;->b:Z

    .line 58
    .line 59
    iput-boolean v2, p0, La/h7k;->c:Z

    .line 60
    .line 61
    :try_start_0
    iget-object v0, p0, La/h7k;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La/oif0;

    .line 64
    .line 65
    iget-object v3, v0, La/oif0;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, La/clc;

    .line 68
    .line 69
    invoke-virtual {v3, p1}, La/clc;->g(La/e7z;)Z

    .line 70
    .line 71
    .line 72
    iget-object v3, v0, La/oif0;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, La/clc;

    .line 75
    .line 76
    invoke-virtual {v3, p1}, La/clc;->g(La/e7z;)Z

    .line 77
    .line 78
    .line 79
    iget-object v0, v0, La/oif0;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/clc;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, La/clc;->g(La/e7z;)Z

    .line 84
    .line 85
    .line 86
    new-instance v0, La/p4e;

    .line 87
    .line 88
    invoke-direct {v0, p2, p3}, La/p4e;-><init>(J)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0}, La/h7k;->f(La/e7z;La/p4e;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_5

    .line 96
    .line 97
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 98
    .line 99
    iget-boolean v0, v0, La/i7z;->f:Z

    .line 100
    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    :cond_5
    invoke-virtual {p1}, La/e7z;->K()Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-virtual {p1}, La/e7z;->L()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    :goto_1
    invoke-virtual {p0, p1}, La/h7k;->i(La/e7z;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, La/p4e;

    .line 125
    .line 126
    invoke-direct {v0, p2, p3}, La/p4e;-><init>(J)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0}, La/h7k;->g(La/e7z;La/p4e;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, La/e7z;->q()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_7

    .line 137
    .line 138
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_7

    .line 143
    .line 144
    invoke-virtual {p1}, La/e7z;->S()V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, La/h7k;->f:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p2, La/kd30;

    .line 150
    .line 151
    iget p3, p1, La/e7z;->r1:I

    .line 152
    .line 153
    if-lez p3, :cond_7

    .line 154
    .line 155
    iget-object p2, p2, La/kd30;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, La/xz40;

    .line 158
    .line 159
    invoke-virtual {p2, p1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iput-boolean v1, p1, La/e7z;->q1:Z

    .line 163
    .line 164
    :cond_7
    invoke-virtual {p0}, La/h7k;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    iput-boolean v2, p0, La/h7k;->b:Z

    .line 168
    .line 169
    iput-boolean v2, p0, La/h7k;->c:Z

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    :catchall_1
    move-exception p1

    .line 174
    iput-boolean v2, p0, La/h7k;->b:Z

    .line 175
    .line 176
    iput-boolean v2, p0, La/h7k;->c:Z

    .line 177
    .line 178
    throw p1

    .line 179
    :cond_8
    :goto_3
    iget-object p0, p0, La/h7k;->g:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, La/xz40;

    .line 182
    .line 183
    iget-object p1, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 184
    .line 185
    iget p2, p0, La/xz40;->c:I

    .line 186
    .line 187
    move p3, v2

    .line 188
    :goto_4
    if-ge p3, p2, :cond_14

    .line 189
    .line 190
    aget-object v0, p1, p3

    .line 191
    .line 192
    check-cast v0, La/e7z;

    .line 193
    .line 194
    iget-object v0, v0, La/e7z;->h1:La/tzi;

    .line 195
    .line 196
    iget-object v3, v0, La/tzi;->d:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v3, La/rdx;

    .line 199
    .line 200
    const/high16 v4, 0x400000

    .line 201
    .line 202
    invoke-static {v4}, La/t460;->g(I)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iget-object v6, v3, La/rdx;->D1:La/wso0;

    .line 207
    .line 208
    if-eqz v5, :cond_9

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_9
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 212
    .line 213
    if-nez v6, :cond_a

    .line 214
    .line 215
    goto/16 :goto_b

    .line 216
    .line 217
    :cond_a
    :goto_5
    sget-object v7, La/s460;->w1:La/mb50;

    .line 218
    .line 219
    invoke-virtual {v3, v5}, La/s460;->j1(Z)La/lm40;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    :goto_6
    if-eqz v3, :cond_13

    .line 224
    .line 225
    iget v5, v3, La/lm40;->d:I

    .line 226
    .line 227
    and-int/2addr v5, v4

    .line 228
    if-eqz v5, :cond_13

    .line 229
    .line 230
    iget v5, v3, La/lm40;->c:I

    .line 231
    .line 232
    and-int/2addr v5, v4

    .line 233
    if-eqz v5, :cond_12

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    move-object v7, v3

    .line 237
    move-object v8, v5

    .line 238
    :goto_7
    if-eqz v7, :cond_12

    .line 239
    .line 240
    instance-of v9, v7, La/g6z;

    .line 241
    .line 242
    if-eqz v9, :cond_b

    .line 243
    .line 244
    check-cast v7, La/g6z;

    .line 245
    .line 246
    iget-object v9, v0, La/tzi;->d:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v9, La/rdx;

    .line 249
    .line 250
    invoke-interface {v7, v9}, La/g6z;->N(La/j6z;)V

    .line 251
    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_b
    iget v9, v7, La/lm40;->c:I

    .line 255
    .line 256
    and-int/2addr v9, v4

    .line 257
    if-eqz v9, :cond_11

    .line 258
    .line 259
    instance-of v9, v7, La/f3k;

    .line 260
    .line 261
    if-eqz v9, :cond_11

    .line 262
    .line 263
    move-object v9, v7

    .line 264
    check-cast v9, La/f3k;

    .line 265
    .line 266
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 267
    .line 268
    move v10, v2

    .line 269
    :goto_8
    if-eqz v9, :cond_10

    .line 270
    .line 271
    iget v11, v9, La/lm40;->c:I

    .line 272
    .line 273
    and-int/2addr v11, v4

    .line 274
    if-eqz v11, :cond_f

    .line 275
    .line 276
    add-int/lit8 v10, v10, 0x1

    .line 277
    .line 278
    if-ne v10, v1, :cond_c

    .line 279
    .line 280
    move-object v7, v9

    .line 281
    goto :goto_9

    .line 282
    :cond_c
    if-nez v8, :cond_d

    .line 283
    .line 284
    new-instance v8, La/xz40;

    .line 285
    .line 286
    const/16 v11, 0x10

    .line 287
    .line 288
    new-array v11, v11, [La/lm40;

    .line 289
    .line 290
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_d
    if-eqz v7, :cond_e

    .line 294
    .line 295
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v7, v5

    .line 299
    :cond_e
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_f
    :goto_9
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_10
    if-ne v10, v1, :cond_11

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_11
    :goto_a
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    goto :goto_7

    .line 313
    :cond_12
    if-eq v3, v6, :cond_13

    .line 314
    .line 315
    iget-object v3, v3, La/lm40;->f:La/lm40;

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_13
    :goto_b
    add-int/lit8 p3, p3, 0x1

    .line 319
    .line 320
    goto/16 :goto_4

    .line 321
    .line 322
    :cond_14
    invoke-virtual {p0}, La/xz40;->g()V

    .line 323
    .line 324
    .line 325
    return-void
.end method

.method public v()V
    .locals 5

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e7z;

    .line 4
    .line 5
    iget-object v1, p0, La/h7k;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/oif0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/oif0;->E()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_6

    .line 14
    .line 15
    invoke-virtual {v0}, La/e7z;->I()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 22
    .line 23
    invoke-static {v2}, La/xcx;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, La/e7z;->J()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 33
    .line 34
    invoke-static {v2}, La/xcx;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-boolean v2, p0, La/h7k;->b:Z

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 42
    .line 43
    invoke-static {v2}, La/xcx;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v2, p0, La/h7k;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, La/p4e;

    .line 49
    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    iput-boolean v2, p0, La/h7k;->b:Z

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    iput-boolean v3, p0, La/h7k;->c:Z

    .line 57
    .line 58
    :try_start_0
    iget-object v4, v1, La/oif0;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, La/clc;

    .line 61
    .line 62
    iget-object v4, v4, La/clc;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, La/mlk0;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    iget-object v1, v1, La/oif0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/clc;

    .line 75
    .line 76
    iget-object v1, v1, La/clc;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/mlk0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    move v1, v2

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    move v1, v3

    .line 89
    :goto_0
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v1, v0, La/e7z;->i:La/e7z;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0, v0, v2}, La/h7k;->A(La/e7z;Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {p0, v0}, La/h7k;->z(La/e7z;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_1
    invoke-virtual {p0, v0, v3}, La/h7k;->A(La/e7z;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, La/h7k;->b:Z

    .line 108
    .line 109
    iput-boolean v3, p0, La/h7k;->c:Z

    .line 110
    .line 111
    return-void

    .line 112
    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    iput-boolean v3, p0, La/h7k;->b:Z

    .line 115
    .line 116
    iput-boolean v3, p0, La/h7k;->c:Z

    .line 117
    .line 118
    throw v0

    .line 119
    :cond_6
    return-void
.end method

.method public w()V
    .locals 15

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/l4e;

    .line 4
    .line 5
    iget-object v0, v0, La/l4e;->u0:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, La/k4e;

    .line 23
    .line 24
    iget-boolean v1, v3, La/k4e;->a:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v3, La/k4e;->U:[La/j4e;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aget-object v8, v1, v2

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    aget-object v1, v1, v9

    .line 36
    .line 37
    iget v4, v3, La/k4e;->s:I

    .line 38
    .line 39
    iget v5, v3, La/k4e;->t:I

    .line 40
    .line 41
    sget-object v10, La/j4e;->c:La/j4e;

    .line 42
    .line 43
    sget-object v6, La/j4e;->b:La/j4e;

    .line 44
    .line 45
    if-eq v8, v6, :cond_2

    .line 46
    .line 47
    if-ne v8, v10, :cond_1

    .line 48
    .line 49
    if-ne v4, v9, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v4, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    :goto_1
    move v4, v9

    .line 55
    :goto_2
    if-eq v1, v6, :cond_3

    .line 56
    .line 57
    if-ne v1, v10, :cond_4

    .line 58
    .line 59
    if-ne v5, v9, :cond_4

    .line 60
    .line 61
    :cond_3
    move v2, v9

    .line 62
    :cond_4
    iget-object v5, v3, La/k4e;->d:La/cmw;

    .line 63
    .line 64
    iget-object v5, v5, La/hev0;->e:La/vmk;

    .line 65
    .line 66
    iget-boolean v7, v5, La/i7k;->j:Z

    .line 67
    .line 68
    iget-object v11, v3, La/k4e;->e:La/ocu0;

    .line 69
    .line 70
    iget-object v11, v11, La/hev0;->e:La/vmk;

    .line 71
    .line 72
    iget-boolean v12, v11, La/i7k;->j:Z

    .line 73
    .line 74
    move v13, v4

    .line 75
    sget-object v4, La/j4e;->a:La/j4e;

    .line 76
    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    if-eqz v12, :cond_5

    .line 80
    .line 81
    iget v5, v5, La/i7k;->g:I

    .line 82
    .line 83
    iget v7, v11, La/i7k;->g:I

    .line 84
    .line 85
    move-object v6, v4

    .line 86
    move-object v2, p0

    .line 87
    invoke-virtual/range {v2 .. v7}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 88
    .line 89
    .line 90
    iput-boolean v9, v3, La/k4e;->a:Z

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    if-eqz v7, :cond_7

    .line 94
    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    iget v5, v5, La/i7k;->g:I

    .line 98
    .line 99
    iget v7, v11, La/i7k;->g:I

    .line 100
    .line 101
    move-object v2, p0

    .line 102
    invoke-virtual/range {v2 .. v7}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 103
    .line 104
    .line 105
    iget-object p0, v3, La/k4e;->e:La/ocu0;

    .line 106
    .line 107
    if-ne v1, v10, :cond_6

    .line 108
    .line 109
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 110
    .line 111
    invoke-virtual {v3}, La/k4e;->m()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    iput v1, p0, La/vmk;->m:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 119
    .line 120
    invoke-virtual {v3}, La/k4e;->m()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {p0, v1}, La/vmk;->d(I)V

    .line 125
    .line 126
    .line 127
    iput-boolean v9, v3, La/k4e;->a:Z

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    move-object v2, p0

    .line 131
    if-eqz v12, :cond_9

    .line 132
    .line 133
    if-eqz v13, :cond_9

    .line 134
    .line 135
    iget v5, v5, La/i7k;->g:I

    .line 136
    .line 137
    iget v7, v11, La/i7k;->g:I

    .line 138
    .line 139
    move-object v14, v6

    .line 140
    move-object v6, v4

    .line 141
    move-object v4, v14

    .line 142
    invoke-virtual/range {v2 .. v7}, La/h7k;->s(La/k4e;La/j4e;ILa/j4e;I)V

    .line 143
    .line 144
    .line 145
    iget-object p0, v3, La/k4e;->d:La/cmw;

    .line 146
    .line 147
    if-ne v8, v10, :cond_8

    .line 148
    .line 149
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 150
    .line 151
    invoke-virtual {v3}, La/k4e;->s()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    iput v1, p0, La/vmk;->m:I

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    iget-object p0, p0, La/hev0;->e:La/vmk;

    .line 159
    .line 160
    invoke-virtual {v3}, La/k4e;->s()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {p0, v1}, La/vmk;->d(I)V

    .line 165
    .line 166
    .line 167
    iput-boolean v9, v3, La/k4e;->a:Z

    .line 168
    .line 169
    :cond_9
    :goto_3
    iget-boolean p0, v3, La/k4e;->a:Z

    .line 170
    .line 171
    if-eqz p0, :cond_a

    .line 172
    .line 173
    iget-object p0, v3, La/k4e;->e:La/ocu0;

    .line 174
    .line 175
    iget-object p0, p0, La/ocu0;->l:La/i56;

    .line 176
    .line 177
    if-eqz p0, :cond_a

    .line 178
    .line 179
    iget v1, v3, La/k4e;->c0:I

    .line 180
    .line 181
    invoke-virtual {p0, v1}, La/vmk;->d(I)V

    .line 182
    .line 183
    .line 184
    :cond_a
    move-object p0, v2

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    return-void
.end method

.method public x(La/e7z;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e7z;

    .line 4
    .line 5
    iget-boolean v1, p1, La/e7z;->s1:Z

    .line 6
    .line 7
    iget-object v2, p1, La/e7z;->i1:La/i7z;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, La/h7k;->r(La/e7z;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_c

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, La/h7k;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/p4e;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-eqz p2, :cond_4

    .line 32
    .line 33
    iget-boolean p2, v2, La/i7z;->e:Z

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-static {p1, v1}, La/h7k;->f(La/e7z;La/p4e;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :cond_2
    if-nez v3, :cond_3

    .line 42
    .line 43
    iget-boolean p2, v2, La/i7z;->f:Z

    .line 44
    .line 45
    if-eqz p2, :cond_b

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, La/e7z;->K()Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_b

    .line 58
    .line 59
    invoke-virtual {p1}, La/e7z;->L()V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    invoke-static {p1, v1}, La/h7k;->g(La/e7z;La/p4e;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    goto :goto_1

    .line 74
    :cond_5
    move p2, v3

    .line 75
    :goto_1
    invoke-virtual {p1}, La/e7z;->q()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_a

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    if-eq p1, v0, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_a

    .line 89
    .line 90
    invoke-virtual {v4}, La/e7z;->J()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ne v4, v1, :cond_a

    .line 95
    .line 96
    iget-object v4, v2, La/i7z;->p:La/sj30;

    .line 97
    .line 98
    iget-boolean v4, v4, La/sj30;->u:Z

    .line 99
    .line 100
    if-eqz v4, :cond_a

    .line 101
    .line 102
    :cond_6
    if-ne p1, v0, :cond_9

    .line 103
    .line 104
    iget-object v0, p1, La/e7z;->Z:La/c7z;

    .line 105
    .line 106
    sget-object v4, La/c7z;->c:La/c7z;

    .line 107
    .line 108
    if-ne v0, v4, :cond_7

    .line 109
    .line 110
    invoke-virtual {p1}, La/e7z;->g()V

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    iget-object v0, v0, La/e7z;->h1:La/tzi;

    .line 120
    .line 121
    iget-object v0, v0, La/tzi;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/rdx;

    .line 124
    .line 125
    iget-object v0, v0, La/c810;->p:La/d810;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    invoke-static {p1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, La/cg80;->getPlacementScope()La/ou90;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_2
    iget-object v2, v2, La/i7z;->p:La/sj30;

    .line 137
    .line 138
    invoke-static {v0, v2, v3, v3}, La/ou90;->n(La/ou90;La/pu90;II)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    invoke-virtual {p1}, La/e7z;->S()V

    .line 143
    .line 144
    .line 145
    :goto_3
    iget-object v0, p0, La/h7k;->f:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, La/kd30;

    .line 148
    .line 149
    iget v2, p1, La/e7z;->r1:I

    .line 150
    .line 151
    if-lez v2, :cond_a

    .line 152
    .line 153
    iget-object v0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/xz40;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-boolean v1, p1, La/e7z;->q1:Z

    .line 161
    .line 162
    :cond_a
    move v3, p2

    .line 163
    :cond_b
    :goto_4
    invoke-virtual {p0}, La/h7k;->h()V

    .line 164
    .line 165
    .line 166
    :cond_c
    :goto_5
    return v3
.end method

.method public y(La/e7z;Z)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, La/e7z;->s1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-static {p1}, La/h7k;->r(La/e7z;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, La/h7k;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/e7z;

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, La/h7k;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/p4e;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz p2, :cond_2

    .line 29
    .line 30
    iget-object p2, p1, La/e7z;->i1:La/i7z;

    .line 31
    .line 32
    iget-boolean p2, p2, La/i7z;->e:Z

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-static {p1, v0}, La/h7k;->f(La/e7z;La/p4e;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-static {p1, v0}, La/h7k;->g(La/e7z;La/p4e;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :cond_3
    :goto_1
    invoke-virtual {p0}, La/h7k;->h()V

    .line 52
    .line 53
    .line 54
    :cond_4
    :goto_2
    return v1
.end method

.method public z(La/e7z;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, La/e7z;->A()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, La/xz40;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, La/e7z;

    .line 15
    .line 16
    invoke-virtual {v2}, La/e7z;->s()La/c7z;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, La/c7z;->a:La/c7z;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, La/e7z;->i1:La/i7z;

    .line 25
    .line 26
    iget-object v3, v3, La/i7z;->p:La/sj30;

    .line 27
    .line 28
    iget-object v3, v3, La/sj30;->y:La/f7z;

    .line 29
    .line 30
    invoke-virtual {v3}, La/f7z;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, La/p7x;->E(La/e7z;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, La/h7k;->A(La/e7z;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, La/h7k;->z(La/e7z;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method
