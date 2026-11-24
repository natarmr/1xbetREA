.class public final La/j1q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m1q0;


# direct methods
.method public constructor <init>(La/m1q0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j1q0;->a:La/m1q0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/ygp;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final b()La/rhi0;
    .locals 1

    .line 1
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/m1q0;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, La/m1q0;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, La/m1q0;->g()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object p0, La/rhi0;->a:La/rhi0;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    sget-object p0, La/rhi0;->b:La/rhi0;

    .line 26
    .line 27
    return-object p0
.end method

.method public final c(La/cre;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/m1q0;->e:La/p7m0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget v0, p1, La/cre;->a:I

    .line 13
    .line 14
    iget-object p0, p0, La/m1q0;->a:La/q7d0;

    .line 15
    .line 16
    const-string v1, "FAKE_ID"

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, La/q7d0;->e(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, La/cre;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v1, "FAKE_CODE"

    .line 27
    .line 28
    invoke-virtual {p0, v1, v0}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, La/cre;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v0, "FAKE_NAME"

    .line 37
    .line 38
    invoke-virtual {p0, v0, p1}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final d(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    iget-object v1, v0, La/m1q0;->a:La/q7d0;

    .line 6
    .line 7
    const-string v2, "LUXURY_TEST_SERVER"

    .line 8
    .line 9
    move/from16 v6, p1

    .line 10
    .line 11
    invoke-virtual {v1, v2, v6}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, La/ghp;

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    const v23, 0xffffb

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    invoke-static/range {v3 .. v23}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    move/from16 v6, p1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public final e(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    iget-object v1, v0, La/m1q0;->a:La/q7d0;

    .line 6
    .line 7
    const-string v2, "SIP_CRM_TEST"

    .line 8
    .line 9
    move/from16 v12, p1

    .line 10
    .line 11
    invoke-virtual {v1, v2, v12}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, La/ghp;

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    const v23, 0xffeff

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    invoke-static/range {v3 .. v23}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    move/from16 v12, p1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public final f(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    iget-object v1, v0, La/m1q0;->a:La/q7d0;

    .line 6
    .line 7
    const-string v2, "SIP_CRM_V2_TEST"

    .line 8
    .line 9
    move/from16 v13, p1

    .line 10
    .line 11
    invoke-virtual {v1, v2, v13}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, La/ghp;

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    const v23, 0xffdff

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    invoke-static/range {v3 .. v23}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    move/from16 v13, p1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public final g(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 6
    .line 7
    iget-object v2, v0, La/m1q0;->a:La/q7d0;

    .line 8
    .line 9
    const-string v3, "TEST_REMOTE_CONFIG_ENABLED"

    .line 10
    .line 11
    invoke-virtual {v2, v3, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    move-object v1, v3

    .line 21
    check-cast v1, La/ghp;

    .line 22
    .line 23
    const/16 v20, 0x0

    .line 24
    .line 25
    const v21, 0xdffff

    .line 26
    .line 27
    .line 28
    move-object v4, v2

    .line 29
    const/4 v2, 0x0

    .line 30
    move-object v5, v3

    .line 31
    const/4 v3, 0x0

    .line 32
    move-object v6, v4

    .line 33
    const/4 v4, 0x0

    .line 34
    move-object v7, v5

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v8, v6

    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v9, v7

    .line 39
    const/4 v7, 0x0

    .line 40
    move-object v10, v8

    .line 41
    const/4 v8, 0x0

    .line 42
    move-object v11, v9

    .line 43
    const/4 v9, 0x0

    .line 44
    move-object v12, v10

    .line 45
    const/4 v10, 0x0

    .line 46
    move-object v13, v11

    .line 47
    const/4 v11, 0x0

    .line 48
    move-object v14, v12

    .line 49
    const/4 v12, 0x0

    .line 50
    move-object v15, v13

    .line 51
    const/4 v13, 0x0

    .line 52
    move-object/from16 v16, v14

    .line 53
    .line 54
    const/4 v14, 0x0

    .line 55
    move-object/from16 v17, v15

    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    move-object/from16 v18, v16

    .line 59
    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    move-object/from16 v19, v17

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    move-object/from16 v22, v19

    .line 67
    .line 68
    const/16 v19, 0x0

    .line 69
    .line 70
    move-object/from16 p0, v0

    .line 71
    .line 72
    move-object/from16 v0, v18

    .line 73
    .line 74
    move-object/from16 v23, v22

    .line 75
    .line 76
    move/from16 v18, p1

    .line 77
    .line 78
    invoke-static/range {v1 .. v21}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object/from16 v15, v23

    .line 83
    .line 84
    invoke-virtual {v0, v15, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    move-object/from16 v2, p0

    .line 97
    .line 98
    iget-object v2, v2, La/m1q0;->a:La/q7d0;

    .line 99
    .line 100
    const-string v3, "TEST_REMOTE_CONFIG_LAST_ACTION_TIME"

    .line 101
    .line 102
    invoke-virtual {v2, v3, v0, v1}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 103
    .line 104
    .line 105
    :cond_0
    return-void

    .line 106
    :cond_1
    move/from16 v1, p1

    .line 107
    .line 108
    move-object v2, v0

    .line 109
    move-object/from16 v0, p0

    .line 110
    .line 111
    goto :goto_0
.end method

.method public final h(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    iget-object v1, v0, La/m1q0;->a:La/q7d0;

    .line 6
    .line 7
    const-string v2, "TEST_SERVER"

    .line 8
    .line 9
    move/from16 v4, p1

    .line 10
    .line 11
    invoke-virtual {v1, v2, v4}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, La/ghp;

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    const v23, 0xffffe

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    invoke-static/range {v3 .. v23}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    move/from16 v4, p1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public final i(Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    iget-object v1, v0, La/m1q0;->a:La/q7d0;

    .line 6
    .line 7
    const-string v2, "SECOND_TEST_SERVER"

    .line 8
    .line 9
    move/from16 v5, p1

    .line 10
    .line 11
    invoke-virtual {v1, v2, v5}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/m1q0;->b:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, La/ghp;

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    const v23, 0xffffd

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    invoke-static/range {v3 .. v23}, La/ghp;->a(La/ghp;ZZZZZZZZZZZZZZZZZZZI)La/ghp;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    move/from16 v5, p1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public final j()La/cre;
    .locals 0

    .line 1
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 2
    .line 3
    iget-object p0, p0, La/m1q0;->e:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/cre;

    .line 10
    .line 11
    return-object p0
.end method
