.class public final La/r0h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/miu0;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:La/liu0;

.field public final c:Landroid/os/Bundle;

.field public final d:La/glz;

.field public final e:La/kd30;


# direct methods
.method public constructor <init>(Landroid/app/Application;La/i0h0;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, La/i0h0;->h()La/kd30;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La/r0h0;->e:La/kd30;

    .line 9
    .line 10
    invoke-interface {p2}, La/clz;->x()La/glz;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, La/r0h0;->d:La/glz;

    .line 15
    .line 16
    iput-object p3, p0, La/r0h0;->c:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, La/r0h0;->a:Landroid/app/Application;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget-object p2, La/liu0;->c:La/liu0;

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    new-instance p2, La/liu0;

    .line 27
    .line 28
    invoke-direct {p2, p1}, La/liu0;-><init>(Landroid/app/Application;)V

    .line 29
    .line 30
    .line 31
    sput-object p2, La/liu0;->c:La/liu0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p2, La/liu0;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-direct {p2, p1}, La/liu0;-><init>(Landroid/app/Application;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    iput-object p2, p0, La/r0h0;->b:La/liu0;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(La/sgy;La/by40;)La/diu0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, p2}, La/r0h0;->c(Ljava/lang/Class;La/by40;)La/diu0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final b(Ljava/lang/Class;)La/diu0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, La/r0h0;->d(Ljava/lang/Class;Ljava/lang/String;)La/diu0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 13
    .line 14
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final c(Ljava/lang/Class;La/by40;)La/diu0;
    .locals 4

    .line 1
    iget-object v0, p2, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v1, La/oiu0;->a:La/kys0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    sget-object v3, La/zzg0;->a:La/lme0;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    sget-object v3, La/zzg0;->b:La/gne0;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    sget-object v1, La/liu0;->d:La/wxs0;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Application;

    .line 37
    .line 38
    const-class v1, La/m33;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v2, La/s0h0;->a:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p1, v2}, La/s0h0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v2, La/s0h0;->b:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {p1, v2}, La/s0h0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget-object p0, p0, La/r0h0;->b:La/liu0;

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2}, La/liu0;->c(Ljava/lang/Class;La/by40;)La/diu0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    if-eqz v1, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-static {p2}, La/zzg0;->a(La/by40;)La/vzg0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p1, v2, p0}, La/s0h0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/diu0;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_2
    invoke-static {p2}, La/zzg0;->a(La/by40;)La/vzg0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p1, v2, p0}, La/s0h0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/diu0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_3
    iget-object p2, p0, La/r0h0;->d:La/glz;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, p1, v1}, La/r0h0;->d(Ljava/lang/Class;Ljava/lang/String;)La/diu0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_4
    const-string p0, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 110
    .line 111
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :cond_5
    const-string p0, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 116
    .line 117
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v2
.end method

.method public final d(Ljava/lang/Class;Ljava/lang/String;)La/diu0;
    .locals 7

    .line 1
    iget-object v0, p0, La/r0h0;->d:La/glz;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    const-class v1, La/m33;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, La/r0h0;->a:Landroid/app/Application;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v3, La/s0h0;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1, v3}, La/s0h0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v3, La/s0h0;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {p1, v3}, La/s0h0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    if-nez v3, :cond_3

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, La/r0h0;->b:La/liu0;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/liu0;->b(Ljava/lang/Class;)La/diu0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, La/niu0;->a:La/niu0;

    .line 42
    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    new-instance p0, La/niu0;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object p0, La/niu0;->a:La/niu0;

    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0, p1}, La/niu0;->b(Ljava/lang/Class;)La/diu0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    iget-object v4, p0, La/r0h0;->e:La/kd30;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, p2}, La/kd30;->H(Ljava/lang/String;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    iget-object v5, p0, La/r0h0;->c:Landroid/os/Bundle;

    .line 69
    .line 70
    :cond_4
    if-nez v5, :cond_5

    .line 71
    .line 72
    new-instance p0, La/vzg0;

    .line 73
    .line 74
    invoke-direct {p0}, La/vzg0;-><init>()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    const-class p0, La/vzg0;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, p0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v5}, La/b8k0;->a0(Landroid/os/Bundle;)La/jo20;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v5, La/vzg0;

    .line 95
    .line 96
    invoke-direct {v5, p0}, La/vzg0;-><init>(La/jo20;)V

    .line 97
    .line 98
    .line 99
    move-object p0, v5

    .line 100
    :goto_1
    new-instance v5, La/wzg0;

    .line 101
    .line 102
    invoke-direct {v5, p2, p0}, La/wzg0;-><init>(Ljava/lang/String;La/vzg0;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v4, v0}, La/wzg0;->a(La/kd30;La/glz;)V

    .line 106
    .line 107
    .line 108
    iget-object p2, v0, La/glz;->i:La/lkz;

    .line 109
    .line 110
    sget-object v6, La/lkz;->b:La/lkz;

    .line 111
    .line 112
    if-eq p2, v6, :cond_7

    .line 113
    .line 114
    sget-object v6, La/lkz;->d:La/lkz;

    .line 115
    .line 116
    invoke-virtual {p2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-ltz p2, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    new-instance p2, La/lz2;

    .line 124
    .line 125
    const/4 v6, 0x4

    .line 126
    invoke-direct {p2, v0, v4, v6}, La/lz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p2}, La/glz;->a(La/blz;)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    :goto_2
    invoke-virtual {v4}, La/kd30;->V()V

    .line 134
    .line 135
    .line 136
    :goto_3
    if-eqz v1, :cond_8

    .line 137
    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p1, v3, p0}, La/s0h0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/diu0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    goto :goto_4

    .line 149
    :cond_8
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p1, v3, p0}, La/s0h0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/diu0;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :goto_4
    const-string p1, "androidx.lifecycle.savedstate.vm.tag"

    .line 158
    .line 159
    invoke-virtual {p0, p1, v5}, La/diu0;->s(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_9
    const-string p0, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 164
    .line 165
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/4 p0, 0x0

    .line 169
    return-object p0
.end method
