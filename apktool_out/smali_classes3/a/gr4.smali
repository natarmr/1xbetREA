.class public final La/gr4;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic q:I


# instance fields
.field public final o:La/yo4;

.field public final p:La/zr1;


# direct methods
.method public constructor <init>(La/ctf0;La/yo4;La/zr1;La/mne;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p4, p4, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p4, p4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    new-instance v0, La/a04;

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/a04;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ep4;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p1, v2}, La/ep4;-><init>(La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-direct {p0, v0, p4, v1, p1}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, La/gr4;->o:La/yo4;

    .line 28
    .line 29
    iput-object p3, p0, La/gr4;->p:La/zr1;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final M(La/zq4;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/yq4;->a:La/yq4;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "off"

    .line 12
    .line 13
    const-wide/16 v3, 0xd0e

    .line 14
    .line 15
    iget-object v5, p0, La/gr4;->p:La/zr1;

    .line 16
    .line 17
    const-string v6, "active_sessions"

    .line 18
    .line 19
    const-string v7, "action"

    .line 20
    .line 21
    const-string v8, "authenticator_bottom_click"

    .line 22
    .line 23
    iget-object v9, p0, La/gr4;->o:La/yo4;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p1, v9, La/yo4;->a:La/kt2;

    .line 28
    .line 29
    invoke-static {v7, v6, p1, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v5, La/zr1;->a:La/s1p;

    .line 33
    .line 34
    new-instance v0, La/j1p;

    .line 35
    .line 36
    invoke-direct {v0, v2, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 44
    .line 45
    .line 46
    new-instance p1, La/dr4;

    .line 47
    .line 48
    sget-object v0, La/n680;->a:La/n680;

    .line 49
    .line 50
    invoke-direct {p1, v0}, La/dr4;-><init>(La/n680;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    sget-object v0, La/yq4;->b:La/yq4;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-object p1, v9, La/yo4;->a:La/kt2;

    .line 66
    .line 67
    invoke-static {v7, v2, p1, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, v5, La/zr1;->a:La/s1p;

    .line 71
    .line 72
    new-instance v0, La/j1p;

    .line 73
    .line 74
    invoke-direct {v0, v6, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 82
    .line 83
    .line 84
    new-instance p1, La/dr4;

    .line 85
    .line 86
    sget-object v0, La/n680;->b:La/n680;

    .line 87
    .line 88
    invoke-direct {p1, v0}, La/dr4;-><init>(La/n680;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    sget-object v0, La/xq4;->a:La/xq4;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/zq4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/gr4;->M(La/zq4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
