.class public final La/hac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/guo;
.implements La/huo;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:B

.field public b:J

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput-byte v0, p0, La/hac;->a:B

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 38
    iput-wide v0, p0, La/hac;->b:J

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;B)V
    .locals 0

    .line 32
    iput-byte p4, p0, La/hac;->a:B

    iput-wide p1, p0, La/hac;->b:J

    iput-object p3, p0, La/hac;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/guo;J)V
    .locals 2

    const/4 v0, 0x3

    iput-byte v0, p0, La/hac;->a:B

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/hac;->c:Ljava/lang/Object;

    .line 35
    invoke-interface {p1}, La/guo;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, La/x0x;->A(Z)V

    .line 36
    iput-wide p2, p0, La/hac;->b:J

    return-void
.end method

.method public constructor <init>(La/ma80;)V
    .locals 3

    const/4 v0, 0x5

    iput-byte v0, p0, La/hac;->a:B

    const-wide/16 v0, 0x0

    const/4 v2, 0x5

    .line 30
    invoke-direct {p0, p1, v0, v1, v2}, La/hac;-><init>(Ljava/lang/Object;JB)V

    return-void
.end method

.method public synthetic constructor <init>(La/wvw0;J)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput-byte v0, p0, La/hac;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/hac;->c:Ljava/lang/Object;

    .line 9
    .line 10
    const-string p1, "health_monitor"

    .line 11
    .line 12
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long p1, p2, v0

    .line 18
    .line 19
    if-lez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    invoke-static {p1}, La/s0x;->C(Z)V

    .line 25
    .line 26
    .line 27
    iput-wide p2, p0, La/hac;->b:J

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 31
    iput-byte p4, p0, La/hac;->a:B

    iput-object p1, p0, La/hac;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/hac;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static u(La/hac;JF)J
    .locals 5

    .line 1
    iget-wide v0, p0, La/hac;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, La/ne60;->f(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, La/hac;->b:J

    .line 8
    .line 9
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/ma80;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, La/ne60;->d(J)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, p1, p2}, La/hac;->w(J)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    const/4 p2, 0x0

    .line 29
    cmpl-float p2, p1, p2

    .line 30
    .line 31
    if-lez p2, :cond_4

    .line 32
    .line 33
    cmpl-float p1, p1, p3

    .line 34
    .line 35
    if-ltz p1, :cond_4

    .line 36
    .line 37
    iget-object p1, p0, La/hac;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/ma80;

    .line 40
    .line 41
    iget-wide v0, p0, La/hac;->b:J

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    invoke-static {v0, v1}, La/ne60;->d(J)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1, v0, v1}, La/ne60;->b(FJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    invoke-static {p3, p1, p2}, La/ne60;->g(FJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    iget-wide v0, p0, La/hac;->b:J

    .line 58
    .line 59
    invoke-static {v0, v1, p1, p2}, La/ne60;->e(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    return-wide p0

    .line 64
    :cond_1
    invoke-virtual {p0, v0, v1}, La/hac;->w(J)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-wide v0, p0, La/hac;->b:J

    .line 69
    .line 70
    invoke-virtual {p0, v0, v1}, La/hac;->w(J)F

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    mul-float/2addr p2, p3

    .line 79
    sub-float/2addr p1, p2

    .line 80
    iget-wide p2, p0, La/hac;->b:J

    .line 81
    .line 82
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, La/ma80;

    .line 85
    .line 86
    sget-object v1, La/ma80;->b:La/ma80;

    .line 87
    .line 88
    const/16 v2, 0x20

    .line 89
    .line 90
    const-wide v3, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    if-ne v0, v1, :cond_2

    .line 96
    .line 97
    and-long/2addr p2, v3

    .line 98
    :goto_1
    long-to-int p2, p2

    .line 99
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    shr-long/2addr p2, v2

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, La/ma80;

    .line 109
    .line 110
    if-ne p0, v1, :cond_3

    .line 111
    .line 112
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long p0, p0

    .line 117
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    int-to-long p2, p2

    .line 122
    shl-long/2addr p0, v2

    .line 123
    and-long/2addr p2, v3

    .line 124
    or-long/2addr p0, p2

    .line 125
    return-wide p0

    .line 126
    :cond_3
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    int-to-long p2, p0

    .line 131
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    int-to-long p0, p0

    .line 136
    shl-long/2addr p2, v2

    .line 137
    and-long/2addr p0, v3

    .line 138
    or-long/2addr p0, p2

    .line 139
    return-wide p0

    .line 140
    :cond_4
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    return-wide p0
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/wvw0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/p4;->m1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/kxw0;

    .line 11
    .line 12
    iget-object v0, v0, La/kxw0;->k:La/lwf;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v2, "health_monitor:count"

    .line 30
    .line 31
    invoke-interface {p0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    const-string v2, "health_monitor:value"

    .line 35
    .line 36
    invoke-interface {p0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    const-string v2, "health_monitor:start"

    .line 40
    .line 41
    invoke-interface {p0, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public a(IZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-interface {p0, p1, p2}, La/guo;->a(IZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public b([BIIZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3, p4}, La/guo;->b([BIIZ)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(La/fvh0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/huo;

    .line 4
    .line 5
    new-instance v1, La/j5m0;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p1}, La/j5m0;-><init>(La/hac;La/fvh0;La/fvh0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, La/huo;->f(La/fvh0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g()V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0}, La/guo;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getLength()J
    .locals 4

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/guo;

    .line 4
    .line 5
    invoke-interface {v0}, La/guo;->getLength()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, La/hac;->b:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public getPosition()J
    .locals 4

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/guo;

    .line 4
    .line 5
    invoke-interface {v0}, La/guo;->getPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, La/hac;->b:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public h([BIIZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-interface {p0, p1, p2, p3, p4}, La/guo;->h([BIIZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public i()J
    .locals 4

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/guo;

    .line 4
    .line 5
    invoke-interface {v0}, La/guo;->i()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, La/hac;->b:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public j(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/guo;->j(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/guo;->k(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public l([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, La/guo;->l([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public m(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/guo;->m(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n([BII)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, La/guo;->n([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/huo;

    .line 4
    .line 5
    invoke-interface {p0}, La/huo;->o()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/hac;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/hac;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/ykv0;

    .line 9
    .line 10
    iget-wide v0, p0, La/hac;->b:J

    .line 11
    .line 12
    iget-object p0, p1, La/ykv0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/xex;

    .line 23
    .line 24
    iget-wide v1, p0, La/hac;->b:J

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v3, "AdvertisingIdClient"

    .line 38
    .line 39
    const-string v4, "getting error as "

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    instance-of p0, p1, La/qa3;

    .line 49
    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    check-cast p1, La/qa3;

    .line 53
    .line 54
    invoke-virtual {p1}, La/qa3;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget-object p0, p0, Lcom/google/android/gms/common/api/Status;->d:Lcom/google/android/gms/common/ConnectionResult;

    .line 59
    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    iget p0, p0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 63
    .line 64
    const/16 p1, 0x18

    .line 65
    .line 66
    if-ne p0, p1, :cond_0

    .line 67
    .line 68
    iget-object p0, v0, La/xex;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    .line 72
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public p(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hac;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, La/hac;->p(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-wide v0, p0, La/hac;->b:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p1

    .line 21
    not-long v2, v2

    .line 22
    and-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, La/hac;->b:J

    .line 24
    .line 25
    return-void
.end method

.method public q(II)La/ncs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/huo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, La/huo;->q(II)La/ncs0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public r(I)I
    .locals 6

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/hac;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v4, p0, La/hac;->b:J

    .line 12
    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    shl-long p0, v2, p1

    .line 21
    .line 22
    sub-long/2addr p0, v2

    .line 23
    and-long/2addr p0, v4

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    if-ge p1, v1, :cond_2

    .line 30
    .line 31
    iget-wide v0, p0, La/hac;->b:J

    .line 32
    .line 33
    shl-long p0, v2, p1

    .line 34
    .line 35
    sub-long/2addr p0, v2

    .line 36
    and-long/2addr p0, v0

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    sub-int/2addr p1, v1

    .line 43
    invoke-virtual {v0, p1}, La/hac;->r(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-wide v0, p0, La/hac;->b:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, p1

    .line 54
    return p0
.end method

.method public read([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, La/bbj;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public readFully([BII)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/guo;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, La/guo;->readFully([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/hac;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, La/hac;

    .line 8
    .line 9
    invoke-direct {v0}, La/hac;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public t(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/hac;->s()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/hac;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, La/hac;->t(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-wide v0, p0, La/hac;->b:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    shl-long p0, v2, p1

    .line 23
    .line 24
    and-long/2addr p0, v0

    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    cmp-long p0, p0, v0

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, La/hac;->a:B

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
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/hac;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, La/hac;->b:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/hac;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, La/hac;

    .line 32
    .line 33
    invoke-virtual {v1}, La/hac;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, La/hac;->b:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v(IZ)V
    .locals 9

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/hac;->s()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/hac;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1, p2}, La/hac;->v(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, La/hac;->b:J

    .line 18
    .line 19
    const-wide/high16 v2, -0x8000000000000000L

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    shl-long v7, v5, p1

    .line 36
    .line 37
    sub-long/2addr v7, v5

    .line 38
    and-long v5, v0, v7

    .line 39
    .line 40
    not-long v7, v7

    .line 41
    and-long/2addr v0, v7

    .line 42
    shl-long/2addr v0, v4

    .line 43
    or-long/2addr v0, v5

    .line 44
    iput-wide v0, p0, La/hac;->b:J

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/hac;->z(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, La/hac;->p(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, La/hac;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/hac;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_2
    invoke-virtual {p0}, La/hac;->s()V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, La/hac;

    .line 71
    .line 72
    invoke-virtual {p0, v3, v2}, La/hac;->v(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public w(J)F
    .locals 2

    .line 1
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ma80;

    .line 4
    .line 5
    sget-object v0, La/ma80;->b:La/ma80;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x20

    .line 10
    .line 11
    shr-long p0, p1, p0

    .line 12
    .line 13
    :goto_0
    long-to-int p0, p0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-wide v0, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long p0, p1, v0

    .line 25
    .line 26
    goto :goto_0
.end method

.method public x(I)Z
    .locals 10

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/hac;->s()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/hac;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, La/hac;->x(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    shl-long v2, v0, p1

    .line 21
    .line 22
    iget-wide v4, p0, La/hac;->b:J

    .line 23
    .line 24
    and-long v6, v4, v2

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, v7

    .line 37
    :goto_0
    not-long v8, v2

    .line 38
    and-long/2addr v4, v8

    .line 39
    iput-wide v4, p0, La/hac;->b:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    and-long v0, v4, v2

    .line 43
    .line 44
    not-long v2, v2

    .line 45
    and-long/2addr v2, v4

    .line 46
    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    or-long/2addr v0, v2

    .line 51
    iput-wide v0, p0, La/hac;->b:J

    .line 52
    .line 53
    iget-object v0, p0, La/hac;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/hac;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v7}, La/hac;->t(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/hac;->z(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/hac;

    .line 73
    .line 74
    invoke-virtual {p0, v7}, La/hac;->x(I)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    return p1
.end method

.method public y()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, La/hac;->b:J

    .line 4
    .line 5
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hac;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/hac;->y()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public z(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/hac;->s()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/hac;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/hac;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, La/hac;->z(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, La/hac;->b:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long/2addr v2, p1

    .line 22
    or-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, La/hac;->b:J

    .line 24
    .line 25
    return-void
.end method
