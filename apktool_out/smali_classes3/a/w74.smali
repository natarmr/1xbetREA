.class public final La/w74;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/w74;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final r2:La/rek0;

.field public static final synthetic s2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/phf0;

.field public final m2:La/cgx0;

.field public final n2:La/r34;

.field public final o2:La/zz2;

.field public final p2:La/phf0;

.field public final q2:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/w74;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "hasAuthenticator"

    .line 25
    .line 26
    const-string v6, "getHasAuthenticator()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "time"

    .line 34
    .line 35
    const-string v7, "getTime()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "icon"

    .line 43
    .line 44
    const-string v8, "getIcon()I"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "id"

    .line 52
    .line 53
    const-string v9, "getId()Ljava/lang/String;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "currentSession"

    .line 61
    .line 62
    const-string v10, "getCurrentSession()Z"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x7

    .line 68
    new-array v1, v1, [La/iiy;

    .line 69
    .line 70
    aput-object v0, v1, v4

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    aput-object v2, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object v3, v1, v0

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    aput-object v5, v1, v0

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v6, v1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v7, v1, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v8, v1, v0

    .line 89
    .line 90
    sput-object v1, La/w74;->s2:[La/iiy;

    .line 91
    .line 92
    new-instance v0, La/rek0;

    .line 93
    .line 94
    const/16 v1, 0x19

    .line 95
    .line 96
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 97
    .line 98
    .line 99
    sput-object v0, La/w74;->r2:La/rek0;

    .line 100
    .line 101
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/w74;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "EXTRA_TITLE"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/w74;->l2:La/phf0;

    .line 21
    .line 22
    new-instance v0, La/cgx0;

    .line 23
    .line 24
    const-string v1, "EXTRA_HAS_AUTHENTICATOR"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/w74;->m2:La/cgx0;

    .line 30
    .line 31
    new-instance v0, La/r34;

    .line 32
    .line 33
    const-string v1, "EXTRA_TIME"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/w74;->n2:La/r34;

    .line 39
    .line 40
    new-instance v0, La/zz2;

    .line 41
    .line 42
    const-string v1, "EXTRA_ICON"

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/w74;->o2:La/zz2;

    .line 48
    .line 49
    new-instance v0, La/phf0;

    .line 50
    .line 51
    const-string v1, "EXTRA_ID"

    .line 52
    .line 53
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, La/w74;->p2:La/phf0;

    .line 57
    .line 58
    new-instance v0, La/cgx0;

    .line 59
    .line 60
    const-string v1, "EXTRA_CURRENT_SESSION"

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/w74;->q2:La/cgx0;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, -0x734b2291

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v1, La/bw5;

    .line 13
    .line 14
    sget-object v3, La/y0x0;->b:La/ugd;

    .line 15
    .line 16
    new-instance v0, La/un6;

    .line 17
    .line 18
    const/16 v4, 0x14

    .line 19
    .line 20
    invoke-direct {v0, p0, v4}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    const p0, 0x57af4a20

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/16 v6, 0xa

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public final P0()Z
    .locals 2

    .line 1
    sget-object v0, La/w74;->s2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/w74;->q2:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
