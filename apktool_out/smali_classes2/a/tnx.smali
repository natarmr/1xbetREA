.class public final La/tnx;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/wa3;


# direct methods
.method public constructor <init>(La/vkr0;La/wa3;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, La/tnx;->c:La/wa3;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final n1(La/td9;I)Ljava/lang/Object;
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, La/tnx;->c:La/wa3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/wa3;->q0(La/td9;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch La/yut0; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iget v1, v0, La/yut0;->b:I

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x5

    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    const/16 v2, 0xe1a

    .line 18
    .line 19
    if-ne v1, v2, :cond_3

    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x1

    .line 22
    if-ge p2, v1, :cond_2

    .line 23
    .line 24
    iget-object v2, v0, La/yut0;->d:Landroid/os/Bundle;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const-string v4, "access_token"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_1
    iget-object v2, p0, La/p4;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, La/vkr0;

    .line 38
    .line 39
    invoke-virtual {v2}, La/vkr0;->m()La/kf60;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v2, v2, La/kf60;->c:La/a8z;

    .line 44
    .line 45
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v2}, La/w7n0;->m(Ljava/util/List;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v4, p0, La/p4;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, La/vkr0;

    .line 58
    .line 59
    invoke-virtual {v4}, La/vkr0;->m()La/kf60;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    add-int/2addr p2, v1

    .line 75
    invoke-virtual {p0, p1, p2}, La/tnx;->n1(La/td9;I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_2
    invoke-virtual {p0, v0}, La/tnx;->o1(La/yut0;)V

    .line 81
    .line 82
    .line 83
    const-class p1, La/tnx;

    .line 84
    .line 85
    monitor-enter p1

    .line 86
    :try_start_1
    invoke-virtual {p0, v0}, La/tnx;->o1(La/yut0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    monitor-exit p1

    .line 90
    :cond_3
    throw v0

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    monitor-exit p1

    .line 93
    throw p0
.end method

.method public final o1(La/yut0;)V
    .locals 5

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vkr0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/vkr0;->m()La/kf60;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, La/kf60;->c:La/a8z;

    .line 10
    .line 11
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, La/xut0;

    .line 34
    .line 35
    iget-object v2, v2, La/xut0;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, La/yut0;->d:Landroid/os/Bundle;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const-string v4, "access_token"

    .line 42
    .line 43
    invoke-virtual {v3, v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v3, v1

    .line 49
    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object v0, v1

    .line 57
    :goto_1
    check-cast v0, La/xut0;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v1, v0, La/xut0;->e:Lcom/vk/dto/common/id/UserId;

    .line 62
    .line 63
    :cond_3
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget-wide v0, v1, Lcom/vk/dto/common/id/UserId;->a:J

    .line 66
    .line 67
    const-wide/16 v2, 0x0

    .line 68
    .line 69
    cmp-long p0, v0, v2

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    throw p1
.end method

.method public final q0(La/td9;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, La/tnx;->n1(La/td9;I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
