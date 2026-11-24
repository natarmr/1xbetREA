.class public final La/zas0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hs8;
.implements La/ez5;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/zas0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 128
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/EnumMap;

    const-class v0, La/wyw0;

    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    return-void

    .line 129
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    return-void

    .line 130
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 131
    iput-byte p1, p0, La/zas0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/epi0;)V
    .locals 2

    const/16 v0, 0xa

    iput-byte v0, p0, La/zas0;->a:B

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    new-instance v0, La/psc;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, La/psc;-><init>(Ljava/lang/Object;B)V

    .line 136
    iput-object v0, p0, La/zas0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/fme;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, La/zas0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/zas0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance p2, La/lkr0;

    const/16 v0, 0xb

    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/zas0;->b:Ljava/lang/Object;

    return-void

    .line 143
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance p2, La/lkr0;

    const/16 v0, 0x11

    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/zas0;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/knf0;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, La/zas0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/lds0;)V
    .locals 10

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    iput-byte v0, p0, La/zas0;->a:B

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/pov0;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, La/ua6;

    .line 11
    .line 12
    iget-object v1, p1, La/lds0;->b:La/b4e;

    .line 13
    .line 14
    iget-object v2, p1, La/lds0;->d:La/rl50;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v1, v3}, La/ua6;-><init>(La/b4e;B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/ua6;

    .line 21
    .line 22
    iget-object v4, p1, La/lds0;->c:La/va6;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-direct {v1, v4, v5}, La/ua6;-><init>(La/b4e;B)V

    .line 26
    .line 27
    .line 28
    new-instance v4, La/ua6;

    .line 29
    .line 30
    iget-object v6, p1, La/lds0;->e:La/b4e;

    .line 31
    .line 32
    const/4 v7, 0x4

    .line 33
    invoke-direct {v4, v6, v7}, La/ua6;-><init>(La/b4e;B)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    new-array v8, v6, [La/y2e;

    .line 38
    .line 39
    aput-object v0, v8, v3

    .line 40
    .line 41
    aput-object v1, v8, v5

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    aput-object v4, v8, v0

    .line 45
    .line 46
    invoke-static {v8}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v8, 0x1c

    .line 53
    .line 54
    if-lt v4, v8, :cond_0

    .line 55
    .line 56
    iget-object p1, p1, La/lds0;->a:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v0, "connectivity"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 71
    .line 72
    new-instance v0, La/il50;

    .line 73
    .line 74
    invoke-direct {v0, p1}, La/il50;-><init>(Landroid/net/ConnectivityManager;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance p1, La/ua6;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v2, v0}, La/ua6;-><init>(La/b4e;B)V

    .line 87
    .line 88
    .line 89
    new-instance v4, La/ua6;

    .line 90
    .line 91
    invoke-direct {v4, v2, v6}, La/ua6;-><init>(La/b4e;B)V

    .line 92
    .line 93
    .line 94
    new-instance v8, La/fl50;

    .line 95
    .line 96
    invoke-direct {v8, v2}, La/yw5;-><init>(La/b4e;)V

    .line 97
    .line 98
    .line 99
    new-instance v9, La/cl50;

    .line 100
    .line 101
    invoke-direct {v9, v2}, La/yw5;-><init>(La/b4e;)V

    .line 102
    .line 103
    .line 104
    new-array v2, v7, [La/yw5;

    .line 105
    .line 106
    aput-object p1, v2, v3

    .line 107
    .line 108
    aput-object v4, v2, v5

    .line 109
    .line 110
    aput-object v8, v2, v0

    .line 111
    .line 112
    aput-object v9, v2, v6

    .line 113
    .line 114
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 119
    .line 120
    .line 121
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v1, p0, La/zas0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 127
    iput-byte p2, p0, La/zas0;->a:B

    iput-object p1, p0, La/zas0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 2

    const/16 v0, 0x10

    iput-byte v0, p0, La/zas0;->a:B

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, La/wyw0;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 133
    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "="

    .line 2
    .line 3
    const-string v1, "&"

    .line 4
    .line 5
    invoke-static {p0, p1, v0, p2, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public b(La/vt20;La/mt00;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-wide v1, p1, La/vt20;->a:J

    .line 4
    .line 5
    iget-boolean v3, p1, La/vt20;->d:Z

    .line 6
    .line 7
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/p430;

    .line 10
    .line 11
    iget-object p0, p0, La/p430;->a:La/he1;

    .line 12
    .line 13
    iget p1, p1, La/vt20;->c:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-nez p1, :cond_3

    .line 19
    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, La/he1;->a()La/tt20;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/tt20;->a:La/zdg0;

    .line 27
    .line 28
    new-instance p1, La/hu6;

    .line 29
    .line 30
    const/4 v3, 0x7

    .line 31
    invoke-direct {p1, v1, v2, v4, v3}, La/hu6;-><init>(JLa/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p0, p1, v6, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-ne p0, v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    if-ne p0, v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_1
    if-ne p0, v0, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_3
    new-instance v7, La/ut20;

    .line 55
    .line 56
    invoke-direct {v7, p1, v1, v2, v3}, La/ut20;-><init>(IJZ)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/he1;->a()La/tt20;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p1, p0, La/tt20;->a:La/zdg0;

    .line 64
    .line 65
    new-instance v1, La/v620;

    .line 66
    .line 67
    const/16 v2, 0x1c

    .line 68
    .line 69
    invoke-direct {v1, p0, v7, v4, v2}, La/v620;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p2, p1, v1, v6, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_2
    if-ne p0, v0, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    if-ne p0, v0, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_4
    if-ne p0, v0, :cond_7

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0
.end method

.method public c(Ljava/util/Set;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/ani0;

    .line 7
    .line 8
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/v8l0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/v8l0;->f:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v1}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast p1, Ljava/lang/Iterable;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2, p1}, La/eui0;->f(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_2

    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    invoke-virtual {v0, p1, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1}, La/v8l0;->a(Ljava/util/LinkedHashMap;)V

    .line 114
    .line 115
    .line 116
    :cond_2
    return-void
.end method

.method public d(IZZZ)V
    .locals 2

    .line 1
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vju0;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, La/vju0;->B:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, La/xhe0;->c()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {p2, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/vju0;->A(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    if-eqz p3, :cond_2

    .line 28
    .line 29
    iget p1, p0, La/vju0;->K:I

    .line 30
    .line 31
    const/4 p2, -0x1

    .line 32
    if-eq p1, p2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    :goto_0
    invoke-virtual {p0, p1, p4}, La/vju0;->y(IZ)V

    .line 40
    .line 41
    .line 42
    iput p2, p0, La/vju0;->K:I

    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public e(La/ppv0;)La/gmq;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, La/y2e;

    .line 29
    .line 30
    invoke-interface {v2, p1}, La/y2e;->b(La/ppv0;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/y2e;

    .line 66
    .line 67
    iget-object v2, p1, La/ppv0;->j:La/o4e;

    .line 68
    .line 69
    invoke-interface {v1, v2}, La/y2e;->c(La/o4e;)La/bq9;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 p1, 0x0

    .line 82
    new-array p1, p1, [La/gmq;

    .line 83
    .line 84
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, [La/gmq;

    .line 89
    .line 90
    new-instance p1, La/pxt;

    .line 91
    .line 92
    const/4 v0, 0x5

    .line 93
    invoke-direct {p1, p0, v0}, La/pxt;-><init>([La/gmq;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method public f(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;La/ss8;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, La/ss8;->c:La/pab;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v4, v0, La/pab;->b:La/mk50;

    .line 9
    .line 10
    iget-object v2, v0, La/pab;->c:La/mim0;

    .line 11
    .line 12
    new-instance v0, Landroidx/compose/ui/platform/ComposeView;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x6

    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-direct {v0, v1, v7, v3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v3, p0

    .line 29
    check-cast v3, La/vju0;

    .line 30
    .line 31
    new-instance v1, La/stl0;

    .line 32
    .line 33
    const/16 v6, 0x1a

    .line 34
    .line 35
    move-object v5, p2

    .line 36
    invoke-direct/range {v1 .. v6}, La/stl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/ugd;

    .line 40
    .line 41
    const p2, -0x1e1ccfde

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-direct {p0, p2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v7, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 49
    .line 50
    .line 51
    instance-of p0, v2, La/shm0;

    .line 52
    .line 53
    new-instance p2, Landroid/widget/FrameLayout;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {p2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    if-nez p0, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const v1, 0x7f040ae3

    .line 72
    .line 73
    .line 74
    invoke-static {v1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const p1, 0x7f0705c6

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-static {p2, p0}, La/hxm0;->x(Landroid/view/View;I)V

    .line 97
    .line 98
    .line 99
    const p0, 0x7f0a0eab

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, p0}, Landroid/view/View;->setId(I)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x3

    .line 106
    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    return-object p2

    .line 113
    :cond_1
    new-instance p0, Landroid/view/View;

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    return-object p0
.end method

.method public g(La/wyw0;I)V
    .locals 1

    .line 1
    const/16 v0, -0x1e

    .line 2
    .line 3
    if-eq p2, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, -0x14

    .line 6
    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, -0xa

    .line 10
    .line 11
    if-eq p2, v0, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x1e

    .line 16
    .line 17
    if-eq p2, v0, :cond_0

    .line 18
    .line 19
    sget-object p2, La/pkw0;->b:La/pkw0;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object p2, La/pkw0;->f:La/pkw0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object p2, La/pkw0;->e:La/pkw0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object p2, La/pkw0;->g:La/pkw0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    sget-object p2, La/pkw0;->h:La/pkw0;

    .line 32
    .line 33
    :goto_0
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/EnumMap;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public h(La/wyw0;La/pkw0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/EnumMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onConnected()V
    .locals 0

    .line 1
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/qav;

    .line 4
    .line 5
    invoke-interface {p0}, La/qav;->onConnected()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/qav;

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/qav;->onConnectionSuspended(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-byte v0, p0, La/zas0;->a:B

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "1"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, La/wyw0;->values()[La/wyw0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    array-length v2, v1

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v2, :cond_1

    .line 25
    .line 26
    aget-object v4, v1, v3

    .line 27
    .line 28
    iget-object v5, p0, La/zas0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/EnumMap;

    .line 31
    .line 32
    invoke-virtual {v5, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, La/pkw0;

    .line 37
    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    sget-object v4, La/pkw0;->b:La/pkw0;

    .line 41
    .line 42
    :cond_0
    iget-char v4, v4, La/pkw0;->a:C

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method
