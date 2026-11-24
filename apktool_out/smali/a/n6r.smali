.class public final La/n6r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wmv;
.implements La/i0h0;
.implements La/riu0;


# instance fields
.field public final synthetic a:B

.field public final b:La/piu0;

.field public c:La/glz;

.field public d:La/miu0;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kd30;La/piu0;La/glz;La/miu0;La/wbf;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/n6r;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/n6r;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/n6r;->b:La/piu0;

    .line 10
    .line 11
    iput-object p3, p0, La/n6r;->c:La/glz;

    .line 12
    .line 13
    iput-object p4, p0, La/n6r;->d:La/miu0;

    .line 14
    .line 15
    iput-object p5, p0, La/n6r;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, La/n6r;->g:Ljava/lang/Object;

    .line 18
    .line 19
    const-string p2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, La/kd30;->L(Ljava/lang/String;)La/g0h0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-static {p0}, La/zzg0;->b(La/i0h0;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;La/piu0;La/vwq;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/n6r;->a:B

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, La/n6r;->c:La/glz;

    .line 33
    iput-object v0, p0, La/n6r;->g:Ljava/lang/Object;

    .line 34
    iput-object p1, p0, La/n6r;->e:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, La/n6r;->b:La/piu0;

    .line 36
    iput-object p3, p0, La/n6r;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(La/kkz;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/n6r;->c:La/glz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/glz;->d(La/kkz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, La/n6r;->c:La/glz;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/glz;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, La/glz;-><init>(La/clz;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/n6r;->c:La/glz;

    .line 12
    .line 13
    new-instance v0, La/h0h0;

    .line 14
    .line 15
    new-instance v1, La/a7g0;

    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, La/h0h0;-><init>(La/i0h0;La/a7g0;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/nw20;

    .line 26
    .line 27
    invoke-direct {v1, v0}, La/nw20;-><init>(La/h0h0;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, La/n6r;->g:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v0}, La/h0h0;->a()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/n6r;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/vwq;

    .line 38
    .line 39
    invoke-virtual {p0}, La/vwq;->run()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final g()La/piu0;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n6r;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n6r;->b:La/piu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object v1

    .line 9
    :pswitch_0
    invoke-virtual {p0}, La/n6r;->b()V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()La/kd30;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n6r;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/n6r;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/kd30;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, La/n6r;->b()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/n6r;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/nw20;

    .line 17
    .line 18
    iget-object p0, p0, La/nw20;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/kd30;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()La/miu0;
    .locals 4

    .line 1
    iget-byte v0, p0, La/n6r;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/n6r;->d:La/miu0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object v0, p0, La/n6r;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->y1:La/r0h0;

    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    iput-object v1, p0, La/n6r;->d:La/miu0;

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-object v1, p0, La/n6r;->d:La/miu0;

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    instance-of v2, v1, Landroid/app/Application;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    check-cast v1, Landroid/app/Application;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    :goto_1
    new-instance v2, La/r0h0;

    .line 56
    .line 57
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-direct {v2, v1, v0, v3}, La/r0h0;-><init>(Landroid/app/Application;La/i0h0;Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, La/n6r;->d:La/miu0;

    .line 63
    .line 64
    move-object v1, v2

    .line 65
    :cond_3
    :goto_2
    return-object v1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o()La/by40;
    .locals 8

    .line 1
    iget-byte v0, p0, La/n6r;->a:B

    .line 2
    .line 3
    sget-object v1, La/zzg0;->b:La/gne0;

    .line 4
    .line 5
    sget-object v2, La/zzg0;->a:La/lme0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    sget-object v4, La/zzg0;->c:La/cge0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, La/by40;

    .line 14
    .line 15
    iget-object v5, p0, La/n6r;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, La/wbf;

    .line 18
    .line 19
    invoke-direct {v0, v5}, La/by40;-><init>(La/wbf;)V

    .line 20
    .line 21
    .line 22
    iget-object v5, p0, La/n6r;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Landroid/os/Bundle;

    .line 25
    .line 26
    sget-object v6, La/lun;->a:La/lun;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-array v6, v3, [Lkotlin/Pair;

    .line 32
    .line 33
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, [Lkotlin/Pair;

    .line 38
    .line 39
    invoke-static {v3}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-object v6, v0, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Landroid/os/Bundle;

    .line 50
    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-interface {v6, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-interface {v6, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    iget-object v0, p0, La/n6r;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_0
    instance-of v6, v5, Landroid/content/ContextWrapper;

    .line 85
    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    instance-of v6, v5, Landroid/app/Application;

    .line 89
    .line 90
    if-eqz v6, :cond_1

    .line 91
    .line 92
    check-cast v5, Landroid/app/Application;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    check-cast v5, Landroid/content/ContextWrapper;

    .line 96
    .line 97
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const/4 v5, 0x0

    .line 103
    :goto_1
    new-instance v6, La/by40;

    .line 104
    .line 105
    invoke-direct {v6, v3}, La/by40;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iget-object v3, v6, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    sget-object v7, La/liu0;->d:La/wxs0;

    .line 113
    .line 114
    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 124
    .line 125
    if-eqz p0, :cond_4

    .line 126
    .line 127
    invoke-interface {v3, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_4
    return-object v6

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x()La/glz;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n6r;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/n6r;->c:La/glz;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    invoke-virtual {p0}, La/n6r;->b()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/n6r;->c:La/glz;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
