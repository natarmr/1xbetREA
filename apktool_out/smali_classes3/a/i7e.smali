.class public final La/i7e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/q7d0;

.field public final c:La/vby;

.field public final d:Ljava/util/concurrent/atomic/AtomicLong;

.field public e:La/l14;

.field public final f:La/p7m0;

.field public final g:La/p7m0;

.field public final h:La/p7m0;

.field public final i:La/p7m0;

.field public final j:La/p7m0;

.field public final k:La/p7m0;

.field public final l:La/qoj0;


# direct methods
.method public constructor <init>(La/vby;La/us00;La/q7d0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/i7e;->a:La/us00;

    .line 5
    .line 6
    iput-object p3, p0, La/i7e;->b:La/q7d0;

    .line 7
    .line 8
    iput-object p1, p0, La/i7e;->c:La/vby;

    .line 9
    .line 10
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/i7e;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    .line 19
    sget-object p2, La/zji0;->a:La/zji0;

    .line 20
    .line 21
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, La/i7e;->f:La/p7m0;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    :try_start_0
    const-string v0, "PREF_KEY_SEND_MESSAGES"

    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    invoke-virtual {p3}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-interface {p3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, La/inv;

    .line 50
    .line 51
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 52
    .line 53
    sget-object v2, La/oei0;->Companion:La/hei0;

    .line 54
    .line 55
    invoke-virtual {v2}, La/hei0;->serializer()La/jiy;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {v0, v1, v2, p2}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0, p3}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/util/Map;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    :goto_0
    sget-object p1, La/lun;->a:La/lun;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    sget-object p1, La/lun;->a:La/lun;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, La/i7e;->g:La/p7m0;

    .line 85
    .line 86
    iget-object p1, p0, La/i7e;->b:La/q7d0;

    .line 87
    .line 88
    const-string p3, "PREF_KEY_MUTE_STATE"

    .line 89
    .line 90
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-interface {p1, p3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, La/i7e;->h:La/p7m0;

    .line 108
    .line 109
    sget-object p1, La/gxb;->k:La/gxb;

    .line 110
    .line 111
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, La/i7e;->i:La/p7m0;

    .line 116
    .line 117
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iput-object p1, p0, La/i7e;->j:La/p7m0;

    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, p0, La/i7e;->k:La/p7m0;

    .line 133
    .line 134
    sget-object p1, La/i99;->b:La/i99;

    .line 135
    .line 136
    invoke-static {v0, p2, p1}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, La/i7e;->l:La/qoj0;

    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    iget-object p0, p0, La/i7e;->i:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/gxb;

    .line 9
    .line 10
    iget-object v0, v1, La/gxb;->i:Ljava/util/List;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v2}, La/wp20;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x10

    .line 23
    .line 24
    if-ge v2, v3, :cond_0

    .line 25
    .line 26
    move v2, v3

    .line 27
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v4, v2

    .line 47
    check-cast v4, La/xrt0;

    .line 48
    .line 49
    invoke-virtual {v4}, La/xrt0;->a()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, La/xrt0;

    .line 77
    .line 78
    invoke-virtual {v2}, La/xrt0;->a()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Iterable;

    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const/4 v8, 0x0

    .line 97
    const/16 v9, 0x2ff

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    invoke-static/range {v1 .. v9}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    sget-object v0, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/i7e;->g:La/p7m0;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/i7e;->i:La/p7m0;

    .line 16
    .line 17
    sget-object v1, La/gxb;->k:La/gxb;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/i7e;->f:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v1, La/zji0;->a:La/zji0;

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v3, p0, La/i7e;->j:La/p7m0;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/i7e;->k:La/p7m0;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/i7e;->b:La/q7d0;

    .line 51
    .line 52
    const-string v3, "PREF_KEY_MUTE_STATE"

    .line 53
    .line 54
    invoke-virtual {v1, v3, v0}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    iget-object p0, p0, La/i7e;->h:La/p7m0;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, La/i7e;->a:La/us00;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "android_id"

    .line 8
    .line 9
    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, ""

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :cond_0
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v2, 0x0

    .line 29
    aget-object v1, v1, v2

    .line 30
    .line 31
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sget-object p0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sget-object p0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    sget-object p0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :try_start_0
    const-string p0, "SHA-256"

    .line 70
    .line 71
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v1, La/vzd;

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    invoke-direct {v1, v2}, La/vzd;-><init>(B)V

    .line 99
    .line 100
    .line 101
    const/16 v2, 0x1e

    .line 102
    .line 103
    invoke-static {p0, v0, v1, v2}, La/tx3;->L([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    return-object p0

    .line 108
    :catch_0
    move-exception p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i7e;->g:La/p7m0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/util/Map;

    .line 11
    .line 12
    invoke-static {v1}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    move p1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance v3, La/inv;

    .line 29
    .line 30
    sget-object v4, La/ysm0;->a:La/ysm0;

    .line 31
    .line 32
    sget-object v5, La/oei0;->Companion:La/hei0;

    .line 33
    .line 34
    invoke-virtual {v5}, La/hei0;->serializer()La/jiy;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-direct {v3, v4, v5, v2}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, La/i7e;->c:La/vby;

    .line 42
    .line 43
    invoke-virtual {v2, v3, v1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object p0, p0, La/i7e;->b:La/q7d0;

    .line 48
    .line 49
    const-string v3, "PREF_KEY_SEND_MESSAGES"

    .line 50
    .line 51
    invoke-virtual {p0, v3, v2}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    invoke-virtual {v0, p0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return p1
.end method
