.class public final La/ln4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;


# direct methods
.method public synthetic constructor <init>(La/us00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ln4;->a:La/us00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, La/ln4;->a:La/us00;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, La/gbe0;->d()La/jbe0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v2, La/jr30;

    .line 28
    .line 29
    invoke-direct {v2, p1}, La/jr30;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, La/jbe0;->a(La/jr30;)La/kr30;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    :goto_0
    const/4 v2, 0x1

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    iget-object p0, p0, La/gbe0;->a:La/dbe0;

    .line 43
    .line 44
    iget-object p0, p0, La/dbe0;->e:La/n0o0;

    .line 45
    .line 46
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, La/bbe0;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    iget-object p0, p0, La/bbe0;->b:La/hvk;

    .line 55
    .line 56
    sget-object v0, La/qg9;->d:La/qg9;

    .line 57
    .line 58
    invoke-static {p1}, La/gl5;->i(Ljava/lang/String;)La/qg9;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "SHA-256"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, La/qg9;->d(Ljava/lang/String;)La/qg9;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, La/qg9;->f()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, La/hvk;->d(Ljava/lang/String;)La/fvk;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    new-instance p1, La/abe0;

    .line 79
    .line 80
    invoke-direct {p1, p0}, La/abe0;-><init>(La/fvk;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object p1, v1

    .line 85
    :goto_1
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-static {p1, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    return v2

    .line 91
    :cond_3
    const/4 p0, 0x0

    .line 92
    return p0
.end method

.method public b(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/me8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/me8;

    .line 7
    .line 8
    iget v1, v0, La/me8;->n:I

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
    iput v1, v0, La/me8;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/me8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/me8;-><init>(La/ln4;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/me8;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/me8;->n:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/me8;->k:Ljava/util/Iterator;

    .line 38
    .line 39
    iget-object v2, v0, La/me8;->j:La/gbe0;

    .line 40
    .line 41
    iget-object v5, v0, La/me8;->i:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, La/ln4;->a:La/us00;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v5, p2

    .line 74
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_7

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p0, p2}, La/ln4;->a(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_3

    .line 91
    .line 92
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {p2}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    new-instance v7, La/k1x;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-direct {v7, v5}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    iput-object p2, v7, La/k1x;->c:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v6, v7, La/k1x;->i:Ljava/lang/String;

    .line 109
    .line 110
    iput-object v6, v7, La/k1x;->f:Ljava/lang/String;

    .line 111
    .line 112
    sget-object p2, La/vi9;->c:La/vi9;

    .line 113
    .line 114
    iput-object p2, v7, La/k1x;->m:La/vi9;

    .line 115
    .line 116
    iput-object p2, v7, La/k1x;->n:La/vi9;

    .line 117
    .line 118
    iput-object p2, v7, La/k1x;->o:La/vi9;

    .line 119
    .line 120
    invoke-virtual {v7}, La/k1x;->a()La/o1x;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    iput-object v5, v0, La/me8;->i:Landroid/content/Context;

    .line 125
    .line 126
    iput-object v2, v0, La/me8;->j:La/gbe0;

    .line 127
    .line 128
    iput-object p1, v0, La/me8;->k:Ljava/util/Iterator;

    .line 129
    .line 130
    iput v3, v0, La/me8;->n:I

    .line 131
    .line 132
    invoke-virtual {v2, p2, v0}, La/gbe0;->c(La/o1x;La/zje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-ne p2, v1, :cond_4

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_4
    :goto_2
    check-cast p2, La/u1x;

    .line 140
    .line 141
    instance-of v6, p2, La/hhn0;

    .line 142
    .line 143
    if-nez v6, :cond_3

    .line 144
    .line 145
    instance-of v6, p2, La/r1o;

    .line 146
    .line 147
    if-eqz v6, :cond_5

    .line 148
    .line 149
    check-cast p2, La/r1o;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    move-object p2, v4

    .line 153
    :goto_3
    if-eqz p2, :cond_3

    .line 154
    .line 155
    iget-object p2, p2, La/r1o;->c:Ljava/lang/Throwable;

    .line 156
    .line 157
    invoke-static {p2}, La/saj;->Y(Ljava/lang/Throwable;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-nez v6, :cond_6

    .line 162
    .line 163
    instance-of v6, p2, Ljava/io/IOException;

    .line 164
    .line 165
    if-nez v6, :cond_6

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    throw p2

    .line 169
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0
.end method

.method public c(Landroid/os/Bundle;IJ)V
    .locals 3

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    iget-object p0, p0, La/ln4;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/app/AlarmManager;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/app/AlarmManager;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 21
    .line 22
    const-class v2, Lorg/xplatform/authreminder/impl/data/AuthReminderBroadcastReceiver;

    .line 23
    .line 24
    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/high16 v1, 0x4000000

    .line 35
    .line 36
    invoke-static {p0, p2, p1, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-virtual {v0, p1, p3, p4, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
