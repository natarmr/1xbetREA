.class public final La/afm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zmh0;
.implements La/zf60;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/ngw0;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements La/mff0;
.implements La/n7x0;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, La/afm0;->a:B

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 124
    iput-object v0, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 106
    iput-byte p1, p0, La/afm0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/azj0;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, La/afm0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 102
    new-instance p1, La/jmv0;

    const/16 v0, 0x10

    invoke-direct {p1, p0, v0}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/bwl0;La/aja;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, La/afm0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 105
    iput-object p2, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/fuj0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/afm0;->a:B

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/afm0;->b:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/afm0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sparse-switch p2, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, La/goi0;

    .line 16
    .line 17
    const/16 p2, 0x1d

    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, La/rbt0;

    .line 31
    .line 32
    invoke-direct {p1, p0, v0}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance p1, La/nxo0;

    .line 44
    .line 45
    const/16 p2, 0x11

    .line 46
    .line 47
    invoke-direct {p1, p0, p2}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, La/nxo0;

    .line 59
    .line 60
    invoke-direct {p1, p0, v0}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    new-instance p1, La/jfm0;

    .line 72
    .line 73
    const/16 p2, 0x14

    .line 74
    .line 75
    invoke-direct {p1, p0, p2}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance p1, La/jfm0;

    .line 87
    .line 88
    const/4 p2, 0x4

    .line 89
    invoke-direct {p1, p0, p2}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 93
    .line 94
    return-void

    .line 95
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x3 -> :sswitch_3
        0x4 -> :sswitch_2
        0x5 -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/knf0;La/pmi0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/afm0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p2, p0, La/afm0;->b:Ljava/lang/Object;

    .line 112
    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/nmt0;La/hcp0;)V
    .locals 1

    const/16 v0, 0x15

    iput-byte v0, p0, La/afm0;->a:B

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/afm0;->b:Ljava/lang/Object;

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/okt0;La/btt0;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/afm0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 118
    iput-object p2, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/pmi0;La/knf0;B)V
    .locals 0

    const/4 p3, 0x6

    iput-byte p3, p0, La/afm0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 109
    iput-object p2, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/s88;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0x16

    iput-byte p1, p0, La/afm0;->a:B

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/afm0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us00;La/gii0;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, La/afm0;->a:B

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 115
    new-instance p1, La/lkr0;

    const/4 v0, 0x3

    invoke-direct {p1, p2, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/w4x0;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/afm0;->a:B

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wdk0;La/ii;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/afm0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 121
    iput-object p2, p0, La/afm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xrs0;)V
    .locals 2

    const/16 v0, 0x9

    iput-byte v0, p0, La/afm0;->a:B

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 126
    new-instance p1, La/q8b;

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 127
    invoke-direct {p1, v1, v0}, La/q8b;-><init>([BI)V

    .line 128
    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 95
    iput-byte p3, p0, La/afm0;->a:B

    iput-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/afm0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static s(La/yx5;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/sa4;

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    invoke-direct {v1, p1, v2}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 10
    .line 11
    .line 12
    const-string p1, "REQUEST_ACTION_SELECTOR_DIALOG_KEY"

    .line 13
    .line 14
    invoke-virtual {v0, p1, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(La/fq80;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xrs0;

    .line 4
    .line 5
    iget-object v1, v0, La/xrs0;->h:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/q8b;

    .line 10
    .line 11
    invoke-virtual {p1}, La/fq80;->z()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p1}, La/fq80;->z()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    and-int/lit16 v2, v2, 0x80

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    const/4 v2, 0x6

    .line 28
    invoke-virtual {p1, v2}, La/fq80;->N(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, La/fq80;->a()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x4

    .line 36
    div-int/2addr v2, v3

    .line 37
    const/4 v4, 0x0

    .line 38
    move v5, v4

    .line 39
    :goto_0
    if-ge v5, v2, :cond_4

    .line 40
    .line 41
    iget-object v6, p0, La/q8b;->b:[B

    .line 42
    .line 43
    invoke-virtual {p1, v6, v4, v3}, La/fq80;->k([BII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v4}, La/q8b;->m(I)V

    .line 47
    .line 48
    .line 49
    const/16 v6, 0x10

    .line 50
    .line 51
    invoke-virtual {p0, v6}, La/q8b;->g(I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v7, 0x3

    .line 56
    invoke-virtual {p0, v7}, La/q8b;->o(I)V

    .line 57
    .line 58
    .line 59
    const/16 v7, 0xd

    .line 60
    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0, v7}, La/q8b;->o(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0, v7}, La/q8b;->g(I)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    new-instance v7, La/anh0;

    .line 78
    .line 79
    new-instance v8, La/ucs0;

    .line 80
    .line 81
    invoke-direct {v8, v0, v6}, La/ucs0;-><init>(La/xrs0;I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, v8}, La/anh0;-><init>(La/zmh0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget v6, v0, La/xrs0;->n:I

    .line 91
    .line 92
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    iput v6, v0, La/xrs0;->n:I

    .line 95
    .line 96
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-byte p0, v0, La/xrs0;->a:B

    .line 100
    .line 101
    const/4 p1, 0x2

    .line 102
    if-eq p0, p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_2
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/mmx;

    .line 4
    .line 5
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    check-cast p1, La/bqw0;

    .line 8
    .line 9
    new-instance v1, La/hiw0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v0, p2, v2}, La/hiw0;-><init>(La/mmx;Lcom/google/android/gms/tasks/TaskCompletionSource;B)V

    .line 13
    .line 14
    .line 15
    iget-object p2, v0, La/nav;->a:Landroid/content/Context;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p2}, La/grv0;->a(Landroid/content/Context;)La/o58;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0, v2, p2}, La/o58;->b(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget p2, p2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move p2, v2

    .line 33
    :goto_0
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lcom/google/android/gms/cloudmessaging/RegisterRequest;

    .line 36
    .line 37
    iput p2, p0, Lcom/google/android/gms/cloudmessaging/RegisterRequest;->f:I

    .line 38
    .line 39
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/hrw0;

    .line 44
    .line 45
    new-instance p2, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {p2, v0, v0, v2, v3}, Lcom/google/android/gms/common/api/ComplianceOptions;-><init>(IIIZ)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lcom/google/android/gms/common/api/ApiMetadata;

    .line 53
    .line 54
    new-instance v0, Lcom/google/android/gms/common/api/ApiMetadata;

    .line 55
    .line 56
    invoke-direct {v0, p2, v3}, Lcom/google/android/gms/common/api/ApiMetadata;-><init>(Lcom/google/android/gms/common/api/ComplianceOptions;Z)V

    .line 57
    .line 58
    .line 59
    iput-boolean v2, v0, Lcom/google/android/gms/common/api/ApiMetadata;->c:Z

    .line 60
    .line 61
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string v4, "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService"

    .line 66
    .line 67
    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget v4, La/lnw0;->a:I

    .line 71
    .line 72
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0, p2, v2}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p2, v2}, Lcom/google/android/gms/common/api/ApiMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :try_start_1
    iget-object p1, p1, La/hrw0;->a:Landroid/os/IBinder;

    .line 92
    .line 93
    invoke-interface {p1, v3, p2, p0, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public b(La/coq0;La/huo;La/zrs0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    instance-of v1, v0, La/ryu0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/ryu0;

    .line 9
    .line 10
    iget v2, v1, La/ryu0;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/ryu0;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/ryu0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/ryu0;-><init>(La/afm0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/ryu0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/ryu0;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/okt0;

    .line 55
    .line 56
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/btt0;

    .line 59
    .line 60
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance v5, La/jq40;

    .line 65
    .line 66
    move-object v10, p1

    .line 67
    move-wide v6, p2

    .line 68
    move-object/from16 v11, p4

    .line 69
    .line 70
    move-object/from16 v12, p5

    .line 71
    .line 72
    move-wide/from16 v8, p6

    .line 73
    .line 74
    invoke-direct/range {v5 .. v12}, La/jq40;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput v4, v1, La/ryu0;->k:I

    .line 78
    .line 79
    iget-object p1, v0, La/okt0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, La/rbt0;

    .line 82
    .line 83
    invoke-virtual {p1}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/qyu0;

    .line 88
    .line 89
    invoke-interface {p1, p0, v5, v1}, La/qyu0;->b(Ljava/lang/String;La/jq40;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v2, :cond_3

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_3
    :goto_1
    check-cast v0, La/dx5;

    .line 97
    .line 98
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/gq40;

    .line 103
    .line 104
    invoke-static {p0}, La/j0x;->N(La/gq40;)La/aq40;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public d(La/dow0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j7x0;

    .line 4
    .line 5
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rqw0;

    .line 8
    .line 9
    iget-object p1, p1, La/dow0;->a:La/atm0;

    .line 10
    .line 11
    iget-byte p0, p0, La/rqw0;->a:B

    .line 12
    .line 13
    packed-switch p0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-class p0, La/xow0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    const-class p0, La/f9x0;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_1
    const-class p0, La/cnw0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_2
    const-class p0, La/dnw0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_3
    const-class p0, La/ymw0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_4
    const-class p0, La/tmw0;

    .line 32
    .line 33
    :goto_0
    new-instance v1, La/m7x0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v1, v2, p0}, La/m7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, v0, La/j7x0;->a:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/h7x0;

    .line 55
    .line 56
    iget-object p0, p0, La/h7x0;->c:La/c7x0;

    .line 57
    .line 58
    invoke-interface {p0, p1}, La/c7x0;->a(La/atm0;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "No PrimitiveConstructor for "

    .line 70
    .line 71
    const-string v1, " available, see https://developers.google.com/tink/faq/registration_errors"

    .line 72
    .line 73
    invoke-static {v0, p1, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    instance-of v1, v0, La/syu0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/syu0;

    .line 9
    .line 10
    iget v2, v1, La/syu0;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/syu0;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/syu0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/syu0;-><init>(La/afm0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/syu0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/syu0;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/okt0;

    .line 55
    .line 56
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/btt0;

    .line 59
    .line 60
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance v5, La/jq40;

    .line 65
    .line 66
    move-object v10, p1

    .line 67
    move-wide v6, p2

    .line 68
    move-object/from16 v11, p4

    .line 69
    .line 70
    move-object/from16 v12, p5

    .line 71
    .line 72
    move-wide/from16 v8, p6

    .line 73
    .line 74
    invoke-direct/range {v5 .. v12}, La/jq40;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput v4, v1, La/syu0;->k:I

    .line 78
    .line 79
    iget-object p1, v0, La/okt0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, La/rbt0;

    .line 82
    .line 83
    invoke-virtual {p1}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/qyu0;

    .line 88
    .line 89
    invoke-interface {p1, p0, v5, v1}, La/qyu0;->c(Ljava/lang/String;La/jq40;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v2, :cond_3

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_3
    :goto_1
    check-cast v0, La/dx5;

    .line 97
    .line 98
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/gq40;

    .line 103
    .line 104
    invoke-static {p0}, La/j0x;->N(La/gq40;)La/aq40;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/uzt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/uzt0;

    .line 7
    .line 8
    iget v1, v0, La/uzt0;->k:I

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
    iput v1, v0, La/uzt0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/uzt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/uzt0;-><init>(La/afm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/uzt0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/uzt0;->k:I

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
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/rbt0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/mxt0;

    .line 59
    .line 60
    iput v3, v0, La/uzt0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, p3, v0}, La/mxt0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    if-ne p4, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p4, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p4}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public g(Ljava/lang/String;IIJZJLa/zje;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    iget-object v2, v0, La/afm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    instance-of v3, v1, La/t7n0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/t7n0;

    .line 15
    .line 16
    iget v4, v3, La/t7n0;->l:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/t7n0;->l:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/t7n0;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/t7n0;-><init>(La/afm0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/t7n0;->j:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/t7n0;->l:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    iget-wide v2, v3, La/t7n0;->i:J

    .line 45
    .line 46
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v1

    .line 50
    move-wide v1, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    return-object v0

    .line 59
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/pmi0;

    .line 69
    .line 70
    invoke-virtual {v2}, La/knf0;->b()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    new-instance v7, La/v7n0;

    .line 75
    .line 76
    move-object/from16 v14, p1

    .line 77
    .line 78
    move/from16 v10, p2

    .line 79
    .line 80
    move/from16 v8, p3

    .line 81
    .line 82
    move-wide/from16 v11, p4

    .line 83
    .line 84
    move/from16 v15, p6

    .line 85
    .line 86
    invoke-direct/range {v7 .. v15}, La/v7n0;-><init>(IIIJLjava/lang/String;Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    move-wide/from16 v1, p7

    .line 90
    .line 91
    iput-wide v1, v3, La/t7n0;->i:J

    .line 92
    .line 93
    iput v6, v3, La/t7n0;->l:I

    .line 94
    .line 95
    invoke-static {v7}, La/w7n0;->D(La/v7n0;)La/jo20;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v0, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/enj0;

    .line 102
    .line 103
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/x7n0;

    .line 108
    .line 109
    invoke-interface {v0, v5, v3}, La/x7n0;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-ne v0, v4, :cond_3

    .line 114
    .line 115
    return-object v4

    .line 116
    :cond_3
    :goto_1
    check-cast v0, La/dx5;

    .line 117
    .line 118
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/util/List;

    .line 123
    .line 124
    new-instance v3, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v5, v4

    .line 144
    check-cast v5, La/r7n0;

    .line 145
    .line 146
    iget-object v5, v5, La/r7n0;->h:Ljava/lang/Long;

    .line 147
    .line 148
    if-eqz v5, :cond_4

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    const-wide/16 v7, 0x0

    .line 155
    .line 156
    cmp-long v5, v5, v7

    .line 157
    .line 158
    if-lez v5, :cond_4

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 165
    .line 166
    const/16 v4, 0xa

    .line 167
    .line 168
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, La/r7n0;

    .line 190
    .line 191
    sget-object v5, La/sip;->b:La/sip;

    .line 192
    .line 193
    invoke-static {v4, v5, v1, v2}, La/s7n0;->A(La/r7n0;La/sip;J)La/nas;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    return-object v0
.end method

.method public h(La/xfw0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/hcp0;

    .line 4
    .line 5
    check-cast p1, La/ljw0;

    .line 6
    .line 7
    iget-object v1, p1, La/ljw0;->p:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/nmt0;

    .line 18
    .line 19
    invoke-static {v1, p1, v0, p0}, La/nmt0;->e(La/nmt0;La/ljw0;La/hcp0;La/ngw0;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p0, La/cmt0;

    .line 24
    .line 25
    iget-object v1, p1, La/ljw0;->p:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p1, La/ljw0;->o:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1}, La/ljw0;->a()Lcom/google/firebase/auth/zzc;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, v1, v2, p1}, La/cmt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, La/hcp0;->c(La/cmt0;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public i(Ljava/lang/String;IIJZLa/zje;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    iget-object v2, v0, La/afm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    instance-of v3, v1, La/u7n0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/u7n0;

    .line 15
    .line 16
    iget v4, v3, La/u7n0;->k:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/u7n0;->k:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/u7n0;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/u7n0;-><init>(La/afm0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/u7n0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/u7n0;->k:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0

    .line 55
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, La/pmi0;

    .line 65
    .line 66
    invoke-virtual {v2}, La/knf0;->b()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    new-instance v7, La/v7n0;

    .line 71
    .line 72
    move-object/from16 v14, p1

    .line 73
    .line 74
    move/from16 v10, p2

    .line 75
    .line 76
    move/from16 v8, p3

    .line 77
    .line 78
    move-wide/from16 v11, p4

    .line 79
    .line 80
    move/from16 v15, p6

    .line 81
    .line 82
    invoke-direct/range {v7 .. v15}, La/v7n0;-><init>(IIIJLjava/lang/String;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    iput v6, v3, La/u7n0;->k:I

    .line 86
    .line 87
    invoke-static {v7}, La/w7n0;->D(La/v7n0;)La/jo20;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v0, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, La/enj0;

    .line 94
    .line 95
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/x7n0;

    .line 100
    .line 101
    invoke-interface {v0, v1, v3}, La/x7n0;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v4, :cond_3

    .line 106
    .line 107
    return-object v4

    .line 108
    :cond_3
    :goto_1
    check-cast v1, La/dx5;

    .line 109
    .line 110
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/util/List;

    .line 115
    .line 116
    new-instance v1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    const-wide/16 v3, 0x0

    .line 130
    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    move-object v5, v2

    .line 138
    check-cast v5, La/r7n0;

    .line 139
    .line 140
    iget-object v5, v5, La/r7n0;->h:Ljava/lang/Long;

    .line 141
    .line 142
    if-eqz v5, :cond_4

    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v5

    .line 148
    cmp-long v3, v5, v3

    .line 149
    .line 150
    if-lez v3, :cond_4

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    const/16 v2, 0xa

    .line 159
    .line 160
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_6

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, La/r7n0;

    .line 182
    .line 183
    sget-object v5, La/sip;->c:La/sip;

    .line 184
    .line 185
    invoke-static {v2, v5, v3, v4}, La/s7n0;->A(La/r7n0;La/sip;J)La/nas;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    return-object v0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/hpq0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/hpq0;

    .line 11
    .line 12
    iget v3, v2, La/hpq0;->t:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/hpq0;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/hpq0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/hpq0;-><init>(La/afm0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/hpq0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/hpq0;->t:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/hpq0;->q:I

    .line 47
    .line 48
    iget v10, v2, La/hpq0;->p:I

    .line 49
    .line 50
    iget v11, v2, La/hpq0;->o:I

    .line 51
    .line 52
    iget-wide v12, v2, La/hpq0;->n:J

    .line 53
    .line 54
    iget-wide v14, v2, La/hpq0;->m:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/hpq0;->l:Ljava/lang/Throwable;

    .line 59
    .line 60
    iget-object v8, v2, La/hpq0;->k:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v5, v2, La/hpq0;->j:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v6, v2, La/hpq0;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v1, v3

    .line 70
    move v0, v4

    .line 71
    move v4, v10

    .line 72
    const/4 v3, 0x3

    .line 73
    move-wide/from16 v18, v14

    .line 74
    .line 75
    move-object v15, v2

    .line 76
    move-object v14, v5

    .line 77
    move v5, v11

    .line 78
    move-wide/from16 v10, v18

    .line 79
    .line 80
    move-wide/from16 v18, v12

    .line 81
    .line 82
    move-object v13, v6

    .line 83
    move-object v12, v8

    .line 84
    move-object v8, v7

    .line 85
    move-wide/from16 v6, v18

    .line 86
    .line 87
    goto/16 :goto_d

    .line 88
    .line 89
    :cond_1
    const/16 p4, 0x0

    .line 90
    .line 91
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object p4

    .line 97
    :cond_2
    const/16 p4, 0x0

    .line 98
    .line 99
    iget v4, v2, La/hpq0;->q:I

    .line 100
    .line 101
    iget v5, v2, La/hpq0;->p:I

    .line 102
    .line 103
    iget v6, v2, La/hpq0;->o:I

    .line 104
    .line 105
    iget-wide v7, v2, La/hpq0;->n:J

    .line 106
    .line 107
    iget-wide v10, v2, La/hpq0;->m:J

    .line 108
    .line 109
    iget-object v12, v2, La/hpq0;->l:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v13, v2, La/hpq0;->k:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v14, v2, La/hpq0;->j:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v15, v2, La/hpq0;->i:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move v0, v4

    .line 121
    move v4, v5

    .line 122
    move v5, v6

    .line 123
    move-wide v6, v7

    .line 124
    move-object v8, v12

    .line 125
    move-object v12, v13

    .line 126
    move-object v13, v15

    .line 127
    move-object v15, v2

    .line 128
    const/4 v2, 0x2

    .line 129
    goto/16 :goto_9

    .line 130
    .line 131
    :cond_3
    const/16 p4, 0x0

    .line 132
    .line 133
    iget v4, v2, La/hpq0;->p:I

    .line 134
    .line 135
    iget v5, v2, La/hpq0;->o:I

    .line 136
    .line 137
    iget-wide v6, v2, La/hpq0;->n:J

    .line 138
    .line 139
    iget-wide v10, v2, La/hpq0;->m:J

    .line 140
    .line 141
    iget-object v8, v2, La/hpq0;->l:Ljava/lang/Throwable;

    .line 142
    .line 143
    iget-object v12, v2, La/hpq0;->k:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v13, v2, La/hpq0;->j:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v14, v2, La/hpq0;->i:Ljava/lang/String;

    .line 148
    .line 149
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    move v1, v9

    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move-object v1, v14

    .line 157
    move-object v14, v13

    .line 158
    move-object v13, v1

    .line 159
    move-object v15, v2

    .line 160
    move v1, v9

    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_4
    const/16 p4, 0x0

    .line 164
    .line 165
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget-wide v4, La/cag0;->a:J

    .line 169
    .line 170
    const-wide/16 v6, 0x3

    .line 171
    .line 172
    move-object/from16 v13, p1

    .line 173
    .line 174
    move-object/from16 v14, p2

    .line 175
    .line 176
    move-object/from16 v12, p3

    .line 177
    .line 178
    move-object/from16 v8, p4

    .line 179
    .line 180
    move-object v15, v2

    .line 181
    move-wide v10, v6

    .line 182
    move v0, v9

    .line 183
    move-wide v6, v4

    .line 184
    const/4 v4, 0x0

    .line 185
    const/4 v5, 0x0

    .line 186
    :goto_1
    if-eqz v0, :cond_f

    .line 187
    .line 188
    :try_start_1
    iget-object v2, v1, La/afm0;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, La/pmi0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 191
    .line 192
    :try_start_2
    iget-object v9, v1, La/afm0;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v9, La/knf0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 195
    .line 196
    :try_start_3
    invoke-virtual {v9}, La/knf0;->c()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    iput-object v13, v15, La/hpq0;->i:Ljava/lang/String;

    .line 201
    .line 202
    iput-object v14, v15, La/hpq0;->j:Ljava/lang/String;

    .line 203
    .line 204
    iput-object v12, v15, La/hpq0;->k:Ljava/lang/String;

    .line 205
    .line 206
    iput-object v8, v15, La/hpq0;->l:Ljava/lang/Throwable;

    .line 207
    .line 208
    iput-wide v10, v15, La/hpq0;->m:J

    .line 209
    .line 210
    iput-wide v6, v15, La/hpq0;->n:J

    .line 211
    .line 212
    iput v5, v15, La/hpq0;->o:I

    .line 213
    .line 214
    iput v4, v15, La/hpq0;->p:I

    .line 215
    .line 216
    iput v0, v15, La/hpq0;->q:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 217
    .line 218
    const/4 v1, 0x1

    .line 219
    :try_start_4
    iput v1, v15, La/hpq0;->t:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 220
    .line 221
    :try_start_5
    iget-object v0, v2, La/pmi0;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, La/enj0;

    .line 224
    .line 225
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, La/epq0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 230
    .line 231
    move-wide/from16 v16, v10

    .line 232
    .line 233
    move-object v10, v0

    .line 234
    move-object v11, v9

    .line 235
    :try_start_6
    invoke-interface/range {v10 .. v15}, La/epq0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 239
    if-ne v0, v3, :cond_5

    .line 240
    .line 241
    :goto_2
    move-object v1, v3

    .line 242
    goto/16 :goto_c

    .line 243
    .line 244
    :cond_5
    move-object v2, v14

    .line 245
    move-object v14, v13

    .line 246
    move-object v13, v2

    .line 247
    move-object v2, v15

    .line 248
    move-wide/from16 v10, v16

    .line 249
    .line 250
    :goto_3
    :try_start_7
    check-cast v0, La/dx5;

    .line 251
    .line 252
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, La/kpq0;

    .line 257
    .line 258
    invoke-static {v0}, La/jtt0;->s(La/kpq0;)La/gpq0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v0, v0, La/gpq0;->a:Ljava/util/List;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 263
    .line 264
    return-object v0

    .line 265
    :catchall_1
    move-exception v0

    .line 266
    move-object v15, v14

    .line 267
    move-object v14, v13

    .line 268
    move-object v13, v15

    .line 269
    move-object v15, v2

    .line 270
    goto :goto_6

    .line 271
    :catchall_2
    move-exception v0

    .line 272
    goto :goto_5

    .line 273
    :catchall_3
    move-exception v0

    .line 274
    :goto_4
    move-wide/from16 v16, v10

    .line 275
    .line 276
    :goto_5
    move-wide/from16 v10, v16

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :catchall_4
    move-exception v0

    .line 280
    move-wide/from16 v16, v10

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :catchall_5
    move-exception v0

    .line 284
    move-wide/from16 v16, v10

    .line 285
    .line 286
    const/4 v1, 0x1

    .line 287
    goto :goto_6

    .line 288
    :catchall_6
    move-exception v0

    .line 289
    move-wide/from16 v16, v10

    .line 290
    .line 291
    const/4 v1, 0x1

    .line 292
    goto :goto_5

    .line 293
    :catchall_7
    move-exception v0

    .line 294
    move v1, v9

    .line 295
    goto :goto_4

    .line 296
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_a

    .line 301
    .line 302
    if-nez v5, :cond_6

    .line 303
    .line 304
    new-instance v8, La/el50;

    .line 305
    .line 306
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    move v9, v1

    .line 310
    const/4 v0, 0x0

    .line 311
    :goto_7
    move-object/from16 v1, p0

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_6
    int-to-long v1, v4

    .line 315
    cmp-long v1, v1, v10

    .line 316
    .line 317
    if-gez v1, :cond_7

    .line 318
    .line 319
    const/4 v1, 0x1

    .line 320
    goto :goto_8

    .line 321
    :cond_7
    const/4 v1, 0x0

    .line 322
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 323
    .line 324
    if-eqz v1, :cond_9

    .line 325
    .line 326
    iput-object v13, v15, La/hpq0;->i:Ljava/lang/String;

    .line 327
    .line 328
    iput-object v14, v15, La/hpq0;->j:Ljava/lang/String;

    .line 329
    .line 330
    iput-object v12, v15, La/hpq0;->k:Ljava/lang/String;

    .line 331
    .line 332
    iput-object v8, v15, La/hpq0;->l:Ljava/lang/Throwable;

    .line 333
    .line 334
    iput-wide v10, v15, La/hpq0;->m:J

    .line 335
    .line 336
    iput-wide v6, v15, La/hpq0;->n:J

    .line 337
    .line 338
    iput v5, v15, La/hpq0;->o:I

    .line 339
    .line 340
    iput v4, v15, La/hpq0;->p:I

    .line 341
    .line 342
    iput v1, v15, La/hpq0;->q:I

    .line 343
    .line 344
    const/4 v2, 0x2

    .line 345
    iput v2, v15, La/hpq0;->t:I

    .line 346
    .line 347
    invoke-static {v6, v7, v15}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    if-ne v0, v3, :cond_8

    .line 352
    .line 353
    goto :goto_2

    .line 354
    :cond_8
    move v0, v1

    .line 355
    :goto_9
    move-object/from16 v1, p0

    .line 356
    .line 357
    const/4 v9, 0x1

    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_9
    const/4 v2, 0x2

    .line 361
    new-instance v8, La/el50;

    .line 362
    .line 363
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    move v0, v1

    .line 367
    :goto_a
    const/4 v9, 0x1

    .line 368
    goto :goto_7

    .line 369
    :cond_a
    const/4 v2, 0x2

    .line 370
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_e

    .line 375
    .line 376
    move-object v1, v3

    .line 377
    int-to-long v2, v4

    .line 378
    cmp-long v2, v2, v10

    .line 379
    .line 380
    if-gez v2, :cond_b

    .line 381
    .line 382
    const/4 v2, 0x1

    .line 383
    goto :goto_b

    .line 384
    :cond_b
    const/4 v2, 0x0

    .line 385
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 386
    .line 387
    if-eqz v2, :cond_d

    .line 388
    .line 389
    iput-object v13, v15, La/hpq0;->i:Ljava/lang/String;

    .line 390
    .line 391
    iput-object v14, v15, La/hpq0;->j:Ljava/lang/String;

    .line 392
    .line 393
    iput-object v12, v15, La/hpq0;->k:Ljava/lang/String;

    .line 394
    .line 395
    iput-object v8, v15, La/hpq0;->l:Ljava/lang/Throwable;

    .line 396
    .line 397
    iput-wide v10, v15, La/hpq0;->m:J

    .line 398
    .line 399
    iput-wide v6, v15, La/hpq0;->n:J

    .line 400
    .line 401
    iput v5, v15, La/hpq0;->o:I

    .line 402
    .line 403
    iput v4, v15, La/hpq0;->p:I

    .line 404
    .line 405
    iput v2, v15, La/hpq0;->q:I

    .line 406
    .line 407
    const/4 v3, 0x3

    .line 408
    iput v3, v15, La/hpq0;->t:I

    .line 409
    .line 410
    invoke-static {v6, v7, v15}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-ne v0, v1, :cond_c

    .line 415
    .line 416
    :goto_c
    return-object v1

    .line 417
    :cond_c
    move v0, v2

    .line 418
    :goto_d
    move-object v3, v1

    .line 419
    goto :goto_a

    .line 420
    :cond_d
    const/4 v3, 0x3

    .line 421
    new-instance v8, La/dag0;

    .line 422
    .line 423
    invoke-direct {v8, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 424
    .line 425
    .line 426
    move-object v3, v1

    .line 427
    move v0, v2

    .line 428
    goto :goto_a

    .line 429
    :cond_e
    move-object v1, v3

    .line 430
    const/4 v3, 0x3

    .line 431
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 432
    .line 433
    .line 434
    move-object v8, v0

    .line 435
    move-object v3, v1

    .line 436
    const/4 v0, 0x0

    .line 437
    goto :goto_a

    .line 438
    :cond_f
    if-nez v8, :cond_10

    .line 439
    .line 440
    const-string v0, "Unexpected error"

    .line 441
    .line 442
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    return-object p4

    .line 446
    :cond_10
    throw v8
.end method

.method public k(JLa/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/n4s0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/n4s0;

    .line 11
    .line 12
    iget v3, v2, La/n4s0;->u:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/n4s0;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/n4s0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/n4s0;-><init>(La/afm0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/n4s0;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/n4s0;->u:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v9, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget v1, v2, La/n4s0;->r:I

    .line 48
    .line 49
    iget v4, v2, La/n4s0;->q:I

    .line 50
    .line 51
    iget v7, v2, La/n4s0;->p:I

    .line 52
    .line 53
    iget-wide v10, v2, La/n4s0;->k:J

    .line 54
    .line 55
    iget-wide v12, v2, La/n4s0;->j:J

    .line 56
    .line 57
    iget-wide v14, v2, La/n4s0;->i:J

    .line 58
    .line 59
    iget-object v8, v2, La/n4s0;->o:Ljava/lang/Throwable;

    .line 60
    .line 61
    iget-object v5, v2, La/n4s0;->n:La/n4s0;

    .line 62
    .line 63
    iget-object v6, v2, La/n4s0;->m:La/afm0;

    .line 64
    .line 65
    move/from16 v17, v9

    .line 66
    .line 67
    iget-object v9, v2, La/n4s0;->l:La/afm0;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    move v0, v7

    .line 73
    move-object v7, v2

    .line 74
    move-object v2, v9

    .line 75
    move v9, v0

    .line 76
    move v0, v1

    .line 77
    const/4 v1, 0x3

    .line 78
    move-object/from16 v18, v6

    .line 79
    .line 80
    move v6, v4

    .line 81
    move-object/from16 v19, v8

    .line 82
    .line 83
    move-object v8, v5

    .line 84
    move-wide v4, v14

    .line 85
    move-object/from16 v15, v18

    .line 86
    .line 87
    move-wide v13, v12

    .line 88
    move-object/from16 v12, v19

    .line 89
    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object v2, v9

    .line 94
    goto/16 :goto_e

    .line 95
    .line 96
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 97
    .line 98
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v7

    .line 102
    :cond_2
    move/from16 v17, v9

    .line 103
    .line 104
    iget v1, v2, La/n4s0;->r:I

    .line 105
    .line 106
    iget v4, v2, La/n4s0;->q:I

    .line 107
    .line 108
    iget v5, v2, La/n4s0;->p:I

    .line 109
    .line 110
    iget-wide v6, v2, La/n4s0;->k:J

    .line 111
    .line 112
    iget-wide v8, v2, La/n4s0;->j:J

    .line 113
    .line 114
    iget-wide v10, v2, La/n4s0;->i:J

    .line 115
    .line 116
    iget-object v12, v2, La/n4s0;->o:Ljava/lang/Throwable;

    .line 117
    .line 118
    iget-object v13, v2, La/n4s0;->n:La/n4s0;

    .line 119
    .line 120
    iget-object v14, v2, La/n4s0;->m:La/afm0;

    .line 121
    .line 122
    iget-object v15, v2, La/n4s0;->l:La/afm0;

    .line 123
    .line 124
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    move v0, v1

    .line 128
    move-wide/from16 v16, v8

    .line 129
    .line 130
    move-object v8, v13

    .line 131
    const/4 v1, 0x2

    .line 132
    move v9, v5

    .line 133
    move-wide/from16 v18, v6

    .line 134
    .line 135
    move-object v7, v2

    .line 136
    move v6, v4

    .line 137
    move-wide v4, v10

    .line 138
    move-object v2, v15

    .line 139
    move-wide/from16 v10, v18

    .line 140
    .line 141
    goto/16 :goto_9

    .line 142
    .line 143
    :catchall_1
    move-exception v0

    .line 144
    move-object v2, v15

    .line 145
    goto/16 :goto_e

    .line 146
    .line 147
    :cond_3
    move/from16 v17, v9

    .line 148
    .line 149
    iget v1, v2, La/n4s0;->q:I

    .line 150
    .line 151
    iget v4, v2, La/n4s0;->p:I

    .line 152
    .line 153
    iget-wide v5, v2, La/n4s0;->k:J

    .line 154
    .line 155
    iget-wide v7, v2, La/n4s0;->j:J

    .line 156
    .line 157
    iget-wide v9, v2, La/n4s0;->i:J

    .line 158
    .line 159
    iget-object v11, v2, La/n4s0;->o:Ljava/lang/Throwable;

    .line 160
    .line 161
    iget-object v12, v2, La/n4s0;->n:La/n4s0;

    .line 162
    .line 163
    iget-object v13, v2, La/n4s0;->m:La/afm0;

    .line 164
    .line 165
    iget-object v14, v2, La/n4s0;->l:La/afm0;

    .line 166
    .line 167
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 168
    .line 169
    .line 170
    move-object v15, v13

    .line 171
    move-wide/from16 v18, v5

    .line 172
    .line 173
    move v6, v1

    .line 174
    move-object v5, v11

    .line 175
    move/from16 v1, v17

    .line 176
    .line 177
    move-wide/from16 v20, v9

    .line 178
    .line 179
    move-object v9, v12

    .line 180
    move-wide/from16 v10, v18

    .line 181
    .line 182
    move-wide/from16 v12, v20

    .line 183
    .line 184
    goto/16 :goto_4

    .line 185
    .line 186
    :catchall_2
    move-exception v0

    .line 187
    move-object v15, v13

    .line 188
    move-wide/from16 v18, v5

    .line 189
    .line 190
    move v6, v1

    .line 191
    move/from16 v1, v17

    .line 192
    .line 193
    move-wide/from16 v20, v7

    .line 194
    .line 195
    move-object v7, v2

    .line 196
    move-object v8, v12

    .line 197
    move-object v2, v14

    .line 198
    move-wide/from16 v13, v20

    .line 199
    .line 200
    move-object v12, v11

    .line 201
    move-wide/from16 v20, v9

    .line 202
    .line 203
    move v9, v4

    .line 204
    move-wide/from16 v10, v18

    .line 205
    .line 206
    :goto_1
    move-wide/from16 v4, v20

    .line 207
    .line 208
    goto/16 :goto_6

    .line 209
    .line 210
    :cond_4
    move/from16 v17, v9

    .line 211
    .line 212
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v1, La/afm0;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, La/roi0;

    .line 218
    .line 219
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, La/j0g0;

    .line 222
    .line 223
    if-eqz v0, :cond_5

    .line 224
    .line 225
    iget-object v4, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 226
    .line 227
    instance-of v4, v4, La/g0g0;

    .line 228
    .line 229
    xor-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    move/from16 v5, v17

    .line 232
    .line 233
    if-ne v4, v5, :cond_5

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_5
    move-object v0, v7

    .line 237
    :goto_2
    if-eqz v0, :cond_6

    .line 238
    .line 239
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 240
    .line 241
    return-object v0

    .line 242
    :cond_6
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 243
    .line 244
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 245
    .line 246
    const-wide/16 v8, 0x3

    .line 247
    .line 248
    move-wide v10, v4

    .line 249
    move-object v12, v7

    .line 250
    move-wide v13, v8

    .line 251
    const/4 v0, 0x1

    .line 252
    const/4 v6, 0x0

    .line 253
    const/4 v9, 0x0

    .line 254
    move-wide/from16 v4, p1

    .line 255
    .line 256
    move-object v7, v2

    .line 257
    move-object v8, v7

    .line 258
    move-object v2, v1

    .line 259
    :goto_3
    if-eqz v0, :cond_11

    .line 260
    .line 261
    :try_start_4
    iget-object v15, v1, La/afm0;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v15, La/g090;

    .line 264
    .line 265
    iput-object v2, v7, La/n4s0;->l:La/afm0;

    .line 266
    .line 267
    iput-object v1, v7, La/n4s0;->m:La/afm0;

    .line 268
    .line 269
    iput-object v8, v7, La/n4s0;->n:La/n4s0;

    .line 270
    .line 271
    iput-object v12, v7, La/n4s0;->o:Ljava/lang/Throwable;

    .line 272
    .line 273
    iput-wide v4, v7, La/n4s0;->i:J

    .line 274
    .line 275
    iput-wide v13, v7, La/n4s0;->j:J

    .line 276
    .line 277
    iput-wide v10, v7, La/n4s0;->k:J

    .line 278
    .line 279
    iput v9, v7, La/n4s0;->p:I

    .line 280
    .line 281
    iput v6, v7, La/n4s0;->q:I

    .line 282
    .line 283
    iput v0, v7, La/n4s0;->r:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 284
    .line 285
    move-object/from16 p0, v1

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    :try_start_5
    iput v1, v7, La/n4s0;->u:I

    .line 289
    .line 290
    iget-object v0, v15, La/g090;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, La/qir0;

    .line 293
    .line 294
    invoke-virtual {v0}, La/qir0;->invoke()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, La/lwr0;

    .line 299
    .line 300
    invoke-interface {v0, v4, v5, v7}, La/lwr0;->a(JLa/yje;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 304
    if-ne v0, v3, :cond_7

    .line 305
    .line 306
    goto/16 :goto_d

    .line 307
    .line 308
    :cond_7
    move-object/from16 v15, p0

    .line 309
    .line 310
    move-wide/from16 v18, v13

    .line 311
    .line 312
    move-object v14, v2

    .line 313
    move-object v2, v7

    .line 314
    move/from16 v20, v9

    .line 315
    .line 316
    move-object v9, v8

    .line 317
    move-wide/from16 v7, v18

    .line 318
    .line 319
    move-wide/from16 v18, v4

    .line 320
    .line 321
    move/from16 v4, v20

    .line 322
    .line 323
    move-object v5, v12

    .line 324
    move-wide/from16 v12, v18

    .line 325
    .line 326
    :goto_4
    :try_start_6
    check-cast v0, La/dx5;

    .line 327
    .line 328
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    check-cast v0, La/c5s0;

    .line 333
    .line 334
    invoke-static {v0}, La/k7n0;->E(La/c5s0;)La/q2s0;

    .line 335
    .line 336
    .line 337
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 338
    :try_start_7
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 339
    .line 340
    goto/16 :goto_f

    .line 341
    .line 342
    :catchall_3
    move-exception v0

    .line 343
    move-object v2, v14

    .line 344
    goto/16 :goto_e

    .line 345
    .line 346
    :catchall_4
    move-exception v0

    .line 347
    move-wide/from16 v18, v7

    .line 348
    .line 349
    move-object v7, v2

    .line 350
    move-object v8, v9

    .line 351
    move-object v2, v14

    .line 352
    move v9, v4

    .line 353
    move-wide/from16 v20, v12

    .line 354
    .line 355
    move-object v12, v5

    .line 356
    move-wide/from16 v13, v18

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :goto_5
    move-object/from16 v15, p0

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :catchall_5
    move-exception v0

    .line 364
    goto :goto_5

    .line 365
    :catchall_6
    move-exception v0

    .line 366
    move-object/from16 p0, v1

    .line 367
    .line 368
    const/4 v1, 0x1

    .line 369
    goto :goto_5

    .line 370
    :goto_6
    :try_start_8
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 371
    .line 372
    .line 373
    move-result v17

    .line 374
    if-eqz v17, :cond_d

    .line 375
    .line 376
    if-nez v9, :cond_8

    .line 377
    .line 378
    new-instance v12, La/el50;

    .line 379
    .line 380
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    :goto_7
    move-object v1, v15

    .line 384
    const/4 v0, 0x0

    .line 385
    goto :goto_3

    .line 386
    :catchall_7
    move-exception v0

    .line 387
    goto/16 :goto_e

    .line 388
    .line 389
    :cond_8
    move-object/from16 v17, v2

    .line 390
    .line 391
    int-to-long v1, v6

    .line 392
    cmp-long v1, v1, v13

    .line 393
    .line 394
    if-gez v1, :cond_9

    .line 395
    .line 396
    const/4 v1, 0x1

    .line 397
    goto :goto_8

    .line 398
    :cond_9
    const/4 v1, 0x0

    .line 399
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 400
    .line 401
    if-eqz v1, :cond_b

    .line 402
    .line 403
    move-object/from16 v2, v17

    .line 404
    .line 405
    iput-object v2, v7, La/n4s0;->l:La/afm0;

    .line 406
    .line 407
    iput-object v15, v7, La/n4s0;->m:La/afm0;

    .line 408
    .line 409
    iput-object v8, v7, La/n4s0;->n:La/n4s0;

    .line 410
    .line 411
    iput-object v12, v7, La/n4s0;->o:Ljava/lang/Throwable;

    .line 412
    .line 413
    iput-wide v4, v7, La/n4s0;->i:J

    .line 414
    .line 415
    iput-wide v13, v7, La/n4s0;->j:J

    .line 416
    .line 417
    iput-wide v10, v7, La/n4s0;->k:J

    .line 418
    .line 419
    iput v9, v7, La/n4s0;->p:I

    .line 420
    .line 421
    iput v6, v7, La/n4s0;->q:I

    .line 422
    .line 423
    iput v1, v7, La/n4s0;->r:I

    .line 424
    .line 425
    move/from16 p1, v1

    .line 426
    .line 427
    const/4 v1, 0x2

    .line 428
    iput v1, v7, La/n4s0;->u:I

    .line 429
    .line 430
    invoke-static {v10, v11, v8}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    if-ne v0, v3, :cond_a

    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_a
    move/from16 v0, p1

    .line 438
    .line 439
    move-wide/from16 v16, v13

    .line 440
    .line 441
    move-object v14, v15

    .line 442
    :goto_9
    move-object v1, v14

    .line 443
    move-wide/from16 v13, v16

    .line 444
    .line 445
    goto/16 :goto_3

    .line 446
    .line 447
    :cond_b
    move/from16 p1, v1

    .line 448
    .line 449
    move-object/from16 v2, v17

    .line 450
    .line 451
    const/4 v1, 0x2

    .line 452
    new-instance v12, La/el50;

    .line 453
    .line 454
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 455
    .line 456
    .line 457
    :cond_c
    :goto_a
    move/from16 v0, p1

    .line 458
    .line 459
    :goto_b
    move-object v1, v15

    .line 460
    goto/16 :goto_3

    .line 461
    .line 462
    :cond_d
    const/4 v1, 0x2

    .line 463
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 464
    .line 465
    .line 466
    move-result v16

    .line 467
    if-eqz v16, :cond_10

    .line 468
    .line 469
    move-object/from16 v17, v2

    .line 470
    .line 471
    int-to-long v1, v6

    .line 472
    cmp-long v1, v1, v13

    .line 473
    .line 474
    if-gez v1, :cond_e

    .line 475
    .line 476
    const/4 v1, 0x1

    .line 477
    goto :goto_c

    .line 478
    :cond_e
    const/4 v1, 0x0

    .line 479
    :goto_c
    add-int/lit8 v6, v6, 0x1

    .line 480
    .line 481
    if-eqz v1, :cond_f

    .line 482
    .line 483
    move-object/from16 v2, v17

    .line 484
    .line 485
    iput-object v2, v7, La/n4s0;->l:La/afm0;

    .line 486
    .line 487
    iput-object v15, v7, La/n4s0;->m:La/afm0;

    .line 488
    .line 489
    iput-object v8, v7, La/n4s0;->n:La/n4s0;

    .line 490
    .line 491
    iput-object v12, v7, La/n4s0;->o:Ljava/lang/Throwable;

    .line 492
    .line 493
    iput-wide v4, v7, La/n4s0;->i:J

    .line 494
    .line 495
    iput-wide v13, v7, La/n4s0;->j:J

    .line 496
    .line 497
    iput-wide v10, v7, La/n4s0;->k:J

    .line 498
    .line 499
    iput v9, v7, La/n4s0;->p:I

    .line 500
    .line 501
    iput v6, v7, La/n4s0;->q:I

    .line 502
    .line 503
    iput v1, v7, La/n4s0;->r:I

    .line 504
    .line 505
    move/from16 p1, v1

    .line 506
    .line 507
    const/4 v1, 0x3

    .line 508
    iput v1, v7, La/n4s0;->u:I

    .line 509
    .line 510
    invoke-static {v10, v11, v8}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-ne v0, v3, :cond_c

    .line 515
    .line 516
    :goto_d
    return-object v3

    .line 517
    :cond_f
    move/from16 p1, v1

    .line 518
    .line 519
    move-object/from16 v2, v17

    .line 520
    .line 521
    const/4 v1, 0x3

    .line 522
    new-instance v12, La/dag0;

    .line 523
    .line 524
    invoke-direct {v12, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 525
    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_10
    const/4 v1, 0x3

    .line 529
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 530
    .line 531
    .line 532
    move-object v12, v0

    .line 533
    goto/16 :goto_7

    .line 534
    .line 535
    :cond_11
    if-nez v12, :cond_12

    .line 536
    .line 537
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 538
    .line 539
    const-string v1, "Unexpected error"

    .line 540
    .line 541
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :cond_12
    throw v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 546
    :catchall_8
    move-exception v0

    .line 547
    move-object v2, v1

    .line 548
    :goto_e
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 549
    .line 550
    new-instance v1, La/g0g0;

    .line 551
    .line 552
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    move-object v0, v1

    .line 556
    move-object v14, v2

    .line 557
    :goto_f
    iget-object v1, v14, La/afm0;->c:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v1, La/roi0;

    .line 560
    .line 561
    new-instance v2, La/j0g0;

    .line 562
    .line 563
    invoke-direct {v2, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    iput-object v2, v1, La/roi0;->a:Ljava/lang/Object;

    .line 567
    .line 568
    return-object v0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/afm0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/s88;

    .line 10
    .line 11
    iget-object v0, v0, La/afm0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/j6;

    .line 14
    .line 15
    iget v4, v0, La/j6;->a:I

    .line 16
    .line 17
    iget v5, v0, La/j6;->b:I

    .line 18
    .line 19
    iget v0, v0, La/j6;->c:I

    .line 20
    .line 21
    iget-object v6, v2, La/xiv0;->a:La/uiv0;

    .line 22
    .line 23
    const/16 v7, 0x207

    .line 24
    .line 25
    invoke-virtual {v6, v7}, La/uiv0;->i(I)La/pfx;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    invoke-virtual {v6, v8}, La/uiv0;->i(I)La/pfx;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v8, v3, La/s88;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 38
    .line 39
    iget v9, v7, La/pfx;->b:I

    .line 40
    .line 41
    iget v10, v7, La/pfx;->c:I

    .line 42
    .line 43
    iget v11, v7, La/pfx;->a:I

    .line 44
    .line 45
    iput v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:I

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/4 v13, 0x1

    .line 52
    if-ne v9, v13, :cond_0

    .line 53
    .line 54
    move v9, v13

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v9, 0x0

    .line 57
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 66
    .line 67
    .line 68
    move-result v16

    .line 69
    iget-boolean v12, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 70
    .line 71
    if-eqz v12, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, La/xiv0;->a()I

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    iput v14, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 78
    .line 79
    add-int/2addr v14, v0

    .line 80
    :cond_1
    iget-boolean v0, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    move v0, v5

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v0, v4

    .line 89
    :goto_1
    add-int v15, v0, v11

    .line 90
    .line 91
    :cond_3
    iget-boolean v0, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v4, v5

    .line 99
    :goto_2
    add-int v16, v4, v10

    .line 100
    .line 101
    :cond_5
    move/from16 v0, v16

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 108
    .line 109
    iget-boolean v5, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 110
    .line 111
    if-eqz v5, :cond_6

    .line 112
    .line 113
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 114
    .line 115
    if-eq v5, v11, :cond_6

    .line 116
    .line 117
    iput v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 118
    .line 119
    move v5, v13

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const/4 v5, 0x0

    .line 122
    :goto_3
    iget-boolean v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 123
    .line 124
    if-eqz v9, :cond_7

    .line 125
    .line 126
    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 127
    .line 128
    if-eq v9, v10, :cond_7

    .line 129
    .line 130
    iput v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 131
    .line 132
    move v5, v13

    .line 133
    :cond_7
    iget-boolean v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 134
    .line 135
    if-eqz v9, :cond_8

    .line 136
    .line 137
    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 138
    .line 139
    iget v7, v7, La/pfx;->b:I

    .line 140
    .line 141
    if-eq v9, v7, :cond_8

    .line 142
    .line 143
    iput v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    move v13, v5

    .line 147
    :goto_4
    if-eqz v13, :cond_9

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-virtual {v1, v15, v4, v0, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 157
    .line 158
    .line 159
    iget-boolean v0, v3, La/s88;->b:Z

    .line 160
    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    iget v1, v6, La/pfx;->d:I

    .line 164
    .line 165
    iput v1, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:I

    .line 166
    .line 167
    :cond_a
    if-nez v12, :cond_c

    .line 168
    .line 169
    if-eqz v0, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_b
    return-object v2

    .line 173
    :cond_c
    :goto_5
    invoke-virtual {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U()V

    .line 174
    .line 175
    .line 176
    return-object v2
.end method

.method public m(JJLa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    iget-object v2, v0, La/afm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/aja;

    .line 8
    .line 9
    instance-of v3, v1, La/omt0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/omt0;

    .line 15
    .line 16
    iget v4, v3, La/omt0;->l:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/omt0;->l:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, La/omt0;

    .line 30
    .line 31
    invoke-direct {v3, v0, v1}, La/omt0;-><init>(La/afm0;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v1, v9, La/omt0;->j:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v3, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v4, v9, La/omt0;->l:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget-object v2, v9, La/omt0;->i:La/aja;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_4

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_5

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v10

    .line 61
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, v2, La/aja;->a:La/rfs;

    .line 65
    .line 66
    iget-object v1, v1, La/rfs;->a:La/p7m0;

    .line 67
    .line 68
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    instance-of v4, v1, La/bgs;

    .line 73
    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    check-cast v1, La/bgs;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-object v1, v10

    .line 80
    :goto_2
    if-eqz v1, :cond_4

    .line 81
    .line 82
    iget-object v1, v1, La/bgs;->d:La/zvl0;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v1, v10

    .line 86
    :goto_3
    if-nez v1, :cond_a

    .line 87
    .line 88
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 89
    .line 90
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v4, v0

    .line 93
    check-cast v4, La/bwl0;

    .line 94
    .line 95
    iput-object v2, v9, La/omt0;->i:La/aja;

    .line 96
    .line 97
    iput v5, v9, La/omt0;->l:I

    .line 98
    .line 99
    move-wide/from16 v5, p1

    .line 100
    .line 101
    move-wide/from16 v7, p3

    .line 102
    .line 103
    invoke-virtual/range {v4 .. v9}, La/bwl0;->a(JJLa/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-ne v1, v3, :cond_5

    .line 108
    .line 109
    return-object v3

    .line 110
    :cond_5
    :goto_4
    check-cast v1, La/zvl0;

    .line 111
    .line 112
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :goto_5
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 116
    .line 117
    new-instance v1, La/g0g0;

    .line 118
    .line 119
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :goto_6
    instance-of v0, v1, La/g0g0;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_6
    move-object v10, v1

    .line 128
    :goto_7
    move-object v15, v10

    .line 129
    check-cast v15, La/zvl0;

    .line 130
    .line 131
    if-nez v15, :cond_7

    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v0, v2, La/aja;->a:La/rfs;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, La/rfs;->a:La/p7m0;

    .line 145
    .line 146
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v2, v1

    .line 151
    check-cast v2, La/egs;

    .line 152
    .line 153
    instance-of v3, v2, La/bgs;

    .line 154
    .line 155
    if-eqz v3, :cond_9

    .line 156
    .line 157
    move-object v11, v2

    .line 158
    check-cast v11, La/bgs;

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x77

    .line 163
    .line 164
    const/4 v12, 0x0

    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    invoke-static/range {v11 .. v19}, La/bgs;->a(La/bgs;La/l9s;Ljava/util/List;Ljava/util/List;La/zvl0;La/p700;Ljava/util/List;ZI)La/bgs;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :cond_9
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_8

    .line 180
    .line 181
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0
.end method

.method public n(La/sys0;La/s77;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ort;

    .line 4
    .line 5
    iget-object v0, v0, La/ort;->a:La/gst0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    sget-object v0, La/s77;->c:La/s77;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne p2, v0, :cond_0

    .line 17
    .line 18
    if-nez p4, :cond_0

    .line 19
    .line 20
    move v6, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    move v6, v0

    .line 24
    :goto_0
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    check-cast v2, La/nc0;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eq p0, v1, :cond_4

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    if-eq p0, v0, :cond_3

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    if-eq p0, v0, :cond_2

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    if-eq p0, v0, :cond_1

    .line 43
    .line 44
    move-object v3, p2

    .line 45
    move-object v5, p3

    .line 46
    move-object v4, p4

    .line 47
    move-object v7, p5

    .line 48
    move-object v8, p6

    .line 49
    invoke-virtual/range {v2 .. v8}, La/nc0;->m(La/s77;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    move-object v3, p2

    .line 55
    move-object v8, p6

    .line 56
    invoke-virtual {v2, p1, v3, v8}, La/nc0;->p(La/sys0;La/s77;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    move-object v3, p2

    .line 62
    move-object v5, p3

    .line 63
    move-object v4, p4

    .line 64
    move-object v8, p6

    .line 65
    invoke-virtual {v2, v3, v5, v4, v8}, La/nc0;->e(La/s77;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_3
    move-object v3, p2

    .line 71
    move-object v8, p6

    .line 72
    invoke-virtual {v2, p1, v3, v8}, La/nc0;->f(La/sys0;La/s77;La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_4
    move-object v3, p2

    .line 78
    move-object v8, p6

    .line 79
    invoke-virtual {v2, p1, v3, v8}, La/nc0;->t(La/sys0;La/s77;La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_5
    new-instance p0, La/yxw;

    .line 85
    .line 86
    const-string p1, "The user is not authorized. History check will not complete"

    .line 87
    .line 88
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0
.end method

.method public o(JJJZZ)V
    .locals 10

    .line 1
    if-eqz p8, :cond_0

    .line 2
    .line 3
    const-string v0, "widget_favor_list"

    .line 4
    .line 5
    :goto_0
    move-object v8, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    const-string v0, "widget_favor_empty"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :goto_1
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, La/bn6;

    .line 14
    .line 15
    move-wide v2, p1

    .line 16
    move-wide v4, p3

    .line 17
    move-wide v6, p5

    .line 18
    move/from16 v9, p7

    .line 19
    .line 20
    invoke-virtual/range {v1 .. v9}, La/bn6;->d(JJJLjava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    check-cast v1, La/je;

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v9}, La/je;->g(JJJLjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/afm0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/firebase/auth/internal/RecaptchaActivity;

    .line 9
    .line 10
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    sget-object v1, Lcom/google/firebase/auth/internal/RecaptchaActivity;->Y:La/low0;

    .line 15
    .line 16
    new-instance v1, Landroid/content/Intent;

    .line 17
    .line 18
    const-string v2, "android.intent.action.VIEW"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v3, v1, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Landroid/content/Intent;

    .line 39
    .line 40
    const-string v5, "android.support.customtabs.action.CustomTabsService"

    .line 41
    .line 42
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/high16 v3, 0x10000000

    .line 50
    .line 51
    const/high16 v4, 0x40000000    # 2.0f

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    new-instance p0, La/mii0;

    .line 62
    .line 63
    const/16 v1, 0x16

    .line 64
    .line 65
    invoke-direct {p0, v1}, La/mii0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/mii0;->m()La/yzn0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iget-object v1, p0, La/yzn0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Landroid/content/Intent;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Landroid/net/Uri;

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/yzn0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Landroid/os/Bundle;

    .line 94
    .line 95
    invoke-virtual {v0, v1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Landroid/net/Uri;

    .line 106
    .line 107
    invoke-direct {v1, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 108
    .line 109
    .line 110
    const-string p1, "com.android.browser.application_id"

    .line 111
    .line 112
    invoke-virtual {v1, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    const-string p0, "RecaptchaActivity"

    .line 126
    .line 127
    const-string p1, "Device cannot resolve intent for: android.intent.action.VIEW"

    .line 128
    .line 129
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/RecaptchaActivity;->u()V

    .line 133
    .line 134
    .line 135
    :goto_0
    return-void

    .line 136
    :pswitch_0
    iget-object p1, p0, La/afm0;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, La/fuj0;

    .line 139
    .line 140
    iget-object p1, p1, La/fuj0;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, Ljava/util/Map;

    .line 143
    .line 144
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 147
    .line 148
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/firebase/auth/AuthResult;

    .line 2
    .line 3
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p0}, La/s88;->y(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p(La/zje;La/ynb0;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/tyu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/tyu0;

    .line 7
    .line 8
    iget v1, v0, La/tyu0;->k:I

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
    iput v1, v0, La/tyu0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tyu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/tyu0;-><init>(La/afm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/tyu0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tyu0;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/afm0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/okt0;

    .line 53
    .line 54
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v2, La/iyu0;

    .line 63
    .line 64
    iget-object v4, p2, La/ynb0;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object p2, p2, La/ynb0;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v2, p3, v4, p2}, La/iyu0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput v3, v0, La/tyu0;->k:I

    .line 72
    .line 73
    iget-object p1, p1, La/okt0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, La/rbt0;

    .line 76
    .line 77
    invoke-virtual {p1}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/qyu0;

    .line 82
    .line 83
    invoke-interface {p1, p0, v2, v0}, La/qyu0;->d(Ljava/lang/String;La/iyu0;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p1, La/dx5;

    .line 91
    .line 92
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/oyu0;

    .line 97
    .line 98
    new-instance p1, La/pyu0;

    .line 99
    .line 100
    iget-object p2, p0, La/oyu0;->b:Ljava/lang/String;

    .line 101
    .line 102
    const-string p3, ""

    .line 103
    .line 104
    if-nez p2, :cond_4

    .line 105
    .line 106
    move-object p2, p3

    .line 107
    :cond_4
    iget-object p0, p0, La/oyu0;->a:Ljava/lang/String;

    .line 108
    .line 109
    if-nez p0, :cond_5

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move-object p3, p0

    .line 113
    :goto_2
    invoke-direct {p1, p2, p3}, La/pyu0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object p1
.end method

.method public q(Landroidx/fragment/app/Fragment;La/tn60;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p3, p2, La/on60;

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    invoke-interface {p4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p3, La/pn60;->a:La/pn60;

    .line 13
    .line 14
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, La/j120;->X(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    instance-of p3, p2, La/rn60;

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    check-cast p2, La/rn60;

    .line 33
    .line 34
    iget-boolean p0, p2, La/rn60;->a:Z

    .line 35
    .line 36
    iget-boolean p2, p2, La/rn60;->b:Z

    .line 37
    .line 38
    new-instance p3, La/jv3;

    .line 39
    .line 40
    invoke-direct {p3, p0, p2, p1}, La/jv3;-><init>(ZZLandroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p3}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    sget-object p3, La/sn60;->a:La/sn60;

    .line 48
    .line 49
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-eqz p3, :cond_3

    .line 54
    .line 55
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v0, p0

    .line 58
    check-cast v0, La/wdk0;

    .line 59
    .line 60
    new-instance v1, La/xdk0;

    .line 61
    .line 62
    sget-object v2, La/rek0;->b:La/rek0;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const p2, 0x7f13096f

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/16 v8, 0x7c

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 89
    .line 90
    .line 91
    const/16 v7, 0x3fc

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    move-object v2, p1

    .line 96
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    move-object v2, p1

    .line 101
    instance-of p1, p2, La/qn60;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    check-cast p2, La/qn60;

    .line 106
    .line 107
    iget-object p1, p2, La/qn60;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 108
    .line 109
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, La/ii;

    .line 112
    .line 113
    invoke-static {v2, p0, p1}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public r(JLa/ynb0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, La/uyu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/uyu0;

    .line 7
    .line 8
    iget v1, v0, La/uyu0;->k:I

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
    iput v1, v0, La/uyu0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/uyu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/uyu0;-><init>(La/afm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/uyu0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/uyu0;->k:I

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
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p4, p0, La/afm0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p4, La/okt0;

    .line 53
    .line 54
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v2, La/lyu0;

    .line 63
    .line 64
    iget-object v4, p3, La/ynb0;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object p3, p3, La/ynb0;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v2, p1, p2, v4, p3}, La/lyu0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput v3, v0, La/uyu0;->k:I

    .line 72
    .line 73
    iget-object p1, p4, La/okt0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, La/rbt0;

    .line 76
    .line 77
    invoke-virtual {p1}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/qyu0;

    .line 82
    .line 83
    invoke-interface {p1, p0, v2, v0}, La/qyu0;->a(Ljava/lang/String;La/lyu0;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    if-ne p4, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p4, La/dx5;

    .line 91
    .line 92
    invoke-virtual {p4}, La/dx5;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/oyu0;

    .line 97
    .line 98
    new-instance p1, La/pyu0;

    .line 99
    .line 100
    iget-object p2, p0, La/oyu0;->b:Ljava/lang/String;

    .line 101
    .line 102
    const-string p3, ""

    .line 103
    .line 104
    if-nez p2, :cond_4

    .line 105
    .line 106
    move-object p2, p3

    .line 107
    :cond_4
    iget-object p0, p0, La/oyu0;->a:Ljava/lang/String;

    .line 108
    .line 109
    if-nez p0, :cond_5

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move-object p3, p0

    .line 113
    :goto_2
    invoke-direct {p1, p2, p3}, La/pyu0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/cig0;

    .line 4
    .line 5
    iget-object p0, p0, La/afm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const-string v2, "google.messenger"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/cig0;->b(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, La/haw0;->d:La/haw0;

    .line 37
    .line 38
    sget-object v0, La/kys0;->b:La/kys0;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    return-object p1
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hcp0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
