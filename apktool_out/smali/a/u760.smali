.class public final La/u760;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t760;


# instance fields
.field public final a:La/us00;

.field public final b:La/x4u;

.field public final c:La/e1u;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:I


# direct methods
.method public constructor <init>(La/us00;La/x4u;La/e1u;La/kl5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u760;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/u760;->b:La/x4u;

    .line 7
    .line 8
    iput-object p3, p0, La/u760;->c:La/e1u;

    .line 9
    .line 10
    new-instance p2, La/th50;

    .line 11
    .line 12
    const/16 p3, 0x12

    .line 13
    .line 14
    invoke-direct {p2, p3}, La/th50;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, La/u760;->d:La/n0o0;

    .line 22
    .line 23
    new-instance p2, La/pu50;

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    invoke-direct {p2, p0, p3}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, La/u760;->e:La/n0o0;

    .line 34
    .line 35
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 36
    .line 37
    const p2, 0x7f060845

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, La/u760;->f:I

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/u760;->c()Landroid/app/NotificationManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0, p1, v0}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final c()Landroid/app/NotificationManager;
    .locals 1

    .line 1
    iget-object p0, p0, La/u760;->a:La/us00;

    .line 2
    .line 3
    const-string v0, "notification"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/app/NotificationManager;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/app/NotificationManager;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final d()Landroid/net/Uri;
    .locals 7

    .line 1
    const-string v0, "file://"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/p760;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v0, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, La/u760;->a:La/us00;

    .line 17
    .line 18
    iget-object v3, p0, La/u760;->b:La/x4u;

    .line 19
    .line 20
    iget-object v3, v3, La/x4u;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, La/jm3;

    .line 23
    .line 24
    iget-object v3, v3, La/jm3;->b:La/us3;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string v3, "org.xbet.client1.provider"

    .line 30
    .line 31
    new-instance v4, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v5, v5, La/p760;->a:Ljava/lang/String;

    .line 38
    .line 39
    const-string v6, ""

    .line 40
    .line 41
    invoke-static {v5, v0, v6, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v4, v3}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, La/p760;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/u760;->g(Landroid/net/Uri;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_1
    sget-object p0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    return-object p0

    .line 81
    :goto_1
    const-string v1, "NotificationServiceImpl"

    .line 82
    .line 83
    const-string v2, "Error getting notification sound URI"

    .line 84
    .line 85
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 86
    .line 87
    .line 88
    :try_start_1
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v0, v0, La/p760;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, La/u760;->g(Landroid/net/Uri;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catch_1
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 112
    .line 113
    :goto_2
    return-object v0
.end method

.method public final e()La/p760;
    .locals 0

    .line 1
    iget-object p0, p0, La/u760;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/p760;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/u760;->c()Landroid/app/NotificationManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, La/p760;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1}, La/um30;->e(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, La/um30;->a(Landroid/app/NotificationChannel;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :cond_0
    new-instance v0, La/o760;

    .line 32
    .line 33
    iget-object p0, p0, La/u760;->a:La/us00;

    .line 34
    .line 35
    invoke-direct {v0, p0}, La/o760;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v0, La/o760;->b:Landroid/app/NotificationManager;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public final g(Landroid/net/Uri;)Z
    .locals 6

    .line 1
    const-string v0, "NotificationServiceImpl"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_6

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const v5, 0x2ff57c

    .line 16
    .line 17
    .line 18
    if-eq v4, v5, :cond_3

    .line 19
    .line 20
    const v5, 0x38b73479

    .line 21
    .line 22
    .line 23
    if-eq v4, v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string v4, "content"

    .line 27
    .line 28
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_6

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v4, "settings"

    .line 39
    .line 40
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    iget-object p0, p0, La/u760;->a:La/us00;

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    :try_start_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v4, "ringtone"

    .line 56
    .line 57
    invoke-static {v2, v4, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_7

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 75
    .line 76
    .line 77
    return v3

    .line 78
    :catch_0
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :catch_1
    move-exception p0

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    :goto_0
    invoke-static {p0, p1}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_7

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-string p0, "file"

    .line 90
    .line 91
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance p0, Ljava/io/File;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-nez v2, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/io/File;->canRead()Z

    .line 117
    .line 118
    .line 119
    move-result p0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    if-eqz p0, :cond_7

    .line 121
    .line 122
    :cond_6
    :goto_1
    return v3

    .line 123
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v3, "Exception checking URI access: "

    .line 126
    .line 127
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v3, "SecurityException checking URI access: "

    .line 144
    .line 145
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 156
    .line 157
    .line 158
    :catch_2
    :cond_7
    :goto_4
    return v1
.end method

.method public final h()V
    .locals 14

    .line 1
    iget-object v1, p0, La/u760;->d:La/n0o0;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-lt v0, v2, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, La/u760;->c()Landroid/app/NotificationManager;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/p760;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getSound()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v6, v6, La/p760;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v0}, Landroid/app/NotificationChannel;->shouldShowLights()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, La/u760;->e()La/p760;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-boolean v6, v6, La/p760;->c:Z

    .line 59
    .line 60
    if-eq v0, v6, :cond_0

    .line 61
    .line 62
    move v0, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v0, v4

    .line 65
    :goto_0
    if-eqz v5, :cond_1

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v2}, Landroid/app/NotificationManager;->getNotificationChannels()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v4, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v6, La/jw50;

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/16 v13, 0xc

    .line 89
    .line 90
    const/4 v7, 0x1

    .line 91
    const-class v9, Ljava/util/List;

    .line 92
    .line 93
    const-string v10, "get"

    .line 94
    .line 95
    const-string v11, "get(I)Ljava/lang/Object;"

    .line 96
    .line 97
    invoke-direct/range {v6 .. v13}, La/jw50;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v6}, La/pgi0;->q(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v4, La/b5q;

    .line 105
    .line 106
    invoke-direct {v4, v0}, La/b5q;-><init>(La/c5q;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {v4}, La/b5q;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    invoke-virtual {v4}, La/b5q;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroid/app/NotificationChannel;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    iget-object v0, p0, La/u760;->c:La/e1u;

    .line 130
    .line 131
    invoke-virtual {v0}, La/e1u;->g()La/p760;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {}, La/i7w0;->b()V

    .line 136
    .line 137
    .line 138
    iget-object v4, v0, La/p760;->b:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v5, p0, La/u760;->a:La/us00;

    .line 141
    .line 142
    invoke-virtual {v5}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    const v6, 0x7f130113

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    new-instance v6, Landroid/app/NotificationChannel;

    .line 154
    .line 155
    const/4 v7, 0x4

    .line 156
    invoke-direct {v6, v4, v5, v7}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 157
    .line 158
    .line 159
    const v4, -0xffff01

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v4}, Landroid/app/NotificationChannel;->setLightColor(I)V

    .line 163
    .line 164
    .line 165
    iget-boolean v0, v0, La/p760;->c:Z

    .line 166
    .line 167
    invoke-virtual {v6, v0}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v3}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 174
    .line 175
    .line 176
    :try_start_0
    invoke-virtual {p0}, La/u760;->d()Landroid/net/Uri;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Landroid/media/AudioAttributes;

    .line 185
    .line 186
    invoke-virtual {v6, p0, v0}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :catch_0
    move-exception v0

    .line 191
    move-object p0, v0

    .line 192
    const-string v0, "NotificationServiceImpl"

    .line 193
    .line 194
    const-string v3, "Failed to set notification channel sound, using default"

    .line 195
    .line 196
    invoke-static {v0, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 197
    .line 198
    .line 199
    sget-object p0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 200
    .line 201
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Landroid/media/AudioAttributes;

    .line 206
    .line 207
    invoke-virtual {v6, p0, v0}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 208
    .line 209
    .line 210
    :goto_2
    invoke-virtual {v2, v6}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 211
    .line 212
    .line 213
    :cond_3
    return-void
.end method
