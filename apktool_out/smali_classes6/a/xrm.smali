.class public final enum La/xrm;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/pek;

.field public static final enum c:La/xrm;

.field public static final enum d:La/xrm;

.field public static final enum e:La/xrm;

.field public static final synthetic f:[La/xrm;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/xrm;

    .line 2
    .line 3
    const-string v1, "ROUND_ZERO"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/xrm;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/xrm;

    .line 10
    .line 11
    const-string v2, "ROUND_8"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3, v3}, La/xrm;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/xrm;->c:La/xrm;

    .line 18
    .line 19
    new-instance v2, La/xrm;

    .line 20
    .line 21
    const-string v3, "ROUND_16"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4, v4}, La/xrm;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    sput-object v2, La/xrm;->d:La/xrm;

    .line 28
    .line 29
    new-instance v3, La/xrm;

    .line 30
    .line 31
    const-string v4, "ROUND_360"

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v4, v5, v5}, La/xrm;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v3, La/xrm;->e:La/xrm;

    .line 38
    .line 39
    filled-new-array {v0, v1, v2, v3}, [La/xrm;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/xrm;->f:[La/xrm;

    .line 44
    .line 45
    new-instance v1, La/c0o;

    .line 46
    .line 47
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 48
    .line 49
    .line 50
    sput-object v1, La/xrm;->g:La/c0o;

    .line 51
    .line 52
    new-instance v0, La/pek;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, La/xrm;->b:La/pek;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/xrm;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/xrm;
    .locals 1

    .line 1
    const-class v0, La/xrm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xrm;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/xrm;
    .locals 1

    .line 1
    sget-object v0, La/xrm;->f:[La/xrm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/xrm;

    .line 8
    .line 9
    return-object v0
.end method
