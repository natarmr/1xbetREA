.class public final enum La/xhz;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/xhz;

.field public static final enum c:La/xhz;

.field public static final synthetic d:[La/xhz;

.field public static final synthetic e:La/c0o;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/xhz;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x7f131004

    .line 5
    .line 6
    .line 7
    const-string v3, "PRIZES_TYPE"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, La/xhz;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/xhz;->b:La/xhz;

    .line 13
    .line 14
    new-instance v1, La/xhz;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x7f130fa7

    .line 18
    .line 19
    .line 20
    const-string v4, "PLAYERS_TYPE"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, La/xhz;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/xhz;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const v4, 0x7f1314d2

    .line 29
    .line 30
    .line 31
    const-string v5, "TEAMS_TYPE"

    .line 32
    .line 33
    invoke-direct {v2, v5, v3, v4}, La/xhz;-><init>(Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    sput-object v2, La/xhz;->c:La/xhz;

    .line 37
    .line 38
    filled-new-array {v0, v1, v2}, [La/xhz;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, La/xhz;->d:[La/xhz;

    .line 43
    .line 44
    new-instance v1, La/c0o;

    .line 45
    .line 46
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, La/xhz;->e:La/c0o;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/xhz;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/xhz;
    .locals 1

    .line 1
    const-class v0, La/xhz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xhz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/xhz;
    .locals 1

    .line 1
    sget-object v0, La/xhz;->d:[La/xhz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/xhz;

    .line 8
    .line 9
    return-object v0
.end method
