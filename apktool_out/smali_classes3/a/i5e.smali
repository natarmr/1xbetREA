.class public final La/i5e;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/jik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\n\u00b2\u0006\u0014\u0010\t\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/i5e;",
        "La/nw5;",
        "La/jik;",
        "<init>",
        "()V",
        "a/f5e",
        "a/kud",
        "",
        "kotlin.jvm.PlatformType",
        "filePath",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final q2:La/kud;

.field public static final synthetic r2:[La/iiy;


# instance fields
.field public e2:La/ii;

.field public f2:La/reu;

.field public g2:La/wdk0;

.field public h2:La/fdi;

.field public final i2:La/kiu0;

.field public final j2:La/ywq;

.field public final k2:La/a8z;

.field public final l2:La/es;

.field public final m2:La/nae0;

.field public n2:La/qog0;

.field public final o2:La/ywq;

.field public final p2:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/i5e;

    .line 4
    .line 5
    const-string v2, "bundleMimeTypes"

    .line 6
    .line 7
    const-string v3, "getBundleMimeTypes()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantFileBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "pendingPermissionReadFileResult"

    .line 25
    .line 26
    const-string v6, "getPendingPermissionReadFileResult()Lorg/xplatform/consultantchat/presentation/dialogs/file/model/PendingPermissionReadFileResult;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/i5e;->r2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kud;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/i5e;->q2:La/kud;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y4e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/y4e;-><init>(La/i5e;B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/svc;

    .line 11
    .line 12
    const/16 v3, 0x12

    .line 13
    .line 14
    invoke-direct {v2, p0, v3}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v3, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v4, La/svc;

    .line 20
    .line 21
    const/16 v5, 0x13

    .line 22
    .line 23
    invoke-direct {v4, v2, v5}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-class v4, La/c6e;

    .line 31
    .line 32
    sget-object v5, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v5, La/wpb;

    .line 39
    .line 40
    const/16 v6, 0x18

    .line 41
    .line 42
    invoke-direct {v5, v2, v6}, La/wpb;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/wpb;

    .line 46
    .line 47
    const/16 v7, 0x19

    .line 48
    .line 49
    invoke-direct {v6, v2, v7}, La/wpb;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v4, v5, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/i5e;->i2:La/kiu0;

    .line 57
    .line 58
    new-instance v0, La/xn;

    .line 59
    .line 60
    const/4 v2, 0x4

    .line 61
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/z4e;

    .line 65
    .line 66
    invoke-direct {v2, p0, v1}, La/z4e;-><init>(La/i5e;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/i5e;->j2:La/ywq;

    .line 74
    .line 75
    new-instance v0, La/y4e;

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {v0, p0, v2}, La/y4e;-><init>(La/i5e;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/i5e;->k2:La/a8z;

    .line 86
    .line 87
    new-instance v0, La/es;

    .line 88
    .line 89
    const-string v3, "BUNDLE_MIME_TYPES"

    .line 90
    .line 91
    invoke-direct {v0, v3}, La/es;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/i5e;->l2:La/es;

    .line 95
    .line 96
    sget-object v0, La/g5e;->a:La/g5e;

    .line 97
    .line 98
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, La/i5e;->m2:La/nae0;

    .line 103
    .line 104
    new-instance v0, La/xn;

    .line 105
    .line 106
    const/4 v3, 0x1

    .line 107
    invoke-direct {v0, v3}, La/xn;-><init>(B)V

    .line 108
    .line 109
    .line 110
    new-instance v4, La/z4e;

    .line 111
    .line 112
    invoke-direct {v4, p0, v3}, La/z4e;-><init>(La/i5e;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v4, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, La/i5e;->o2:La/ywq;

    .line 120
    .line 121
    new-instance v0, La/xn;

    .line 122
    .line 123
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 124
    .line 125
    .line 126
    new-instance v1, La/z4e;

    .line 127
    .line 128
    invoke-direct {v1, p0, v2}, La/z4e;-><init>(La/i5e;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, p0, La/i5e;->p2:La/ywq;

    .line 136
    .line 137
    sget-object v0, La/jd90;->a:La/jd90;

    .line 138
    .line 139
    sget-object v1, La/i5e;->r2:[La/iiy;

    .line 140
    .line 141
    aget-object v1, v1, v2

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 147
    .line 148
    if-nez v1, :cond_0

    .line 149
    .line 150
    new-instance v1, Landroid/os/Bundle;

    .line 151
    .line 152
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 156
    .line 157
    .line 158
    :cond_0
    const-string p0, "ARG_PENDING_FILE_PERMISSION_RESULT"

    .line 159
    .line 160
    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static b1(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "image/"

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-static {v2, v3, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/i5e;->r2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/i5e;->m2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/jik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final P0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/f7e;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/f7e;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/f7e;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/f7e;->a(La/i1w0;)La/f6i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v1, v0, La/f6i;->s:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/n5d0;

    .line 66
    .line 67
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/edi;

    .line 72
    .line 73
    iget-object v1, v0, La/f6i;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, La/ii;

    .line 76
    .line 77
    iput-object v1, p0, La/i5e;->e2:La/ii;

    .line 78
    .line 79
    iget-object v1, v0, La/f6i;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/reu;

    .line 82
    .line 83
    iput-object v1, p0, La/i5e;->f2:La/reu;

    .line 84
    .line 85
    iget-object v1, v0, La/f6i;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, La/wdk0;

    .line 88
    .line 89
    iput-object v1, p0, La/i5e;->g2:La/wdk0;

    .line 90
    .line 91
    iget-object v0, v0, La/f6i;->t:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, La/n5d0;

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/fdi;

    .line 100
    .line 101
    iput-object v0, p0, La/i5e;->h2:La/fdi;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 105
    .line 106
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final R0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f1302e2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f1302e3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final T0(Landroid/graphics/Bitmap;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, p0, v1}, Landroid/content/ContextWrapper;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ".jpeg"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Ljava/io/FileOutputStream;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 49
    .line 50
    const/16 v2, 0x64

    .line 51
    .line 52
    invoke-virtual {p1, v1, v2, p0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public final U0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5e;->e2:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final V0(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    const/16 p2, 0x2000

    .line 34
    .line 35
    :try_start_1
    invoke-static {p1, p0, p2}, La/wha0;->J(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception p2

    .line 48
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 49
    :catchall_2
    move-exception v0

    .line 50
    :try_start_4
    invoke-static {p0, p2}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 54
    :goto_0
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 55
    :catchall_3
    move-exception p2

    .line 56
    invoke-static {p1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw p2

    .line 60
    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-object v0
.end method

.method public final W0()La/c6e;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5e;->i2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/c6e;

    .line 8
    .line 9
    return-object p0
.end method

.method public final X0(La/f5e;)V
    .locals 12

    .line 1
    instance-of v0, p1, La/b5e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/i5e;->W0()La/c6e;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, La/b5e;

    .line 10
    .line 11
    iget-object p1, p1, La/b5e;->a:Ljava/io/File;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, La/c6e;->x(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v0, La/c5e;->a:La/c5e;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, La/i5e;->c1()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of v0, p1, La/d5e;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, La/i5e;->W0()La/c6e;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p1, La/d5e;

    .line 45
    .line 46
    iget-object p1, p1, La/d5e;->a:Ljava/io/File;

    .line 47
    .line 48
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, La/c6e;->i:La/mne;

    .line 53
    .line 54
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 55
    .line 56
    sget-object v1, La/u5e;->a:La/u5e;

    .line 57
    .line 58
    new-instance v4, La/v5e;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-direct {v4, p0, p1, v2}, La/v5e;-><init>(La/c6e;Ljava/io/File;La/yje;)V

    .line 62
    .line 63
    .line 64
    const/16 v5, 0xa

    .line 65
    .line 66
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    sget-object v0, La/e5e;->a:La/e5e;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, La/i5e;->U0()La/ii;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 83
    .line 84
    const v1, 0x7f1307bb

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const v2, 0x7f131704

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const v3, 0x7f130e5d

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v9, La/n12;->b:La/n12;

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/16 v11, 0x5f8

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {p1, v0, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final Y0(Landroid/net/Uri;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v2, 0x2ff57c

    .line 12
    .line 13
    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    const v2, 0x38b73479

    .line 17
    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v1, "content"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, La/i5e;->Z0(Landroid/net/Uri;)La/f5e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, La/i5e;->X0(La/f5e;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string v1, "file"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p1}, La/yqm0;->u(Landroid/net/Uri;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, La/i5e;->a1(Ljava/io/File;)La/f5e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, La/i5e;->X0(La/f5e;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    :goto_0
    invoke-virtual {p0}, La/i5e;->c1()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/nw5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i5e;->n2:La/qog0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/i5e;->k2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rg90;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final Z0(Landroid/net/Uri;)La/f5e;
    .locals 11

    .line 1
    sget-object v0, La/i5e;->r2:[La/iiy;

    .line 2
    .line 3
    iget-object v1, p0, La/i5e;->l2:La/es;

    .line 4
    .line 5
    sget-object v2, La/c5e;->a:La/c5e;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    move-object v5, p1

    .line 20
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    if-eqz p1, :cond_8

    .line 25
    .line 26
    :try_start_1
    const-string v3, "_size"

    .line 27
    .line 28
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "_display_name"

    .line 33
    .line 34
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-nez v6, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, La/i5e;->c1()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_0
    :try_start_3
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 60
    .line 61
    .line 62
    new-instance v3, La/x9c;

    .line 63
    .line 64
    const/4 v6, 0x1

    .line 65
    invoke-direct {v3, p1, v4, v6}, La/x9c;-><init>(Ljava/lang/Object;IB)V

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v7, La/j85;->b:La/qek0;

    .line 82
    .line 83
    const-string v7, ".heic"

    .line 84
    .line 85
    invoke-static {v4, v7, v6}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, La/i5e;->T0(Landroid/graphics/Bitmap;)Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance v0, La/b5e;

    .line 115
    .line 116
    invoke-direct {v0, p0}, La/b5e;-><init>(Ljava/io/File;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_2

    .line 120
    .line 121
    :cond_1
    const/4 v4, 0x0

    .line 122
    aget-object v6, v0, v4

    .line 123
    .line 124
    invoke-virtual {v1, p0, v6}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v6}, La/i5e;->b1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_2

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_4

    .line 148
    .line 149
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    check-cast v7, Ljava/lang/String;

    .line 154
    .line 155
    new-instance v8, Ljava/io/File;

    .line 156
    .line 157
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    check-cast v9, Ljava/lang/String;

    .line 162
    .line 163
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v8}, La/k0q;->e(Ljava/io/File;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 175
    .line 176
    invoke-virtual {v8, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v8}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {v7, v8}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_3

    .line 192
    .line 193
    new-instance v0, La/b5e;

    .line 194
    .line 195
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v5, v1}, La/i5e;->V0(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/File;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-direct {v0, p0}, La/b5e;-><init>(Ljava/io/File;)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_4
    :goto_0
    aget-object v0, v0, v4

    .line 213
    .line 214
    invoke-virtual {v1, p0, v0}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_5

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_7

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/String;

    .line 240
    .line 241
    new-instance v4, Ljava/io/File;

    .line 242
    .line 243
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    check-cast v6, Ljava/lang/String;

    .line 248
    .line 249
    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v4}, La/k0q;->e(Ljava/io/File;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 261
    .line 262
    invoke-virtual {v4, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v4}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-static {v1, v4}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_6

    .line 278
    .line 279
    new-instance v0, La/d5e;

    .line 280
    .line 281
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    check-cast v1, Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v5, v1}, La/i5e;->V0(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/File;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-direct {v0, p0}, La/d5e;-><init>(Ljava/io/File;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_7
    :goto_1
    sget-object v0, La/e5e;->a:La/e5e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 299
    .line 300
    :goto_2
    :try_start_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 305
    :catchall_1
    move-exception v0

    .line 306
    :try_start_6
    invoke-static {p1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 310
    :cond_8
    return-object v2

    .line 311
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 312
    .line 313
    .line 314
    return-object v2
.end method

.method public final a1(Ljava/io/File;)La/f5e;
    .locals 9

    .line 1
    sget-object v0, La/i5e;->r2:[La/iiy;

    .line 2
    .line 3
    iget-object v1, p0, La/i5e;->l2:La/es;

    .line 4
    .line 5
    sget-object v2, La/c5e;->a:La/c5e;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_9

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    invoke-static {p1}, La/sj3;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "image"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-static {v4, v5, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    new-instance p0, La/b5e;

    .line 39
    .line 40
    invoke-direct {p0, p1}, La/b5e;-><init>(Ljava/io/File;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v4, La/j85;->b:La/qek0;

    .line 51
    .line 52
    const-string v4, ".heic"

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-static {v3, v4, v5}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    new-instance v0, Ljava/io/FileInputStream;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/i5e;->T0(Landroid/graphics/Bitmap;)Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p1, La/b5e;

    .line 78
    .line 79
    invoke-direct {p1, p0}, La/b5e;-><init>(Ljava/io/File;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_2
    aget-object v3, v0, v6

    .line 84
    .line 85
    invoke-virtual {v1, p0, v3}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, La/i5e;->b1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {p1}, La/k0q;->e(Ljava/io/File;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 125
    .line 126
    invoke-virtual {v5, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v5}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {v4, v5}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    new-instance p0, La/b5e;

    .line 144
    .line 145
    invoke-direct {p0, p1}, La/b5e;-><init>(Ljava/io/File;)V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_5
    :goto_0
    aget-object v0, v0, v6

    .line 150
    .line 151
    invoke-virtual {v1, p0, v0}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_8

    .line 171
    .line 172
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {p1}, La/k0q;->e(Ljava/io/File;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 187
    .line 188
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v0, v1}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_7

    .line 204
    .line 205
    new-instance p0, La/d5e;

    .line 206
    .line 207
    invoke-direct {p0, p1}, La/d5e;-><init>(Ljava/io/File;)V

    .line 208
    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_8
    :goto_1
    sget-object p0, La/e5e;->a:La/e5e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    return-object p0

    .line 214
    :cond_9
    :goto_2
    return-object v2

    .line 215
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 216
    .line 217
    .line 218
    return-object v2
.end method

.method public final c1()V
    .locals 9

    .line 1
    iget-object v0, p0, La/i5e;->g2:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/xdk0;

    .line 6
    .line 7
    sget-object v2, La/rek0;->b:La/rek0;

    .line 8
    .line 9
    const v3, 0x7f13131f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/16 v8, 0x7c

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 26
    .line 27
    .line 28
    const/16 v7, 0x3fc

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v2, p0

    .line 33
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string p0, "snackbarManager"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    const-string v0, "VERIFICATION_PERMISSION"

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v1, La/y4e;

    .line 15
    .line 16
    invoke-direct {v1, p0, p2}, La/y4e;-><init>(La/i5e;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    new-instance v2, La/y4e;

    .line 28
    .line 29
    invoke-direct {v2, p0, v1}, La/y4e;-><init>(La/i5e;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, La/m2a;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v0, v2}, La/m2a;-><init>(B)V

    .line 47
    .line 48
    .line 49
    const-class v3, La/m2a;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, La/lrc;

    .line 56
    .line 57
    invoke-direct {v4, v0, p0}, La/lrc;-><init>(La/m2a;La/i5e;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3, p0, v4}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/i5e;->W0()La/c6e;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object v4, p1, La/c6e;->j:La/ol60;

    .line 68
    .line 69
    new-instance v6, La/fob;

    .line 70
    .line 71
    const/16 p1, 0xf

    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-direct {v6, p0, v7, p1}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    sget-object p1, La/lkz;->a:La/lkz;

    .line 78
    .line 79
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v3, La/cxd;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-direct/range {v3 .. v8}, La/cxd;-><init>(La/gmq;La/clz;La/fob;La/yje;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v7, v7, v3, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    sget-object p1, La/i5e;->r2:[La/iiy;

    .line 101
    .line 102
    aget-object p2, p1, v1

    .line 103
    .line 104
    iget-object v0, p0, La/i5e;->m2:La/nae0;

    .line 105
    .line 106
    invoke-interface {v0, p2, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast p2, La/jik;

    .line 114
    .line 115
    iget-object v3, p2, La/jik;->b:Landroid/widget/TextView;

    .line 116
    .line 117
    new-instance v4, La/a5e;

    .line 118
    .line 119
    invoke-direct {v4, p0, v2}, La/a5e;-><init>(La/i5e;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 123
    .line 124
    .line 125
    iget-object v3, p2, La/jik;->d:Landroid/widget/TextView;

    .line 126
    .line 127
    new-instance v4, La/a5e;

    .line 128
    .line 129
    invoke-direct {v4, p0, v1}, La/a5e;-><init>(La/i5e;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 133
    .line 134
    .line 135
    iget-object p2, p2, La/jik;->c:Landroid/widget/TextView;

    .line 136
    .line 137
    new-instance v3, La/a5e;

    .line 138
    .line 139
    const/4 v4, 0x2

    .line 140
    invoke-direct {v3, p0, v4}, La/a5e;-><init>(La/i5e;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {p2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 144
    .line 145
    .line 146
    aget-object p1, p1, v1

    .line 147
    .line 148
    invoke-interface {v0, p1, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    check-cast p1, La/jik;

    .line 156
    .line 157
    iget-object p0, p0, La/i5e;->f2:La/reu;

    .line 158
    .line 159
    if-eqz p0, :cond_4

    .line 160
    .line 161
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, La/rrc;

    .line 164
    .line 165
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, La/tgk;

    .line 168
    .line 169
    iget-object p0, p0, La/tgk;->a:La/us00;

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    const-string p2, "android.hardware.camera.any"

    .line 176
    .line 177
    invoke-virtual {p0, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    iget-object p2, p1, La/jik;->e:Landroid/view/View;

    .line 182
    .line 183
    const/16 v0, 0x8

    .line 184
    .line 185
    if-eqz p0, :cond_2

    .line 186
    .line 187
    move v1, v2

    .line 188
    goto :goto_0

    .line 189
    :cond_2
    move v1, v0

    .line 190
    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p1, La/jik;->b:Landroid/widget/TextView;

    .line 194
    .line 195
    if-eqz p0, :cond_3

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_3
    move v2, v0

    .line 199
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_4
    const-string p0, "hasCameraUseCase"

    .line 204
    .line 205
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v7
.end method
