.class public final La/tzg0;
.super La/kc5;
.source "SourceFile"


# instance fields
.field public final l:Landroid/os/Bundle;

.field public final m:La/rzg0;

.field public n:Ljava/lang/String;

.field public o:I


# direct methods
.method public constructor <init>(Landroid/os/Bundle;La/rzg0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 8
    .line 9
    iput-object p2, p0, La/tzg0;->m:La/rzg0;

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    iput-object p1, p0, La/tzg0;->n:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    move p0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    xor-int/2addr p0, v2

    .line 25
    return p0
.end method

.method public final D()B
    .locals 1

    .line 1
    iget-object v0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/b8k0;->G(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-byte p0, p0

    .line 10
    return p0
.end method

.method public final a(La/ugi0;)La/bld;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/tzg0;->n:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object p1, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p1, v0}, La/b8k0;->L(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/tzg0;

    .line 24
    .line 25
    iget-object p0, p0, La/tzg0;->m:La/rzg0;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, La/tzg0;-><init>(Landroid/os/Bundle;La/rzg0;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final b()La/qaj;
    .locals 0

    .line 1
    iget-object p0, p0, La/tzg0;->m:La/rzg0;

    .line 2
    .line 3
    iget-object p0, p0, La/rzg0;->a:La/qaj;

    .line 4
    .line 5
    return-object p0
.end method

.method public final f(La/ugi0;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/ugi0;->l()La/c3x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/aum0;->c:La/aum0;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, La/ugi0;->l()La/c3x;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, La/aum0;->d:La/aum0;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1}, La/ugi0;->d()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_1
    iget v2, p0, La/tzg0;->o:I

    .line 41
    .line 42
    if-ge v2, v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p1, v2}, La/ugi0;->e(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget v3, p0, La/tzg0;->o:I

    .line 49
    .line 50
    invoke-interface {p1, v3}, La/ugi0;->i(I)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    iget v2, p0, La/tzg0;->o:I

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    iput v2, p0, La/tzg0;->o:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iput-object v2, p0, La/tzg0;->n:Ljava/lang/String;

    .line 73
    .line 74
    iget p1, p0, La/tzg0;->o:I

    .line 75
    .line 76
    add-int/lit8 v0, p1, 0x1

    .line 77
    .line 78
    iput v0, p0, La/tzg0;->o:I

    .line 79
    .line 80
    return p1

    .line 81
    :cond_3
    const/4 p0, -0x1

    .line 82
    return p0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/b8k0;->G(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()J
    .locals 7

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 7
    .line 8
    const-wide/high16 v1, -0x8000000000000000L

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    cmp-long v1, v3, v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-wide v1, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    cmp-long p0, v5, v1

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return-wide v3
.end method

.method public final k(La/ugi0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1, p0}, La/b8k0;->G(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final p()S
    .locals 1

    .line 1
    iget-object v0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/b8k0;->G(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-short p0, p0

    .line 10
    return p0
.end method

.method public final q()F
    .locals 3

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    cmpg-float v1, v2, v1

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    cmpg-float p0, p0, v1

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    return v2
.end method

.method public final s()D
    .locals 7

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 7
    .line 8
    const-wide/16 v1, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    cmpg-double v1, v3, v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-wide v1, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    cmpg-double p0, v5, v1

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return-wide v3
.end method

.method public final u()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p0, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eq p0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0

    .line 28
    :cond_1
    :goto_0
    return v1
.end method

.method public final v()C
    .locals 3

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getChar(Ljava/lang/String;C)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const v2, 0xffff

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, v2}, Landroid/os/Bundle;->getChar(Ljava/lang/String;C)C

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eq p0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_0
    return v1
.end method

.method public final w(La/jiy;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/pzg0;->a:La/ugi0;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v0, La/lvb;->a:La/lvb;

    .line 18
    .line 19
    invoke-static {p0}, La/lvb;->a(La/rkj;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    sget-object v1, La/pzg0;->b:La/ugi0;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    sget-object v0, La/lwj;->b:La/lwj;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, La/lwj;->a(La/rkj;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    sget-object v1, La/pzg0;->c:La/ugi0;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    sget-object v0, La/lvj;->b:La/lvj;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, La/lvj;->a(La/rkj;)Ljava/io/Serializable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_2
    sget-object v1, La/pzg0;->d:La/ugi0;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-static {p0}, La/huw;->a(La/rkj;)Landroid/os/IBinder;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_3
    sget-object v1, La/pzg0;->i:La/uw3;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_d

    .line 78
    .line 79
    sget-object v1, La/pzg0;->j:La/uw3;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_4
    sget-object v1, La/pzg0;->k:La/uw3;

    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_c

    .line 96
    .line 97
    sget-object v1, La/pzg0;->l:La/uw3;

    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :cond_5
    sget-object v1, La/pzg0;->e:La/uw3;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    invoke-static {p0}, La/cp80;->a(La/rkj;)[Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, La/stn;->l:La/stn;

    .line 120
    .line 121
    invoke-interface {p1, v1}, La/jiy;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v3, La/sre0;->a:La/tre0;

    .line 133
    .line 134
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    array-length v3, v0

    .line 139
    invoke-static {v1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v0, v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_4

    .line 148
    :cond_6
    sget-object v1, La/pzg0;->f:La/uw3;

    .line 149
    .line 150
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-static {p0}, La/cp80;->a(La/rkj;)[Landroid/os/Parcelable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_4

    .line 161
    :cond_7
    sget-object v1, La/pzg0;->g:La/uw3;

    .line 162
    .line 163
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_b

    .line 168
    .line 169
    sget-object v1, La/pzg0;->h:La/uw3;

    .line 170
    .line 171
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_8
    sget-object v1, La/pzg0;->m:La/ugi0;

    .line 179
    .line 180
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_a

    .line 185
    .line 186
    sget-object v1, La/pzg0;->n:La/ugi0;

    .line 187
    .line 188
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_a

    .line 193
    .line 194
    sget-object v1, La/pzg0;->o:La/ugi0;

    .line 195
    .line 196
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_9
    move-object v0, v2

    .line 204
    goto :goto_4

    .line 205
    :cond_a
    :goto_0
    sget-object v0, La/knk0;->a:La/knk0;

    .line 206
    .line 207
    invoke-virtual {v0, p0}, La/knk0;->a(La/rkj;)Landroid/util/SparseArray;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    goto :goto_4

    .line 212
    :cond_b
    :goto_1
    sget-object v0, La/dp80;->a:La/dp80;

    .line 213
    .line 214
    invoke-virtual {v0, p0}, La/dp80;->a(La/rkj;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_4

    .line 219
    :cond_c
    :goto_2
    sget-object v0, La/hvb;->a:La/hvb;

    .line 220
    .line 221
    invoke-virtual {v0, p0}, La/hvb;->a(La/rkj;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    goto :goto_4

    .line 226
    :cond_d
    :goto_3
    invoke-static {p0}, La/cvb;->a(La/rkj;)[Ljava/lang/CharSequence;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :goto_4
    if-eqz v0, :cond_e

    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_e
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    sget-object v1, La/ozg0;->a:La/uw3;

    .line 238
    .line 239
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    iget-object v3, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 244
    .line 245
    if-eqz v1, :cond_10

    .line 246
    .line 247
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-eqz p1, :cond_f

    .line 257
    .line 258
    return-object p1

    .line 259
    :cond_f
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v2

    .line 263
    :cond_10
    sget-object v1, La/ozg0;->b:La/uw3;

    .line 264
    .line 265
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_12

    .line 270
    .line 271
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    if-eqz p1, :cond_11

    .line 281
    .line 282
    return-object p1

    .line 283
    :cond_11
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v2

    .line 287
    :cond_12
    sget-object v1, La/ozg0;->c:La/uw3;

    .line 288
    .line 289
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_14

    .line 294
    .line 295
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    if-eqz p1, :cond_13

    .line 305
    .line 306
    invoke-static {p1}, La/tx3;->i0([Z)Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :cond_13
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v2

    .line 315
    :cond_14
    sget-object v1, La/ozg0;->d:La/uw3;

    .line 316
    .line 317
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_16

    .line 322
    .line 323
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    if-eqz p1, :cond_15

    .line 333
    .line 334
    invoke-static {p1}, La/tx3;->f0([J)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0

    .line 339
    :cond_15
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v2

    .line 343
    :cond_16
    sget-object v1, La/ozg0;->e:La/uw3;

    .line 344
    .line 345
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_18

    .line 350
    .line 351
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    if-eqz p1, :cond_17

    .line 361
    .line 362
    invoke-static {p1}, La/tx3;->d0([F)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :cond_17
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    throw v2

    .line 371
    :cond_18
    sget-object v1, La/ozg0;->f:La/uw3;

    .line 372
    .line 373
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-eqz v1, :cond_1a

    .line 378
    .line 379
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getDoubleArray(Ljava/lang/String;)[D

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    if-eqz p1, :cond_19

    .line 389
    .line 390
    invoke-static {p1}, La/tx3;->c0([D)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    return-object p0

    .line 395
    :cond_19
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v2

    .line 399
    :cond_1a
    sget-object v1, La/ozg0;->g:La/uw3;

    .line 400
    .line 401
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_1c

    .line 406
    .line 407
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getCharArray(Ljava/lang/String;)[C

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    if-eqz p1, :cond_1b

    .line 417
    .line 418
    invoke-static {p1}, La/tx3;->b0([C)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    return-object p0

    .line 423
    :cond_1b
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v2

    .line 427
    :cond_1c
    sget-object v1, La/ozg0;->h:La/vvb0;

    .line 428
    .line 429
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_1e

    .line 434
    .line 435
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    if-eqz p1, :cond_1d

    .line 445
    .line 446
    return-object p1

    .line 447
    :cond_1d
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v2

    .line 451
    :cond_1e
    sget-object v1, La/ozg0;->i:La/vvb0;

    .line 452
    .line 453
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-eqz v1, :cond_20

    .line 458
    .line 459
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getCharArray(Ljava/lang/String;)[C

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    if-eqz p1, :cond_1f

    .line 469
    .line 470
    return-object p1

    .line 471
    :cond_1f
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v2

    .line 475
    :cond_20
    sget-object v1, La/ozg0;->j:La/vvb0;

    .line 476
    .line 477
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    if-eqz v1, :cond_22

    .line 482
    .line 483
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getDoubleArray(Ljava/lang/String;)[D

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    if-eqz p1, :cond_21

    .line 493
    .line 494
    return-object p1

    .line 495
    :cond_21
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v2

    .line 499
    :cond_22
    sget-object v1, La/ozg0;->k:La/vvb0;

    .line 500
    .line 501
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_24

    .line 506
    .line 507
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    if-eqz p1, :cond_23

    .line 517
    .line 518
    return-object p1

    .line 519
    :cond_23
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    throw v2

    .line 523
    :cond_24
    sget-object v1, La/ozg0;->l:La/vvb0;

    .line 524
    .line 525
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_26

    .line 530
    .line 531
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 532
    .line 533
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    if-eqz p1, :cond_25

    .line 541
    .line 542
    return-object p1

    .line 543
    :cond_25
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    throw v2

    .line 547
    :cond_26
    sget-object v1, La/ozg0;->m:La/vvb0;

    .line 548
    .line 549
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    if-eqz v1, :cond_28

    .line 554
    .line 555
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    if-eqz p1, :cond_27

    .line 565
    .line 566
    return-object p1

    .line 567
    :cond_27
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    throw v2

    .line 571
    :cond_28
    sget-object v1, La/ozg0;->n:La/uw3;

    .line 572
    .line 573
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_2a

    .line 578
    .line 579
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 580
    .line 581
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    if-eqz p1, :cond_29

    .line 589
    .line 590
    return-object p1

    .line 591
    :cond_29
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    throw v2

    .line 595
    :cond_2a
    invoke-interface {p1, p0}, La/jiy;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    return-object p0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {v0}, La/g8x;->O(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method
