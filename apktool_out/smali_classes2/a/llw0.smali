.class public final La/llw0;
.super La/gft0;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(Lsun/misc/Unsafe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/llw0;->c:B

    const/4 p2, 0x4

    invoke-direct {p0, p1, p2}, La/gft0;-><init>(Lsun/misc/Unsafe;B)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;J)D
    .locals 1

    .line 1
    iget-byte v0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0

    .line 17
    :pswitch_0
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    return-wide p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;JD)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p4, p5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 7
    .line 8
    .line 9
    move-result-wide p4

    .line 10
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 11
    .line 12
    invoke-virtual/range {p0 .. p5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p4, p5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iget-object v0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    move-wide v2, p2

    .line 24
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;JF)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p4

    .line 10
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Ljava/lang/Object;JZ)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-boolean p0, La/mlw0;->e:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p2, p3, p4}, La/mlw0;->d(Ljava/lang/Object;JZ)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p1, p2, p3, p4}, La/mlw0;->g(Ljava/lang/Object;JZ)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :pswitch_0
    sget-boolean p0, La/mlw0;->e:Z

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p1, p2, p3, p4}, La/mlw0;->d(Ljava/lang/Object;JZ)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1, p2, p3, p4}, La/mlw0;->g(Ljava/lang/Object;JZ)V

    .line 27
    .line 28
    .line 29
    :goto_1
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/lang/Object;J)F
    .locals 1

    .line 1
    iget-byte v0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object p0, p0, La/gft0;->b:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Ljava/lang/Object;J)Z
    .locals 7

    .line 1
    iget-byte p0, p0, La/llw0;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-boolean p0, La/mlw0;->e:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x3

    .line 11
    const-wide/16 v3, 0x3

    .line 12
    .line 13
    const-wide/16 v5, -0x4

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    and-long/2addr v5, p2

    .line 18
    invoke-static {p1, v5, v6}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    not-long p1, p2

    .line 23
    and-long/2addr p1, v3

    .line 24
    shl-long/2addr p1, v2

    .line 25
    long-to-int p1, p1

    .line 26
    ushr-int/2addr p0, p1

    .line 27
    int-to-byte p0, p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    :goto_0
    move v0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    and-long/2addr v5, p2

    .line 33
    invoke-static {p1, v5, v6}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    and-long p1, p2, v3

    .line 38
    .line 39
    shl-long/2addr p1, v2

    .line 40
    long-to-int p1, p1

    .line 41
    ushr-int/2addr p0, p1

    .line 42
    int-to-byte p0, p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    return v0

    .line 47
    :pswitch_0
    sget-boolean p0, La/mlw0;->e:Z

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    const/4 v1, 0x1

    .line 51
    const/4 v2, 0x3

    .line 52
    const-wide/16 v3, 0x3

    .line 53
    .line 54
    const-wide/16 v5, -0x4

    .line 55
    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    and-long/2addr v5, p2

    .line 59
    invoke-static {p1, v5, v6}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    not-long p1, p2

    .line 64
    and-long/2addr p1, v3

    .line 65
    shl-long/2addr p1, v2

    .line 66
    long-to-int p1, p1

    .line 67
    ushr-int/2addr p0, p1

    .line 68
    int-to-byte p0, p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    :goto_2
    move v0, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    and-long/2addr v5, p2

    .line 74
    invoke-static {p1, v5, v6}, La/mlw0;->h(Ljava/lang/Object;J)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    and-long p1, p2, v3

    .line 79
    .line 80
    shl-long/2addr p1, v2

    .line 81
    long-to-int p1, p1

    .line 82
    ushr-int/2addr p0, p1

    .line 83
    int-to-byte p0, p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    :goto_3
    return v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
