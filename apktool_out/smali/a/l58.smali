.class public La/l58;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field public H1:La/t58;

.field public final I1:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/l58;->I1:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 8
    .line 9
    iget p0, p0, La/t58;->r:I

    .line 10
    .line 11
    invoke-static {p0}, La/hmw0;->Z(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final B0()Z
    .locals 9

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x1c

    .line 5
    .line 6
    if-lt v0, v2, :cond_9

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_6

    .line 14
    .line 15
    iget-object v5, p0, La/l58;->H1:La/t58;

    .line 16
    .line 17
    iget-object v5, v5, La/t58;->e:La/q58;

    .line 18
    .line 19
    if-eqz v5, :cond_6

    .line 20
    .line 21
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_0
    if-nez v5, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v6, 0x7f030002

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    array-length v6, v0

    .line 43
    move v7, v4

    .line 44
    :goto_0
    if-ge v7, v6, :cond_3

    .line 45
    .line 46
    aget-object v8, v0, v7

    .line 47
    .line 48
    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const v5, 0x7f030001

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    array-length v5, v3

    .line 75
    move v6, v4

    .line 76
    :goto_2
    if-ge v6, v5, :cond_6

    .line 77
    .line 78
    aget-object v7, v3, v6

    .line 79
    .line 80
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_5

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    if-ne v0, v2, :cond_8

    .line 93
    .line 94
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-eqz p0, :cond_7

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-eqz v2, :cond_7

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string v2, "android.hardware.fingerprint"

    .line 113
    .line 114
    invoke-virtual {p0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_7

    .line 119
    .line 120
    move p0, v1

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move p0, v4

    .line 123
    :goto_4
    const-string v2, "has_fingerprint"

    .line 124
    .line 125
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_8

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_8
    return v4

    .line 133
    :cond_9
    :goto_5
    return v1
.end method

.method public final C0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-class v2, Landroid/app/KeyguardManager;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/app/KeyguardManager;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    const v0, 0x7f130969

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0xc

    .line 28
    .line 29
    invoke-virtual {p0, v1, v0}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v2, p0, La/l58;->H1:La/t58;

    .line 34
    .line 35
    iget-object v2, v2, La/t58;->d:La/yzn0;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-object v2, v2, La/yzn0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ljava/lang/CharSequence;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v2, v1

    .line 45
    :goto_1
    invoke-virtual {v0, v2, v1}, Landroid/app/KeyguardManager;->createConfirmDeviceCredentialIntent(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    const v0, 0x7f130968

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/16 v1, 0xe

    .line 59
    .line 60
    invoke-virtual {p0, v1, v0}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    iput-boolean v2, v1, La/t58;->n:Z

    .line 68
    .line 69
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0}, La/l58;->z0()V

    .line 76
    .line 77
    .line 78
    :cond_4
    const/high16 v1, 0x8080000

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final D0(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/l58;->E0(ILjava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/l58;->y0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final E0(ILjava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 2
    .line 3
    iget-boolean v1, v0, La/t58;->n:Z

    .line 4
    .line 5
    const-string v2, "BiometricFragment"

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string p0, "Error not sent to client. User is confirming their device credential."

    .line 10
    .line 11
    invoke-static {v2, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean v1, v0, La/t58;->m:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string p0, "Error not sent to client. Client is not awaiting a result."

    .line 20
    .line 21
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, La/t58;->m:Z

    .line 27
    .line 28
    iget-object v0, v0, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    new-instance v0, La/xz3;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1}, La/xz3;-><init>(B)V

    .line 37
    .line 38
    .line 39
    :goto_0
    new-instance v1, La/e58;

    .line 40
    .line 41
    invoke-direct {v1, p0, p1, p2}, La/e58;-><init>(La/l58;ILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final F0(La/p58;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 2
    .line 3
    iget-boolean v1, v0, La/t58;->m:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string p1, "BiometricFragment"

    .line 8
    .line 9
    const-string v0, "Success not sent to client. Client is not awaiting a result."

    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, v0, La/t58;->m:Z

    .line 17
    .line 18
    iget-object v0, v0, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, La/xz3;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, La/xz3;-><init>(B)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v1, La/fy2;

    .line 30
    .line 31
    const/16 v2, 0xc

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, v2}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {p0}, La/l58;->y0()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final G0(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const p1, 0x7f130694

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {v0, v1}, La/t58;->w(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 18
    .line 19
    iget-object v0, p0, La/t58;->C:La/hy40;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, La/hy40;

    .line 24
    .line 25
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/t58;->C:La/hy40;

    .line 29
    .line 30
    :cond_1
    invoke-static {v0, p1}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final H0()V
    .locals 13

    .line 1
    const-string v0, "BiometricFragment"

    .line 2
    .line 3
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 4
    .line 5
    iget-boolean v1, v1, La/t58;->l:Z

    .line 6
    .line 7
    if-nez v1, :cond_2b

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string p0, "Not showing biometric prompt. Context is null."

    .line 16
    .line 17
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v1, La/t58;->l:Z

    .line 25
    .line 26
    iput-boolean v2, v1, La/t58;->m:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/16 v3, 0x1d

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v4, "android.hardware.type.watch"

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    if-ne v1, v3, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 55
    .line 56
    iget v1, v1, La/t58;->r:I

    .line 57
    .line 58
    and-int/lit16 v4, v1, 0xff

    .line 59
    .line 60
    const/16 v5, 0xff

    .line 61
    .line 62
    if-ne v4, v5, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, La/hmw0;->Z(I)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 71
    .line 72
    iput-boolean v2, v0, La/t58;->q:Z

    .line 73
    .line 74
    :goto_0
    invoke-virtual {p0}, La/l58;->C0()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    :goto_1
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v4, 0x3

    .line 83
    const/4 v5, 0x2

    .line 84
    const/16 v6, 0x23

    .line 85
    .line 86
    const/16 v7, 0x1e

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    if-eqz v1, :cond_16

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, La/geq;->b(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-static {v3}, La/geq;->d(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    invoke-static {v1}, La/geq;->b(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    invoke-static {v3}, La/geq;->c(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_4

    .line 123
    .line 124
    move v3, v9

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const/16 v3, 0xb

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    const/16 v3, 0xc

    .line 130
    .line 131
    :goto_2
    if-eqz v3, :cond_6

    .line 132
    .line 133
    invoke-static {v3, v1}, La/fxb;->C(ILandroid/content/Context;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p0, v3, v0}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_f

    .line 141
    .line 142
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_2b

    .line 147
    .line 148
    iget-object v3, p0, La/l58;->H1:La/t58;

    .line 149
    .line 150
    iput-boolean v2, v3, La/t58;->y:Z

    .line 151
    .line 152
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1}, La/gkb;->X(Landroid/content/Context;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_7

    .line 159
    .line 160
    iget-object v3, p0, La/l58;->I1:Landroid/os/Handler;

    .line 161
    .line 162
    new-instance v10, La/e58;

    .line 163
    .line 164
    invoke-direct {v10, p0, v5}, La/e58;-><init>(La/l58;B)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v11, 0x1f4

    .line 168
    .line 169
    invoke-virtual {v3, v10, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 170
    .line 171
    .line 172
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 173
    .line 174
    const-string v5, "host_activity"

    .line 175
    .line 176
    invoke-virtual {v3, v5, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    new-instance v5, La/zdq;

    .line 181
    .line 182
    invoke-direct {v5}, La/zdq;-><init>()V

    .line 183
    .line 184
    .line 185
    new-instance v10, Landroid/os/Bundle;

    .line 186
    .line 187
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v11, "host_activity"

    .line 191
    .line 192
    invoke-virtual {v10, v11, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v10}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    const-string v10, "androidx.biometric.internal.FingerprintDialogFragment"

    .line 203
    .line 204
    invoke-virtual {v5, v3, v10}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_7
    iget-object v3, p0, La/l58;->H1:La/t58;

    .line 208
    .line 209
    iput-byte v9, v3, La/t58;->k:B

    .line 210
    .line 211
    iget-object v3, v3, La/t58;->e:La/q58;

    .line 212
    .line 213
    const-string v5, "CryptoObjectUtils"

    .line 214
    .line 215
    if-nez v3, :cond_8

    .line 216
    .line 217
    goto/16 :goto_4

    .line 218
    .line 219
    :cond_8
    iget-object v10, v3, La/q58;->c:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v10, Ljavax/crypto/Cipher;

    .line 222
    .line 223
    if-eqz v10, :cond_9

    .line 224
    .line 225
    new-instance v8, La/cu;

    .line 226
    .line 227
    invoke-direct {v8, v10}, La/cu;-><init>(Ljavax/crypto/Cipher;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_9
    iget-object v10, v3, La/q58;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v10, Ljava/security/Signature;

    .line 234
    .line 235
    if-eqz v10, :cond_a

    .line 236
    .line 237
    new-instance v8, La/cu;

    .line 238
    .line 239
    invoke-direct {v8, v10}, La/cu;-><init>(Ljava/security/Signature;)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_a
    iget-object v10, v3, La/q58;->d:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v10, Ljavax/crypto/Mac;

    .line 246
    .line 247
    if-eqz v10, :cond_b

    .line 248
    .line 249
    new-instance v8, La/cu;

    .line 250
    .line 251
    invoke-direct {v8, v10}, La/cu;-><init>(Ljavax/crypto/Mac;)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_b
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 256
    .line 257
    if-lt v10, v7, :cond_c

    .line 258
    .line 259
    iget-object v7, v3, La/q58;->f:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v7, Landroid/security/identity/IdentityCredential;

    .line 262
    .line 263
    if-eqz v7, :cond_c

    .line 264
    .line 265
    const-string v3, "Identity credential is not supported by FingerprintManager."

    .line 266
    .line 267
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_c
    const/16 v7, 0x21

    .line 272
    .line 273
    if-lt v10, v7, :cond_d

    .line 274
    .line 275
    iget-object v7, v3, La/q58;->g:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v7, Landroid/security/identity/PresentationSession;

    .line 278
    .line 279
    if-eqz v7, :cond_d

    .line 280
    .line 281
    const-string v3, "Presentation session is not supported by FingerprintManager."

    .line 282
    .line 283
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_d
    const/16 v7, 0x24

    .line 288
    .line 289
    if-lt v10, v7, :cond_f

    .line 290
    .line 291
    if-ge v10, v7, :cond_e

    .line 292
    .line 293
    const v7, 0x186a0

    .line 294
    .line 295
    .line 296
    mul-int/2addr v7, v10

    .line 297
    goto :goto_3

    .line 298
    :cond_e
    invoke-static {}, La/ob5;->a()I

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    :goto_3
    const v11, 0x36ee81

    .line 303
    .line 304
    .line 305
    if-lt v7, v11, :cond_f

    .line 306
    .line 307
    iget-object v3, v3, La/q58;->e:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v3, Ljavax/crypto/KeyAgreement;

    .line 310
    .line 311
    if-eqz v3, :cond_f

    .line 312
    .line 313
    const-string v3, "Key agreement is not supported by FingerprintManager."

    .line 314
    .line 315
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_f
    if-lt v10, v6, :cond_10

    .line 320
    .line 321
    const-string v3, "Operation handle is not supported by FingerprintManager."

    .line 322
    .line 323
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    :cond_10
    :goto_4
    iget-object v3, p0, La/l58;->H1:La/t58;

    .line 327
    .line 328
    iget-object v5, v3, La/t58;->g:La/t5a;

    .line 329
    .line 330
    if-nez v5, :cond_11

    .line 331
    .line 332
    new-instance v5, La/t5a;

    .line 333
    .line 334
    invoke-direct {v5}, La/t5a;-><init>()V

    .line 335
    .line 336
    .line 337
    iput-object v5, v3, La/t58;->g:La/t5a;

    .line 338
    .line 339
    :cond_11
    iget-object v3, v5, La/t5a;->b:La/s88;

    .line 340
    .line 341
    if-nez v3, :cond_12

    .line 342
    .line 343
    new-instance v3, La/s88;

    .line 344
    .line 345
    invoke-direct {v3, v4, v9}, La/s88;-><init>(BZ)V

    .line 346
    .line 347
    .line 348
    iput-object v3, v5, La/t5a;->b:La/s88;

    .line 349
    .line 350
    :cond_12
    iget-object v4, p0, La/l58;->H1:La/t58;

    .line 351
    .line 352
    iget-object v5, v4, La/t58;->f:La/lo4;

    .line 353
    .line 354
    if-nez v5, :cond_13

    .line 355
    .line 356
    new-instance v5, La/lo4;

    .line 357
    .line 358
    new-instance v6, La/ro4;

    .line 359
    .line 360
    invoke-direct {v6, v4}, La/ro4;-><init>(La/t58;)V

    .line 361
    .line 362
    .line 363
    invoke-direct {v5, v6}, La/lo4;-><init>(La/ro4;)V

    .line 364
    .line 365
    .line 366
    iput-object v5, v4, La/t58;->f:La/lo4;

    .line 367
    .line 368
    :cond_13
    iget-object v4, v5, La/lo4;->b:La/rek0;

    .line 369
    .line 370
    if-nez v4, :cond_14

    .line 371
    .line 372
    new-instance v4, La/rek0;

    .line 373
    .line 374
    const/16 v6, 0x1b

    .line 375
    .line 376
    invoke-direct {v4, v6}, La/rek0;-><init>(B)V

    .line 377
    .line 378
    .line 379
    iput-object v4, v5, La/lo4;->b:La/rek0;

    .line 380
    .line 381
    :cond_14
    :try_start_0
    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 382
    :try_start_1
    iget-object v4, v3, La/s88;->c:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v4, Landroid/os/CancellationSignal;

    .line 385
    .line 386
    if-nez v4, :cond_15

    .line 387
    .line 388
    new-instance v4, Landroid/os/CancellationSignal;

    .line 389
    .line 390
    invoke-direct {v4}, Landroid/os/CancellationSignal;-><init>()V

    .line 391
    .line 392
    .line 393
    iput-object v4, v3, La/s88;->c:Ljava/lang/Object;

    .line 394
    .line 395
    iget-boolean v5, v3, La/s88;->b:Z

    .line 396
    .line 397
    if-eqz v5, :cond_15

    .line 398
    .line 399
    invoke-virtual {v4}, Landroid/os/CancellationSignal;->cancel()V

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :catchall_0
    move-exception v4

    .line 404
    goto :goto_6

    .line 405
    :cond_15
    :goto_5
    iget-object v4, v3, La/s88;->c:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v4, Landroid/os/CancellationSignal;

    .line 408
    .line 409
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 410
    :try_start_2
    invoke-static {v1}, La/geq;->b(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    if-eqz v3, :cond_2b

    .line 415
    .line 416
    invoke-static {v8}, La/geq;->e(La/cu;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    new-instance v6, La/feq;

    .line 421
    .line 422
    invoke-direct {v6}, La/feq;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-static {v3, v5, v4, v6}, La/geq;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/CancellationSignal;La/feq;)V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 426
    .line 427
    .line 428
    goto/16 :goto_f

    .line 429
    .line 430
    :goto_6
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 431
    :try_start_4
    throw v4
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_0

    .line 432
    :catch_0
    move-exception v3

    .line 433
    const-string v4, "Got NPE while authenticating with fingerprint."

    .line 434
    .line 435
    invoke-static {v0, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 436
    .line 437
    .line 438
    invoke-static {v2, v1}, La/fxb;->C(ILandroid/content/Context;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {p0, v2, v0}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_f

    .line 446
    .line 447
    :cond_16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-static {v1}, La/h58;->d(Landroid/content/Context;)Landroid/hardware/biometrics/BiometricPrompt$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    iget-object v10, p0, La/l58;->H1:La/t58;

    .line 460
    .line 461
    iget-object v10, v10, La/t58;->d:La/yzn0;

    .line 462
    .line 463
    if-eqz v10, :cond_17

    .line 464
    .line 465
    iget-object v10, v10, La/yzn0;->a:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v10, Ljava/lang/CharSequence;

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_17
    move-object v10, v8

    .line 471
    :goto_7
    if-eqz v10, :cond_18

    .line 472
    .line 473
    invoke-static {v1, v10}, La/h58;->f(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 474
    .line 475
    .line 476
    :cond_18
    iget-object v10, p0, La/l58;->H1:La/t58;

    .line 477
    .line 478
    iget-object v11, v10, La/t58;->j:Ljava/lang/String;

    .line 479
    .line 480
    if-eqz v11, :cond_19

    .line 481
    .line 482
    move-object v8, v11

    .line 483
    goto :goto_8

    .line 484
    :cond_19
    iget-object v10, v10, La/t58;->d:La/yzn0;

    .line 485
    .line 486
    if-eqz v10, :cond_1b

    .line 487
    .line 488
    iget-object v8, v10, La/yzn0;->b:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v8, Ljava/lang/CharSequence;

    .line 491
    .line 492
    if-eqz v8, :cond_1a

    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_1a
    const-string v8, ""

    .line 496
    .line 497
    :cond_1b
    :goto_8
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    if-nez v10, :cond_1e

    .line 502
    .line 503
    iget-object v10, p0, La/l58;->H1:La/t58;

    .line 504
    .line 505
    iget-object v10, v10, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 506
    .line 507
    if-eqz v10, :cond_1c

    .line 508
    .line 509
    goto :goto_9

    .line 510
    :cond_1c
    new-instance v10, La/xz3;

    .line 511
    .line 512
    invoke-direct {v10, v2}, La/xz3;-><init>(B)V

    .line 513
    .line 514
    .line 515
    :goto_9
    iget-object v11, p0, La/l58;->H1:La/t58;

    .line 516
    .line 517
    iget-object v12, v11, La/t58;->h:La/so4;

    .line 518
    .line 519
    if-nez v12, :cond_1d

    .line 520
    .line 521
    new-instance v12, La/so4;

    .line 522
    .line 523
    invoke-direct {v12, v11, v4}, La/so4;-><init>(La/t58;B)V

    .line 524
    .line 525
    .line 526
    iput-object v12, v11, La/t58;->h:La/so4;

    .line 527
    .line 528
    :cond_1d
    invoke-static {v1, v8, v10, v12}, La/h58;->e(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;)V

    .line 529
    .line 530
    .line 531
    :cond_1e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 532
    .line 533
    if-lt v4, v3, :cond_20

    .line 534
    .line 535
    iget-object v8, p0, La/l58;->H1:La/t58;

    .line 536
    .line 537
    iget-object v8, v8, La/t58;->d:La/yzn0;

    .line 538
    .line 539
    if-eqz v8, :cond_1f

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_1f
    move v9, v2

    .line 543
    :goto_a
    invoke-static {v1, v9}, La/i58;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 544
    .line 545
    .line 546
    :cond_20
    iget-object v8, p0, La/l58;->H1:La/t58;

    .line 547
    .line 548
    iget v8, v8, La/t58;->r:I

    .line 549
    .line 550
    if-lt v4, v7, :cond_21

    .line 551
    .line 552
    invoke-static {v1, v8}, La/j58;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;I)V

    .line 553
    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_21
    if-lt v4, v3, :cond_22

    .line 557
    .line 558
    invoke-static {v8}, La/hmw0;->Z(I)Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    invoke-static {v1, v3}, La/i58;->b(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 563
    .line 564
    .line 565
    :cond_22
    :goto_b
    if-lt v4, v6, :cond_24

    .line 566
    .line 567
    iget-object v3, p0, La/l58;->H1:La/t58;

    .line 568
    .line 569
    iget-object v4, v3, La/t58;->d:La/yzn0;

    .line 570
    .line 571
    iget-object v3, v3, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 572
    .line 573
    if-eqz v3, :cond_23

    .line 574
    .line 575
    goto :goto_c

    .line 576
    :cond_23
    new-instance v3, Landroid/os/Handler;

    .line 577
    .line 578
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 583
    .line 584
    .line 585
    :goto_c
    iget-object v3, p0, La/l58;->H1:La/t58;

    .line 586
    .line 587
    iget-object v4, v3, La/t58;->i:La/so4;

    .line 588
    .line 589
    if-nez v4, :cond_24

    .line 590
    .line 591
    new-instance v4, La/so4;

    .line 592
    .line 593
    invoke-direct {v4, v3, v5}, La/so4;-><init>(La/t58;B)V

    .line 594
    .line 595
    .line 596
    iput-object v4, v3, La/t58;->i:La/so4;

    .line 597
    .line 598
    :cond_24
    invoke-static {v1}, La/h58;->c(Landroid/hardware/biometrics/BiometricPrompt$Builder;)Landroid/hardware/biometrics/BiometricPrompt;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    iget-object v4, p0, La/l58;->H1:La/t58;

    .line 607
    .line 608
    iget-object v4, v4, La/t58;->e:La/q58;

    .line 609
    .line 610
    invoke-static {v4}, La/wwb;->W(La/q58;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    iget-object v5, p0, La/l58;->H1:La/t58;

    .line 615
    .line 616
    iget-object v6, v5, La/t58;->g:La/t5a;

    .line 617
    .line 618
    if-nez v6, :cond_25

    .line 619
    .line 620
    new-instance v6, La/t5a;

    .line 621
    .line 622
    invoke-direct {v6}, La/t5a;-><init>()V

    .line 623
    .line 624
    .line 625
    iput-object v6, v5, La/t58;->g:La/t5a;

    .line 626
    .line 627
    :cond_25
    iget-object v5, v6, La/t5a;->a:Landroid/os/CancellationSignal;

    .line 628
    .line 629
    if-nez v5, :cond_26

    .line 630
    .line 631
    new-instance v5, Landroid/os/CancellationSignal;

    .line 632
    .line 633
    invoke-direct {v5}, Landroid/os/CancellationSignal;-><init>()V

    .line 634
    .line 635
    .line 636
    iput-object v5, v6, La/t5a;->a:Landroid/os/CancellationSignal;

    .line 637
    .line 638
    :cond_26
    new-instance v6, La/k03;

    .line 639
    .line 640
    invoke-direct {v6, v2}, La/k03;-><init>(B)V

    .line 641
    .line 642
    .line 643
    iget-object v7, p0, La/l58;->H1:La/t58;

    .line 644
    .line 645
    iget-object v8, v7, La/t58;->f:La/lo4;

    .line 646
    .line 647
    if-nez v8, :cond_27

    .line 648
    .line 649
    new-instance v8, La/lo4;

    .line 650
    .line 651
    new-instance v9, La/ro4;

    .line 652
    .line 653
    invoke-direct {v9, v7}, La/ro4;-><init>(La/t58;)V

    .line 654
    .line 655
    .line 656
    invoke-direct {v8, v9}, La/lo4;-><init>(La/ro4;)V

    .line 657
    .line 658
    .line 659
    iput-object v8, v7, La/t58;->f:La/lo4;

    .line 660
    .line 661
    :cond_27
    iget-object v7, v8, La/lo4;->a:La/ko4;

    .line 662
    .line 663
    if-nez v7, :cond_28

    .line 664
    .line 665
    iget-object v7, v8, La/lo4;->c:La/ro4;

    .line 666
    .line 667
    new-instance v9, La/ko4;

    .line 668
    .line 669
    invoke-direct {v9, v7}, La/ko4;-><init>(La/ro4;)V

    .line 670
    .line 671
    .line 672
    iput-object v9, v8, La/lo4;->a:La/ko4;

    .line 673
    .line 674
    move-object v7, v9

    .line 675
    :cond_28
    if-nez v4, :cond_29

    .line 676
    .line 677
    :try_start_5
    invoke-static {v1, v5, v6, v7}, La/h58;->b(Landroid/hardware/biometrics/BiometricPrompt;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V

    .line 678
    .line 679
    .line 680
    goto :goto_f

    .line 681
    :catch_1
    move-exception v1

    .line 682
    goto :goto_d

    .line 683
    :cond_29
    invoke-static {v1, v4, v5, v6, v7}, La/h58;->a(Landroid/hardware/biometrics/BiometricPrompt;Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_1

    .line 684
    .line 685
    .line 686
    goto :goto_f

    .line 687
    :goto_d
    const-string v4, "Got NPE while authenticating with biometric prompt."

    .line 688
    .line 689
    invoke-static {v0, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 690
    .line 691
    .line 692
    if-eqz v3, :cond_2a

    .line 693
    .line 694
    const v0, 0x7f130694

    .line 695
    .line 696
    .line 697
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    goto :goto_e

    .line 702
    :cond_2a
    const-string v0, ""

    .line 703
    .line 704
    :goto_e
    invoke-virtual {p0, v2, v0}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 705
    .line 706
    .line 707
    :cond_2b
    :goto_f
    return-void
.end method

.method public final U(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->U(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x1

    .line 5
    if-ne p1, p3, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p1, La/t58;->n:Z

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    iget-boolean p2, p1, La/t58;->q:Z

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iput-boolean v0, p1, La/t58;->q:Z

    .line 20
    .line 21
    move p3, v1

    .line 22
    :cond_0
    new-instance p1, La/p58;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {p1, p2, p3}, La/p58;-><init>(La/q58;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/l58;->F0(La/p58;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const p1, 0x7f13096a

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/16 p2, 0xa

    .line 40
    .line 41
    invoke-virtual {p0, p2, p1}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v1, "host_activity"

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0, p1}, La/m0x0;->P(Landroidx/fragment/app/Fragment;Z)La/t58;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/l58;->H1:La/t58;

    .line 22
    .line 23
    :cond_0
    iget-object v1, p1, La/t58;->s:La/hy40;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, La/hy40;

    .line 28
    .line 29
    invoke-direct {v1}, La/wh00;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p1, La/t58;->s:La/hy40;

    .line 33
    .line 34
    :cond_1
    new-instance p1, La/g58;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {p1, p0, v2}, La/g58;-><init>(La/l58;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 44
    .line 45
    iget-object v1, p1, La/t58;->t:La/hy40;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    new-instance v1, La/hy40;

    .line 50
    .line 51
    invoke-direct {v1}, La/wh00;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v1, p1, La/t58;->t:La/hy40;

    .line 55
    .line 56
    :cond_2
    new-instance p1, La/g58;

    .line 57
    .line 58
    invoke-direct {p1, p0, v0}, La/g58;-><init>(La/l58;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 65
    .line 66
    iget-object v0, p1, La/t58;->u:La/hy40;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    new-instance v0, La/hy40;

    .line 71
    .line 72
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p1, La/t58;->u:La/hy40;

    .line 76
    .line 77
    :cond_3
    new-instance p1, La/g58;

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    invoke-direct {p1, p0, v1}, La/g58;-><init>(La/l58;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 87
    .line 88
    iget-object v0, p1, La/t58;->v:La/hy40;

    .line 89
    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    new-instance v0, La/hy40;

    .line 93
    .line 94
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p1, La/t58;->v:La/hy40;

    .line 98
    .line 99
    :cond_4
    new-instance p1, La/g58;

    .line 100
    .line 101
    const/4 v1, 0x3

    .line 102
    invoke-direct {p1, p0, v1}, La/g58;-><init>(La/l58;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 109
    .line 110
    iget-object v0, p1, La/t58;->w:La/hy40;

    .line 111
    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    new-instance v0, La/hy40;

    .line 115
    .line 116
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v0, p1, La/t58;->w:La/hy40;

    .line 120
    .line 121
    :cond_5
    new-instance p1, La/g58;

    .line 122
    .line 123
    const/4 v1, 0x4

    .line 124
    invoke-direct {p1, p0, v1}, La/g58;-><init>(La/l58;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 131
    .line 132
    iget-object v0, p1, La/t58;->x:La/hy40;

    .line 133
    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    new-instance v0, La/hy40;

    .line 137
    .line 138
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v0, p1, La/t58;->x:La/hy40;

    .line 142
    .line 143
    :cond_6
    new-instance p1, La/g58;

    .line 144
    .line 145
    const/4 v1, 0x5

    .line 146
    invoke-direct {p1, p0, v1}, La/g58;-><init>(La/l58;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 153
    .line 154
    iget-object v0, p1, La/t58;->z:La/hy40;

    .line 155
    .line 156
    if-nez v0, :cond_7

    .line 157
    .line 158
    new-instance v0, La/hy40;

    .line 159
    .line 160
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v0, p1, La/t58;->z:La/hy40;

    .line 164
    .line 165
    :cond_7
    new-instance p1, La/g58;

    .line 166
    .line 167
    const/4 v1, 0x6

    .line 168
    invoke-direct {p1, p0, v1}, La/g58;-><init>(La/l58;B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p0, p1}, La/wh00;->e(La/clz;La/ee60;)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v2, 0x1d

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 11
    .line 12
    iget v1, v1, La/t58;->r:I

    .line 13
    .line 14
    invoke-static {v1}, La/hmw0;->Z(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 21
    .line 22
    iput-boolean v0, v1, La/t58;->p:Z

    .line 23
    .line 24
    new-instance v0, La/k58;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v0, v1, v2}, La/k58;-><init>(La/t58;B)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v1, 0xfa

    .line 31
    .line 32
    iget-object p0, p0, La/l58;->I1:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 5
    .line 6
    iget-boolean v1, v0, La/t58;->l:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-boolean v0, v0, La/t58;->n:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v1, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, v0}, La/l58;->x0(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final x0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 5
    .line 6
    iget-boolean v0, v0, La/t58;->p:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 18
    .line 19
    iput-byte p1, v0, La/t58;->k:B

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    invoke-static {v0, p1}, La/fxb;->C(ILandroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, v0, p1}, La/l58;->E0(ILjava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 38
    .line 39
    iget-object p1, p0, La/t58;->g:La/t5a;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, La/t5a;

    .line 44
    .line 45
    invoke-direct {p1}, La/t5a;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/t58;->g:La/t5a;

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, La/t5a;->a()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final y0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/l58;->z0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, La/t58;->l:Z

    .line 8
    .line 9
    iget-boolean v0, v0, La/t58;->n:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v3, La/zb5;

    .line 25
    .line 26
    invoke-direct {v3, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v2, v2}, La/zb5;->g(ZZ)I

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 42
    .line 43
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v5, 0x1d

    .line 46
    .line 47
    if-eq v4, v5, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    if-nez v3, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const v4, 0x7f030003

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    array-length v4, v0

    .line 65
    :goto_0
    if-ge v1, v4, :cond_4

    .line 66
    .line 67
    aget-object v5, v0, v1

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 76
    .line 77
    iput-boolean v2, v0, La/t58;->o:Z

    .line 78
    .line 79
    new-instance v1, La/k58;

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, La/k58;-><init>(La/t58;B)V

    .line 82
    .line 83
    .line 84
    const-wide/16 v2, 0x258

    .line 85
    .line 86
    iget-object p0, p0, La/l58;->I1:Landroid/os/Handler;

    .line 87
    .line 88
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    :goto_1
    return-void
.end method

.method public final z0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/l58;->H1:La/t58;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, La/t58;->l:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "androidx.biometric.internal.FingerprintDialogFragment"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/zdq;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, La/sik;->y0()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v1, La/zb5;

    .line 37
    .line 38
    invoke-direct {v1, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    invoke-virtual {v1, p0, p0}, La/zb5;->g(ZZ)I

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method
