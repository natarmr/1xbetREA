.class public final enum La/sub0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/nh70;

.field public static final enum c:La/sub0;

.field public static final enum d:La/sub0;

.field public static final enum e:La/sub0;

.field public static final enum f:La/sub0;

.field public static final enum g:La/sub0;

.field public static final synthetic h:[La/sub0;

.field public static final synthetic i:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/sub0;

    .line 2
    .line 3
    const-string v1, "DEFAULT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, La/sub0;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/sub0;->c:La/sub0;

    .line 11
    .line 12
    new-instance v1, La/sub0;

    .line 13
    .line 14
    const-string v2, "SUCCESS"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v1, v2, v3, v4}, La/sub0;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/sub0;->d:La/sub0;

    .line 21
    .line 22
    new-instance v2, La/sub0;

    .line 23
    .line 24
    const-string v3, "CLIENT_ERROR"

    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-direct {v2, v3, v4, v5}, La/sub0;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, La/sub0;->e:La/sub0;

    .line 31
    .line 32
    new-instance v3, La/sub0;

    .line 33
    .line 34
    const-string v4, "SERVER_ERROR"

    .line 35
    .line 36
    const/4 v6, 0x4

    .line 37
    invoke-direct {v3, v4, v5, v6}, La/sub0;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v3, La/sub0;->f:La/sub0;

    .line 41
    .line 42
    new-instance v4, La/sub0;

    .line 43
    .line 44
    const-string v5, "ERROR"

    .line 45
    .line 46
    const/4 v7, 0x5

    .line 47
    invoke-direct {v4, v5, v6, v7}, La/sub0;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v4, La/sub0;->g:La/sub0;

    .line 51
    .line 52
    filled-new-array {v0, v1, v2, v3, v4}, [La/sub0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, La/sub0;->h:[La/sub0;

    .line 57
    .line 58
    new-instance v1, La/c0o;

    .line 59
    .line 60
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 61
    .line 62
    .line 63
    sput-object v1, La/sub0;->i:La/c0o;

    .line 64
    .line 65
    new-instance v0, La/nh70;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, La/sub0;->b:La/nh70;

    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/sub0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/sub0;
    .locals 1

    .line 1
    const-class v0, La/sub0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sub0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/sub0;
    .locals 1

    .line 1
    sget-object v0, La/sub0;->h:[La/sub0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/sub0;

    .line 8
    .line 9
    return-object v0
.end method
