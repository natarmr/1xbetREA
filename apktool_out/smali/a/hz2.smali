.class public final La/hz2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, La/hz2;->a:Landroid/content/Context;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/hz2;->a:Landroid/content/Context;

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/hyi;
    .locals 14

    .line 1
    iget-object p0, p0, La/hz2;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/hyi;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/j47;->o:La/nho;

    .line 11
    .line 12
    invoke-static {v1}, La/nbl;->a(La/o5d0;)La/o5d0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, La/hyi;->a:La/o5d0;

    .line 17
    .line 18
    new-instance v1, La/ubf;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, v2}, La/ubf;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, La/hyi;->b:La/ubf;

    .line 25
    .line 26
    new-instance p0, La/ubf;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {p0, v1, v3}, La/ubf;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v4, La/id40;

    .line 33
    .line 34
    invoke-direct {v4, v1, p0, v3}, La/id40;-><init>(La/o5d0;La/o5d0;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, La/nbl;->a(La/o5d0;)La/o5d0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v0, La/hyi;->c:La/o5d0;

    .line 42
    .line 43
    iget-object p0, v0, La/hyi;->b:La/ubf;

    .line 44
    .line 45
    new-instance v1, La/mho;

    .line 46
    .line 47
    invoke-direct {v1, p0, v2}, La/mho;-><init>(La/o5d0;B)V

    .line 48
    .line 49
    .line 50
    iput-object v1, v0, La/hyi;->d:La/mho;

    .line 51
    .line 52
    new-instance v1, La/mho;

    .line 53
    .line 54
    invoke-direct {v1, p0, v3}, La/mho;-><init>(La/o5d0;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, La/nbl;->a(La/o5d0;)La/o5d0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object v1, v0, La/hyi;->d:La/mho;

    .line 62
    .line 63
    new-instance v4, La/id40;

    .line 64
    .line 65
    invoke-direct {v4, v1, p0, v2}, La/id40;-><init>(La/o5d0;La/o5d0;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, La/nbl;->a(La/o5d0;)La/o5d0;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iput-object v8, v0, La/hyi;->e:La/o5d0;

    .line 73
    .line 74
    new-instance p0, La/nho;

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    invoke-direct {p0, v1}, La/nho;-><init>(B)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, La/hyi;->b:La/ubf;

    .line 81
    .line 82
    new-instance v9, La/n2h0;

    .line 83
    .line 84
    invoke-direct {v9, v1, v8, p0, v3}, La/n2h0;-><init>(La/o5d0;La/o5d0;La/o5d0;B)V

    .line 85
    .line 86
    .line 87
    iget-object v6, v0, La/hyi;->a:La/o5d0;

    .line 88
    .line 89
    iget-object v7, v0, La/hyi;->c:La/o5d0;

    .line 90
    .line 91
    new-instance v5, La/twj;

    .line 92
    .line 93
    move-object v10, v8

    .line 94
    move-object v13, v9

    .line 95
    move-object v9, v8

    .line 96
    move-object v8, v13

    .line 97
    invoke-direct/range {v5 .. v10}, La/twj;-><init>(La/o5d0;La/o5d0;La/n2h0;La/o5d0;La/o5d0;)V

    .line 98
    .line 99
    .line 100
    move-object p0, v9

    .line 101
    move-object v9, v8

    .line 102
    move-object v8, p0

    .line 103
    move-object p0, v5

    .line 104
    new-instance v5, La/znt0;

    .line 105
    .line 106
    move-object v11, v8

    .line 107
    move-object v12, v8

    .line 108
    move-object v10, v6

    .line 109
    move-object v6, v1

    .line 110
    invoke-direct/range {v5 .. v12}, La/znt0;-><init>(La/o5d0;La/o5d0;La/o5d0;La/n2h0;La/o5d0;La/o5d0;La/o5d0;)V

    .line 111
    .line 112
    .line 113
    move-object v6, v10

    .line 114
    new-instance v1, La/bpv0;

    .line 115
    .line 116
    invoke-direct {v1, v6, v8, v9, v8}, La/bpv0;-><init>(La/o5d0;La/o5d0;La/n2h0;La/o5d0;)V

    .line 117
    .line 118
    .line 119
    new-instance v3, La/n2h0;

    .line 120
    .line 121
    invoke-direct {v3, p0, v5, v1, v2}, La/n2h0;-><init>(La/o5d0;La/o5d0;La/o5d0;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, La/nbl;->a(La/o5d0;)La/o5d0;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iput-object p0, v0, La/hyi;->f:La/o5d0;

    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-class v0, Landroid/content/Context;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, " must be set"

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0
.end method

.method public b(La/atf0;)Landroid/graphics/Typeface;
    .locals 7

    .line 1
    iget-object p0, p0, La/hz2;->a:Landroid/content/Context;

    .line 2
    .line 3
    instance-of v0, p1, La/atf0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    iget v0, p1, La/atf0;->a:I

    .line 9
    .line 10
    invoke-static {v0, p0}, La/itf0;->a(ILandroid/content/Context;)Landroid/graphics/Typeface;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, La/atf0;->c:La/osq;

    .line 18
    .line 19
    iget-object p1, p1, La/osq;->a:Ljava/util/List;

    .line 20
    .line 21
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v3, 0x1a

    .line 24
    .line 25
    if-lt v2, v3, :cond_1

    .line 26
    .line 27
    sget-object v3, La/p0t0;->a:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    :cond_1
    move-object v1, v0

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_2
    sget-object v3, La/p0t0;->a:Ljava/lang/ThreadLocal;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Landroid/graphics/Paint;

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    new-instance v4, Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-static {v4}, La/jw90;->r(Landroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const/16 v3, 0x1f

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    if-lt v2, v3, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, La/ow2;->a(Landroid/content/res/Configuration;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const v6, 0x7fffffff

    .line 88
    .line 89
    .line 90
    if-ne v2, v6, :cond_5

    .line 91
    .line 92
    :cond_4
    move p0, v5

    .line 93
    goto :goto_0

    .line 94
    :cond_5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/ow2;->a(Landroid/content/res/Configuration;)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    :goto_0
    if-nez p0, :cond_6

    .line 107
    .line 108
    new-instance p0, La/er90;

    .line 109
    .line 110
    invoke-direct {p0, v0}, La/er90;-><init>(La/a7k;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v1, p0, v3}, La/qf00;->a(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-gtz v0, :cond_8

    .line 123
    .line 124
    const/high16 v0, 0x43c80000    # 400.0f

    .line 125
    .line 126
    int-to-float p0, p0

    .line 127
    add-float/2addr p0, v0

    .line 128
    const/high16 v0, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 131
    .line 132
    invoke-static {p0, v0, v1}, La/l1e0;->c(FFF)F

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_7

    .line 141
    .line 142
    const-string p1, ","

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_7
    const-string p1, ""

    .line 146
    .line 147
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p1, "\'wght\' "

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_2
    invoke-static {v4, p0}, La/jw90;->s(Landroid/graphics/Paint;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_3

    .line 175
    :cond_8
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {}, La/hny;->b()V

    .line 183
    .line 184
    .line 185
    :cond_9
    :goto_3
    return-object v1
.end method

.method public c()La/zbf;
    .locals 6

    .line 1
    iget-object p0, p0, La/hz2;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/16 v2, 0x84

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    array-length v2, v0

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v2, :cond_1

    .line 29
    .line 30
    aget-object v4, v0, v3

    .line 31
    .line 32
    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    const-string v5, "androidx.credentials.CREDENTIAL_PROVIDER_KEY"

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v1, v2

    .line 67
    :catchall_0
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/String;

    .line 78
    .line 79
    :try_start_0
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-class v4, Landroid/content/Context;

    .line 84
    .line 85
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast v3, La/zbf;

    .line 105
    .line 106
    invoke-interface {v3}, La/zbf;->isAvailableOnDevice()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    const-string v3, "CredProviderFactory"

    .line 115
    .line 116
    const-string v4, "Only one active OEM CredentialProvider allowed"

    .line 117
    .line 118
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move-object v1, v3

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    move-object v2, v1

    .line 125
    :goto_2
    return-object v2
.end method
