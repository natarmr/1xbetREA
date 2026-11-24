.class public final La/gku0;
.super La/hd3;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final j:La/hd3;

.field public final k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public constructor <init>(La/hd3;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/hny;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gku0;->j:La/hd3;

    .line 5
    .line 6
    iput-object p2, p0, La/gku0;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 7
    .line 8
    return-void
.end method

.method public static E(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1, p0, p2}, La/i8q0;->e(Landroid/view/LayoutInflater;Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v0, "ViewStub"

    .line 17
    .line 18
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    new-instance v0, La/wiz;

    .line 26
    .line 27
    invoke-direct {v0, p1}, La/wiz;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wiz;->a:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/reflect/Field;

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v3, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object p1, v3, v4

    .line 55
    .line 56
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/reflect/Field;

    .line 61
    .line 62
    invoke-virtual {p1, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0, v1, p2}, Landroid/view/LayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final A(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->A(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/hd3;->B(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final C(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->C(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final D(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->D(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/hd3;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->d(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/gku0;->d(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hd3;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 7

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
    new-instance v0, La/c8x;

    .line 11
    .line 12
    new-instance v1, La/fku0;

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-object v6, p1

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    move-object v5, p4

    .line 19
    invoke-direct/range {v1 .. v6}, La/fku0;-><init>(La/gku0;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    move-object v2, v5

    .line 23
    move-object v5, v1

    .line 24
    move-object v1, v3

    .line 25
    move-object v3, v2

    .line 26
    move-object v2, v4

    .line 27
    move-object v4, v6

    .line 28
    invoke-direct/range {v0 .. v5}, La/c8x;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;La/fku0;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/tyj;

    .line 32
    .line 33
    sget-object p1, La/k5n0;->a:Ljava/util/List;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    sget-object p1, La/iun;->a:La/iun;

    .line 38
    .line 39
    :cond_0
    const/4 p2, 0x0

    .line 40
    invoke-direct {p0, p1, p2, v0}, La/tyj;-><init>(Ljava/util/List;ILa/c8x;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/tyj;->e(La/c8x;)La/d8x;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/d8x;->a:Landroid/view/View;

    .line 48
    .line 49
    return-object p0
.end method

.method public final h(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->h(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->i()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final j()I
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->j()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final k()Landroid/view/MenuInflater;
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->k()Landroid/view/MenuInflater;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final l()La/qhv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->l()La/qhv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, La/gku0;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of p0, p0, La/pd3;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v0, "The Activity\'s LayoutInflater already has a Factory installed so we can not install ViewPump\'s"

    .line 28
    .line 29
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final n()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->n()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, La/gku0;->g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

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
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, p1, p2, p3}, La/gku0;->g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final p(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->p(Landroid/content/res/Configuration;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/hd3;->q(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, La/hd3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    invoke-static {v0}, La/hd3;->x(La/hd3;)V

    .line 10
    .line 11
    .line 12
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-static {p0}, La/hd3;->b(La/hd3;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw p0
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {v0}, La/hd3;->r()V

    .line 4
    .line 5
    .line 6
    sget-object v0, La/hd3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {p0}, La/hd3;->x(La/hd3;)V

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final s(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->s(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->t()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->u(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->v()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/hd3;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final y(I)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/hd3;->y(I)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final z(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gku0;->j:La/hd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hd3;->z(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
