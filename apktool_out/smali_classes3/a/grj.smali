.class public final La/grj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jlx;

.field public final b:La/ctf0;

.field public final c:La/us00;


# direct methods
.method public constructor <init>(La/jlx;La/ctf0;La/us00;)V
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
    iput-object p1, p0, La/grj;->a:La/jlx;

    .line 8
    .line 9
    iput-object p2, p0, La/grj;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/grj;->c:La/us00;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La/grj;->b:La/ctf0;

    .line 8
    .line 9
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v3, 0x7f130690

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const-string v4, "/"

    .line 34
    .line 35
    invoke-static {v2, v4, v0}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-ne v4, v3, :cond_0

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :cond_0
    if-nez v2, :cond_1

    .line 43
    .line 44
    const-string v4, "://"

    .line 45
    .line 46
    invoke-static {v1, v4, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v4, Landroid/content/Intent;

    .line 55
    .line 56
    const-string v5, "android.intent.action.VIEW"

    .line 57
    .line 58
    invoke-direct {v4, v5, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    :cond_2
    move v0, v3

    .line 70
    :cond_3
    iget-object p1, p0, La/grj;->c:La/us00;

    .line 71
    .line 72
    invoke-static {p1}, La/sj3;->K(Landroid/content/Context;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object p0, p0, La/grj;->a:La/jlx;

    .line 81
    .line 82
    invoke-virtual {p0, v4}, La/jlx;->a(Landroid/content/Intent;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    if-eqz v0, :cond_5

    .line 87
    .line 88
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v4, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    :cond_5
    const/high16 p0, 0x10000000

    .line 96
    .line 97
    invoke-virtual {v4, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :catch_0
    move-exception p0

    .line 105
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La/grj;->b:La/ctf0;

    .line 8
    .line 9
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v3, 0x7f130690

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const-string v3, "/"

    .line 33
    .line 34
    invoke-static {v2, v3, v0}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v3, 0x1

    .line 39
    if-ne v0, v3, :cond_0

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :cond_0
    if-nez v2, :cond_1

    .line 43
    .line 44
    const-string v0, "://"

    .line 45
    .line 46
    invoke-static {v1, v0, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Landroid/content/Intent;

    .line 55
    .line 56
    const-string v1, "android.intent.action.VIEW"

    .line 57
    .line 58
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 59
    .line 60
    .line 61
    const/high16 p1, 0x10000000

    .line 62
    .line 63
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/grj;->c:La/us00;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    return-void
.end method
