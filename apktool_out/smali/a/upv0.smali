.class public final La/upv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/aeg0;

.field public final b:La/f7k;


# direct methods
.method public constructor <init>(La/aeg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/upv0;->a:La/aeg0;

    .line 5
    .line 6
    new-instance p1, La/f7k;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-direct {p1, v0}, La/f7k;-><init>(B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/upv0;->b:La/f7k;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/qpg0;La/gx3;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, La/gx3;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/cx3;

    .line 6
    .line 7
    iget-object v1, v0, La/cx3;->a:La/gx3;

    .line 8
    .line 9
    invoke-virtual {v1}, La/nuj0;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v2, p2, La/nuj0;->c:I

    .line 17
    .line 18
    const/16 v3, 0x3e7

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-le v2, v3, :cond_1

    .line 22
    .line 23
    new-instance v0, La/spv0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1, v4}, La/spv0;-><init>(La/upv0;La/qpg0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, v0}, La/q8x;->G(La/gx3;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("

    .line 33
    .line 34
    invoke-static {p0}, La/brm0;->r(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget v1, v1, La/nuj0;->c:I

    .line 39
    .line 40
    invoke-static {v1, p0}, La/zsm0;->i(ILjava/lang/StringBuilder;)V

    .line 41
    .line 42
    .line 43
    const-string v1, ")"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p1, p0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0}, La/cx3;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v0, 0x1

    .line 61
    move v1, v0

    .line 62
    :goto_0
    move-object v2, p1

    .line 63
    check-cast v2, La/bx3;

    .line 64
    .line 65
    invoke-virtual {v2}, La/bx3;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    invoke-virtual {v2}, La/bx3;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {p0, v1, v2}, La/xpg0;->z(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    add-int/2addr v1, v0

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    :try_start_0
    const-string p1, "work_spec_id"

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, La/z1x;->A(La/xpg0;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    const/4 v0, -0x1

    .line 92
    if-ne p1, v0, :cond_3

    .line 93
    .line 94
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {p0}, La/xpg0;->W0()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-interface {p0, p1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p2, v0}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/util/List;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-interface {p0, v4}, La/xpg0;->getBlob(I)[B

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sget-object v2, La/maj;->b:La/maj;

    .line 121
    .line 122
    invoke-static {v1}, La/nkb;->B([B)La/maj;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 137
    .line 138
    .line 139
    throw p1
.end method

.method public final b(La/qpg0;La/gx3;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, La/gx3;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/cx3;

    .line 6
    .line 7
    iget-object v1, v0, La/cx3;->a:La/gx3;

    .line 8
    .line 9
    invoke-virtual {v1}, La/nuj0;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v2, p2, La/nuj0;->c:I

    .line 17
    .line 18
    const/16 v3, 0x3e7

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-le v2, v3, :cond_1

    .line 22
    .line 23
    new-instance v0, La/spv0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1, v4}, La/spv0;-><init>(La/upv0;La/qpg0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, v0}, La/q8x;->G(La/gx3;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("

    .line 33
    .line 34
    invoke-static {p0}, La/brm0;->r(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget v1, v1, La/nuj0;->c:I

    .line 39
    .line 40
    invoke-static {v1, p0}, La/zsm0;->i(ILjava/lang/StringBuilder;)V

    .line 41
    .line 42
    .line 43
    const-string v1, ")"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p1, p0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0}, La/cx3;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move v0, v4

    .line 61
    :goto_0
    move-object v1, p1

    .line 62
    check-cast v1, La/bx3;

    .line 63
    .line 64
    invoke-virtual {v1}, La/bx3;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1}, La/bx3;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/String;

    .line 75
    .line 76
    invoke-interface {p0, v0, v1}, La/xpg0;->z(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    add-int/2addr v0, v4

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    :try_start_0
    const-string p1, "work_spec_id"

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1}, La/z1x;->A(La/xpg0;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    const/4 v0, -0x1

    .line 91
    if-ne p1, v0, :cond_3

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {p0}, La/xpg0;->W0()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-interface {p0, p1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p2, v0}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/util/List;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-interface {p0, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_0
    move-exception p1

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 131
    .line 132
    .line 133
    throw p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ka6;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d(Ljava/lang/String;)La/zov0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ka6;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/zov0;

    .line 20
    .line 21
    return-object p0
.end method

.method public final e(Ljava/lang/String;)La/ppv0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ka6;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/ppv0;

    .line 20
    .line 21
    return-object p0
.end method

.method public final f(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ka6;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/util/List;

    .line 20
    .line 21
    return-object p0
.end method

.method public final g(JLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/rpv0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p1, p2, p3, v1}, La/rpv0;-><init>(JLjava/lang/String;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p0, p1, v1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final h(ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/e6n;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1, p1, p2}, La/e6n;-><init>(BILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p0, p1, p2, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i(JLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/rpv0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, p2, p3, v1}, La/rpv0;-><init>(JLjava/lang/String;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-static {p0, v1, p1, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(La/zov0;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zfv0;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {p0, p1, p2, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final k(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/e6n;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, La/e6n;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-static {p0, p1, p2, v0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
