.class public final La/drq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/drq;

.field public static final d:La/drq;

.field public static final e:La/drq;

.field public static final f:La/drq;

.field public static final g:La/drq;

.field public static final h:La/drq;

.field public static final i:La/drq;

.field public static final j:La/drq;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/drq;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/drq;->c:La/drq;

    .line 10
    .line 11
    new-instance v0, La/drq;

    .line 12
    .line 13
    const-string v1, "FULL"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/drq;->d:La/drq;

    .line 19
    .line 20
    new-instance v0, La/drq;

    .line 21
    .line 22
    const-string v1, "TINK"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 26
    .line 27
    .line 28
    sput-object v0, La/drq;->e:La/drq;

    .line 29
    .line 30
    new-instance v0, La/drq;

    .line 31
    .line 32
    const-string v1, "CRUNCHY"

    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/drq;->f:La/drq;

    .line 38
    .line 39
    new-instance v0, La/drq;

    .line 40
    .line 41
    const-string v1, "NO_PREFIX"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/drq;->g:La/drq;

    .line 47
    .line 48
    new-instance v0, La/drq;

    .line 49
    .line 50
    const-string v1, "TINK"

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/drq;->h:La/drq;

    .line 57
    .line 58
    new-instance v0, La/drq;

    .line 59
    .line 60
    const-string v1, "CRUNCHY"

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 63
    .line 64
    .line 65
    sput-object v0, La/drq;->i:La/drq;

    .line 66
    .line 67
    new-instance v0, La/drq;

    .line 68
    .line 69
    const-string v1, "NO_PREFIX"

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, La/drq;-><init>(Ljava/lang/String;B)V

    .line 72
    .line 73
    .line 74
    sput-object v0, La/drq;->j:La/drq;

    .line 75
    .line 76
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput-byte v0, p0, La/drq;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/drq;->a:B

    iput-object p1, p0, La/drq;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/drq;->a:B

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
    iget-object p0, p0, La/drq;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    iget-object p0, p0, La/drq;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    iget-object p0, p0, La/drq;->b:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
