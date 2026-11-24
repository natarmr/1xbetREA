.class public final La/e720;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;


# instance fields
.field public final a:La/loi0;

.field public final b:La/ani0;

.field public final c:La/lbu;

.field public final d:Z

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, La/a720;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/e720;->f:Ljava/lang/String;

    .line 8
    .line 9
    const-class v0, La/b720;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/e720;->g:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/loi0;La/ani0;La/lbu;La/lk5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e720;->a:La/loi0;

    .line 5
    .line 6
    iput-object p2, p0, La/e720;->b:La/ani0;

    .line 7
    .line 8
    iput-object p3, p0, La/e720;->c:La/lbu;

    .line 9
    .line 10
    sget-object p1, La/j820;->a:La/j820;

    .line 11
    .line 12
    invoke-virtual {p4, p1}, La/lk5;->c(La/j820;)La/ua20;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object p2, La/ua20;->b:La/ua20;

    .line 17
    .line 18
    if-eq p1, p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    iput-boolean p1, p0, La/e720;->d:Z

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    sget-object p1, La/e720;->g:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget-object p1, La/e720;->f:Ljava/lang/String;

    .line 31
    .line 32
    :goto_1
    iput-object p1, p0, La/e720;->e:Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/e720;->e:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, La/sik;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p0, La/sik;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, La/sik;->x0()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V
    .locals 4

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
    invoke-virtual {p1}, Landroidx/fragment/app/e;->F()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/e720;->e:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, La/e720;->c:La/lbu;

    .line 25
    .line 26
    invoke-virtual {v1}, La/lbu;->j()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, La/e720;->a:La/loi0;

    .line 34
    .line 35
    invoke-virtual {v1, p2}, La/loi0;->a(La/m97;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p2, p3, La/m0k0;->x:Z

    .line 39
    .line 40
    iget-object v1, p0, La/e720;->b:La/ani0;

    .line 41
    .line 42
    iget-object v1, v1, La/ani0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/h03;

    .line 45
    .line 46
    iget-object v1, v1, La/h03;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/nb7;

    .line 49
    .line 50
    iput-boolean p2, v1, La/nb7;->c:Z

    .line 51
    .line 52
    iget-boolean p0, p0, La/e720;->d:Z

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    sget-object p0, La/b720;->w2:La/evz;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p0, La/b720;

    .line 63
    .line 64
    invoke-direct {p0}, La/b720;-><init>()V

    .line 65
    .line 66
    .line 67
    sget-object v1, La/b720;->x2:[La/iiy;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    aget-object v2, v1, v2

    .line 71
    .line 72
    iget-object v3, p0, La/b720;->s2:La/yzn0;

    .line 73
    .line 74
    invoke-virtual {v3, p0, v2, p3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, La/b720;->t2:La/yzn0;

    .line 78
    .line 79
    aget-object p2, v1, p2

    .line 80
    .line 81
    invoke-virtual {p3, p0, p2, p4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, p1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    sget-object p0, La/a720;->x2:La/xuz;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance p0, La/a720;

    .line 94
    .line 95
    invoke-direct {p0}, La/a720;-><init>()V

    .line 96
    .line 97
    .line 98
    sget-object v1, La/a720;->y2:[La/iiy;

    .line 99
    .line 100
    aget-object p2, v1, p2

    .line 101
    .line 102
    iget-object v2, p0, La/a720;->o2:La/yzn0;

    .line 103
    .line 104
    invoke-virtual {v2, p0, p2, p3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 105
    .line 106
    .line 107
    const/4 p2, 0x2

    .line 108
    aget-object p2, v1, p2

    .line 109
    .line 110
    iget-object p3, p0, La/a720;->s2:La/yzn0;

    .line 111
    .line 112
    invoke-virtual {p3, p0, p2, p4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, p1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    :goto_0
    return-void
.end method
