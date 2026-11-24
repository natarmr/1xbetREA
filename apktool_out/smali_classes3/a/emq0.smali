.class public final enum La/emq0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic a:[La/emq0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/emq0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0xc8

    .line 5
    .line 6
    const-string v4, "TIMEOUT_200"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, La/emq0;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/emq0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-wide/16 v3, 0x1f4

    .line 15
    .line 16
    const-string v5, "TIMEOUT_500"

    .line 17
    .line 18
    invoke-direct {v1, v5, v2, v3, v4}, La/emq0;-><init>(Ljava/lang/String;IJ)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/emq0;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-wide/16 v4, 0x3e8

    .line 25
    .line 26
    const-string v6, "TIMEOUT_1000"

    .line 27
    .line 28
    invoke-direct {v2, v6, v3, v4, v5}, La/emq0;-><init>(Ljava/lang/String;IJ)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/emq0;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-wide/16 v5, 0x7d0

    .line 35
    .line 36
    const-string v7, "TIMEOUT_2000"

    .line 37
    .line 38
    invoke-direct {v3, v7, v4, v5, v6}, La/emq0;-><init>(Ljava/lang/String;IJ)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/emq0;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-wide/16 v6, 0x2710

    .line 45
    .line 46
    const-string v8, "TIMEOUT_10000"

    .line 47
    .line 48
    invoke-direct {v4, v8, v5, v6, v7}, La/emq0;-><init>(Ljava/lang/String;IJ)V

    .line 49
    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [La/emq0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/emq0;->a:[La/emq0;

    .line 56
    .line 57
    new-instance v0, La/c0o;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/emq0;
    .locals 1

    .line 1
    const-class v0, La/emq0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/emq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/emq0;
    .locals 1

    .line 1
    sget-object v0, La/emq0;->a:[La/emq0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/emq0;

    .line 8
    .line 9
    return-object v0
.end method
