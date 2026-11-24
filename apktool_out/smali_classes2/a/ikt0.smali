.class public final La/ikt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mff0;
.implements La/ngw0;
.implements La/xfw0;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/pfv0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, La/ikt0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tnc0;)V
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
    iput-object p1, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 10
    iput-object p1, p0, La/ikt0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()La/ikt0;
    .locals 5

    .line 1
    new-instance v0, La/u4x0;

    .line 2
    .line 3
    const-string v1, "[.-]"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, La/u4x0;-><init>(Ljava/util/regex/Pattern;)V

    .line 10
    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, La/ikt0;

    .line 28
    .line 29
    new-instance v2, La/owp0;

    .line 30
    .line 31
    const/16 v3, 0x1b

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v2, v3, v4}, La/owp0;-><init>(BZ)V

    .line 35
    .line 36
    .line 37
    iput-object v0, v2, La/owp0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v1, v2}, La/ikt0;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_0
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "The pattern may not match the empty string: %s"

    .line 48
    .line 49
    invoke-static {v1, v0}, La/qem0;->w(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/kwt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/kwt0;

    .line 7
    .line 8
    iget v1, v0, La/kwt0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/kwt0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kwt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/kwt0;-><init>(La/ikt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/kwt0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kwt0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, La/kwt0;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/kd30;

    .line 55
    .line 56
    iput-object p1, v0, La/kwt0;->i:Ljava/lang/String;

    .line 57
    .line 58
    iput v3, v0, La/kwt0;->l:I

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, v0}, La/kd30;->a0(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-ne p3, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p3, La/km90;

    .line 68
    .line 69
    iget-object p0, p3, La/km90;->a:Ljava/lang/String;

    .line 70
    .line 71
    const-string p2, "US"

    .line 72
    .line 73
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_5

    .line 78
    .line 79
    const-string p0, "+1"

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-static {p1, p0, p2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    new-instance p0, La/orv0;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    new-instance p0, La/p4c;

    .line 95
    .line 96
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 97
    .line 98
    .line 99
    :goto_2
    throw p0

    .line 100
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/oaw0;

    .line 4
    .line 5
    check-cast p1, La/paw0;

    .line 6
    .line 7
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    new-instance v0, La/naw0;

    .line 10
    .line 11
    invoke-direct {v0, p2}, La/naw0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/ebw0;

    .line 19
    .line 20
    iget-object p0, p0, La/oaw0;->l:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1}, La/y4w0;->C()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget v1, La/taw0;->a:I

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x2

    .line 35
    invoke-virtual {p1, p2, p0}, La/y4w0;->D(Landroid/os/Parcel;I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public b(La/px7;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n730;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/n730;->a:La/jx7;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/jx7;->a:La/p7m0;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, La/px7;

    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/thx0;

    .line 7
    .line 8
    invoke-interface {v0, p0, p1}, La/thx0;->b(La/ikt0;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v0, p0

    .line 18
    check-cast v0, La/nex0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/nex0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, La/nex0;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public e()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/w4x0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/kxw0;

    .line 11
    .line 12
    iget-object v1, v0, La/kxw0;->e:La/wvw0;

    .line 13
    .line 14
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/kxw0;->k:La/lwf;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v1, v2, v3}, La/wvw0;->v1(J)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, v0, La/kxw0;->e:La/wvw0;

    .line 33
    .line 34
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, La/wvw0;->m:La/mvw0;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v1, v2}, La/mvw0;->b(Z)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 49
    .line 50
    .line 51
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 52
    .line 53
    const/16 v2, 0x64

    .line 54
    .line 55
    if-ne v1, v2, :cond_1

    .line 56
    .line 57
    iget-object v1, v0, La/kxw0;->f:La/uuw0;

    .line 58
    .line 59
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v1, La/uuw0;->o:La/quw0;

    .line 63
    .line 64
    const-string v2, "Detected application was in foreground"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    iget-object v0, v0, La/kxw0;->d:La/bkw0;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    sget-object v4, La/btw0;->e1:La/atw0;

    .line 77
    .line 78
    invoke-virtual {v0, v3, v4}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    :goto_0
    invoke-virtual {p0, v1, v2, v3, v4}, La/ikt0;->i(JJ)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
.end method

.method public f(ILjava/lang/String;Ljava/util/List;ZZ)V
    .locals 3

    .line 1
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/uww0;

    .line 4
    .line 5
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/kxw0;

    .line 8
    .line 9
    add-int/lit8 p1, p1, -0x1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz p1, :cond_7

    .line 14
    .line 15
    if-eq p1, v1, :cond_4

    .line 16
    .line 17
    if-eq p1, v0, :cond_3

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    if-eq p1, v2, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 23
    .line 24
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/uuw0;->m:La/quw0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    if-eqz p4, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 33
    .line 34
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/uuw0;->k:La/quw0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-nez p5, :cond_2

    .line 41
    .line 42
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 43
    .line 44
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/uuw0;->l:La/quw0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 51
    .line 52
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 59
    .line 60
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, La/uuw0;->o:La/quw0;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    if-eqz p4, :cond_5

    .line 67
    .line 68
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 69
    .line 70
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, La/uuw0;->h:La/quw0;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    if-nez p5, :cond_6

    .line 77
    .line 78
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 79
    .line 80
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, La/uuw0;->i:La/quw0;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 87
    .line 88
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/uuw0;->g:La/quw0;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_7
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 95
    .line 96
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, La/uuw0;->n:La/quw0;

    .line 100
    .line 101
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/4 p4, 0x0

    .line 106
    if-eq p1, v1, :cond_a

    .line 107
    .line 108
    const/4 p5, 0x2

    .line 109
    if-eq p1, p5, :cond_9

    .line 110
    .line 111
    if-eq p1, v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0, p2}, La/quw0;->a(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_8
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p0, p2, p1, p4, p3}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_9
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-virtual {p0, p1, p3, p2}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_a
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p0, p1, p2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public g(JJ)V
    .locals 4

    .line 1
    iget-object v0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/w4x0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La/w4x0;->p1()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/kxw0;

    .line 14
    .line 15
    iget-object v1, v0, La/kxw0;->e:La/wvw0;

    .line 16
    .line 17
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, La/wvw0;->v1(J)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v1, La/wvw0;->m:La/mvw0;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, La/mvw0;->b(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La/kxw0;->k()La/vtw0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, La/vtw0;->q1()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, La/wvw0;->q:La/rvw0;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, La/rvw0;->b(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v1, La/wvw0;->m:La/mvw0;

    .line 51
    .line 52
    invoke-virtual {v0}, La/mvw0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2, p3, p4}, La/ikt0;->i(JJ)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public synthetic h(La/xfw0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/ngw0;

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/ngw0;->h(La/xfw0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(JJ)V
    .locals 9

    .line 1
    iget-object v0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/w4x0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/kxw0;

    .line 11
    .line 12
    invoke-virtual {v0}, La/kxw0;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v8, v0, La/kxw0;->e:La/wvw0;

    .line 21
    .line 22
    invoke-static {v8}, La/kxw0;->e(La/p4;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, v8, La/wvw0;->q:La/rvw0;

    .line 26
    .line 27
    invoke-virtual {v3, p1, p2}, La/rvw0;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v0, La/kxw0;->k:La/lwf;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iget-object v5, v0, La/kxw0;->f:La/uuw0;

    .line 40
    .line 41
    invoke-static {v5}, La/kxw0;->g(La/ryw0;)V

    .line 42
    .line 43
    .line 44
    iget-object v5, v5, La/uuw0;->o:La/quw0;

    .line 45
    .line 46
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "Session started, time"

    .line 51
    .line 52
    invoke-virtual {v5, v3, v4}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0x3e8

    .line 56
    .line 57
    div-long v6, p1, v3

    .line 58
    .line 59
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v0, v0, La/kxw0;->m:La/b1x0;

    .line 64
    .line 65
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "auto"

    .line 69
    .line 70
    const-string v5, "_sid"

    .line 71
    .line 72
    move-wide v1, p1

    .line 73
    invoke-virtual/range {v0 .. v5}, La/b1x0;->w1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v8}, La/kxw0;->e(La/p4;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v8, La/wvw0;->r:La/rvw0;

    .line 80
    .line 81
    invoke-virtual {v1, v6, v7}, La/rvw0;->b(J)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v8, La/wvw0;->m:La/mvw0;

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v1, v2}, La/mvw0;->b(Z)V

    .line 88
    .line 89
    .line 90
    new-instance v5, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v1, "_sid"

    .line 96
    .line 97
    invoke-virtual {v5, v1, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 101
    .line 102
    .line 103
    const-string v6, "auto"

    .line 104
    .line 105
    const-string v7, "_s"

    .line 106
    .line 107
    move-wide v1, p1

    .line 108
    move-wide v3, p3

    .line 109
    invoke-virtual/range {v0 .. v7}, La/b1x0;->t1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v8, La/wvw0;->w:La/o24;

    .line 113
    .line 114
    invoke-virtual {v1}, La/o24;->t()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_1

    .line 123
    .line 124
    new-instance v5, Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v2, "_ffr"

    .line 130
    .line 131
    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 135
    .line 136
    .line 137
    const-string v6, "auto"

    .line 138
    .line 139
    const-string v7, "_ssr"

    .line 140
    .line 141
    move-wide v1, p1

    .line 142
    move-wide v3, p3

    .line 143
    invoke-virtual/range {v0 .. v7}, La/b1x0;->t1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    :goto_0
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/zsm0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "Failed to get Recaptcha token, error - "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "\n\n Failing open with a fake token."

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "RecaptchaCallWrapper"

    .line 42
    .line 43
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    const-string p1, "NO_RECAPTCHA"

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/zsm0;->N(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/zsm0;->N(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public zza(Ljava/lang/String;)La/xfw0;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v1, "authorizedDomains"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    return-object p0

    .line 45
    :goto_1
    const-string v0, "ikt0"

    .line 46
    .line 47
    invoke-static {p0, v0, p1}, La/knm0;->w(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)La/udw0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    throw p0
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 52
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    check-cast p0, La/ngw0;

    invoke-interface {p0, p1}, La/ngw0;->zza(Ljava/lang/String;)V

    return-void
.end method
