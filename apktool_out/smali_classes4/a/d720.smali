.class public final La/d720;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;


# instance fields
.field public final a:La/lbu;

.field public final b:La/ua20;

.field public final c:Z

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, La/z620;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, La/d720;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/d720;->f:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/lbu;La/lk5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d720;->a:La/lbu;

    .line 5
    .line 6
    sget-object p1, La/j820;->d:La/j820;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, La/lk5;->c(La/j820;)La/ua20;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, La/d720;->b:La/ua20;

    .line 13
    .line 14
    sget-object p2, La/ua20;->b:La/ua20;

    .line 15
    .line 16
    if-eq p1, p2, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, p0, La/d720;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    sget-object p1, La/d720;->f:Ljava/lang/String;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object p1, La/d720;->e:Ljava/lang/String;

    .line 29
    .line 30
    :goto_1
    iput-object p1, p0, La/d720;->d:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/d720;->d:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, La/d720;->a:La/lbu;

    .line 13
    .line 14
    invoke-virtual {v1}, La/lbu;->j()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-boolean v1, p0, La/d720;->c:Z

    .line 22
    .line 23
    const-string v2, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget-object v1, La/z620;->u2:La/uuz;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v1, La/z620;

    .line 35
    .line 36
    invoke-direct {v1}, La/z620;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v5, La/z620;->v2:[La/iiy;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    aget-object v6, v5, v6

    .line 43
    .line 44
    iget-object v7, v1, La/z620;->p2:La/khf0;

    .line 45
    .line 46
    invoke-virtual {v7, v1, v6, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, v1, La/z620;->q2:La/yzn0;

    .line 50
    .line 51
    aget-object v4, v5, v4

    .line 52
    .line 53
    invoke-virtual {p2, v1, v4, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, v1, La/z620;->r2:La/yzn0;

    .line 57
    .line 58
    aget-object v2, v5, v3

    .line 59
    .line 60
    iget-object p0, p0, La/d720;->b:La/ua20;

    .line 61
    .line 62
    invoke-virtual {p2, v1, v2, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, p1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    sget-object p0, La/c720;->p2:La/wsz;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p0, La/c720;

    .line 75
    .line 76
    invoke-direct {p0}, La/c720;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v1, La/c720;->q2:[La/iiy;

    .line 80
    .line 81
    aget-object v4, v1, v4

    .line 82
    .line 83
    iget-object v5, p0, La/c720;->j2:La/khf0;

    .line 84
    .line 85
    invoke-virtual {v5, p0, v4, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, La/c720;->k2:La/yzn0;

    .line 89
    .line 90
    aget-object v1, v1, v3

    .line 91
    .line 92
    invoke-virtual {p2, p0, v1, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_0
    return-void
.end method
